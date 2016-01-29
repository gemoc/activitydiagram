/**
 */
package activitydiagramTrace.States.activitydiagram;

import activitydiagram.Activity;
import activitydiagram.Trace;

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
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedActivity#getEdges <em>Edges</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedActivity#getInputs <em>Inputs</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedActivity#getLocals <em>Locals</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedActivity#getNodes <em>Nodes</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedActivity#getOriginalObject <em>Original Object</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedActivity#getTrace <em>Trace</em>}</li>
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
	 * Returns the value of the '<em><b>Edges</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.activitydiagram.TracedActivityEdge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edges</em>' reference list.
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedActivity_Edges()
	 * @model
	 * @generated
	 */
	EList<TracedActivityEdge> getEdges();

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.activitydiagram.TracedVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' reference list.
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedActivity_Inputs()
	 * @model
	 * @generated
	 */
	EList<TracedVariable> getInputs();

	/**
	 * Returns the value of the '<em><b>Locals</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.activitydiagram.TracedVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locals</em>' reference list.
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedActivity_Locals()
	 * @model
	 * @generated
	 */
	EList<TracedVariable> getLocals();

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
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedActivity_Nodes()
	 * @model
	 * @generated
	 */
	EList<TracedActivityNode> getNodes();

	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(Activity)
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedActivity_OriginalObject()
	 * @model
	 * @generated
	 */
	Activity getOriginalObject();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.activitydiagram.TracedActivity#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(Activity value);

	/**
	 * Returns the value of the '<em><b>Trace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trace</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace</em>' reference.
	 * @see #setTrace(Trace)
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedActivity_Trace()
	 * @model
	 * @generated
	 */
	Trace getTrace();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.activitydiagram.TracedActivity#getTrace <em>Trace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace</em>' reference.
	 * @see #getTrace()
	 * @generated
	 */
	void setTrace(Trace value);

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
