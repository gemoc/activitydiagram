/**
 */
package activitydiagramTrace.States.activitydiagram;

import activitydiagram.ControlToken;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Control Token</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedControlToken#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedControlToken()
 * @model
 * @generated
 */
public interface TracedControlToken extends TracedToken {
	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(ControlToken)
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedControlToken_OriginalObject()
	 * @model
	 * @generated
	 */
	ControlToken getOriginalObject();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.activitydiagram.TracedControlToken#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(ControlToken value);

} // TracedControlToken
