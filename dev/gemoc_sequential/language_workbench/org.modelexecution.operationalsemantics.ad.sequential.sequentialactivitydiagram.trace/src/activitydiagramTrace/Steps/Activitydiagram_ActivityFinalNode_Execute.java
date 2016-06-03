/**
 */
package activitydiagramTrace.Steps;

import activitydiagramTrace.States.activitydiagram.TracedActivityFinalNode;

import org.gemoc.executionframework.engine.mse.SequentialStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activitydiagram Activity Final Node Execute</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see activitydiagramTrace.Steps.StepsPackage#getActivitydiagram_ActivityFinalNode_Execute()
 * @model
 * @generated
 */
public interface Activitydiagram_ActivityFinalNode_Execute extends Activitydiagram_NamedElement_Execute_AbstractSubStep, SpecificStep, SequentialStep<Activitydiagram_ActivityFinalNode_Execute_AbstractSubStep>, Activitydiagram_Activity_Execute_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (activitydiagramTrace.States.activitydiagram.TracedActivityFinalNode) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedActivityFinalNode getCaller();

} // Activitydiagram_ActivityFinalNode_Execute
