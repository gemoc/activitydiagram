/**
 */
package activitydiagramTrace.States.util;

import activitydiagramTrace.States.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see activitydiagramTrace.States.StatesPackage
 * @generated
 */
public class StatesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StatesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatesSwitch() {
		if (modelPackage == null) {
			modelPackage = StatesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case StatesPackage.STATE: {
				State state = (State)theEObject;
				T result = caseState(state);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.INTEGER_EXPRESSION_OPERAND2_VALUE: {
				IntegerExpression_operand2_Value integerExpression_operand2_Value = (IntegerExpression_operand2_Value)theEObject;
				T result = caseIntegerExpression_operand2_Value(integerExpression_operand2_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.INTEGER_EXPRESSION_OPERAND1_VALUE: {
				IntegerExpression_operand1_Value integerExpression_operand1_Value = (IntegerExpression_operand1_Value)theEObject;
				T result = caseIntegerExpression_operand1_Value(integerExpression_operand1_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE: {
				ForkedToken_remainingOffersCount_Value forkedToken_remainingOffersCount_Value = (ForkedToken_remainingOffersCount_Value)theEObject;
				T result = caseForkedToken_remainingOffersCount_Value(forkedToken_remainingOffersCount_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.FORKED_TOKEN_BASE_TOKEN_VALUE: {
				ForkedToken_baseToken_Value forkedToken_baseToken_Value = (ForkedToken_baseToken_Value)theEObject;
				T result = caseForkedToken_baseToken_Value(forkedToken_baseToken_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.CONTROL_FLOW_GUARD_VALUE: {
				ControlFlow_guard_Value controlFlow_guard_Value = (ControlFlow_guard_Value)theEObject;
				T result = caseControlFlow_guard_Value(controlFlow_guard_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.INTEGER_VALUE_VALUE_VALUE: {
				IntegerValue_value_Value integerValue_value_Value = (IntegerValue_value_Value)theEObject;
				T result = caseIntegerValue_value_Value(integerValue_value_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.OFFER_OFFERED_TOKENS_VALUE: {
				Offer_offeredTokens_Value offer_offeredTokens_Value = (Offer_offeredTokens_Value)theEObject;
				T result = caseOffer_offeredTokens_Value(offer_offeredTokens_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.INTEGER_CALCULATION_EXPRESSION_ASSIGNEE_VALUE: {
				IntegerCalculationExpression_assignee_Value integerCalculationExpression_assignee_Value = (IntegerCalculationExpression_assignee_Value)theEObject;
				T result = caseIntegerCalculationExpression_assignee_Value(integerCalculationExpression_assignee_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.INTEGER_CALCULATION_EXPRESSION_OPERATOR_VALUE: {
				IntegerCalculationExpression_operator_Value integerCalculationExpression_operator_Value = (IntegerCalculationExpression_operator_Value)theEObject;
				T result = caseIntegerCalculationExpression_operator_Value(integerCalculationExpression_operator_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.ACTIVITY_EDGE_OFFERS_VALUE: {
				ActivityEdge_offers_Value activityEdge_offers_Value = (ActivityEdge_offers_Value)theEObject;
				T result = caseActivityEdge_offers_Value(activityEdge_offers_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.ACTIVITY_EDGE_TARGET_VALUE: {
				ActivityEdge_target_Value activityEdge_target_Value = (ActivityEdge_target_Value)theEObject;
				T result = caseActivityEdge_target_Value(activityEdge_target_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.ACTIVITY_EDGE_SOURCE_VALUE: {
				ActivityEdge_source_Value activityEdge_source_Value = (ActivityEdge_source_Value)theEObject;
				T result = caseActivityEdge_source_Value(activityEdge_source_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.BOOLEAN_EXPRESSION_ASSIGNEE_VALUE: {
				BooleanExpression_assignee_Value booleanExpression_assignee_Value = (BooleanExpression_assignee_Value)theEObject;
				T result = caseBooleanExpression_assignee_Value(booleanExpression_assignee_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.VARIABLE_NAME_VALUE: {
				Variable_name_Value variable_name_Value = (Variable_name_Value)theEObject;
				T result = caseVariable_name_Value(variable_name_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.VARIABLE_CURRENT_VALUE_VALUE: {
				Variable_currentValue_Value variable_currentValue_Value = (Variable_currentValue_Value)theEObject;
				T result = caseVariable_currentValue_Value(variable_currentValue_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.VARIABLE_INITIAL_VALUE_VALUE: {
				Variable_initialValue_Value variable_initialValue_Value = (Variable_initialValue_Value)theEObject;
				T result = caseVariable_initialValue_Value(variable_initialValue_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.INTEGER_COMPARISON_EXPRESSION_OPERATOR_VALUE: {
				IntegerComparisonExpression_operator_Value integerComparisonExpression_operator_Value = (IntegerComparisonExpression_operator_Value)theEObject;
				T result = caseIntegerComparisonExpression_operator_Value(integerComparisonExpression_operator_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.INTEGER_COMPARISON_EXPRESSION_ASSIGNEE_VALUE: {
				IntegerComparisonExpression_assignee_Value integerComparisonExpression_assignee_Value = (IntegerComparisonExpression_assignee_Value)theEObject;
				T result = caseIntegerComparisonExpression_assignee_Value(integerComparisonExpression_assignee_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.ACTIVITY_TRACE_VALUE: {
				Activity_trace_Value activity_trace_Value = (Activity_trace_Value)theEObject;
				T result = caseActivity_trace_Value(activity_trace_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.ACTIVITY_EDGES_VALUE: {
				Activity_edges_Value activity_edges_Value = (Activity_edges_Value)theEObject;
				T result = caseActivity_edges_Value(activity_edges_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.ACTIVITY_INPUTS_VALUE: {
				Activity_inputs_Value activity_inputs_Value = (Activity_inputs_Value)theEObject;
				T result = caseActivity_inputs_Value(activity_inputs_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.ACTIVITY_NODES_VALUE: {
				Activity_nodes_Value activity_nodes_Value = (Activity_nodes_Value)theEObject;
				T result = caseActivity_nodes_Value(activity_nodes_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.ACTIVITY_LOCALS_VALUE: {
				Activity_locals_Value activity_locals_Value = (Activity_locals_Value)theEObject;
				T result = caseActivity_locals_Value(activity_locals_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.TOKEN_HOLDER_VALUE: {
				Token_holder_Value token_holder_Value = (Token_holder_Value)theEObject;
				T result = caseToken_holder_Value(token_holder_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.BOOLEAN_UNARY_EXPRESSION_OPERATOR_VALUE: {
				BooleanUnaryExpression_operator_Value booleanUnaryExpression_operator_Value = (BooleanUnaryExpression_operator_Value)theEObject;
				T result = caseBooleanUnaryExpression_operator_Value(booleanUnaryExpression_operator_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.BOOLEAN_UNARY_EXPRESSION_OPERAND_VALUE: {
				BooleanUnaryExpression_operand_Value booleanUnaryExpression_operand_Value = (BooleanUnaryExpression_operand_Value)theEObject;
				T result = caseBooleanUnaryExpression_operand_Value(booleanUnaryExpression_operand_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.INPUT_VALUE_VARIABLE_VALUE: {
				InputValue_variable_Value inputValue_variable_Value = (InputValue_variable_Value)theEObject;
				T result = caseInputValue_variable_Value(inputValue_variable_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.INPUT_VALUE_VALUE_VALUE: {
				InputValue_value_Value inputValue_value_Value = (InputValue_value_Value)theEObject;
				T result = caseInputValue_value_Value(inputValue_value_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.TRACE_EXECUTED_NODES_VALUE: {
				Trace_executedNodes_Value trace_executedNodes_Value = (Trace_executedNodes_Value)theEObject;
				T result = caseTrace_executedNodes_Value(trace_executedNodes_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.BOOLEAN_VALUE_VALUE_VALUE: {
				BooleanValue_value_Value booleanValue_value_Value = (BooleanValue_value_Value)theEObject;
				T result = caseBooleanValue_value_Value(booleanValue_value_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.ACTIVITY_NODE_OUTGOING_VALUE: {
				ActivityNode_outgoing_Value activityNode_outgoing_Value = (ActivityNode_outgoing_Value)theEObject;
				T result = caseActivityNode_outgoing_Value(activityNode_outgoing_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.ACTIVITY_NODE_ACTIVITY_VALUE: {
				ActivityNode_activity_Value activityNode_activity_Value = (ActivityNode_activity_Value)theEObject;
				T result = caseActivityNode_activity_Value(activityNode_activity_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.ACTIVITY_NODE_RUNNING_VALUE: {
				ActivityNode_running_Value activityNode_running_Value = (ActivityNode_running_Value)theEObject;
				T result = caseActivityNode_running_Value(activityNode_running_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.ACTIVITY_NODE_INCOMING_VALUE: {
				ActivityNode_incoming_Value activityNode_incoming_Value = (ActivityNode_incoming_Value)theEObject;
				T result = caseActivityNode_incoming_Value(activityNode_incoming_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.ACTIVITY_NODE_HELD_TOKENS_VALUE: {
				ActivityNode_heldTokens_Value activityNode_heldTokens_Value = (ActivityNode_heldTokens_Value)theEObject;
				T result = caseActivityNode_heldTokens_Value(activityNode_heldTokens_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.OPAQUE_ACTION_EXPRESSIONS_VALUE: {
				OpaqueAction_expressions_Value opaqueAction_expressions_Value = (OpaqueAction_expressions_Value)theEObject;
				T result = caseOpaqueAction_expressions_Value(opaqueAction_expressions_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.INPUT_INPUT_VALUES_VALUE: {
				Input_inputValues_Value input_inputValues_Value = (Input_inputValues_Value)theEObject;
				T result = caseInput_inputValues_Value(input_inputValues_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.NAMED_ELEMENT_NAME_VALUE: {
				NamedElement_name_Value namedElement_name_Value = (NamedElement_name_Value)theEObject;
				T result = caseNamedElement_name_Value(namedElement_name_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.BOOLEAN_BINARY_EXPRESSION_OPERAND1_VALUE: {
				BooleanBinaryExpression_operand1_Value booleanBinaryExpression_operand1_Value = (BooleanBinaryExpression_operand1_Value)theEObject;
				T result = caseBooleanBinaryExpression_operand1_Value(booleanBinaryExpression_operand1_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.BOOLEAN_BINARY_EXPRESSION_OPERATOR_VALUE: {
				BooleanBinaryExpression_operator_Value booleanBinaryExpression_operator_Value = (BooleanBinaryExpression_operator_Value)theEObject;
				T result = caseBooleanBinaryExpression_operator_Value(booleanBinaryExpression_operator_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.BOOLEAN_BINARY_EXPRESSION_OPERAND2_VALUE: {
				BooleanBinaryExpression_operand2_Value booleanBinaryExpression_operand2_Value = (BooleanBinaryExpression_operand2_Value)theEObject;
				T result = caseBooleanBinaryExpression_operand2_Value(booleanBinaryExpression_operand2_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseState(State object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Expression operand2 Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Expression operand2 Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerExpression_operand2_Value(IntegerExpression_operand2_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Expression operand1 Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Expression operand1 Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerExpression_operand1_Value(IntegerExpression_operand1_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Forked Token remaining Offers Count Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Forked Token remaining Offers Count Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForkedToken_remainingOffersCount_Value(ForkedToken_remainingOffersCount_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Forked Token base Token Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Forked Token base Token Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForkedToken_baseToken_Value(ForkedToken_baseToken_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Flow guard Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Flow guard Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlFlow_guard_Value(ControlFlow_guard_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Value value Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Value value Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerValue_value_Value(IntegerValue_value_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Offer offered Tokens Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Offer offered Tokens Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOffer_offeredTokens_Value(Offer_offeredTokens_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Calculation Expression assignee Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Calculation Expression assignee Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerCalculationExpression_assignee_Value(IntegerCalculationExpression_assignee_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Calculation Expression operator Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Calculation Expression operator Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerCalculationExpression_operator_Value(IntegerCalculationExpression_operator_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Edge offers Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Edge offers Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityEdge_offers_Value(ActivityEdge_offers_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Edge target Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Edge target Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityEdge_target_Value(ActivityEdge_target_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Edge source Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Edge source Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityEdge_source_Value(ActivityEdge_source_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Expression assignee Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Expression assignee Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanExpression_assignee_Value(BooleanExpression_assignee_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable name Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable name Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable_name_Value(Variable_name_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable current Value Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable current Value Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable_currentValue_Value(Variable_currentValue_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable initial Value Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable initial Value Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable_initialValue_Value(Variable_initialValue_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Comparison Expression operator Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Comparison Expression operator Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerComparisonExpression_operator_Value(IntegerComparisonExpression_operator_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Comparison Expression assignee Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Comparison Expression assignee Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerComparisonExpression_assignee_Value(IntegerComparisonExpression_assignee_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity trace Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity trace Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivity_trace_Value(Activity_trace_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity edges Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity edges Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivity_edges_Value(Activity_edges_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity inputs Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity inputs Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivity_inputs_Value(Activity_inputs_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity nodes Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity nodes Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivity_nodes_Value(Activity_nodes_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity locals Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity locals Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivity_locals_Value(Activity_locals_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Token holder Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Token holder Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToken_holder_Value(Token_holder_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Unary Expression operator Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Unary Expression operator Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanUnaryExpression_operator_Value(BooleanUnaryExpression_operator_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Unary Expression operand Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Unary Expression operand Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanUnaryExpression_operand_Value(BooleanUnaryExpression_operand_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Value variable Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Value variable Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputValue_variable_Value(InputValue_variable_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Value value Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Value value Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputValue_value_Value(InputValue_value_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trace executed Nodes Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trace executed Nodes Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrace_executedNodes_Value(Trace_executedNodes_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Value value Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Value value Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanValue_value_Value(BooleanValue_value_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Node outgoing Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Node outgoing Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityNode_outgoing_Value(ActivityNode_outgoing_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Node activity Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Node activity Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityNode_activity_Value(ActivityNode_activity_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Node running Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Node running Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityNode_running_Value(ActivityNode_running_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Node incoming Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Node incoming Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityNode_incoming_Value(ActivityNode_incoming_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Node held Tokens Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Node held Tokens Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityNode_heldTokens_Value(ActivityNode_heldTokens_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Opaque Action expressions Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Opaque Action expressions Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpaqueAction_expressions_Value(OpaqueAction_expressions_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input input Values Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input input Values Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInput_inputValues_Value(Input_inputValues_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element name Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element name Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement_name_Value(NamedElement_name_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Binary Expression operand1 Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Binary Expression operand1 Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanBinaryExpression_operand1_Value(BooleanBinaryExpression_operand1_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Binary Expression operator Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Binary Expression operator Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanBinaryExpression_operator_Value(BooleanBinaryExpression_operator_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Binary Expression operand2 Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Binary Expression operand2 Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanBinaryExpression_operand2_Value(BooleanBinaryExpression_operand2_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //StatesSwitch
