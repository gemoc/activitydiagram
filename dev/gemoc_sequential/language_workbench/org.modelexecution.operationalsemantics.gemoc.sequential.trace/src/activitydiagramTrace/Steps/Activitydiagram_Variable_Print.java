/**
 */
package activitydiagramTrace.Steps;

import activitydiagramTrace.Traced.activitydiagram.TracedVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activitydiagram Variable Print</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.Steps.Activitydiagram_Variable_Print#getThis <em>This</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.Steps.StepsPackage#getActivitydiagram_Variable_Print()
 * @model
 * @generated
 */
public interface Activitydiagram_Variable_Print extends SmallStep {
	/**
	 * Returns the value of the '<em><b>This</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>This</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>This</em>' reference.
	 * @see #setThis(TracedVariable)
	 * @see activitydiagramTrace.Steps.StepsPackage#getActivitydiagram_Variable_Print_This()
	 * @model
	 * @generated
	 */
	TracedVariable getThis();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.Steps.Activitydiagram_Variable_Print#getThis <em>This</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>This</em>' reference.
	 * @see #getThis()
	 * @generated
	 */
	void setThis(TracedVariable value);

} // Activitydiagram_Variable_Print
