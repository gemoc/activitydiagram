/**
 */
package activitydiagramTrace.States.activitydiagram;

import activitydiagramTrace.States.ActivityNode_heldTokens_Value;

import org.eclipse.emf.common.util.EList;

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
 * </ul>
 *
 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedActivityNode()
 * @model abstract="true"
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

} // TracedActivityNode
