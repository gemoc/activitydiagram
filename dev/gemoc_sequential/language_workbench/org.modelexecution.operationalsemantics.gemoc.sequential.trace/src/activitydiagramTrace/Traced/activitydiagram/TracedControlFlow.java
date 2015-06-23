/**
 */
package activitydiagramTrace.Traced.activitydiagram;

import activitydiagram.ControlFlow;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Control Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.Traced.activitydiagram.TracedControlFlow#getGuard <em>Guard</em>}</li>
 *   <li>{@link activitydiagramTrace.Traced.activitydiagram.TracedControlFlow#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage#getTracedControlFlow()
 * @model
 * @generated
 */
public interface TracedControlFlow extends TracedActivityEdge {
	/**
	 * Returns the value of the '<em><b>Guard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard</em>' reference.
	 * @see #setGuard(TracedBooleanVariable)
	 * @see activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage#getTracedControlFlow_Guard()
	 * @model
	 * @generated
	 */
	TracedBooleanVariable getGuard();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.Traced.activitydiagram.TracedControlFlow#getGuard <em>Guard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' reference.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(TracedBooleanVariable value);

	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(ControlFlow)
	 * @see activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage#getTracedControlFlow_OriginalObject()
	 * @model
	 * @generated
	 */
	ControlFlow getOriginalObject();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.Traced.activitydiagram.TracedControlFlow#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(ControlFlow value);

} // TracedControlFlow
