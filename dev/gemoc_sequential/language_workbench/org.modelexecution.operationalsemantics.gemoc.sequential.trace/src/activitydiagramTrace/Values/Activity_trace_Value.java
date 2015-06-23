/**
 */
package activitydiagramTrace.Values;

import activitydiagramTrace.State;

import activitydiagramTrace.Traced.activitydiagram.TracedActivity;
import activitydiagramTrace.Traced.activitydiagram.TracedTrace;

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
 *   <li>{@link activitydiagramTrace.Values.Activity_trace_Value#getTrace <em>Trace</em>}</li>
 *   <li>{@link activitydiagramTrace.Values.Activity_trace_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link activitydiagramTrace.Values.Activity_trace_Value#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.Values.ValuesPackage#getActivity_trace_Value()
 * @model
 * @generated
 */
public interface Activity_trace_Value extends EObject {
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
	 * @see activitydiagramTrace.Values.ValuesPackage#getActivity_trace_Value_Trace()
	 * @model
	 * @generated
	 */
	TracedTrace getTrace();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.Values.Activity_trace_Value#getTrace <em>Trace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace</em>' reference.
	 * @see #getTrace()
	 * @generated
	 */
	void setTrace(TracedTrace value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.Traced.activitydiagram.TracedActivity#getTraceTrace <em>Trace Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedActivity)
	 * @see activitydiagramTrace.Values.ValuesPackage#getActivity_trace_Value_Parent()
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedActivity#getTraceTrace
	 * @model opposite="traceTrace" required="true" transient="false"
	 * @generated
	 */
	TracedActivity getParent();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.Values.Activity_trace_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedActivity value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.State}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.State#getActivity_trace_Values <em>Activity trace Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see activitydiagramTrace.Values.ValuesPackage#getActivity_trace_Value_States()
	 * @see activitydiagramTrace.State#getActivity_trace_Values
	 * @model opposite="activity_trace_Values" required="true"
	 * @generated
	 */
	EList<State> getStates();

} // Activity_trace_Value
