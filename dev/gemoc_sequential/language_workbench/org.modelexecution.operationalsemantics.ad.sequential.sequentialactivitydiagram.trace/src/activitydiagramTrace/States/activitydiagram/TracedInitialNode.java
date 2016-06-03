/**
 */
package activitydiagramTrace.States.activitydiagram;

import activitydiagram.InitialNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Initial Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedInitialNode#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 *
 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedInitialNode()
 * @model
 * @generated
 */
public interface TracedInitialNode extends TracedControlNode {
	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(InitialNode)
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedInitialNode_OriginalObject()
	 * @model
	 * @generated
	 */
	InitialNode getOriginalObject();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.activitydiagram.TracedInitialNode#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(InitialNode value);

} // TracedInitialNode
