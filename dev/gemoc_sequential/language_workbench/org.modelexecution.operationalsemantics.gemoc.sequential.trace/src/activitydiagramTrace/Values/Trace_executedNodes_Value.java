/**
 */
package activitydiagramTrace.Values;

import activitydiagramTrace.State;

import activitydiagramTrace.Traced.activitydiagram.TracedActivityNode;
import activitydiagramTrace.Traced.activitydiagram.TracedTrace;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace executed Nodes Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.Values.Trace_executedNodes_Value#getExecutedNodes <em>Executed Nodes</em>}</li>
 *   <li>{@link activitydiagramTrace.Values.Trace_executedNodes_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link activitydiagramTrace.Values.Trace_executedNodes_Value#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.Values.ValuesPackage#getTrace_executedNodes_Value()
 * @model
 * @generated
 */
public interface Trace_executedNodes_Value extends EObject {
	/**
	 * Returns the value of the '<em><b>Executed Nodes</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.Traced.activitydiagram.TracedActivityNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executed Nodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executed Nodes</em>' reference list.
	 * @see activitydiagramTrace.Values.ValuesPackage#getTrace_executedNodes_Value_ExecutedNodes()
	 * @model
	 * @generated
	 */
	EList<TracedActivityNode> getExecutedNodes();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.Traced.activitydiagram.TracedTrace#getExecutedNodesTrace <em>Executed Nodes Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedTrace)
	 * @see activitydiagramTrace.Values.ValuesPackage#getTrace_executedNodes_Value_Parent()
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedTrace#getExecutedNodesTrace
	 * @model opposite="executedNodesTrace" required="true" transient="false"
	 * @generated
	 */
	TracedTrace getParent();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.Values.Trace_executedNodes_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedTrace value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.State}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.State#getTrace_executedNodes_Values <em>Trace executed Nodes Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see activitydiagramTrace.Values.ValuesPackage#getTrace_executedNodes_Value_States()
	 * @see activitydiagramTrace.State#getTrace_executedNodes_Values
	 * @model opposite="trace_executedNodes_Values" required="true"
	 * @generated
	 */
	EList<State> getStates();

} // Trace_executedNodes_Value
