/**
 */
package activitydiagramTrace.Steps;

import activitydiagram.Activity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activitydiagram Activity Write Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.Steps.Activitydiagram_Activity_WriteTrace#getThis <em>This</em>}</li>
 *   <li>{@link activitydiagramTrace.Steps.Activitydiagram_Activity_WriteTrace#getSubSteps <em>Sub Steps</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.Steps.StepsPackage#getActivitydiagram_Activity_WriteTrace()
 * @model
 * @generated
 */
public interface Activitydiagram_Activity_WriteTrace extends BigStep {
	/**
	 * Returns the value of the '<em><b>This</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>This</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>This</em>' reference.
	 * @see #setThis(Activity)
	 * @see activitydiagramTrace.Steps.StepsPackage#getActivitydiagram_Activity_WriteTrace_This()
	 * @model
	 * @generated
	 */
	Activity getThis();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.Steps.Activitydiagram_Activity_WriteTrace#getThis <em>This</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>This</em>' reference.
	 * @see #getThis()
	 * @generated
	 */
	void setThis(Activity value);

	/**
	 * Returns the value of the '<em><b>Sub Steps</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.Steps.Activitydiagram_Activity_WriteTrace_AbstractSubStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Steps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Steps</em>' containment reference list.
	 * @see activitydiagramTrace.Steps.StepsPackage#getActivitydiagram_Activity_WriteTrace_SubSteps()
	 * @model containment="true"
	 * @generated
	 */
	EList<Activitydiagram_Activity_WriteTrace_AbstractSubStep> getSubSteps();

} // Activitydiagram_Activity_WriteTrace
