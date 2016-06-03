/**
 */
package activitydiagramTrace.Steps;

import activitydiagramTrace.States.activitydiagram.TracedActivityNode;

import org.gemoc.executionframework.engine.mse.SmallStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activitydiagram Activity Node Terminate</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see activitydiagramTrace.Steps.StepsPackage#getActivitydiagram_ActivityNode_Terminate()
 * @model
 * @generated
 */
public interface Activitydiagram_ActivityNode_Terminate extends SpecificStep, SmallStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (activitydiagramTrace.States.activitydiagram.TracedActivityNode) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedActivityNode getCaller();

} // Activitydiagram_ActivityNode_Terminate
