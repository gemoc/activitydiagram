/**
 */
package activitydiagramTrace.States;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see activitydiagramTrace.States.StatesPackage
 * @generated
 */
public interface StatesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StatesFactory eINSTANCE = activitydiagramTrace.States.impl.StatesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State</em>'.
	 * @generated
	 */
	State createState();

	/**
	 * Returns a new object of class '<em>Variable initial Value Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable initial Value Value</em>'.
	 * @generated
	 */
	Variable_initialValue_Value createVariable_initialValue_Value();

	/**
	 * Returns a new object of class '<em>Variable current Value Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable current Value Value</em>'.
	 * @generated
	 */
	Variable_currentValue_Value createVariable_currentValue_Value();

	/**
	 * Returns a new object of class '<em>Variable name Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable name Value</em>'.
	 * @generated
	 */
	Variable_name_Value createVariable_name_Value();

	/**
	 * Returns a new object of class '<em>Token holder Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Token holder Value</em>'.
	 * @generated
	 */
	Token_holder_Value createToken_holder_Value();

	/**
	 * Returns a new object of class '<em>Integer Expression operand2 Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Expression operand2 Value</em>'.
	 * @generated
	 */
	IntegerExpression_operand2_Value createIntegerExpression_operand2_Value();

	/**
	 * Returns a new object of class '<em>Integer Expression operand1 Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Expression operand1 Value</em>'.
	 * @generated
	 */
	IntegerExpression_operand1_Value createIntegerExpression_operand1_Value();

	/**
	 * Returns a new object of class '<em>Trace executed Nodes Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trace executed Nodes Value</em>'.
	 * @generated
	 */
	Trace_executedNodes_Value createTrace_executedNodes_Value();

	/**
	 * Returns a new object of class '<em>Control Flow guard Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control Flow guard Value</em>'.
	 * @generated
	 */
	ControlFlow_guard_Value createControlFlow_guard_Value();

	/**
	 * Returns a new object of class '<em>Boolean Expression assignee Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Expression assignee Value</em>'.
	 * @generated
	 */
	BooleanExpression_assignee_Value createBooleanExpression_assignee_Value();

	/**
	 * Returns a new object of class '<em>Opaque Action expressions Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Opaque Action expressions Value</em>'.
	 * @generated
	 */
	OpaqueAction_expressions_Value createOpaqueAction_expressions_Value();

	/**
	 * Returns a new object of class '<em>Input Value value Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Value value Value</em>'.
	 * @generated
	 */
	InputValue_value_Value createInputValue_value_Value();

	/**
	 * Returns a new object of class '<em>Input Value variable Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Value variable Value</em>'.
	 * @generated
	 */
	InputValue_variable_Value createInputValue_variable_Value();

	/**
	 * Returns a new object of class '<em>Boolean Unary Expression operand Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Unary Expression operand Value</em>'.
	 * @generated
	 */
	BooleanUnaryExpression_operand_Value createBooleanUnaryExpression_operand_Value();

	/**
	 * Returns a new object of class '<em>Boolean Unary Expression operator Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Unary Expression operator Value</em>'.
	 * @generated
	 */
	BooleanUnaryExpression_operator_Value createBooleanUnaryExpression_operator_Value();

	/**
	 * Returns a new object of class '<em>Boolean Binary Expression operand1 Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Binary Expression operand1 Value</em>'.
	 * @generated
	 */
	BooleanBinaryExpression_operand1_Value createBooleanBinaryExpression_operand1_Value();

	/**
	 * Returns a new object of class '<em>Boolean Binary Expression operator Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Binary Expression operator Value</em>'.
	 * @generated
	 */
	BooleanBinaryExpression_operator_Value createBooleanBinaryExpression_operator_Value();

	/**
	 * Returns a new object of class '<em>Boolean Binary Expression operand2 Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Binary Expression operand2 Value</em>'.
	 * @generated
	 */
	BooleanBinaryExpression_operand2_Value createBooleanBinaryExpression_operand2_Value();

	/**
	 * Returns a new object of class '<em>Named Element name Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Element name Value</em>'.
	 * @generated
	 */
	NamedElement_name_Value createNamedElement_name_Value();

	/**
	 * Returns a new object of class '<em>Boolean Value value Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Value value Value</em>'.
	 * @generated
	 */
	BooleanValue_value_Value createBooleanValue_value_Value();

	/**
	 * Returns a new object of class '<em>Forked Token base Token Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Forked Token base Token Value</em>'.
	 * @generated
	 */
	ForkedToken_baseToken_Value createForkedToken_baseToken_Value();

	/**
	 * Returns a new object of class '<em>Forked Token remaining Offers Count Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Forked Token remaining Offers Count Value</em>'.
	 * @generated
	 */
	ForkedToken_remainingOffersCount_Value createForkedToken_remainingOffersCount_Value();

	/**
	 * Returns a new object of class '<em>Input input Values Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input input Values Value</em>'.
	 * @generated
	 */
	Input_inputValues_Value createInput_inputValues_Value();

	/**
	 * Returns a new object of class '<em>Integer Comparison Expression operator Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Comparison Expression operator Value</em>'.
	 * @generated
	 */
	IntegerComparisonExpression_operator_Value createIntegerComparisonExpression_operator_Value();

	/**
	 * Returns a new object of class '<em>Integer Comparison Expression assignee Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Comparison Expression assignee Value</em>'.
	 * @generated
	 */
	IntegerComparisonExpression_assignee_Value createIntegerComparisonExpression_assignee_Value();

	/**
	 * Returns a new object of class '<em>Activity edges Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity edges Value</em>'.
	 * @generated
	 */
	Activity_edges_Value createActivity_edges_Value();

	/**
	 * Returns a new object of class '<em>Activity nodes Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity nodes Value</em>'.
	 * @generated
	 */
	Activity_nodes_Value createActivity_nodes_Value();

	/**
	 * Returns a new object of class '<em>Activity trace Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity trace Value</em>'.
	 * @generated
	 */
	Activity_trace_Value createActivity_trace_Value();

	/**
	 * Returns a new object of class '<em>Activity locals Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity locals Value</em>'.
	 * @generated
	 */
	Activity_locals_Value createActivity_locals_Value();

	/**
	 * Returns a new object of class '<em>Activity inputs Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity inputs Value</em>'.
	 * @generated
	 */
	Activity_inputs_Value createActivity_inputs_Value();

	/**
	 * Returns a new object of class '<em>Activity Node held Tokens Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Node held Tokens Value</em>'.
	 * @generated
	 */
	ActivityNode_heldTokens_Value createActivityNode_heldTokens_Value();

	/**
	 * Returns a new object of class '<em>Activity Node incoming Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Node incoming Value</em>'.
	 * @generated
	 */
	ActivityNode_incoming_Value createActivityNode_incoming_Value();

	/**
	 * Returns a new object of class '<em>Activity Node running Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Node running Value</em>'.
	 * @generated
	 */
	ActivityNode_running_Value createActivityNode_running_Value();

	/**
	 * Returns a new object of class '<em>Activity Node activity Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Node activity Value</em>'.
	 * @generated
	 */
	ActivityNode_activity_Value createActivityNode_activity_Value();

	/**
	 * Returns a new object of class '<em>Activity Node outgoing Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Node outgoing Value</em>'.
	 * @generated
	 */
	ActivityNode_outgoing_Value createActivityNode_outgoing_Value();

	/**
	 * Returns a new object of class '<em>Integer Value value Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Value value Value</em>'.
	 * @generated
	 */
	IntegerValue_value_Value createIntegerValue_value_Value();

	/**
	 * Returns a new object of class '<em>Offer offered Tokens Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Offer offered Tokens Value</em>'.
	 * @generated
	 */
	Offer_offeredTokens_Value createOffer_offeredTokens_Value();

	/**
	 * Returns a new object of class '<em>Activity Edge source Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Edge source Value</em>'.
	 * @generated
	 */
	ActivityEdge_source_Value createActivityEdge_source_Value();

	/**
	 * Returns a new object of class '<em>Activity Edge target Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Edge target Value</em>'.
	 * @generated
	 */
	ActivityEdge_target_Value createActivityEdge_target_Value();

	/**
	 * Returns a new object of class '<em>Activity Edge offers Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Edge offers Value</em>'.
	 * @generated
	 */
	ActivityEdge_offers_Value createActivityEdge_offers_Value();

	/**
	 * Returns a new object of class '<em>Integer Calculation Expression operator Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Calculation Expression operator Value</em>'.
	 * @generated
	 */
	IntegerCalculationExpression_operator_Value createIntegerCalculationExpression_operator_Value();

	/**
	 * Returns a new object of class '<em>Integer Calculation Expression assignee Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Calculation Expression assignee Value</em>'.
	 * @generated
	 */
	IntegerCalculationExpression_assignee_Value createIntegerCalculationExpression_assignee_Value();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StatesPackage getStatesPackage();

} //StatesFactory
