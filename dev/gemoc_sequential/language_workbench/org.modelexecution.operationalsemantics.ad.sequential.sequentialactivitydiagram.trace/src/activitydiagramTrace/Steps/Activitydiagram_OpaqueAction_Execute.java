/**
 */
package activitydiagramTrace.Steps;

import activitydiagramTrace.States.activitydiagram.TracedOpaqueAction;

import org.gemoc.executionframework.engine.mse.SequentialStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activitydiagram Opaque Action Execute</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see activitydiagramTrace.Steps.StepsPackage#getActivitydiagram_OpaqueAction_Execute()
 * @model
 * @generated
 */
public interface Activitydiagram_OpaqueAction_Execute extends Activitydiagram_NamedElement_Execute_AbstractSubStep, SpecificStep, SequentialStep<Activitydiagram_OpaqueAction_Execute_AbstractSubStep>, Activitydiagram_Activity_Execute_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (activitydiagramTrace.States.activitydiagram.TracedOpaqueAction) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedOpaqueAction getCaller();

} // Activitydiagram_OpaqueAction_Execute
