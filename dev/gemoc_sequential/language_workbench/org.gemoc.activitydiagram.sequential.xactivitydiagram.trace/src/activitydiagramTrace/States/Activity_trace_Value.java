/**
 */
package activitydiagramTrace.States;

import activitydiagramTrace.States.activitydiagram.TracedTrace;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity trace Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link activitydiagramTrace.States.Activity_trace_Value#getTrace <em>Trace</em>}</li>
 * </ul>
 *
 * @see activitydiagramTrace.States.StatesPackage#getActivity_trace_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface Activity_trace_Value extends SpecificReferenceValue<TracedTrace> {
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
