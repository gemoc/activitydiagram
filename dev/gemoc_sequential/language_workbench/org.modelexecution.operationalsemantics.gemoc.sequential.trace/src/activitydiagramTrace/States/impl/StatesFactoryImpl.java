/**
 */
package activitydiagramTrace.States.impl;

import activitydiagramTrace.States.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StatesFactoryImpl extends EFactoryImpl implements StatesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StatesFactory init() {
		try {
			StatesFactory theStatesFactory = (StatesFactory)EPackage.Registry.INSTANCE.getEFactory(StatesPackage.eNS_URI);
			if (theStatesFactory != null) {
				return theStatesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StatesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case StatesPackage.STATE: return createState();
			case StatesPackage.VARIABLE_INITIAL_VALUE_VALUE: return createVariable_initialValue_Value();
			case StatesPackage.VARIABLE_CURRENT_VALUE_VALUE: return createVariable_currentValue_Value();
			case StatesPackage.VARIABLE_NAME_VALUE: return createVariable_name_Value();
			case StatesPackage.TOKEN_HOLDER_VALUE: return createToken_holder_Value();
			case StatesPackage.INTEGER_EXPRESSION_OPERAND2_VALUE: return createIntegerExpression_operand2_Value();
			case StatesPackage.INTEGER_EXPRESSION_OPERAND1_VALUE: return createIntegerExpression_operand1_Value();
			case StatesPackage.TRACE_EXECUTED_NODES_VALUE: return createTrace_executedNodes_Value();
			case StatesPackage.CONTROL_FLOW_GUARD_VALUE: return createControlFlow_guard_Value();
			case StatesPackage.BOOLEAN_EXPRESSION_ASSIGNEE_VALUE: return createBooleanExpression_assignee_Value();
			case StatesPackage.OPAQUE_ACTION_EXPRESSIONS_VALUE: return createOpaqueAction_expressions_Value();
			case StatesPackage.INPUT_VALUE_VALUE_VALUE: return createInputValue_value_Value();
			case StatesPackage.INPUT_VALUE_VARIABLE_VALUE: return createInputValue_variable_Value();
			case StatesPackage.BOOLEAN_UNARY_EXPRESSION_OPERAND_VALUE: return createBooleanUnaryExpression_operand_Value();
			case StatesPackage.BOOLEAN_UNARY_EXPRESSION_OPERATOR_VALUE: return createBooleanUnaryExpression_operator_Value();
			case StatesPackage.BOOLEAN_BINARY_EXPRESSION_OPERAND1_VALUE: return createBooleanBinaryExpression_operand1_Value();
			case StatesPackage.BOOLEAN_BINARY_EXPRESSION_OPERATOR_VALUE: return createBooleanBinaryExpression_operator_Value();
			case StatesPackage.BOOLEAN_BINARY_EXPRESSION_OPERAND2_VALUE: return createBooleanBinaryExpression_operand2_Value();
			case StatesPackage.NAMED_ELEMENT_NAME_VALUE: return createNamedElement_name_Value();
			case StatesPackage.BOOLEAN_VALUE_VALUE_VALUE: return createBooleanValue_value_Value();
			case StatesPackage.FORKED_TOKEN_BASE_TOKEN_VALUE: return createForkedToken_baseToken_Value();
			case StatesPackage.FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE: return createForkedToken_remainingOffersCount_Value();
			case StatesPackage.INPUT_INPUT_VALUES_VALUE: return createInput_inputValues_Value();
			case StatesPackage.INTEGER_COMPARISON_EXPRESSION_OPERATOR_VALUE: return createIntegerComparisonExpression_operator_Value();
			case StatesPackage.INTEGER_COMPARISON_EXPRESSION_ASSIGNEE_VALUE: return createIntegerComparisonExpression_assignee_Value();
			case StatesPackage.ACTIVITY_EDGES_VALUE: return createActivity_edges_Value();
			case StatesPackage.ACTIVITY_NODES_VALUE: return createActivity_nodes_Value();
			case StatesPackage.ACTIVITY_TRACE_VALUE: return createActivity_trace_Value();
			case StatesPackage.ACTIVITY_LOCALS_VALUE: return createActivity_locals_Value();
			case StatesPackage.ACTIVITY_INPUTS_VALUE: return createActivity_inputs_Value();
			case StatesPackage.ACTIVITY_NODE_HELD_TOKENS_VALUE: return createActivityNode_heldTokens_Value();
			case StatesPackage.ACTIVITY_NODE_INCOMING_VALUE: return createActivityNode_incoming_Value();
			case StatesPackage.ACTIVITY_NODE_RUNNING_VALUE: return createActivityNode_running_Value();
			case StatesPackage.ACTIVITY_NODE_ACTIVITY_VALUE: return createActivityNode_activity_Value();
			case StatesPackage.ACTIVITY_NODE_OUTGOING_VALUE: return createActivityNode_outgoing_Value();
			case StatesPackage.INTEGER_VALUE_VALUE_VALUE: return createIntegerValue_value_Value();
			case StatesPackage.OFFER_OFFERED_TOKENS_VALUE: return createOffer_offeredTokens_Value();
			case StatesPackage.ACTIVITY_EDGE_SOURCE_VALUE: return createActivityEdge_source_Value();
			case StatesPackage.ACTIVITY_EDGE_TARGET_VALUE: return createActivityEdge_target_Value();
			case StatesPackage.ACTIVITY_EDGE_OFFERS_VALUE: return createActivityEdge_offers_Value();
			case StatesPackage.INTEGER_CALCULATION_EXPRESSION_OPERATOR_VALUE: return createIntegerCalculationExpression_operator_Value();
			case StatesPackage.INTEGER_CALCULATION_EXPRESSION_ASSIGNEE_VALUE: return createIntegerCalculationExpression_assignee_Value();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable_initialValue_Value createVariable_initialValue_Value() {
		Variable_initialValue_ValueImpl variable_initialValue_Value = new Variable_initialValue_ValueImpl();
		return variable_initialValue_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable_currentValue_Value createVariable_currentValue_Value() {
		Variable_currentValue_ValueImpl variable_currentValue_Value = new Variable_currentValue_ValueImpl();
		return variable_currentValue_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable_name_Value createVariable_name_Value() {
		Variable_name_ValueImpl variable_name_Value = new Variable_name_ValueImpl();
		return variable_name_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Token_holder_Value createToken_holder_Value() {
		Token_holder_ValueImpl token_holder_Value = new Token_holder_ValueImpl();
		return token_holder_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerExpression_operand2_Value createIntegerExpression_operand2_Value() {
		IntegerExpression_operand2_ValueImpl integerExpression_operand2_Value = new IntegerExpression_operand2_ValueImpl();
		return integerExpression_operand2_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerExpression_operand1_Value createIntegerExpression_operand1_Value() {
		IntegerExpression_operand1_ValueImpl integerExpression_operand1_Value = new IntegerExpression_operand1_ValueImpl();
		return integerExpression_operand1_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trace_executedNodes_Value createTrace_executedNodes_Value() {
		Trace_executedNodes_ValueImpl trace_executedNodes_Value = new Trace_executedNodes_ValueImpl();
		return trace_executedNodes_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlow_guard_Value createControlFlow_guard_Value() {
		ControlFlow_guard_ValueImpl controlFlow_guard_Value = new ControlFlow_guard_ValueImpl();
		return controlFlow_guard_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanExpression_assignee_Value createBooleanExpression_assignee_Value() {
		BooleanExpression_assignee_ValueImpl booleanExpression_assignee_Value = new BooleanExpression_assignee_ValueImpl();
		return booleanExpression_assignee_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueAction_expressions_Value createOpaqueAction_expressions_Value() {
		OpaqueAction_expressions_ValueImpl opaqueAction_expressions_Value = new OpaqueAction_expressions_ValueImpl();
		return opaqueAction_expressions_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputValue_value_Value createInputValue_value_Value() {
		InputValue_value_ValueImpl inputValue_value_Value = new InputValue_value_ValueImpl();
		return inputValue_value_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputValue_variable_Value createInputValue_variable_Value() {
		InputValue_variable_ValueImpl inputValue_variable_Value = new InputValue_variable_ValueImpl();
		return inputValue_variable_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanUnaryExpression_operand_Value createBooleanUnaryExpression_operand_Value() {
		BooleanUnaryExpression_operand_ValueImpl booleanUnaryExpression_operand_Value = new BooleanUnaryExpression_operand_ValueImpl();
		return booleanUnaryExpression_operand_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanUnaryExpression_operator_Value createBooleanUnaryExpression_operator_Value() {
		BooleanUnaryExpression_operator_ValueImpl booleanUnaryExpression_operator_Value = new BooleanUnaryExpression_operator_ValueImpl();
		return booleanUnaryExpression_operator_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanBinaryExpression_operand1_Value createBooleanBinaryExpression_operand1_Value() {
		BooleanBinaryExpression_operand1_ValueImpl booleanBinaryExpression_operand1_Value = new BooleanBinaryExpression_operand1_ValueImpl();
		return booleanBinaryExpression_operand1_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanBinaryExpression_operator_Value createBooleanBinaryExpression_operator_Value() {
		BooleanBinaryExpression_operator_ValueImpl booleanBinaryExpression_operator_Value = new BooleanBinaryExpression_operator_ValueImpl();
		return booleanBinaryExpression_operator_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanBinaryExpression_operand2_Value createBooleanBinaryExpression_operand2_Value() {
		BooleanBinaryExpression_operand2_ValueImpl booleanBinaryExpression_operand2_Value = new BooleanBinaryExpression_operand2_ValueImpl();
		return booleanBinaryExpression_operand2_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement_name_Value createNamedElement_name_Value() {
		NamedElement_name_ValueImpl namedElement_name_Value = new NamedElement_name_ValueImpl();
		return namedElement_name_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanValue_value_Value createBooleanValue_value_Value() {
		BooleanValue_value_ValueImpl booleanValue_value_Value = new BooleanValue_value_ValueImpl();
		return booleanValue_value_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForkedToken_baseToken_Value createForkedToken_baseToken_Value() {
		ForkedToken_baseToken_ValueImpl forkedToken_baseToken_Value = new ForkedToken_baseToken_ValueImpl();
		return forkedToken_baseToken_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForkedToken_remainingOffersCount_Value createForkedToken_remainingOffersCount_Value() {
		ForkedToken_remainingOffersCount_ValueImpl forkedToken_remainingOffersCount_Value = new ForkedToken_remainingOffersCount_ValueImpl();
		return forkedToken_remainingOffersCount_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input_inputValues_Value createInput_inputValues_Value() {
		Input_inputValues_ValueImpl input_inputValues_Value = new Input_inputValues_ValueImpl();
		return input_inputValues_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerComparisonExpression_operator_Value createIntegerComparisonExpression_operator_Value() {
		IntegerComparisonExpression_operator_ValueImpl integerComparisonExpression_operator_Value = new IntegerComparisonExpression_operator_ValueImpl();
		return integerComparisonExpression_operator_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerComparisonExpression_assignee_Value createIntegerComparisonExpression_assignee_Value() {
		IntegerComparisonExpression_assignee_ValueImpl integerComparisonExpression_assignee_Value = new IntegerComparisonExpression_assignee_ValueImpl();
		return integerComparisonExpression_assignee_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity_edges_Value createActivity_edges_Value() {
		Activity_edges_ValueImpl activity_edges_Value = new Activity_edges_ValueImpl();
		return activity_edges_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity_nodes_Value createActivity_nodes_Value() {
		Activity_nodes_ValueImpl activity_nodes_Value = new Activity_nodes_ValueImpl();
		return activity_nodes_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity_trace_Value createActivity_trace_Value() {
		Activity_trace_ValueImpl activity_trace_Value = new Activity_trace_ValueImpl();
		return activity_trace_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity_locals_Value createActivity_locals_Value() {
		Activity_locals_ValueImpl activity_locals_Value = new Activity_locals_ValueImpl();
		return activity_locals_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity_inputs_Value createActivity_inputs_Value() {
		Activity_inputs_ValueImpl activity_inputs_Value = new Activity_inputs_ValueImpl();
		return activity_inputs_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode_heldTokens_Value createActivityNode_heldTokens_Value() {
		ActivityNode_heldTokens_ValueImpl activityNode_heldTokens_Value = new ActivityNode_heldTokens_ValueImpl();
		return activityNode_heldTokens_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode_incoming_Value createActivityNode_incoming_Value() {
		ActivityNode_incoming_ValueImpl activityNode_incoming_Value = new ActivityNode_incoming_ValueImpl();
		return activityNode_incoming_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode_running_Value createActivityNode_running_Value() {
		ActivityNode_running_ValueImpl activityNode_running_Value = new ActivityNode_running_ValueImpl();
		return activityNode_running_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode_activity_Value createActivityNode_activity_Value() {
		ActivityNode_activity_ValueImpl activityNode_activity_Value = new ActivityNode_activity_ValueImpl();
		return activityNode_activity_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode_outgoing_Value createActivityNode_outgoing_Value() {
		ActivityNode_outgoing_ValueImpl activityNode_outgoing_Value = new ActivityNode_outgoing_ValueImpl();
		return activityNode_outgoing_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerValue_value_Value createIntegerValue_value_Value() {
		IntegerValue_value_ValueImpl integerValue_value_Value = new IntegerValue_value_ValueImpl();
		return integerValue_value_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Offer_offeredTokens_Value createOffer_offeredTokens_Value() {
		Offer_offeredTokens_ValueImpl offer_offeredTokens_Value = new Offer_offeredTokens_ValueImpl();
		return offer_offeredTokens_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdge_source_Value createActivityEdge_source_Value() {
		ActivityEdge_source_ValueImpl activityEdge_source_Value = new ActivityEdge_source_ValueImpl();
		return activityEdge_source_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdge_target_Value createActivityEdge_target_Value() {
		ActivityEdge_target_ValueImpl activityEdge_target_Value = new ActivityEdge_target_ValueImpl();
		return activityEdge_target_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdge_offers_Value createActivityEdge_offers_Value() {
		ActivityEdge_offers_ValueImpl activityEdge_offers_Value = new ActivityEdge_offers_ValueImpl();
		return activityEdge_offers_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerCalculationExpression_operator_Value createIntegerCalculationExpression_operator_Value() {
		IntegerCalculationExpression_operator_ValueImpl integerCalculationExpression_operator_Value = new IntegerCalculationExpression_operator_ValueImpl();
		return integerCalculationExpression_operator_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerCalculationExpression_assignee_Value createIntegerCalculationExpression_assignee_Value() {
		IntegerCalculationExpression_assignee_ValueImpl integerCalculationExpression_assignee_Value = new IntegerCalculationExpression_assignee_ValueImpl();
		return integerCalculationExpression_assignee_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatesPackage getStatesPackage() {
		return (StatesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StatesPackage getPackage() {
		return StatesPackage.eINSTANCE;
	}

} //StatesFactoryImpl
