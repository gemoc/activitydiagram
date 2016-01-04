/**
 */
package activitydiagramTrace.States;

import activitydiagramTrace.States.activitydiagram.TracedBooleanExpression;
import activitydiagramTrace.States.activitydiagram.TracedBooleanVariable;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Expression assignee Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.States.BooleanExpression_assignee_Value#getAssignee <em>Assignee</em>}</li>
 *   <li>{@link activitydiagramTrace.States.BooleanExpression_assignee_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link activitydiagramTrace.States.BooleanExpression_assignee_Value#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.States.StatesPackage#getBooleanExpression_assignee_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface BooleanExpression_assignee_Value extends EObject {
	/**
	 * Returns the value of the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignee</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignee</em>' reference.
	 * @see #setAssignee(TracedBooleanVariable)
	 * @see activitydiagramTrace.States.StatesPackage#getBooleanExpression_assignee_Value_Assignee()
	 * @model required="true"
	 * @generated
	 */
	TracedBooleanVariable getAssignee();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.BooleanExpression_assignee_Value#getAssignee <em>Assignee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assignee</em>' reference.
	 * @see #getAssignee()
	 * @generated
	 */
	void setAssignee(TracedBooleanVariable value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.activitydiagram.TracedBooleanExpression#getAssigneeSequence <em>Assignee Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedBooleanExpression)
	 * @see activitydiagramTrace.States.StatesPackage#getBooleanExpression_assignee_Value_Parent()
	 * @see activitydiagramTrace.States.activitydiagram.TracedBooleanExpression#getAssigneeSequence
	 * @model opposite="assigneeSequence" required="true" transient="false"
	 * @generated
	 */
	TracedBooleanExpression getParent();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.BooleanExpression_assignee_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedBooleanExpression value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.State#getBooleanExpression_assignee_Values <em>Boolean Expression assignee Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getBooleanExpression_assignee_Value_States()
	 * @see activitydiagramTrace.States.State#getBooleanExpression_assignee_Values
	 * @model opposite="booleanExpression_assignee_Values" required="true"
	 * @generated
	 */
	EList<State> getStates();

} // BooleanExpression_assignee_Value
