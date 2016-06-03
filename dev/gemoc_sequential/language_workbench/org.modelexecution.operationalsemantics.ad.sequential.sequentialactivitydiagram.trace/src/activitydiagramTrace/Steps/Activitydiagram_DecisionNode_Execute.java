/**
 */
package activitydiagramTrace.Steps;

import activitydiagramTrace.States.activitydiagram.TracedDecisionNode;

import org.gemoc.executionframework.engine.mse.SequentialStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activitydiagram Decision Node Execute</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see activitydiagramTrace.Steps.StepsPackage#getActivitydiagram_DecisionNode_Execute()
 * @model
 * @generated
 */
public interface Activitydiagram_DecisionNode_Execute extends Activitydiagram_NamedElement_Execute_AbstractSubStep, SpecificStep, SequentialStep<Activitydiagram_DecisionNode_Execute_AbstractSubStep>, Activitydiagram_Activity_Execute_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (activitydiagramTrace.States.activitydiagram.TracedDecisionNode) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedDecisionNode getCaller();

} // Activitydiagram_DecisionNode_Execute
