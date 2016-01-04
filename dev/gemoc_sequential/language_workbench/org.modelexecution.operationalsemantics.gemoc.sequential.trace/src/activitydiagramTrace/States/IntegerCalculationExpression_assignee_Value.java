/**
 */
package activitydiagramTrace.States;

import activitydiagramTrace.States.activitydiagram.TracedIntegerCalculationExpression;
import activitydiagramTrace.States.activitydiagram.TracedIntegerVariable;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Calculation Expression assignee Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.States.IntegerCalculationExpression_assignee_Value#getAssignee <em>Assignee</em>}</li>
 *   <li>{@link activitydiagramTrace.States.IntegerCalculationExpression_assignee_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link activitydiagramTrace.States.IntegerCalculationExpression_assignee_Value#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.States.StatesPackage#getIntegerCalculationExpression_assignee_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface IntegerCalculationExpression_assignee_Value extends EObject {
	/**
	 * Returns the value of the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignee</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignee</em>' reference.
	 * @see #setAssignee(TracedIntegerVariable)
	 * @see activitydiagramTrace.States.StatesPackage#getIntegerCalculationExpression_assignee_Value_Assignee()
	 * @model required="true"
	 * @generated
	 */
	TracedIntegerVariable getAssignee();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.IntegerCalculationExpression_assignee_Value#getAssignee <em>Assignee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assignee</em>' reference.
	 * @see #getAssignee()
	 * @generated
	 */
	void setAssignee(TracedIntegerVariable value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.activitydiagram.TracedIntegerCalculationExpression#getAssigneeSequence <em>Assignee Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedIntegerCalculationExpression)
	 * @see activitydiagramTrace.States.StatesPackage#getIntegerCalculationExpression_assignee_Value_Parent()
	 * @see activitydiagramTrace.States.activitydiagram.TracedIntegerCalculationExpression#getAssigneeSequence
	 * @model opposite="assigneeSequence" required="true" transient="false"
	 * @generated
	 */
	TracedIntegerCalculationExpression getParent();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.IntegerCalculationExpression_assignee_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedIntegerCalculationExpression value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.State#getIntegerCalculationExpression_assignee_Values <em>Integer Calculation Expression assignee Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getIntegerCalculationExpression_assignee_Value_States()
	 * @see activitydiagramTrace.States.State#getIntegerCalculationExpression_assignee_Values
	 * @model opposite="integerCalculationExpression_assignee_Values" required="true"
	 * @generated
	 */
	EList<State> getStates();

} // IntegerCalculationExpression_assignee_Value
