package org.gemoc.activitydiagram.sequential.k3dsa

import activitydiagram.Activity
import activitydiagram.ActivityEdge
import activitydiagram.ActivityFinalNode
import activitydiagram.ActivityNode
import activitydiagram.ActivitydiagramFactory
import activitydiagram.BooleanBinaryExpression
import activitydiagram.BooleanBinaryOperator
import activitydiagram.BooleanUnaryExpression
import activitydiagram.BooleanUnaryOperator
import activitydiagram.BooleanValue
import activitydiagram.BooleanVariable
import activitydiagram.ControlFlow
import activitydiagram.DecisionNode
import activitydiagram.Expression
import activitydiagram.ForkNode
import activitydiagram.InitialNode
import activitydiagram.IntegerCalculationExpression
import activitydiagram.IntegerCalculationOperator
import activitydiagram.IntegerComparisonExpression
import activitydiagram.IntegerComparisonOperator
import activitydiagram.IntegerValue
import activitydiagram.IntegerVariable
import activitydiagram.JoinNode
import activitydiagram.MergeNode
import activitydiagram.NamedElement
import activitydiagram.OpaqueAction
import activitydiagram.Value
import activitydiagram.Variable
import dynamic.activitydiagram.ForkedToken
import dynamic.activitydiagram.Input
import dynamic.activitydiagram.InputValue
import dynamic.activitydiagram.Offer
import dynamic.activitydiagram.Token
import dynamic.activitydiagram.Trace
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.melange.annotation.Containment
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import fr.inria.diverse.k3.al.annotationprocessor.Step
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.emf.common.util.EList

import static extension org.gemoc.activitydiagram.sequential.k3dsa.ActivityEdgeAspect.*
import static extension org.gemoc.activitydiagram.sequential.k3dsa.ActivityNodeAspect.*
import static extension org.gemoc.activitydiagram.sequential.k3dsa.ForkedTokenAspect.*
import static extension org.gemoc.activitydiagram.sequential.k3dsa.OfferAspect.*
import static extension org.gemoc.activitydiagram.sequential.k3dsa.TokenAspect.*
import static extension org.gemoc.activitydiagram.sequential.k3dsa.TraceAspect.*
import static extension org.gemoc.activitydiagram.sequential.k3dsa.VariableAspect.*
import static extension org.gemoc.activitydiagram.sequential.k3dsa.ExpressionAspect.*

class Util {
	public static final Object LINE_BREAK = System.getProperty("line.separator");

}

@Aspect(className=Activity)
class ActivityAspect extends NamedElementAspect {

	@Containment
	public Trace trace
	

	@InitializeModel
	def void initializeModel(EList<String> args) {
	}

	@Main
	def void main() {
		_self.execute
	}

	@OverrideAspectMethod
	@Step
	def void execute() {
		_self.locals.forEach[v|v.init()]
		_self.inputs.forEach[v|v.init()]
		var toExecute = _self.nodes.filter[node|node instanceof InitialNode].get(0)
		_self.trace = dynamic.activitydiagram.ActivitydiagramFactory.eINSTANCE.createTrace
		_self.trace.executedNodes.add(toExecute)
		toExecute.execute

		var list = _self.nodes.filter[node|node.hasOffers]
		while (list !== null && list.size > 0) {
			toExecute = list.get(0)
			_self.trace.executedNodes.add(toExecute)
			toExecute.execute
			list = _self.nodes.filter[node|node.hasOffers]
		}
	}

	@Step
	def void reset() {
		_self.trace = null
	}
	
	def int getIntegerVariableValue(String variableName) {
		var currentValue = _self.getVariableValue(variableName);
		if (currentValue instanceof IntegerValue) {
			var integerValue = currentValue as IntegerValue;
			return integerValue.getValue();
		}
		return -1;
	}

	def boolean getBooleanVariableValue(String variableName) {
		var currentValue = _self.getVariableValue(variableName)
		if (currentValue instanceof BooleanValue) {
			var booleanValue = currentValue as BooleanValue
			return booleanValue.isValue()
		}
		return false;
	}

	def Value getVariableValue(String variableName) {
		var variable = _self.getVariable(variableName)
		var currentValue = variable.currentValue
		return currentValue;
	}

	def Variable getVariable(String variableName) {
		var allVariables = new BasicEList<Variable>();
		allVariables.addAll(_self.getLocals());
		allVariables.addAll(_self.getInputs());
		for (Variable var1 : allVariables) {
			if (var1.getName().equals(variableName)) {
				return var1;
			}
		}
		return null;
	}
}

@Aspect(className=NamedElement)
class NamedElementAspect {
	def void execute() {
	}
}

@Aspect(className=ActivityNode)
class ActivityNodeAspect extends NamedElementAspect {
	
	@Containment
	public EList<Token> heldTokens
	
	@OverrideAspectMethod
	@Step
	def void execute() {
	}

	@Step
	def void terminate() {
		_self.running = false
	}

	def boolean isReady() {
		return _self.isRunning()
	}

	@Step
	def void sendOffers(EList<Token> tokens) {
		for (ActivityEdge edge : _self.getOutgoing()) {
			edge.sendOffer(tokens)
		}
	}

	@Step
	def EList<Token> takeOfferdTokens() {
		val allTokens = new BasicEList<Token>()
		for (ActivityEdge edge : _self.getIncoming()) {
			val tokens = edge.takeOfferedTokens()
			for (Token token : tokens) {
				_self.heldTokens.add(token)
			}
			allTokens.addAll(tokens)
		}
		return allTokens
	}

	@Step
	def void addTokens(EList<Token> tokens) {
		for (Token token : tokens) {
			_self.heldTokens.add(token)
		}
	}

	def boolean hasOffers() {
		var hasOffer = true
		for (ActivityEdge edge : _self.getIncoming()) {
			if (!edge.hasOffer()) {
				hasOffer = false
			}
		}
		return hasOffer
	}

	@Step
	def void removeToken1(Token token) {
		_self.heldTokens.remove(token)
	}
}

@Aspect(className=ActivityEdge)
class ActivityEdgeAspect extends NamedElementAspect {
	
	@Containment
	public EList<Offer> offers
	
	def void sendOffer(EList<Token> tokens) {
		val offer = dynamic.activitydiagram.ActivitydiagramFactory.eINSTANCE.createOffer
		_self.offers.add(offer)
		tokens.forEach[token|offer.offeredTokens.add(token)]
	}

	def EList<Token> takeOfferedTokens() {
		val tokens = new BasicEList<Token>
		_self.offers.forEach[o|tokens.addAll(o.offeredTokens)]
		_self.offers.clear
		return tokens
	}

	def boolean hasOffer() {
		return _self.offers.exists[o1|o1.hasTokens]
	}
}

@Aspect(className=ControlFlow)
class ControlFlowAspect extends ActivityEdgeAspect {
}

@Aspect(className=OpaqueAction)
class OpaqueActionAspect extends ActivityNodeAspect {
	@OverrideAspectMethod
	def void execute() {
		_self.expressions.forEach[e | e.execute]
		_self.sendOffers(_self.takeOfferdTokens)
	}
}

@Aspect(className=InitialNode)
class InitialNodeAspect extends ActivityNodeAspect {
	@OverrideAspectMethod
	def void execute() {
		var r = dynamic.activitydiagram.ActivitydiagramFactory.eINSTANCE.createControlToken
		_self.heldTokens.add(r)
		var list = new BasicEList<Token>
		list.add(r)
		_self.sendOffers(list)
	}

	@OverrideAspectMethod
	def boolean hasOffers() {
		return false;
	}

}

@Aspect(className=Expression)
class ExpressionAspect {
	@Step
	def void execute() {
	}
}

@Aspect(className=ActivityFinalNode)
class ActivityFinalNodeAspect extends ActivityNodeAspect {
	@OverrideAspectMethod
	def void execute() {
		_self.sendOffers(_self.takeOfferdTokens)
	}
}

@Aspect(className=ForkNode)
class ForkNodeAspect extends ActivityNodeAspect {
	@OverrideAspectMethod
	def void execute() {
		var tokens = _self.takeOfferdTokens
		var forkedTokens = new BasicEList<Token>()
		for (Token token : tokens) {
			var forkedToken = dynamic.activitydiagram.ActivitydiagramFactory.eINSTANCE.createForkedToken
			forkedToken.baseToken = token
			forkedToken.remainingOffersCount = _self.outgoing.size()
			forkedTokens.add(forkedToken)
		}
		_self.addTokens(forkedTokens)
		_self.sendOffers(forkedTokens)
	}
}

@Aspect(className=JoinNode)
class JoinNodeAspect extends ActivityNodeAspect {
	@OverrideAspectMethod
	def void execute() {
		var tokens = _self.takeOfferdTokens
		tokens.forEach [ t |
			if ((t as ForkedToken).remainingOffersCount > 1) {
				(t as ForkedToken).remainingOffersCount = (t as ForkedToken).remainingOffersCount - 1
			} else {
				var list = new BasicEList<Token>
				list.add(t)
				_self.sendOffers(list)
			}
		]
	}
}

@Aspect(className=MergeNode)
class MergeNodeAspect extends ActivityNodeAspect {
	@OverrideAspectMethod
	def void execute() {
		_self.sendOffers(_self.takeOfferdTokens)
	}

	def boolean hasOffers() {
		return _self.incoming.exists[edge|edge.hasOffer()]
	}
}

@Aspect(className=DecisionNode)
class DecisionNodeAspect extends ActivityNodeAspect {
	@OverrideAspectMethod
	def void execute() {
		_self.sendOffers(_self.takeOfferdTokens)
	}

	@OverrideAspectMethod
	def void sendOffers(EList<Token> tokens) {
		for (ActivityEdge edge : _self.getOutgoing()) {
			if (edge instanceof ControlFlow && ( edge as ControlFlow).guard !== null) {
				if ((( edge as ControlFlow).guard.currentValue as BooleanValue).value) {
					edge.sendOffer(tokens);
				}
			}
		}
	}
}

@Aspect(className=Variable)
class VariableAspect {
	
	public Value currentValue
	
	@Step
	def void execute() {
	}

	@Step
	def void init() {
	}

	def String print() {
	}
}

@Aspect(className=IntegerVariable)
class IntegerVariableAspect extends VariableAspect {
	
	@OverrideAspectMethod
	def void execute() {
	}

	@OverrideAspectMethod
	def void init() {
		if (_self.currentValue === null) {
			if (_self.initialValue !== null)
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
		text.append((_self.currentValue as IntegerValue).getValue());
		return text.toString();
	}
}

@Aspect(className=BooleanVariable)
@OverrideAspectMethod
class BooleanVariableAspect extends VariableAspect {
	def void execute() {
	}

	@OverrideAspectMethod
	def void init() {
		if (_self.currentValue === null) {
			if (_self.initialValue !== null)
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
		text.append((_self.currentValue as BooleanValue).isValue());
		return text.toString();
	}

}

@Aspect(className=IntegerCalculationExpression)
class IntegerCalculationExpressionAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def void execute() {
		if (_self.operator.value == IntegerCalculationOperator.ADD_VALUE) {
			(_self.assignee.currentValue as IntegerValue).value = (_self.operand1.currentValue as IntegerValue).value +
				(_self.operand2.currentValue as IntegerValue).value
		} else if (_self.operator.value == IntegerCalculationOperator.SUBRACT_VALUE) {
			(_self.assignee.currentValue as IntegerValue).value = (_self.operand1.currentValue as IntegerValue).value -
				(_self.operand2.currentValue as IntegerValue).value
		}

	}
}

@Aspect(className=IntegerComparisonExpression)
class IntegerComparisonExpressionAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def void execute() {
		if (_self.operator.value == IntegerComparisonOperator.EQUALS_VALUE) {
			(_self.assignee.currentValue as BooleanValue).value = (_self.operand1.currentValue as IntegerValue).value ==
				(_self.operand2.currentValue as IntegerValue).value
		} else if (_self.operator.value == IntegerComparisonOperator.GREATER_EQUALS_VALUE) {
			(_self.assignee.currentValue as BooleanValue).value = (_self.operand1.currentValue as IntegerValue).value >=
				(_self.operand2.currentValue as IntegerValue).value
		} else if (_self.operator.value == IntegerComparisonOperator.GREATER_VALUE) {
			(_self.assignee.currentValue as BooleanValue).value = (_self.operand1.currentValue as IntegerValue).value >
				(_self.operand2.currentValue as IntegerValue).value
		} else if (_self.operator.value == IntegerComparisonOperator.SMALLER_EQUALS_VALUE) {
			(_self.assignee.currentValue as BooleanValue).value = (_self.operand1.currentValue as IntegerValue).value <=
				(_self.operand2.currentValue as IntegerValue).value
		} else if (_self.operator.value == IntegerComparisonOperator.SMALLER_VALUE) {
			(_self.assignee.currentValue as BooleanValue).value = (_self.operand1.currentValue as IntegerValue).value <
				(_self.operand2.currentValue as IntegerValue).value
		}
	}
}

@Aspect(className=BooleanUnaryExpression)
class BooleanUnaryExpressionAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def void execute() {
		if (_self.operator.value == BooleanUnaryOperator.NOT_VALUE) {
			(_self.assignee.currentValue as BooleanValue).value = !(_self.operand.currentValue as BooleanValue).value
		}

	}
}

@Aspect(className=BooleanBinaryExpression)
class BooleanBinaryExpressionAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def void execute() {
		if (_self.operator.value == BooleanBinaryOperator.AND_VALUE) {
			(_self.assignee.currentValue as BooleanValue).value = (_self.operand1.currentValue as BooleanValue).value &&
				(_self.operand2.currentValue as BooleanValue).value
		} else if (_self.operator.value == BooleanBinaryOperator.OR_VALUE) {
			(_self.assignee.currentValue as BooleanValue).value = (_self.operand1.currentValue as BooleanValue).value ||
				(_self.operand2.currentValue as BooleanValue).value
		}
	}
}

@Aspect(className=Offer)
class OfferAspect {
	
	public EList<Token> offeredTokens

	def boolean hasTokens() {
		_self.removeWithdrawnTokens();
		return _self.offeredTokens.size() > 0;
	}

	def void removeWithdrawnTokens() {
		val tokensToBeRemoved = new BasicEList<Token>();
		_self.offeredTokens.forEach [ token |
			if (token.withdrawn) {
				tokensToBeRemoved.add(token);
			}
		]
		_self.offeredTokens.removeAll(tokensToBeRemoved);
	}
}

@Aspect(className=Token)
class TokenAspect {
	
//	public ActivityNode holder

	def boolean isWithdrawn() {
		return _self.eContainer === null;
	}
}

@Aspect(className=ForkedToken)
class ForkedTokenAspect {
	
	public Token baseToken
	
	public int remainingOffersCount
	
}

@Aspect(className=Trace)
class TraceAspect {
	
	public EList<ActivityNode> executedNodes
	
}

@Aspect(className=Input)
class InputAspect {
	
	@Containment
	public EList<InputValue> inputValues
	
}

@Aspect(className=InputValue)
class InputValueAspect {
	
	public Variable variable
	
	@Containment
	public Value value
	
}
