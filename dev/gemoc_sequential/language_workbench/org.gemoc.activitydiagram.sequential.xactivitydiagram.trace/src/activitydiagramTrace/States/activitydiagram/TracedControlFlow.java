/**
 */
package activitydiagramTrace.States.activitydiagram;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlFlow;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Control Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedControlFlow#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 *
 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedControlFlow()
 * @model
 * @generated
 */
public interface TracedControlFlow extends TracedActivityEdge {
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
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedControlFlow_OriginalObject()
	 * @model
	 * @generated
	 */
	ControlFlow getOriginalObject();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.activitydiagram.TracedControlFlow#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(ControlFlow value);

} // TracedControlFlow
