/**
 */
package activitydiagramTrace.Steps;

import activitydiagramTrace.States.activitydiagram.TracedInitialNode;

import org.gemoc.executionframework.engine.mse.SequentialStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activitydiagram Initial Node Execute</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see activitydiagramTrace.Steps.StepsPackage#getActivitydiagram_InitialNode_Execute()
 * @model
 * @generated
 */
public interface Activitydiagram_InitialNode_Execute extends SpecificStep, SequentialStep<Activitydiagram_InitialNode_Execute_AbstractSubStep>, Activitydiagram_NamedElement_Execute_AbstractSubStep, Activitydiagram_Activity_Execute_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (activitydiagramTrace.States.activitydiagram.TracedInitialNode) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedInitialNode getCaller();

} // Activitydiagram_InitialNode_Execute
