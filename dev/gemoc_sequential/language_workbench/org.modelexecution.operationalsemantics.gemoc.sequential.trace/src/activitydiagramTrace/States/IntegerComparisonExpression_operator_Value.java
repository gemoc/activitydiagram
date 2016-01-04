/**
 */
package activitydiagramTrace.States;

import activitydiagram.IntegerComparisonOperator;

import activitydiagramTrace.States.activitydiagram.TracedIntegerComparisonExpression;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Comparison Expression operator Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.States.IntegerComparisonExpression_operator_Value#getOperator <em>Operator</em>}</li>
 *   <li>{@link activitydiagramTrace.States.IntegerComparisonExpression_operator_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link activitydiagramTrace.States.IntegerComparisonExpression_operator_Value#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.States.StatesPackage#getIntegerComparisonExpression_operator_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface IntegerComparisonExpression_operator_Value extends EObject {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link activitydiagram.IntegerComparisonOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see activitydiagram.IntegerComparisonOperator
	 * @see #setOperator(IntegerComparisonOperator)
	 * @see activitydiagramTrace.States.StatesPackage#getIntegerComparisonExpression_operator_Value_Operator()
	 * @model required="true"
	 * @generated
	 */
	IntegerComparisonOperator getOperator();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.IntegerComparisonExpression_operator_Value#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see activitydiagram.IntegerComparisonOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(IntegerComparisonOperator value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.activitydiagram.TracedIntegerComparisonExpression#getOperatorSequence <em>Operator Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedIntegerComparisonExpression)
	 * @see activitydiagramTrace.States.StatesPackage#getIntegerComparisonExpression_operator_Value_Parent()
	 * @see activitydiagramTrace.States.activitydiagram.TracedIntegerComparisonExpression#getOperatorSequence
	 * @model opposite="operatorSequence" required="true" transient="false"
	 * @generated
	 */
	TracedIntegerComparisonExpression getParent();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.IntegerComparisonExpression_operator_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedIntegerComparisonExpression value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.State#getIntegerComparisonExpression_operator_Values <em>Integer Comparison Expression operator Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getIntegerComparisonExpression_operator_Value_States()
	 * @see activitydiagramTrace.States.State#getIntegerComparisonExpression_operator_Values
	 * @model opposite="integerComparisonExpression_operator_Values" required="true"
	 * @generated
	 */
	EList<State> getStates();

} // IntegerComparisonExpression_operator_Value
