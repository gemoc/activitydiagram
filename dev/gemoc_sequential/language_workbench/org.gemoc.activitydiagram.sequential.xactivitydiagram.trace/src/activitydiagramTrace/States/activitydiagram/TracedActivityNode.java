/**
 */
package activitydiagramTrace.States.activitydiagram;

import activitydiagramTrace.States.ActivityNode_heldTokens_Value;

import org.eclipse.emf.common.util.EList;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Activity Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedActivityNode#getHeldTokensSequence <em>Held Tokens Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedActivityNode#getOriginalObject_ActivityNode <em>Original Object Activity Node</em>}</li>
 * </ul>
 *
 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedActivityNode()
 * @model
 * @generated
 */
public interface TracedActivityNode extends TracedNamedElement {
	/**
	 * Returns the value of the '<em><b>Held Tokens Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.ActivityNode_heldTokens_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.ActivityNode_heldTokens_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Held Tokens Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Held Tokens Sequence</em>' containment reference list.
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedActivityNode_HeldTokensSequence()
	 * @see activitydiagramTrace.States.ActivityNode_heldTokens_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ActivityNode_heldTokens_Value> getHeldTokensSequence();

	/**
	 * Returns the value of the '<em><b>Original Object Activity Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object Activity Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object Activity Node</em>' reference.
	 * @see #setOriginalObject_ActivityNode(ActivityNode)
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedActivityNode_OriginalObject_ActivityNode()
	 * @model
	 * @generated
	 */
	ActivityNode getOriginalObject_ActivityNode();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.activitydiagram.TracedActivityNode#getOriginalObject_ActivityNode <em>Original Object Activity Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object Activity Node</em>' reference.
	 * @see #getOriginalObject_ActivityNode()
	 * @generated
	 */
	void setOriginalObject_ActivityNode(ActivityNode value);

} // TracedActivityNode
