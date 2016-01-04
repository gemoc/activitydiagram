/**
 */
package activitydiagramTrace.States;

import activitydiagramTrace.States.activitydiagram.TracedIntegerExpression;
import activitydiagramTrace.States.activitydiagram.TracedIntegerVariable;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Expression operand2 Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.States.IntegerExpression_operand2_Value#getOperand2 <em>Operand2</em>}</li>
 *   <li>{@link activitydiagramTrace.States.IntegerExpression_operand2_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link activitydiagramTrace.States.IntegerExpression_operand2_Value#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.States.StatesPackage#getIntegerExpression_operand2_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface IntegerExpression_operand2_Value extends EObject {
	/**
	 * Returns the value of the '<em><b>Operand2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand2</em>' reference.
	 * @see #setOperand2(TracedIntegerVariable)
	 * @see activitydiagramTrace.States.StatesPackage#getIntegerExpression_operand2_Value_Operand2()
	 * @model
	 * @generated
	 */
	TracedIntegerVariable getOperand2();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.IntegerExpression_operand2_Value#getOperand2 <em>Operand2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand2</em>' reference.
	 * @see #getOperand2()
	 * @generated
	 */
	void setOperand2(TracedIntegerVariable value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.activitydiagram.TracedIntegerExpression#getOperand2Sequence <em>Operand2 Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedIntegerExpression)
	 * @see activitydiagramTrace.States.StatesPackage#getIntegerExpression_operand2_Value_Parent()
	 * @see activitydiagramTrace.States.activitydiagram.TracedIntegerExpression#getOperand2Sequence
	 * @model opposite="operand2Sequence" required="true" transient="false"
	 * @generated
	 */
	TracedIntegerExpression getParent();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.IntegerExpression_operand2_Value#getParent <em>Parent</em>}' container reference.
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
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.State#getIntegerExpression_operand2_Values <em>Integer Expression operand2 Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getIntegerExpression_operand2_Value_States()
	 * @see activitydiagramTrace.States.State#getIntegerExpression_operand2_Values
	 * @model opposite="integerExpression_operand2_Values" required="true"
	 * @generated
	 */
	EList<State> getStates();

} // IntegerExpression_operand2_Value
