/**
 */
package activitydiagramTrace.Steps;

import activitydiagram.ActivityNode;

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
public interface Activitydiagram_ActivityNode_Terminate extends SmallStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (ActivityNode) this.getMse().getCaller();\n'"
	 * @generated
	 */
	ActivityNode getCaller();

} // Activitydiagram_ActivityNode_Terminate
