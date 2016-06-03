/**
 */
package activitydiagramTrace.Steps;

import activitydiagramTrace.States.activitydiagram.TracedDecisionNode;

import org.gemoc.executionframework.engine.mse.SmallStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activitydiagram Decision Node Send Offers1</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see activitydiagramTrace.Steps.StepsPackage#getActivitydiagram_DecisionNode_SendOffers1()
 * @model
 * @generated
 */
public interface Activitydiagram_DecisionNode_SendOffers1 extends Activitydiagram_MergeNode_Execute_AbstractSubStep, SpecificStep, SmallStep, Activitydiagram_InitialNode_Execute_AbstractSubStep, Activitydiagram_NamedElement_Execute_AbstractSubStep, Activitydiagram_JoinNode_Execute_AbstractSubStep, Activitydiagram_OpaqueAction_Execute_AbstractSubStep, Activitydiagram_DecisionNode_Execute_AbstractSubStep, Activitydiagram_ActivityFinalNode_Execute_AbstractSubStep, Activitydiagram_ActivityNode_Execute_AbstractSubStep, Activitydiagram_ForkNode_Execute_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (activitydiagramTrace.States.activitydiagram.TracedDecisionNode) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedDecisionNode getCaller();

} // Activitydiagram_DecisionNode_SendOffers1
