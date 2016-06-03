/**
 */
package activitydiagramTrace.Steps;

import activitydiagramTrace.States.activitydiagram.TracedMergeNode;

import org.gemoc.executionframework.engine.mse.SequentialStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activitydiagram Merge Node Execute</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see activitydiagramTrace.Steps.StepsPackage#getActivitydiagram_MergeNode_Execute()
 * @model
 * @generated
 */
public interface Activitydiagram_MergeNode_Execute extends SpecificStep, SequentialStep<Activitydiagram_MergeNode_Execute_AbstractSubStep>, Activitydiagram_NamedElement_Execute_AbstractSubStep, Activitydiagram_Activity_Execute_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (activitydiagramTrace.States.activitydiagram.TracedMergeNode) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedMergeNode getCaller();

} // Activitydiagram_MergeNode_Execute
