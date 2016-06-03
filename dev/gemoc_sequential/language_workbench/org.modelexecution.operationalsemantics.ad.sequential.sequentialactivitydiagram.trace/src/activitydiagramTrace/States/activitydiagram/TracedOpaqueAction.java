/**
 */
package activitydiagramTrace.States.activitydiagram;

import activitydiagram.OpaqueAction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Opaque Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedOpaqueAction#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 *
 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedOpaqueAction()
 * @model
 * @generated
 */
public interface TracedOpaqueAction extends TracedAction {
	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(OpaqueAction)
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedOpaqueAction_OriginalObject()
	 * @model
	 * @generated
	 */
	OpaqueAction getOriginalObject();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.activitydiagram.TracedOpaqueAction#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(OpaqueAction value);

} // TracedOpaqueAction
