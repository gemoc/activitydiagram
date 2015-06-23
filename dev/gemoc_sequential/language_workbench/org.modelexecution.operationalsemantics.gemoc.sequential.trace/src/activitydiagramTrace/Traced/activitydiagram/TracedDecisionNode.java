/**
 */
package activitydiagramTrace.Traced.activitydiagram;

import activitydiagram.DecisionNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Decision Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.Traced.activitydiagram.TracedDecisionNode#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage#getTracedDecisionNode()
 * @model
 * @generated
 */
public interface TracedDecisionNode extends TracedControlNode {
	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(DecisionNode)
	 * @see activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage#getTracedDecisionNode_OriginalObject()
	 * @model
	 * @generated
	 */
	DecisionNode getOriginalObject();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.Traced.activitydiagram.TracedDecisionNode#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(DecisionNode value);

} // TracedDecisionNode
