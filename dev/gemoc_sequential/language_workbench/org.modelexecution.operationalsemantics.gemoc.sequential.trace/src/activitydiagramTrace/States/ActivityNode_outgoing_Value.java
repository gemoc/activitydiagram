/**
 */
package activitydiagramTrace.States;

import activitydiagramTrace.States.activitydiagram.TracedActivityEdge;
import activitydiagramTrace.States.activitydiagram.TracedActivityNode;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Node outgoing Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.States.ActivityNode_outgoing_Value#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link activitydiagramTrace.States.ActivityNode_outgoing_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link activitydiagramTrace.States.ActivityNode_outgoing_Value#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.States.StatesPackage#getActivityNode_outgoing_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface ActivityNode_outgoing_Value extends EObject {
	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.activitydiagram.TracedActivityEdge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getActivityNode_outgoing_Value_Outgoing()
	 * @model
	 * @generated
	 */
	EList<TracedActivityEdge> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.activitydiagram.TracedActivityNode#getOutgoingSequence <em>Outgoing Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedActivityNode)
	 * @see activitydiagramTrace.States.StatesPackage#getActivityNode_outgoing_Value_Parent()
	 * @see activitydiagramTrace.States.activitydiagram.TracedActivityNode#getOutgoingSequence
	 * @model opposite="outgoingSequence" required="true" transient="false"
	 * @generated
	 */
	TracedActivityNode getParent();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.ActivityNode_outgoing_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedActivityNode value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.State#getActivityNode_outgoing_Values <em>Activity Node outgoing Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getActivityNode_outgoing_Value_States()
	 * @see activitydiagramTrace.States.State#getActivityNode_outgoing_Values
	 * @model opposite="activityNode_outgoing_Values" required="true"
	 * @generated
	 */
	EList<State> getStates();

} // ActivityNode_outgoing_Value
