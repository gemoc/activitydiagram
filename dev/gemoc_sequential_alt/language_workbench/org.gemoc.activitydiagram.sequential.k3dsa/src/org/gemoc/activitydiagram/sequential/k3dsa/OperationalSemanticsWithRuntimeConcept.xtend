package org.gemoc.activitydiagram.sequential.k3dsa

import activitydiagram.Activity
import activitydiagram.ActivityEdge
import activitydiagram.ActivityFinalNode
import activitydiagram.ActivityNode
import activitydiagram.BooleanBinaryExpression
import activitydiagram.BooleanBinaryOperator
import activitydiagram.BooleanExpression
import activitydiagram.BooleanUnaryExpression
import activitydiagram.BooleanUnaryOperator
import activitydiagram.BooleanVariable
import activitydiagram.BooleanVariableAssignment
import activitydiagram.ControlFlow
import activitydiagram.DecisionNode
import activitydiagram.FinalNode
import activitydiagram.FlowFinalNode
import activitydiagram.ForkNode
import activitydiagram.InitialNode
import activitydiagram.IntegerBinaryExpression
import activitydiagram.IntegerCalculationOperator
import activitydiagram.IntegerComparisonExpression
import activitydiagram.IntegerComparisonOperator
import activitydiagram.IntegerExpression
import activitydiagram.IntegerVariable
import activitydiagram.IntegerVariableAssignment
import activitydiagram.JoinNode
import activitydiagram.MergeNode
import activitydiagram.NamedElement
import activitydiagram.OpaqueAction
import activitydiagram.Variable
import activitydiagram.VariableAssignment
import dynamic.activitydiagram.ActivitydiagramFactory
import dynamic.activitydiagram.ControlToken
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import fr.inria.diverse.k3.al.annotationprocessor.Step
import fr.inria.diverse.melange.annotation.Containment
import org.eclipse.emf.common.util.EList

import static extension org.gemoc.activitydiagram.sequential.k3dsa.ActivityEdgeAspect.*
import static extension org.gemoc.activitydiagram.sequential.k3dsa.ActivityNodeAspect.*
import static extension org.gemoc.activitydiagram.sequential.k3dsa.BooleanExpressionAspect.*
import static extension org.gemoc.activitydiagram.sequential.k3dsa.BooleanVariableAspect.*
import static extension org.gemoc.activitydiagram.sequential.k3dsa.IntegerExpressionAspect.*
import static extension org.gemoc.activitydiagram.sequential.k3dsa.IntegerVariableAspect.*
import static extension org.gemoc.activitydiagram.sequential.k3dsa.VariableAspect.*
import static extension org.gemoc.activitydiagram.sequential.k3dsa.VariableAssignmentAspect.*

@Aspect(className=NamedElement)
class NamedElementAspect {
	def void execute() {
	}
}

@Aspect(className=Activity)
class ActivityAspect extends NamedElementAspect {

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
		var toExecute = _self.nodes.filter[node|node instanceof InitialNode].get(0)
		toExecute.execute
		var list = _self.nodes.filter[node|node.hasOffers]
		while (list != null && list.size > 0) {
			toExecute = list.get(0)
			toExecute.execute
			list = _self.nodes.filter[node|node.hasOffers]
		}
	}
}

@Aspect(className=ActivityNode)
class ActivityNodeAspect extends NamedElementAspect {
	
	@Containment
	public EList<ControlToken> heldTokens
	
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
	def void addToken(ControlToken token) {
		_self.heldTokens.add(token)
	}

	def boolean hasOffers() {
		false
	}

	@Step
	def void removeToken(ControlToken token) {
		_self.heldTokens.remove(token)
	}
}

@Aspect(className=ActivityEdge)
class ActivityEdgeAspect extends NamedElementAspect {
	
	@Containment
	public EList<ControlToken> offeredTokens
	
	def void sendOffer(ControlToken token) {
		_self.offeredTokens.add(token)
	}

	def ControlToken takeOfferedToken() {
		if (_self.hasOffer) {
			return _self.offeredTokens.head
		}
		return null
	}

	def boolean hasOffer() {
		return !_self.offeredTokens.empty
	}
}

@Aspect(className=ControlFlow)
class ControlFlowAspect extends ActivityEdgeAspect {
}

@Aspect(className=OpaqueAction)
class OpaqueActionAspect extends ActivityNodeAspect {
	def void sendOffer(ControlToken token) {
		_self.outgoing.sendOffer(token)
	}
	
	@OverrideAspectMethod
	def void execute() {
		_self.assignments.forEach[a|a.execute]
		val token = _self.incoming.offeredTokens.head
		_self.addToken(token)
		_self.sendOffer(token)
	}
	
	@OverrideAspectMethod
	def boolean hasOffers() {
		!_self.incoming.offeredTokens.empty
	}
}

@Aspect(className=InitialNode)
class InitialNodeAspect extends ActivityNodeAspect {
	def void sendOffer(ControlToken token) {
		_self.outgoing.sendOffer(token)
	}
	
	@OverrideAspectMethod
	def void execute() {
		var t = ActivitydiagramFactory.eINSTANCE.createControlToken
		_self.addToken(t)
		_self.sendOffer(t)
	}
}

@Aspect(className=FinalNode)
class FinalNodeAspect extends ActivityNodeAspect {
	@OverrideAspectMethod
	def void execute() {
	}
	
	@OverrideAspectMethod
	def boolean hasOffers() {
		!_self.incoming.offeredTokens.empty
	}
}

@Aspect(className=ActivityFinalNode)
class ActivityFinalNodeAspect extends FinalNodeAspect {
	@OverrideAspectMethod
	def void execute() {
		val token = _self.incoming.offeredTokens.head
		_self.addToken(token)
	}
}

@Aspect(className=FlowFinalNode)
class FlowFinalNodeAspect extends FinalNodeAspect {
	@OverrideAspectMethod
	def void execute() {
		val token = _self.incoming.offeredTokens.head
		_self.addToken(token)
	}
}

@Aspect(className=ForkNode)
class ForkNodeAspect extends ActivityNodeAspect {
	@OverrideAspectMethod
	def void execute() {
		var token = _self.incoming.offeredTokens.head
		_self.addToken(token)
		_self.outgoing.get(0).offeredTokens.add(token)
		for (var i = 1; i < _self.outgoing.size; i++) {
			var newToken = ActivitydiagramFactory.eINSTANCE.createControlToken
			_self.addToken(newToken)
			_self.outgoing.get(i).offeredTokens.add(newToken)
		}
	}
	
	@OverrideAspectMethod
	def boolean hasOffers() {
		!_self.incoming.offeredTokens.empty
	}
}

@Aspect(className=JoinNode)
class JoinNodeAspect extends ActivityNodeAspect {
	@OverrideAspectMethod
	def boolean hasOffers() {
		return _self.incoming.forall[e|!e.offeredTokens.empty]
	}
	
	@OverrideAspectMethod
	def void execute() {
		_self.incoming.forEach[e|_self.addToken(e.offeredTokens.head)]
		_self.heldTokens.clear
		val token = ActivitydiagramFactory.eINSTANCE.createControlToken
		_self.addToken(token)
		_self.outgoing.offeredTokens.add(token)
		
	}
}

@Aspect(className=MergeNode)
class MergeNodeAspect extends ActivityNodeAspect {
	@OverrideAspectMethod
	def boolean hasOffers() {
		return _self.incoming.exists[e|!e.offeredTokens.empty]
	}
	
	@OverrideAspectMethod
	def void execute() {
		var incoming = _self.incoming.findFirst[e|!e.offeredTokens.empty]
		if (incoming != null) {
			var token = incoming.offeredTokens.head
			_self.addToken(token)
			_self.outgoing.offeredTokens.add(token)
		}
	}
}

@Aspect(className=DecisionNode)
class DecisionNodeAspect extends ActivityNodeAspect {
	@OverrideAspectMethod
	def void execute() {
		var token = _self.incoming.offeredTokens.head
		for (ActivityEdge edge : _self.outgoing) {
			if (edge instanceof ControlFlow && (edge as ControlFlow).guard != null) {
				if ((edge as ControlFlow).guard.currentValue) {
					edge.sendOffer(token);
				}
			}
		}
	}
	
	@OverrideAspectMethod
	def boolean hasOffers() {
		!_self.incoming.offeredTokens.empty
	}
}

@Aspect(className=IntegerExpression)
class IntegerExpressionAspect {
	def int evaluate() {
		0
	}
}

@Aspect(className=BooleanExpression)
class BooleanExpressionAspect {
	def boolean evaluate() {
		false
	}
}

@Aspect(className=Variable)
class VariableAspect {
	
	@Step
	def void init() {
	}
}

@Aspect(className=IntegerVariable)
class IntegerVariableAspect extends VariableAspect {
	
	public var int currentValue
	
	@OverrideAspectMethod
	def void init() {
		_self.currentValue = _self.initialValue;
	}
}

@Aspect(className=IntegerVariable)
class IntegerVariableEvaluateAspect extends IntegerExpressionAspect {
	
	@OverrideAspectMethod
	def int evaluate() {
		_self.currentValue
	}
}

@Aspect(className=BooleanVariable)
@OverrideAspectMethod
class BooleanVariableAspect extends VariableAspect {
	
	public var boolean currentValue
	
	@OverrideAspectMethod
	def void init() {
		_self.currentValue = _self.initialValue;
	}
}

@Aspect(className=BooleanVariable)
class BooleanVariableEvaluateAspect extends BooleanExpressionAspect {
	@OverrideAspectMethod
	def boolean evaluate() {
		_self.currentValue
	}
}

@Aspect(className=IntegerBinaryExpression)
class IntegerBinaryExpressionAspect extends IntegerExpressionAspect {
	@OverrideAspectMethod
	def int evaluate() {
		var int intValue = 0
		if (_self.operator.value == IntegerCalculationOperator.ADD_VALUE) {
			intValue = _self.operand1.evaluate + _self.operand2.evaluate
		} else if (_self.operator.value == IntegerCalculationOperator.SUBRACT_VALUE) {
			intValue = _self.operand1.evaluate - _self.operand2.evaluate
		}
		return intValue
	}
}

@Aspect(className=IntegerComparisonExpression)
class IntegerComparisonExpressionAspect extends BooleanExpressionAspect {
	@OverrideAspectMethod
	def boolean evaluate() {
		var boolean boolValue = false
		if (_self.operator.value == IntegerComparisonOperator.EQUALS_VALUE) {
			boolValue = _self.operand1.evaluate == _self.operand2.evaluate
		} else if (_self.operator.value == IntegerComparisonOperator.GREATER_EQUALS_VALUE) {
			boolValue = _self.operand1.evaluate >= _self.operand2.evaluate
		} else if (_self.operator.value == IntegerComparisonOperator.GREATER_VALUE) {
			boolValue = _self.operand1.evaluate > _self.operand2.evaluate
		} else if (_self.operator.value == IntegerComparisonOperator.SMALLER_EQUALS_VALUE) {
			boolValue = _self.operand1.evaluate <= _self.operand2.evaluate
		} else if (_self.operator.value == IntegerComparisonOperator.SMALLER_VALUE) {
			boolValue = _self.operand1.evaluate < _self.operand2.evaluate
		}
		return boolValue
	}
}

@Aspect(className=BooleanUnaryExpression)
class BooleanUnaryExpressionAspect extends BooleanExpressionAspect {
	@OverrideAspectMethod
	def boolean evaluate() {
		var boolean boolValue = false
		if (_self.operator.value == BooleanUnaryOperator.NOT_VALUE) {
			boolValue = !_self.operand.evaluate
		}
		return boolValue
	}
}

@Aspect(className=BooleanBinaryExpression)
class BooleanBinaryExpressionAspect extends BooleanExpressionAspect {
	@OverrideAspectMethod
	def boolean evaluate() {
		var boolean boolValue = false
		if (_self.operator.value == BooleanBinaryOperator.AND_VALUE) {
			boolValue = _self.operand1.evaluate && _self.operand2.evaluate
		} else if (_self.operator.value == BooleanBinaryOperator.OR_VALUE) {
			boolValue = _self.operand1.evaluate || _self.operand2.evaluate
		}
		return boolValue
	}
}

@Aspect(className=VariableAssignment)
class VariableAssignmentAspect {
	def void execute() {
	}
}

@Aspect(className=BooleanVariableAssignment)
class BooleanVariableAssignmentAspect extends VariableAssignmentAspect {
	@OverrideAspectMethod
	def void execute() {
		_self.assignee.currentValue = _self.expression.evaluate
	}
}

@Aspect(className=IntegerVariableAssignment)
class IntegerVariableAssignmentAspect extends VariableAssignmentAspect {
	@OverrideAspectMethod
	def void execute() {
		_self.assignee.currentValue = _self.expression.evaluate
	}
}

//@Aspect(className=Offer)
//class OfferAspect {
//	
//	public ControlToken offeredToken
//
//	def boolean hasTokens1() {
//		_self.removeWithdrawnTokens1();
//		return _self.offeredTokens.size() > 0;
//	}
//
//	def void removeWithdrawnTokens1() {
//		val tokensToBeRemoved = new BasicEList<ControlToken>();
//		_self.offeredTokens.forEach [ token |
//			if (token.withdrawn) {
//				tokensToBeRemoved.add(token);
//			}
//		]
//		_self.offeredTokens.removeAll(tokensToBeRemoved);
//	}
//}

@Aspect(className=ControlToken)
class ControlTokenAspect {
	def boolean isWithdrawn() {
		return _self.eContainer == null;
	}
}
