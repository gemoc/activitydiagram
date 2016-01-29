/**
 */
package activitydiagramTrace.States.activitydiagram;

import activitydiagram.BooleanVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Boolean Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedBooleanVariable#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedBooleanVariable()
 * @model
 * @generated
 */
public interface TracedBooleanVariable extends TracedVariable {
	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(BooleanVariable)
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedBooleanVariable_OriginalObject()
	 * @model
	 * @generated
	 */
	BooleanVariable getOriginalObject();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.activitydiagram.TracedBooleanVariable#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(BooleanVariable value);

} // TracedBooleanVariable
