/**
 */
package activitydiagramTrace.States;

import activitydiagramTrace.Steps.Step;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.States.State#getStartedSteps <em>Started Steps</em>}</li>
 *   <li>{@link activitydiagramTrace.States.State#getEndedSteps <em>Ended Steps</em>}</li>
 *   <li>{@link activitydiagramTrace.States.State#getVariable_initialValue_Values <em>Variable initial Value Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.State#getVariable_currentValue_Values <em>Variable current Value Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.State#getVariable_name_Values <em>Variable name Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.State#getToken_holder_Values <em>Token holder Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.State#getIntegerExpression_operand2_Values <em>Integer Expression operand2 Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.State#getIntegerExpression_operand1_Values <em>Integer Expression operand1 Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.State#getTrace_executedNodes_Values <em>Trace executed Nodes Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.State#getControlFlow_guard_Values <em>Control Flow guard Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.State#getBooleanExpression_assignee_Values <em>Boolean Expression assignee Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.State#getOpaqueAction_expressions_Values <em>Opaque Action expressions Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.State#getInputValue_value_Values <em>Input Value value Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.State#getInputValue_variable_Values <em>Input Value variable Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.State#getBooleanUnaryExpression_operand_Values <em>Boolean Unary Expression operand Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.State#getBooleanUnaryExpression_operator_Values <em>Boolean Unary Expression operator Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.State#getBooleanBinaryExpression_operand1_Values <em>Boolean Binary Expression operand1 Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.State#getBooleanBinaryExpression_operator_Values <em>Boolean Binary Expression operator Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.State#getBooleanBinaryExpression_operand2_Values <em>Boolean Binary Expression operand2 Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.State#getNamedElement_name_Values <em>Named Element name Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.State#getBooleanValue_value_Values <em>Boolean Value value Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.State#getForkedToken_baseToken_Values <em>Forked Token base Token Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.State#getForkedToken_remainingOffersCount_Values <em>Forked Token remaining Offers Count Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.State#getInput_inputValues_Values <em>Input input Values Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.State#getIntegerComparisonExpression_operator_Values <em>Integer Comparison Expression operator Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.State#getIntegerComparisonExpression_assignee_Values <em>Integer Comparison Expression assignee Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.State#getActivity_edges_Values <em>Activity edges Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.State#getActivity_nodes_Values <em>Activity nodes Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.State#getActivity_trace_Values <em>Activity trace Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.State#getActivity_locals_Values <em>Activity locals Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.State#getActivity_inputs_Values <em>Activity inputs Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.State#getActivityNode_heldTokens_Values <em>Activity Node held Tokens Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.State#getActivityNode_incoming_Values <em>Activity Node incoming Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.State#getActivityNode_running_Values <em>Activity Node running Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.State#getActivityNode_activity_Values <em>Activity Node activity Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.State#getActivityNode_outgoing_Values <em>Activity Node outgoing Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.State#getIntegerValue_value_Values <em>Integer Value value Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.State#getOffer_offeredTokens_Values <em>Offer offered Tokens Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.State#getActivityEdge_source_Values <em>Activity Edge source Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.State#getActivityEdge_target_Values <em>Activity Edge target Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.State#getActivityEdge_offers_Values <em>Activity Edge offers Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.State#getIntegerCalculationExpression_operator_Values <em>Integer Calculation Expression operator Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.State#getIntegerCalculationExpression_assignee_Values <em>Integer Calculation Expression assignee Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.States.StatesPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Started Steps</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.Steps.Step}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.Steps.Step#getStartingState <em>Starting State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Started Steps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Started Steps</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getState_StartedSteps()
	 * @see activitydiagramTrace.Steps.Step#getStartingState
	 * @model opposite="startingState"
	 * @generated
	 */
	EList<Step> getStartedSteps();

	/**
	 * Returns the value of the '<em><b>Ended Steps</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.Steps.Step}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.Steps.Step#getEndingState <em>Ending State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ended Steps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ended Steps</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getState_EndedSteps()
	 * @see activitydiagramTrace.Steps.Step#getEndingState
	 * @model opposite="endingState"
	 * @generated
	 */
	EList<Step> getEndedSteps();

	/**
	 * Returns the value of the '<em><b>Variable initial Value Values</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.Variable_initialValue_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.Variable_initialValue_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable initial Value Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable initial Value Values</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getState_Variable_initialValue_Values()
	 * @see activitydiagramTrace.States.Variable_initialValue_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<Variable_initialValue_Value> getVariable_initialValue_Values();

	/**
	 * Returns the value of the '<em><b>Variable current Value Values</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.Variable_currentValue_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.Variable_currentValue_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable current Value Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable current Value Values</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getState_Variable_currentValue_Values()
	 * @see activitydiagramTrace.States.Variable_currentValue_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<Variable_currentValue_Value> getVariable_currentValue_Values();

	/**
	 * Returns the value of the '<em><b>Variable name Values</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.Variable_name_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.Variable_name_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable name Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable name Values</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getState_Variable_name_Values()
	 * @see activitydiagramTrace.States.Variable_name_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<Variable_name_Value> getVariable_name_Values();

	/**
	 * Returns the value of the '<em><b>Token holder Values</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.Token_holder_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.Token_holder_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Token holder Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token holder Values</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getState_Token_holder_Values()
	 * @see activitydiagramTrace.States.Token_holder_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<Token_holder_Value> getToken_holder_Values();

	/**
	 * Returns the value of the '<em><b>Integer Expression operand2 Values</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.IntegerExpression_operand2_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.IntegerExpression_operand2_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integer Expression operand2 Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integer Expression operand2 Values</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getState_IntegerExpression_operand2_Values()
	 * @see activitydiagramTrace.States.IntegerExpression_operand2_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<IntegerExpression_operand2_Value> getIntegerExpression_operand2_Values();

	/**
	 * Returns the value of the '<em><b>Integer Expression operand1 Values</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.IntegerExpression_operand1_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.IntegerExpression_operand1_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integer Expression operand1 Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integer Expression operand1 Values</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getState_IntegerExpression_operand1_Values()
	 * @see activitydiagramTrace.States.IntegerExpression_operand1_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<IntegerExpression_operand1_Value> getIntegerExpression_operand1_Values();

	/**
	 * Returns the value of the '<em><b>Trace executed Nodes Values</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.Trace_executedNodes_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.Trace_executedNodes_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trace executed Nodes Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace executed Nodes Values</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getState_Trace_executedNodes_Values()
	 * @see activitydiagramTrace.States.Trace_executedNodes_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<Trace_executedNodes_Value> getTrace_executedNodes_Values();

	/**
	 * Returns the value of the '<em><b>Control Flow guard Values</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.ControlFlow_guard_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.ControlFlow_guard_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Flow guard Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Flow guard Values</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getState_ControlFlow_guard_Values()
	 * @see activitydiagramTrace.States.ControlFlow_guard_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<ControlFlow_guard_Value> getControlFlow_guard_Values();

	/**
	 * Returns the value of the '<em><b>Boolean Expression assignee Values</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.BooleanExpression_assignee_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.BooleanExpression_assignee_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boolean Expression assignee Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean Expression assignee Values</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getState_BooleanExpression_assignee_Values()
	 * @see activitydiagramTrace.States.BooleanExpression_assignee_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<BooleanExpression_assignee_Value> getBooleanExpression_assignee_Values();

	/**
	 * Returns the value of the '<em><b>Opaque Action expressions Values</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.OpaqueAction_expressions_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.OpaqueAction_expressions_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opaque Action expressions Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opaque Action expressions Values</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getState_OpaqueAction_expressions_Values()
	 * @see activitydiagramTrace.States.OpaqueAction_expressions_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<OpaqueAction_expressions_Value> getOpaqueAction_expressions_Values();

	/**
	 * Returns the value of the '<em><b>Input Value value Values</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.InputValue_value_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.InputValue_value_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Value value Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Value value Values</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getState_InputValue_value_Values()
	 * @see activitydiagramTrace.States.InputValue_value_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<InputValue_value_Value> getInputValue_value_Values();

	/**
	 * Returns the value of the '<em><b>Input Value variable Values</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.InputValue_variable_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.InputValue_variable_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Value variable Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Value variable Values</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getState_InputValue_variable_Values()
	 * @see activitydiagramTrace.States.InputValue_variable_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<InputValue_variable_Value> getInputValue_variable_Values();

	/**
	 * Returns the value of the '<em><b>Boolean Unary Expression operand Values</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.BooleanUnaryExpression_operand_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.BooleanUnaryExpression_operand_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boolean Unary Expression operand Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean Unary Expression operand Values</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getState_BooleanUnaryExpression_operand_Values()
	 * @see activitydiagramTrace.States.BooleanUnaryExpression_operand_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<BooleanUnaryExpression_operand_Value> getBooleanUnaryExpression_operand_Values();

	/**
	 * Returns the value of the '<em><b>Boolean Unary Expression operator Values</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.BooleanUnaryExpression_operator_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.BooleanUnaryExpression_operator_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boolean Unary Expression operator Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean Unary Expression operator Values</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getState_BooleanUnaryExpression_operator_Values()
	 * @see activitydiagramTrace.States.BooleanUnaryExpression_operator_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<BooleanUnaryExpression_operator_Value> getBooleanUnaryExpression_operator_Values();

	/**
	 * Returns the value of the '<em><b>Boolean Binary Expression operand1 Values</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.BooleanBinaryExpression_operand1_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.BooleanBinaryExpression_operand1_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boolean Binary Expression operand1 Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean Binary Expression operand1 Values</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getState_BooleanBinaryExpression_operand1_Values()
	 * @see activitydiagramTrace.States.BooleanBinaryExpression_operand1_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<BooleanBinaryExpression_operand1_Value> getBooleanBinaryExpression_operand1_Values();

	/**
	 * Returns the value of the '<em><b>Boolean Binary Expression operator Values</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.BooleanBinaryExpression_operator_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.BooleanBinaryExpression_operator_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boolean Binary Expression operator Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean Binary Expression operator Values</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getState_BooleanBinaryExpression_operator_Values()
	 * @see activitydiagramTrace.States.BooleanBinaryExpression_operator_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<BooleanBinaryExpression_operator_Value> getBooleanBinaryExpression_operator_Values();

	/**
	 * Returns the value of the '<em><b>Boolean Binary Expression operand2 Values</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.BooleanBinaryExpression_operand2_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.BooleanBinaryExpression_operand2_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boolean Binary Expression operand2 Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean Binary Expression operand2 Values</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getState_BooleanBinaryExpression_operand2_Values()
	 * @see activitydiagramTrace.States.BooleanBinaryExpression_operand2_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<BooleanBinaryExpression_operand2_Value> getBooleanBinaryExpression_operand2_Values();

	/**
	 * Returns the value of the '<em><b>Named Element name Values</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.NamedElement_name_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.NamedElement_name_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Named Element name Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Named Element name Values</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getState_NamedElement_name_Values()
	 * @see activitydiagramTrace.States.NamedElement_name_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<NamedElement_name_Value> getNamedElement_name_Values();

	/**
	 * Returns the value of the '<em><b>Boolean Value value Values</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.BooleanValue_value_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.BooleanValue_value_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boolean Value value Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean Value value Values</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getState_BooleanValue_value_Values()
	 * @see activitydiagramTrace.States.BooleanValue_value_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<BooleanValue_value_Value> getBooleanValue_value_Values();

	/**
	 * Returns the value of the '<em><b>Forked Token base Token Values</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.ForkedToken_baseToken_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.ForkedToken_baseToken_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forked Token base Token Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forked Token base Token Values</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getState_ForkedToken_baseToken_Values()
	 * @see activitydiagramTrace.States.ForkedToken_baseToken_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<ForkedToken_baseToken_Value> getForkedToken_baseToken_Values();

	/**
	 * Returns the value of the '<em><b>Forked Token remaining Offers Count Values</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forked Token remaining Offers Count Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forked Token remaining Offers Count Values</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getState_ForkedToken_remainingOffersCount_Values()
	 * @see activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<ForkedToken_remainingOffersCount_Value> getForkedToken_remainingOffersCount_Values();

	/**
	 * Returns the value of the '<em><b>Input input Values Values</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.Input_inputValues_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.Input_inputValues_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input input Values Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input input Values Values</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getState_Input_inputValues_Values()
	 * @see activitydiagramTrace.States.Input_inputValues_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<Input_inputValues_Value> getInput_inputValues_Values();

	/**
	 * Returns the value of the '<em><b>Integer Comparison Expression operator Values</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.IntegerComparisonExpression_operator_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.IntegerComparisonExpression_operator_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integer Comparison Expression operator Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integer Comparison Expression operator Values</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getState_IntegerComparisonExpression_operator_Values()
	 * @see activitydiagramTrace.States.IntegerComparisonExpression_operator_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<IntegerComparisonExpression_operator_Value> getIntegerComparisonExpression_operator_Values();

	/**
	 * Returns the value of the '<em><b>Integer Comparison Expression assignee Values</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.IntegerComparisonExpression_assignee_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.IntegerComparisonExpression_assignee_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integer Comparison Expression assignee Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integer Comparison Expression assignee Values</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getState_IntegerComparisonExpression_assignee_Values()
	 * @see activitydiagramTrace.States.IntegerComparisonExpression_assignee_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<IntegerComparisonExpression_assignee_Value> getIntegerComparisonExpression_assignee_Values();

	/**
	 * Returns the value of the '<em><b>Activity edges Values</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.Activity_edges_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.Activity_edges_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity edges Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity edges Values</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getState_Activity_edges_Values()
	 * @see activitydiagramTrace.States.Activity_edges_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<Activity_edges_Value> getActivity_edges_Values();

	/**
	 * Returns the value of the '<em><b>Activity nodes Values</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.Activity_nodes_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.Activity_nodes_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity nodes Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity nodes Values</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getState_Activity_nodes_Values()
	 * @see activitydiagramTrace.States.Activity_nodes_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<Activity_nodes_Value> getActivity_nodes_Values();

	/**
	 * Returns the value of the '<em><b>Activity trace Values</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.Activity_trace_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.Activity_trace_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity trace Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity trace Values</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getState_Activity_trace_Values()
	 * @see activitydiagramTrace.States.Activity_trace_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<Activity_trace_Value> getActivity_trace_Values();

	/**
	 * Returns the value of the '<em><b>Activity locals Values</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.Activity_locals_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.Activity_locals_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity locals Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity locals Values</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getState_Activity_locals_Values()
	 * @see activitydiagramTrace.States.Activity_locals_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<Activity_locals_Value> getActivity_locals_Values();

	/**
	 * Returns the value of the '<em><b>Activity inputs Values</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.Activity_inputs_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.Activity_inputs_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity inputs Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity inputs Values</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getState_Activity_inputs_Values()
	 * @see activitydiagramTrace.States.Activity_inputs_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<Activity_inputs_Value> getActivity_inputs_Values();

	/**
	 * Returns the value of the '<em><b>Activity Node held Tokens Values</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.ActivityNode_heldTokens_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.ActivityNode_heldTokens_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Node held Tokens Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Node held Tokens Values</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getState_ActivityNode_heldTokens_Values()
	 * @see activitydiagramTrace.States.ActivityNode_heldTokens_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<ActivityNode_heldTokens_Value> getActivityNode_heldTokens_Values();

	/**
	 * Returns the value of the '<em><b>Activity Node incoming Values</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.ActivityNode_incoming_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.ActivityNode_incoming_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Node incoming Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Node incoming Values</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getState_ActivityNode_incoming_Values()
	 * @see activitydiagramTrace.States.ActivityNode_incoming_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<ActivityNode_incoming_Value> getActivityNode_incoming_Values();

	/**
	 * Returns the value of the '<em><b>Activity Node running Values</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.ActivityNode_running_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.ActivityNode_running_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Node running Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Node running Values</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getState_ActivityNode_running_Values()
	 * @see activitydiagramTrace.States.ActivityNode_running_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<ActivityNode_running_Value> getActivityNode_running_Values();

	/**
	 * Returns the value of the '<em><b>Activity Node activity Values</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.ActivityNode_activity_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.ActivityNode_activity_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Node activity Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Node activity Values</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getState_ActivityNode_activity_Values()
	 * @see activitydiagramTrace.States.ActivityNode_activity_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<ActivityNode_activity_Value> getActivityNode_activity_Values();

	/**
	 * Returns the value of the '<em><b>Activity Node outgoing Values</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.ActivityNode_outgoing_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.ActivityNode_outgoing_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Node outgoing Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Node outgoing Values</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getState_ActivityNode_outgoing_Values()
	 * @see activitydiagramTrace.States.ActivityNode_outgoing_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<ActivityNode_outgoing_Value> getActivityNode_outgoing_Values();

	/**
	 * Returns the value of the '<em><b>Integer Value value Values</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.IntegerValue_value_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.IntegerValue_value_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integer Value value Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integer Value value Values</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getState_IntegerValue_value_Values()
	 * @see activitydiagramTrace.States.IntegerValue_value_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<IntegerValue_value_Value> getIntegerValue_value_Values();

	/**
	 * Returns the value of the '<em><b>Offer offered Tokens Values</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.Offer_offeredTokens_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.Offer_offeredTokens_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offer offered Tokens Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offer offered Tokens Values</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getState_Offer_offeredTokens_Values()
	 * @see activitydiagramTrace.States.Offer_offeredTokens_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<Offer_offeredTokens_Value> getOffer_offeredTokens_Values();

	/**
	 * Returns the value of the '<em><b>Activity Edge source Values</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.ActivityEdge_source_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.ActivityEdge_source_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Edge source Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Edge source Values</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getState_ActivityEdge_source_Values()
	 * @see activitydiagramTrace.States.ActivityEdge_source_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<ActivityEdge_source_Value> getActivityEdge_source_Values();

	/**
	 * Returns the value of the '<em><b>Activity Edge target Values</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.ActivityEdge_target_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.ActivityEdge_target_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Edge target Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Edge target Values</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getState_ActivityEdge_target_Values()
	 * @see activitydiagramTrace.States.ActivityEdge_target_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<ActivityEdge_target_Value> getActivityEdge_target_Values();

	/**
	 * Returns the value of the '<em><b>Activity Edge offers Values</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.ActivityEdge_offers_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.ActivityEdge_offers_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Edge offers Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Edge offers Values</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getState_ActivityEdge_offers_Values()
	 * @see activitydiagramTrace.States.ActivityEdge_offers_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<ActivityEdge_offers_Value> getActivityEdge_offers_Values();

	/**
	 * Returns the value of the '<em><b>Integer Calculation Expression operator Values</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.IntegerCalculationExpression_operator_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.IntegerCalculationExpression_operator_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integer Calculation Expression operator Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integer Calculation Expression operator Values</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getState_IntegerCalculationExpression_operator_Values()
	 * @see activitydiagramTrace.States.IntegerCalculationExpression_operator_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<IntegerCalculationExpression_operator_Value> getIntegerCalculationExpression_operator_Values();

	/**
	 * Returns the value of the '<em><b>Integer Calculation Expression assignee Values</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.IntegerCalculationExpression_assignee_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.IntegerCalculationExpression_assignee_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integer Calculation Expression assignee Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integer Calculation Expression assignee Values</em>' reference list.
	 * @see activitydiagramTrace.States.StatesPackage#getState_IntegerCalculationExpression_assignee_Values()
	 * @see activitydiagramTrace.States.IntegerCalculationExpression_assignee_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<IntegerCalculationExpression_assignee_Value> getIntegerCalculationExpression_assignee_Values();

} // State
