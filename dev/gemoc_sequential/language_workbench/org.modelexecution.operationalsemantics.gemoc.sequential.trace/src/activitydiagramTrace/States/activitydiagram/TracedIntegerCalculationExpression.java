/**
 */
package activitydiagramTrace.States.activitydiagram;

import activitydiagramTrace.States.IntegerCalculationExpression_assignee_Value;
import activitydiagramTrace.States.IntegerCalculationExpression_operator_Value;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Integer Calculation Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedIntegerCalculationExpression#getAssigneeSequence <em>Assignee Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedIntegerCalculationExpression#getOperatorSequence <em>Operator Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedIntegerCalculationExpression()
 * @model
 * @generated
 */
public interface TracedIntegerCalculationExpression extends TracedIntegerExpression {
	/**
	 * Returns the value of the '<em><b>Assignee Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.IntegerCalculationExpression_assignee_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.IntegerCalculationExpression_assignee_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignee Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignee Sequence</em>' containment reference list.
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedIntegerCalculationExpression_AssigneeSequence()
	 * @see activitydiagramTrace.States.IntegerCalculationExpression_assignee_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<IntegerCalculationExpression_assignee_Value> getAssigneeSequence();

	/**
	 * Returns the value of the '<em><b>Operator Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.IntegerCalculationExpression_operator_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.IntegerCalculationExpression_operator_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator Sequence</em>' containment reference list.
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedIntegerCalculationExpression_OperatorSequence()
	 * @see activitydiagramTrace.States.IntegerCalculationExpression_operator_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<IntegerCalculationExpression_operator_Value> getOperatorSequence();

} // TracedIntegerCalculationExpression
