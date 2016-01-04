/**
 */
package activitydiagramTrace.States.activitydiagram;

import activitydiagramTrace.States.IntegerComparisonExpression_assignee_Value;
import activitydiagramTrace.States.IntegerComparisonExpression_operator_Value;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Integer Comparison Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedIntegerComparisonExpression#getAssigneeSequence <em>Assignee Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedIntegerComparisonExpression#getOperatorSequence <em>Operator Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedIntegerComparisonExpression()
 * @model
 * @generated
 */
public interface TracedIntegerComparisonExpression extends TracedIntegerExpression {
	/**
	 * Returns the value of the '<em><b>Assignee Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.IntegerComparisonExpression_assignee_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.IntegerComparisonExpression_assignee_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignee Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignee Sequence</em>' containment reference list.
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedIntegerComparisonExpression_AssigneeSequence()
	 * @see activitydiagramTrace.States.IntegerComparisonExpression_assignee_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<IntegerComparisonExpression_assignee_Value> getAssigneeSequence();

	/**
	 * Returns the value of the '<em><b>Operator Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.IntegerComparisonExpression_operator_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.IntegerComparisonExpression_operator_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator Sequence</em>' containment reference list.
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedIntegerComparisonExpression_OperatorSequence()
	 * @see activitydiagramTrace.States.IntegerComparisonExpression_operator_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<IntegerComparisonExpression_operator_Value> getOperatorSequence();

} // TracedIntegerComparisonExpression
