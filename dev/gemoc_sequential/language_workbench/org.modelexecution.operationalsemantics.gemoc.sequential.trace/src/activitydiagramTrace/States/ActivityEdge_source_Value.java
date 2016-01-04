/**
 */
package activitydiagramTrace.States;

import activitydiagramTrace.States.activitydiagram.TracedActivityEdge;
import activitydiagramTrace.States.activitydiagram.TracedActivityNode;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Edge source Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.States.ActivityEdge_source_Value#getSource <em>Source</em>}</li>
 *   <li>{@link activitydiagramTrace.States.ActivityEdge_source_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link activitydiagramTrace.States.ActivityEdge_source_Value#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.States.StatesPackage#getActivityEdge_source_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface ActivityEdge_source_Value extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(TracedActivityNode)
	 * @see activitydiagramTrace.States.StatesPackage#getActivityEdge_source_Value_Source()
	 * @model required="true"
	 * @generated
	 */
	TracedActivityNode getSource();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.ActivityEdge_source_Value#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(TracedActivityNode value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.activitydiagram.TracedActivityEdge#getSourceSequence <em>Source Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedActivityEdge)
	 * @see activitydiagramTrace.States.StatesPackage#getActivityEdge_source_Value_Parent()
	 * @see activitydiagramTrace.States.activitydiagram.TracedActivityEdge#getSourceSequence
	 * @model opposite="sourceSequence" required="true" transient="false"
	 * @generated
	 */
	TracedActivityEdge getParent();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.ActivityEdge_source_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedActivityEdge value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.State#getActivityEdge_source_Values <em>Activity Edge source Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getActivityEdge_source_Value_States()
	 * @see activitydiagramTrace.States.State#getActivityEdge_source_Values
	 * @model opposite="activityEdge_source_Values" required="true"
	 * @generated
	 */
	EList<State> getStates();

} // ActivityEdge_source_Value
