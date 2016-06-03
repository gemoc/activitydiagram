/**
 */
package activitydiagramTrace.Steps;

import activitydiagramTrace.States.activitydiagram.TracedActivity;

import org.gemoc.executionframework.engine.mse.SequentialStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activitydiagram Activity Execute</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see activitydiagramTrace.Steps.StepsPackage#getActivitydiagram_Activity_Execute()
 * @model
 * @generated
 */
public interface Activitydiagram_Activity_Execute extends SpecificStep, SequentialStep<Activitydiagram_Activity_Execute_AbstractSubStep> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (activitydiagramTrace.States.activitydiagram.TracedActivity) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedActivity getCaller();

} // Activitydiagram_Activity_Execute
