/**
 */
package activitydiagramTrace.Steps;

import activitydiagramTrace.States.activitydiagram.TracedDecisionNode;

import fr.inria.diverse.trace.commons.model.trace.SmallStep;

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
public interface Activitydiagram_DecisionNode_SendOffers1 extends Activitydiagram_Activity_Execute_AbstractSubStep, Activitydiagram_ActivityNode_Execute_AbstractSubStep, SpecificStep, SmallStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (activitydiagramTrace.States.activitydiagram.TracedDecisionNode) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedDecisionNode getCaller();

} // Activitydiagram_DecisionNode_SendOffers1
