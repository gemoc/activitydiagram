/**
 */
package activitydiagramTrace;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.gemoc.executionframework.engine.mse.MsePackage;

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
	 * The meta object id for the '{@link activitydiagramTrace.impl.SpecificTraceImpl <em>Specific Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.impl.SpecificTraceImpl
	 * @see activitydiagramTrace.impl.ActivitydiagramTracePackageImpl#getSpecificTrace()
	 * @generated
	 */
	int SPECIFIC_TRACE = 0;

	/**
	 * The feature id for the '<em><b>Root Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ROOT_STEP = MsePackage.TRACE__ROOT_STEP;

	/**
	 * The feature id for the '<em><b>Launchconfiguration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__LAUNCHCONFIGURATION = MsePackage.TRACE__LAUNCHCONFIGURATION;

	/**
	 * The feature id for the '<em><b>Activitydiagram Activity Final Node Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_FINAL_NODE_EXECUTE_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Activitydiagram Activity Node Add Tokens1 Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Activitydiagram Activity Node Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Activitydiagram Activity Node Remove Token1 Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN1_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Activitydiagram Activity Node Send Offers1 Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Activitydiagram Activity Node Take Offerd Tokens1 Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Activitydiagram Activity Node Terminate Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Activitydiagram Activity Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Activitydiagram Activity Initialize Context Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_INITIALIZE_CONTEXT_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Activitydiagram Activity Reset Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_RESET_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Activitydiagram Activity Write Trace Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Activitydiagram Boolean Binary Expression Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ACTIVITYDIAGRAM_BOOLEAN_BINARY_EXPRESSION_EXECUTE_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Activitydiagram Boolean Unary Expression Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ACTIVITYDIAGRAM_BOOLEAN_UNARY_EXPRESSION_EXECUTE_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Activitydiagram Boolean Variable Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_EXECUTE_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Activitydiagram Boolean Variable Init Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_INIT_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Activitydiagram Decision Node Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ACTIVITYDIAGRAM_DECISION_NODE_EXECUTE_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Activitydiagram Decision Node Send Offers1 Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ACTIVITYDIAGRAM_DECISION_NODE_SEND_OFFERS1_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Activitydiagram Expression Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ACTIVITYDIAGRAM_EXPRESSION_EXECUTE_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Activitydiagram Fork Node Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ACTIVITYDIAGRAM_FORK_NODE_EXECUTE_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Activitydiagram Initial Node Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ACTIVITYDIAGRAM_INITIAL_NODE_EXECUTE_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Activitydiagram Integer Calculation Expression Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ACTIVITYDIAGRAM_INTEGER_CALCULATION_EXPRESSION_EXECUTE_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Activitydiagram Integer Comparison Expression Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ACTIVITYDIAGRAM_INTEGER_COMPARISON_EXPRESSION_EXECUTE_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Activitydiagram Integer Variable Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ACTIVITYDIAGRAM_INTEGER_VARIABLE_EXECUTE_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Activitydiagram Integer Variable Init Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ACTIVITYDIAGRAM_INTEGER_VARIABLE_INIT_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Activitydiagram Join Node Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ACTIVITYDIAGRAM_JOIN_NODE_EXECUTE_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Activitydiagram Merge Node Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ACTIVITYDIAGRAM_MERGE_NODE_EXECUTE_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Activitydiagram Named Element Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Activitydiagram Opaque Action Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ACTIVITYDIAGRAM_OPAQUE_ACTION_EXECUTE_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Activitydiagram traced Activity Final Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_ACTIVITY_FINAL_NODES = MsePackage.TRACE_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Activitydiagram traced Activitys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_ACTIVITYS = MsePackage.TRACE_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Activitydiagram traced Boolean Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_BOOLEAN_VALUES = MsePackage.TRACE_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Activitydiagram traced Boolean Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_BOOLEAN_VARIABLES = MsePackage.TRACE_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Activitydiagram traced Control Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_CONTROL_FLOWS = MsePackage.TRACE_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Activitydiagram traced Control Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_CONTROL_TOKENS = MsePackage.TRACE_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Activitydiagram traced Decision Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_DECISION_NODES = MsePackage.TRACE_FEATURE_COUNT + 34;

	/**
	 * The feature id for the '<em><b>Activitydiagram traced Fork Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_FORK_NODES = MsePackage.TRACE_FEATURE_COUNT + 35;

	/**
	 * The feature id for the '<em><b>Activitydiagram traced Forked Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_FORKED_TOKENS = MsePackage.TRACE_FEATURE_COUNT + 36;

	/**
	 * The feature id for the '<em><b>Activitydiagram traced Initial Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_INITIAL_NODES = MsePackage.TRACE_FEATURE_COUNT + 37;

	/**
	 * The feature id for the '<em><b>Activitydiagram traced Input Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_INPUT_VALUES = MsePackage.TRACE_FEATURE_COUNT + 38;

	/**
	 * The feature id for the '<em><b>Activitydiagram traced Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_INPUTS = MsePackage.TRACE_FEATURE_COUNT + 39;

	/**
	 * The feature id for the '<em><b>Activitydiagram traced Integer Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_INTEGER_VALUES = MsePackage.TRACE_FEATURE_COUNT + 40;

	/**
	 * The feature id for the '<em><b>Activitydiagram traced Integer Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_INTEGER_VARIABLES = MsePackage.TRACE_FEATURE_COUNT + 41;

	/**
	 * The feature id for the '<em><b>Activitydiagram traced Join Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_JOIN_NODES = MsePackage.TRACE_FEATURE_COUNT + 42;

	/**
	 * The feature id for the '<em><b>Activitydiagram traced Merge Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_MERGE_NODES = MsePackage.TRACE_FEATURE_COUNT + 43;

	/**
	 * The feature id for the '<em><b>Activitydiagram traced Offers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_OFFERS = MsePackage.TRACE_FEATURE_COUNT + 44;

	/**
	 * The feature id for the '<em><b>Activitydiagram traced Opaque Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_OPAQUE_ACTIONS = MsePackage.TRACE_FEATURE_COUNT + 45;

	/**
	 * The feature id for the '<em><b>Activitydiagram traced Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_TRACES = MsePackage.TRACE_FEATURE_COUNT + 46;

	/**
	 * The feature id for the '<em><b>States Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__STATES_TRACE = MsePackage.TRACE_FEATURE_COUNT + 47;

	/**
	 * The number of structural features of the '<em>Specific Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE_FEATURE_COUNT = MsePackage.TRACE_FEATURE_COUNT + 48;

	/**
	 * The number of operations of the '<em>Specific Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE_OPERATION_COUNT = MsePackage.TRACE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.SpecificTrace <em>Specific Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Trace</em>'.
	 * @see activitydiagramTrace.SpecificTrace
	 * @generated
	 */
	EClass getSpecificTrace();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_ActivityFinalNode_Execute_Sequence <em>Activitydiagram Activity Final Node Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activitydiagram Activity Final Node Execute Sequence</em>'.
	 * @see activitydiagramTrace.SpecificTrace#getActivitydiagram_ActivityFinalNode_Execute_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Activitydiagram_ActivityFinalNode_Execute_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_ActivityNode_AddTokens1_Sequence <em>Activitydiagram Activity Node Add Tokens1 Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activitydiagram Activity Node Add Tokens1 Sequence</em>'.
	 * @see activitydiagramTrace.SpecificTrace#getActivitydiagram_ActivityNode_AddTokens1_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Activitydiagram_ActivityNode_AddTokens1_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_ActivityNode_Execute_Sequence <em>Activitydiagram Activity Node Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activitydiagram Activity Node Execute Sequence</em>'.
	 * @see activitydiagramTrace.SpecificTrace#getActivitydiagram_ActivityNode_Execute_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Activitydiagram_ActivityNode_Execute_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_ActivityNode_RemoveToken1_Sequence <em>Activitydiagram Activity Node Remove Token1 Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activitydiagram Activity Node Remove Token1 Sequence</em>'.
	 * @see activitydiagramTrace.SpecificTrace#getActivitydiagram_ActivityNode_RemoveToken1_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Activitydiagram_ActivityNode_RemoveToken1_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_ActivityNode_SendOffers1_Sequence <em>Activitydiagram Activity Node Send Offers1 Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activitydiagram Activity Node Send Offers1 Sequence</em>'.
	 * @see activitydiagramTrace.SpecificTrace#getActivitydiagram_ActivityNode_SendOffers1_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Activitydiagram_ActivityNode_SendOffers1_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_ActivityNode_TakeOfferdTokens1_Sequence <em>Activitydiagram Activity Node Take Offerd Tokens1 Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activitydiagram Activity Node Take Offerd Tokens1 Sequence</em>'.
	 * @see activitydiagramTrace.SpecificTrace#getActivitydiagram_ActivityNode_TakeOfferdTokens1_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Activitydiagram_ActivityNode_TakeOfferdTokens1_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_ActivityNode_Terminate_Sequence <em>Activitydiagram Activity Node Terminate Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activitydiagram Activity Node Terminate Sequence</em>'.
	 * @see activitydiagramTrace.SpecificTrace#getActivitydiagram_ActivityNode_Terminate_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Activitydiagram_ActivityNode_Terminate_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_Activity_Execute_Sequence <em>Activitydiagram Activity Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activitydiagram Activity Execute Sequence</em>'.
	 * @see activitydiagramTrace.SpecificTrace#getActivitydiagram_Activity_Execute_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Activitydiagram_Activity_Execute_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_Activity_InitializeContext_Sequence <em>Activitydiagram Activity Initialize Context Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activitydiagram Activity Initialize Context Sequence</em>'.
	 * @see activitydiagramTrace.SpecificTrace#getActivitydiagram_Activity_InitializeContext_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Activitydiagram_Activity_InitializeContext_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_Activity_Reset_Sequence <em>Activitydiagram Activity Reset Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activitydiagram Activity Reset Sequence</em>'.
	 * @see activitydiagramTrace.SpecificTrace#getActivitydiagram_Activity_Reset_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Activitydiagram_Activity_Reset_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_Activity_WriteTrace_Sequence <em>Activitydiagram Activity Write Trace Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activitydiagram Activity Write Trace Sequence</em>'.
	 * @see activitydiagramTrace.SpecificTrace#getActivitydiagram_Activity_WriteTrace_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Activitydiagram_Activity_WriteTrace_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_BooleanBinaryExpression_Execute_Sequence <em>Activitydiagram Boolean Binary Expression Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activitydiagram Boolean Binary Expression Execute Sequence</em>'.
	 * @see activitydiagramTrace.SpecificTrace#getActivitydiagram_BooleanBinaryExpression_Execute_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Activitydiagram_BooleanBinaryExpression_Execute_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_BooleanUnaryExpression_Execute_Sequence <em>Activitydiagram Boolean Unary Expression Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activitydiagram Boolean Unary Expression Execute Sequence</em>'.
	 * @see activitydiagramTrace.SpecificTrace#getActivitydiagram_BooleanUnaryExpression_Execute_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Activitydiagram_BooleanUnaryExpression_Execute_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_BooleanVariable_Execute_Sequence <em>Activitydiagram Boolean Variable Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activitydiagram Boolean Variable Execute Sequence</em>'.
	 * @see activitydiagramTrace.SpecificTrace#getActivitydiagram_BooleanVariable_Execute_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Activitydiagram_BooleanVariable_Execute_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_BooleanVariable_Init_Sequence <em>Activitydiagram Boolean Variable Init Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activitydiagram Boolean Variable Init Sequence</em>'.
	 * @see activitydiagramTrace.SpecificTrace#getActivitydiagram_BooleanVariable_Init_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Activitydiagram_BooleanVariable_Init_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_DecisionNode_Execute_Sequence <em>Activitydiagram Decision Node Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activitydiagram Decision Node Execute Sequence</em>'.
	 * @see activitydiagramTrace.SpecificTrace#getActivitydiagram_DecisionNode_Execute_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Activitydiagram_DecisionNode_Execute_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_DecisionNode_SendOffers1_Sequence <em>Activitydiagram Decision Node Send Offers1 Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activitydiagram Decision Node Send Offers1 Sequence</em>'.
	 * @see activitydiagramTrace.SpecificTrace#getActivitydiagram_DecisionNode_SendOffers1_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Activitydiagram_DecisionNode_SendOffers1_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_Expression_Execute_Sequence <em>Activitydiagram Expression Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activitydiagram Expression Execute Sequence</em>'.
	 * @see activitydiagramTrace.SpecificTrace#getActivitydiagram_Expression_Execute_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Activitydiagram_Expression_Execute_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_ForkNode_Execute_Sequence <em>Activitydiagram Fork Node Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activitydiagram Fork Node Execute Sequence</em>'.
	 * @see activitydiagramTrace.SpecificTrace#getActivitydiagram_ForkNode_Execute_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Activitydiagram_ForkNode_Execute_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_InitialNode_Execute_Sequence <em>Activitydiagram Initial Node Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activitydiagram Initial Node Execute Sequence</em>'.
	 * @see activitydiagramTrace.SpecificTrace#getActivitydiagram_InitialNode_Execute_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Activitydiagram_InitialNode_Execute_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_IntegerCalculationExpression_Execute_Sequence <em>Activitydiagram Integer Calculation Expression Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activitydiagram Integer Calculation Expression Execute Sequence</em>'.
	 * @see activitydiagramTrace.SpecificTrace#getActivitydiagram_IntegerCalculationExpression_Execute_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Activitydiagram_IntegerCalculationExpression_Execute_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_IntegerComparisonExpression_Execute_Sequence <em>Activitydiagram Integer Comparison Expression Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activitydiagram Integer Comparison Expression Execute Sequence</em>'.
	 * @see activitydiagramTrace.SpecificTrace#getActivitydiagram_IntegerComparisonExpression_Execute_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Activitydiagram_IntegerComparisonExpression_Execute_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_IntegerVariable_Execute_Sequence <em>Activitydiagram Integer Variable Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activitydiagram Integer Variable Execute Sequence</em>'.
	 * @see activitydiagramTrace.SpecificTrace#getActivitydiagram_IntegerVariable_Execute_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Activitydiagram_IntegerVariable_Execute_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_IntegerVariable_Init_Sequence <em>Activitydiagram Integer Variable Init Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activitydiagram Integer Variable Init Sequence</em>'.
	 * @see activitydiagramTrace.SpecificTrace#getActivitydiagram_IntegerVariable_Init_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Activitydiagram_IntegerVariable_Init_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_JoinNode_Execute_Sequence <em>Activitydiagram Join Node Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activitydiagram Join Node Execute Sequence</em>'.
	 * @see activitydiagramTrace.SpecificTrace#getActivitydiagram_JoinNode_Execute_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Activitydiagram_JoinNode_Execute_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_MergeNode_Execute_Sequence <em>Activitydiagram Merge Node Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activitydiagram Merge Node Execute Sequence</em>'.
	 * @see activitydiagramTrace.SpecificTrace#getActivitydiagram_MergeNode_Execute_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Activitydiagram_MergeNode_Execute_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_NamedElement_Execute_Sequence <em>Activitydiagram Named Element Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activitydiagram Named Element Execute Sequence</em>'.
	 * @see activitydiagramTrace.SpecificTrace#getActivitydiagram_NamedElement_Execute_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Activitydiagram_NamedElement_Execute_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_OpaqueAction_Execute_Sequence <em>Activitydiagram Opaque Action Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activitydiagram Opaque Action Execute Sequence</em>'.
	 * @see activitydiagramTrace.SpecificTrace#getActivitydiagram_OpaqueAction_Execute_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Activitydiagram_OpaqueAction_Execute_Sequence();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_tracedActivityFinalNodes <em>Activitydiagram traced Activity Final Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram traced Activity Final Nodes</em>'.
	 * @see activitydiagramTrace.SpecificTrace#getActivitydiagram_tracedActivityFinalNodes()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Activitydiagram_tracedActivityFinalNodes();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_tracedActivitys <em>Activitydiagram traced Activitys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram traced Activitys</em>'.
	 * @see activitydiagramTrace.SpecificTrace#getActivitydiagram_tracedActivitys()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Activitydiagram_tracedActivitys();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_tracedBooleanValues <em>Activitydiagram traced Boolean Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram traced Boolean Values</em>'.
	 * @see activitydiagramTrace.SpecificTrace#getActivitydiagram_tracedBooleanValues()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Activitydiagram_tracedBooleanValues();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_tracedBooleanVariables <em>Activitydiagram traced Boolean Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram traced Boolean Variables</em>'.
	 * @see activitydiagramTrace.SpecificTrace#getActivitydiagram_tracedBooleanVariables()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Activitydiagram_tracedBooleanVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_tracedControlFlows <em>Activitydiagram traced Control Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram traced Control Flows</em>'.
	 * @see activitydiagramTrace.SpecificTrace#getActivitydiagram_tracedControlFlows()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Activitydiagram_tracedControlFlows();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_tracedControlTokens <em>Activitydiagram traced Control Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram traced Control Tokens</em>'.
	 * @see activitydiagramTrace.SpecificTrace#getActivitydiagram_tracedControlTokens()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Activitydiagram_tracedControlTokens();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_tracedDecisionNodes <em>Activitydiagram traced Decision Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram traced Decision Nodes</em>'.
	 * @see activitydiagramTrace.SpecificTrace#getActivitydiagram_tracedDecisionNodes()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Activitydiagram_tracedDecisionNodes();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_tracedForkNodes <em>Activitydiagram traced Fork Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram traced Fork Nodes</em>'.
	 * @see activitydiagramTrace.SpecificTrace#getActivitydiagram_tracedForkNodes()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Activitydiagram_tracedForkNodes();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_tracedForkedTokens <em>Activitydiagram traced Forked Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram traced Forked Tokens</em>'.
	 * @see activitydiagramTrace.SpecificTrace#getActivitydiagram_tracedForkedTokens()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Activitydiagram_tracedForkedTokens();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_tracedInitialNodes <em>Activitydiagram traced Initial Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram traced Initial Nodes</em>'.
	 * @see activitydiagramTrace.SpecificTrace#getActivitydiagram_tracedInitialNodes()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Activitydiagram_tracedInitialNodes();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_tracedInputValues <em>Activitydiagram traced Input Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram traced Input Values</em>'.
	 * @see activitydiagramTrace.SpecificTrace#getActivitydiagram_tracedInputValues()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Activitydiagram_tracedInputValues();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_tracedInputs <em>Activitydiagram traced Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram traced Inputs</em>'.
	 * @see activitydiagramTrace.SpecificTrace#getActivitydiagram_tracedInputs()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Activitydiagram_tracedInputs();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_tracedIntegerValues <em>Activitydiagram traced Integer Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram traced Integer Values</em>'.
	 * @see activitydiagramTrace.SpecificTrace#getActivitydiagram_tracedIntegerValues()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Activitydiagram_tracedIntegerValues();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_tracedIntegerVariables <em>Activitydiagram traced Integer Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram traced Integer Variables</em>'.
	 * @see activitydiagramTrace.SpecificTrace#getActivitydiagram_tracedIntegerVariables()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Activitydiagram_tracedIntegerVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_tracedJoinNodes <em>Activitydiagram traced Join Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram traced Join Nodes</em>'.
	 * @see activitydiagramTrace.SpecificTrace#getActivitydiagram_tracedJoinNodes()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Activitydiagram_tracedJoinNodes();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_tracedMergeNodes <em>Activitydiagram traced Merge Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram traced Merge Nodes</em>'.
	 * @see activitydiagramTrace.SpecificTrace#getActivitydiagram_tracedMergeNodes()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Activitydiagram_tracedMergeNodes();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_tracedOffers <em>Activitydiagram traced Offers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram traced Offers</em>'.
	 * @see activitydiagramTrace.SpecificTrace#getActivitydiagram_tracedOffers()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Activitydiagram_tracedOffers();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_tracedOpaqueActions <em>Activitydiagram traced Opaque Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram traced Opaque Actions</em>'.
	 * @see activitydiagramTrace.SpecificTrace#getActivitydiagram_tracedOpaqueActions()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Activitydiagram_tracedOpaqueActions();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.SpecificTrace#getActivitydiagram_tracedTraces <em>Activitydiagram traced Traces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram traced Traces</em>'.
	 * @see activitydiagramTrace.SpecificTrace#getActivitydiagram_tracedTraces()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Activitydiagram_tracedTraces();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.SpecificTrace#getStatesTrace <em>States Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States Trace</em>'.
	 * @see activitydiagramTrace.SpecificTrace#getStatesTrace()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_StatesTrace();

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
		 * The meta object literal for the '{@link activitydiagramTrace.impl.SpecificTraceImpl <em>Specific Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.impl.SpecificTraceImpl
		 * @see activitydiagramTrace.impl.ActivitydiagramTracePackageImpl#getSpecificTrace()
		 * @generated
		 */
		EClass SPECIFIC_TRACE = eINSTANCE.getSpecificTrace();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Activity Final Node Execute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_FINAL_NODE_EXECUTE_SEQUENCE = eINSTANCE.getSpecificTrace_Activitydiagram_ActivityFinalNode_Execute_Sequence();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Activity Node Add Tokens1 Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_SEQUENCE = eINSTANCE.getSpecificTrace_Activitydiagram_ActivityNode_AddTokens1_Sequence();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Activity Node Execute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_SEQUENCE = eINSTANCE.getSpecificTrace_Activitydiagram_ActivityNode_Execute_Sequence();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Activity Node Remove Token1 Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN1_SEQUENCE = eINSTANCE.getSpecificTrace_Activitydiagram_ActivityNode_RemoveToken1_Sequence();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Activity Node Send Offers1 Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1_SEQUENCE = eINSTANCE.getSpecificTrace_Activitydiagram_ActivityNode_SendOffers1_Sequence();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Activity Node Take Offerd Tokens1 Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_SEQUENCE = eINSTANCE.getSpecificTrace_Activitydiagram_ActivityNode_TakeOfferdTokens1_Sequence();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Activity Node Terminate Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE_SEQUENCE = eINSTANCE.getSpecificTrace_Activitydiagram_ActivityNode_Terminate_Sequence();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Activity Execute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_SEQUENCE = eINSTANCE.getSpecificTrace_Activitydiagram_Activity_Execute_Sequence();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Activity Initialize Context Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_INITIALIZE_CONTEXT_SEQUENCE = eINSTANCE.getSpecificTrace_Activitydiagram_Activity_InitializeContext_Sequence();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Activity Reset Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_RESET_SEQUENCE = eINSTANCE.getSpecificTrace_Activitydiagram_Activity_Reset_Sequence();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Activity Write Trace Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_SEQUENCE = eINSTANCE.getSpecificTrace_Activitydiagram_Activity_WriteTrace_Sequence();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Boolean Binary Expression Execute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ACTIVITYDIAGRAM_BOOLEAN_BINARY_EXPRESSION_EXECUTE_SEQUENCE = eINSTANCE.getSpecificTrace_Activitydiagram_BooleanBinaryExpression_Execute_Sequence();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Boolean Unary Expression Execute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ACTIVITYDIAGRAM_BOOLEAN_UNARY_EXPRESSION_EXECUTE_SEQUENCE = eINSTANCE.getSpecificTrace_Activitydiagram_BooleanUnaryExpression_Execute_Sequence();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Boolean Variable Execute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_EXECUTE_SEQUENCE = eINSTANCE.getSpecificTrace_Activitydiagram_BooleanVariable_Execute_Sequence();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Boolean Variable Init Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_INIT_SEQUENCE = eINSTANCE.getSpecificTrace_Activitydiagram_BooleanVariable_Init_Sequence();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Decision Node Execute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ACTIVITYDIAGRAM_DECISION_NODE_EXECUTE_SEQUENCE = eINSTANCE.getSpecificTrace_Activitydiagram_DecisionNode_Execute_Sequence();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Decision Node Send Offers1 Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ACTIVITYDIAGRAM_DECISION_NODE_SEND_OFFERS1_SEQUENCE = eINSTANCE.getSpecificTrace_Activitydiagram_DecisionNode_SendOffers1_Sequence();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Expression Execute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ACTIVITYDIAGRAM_EXPRESSION_EXECUTE_SEQUENCE = eINSTANCE.getSpecificTrace_Activitydiagram_Expression_Execute_Sequence();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Fork Node Execute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ACTIVITYDIAGRAM_FORK_NODE_EXECUTE_SEQUENCE = eINSTANCE.getSpecificTrace_Activitydiagram_ForkNode_Execute_Sequence();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Initial Node Execute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ACTIVITYDIAGRAM_INITIAL_NODE_EXECUTE_SEQUENCE = eINSTANCE.getSpecificTrace_Activitydiagram_InitialNode_Execute_Sequence();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Integer Calculation Expression Execute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ACTIVITYDIAGRAM_INTEGER_CALCULATION_EXPRESSION_EXECUTE_SEQUENCE = eINSTANCE.getSpecificTrace_Activitydiagram_IntegerCalculationExpression_Execute_Sequence();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Integer Comparison Expression Execute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ACTIVITYDIAGRAM_INTEGER_COMPARISON_EXPRESSION_EXECUTE_SEQUENCE = eINSTANCE.getSpecificTrace_Activitydiagram_IntegerComparisonExpression_Execute_Sequence();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Integer Variable Execute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ACTIVITYDIAGRAM_INTEGER_VARIABLE_EXECUTE_SEQUENCE = eINSTANCE.getSpecificTrace_Activitydiagram_IntegerVariable_Execute_Sequence();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Integer Variable Init Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ACTIVITYDIAGRAM_INTEGER_VARIABLE_INIT_SEQUENCE = eINSTANCE.getSpecificTrace_Activitydiagram_IntegerVariable_Init_Sequence();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Join Node Execute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ACTIVITYDIAGRAM_JOIN_NODE_EXECUTE_SEQUENCE = eINSTANCE.getSpecificTrace_Activitydiagram_JoinNode_Execute_Sequence();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Merge Node Execute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ACTIVITYDIAGRAM_MERGE_NODE_EXECUTE_SEQUENCE = eINSTANCE.getSpecificTrace_Activitydiagram_MergeNode_Execute_Sequence();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Named Element Execute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_SEQUENCE = eINSTANCE.getSpecificTrace_Activitydiagram_NamedElement_Execute_Sequence();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Opaque Action Execute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ACTIVITYDIAGRAM_OPAQUE_ACTION_EXECUTE_SEQUENCE = eINSTANCE.getSpecificTrace_Activitydiagram_OpaqueAction_Execute_Sequence();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram traced Activity Final Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_ACTIVITY_FINAL_NODES = eINSTANCE.getSpecificTrace_Activitydiagram_tracedActivityFinalNodes();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram traced Activitys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_ACTIVITYS = eINSTANCE.getSpecificTrace_Activitydiagram_tracedActivitys();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram traced Boolean Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_BOOLEAN_VALUES = eINSTANCE.getSpecificTrace_Activitydiagram_tracedBooleanValues();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram traced Boolean Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_BOOLEAN_VARIABLES = eINSTANCE.getSpecificTrace_Activitydiagram_tracedBooleanVariables();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram traced Control Flows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_CONTROL_FLOWS = eINSTANCE.getSpecificTrace_Activitydiagram_tracedControlFlows();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram traced Control Tokens</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_CONTROL_TOKENS = eINSTANCE.getSpecificTrace_Activitydiagram_tracedControlTokens();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram traced Decision Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_DECISION_NODES = eINSTANCE.getSpecificTrace_Activitydiagram_tracedDecisionNodes();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram traced Fork Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_FORK_NODES = eINSTANCE.getSpecificTrace_Activitydiagram_tracedForkNodes();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram traced Forked Tokens</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_FORKED_TOKENS = eINSTANCE.getSpecificTrace_Activitydiagram_tracedForkedTokens();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram traced Initial Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_INITIAL_NODES = eINSTANCE.getSpecificTrace_Activitydiagram_tracedInitialNodes();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram traced Input Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_INPUT_VALUES = eINSTANCE.getSpecificTrace_Activitydiagram_tracedInputValues();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram traced Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_INPUTS = eINSTANCE.getSpecificTrace_Activitydiagram_tracedInputs();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram traced Integer Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_INTEGER_VALUES = eINSTANCE.getSpecificTrace_Activitydiagram_tracedIntegerValues();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram traced Integer Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_INTEGER_VARIABLES = eINSTANCE.getSpecificTrace_Activitydiagram_tracedIntegerVariables();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram traced Join Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_JOIN_NODES = eINSTANCE.getSpecificTrace_Activitydiagram_tracedJoinNodes();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram traced Merge Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_MERGE_NODES = eINSTANCE.getSpecificTrace_Activitydiagram_tracedMergeNodes();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram traced Offers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_OFFERS = eINSTANCE.getSpecificTrace_Activitydiagram_tracedOffers();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram traced Opaque Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_OPAQUE_ACTIONS = eINSTANCE.getSpecificTrace_Activitydiagram_tracedOpaqueActions();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram traced Traces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ACTIVITYDIAGRAM_TRACED_TRACES = eINSTANCE.getSpecificTrace_Activitydiagram_tracedTraces();

		/**
		 * The meta object literal for the '<em><b>States Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__STATES_TRACE = eINSTANCE.getSpecificTrace_StatesTrace();

	}

} //ActivitydiagramTracePackage
