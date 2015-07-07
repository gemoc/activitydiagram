/**
 */
package activitydiagramTrace;

import activitydiagramTrace.Steps.BigStep;
import activitydiagramTrace.Steps.SmallStep;

import activitydiagramTrace.Values.ActivityEdge_offers_Value;
import activitydiagramTrace.Values.ActivityNode_heldTokens_Value;
import activitydiagramTrace.Values.Activity_trace_Value;
import activitydiagramTrace.Values.BooleanValue_value_Value;
import activitydiagramTrace.Values.ForkedToken_baseToken_Value;
import activitydiagramTrace.Values.ForkedToken_remainingOffersCount_Value;
import activitydiagramTrace.Values.InputValue_value_Value;
import activitydiagramTrace.Values.InputValue_variable_Value;
import activitydiagramTrace.Values.Input_inputValues_Value;
import activitydiagramTrace.Values.IntegerValue_value_Value;
import activitydiagramTrace.Values.Offer_offeredTokens_Value;
import activitydiagramTrace.Values.Token_holder_Value;
import activitydiagramTrace.Values.Trace_executedNodes_Value;
import activitydiagramTrace.Values.Variable_currentValue_Value;

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
 *   <li>{@link activitydiagramTrace.State#getFollowingStep <em>Following Step</em>}</li>
 *   <li>{@link activitydiagramTrace.State#getStartedBigSteps <em>Started Big Steps</em>}</li>
 *   <li>{@link activitydiagramTrace.State#getEndedBigSteps <em>Ended Big Steps</em>}</li>
 *   <li>{@link activitydiagramTrace.State#getIntegerValue_value_Values <em>Integer Value value Values</em>}</li>
 *   <li>{@link activitydiagramTrace.State#getInput_inputValues_Values <em>Input input Values Values</em>}</li>
 *   <li>{@link activitydiagramTrace.State#getBooleanValue_value_Values <em>Boolean Value value Values</em>}</li>
 *   <li>{@link activitydiagramTrace.State#getTrace_executedNodes_Values <em>Trace executed Nodes Values</em>}</li>
 *   <li>{@link activitydiagramTrace.State#getActivityEdge_offers_Values <em>Activity Edge offers Values</em>}</li>
 *   <li>{@link activitydiagramTrace.State#getToken_holder_Values <em>Token holder Values</em>}</li>
 *   <li>{@link activitydiagramTrace.State#getInputValue_value_Values <em>Input Value value Values</em>}</li>
 *   <li>{@link activitydiagramTrace.State#getInputValue_variable_Values <em>Input Value variable Values</em>}</li>
 *   <li>{@link activitydiagramTrace.State#getForkedToken_remainingOffersCount_Values <em>Forked Token remaining Offers Count Values</em>}</li>
 *   <li>{@link activitydiagramTrace.State#getForkedToken_baseToken_Values <em>Forked Token base Token Values</em>}</li>
 *   <li>{@link activitydiagramTrace.State#getActivityNode_heldTokens_Values <em>Activity Node held Tokens Values</em>}</li>
 *   <li>{@link activitydiagramTrace.State#getActivity_trace_Values <em>Activity trace Values</em>}</li>
 *   <li>{@link activitydiagramTrace.State#getOffer_offeredTokens_Values <em>Offer offered Tokens Values</em>}</li>
 *   <li>{@link activitydiagramTrace.State#getVariable_currentValue_Values <em>Variable current Value Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.ActivitydiagramTracePackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Following Step</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.Steps.SmallStep#getPrecedingState <em>Preceding State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Following Step</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Following Step</em>' reference.
	 * @see #setFollowingStep(SmallStep)
	 * @see activitydiagramTrace.ActivitydiagramTracePackage#getState_FollowingStep()
	 * @see activitydiagramTrace.Steps.SmallStep#getPrecedingState
	 * @model opposite="precedingState"
	 * @generated
	 */
	SmallStep getFollowingStep();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.State#getFollowingStep <em>Following Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Following Step</em>' reference.
	 * @see #getFollowingStep()
	 * @generated
	 */
	void setFollowingStep(SmallStep value);

	/**
	 * Returns the value of the '<em><b>Started Big Steps</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.Steps.BigStep}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.Steps.BigStep#getStartingState <em>Starting State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Started Big Steps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Started Big Steps</em>' reference list.
	 * @see activitydiagramTrace.ActivitydiagramTracePackage#getState_StartedBigSteps()
	 * @see activitydiagramTrace.Steps.BigStep#getStartingState
	 * @model opposite="startingState"
	 * @generated
	 */
	EList<BigStep> getStartedBigSteps();

	/**
	 * Returns the value of the '<em><b>Ended Big Steps</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.Steps.BigStep}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.Steps.BigStep#getEndingState <em>Ending State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ended Big Steps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ended Big Steps</em>' reference list.
	 * @see activitydiagramTrace.ActivitydiagramTracePackage#getState_EndedBigSteps()
	 * @see activitydiagramTrace.Steps.BigStep#getEndingState
	 * @model opposite="endingState"
	 * @generated
	 */
	EList<BigStep> getEndedBigSteps();

	/**
	 * Returns the value of the '<em><b>Integer Value value Values</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.Values.IntegerValue_value_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.Values.IntegerValue_value_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integer Value value Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integer Value value Values</em>' reference list.
	 * @see activitydiagramTrace.ActivitydiagramTracePackage#getState_IntegerValue_value_Values()
	 * @see activitydiagramTrace.Values.IntegerValue_value_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<IntegerValue_value_Value> getIntegerValue_value_Values();

	/**
	 * Returns the value of the '<em><b>Input input Values Values</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.Values.Input_inputValues_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.Values.Input_inputValues_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input input Values Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input input Values Values</em>' reference list.
	 * @see activitydiagramTrace.ActivitydiagramTracePackage#getState_Input_inputValues_Values()
	 * @see activitydiagramTrace.Values.Input_inputValues_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<Input_inputValues_Value> getInput_inputValues_Values();

	/**
	 * Returns the value of the '<em><b>Boolean Value value Values</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.Values.BooleanValue_value_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.Values.BooleanValue_value_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boolean Value value Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean Value value Values</em>' reference list.
	 * @see activitydiagramTrace.ActivitydiagramTracePackage#getState_BooleanValue_value_Values()
	 * @see activitydiagramTrace.Values.BooleanValue_value_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<BooleanValue_value_Value> getBooleanValue_value_Values();

	/**
	 * Returns the value of the '<em><b>Trace executed Nodes Values</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.Values.Trace_executedNodes_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.Values.Trace_executedNodes_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trace executed Nodes Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace executed Nodes Values</em>' reference list.
	 * @see activitydiagramTrace.ActivitydiagramTracePackage#getState_Trace_executedNodes_Values()
	 * @see activitydiagramTrace.Values.Trace_executedNodes_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<Trace_executedNodes_Value> getTrace_executedNodes_Values();

	/**
	 * Returns the value of the '<em><b>Activity Edge offers Values</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.Values.ActivityEdge_offers_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.Values.ActivityEdge_offers_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Edge offers Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Edge offers Values</em>' reference list.
	 * @see activitydiagramTrace.ActivitydiagramTracePackage#getState_ActivityEdge_offers_Values()
	 * @see activitydiagramTrace.Values.ActivityEdge_offers_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<ActivityEdge_offers_Value> getActivityEdge_offers_Values();

	/**
	 * Returns the value of the '<em><b>Token holder Values</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.Values.Token_holder_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.Values.Token_holder_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Token holder Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token holder Values</em>' reference list.
	 * @see activitydiagramTrace.ActivitydiagramTracePackage#getState_Token_holder_Values()
	 * @see activitydiagramTrace.Values.Token_holder_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<Token_holder_Value> getToken_holder_Values();

	/**
	 * Returns the value of the '<em><b>Input Value value Values</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.Values.InputValue_value_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.Values.InputValue_value_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Value value Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Value value Values</em>' reference list.
	 * @see activitydiagramTrace.ActivitydiagramTracePackage#getState_InputValue_value_Values()
	 * @see activitydiagramTrace.Values.InputValue_value_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<InputValue_value_Value> getInputValue_value_Values();

	/**
	 * Returns the value of the '<em><b>Input Value variable Values</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.Values.InputValue_variable_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.Values.InputValue_variable_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Value variable Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Value variable Values</em>' reference list.
	 * @see activitydiagramTrace.ActivitydiagramTracePackage#getState_InputValue_variable_Values()
	 * @see activitydiagramTrace.Values.InputValue_variable_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<InputValue_variable_Value> getInputValue_variable_Values();

	/**
	 * Returns the value of the '<em><b>Forked Token remaining Offers Count Values</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.Values.ForkedToken_remainingOffersCount_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.Values.ForkedToken_remainingOffersCount_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forked Token remaining Offers Count Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forked Token remaining Offers Count Values</em>' reference list.
	 * @see activitydiagramTrace.ActivitydiagramTracePackage#getState_ForkedToken_remainingOffersCount_Values()
	 * @see activitydiagramTrace.Values.ForkedToken_remainingOffersCount_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<ForkedToken_remainingOffersCount_Value> getForkedToken_remainingOffersCount_Values();

	/**
	 * Returns the value of the '<em><b>Forked Token base Token Values</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.Values.ForkedToken_baseToken_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.Values.ForkedToken_baseToken_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forked Token base Token Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forked Token base Token Values</em>' reference list.
	 * @see activitydiagramTrace.ActivitydiagramTracePackage#getState_ForkedToken_baseToken_Values()
	 * @see activitydiagramTrace.Values.ForkedToken_baseToken_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<ForkedToken_baseToken_Value> getForkedToken_baseToken_Values();

	/**
	 * Returns the value of the '<em><b>Activity Node held Tokens Values</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.Values.ActivityNode_heldTokens_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.Values.ActivityNode_heldTokens_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Node held Tokens Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Node held Tokens Values</em>' reference list.
	 * @see activitydiagramTrace.ActivitydiagramTracePackage#getState_ActivityNode_heldTokens_Values()
	 * @see activitydiagramTrace.Values.ActivityNode_heldTokens_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<ActivityNode_heldTokens_Value> getActivityNode_heldTokens_Values();

	/**
	 * Returns the value of the '<em><b>Activity trace Values</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.Values.Activity_trace_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.Values.Activity_trace_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity trace Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity trace Values</em>' reference list.
	 * @see activitydiagramTrace.ActivitydiagramTracePackage#getState_Activity_trace_Values()
	 * @see activitydiagramTrace.Values.Activity_trace_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<Activity_trace_Value> getActivity_trace_Values();

	/**
	 * Returns the value of the '<em><b>Offer offered Tokens Values</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.Values.Offer_offeredTokens_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.Values.Offer_offeredTokens_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offer offered Tokens Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offer offered Tokens Values</em>' reference list.
	 * @see activitydiagramTrace.ActivitydiagramTracePackage#getState_Offer_offeredTokens_Values()
	 * @see activitydiagramTrace.Values.Offer_offeredTokens_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<Offer_offeredTokens_Value> getOffer_offeredTokens_Values();

	/**
	 * Returns the value of the '<em><b>Variable current Value Values</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.Values.Variable_currentValue_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.Values.Variable_currentValue_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable current Value Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable current Value Values</em>' reference list.
	 * @see activitydiagramTrace.ActivitydiagramTracePackage#getState_Variable_currentValue_Values()
	 * @see activitydiagramTrace.Values.Variable_currentValue_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<Variable_currentValue_Value> getVariable_currentValue_Values();

} // State
