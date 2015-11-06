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
 *   <li>{@link activitydiagramTrace.States.State#getOffer_offeredTokens_Values <em>Offer offered Tokens Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.State#getActivityEdge_offers_Values <em>Activity Edge offers Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.State#getBooleanValue_value_Values <em>Boolean Value value Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.State#getActivityNode_heldTokens_Values <em>Activity Node held Tokens Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.State#getInput_inputValues_Values <em>Input input Values Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.State#getInputValue_variable_Values <em>Input Value variable Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.State#getInputValue_value_Values <em>Input Value value Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.State#getTrace_executedNodes_Values <em>Trace executed Nodes Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.State#getActivity_trace_Values <em>Activity trace Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.State#getToken_holder_Values <em>Token holder Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.State#getVariable_currentValue_Values <em>Variable current Value Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.State#getIntegerValue_value_Values <em>Integer Value value Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.State#getForkedToken_baseToken_Values <em>Forked Token base Token Values</em>}</li>
 *   <li>{@link activitydiagramTrace.States.State#getForkedToken_remainingOffersCount_Values <em>Forked Token remaining Offers Count Values</em>}</li>
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

} // State
