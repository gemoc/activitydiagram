/**
 */
package activitydiagramTrace.States.activitydiagram;

import activitydiagram.ActivityNode;
import activitydiagram.Trace;

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
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedTrace#getExecutedNodes <em>Executed Nodes</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedTrace#getExecutedNodesSequence <em>Executed Nodes Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedTrace#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedTrace()
 * @model
 * @generated
 */
public interface TracedTrace extends EObject {
	/**
	 * Returns the value of the '<em><b>Executed Nodes</b></em>' reference list.
	 * The list contents are of type {@link activitydiagram.ActivityNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executed Nodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executed Nodes</em>' reference list.
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedTrace_ExecutedNodes()
	 * @model
	 * @generated
	 */
	EList<ActivityNode> getExecutedNodes();

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

	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(Trace)
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedTrace_OriginalObject()
	 * @model
	 * @generated
	 */
	Trace getOriginalObject();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.activitydiagram.TracedTrace#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(Trace value);

} // TracedTrace
