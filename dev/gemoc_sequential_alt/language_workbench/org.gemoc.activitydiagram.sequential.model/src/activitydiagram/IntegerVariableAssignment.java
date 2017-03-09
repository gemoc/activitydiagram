/**
 */
package activitydiagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Variable Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link activitydiagram.IntegerVariableAssignment#getAssignee <em>Assignee</em>}</li>
 *   <li>{@link activitydiagram.IntegerVariableAssignment#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see activitydiagram.ActivitydiagramPackage#getIntegerVariableAssignment()
 * @model
 * @generated
 */
public interface IntegerVariableAssignment extends VariableAssignment {
	/**
	 * Returns the value of the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignee</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignee</em>' reference.
	 * @see #setAssignee(IntegerVariable)
	 * @see activitydiagram.ActivitydiagramPackage#getIntegerVariableAssignment_Assignee()
	 * @model required="true"
	 * @generated
	 */
	IntegerVariable getAssignee();

	/**
	 * Sets the value of the '{@link activitydiagram.IntegerVariableAssignment#getAssignee <em>Assignee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assignee</em>' reference.
	 * @see #getAssignee()
	 * @generated
	 */
	void setAssignee(IntegerVariable value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(IntegerExpression)
	 * @see activitydiagram.ActivitydiagramPackage#getIntegerVariableAssignment_Expression()
	 * @model containment="true"
	 * @generated
	 */
	IntegerExpression getExpression();

	/**
	 * Sets the value of the '{@link activitydiagram.IntegerVariableAssignment#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(IntegerExpression value);

} // IntegerVariableAssignment
