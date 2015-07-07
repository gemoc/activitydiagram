/**
 */
package activitydiagramTrace.Traced.activitydiagram;

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
 * @see activitydiagramTrace.Traced.activitydiagram.ActivitydiagramFactory
 * @model kind="package"
 * @generated
 */
public interface ActivitydiagramPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "activitydiagram";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "activitydiagramTrace_activitydiagram";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ActivitydiagramPackage eINSTANCE = activitydiagramTrace.Traced.activitydiagram.impl.ActivitydiagramPackageImpl.init();

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedValueImpl <em>Traced Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Traced.activitydiagram.impl.TracedValueImpl
	 * @see activitydiagramTrace.Traced.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedValue()
	 * @generated
	 */
	int TRACED_VALUE = 10;

	/**
	 * The number of structural features of the '<em>Traced Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VALUE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Traced Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedIntegerValueImpl <em>Traced Integer Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Traced.activitydiagram.impl.TracedIntegerValueImpl
	 * @see activitydiagramTrace.Traced.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedIntegerValue()
	 * @generated
	 */
	int TRACED_INTEGER_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Value Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_VALUE__VALUE_TRACE = TRACED_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Integer Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_VALUE_FEATURE_COUNT = TRACED_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Traced Integer Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_VALUE_OPERATION_COUNT = TRACED_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedNamedElementImpl <em>Traced Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Traced.activitydiagram.impl.TracedNamedElementImpl
	 * @see activitydiagramTrace.Traced.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedNamedElement()
	 * @generated
	 */
	int TRACED_NAMED_ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Traced Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_NAMED_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Traced Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedInputImpl <em>Traced Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Traced.activitydiagram.impl.TracedInputImpl
	 * @see activitydiagramTrace.Traced.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedInput()
	 * @generated
	 */
	int TRACED_INPUT = 2;

	/**
	 * The feature id for the '<em><b>Input Values Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INPUT__INPUT_VALUES_TRACE = 0;

	/**
	 * The number of structural features of the '<em>Traced Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INPUT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Traced Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INPUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedBooleanValueImpl <em>Traced Boolean Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Traced.activitydiagram.impl.TracedBooleanValueImpl
	 * @see activitydiagramTrace.Traced.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedBooleanValue()
	 * @generated
	 */
	int TRACED_BOOLEAN_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Value Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_VALUE__VALUE_TRACE = TRACED_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_VALUE_FEATURE_COUNT = TRACED_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Traced Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_VALUE_OPERATION_COUNT = TRACED_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedTraceImpl <em>Traced Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Traced.activitydiagram.impl.TracedTraceImpl
	 * @see activitydiagramTrace.Traced.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedTrace()
	 * @generated
	 */
	int TRACED_TRACE = 4;

	/**
	 * The feature id for the '<em><b>Executed Nodes Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TRACE__EXECUTED_NODES_TRACE = 0;

	/**
	 * The number of structural features of the '<em>Traced Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TRACE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Traced Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TRACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedTokenImpl <em>Traced Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Traced.activitydiagram.impl.TracedTokenImpl
	 * @see activitydiagramTrace.Traced.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedToken()
	 * @generated
	 */
	int TRACED_TOKEN = 13;

	/**
	 * The feature id for the '<em><b>Holder Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TOKEN__HOLDER_TRACE = 0;

	/**
	 * The number of structural features of the '<em>Traced Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TOKEN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Traced Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TOKEN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedControlTokenImpl <em>Traced Control Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Traced.activitydiagram.impl.TracedControlTokenImpl
	 * @see activitydiagramTrace.Traced.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedControlToken()
	 * @generated
	 */
	int TRACED_CONTROL_TOKEN = 5;

	/**
	 * The feature id for the '<em><b>Holder Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONTROL_TOKEN__HOLDER_TRACE = TRACED_TOKEN__HOLDER_TRACE;

	/**
	 * The number of structural features of the '<em>Traced Control Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONTROL_TOKEN_FEATURE_COUNT = TRACED_TOKEN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Control Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONTROL_TOKEN_OPERATION_COUNT = TRACED_TOKEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedActivityNodeImpl <em>Traced Activity Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Traced.activitydiagram.impl.TracedActivityNodeImpl
	 * @see activitydiagramTrace.Traced.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedActivityNode()
	 * @generated
	 */
	int TRACED_ACTIVITY_NODE = 21;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_NODE__OUTGOING = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_NODE__INCOMING = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_NODE__ACTIVITY = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_NODE__HELD_TOKENS = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Held Tokens Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_NODE__HELD_TOKENS_TRACE = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Traced Activity Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_NODE_FEATURE_COUNT = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Traced Activity Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_NODE_OPERATION_COUNT = TRACED_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedControlNodeImpl <em>Traced Control Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Traced.activitydiagram.impl.TracedControlNodeImpl
	 * @see activitydiagramTrace.Traced.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedControlNode()
	 * @generated
	 */
	int TRACED_CONTROL_NODE = 8;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONTROL_NODE__OUTGOING = TRACED_ACTIVITY_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONTROL_NODE__INCOMING = TRACED_ACTIVITY_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONTROL_NODE__ACTIVITY = TRACED_ACTIVITY_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONTROL_NODE__HELD_TOKENS = TRACED_ACTIVITY_NODE__HELD_TOKENS;

	/**
	 * The feature id for the '<em><b>Held Tokens Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONTROL_NODE__HELD_TOKENS_TRACE = TRACED_ACTIVITY_NODE__HELD_TOKENS_TRACE;

	/**
	 * The number of structural features of the '<em>Traced Control Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONTROL_NODE_FEATURE_COUNT = TRACED_ACTIVITY_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Control Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONTROL_NODE_OPERATION_COUNT = TRACED_ACTIVITY_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedDecisionNodeImpl <em>Traced Decision Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Traced.activitydiagram.impl.TracedDecisionNodeImpl
	 * @see activitydiagramTrace.Traced.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedDecisionNode()
	 * @generated
	 */
	int TRACED_DECISION_NODE = 6;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DECISION_NODE__OUTGOING = TRACED_CONTROL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DECISION_NODE__INCOMING = TRACED_CONTROL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DECISION_NODE__ACTIVITY = TRACED_CONTROL_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DECISION_NODE__HELD_TOKENS = TRACED_CONTROL_NODE__HELD_TOKENS;

	/**
	 * The feature id for the '<em><b>Held Tokens Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DECISION_NODE__HELD_TOKENS_TRACE = TRACED_CONTROL_NODE__HELD_TOKENS_TRACE;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DECISION_NODE__ORIGINAL_OBJECT = TRACED_CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Decision Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DECISION_NODE_FEATURE_COUNT = TRACED_CONTROL_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Traced Decision Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DECISION_NODE_OPERATION_COUNT = TRACED_CONTROL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedActivityEdgeImpl <em>Traced Activity Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Traced.activitydiagram.impl.TracedActivityEdgeImpl
	 * @see activitydiagramTrace.Traced.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedActivityEdge()
	 * @generated
	 */
	int TRACED_ACTIVITY_EDGE = 7;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_EDGE__SOURCE = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_EDGE__TARGET = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Offers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_EDGE__OFFERS = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Offers Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_EDGE__OFFERS_TRACE = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Traced Activity Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_EDGE_FEATURE_COUNT = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Traced Activity Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_EDGE_OPERATION_COUNT = TRACED_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedJoinNodeImpl <em>Traced Join Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Traced.activitydiagram.impl.TracedJoinNodeImpl
	 * @see activitydiagramTrace.Traced.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedJoinNode()
	 * @generated
	 */
	int TRACED_JOIN_NODE = 9;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_JOIN_NODE__OUTGOING = TRACED_CONTROL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_JOIN_NODE__INCOMING = TRACED_CONTROL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_JOIN_NODE__ACTIVITY = TRACED_CONTROL_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_JOIN_NODE__HELD_TOKENS = TRACED_CONTROL_NODE__HELD_TOKENS;

	/**
	 * The feature id for the '<em><b>Held Tokens Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_JOIN_NODE__HELD_TOKENS_TRACE = TRACED_CONTROL_NODE__HELD_TOKENS_TRACE;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_JOIN_NODE__ORIGINAL_OBJECT = TRACED_CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Join Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_JOIN_NODE_FEATURE_COUNT = TRACED_CONTROL_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Traced Join Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_JOIN_NODE_OPERATION_COUNT = TRACED_CONTROL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedVariableImpl <em>Traced Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Traced.activitydiagram.impl.TracedVariableImpl
	 * @see activitydiagramTrace.Traced.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedVariable()
	 * @generated
	 */
	int TRACED_VARIABLE = 28;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VARIABLE__INITIAL_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VARIABLE__CURRENT_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Current Value Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VARIABLE__CURRENT_VALUE_TRACE = 2;

	/**
	 * The number of structural features of the '<em>Traced Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VARIABLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Traced Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedBooleanVariableImpl <em>Traced Boolean Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Traced.activitydiagram.impl.TracedBooleanVariableImpl
	 * @see activitydiagramTrace.Traced.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedBooleanVariable()
	 * @generated
	 */
	int TRACED_BOOLEAN_VARIABLE = 11;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_VARIABLE__INITIAL_VALUE = TRACED_VARIABLE__INITIAL_VALUE;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_VARIABLE__CURRENT_VALUE = TRACED_VARIABLE__CURRENT_VALUE;

	/**
	 * The feature id for the '<em><b>Current Value Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_VARIABLE__CURRENT_VALUE_TRACE = TRACED_VARIABLE__CURRENT_VALUE_TRACE;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_VARIABLE__ORIGINAL_OBJECT = TRACED_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Boolean Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_VARIABLE_FEATURE_COUNT = TRACED_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Traced Boolean Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_VARIABLE_OPERATION_COUNT = TRACED_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedFinalNodeImpl <em>Traced Final Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Traced.activitydiagram.impl.TracedFinalNodeImpl
	 * @see activitydiagramTrace.Traced.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedFinalNode()
	 * @generated
	 */
	int TRACED_FINAL_NODE = 24;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FINAL_NODE__OUTGOING = TRACED_CONTROL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FINAL_NODE__INCOMING = TRACED_CONTROL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FINAL_NODE__ACTIVITY = TRACED_CONTROL_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FINAL_NODE__HELD_TOKENS = TRACED_CONTROL_NODE__HELD_TOKENS;

	/**
	 * The feature id for the '<em><b>Held Tokens Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FINAL_NODE__HELD_TOKENS_TRACE = TRACED_CONTROL_NODE__HELD_TOKENS_TRACE;

	/**
	 * The number of structural features of the '<em>Traced Final Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FINAL_NODE_FEATURE_COUNT = TRACED_CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Final Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FINAL_NODE_OPERATION_COUNT = TRACED_CONTROL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedActivityFinalNodeImpl <em>Traced Activity Final Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Traced.activitydiagram.impl.TracedActivityFinalNodeImpl
	 * @see activitydiagramTrace.Traced.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedActivityFinalNode()
	 * @generated
	 */
	int TRACED_ACTIVITY_FINAL_NODE = 12;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_FINAL_NODE__OUTGOING = TRACED_FINAL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_FINAL_NODE__INCOMING = TRACED_FINAL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_FINAL_NODE__ACTIVITY = TRACED_FINAL_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_FINAL_NODE__HELD_TOKENS = TRACED_FINAL_NODE__HELD_TOKENS;

	/**
	 * The feature id for the '<em><b>Held Tokens Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_FINAL_NODE__HELD_TOKENS_TRACE = TRACED_FINAL_NODE__HELD_TOKENS_TRACE;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_FINAL_NODE__ORIGINAL_OBJECT = TRACED_FINAL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Activity Final Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_FINAL_NODE_FEATURE_COUNT = TRACED_FINAL_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Traced Activity Final Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_FINAL_NODE_OPERATION_COUNT = TRACED_FINAL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedExecutableNodeImpl <em>Traced Executable Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Traced.activitydiagram.impl.TracedExecutableNodeImpl
	 * @see activitydiagramTrace.Traced.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedExecutableNode()
	 * @generated
	 */
	int TRACED_EXECUTABLE_NODE = 14;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXECUTABLE_NODE__OUTGOING = TRACED_ACTIVITY_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXECUTABLE_NODE__INCOMING = TRACED_ACTIVITY_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXECUTABLE_NODE__ACTIVITY = TRACED_ACTIVITY_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXECUTABLE_NODE__HELD_TOKENS = TRACED_ACTIVITY_NODE__HELD_TOKENS;

	/**
	 * The feature id for the '<em><b>Held Tokens Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXECUTABLE_NODE__HELD_TOKENS_TRACE = TRACED_ACTIVITY_NODE__HELD_TOKENS_TRACE;

	/**
	 * The number of structural features of the '<em>Traced Executable Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXECUTABLE_NODE_FEATURE_COUNT = TRACED_ACTIVITY_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Executable Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXECUTABLE_NODE_OPERATION_COUNT = TRACED_ACTIVITY_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedInputValueImpl <em>Traced Input Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Traced.activitydiagram.impl.TracedInputValueImpl
	 * @see activitydiagramTrace.Traced.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedInputValue()
	 * @generated
	 */
	int TRACED_INPUT_VALUE = 15;

	/**
	 * The feature id for the '<em><b>Value Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INPUT_VALUE__VALUE_TRACE = 0;

	/**
	 * The feature id for the '<em><b>Variable Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INPUT_VALUE__VARIABLE_TRACE = 1;

	/**
	 * The number of structural features of the '<em>Traced Input Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INPUT_VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Traced Input Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INPUT_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedActionImpl <em>Traced Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Traced.activitydiagram.impl.TracedActionImpl
	 * @see activitydiagramTrace.Traced.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedAction()
	 * @generated
	 */
	int TRACED_ACTION = 16;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTION__OUTGOING = TRACED_EXECUTABLE_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTION__INCOMING = TRACED_EXECUTABLE_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTION__ACTIVITY = TRACED_EXECUTABLE_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTION__HELD_TOKENS = TRACED_EXECUTABLE_NODE__HELD_TOKENS;

	/**
	 * The feature id for the '<em><b>Held Tokens Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTION__HELD_TOKENS_TRACE = TRACED_EXECUTABLE_NODE__HELD_TOKENS_TRACE;

	/**
	 * The number of structural features of the '<em>Traced Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTION_FEATURE_COUNT = TRACED_EXECUTABLE_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTION_OPERATION_COUNT = TRACED_EXECUTABLE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedControlFlowImpl <em>Traced Control Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Traced.activitydiagram.impl.TracedControlFlowImpl
	 * @see activitydiagramTrace.Traced.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedControlFlow()
	 * @generated
	 */
	int TRACED_CONTROL_FLOW = 17;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONTROL_FLOW__SOURCE = TRACED_ACTIVITY_EDGE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONTROL_FLOW__TARGET = TRACED_ACTIVITY_EDGE__TARGET;

	/**
	 * The feature id for the '<em><b>Offers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONTROL_FLOW__OFFERS = TRACED_ACTIVITY_EDGE__OFFERS;

	/**
	 * The feature id for the '<em><b>Offers Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONTROL_FLOW__OFFERS_TRACE = TRACED_ACTIVITY_EDGE__OFFERS_TRACE;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONTROL_FLOW__GUARD = TRACED_ACTIVITY_EDGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONTROL_FLOW__ORIGINAL_OBJECT = TRACED_ACTIVITY_EDGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Traced Control Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONTROL_FLOW_FEATURE_COUNT = TRACED_ACTIVITY_EDGE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Traced Control Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONTROL_FLOW_OPERATION_COUNT = TRACED_ACTIVITY_EDGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedForkNodeImpl <em>Traced Fork Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Traced.activitydiagram.impl.TracedForkNodeImpl
	 * @see activitydiagramTrace.Traced.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedForkNode()
	 * @generated
	 */
	int TRACED_FORK_NODE = 18;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FORK_NODE__OUTGOING = TRACED_CONTROL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FORK_NODE__INCOMING = TRACED_CONTROL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FORK_NODE__ACTIVITY = TRACED_CONTROL_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FORK_NODE__HELD_TOKENS = TRACED_CONTROL_NODE__HELD_TOKENS;

	/**
	 * The feature id for the '<em><b>Held Tokens Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FORK_NODE__HELD_TOKENS_TRACE = TRACED_CONTROL_NODE__HELD_TOKENS_TRACE;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FORK_NODE__ORIGINAL_OBJECT = TRACED_CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Fork Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FORK_NODE_FEATURE_COUNT = TRACED_CONTROL_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Traced Fork Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FORK_NODE_OPERATION_COUNT = TRACED_CONTROL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedForkedTokenImpl <em>Traced Forked Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Traced.activitydiagram.impl.TracedForkedTokenImpl
	 * @see activitydiagramTrace.Traced.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedForkedToken()
	 * @generated
	 */
	int TRACED_FORKED_TOKEN = 19;

	/**
	 * The feature id for the '<em><b>Holder Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FORKED_TOKEN__HOLDER_TRACE = TRACED_TOKEN__HOLDER_TRACE;

	/**
	 * The feature id for the '<em><b>Remaining Offers Count Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FORKED_TOKEN__REMAINING_OFFERS_COUNT_TRACE = TRACED_TOKEN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Token Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FORKED_TOKEN__BASE_TOKEN_TRACE = TRACED_TOKEN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Traced Forked Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FORKED_TOKEN_FEATURE_COUNT = TRACED_TOKEN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Traced Forked Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FORKED_TOKEN_OPERATION_COUNT = TRACED_TOKEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedIntegerVariableImpl <em>Traced Integer Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Traced.activitydiagram.impl.TracedIntegerVariableImpl
	 * @see activitydiagramTrace.Traced.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedIntegerVariable()
	 * @generated
	 */
	int TRACED_INTEGER_VARIABLE = 20;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_VARIABLE__INITIAL_VALUE = TRACED_VARIABLE__INITIAL_VALUE;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_VARIABLE__CURRENT_VALUE = TRACED_VARIABLE__CURRENT_VALUE;

	/**
	 * The feature id for the '<em><b>Current Value Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_VARIABLE__CURRENT_VALUE_TRACE = TRACED_VARIABLE__CURRENT_VALUE_TRACE;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_VARIABLE__ORIGINAL_OBJECT = TRACED_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Integer Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_VARIABLE_FEATURE_COUNT = TRACED_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Traced Integer Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_VARIABLE_OPERATION_COUNT = TRACED_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedActivityImpl <em>Traced Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Traced.activitydiagram.impl.TracedActivityImpl
	 * @see activitydiagramTrace.Traced.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedActivity()
	 * @generated
	 */
	int TRACED_ACTIVITY = 22;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY__NODES = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY__EDGES = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Locals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY__LOCALS = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY__INPUTS = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Trace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY__TRACE = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY__ORIGINAL_OBJECT = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Trace Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY__TRACE_TRACE = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Traced Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_FEATURE_COUNT = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Traced Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_OPERATION_COUNT = TRACED_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedOpaqueActionImpl <em>Traced Opaque Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Traced.activitydiagram.impl.TracedOpaqueActionImpl
	 * @see activitydiagramTrace.Traced.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedOpaqueAction()
	 * @generated
	 */
	int TRACED_OPAQUE_ACTION = 23;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPAQUE_ACTION__OUTGOING = TRACED_ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPAQUE_ACTION__INCOMING = TRACED_ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPAQUE_ACTION__ACTIVITY = TRACED_ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPAQUE_ACTION__HELD_TOKENS = TRACED_ACTION__HELD_TOKENS;

	/**
	 * The feature id for the '<em><b>Held Tokens Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPAQUE_ACTION__HELD_TOKENS_TRACE = TRACED_ACTION__HELD_TOKENS_TRACE;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPAQUE_ACTION__EXPRESSIONS = TRACED_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPAQUE_ACTION__ORIGINAL_OBJECT = TRACED_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Traced Opaque Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPAQUE_ACTION_FEATURE_COUNT = TRACED_ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Traced Opaque Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPAQUE_ACTION_OPERATION_COUNT = TRACED_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedInitialNodeImpl <em>Traced Initial Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Traced.activitydiagram.impl.TracedInitialNodeImpl
	 * @see activitydiagramTrace.Traced.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedInitialNode()
	 * @generated
	 */
	int TRACED_INITIAL_NODE = 25;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INITIAL_NODE__OUTGOING = TRACED_CONTROL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INITIAL_NODE__INCOMING = TRACED_CONTROL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INITIAL_NODE__ACTIVITY = TRACED_CONTROL_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INITIAL_NODE__HELD_TOKENS = TRACED_CONTROL_NODE__HELD_TOKENS;

	/**
	 * The feature id for the '<em><b>Held Tokens Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INITIAL_NODE__HELD_TOKENS_TRACE = TRACED_CONTROL_NODE__HELD_TOKENS_TRACE;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INITIAL_NODE__ORIGINAL_OBJECT = TRACED_CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Initial Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INITIAL_NODE_FEATURE_COUNT = TRACED_CONTROL_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Traced Initial Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INITIAL_NODE_OPERATION_COUNT = TRACED_CONTROL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedMergeNodeImpl <em>Traced Merge Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Traced.activitydiagram.impl.TracedMergeNodeImpl
	 * @see activitydiagramTrace.Traced.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedMergeNode()
	 * @generated
	 */
	int TRACED_MERGE_NODE = 26;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MERGE_NODE__OUTGOING = TRACED_CONTROL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MERGE_NODE__INCOMING = TRACED_CONTROL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MERGE_NODE__ACTIVITY = TRACED_CONTROL_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MERGE_NODE__HELD_TOKENS = TRACED_CONTROL_NODE__HELD_TOKENS;

	/**
	 * The feature id for the '<em><b>Held Tokens Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MERGE_NODE__HELD_TOKENS_TRACE = TRACED_CONTROL_NODE__HELD_TOKENS_TRACE;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MERGE_NODE__ORIGINAL_OBJECT = TRACED_CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Merge Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MERGE_NODE_FEATURE_COUNT = TRACED_CONTROL_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Traced Merge Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MERGE_NODE_OPERATION_COUNT = TRACED_CONTROL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedOfferImpl <em>Traced Offer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Traced.activitydiagram.impl.TracedOfferImpl
	 * @see activitydiagramTrace.Traced.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedOffer()
	 * @generated
	 */
	int TRACED_OFFER = 27;

	/**
	 * The feature id for the '<em><b>Offered Tokens Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OFFER__OFFERED_TOKENS_TRACE = 0;

	/**
	 * The number of structural features of the '<em>Traced Offer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OFFER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Traced Offer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OFFER_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Traced.activitydiagram.TracedIntegerValue <em>Traced Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Integer Value</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedIntegerValue
	 * @generated
	 */
	EClass getTracedIntegerValue();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Traced.activitydiagram.TracedIntegerValue#getValueTrace <em>Value Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value Trace</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedIntegerValue#getValueTrace()
	 * @see #getTracedIntegerValue()
	 * @generated
	 */
	EReference getTracedIntegerValue_ValueTrace();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Traced.activitydiagram.TracedNamedElement <em>Traced Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Named Element</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedNamedElement
	 * @generated
	 */
	EClass getTracedNamedElement();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Traced.activitydiagram.TracedInput <em>Traced Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Input</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedInput
	 * @generated
	 */
	EClass getTracedInput();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Traced.activitydiagram.TracedInput#getInputValuesTrace <em>Input Values Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Values Trace</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedInput#getInputValuesTrace()
	 * @see #getTracedInput()
	 * @generated
	 */
	EReference getTracedInput_InputValuesTrace();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Traced.activitydiagram.TracedBooleanValue <em>Traced Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Boolean Value</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedBooleanValue
	 * @generated
	 */
	EClass getTracedBooleanValue();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Traced.activitydiagram.TracedBooleanValue#getValueTrace <em>Value Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value Trace</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedBooleanValue#getValueTrace()
	 * @see #getTracedBooleanValue()
	 * @generated
	 */
	EReference getTracedBooleanValue_ValueTrace();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Traced.activitydiagram.TracedTrace <em>Traced Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Trace</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedTrace
	 * @generated
	 */
	EClass getTracedTrace();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Traced.activitydiagram.TracedTrace#getExecutedNodesTrace <em>Executed Nodes Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Executed Nodes Trace</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedTrace#getExecutedNodesTrace()
	 * @see #getTracedTrace()
	 * @generated
	 */
	EReference getTracedTrace_ExecutedNodesTrace();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Traced.activitydiagram.TracedControlToken <em>Traced Control Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Control Token</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedControlToken
	 * @generated
	 */
	EClass getTracedControlToken();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Traced.activitydiagram.TracedDecisionNode <em>Traced Decision Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Decision Node</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedDecisionNode
	 * @generated
	 */
	EClass getTracedDecisionNode();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.Traced.activitydiagram.TracedDecisionNode#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedDecisionNode#getOriginalObject()
	 * @see #getTracedDecisionNode()
	 * @generated
	 */
	EReference getTracedDecisionNode_OriginalObject();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Traced.activitydiagram.TracedActivityEdge <em>Traced Activity Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Activity Edge</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedActivityEdge
	 * @generated
	 */
	EClass getTracedActivityEdge();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.Traced.activitydiagram.TracedActivityEdge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedActivityEdge#getSource()
	 * @see #getTracedActivityEdge()
	 * @generated
	 */
	EReference getTracedActivityEdge_Source();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.Traced.activitydiagram.TracedActivityEdge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedActivityEdge#getTarget()
	 * @see #getTracedActivityEdge()
	 * @generated
	 */
	EReference getTracedActivityEdge_Target();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.Traced.activitydiagram.TracedActivityEdge#getOffers <em>Offers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Offers</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedActivityEdge#getOffers()
	 * @see #getTracedActivityEdge()
	 * @generated
	 */
	EReference getTracedActivityEdge_Offers();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Traced.activitydiagram.TracedActivityEdge#getOffersTrace <em>Offers Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Offers Trace</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedActivityEdge#getOffersTrace()
	 * @see #getTracedActivityEdge()
	 * @generated
	 */
	EReference getTracedActivityEdge_OffersTrace();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Traced.activitydiagram.TracedControlNode <em>Traced Control Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Control Node</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedControlNode
	 * @generated
	 */
	EClass getTracedControlNode();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Traced.activitydiagram.TracedJoinNode <em>Traced Join Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Join Node</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedJoinNode
	 * @generated
	 */
	EClass getTracedJoinNode();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.Traced.activitydiagram.TracedJoinNode#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedJoinNode#getOriginalObject()
	 * @see #getTracedJoinNode()
	 * @generated
	 */
	EReference getTracedJoinNode_OriginalObject();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Traced.activitydiagram.TracedValue <em>Traced Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Value</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedValue
	 * @generated
	 */
	EClass getTracedValue();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Traced.activitydiagram.TracedBooleanVariable <em>Traced Boolean Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Boolean Variable</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedBooleanVariable
	 * @generated
	 */
	EClass getTracedBooleanVariable();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.Traced.activitydiagram.TracedBooleanVariable#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedBooleanVariable#getOriginalObject()
	 * @see #getTracedBooleanVariable()
	 * @generated
	 */
	EReference getTracedBooleanVariable_OriginalObject();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Traced.activitydiagram.TracedActivityFinalNode <em>Traced Activity Final Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Activity Final Node</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedActivityFinalNode
	 * @generated
	 */
	EClass getTracedActivityFinalNode();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.Traced.activitydiagram.TracedActivityFinalNode#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedActivityFinalNode#getOriginalObject()
	 * @see #getTracedActivityFinalNode()
	 * @generated
	 */
	EReference getTracedActivityFinalNode_OriginalObject();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Traced.activitydiagram.TracedToken <em>Traced Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Token</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedToken
	 * @generated
	 */
	EClass getTracedToken();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Traced.activitydiagram.TracedToken#getHolderTrace <em>Holder Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Holder Trace</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedToken#getHolderTrace()
	 * @see #getTracedToken()
	 * @generated
	 */
	EReference getTracedToken_HolderTrace();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Traced.activitydiagram.TracedExecutableNode <em>Traced Executable Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Executable Node</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedExecutableNode
	 * @generated
	 */
	EClass getTracedExecutableNode();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Traced.activitydiagram.TracedInputValue <em>Traced Input Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Input Value</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedInputValue
	 * @generated
	 */
	EClass getTracedInputValue();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Traced.activitydiagram.TracedInputValue#getValueTrace <em>Value Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value Trace</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedInputValue#getValueTrace()
	 * @see #getTracedInputValue()
	 * @generated
	 */
	EReference getTracedInputValue_ValueTrace();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Traced.activitydiagram.TracedInputValue#getVariableTrace <em>Variable Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable Trace</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedInputValue#getVariableTrace()
	 * @see #getTracedInputValue()
	 * @generated
	 */
	EReference getTracedInputValue_VariableTrace();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Traced.activitydiagram.TracedAction <em>Traced Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Action</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedAction
	 * @generated
	 */
	EClass getTracedAction();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Traced.activitydiagram.TracedControlFlow <em>Traced Control Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Control Flow</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedControlFlow
	 * @generated
	 */
	EClass getTracedControlFlow();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.Traced.activitydiagram.TracedControlFlow#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Guard</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedControlFlow#getGuard()
	 * @see #getTracedControlFlow()
	 * @generated
	 */
	EReference getTracedControlFlow_Guard();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.Traced.activitydiagram.TracedControlFlow#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedControlFlow#getOriginalObject()
	 * @see #getTracedControlFlow()
	 * @generated
	 */
	EReference getTracedControlFlow_OriginalObject();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Traced.activitydiagram.TracedForkNode <em>Traced Fork Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Fork Node</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedForkNode
	 * @generated
	 */
	EClass getTracedForkNode();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.Traced.activitydiagram.TracedForkNode#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedForkNode#getOriginalObject()
	 * @see #getTracedForkNode()
	 * @generated
	 */
	EReference getTracedForkNode_OriginalObject();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Traced.activitydiagram.TracedForkedToken <em>Traced Forked Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Forked Token</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedForkedToken
	 * @generated
	 */
	EClass getTracedForkedToken();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Traced.activitydiagram.TracedForkedToken#getRemainingOffersCountTrace <em>Remaining Offers Count Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Remaining Offers Count Trace</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedForkedToken#getRemainingOffersCountTrace()
	 * @see #getTracedForkedToken()
	 * @generated
	 */
	EReference getTracedForkedToken_RemainingOffersCountTrace();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Traced.activitydiagram.TracedForkedToken#getBaseTokenTrace <em>Base Token Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Base Token Trace</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedForkedToken#getBaseTokenTrace()
	 * @see #getTracedForkedToken()
	 * @generated
	 */
	EReference getTracedForkedToken_BaseTokenTrace();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Traced.activitydiagram.TracedIntegerVariable <em>Traced Integer Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Integer Variable</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedIntegerVariable
	 * @generated
	 */
	EClass getTracedIntegerVariable();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.Traced.activitydiagram.TracedIntegerVariable#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedIntegerVariable#getOriginalObject()
	 * @see #getTracedIntegerVariable()
	 * @generated
	 */
	EReference getTracedIntegerVariable_OriginalObject();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Traced.activitydiagram.TracedActivityNode <em>Traced Activity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Activity Node</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedActivityNode
	 * @generated
	 */
	EClass getTracedActivityNode();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.Traced.activitydiagram.TracedActivityNode#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedActivityNode#getOutgoing()
	 * @see #getTracedActivityNode()
	 * @generated
	 */
	EReference getTracedActivityNode_Outgoing();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.Traced.activitydiagram.TracedActivityNode#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedActivityNode#getIncoming()
	 * @see #getTracedActivityNode()
	 * @generated
	 */
	EReference getTracedActivityNode_Incoming();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.Traced.activitydiagram.TracedActivityNode#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activity</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedActivityNode#getActivity()
	 * @see #getTracedActivityNode()
	 * @generated
	 */
	EReference getTracedActivityNode_Activity();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.Traced.activitydiagram.TracedActivityNode#getHeldTokens <em>Held Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Held Tokens</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedActivityNode#getHeldTokens()
	 * @see #getTracedActivityNode()
	 * @generated
	 */
	EReference getTracedActivityNode_HeldTokens();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Traced.activitydiagram.TracedActivityNode#getHeldTokensTrace <em>Held Tokens Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Held Tokens Trace</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedActivityNode#getHeldTokensTrace()
	 * @see #getTracedActivityNode()
	 * @generated
	 */
	EReference getTracedActivityNode_HeldTokensTrace();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Traced.activitydiagram.TracedActivity <em>Traced Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Activity</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedActivity
	 * @generated
	 */
	EClass getTracedActivity();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.Traced.activitydiagram.TracedActivity#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Nodes</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedActivity#getNodes()
	 * @see #getTracedActivity()
	 * @generated
	 */
	EReference getTracedActivity_Nodes();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.Traced.activitydiagram.TracedActivity#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Edges</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedActivity#getEdges()
	 * @see #getTracedActivity()
	 * @generated
	 */
	EReference getTracedActivity_Edges();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.Traced.activitydiagram.TracedActivity#getLocals <em>Locals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Locals</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedActivity#getLocals()
	 * @see #getTracedActivity()
	 * @generated
	 */
	EReference getTracedActivity_Locals();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.Traced.activitydiagram.TracedActivity#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inputs</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedActivity#getInputs()
	 * @see #getTracedActivity()
	 * @generated
	 */
	EReference getTracedActivity_Inputs();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.Traced.activitydiagram.TracedActivity#getTrace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trace</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedActivity#getTrace()
	 * @see #getTracedActivity()
	 * @generated
	 */
	EReference getTracedActivity_Trace();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.Traced.activitydiagram.TracedActivity#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedActivity#getOriginalObject()
	 * @see #getTracedActivity()
	 * @generated
	 */
	EReference getTracedActivity_OriginalObject();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Traced.activitydiagram.TracedActivity#getTraceTrace <em>Trace Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trace Trace</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedActivity#getTraceTrace()
	 * @see #getTracedActivity()
	 * @generated
	 */
	EReference getTracedActivity_TraceTrace();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Traced.activitydiagram.TracedOpaqueAction <em>Traced Opaque Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Opaque Action</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedOpaqueAction
	 * @generated
	 */
	EClass getTracedOpaqueAction();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.Traced.activitydiagram.TracedOpaqueAction#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Expressions</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedOpaqueAction#getExpressions()
	 * @see #getTracedOpaqueAction()
	 * @generated
	 */
	EReference getTracedOpaqueAction_Expressions();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.Traced.activitydiagram.TracedOpaqueAction#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedOpaqueAction#getOriginalObject()
	 * @see #getTracedOpaqueAction()
	 * @generated
	 */
	EReference getTracedOpaqueAction_OriginalObject();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Traced.activitydiagram.TracedFinalNode <em>Traced Final Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Final Node</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedFinalNode
	 * @generated
	 */
	EClass getTracedFinalNode();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Traced.activitydiagram.TracedInitialNode <em>Traced Initial Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Initial Node</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedInitialNode
	 * @generated
	 */
	EClass getTracedInitialNode();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.Traced.activitydiagram.TracedInitialNode#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedInitialNode#getOriginalObject()
	 * @see #getTracedInitialNode()
	 * @generated
	 */
	EReference getTracedInitialNode_OriginalObject();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Traced.activitydiagram.TracedMergeNode <em>Traced Merge Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Merge Node</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedMergeNode
	 * @generated
	 */
	EClass getTracedMergeNode();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.Traced.activitydiagram.TracedMergeNode#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedMergeNode#getOriginalObject()
	 * @see #getTracedMergeNode()
	 * @generated
	 */
	EReference getTracedMergeNode_OriginalObject();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Traced.activitydiagram.TracedOffer <em>Traced Offer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Offer</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedOffer
	 * @generated
	 */
	EClass getTracedOffer();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Traced.activitydiagram.TracedOffer#getOfferedTokensTrace <em>Offered Tokens Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Offered Tokens Trace</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedOffer#getOfferedTokensTrace()
	 * @see #getTracedOffer()
	 * @generated
	 */
	EReference getTracedOffer_OfferedTokensTrace();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Traced.activitydiagram.TracedVariable <em>Traced Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Variable</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedVariable
	 * @generated
	 */
	EClass getTracedVariable();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.Traced.activitydiagram.TracedVariable#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial Value</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedVariable#getInitialValue()
	 * @see #getTracedVariable()
	 * @generated
	 */
	EReference getTracedVariable_InitialValue();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.Traced.activitydiagram.TracedVariable#getCurrentValue <em>Current Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Value</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedVariable#getCurrentValue()
	 * @see #getTracedVariable()
	 * @generated
	 */
	EReference getTracedVariable_CurrentValue();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Traced.activitydiagram.TracedVariable#getCurrentValueTrace <em>Current Value Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Current Value Trace</em>'.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedVariable#getCurrentValueTrace()
	 * @see #getTracedVariable()
	 * @generated
	 */
	EReference getTracedVariable_CurrentValueTrace();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ActivitydiagramFactory getActivitydiagramFactory();

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
		 * The meta object literal for the '{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedIntegerValueImpl <em>Traced Integer Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Traced.activitydiagram.impl.TracedIntegerValueImpl
		 * @see activitydiagramTrace.Traced.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedIntegerValue()
		 * @generated
		 */
		EClass TRACED_INTEGER_VALUE = eINSTANCE.getTracedIntegerValue();

		/**
		 * The meta object literal for the '<em><b>Value Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_INTEGER_VALUE__VALUE_TRACE = eINSTANCE.getTracedIntegerValue_ValueTrace();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedNamedElementImpl <em>Traced Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Traced.activitydiagram.impl.TracedNamedElementImpl
		 * @see activitydiagramTrace.Traced.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedNamedElement()
		 * @generated
		 */
		EClass TRACED_NAMED_ELEMENT = eINSTANCE.getTracedNamedElement();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedInputImpl <em>Traced Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Traced.activitydiagram.impl.TracedInputImpl
		 * @see activitydiagramTrace.Traced.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedInput()
		 * @generated
		 */
		EClass TRACED_INPUT = eINSTANCE.getTracedInput();

		/**
		 * The meta object literal for the '<em><b>Input Values Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_INPUT__INPUT_VALUES_TRACE = eINSTANCE.getTracedInput_InputValuesTrace();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedBooleanValueImpl <em>Traced Boolean Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Traced.activitydiagram.impl.TracedBooleanValueImpl
		 * @see activitydiagramTrace.Traced.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedBooleanValue()
		 * @generated
		 */
		EClass TRACED_BOOLEAN_VALUE = eINSTANCE.getTracedBooleanValue();

		/**
		 * The meta object literal for the '<em><b>Value Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_BOOLEAN_VALUE__VALUE_TRACE = eINSTANCE.getTracedBooleanValue_ValueTrace();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedTraceImpl <em>Traced Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Traced.activitydiagram.impl.TracedTraceImpl
		 * @see activitydiagramTrace.Traced.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedTrace()
		 * @generated
		 */
		EClass TRACED_TRACE = eINSTANCE.getTracedTrace();

		/**
		 * The meta object literal for the '<em><b>Executed Nodes Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_TRACE__EXECUTED_NODES_TRACE = eINSTANCE.getTracedTrace_ExecutedNodesTrace();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedControlTokenImpl <em>Traced Control Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Traced.activitydiagram.impl.TracedControlTokenImpl
		 * @see activitydiagramTrace.Traced.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedControlToken()
		 * @generated
		 */
		EClass TRACED_CONTROL_TOKEN = eINSTANCE.getTracedControlToken();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedDecisionNodeImpl <em>Traced Decision Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Traced.activitydiagram.impl.TracedDecisionNodeImpl
		 * @see activitydiagramTrace.Traced.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedDecisionNode()
		 * @generated
		 */
		EClass TRACED_DECISION_NODE = eINSTANCE.getTracedDecisionNode();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_DECISION_NODE__ORIGINAL_OBJECT = eINSTANCE.getTracedDecisionNode_OriginalObject();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedActivityEdgeImpl <em>Traced Activity Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Traced.activitydiagram.impl.TracedActivityEdgeImpl
		 * @see activitydiagramTrace.Traced.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedActivityEdge()
		 * @generated
		 */
		EClass TRACED_ACTIVITY_EDGE = eINSTANCE.getTracedActivityEdge();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ACTIVITY_EDGE__SOURCE = eINSTANCE.getTracedActivityEdge_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ACTIVITY_EDGE__TARGET = eINSTANCE.getTracedActivityEdge_Target();

		/**
		 * The meta object literal for the '<em><b>Offers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ACTIVITY_EDGE__OFFERS = eINSTANCE.getTracedActivityEdge_Offers();

		/**
		 * The meta object literal for the '<em><b>Offers Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ACTIVITY_EDGE__OFFERS_TRACE = eINSTANCE.getTracedActivityEdge_OffersTrace();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedControlNodeImpl <em>Traced Control Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Traced.activitydiagram.impl.TracedControlNodeImpl
		 * @see activitydiagramTrace.Traced.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedControlNode()
		 * @generated
		 */
		EClass TRACED_CONTROL_NODE = eINSTANCE.getTracedControlNode();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedJoinNodeImpl <em>Traced Join Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Traced.activitydiagram.impl.TracedJoinNodeImpl
		 * @see activitydiagramTrace.Traced.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedJoinNode()
		 * @generated
		 */
		EClass TRACED_JOIN_NODE = eINSTANCE.getTracedJoinNode();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_JOIN_NODE__ORIGINAL_OBJECT = eINSTANCE.getTracedJoinNode_OriginalObject();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedValueImpl <em>Traced Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Traced.activitydiagram.impl.TracedValueImpl
		 * @see activitydiagramTrace.Traced.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedValue()
		 * @generated
		 */
		EClass TRACED_VALUE = eINSTANCE.getTracedValue();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedBooleanVariableImpl <em>Traced Boolean Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Traced.activitydiagram.impl.TracedBooleanVariableImpl
		 * @see activitydiagramTrace.Traced.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedBooleanVariable()
		 * @generated
		 */
		EClass TRACED_BOOLEAN_VARIABLE = eINSTANCE.getTracedBooleanVariable();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_BOOLEAN_VARIABLE__ORIGINAL_OBJECT = eINSTANCE.getTracedBooleanVariable_OriginalObject();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedActivityFinalNodeImpl <em>Traced Activity Final Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Traced.activitydiagram.impl.TracedActivityFinalNodeImpl
		 * @see activitydiagramTrace.Traced.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedActivityFinalNode()
		 * @generated
		 */
		EClass TRACED_ACTIVITY_FINAL_NODE = eINSTANCE.getTracedActivityFinalNode();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ACTIVITY_FINAL_NODE__ORIGINAL_OBJECT = eINSTANCE.getTracedActivityFinalNode_OriginalObject();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedTokenImpl <em>Traced Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Traced.activitydiagram.impl.TracedTokenImpl
		 * @see activitydiagramTrace.Traced.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedToken()
		 * @generated
		 */
		EClass TRACED_TOKEN = eINSTANCE.getTracedToken();

		/**
		 * The meta object literal for the '<em><b>Holder Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_TOKEN__HOLDER_TRACE = eINSTANCE.getTracedToken_HolderTrace();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedExecutableNodeImpl <em>Traced Executable Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Traced.activitydiagram.impl.TracedExecutableNodeImpl
		 * @see activitydiagramTrace.Traced.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedExecutableNode()
		 * @generated
		 */
		EClass TRACED_EXECUTABLE_NODE = eINSTANCE.getTracedExecutableNode();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedInputValueImpl <em>Traced Input Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Traced.activitydiagram.impl.TracedInputValueImpl
		 * @see activitydiagramTrace.Traced.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedInputValue()
		 * @generated
		 */
		EClass TRACED_INPUT_VALUE = eINSTANCE.getTracedInputValue();

		/**
		 * The meta object literal for the '<em><b>Value Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_INPUT_VALUE__VALUE_TRACE = eINSTANCE.getTracedInputValue_ValueTrace();

		/**
		 * The meta object literal for the '<em><b>Variable Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_INPUT_VALUE__VARIABLE_TRACE = eINSTANCE.getTracedInputValue_VariableTrace();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedActionImpl <em>Traced Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Traced.activitydiagram.impl.TracedActionImpl
		 * @see activitydiagramTrace.Traced.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedAction()
		 * @generated
		 */
		EClass TRACED_ACTION = eINSTANCE.getTracedAction();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedControlFlowImpl <em>Traced Control Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Traced.activitydiagram.impl.TracedControlFlowImpl
		 * @see activitydiagramTrace.Traced.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedControlFlow()
		 * @generated
		 */
		EClass TRACED_CONTROL_FLOW = eINSTANCE.getTracedControlFlow();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_CONTROL_FLOW__GUARD = eINSTANCE.getTracedControlFlow_Guard();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_CONTROL_FLOW__ORIGINAL_OBJECT = eINSTANCE.getTracedControlFlow_OriginalObject();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedForkNodeImpl <em>Traced Fork Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Traced.activitydiagram.impl.TracedForkNodeImpl
		 * @see activitydiagramTrace.Traced.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedForkNode()
		 * @generated
		 */
		EClass TRACED_FORK_NODE = eINSTANCE.getTracedForkNode();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_FORK_NODE__ORIGINAL_OBJECT = eINSTANCE.getTracedForkNode_OriginalObject();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedForkedTokenImpl <em>Traced Forked Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Traced.activitydiagram.impl.TracedForkedTokenImpl
		 * @see activitydiagramTrace.Traced.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedForkedToken()
		 * @generated
		 */
		EClass TRACED_FORKED_TOKEN = eINSTANCE.getTracedForkedToken();

		/**
		 * The meta object literal for the '<em><b>Remaining Offers Count Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_FORKED_TOKEN__REMAINING_OFFERS_COUNT_TRACE = eINSTANCE.getTracedForkedToken_RemainingOffersCountTrace();

		/**
		 * The meta object literal for the '<em><b>Base Token Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_FORKED_TOKEN__BASE_TOKEN_TRACE = eINSTANCE.getTracedForkedToken_BaseTokenTrace();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedIntegerVariableImpl <em>Traced Integer Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Traced.activitydiagram.impl.TracedIntegerVariableImpl
		 * @see activitydiagramTrace.Traced.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedIntegerVariable()
		 * @generated
		 */
		EClass TRACED_INTEGER_VARIABLE = eINSTANCE.getTracedIntegerVariable();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_INTEGER_VARIABLE__ORIGINAL_OBJECT = eINSTANCE.getTracedIntegerVariable_OriginalObject();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedActivityNodeImpl <em>Traced Activity Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Traced.activitydiagram.impl.TracedActivityNodeImpl
		 * @see activitydiagramTrace.Traced.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedActivityNode()
		 * @generated
		 */
		EClass TRACED_ACTIVITY_NODE = eINSTANCE.getTracedActivityNode();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ACTIVITY_NODE__OUTGOING = eINSTANCE.getTracedActivityNode_Outgoing();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ACTIVITY_NODE__INCOMING = eINSTANCE.getTracedActivityNode_Incoming();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ACTIVITY_NODE__ACTIVITY = eINSTANCE.getTracedActivityNode_Activity();

		/**
		 * The meta object literal for the '<em><b>Held Tokens</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ACTIVITY_NODE__HELD_TOKENS = eINSTANCE.getTracedActivityNode_HeldTokens();

		/**
		 * The meta object literal for the '<em><b>Held Tokens Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ACTIVITY_NODE__HELD_TOKENS_TRACE = eINSTANCE.getTracedActivityNode_HeldTokensTrace();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedActivityImpl <em>Traced Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Traced.activitydiagram.impl.TracedActivityImpl
		 * @see activitydiagramTrace.Traced.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedActivity()
		 * @generated
		 */
		EClass TRACED_ACTIVITY = eINSTANCE.getTracedActivity();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ACTIVITY__NODES = eINSTANCE.getTracedActivity_Nodes();

		/**
		 * The meta object literal for the '<em><b>Edges</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ACTIVITY__EDGES = eINSTANCE.getTracedActivity_Edges();

		/**
		 * The meta object literal for the '<em><b>Locals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ACTIVITY__LOCALS = eINSTANCE.getTracedActivity_Locals();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ACTIVITY__INPUTS = eINSTANCE.getTracedActivity_Inputs();

		/**
		 * The meta object literal for the '<em><b>Trace</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ACTIVITY__TRACE = eINSTANCE.getTracedActivity_Trace();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ACTIVITY__ORIGINAL_OBJECT = eINSTANCE.getTracedActivity_OriginalObject();

		/**
		 * The meta object literal for the '<em><b>Trace Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ACTIVITY__TRACE_TRACE = eINSTANCE.getTracedActivity_TraceTrace();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedOpaqueActionImpl <em>Traced Opaque Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Traced.activitydiagram.impl.TracedOpaqueActionImpl
		 * @see activitydiagramTrace.Traced.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedOpaqueAction()
		 * @generated
		 */
		EClass TRACED_OPAQUE_ACTION = eINSTANCE.getTracedOpaqueAction();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_OPAQUE_ACTION__EXPRESSIONS = eINSTANCE.getTracedOpaqueAction_Expressions();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_OPAQUE_ACTION__ORIGINAL_OBJECT = eINSTANCE.getTracedOpaqueAction_OriginalObject();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedFinalNodeImpl <em>Traced Final Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Traced.activitydiagram.impl.TracedFinalNodeImpl
		 * @see activitydiagramTrace.Traced.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedFinalNode()
		 * @generated
		 */
		EClass TRACED_FINAL_NODE = eINSTANCE.getTracedFinalNode();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedInitialNodeImpl <em>Traced Initial Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Traced.activitydiagram.impl.TracedInitialNodeImpl
		 * @see activitydiagramTrace.Traced.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedInitialNode()
		 * @generated
		 */
		EClass TRACED_INITIAL_NODE = eINSTANCE.getTracedInitialNode();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_INITIAL_NODE__ORIGINAL_OBJECT = eINSTANCE.getTracedInitialNode_OriginalObject();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedMergeNodeImpl <em>Traced Merge Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Traced.activitydiagram.impl.TracedMergeNodeImpl
		 * @see activitydiagramTrace.Traced.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedMergeNode()
		 * @generated
		 */
		EClass TRACED_MERGE_NODE = eINSTANCE.getTracedMergeNode();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_MERGE_NODE__ORIGINAL_OBJECT = eINSTANCE.getTracedMergeNode_OriginalObject();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedOfferImpl <em>Traced Offer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Traced.activitydiagram.impl.TracedOfferImpl
		 * @see activitydiagramTrace.Traced.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedOffer()
		 * @generated
		 */
		EClass TRACED_OFFER = eINSTANCE.getTracedOffer();

		/**
		 * The meta object literal for the '<em><b>Offered Tokens Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_OFFER__OFFERED_TOKENS_TRACE = eINSTANCE.getTracedOffer_OfferedTokensTrace();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedVariableImpl <em>Traced Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Traced.activitydiagram.impl.TracedVariableImpl
		 * @see activitydiagramTrace.Traced.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedVariable()
		 * @generated
		 */
		EClass TRACED_VARIABLE = eINSTANCE.getTracedVariable();

		/**
		 * The meta object literal for the '<em><b>Initial Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_VARIABLE__INITIAL_VALUE = eINSTANCE.getTracedVariable_InitialValue();

		/**
		 * The meta object literal for the '<em><b>Current Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_VARIABLE__CURRENT_VALUE = eINSTANCE.getTracedVariable_CurrentValue();

		/**
		 * The meta object literal for the '<em><b>Current Value Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_VARIABLE__CURRENT_VALUE_TRACE = eINSTANCE.getTracedVariable_CurrentValueTrace();

	}

} //ActivitydiagramPackage
