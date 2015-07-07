package org.modelexecution.operationalsemantics.gemoc.sequential.dynamic_allinecore

import activitydiagram.Activity
import activitydiagram.ActivityNode
import activitydiagram.BooleanValue
import activitydiagram.BooleanVariable
import activitydiagram.InputValue
import activitydiagram.IntegerValue
import activitydiagram.IntegerVariable
import activitydiagram.Value
import activitydiagram.Variable
import java.io.BufferedWriter
import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.io.OutputStreamWriter
import java.util.ArrayList
import java.util.List
import static extension org.modelexecution.operationalsemantics.gemoc.sequential.dynamic_allinecore.ActivityAspect.*
import static extension org.modelexecution.operationalsemantics.gemoc.sequential.dynamic_allinecore.ControlFlowAspect.*
import static extension org.modelexecution.operationalsemantics.gemoc.sequential.dynamic_allinecore.TokenAspect.*
import static extension org.modelexecution.operationalsemantics.gemoc.sequential.dynamic_allinecore.OfferAspect.*
import static extension org.modelexecution.operationalsemantics.gemoc.sequential.dynamic_allinecore.OpaqueActionAspect.*
import static extension org.modelexecution.operationalsemantics.gemoc.sequential.dynamic_allinecore.InitialNodeAspect.*
import static extension org.modelexecution.operationalsemantics.gemoc.sequential.dynamic_allinecore.ActivityFinalNodeAspect.*
import static extension org.modelexecution.operationalsemantics.gemoc.sequential.dynamic_allinecore.ForkNodeAspect.*
import static extension org.modelexecution.operationalsemantics.gemoc.sequential.dynamic_allinecore.JoinNodeAspect.*
import static extension org.modelexecution.operationalsemantics.gemoc.sequential.dynamic_allinecore.MergeNodeAspect.*
import static extension org.modelexecution.operationalsemantics.gemoc.sequential.dynamic_allinecore.DecisionNodeAspect.*
import static extension org.modelexecution.operationalsemantics.gemoc.sequential.dynamic_allinecore.IntegerVariableAspect.*
import static extension org.modelexecution.operationalsemantics.gemoc.sequential.dynamic_allinecore.BooleanVariableAspect.*
import static extension org.modelexecution.operationalsemantics.gemoc.sequential.dynamic_allinecore.IntegerCalculationExpressionAspect.*
import static extension org.modelexecution.operationalsemantics.gemoc.sequential.dynamic_allinecore.IntegerComparisonExpressionAspect.*
import static extension org.modelexecution.operationalsemantics.gemoc.sequential.dynamic_allinecore.BooleanUnaryExpressionAspect.*
import static extension org.modelexecution.operationalsemantics.gemoc.sequential.dynamic_allinecore.BooleanBinaryExpressionAspect.*

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import activitydiagram.ActivitydiagramFactory
import activitydiagram.OpaqueAction
import activitydiagram.InitialNode
import activitydiagram.ActivityFinalNode
import activitydiagram.ForkNode
import activitydiagram.JoinNode
import activitydiagram.MergeNode
import activitydiagram.DecisionNode
import activitydiagram.IntegerCalculationExpression
import activitydiagram.IntegerComparisonExpression
import activitydiagram.BooleanUnaryExpression
import activitydiagram.BooleanBinaryExpression
import activitydiagram.ControlFlow
import activitydiagram.NamedElement
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import activitydiagram.ActivityEdge
import activitydiagram.Expression
import activitydiagram.IntegerCalculationOperator
import activitydiagram.IntegerComparisonOperator
import activitydiagram.BooleanUnaryOperator
import activitydiagram.BooleanBinaryOperator
import activitydiagram.Offer
import activitydiagram.Token
import activitydiagram.Trace
import activitydiagram.ForkedToken
import fr.inria.diverse.k3.al.annotationprocessor.Step

class Context {
	public Trace output;
	public Activity activity;
	public Context parent;
	public List<InputValue> inputValues ;
	public JoinNode node ;

	new() {
	}

	new(Trace c, Activity a, List<InputValue> inputValues, Context parent) {
		this.output = c
		this.activity = a
		this.inputValues = inputValues
		this.parent = parent
	}

}

class Util {
	public static final Object LINE_BREAK = System.getProperty("line.separator");

}

@Aspect(className=Activity)
class ActivityAspect extends NamedElementAspect {

	@Step
	def void initializeContext(List<InputValue> value, Context context) {
		context.inputValues = value
		context.activity = _self
		_self.trace = ActivitydiagramFactory.eINSTANCE.createTrace;
		context.output = _self.trace
		value?.forEach[v|v.getVariable().setCurrentValue(v.getValue());]
		_self.nodes.forEach[n|n.running = true]
	}

	Trace trace

	@OverrideAspectMethod
	@Step
	def void execute(Context c) {
		_self.locals.forEach[v|v.init(c)]
		_self.inputs.forEach[v|v.init(c)]
		_self.nodes.filter[node|node instanceof InitialNode].get(0).execute(c)

		var list = _self.nodes.filter[node|node.hasOffers1]
		while(list != null && list.size > 0) {
			list.get(0).execute(c)
			list = _self.nodes.filter[node|node.hasOffers1]
		}
	}

	@Step
	def void reset() {
		_self.trace = null;
	}

	def void writeToFile() {
		var text = _self.printTrace();
		try {
			var writer = new BufferedWriter(
				new OutputStreamWriter(new FileOutputStream(new File("trace/" + _self.getName() + ".txt"))));
			writer.write(text);
			writer.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

	def String printTrace() {
		val text = new StringBuffer();
		_self.trace.executedNodes.forEach[n|text.append(n.getName()); text.append(Util.LINE_BREAK);]

		_self.getLocals().forEach [ v |
			text.append(v.print);
			text.append(Util.LINE_BREAK);
		]
		return text.toString();
	}

	def int getIntegerVariableValue(String variableName) {
		var currentValue = _self.getVariableValue(variableName);
		if(currentValue instanceof IntegerValue) {
			var integerValue = currentValue as IntegerValue;
			return integerValue.getValue();
		}
		return -1;
	}

	def boolean getBooleanVariableValue(String variableName) {
		var currentValue = _self.getVariableValue(variableName);
		if(currentValue instanceof BooleanValue) {
			var booleanValue = currentValue as BooleanValue;
			return booleanValue.isValue();
		}
		return false;
	}

	def Value getVariableValue(String variableName) {
		var variable = _self.getVariable(variableName);
		var currentValue = variable.getCurrentValue();
		return currentValue;
	}

	def Variable getVariable(String variableName) {
		var allVariables = new ArrayList<Variable>();
		allVariables.addAll(_self.getLocals());
		allVariables.addAll(_self.getInputs());
		for (Variable var1 : allVariables) {
			if(var1.getName().equals(variableName)) {
				return var1;
			}
		}
		return null;
	}

	@Step
	def void writeTrace() {
		_self.writeToFile;
		_self.reset();
	}

}

@Aspect(className=NamedElement)
class NamedElementAspect {
	def void execute(Context c) {
	}
}

@Aspect(className=ActivityNode)
class ActivityNodeAspect extends org.modelexecution.operationalsemantics.gemoc.sequential.dynamic_allinecore.NamedElementAspect {
	List<Token> heldTokens = new ArrayList<Token>

	@OverrideAspectMethod
	@Step
	def void execute(Context c) {
		//_self.sendOffers1(_self.takeOfferdTokens1)
	}

	@Step
	def void terminate() {
		_self.running = false;
	}

	def boolean isReady() {
		return _self.isRunning();
	}

	@Step
	def void sendOffers1(List<Token> tokens) {
		for (ActivityEdge edge : _self.getOutgoing()) {
			edge.sendOffer1(tokens);
		}
	}

	@Step
	def List<Token> takeOfferdTokens1() {
		val allTokens = new ArrayList<Token>();
		for (ActivityEdge edge : _self.getIncoming()) {
			val tokens = edge.takeOfferedTokens1();
			for (Token token : tokens) {
				token.withdraw1();
				token.holder = _self
			}
			allTokens.addAll(tokens);
		}
		return allTokens;
	}

	@Step
	def void addTokens1(List<Token> tokens) {
		for (Token token : tokens) {
			var transferredToken = token.transfer1(_self);
			_self.heldTokens.add(transferredToken);
		}
	}

	def boolean hasOffers1() {
		var hasOffer = true;
		for (ActivityEdge edge : _self.getIncoming()) {
			if(!edge.hasOffer1()) {
				hasOffer = false;
			}
		}
		return hasOffer;
	}

	@Step
	def void removeToken1(Token token) {
		_self.heldTokens.remove(token);
	}
}

@Aspect(className=ActivityEdge)
class ActivityEdgeAspect extends NamedElementAspect {
	public List<Offer> offers = new ArrayList<Offer>

	def void sendOffer1(List<Token> tokens) {
		val offer = ActivitydiagramFactory.eINSTANCE.createOffer;
		tokens.forEach[token|offer.offeredTokens.add(token)];
		_self.offers.add(offer);
	}

	def List<Token> takeOfferedTokens1() {
		val tokens = new ArrayList<Token>()
		_self.offers.forEach[o|tokens.addAll(o.offeredTokens)]
		_self.offers.clear();
		return tokens;
	}

	def boolean hasOffer1() {
		return _self.offers.exists[o1|o1.hasTokens1()]
	}
}

@Aspect(className=ControlFlow)
class ControlFlowAspect extends ActivityEdgeAspect {
}

@Aspect(className=OpaqueAction)
class OpaqueActionAspect extends ActivityNodeAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
		c.output.executedNodes.add(_self)
		_self.expressions.forEach[e|e.execute(c)]
		_self.sendOffers1(_self.takeOfferdTokens1)

	//		_self.outgoing.forEach[e|e.execute(c)]
	}
}

@Aspect(className=InitialNode)
class InitialNodeAspect extends ActivityNodeAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
		var r = ActivitydiagramFactory.eINSTANCE.createControlToken
		r.holder = _self
		var list = new ArrayList<Token>
		list.add(r)
		_self.sendOffers1(list)
		c.output.executedNodes.add(_self)

	//		_self.outgoing.forEach[e|e.execute(c)]
	}

	@OverrideAspectMethod
	def boolean hasOffers1() {
		return false;
	}

}

@Aspect(className=Expression)
class ExpressionAspect {
	def void execute(Context c) {
	}
}

@Aspect(className=ActivityFinalNode)
class ActivityFinalNodeAspect extends ActivityNodeAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
		c.output.executedNodes.add(_self)
		_self.sendOffers1(_self.takeOfferdTokens1)
	}
}

@Aspect(className=ForkNode)
class ForkNodeAspect extends ActivityNodeAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
		c.output.executedNodes.add(_self)
		var tokens = _self.takeOfferdTokens1
		var forkedTokens = new ArrayList<Token>();
		for (Token token : tokens) {
			var forkedToken = ActivitydiagramFactory.eINSTANCE.createForkedToken;
			forkedToken.baseToken = token;
			forkedToken.remainingOffersCount = _self.outgoing.size();
			forkedTokens.add(forkedToken);
		}
		_self.addTokens1(forkedTokens);
		_self.sendOffers1(forkedTokens);
	}
}

@Aspect(className=JoinNode)
class JoinNodeAspect extends ActivityNodeAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
		c.output.executedNodes.add(_self)
		var tokens = _self.takeOfferdTokens1
		tokens.forEach [ t |
			if((t as ForkedToken).remainingOffersCount > 1) {
				(t as ForkedToken).remainingOffersCount = (t as ForkedToken).remainingOffersCount - 1
			} else {
				var list = new ArrayList<Token>
				list.add(t)
				_self.sendOffers1(list)
			}
		]
	}
}

@Aspect(className=MergeNode)
class MergeNodeAspect extends ActivityNodeAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
		c.output.executedNodes.add(_self)
		_self.sendOffers1(_self.takeOfferdTokens1)

	//	_self.outgoing.forEach[e|e.execute(c)]
	}

	def boolean hasOffers1() {
		return _self.incoming.exists[edge|edge.hasOffer1()]
	}
}

@Aspect(className=DecisionNode)
class DecisionNodeAspect extends ActivityNodeAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
		c.output.executedNodes.add(_self)
		_self.sendOffers1(_self.takeOfferdTokens1)

	//		_self.outgoing.forEach[e|e.execute(c)]
	}

	@OverrideAspectMethod
	def void sendOffers1(List<Token> tokens) {
		for (ActivityEdge edge : _self.getOutgoing()) {
			if(edge instanceof ControlFlow && ( edge as ControlFlow).guard != null) {
				if((( edge as ControlFlow).guard.currentValue as BooleanValue).value) {
					edge.sendOffer1(tokens);
				}
			}
		}
	}
}

@Aspect(className=Variable)
class VariableAspect {
	@Step
	def void execute(Context c) {
	}

	@Step
	def void init(Context c) {
	}

	def String print() {
	}
}

@Aspect(className=IntegerVariable)
class IntegerVariableAspect extends org.modelexecution.operationalsemantics.gemoc.sequential.dynamic_allinecore.VariableAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
	}

	@OverrideAspectMethod
	def void init(Context c) {
		if(_self.currentValue == null) {
			if(_self.initialValue != null)
				_self.currentValue = _self.initialValue
			else {
				val defaultValue = ActivitydiagramFactory.eINSTANCE.createIntegerValue
				defaultValue.value = 0;
				_self.currentValue = defaultValue
			}
		}
	}

	@OverrideAspectMethod
	def String print() {
		var text = new StringBuffer();
		text.append(_self.getName());
		text.append(" = ");
		text.append((_self.getCurrentValue() as IntegerValue).getValue());
		return text.toString();
	}
}

@Aspect(className=BooleanVariable)
@OverrideAspectMethod
class BooleanVariableAspect extends org.modelexecution.operationalsemantics.gemoc.sequential.dynamic_allinecore.VariableAspect {
	def void execute(Context c) {
	}

	@OverrideAspectMethod
	def void init(Context c) {
		if(_self.currentValue == null) {
			if(_self.initialValue != null)
				_self.currentValue = _self.initialValue
			else {
				val defaultValue = ActivitydiagramFactory.eINSTANCE.createBooleanValue
				defaultValue.value = false;
				_self.currentValue = defaultValue
			}
		}
	}

	@OverrideAspectMethod
	def String print() {
		var text = new StringBuffer();
		text.append(_self.getName());
		text.append(" = ");
		text.append((_self.getCurrentValue() as BooleanValue).isValue());
		return text.toString();
	}

}

@Aspect(className=IntegerCalculationExpression)
class IntegerCalculationExpressionAspect extends org.modelexecution.operationalsemantics.gemoc.sequential.dynamic_allinecore.ExpressionAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
		if(_self.operator.value == IntegerCalculationOperator.ADD_VALUE) {
			(_self.assignee.currentValue as IntegerValue).value = (_self.operand1.currentValue as IntegerValue).value +
				(_self.operand2.currentValue as IntegerValue).value
		} else if(_self.operator.value == IntegerCalculationOperator.SUBRACT_VALUE) {
			(_self.assignee.currentValue as IntegerValue).value = (_self.operand1.currentValue as IntegerValue).value -
				(_self.operand2.currentValue as IntegerValue).value
		}

	}
}

@Aspect(className=IntegerComparisonExpression)
class IntegerComparisonExpressionAspect extends org.modelexecution.operationalsemantics.gemoc.sequential.dynamic_allinecore.ExpressionAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
		if(_self.operator.value == IntegerComparisonOperator.EQUALS_VALUE) {
			(_self.assignee.currentValue as BooleanValue).value = (_self.operand1.currentValue as IntegerValue).value ==
				(_self.operand2.currentValue as IntegerValue).value
		} else if(_self.operator.value == IntegerComparisonOperator.GREATER_EQUALS_VALUE) {
			(_self.assignee.currentValue as BooleanValue).value = (_self.operand1.currentValue as IntegerValue).value >=
				(_self.operand2.currentValue as IntegerValue).value
		} else if(_self.operator.value == IntegerComparisonOperator.GREATER_VALUE) {
			(_self.assignee.currentValue as BooleanValue).value = (_self.operand1.currentValue as IntegerValue).value >
				(_self.operand2.currentValue as IntegerValue).value
		} else if(_self.operator.value == IntegerComparisonOperator.SMALLER_EQUALS_VALUE) {
			(_self.assignee.currentValue as BooleanValue).value = (_self.operand1.currentValue as IntegerValue).value <=
				(_self.operand2.currentValue as IntegerValue).value
		} else if(_self.operator.value == IntegerComparisonOperator.SMALLER_VALUE) {
			(_self.assignee.currentValue as BooleanValue).value = (_self.operand1.currentValue as IntegerValue).value <
				(_self.operand2.currentValue as IntegerValue).value
		}
	}
}

@Aspect(className=BooleanUnaryExpression)
class BooleanUnaryExpressionAspect extends org.modelexecution.operationalsemantics.gemoc.sequential.dynamic_allinecore.ExpressionAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
		if(_self.operator.value == BooleanUnaryOperator.NOT_VALUE) {
			(_self.assignee.currentValue as BooleanValue).value = !(_self.operand.currentValue as BooleanValue).value
		}

	}
}

@Aspect(className=BooleanBinaryExpression)
class BooleanBinaryExpressionAspect extends org.modelexecution.operationalsemantics.gemoc.sequential.dynamic_allinecore.ExpressionAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
		if(_self.operator.value == BooleanBinaryOperator.AND_VALUE) {
			(_self.assignee.currentValue as BooleanValue).value = (_self.operand1.currentValue as BooleanValue).value &&
				(_self.operand2.currentValue as BooleanValue).value
		} else if(_self.operator.value == BooleanBinaryOperator.OR_VALUE) {
			(_self.assignee.currentValue as BooleanValue).value = (_self.operand1.currentValue as BooleanValue).value ||
				(_self.operand2.currentValue as BooleanValue).value
		}
	}
}

@Aspect(className=Offer)
class OfferAspect {

	def boolean hasTokens1() {
		_self.removeWithdrawnTokens1();
		return _self.offeredTokens.size() > 0;
	}

	def void removeWithdrawnTokens1() {
		val tokensToBeRemoved = new ArrayList<Token>();
		_self.offeredTokens.forEach [ token |
			if(token.withdrawn) {
				tokensToBeRemoved.add(token);
			}
		]
		_self.offeredTokens.removeAll(tokensToBeRemoved);
	}

}

@Aspect(className=Token)
class TokenAspect {

	def Token transfer1(ActivityNode holder) {
		if(_self.holder != null) {
			_self.withdraw1();
		}
		_self.holder = holder;
		return _self;
	}

	def void withdraw1() {
		if(!_self.isWithdrawn()) {
			_self.holder.removeToken1(_self);
			_self.holder = null;
		}
	}

	def boolean isWithdrawn() {
		return _self.holder == null;
	}
}
