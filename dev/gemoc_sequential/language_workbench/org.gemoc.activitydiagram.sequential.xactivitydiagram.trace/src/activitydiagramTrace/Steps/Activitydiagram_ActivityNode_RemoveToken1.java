/**
 */
package activitydiagramTrace.Steps;

import activitydiagramTrace.States.activitydiagram.TracedActivityNode;

import fr.inria.diverse.trace.commons.model.trace.SmallStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activitydiagram Activity Node Remove Token1</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see activitydiagramTrace.Steps.StepsPackage#getActivitydiagram_ActivityNode_RemoveToken1()
 * @model
 * @generated
 */
public interface Activitydiagram_ActivityNode_RemoveToken1 extends Activitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStep, SpecificStep, SmallStep, Activitydiagram_ActivityNode_AddTokens1_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (activitydiagramTrace.States.activitydiagram.TracedActivityNode) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedActivityNode getCaller();

} // Activitydiagram_ActivityNode_RemoveToken1
