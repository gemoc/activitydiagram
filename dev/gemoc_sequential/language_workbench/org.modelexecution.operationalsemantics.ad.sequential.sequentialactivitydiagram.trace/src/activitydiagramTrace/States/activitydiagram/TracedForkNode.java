/**
 */
package activitydiagramTrace.States.activitydiagram;

import activitydiagram.ForkNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Fork Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedForkNode#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 *
 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedForkNode()
 * @model
 * @generated
 */
public interface TracedForkNode extends TracedControlNode {
	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(ForkNode)
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedForkNode_OriginalObject()
	 * @model
	 * @generated
	 */
	ForkNode getOriginalObject();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.activitydiagram.TracedForkNode#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(ForkNode value);

} // TracedForkNode
