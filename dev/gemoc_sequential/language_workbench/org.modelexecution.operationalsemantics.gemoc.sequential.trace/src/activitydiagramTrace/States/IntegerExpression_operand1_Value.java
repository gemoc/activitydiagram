/**
 */
package activitydiagramTrace.States;

import activitydiagramTrace.States.activitydiagram.TracedIntegerExpression;
import activitydiagramTrace.States.activitydiagram.TracedIntegerVariable;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Expression operand1 Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.States.IntegerExpression_operand1_Value#getOperand1 <em>Operand1</em>}</li>
 *   <li>{@link activitydiagramTrace.States.IntegerExpression_operand1_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link activitydiagramTrace.States.IntegerExpression_operand1_Value#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.States.StatesPackage#getIntegerExpression_operand1_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface IntegerExpression_operand1_Value extends EObject {
	/**
	 * Returns the value of the '<em><b>Operand1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand1</em>' reference.
	 * @see #setOperand1(TracedIntegerVariable)
	 * @see activitydiagramTrace.States.StatesPackage#getIntegerExpression_operand1_Value_Operand1()
	 * @model
	 * @generated
	 */
	TracedIntegerVariable getOperand1();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.IntegerExpression_operand1_Value#getOperand1 <em>Operand1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand1</em>' reference.
	 * @see #getOperand1()
	 * @generated
	 */
	void setOperand1(TracedIntegerVariable value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.activitydiagram.TracedIntegerExpression#getOperand1Sequence <em>Operand1 Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedIntegerExpression)
	 * @see activitydiagramTrace.States.StatesPackage#getIntegerExpression_operand1_Value_Parent()
	 * @see activitydiagramTrace.States.activitydiagram.TracedIntegerExpression#getOperand1Sequence
	 * @model opposite="operand1Sequence" required="true" transient="false"
	 * @generated
	 */
	TracedIntegerExpression getParent();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.IntegerExpression_operand1_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedIntegerExpression value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.State#getIntegerExpression_operand1_Values <em>Integer Expression operand1 Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getIntegerExpression_operand1_Value_States()
	 * @see activitydiagramTrace.States.State#getIntegerExpression_operand1_Values
	 * @model opposite="integerExpression_operand1_Values" required="true"
	 * @generated
	 */
	EList<State> getStates();

} // IntegerExpression_operand1_Value
