/**
 */
package activitydiagramTrace.States;

import activitydiagramTrace.States.activitydiagram.TracedActivity;
import activitydiagramTrace.States.activitydiagram.TracedActivityNode;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Node activity Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.States.ActivityNode_activity_Value#getActivity <em>Activity</em>}</li>
 *   <li>{@link activitydiagramTrace.States.ActivityNode_activity_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link activitydiagramTrace.States.ActivityNode_activity_Value#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.States.StatesPackage#getActivityNode_activity_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface ActivityNode_activity_Value extends EObject {
	/**
	 * Returns the value of the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' reference.
	 * @see #setActivity(TracedActivity)
	 * @see activitydiagramTrace.States.StatesPackage#getActivityNode_activity_Value_Activity()
	 * @model required="true"
	 * @generated
	 */
	TracedActivity getActivity();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.ActivityNode_activity_Value#getActivity <em>Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(TracedActivity value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.activitydiagram.TracedActivityNode#getActivitySequence <em>Activity Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedActivityNode)
	 * @see activitydiagramTrace.States.StatesPackage#getActivityNode_activity_Value_Parent()
	 * @see activitydiagramTrace.States.activitydiagram.TracedActivityNode#getActivitySequence
	 * @model opposite="activitySequence" required="true" transient="false"
	 * @generated
	 */
	TracedActivityNode getParent();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.ActivityNode_activity_Value#getParent <em>Parent</em>}' container reference.
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
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.State#getActivityNode_activity_Values <em>Activity Node activity Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getActivityNode_activity_Value_States()
	 * @see activitydiagramTrace.States.State#getActivityNode_activity_Values
	 * @model opposite="activityNode_activity_Values" required="true"
	 * @generated
	 */
	EList<State> getStates();

} // ActivityNode_activity_Value
