/**
 */
package activitydiagramTrace.Steps;

import activitydiagram.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activitydiagram Variable Execute</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see activitydiagramTrace.Steps.StepsPackage#getActivitydiagram_Variable_Execute()
 * @model
 * @generated
 */
public interface Activitydiagram_Variable_Execute extends SmallStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (Variable) this.getMse().getCaller();\r\n'"
	 * @generated
	 */
	Variable getCaller();

} // Activitydiagram_Variable_Execute
