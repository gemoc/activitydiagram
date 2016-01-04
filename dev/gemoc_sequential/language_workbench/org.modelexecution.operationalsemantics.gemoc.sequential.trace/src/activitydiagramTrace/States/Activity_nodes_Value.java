/**
 */
package activitydiagramTrace.States;

import activitydiagramTrace.States.activitydiagram.TracedActivity;
import activitydiagramTrace.States.activitydiagram.TracedActivityNode;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity nodes Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.States.Activity_nodes_Value#getNodes <em>Nodes</em>}</li>
 *   <li>{@link activitydiagramTrace.States.Activity_nodes_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link activitydiagramTrace.States.Activity_nodes_Value#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.States.StatesPackage#getActivity_nodes_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface Activity_nodes_Value extends EObject {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.activitydiagram.TracedActivityNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getActivity_nodes_Value_Nodes()
	 * @model
	 * @generated
	 */
	EList<TracedActivityNode> getNodes();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.activitydiagram.TracedActivity#getNodesSequence <em>Nodes Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedActivity)
	 * @see activitydiagramTrace.States.StatesPackage#getActivity_nodes_Value_Parent()
	 * @see activitydiagramTrace.States.activitydiagram.TracedActivity#getNodesSequence
	 * @model opposite="nodesSequence" required="true" transient="false"
	 * @generated
	 */
	TracedActivity getParent();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.Activity_nodes_Value#getParent <em>Parent</em>}' container reference.
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
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.State#getActivity_nodes_Values <em>Activity nodes Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getActivity_nodes_Value_States()
	 * @see activitydiagramTrace.States.State#getActivity_nodes_Values
	 * @model opposite="activity_nodes_Values" required="true"
	 * @generated
	 */
	EList<State> getStates();

} // Activity_nodes_Value
