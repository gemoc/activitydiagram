/**
 */
package activitydiagramTrace.States.activitydiagram;

import activitydiagramTrace.States.Activity_edges_Value;
import activitydiagramTrace.States.Activity_inputs_Value;
import activitydiagramTrace.States.Activity_locals_Value;
import activitydiagramTrace.States.Activity_nodes_Value;
import activitydiagramTrace.States.Activity_trace_Value;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedActivity#getLocalsSequence <em>Locals Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedActivity#getEdgesSequence <em>Edges Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedActivity#getInputsSequence <em>Inputs Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedActivity#getNodesSequence <em>Nodes Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedActivity#getTraceSequence <em>Trace Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedActivity()
 * @model
 * @generated
 */
public interface TracedActivity extends TracedNamedElement {
	/**
	 * Returns the value of the '<em><b>Locals Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.Activity_locals_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.Activity_locals_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locals Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locals Sequence</em>' containment reference list.
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedActivity_LocalsSequence()
	 * @see activitydiagramTrace.States.Activity_locals_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Activity_locals_Value> getLocalsSequence();

	/**
	 * Returns the value of the '<em><b>Edges Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.Activity_edges_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.Activity_edges_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edges Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edges Sequence</em>' containment reference list.
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedActivity_EdgesSequence()
	 * @see activitydiagramTrace.States.Activity_edges_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Activity_edges_Value> getEdgesSequence();

	/**
	 * Returns the value of the '<em><b>Inputs Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.Activity_inputs_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.Activity_inputs_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs Sequence</em>' containment reference list.
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedActivity_InputsSequence()
	 * @see activitydiagramTrace.States.Activity_inputs_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Activity_inputs_Value> getInputsSequence();

	/**
	 * Returns the value of the '<em><b>Nodes Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.Activity_nodes_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.Activity_nodes_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes Sequence</em>' containment reference list.
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedActivity_NodesSequence()
	 * @see activitydiagramTrace.States.Activity_nodes_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Activity_nodes_Value> getNodesSequence();

	/**
	 * Returns the value of the '<em><b>Trace Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.Activity_trace_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.Activity_trace_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trace Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace Sequence</em>' containment reference list.
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedActivity_TraceSequence()
	 * @see activitydiagramTrace.States.Activity_trace_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Activity_trace_Value> getTraceSequence();

} // TracedActivity
