/**
 */
package activitydiagramTrace.States.activitydiagram;

import activitydiagramTrace.States.BooleanBinaryExpression_operand1_Value;
import activitydiagramTrace.States.BooleanBinaryExpression_operand2_Value;
import activitydiagramTrace.States.BooleanBinaryExpression_operator_Value;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Boolean Binary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedBooleanBinaryExpression#getOperand2Sequence <em>Operand2 Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedBooleanBinaryExpression#getOperatorSequence <em>Operator Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedBooleanBinaryExpression#getOperand1Sequence <em>Operand1 Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedBooleanBinaryExpression()
 * @model
 * @generated
 */
public interface TracedBooleanBinaryExpression extends TracedBooleanExpression {
	/**
	 * Returns the value of the '<em><b>Operand2 Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.BooleanBinaryExpression_operand2_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.BooleanBinaryExpression_operand2_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand2 Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand2 Sequence</em>' containment reference list.
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedBooleanBinaryExpression_Operand2Sequence()
	 * @see activitydiagramTrace.States.BooleanBinaryExpression_operand2_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<BooleanBinaryExpression_operand2_Value> getOperand2Sequence();

	/**
	 * Returns the value of the '<em><b>Operator Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.BooleanBinaryExpression_operator_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.BooleanBinaryExpression_operator_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator Sequence</em>' containment reference list.
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedBooleanBinaryExpression_OperatorSequence()
	 * @see activitydiagramTrace.States.BooleanBinaryExpression_operator_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<BooleanBinaryExpression_operator_Value> getOperatorSequence();

	/**
	 * Returns the value of the '<em><b>Operand1 Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.BooleanBinaryExpression_operand1_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.BooleanBinaryExpression_operand1_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand1 Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand1 Sequence</em>' containment reference list.
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedBooleanBinaryExpression_Operand1Sequence()
	 * @see activitydiagramTrace.States.BooleanBinaryExpression_operand1_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<BooleanBinaryExpression_operand1_Value> getOperand1Sequence();

} // TracedBooleanBinaryExpression
