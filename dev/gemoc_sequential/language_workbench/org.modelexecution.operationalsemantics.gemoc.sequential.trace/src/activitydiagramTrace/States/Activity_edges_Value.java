/**
 */
package activitydiagramTrace.States;

import activitydiagramTrace.States.activitydiagram.TracedActivity;
import activitydiagramTrace.States.activitydiagram.TracedActivityEdge;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity edges Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.States.Activity_edges_Value#getEdges <em>Edges</em>}</li>
 *   <li>{@link activitydiagramTrace.States.Activity_edges_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link activitydiagramTrace.States.Activity_edges_Value#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.States.StatesPackage#getActivity_edges_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface Activity_edges_Value extends EObject {
	/**
	 * Returns the value of the '<em><b>Edges</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.activitydiagram.TracedActivityEdge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edges</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getActivity_edges_Value_Edges()
	 * @model
	 * @generated
	 */
	EList<TracedActivityEdge> getEdges();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.activitydiagram.TracedActivity#getEdgesSequence <em>Edges Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedActivity)
	 * @see activitydiagramTrace.States.StatesPackage#getActivity_edges_Value_Parent()
	 * @see activitydiagramTrace.States.activitydiagram.TracedActivity#getEdgesSequence
	 * @model opposite="edgesSequence" required="true" transient="false"
	 * @generated
	 */
	TracedActivity getParent();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.Activity_edges_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedActivity value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.State#getActivity_edges_Values <em>Activity edges Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getActivity_edges_Value_States()
	 * @see activitydiagramTrace.States.State#getActivity_edges_Values
	 * @model opposite="activity_edges_Values" required="true"
	 * @generated
	 */
	EList<State> getStates();

} // Activity_edges_Value
