/**
 */
package activitydiagramTrace.States.activitydiagram;

import activitydiagramTrace.States.BooleanUnaryExpression_operand_Value;
import activitydiagramTrace.States.BooleanUnaryExpression_operator_Value;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Boolean Unary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedBooleanUnaryExpression#getOperatorSequence <em>Operator Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedBooleanUnaryExpression#getOperandSequence <em>Operand Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedBooleanUnaryExpression()
 * @model
 * @generated
 */
public interface TracedBooleanUnaryExpression extends TracedBooleanExpression {
	/**
	 * Returns the value of the '<em><b>Operator Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.BooleanUnaryExpression_operator_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.BooleanUnaryExpression_operator_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator Sequence</em>' containment reference list.
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedBooleanUnaryExpression_OperatorSequence()
	 * @see activitydiagramTrace.States.BooleanUnaryExpression_operator_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<BooleanUnaryExpression_operator_Value> getOperatorSequence();

	/**
	 * Returns the value of the '<em><b>Operand Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.BooleanUnaryExpression_operand_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.BooleanUnaryExpression_operand_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand Sequence</em>' containment reference list.
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedBooleanUnaryExpression_OperandSequence()
	 * @see activitydiagramTrace.States.BooleanUnaryExpression_operand_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<BooleanUnaryExpression_operand_Value> getOperandSequence();

} // TracedBooleanUnaryExpression
