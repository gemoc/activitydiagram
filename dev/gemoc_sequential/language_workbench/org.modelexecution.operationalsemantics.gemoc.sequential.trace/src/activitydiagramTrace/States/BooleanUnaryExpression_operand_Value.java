/**
 */
package activitydiagramTrace.States;

import activitydiagramTrace.States.activitydiagram.TracedBooleanUnaryExpression;
import activitydiagramTrace.States.activitydiagram.TracedBooleanVariable;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Unary Expression operand Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.States.BooleanUnaryExpression_operand_Value#getOperand <em>Operand</em>}</li>
 *   <li>{@link activitydiagramTrace.States.BooleanUnaryExpression_operand_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link activitydiagramTrace.States.BooleanUnaryExpression_operand_Value#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.States.StatesPackage#getBooleanUnaryExpression_operand_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface BooleanUnaryExpression_operand_Value extends EObject {
	/**
	 * Returns the value of the '<em><b>Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand</em>' reference.
	 * @see #setOperand(TracedBooleanVariable)
	 * @see activitydiagramTrace.States.StatesPackage#getBooleanUnaryExpression_operand_Value_Operand()
	 * @model required="true"
	 * @generated
	 */
	TracedBooleanVariable getOperand();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.BooleanUnaryExpression_operand_Value#getOperand <em>Operand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand</em>' reference.
	 * @see #getOperand()
	 * @generated
	 */
	void setOperand(TracedBooleanVariable value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.activitydiagram.TracedBooleanUnaryExpression#getOperandSequence <em>Operand Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedBooleanUnaryExpression)
	 * @see activitydiagramTrace.States.StatesPackage#getBooleanUnaryExpression_operand_Value_Parent()
	 * @see activitydiagramTrace.States.activitydiagram.TracedBooleanUnaryExpression#getOperandSequence
	 * @model opposite="operandSequence" required="true" transient="false"
	 * @generated
	 */
	TracedBooleanUnaryExpression getParent();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.BooleanUnaryExpression_operand_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedBooleanUnaryExpression value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.State#getBooleanUnaryExpression_operand_Values <em>Boolean Unary Expression operand Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getBooleanUnaryExpression_operand_Value_States()
	 * @see activitydiagramTrace.States.State#getBooleanUnaryExpression_operand_Values
	 * @model opposite="booleanUnaryExpression_operand_Values" required="true"
	 * @generated
	 */
	EList<State> getStates();

} // BooleanUnaryExpression_operand_Value
