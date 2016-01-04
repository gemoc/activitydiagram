/**
 */
package activitydiagramTrace.States.activitydiagram;

import activitydiagramTrace.States.ActivityNode_activity_Value;
import activitydiagramTrace.States.ActivityNode_heldTokens_Value;
import activitydiagramTrace.States.ActivityNode_incoming_Value;
import activitydiagramTrace.States.ActivityNode_outgoing_Value;
import activitydiagramTrace.States.ActivityNode_running_Value;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Activity Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedActivityNode#getHeldTokensSequence <em>Held Tokens Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedActivityNode#getIncomingSequence <em>Incoming Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedActivityNode#getRunningSequence <em>Running Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedActivityNode#getActivitySequence <em>Activity Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedActivityNode#getOutgoingSequence <em>Outgoing Sequence</em>}</li>
 * </ul>
 * </p>
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

	/**
	 * Returns the value of the '<em><b>Incoming Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.ActivityNode_incoming_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.ActivityNode_incoming_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Sequence</em>' containment reference list.
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedActivityNode_IncomingSequence()
	 * @see activitydiagramTrace.States.ActivityNode_incoming_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ActivityNode_incoming_Value> getIncomingSequence();

	/**
	 * Returns the value of the '<em><b>Running Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.ActivityNode_running_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.ActivityNode_running_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Running Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Running Sequence</em>' containment reference list.
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedActivityNode_RunningSequence()
	 * @see activitydiagramTrace.States.ActivityNode_running_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ActivityNode_running_Value> getRunningSequence();

	/**
	 * Returns the value of the '<em><b>Activity Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.ActivityNode_activity_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.ActivityNode_activity_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Sequence</em>' containment reference list.
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedActivityNode_ActivitySequence()
	 * @see activitydiagramTrace.States.ActivityNode_activity_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ActivityNode_activity_Value> getActivitySequence();

	/**
	 * Returns the value of the '<em><b>Outgoing Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.ActivityNode_outgoing_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.ActivityNode_outgoing_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Sequence</em>' containment reference list.
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedActivityNode_OutgoingSequence()
	 * @see activitydiagramTrace.States.ActivityNode_outgoing_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ActivityNode_outgoing_Value> getOutgoingSequence();

} // TracedActivityNode
