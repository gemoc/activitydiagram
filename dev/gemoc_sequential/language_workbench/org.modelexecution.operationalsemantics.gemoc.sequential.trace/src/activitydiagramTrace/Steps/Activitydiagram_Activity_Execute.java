/**
 */
package activitydiagramTrace.Steps;

import activitydiagram.Activity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activitydiagram Activity Execute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.Steps.Activitydiagram_Activity_Execute#getSubSteps <em>Sub Steps</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.Steps.StepsPackage#getActivitydiagram_Activity_Execute()
 * @model
 * @generated
 */
public interface Activitydiagram_Activity_Execute extends BigStep {
	/**
	 * Returns the value of the '<em><b>Sub Steps</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.Steps.Activitydiagram_Activity_Execute_AbstractSubStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Steps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Steps</em>' containment reference list.
	 * @see activitydiagramTrace.Steps.StepsPackage#getActivitydiagram_Activity_Execute_SubSteps()
	 * @model containment="true"
	 * @generated
	 */
	EList<Activitydiagram_Activity_Execute_AbstractSubStep> getSubSteps();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (Activity) this.getMse().getCaller();\r\n'"
	 * @generated
	 */
	Activity getCaller();

} // Activitydiagram_Activity_Execute
