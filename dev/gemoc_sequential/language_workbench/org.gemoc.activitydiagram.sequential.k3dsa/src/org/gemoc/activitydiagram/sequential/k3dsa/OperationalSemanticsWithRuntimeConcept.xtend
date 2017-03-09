package org.gemoc.activitydiagram.sequential.k3dsa

import activitydiagram.Activity
import activitydiagram.ActivityEdge
import activitydiagram.ActivityFinalNode
import activitydiagram.ActivityNode
import activitydiagram.BooleanBinaryExpression
import activitydiagram.BooleanBinaryOperator
import activitydiagram.BooleanUnaryExpression
import activitydiagram.BooleanUnaryOperator
import activitydiagram.BooleanVariable
import activitydiagram.ControlFlow
import activitydiagram.DecisionNode
import activitydiagram.DynamicBooleanValue
import activitydiagram.DynamicIntegerValue
import activitydiagram.Expression
import activitydiagram.ForkNode
import activitydiagram.InitialNode
import activitydiagram.IntegerCalculationExpression
import activitydiagram.IntegerCalculationOperator
import activitydiagram.IntegerComparisonExpression
import activitydiagram.IntegerComparisonOperator
import activitydiagram.IntegerVariable
import activitydiagram.JoinNode
import activitydiagram.MergeNode
import activitydiagram.NamedElement
import activitydiagram.OpaqueAction
import activitydiagram.StaticBooleanValue
import activitydiagram.StaticIntegerValue
import activitydiagram.Variable
import dynamic.activitydiagram.ActivitydiagramFactory
import dynamic.activitydiagram.ForkedToken
import dynamic.activitydiagram.Input
import dynamic.activitydiagram.InputValue
import dynamic.activitydiagram.Offer
import dynamic.activitydiagram.Token
import dynamic.activitydiagram.Trace
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import fr.inria.diverse.k3.al.annotationprocessor.Step
import fr.inria.diverse.melange.annotation.Containment
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.emf.common.util.EList

import static extension org.gemoc.activitydiagram.sequential.k3dsa.ActivityEdgeAspect.*
import static extension org.gemoc.activitydiagram.sequential.k3dsa.ActivityNodeAspect.*
import static extension org.gemoc.activitydiagram.sequential.k3dsa.ExpressionAspect.*
import static extension org.gemoc.activitydiagram.sequential.k3dsa.ForkedTokenAspect.*
import static extension org.gemoc.activitydiagram.sequential.k3dsa.OfferAspect.*
import static extension org.gemoc.activitydiagram.sequential.k3dsa.TokenAspect.*
import static extension org.gemoc.activitydiagram.sequential.k3dsa.TraceAspect.*
import static extension org.gemoc.activitydiagram.sequential.k3dsa.VariableAspect.*
import static extension org.gemoc.activitydiagram.sequential.k3dsa.DynamicBooleanValueAspect.*
import static extension org.gemoc.activitydiagram.sequential.k3dsa.DynamicIntegerValueAspect.*

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
		_self.trace = ActivitydiagramFactory.eINSTANCE.createTrace
		_self.trace.executedNodes.add(toExecute)
		toExecute.execute

		var list = _self.nodes.filter[node|node.hasOffers1]
		while (list != null && list.size > 0) {
			toExecute = list.get(0)
			_self.trace.executedNodes.add(toExecute)
			toExecute.execute
			list = _self.nodes.filter[node|node.hasOffers1]
		}
	}

	@Step
	def void reset() {
		_self.trace = null
	}
	
//	def int getIntegerVariableValue(String variableName) {
//		var currentValue = _self.getVariableValue(variableName);
//		if (currentValue instanceof DynamicIntegerValue) {
//			var integerValue = currentValue as DynamicIntegerValue;
//			return integerValue.getValue();
//		}
//		return -1;
//	}

//	def boolean getBooleanVariableValue(String variableName) {
//		var currentValue = _self.getVariableValue(variableName)
//		if (currentValue instanceof DynamicBooleanValue) {
//			var booleanValue = currentValue as DynamicBooleanValue
//			return booleanValue.isValue()
//		}
//		return false;
//	}

//	def DynamicValue getVariableValue(String variableName) {
//		var variable = _self.getVariable(variableName)
//		var currentValue = variable.currentValue
//		return currentValue;
//	}

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
	def void addToken() {
		_self.heldTokens.add(ActivitydiagramFactory.eINSTANCE.createControlToken)
	}
	
	@Step
	def void terminate() {
		_self.running = false
	}

	def boolean isReady() {
		return _self.isRunning()
	}

	@Step
	def void sendOffers1(EList<Token> tokens) {
		for (ActivityEdge edge : _self.getOutgoing()) {
			edge.sendOffer1(tokens)
		}
	}

	@Step
	def EList<Token> takeOfferdTokens1() {
		val allTokens = new BasicEList<Token>()
		for (ActivityEdge edge : _self.getIncoming()) {
			val tokens = edge.takeOfferedTokens1()
			for (Token token : tokens) {
				_self.heldTokens.add(token)
			}
			allTokens.addAll(tokens)
		}
		return allTokens
	}

	@Step
	def void addTokens1(EList<Token> tokens) {
		for (Token token : tokens) {
			_self.heldTokens.add(token)
		}
	}

	def boolean hasOffers1() {
		var hasOffer = true
		for (ActivityEdge edge : _self.getIncoming()) {
			if (!edge.hasOffer1()) {
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
	
	private EList<Offer> offersPool = new BasicEList
	
	@Containment
	public EList<Offer> offers
	
	def void sendOffer1(EList<Token> tokens) {
		val offer = if (_self.offersPool.empty) {
				ActivitydiagramFactory.eINSTANCE.createOffer
			} else {
				_self.offersPool.remove(0)
			}
		_self.offers.add(offer)
		tokens.forEach[token|offer.offeredTokens.add(token)]
	}

	def EList<Token> takeOfferedTokens1() {
		val tokens = new BasicEList<Token>
		_self.offers.forEach[o|
			tokens.addAll(o.offeredTokens)
			_self.offersPool.add(o)
		]
		_self.offers.clear
		return tokens
	}

	def boolean hasOffer1() {
		return _self.offers.exists[o1|o1.hasTokens1]
	}
}

@Aspect(className=ControlFlow)
class ControlFlowAspect extends ActivityEdgeAspect {
}

@Aspect(className=OpaqueAction)
class OpaqueActionAspect extends ActivityNodeAspect {
	@OverrideAspectMethod
	def void execute() {
		_self.expressions.forEach[e|e.execute]
		_self.sendOffers1(_self.takeOfferdTokens1)
	}
}

@Aspect(className=InitialNode)
class InitialNodeAspect extends ActivityNodeAspect {
	@OverrideAspectMethod
	def void execute() {
		var r = ActivitydiagramFactory.eINSTANCE.createControlToken
		_self.heldTokens.add(r)
		var list = new BasicEList<Token>
		list.add(r)
		_self.sendOffers1(list)
	}

	@OverrideAspectMethod
	def boolean hasOffers1() {
		return false;
	}

}

@Aspect(className=Expression)
class ExpressionAspect {
	def void execute() {
	}
}

@Aspect(className=ActivityFinalNode)
class ActivityFinalNodeAspect extends ActivityNodeAspect {
	@OverrideAspectMethod
	def void execute() {
		_self.sendOffers1(_self.takeOfferdTokens1)
	}
}

@Aspect(className=ForkNode)
class ForkNodeAspect extends ActivityNodeAspect {
	@OverrideAspectMethod
	def void execute() {
		var tokens = _self.takeOfferdTokens1
		var forkedTokens = new BasicEList<Token>()
		for (Token token : tokens) {
			var forkedToken = ActivitydiagramFactory.eINSTANCE.createForkedToken
			forkedToken.baseToken = token
			forkedToken.remainingOffersCount = _self.outgoing.size()
			forkedTokens.add(forkedToken)
		}
		_self.addTokens1(forkedTokens)
		_self.sendOffers1(forkedTokens)
	}
}

@Aspect(className=JoinNode)
class JoinNodeAspect extends ActivityNodeAspect {
	@OverrideAspectMethod
	def void execute() {
		var tokens = _self.takeOfferdTokens1
		tokens.forEach [ t |
			val forkedToken = t as ForkedToken
			if (forkedToken.remainingOffersCount > 1) {
				forkedToken.remainingOffersCount = forkedToken.remainingOffersCount - 1
			} else {
				var list = new BasicEList<Token>
				list.add(forkedToken.baseToken)
				_self.sendOffers1(list)
			}
		]
	}
}

@Aspect(className=MergeNode)
class MergeNodeAspect extends ActivityNodeAspect {
	@OverrideAspectMethod
	def void execute() {
		_self.sendOffers1(_self.takeOfferdTokens1)
	}

	def boolean hasOffers1() {
		return _self.incoming.exists[edge|edge.hasOffer1()]
	}
}

@Aspect(className=DecisionNode)
class DecisionNodeAspect extends ActivityNodeAspect {
	@OverrideAspectMethod
	def void execute() {
		_self.sendOffers1(_self.takeOfferdTokens1)
	}

	@OverrideAspectMethod
	def void sendOffers1(EList<Token> tokens) {
		for (ActivityEdge edge : _self.getOutgoing()) {
			if (edge instanceof ControlFlow && ( edge as ControlFlow).guard != null) {
				if (((edge as ControlFlow).guard.currentValue as DynamicBooleanValue).value) {
					edge.sendOffer1(tokens);
				}
			}
		}
	}
}

@Aspect(className=Variable)
class VariableAspect {
	
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
		if (_self.initialValue != null) {
			(_self.currentValue as DynamicIntegerValue).value = (_self.initialValue as StaticIntegerValue).value
		} else {
			(_self.currentValue as DynamicIntegerValue).value = 0;
		}
	}

	@OverrideAspectMethod
	def String print() {
		var text = new StringBuffer();
		text.append(_self.getName());
		text.append(" = ");
		text.append((_self.currentValue as DynamicIntegerValue).value);
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
		if (_self.initialValue != null) {
			(_self.currentValue as DynamicBooleanValue).value = (_self.initialValue as StaticBooleanValue).value
		} else {
			(_self.currentValue as DynamicIntegerValue).value = 0;
		}
	}

	@OverrideAspectMethod
	def String print() {
		var text = new StringBuffer();
		text.append(_self.getName());
		text.append(" = ");
		text.append((_self.currentValue as DynamicBooleanValue).value);
		return text.toString();
	}

}

@Aspect(className=IntegerCalculationExpression)
class IntegerCalculationExpressionAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def void execute() {
		var int intValue = 0
		if (_self.operator.value == IntegerCalculationOperator.ADD_VALUE) {
			intValue = (_self.operand1.currentValue as DynamicIntegerValue).value + (_self.operand2.currentValue as DynamicIntegerValue).value
		} else if (_self.operator.value == IntegerCalculationOperator.SUBRACT_VALUE) {
			intValue = (_self.operand1.currentValue as DynamicIntegerValue).value - (_self.operand2.currentValue as DynamicIntegerValue).value
		}
		if (intValue != (_self.assignee.currentValue as DynamicIntegerValue).value) {
			(_self.assignee.currentValue as DynamicIntegerValue).value = intValue
		}
	}
}

@Aspect(className=IntegerComparisonExpression)
class IntegerComparisonExpressionAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def void execute() {
		var boolean boolValue = false
		if (_self.operator.value == IntegerComparisonOperator.EQUALS_VALUE) {
			boolValue = (_self.operand1.currentValue as DynamicIntegerValue).value == (_self.operand2.currentValue as DynamicIntegerValue).value
		} else if (_self.operator.value == IntegerComparisonOperator.GREATER_EQUALS_VALUE) {
			boolValue = (_self.operand1.currentValue as DynamicIntegerValue).value >= (_self.operand2.currentValue as DynamicIntegerValue).value
		} else if (_self.operator.value == IntegerComparisonOperator.GREATER_VALUE) {
			boolValue = (_self.operand1.currentValue as DynamicIntegerValue).value > (_self.operand2.currentValue as DynamicIntegerValue).value
		} else if (_self.operator.value == IntegerComparisonOperator.SMALLER_EQUALS_VALUE) {
			boolValue = (_self.operand1.currentValue as DynamicIntegerValue).value <= (_self.operand2.currentValue as DynamicIntegerValue).value
		} else if (_self.operator.value == IntegerComparisonOperator.SMALLER_VALUE) {
			boolValue = (_self.operand1.currentValue as DynamicIntegerValue).value < (_self.operand2.currentValue as DynamicIntegerValue).value
		}
		if (boolValue != (_self.assignee.currentValue as DynamicBooleanValue).value) {
			(_self.assignee.currentValue as DynamicBooleanValue).value = boolValue
		}
	}
}

@Aspect(className=BooleanUnaryExpression)
class BooleanUnaryExpressionAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def void execute() {
		var boolean boolValue = false
		if (_self.operator.value == BooleanUnaryOperator.NOT_VALUE) {
			boolValue = !(_self.operand.currentValue as DynamicBooleanValue).value
		}
		if (boolValue != (_self.assignee.currentValue as DynamicBooleanValue).value) {
			(_self.assignee.currentValue as DynamicBooleanValue).value = boolValue
		}
	}
}

@Aspect(className=BooleanBinaryExpression)
class BooleanBinaryExpressionAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def void execute() {
		var boolean boolValue = false
		if (_self.operator.value == BooleanBinaryOperator.AND_VALUE) {
			boolValue = (_self.operand1.currentValue as DynamicBooleanValue).value && (_self.operand2.currentValue as DynamicBooleanValue).value
		} else if (_self.operator.value == BooleanBinaryOperator.OR_VALUE) {
			boolValue = (_self.operand1.currentValue as DynamicBooleanValue).value || (_self.operand2.currentValue as DynamicBooleanValue).value
		}
		if (boolValue != (_self.assignee.currentValue as DynamicBooleanValue).value) {
			(_self.assignee.currentValue as DynamicBooleanValue).value = boolValue
		}
	}
}

@Aspect(className=Offer)
class OfferAspect {
	
	public EList<Token> offeredTokens

	def boolean hasTokens1() {
		_self.removeWithdrawnTokens1();
		return _self.offeredTokens.size() > 0;
	}

	def void removeWithdrawnTokens1() {
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

	def boolean isWithdrawn() {
		return _self.eContainer == null;
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

@Aspect(className=DynamicBooleanValue)
@OverrideAspectMethod
class DynamicBooleanValueAspect {
	
	public boolean value
}

@Aspect(className=DynamicIntegerValue)
@OverrideAspectMethod
class DynamicIntegerValueAspect {
	
	public int value
}
