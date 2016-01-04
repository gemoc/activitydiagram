/**
 */
package activitydiagramTrace.States;

import activitydiagramTrace.States.activitydiagram.TracedActivityEdge;
import activitydiagramTrace.States.activitydiagram.TracedActivityNode;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Node incoming Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.States.ActivityNode_incoming_Value#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link activitydiagramTrace.States.ActivityNode_incoming_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link activitydiagramTrace.States.ActivityNode_incoming_Value#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.States.StatesPackage#getActivityNode_incoming_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface ActivityNode_incoming_Value extends EObject {
	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.activitydiagram.TracedActivityEdge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getActivityNode_incoming_Value_Incoming()
	 * @model
	 * @generated
	 */
	EList<TracedActivityEdge> getIncoming();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.activitydiagram.TracedActivityNode#getIncomingSequence <em>Incoming Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedActivityNode)
	 * @see activitydiagramTrace.States.StatesPackage#getActivityNode_incoming_Value_Parent()
	 * @see activitydiagramTrace.States.activitydiagram.TracedActivityNode#getIncomingSequence
	 * @model opposite="incomingSequence" required="true" transient="false"
	 * @generated
	 */
	TracedActivityNode getParent();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.ActivityNode_incoming_Value#getParent <em>Parent</em>}' container reference.
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
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.State#getActivityNode_incoming_Values <em>Activity Node incoming Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getActivityNode_incoming_Value_States()
	 * @see activitydiagramTrace.States.State#getActivityNode_incoming_Values
	 * @model opposite="activityNode_incoming_Values" required="true"
	 * @generated
	 */
	EList<State> getStates();

} // ActivityNode_incoming_Value
