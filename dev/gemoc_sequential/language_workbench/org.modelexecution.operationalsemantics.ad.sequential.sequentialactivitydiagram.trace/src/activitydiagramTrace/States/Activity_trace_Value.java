/**
 */
package activitydiagramTrace.States;

import activitydiagramTrace.States.activitydiagram.TracedActivity;
import activitydiagramTrace.States.activitydiagram.TracedTrace;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity trace Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.States.Activity_trace_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link activitydiagramTrace.States.Activity_trace_Value#getStates <em>States</em>}</li>
 *   <li>{@link activitydiagramTrace.States.Activity_trace_Value#getTrace <em>Trace</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.States.StatesPackage#getActivity_trace_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface Activity_trace_Value extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.activitydiagram.TracedActivity#getTraceSequence <em>Trace Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedActivity)
	 * @see activitydiagramTrace.States.StatesPackage#getActivity_trace_Value_Parent()
	 * @see activitydiagramTrace.States.activitydiagram.TracedActivity#getTraceSequence
	 * @model opposite="traceSequence" required="true" transient="false"
	 * @generated
	 */
	TracedActivity getParent();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.Activity_trace_Value#getParent <em>Parent</em>}' container reference.
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
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.State#getActivity_trace_Values <em>Activity trace Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getActivity_trace_Value_States()
	 * @see activitydiagramTrace.States.State#getActivity_trace_Values
	 * @model opposite="activity_trace_Values" required="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Trace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trace</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace</em>' reference.
	 * @see #setTrace(TracedTrace)
	 * @see activitydiagramTrace.States.StatesPackage#getActivity_trace_Value_Trace()
	 * @model
	 * @generated
	 */
	TracedTrace getTrace();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.Activity_trace_Value#getTrace <em>Trace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace</em>' reference.
	 * @see #getTrace()
	 * @generated
	 */
	void setTrace(TracedTrace value);

} // Activity_trace_Value
