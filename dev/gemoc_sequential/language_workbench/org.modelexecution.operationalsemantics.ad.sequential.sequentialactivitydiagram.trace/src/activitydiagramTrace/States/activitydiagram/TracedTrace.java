/**
 */
package activitydiagramTrace.States.activitydiagram;

import activitydiagramTrace.States.Trace_executedNodes_Value;

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
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedTrace#getExecutedNodesSequence <em>Executed Nodes Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedTrace()
 * @model
 * @generated
 */
public interface TracedTrace extends EObject {
	/**
	 * Returns the value of the '<em><b>Executed Nodes Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.Trace_executedNodes_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.Trace_executedNodes_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executed Nodes Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executed Nodes Sequence</em>' containment reference list.
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedTrace_ExecutedNodesSequence()
	 * @see activitydiagramTrace.States.Trace_executedNodes_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Trace_executedNodes_Value> getExecutedNodesSequence();

} // TracedTrace
