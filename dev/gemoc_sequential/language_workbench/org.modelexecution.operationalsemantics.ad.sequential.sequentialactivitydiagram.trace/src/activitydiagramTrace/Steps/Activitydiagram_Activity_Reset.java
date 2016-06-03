/**
 */
package activitydiagramTrace.Steps;

import activitydiagramTrace.States.activitydiagram.TracedActivity;

import org.gemoc.executionframework.engine.mse.SmallStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activitydiagram Activity Reset</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see activitydiagramTrace.Steps.StepsPackage#getActivitydiagram_Activity_Reset()
 * @model
 * @generated
 */
public interface Activitydiagram_Activity_Reset extends Activitydiagram_Activity_WriteTrace_AbstractSubStep, SpecificStep, SmallStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (activitydiagramTrace.States.activitydiagram.TracedActivity) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedActivity getCaller();

} // Activitydiagram_Activity_Reset
