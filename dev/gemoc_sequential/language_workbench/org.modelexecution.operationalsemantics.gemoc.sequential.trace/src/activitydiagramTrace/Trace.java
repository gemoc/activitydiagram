/**
 */
package activitydiagramTrace;

import activitydiagramTrace.States.State;

import activitydiagramTrace.States.activitydiagram.TracedActivity;
import activitydiagramTrace.States.activitydiagram.TracedActivityFinalNode;
import activitydiagramTrace.States.activitydiagram.TracedBooleanValue;
import activitydiagramTrace.States.activitydiagram.TracedBooleanVariable;
import activitydiagramTrace.States.activitydiagram.TracedControlFlow;
import activitydiagramTrace.States.activitydiagram.TracedControlToken;
import activitydiagramTrace.States.activitydiagram.TracedDecisionNode;
import activitydiagramTrace.States.activitydiagram.TracedForkNode;
import activitydiagramTrace.States.activitydiagram.TracedForkedToken;
import activitydiagramTrace.States.activitydiagram.TracedInitialNode;
import activitydiagramTrace.States.activitydiagram.TracedInput;
import activitydiagramTrace.States.activitydiagram.TracedInputValue;
import activitydiagramTrace.States.activitydiagram.TracedIntegerValue;
import activitydiagramTrace.States.activitydiagram.TracedIntegerVariable;
import activitydiagramTrace.States.activitydiagram.TracedJoinNode;
import activitydiagramTrace.States.activitydiagram.TracedMergeNode;
import activitydiagramTrace.States.activitydiagram.TracedOffer;
import activitydiagramTrace.States.activitydiagram.TracedOpaqueAction;
import activitydiagramTrace.States.activitydiagram.TracedTrace;

import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1;
import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute;
import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_RemoveToken1;
import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_SendOffers1;
import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1;
import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Terminate;
import activitydiagramTrace.Steps.Activitydiagram_Activity_Execute;
import activitydiagramTrace.Steps.Activitydiagram_Activity_InitializeContext;
import activitydiagramTrace.Steps.Activitydiagram_Activity_Reset;
import activitydiagramTrace.Steps.Activitydiagram_Activity_WriteTrace;
import activitydiagramTrace.Steps.Activitydiagram_Variable_Execute;
import activitydiagramTrace.Steps.Activitydiagram_Variable_Init;
import activitydiagramTrace.Steps.Step;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.Trace#getStatesTrace <em>States Trace</em>}</li>
 *   <li>{@link activitydiagramTrace.Trace#getRootSteps <em>Root Steps</em>}</li>
 *   <li>{@link activitydiagramTrace.Trace#getActivitydiagram_tracedForkedTokens <em>Activitydiagram traced Forked Tokens</em>}</li>
 *   <li>{@link activitydiagramTrace.Trace#getActivitydiagram_tracedBooleanValues <em>Activitydiagram traced Boolean Values</em>}</li>
 *   <li>{@link activitydiagramTrace.Trace#getActivitydiagram_tracedInputValues <em>Activitydiagram traced Input Values</em>}</li>
 *   <li>{@link activitydiagramTrace.Trace#getActivitydiagram_tracedActivitys <em>Activitydiagram traced Activitys</em>}</li>
 *   <li>{@link activitydiagramTrace.Trace#getActivitydiagram_tracedControlTokens <em>Activitydiagram traced Control Tokens</em>}</li>
 *   <li>{@link activitydiagramTrace.Trace#getActivitydiagram_tracedInputs <em>Activitydiagram traced Inputs</em>}</li>
 *   <li>{@link activitydiagramTrace.Trace#getActivitydiagram_tracedDecisionNodes <em>Activitydiagram traced Decision Nodes</em>}</li>
 *   <li>{@link activitydiagramTrace.Trace#getActivitydiagram_tracedOffers <em>Activitydiagram traced Offers</em>}</li>
 *   <li>{@link activitydiagramTrace.Trace#getActivitydiagram_tracedIntegerVariables <em>Activitydiagram traced Integer Variables</em>}</li>
 *   <li>{@link activitydiagramTrace.Trace#getActivitydiagram_tracedForkNodes <em>Activitydiagram traced Fork Nodes</em>}</li>
 *   <li>{@link activitydiagramTrace.Trace#getActivitydiagram_tracedControlFlows <em>Activitydiagram traced Control Flows</em>}</li>
 *   <li>{@link activitydiagramTrace.Trace#getActivitydiagram_tracedIntegerValues <em>Activitydiagram traced Integer Values</em>}</li>
 *   <li>{@link activitydiagramTrace.Trace#getActivitydiagram_tracedMergeNodes <em>Activitydiagram traced Merge Nodes</em>}</li>
 *   <li>{@link activitydiagramTrace.Trace#getActivitydiagram_tracedActivityFinalNodes <em>Activitydiagram traced Activity Final Nodes</em>}</li>
 *   <li>{@link activitydiagramTrace.Trace#getActivitydiagram_tracedBooleanVariables <em>Activitydiagram traced Boolean Variables</em>}</li>
 *   <li>{@link activitydiagramTrace.Trace#getActivitydiagram_tracedInitialNodes <em>Activitydiagram traced Initial Nodes</em>}</li>
 *   <li>{@link activitydiagramTrace.Trace#getActivitydiagram_tracedJoinNodes <em>Activitydiagram traced Join Nodes</em>}</li>
 *   <li>{@link activitydiagramTrace.Trace#getActivitydiagram_tracedOpaqueActions <em>Activitydiagram traced Opaque Actions</em>}</li>
 *   <li>{@link activitydiagramTrace.Trace#getActivitydiagram_tracedTraces <em>Activitydiagram traced Traces</em>}</li>
 *   <li>{@link activitydiagramTrace.Trace#getActivitydiagram_Activity_InitializeContext_Sequence <em>Activitydiagram Activity Initialize Context Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.Trace#getActivitydiagram_Activity_Execute_Sequence <em>Activitydiagram Activity Execute Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.Trace#getActivitydiagram_ActivityNode_SendOffers1_Sequence <em>Activitydiagram Activity Node Send Offers1 Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.Trace#getActivitydiagram_ActivityNode_TakeOfferdTokens1_Sequence <em>Activitydiagram Activity Node Take Offerd Tokens1 Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.Trace#getActivitydiagram_Variable_Init_Sequence <em>Activitydiagram Variable Init Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.Trace#getActivitydiagram_ActivityNode_Execute_Sequence <em>Activitydiagram Activity Node Execute Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.Trace#getActivitydiagram_ActivityNode_Terminate_Sequence <em>Activitydiagram Activity Node Terminate Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.Trace#getActivitydiagram_Activity_Reset_Sequence <em>Activitydiagram Activity Reset Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.Trace#getActivitydiagram_Activity_WriteTrace_Sequence <em>Activitydiagram Activity Write Trace Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.Trace#getActivitydiagram_Variable_Execute_Sequence <em>Activitydiagram Variable Execute Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.Trace#getActivitydiagram_ActivityNode_AddTokens1_Sequence <em>Activitydiagram Activity Node Add Tokens1 Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.Trace#getActivitydiagram_ActivityNode_RemoveToken1_Sequence <em>Activitydiagram Activity Node Remove Token1 Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.ActivitydiagramTracePackage#getTrace()
 * @model
 * @generated
 */
public interface Trace extends EObject {
	/**
	 * Returns the value of the '<em><b>States Trace</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States Trace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States Trace</em>' containment reference list.
	 * @see activitydiagramTrace.ActivitydiagramTracePackage#getTrace_StatesTrace()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getStatesTrace();

	/**
	 * Returns the value of the '<em><b>Root Steps</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.Steps.Step}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Steps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Steps</em>' containment reference list.
	 * @see activitydiagramTrace.ActivitydiagramTracePackage#getTrace_RootSteps()
	 * @model containment="true"
	 * @generated
	 */
	EList<Step> getRootSteps();

	/**
	 * Returns the value of the '<em><b>Activitydiagram traced Forked Tokens</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.activitydiagram.TracedForkedToken}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitydiagram traced Forked Tokens</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitydiagram traced Forked Tokens</em>' containment reference list.
	 * @see activitydiagramTrace.ActivitydiagramTracePackage#getTrace_Activitydiagram_tracedForkedTokens()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedForkedToken> getActivitydiagram_tracedForkedTokens();

	/**
	 * Returns the value of the '<em><b>Activitydiagram traced Boolean Values</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.activitydiagram.TracedBooleanValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitydiagram traced Boolean Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitydiagram traced Boolean Values</em>' containment reference list.
	 * @see activitydiagramTrace.ActivitydiagramTracePackage#getTrace_Activitydiagram_tracedBooleanValues()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedBooleanValue> getActivitydiagram_tracedBooleanValues();

	/**
	 * Returns the value of the '<em><b>Activitydiagram traced Input Values</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.activitydiagram.TracedInputValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitydiagram traced Input Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitydiagram traced Input Values</em>' containment reference list.
	 * @see activitydiagramTrace.ActivitydiagramTracePackage#getTrace_Activitydiagram_tracedInputValues()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedInputValue> getActivitydiagram_tracedInputValues();

	/**
	 * Returns the value of the '<em><b>Activitydiagram traced Activitys</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.activitydiagram.TracedActivity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitydiagram traced Activitys</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitydiagram traced Activitys</em>' containment reference list.
	 * @see activitydiagramTrace.ActivitydiagramTracePackage#getTrace_Activitydiagram_tracedActivitys()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedActivity> getActivitydiagram_tracedActivitys();

	/**
	 * Returns the value of the '<em><b>Activitydiagram traced Control Tokens</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.activitydiagram.TracedControlToken}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitydiagram traced Control Tokens</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitydiagram traced Control Tokens</em>' containment reference list.
	 * @see activitydiagramTrace.ActivitydiagramTracePackage#getTrace_Activitydiagram_tracedControlTokens()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedControlToken> getActivitydiagram_tracedControlTokens();

	/**
	 * Returns the value of the '<em><b>Activitydiagram traced Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.activitydiagram.TracedInput}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitydiagram traced Inputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitydiagram traced Inputs</em>' containment reference list.
	 * @see activitydiagramTrace.ActivitydiagramTracePackage#getTrace_Activitydiagram_tracedInputs()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedInput> getActivitydiagram_tracedInputs();

	/**
	 * Returns the value of the '<em><b>Activitydiagram traced Decision Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.activitydiagram.TracedDecisionNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitydiagram traced Decision Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitydiagram traced Decision Nodes</em>' containment reference list.
	 * @see activitydiagramTrace.ActivitydiagramTracePackage#getTrace_Activitydiagram_tracedDecisionNodes()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedDecisionNode> getActivitydiagram_tracedDecisionNodes();

	/**
	 * Returns the value of the '<em><b>Activitydiagram traced Offers</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.activitydiagram.TracedOffer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitydiagram traced Offers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitydiagram traced Offers</em>' containment reference list.
	 * @see activitydiagramTrace.ActivitydiagramTracePackage#getTrace_Activitydiagram_tracedOffers()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedOffer> getActivitydiagram_tracedOffers();

	/**
	 * Returns the value of the '<em><b>Activitydiagram traced Integer Variables</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.activitydiagram.TracedIntegerVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitydiagram traced Integer Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitydiagram traced Integer Variables</em>' containment reference list.
	 * @see activitydiagramTrace.ActivitydiagramTracePackage#getTrace_Activitydiagram_tracedIntegerVariables()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedIntegerVariable> getActivitydiagram_tracedIntegerVariables();

	/**
	 * Returns the value of the '<em><b>Activitydiagram traced Fork Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.activitydiagram.TracedForkNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitydiagram traced Fork Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitydiagram traced Fork Nodes</em>' containment reference list.
	 * @see activitydiagramTrace.ActivitydiagramTracePackage#getTrace_Activitydiagram_tracedForkNodes()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedForkNode> getActivitydiagram_tracedForkNodes();

	/**
	 * Returns the value of the '<em><b>Activitydiagram traced Control Flows</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.activitydiagram.TracedControlFlow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitydiagram traced Control Flows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitydiagram traced Control Flows</em>' containment reference list.
	 * @see activitydiagramTrace.ActivitydiagramTracePackage#getTrace_Activitydiagram_tracedControlFlows()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedControlFlow> getActivitydiagram_tracedControlFlows();

	/**
	 * Returns the value of the '<em><b>Activitydiagram traced Integer Values</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.activitydiagram.TracedIntegerValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitydiagram traced Integer Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitydiagram traced Integer Values</em>' containment reference list.
	 * @see activitydiagramTrace.ActivitydiagramTracePackage#getTrace_Activitydiagram_tracedIntegerValues()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedIntegerValue> getActivitydiagram_tracedIntegerValues();

	/**
	 * Returns the value of the '<em><b>Activitydiagram traced Merge Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.activitydiagram.TracedMergeNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitydiagram traced Merge Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitydiagram traced Merge Nodes</em>' containment reference list.
	 * @see activitydiagramTrace.ActivitydiagramTracePackage#getTrace_Activitydiagram_tracedMergeNodes()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedMergeNode> getActivitydiagram_tracedMergeNodes();

	/**
	 * Returns the value of the '<em><b>Activitydiagram traced Activity Final Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.activitydiagram.TracedActivityFinalNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitydiagram traced Activity Final Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitydiagram traced Activity Final Nodes</em>' containment reference list.
	 * @see activitydiagramTrace.ActivitydiagramTracePackage#getTrace_Activitydiagram_tracedActivityFinalNodes()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedActivityFinalNode> getActivitydiagram_tracedActivityFinalNodes();

	/**
	 * Returns the value of the '<em><b>Activitydiagram traced Boolean Variables</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.activitydiagram.TracedBooleanVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitydiagram traced Boolean Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitydiagram traced Boolean Variables</em>' containment reference list.
	 * @see activitydiagramTrace.ActivitydiagramTracePackage#getTrace_Activitydiagram_tracedBooleanVariables()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedBooleanVariable> getActivitydiagram_tracedBooleanVariables();

	/**
	 * Returns the value of the '<em><b>Activitydiagram traced Initial Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.activitydiagram.TracedInitialNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitydiagram traced Initial Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitydiagram traced Initial Nodes</em>' containment reference list.
	 * @see activitydiagramTrace.ActivitydiagramTracePackage#getTrace_Activitydiagram_tracedInitialNodes()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedInitialNode> getActivitydiagram_tracedInitialNodes();

	/**
	 * Returns the value of the '<em><b>Activitydiagram traced Join Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.activitydiagram.TracedJoinNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitydiagram traced Join Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitydiagram traced Join Nodes</em>' containment reference list.
	 * @see activitydiagramTrace.ActivitydiagramTracePackage#getTrace_Activitydiagram_tracedJoinNodes()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedJoinNode> getActivitydiagram_tracedJoinNodes();

	/**
	 * Returns the value of the '<em><b>Activitydiagram traced Opaque Actions</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.activitydiagram.TracedOpaqueAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitydiagram traced Opaque Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitydiagram traced Opaque Actions</em>' containment reference list.
	 * @see activitydiagramTrace.ActivitydiagramTracePackage#getTrace_Activitydiagram_tracedOpaqueActions()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedOpaqueAction> getActivitydiagram_tracedOpaqueActions();

	/**
	 * Returns the value of the '<em><b>Activitydiagram traced Traces</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.activitydiagram.TracedTrace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitydiagram traced Traces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitydiagram traced Traces</em>' containment reference list.
	 * @see activitydiagramTrace.ActivitydiagramTracePackage#getTrace_Activitydiagram_tracedTraces()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedTrace> getActivitydiagram_tracedTraces();

	/**
	 * Returns the value of the '<em><b>Activitydiagram Activity Initialize Context Sequence</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.Steps.Activitydiagram_Activity_InitializeContext}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitydiagram Activity Initialize Context Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitydiagram Activity Initialize Context Sequence</em>' reference list.
	 * @see activitydiagramTrace.ActivitydiagramTracePackage#getTrace_Activitydiagram_Activity_InitializeContext_Sequence()
	 * @model
	 * @generated
	 */
	EList<Activitydiagram_Activity_InitializeContext> getActivitydiagram_Activity_InitializeContext_Sequence();

	/**
	 * Returns the value of the '<em><b>Activitydiagram Activity Execute Sequence</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.Steps.Activitydiagram_Activity_Execute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitydiagram Activity Execute Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitydiagram Activity Execute Sequence</em>' reference list.
	 * @see activitydiagramTrace.ActivitydiagramTracePackage#getTrace_Activitydiagram_Activity_Execute_Sequence()
	 * @model
	 * @generated
	 */
	EList<Activitydiagram_Activity_Execute> getActivitydiagram_Activity_Execute_Sequence();

	/**
	 * Returns the value of the '<em><b>Activitydiagram Activity Node Send Offers1 Sequence</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_SendOffers1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitydiagram Activity Node Send Offers1 Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitydiagram Activity Node Send Offers1 Sequence</em>' reference list.
	 * @see activitydiagramTrace.ActivitydiagramTracePackage#getTrace_Activitydiagram_ActivityNode_SendOffers1_Sequence()
	 * @model
	 * @generated
	 */
	EList<Activitydiagram_ActivityNode_SendOffers1> getActivitydiagram_ActivityNode_SendOffers1_Sequence();

	/**
	 * Returns the value of the '<em><b>Activitydiagram Activity Node Take Offerd Tokens1 Sequence</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitydiagram Activity Node Take Offerd Tokens1 Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitydiagram Activity Node Take Offerd Tokens1 Sequence</em>' reference list.
	 * @see activitydiagramTrace.ActivitydiagramTracePackage#getTrace_Activitydiagram_ActivityNode_TakeOfferdTokens1_Sequence()
	 * @model
	 * @generated
	 */
	EList<Activitydiagram_ActivityNode_TakeOfferdTokens1> getActivitydiagram_ActivityNode_TakeOfferdTokens1_Sequence();

	/**
	 * Returns the value of the '<em><b>Activitydiagram Variable Init Sequence</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.Steps.Activitydiagram_Variable_Init}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitydiagram Variable Init Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitydiagram Variable Init Sequence</em>' reference list.
	 * @see activitydiagramTrace.ActivitydiagramTracePackage#getTrace_Activitydiagram_Variable_Init_Sequence()
	 * @model
	 * @generated
	 */
	EList<Activitydiagram_Variable_Init> getActivitydiagram_Variable_Init_Sequence();

	/**
	 * Returns the value of the '<em><b>Activitydiagram Activity Node Execute Sequence</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitydiagram Activity Node Execute Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitydiagram Activity Node Execute Sequence</em>' reference list.
	 * @see activitydiagramTrace.ActivitydiagramTracePackage#getTrace_Activitydiagram_ActivityNode_Execute_Sequence()
	 * @model
	 * @generated
	 */
	EList<Activitydiagram_ActivityNode_Execute> getActivitydiagram_ActivityNode_Execute_Sequence();

	/**
	 * Returns the value of the '<em><b>Activitydiagram Activity Node Terminate Sequence</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Terminate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitydiagram Activity Node Terminate Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitydiagram Activity Node Terminate Sequence</em>' reference list.
	 * @see activitydiagramTrace.ActivitydiagramTracePackage#getTrace_Activitydiagram_ActivityNode_Terminate_Sequence()
	 * @model
	 * @generated
	 */
	EList<Activitydiagram_ActivityNode_Terminate> getActivitydiagram_ActivityNode_Terminate_Sequence();

	/**
	 * Returns the value of the '<em><b>Activitydiagram Activity Reset Sequence</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.Steps.Activitydiagram_Activity_Reset}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitydiagram Activity Reset Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitydiagram Activity Reset Sequence</em>' reference list.
	 * @see activitydiagramTrace.ActivitydiagramTracePackage#getTrace_Activitydiagram_Activity_Reset_Sequence()
	 * @model
	 * @generated
	 */
	EList<Activitydiagram_Activity_Reset> getActivitydiagram_Activity_Reset_Sequence();

	/**
	 * Returns the value of the '<em><b>Activitydiagram Activity Write Trace Sequence</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.Steps.Activitydiagram_Activity_WriteTrace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitydiagram Activity Write Trace Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitydiagram Activity Write Trace Sequence</em>' reference list.
	 * @see activitydiagramTrace.ActivitydiagramTracePackage#getTrace_Activitydiagram_Activity_WriteTrace_Sequence()
	 * @model
	 * @generated
	 */
	EList<Activitydiagram_Activity_WriteTrace> getActivitydiagram_Activity_WriteTrace_Sequence();

	/**
	 * Returns the value of the '<em><b>Activitydiagram Variable Execute Sequence</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.Steps.Activitydiagram_Variable_Execute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitydiagram Variable Execute Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitydiagram Variable Execute Sequence</em>' reference list.
	 * @see activitydiagramTrace.ActivitydiagramTracePackage#getTrace_Activitydiagram_Variable_Execute_Sequence()
	 * @model
	 * @generated
	 */
	EList<Activitydiagram_Variable_Execute> getActivitydiagram_Variable_Execute_Sequence();

	/**
	 * Returns the value of the '<em><b>Activitydiagram Activity Node Add Tokens1 Sequence</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitydiagram Activity Node Add Tokens1 Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitydiagram Activity Node Add Tokens1 Sequence</em>' reference list.
	 * @see activitydiagramTrace.ActivitydiagramTracePackage#getTrace_Activitydiagram_ActivityNode_AddTokens1_Sequence()
	 * @model
	 * @generated
	 */
	EList<Activitydiagram_ActivityNode_AddTokens1> getActivitydiagram_ActivityNode_AddTokens1_Sequence();

	/**
	 * Returns the value of the '<em><b>Activitydiagram Activity Node Remove Token1 Sequence</b></em>' reference list.
	 * The list contents are of type {@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_RemoveToken1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitydiagram Activity Node Remove Token1 Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitydiagram Activity Node Remove Token1 Sequence</em>' reference list.
	 * @see activitydiagramTrace.ActivitydiagramTracePackage#getTrace_Activitydiagram_ActivityNode_RemoveToken1_Sequence()
	 * @model
	 * @generated
	 */
	EList<Activitydiagram_ActivityNode_RemoveToken1> getActivitydiagram_ActivityNode_RemoveToken1_Sequence();

} // Trace
