/**
 */
package activitydiagramTrace.States;

import activitydiagramTrace.States.activitydiagram.TracedActivityNode;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace executed Nodes Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link activitydiagramTrace.States.Trace_executedNodes_Value#getExecutedNodes <em>Executed Nodes</em>}</li>
 * </ul>
 *
 * @see activitydiagramTrace.States.StatesPackage#getTrace_executedNodes_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface Trace_executedNodes_Value extends SpecificReferenceValue<TracedActivityNode> {
	/**
	 * Returns the value of the '<em><b>Executed Nodes</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.activitydiagram.TracedActivityNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executed Nodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executed Nodes</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getTrace_executedNodes_Value_ExecutedNodes()
	 * @model
	 * @generated
	 */
	EList<TracedActivityNode> getExecutedNodes();

} // Trace_executedNodes_Value
