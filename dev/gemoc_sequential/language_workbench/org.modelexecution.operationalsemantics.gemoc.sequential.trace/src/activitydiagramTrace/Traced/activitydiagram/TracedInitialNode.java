/**
 */
package activitydiagramTrace.Traced.activitydiagram;

import activitydiagram.InitialNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Initial Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.Traced.activitydiagram.TracedInitialNode#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage#getTracedInitialNode()
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
	 * @see activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage#getTracedInitialNode_OriginalObject()
	 * @model
	 * @generated
	 */
	InitialNode getOriginalObject();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.Traced.activitydiagram.TracedInitialNode#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(InitialNode value);

} // TracedInitialNode
