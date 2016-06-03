/**
 */
package activitydiagramTrace.impl;

import activitydiagramTrace.ActivitydiagramTracePackage;
import activitydiagramTrace.SpecificTrace;

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

import activitydiagramTrace.Steps.Activitydiagram_ActivityFinalNode_Execute;
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
import activitydiagramTrace.Steps.Activitydiagram_BooleanBinaryExpression_Execute;
import activitydiagramTrace.Steps.Activitydiagram_BooleanUnaryExpression_Execute;
import activitydiagramTrace.Steps.Activitydiagram_BooleanVariable_Execute;
import activitydiagramTrace.Steps.Activitydiagram_BooleanVariable_Init;
import activitydiagramTrace.Steps.Activitydiagram_DecisionNode_Execute;
import activitydiagramTrace.Steps.Activitydiagram_DecisionNode_SendOffers1;
import activitydiagramTrace.Steps.Activitydiagram_Expression_Execute;
import activitydiagramTrace.Steps.Activitydiagram_ForkNode_Execute;
import activitydiagramTrace.Steps.Activitydiagram_InitialNode_Execute;
import activitydiagramTrace.Steps.Activitydiagram_IntegerCalculationExpression_Execute;
import activitydiagramTrace.Steps.Activitydiagram_IntegerComparisonExpression_Execute;
import activitydiagramTrace.Steps.Activitydiagram_IntegerVariable_Execute;
import activitydiagramTrace.Steps.Activitydiagram_IntegerVariable_Init;
import activitydiagramTrace.Steps.Activitydiagram_JoinNode_Execute;
import activitydiagramTrace.Steps.Activitydiagram_MergeNode_Execute;
import activitydiagramTrace.Steps.Activitydiagram_NamedElement_Execute;
import activitydiagramTrace.Steps.Activitydiagram_OpaqueAction_Execute;
import activitydiagramTrace.Steps.SpecificStep;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.gemoc.executionframework.engine.mse.SequentialStep;

import org.gemoc.executionframework.engine.mse.impl.TraceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specific Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link activitydiagramTrace.impl.SpecificTraceImpl#getActivitydiagram_ActivityFinalNode_Execute_Sequence <em>Activitydiagram Activity Final Node Execute Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.SpecificTraceImpl#getActivitydiagram_ActivityNode_AddTokens1_Sequence <em>Activitydiagram Activity Node Add Tokens1 Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.SpecificTraceImpl#getActivitydiagram_ActivityNode_Execute_Sequence <em>Activitydiagram Activity Node Execute Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.SpecificTraceImpl#getActivitydiagram_ActivityNode_RemoveToken1_Sequence <em>Activitydiagram Activity Node Remove Token1 Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.SpecificTraceImpl#getActivitydiagram_ActivityNode_SendOffers1_Sequence <em>Activitydiagram Activity Node Send Offers1 Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.SpecificTraceImpl#getActivitydiagram_ActivityNode_TakeOfferdTokens1_Sequence <em>Activitydiagram Activity Node Take Offerd Tokens1 Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.SpecificTraceImpl#getActivitydiagram_ActivityNode_Terminate_Sequence <em>Activitydiagram Activity Node Terminate Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.SpecificTraceImpl#getActivitydiagram_Activity_Execute_Sequence <em>Activitydiagram Activity Execute Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.SpecificTraceImpl#getActivitydiagram_Activity_InitializeContext_Sequence <em>Activitydiagram Activity Initialize Context Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.SpecificTraceImpl#getActivitydiagram_Activity_Reset_Sequence <em>Activitydiagram Activity Reset Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.SpecificTraceImpl#getActivitydiagram_Activity_WriteTrace_Sequence <em>Activitydiagram Activity Write Trace Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.SpecificTraceImpl#getActivitydiagram_BooleanBinaryExpression_Execute_Sequence <em>Activitydiagram Boolean Binary Expression Execute Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.SpecificTraceImpl#getActivitydiagram_BooleanUnaryExpression_Execute_Sequence <em>Activitydiagram Boolean Unary Expression Execute Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.SpecificTraceImpl#getActivitydiagram_BooleanVariable_Execute_Sequence <em>Activitydiagram Boolean Variable Execute Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.SpecificTraceImpl#getActivitydiagram_BooleanVariable_Init_Sequence <em>Activitydiagram Boolean Variable Init Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.SpecificTraceImpl#getActivitydiagram_DecisionNode_Execute_Sequence <em>Activitydiagram Decision Node Execute Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.SpecificTraceImpl#getActivitydiagram_DecisionNode_SendOffers1_Sequence <em>Activitydiagram Decision Node Send Offers1 Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.SpecificTraceImpl#getActivitydiagram_Expression_Execute_Sequence <em>Activitydiagram Expression Execute Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.SpecificTraceImpl#getActivitydiagram_ForkNode_Execute_Sequence <em>Activitydiagram Fork Node Execute Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.SpecificTraceImpl#getActivitydiagram_InitialNode_Execute_Sequence <em>Activitydiagram Initial Node Execute Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.SpecificTraceImpl#getActivitydiagram_IntegerCalculationExpression_Execute_Sequence <em>Activitydiagram Integer Calculation Expression Execute Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.SpecificTraceImpl#getActivitydiagram_IntegerComparisonExpression_Execute_Sequence <em>Activitydiagram Integer Comparison Expression Execute Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.SpecificTraceImpl#getActivitydiagram_IntegerVariable_Execute_Sequence <em>Activitydiagram Integer Variable Execute Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.SpecificTraceImpl#getActivitydiagram_IntegerVariable_Init_Sequence <em>Activitydiagram Integer Variable Init Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.SpecificTraceImpl#getActivitydiagram_JoinNode_Execute_Sequence <em>Activitydiagram Join Node Execute Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.SpecificTraceImpl#getActivitydiagram_MergeNode_Execute_Sequence <em>Activitydiagram Merge Node Execute Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.SpecificTraceImpl#getActivitydiagram_NamedElement_Execute_Sequence <em>Activitydiagram Named Element Execute Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.SpecificTraceImpl#getActivitydiagram_OpaqueAction_Execute_Sequence <em>Activitydiagram Opaque Action Execute Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.SpecificTraceImpl#getActivitydiagram_tracedActivityFinalNodes <em>Activitydiagram traced Activity Final Nodes</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.SpecificTraceImpl#getActivitydiagram_tracedActivitys <em>Activitydiagram traced Activitys</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.SpecificTraceImpl#getActivitydiagram_tracedBooleanValues <em>Activitydiagram traced Boolean Values</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.SpecificTraceImpl#getActivitydiagram_tracedBooleanVariables <em>Activitydiagram traced Boolean Variables</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.SpecificTraceImpl#getActivitydiagram_tracedControlFlows <em>Activitydiagram traced Control Flows</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.SpecificTraceImpl#getActivitydiagram_tracedControlTokens <em>Activitydiagram traced Control Tokens</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.SpecificTraceImpl#getActivitydiagram_tracedDecisionNodes <em>Activitydiagram traced Decision Nodes</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.SpecificTraceImpl#getActivitydiagram_tracedForkNodes <em>Activitydiagram traced Fork Nodes</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.SpecificTraceImpl#getActivitydiagram_tracedForkedTokens <em>Activitydiagram traced Forked Tokens</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.SpecificTraceImpl#getActivitydiagram_tracedInitialNodes <em>Activitydiagram traced Initial Nodes</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.SpecificTraceImpl#getActivitydiagram_tracedInputValues <em>Activitydiagram traced Input Values</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.SpecificTraceImpl#getActivitydiagram_tracedInputs <em>Activitydiagram traced Inputs</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.SpecificTraceImpl#getActivitydiagram_tracedIntegerValues <em>Activitydiagram traced Integer Values</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.SpecificTraceImpl#getActivitydiagram_tracedIntegerVariables <em>Activitydiagram traced Integer Variables</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.SpecificTraceImpl#getActivitydiagram_tracedJoinNodes <em>Activitydiagram traced Join Nodes</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.SpecificTraceImpl#getActivitydiagram_tracedMergeNodes <em>Activitydiagram traced Merge Nodes</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.SpecificTraceImpl#getActivitydiagram_tracedOffers <em>Activitydiagram traced Offers</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.SpecificTraceImpl#getActivitydiagram_tracedOpaqueActions <em>Activitydiagram traced Opaque Actions</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.SpecificTraceImpl#getActivitydiagram_tracedTraces <em>Activitydiagram traced Traces</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.SpecificTraceImpl#getStatesTrace <em>States Trace</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecificTraceImpl extends TraceImpl<SequentialStep<SpecificStep>> implements SpecificTrace {
	/**
	 * The cached value of the '{@link #getActivitydiagram_ActivityFinalNode_Execute_Sequence() <em>Activitydiagram Activity Final Node Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_ActivityFinalNode_Execute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Activitydiagram_ActivityFinalNode_Execute> activitydiagram_ActivityFinalNode_Execute_Sequence;

	/**
	 * The cached value of the '{@link #getActivitydiagram_ActivityNode_AddTokens1_Sequence() <em>Activitydiagram Activity Node Add Tokens1 Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_ActivityNode_AddTokens1_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Activitydiagram_ActivityNode_AddTokens1> activitydiagram_ActivityNode_AddTokens1_Sequence;

	/**
	 * The cached value of the '{@link #getActivitydiagram_ActivityNode_Execute_Sequence() <em>Activitydiagram Activity Node Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_ActivityNode_Execute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Activitydiagram_ActivityNode_Execute> activitydiagram_ActivityNode_Execute_Sequence;

	/**
	 * The cached value of the '{@link #getActivitydiagram_ActivityNode_RemoveToken1_Sequence() <em>Activitydiagram Activity Node Remove Token1 Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_ActivityNode_RemoveToken1_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Activitydiagram_ActivityNode_RemoveToken1> activitydiagram_ActivityNode_RemoveToken1_Sequence;

	/**
	 * The cached value of the '{@link #getActivitydiagram_ActivityNode_SendOffers1_Sequence() <em>Activitydiagram Activity Node Send Offers1 Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_ActivityNode_SendOffers1_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Activitydiagram_ActivityNode_SendOffers1> activitydiagram_ActivityNode_SendOffers1_Sequence;

	/**
	 * The cached value of the '{@link #getActivitydiagram_ActivityNode_TakeOfferdTokens1_Sequence() <em>Activitydiagram Activity Node Take Offerd Tokens1 Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_ActivityNode_TakeOfferdTokens1_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Activitydiagram_ActivityNode_TakeOfferdTokens1> activitydiagram_ActivityNode_TakeOfferdTokens1_Sequence;

	/**
	 * The cached value of the '{@link #getActivitydiagram_ActivityNode_Terminate_Sequence() <em>Activitydiagram Activity Node Terminate Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_ActivityNode_Terminate_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Activitydiagram_ActivityNode_Terminate> activitydiagram_ActivityNode_Terminate_Sequence;

	/**
	 * The cached value of the '{@link #getActivitydiagram_Activity_Execute_Sequence() <em>Activitydiagram Activity Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_Activity_Execute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Activitydiagram_Activity_Execute> activitydiagram_Activity_Execute_Sequence;

	/**
	 * The cached value of the '{@link #getActivitydiagram_Activity_InitializeContext_Sequence() <em>Activitydiagram Activity Initialize Context Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_Activity_InitializeContext_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Activitydiagram_Activity_InitializeContext> activitydiagram_Activity_InitializeContext_Sequence;

	/**
	 * The cached value of the '{@link #getActivitydiagram_Activity_Reset_Sequence() <em>Activitydiagram Activity Reset Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_Activity_Reset_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Activitydiagram_Activity_Reset> activitydiagram_Activity_Reset_Sequence;

	/**
	 * The cached value of the '{@link #getActivitydiagram_Activity_WriteTrace_Sequence() <em>Activitydiagram Activity Write Trace Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_Activity_WriteTrace_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Activitydiagram_Activity_WriteTrace> activitydiagram_Activity_WriteTrace_Sequence;

	/**
	 * The cached value of the '{@link #getActivitydiagram_BooleanBinaryExpression_Execute_Sequence() <em>Activitydiagram Boolean Binary Expression Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_BooleanBinaryExpression_Execute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Activitydiagram_BooleanBinaryExpression_Execute> activitydiagram_BooleanBinaryExpression_Execute_Sequence;

	/**
	 * The cached value of the '{@link #getActivitydiagram_BooleanUnaryExpression_Execute_Sequence() <em>Activitydiagram Boolean Unary Expression Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_BooleanUnaryExpression_Execute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Activitydiagram_BooleanUnaryExpression_Execute> activitydiagram_BooleanUnaryExpression_Execute_Sequence;

	/**
	 * The cached value of the '{@link #getActivitydiagram_BooleanVariable_Execute_Sequence() <em>Activitydiagram Boolean Variable Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_BooleanVariable_Execute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Activitydiagram_BooleanVariable_Execute> activitydiagram_BooleanVariable_Execute_Sequence;

	/**
	 * The cached value of the '{@link #getActivitydiagram_BooleanVariable_Init_Sequence() <em>Activitydiagram Boolean Variable Init Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_BooleanVariable_Init_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Activitydiagram_BooleanVariable_Init> activitydiagram_BooleanVariable_Init_Sequence;

	/**
	 * The cached value of the '{@link #getActivitydiagram_DecisionNode_Execute_Sequence() <em>Activitydiagram Decision Node Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_DecisionNode_Execute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Activitydiagram_DecisionNode_Execute> activitydiagram_DecisionNode_Execute_Sequence;

	/**
	 * The cached value of the '{@link #getActivitydiagram_DecisionNode_SendOffers1_Sequence() <em>Activitydiagram Decision Node Send Offers1 Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_DecisionNode_SendOffers1_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Activitydiagram_DecisionNode_SendOffers1> activitydiagram_DecisionNode_SendOffers1_Sequence;

	/**
	 * The cached value of the '{@link #getActivitydiagram_Expression_Execute_Sequence() <em>Activitydiagram Expression Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_Expression_Execute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Activitydiagram_Expression_Execute> activitydiagram_Expression_Execute_Sequence;

	/**
	 * The cached value of the '{@link #getActivitydiagram_ForkNode_Execute_Sequence() <em>Activitydiagram Fork Node Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_ForkNode_Execute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Activitydiagram_ForkNode_Execute> activitydiagram_ForkNode_Execute_Sequence;

	/**
	 * The cached value of the '{@link #getActivitydiagram_InitialNode_Execute_Sequence() <em>Activitydiagram Initial Node Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_InitialNode_Execute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Activitydiagram_InitialNode_Execute> activitydiagram_InitialNode_Execute_Sequence;

	/**
	 * The cached value of the '{@link #getActivitydiagram_IntegerCalculationExpression_Execute_Sequence() <em>Activitydiagram Integer Calculation Expression Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_IntegerCalculationExpression_Execute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Activitydiagram_IntegerCalculationExpression_Execute> activitydiagram_IntegerCalculationExpression_Execute_Sequence;

	/**
	 * The cached value of the '{@link #getActivitydiagram_IntegerComparisonExpression_Execute_Sequence() <em>Activitydiagram Integer Comparison Expression Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_IntegerComparisonExpression_Execute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Activitydiagram_IntegerComparisonExpression_Execute> activitydiagram_IntegerComparisonExpression_Execute_Sequence;

	/**
	 * The cached value of the '{@link #getActivitydiagram_IntegerVariable_Execute_Sequence() <em>Activitydiagram Integer Variable Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_IntegerVariable_Execute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Activitydiagram_IntegerVariable_Execute> activitydiagram_IntegerVariable_Execute_Sequence;

	/**
	 * The cached value of the '{@link #getActivitydiagram_IntegerVariable_Init_Sequence() <em>Activitydiagram Integer Variable Init Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_IntegerVariable_Init_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Activitydiagram_IntegerVariable_Init> activitydiagram_IntegerVariable_Init_Sequence;

	/**
	 * The cached value of the '{@link #getActivitydiagram_JoinNode_Execute_Sequence() <em>Activitydiagram Join Node Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_JoinNode_Execute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Activitydiagram_JoinNode_Execute> activitydiagram_JoinNode_Execute_Sequence;

	/**
	 * The cached value of the '{@link #getActivitydiagram_MergeNode_Execute_Sequence() <em>Activitydiagram Merge Node Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_MergeNode_Execute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Activitydiagram_MergeNode_Execute> activitydiagram_MergeNode_Execute_Sequence;

	/**
	 * The cached value of the '{@link #getActivitydiagram_NamedElement_Execute_Sequence() <em>Activitydiagram Named Element Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_NamedElement_Execute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Activitydiagram_NamedElement_Execute> activitydiagram_NamedElement_Execute_Sequence;

	/**
	 * The cached value of the '{@link #getActivitydiagram_OpaqueAction_Execute_Sequence() <em>Activitydiagram Opaque Action Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_OpaqueAction_Execute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Activitydiagram_OpaqueAction_Execute> activitydiagram_OpaqueAction_Execute_Sequence;

	/**
	 * The cached value of the '{@link #getActivitydiagram_tracedActivityFinalNodes() <em>Activitydiagram traced Activity Final Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_tracedActivityFinalNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedActivityFinalNode> activitydiagram_tracedActivityFinalNodes;

	/**
	 * The cached value of the '{@link #getActivitydiagram_tracedActivitys() <em>Activitydiagram traced Activitys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_tracedActivitys()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedActivity> activitydiagram_tracedActivitys;

	/**
	 * The cached value of the '{@link #getActivitydiagram_tracedBooleanValues() <em>Activitydiagram traced Boolean Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_tracedBooleanValues()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedBooleanValue> activitydiagram_tracedBooleanValues;

	/**
	 * The cached value of the '{@link #getActivitydiagram_tracedBooleanVariables() <em>Activitydiagram traced Boolean Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_tracedBooleanVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedBooleanVariable> activitydiagram_tracedBooleanVariables;

	/**
	 * The cached value of the '{@link #getActivitydiagram_tracedControlFlows() <em>Activitydiagram traced Control Flows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_tracedControlFlows()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedControlFlow> activitydiagram_tracedControlFlows;

	/**
	 * The cached value of the '{@link #getActivitydiagram_tracedControlTokens() <em>Activitydiagram traced Control Tokens</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_tracedControlTokens()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedControlToken> activitydiagram_tracedControlTokens;

	/**
	 * The cached value of the '{@link #getActivitydiagram_tracedDecisionNodes() <em>Activitydiagram traced Decision Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_tracedDecisionNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedDecisionNode> activitydiagram_tracedDecisionNodes;

	/**
	 * The cached value of the '{@link #getActivitydiagram_tracedForkNodes() <em>Activitydiagram traced Fork Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_tracedForkNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedForkNode> activitydiagram_tracedForkNodes;

	/**
	 * The cached value of the '{@link #getActivitydiagram_tracedForkedTokens() <em>Activitydiagram traced Forked Tokens</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_tracedForkedTokens()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedForkedToken> activitydiagram_tracedForkedTokens;

	/**
	 * The cached value of the '{@link #getActivitydiagram_tracedInitialNodes() <em>Activitydiagram traced Initial Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_tracedInitialNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedInitialNode> activitydiagram_tracedInitialNodes;

	/**
	 * The cached value of the '{@link #getActivitydiagram_tracedInputValues() <em>Activitydiagram traced Input Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_tracedInputValues()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedInputValue> activitydiagram_tracedInputValues;

	/**
	 * The cached value of the '{@link #getActivitydiagram_tracedInputs() <em>Activitydiagram traced Inputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_tracedInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedInput> activitydiagram_tracedInputs;

	/**
	 * The cached value of the '{@link #getActivitydiagram_tracedIntegerValues() <em>Activitydiagram traced Integer Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_tracedIntegerValues()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedIntegerValue> activitydiagram_tracedIntegerValues;

	/**
	 * The cached value of the '{@link #getActivitydiagram_tracedIntegerVariables() <em>Activitydiagram traced Integer Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_tracedIntegerVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedIntegerVariable> activitydiagram_tracedIntegerVariables;

	/**
	 * The cached value of the '{@link #getActivitydiagram_tracedJoinNodes() <em>Activitydiagram traced Join Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_tracedJoinNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedJoinNode> activitydiagram_tracedJoinNodes;

	/**
	 * The cached value of the '{@link #getActivitydiagram_tracedMergeNodes() <em>Activitydiagram traced Merge Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_tracedMergeNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedMergeNode> activitydiagram_tracedMergeNodes;

	/**
	 * The cached value of the '{@link #getActivitydiagram_tracedOffers() <em>Activitydiagram traced Offers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_tracedOffers()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedOffer> activitydiagram_tracedOffers;

	/**
	 * The cached value of the '{@link #getActivitydiagram_tracedOpaqueActions() <em>Activitydiagram traced Opaque Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_tracedOpaqueActions()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedOpaqueAction> activitydiagram_tracedOpaqueActions;

	/**
	 * The cached value of the '{@link #getActivitydiagram_tracedTraces() <em>Activitydiagram traced Traces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_tracedTraces()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedTrace> activitydiagram_tracedTraces;

	/**
	 * The cached value of the '{@link #getStatesTrace() <em>States Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatesTrace()
	 * @generated
	 * @ordered
	 */
	protected EList<State> statesTrace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificTraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitydiagramTracePackage.Literals.SPECIFIC_TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetRootStep(SequentialStep<SpecificStep> newRootStep, NotificationChain msgs) {
		return super.basicSetRootStep(newRootStep, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activitydiagram_ActivityFinalNode_Execute> getActivitydiagram_ActivityFinalNode_Execute_Sequence() {
		if (activitydiagram_ActivityFinalNode_Execute_Sequence == null) {
			activitydiagram_ActivityFinalNode_Execute_Sequence = new EObjectResolvingEList<Activitydiagram_ActivityFinalNode_Execute>(Activitydiagram_ActivityFinalNode_Execute.class, this, ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_FINAL_NODE_EXECUTE_SEQUENCE);
		}
		return activitydiagram_ActivityFinalNode_Execute_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activitydiagram_ActivityNode_AddTokens1> getActivitydiagram_ActivityNode_AddTokens1_Sequence() {
		if (activitydiagram_ActivityNode_AddTokens1_Sequence == null) {
			activitydiagram_ActivityNode_AddTokens1_Sequence = new EObjectResolvingEList<Activitydiagram_ActivityNode_AddTokens1>(Activitydiagram_ActivityNode_AddTokens1.class, this, ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_SEQUENCE);
		}
		return activitydiagram_ActivityNode_AddTokens1_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activitydiagram_ActivityNode_Execute> getActivitydiagram_ActivityNode_Execute_Sequence() {
		if (activitydiagram_ActivityNode_Execute_Sequence == null) {
			activitydiagram_ActivityNode_Execute_Sequence = new EObjectResolvingEList<Activitydiagram_ActivityNode_Execute>(Activitydiagram_ActivityNode_Execute.class, this, ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_SEQUENCE);
		}
		return activitydiagram_ActivityNode_Execute_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activitydiagram_ActivityNode_RemoveToken1> getActivitydiagram_ActivityNode_RemoveToken1_Sequence() {
		if (activitydiagram_ActivityNode_RemoveToken1_Sequence == null) {
			activitydiagram_ActivityNode_RemoveToken1_Sequence = new EObjectResolvingEList<Activitydiagram_ActivityNode_RemoveToken1>(Activitydiagram_ActivityNode_RemoveToken1.class, this, ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN1_SEQUENCE);
		}
		return activitydiagram_ActivityNode_RemoveToken1_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activitydiagram_ActivityNode_SendOffers1> getActivitydiagram_ActivityNode_SendOffers1_Sequence() {
		if (activitydiagram_ActivityNode_SendOffers1_Sequence == null) {
			activitydiagram_ActivityNode_SendOffers1_Sequence = new EObjectResolvingEList<Activitydiagram_ActivityNode_SendOffers1>(Activitydiagram_ActivityNode_SendOffers1.class, this, ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1_SEQUENCE);
		}
		return activitydiagram_ActivityNode_SendOffers1_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activitydiagram_ActivityNode_TakeOfferdTokens1> getActivitydiagram_ActivityNode_TakeOfferdTokens1_Sequence() {
		if (activitydiagram_ActivityNode_TakeOfferdTokens1_Sequence == null) {
			activitydiagram_ActivityNode_TakeOfferdTokens1_Sequence = new EObjectResolvingEList<Activitydiagram_ActivityNode_TakeOfferdTokens1>(Activitydiagram_ActivityNode_TakeOfferdTokens1.class, this, ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_SEQUENCE);
		}
		return activitydiagram_ActivityNode_TakeOfferdTokens1_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activitydiagram_ActivityNode_Terminate> getActivitydiagram_ActivityNode_Terminate_Sequence() {
		if (activitydiagram_ActivityNode_Terminate_Sequence == null) {
			activitydiagram_ActivityNode_Terminate_Sequence = new EObjectResolvingEList<Activitydiagram_ActivityNode_Terminate>(Activitydiagram_ActivityNode_Terminate.class, this, ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE_SEQUENCE);
		}
		return activitydiagram_ActivityNode_Terminate_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activitydiagram_Activity_Execute> getActivitydiagram_Activity_Execute_Sequence() {
		if (activitydiagram_Activity_Execute_Sequence == null) {
			activitydiagram_Activity_Execute_Sequence = new EObjectResolvingEList<Activitydiagram_Activity_Execute>(Activitydiagram_Activity_Execute.class, this, ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_SEQUENCE);
		}
		return activitydiagram_Activity_Execute_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activitydiagram_Activity_InitializeContext> getActivitydiagram_Activity_InitializeContext_Sequence() {
		if (activitydiagram_Activity_InitializeContext_Sequence == null) {
			activitydiagram_Activity_InitializeContext_Sequence = new EObjectResolvingEList<Activitydiagram_Activity_InitializeContext>(Activitydiagram_Activity_InitializeContext.class, this, ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_INITIALIZE_CONTEXT_SEQUENCE);
		}
		return activitydiagram_Activity_InitializeContext_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activitydiagram_Activity_Reset> getActivitydiagram_Activity_Reset_Sequence() {
		if (activitydiagram_Activity_Reset_Sequence == null) {
			activitydiagram_Activity_Reset_Sequence = new EObjectResolvingEList<Activitydiagram_Activity_Reset>(Activitydiagram_Activity_Reset.class, this, ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_RESET_SEQUENCE);
		}
		return activitydiagram_Activity_Reset_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activitydiagram_Activity_WriteTrace> getActivitydiagram_Activity_WriteTrace_Sequence() {
		if (activitydiagram_Activity_WriteTrace_Sequence == null) {
			activitydiagram_Activity_WriteTrace_Sequence = new EObjectResolvingEList<Activitydiagram_Activity_WriteTrace>(Activitydiagram_Activity_WriteTrace.class, this, ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_SEQUENCE);
		}
		return activitydiagram_Activity_WriteTrace_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activitydiagram_BooleanBinaryExpression_Execute> getActivitydiagram_BooleanBinaryExpression_Execute_Sequence() {
		if (activitydiagram_BooleanBinaryExpression_Execute_Sequence == null) {
			activitydiagram_BooleanBinaryExpression_Execute_Sequence = new EObjectResolvingEList<Activitydiagram_BooleanBinaryExpression_Execute>(Activitydiagram_BooleanBinaryExpression_Execute.class, this, ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_BOOLEAN_BINARY_EXPRESSION_EXECUTE_SEQUENCE);
		}
		return activitydiagram_BooleanBinaryExpression_Execute_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activitydiagram_BooleanUnaryExpression_Execute> getActivitydiagram_BooleanUnaryExpression_Execute_Sequence() {
		if (activitydiagram_BooleanUnaryExpression_Execute_Sequence == null) {
			activitydiagram_BooleanUnaryExpression_Execute_Sequence = new EObjectResolvingEList<Activitydiagram_BooleanUnaryExpression_Execute>(Activitydiagram_BooleanUnaryExpression_Execute.class, this, ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_BOOLEAN_UNARY_EXPRESSION_EXECUTE_SEQUENCE);
		}
		return activitydiagram_BooleanUnaryExpression_Execute_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activitydiagram_BooleanVariable_Execute> getActivitydiagram_BooleanVariable_Execute_Sequence() {
		if (activitydiagram_BooleanVariable_Execute_Sequence == null) {
			activitydiagram_BooleanVariable_Execute_Sequence = new EObjectResolvingEList<Activitydiagram_BooleanVariable_Execute>(Activitydiagram_BooleanVariable_Execute.class, this, ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_EXECUTE_SEQUENCE);
		}
		return activitydiagram_BooleanVariable_Execute_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activitydiagram_BooleanVariable_Init> getActivitydiagram_BooleanVariable_Init_Sequence() {
		if (activitydiagram_BooleanVariable_Init_Sequence == null) {
			activitydiagram_BooleanVariable_Init_Sequence = new EObjectResolvingEList<Activitydiagram_BooleanVariable_Init>(Activitydiagram_BooleanVariable_Init.class, this, ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_INIT_SEQUENCE);
		}
		return activitydiagram_BooleanVariable_Init_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activitydiagram_DecisionNode_Execute> getActivitydiagram_DecisionNode_Execute_Sequence() {
		if (activitydiagram_DecisionNode_Execute_Sequence == null) {
			activitydiagram_DecisionNode_Execute_Sequence = new EObjectResolvingEList<Activitydiagram_DecisionNode_Execute>(Activitydiagram_DecisionNode_Execute.class, this, ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_DECISION_NODE_EXECUTE_SEQUENCE);
		}
		return activitydiagram_DecisionNode_Execute_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activitydiagram_DecisionNode_SendOffers1> getActivitydiagram_DecisionNode_SendOffers1_Sequence() {
		if (activitydiagram_DecisionNode_SendOffers1_Sequence == null) {
			activitydiagram_DecisionNode_SendOffers1_Sequence = new EObjectResolvingEList<Activitydiagram_DecisionNode_SendOffers1>(Activitydiagram_DecisionNode_SendOffers1.class, this, ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_DECISION_NODE_SEND_OFFERS1_SEQUENCE);
		}
		return activitydiagram_DecisionNode_SendOffers1_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activitydiagram_Expression_Execute> getActivitydiagram_Expression_Execute_Sequence() {
		if (activitydiagram_Expression_Execute_Sequence == null) {
			activitydiagram_Expression_Execute_Sequence = new EObjectResolvingEList<Activitydiagram_Expression_Execute>(Activitydiagram_Expression_Execute.class, this, ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_EXPRESSION_EXECUTE_SEQUENCE);
		}
		return activitydiagram_Expression_Execute_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activitydiagram_ForkNode_Execute> getActivitydiagram_ForkNode_Execute_Sequence() {
		if (activitydiagram_ForkNode_Execute_Sequence == null) {
			activitydiagram_ForkNode_Execute_Sequence = new EObjectResolvingEList<Activitydiagram_ForkNode_Execute>(Activitydiagram_ForkNode_Execute.class, this, ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_FORK_NODE_EXECUTE_SEQUENCE);
		}
		return activitydiagram_ForkNode_Execute_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activitydiagram_InitialNode_Execute> getActivitydiagram_InitialNode_Execute_Sequence() {
		if (activitydiagram_InitialNode_Execute_Sequence == null) {
			activitydiagram_InitialNode_Execute_Sequence = new EObjectResolvingEList<Activitydiagram_InitialNode_Execute>(Activitydiagram_InitialNode_Execute.class, this, ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_INITIAL_NODE_EXECUTE_SEQUENCE);
		}
		return activitydiagram_InitialNode_Execute_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activitydiagram_IntegerCalculationExpression_Execute> getActivitydiagram_IntegerCalculationExpression_Execute_Sequence() {
		if (activitydiagram_IntegerCalculationExpression_Execute_Sequence == null) {
			activitydiagram_IntegerCalculationExpression_Execute_Sequence = new EObjectResolvingEList<Activitydiagram_IntegerCalculationExpression_Execute>(Activitydiagram_IntegerCalculationExpression_Execute.class, this, ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_INTEGER_CALCULATION_EXPRESSION_EXECUTE_SEQUENCE);
		}
		return activitydiagram_IntegerCalculationExpression_Execute_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activitydiagram_IntegerComparisonExpression_Execute> getActivitydiagram_IntegerComparisonExpression_Execute_Sequence() {
		if (activitydiagram_IntegerComparisonExpression_Execute_Sequence == null) {
			activitydiagram_IntegerComparisonExpression_Execute_Sequence = new EObjectResolvingEList<Activitydiagram_IntegerComparisonExpression_Execute>(Activitydiagram_IntegerComparisonExpression_Execute.class, this, ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_INTEGER_COMPARISON_EXPRESSION_EXECUTE_SEQUENCE);
		}
		return activitydiagram_IntegerComparisonExpression_Execute_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activitydiagram_IntegerVariable_Execute> getActivitydiagram_IntegerVariable_Execute_Sequence() {
		if (activitydiagram_IntegerVariable_Execute_Sequence == null) {
			activitydiagram_IntegerVariable_Execute_Sequence = new EObjectResolvingEList<Activitydiagram_IntegerVariable_Execute>(Activitydiagram_IntegerVariable_Execute.class, this, ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_INTEGER_VARIABLE_EXECUTE_SEQUENCE);
		}
		return activitydiagram_IntegerVariable_Execute_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activitydiagram_IntegerVariable_Init> getActivitydiagram_IntegerVariable_Init_Sequence() {
		if (activitydiagram_IntegerVariable_Init_Sequence == null) {
			activitydiagram_IntegerVariable_Init_Sequence = new EObjectResolvingEList<Activitydiagram_IntegerVariable_Init>(Activitydiagram_IntegerVariable_Init.class, this, ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_INTEGER_VARIABLE_INIT_SEQUENCE);
		}
		return activitydiagram_IntegerVariable_Init_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activitydiagram_JoinNode_Execute> getActivitydiagram_JoinNode_Execute_Sequence() {
		if (activitydiagram_JoinNode_Execute_Sequence == null) {
			activitydiagram_JoinNode_Execute_Sequence = new EObjectResolvingEList<Activitydiagram_JoinNode_Execute>(Activitydiagram_JoinNode_Execute.class, this, ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_JOIN_NODE_EXECUTE_SEQUENCE);
		}
		return activitydiagram_JoinNode_Execute_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activitydiagram_MergeNode_Execute> getActivitydiagram_MergeNode_Execute_Sequence() {
		if (activitydiagram_MergeNode_Execute_Sequence == null) {
			activitydiagram_MergeNode_Execute_Sequence = new EObjectResolvingEList<Activitydiagram_MergeNode_Execute>(Activitydiagram_MergeNode_Execute.class, this, ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_MERGE_NODE_EXECUTE_SEQUENCE);
		}
		return activitydiagram_MergeNode_Execute_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activitydiagram_NamedElement_Execute> getActivitydiagram_NamedElement_Execute_Sequence() {
		if (activitydiagram_NamedElement_Execute_Sequence == null) {
			activitydiagram_NamedElement_Execute_Sequence = new EObjectResolvingEList<Activitydiagram_NamedElement_Execute>(Activitydiagram_NamedElement_Execute.class, this, ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_SEQUENCE);
		}
		return activitydiagram_NamedElement_Execute_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activitydiagram_OpaqueAction_Execute> getActivitydiagram_OpaqueAction_Execute_Sequence() {
		if (activitydiagram_OpaqueAction_Execute_Sequence == null) {
			activitydiagram_OpaqueAction_Execute_Sequence = new EObjectResolvingEList<Activitydiagram_OpaqueAction_Execute>(Activitydiagram_OpaqueAction_Execute.class, this, ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_OPAQUE_ACTION_EXECUTE_SEQUENCE);
		}
		return activitydiagram_OpaqueAction_Execute_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedActivityFinalNode> getActivitydiagram_tracedActivityFinalNodes() {
		if (activitydiagram_tracedActivityFinalNodes == null) {
			activitydiagram_tracedActivityFinalNodes = new EObjectContainmentEList<TracedActivityFinalNode>(TracedActivityFinalNode.class, this, ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_ACTIVITY_FINAL_NODES);
		}
		return activitydiagram_tracedActivityFinalNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedActivity> getActivitydiagram_tracedActivitys() {
		if (activitydiagram_tracedActivitys == null) {
			activitydiagram_tracedActivitys = new EObjectContainmentEList<TracedActivity>(TracedActivity.class, this, ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_ACTIVITYS);
		}
		return activitydiagram_tracedActivitys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedBooleanValue> getActivitydiagram_tracedBooleanValues() {
		if (activitydiagram_tracedBooleanValues == null) {
			activitydiagram_tracedBooleanValues = new EObjectContainmentEList<TracedBooleanValue>(TracedBooleanValue.class, this, ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_BOOLEAN_VALUES);
		}
		return activitydiagram_tracedBooleanValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedBooleanVariable> getActivitydiagram_tracedBooleanVariables() {
		if (activitydiagram_tracedBooleanVariables == null) {
			activitydiagram_tracedBooleanVariables = new EObjectContainmentEList<TracedBooleanVariable>(TracedBooleanVariable.class, this, ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_BOOLEAN_VARIABLES);
		}
		return activitydiagram_tracedBooleanVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedControlFlow> getActivitydiagram_tracedControlFlows() {
		if (activitydiagram_tracedControlFlows == null) {
			activitydiagram_tracedControlFlows = new EObjectContainmentEList<TracedControlFlow>(TracedControlFlow.class, this, ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_CONTROL_FLOWS);
		}
		return activitydiagram_tracedControlFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedControlToken> getActivitydiagram_tracedControlTokens() {
		if (activitydiagram_tracedControlTokens == null) {
			activitydiagram_tracedControlTokens = new EObjectContainmentEList<TracedControlToken>(TracedControlToken.class, this, ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_CONTROL_TOKENS);
		}
		return activitydiagram_tracedControlTokens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedDecisionNode> getActivitydiagram_tracedDecisionNodes() {
		if (activitydiagram_tracedDecisionNodes == null) {
			activitydiagram_tracedDecisionNodes = new EObjectContainmentEList<TracedDecisionNode>(TracedDecisionNode.class, this, ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_DECISION_NODES);
		}
		return activitydiagram_tracedDecisionNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedForkNode> getActivitydiagram_tracedForkNodes() {
		if (activitydiagram_tracedForkNodes == null) {
			activitydiagram_tracedForkNodes = new EObjectContainmentEList<TracedForkNode>(TracedForkNode.class, this, ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_FORK_NODES);
		}
		return activitydiagram_tracedForkNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedForkedToken> getActivitydiagram_tracedForkedTokens() {
		if (activitydiagram_tracedForkedTokens == null) {
			activitydiagram_tracedForkedTokens = new EObjectContainmentEList<TracedForkedToken>(TracedForkedToken.class, this, ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_FORKED_TOKENS);
		}
		return activitydiagram_tracedForkedTokens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedInitialNode> getActivitydiagram_tracedInitialNodes() {
		if (activitydiagram_tracedInitialNodes == null) {
			activitydiagram_tracedInitialNodes = new EObjectContainmentEList<TracedInitialNode>(TracedInitialNode.class, this, ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_INITIAL_NODES);
		}
		return activitydiagram_tracedInitialNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedInputValue> getActivitydiagram_tracedInputValues() {
		if (activitydiagram_tracedInputValues == null) {
			activitydiagram_tracedInputValues = new EObjectContainmentEList<TracedInputValue>(TracedInputValue.class, this, ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_INPUT_VALUES);
		}
		return activitydiagram_tracedInputValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedInput> getActivitydiagram_tracedInputs() {
		if (activitydiagram_tracedInputs == null) {
			activitydiagram_tracedInputs = new EObjectContainmentEList<TracedInput>(TracedInput.class, this, ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_INPUTS);
		}
		return activitydiagram_tracedInputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedIntegerValue> getActivitydiagram_tracedIntegerValues() {
		if (activitydiagram_tracedIntegerValues == null) {
			activitydiagram_tracedIntegerValues = new EObjectContainmentEList<TracedIntegerValue>(TracedIntegerValue.class, this, ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_INTEGER_VALUES);
		}
		return activitydiagram_tracedIntegerValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedIntegerVariable> getActivitydiagram_tracedIntegerVariables() {
		if (activitydiagram_tracedIntegerVariables == null) {
			activitydiagram_tracedIntegerVariables = new EObjectContainmentEList<TracedIntegerVariable>(TracedIntegerVariable.class, this, ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_INTEGER_VARIABLES);
		}
		return activitydiagram_tracedIntegerVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedJoinNode> getActivitydiagram_tracedJoinNodes() {
		if (activitydiagram_tracedJoinNodes == null) {
			activitydiagram_tracedJoinNodes = new EObjectContainmentEList<TracedJoinNode>(TracedJoinNode.class, this, ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_JOIN_NODES);
		}
		return activitydiagram_tracedJoinNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedMergeNode> getActivitydiagram_tracedMergeNodes() {
		if (activitydiagram_tracedMergeNodes == null) {
			activitydiagram_tracedMergeNodes = new EObjectContainmentEList<TracedMergeNode>(TracedMergeNode.class, this, ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_MERGE_NODES);
		}
		return activitydiagram_tracedMergeNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedOffer> getActivitydiagram_tracedOffers() {
		if (activitydiagram_tracedOffers == null) {
			activitydiagram_tracedOffers = new EObjectContainmentEList<TracedOffer>(TracedOffer.class, this, ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_OFFERS);
		}
		return activitydiagram_tracedOffers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedOpaqueAction> getActivitydiagram_tracedOpaqueActions() {
		if (activitydiagram_tracedOpaqueActions == null) {
			activitydiagram_tracedOpaqueActions = new EObjectContainmentEList<TracedOpaqueAction>(TracedOpaqueAction.class, this, ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_OPAQUE_ACTIONS);
		}
		return activitydiagram_tracedOpaqueActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedTrace> getActivitydiagram_tracedTraces() {
		if (activitydiagram_tracedTraces == null) {
			activitydiagram_tracedTraces = new EObjectContainmentEList<TracedTrace>(TracedTrace.class, this, ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_TRACES);
		}
		return activitydiagram_tracedTraces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStatesTrace() {
		if (statesTrace == null) {
			statesTrace = new EObjectContainmentEList<State>(State.class, this, ActivitydiagramTracePackage.SPECIFIC_TRACE__STATES_TRACE);
		}
		return statesTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_ACTIVITY_FINAL_NODES:
				return ((InternalEList<?>)getActivitydiagram_tracedActivityFinalNodes()).basicRemove(otherEnd, msgs);
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_ACTIVITYS:
				return ((InternalEList<?>)getActivitydiagram_tracedActivitys()).basicRemove(otherEnd, msgs);
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_BOOLEAN_VALUES:
				return ((InternalEList<?>)getActivitydiagram_tracedBooleanValues()).basicRemove(otherEnd, msgs);
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_BOOLEAN_VARIABLES:
				return ((InternalEList<?>)getActivitydiagram_tracedBooleanVariables()).basicRemove(otherEnd, msgs);
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_CONTROL_FLOWS:
				return ((InternalEList<?>)getActivitydiagram_tracedControlFlows()).basicRemove(otherEnd, msgs);
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_CONTROL_TOKENS:
				return ((InternalEList<?>)getActivitydiagram_tracedControlTokens()).basicRemove(otherEnd, msgs);
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_DECISION_NODES:
				return ((InternalEList<?>)getActivitydiagram_tracedDecisionNodes()).basicRemove(otherEnd, msgs);
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_FORK_NODES:
				return ((InternalEList<?>)getActivitydiagram_tracedForkNodes()).basicRemove(otherEnd, msgs);
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_FORKED_TOKENS:
				return ((InternalEList<?>)getActivitydiagram_tracedForkedTokens()).basicRemove(otherEnd, msgs);
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_INITIAL_NODES:
				return ((InternalEList<?>)getActivitydiagram_tracedInitialNodes()).basicRemove(otherEnd, msgs);
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_INPUT_VALUES:
				return ((InternalEList<?>)getActivitydiagram_tracedInputValues()).basicRemove(otherEnd, msgs);
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_INPUTS:
				return ((InternalEList<?>)getActivitydiagram_tracedInputs()).basicRemove(otherEnd, msgs);
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_INTEGER_VALUES:
				return ((InternalEList<?>)getActivitydiagram_tracedIntegerValues()).basicRemove(otherEnd, msgs);
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_INTEGER_VARIABLES:
				return ((InternalEList<?>)getActivitydiagram_tracedIntegerVariables()).basicRemove(otherEnd, msgs);
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_JOIN_NODES:
				return ((InternalEList<?>)getActivitydiagram_tracedJoinNodes()).basicRemove(otherEnd, msgs);
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_MERGE_NODES:
				return ((InternalEList<?>)getActivitydiagram_tracedMergeNodes()).basicRemove(otherEnd, msgs);
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_OFFERS:
				return ((InternalEList<?>)getActivitydiagram_tracedOffers()).basicRemove(otherEnd, msgs);
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_OPAQUE_ACTIONS:
				return ((InternalEList<?>)getActivitydiagram_tracedOpaqueActions()).basicRemove(otherEnd, msgs);
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_TRACES:
				return ((InternalEList<?>)getActivitydiagram_tracedTraces()).basicRemove(otherEnd, msgs);
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				return ((InternalEList<?>)getStatesTrace()).basicRemove(otherEnd, msgs);
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
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_FINAL_NODE_EXECUTE_SEQUENCE:
				return getActivitydiagram_ActivityFinalNode_Execute_Sequence();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_SEQUENCE:
				return getActivitydiagram_ActivityNode_AddTokens1_Sequence();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_SEQUENCE:
				return getActivitydiagram_ActivityNode_Execute_Sequence();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN1_SEQUENCE:
				return getActivitydiagram_ActivityNode_RemoveToken1_Sequence();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1_SEQUENCE:
				return getActivitydiagram_ActivityNode_SendOffers1_Sequence();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_SEQUENCE:
				return getActivitydiagram_ActivityNode_TakeOfferdTokens1_Sequence();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE_SEQUENCE:
				return getActivitydiagram_ActivityNode_Terminate_Sequence();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_SEQUENCE:
				return getActivitydiagram_Activity_Execute_Sequence();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_INITIALIZE_CONTEXT_SEQUENCE:
				return getActivitydiagram_Activity_InitializeContext_Sequence();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_RESET_SEQUENCE:
				return getActivitydiagram_Activity_Reset_Sequence();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_SEQUENCE:
				return getActivitydiagram_Activity_WriteTrace_Sequence();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_BOOLEAN_BINARY_EXPRESSION_EXECUTE_SEQUENCE:
				return getActivitydiagram_BooleanBinaryExpression_Execute_Sequence();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_BOOLEAN_UNARY_EXPRESSION_EXECUTE_SEQUENCE:
				return getActivitydiagram_BooleanUnaryExpression_Execute_Sequence();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_EXECUTE_SEQUENCE:
				return getActivitydiagram_BooleanVariable_Execute_Sequence();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_INIT_SEQUENCE:
				return getActivitydiagram_BooleanVariable_Init_Sequence();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_DECISION_NODE_EXECUTE_SEQUENCE:
				return getActivitydiagram_DecisionNode_Execute_Sequence();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_DECISION_NODE_SEND_OFFERS1_SEQUENCE:
				return getActivitydiagram_DecisionNode_SendOffers1_Sequence();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_EXPRESSION_EXECUTE_SEQUENCE:
				return getActivitydiagram_Expression_Execute_Sequence();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_FORK_NODE_EXECUTE_SEQUENCE:
				return getActivitydiagram_ForkNode_Execute_Sequence();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_INITIAL_NODE_EXECUTE_SEQUENCE:
				return getActivitydiagram_InitialNode_Execute_Sequence();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_INTEGER_CALCULATION_EXPRESSION_EXECUTE_SEQUENCE:
				return getActivitydiagram_IntegerCalculationExpression_Execute_Sequence();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_INTEGER_COMPARISON_EXPRESSION_EXECUTE_SEQUENCE:
				return getActivitydiagram_IntegerComparisonExpression_Execute_Sequence();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_INTEGER_VARIABLE_EXECUTE_SEQUENCE:
				return getActivitydiagram_IntegerVariable_Execute_Sequence();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_INTEGER_VARIABLE_INIT_SEQUENCE:
				return getActivitydiagram_IntegerVariable_Init_Sequence();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_JOIN_NODE_EXECUTE_SEQUENCE:
				return getActivitydiagram_JoinNode_Execute_Sequence();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_MERGE_NODE_EXECUTE_SEQUENCE:
				return getActivitydiagram_MergeNode_Execute_Sequence();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_SEQUENCE:
				return getActivitydiagram_NamedElement_Execute_Sequence();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_OPAQUE_ACTION_EXECUTE_SEQUENCE:
				return getActivitydiagram_OpaqueAction_Execute_Sequence();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_ACTIVITY_FINAL_NODES:
				return getActivitydiagram_tracedActivityFinalNodes();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_ACTIVITYS:
				return getActivitydiagram_tracedActivitys();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_BOOLEAN_VALUES:
				return getActivitydiagram_tracedBooleanValues();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_BOOLEAN_VARIABLES:
				return getActivitydiagram_tracedBooleanVariables();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_CONTROL_FLOWS:
				return getActivitydiagram_tracedControlFlows();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_CONTROL_TOKENS:
				return getActivitydiagram_tracedControlTokens();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_DECISION_NODES:
				return getActivitydiagram_tracedDecisionNodes();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_FORK_NODES:
				return getActivitydiagram_tracedForkNodes();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_FORKED_TOKENS:
				return getActivitydiagram_tracedForkedTokens();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_INITIAL_NODES:
				return getActivitydiagram_tracedInitialNodes();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_INPUT_VALUES:
				return getActivitydiagram_tracedInputValues();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_INPUTS:
				return getActivitydiagram_tracedInputs();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_INTEGER_VALUES:
				return getActivitydiagram_tracedIntegerValues();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_INTEGER_VARIABLES:
				return getActivitydiagram_tracedIntegerVariables();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_JOIN_NODES:
				return getActivitydiagram_tracedJoinNodes();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_MERGE_NODES:
				return getActivitydiagram_tracedMergeNodes();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_OFFERS:
				return getActivitydiagram_tracedOffers();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_OPAQUE_ACTIONS:
				return getActivitydiagram_tracedOpaqueActions();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_TRACES:
				return getActivitydiagram_tracedTraces();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				return getStatesTrace();
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
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_FINAL_NODE_EXECUTE_SEQUENCE:
				getActivitydiagram_ActivityFinalNode_Execute_Sequence().clear();
				getActivitydiagram_ActivityFinalNode_Execute_Sequence().addAll((Collection<? extends Activitydiagram_ActivityFinalNode_Execute>)newValue);
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_SEQUENCE:
				getActivitydiagram_ActivityNode_AddTokens1_Sequence().clear();
				getActivitydiagram_ActivityNode_AddTokens1_Sequence().addAll((Collection<? extends Activitydiagram_ActivityNode_AddTokens1>)newValue);
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_SEQUENCE:
				getActivitydiagram_ActivityNode_Execute_Sequence().clear();
				getActivitydiagram_ActivityNode_Execute_Sequence().addAll((Collection<? extends Activitydiagram_ActivityNode_Execute>)newValue);
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN1_SEQUENCE:
				getActivitydiagram_ActivityNode_RemoveToken1_Sequence().clear();
				getActivitydiagram_ActivityNode_RemoveToken1_Sequence().addAll((Collection<? extends Activitydiagram_ActivityNode_RemoveToken1>)newValue);
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1_SEQUENCE:
				getActivitydiagram_ActivityNode_SendOffers1_Sequence().clear();
				getActivitydiagram_ActivityNode_SendOffers1_Sequence().addAll((Collection<? extends Activitydiagram_ActivityNode_SendOffers1>)newValue);
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_SEQUENCE:
				getActivitydiagram_ActivityNode_TakeOfferdTokens1_Sequence().clear();
				getActivitydiagram_ActivityNode_TakeOfferdTokens1_Sequence().addAll((Collection<? extends Activitydiagram_ActivityNode_TakeOfferdTokens1>)newValue);
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE_SEQUENCE:
				getActivitydiagram_ActivityNode_Terminate_Sequence().clear();
				getActivitydiagram_ActivityNode_Terminate_Sequence().addAll((Collection<? extends Activitydiagram_ActivityNode_Terminate>)newValue);
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_SEQUENCE:
				getActivitydiagram_Activity_Execute_Sequence().clear();
				getActivitydiagram_Activity_Execute_Sequence().addAll((Collection<? extends Activitydiagram_Activity_Execute>)newValue);
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_INITIALIZE_CONTEXT_SEQUENCE:
				getActivitydiagram_Activity_InitializeContext_Sequence().clear();
				getActivitydiagram_Activity_InitializeContext_Sequence().addAll((Collection<? extends Activitydiagram_Activity_InitializeContext>)newValue);
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_RESET_SEQUENCE:
				getActivitydiagram_Activity_Reset_Sequence().clear();
				getActivitydiagram_Activity_Reset_Sequence().addAll((Collection<? extends Activitydiagram_Activity_Reset>)newValue);
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_SEQUENCE:
				getActivitydiagram_Activity_WriteTrace_Sequence().clear();
				getActivitydiagram_Activity_WriteTrace_Sequence().addAll((Collection<? extends Activitydiagram_Activity_WriteTrace>)newValue);
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_BOOLEAN_BINARY_EXPRESSION_EXECUTE_SEQUENCE:
				getActivitydiagram_BooleanBinaryExpression_Execute_Sequence().clear();
				getActivitydiagram_BooleanBinaryExpression_Execute_Sequence().addAll((Collection<? extends Activitydiagram_BooleanBinaryExpression_Execute>)newValue);
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_BOOLEAN_UNARY_EXPRESSION_EXECUTE_SEQUENCE:
				getActivitydiagram_BooleanUnaryExpression_Execute_Sequence().clear();
				getActivitydiagram_BooleanUnaryExpression_Execute_Sequence().addAll((Collection<? extends Activitydiagram_BooleanUnaryExpression_Execute>)newValue);
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_EXECUTE_SEQUENCE:
				getActivitydiagram_BooleanVariable_Execute_Sequence().clear();
				getActivitydiagram_BooleanVariable_Execute_Sequence().addAll((Collection<? extends Activitydiagram_BooleanVariable_Execute>)newValue);
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_INIT_SEQUENCE:
				getActivitydiagram_BooleanVariable_Init_Sequence().clear();
				getActivitydiagram_BooleanVariable_Init_Sequence().addAll((Collection<? extends Activitydiagram_BooleanVariable_Init>)newValue);
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_DECISION_NODE_EXECUTE_SEQUENCE:
				getActivitydiagram_DecisionNode_Execute_Sequence().clear();
				getActivitydiagram_DecisionNode_Execute_Sequence().addAll((Collection<? extends Activitydiagram_DecisionNode_Execute>)newValue);
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_DECISION_NODE_SEND_OFFERS1_SEQUENCE:
				getActivitydiagram_DecisionNode_SendOffers1_Sequence().clear();
				getActivitydiagram_DecisionNode_SendOffers1_Sequence().addAll((Collection<? extends Activitydiagram_DecisionNode_SendOffers1>)newValue);
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_EXPRESSION_EXECUTE_SEQUENCE:
				getActivitydiagram_Expression_Execute_Sequence().clear();
				getActivitydiagram_Expression_Execute_Sequence().addAll((Collection<? extends Activitydiagram_Expression_Execute>)newValue);
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_FORK_NODE_EXECUTE_SEQUENCE:
				getActivitydiagram_ForkNode_Execute_Sequence().clear();
				getActivitydiagram_ForkNode_Execute_Sequence().addAll((Collection<? extends Activitydiagram_ForkNode_Execute>)newValue);
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_INITIAL_NODE_EXECUTE_SEQUENCE:
				getActivitydiagram_InitialNode_Execute_Sequence().clear();
				getActivitydiagram_InitialNode_Execute_Sequence().addAll((Collection<? extends Activitydiagram_InitialNode_Execute>)newValue);
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_INTEGER_CALCULATION_EXPRESSION_EXECUTE_SEQUENCE:
				getActivitydiagram_IntegerCalculationExpression_Execute_Sequence().clear();
				getActivitydiagram_IntegerCalculationExpression_Execute_Sequence().addAll((Collection<? extends Activitydiagram_IntegerCalculationExpression_Execute>)newValue);
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_INTEGER_COMPARISON_EXPRESSION_EXECUTE_SEQUENCE:
				getActivitydiagram_IntegerComparisonExpression_Execute_Sequence().clear();
				getActivitydiagram_IntegerComparisonExpression_Execute_Sequence().addAll((Collection<? extends Activitydiagram_IntegerComparisonExpression_Execute>)newValue);
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_INTEGER_VARIABLE_EXECUTE_SEQUENCE:
				getActivitydiagram_IntegerVariable_Execute_Sequence().clear();
				getActivitydiagram_IntegerVariable_Execute_Sequence().addAll((Collection<? extends Activitydiagram_IntegerVariable_Execute>)newValue);
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_INTEGER_VARIABLE_INIT_SEQUENCE:
				getActivitydiagram_IntegerVariable_Init_Sequence().clear();
				getActivitydiagram_IntegerVariable_Init_Sequence().addAll((Collection<? extends Activitydiagram_IntegerVariable_Init>)newValue);
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_JOIN_NODE_EXECUTE_SEQUENCE:
				getActivitydiagram_JoinNode_Execute_Sequence().clear();
				getActivitydiagram_JoinNode_Execute_Sequence().addAll((Collection<? extends Activitydiagram_JoinNode_Execute>)newValue);
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_MERGE_NODE_EXECUTE_SEQUENCE:
				getActivitydiagram_MergeNode_Execute_Sequence().clear();
				getActivitydiagram_MergeNode_Execute_Sequence().addAll((Collection<? extends Activitydiagram_MergeNode_Execute>)newValue);
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_SEQUENCE:
				getActivitydiagram_NamedElement_Execute_Sequence().clear();
				getActivitydiagram_NamedElement_Execute_Sequence().addAll((Collection<? extends Activitydiagram_NamedElement_Execute>)newValue);
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_OPAQUE_ACTION_EXECUTE_SEQUENCE:
				getActivitydiagram_OpaqueAction_Execute_Sequence().clear();
				getActivitydiagram_OpaqueAction_Execute_Sequence().addAll((Collection<? extends Activitydiagram_OpaqueAction_Execute>)newValue);
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_ACTIVITY_FINAL_NODES:
				getActivitydiagram_tracedActivityFinalNodes().clear();
				getActivitydiagram_tracedActivityFinalNodes().addAll((Collection<? extends TracedActivityFinalNode>)newValue);
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_ACTIVITYS:
				getActivitydiagram_tracedActivitys().clear();
				getActivitydiagram_tracedActivitys().addAll((Collection<? extends TracedActivity>)newValue);
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_BOOLEAN_VALUES:
				getActivitydiagram_tracedBooleanValues().clear();
				getActivitydiagram_tracedBooleanValues().addAll((Collection<? extends TracedBooleanValue>)newValue);
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_BOOLEAN_VARIABLES:
				getActivitydiagram_tracedBooleanVariables().clear();
				getActivitydiagram_tracedBooleanVariables().addAll((Collection<? extends TracedBooleanVariable>)newValue);
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_CONTROL_FLOWS:
				getActivitydiagram_tracedControlFlows().clear();
				getActivitydiagram_tracedControlFlows().addAll((Collection<? extends TracedControlFlow>)newValue);
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_CONTROL_TOKENS:
				getActivitydiagram_tracedControlTokens().clear();
				getActivitydiagram_tracedControlTokens().addAll((Collection<? extends TracedControlToken>)newValue);
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_DECISION_NODES:
				getActivitydiagram_tracedDecisionNodes().clear();
				getActivitydiagram_tracedDecisionNodes().addAll((Collection<? extends TracedDecisionNode>)newValue);
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_FORK_NODES:
				getActivitydiagram_tracedForkNodes().clear();
				getActivitydiagram_tracedForkNodes().addAll((Collection<? extends TracedForkNode>)newValue);
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_FORKED_TOKENS:
				getActivitydiagram_tracedForkedTokens().clear();
				getActivitydiagram_tracedForkedTokens().addAll((Collection<? extends TracedForkedToken>)newValue);
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_INITIAL_NODES:
				getActivitydiagram_tracedInitialNodes().clear();
				getActivitydiagram_tracedInitialNodes().addAll((Collection<? extends TracedInitialNode>)newValue);
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_INPUT_VALUES:
				getActivitydiagram_tracedInputValues().clear();
				getActivitydiagram_tracedInputValues().addAll((Collection<? extends TracedInputValue>)newValue);
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_INPUTS:
				getActivitydiagram_tracedInputs().clear();
				getActivitydiagram_tracedInputs().addAll((Collection<? extends TracedInput>)newValue);
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_INTEGER_VALUES:
				getActivitydiagram_tracedIntegerValues().clear();
				getActivitydiagram_tracedIntegerValues().addAll((Collection<? extends TracedIntegerValue>)newValue);
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_INTEGER_VARIABLES:
				getActivitydiagram_tracedIntegerVariables().clear();
				getActivitydiagram_tracedIntegerVariables().addAll((Collection<? extends TracedIntegerVariable>)newValue);
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_JOIN_NODES:
				getActivitydiagram_tracedJoinNodes().clear();
				getActivitydiagram_tracedJoinNodes().addAll((Collection<? extends TracedJoinNode>)newValue);
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_MERGE_NODES:
				getActivitydiagram_tracedMergeNodes().clear();
				getActivitydiagram_tracedMergeNodes().addAll((Collection<? extends TracedMergeNode>)newValue);
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_OFFERS:
				getActivitydiagram_tracedOffers().clear();
				getActivitydiagram_tracedOffers().addAll((Collection<? extends TracedOffer>)newValue);
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_OPAQUE_ACTIONS:
				getActivitydiagram_tracedOpaqueActions().clear();
				getActivitydiagram_tracedOpaqueActions().addAll((Collection<? extends TracedOpaqueAction>)newValue);
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_TRACES:
				getActivitydiagram_tracedTraces().clear();
				getActivitydiagram_tracedTraces().addAll((Collection<? extends TracedTrace>)newValue);
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				getStatesTrace().clear();
				getStatesTrace().addAll((Collection<? extends State>)newValue);
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
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_FINAL_NODE_EXECUTE_SEQUENCE:
				getActivitydiagram_ActivityFinalNode_Execute_Sequence().clear();
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_SEQUENCE:
				getActivitydiagram_ActivityNode_AddTokens1_Sequence().clear();
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_SEQUENCE:
				getActivitydiagram_ActivityNode_Execute_Sequence().clear();
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN1_SEQUENCE:
				getActivitydiagram_ActivityNode_RemoveToken1_Sequence().clear();
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1_SEQUENCE:
				getActivitydiagram_ActivityNode_SendOffers1_Sequence().clear();
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_SEQUENCE:
				getActivitydiagram_ActivityNode_TakeOfferdTokens1_Sequence().clear();
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE_SEQUENCE:
				getActivitydiagram_ActivityNode_Terminate_Sequence().clear();
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_SEQUENCE:
				getActivitydiagram_Activity_Execute_Sequence().clear();
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_INITIALIZE_CONTEXT_SEQUENCE:
				getActivitydiagram_Activity_InitializeContext_Sequence().clear();
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_RESET_SEQUENCE:
				getActivitydiagram_Activity_Reset_Sequence().clear();
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_SEQUENCE:
				getActivitydiagram_Activity_WriteTrace_Sequence().clear();
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_BOOLEAN_BINARY_EXPRESSION_EXECUTE_SEQUENCE:
				getActivitydiagram_BooleanBinaryExpression_Execute_Sequence().clear();
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_BOOLEAN_UNARY_EXPRESSION_EXECUTE_SEQUENCE:
				getActivitydiagram_BooleanUnaryExpression_Execute_Sequence().clear();
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_EXECUTE_SEQUENCE:
				getActivitydiagram_BooleanVariable_Execute_Sequence().clear();
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_INIT_SEQUENCE:
				getActivitydiagram_BooleanVariable_Init_Sequence().clear();
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_DECISION_NODE_EXECUTE_SEQUENCE:
				getActivitydiagram_DecisionNode_Execute_Sequence().clear();
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_DECISION_NODE_SEND_OFFERS1_SEQUENCE:
				getActivitydiagram_DecisionNode_SendOffers1_Sequence().clear();
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_EXPRESSION_EXECUTE_SEQUENCE:
				getActivitydiagram_Expression_Execute_Sequence().clear();
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_FORK_NODE_EXECUTE_SEQUENCE:
				getActivitydiagram_ForkNode_Execute_Sequence().clear();
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_INITIAL_NODE_EXECUTE_SEQUENCE:
				getActivitydiagram_InitialNode_Execute_Sequence().clear();
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_INTEGER_CALCULATION_EXPRESSION_EXECUTE_SEQUENCE:
				getActivitydiagram_IntegerCalculationExpression_Execute_Sequence().clear();
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_INTEGER_COMPARISON_EXPRESSION_EXECUTE_SEQUENCE:
				getActivitydiagram_IntegerComparisonExpression_Execute_Sequence().clear();
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_INTEGER_VARIABLE_EXECUTE_SEQUENCE:
				getActivitydiagram_IntegerVariable_Execute_Sequence().clear();
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_INTEGER_VARIABLE_INIT_SEQUENCE:
				getActivitydiagram_IntegerVariable_Init_Sequence().clear();
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_JOIN_NODE_EXECUTE_SEQUENCE:
				getActivitydiagram_JoinNode_Execute_Sequence().clear();
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_MERGE_NODE_EXECUTE_SEQUENCE:
				getActivitydiagram_MergeNode_Execute_Sequence().clear();
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_SEQUENCE:
				getActivitydiagram_NamedElement_Execute_Sequence().clear();
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_OPAQUE_ACTION_EXECUTE_SEQUENCE:
				getActivitydiagram_OpaqueAction_Execute_Sequence().clear();
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_ACTIVITY_FINAL_NODES:
				getActivitydiagram_tracedActivityFinalNodes().clear();
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_ACTIVITYS:
				getActivitydiagram_tracedActivitys().clear();
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_BOOLEAN_VALUES:
				getActivitydiagram_tracedBooleanValues().clear();
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_BOOLEAN_VARIABLES:
				getActivitydiagram_tracedBooleanVariables().clear();
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_CONTROL_FLOWS:
				getActivitydiagram_tracedControlFlows().clear();
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_CONTROL_TOKENS:
				getActivitydiagram_tracedControlTokens().clear();
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_DECISION_NODES:
				getActivitydiagram_tracedDecisionNodes().clear();
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_FORK_NODES:
				getActivitydiagram_tracedForkNodes().clear();
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_FORKED_TOKENS:
				getActivitydiagram_tracedForkedTokens().clear();
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_INITIAL_NODES:
				getActivitydiagram_tracedInitialNodes().clear();
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_INPUT_VALUES:
				getActivitydiagram_tracedInputValues().clear();
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_INPUTS:
				getActivitydiagram_tracedInputs().clear();
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_INTEGER_VALUES:
				getActivitydiagram_tracedIntegerValues().clear();
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_INTEGER_VARIABLES:
				getActivitydiagram_tracedIntegerVariables().clear();
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_JOIN_NODES:
				getActivitydiagram_tracedJoinNodes().clear();
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_MERGE_NODES:
				getActivitydiagram_tracedMergeNodes().clear();
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_OFFERS:
				getActivitydiagram_tracedOffers().clear();
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_OPAQUE_ACTIONS:
				getActivitydiagram_tracedOpaqueActions().clear();
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_TRACES:
				getActivitydiagram_tracedTraces().clear();
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				getStatesTrace().clear();
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
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_FINAL_NODE_EXECUTE_SEQUENCE:
				return activitydiagram_ActivityFinalNode_Execute_Sequence != null && !activitydiagram_ActivityFinalNode_Execute_Sequence.isEmpty();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_SEQUENCE:
				return activitydiagram_ActivityNode_AddTokens1_Sequence != null && !activitydiagram_ActivityNode_AddTokens1_Sequence.isEmpty();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_SEQUENCE:
				return activitydiagram_ActivityNode_Execute_Sequence != null && !activitydiagram_ActivityNode_Execute_Sequence.isEmpty();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN1_SEQUENCE:
				return activitydiagram_ActivityNode_RemoveToken1_Sequence != null && !activitydiagram_ActivityNode_RemoveToken1_Sequence.isEmpty();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1_SEQUENCE:
				return activitydiagram_ActivityNode_SendOffers1_Sequence != null && !activitydiagram_ActivityNode_SendOffers1_Sequence.isEmpty();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_SEQUENCE:
				return activitydiagram_ActivityNode_TakeOfferdTokens1_Sequence != null && !activitydiagram_ActivityNode_TakeOfferdTokens1_Sequence.isEmpty();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE_SEQUENCE:
				return activitydiagram_ActivityNode_Terminate_Sequence != null && !activitydiagram_ActivityNode_Terminate_Sequence.isEmpty();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_SEQUENCE:
				return activitydiagram_Activity_Execute_Sequence != null && !activitydiagram_Activity_Execute_Sequence.isEmpty();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_INITIALIZE_CONTEXT_SEQUENCE:
				return activitydiagram_Activity_InitializeContext_Sequence != null && !activitydiagram_Activity_InitializeContext_Sequence.isEmpty();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_RESET_SEQUENCE:
				return activitydiagram_Activity_Reset_Sequence != null && !activitydiagram_Activity_Reset_Sequence.isEmpty();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_SEQUENCE:
				return activitydiagram_Activity_WriteTrace_Sequence != null && !activitydiagram_Activity_WriteTrace_Sequence.isEmpty();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_BOOLEAN_BINARY_EXPRESSION_EXECUTE_SEQUENCE:
				return activitydiagram_BooleanBinaryExpression_Execute_Sequence != null && !activitydiagram_BooleanBinaryExpression_Execute_Sequence.isEmpty();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_BOOLEAN_UNARY_EXPRESSION_EXECUTE_SEQUENCE:
				return activitydiagram_BooleanUnaryExpression_Execute_Sequence != null && !activitydiagram_BooleanUnaryExpression_Execute_Sequence.isEmpty();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_EXECUTE_SEQUENCE:
				return activitydiagram_BooleanVariable_Execute_Sequence != null && !activitydiagram_BooleanVariable_Execute_Sequence.isEmpty();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_INIT_SEQUENCE:
				return activitydiagram_BooleanVariable_Init_Sequence != null && !activitydiagram_BooleanVariable_Init_Sequence.isEmpty();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_DECISION_NODE_EXECUTE_SEQUENCE:
				return activitydiagram_DecisionNode_Execute_Sequence != null && !activitydiagram_DecisionNode_Execute_Sequence.isEmpty();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_DECISION_NODE_SEND_OFFERS1_SEQUENCE:
				return activitydiagram_DecisionNode_SendOffers1_Sequence != null && !activitydiagram_DecisionNode_SendOffers1_Sequence.isEmpty();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_EXPRESSION_EXECUTE_SEQUENCE:
				return activitydiagram_Expression_Execute_Sequence != null && !activitydiagram_Expression_Execute_Sequence.isEmpty();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_FORK_NODE_EXECUTE_SEQUENCE:
				return activitydiagram_ForkNode_Execute_Sequence != null && !activitydiagram_ForkNode_Execute_Sequence.isEmpty();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_INITIAL_NODE_EXECUTE_SEQUENCE:
				return activitydiagram_InitialNode_Execute_Sequence != null && !activitydiagram_InitialNode_Execute_Sequence.isEmpty();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_INTEGER_CALCULATION_EXPRESSION_EXECUTE_SEQUENCE:
				return activitydiagram_IntegerCalculationExpression_Execute_Sequence != null && !activitydiagram_IntegerCalculationExpression_Execute_Sequence.isEmpty();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_INTEGER_COMPARISON_EXPRESSION_EXECUTE_SEQUENCE:
				return activitydiagram_IntegerComparisonExpression_Execute_Sequence != null && !activitydiagram_IntegerComparisonExpression_Execute_Sequence.isEmpty();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_INTEGER_VARIABLE_EXECUTE_SEQUENCE:
				return activitydiagram_IntegerVariable_Execute_Sequence != null && !activitydiagram_IntegerVariable_Execute_Sequence.isEmpty();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_INTEGER_VARIABLE_INIT_SEQUENCE:
				return activitydiagram_IntegerVariable_Init_Sequence != null && !activitydiagram_IntegerVariable_Init_Sequence.isEmpty();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_JOIN_NODE_EXECUTE_SEQUENCE:
				return activitydiagram_JoinNode_Execute_Sequence != null && !activitydiagram_JoinNode_Execute_Sequence.isEmpty();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_MERGE_NODE_EXECUTE_SEQUENCE:
				return activitydiagram_MergeNode_Execute_Sequence != null && !activitydiagram_MergeNode_Execute_Sequence.isEmpty();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_SEQUENCE:
				return activitydiagram_NamedElement_Execute_Sequence != null && !activitydiagram_NamedElement_Execute_Sequence.isEmpty();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_OPAQUE_ACTION_EXECUTE_SEQUENCE:
				return activitydiagram_OpaqueAction_Execute_Sequence != null && !activitydiagram_OpaqueAction_Execute_Sequence.isEmpty();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_ACTIVITY_FINAL_NODES:
				return activitydiagram_tracedActivityFinalNodes != null && !activitydiagram_tracedActivityFinalNodes.isEmpty();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_ACTIVITYS:
				return activitydiagram_tracedActivitys != null && !activitydiagram_tracedActivitys.isEmpty();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_BOOLEAN_VALUES:
				return activitydiagram_tracedBooleanValues != null && !activitydiagram_tracedBooleanValues.isEmpty();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_BOOLEAN_VARIABLES:
				return activitydiagram_tracedBooleanVariables != null && !activitydiagram_tracedBooleanVariables.isEmpty();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_CONTROL_FLOWS:
				return activitydiagram_tracedControlFlows != null && !activitydiagram_tracedControlFlows.isEmpty();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_CONTROL_TOKENS:
				return activitydiagram_tracedControlTokens != null && !activitydiagram_tracedControlTokens.isEmpty();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_DECISION_NODES:
				return activitydiagram_tracedDecisionNodes != null && !activitydiagram_tracedDecisionNodes.isEmpty();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_FORK_NODES:
				return activitydiagram_tracedForkNodes != null && !activitydiagram_tracedForkNodes.isEmpty();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_FORKED_TOKENS:
				return activitydiagram_tracedForkedTokens != null && !activitydiagram_tracedForkedTokens.isEmpty();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_INITIAL_NODES:
				return activitydiagram_tracedInitialNodes != null && !activitydiagram_tracedInitialNodes.isEmpty();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_INPUT_VALUES:
				return activitydiagram_tracedInputValues != null && !activitydiagram_tracedInputValues.isEmpty();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_INPUTS:
				return activitydiagram_tracedInputs != null && !activitydiagram_tracedInputs.isEmpty();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_INTEGER_VALUES:
				return activitydiagram_tracedIntegerValues != null && !activitydiagram_tracedIntegerValues.isEmpty();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_INTEGER_VARIABLES:
				return activitydiagram_tracedIntegerVariables != null && !activitydiagram_tracedIntegerVariables.isEmpty();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_JOIN_NODES:
				return activitydiagram_tracedJoinNodes != null && !activitydiagram_tracedJoinNodes.isEmpty();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_MERGE_NODES:
				return activitydiagram_tracedMergeNodes != null && !activitydiagram_tracedMergeNodes.isEmpty();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_OFFERS:
				return activitydiagram_tracedOffers != null && !activitydiagram_tracedOffers.isEmpty();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_OPAQUE_ACTIONS:
				return activitydiagram_tracedOpaqueActions != null && !activitydiagram_tracedOpaqueActions.isEmpty();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_TRACES:
				return activitydiagram_tracedTraces != null && !activitydiagram_tracedTraces.isEmpty();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				return statesTrace != null && !statesTrace.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SpecificTraceImpl
