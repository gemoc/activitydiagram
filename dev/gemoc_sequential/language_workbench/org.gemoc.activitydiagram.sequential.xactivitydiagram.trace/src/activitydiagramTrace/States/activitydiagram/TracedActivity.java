/**
 */
package activitydiagramTrace.States.activitydiagram;

import activitydiagramTrace.States.Activity_trace_Value;

import org.eclipse.emf.common.util.EList;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Activity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedActivity#getOriginalObject <em>Original Object</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedActivity#getTraceSequence <em>Trace Sequence</em>}</li>
 * </ul>
 *
 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedActivity()
 * @model
 * @generated
 */
public interface TracedActivity extends TracedNamedElement {
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
