/**
 */
package activitydiagramTrace.Steps;

import activitydiagramTrace.States.activitydiagram.TracedJoinNode;

import org.gemoc.executionframework.engine.mse.SequentialStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activitydiagram Join Node Execute</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see activitydiagramTrace.Steps.StepsPackage#getActivitydiagram_JoinNode_Execute()
 * @model
 * @generated
 */
public interface Activitydiagram_JoinNode_Execute extends Activitydiagram_NamedElement_Execute_AbstractSubStep, SpecificStep, SequentialStep<Activitydiagram_JoinNode_Execute_AbstractSubStep>, Activitydiagram_Activity_Execute_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (activitydiagramTrace.States.activitydiagram.TracedJoinNode) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedJoinNode getCaller();

} // Activitydiagram_JoinNode_Execute
