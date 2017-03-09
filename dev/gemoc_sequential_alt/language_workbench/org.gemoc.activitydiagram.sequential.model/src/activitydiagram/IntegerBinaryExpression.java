/**
 */
package activitydiagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Binary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link activitydiagram.IntegerBinaryExpression#getOperand1 <em>Operand1</em>}</li>
 *   <li>{@link activitydiagram.IntegerBinaryExpression#getOperand2 <em>Operand2</em>}</li>
 *   <li>{@link activitydiagram.IntegerBinaryExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see activitydiagram.ActivitydiagramPackage#getIntegerBinaryExpression()
 * @model
 * @generated
 */
public interface IntegerBinaryExpression extends Expression, IntegerExpression {
	/**
	 * Returns the value of the '<em><b>Operand2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand2</em>' reference.
	 * @see #setOperand2(IntegerExpression)
	 * @see activitydiagram.ActivitydiagramPackage#getIntegerBinaryExpression_Operand2()
	 * @model
	 * @generated
	 */
	IntegerExpression getOperand2();

	/**
	 * Sets the value of the '{@link activitydiagram.IntegerBinaryExpression#getOperand2 <em>Operand2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand2</em>' reference.
	 * @see #getOperand2()
	 * @generated
	 */
	void setOperand2(IntegerExpression value);

	/**
	 * Returns the value of the '<em><b>Operand1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand1</em>' reference.
	 * @see #setOperand1(IntegerExpression)
	 * @see activitydiagram.ActivitydiagramPackage#getIntegerBinaryExpression_Operand1()
	 * @model
	 * @generated
	 */
	IntegerExpression getOperand1();

	/**
	 * Sets the value of the '{@link activitydiagram.IntegerBinaryExpression#getOperand1 <em>Operand1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand1</em>' reference.
	 * @see #getOperand1()
	 * @generated
	 */
	void setOperand1(IntegerExpression value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link activitydiagram.IntegerCalculationOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see activitydiagram.IntegerCalculationOperator
	 * @see #setOperator(IntegerCalculationOperator)
	 * @see activitydiagram.ActivitydiagramPackage#getIntegerBinaryExpression_Operator()
	 * @model required="true"
	 * @generated
	 */
	IntegerCalculationOperator getOperator();

	/**
	 * Sets the value of the '{@link activitydiagram.IntegerBinaryExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see activitydiagram.IntegerCalculationOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(IntegerCalculationOperator value);

} // IntegerBinaryExpression
