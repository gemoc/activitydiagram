/**
 */
package activitydiagramTrace.States;

import activitydiagramTrace.States.activitydiagram.TracedBooleanBinaryExpression;
import activitydiagramTrace.States.activitydiagram.TracedBooleanVariable;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Binary Expression operand2 Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.States.BooleanBinaryExpression_operand2_Value#getOperand2 <em>Operand2</em>}</li>
 *   <li>{@link activitydiagramTrace.States.BooleanBinaryExpression_operand2_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link activitydiagramTrace.States.BooleanBinaryExpression_operand2_Value#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.States.StatesPackage#getBooleanBinaryExpression_operand2_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface BooleanBinaryExpression_operand2_Value extends EObject {
	/**
	 * Returns the value of the '<em><b>Operand2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand2</em>' reference.
	 * @see #setOperand2(TracedBooleanVariable)
	 * @see activitydiagramTrace.States.StatesPackage#getBooleanBinaryExpression_operand2_Value_Operand2()
	 * @model required="true"
	 * @generated
	 */
	TracedBooleanVariable getOperand2();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.BooleanBinaryExpression_operand2_Value#getOperand2 <em>Operand2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand2</em>' reference.
	 * @see #getOperand2()
	 * @generated
	 */
	void setOperand2(TracedBooleanVariable value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.activitydiagram.TracedBooleanBinaryExpression#getOperand2Sequence <em>Operand2 Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedBooleanBinaryExpression)
	 * @see activitydiagramTrace.States.StatesPackage#getBooleanBinaryExpression_operand2_Value_Parent()
	 * @see activitydiagramTrace.States.activitydiagram.TracedBooleanBinaryExpression#getOperand2Sequence
	 * @model opposite="operand2Sequence" required="true" transient="false"
	 * @generated
	 */
	TracedBooleanBinaryExpression getParent();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.BooleanBinaryExpression_operand2_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedBooleanBinaryExpression value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.State#getBooleanBinaryExpression_operand2_Values <em>Boolean Binary Expression operand2 Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getBooleanBinaryExpression_operand2_Value_States()
	 * @see activitydiagramTrace.States.State#getBooleanBinaryExpression_operand2_Values
	 * @model opposite="booleanBinaryExpression_operand2_Values" required="true"
	 * @generated
	 */
	EList<State> getStates();

} // BooleanBinaryExpression_operand2_Value
