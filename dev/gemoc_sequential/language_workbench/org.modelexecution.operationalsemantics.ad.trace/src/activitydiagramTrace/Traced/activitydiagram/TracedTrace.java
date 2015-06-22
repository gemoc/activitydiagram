/**
 */
package activitydiagramTrace.Traced.activitydiagram;

import activitydiagramTrace.Values.Trace_executedNodes_Value;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.Traced.activitydiagram.TracedTrace#getExecutedNodesTrace <em>Executed Nodes Trace</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage#getTracedTrace()
 * @model
 * @generated
 */
public interface TracedTrace extends EObject {
	/**
	 * Returns the value of the '<em><b>Executed Nodes Trace</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.Values.Trace_executedNodes_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.Values.Trace_executedNodes_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executed Nodes Trace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executed Nodes Trace</em>' containment reference list.
	 * @see activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage#getTracedTrace_ExecutedNodesTrace()
	 * @see activitydiagramTrace.Values.Trace_executedNodes_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Trace_executedNodes_Value> getExecutedNodesTrace();

} // TracedTrace
