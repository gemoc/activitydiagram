/**
 */
package activitydiagramTrace.States.impl;

import activitydiagramTrace.States.ActivityEdge_offers_Value;
import activitydiagramTrace.States.ActivityEdge_source_Value;
import activitydiagramTrace.States.ActivityEdge_target_Value;
import activitydiagramTrace.States.ActivityNode_activity_Value;
import activitydiagramTrace.States.ActivityNode_heldTokens_Value;
import activitydiagramTrace.States.ActivityNode_incoming_Value;
import activitydiagramTrace.States.ActivityNode_outgoing_Value;
import activitydiagramTrace.States.ActivityNode_running_Value;
import activitydiagramTrace.States.Activity_edges_Value;
import activitydiagramTrace.States.Activity_inputs_Value;
import activitydiagramTrace.States.Activity_locals_Value;
import activitydiagramTrace.States.Activity_nodes_Value;
import activitydiagramTrace.States.Activity_trace_Value;
import activitydiagramTrace.States.BooleanBinaryExpression_operand1_Value;
import activitydiagramTrace.States.BooleanBinaryExpression_operand2_Value;
import activitydiagramTrace.States.BooleanBinaryExpression_operator_Value;
import activitydiagramTrace.States.BooleanExpression_assignee_Value;
import activitydiagramTrace.States.BooleanUnaryExpression_operand_Value;
import activitydiagramTrace.States.BooleanUnaryExpression_operator_Value;
import activitydiagramTrace.States.BooleanValue_value_Value;
import activitydiagramTrace.States.ControlFlow_guard_Value;
import activitydiagramTrace.States.ForkedToken_baseToken_Value;
import activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value;
import activitydiagramTrace.States.InputValue_value_Value;
import activitydiagramTrace.States.InputValue_variable_Value;
import activitydiagramTrace.States.Input_inputValues_Value;
import activitydiagramTrace.States.IntegerCalculationExpression_assignee_Value;
import activitydiagramTrace.States.IntegerCalculationExpression_operator_Value;
import activitydiagramTrace.States.IntegerComparisonExpression_assignee_Value;
import activitydiagramTrace.States.IntegerComparisonExpression_operator_Value;
import activitydiagramTrace.States.IntegerExpression_operand1_Value;
import activitydiagramTrace.States.IntegerExpression_operand2_Value;
import activitydiagramTrace.States.IntegerValue_value_Value;
import activitydiagramTrace.States.NamedElement_name_Value;
import activitydiagramTrace.States.Offer_offeredTokens_Value;
import activitydiagramTrace.States.OpaqueAction_expressions_Value;
import activitydiagramTrace.States.State;
import activitydiagramTrace.States.StatesPackage;
import activitydiagramTrace.States.Token_holder_Value;
import activitydiagramTrace.States.Trace_executedNodes_Value;
import activitydiagramTrace.States.Variable_currentValue_Value;
import activitydiagramTrace.States.Variable_initialValue_Value;
import activitydiagramTrace.States.Variable_name_Value;

import activitydiagramTrace.Steps.Step;
import activitydiagramTrace.Steps.StepsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activitydiagramTrace.States.impl.StateImpl#getStartedSteps <em>Started Steps</em>}</li>
 *   <li>{@link activitydiagramTrace.States.impl.StateImpl#getEndedSteps <em>Ended Steps</em>}</li>
 *   <li>{@link activitydiagramTrace.States.impl.StateImpl#getIntegerExpression_operand2_Values <em>Integer Expression operand2 Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.impl.StateImpl#getIntegerExpression_operand1_Values <em>Integer Expression operand1 Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.impl.StateImpl#getForkedToken_remainingOffersCount_Values <em>Forked Token remaining Offers Count Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.impl.StateImpl#getForkedToken_baseToken_Values <em>Forked Token base Token Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.impl.StateImpl#getControlFlow_guard_Values <em>Control Flow guard Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.impl.StateImpl#getIntegerValue_value_Values <em>Integer Value value Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.impl.StateImpl#getOffer_offeredTokens_Values <em>Offer offered Tokens Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.impl.StateImpl#getIntegerCalculationExpression_assignee_Values <em>Integer Calculation Expression assignee Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.impl.StateImpl#getIntegerCalculationExpression_operator_Values <em>Integer Calculation Expression operator Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.impl.StateImpl#getActivityEdge_offers_Values <em>Activity Edge offers Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.impl.StateImpl#getActivityEdge_target_Values <em>Activity Edge target Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.impl.StateImpl#getActivityEdge_source_Values <em>Activity Edge source Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.impl.StateImpl#getBooleanExpression_assignee_Values <em>Boolean Expression assignee Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.impl.StateImpl#getVariable_name_Values <em>Variable name Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.impl.StateImpl#getVariable_currentValue_Values <em>Variable current Value Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.impl.StateImpl#getVariable_initialValue_Values <em>Variable initial Value Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.impl.StateImpl#getIntegerComparisonExpression_operator_Values <em>Integer Comparison Expression operator Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.impl.StateImpl#getIntegerComparisonExpression_assignee_Values <em>Integer Comparison Expression assignee Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.impl.StateImpl#getActivity_trace_Values <em>Activity trace Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.impl.StateImpl#getActivity_edges_Values <em>Activity edges Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.impl.StateImpl#getActivity_inputs_Values <em>Activity inputs Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.impl.StateImpl#getActivity_nodes_Values <em>Activity nodes Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.impl.StateImpl#getActivity_locals_Values <em>Activity locals Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.impl.StateImpl#getToken_holder_Values <em>Token holder Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.impl.StateImpl#getBooleanUnaryExpression_operator_Values <em>Boolean Unary Expression operator Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.impl.StateImpl#getBooleanUnaryExpression_operand_Values <em>Boolean Unary Expression operand Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.impl.StateImpl#getInputValue_variable_Values <em>Input Value variable Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.impl.StateImpl#getInputValue_value_Values <em>Input Value value Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.impl.StateImpl#getTrace_executedNodes_Values <em>Trace executed Nodes Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.impl.StateImpl#getBooleanValue_value_Values <em>Boolean Value value Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.impl.StateImpl#getActivityNode_outgoing_Values <em>Activity Node outgoing Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.impl.StateImpl#getActivityNode_activity_Values <em>Activity Node activity Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.impl.StateImpl#getActivityNode_running_Values <em>Activity Node running Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.impl.StateImpl#getActivityNode_incoming_Values <em>Activity Node incoming Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.impl.StateImpl#getActivityNode_heldTokens_Values <em>Activity Node held Tokens Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.impl.StateImpl#getOpaqueAction_expressions_Values <em>Opaque Action expressions Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.impl.StateImpl#getInput_inputValues_Values <em>Input input Values Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.impl.StateImpl#getNamedElement_name_Values <em>Named Element name Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.impl.StateImpl#getBooleanBinaryExpression_operand1_Values <em>Boolean Binary Expression operand1 Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.impl.StateImpl#getBooleanBinaryExpression_operator_Values <em>Boolean Binary Expression operator Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.impl.StateImpl#getBooleanBinaryExpression_operand2_Values <em>Boolean Binary Expression operand2 Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateImpl extends MinimalEObjectImpl.Container implements State {
	/**
	 * The cached value of the '{@link #getStartedSteps() <em>Started Steps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartedSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> startedSteps;

	/**
	 * The cached value of the '{@link #getEndedSteps() <em>Ended Steps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndedSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> endedSteps;

	/**
	 * The cached value of the '{@link #getIntegerExpression_operand2_Values() <em>Integer Expression operand2 Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegerExpression_operand2_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<IntegerExpression_operand2_Value> integerExpression_operand2_Values;

	/**
	 * The cached value of the '{@link #getIntegerExpression_operand1_Values() <em>Integer Expression operand1 Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegerExpression_operand1_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<IntegerExpression_operand1_Value> integerExpression_operand1_Values;

	/**
	 * The cached value of the '{@link #getForkedToken_remainingOffersCount_Values() <em>Forked Token remaining Offers Count Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForkedToken_remainingOffersCount_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<ForkedToken_remainingOffersCount_Value> forkedToken_remainingOffersCount_Values;

	/**
	 * The cached value of the '{@link #getForkedToken_baseToken_Values() <em>Forked Token base Token Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForkedToken_baseToken_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<ForkedToken_baseToken_Value> forkedToken_baseToken_Values;

	/**
	 * The cached value of the '{@link #getControlFlow_guard_Values() <em>Control Flow guard Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlFlow_guard_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlFlow_guard_Value> controlFlow_guard_Values;

	/**
	 * The cached value of the '{@link #getIntegerValue_value_Values() <em>Integer Value value Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegerValue_value_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<IntegerValue_value_Value> integerValue_value_Values;

	/**
	 * The cached value of the '{@link #getOffer_offeredTokens_Values() <em>Offer offered Tokens Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffer_offeredTokens_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<Offer_offeredTokens_Value> offer_offeredTokens_Values;

	/**
	 * The cached value of the '{@link #getIntegerCalculationExpression_assignee_Values() <em>Integer Calculation Expression assignee Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegerCalculationExpression_assignee_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<IntegerCalculationExpression_assignee_Value> integerCalculationExpression_assignee_Values;

	/**
	 * The cached value of the '{@link #getIntegerCalculationExpression_operator_Values() <em>Integer Calculation Expression operator Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegerCalculationExpression_operator_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<IntegerCalculationExpression_operator_Value> integerCalculationExpression_operator_Values;

	/**
	 * The cached value of the '{@link #getActivityEdge_offers_Values() <em>Activity Edge offers Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityEdge_offers_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdge_offers_Value> activityEdge_offers_Values;

	/**
	 * The cached value of the '{@link #getActivityEdge_target_Values() <em>Activity Edge target Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityEdge_target_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdge_target_Value> activityEdge_target_Values;

	/**
	 * The cached value of the '{@link #getActivityEdge_source_Values() <em>Activity Edge source Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityEdge_source_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdge_source_Value> activityEdge_source_Values;

	/**
	 * The cached value of the '{@link #getBooleanExpression_assignee_Values() <em>Boolean Expression assignee Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanExpression_assignee_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<BooleanExpression_assignee_Value> booleanExpression_assignee_Values;

	/**
	 * The cached value of the '{@link #getVariable_name_Values() <em>Variable name Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable_name_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable_name_Value> variable_name_Values;

	/**
	 * The cached value of the '{@link #getVariable_currentValue_Values() <em>Variable current Value Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable_currentValue_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable_currentValue_Value> variable_currentValue_Values;

	/**
	 * The cached value of the '{@link #getVariable_initialValue_Values() <em>Variable initial Value Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable_initialValue_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable_initialValue_Value> variable_initialValue_Values;

	/**
	 * The cached value of the '{@link #getIntegerComparisonExpression_operator_Values() <em>Integer Comparison Expression operator Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegerComparisonExpression_operator_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<IntegerComparisonExpression_operator_Value> integerComparisonExpression_operator_Values;

	/**
	 * The cached value of the '{@link #getIntegerComparisonExpression_assignee_Values() <em>Integer Comparison Expression assignee Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegerComparisonExpression_assignee_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<IntegerComparisonExpression_assignee_Value> integerComparisonExpression_assignee_Values;

	/**
	 * The cached value of the '{@link #getActivity_trace_Values() <em>Activity trace Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity_trace_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity_trace_Value> activity_trace_Values;

	/**
	 * The cached value of the '{@link #getActivity_edges_Values() <em>Activity edges Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity_edges_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity_edges_Value> activity_edges_Values;

	/**
	 * The cached value of the '{@link #getActivity_inputs_Values() <em>Activity inputs Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity_inputs_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity_inputs_Value> activity_inputs_Values;

	/**
	 * The cached value of the '{@link #getActivity_nodes_Values() <em>Activity nodes Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity_nodes_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity_nodes_Value> activity_nodes_Values;

	/**
	 * The cached value of the '{@link #getActivity_locals_Values() <em>Activity locals Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity_locals_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity_locals_Value> activity_locals_Values;

	/**
	 * The cached value of the '{@link #getToken_holder_Values() <em>Token holder Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken_holder_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<Token_holder_Value> token_holder_Values;

	/**
	 * The cached value of the '{@link #getBooleanUnaryExpression_operator_Values() <em>Boolean Unary Expression operator Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanUnaryExpression_operator_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<BooleanUnaryExpression_operator_Value> booleanUnaryExpression_operator_Values;

	/**
	 * The cached value of the '{@link #getBooleanUnaryExpression_operand_Values() <em>Boolean Unary Expression operand Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanUnaryExpression_operand_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<BooleanUnaryExpression_operand_Value> booleanUnaryExpression_operand_Values;

	/**
	 * The cached value of the '{@link #getInputValue_variable_Values() <em>Input Value variable Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputValue_variable_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<InputValue_variable_Value> inputValue_variable_Values;

	/**
	 * The cached value of the '{@link #getInputValue_value_Values() <em>Input Value value Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputValue_value_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<InputValue_value_Value> inputValue_value_Values;

	/**
	 * The cached value of the '{@link #getTrace_executedNodes_Values() <em>Trace executed Nodes Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrace_executedNodes_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<Trace_executedNodes_Value> trace_executedNodes_Values;

	/**
	 * The cached value of the '{@link #getBooleanValue_value_Values() <em>Boolean Value value Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanValue_value_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<BooleanValue_value_Value> booleanValue_value_Values;

	/**
	 * The cached value of the '{@link #getActivityNode_outgoing_Values() <em>Activity Node outgoing Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityNode_outgoing_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNode_outgoing_Value> activityNode_outgoing_Values;

	/**
	 * The cached value of the '{@link #getActivityNode_activity_Values() <em>Activity Node activity Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityNode_activity_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNode_activity_Value> activityNode_activity_Values;

	/**
	 * The cached value of the '{@link #getActivityNode_running_Values() <em>Activity Node running Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityNode_running_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNode_running_Value> activityNode_running_Values;

	/**
	 * The cached value of the '{@link #getActivityNode_incoming_Values() <em>Activity Node incoming Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityNode_incoming_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNode_incoming_Value> activityNode_incoming_Values;

	/**
	 * The cached value of the '{@link #getActivityNode_heldTokens_Values() <em>Activity Node held Tokens Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityNode_heldTokens_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNode_heldTokens_Value> activityNode_heldTokens_Values;

	/**
	 * The cached value of the '{@link #getOpaqueAction_expressions_Values() <em>Opaque Action expressions Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpaqueAction_expressions_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<OpaqueAction_expressions_Value> opaqueAction_expressions_Values;

	/**
	 * The cached value of the '{@link #getInput_inputValues_Values() <em>Input input Values Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput_inputValues_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<Input_inputValues_Value> input_inputValues_Values;

	/**
	 * The cached value of the '{@link #getNamedElement_name_Values() <em>Named Element name Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamedElement_name_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedElement_name_Value> namedElement_name_Values;

	/**
	 * The cached value of the '{@link #getBooleanBinaryExpression_operand1_Values() <em>Boolean Binary Expression operand1 Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanBinaryExpression_operand1_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<BooleanBinaryExpression_operand1_Value> booleanBinaryExpression_operand1_Values;

	/**
	 * The cached value of the '{@link #getBooleanBinaryExpression_operator_Values() <em>Boolean Binary Expression operator Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanBinaryExpression_operator_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<BooleanBinaryExpression_operator_Value> booleanBinaryExpression_operator_Values;

	/**
	 * The cached value of the '{@link #getBooleanBinaryExpression_operand2_Values() <em>Boolean Binary Expression operand2 Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanBinaryExpression_operand2_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<BooleanBinaryExpression_operand2_Value> booleanBinaryExpression_operand2_Values;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Step> getStartedSteps() {
		if (startedSteps == null) {
			startedSteps = new EObjectWithInverseResolvingEList<Step>(Step.class, this, StatesPackage.STATE__STARTED_STEPS, StepsPackage.STEP__STARTING_STATE);
		}
		return startedSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Step> getEndedSteps() {
		if (endedSteps == null) {
			endedSteps = new EObjectWithInverseResolvingEList<Step>(Step.class, this, StatesPackage.STATE__ENDED_STEPS, StepsPackage.STEP__ENDING_STATE);
		}
		return endedSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IntegerExpression_operand2_Value> getIntegerExpression_operand2_Values() {
		if (integerExpression_operand2_Values == null) {
			integerExpression_operand2_Values = new EObjectWithInverseResolvingEList.ManyInverse<IntegerExpression_operand2_Value>(IntegerExpression_operand2_Value.class, this, StatesPackage.STATE__INTEGER_EXPRESSION_OPERAND2_VALUES, StatesPackage.INTEGER_EXPRESSION_OPERAND2_VALUE__STATES);
		}
		return integerExpression_operand2_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IntegerExpression_operand1_Value> getIntegerExpression_operand1_Values() {
		if (integerExpression_operand1_Values == null) {
			integerExpression_operand1_Values = new EObjectWithInverseResolvingEList.ManyInverse<IntegerExpression_operand1_Value>(IntegerExpression_operand1_Value.class, this, StatesPackage.STATE__INTEGER_EXPRESSION_OPERAND1_VALUES, StatesPackage.INTEGER_EXPRESSION_OPERAND1_VALUE__STATES);
		}
		return integerExpression_operand1_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ForkedToken_remainingOffersCount_Value> getForkedToken_remainingOffersCount_Values() {
		if (forkedToken_remainingOffersCount_Values == null) {
			forkedToken_remainingOffersCount_Values = new EObjectWithInverseResolvingEList.ManyInverse<ForkedToken_remainingOffersCount_Value>(ForkedToken_remainingOffersCount_Value.class, this, StatesPackage.STATE__FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUES, StatesPackage.FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE__STATES);
		}
		return forkedToken_remainingOffersCount_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ForkedToken_baseToken_Value> getForkedToken_baseToken_Values() {
		if (forkedToken_baseToken_Values == null) {
			forkedToken_baseToken_Values = new EObjectWithInverseResolvingEList.ManyInverse<ForkedToken_baseToken_Value>(ForkedToken_baseToken_Value.class, this, StatesPackage.STATE__FORKED_TOKEN_BASE_TOKEN_VALUES, StatesPackage.FORKED_TOKEN_BASE_TOKEN_VALUE__STATES);
		}
		return forkedToken_baseToken_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlFlow_guard_Value> getControlFlow_guard_Values() {
		if (controlFlow_guard_Values == null) {
			controlFlow_guard_Values = new EObjectWithInverseResolvingEList.ManyInverse<ControlFlow_guard_Value>(ControlFlow_guard_Value.class, this, StatesPackage.STATE__CONTROL_FLOW_GUARD_VALUES, StatesPackage.CONTROL_FLOW_GUARD_VALUE__STATES);
		}
		return controlFlow_guard_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IntegerValue_value_Value> getIntegerValue_value_Values() {
		if (integerValue_value_Values == null) {
			integerValue_value_Values = new EObjectWithInverseResolvingEList.ManyInverse<IntegerValue_value_Value>(IntegerValue_value_Value.class, this, StatesPackage.STATE__INTEGER_VALUE_VALUE_VALUES, StatesPackage.INTEGER_VALUE_VALUE_VALUE__STATES);
		}
		return integerValue_value_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Offer_offeredTokens_Value> getOffer_offeredTokens_Values() {
		if (offer_offeredTokens_Values == null) {
			offer_offeredTokens_Values = new EObjectWithInverseResolvingEList.ManyInverse<Offer_offeredTokens_Value>(Offer_offeredTokens_Value.class, this, StatesPackage.STATE__OFFER_OFFERED_TOKENS_VALUES, StatesPackage.OFFER_OFFERED_TOKENS_VALUE__STATES);
		}
		return offer_offeredTokens_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IntegerCalculationExpression_assignee_Value> getIntegerCalculationExpression_assignee_Values() {
		if (integerCalculationExpression_assignee_Values == null) {
			integerCalculationExpression_assignee_Values = new EObjectWithInverseResolvingEList.ManyInverse<IntegerCalculationExpression_assignee_Value>(IntegerCalculationExpression_assignee_Value.class, this, StatesPackage.STATE__INTEGER_CALCULATION_EXPRESSION_ASSIGNEE_VALUES, StatesPackage.INTEGER_CALCULATION_EXPRESSION_ASSIGNEE_VALUE__STATES);
		}
		return integerCalculationExpression_assignee_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IntegerCalculationExpression_operator_Value> getIntegerCalculationExpression_operator_Values() {
		if (integerCalculationExpression_operator_Values == null) {
			integerCalculationExpression_operator_Values = new EObjectWithInverseResolvingEList.ManyInverse<IntegerCalculationExpression_operator_Value>(IntegerCalculationExpression_operator_Value.class, this, StatesPackage.STATE__INTEGER_CALCULATION_EXPRESSION_OPERATOR_VALUES, StatesPackage.INTEGER_CALCULATION_EXPRESSION_OPERATOR_VALUE__STATES);
		}
		return integerCalculationExpression_operator_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge_offers_Value> getActivityEdge_offers_Values() {
		if (activityEdge_offers_Values == null) {
			activityEdge_offers_Values = new EObjectWithInverseResolvingEList.ManyInverse<ActivityEdge_offers_Value>(ActivityEdge_offers_Value.class, this, StatesPackage.STATE__ACTIVITY_EDGE_OFFERS_VALUES, StatesPackage.ACTIVITY_EDGE_OFFERS_VALUE__STATES);
		}
		return activityEdge_offers_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge_target_Value> getActivityEdge_target_Values() {
		if (activityEdge_target_Values == null) {
			activityEdge_target_Values = new EObjectWithInverseResolvingEList.ManyInverse<ActivityEdge_target_Value>(ActivityEdge_target_Value.class, this, StatesPackage.STATE__ACTIVITY_EDGE_TARGET_VALUES, StatesPackage.ACTIVITY_EDGE_TARGET_VALUE__STATES);
		}
		return activityEdge_target_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge_source_Value> getActivityEdge_source_Values() {
		if (activityEdge_source_Values == null) {
			activityEdge_source_Values = new EObjectWithInverseResolvingEList.ManyInverse<ActivityEdge_source_Value>(ActivityEdge_source_Value.class, this, StatesPackage.STATE__ACTIVITY_EDGE_SOURCE_VALUES, StatesPackage.ACTIVITY_EDGE_SOURCE_VALUE__STATES);
		}
		return activityEdge_source_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BooleanExpression_assignee_Value> getBooleanExpression_assignee_Values() {
		if (booleanExpression_assignee_Values == null) {
			booleanExpression_assignee_Values = new EObjectWithInverseResolvingEList.ManyInverse<BooleanExpression_assignee_Value>(BooleanExpression_assignee_Value.class, this, StatesPackage.STATE__BOOLEAN_EXPRESSION_ASSIGNEE_VALUES, StatesPackage.BOOLEAN_EXPRESSION_ASSIGNEE_VALUE__STATES);
		}
		return booleanExpression_assignee_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable_name_Value> getVariable_name_Values() {
		if (variable_name_Values == null) {
			variable_name_Values = new EObjectWithInverseResolvingEList.ManyInverse<Variable_name_Value>(Variable_name_Value.class, this, StatesPackage.STATE__VARIABLE_NAME_VALUES, StatesPackage.VARIABLE_NAME_VALUE__STATES);
		}
		return variable_name_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable_currentValue_Value> getVariable_currentValue_Values() {
		if (variable_currentValue_Values == null) {
			variable_currentValue_Values = new EObjectWithInverseResolvingEList.ManyInverse<Variable_currentValue_Value>(Variable_currentValue_Value.class, this, StatesPackage.STATE__VARIABLE_CURRENT_VALUE_VALUES, StatesPackage.VARIABLE_CURRENT_VALUE_VALUE__STATES);
		}
		return variable_currentValue_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable_initialValue_Value> getVariable_initialValue_Values() {
		if (variable_initialValue_Values == null) {
			variable_initialValue_Values = new EObjectWithInverseResolvingEList.ManyInverse<Variable_initialValue_Value>(Variable_initialValue_Value.class, this, StatesPackage.STATE__VARIABLE_INITIAL_VALUE_VALUES, StatesPackage.VARIABLE_INITIAL_VALUE_VALUE__STATES);
		}
		return variable_initialValue_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IntegerComparisonExpression_operator_Value> getIntegerComparisonExpression_operator_Values() {
		if (integerComparisonExpression_operator_Values == null) {
			integerComparisonExpression_operator_Values = new EObjectWithInverseResolvingEList.ManyInverse<IntegerComparisonExpression_operator_Value>(IntegerComparisonExpression_operator_Value.class, this, StatesPackage.STATE__INTEGER_COMPARISON_EXPRESSION_OPERATOR_VALUES, StatesPackage.INTEGER_COMPARISON_EXPRESSION_OPERATOR_VALUE__STATES);
		}
		return integerComparisonExpression_operator_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IntegerComparisonExpression_assignee_Value> getIntegerComparisonExpression_assignee_Values() {
		if (integerComparisonExpression_assignee_Values == null) {
			integerComparisonExpression_assignee_Values = new EObjectWithInverseResolvingEList.ManyInverse<IntegerComparisonExpression_assignee_Value>(IntegerComparisonExpression_assignee_Value.class, this, StatesPackage.STATE__INTEGER_COMPARISON_EXPRESSION_ASSIGNEE_VALUES, StatesPackage.INTEGER_COMPARISON_EXPRESSION_ASSIGNEE_VALUE__STATES);
		}
		return integerComparisonExpression_assignee_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activity_trace_Value> getActivity_trace_Values() {
		if (activity_trace_Values == null) {
			activity_trace_Values = new EObjectWithInverseResolvingEList.ManyInverse<Activity_trace_Value>(Activity_trace_Value.class, this, StatesPackage.STATE__ACTIVITY_TRACE_VALUES, StatesPackage.ACTIVITY_TRACE_VALUE__STATES);
		}
		return activity_trace_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activity_edges_Value> getActivity_edges_Values() {
		if (activity_edges_Values == null) {
			activity_edges_Values = new EObjectWithInverseResolvingEList.ManyInverse<Activity_edges_Value>(Activity_edges_Value.class, this, StatesPackage.STATE__ACTIVITY_EDGES_VALUES, StatesPackage.ACTIVITY_EDGES_VALUE__STATES);
		}
		return activity_edges_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activity_inputs_Value> getActivity_inputs_Values() {
		if (activity_inputs_Values == null) {
			activity_inputs_Values = new EObjectWithInverseResolvingEList.ManyInverse<Activity_inputs_Value>(Activity_inputs_Value.class, this, StatesPackage.STATE__ACTIVITY_INPUTS_VALUES, StatesPackage.ACTIVITY_INPUTS_VALUE__STATES);
		}
		return activity_inputs_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activity_nodes_Value> getActivity_nodes_Values() {
		if (activity_nodes_Values == null) {
			activity_nodes_Values = new EObjectWithInverseResolvingEList.ManyInverse<Activity_nodes_Value>(Activity_nodes_Value.class, this, StatesPackage.STATE__ACTIVITY_NODES_VALUES, StatesPackage.ACTIVITY_NODES_VALUE__STATES);
		}
		return activity_nodes_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activity_locals_Value> getActivity_locals_Values() {
		if (activity_locals_Values == null) {
			activity_locals_Values = new EObjectWithInverseResolvingEList.ManyInverse<Activity_locals_Value>(Activity_locals_Value.class, this, StatesPackage.STATE__ACTIVITY_LOCALS_VALUES, StatesPackage.ACTIVITY_LOCALS_VALUE__STATES);
		}
		return activity_locals_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Token_holder_Value> getToken_holder_Values() {
		if (token_holder_Values == null) {
			token_holder_Values = new EObjectWithInverseResolvingEList.ManyInverse<Token_holder_Value>(Token_holder_Value.class, this, StatesPackage.STATE__TOKEN_HOLDER_VALUES, StatesPackage.TOKEN_HOLDER_VALUE__STATES);
		}
		return token_holder_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BooleanUnaryExpression_operator_Value> getBooleanUnaryExpression_operator_Values() {
		if (booleanUnaryExpression_operator_Values == null) {
			booleanUnaryExpression_operator_Values = new EObjectWithInverseResolvingEList.ManyInverse<BooleanUnaryExpression_operator_Value>(BooleanUnaryExpression_operator_Value.class, this, StatesPackage.STATE__BOOLEAN_UNARY_EXPRESSION_OPERATOR_VALUES, StatesPackage.BOOLEAN_UNARY_EXPRESSION_OPERATOR_VALUE__STATES);
		}
		return booleanUnaryExpression_operator_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BooleanUnaryExpression_operand_Value> getBooleanUnaryExpression_operand_Values() {
		if (booleanUnaryExpression_operand_Values == null) {
			booleanUnaryExpression_operand_Values = new EObjectWithInverseResolvingEList.ManyInverse<BooleanUnaryExpression_operand_Value>(BooleanUnaryExpression_operand_Value.class, this, StatesPackage.STATE__BOOLEAN_UNARY_EXPRESSION_OPERAND_VALUES, StatesPackage.BOOLEAN_UNARY_EXPRESSION_OPERAND_VALUE__STATES);
		}
		return booleanUnaryExpression_operand_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputValue_variable_Value> getInputValue_variable_Values() {
		if (inputValue_variable_Values == null) {
			inputValue_variable_Values = new EObjectWithInverseResolvingEList.ManyInverse<InputValue_variable_Value>(InputValue_variable_Value.class, this, StatesPackage.STATE__INPUT_VALUE_VARIABLE_VALUES, StatesPackage.INPUT_VALUE_VARIABLE_VALUE__STATES);
		}
		return inputValue_variable_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputValue_value_Value> getInputValue_value_Values() {
		if (inputValue_value_Values == null) {
			inputValue_value_Values = new EObjectWithInverseResolvingEList.ManyInverse<InputValue_value_Value>(InputValue_value_Value.class, this, StatesPackage.STATE__INPUT_VALUE_VALUE_VALUES, StatesPackage.INPUT_VALUE_VALUE_VALUE__STATES);
		}
		return inputValue_value_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trace_executedNodes_Value> getTrace_executedNodes_Values() {
		if (trace_executedNodes_Values == null) {
			trace_executedNodes_Values = new EObjectWithInverseResolvingEList.ManyInverse<Trace_executedNodes_Value>(Trace_executedNodes_Value.class, this, StatesPackage.STATE__TRACE_EXECUTED_NODES_VALUES, StatesPackage.TRACE_EXECUTED_NODES_VALUE__STATES);
		}
		return trace_executedNodes_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BooleanValue_value_Value> getBooleanValue_value_Values() {
		if (booleanValue_value_Values == null) {
			booleanValue_value_Values = new EObjectWithInverseResolvingEList.ManyInverse<BooleanValue_value_Value>(BooleanValue_value_Value.class, this, StatesPackage.STATE__BOOLEAN_VALUE_VALUE_VALUES, StatesPackage.BOOLEAN_VALUE_VALUE_VALUE__STATES);
		}
		return booleanValue_value_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNode_outgoing_Value> getActivityNode_outgoing_Values() {
		if (activityNode_outgoing_Values == null) {
			activityNode_outgoing_Values = new EObjectWithInverseResolvingEList.ManyInverse<ActivityNode_outgoing_Value>(ActivityNode_outgoing_Value.class, this, StatesPackage.STATE__ACTIVITY_NODE_OUTGOING_VALUES, StatesPackage.ACTIVITY_NODE_OUTGOING_VALUE__STATES);
		}
		return activityNode_outgoing_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNode_activity_Value> getActivityNode_activity_Values() {
		if (activityNode_activity_Values == null) {
			activityNode_activity_Values = new EObjectWithInverseResolvingEList.ManyInverse<ActivityNode_activity_Value>(ActivityNode_activity_Value.class, this, StatesPackage.STATE__ACTIVITY_NODE_ACTIVITY_VALUES, StatesPackage.ACTIVITY_NODE_ACTIVITY_VALUE__STATES);
		}
		return activityNode_activity_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNode_running_Value> getActivityNode_running_Values() {
		if (activityNode_running_Values == null) {
			activityNode_running_Values = new EObjectWithInverseResolvingEList.ManyInverse<ActivityNode_running_Value>(ActivityNode_running_Value.class, this, StatesPackage.STATE__ACTIVITY_NODE_RUNNING_VALUES, StatesPackage.ACTIVITY_NODE_RUNNING_VALUE__STATES);
		}
		return activityNode_running_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNode_incoming_Value> getActivityNode_incoming_Values() {
		if (activityNode_incoming_Values == null) {
			activityNode_incoming_Values = new EObjectWithInverseResolvingEList.ManyInverse<ActivityNode_incoming_Value>(ActivityNode_incoming_Value.class, this, StatesPackage.STATE__ACTIVITY_NODE_INCOMING_VALUES, StatesPackage.ACTIVITY_NODE_INCOMING_VALUE__STATES);
		}
		return activityNode_incoming_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNode_heldTokens_Value> getActivityNode_heldTokens_Values() {
		if (activityNode_heldTokens_Values == null) {
			activityNode_heldTokens_Values = new EObjectWithInverseResolvingEList.ManyInverse<ActivityNode_heldTokens_Value>(ActivityNode_heldTokens_Value.class, this, StatesPackage.STATE__ACTIVITY_NODE_HELD_TOKENS_VALUES, StatesPackage.ACTIVITY_NODE_HELD_TOKENS_VALUE__STATES);
		}
		return activityNode_heldTokens_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OpaqueAction_expressions_Value> getOpaqueAction_expressions_Values() {
		if (opaqueAction_expressions_Values == null) {
			opaqueAction_expressions_Values = new EObjectWithInverseResolvingEList.ManyInverse<OpaqueAction_expressions_Value>(OpaqueAction_expressions_Value.class, this, StatesPackage.STATE__OPAQUE_ACTION_EXPRESSIONS_VALUES, StatesPackage.OPAQUE_ACTION_EXPRESSIONS_VALUE__STATES);
		}
		return opaqueAction_expressions_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Input_inputValues_Value> getInput_inputValues_Values() {
		if (input_inputValues_Values == null) {
			input_inputValues_Values = new EObjectWithInverseResolvingEList.ManyInverse<Input_inputValues_Value>(Input_inputValues_Value.class, this, StatesPackage.STATE__INPUT_INPUT_VALUES_VALUES, StatesPackage.INPUT_INPUT_VALUES_VALUE__STATES);
		}
		return input_inputValues_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement_name_Value> getNamedElement_name_Values() {
		if (namedElement_name_Values == null) {
			namedElement_name_Values = new EObjectWithInverseResolvingEList.ManyInverse<NamedElement_name_Value>(NamedElement_name_Value.class, this, StatesPackage.STATE__NAMED_ELEMENT_NAME_VALUES, StatesPackage.NAMED_ELEMENT_NAME_VALUE__STATES);
		}
		return namedElement_name_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BooleanBinaryExpression_operand1_Value> getBooleanBinaryExpression_operand1_Values() {
		if (booleanBinaryExpression_operand1_Values == null) {
			booleanBinaryExpression_operand1_Values = new EObjectWithInverseResolvingEList.ManyInverse<BooleanBinaryExpression_operand1_Value>(BooleanBinaryExpression_operand1_Value.class, this, StatesPackage.STATE__BOOLEAN_BINARY_EXPRESSION_OPERAND1_VALUES, StatesPackage.BOOLEAN_BINARY_EXPRESSION_OPERAND1_VALUE__STATES);
		}
		return booleanBinaryExpression_operand1_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BooleanBinaryExpression_operator_Value> getBooleanBinaryExpression_operator_Values() {
		if (booleanBinaryExpression_operator_Values == null) {
			booleanBinaryExpression_operator_Values = new EObjectWithInverseResolvingEList.ManyInverse<BooleanBinaryExpression_operator_Value>(BooleanBinaryExpression_operator_Value.class, this, StatesPackage.STATE__BOOLEAN_BINARY_EXPRESSION_OPERATOR_VALUES, StatesPackage.BOOLEAN_BINARY_EXPRESSION_OPERATOR_VALUE__STATES);
		}
		return booleanBinaryExpression_operator_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BooleanBinaryExpression_operand2_Value> getBooleanBinaryExpression_operand2_Values() {
		if (booleanBinaryExpression_operand2_Values == null) {
			booleanBinaryExpression_operand2_Values = new EObjectWithInverseResolvingEList.ManyInverse<BooleanBinaryExpression_operand2_Value>(BooleanBinaryExpression_operand2_Value.class, this, StatesPackage.STATE__BOOLEAN_BINARY_EXPRESSION_OPERAND2_VALUES, StatesPackage.BOOLEAN_BINARY_EXPRESSION_OPERAND2_VALUE__STATES);
		}
		return booleanBinaryExpression_operand2_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatesPackage.STATE__STARTED_STEPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStartedSteps()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__ENDED_STEPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEndedSteps()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__INTEGER_EXPRESSION_OPERAND2_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIntegerExpression_operand2_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__INTEGER_EXPRESSION_OPERAND1_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIntegerExpression_operand1_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getForkedToken_remainingOffersCount_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__FORKED_TOKEN_BASE_TOKEN_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getForkedToken_baseToken_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__CONTROL_FLOW_GUARD_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getControlFlow_guard_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__INTEGER_VALUE_VALUE_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIntegerValue_value_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__OFFER_OFFERED_TOKENS_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOffer_offeredTokens_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__INTEGER_CALCULATION_EXPRESSION_ASSIGNEE_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIntegerCalculationExpression_assignee_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__INTEGER_CALCULATION_EXPRESSION_OPERATOR_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIntegerCalculationExpression_operator_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__ACTIVITY_EDGE_OFFERS_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivityEdge_offers_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__ACTIVITY_EDGE_TARGET_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivityEdge_target_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__ACTIVITY_EDGE_SOURCE_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivityEdge_source_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__BOOLEAN_EXPRESSION_ASSIGNEE_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBooleanExpression_assignee_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__VARIABLE_NAME_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVariable_name_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__VARIABLE_CURRENT_VALUE_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVariable_currentValue_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__VARIABLE_INITIAL_VALUE_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVariable_initialValue_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__INTEGER_COMPARISON_EXPRESSION_OPERATOR_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIntegerComparisonExpression_operator_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__INTEGER_COMPARISON_EXPRESSION_ASSIGNEE_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIntegerComparisonExpression_assignee_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__ACTIVITY_TRACE_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivity_trace_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__ACTIVITY_EDGES_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivity_edges_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__ACTIVITY_INPUTS_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivity_inputs_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__ACTIVITY_NODES_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivity_nodes_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__ACTIVITY_LOCALS_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivity_locals_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__TOKEN_HOLDER_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getToken_holder_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__BOOLEAN_UNARY_EXPRESSION_OPERATOR_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBooleanUnaryExpression_operator_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__BOOLEAN_UNARY_EXPRESSION_OPERAND_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBooleanUnaryExpression_operand_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__INPUT_VALUE_VARIABLE_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInputValue_variable_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__INPUT_VALUE_VALUE_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInputValue_value_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__TRACE_EXECUTED_NODES_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTrace_executedNodes_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__BOOLEAN_VALUE_VALUE_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBooleanValue_value_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__ACTIVITY_NODE_OUTGOING_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivityNode_outgoing_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__ACTIVITY_NODE_ACTIVITY_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivityNode_activity_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__ACTIVITY_NODE_RUNNING_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivityNode_running_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__ACTIVITY_NODE_INCOMING_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivityNode_incoming_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__ACTIVITY_NODE_HELD_TOKENS_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivityNode_heldTokens_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__OPAQUE_ACTION_EXPRESSIONS_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOpaqueAction_expressions_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__INPUT_INPUT_VALUES_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInput_inputValues_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__NAMED_ELEMENT_NAME_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNamedElement_name_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__BOOLEAN_BINARY_EXPRESSION_OPERAND1_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBooleanBinaryExpression_operand1_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__BOOLEAN_BINARY_EXPRESSION_OPERATOR_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBooleanBinaryExpression_operator_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__BOOLEAN_BINARY_EXPRESSION_OPERAND2_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBooleanBinaryExpression_operand2_Values()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatesPackage.STATE__STARTED_STEPS:
				return ((InternalEList<?>)getStartedSteps()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__ENDED_STEPS:
				return ((InternalEList<?>)getEndedSteps()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__INTEGER_EXPRESSION_OPERAND2_VALUES:
				return ((InternalEList<?>)getIntegerExpression_operand2_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__INTEGER_EXPRESSION_OPERAND1_VALUES:
				return ((InternalEList<?>)getIntegerExpression_operand1_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUES:
				return ((InternalEList<?>)getForkedToken_remainingOffersCount_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__FORKED_TOKEN_BASE_TOKEN_VALUES:
				return ((InternalEList<?>)getForkedToken_baseToken_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__CONTROL_FLOW_GUARD_VALUES:
				return ((InternalEList<?>)getControlFlow_guard_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__INTEGER_VALUE_VALUE_VALUES:
				return ((InternalEList<?>)getIntegerValue_value_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__OFFER_OFFERED_TOKENS_VALUES:
				return ((InternalEList<?>)getOffer_offeredTokens_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__INTEGER_CALCULATION_EXPRESSION_ASSIGNEE_VALUES:
				return ((InternalEList<?>)getIntegerCalculationExpression_assignee_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__INTEGER_CALCULATION_EXPRESSION_OPERATOR_VALUES:
				return ((InternalEList<?>)getIntegerCalculationExpression_operator_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__ACTIVITY_EDGE_OFFERS_VALUES:
				return ((InternalEList<?>)getActivityEdge_offers_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__ACTIVITY_EDGE_TARGET_VALUES:
				return ((InternalEList<?>)getActivityEdge_target_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__ACTIVITY_EDGE_SOURCE_VALUES:
				return ((InternalEList<?>)getActivityEdge_source_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__BOOLEAN_EXPRESSION_ASSIGNEE_VALUES:
				return ((InternalEList<?>)getBooleanExpression_assignee_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__VARIABLE_NAME_VALUES:
				return ((InternalEList<?>)getVariable_name_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__VARIABLE_CURRENT_VALUE_VALUES:
				return ((InternalEList<?>)getVariable_currentValue_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__VARIABLE_INITIAL_VALUE_VALUES:
				return ((InternalEList<?>)getVariable_initialValue_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__INTEGER_COMPARISON_EXPRESSION_OPERATOR_VALUES:
				return ((InternalEList<?>)getIntegerComparisonExpression_operator_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__INTEGER_COMPARISON_EXPRESSION_ASSIGNEE_VALUES:
				return ((InternalEList<?>)getIntegerComparisonExpression_assignee_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__ACTIVITY_TRACE_VALUES:
				return ((InternalEList<?>)getActivity_trace_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__ACTIVITY_EDGES_VALUES:
				return ((InternalEList<?>)getActivity_edges_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__ACTIVITY_INPUTS_VALUES:
				return ((InternalEList<?>)getActivity_inputs_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__ACTIVITY_NODES_VALUES:
				return ((InternalEList<?>)getActivity_nodes_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__ACTIVITY_LOCALS_VALUES:
				return ((InternalEList<?>)getActivity_locals_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__TOKEN_HOLDER_VALUES:
				return ((InternalEList<?>)getToken_holder_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__BOOLEAN_UNARY_EXPRESSION_OPERATOR_VALUES:
				return ((InternalEList<?>)getBooleanUnaryExpression_operator_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__BOOLEAN_UNARY_EXPRESSION_OPERAND_VALUES:
				return ((InternalEList<?>)getBooleanUnaryExpression_operand_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__INPUT_VALUE_VARIABLE_VALUES:
				return ((InternalEList<?>)getInputValue_variable_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__INPUT_VALUE_VALUE_VALUES:
				return ((InternalEList<?>)getInputValue_value_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__TRACE_EXECUTED_NODES_VALUES:
				return ((InternalEList<?>)getTrace_executedNodes_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__BOOLEAN_VALUE_VALUE_VALUES:
				return ((InternalEList<?>)getBooleanValue_value_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__ACTIVITY_NODE_OUTGOING_VALUES:
				return ((InternalEList<?>)getActivityNode_outgoing_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__ACTIVITY_NODE_ACTIVITY_VALUES:
				return ((InternalEList<?>)getActivityNode_activity_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__ACTIVITY_NODE_RUNNING_VALUES:
				return ((InternalEList<?>)getActivityNode_running_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__ACTIVITY_NODE_INCOMING_VALUES:
				return ((InternalEList<?>)getActivityNode_incoming_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__ACTIVITY_NODE_HELD_TOKENS_VALUES:
				return ((InternalEList<?>)getActivityNode_heldTokens_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__OPAQUE_ACTION_EXPRESSIONS_VALUES:
				return ((InternalEList<?>)getOpaqueAction_expressions_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__INPUT_INPUT_VALUES_VALUES:
				return ((InternalEList<?>)getInput_inputValues_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__NAMED_ELEMENT_NAME_VALUES:
				return ((InternalEList<?>)getNamedElement_name_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__BOOLEAN_BINARY_EXPRESSION_OPERAND1_VALUES:
				return ((InternalEList<?>)getBooleanBinaryExpression_operand1_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__BOOLEAN_BINARY_EXPRESSION_OPERATOR_VALUES:
				return ((InternalEList<?>)getBooleanBinaryExpression_operator_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__BOOLEAN_BINARY_EXPRESSION_OPERAND2_VALUES:
				return ((InternalEList<?>)getBooleanBinaryExpression_operand2_Values()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StatesPackage.STATE__STARTED_STEPS:
				return getStartedSteps();
			case StatesPackage.STATE__ENDED_STEPS:
				return getEndedSteps();
			case StatesPackage.STATE__INTEGER_EXPRESSION_OPERAND2_VALUES:
				return getIntegerExpression_operand2_Values();
			case StatesPackage.STATE__INTEGER_EXPRESSION_OPERAND1_VALUES:
				return getIntegerExpression_operand1_Values();
			case StatesPackage.STATE__FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUES:
				return getForkedToken_remainingOffersCount_Values();
			case StatesPackage.STATE__FORKED_TOKEN_BASE_TOKEN_VALUES:
				return getForkedToken_baseToken_Values();
			case StatesPackage.STATE__CONTROL_FLOW_GUARD_VALUES:
				return getControlFlow_guard_Values();
			case StatesPackage.STATE__INTEGER_VALUE_VALUE_VALUES:
				return getIntegerValue_value_Values();
			case StatesPackage.STATE__OFFER_OFFERED_TOKENS_VALUES:
				return getOffer_offeredTokens_Values();
			case StatesPackage.STATE__INTEGER_CALCULATION_EXPRESSION_ASSIGNEE_VALUES:
				return getIntegerCalculationExpression_assignee_Values();
			case StatesPackage.STATE__INTEGER_CALCULATION_EXPRESSION_OPERATOR_VALUES:
				return getIntegerCalculationExpression_operator_Values();
			case StatesPackage.STATE__ACTIVITY_EDGE_OFFERS_VALUES:
				return getActivityEdge_offers_Values();
			case StatesPackage.STATE__ACTIVITY_EDGE_TARGET_VALUES:
				return getActivityEdge_target_Values();
			case StatesPackage.STATE__ACTIVITY_EDGE_SOURCE_VALUES:
				return getActivityEdge_source_Values();
			case StatesPackage.STATE__BOOLEAN_EXPRESSION_ASSIGNEE_VALUES:
				return getBooleanExpression_assignee_Values();
			case StatesPackage.STATE__VARIABLE_NAME_VALUES:
				return getVariable_name_Values();
			case StatesPackage.STATE__VARIABLE_CURRENT_VALUE_VALUES:
				return getVariable_currentValue_Values();
			case StatesPackage.STATE__VARIABLE_INITIAL_VALUE_VALUES:
				return getVariable_initialValue_Values();
			case StatesPackage.STATE__INTEGER_COMPARISON_EXPRESSION_OPERATOR_VALUES:
				return getIntegerComparisonExpression_operator_Values();
			case StatesPackage.STATE__INTEGER_COMPARISON_EXPRESSION_ASSIGNEE_VALUES:
				return getIntegerComparisonExpression_assignee_Values();
			case StatesPackage.STATE__ACTIVITY_TRACE_VALUES:
				return getActivity_trace_Values();
			case StatesPackage.STATE__ACTIVITY_EDGES_VALUES:
				return getActivity_edges_Values();
			case StatesPackage.STATE__ACTIVITY_INPUTS_VALUES:
				return getActivity_inputs_Values();
			case StatesPackage.STATE__ACTIVITY_NODES_VALUES:
				return getActivity_nodes_Values();
			case StatesPackage.STATE__ACTIVITY_LOCALS_VALUES:
				return getActivity_locals_Values();
			case StatesPackage.STATE__TOKEN_HOLDER_VALUES:
				return getToken_holder_Values();
			case StatesPackage.STATE__BOOLEAN_UNARY_EXPRESSION_OPERATOR_VALUES:
				return getBooleanUnaryExpression_operator_Values();
			case StatesPackage.STATE__BOOLEAN_UNARY_EXPRESSION_OPERAND_VALUES:
				return getBooleanUnaryExpression_operand_Values();
			case StatesPackage.STATE__INPUT_VALUE_VARIABLE_VALUES:
				return getInputValue_variable_Values();
			case StatesPackage.STATE__INPUT_VALUE_VALUE_VALUES:
				return getInputValue_value_Values();
			case StatesPackage.STATE__TRACE_EXECUTED_NODES_VALUES:
				return getTrace_executedNodes_Values();
			case StatesPackage.STATE__BOOLEAN_VALUE_VALUE_VALUES:
				return getBooleanValue_value_Values();
			case StatesPackage.STATE__ACTIVITY_NODE_OUTGOING_VALUES:
				return getActivityNode_outgoing_Values();
			case StatesPackage.STATE__ACTIVITY_NODE_ACTIVITY_VALUES:
				return getActivityNode_activity_Values();
			case StatesPackage.STATE__ACTIVITY_NODE_RUNNING_VALUES:
				return getActivityNode_running_Values();
			case StatesPackage.STATE__ACTIVITY_NODE_INCOMING_VALUES:
				return getActivityNode_incoming_Values();
			case StatesPackage.STATE__ACTIVITY_NODE_HELD_TOKENS_VALUES:
				return getActivityNode_heldTokens_Values();
			case StatesPackage.STATE__OPAQUE_ACTION_EXPRESSIONS_VALUES:
				return getOpaqueAction_expressions_Values();
			case StatesPackage.STATE__INPUT_INPUT_VALUES_VALUES:
				return getInput_inputValues_Values();
			case StatesPackage.STATE__NAMED_ELEMENT_NAME_VALUES:
				return getNamedElement_name_Values();
			case StatesPackage.STATE__BOOLEAN_BINARY_EXPRESSION_OPERAND1_VALUES:
				return getBooleanBinaryExpression_operand1_Values();
			case StatesPackage.STATE__BOOLEAN_BINARY_EXPRESSION_OPERATOR_VALUES:
				return getBooleanBinaryExpression_operator_Values();
			case StatesPackage.STATE__BOOLEAN_BINARY_EXPRESSION_OPERAND2_VALUES:
				return getBooleanBinaryExpression_operand2_Values();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StatesPackage.STATE__STARTED_STEPS:
				getStartedSteps().clear();
				getStartedSteps().addAll((Collection<? extends Step>)newValue);
				return;
			case StatesPackage.STATE__ENDED_STEPS:
				getEndedSteps().clear();
				getEndedSteps().addAll((Collection<? extends Step>)newValue);
				return;
			case StatesPackage.STATE__INTEGER_EXPRESSION_OPERAND2_VALUES:
				getIntegerExpression_operand2_Values().clear();
				getIntegerExpression_operand2_Values().addAll((Collection<? extends IntegerExpression_operand2_Value>)newValue);
				return;
			case StatesPackage.STATE__INTEGER_EXPRESSION_OPERAND1_VALUES:
				getIntegerExpression_operand1_Values().clear();
				getIntegerExpression_operand1_Values().addAll((Collection<? extends IntegerExpression_operand1_Value>)newValue);
				return;
			case StatesPackage.STATE__FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUES:
				getForkedToken_remainingOffersCount_Values().clear();
				getForkedToken_remainingOffersCount_Values().addAll((Collection<? extends ForkedToken_remainingOffersCount_Value>)newValue);
				return;
			case StatesPackage.STATE__FORKED_TOKEN_BASE_TOKEN_VALUES:
				getForkedToken_baseToken_Values().clear();
				getForkedToken_baseToken_Values().addAll((Collection<? extends ForkedToken_baseToken_Value>)newValue);
				return;
			case StatesPackage.STATE__CONTROL_FLOW_GUARD_VALUES:
				getControlFlow_guard_Values().clear();
				getControlFlow_guard_Values().addAll((Collection<? extends ControlFlow_guard_Value>)newValue);
				return;
			case StatesPackage.STATE__INTEGER_VALUE_VALUE_VALUES:
				getIntegerValue_value_Values().clear();
				getIntegerValue_value_Values().addAll((Collection<? extends IntegerValue_value_Value>)newValue);
				return;
			case StatesPackage.STATE__OFFER_OFFERED_TOKENS_VALUES:
				getOffer_offeredTokens_Values().clear();
				getOffer_offeredTokens_Values().addAll((Collection<? extends Offer_offeredTokens_Value>)newValue);
				return;
			case StatesPackage.STATE__INTEGER_CALCULATION_EXPRESSION_ASSIGNEE_VALUES:
				getIntegerCalculationExpression_assignee_Values().clear();
				getIntegerCalculationExpression_assignee_Values().addAll((Collection<? extends IntegerCalculationExpression_assignee_Value>)newValue);
				return;
			case StatesPackage.STATE__INTEGER_CALCULATION_EXPRESSION_OPERATOR_VALUES:
				getIntegerCalculationExpression_operator_Values().clear();
				getIntegerCalculationExpression_operator_Values().addAll((Collection<? extends IntegerCalculationExpression_operator_Value>)newValue);
				return;
			case StatesPackage.STATE__ACTIVITY_EDGE_OFFERS_VALUES:
				getActivityEdge_offers_Values().clear();
				getActivityEdge_offers_Values().addAll((Collection<? extends ActivityEdge_offers_Value>)newValue);
				return;
			case StatesPackage.STATE__ACTIVITY_EDGE_TARGET_VALUES:
				getActivityEdge_target_Values().clear();
				getActivityEdge_target_Values().addAll((Collection<? extends ActivityEdge_target_Value>)newValue);
				return;
			case StatesPackage.STATE__ACTIVITY_EDGE_SOURCE_VALUES:
				getActivityEdge_source_Values().clear();
				getActivityEdge_source_Values().addAll((Collection<? extends ActivityEdge_source_Value>)newValue);
				return;
			case StatesPackage.STATE__BOOLEAN_EXPRESSION_ASSIGNEE_VALUES:
				getBooleanExpression_assignee_Values().clear();
				getBooleanExpression_assignee_Values().addAll((Collection<? extends BooleanExpression_assignee_Value>)newValue);
				return;
			case StatesPackage.STATE__VARIABLE_NAME_VALUES:
				getVariable_name_Values().clear();
				getVariable_name_Values().addAll((Collection<? extends Variable_name_Value>)newValue);
				return;
			case StatesPackage.STATE__VARIABLE_CURRENT_VALUE_VALUES:
				getVariable_currentValue_Values().clear();
				getVariable_currentValue_Values().addAll((Collection<? extends Variable_currentValue_Value>)newValue);
				return;
			case StatesPackage.STATE__VARIABLE_INITIAL_VALUE_VALUES:
				getVariable_initialValue_Values().clear();
				getVariable_initialValue_Values().addAll((Collection<? extends Variable_initialValue_Value>)newValue);
				return;
			case StatesPackage.STATE__INTEGER_COMPARISON_EXPRESSION_OPERATOR_VALUES:
				getIntegerComparisonExpression_operator_Values().clear();
				getIntegerComparisonExpression_operator_Values().addAll((Collection<? extends IntegerComparisonExpression_operator_Value>)newValue);
				return;
			case StatesPackage.STATE__INTEGER_COMPARISON_EXPRESSION_ASSIGNEE_VALUES:
				getIntegerComparisonExpression_assignee_Values().clear();
				getIntegerComparisonExpression_assignee_Values().addAll((Collection<? extends IntegerComparisonExpression_assignee_Value>)newValue);
				return;
			case StatesPackage.STATE__ACTIVITY_TRACE_VALUES:
				getActivity_trace_Values().clear();
				getActivity_trace_Values().addAll((Collection<? extends Activity_trace_Value>)newValue);
				return;
			case StatesPackage.STATE__ACTIVITY_EDGES_VALUES:
				getActivity_edges_Values().clear();
				getActivity_edges_Values().addAll((Collection<? extends Activity_edges_Value>)newValue);
				return;
			case StatesPackage.STATE__ACTIVITY_INPUTS_VALUES:
				getActivity_inputs_Values().clear();
				getActivity_inputs_Values().addAll((Collection<? extends Activity_inputs_Value>)newValue);
				return;
			case StatesPackage.STATE__ACTIVITY_NODES_VALUES:
				getActivity_nodes_Values().clear();
				getActivity_nodes_Values().addAll((Collection<? extends Activity_nodes_Value>)newValue);
				return;
			case StatesPackage.STATE__ACTIVITY_LOCALS_VALUES:
				getActivity_locals_Values().clear();
				getActivity_locals_Values().addAll((Collection<? extends Activity_locals_Value>)newValue);
				return;
			case StatesPackage.STATE__TOKEN_HOLDER_VALUES:
				getToken_holder_Values().clear();
				getToken_holder_Values().addAll((Collection<? extends Token_holder_Value>)newValue);
				return;
			case StatesPackage.STATE__BOOLEAN_UNARY_EXPRESSION_OPERATOR_VALUES:
				getBooleanUnaryExpression_operator_Values().clear();
				getBooleanUnaryExpression_operator_Values().addAll((Collection<? extends BooleanUnaryExpression_operator_Value>)newValue);
				return;
			case StatesPackage.STATE__BOOLEAN_UNARY_EXPRESSION_OPERAND_VALUES:
				getBooleanUnaryExpression_operand_Values().clear();
				getBooleanUnaryExpression_operand_Values().addAll((Collection<? extends BooleanUnaryExpression_operand_Value>)newValue);
				return;
			case StatesPackage.STATE__INPUT_VALUE_VARIABLE_VALUES:
				getInputValue_variable_Values().clear();
				getInputValue_variable_Values().addAll((Collection<? extends InputValue_variable_Value>)newValue);
				return;
			case StatesPackage.STATE__INPUT_VALUE_VALUE_VALUES:
				getInputValue_value_Values().clear();
				getInputValue_value_Values().addAll((Collection<? extends InputValue_value_Value>)newValue);
				return;
			case StatesPackage.STATE__TRACE_EXECUTED_NODES_VALUES:
				getTrace_executedNodes_Values().clear();
				getTrace_executedNodes_Values().addAll((Collection<? extends Trace_executedNodes_Value>)newValue);
				return;
			case StatesPackage.STATE__BOOLEAN_VALUE_VALUE_VALUES:
				getBooleanValue_value_Values().clear();
				getBooleanValue_value_Values().addAll((Collection<? extends BooleanValue_value_Value>)newValue);
				return;
			case StatesPackage.STATE__ACTIVITY_NODE_OUTGOING_VALUES:
				getActivityNode_outgoing_Values().clear();
				getActivityNode_outgoing_Values().addAll((Collection<? extends ActivityNode_outgoing_Value>)newValue);
				return;
			case StatesPackage.STATE__ACTIVITY_NODE_ACTIVITY_VALUES:
				getActivityNode_activity_Values().clear();
				getActivityNode_activity_Values().addAll((Collection<? extends ActivityNode_activity_Value>)newValue);
				return;
			case StatesPackage.STATE__ACTIVITY_NODE_RUNNING_VALUES:
				getActivityNode_running_Values().clear();
				getActivityNode_running_Values().addAll((Collection<? extends ActivityNode_running_Value>)newValue);
				return;
			case StatesPackage.STATE__ACTIVITY_NODE_INCOMING_VALUES:
				getActivityNode_incoming_Values().clear();
				getActivityNode_incoming_Values().addAll((Collection<? extends ActivityNode_incoming_Value>)newValue);
				return;
			case StatesPackage.STATE__ACTIVITY_NODE_HELD_TOKENS_VALUES:
				getActivityNode_heldTokens_Values().clear();
				getActivityNode_heldTokens_Values().addAll((Collection<? extends ActivityNode_heldTokens_Value>)newValue);
				return;
			case StatesPackage.STATE__OPAQUE_ACTION_EXPRESSIONS_VALUES:
				getOpaqueAction_expressions_Values().clear();
				getOpaqueAction_expressions_Values().addAll((Collection<? extends OpaqueAction_expressions_Value>)newValue);
				return;
			case StatesPackage.STATE__INPUT_INPUT_VALUES_VALUES:
				getInput_inputValues_Values().clear();
				getInput_inputValues_Values().addAll((Collection<? extends Input_inputValues_Value>)newValue);
				return;
			case StatesPackage.STATE__NAMED_ELEMENT_NAME_VALUES:
				getNamedElement_name_Values().clear();
				getNamedElement_name_Values().addAll((Collection<? extends NamedElement_name_Value>)newValue);
				return;
			case StatesPackage.STATE__BOOLEAN_BINARY_EXPRESSION_OPERAND1_VALUES:
				getBooleanBinaryExpression_operand1_Values().clear();
				getBooleanBinaryExpression_operand1_Values().addAll((Collection<? extends BooleanBinaryExpression_operand1_Value>)newValue);
				return;
			case StatesPackage.STATE__BOOLEAN_BINARY_EXPRESSION_OPERATOR_VALUES:
				getBooleanBinaryExpression_operator_Values().clear();
				getBooleanBinaryExpression_operator_Values().addAll((Collection<? extends BooleanBinaryExpression_operator_Value>)newValue);
				return;
			case StatesPackage.STATE__BOOLEAN_BINARY_EXPRESSION_OPERAND2_VALUES:
				getBooleanBinaryExpression_operand2_Values().clear();
				getBooleanBinaryExpression_operand2_Values().addAll((Collection<? extends BooleanBinaryExpression_operand2_Value>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StatesPackage.STATE__STARTED_STEPS:
				getStartedSteps().clear();
				return;
			case StatesPackage.STATE__ENDED_STEPS:
				getEndedSteps().clear();
				return;
			case StatesPackage.STATE__INTEGER_EXPRESSION_OPERAND2_VALUES:
				getIntegerExpression_operand2_Values().clear();
				return;
			case StatesPackage.STATE__INTEGER_EXPRESSION_OPERAND1_VALUES:
				getIntegerExpression_operand1_Values().clear();
				return;
			case StatesPackage.STATE__FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUES:
				getForkedToken_remainingOffersCount_Values().clear();
				return;
			case StatesPackage.STATE__FORKED_TOKEN_BASE_TOKEN_VALUES:
				getForkedToken_baseToken_Values().clear();
				return;
			case StatesPackage.STATE__CONTROL_FLOW_GUARD_VALUES:
				getControlFlow_guard_Values().clear();
				return;
			case StatesPackage.STATE__INTEGER_VALUE_VALUE_VALUES:
				getIntegerValue_value_Values().clear();
				return;
			case StatesPackage.STATE__OFFER_OFFERED_TOKENS_VALUES:
				getOffer_offeredTokens_Values().clear();
				return;
			case StatesPackage.STATE__INTEGER_CALCULATION_EXPRESSION_ASSIGNEE_VALUES:
				getIntegerCalculationExpression_assignee_Values().clear();
				return;
			case StatesPackage.STATE__INTEGER_CALCULATION_EXPRESSION_OPERATOR_VALUES:
				getIntegerCalculationExpression_operator_Values().clear();
				return;
			case StatesPackage.STATE__ACTIVITY_EDGE_OFFERS_VALUES:
				getActivityEdge_offers_Values().clear();
				return;
			case StatesPackage.STATE__ACTIVITY_EDGE_TARGET_VALUES:
				getActivityEdge_target_Values().clear();
				return;
			case StatesPackage.STATE__ACTIVITY_EDGE_SOURCE_VALUES:
				getActivityEdge_source_Values().clear();
				return;
			case StatesPackage.STATE__BOOLEAN_EXPRESSION_ASSIGNEE_VALUES:
				getBooleanExpression_assignee_Values().clear();
				return;
			case StatesPackage.STATE__VARIABLE_NAME_VALUES:
				getVariable_name_Values().clear();
				return;
			case StatesPackage.STATE__VARIABLE_CURRENT_VALUE_VALUES:
				getVariable_currentValue_Values().clear();
				return;
			case StatesPackage.STATE__VARIABLE_INITIAL_VALUE_VALUES:
				getVariable_initialValue_Values().clear();
				return;
			case StatesPackage.STATE__INTEGER_COMPARISON_EXPRESSION_OPERATOR_VALUES:
				getIntegerComparisonExpression_operator_Values().clear();
				return;
			case StatesPackage.STATE__INTEGER_COMPARISON_EXPRESSION_ASSIGNEE_VALUES:
				getIntegerComparisonExpression_assignee_Values().clear();
				return;
			case StatesPackage.STATE__ACTIVITY_TRACE_VALUES:
				getActivity_trace_Values().clear();
				return;
			case StatesPackage.STATE__ACTIVITY_EDGES_VALUES:
				getActivity_edges_Values().clear();
				return;
			case StatesPackage.STATE__ACTIVITY_INPUTS_VALUES:
				getActivity_inputs_Values().clear();
				return;
			case StatesPackage.STATE__ACTIVITY_NODES_VALUES:
				getActivity_nodes_Values().clear();
				return;
			case StatesPackage.STATE__ACTIVITY_LOCALS_VALUES:
				getActivity_locals_Values().clear();
				return;
			case StatesPackage.STATE__TOKEN_HOLDER_VALUES:
				getToken_holder_Values().clear();
				return;
			case StatesPackage.STATE__BOOLEAN_UNARY_EXPRESSION_OPERATOR_VALUES:
				getBooleanUnaryExpression_operator_Values().clear();
				return;
			case StatesPackage.STATE__BOOLEAN_UNARY_EXPRESSION_OPERAND_VALUES:
				getBooleanUnaryExpression_operand_Values().clear();
				return;
			case StatesPackage.STATE__INPUT_VALUE_VARIABLE_VALUES:
				getInputValue_variable_Values().clear();
				return;
			case StatesPackage.STATE__INPUT_VALUE_VALUE_VALUES:
				getInputValue_value_Values().clear();
				return;
			case StatesPackage.STATE__TRACE_EXECUTED_NODES_VALUES:
				getTrace_executedNodes_Values().clear();
				return;
			case StatesPackage.STATE__BOOLEAN_VALUE_VALUE_VALUES:
				getBooleanValue_value_Values().clear();
				return;
			case StatesPackage.STATE__ACTIVITY_NODE_OUTGOING_VALUES:
				getActivityNode_outgoing_Values().clear();
				return;
			case StatesPackage.STATE__ACTIVITY_NODE_ACTIVITY_VALUES:
				getActivityNode_activity_Values().clear();
				return;
			case StatesPackage.STATE__ACTIVITY_NODE_RUNNING_VALUES:
				getActivityNode_running_Values().clear();
				return;
			case StatesPackage.STATE__ACTIVITY_NODE_INCOMING_VALUES:
				getActivityNode_incoming_Values().clear();
				return;
			case StatesPackage.STATE__ACTIVITY_NODE_HELD_TOKENS_VALUES:
				getActivityNode_heldTokens_Values().clear();
				return;
			case StatesPackage.STATE__OPAQUE_ACTION_EXPRESSIONS_VALUES:
				getOpaqueAction_expressions_Values().clear();
				return;
			case StatesPackage.STATE__INPUT_INPUT_VALUES_VALUES:
				getInput_inputValues_Values().clear();
				return;
			case StatesPackage.STATE__NAMED_ELEMENT_NAME_VALUES:
				getNamedElement_name_Values().clear();
				return;
			case StatesPackage.STATE__BOOLEAN_BINARY_EXPRESSION_OPERAND1_VALUES:
				getBooleanBinaryExpression_operand1_Values().clear();
				return;
			case StatesPackage.STATE__BOOLEAN_BINARY_EXPRESSION_OPERATOR_VALUES:
				getBooleanBinaryExpression_operator_Values().clear();
				return;
			case StatesPackage.STATE__BOOLEAN_BINARY_EXPRESSION_OPERAND2_VALUES:
				getBooleanBinaryExpression_operand2_Values().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StatesPackage.STATE__STARTED_STEPS:
				return startedSteps != null && !startedSteps.isEmpty();
			case StatesPackage.STATE__ENDED_STEPS:
				return endedSteps != null && !endedSteps.isEmpty();
			case StatesPackage.STATE__INTEGER_EXPRESSION_OPERAND2_VALUES:
				return integerExpression_operand2_Values != null && !integerExpression_operand2_Values.isEmpty();
			case StatesPackage.STATE__INTEGER_EXPRESSION_OPERAND1_VALUES:
				return integerExpression_operand1_Values != null && !integerExpression_operand1_Values.isEmpty();
			case StatesPackage.STATE__FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUES:
				return forkedToken_remainingOffersCount_Values != null && !forkedToken_remainingOffersCount_Values.isEmpty();
			case StatesPackage.STATE__FORKED_TOKEN_BASE_TOKEN_VALUES:
				return forkedToken_baseToken_Values != null && !forkedToken_baseToken_Values.isEmpty();
			case StatesPackage.STATE__CONTROL_FLOW_GUARD_VALUES:
				return controlFlow_guard_Values != null && !controlFlow_guard_Values.isEmpty();
			case StatesPackage.STATE__INTEGER_VALUE_VALUE_VALUES:
				return integerValue_value_Values != null && !integerValue_value_Values.isEmpty();
			case StatesPackage.STATE__OFFER_OFFERED_TOKENS_VALUES:
				return offer_offeredTokens_Values != null && !offer_offeredTokens_Values.isEmpty();
			case StatesPackage.STATE__INTEGER_CALCULATION_EXPRESSION_ASSIGNEE_VALUES:
				return integerCalculationExpression_assignee_Values != null && !integerCalculationExpression_assignee_Values.isEmpty();
			case StatesPackage.STATE__INTEGER_CALCULATION_EXPRESSION_OPERATOR_VALUES:
				return integerCalculationExpression_operator_Values != null && !integerCalculationExpression_operator_Values.isEmpty();
			case StatesPackage.STATE__ACTIVITY_EDGE_OFFERS_VALUES:
				return activityEdge_offers_Values != null && !activityEdge_offers_Values.isEmpty();
			case StatesPackage.STATE__ACTIVITY_EDGE_TARGET_VALUES:
				return activityEdge_target_Values != null && !activityEdge_target_Values.isEmpty();
			case StatesPackage.STATE__ACTIVITY_EDGE_SOURCE_VALUES:
				return activityEdge_source_Values != null && !activityEdge_source_Values.isEmpty();
			case StatesPackage.STATE__BOOLEAN_EXPRESSION_ASSIGNEE_VALUES:
				return booleanExpression_assignee_Values != null && !booleanExpression_assignee_Values.isEmpty();
			case StatesPackage.STATE__VARIABLE_NAME_VALUES:
				return variable_name_Values != null && !variable_name_Values.isEmpty();
			case StatesPackage.STATE__VARIABLE_CURRENT_VALUE_VALUES:
				return variable_currentValue_Values != null && !variable_currentValue_Values.isEmpty();
			case StatesPackage.STATE__VARIABLE_INITIAL_VALUE_VALUES:
				return variable_initialValue_Values != null && !variable_initialValue_Values.isEmpty();
			case StatesPackage.STATE__INTEGER_COMPARISON_EXPRESSION_OPERATOR_VALUES:
				return integerComparisonExpression_operator_Values != null && !integerComparisonExpression_operator_Values.isEmpty();
			case StatesPackage.STATE__INTEGER_COMPARISON_EXPRESSION_ASSIGNEE_VALUES:
				return integerComparisonExpression_assignee_Values != null && !integerComparisonExpression_assignee_Values.isEmpty();
			case StatesPackage.STATE__ACTIVITY_TRACE_VALUES:
				return activity_trace_Values != null && !activity_trace_Values.isEmpty();
			case StatesPackage.STATE__ACTIVITY_EDGES_VALUES:
				return activity_edges_Values != null && !activity_edges_Values.isEmpty();
			case StatesPackage.STATE__ACTIVITY_INPUTS_VALUES:
				return activity_inputs_Values != null && !activity_inputs_Values.isEmpty();
			case StatesPackage.STATE__ACTIVITY_NODES_VALUES:
				return activity_nodes_Values != null && !activity_nodes_Values.isEmpty();
			case StatesPackage.STATE__ACTIVITY_LOCALS_VALUES:
				return activity_locals_Values != null && !activity_locals_Values.isEmpty();
			case StatesPackage.STATE__TOKEN_HOLDER_VALUES:
				return token_holder_Values != null && !token_holder_Values.isEmpty();
			case StatesPackage.STATE__BOOLEAN_UNARY_EXPRESSION_OPERATOR_VALUES:
				return booleanUnaryExpression_operator_Values != null && !booleanUnaryExpression_operator_Values.isEmpty();
			case StatesPackage.STATE__BOOLEAN_UNARY_EXPRESSION_OPERAND_VALUES:
				return booleanUnaryExpression_operand_Values != null && !booleanUnaryExpression_operand_Values.isEmpty();
			case StatesPackage.STATE__INPUT_VALUE_VARIABLE_VALUES:
				return inputValue_variable_Values != null && !inputValue_variable_Values.isEmpty();
			case StatesPackage.STATE__INPUT_VALUE_VALUE_VALUES:
				return inputValue_value_Values != null && !inputValue_value_Values.isEmpty();
			case StatesPackage.STATE__TRACE_EXECUTED_NODES_VALUES:
				return trace_executedNodes_Values != null && !trace_executedNodes_Values.isEmpty();
			case StatesPackage.STATE__BOOLEAN_VALUE_VALUE_VALUES:
				return booleanValue_value_Values != null && !booleanValue_value_Values.isEmpty();
			case StatesPackage.STATE__ACTIVITY_NODE_OUTGOING_VALUES:
				return activityNode_outgoing_Values != null && !activityNode_outgoing_Values.isEmpty();
			case StatesPackage.STATE__ACTIVITY_NODE_ACTIVITY_VALUES:
				return activityNode_activity_Values != null && !activityNode_activity_Values.isEmpty();
			case StatesPackage.STATE__ACTIVITY_NODE_RUNNING_VALUES:
				return activityNode_running_Values != null && !activityNode_running_Values.isEmpty();
			case StatesPackage.STATE__ACTIVITY_NODE_INCOMING_VALUES:
				return activityNode_incoming_Values != null && !activityNode_incoming_Values.isEmpty();
			case StatesPackage.STATE__ACTIVITY_NODE_HELD_TOKENS_VALUES:
				return activityNode_heldTokens_Values != null && !activityNode_heldTokens_Values.isEmpty();
			case StatesPackage.STATE__OPAQUE_ACTION_EXPRESSIONS_VALUES:
				return opaqueAction_expressions_Values != null && !opaqueAction_expressions_Values.isEmpty();
			case StatesPackage.STATE__INPUT_INPUT_VALUES_VALUES:
				return input_inputValues_Values != null && !input_inputValues_Values.isEmpty();
			case StatesPackage.STATE__NAMED_ELEMENT_NAME_VALUES:
				return namedElement_name_Values != null && !namedElement_name_Values.isEmpty();
			case StatesPackage.STATE__BOOLEAN_BINARY_EXPRESSION_OPERAND1_VALUES:
				return booleanBinaryExpression_operand1_Values != null && !booleanBinaryExpression_operand1_Values.isEmpty();
			case StatesPackage.STATE__BOOLEAN_BINARY_EXPRESSION_OPERATOR_VALUES:
				return booleanBinaryExpression_operator_Values != null && !booleanBinaryExpression_operator_Values.isEmpty();
			case StatesPackage.STATE__BOOLEAN_BINARY_EXPRESSION_OPERAND2_VALUES:
				return booleanBinaryExpression_operand2_Values != null && !booleanBinaryExpression_operand2_Values.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StateImpl
