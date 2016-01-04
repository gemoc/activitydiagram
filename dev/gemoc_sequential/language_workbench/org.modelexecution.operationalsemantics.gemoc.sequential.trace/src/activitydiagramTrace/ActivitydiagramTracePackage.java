/**
 */
package activitydiagramTrace;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see activitydiagramTrace.ActivitydiagramTraceFactory
 * @model kind="package"
 * @generated
 */
public interface ActivitydiagramTracePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "activitydiagramTrace";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "activitydiagramTrace";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "activitydiagramTrace";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ActivitydiagramTracePackage eINSTANCE = activitydiagramTrace.impl.ActivitydiagramTracePackageImpl.init();

	/**
	 * The meta object id for the '{@link activitydiagramTrace.impl.TraceImpl <em>Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.impl.TraceImpl
	 * @see activitydiagramTrace.impl.ActivitydiagramTracePackageImpl#getTrace()
	 * @generated
	 */
	int TRACE = 0;

	/**
	 * The feature id for the '<em><b>Activitydiagram Activity Node Add Tokens1 Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_SEQUENCE = 0;

	/**
	 * The feature id for the '<em><b>Activitydiagram Activity Node Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_SEQUENCE = 1;

	/**
	 * The feature id for the '<em><b>Activitydiagram Activity Node Remove Token1 Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN1_SEQUENCE = 2;

	/**
	 * The feature id for the '<em><b>Activitydiagram Activity Node Send Offers1 Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1_SEQUENCE = 3;

	/**
	 * The feature id for the '<em><b>Activitydiagram Activity Node Take Offerd Tokens1 Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_SEQUENCE = 4;

	/**
	 * The feature id for the '<em><b>Activitydiagram Activity Node Terminate Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE_SEQUENCE = 5;

	/**
	 * The feature id for the '<em><b>Activitydiagram Activity Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_SEQUENCE = 6;

	/**
	 * The feature id for the '<em><b>Activitydiagram Activity Initialize Context Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__ACTIVITYDIAGRAM_ACTIVITY_INITIALIZE_CONTEXT_SEQUENCE = 7;

	/**
	 * The feature id for the '<em><b>Activitydiagram Activity Reset Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__ACTIVITYDIAGRAM_ACTIVITY_RESET_SEQUENCE = 8;

	/**
	 * The feature id for the '<em><b>Activitydiagram Activity Write Trace Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_SEQUENCE = 9;

	/**
	 * The feature id for the '<em><b>Activitydiagram Variable Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__ACTIVITYDIAGRAM_VARIABLE_EXECUTE_SEQUENCE = 10;

	/**
	 * The feature id for the '<em><b>Activitydiagram Variable Init Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__ACTIVITYDIAGRAM_VARIABLE_INIT_SEQUENCE = 11;

	/**
	 * The feature id for the '<em><b>Activitydiagram traced Activity Final Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__ACTIVITYDIAGRAM_TRACED_ACTIVITY_FINAL_NODES = 12;

	/**
	 * The feature id for the '<em><b>Activitydiagram traced Activitys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__ACTIVITYDIAGRAM_TRACED_ACTIVITYS = 13;

	/**
	 * The feature id for the '<em><b>Activitydiagram traced Boolean Binary Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__ACTIVITYDIAGRAM_TRACED_BOOLEAN_BINARY_EXPRESSIONS = 14;

	/**
	 * The feature id for the '<em><b>Activitydiagram traced Boolean Unary Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__ACTIVITYDIAGRAM_TRACED_BOOLEAN_UNARY_EXPRESSIONS = 15;

	/**
	 * The feature id for the '<em><b>Activitydiagram traced Boolean Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__ACTIVITYDIAGRAM_TRACED_BOOLEAN_VALUES = 16;

	/**
	 * The feature id for the '<em><b>Activitydiagram traced Boolean Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__ACTIVITYDIAGRAM_TRACED_BOOLEAN_VARIABLES = 17;

	/**
	 * The feature id for the '<em><b>Activitydiagram traced Control Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__ACTIVITYDIAGRAM_TRACED_CONTROL_FLOWS = 18;

	/**
	 * The feature id for the '<em><b>Activitydiagram traced Control Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__ACTIVITYDIAGRAM_TRACED_CONTROL_TOKENS = 19;

	/**
	 * The feature id for the '<em><b>Activitydiagram traced Decision Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__ACTIVITYDIAGRAM_TRACED_DECISION_NODES = 20;

	/**
	 * The feature id for the '<em><b>Activitydiagram traced Fork Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__ACTIVITYDIAGRAM_TRACED_FORK_NODES = 21;

	/**
	 * The feature id for the '<em><b>Activitydiagram traced Forked Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__ACTIVITYDIAGRAM_TRACED_FORKED_TOKENS = 22;

	/**
	 * The feature id for the '<em><b>Activitydiagram traced Initial Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__ACTIVITYDIAGRAM_TRACED_INITIAL_NODES = 23;

	/**
	 * The feature id for the '<em><b>Activitydiagram traced Input Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__ACTIVITYDIAGRAM_TRACED_INPUT_VALUES = 24;

	/**
	 * The feature id for the '<em><b>Activitydiagram traced Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__ACTIVITYDIAGRAM_TRACED_INPUTS = 25;

	/**
	 * The feature id for the '<em><b>Activitydiagram traced Integer Calculation Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__ACTIVITYDIAGRAM_TRACED_INTEGER_CALCULATION_EXPRESSIONS = 26;

	/**
	 * The feature id for the '<em><b>Activitydiagram traced Integer Comparison Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__ACTIVITYDIAGRAM_TRACED_INTEGER_COMPARISON_EXPRESSIONS = 27;

	/**
	 * The feature id for the '<em><b>Activitydiagram traced Integer Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__ACTIVITYDIAGRAM_TRACED_INTEGER_VALUES = 28;

	/**
	 * The feature id for the '<em><b>Activitydiagram traced Integer Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__ACTIVITYDIAGRAM_TRACED_INTEGER_VARIABLES = 29;

	/**
	 * The feature id for the '<em><b>Activitydiagram traced Join Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__ACTIVITYDIAGRAM_TRACED_JOIN_NODES = 30;

	/**
	 * The feature id for the '<em><b>Activitydiagram traced Merge Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__ACTIVITYDIAGRAM_TRACED_MERGE_NODES = 31;

	/**
	 * The feature id for the '<em><b>Activitydiagram traced Offers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__ACTIVITYDIAGRAM_TRACED_OFFERS = 32;

	/**
	 * The feature id for the '<em><b>Activitydiagram traced Opaque Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__ACTIVITYDIAGRAM_TRACED_OPAQUE_ACTIONS = 33;

	/**
	 * The feature id for the '<em><b>Activitydiagram traced Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__ACTIVITYDIAGRAM_TRACED_TRACES = 34;

	/**
	 * The feature id for the '<em><b>Root Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__ROOT_STEPS = 35;

	/**
	 * The feature id for the '<em><b>States Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__STATES_TRACE = 36;

	/**
	 * The number of structural features of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_FEATURE_COUNT = 37;

	/**
	 * The number of operations of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace</em>'.
	 * @see activitydiagramTrace.Trace
	 * @generated
	 */
	EClass getTrace();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.Trace#getActivitydiagram_ActivityNode_AddTokens1_Sequence <em>Activitydiagram Activity Node Add Tokens1 Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activitydiagram Activity Node Add Tokens1 Sequence</em>'.
	 * @see activitydiagramTrace.Trace#getActivitydiagram_ActivityNode_AddTokens1_Sequence()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Activitydiagram_ActivityNode_AddTokens1_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.Trace#getActivitydiagram_ActivityNode_Execute_Sequence <em>Activitydiagram Activity Node Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activitydiagram Activity Node Execute Sequence</em>'.
	 * @see activitydiagramTrace.Trace#getActivitydiagram_ActivityNode_Execute_Sequence()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Activitydiagram_ActivityNode_Execute_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.Trace#getActivitydiagram_ActivityNode_RemoveToken1_Sequence <em>Activitydiagram Activity Node Remove Token1 Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activitydiagram Activity Node Remove Token1 Sequence</em>'.
	 * @see activitydiagramTrace.Trace#getActivitydiagram_ActivityNode_RemoveToken1_Sequence()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Activitydiagram_ActivityNode_RemoveToken1_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.Trace#getActivitydiagram_ActivityNode_SendOffers1_Sequence <em>Activitydiagram Activity Node Send Offers1 Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activitydiagram Activity Node Send Offers1 Sequence</em>'.
	 * @see activitydiagramTrace.Trace#getActivitydiagram_ActivityNode_SendOffers1_Sequence()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Activitydiagram_ActivityNode_SendOffers1_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.Trace#getActivitydiagram_ActivityNode_TakeOfferdTokens1_Sequence <em>Activitydiagram Activity Node Take Offerd Tokens1 Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activitydiagram Activity Node Take Offerd Tokens1 Sequence</em>'.
	 * @see activitydiagramTrace.Trace#getActivitydiagram_ActivityNode_TakeOfferdTokens1_Sequence()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Activitydiagram_ActivityNode_TakeOfferdTokens1_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.Trace#getActivitydiagram_ActivityNode_Terminate_Sequence <em>Activitydiagram Activity Node Terminate Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activitydiagram Activity Node Terminate Sequence</em>'.
	 * @see activitydiagramTrace.Trace#getActivitydiagram_ActivityNode_Terminate_Sequence()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Activitydiagram_ActivityNode_Terminate_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.Trace#getActivitydiagram_Activity_Execute_Sequence <em>Activitydiagram Activity Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activitydiagram Activity Execute Sequence</em>'.
	 * @see activitydiagramTrace.Trace#getActivitydiagram_Activity_Execute_Sequence()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Activitydiagram_Activity_Execute_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.Trace#getActivitydiagram_Activity_InitializeContext_Sequence <em>Activitydiagram Activity Initialize Context Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activitydiagram Activity Initialize Context Sequence</em>'.
	 * @see activitydiagramTrace.Trace#getActivitydiagram_Activity_InitializeContext_Sequence()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Activitydiagram_Activity_InitializeContext_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.Trace#getActivitydiagram_Activity_Reset_Sequence <em>Activitydiagram Activity Reset Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activitydiagram Activity Reset Sequence</em>'.
	 * @see activitydiagramTrace.Trace#getActivitydiagram_Activity_Reset_Sequence()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Activitydiagram_Activity_Reset_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.Trace#getActivitydiagram_Activity_WriteTrace_Sequence <em>Activitydiagram Activity Write Trace Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activitydiagram Activity Write Trace Sequence</em>'.
	 * @see activitydiagramTrace.Trace#getActivitydiagram_Activity_WriteTrace_Sequence()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Activitydiagram_Activity_WriteTrace_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.Trace#getActivitydiagram_Variable_Execute_Sequence <em>Activitydiagram Variable Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activitydiagram Variable Execute Sequence</em>'.
	 * @see activitydiagramTrace.Trace#getActivitydiagram_Variable_Execute_Sequence()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Activitydiagram_Variable_Execute_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.Trace#getActivitydiagram_Variable_Init_Sequence <em>Activitydiagram Variable Init Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activitydiagram Variable Init Sequence</em>'.
	 * @see activitydiagramTrace.Trace#getActivitydiagram_Variable_Init_Sequence()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Activitydiagram_Variable_Init_Sequence();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Trace#getActivitydiagram_tracedActivityFinalNodes <em>Activitydiagram traced Activity Final Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram traced Activity Final Nodes</em>'.
	 * @see activitydiagramTrace.Trace#getActivitydiagram_tracedActivityFinalNodes()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Activitydiagram_tracedActivityFinalNodes();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Trace#getActivitydiagram_tracedActivitys <em>Activitydiagram traced Activitys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram traced Activitys</em>'.
	 * @see activitydiagramTrace.Trace#getActivitydiagram_tracedActivitys()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Activitydiagram_tracedActivitys();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Trace#getActivitydiagram_tracedBooleanBinaryExpressions <em>Activitydiagram traced Boolean Binary Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram traced Boolean Binary Expressions</em>'.
	 * @see activitydiagramTrace.Trace#getActivitydiagram_tracedBooleanBinaryExpressions()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Activitydiagram_tracedBooleanBinaryExpressions();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Trace#getActivitydiagram_tracedBooleanUnaryExpressions <em>Activitydiagram traced Boolean Unary Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram traced Boolean Unary Expressions</em>'.
	 * @see activitydiagramTrace.Trace#getActivitydiagram_tracedBooleanUnaryExpressions()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Activitydiagram_tracedBooleanUnaryExpressions();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Trace#getActivitydiagram_tracedBooleanValues <em>Activitydiagram traced Boolean Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram traced Boolean Values</em>'.
	 * @see activitydiagramTrace.Trace#getActivitydiagram_tracedBooleanValues()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Activitydiagram_tracedBooleanValues();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Trace#getActivitydiagram_tracedBooleanVariables <em>Activitydiagram traced Boolean Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram traced Boolean Variables</em>'.
	 * @see activitydiagramTrace.Trace#getActivitydiagram_tracedBooleanVariables()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Activitydiagram_tracedBooleanVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Trace#getActivitydiagram_tracedControlFlows <em>Activitydiagram traced Control Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram traced Control Flows</em>'.
	 * @see activitydiagramTrace.Trace#getActivitydiagram_tracedControlFlows()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Activitydiagram_tracedControlFlows();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Trace#getActivitydiagram_tracedControlTokens <em>Activitydiagram traced Control Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram traced Control Tokens</em>'.
	 * @see activitydiagramTrace.Trace#getActivitydiagram_tracedControlTokens()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Activitydiagram_tracedControlTokens();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Trace#getActivitydiagram_tracedDecisionNodes <em>Activitydiagram traced Decision Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram traced Decision Nodes</em>'.
	 * @see activitydiagramTrace.Trace#getActivitydiagram_tracedDecisionNodes()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Activitydiagram_tracedDecisionNodes();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Trace#getActivitydiagram_tracedForkNodes <em>Activitydiagram traced Fork Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram traced Fork Nodes</em>'.
	 * @see activitydiagramTrace.Trace#getActivitydiagram_tracedForkNodes()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Activitydiagram_tracedForkNodes();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Trace#getActivitydiagram_tracedForkedTokens <em>Activitydiagram traced Forked Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram traced Forked Tokens</em>'.
	 * @see activitydiagramTrace.Trace#getActivitydiagram_tracedForkedTokens()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Activitydiagram_tracedForkedTokens();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Trace#getActivitydiagram_tracedInitialNodes <em>Activitydiagram traced Initial Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram traced Initial Nodes</em>'.
	 * @see activitydiagramTrace.Trace#getActivitydiagram_tracedInitialNodes()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Activitydiagram_tracedInitialNodes();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Trace#getActivitydiagram_tracedInputValues <em>Activitydiagram traced Input Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram traced Input Values</em>'.
	 * @see activitydiagramTrace.Trace#getActivitydiagram_tracedInputValues()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Activitydiagram_tracedInputValues();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Trace#getActivitydiagram_tracedInputs <em>Activitydiagram traced Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram traced Inputs</em>'.
	 * @see activitydiagramTrace.Trace#getActivitydiagram_tracedInputs()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Activitydiagram_tracedInputs();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Trace#getActivitydiagram_tracedIntegerCalculationExpressions <em>Activitydiagram traced Integer Calculation Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram traced Integer Calculation Expressions</em>'.
	 * @see activitydiagramTrace.Trace#getActivitydiagram_tracedIntegerCalculationExpressions()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Activitydiagram_tracedIntegerCalculationExpressions();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Trace#getActivitydiagram_tracedIntegerComparisonExpressions <em>Activitydiagram traced Integer Comparison Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram traced Integer Comparison Expressions</em>'.
	 * @see activitydiagramTrace.Trace#getActivitydiagram_tracedIntegerComparisonExpressions()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Activitydiagram_tracedIntegerComparisonExpressions();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Trace#getActivitydiagram_tracedIntegerValues <em>Activitydiagram traced Integer Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram traced Integer Values</em>'.
	 * @see activitydiagramTrace.Trace#getActivitydiagram_tracedIntegerValues()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Activitydiagram_tracedIntegerValues();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Trace#getActivitydiagram_tracedIntegerVariables <em>Activitydiagram traced Integer Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram traced Integer Variables</em>'.
	 * @see activitydiagramTrace.Trace#getActivitydiagram_tracedIntegerVariables()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Activitydiagram_tracedIntegerVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Trace#getActivitydiagram_tracedJoinNodes <em>Activitydiagram traced Join Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram traced Join Nodes</em>'.
	 * @see activitydiagramTrace.Trace#getActivitydiagram_tracedJoinNodes()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Activitydiagram_tracedJoinNodes();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Trace#getActivitydiagram_tracedMergeNodes <em>Activitydiagram traced Merge Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram traced Merge Nodes</em>'.
	 * @see activitydiagramTrace.Trace#getActivitydiagram_tracedMergeNodes()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Activitydiagram_tracedMergeNodes();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Trace#getActivitydiagram_tracedOffers <em>Activitydiagram traced Offers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram traced Offers</em>'.
	 * @see activitydiagramTrace.Trace#getActivitydiagram_tracedOffers()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Activitydiagram_tracedOffers();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Trace#getActivitydiagram_tracedOpaqueActions <em>Activitydiagram traced Opaque Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram traced Opaque Actions</em>'.
	 * @see activitydiagramTrace.Trace#getActivitydiagram_tracedOpaqueActions()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Activitydiagram_tracedOpaqueActions();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Trace#getActivitydiagram_tracedTraces <em>Activitydiagram traced Traces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram traced Traces</em>'.
	 * @see activitydiagramTrace.Trace#getActivitydiagram_tracedTraces()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Activitydiagram_tracedTraces();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Trace#getRootSteps <em>Root Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Root Steps</em>'.
	 * @see activitydiagramTrace.Trace#getRootSteps()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_RootSteps();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Trace#getStatesTrace <em>States Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States Trace</em>'.
	 * @see activitydiagramTrace.Trace#getStatesTrace()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_StatesTrace();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ActivitydiagramTraceFactory getActivitydiagramTraceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link activitydiagramTrace.impl.TraceImpl <em>Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.impl.TraceImpl
		 * @see activitydiagramTrace.impl.ActivitydiagramTracePackageImpl#getTrace()
		 * @generated
		 */
		EClass TRACE = eINSTANCE.getTrace();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Activity Node Add Tokens1 Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_SEQUENCE = eINSTANCE.getTrace_Activitydiagram_ActivityNode_AddTokens1_Sequence();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Activity Node Execute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_SEQUENCE = eINSTANCE.getTrace_Activitydiagram_ActivityNode_Execute_Sequence();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Activity Node Remove Token1 Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN1_SEQUENCE = eINSTANCE.getTrace_Activitydiagram_ActivityNode_RemoveToken1_Sequence();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Activity Node Send Offers1 Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1_SEQUENCE = eINSTANCE.getTrace_Activitydiagram_ActivityNode_SendOffers1_Sequence();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Activity Node Take Offerd Tokens1 Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_SEQUENCE = eINSTANCE.getTrace_Activitydiagram_ActivityNode_TakeOfferdTokens1_Sequence();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Activity Node Terminate Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE_SEQUENCE = eINSTANCE.getTrace_Activitydiagram_ActivityNode_Terminate_Sequence();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Activity Execute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_SEQUENCE = eINSTANCE.getTrace_Activitydiagram_Activity_Execute_Sequence();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Activity Initialize Context Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__ACTIVITYDIAGRAM_ACTIVITY_INITIALIZE_CONTEXT_SEQUENCE = eINSTANCE.getTrace_Activitydiagram_Activity_InitializeContext_Sequence();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Activity Reset Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__ACTIVITYDIAGRAM_ACTIVITY_RESET_SEQUENCE = eINSTANCE.getTrace_Activitydiagram_Activity_Reset_Sequence();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Activity Write Trace Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_SEQUENCE = eINSTANCE.getTrace_Activitydiagram_Activity_WriteTrace_Sequence();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Variable Execute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__ACTIVITYDIAGRAM_VARIABLE_EXECUTE_SEQUENCE = eINSTANCE.getTrace_Activitydiagram_Variable_Execute_Sequence();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Variable Init Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__ACTIVITYDIAGRAM_VARIABLE_INIT_SEQUENCE = eINSTANCE.getTrace_Activitydiagram_Variable_Init_Sequence();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram traced Activity Final Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__ACTIVITYDIAGRAM_TRACED_ACTIVITY_FINAL_NODES = eINSTANCE.getTrace_Activitydiagram_tracedActivityFinalNodes();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram traced Activitys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__ACTIVITYDIAGRAM_TRACED_ACTIVITYS = eINSTANCE.getTrace_Activitydiagram_tracedActivitys();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram traced Boolean Binary Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__ACTIVITYDIAGRAM_TRACED_BOOLEAN_BINARY_EXPRESSIONS = eINSTANCE.getTrace_Activitydiagram_tracedBooleanBinaryExpressions();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram traced Boolean Unary Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__ACTIVITYDIAGRAM_TRACED_BOOLEAN_UNARY_EXPRESSIONS = eINSTANCE.getTrace_Activitydiagram_tracedBooleanUnaryExpressions();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram traced Boolean Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__ACTIVITYDIAGRAM_TRACED_BOOLEAN_VALUES = eINSTANCE.getTrace_Activitydiagram_tracedBooleanValues();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram traced Boolean Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__ACTIVITYDIAGRAM_TRACED_BOOLEAN_VARIABLES = eINSTANCE.getTrace_Activitydiagram_tracedBooleanVariables();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram traced Control Flows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__ACTIVITYDIAGRAM_TRACED_CONTROL_FLOWS = eINSTANCE.getTrace_Activitydiagram_tracedControlFlows();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram traced Control Tokens</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__ACTIVITYDIAGRAM_TRACED_CONTROL_TOKENS = eINSTANCE.getTrace_Activitydiagram_tracedControlTokens();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram traced Decision Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__ACTIVITYDIAGRAM_TRACED_DECISION_NODES = eINSTANCE.getTrace_Activitydiagram_tracedDecisionNodes();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram traced Fork Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__ACTIVITYDIAGRAM_TRACED_FORK_NODES = eINSTANCE.getTrace_Activitydiagram_tracedForkNodes();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram traced Forked Tokens</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__ACTIVITYDIAGRAM_TRACED_FORKED_TOKENS = eINSTANCE.getTrace_Activitydiagram_tracedForkedTokens();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram traced Initial Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__ACTIVITYDIAGRAM_TRACED_INITIAL_NODES = eINSTANCE.getTrace_Activitydiagram_tracedInitialNodes();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram traced Input Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__ACTIVITYDIAGRAM_TRACED_INPUT_VALUES = eINSTANCE.getTrace_Activitydiagram_tracedInputValues();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram traced Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__ACTIVITYDIAGRAM_TRACED_INPUTS = eINSTANCE.getTrace_Activitydiagram_tracedInputs();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram traced Integer Calculation Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__ACTIVITYDIAGRAM_TRACED_INTEGER_CALCULATION_EXPRESSIONS = eINSTANCE.getTrace_Activitydiagram_tracedIntegerCalculationExpressions();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram traced Integer Comparison Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__ACTIVITYDIAGRAM_TRACED_INTEGER_COMPARISON_EXPRESSIONS = eINSTANCE.getTrace_Activitydiagram_tracedIntegerComparisonExpressions();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram traced Integer Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__ACTIVITYDIAGRAM_TRACED_INTEGER_VALUES = eINSTANCE.getTrace_Activitydiagram_tracedIntegerValues();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram traced Integer Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__ACTIVITYDIAGRAM_TRACED_INTEGER_VARIABLES = eINSTANCE.getTrace_Activitydiagram_tracedIntegerVariables();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram traced Join Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__ACTIVITYDIAGRAM_TRACED_JOIN_NODES = eINSTANCE.getTrace_Activitydiagram_tracedJoinNodes();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram traced Merge Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__ACTIVITYDIAGRAM_TRACED_MERGE_NODES = eINSTANCE.getTrace_Activitydiagram_tracedMergeNodes();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram traced Offers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__ACTIVITYDIAGRAM_TRACED_OFFERS = eINSTANCE.getTrace_Activitydiagram_tracedOffers();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram traced Opaque Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__ACTIVITYDIAGRAM_TRACED_OPAQUE_ACTIONS = eINSTANCE.getTrace_Activitydiagram_tracedOpaqueActions();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram traced Traces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__ACTIVITYDIAGRAM_TRACED_TRACES = eINSTANCE.getTrace_Activitydiagram_tracedTraces();

		/**
		 * The meta object literal for the '<em><b>Root Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__ROOT_STEPS = eINSTANCE.getTrace_RootSteps();

		/**
		 * The meta object literal for the '<em><b>States Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__STATES_TRACE = eINSTANCE.getTrace_StatesTrace();

	}

} //ActivitydiagramTracePackage
