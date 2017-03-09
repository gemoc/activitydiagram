/**
 */
package activitydiagramTrace.Steps;

import activitydiagramTrace.States.SpecificState;

import activitydiagramTrace.States.activitydiagram.TracedActivityNode;

import fr.inria.diverse.trace.commons.model.trace.SmallStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activitydiagram Activity Node Take Offerd Tokens1</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see activitydiagramTrace.Steps.StepsPackage#getActivitydiagram_ActivityNode_TakeOfferdTokens1()
 * @model
 * @generated
 */
public interface Activitydiagram_ActivityNode_TakeOfferdTokens1 extends SpecificStep, SmallStep<SpecificState>, Activitydiagram_Activity_Execute_AbstractSubStep, Activitydiagram_ActivityNode_Execute_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (activitydiagramTrace.States.activitydiagram.TracedActivityNode) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedActivityNode getCaller();

} // Activitydiagram_ActivityNode_TakeOfferdTokens1
