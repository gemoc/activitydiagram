/**
 */
package activitydiagramTrace.States.activitydiagram;

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
 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory
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
	ActivitydiagramPackage eINSTANCE = activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl.init();

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedNamedElementImpl <em>Traced Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedNamedElementImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedNamedElement()
	 * @generated
	 */
	int TRACED_NAMED_ELEMENT = 20;

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
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedActivityNodeImpl <em>Traced Activity Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedActivityNodeImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedActivityNode()
	 * @generated
	 */
	int TRACED_ACTIVITY_NODE = 4;

	/**
	 * The feature id for the '<em><b>Held Tokens Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_NODE__HELD_TOKENS_SEQUENCE = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Original Object Activity Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_NODE__ORIGINAL_OBJECT_ACTIVITY_NODE = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Traced Activity Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_NODE_FEATURE_COUNT = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Traced Activity Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_NODE_OPERATION_COUNT = TRACED_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedExecutableNodeImpl <em>Traced Executable Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedExecutableNodeImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedExecutableNode()
	 * @generated
	 */
	int TRACED_EXECUTABLE_NODE = 10;

	/**
	 * The feature id for the '<em><b>Held Tokens Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXECUTABLE_NODE__HELD_TOKENS_SEQUENCE = TRACED_ACTIVITY_NODE__HELD_TOKENS_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXECUTABLE_NODE__ORIGINAL_OBJECT_ACTIVITY_NODE = TRACED_ACTIVITY_NODE__ORIGINAL_OBJECT_ACTIVITY_NODE;

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
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedActionImpl <em>Traced Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedActionImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedAction()
	 * @generated
	 */
	int TRACED_ACTION = 0;

	/**
	 * The feature id for the '<em><b>Held Tokens Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTION__HELD_TOKENS_SEQUENCE = TRACED_EXECUTABLE_NODE__HELD_TOKENS_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTION__ORIGINAL_OBJECT_ACTIVITY_NODE = TRACED_EXECUTABLE_NODE__ORIGINAL_OBJECT_ACTIVITY_NODE;

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
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedActivityImpl <em>Traced Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedActivityImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedActivity()
	 * @generated
	 */
	int TRACED_ACTIVITY = 1;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY__ORIGINAL_OBJECT = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Trace Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY__TRACE_SEQUENCE = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Traced Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_FEATURE_COUNT = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Traced Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_OPERATION_COUNT = TRACED_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedActivityEdgeImpl <em>Traced Activity Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedActivityEdgeImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedActivityEdge()
	 * @generated
	 */
	int TRACED_ACTIVITY_EDGE = 2;

	/**
	 * The feature id for the '<em><b>Offers Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_EDGE__OFFERS_SEQUENCE = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Activity Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_EDGE_FEATURE_COUNT = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Traced Activity Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_EDGE_OPERATION_COUNT = TRACED_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedControlNodeImpl <em>Traced Control Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedControlNodeImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedControlNode()
	 * @generated
	 */
	int TRACED_CONTROL_NODE = 7;

	/**
	 * The feature id for the '<em><b>Held Tokens Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONTROL_NODE__HELD_TOKENS_SEQUENCE = TRACED_ACTIVITY_NODE__HELD_TOKENS_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONTROL_NODE__ORIGINAL_OBJECT_ACTIVITY_NODE = TRACED_ACTIVITY_NODE__ORIGINAL_OBJECT_ACTIVITY_NODE;

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
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedFinalNodeImpl <em>Traced Final Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedFinalNodeImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedFinalNode()
	 * @generated
	 */
	int TRACED_FINAL_NODE = 11;

	/**
	 * The feature id for the '<em><b>Held Tokens Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FINAL_NODE__HELD_TOKENS_SEQUENCE = TRACED_CONTROL_NODE__HELD_TOKENS_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FINAL_NODE__ORIGINAL_OBJECT_ACTIVITY_NODE = TRACED_CONTROL_NODE__ORIGINAL_OBJECT_ACTIVITY_NODE;

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
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedActivityFinalNodeImpl <em>Traced Activity Final Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedActivityFinalNodeImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedActivityFinalNode()
	 * @generated
	 */
	int TRACED_ACTIVITY_FINAL_NODE = 3;

	/**
	 * The feature id for the '<em><b>Held Tokens Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_FINAL_NODE__HELD_TOKENS_SEQUENCE = TRACED_FINAL_NODE__HELD_TOKENS_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_FINAL_NODE__ORIGINAL_OBJECT_ACTIVITY_NODE = TRACED_FINAL_NODE__ORIGINAL_OBJECT_ACTIVITY_NODE;

	/**
	 * The number of structural features of the '<em>Traced Activity Final Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_FINAL_NODE_FEATURE_COUNT = TRACED_FINAL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Activity Final Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_FINAL_NODE_OPERATION_COUNT = TRACED_FINAL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedVariableImpl <em>Traced Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedVariableImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedVariable()
	 * @generated
	 */
	int TRACED_VARIABLE = 25;

	/**
	 * The feature id for the '<em><b>Current Value Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VARIABLE__CURRENT_VALUE_SEQUENCE = 0;

	/**
	 * The feature id for the '<em><b>Original Object Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VARIABLE__ORIGINAL_OBJECT_VARIABLE = 1;

	/**
	 * The number of structural features of the '<em>Traced Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VARIABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Traced Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedBooleanVariableImpl <em>Traced Boolean Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedBooleanVariableImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedBooleanVariable()
	 * @generated
	 */
	int TRACED_BOOLEAN_VARIABLE = 5;

	/**
	 * The feature id for the '<em><b>Current Value Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_VARIABLE__CURRENT_VALUE_SEQUENCE = TRACED_VARIABLE__CURRENT_VALUE_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_VARIABLE__ORIGINAL_OBJECT_VARIABLE = TRACED_VARIABLE__ORIGINAL_OBJECT_VARIABLE;

	/**
	 * The number of structural features of the '<em>Traced Boolean Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_VARIABLE_FEATURE_COUNT = TRACED_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Boolean Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_VARIABLE_OPERATION_COUNT = TRACED_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedControlFlowImpl <em>Traced Control Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedControlFlowImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedControlFlow()
	 * @generated
	 */
	int TRACED_CONTROL_FLOW = 6;

	/**
	 * The feature id for the '<em><b>Offers Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONTROL_FLOW__OFFERS_SEQUENCE = TRACED_ACTIVITY_EDGE__OFFERS_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONTROL_FLOW__ORIGINAL_OBJECT = TRACED_ACTIVITY_EDGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Control Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONTROL_FLOW_FEATURE_COUNT = TRACED_ACTIVITY_EDGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Traced Control Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONTROL_FLOW_OPERATION_COUNT = TRACED_ACTIVITY_EDGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedTokenImpl <em>Traced Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedTokenImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedToken()
	 * @generated
	 */
	int TRACED_TOKEN = 23;

	/**
	 * The number of structural features of the '<em>Traced Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TOKEN_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Traced Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TOKEN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedControlTokenImpl <em>Traced Control Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedControlTokenImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedControlToken()
	 * @generated
	 */
	int TRACED_CONTROL_TOKEN = 8;

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
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedDecisionNodeImpl <em>Traced Decision Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedDecisionNodeImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedDecisionNode()
	 * @generated
	 */
	int TRACED_DECISION_NODE = 9;

	/**
	 * The feature id for the '<em><b>Held Tokens Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DECISION_NODE__HELD_TOKENS_SEQUENCE = TRACED_CONTROL_NODE__HELD_TOKENS_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DECISION_NODE__ORIGINAL_OBJECT_ACTIVITY_NODE = TRACED_CONTROL_NODE__ORIGINAL_OBJECT_ACTIVITY_NODE;

	/**
	 * The number of structural features of the '<em>Traced Decision Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DECISION_NODE_FEATURE_COUNT = TRACED_CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Decision Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DECISION_NODE_OPERATION_COUNT = TRACED_CONTROL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedForkNodeImpl <em>Traced Fork Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedForkNodeImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedForkNode()
	 * @generated
	 */
	int TRACED_FORK_NODE = 12;

	/**
	 * The feature id for the '<em><b>Held Tokens Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FORK_NODE__HELD_TOKENS_SEQUENCE = TRACED_CONTROL_NODE__HELD_TOKENS_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FORK_NODE__ORIGINAL_OBJECT_ACTIVITY_NODE = TRACED_CONTROL_NODE__ORIGINAL_OBJECT_ACTIVITY_NODE;

	/**
	 * The number of structural features of the '<em>Traced Fork Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FORK_NODE_FEATURE_COUNT = TRACED_CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Fork Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FORK_NODE_OPERATION_COUNT = TRACED_CONTROL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedForkedTokenImpl <em>Traced Forked Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedForkedTokenImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedForkedToken()
	 * @generated
	 */
	int TRACED_FORKED_TOKEN = 13;

	/**
	 * The feature id for the '<em><b>Base Token Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FORKED_TOKEN__BASE_TOKEN_SEQUENCE = TRACED_TOKEN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Remaining Offers Count Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FORKED_TOKEN__REMAINING_OFFERS_COUNT_SEQUENCE = TRACED_TOKEN_FEATURE_COUNT + 1;

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
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedInitialNodeImpl <em>Traced Initial Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedInitialNodeImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedInitialNode()
	 * @generated
	 */
	int TRACED_INITIAL_NODE = 14;

	/**
	 * The feature id for the '<em><b>Held Tokens Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INITIAL_NODE__HELD_TOKENS_SEQUENCE = TRACED_CONTROL_NODE__HELD_TOKENS_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INITIAL_NODE__ORIGINAL_OBJECT_ACTIVITY_NODE = TRACED_CONTROL_NODE__ORIGINAL_OBJECT_ACTIVITY_NODE;

	/**
	 * The number of structural features of the '<em>Traced Initial Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INITIAL_NODE_FEATURE_COUNT = TRACED_CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Initial Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INITIAL_NODE_OPERATION_COUNT = TRACED_CONTROL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedInputImpl <em>Traced Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedInputImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedInput()
	 * @generated
	 */
	int TRACED_INPUT = 15;

	/**
	 * The feature id for the '<em><b>Input Values Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INPUT__INPUT_VALUES_SEQUENCE = 0;

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
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedInputValueImpl <em>Traced Input Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedInputValueImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedInputValue()
	 * @generated
	 */
	int TRACED_INPUT_VALUE = 16;

	/**
	 * The feature id for the '<em><b>Value Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INPUT_VALUE__VALUE_SEQUENCE = 0;

	/**
	 * The feature id for the '<em><b>Variable Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INPUT_VALUE__VARIABLE_SEQUENCE = 1;

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
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedIntegerVariableImpl <em>Traced Integer Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedIntegerVariableImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedIntegerVariable()
	 * @generated
	 */
	int TRACED_INTEGER_VARIABLE = 17;

	/**
	 * The feature id for the '<em><b>Current Value Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_VARIABLE__CURRENT_VALUE_SEQUENCE = TRACED_VARIABLE__CURRENT_VALUE_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_VARIABLE__ORIGINAL_OBJECT_VARIABLE = TRACED_VARIABLE__ORIGINAL_OBJECT_VARIABLE;

	/**
	 * The number of structural features of the '<em>Traced Integer Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_VARIABLE_FEATURE_COUNT = TRACED_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Integer Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_VARIABLE_OPERATION_COUNT = TRACED_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedJoinNodeImpl <em>Traced Join Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedJoinNodeImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedJoinNode()
	 * @generated
	 */
	int TRACED_JOIN_NODE = 18;

	/**
	 * The feature id for the '<em><b>Held Tokens Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_JOIN_NODE__HELD_TOKENS_SEQUENCE = TRACED_CONTROL_NODE__HELD_TOKENS_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_JOIN_NODE__ORIGINAL_OBJECT_ACTIVITY_NODE = TRACED_CONTROL_NODE__ORIGINAL_OBJECT_ACTIVITY_NODE;

	/**
	 * The number of structural features of the '<em>Traced Join Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_JOIN_NODE_FEATURE_COUNT = TRACED_CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Join Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_JOIN_NODE_OPERATION_COUNT = TRACED_CONTROL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedMergeNodeImpl <em>Traced Merge Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedMergeNodeImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedMergeNode()
	 * @generated
	 */
	int TRACED_MERGE_NODE = 19;

	/**
	 * The feature id for the '<em><b>Held Tokens Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MERGE_NODE__HELD_TOKENS_SEQUENCE = TRACED_CONTROL_NODE__HELD_TOKENS_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MERGE_NODE__ORIGINAL_OBJECT_ACTIVITY_NODE = TRACED_CONTROL_NODE__ORIGINAL_OBJECT_ACTIVITY_NODE;

	/**
	 * The number of structural features of the '<em>Traced Merge Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MERGE_NODE_FEATURE_COUNT = TRACED_CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Merge Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MERGE_NODE_OPERATION_COUNT = TRACED_CONTROL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedOfferImpl <em>Traced Offer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedOfferImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedOffer()
	 * @generated
	 */
	int TRACED_OFFER = 21;

	/**
	 * The feature id for the '<em><b>Offered Tokens Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OFFER__OFFERED_TOKENS_SEQUENCE = 0;

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
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedOpaqueActionImpl <em>Traced Opaque Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedOpaqueActionImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedOpaqueAction()
	 * @generated
	 */
	int TRACED_OPAQUE_ACTION = 22;

	/**
	 * The feature id for the '<em><b>Held Tokens Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPAQUE_ACTION__HELD_TOKENS_SEQUENCE = TRACED_ACTION__HELD_TOKENS_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object Activity Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPAQUE_ACTION__ORIGINAL_OBJECT_ACTIVITY_NODE = TRACED_ACTION__ORIGINAL_OBJECT_ACTIVITY_NODE;

	/**
	 * The number of structural features of the '<em>Traced Opaque Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPAQUE_ACTION_FEATURE_COUNT = TRACED_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Opaque Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPAQUE_ACTION_OPERATION_COUNT = TRACED_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedTraceImpl <em>Traced Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedTraceImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedTrace()
	 * @generated
	 */
	int TRACED_TRACE = 24;

	/**
	 * The feature id for the '<em><b>Executed Nodes Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TRACE__EXECUTED_NODES_SEQUENCE = 0;

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
	 * Returns the meta object for class '{@link activitydiagramTrace.States.activitydiagram.TracedAction <em>Traced Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Action</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedAction
	 * @generated
	 */
	EClass getTracedAction();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.activitydiagram.TracedActivity <em>Traced Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Activity</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedActivity
	 * @generated
	 */
	EClass getTracedActivity();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.States.activitydiagram.TracedActivity#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedActivity#getOriginalObject()
	 * @see #getTracedActivity()
	 * @generated
	 */
	EReference getTracedActivity_OriginalObject();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.States.activitydiagram.TracedActivity#getTraceSequence <em>Trace Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trace Sequence</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedActivity#getTraceSequence()
	 * @see #getTracedActivity()
	 * @generated
	 */
	EReference getTracedActivity_TraceSequence();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.activitydiagram.TracedActivityEdge <em>Traced Activity Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Activity Edge</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedActivityEdge
	 * @generated
	 */
	EClass getTracedActivityEdge();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.States.activitydiagram.TracedActivityEdge#getOffersSequence <em>Offers Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Offers Sequence</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedActivityEdge#getOffersSequence()
	 * @see #getTracedActivityEdge()
	 * @generated
	 */
	EReference getTracedActivityEdge_OffersSequence();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.activitydiagram.TracedActivityFinalNode <em>Traced Activity Final Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Activity Final Node</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedActivityFinalNode
	 * @generated
	 */
	EClass getTracedActivityFinalNode();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.activitydiagram.TracedActivityNode <em>Traced Activity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Activity Node</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedActivityNode
	 * @generated
	 */
	EClass getTracedActivityNode();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.States.activitydiagram.TracedActivityNode#getHeldTokensSequence <em>Held Tokens Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Held Tokens Sequence</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedActivityNode#getHeldTokensSequence()
	 * @see #getTracedActivityNode()
	 * @generated
	 */
	EReference getTracedActivityNode_HeldTokensSequence();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.States.activitydiagram.TracedActivityNode#getOriginalObject_ActivityNode <em>Original Object Activity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object Activity Node</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedActivityNode#getOriginalObject_ActivityNode()
	 * @see #getTracedActivityNode()
	 * @generated
	 */
	EReference getTracedActivityNode_OriginalObject_ActivityNode();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.activitydiagram.TracedBooleanVariable <em>Traced Boolean Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Boolean Variable</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedBooleanVariable
	 * @generated
	 */
	EClass getTracedBooleanVariable();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.activitydiagram.TracedControlFlow <em>Traced Control Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Control Flow</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedControlFlow
	 * @generated
	 */
	EClass getTracedControlFlow();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.States.activitydiagram.TracedControlFlow#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedControlFlow#getOriginalObject()
	 * @see #getTracedControlFlow()
	 * @generated
	 */
	EReference getTracedControlFlow_OriginalObject();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.activitydiagram.TracedControlNode <em>Traced Control Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Control Node</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedControlNode
	 * @generated
	 */
	EClass getTracedControlNode();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.activitydiagram.TracedControlToken <em>Traced Control Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Control Token</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedControlToken
	 * @generated
	 */
	EClass getTracedControlToken();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.activitydiagram.TracedDecisionNode <em>Traced Decision Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Decision Node</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedDecisionNode
	 * @generated
	 */
	EClass getTracedDecisionNode();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.activitydiagram.TracedExecutableNode <em>Traced Executable Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Executable Node</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedExecutableNode
	 * @generated
	 */
	EClass getTracedExecutableNode();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.activitydiagram.TracedFinalNode <em>Traced Final Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Final Node</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedFinalNode
	 * @generated
	 */
	EClass getTracedFinalNode();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.activitydiagram.TracedForkNode <em>Traced Fork Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Fork Node</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedForkNode
	 * @generated
	 */
	EClass getTracedForkNode();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.activitydiagram.TracedForkedToken <em>Traced Forked Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Forked Token</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedForkedToken
	 * @generated
	 */
	EClass getTracedForkedToken();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.States.activitydiagram.TracedForkedToken#getBaseTokenSequence <em>Base Token Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Base Token Sequence</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedForkedToken#getBaseTokenSequence()
	 * @see #getTracedForkedToken()
	 * @generated
	 */
	EReference getTracedForkedToken_BaseTokenSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.States.activitydiagram.TracedForkedToken#getRemainingOffersCountSequence <em>Remaining Offers Count Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Remaining Offers Count Sequence</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedForkedToken#getRemainingOffersCountSequence()
	 * @see #getTracedForkedToken()
	 * @generated
	 */
	EReference getTracedForkedToken_RemainingOffersCountSequence();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.activitydiagram.TracedInitialNode <em>Traced Initial Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Initial Node</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedInitialNode
	 * @generated
	 */
	EClass getTracedInitialNode();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.activitydiagram.TracedInput <em>Traced Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Input</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedInput
	 * @generated
	 */
	EClass getTracedInput();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.States.activitydiagram.TracedInput#getInputValuesSequence <em>Input Values Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Values Sequence</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedInput#getInputValuesSequence()
	 * @see #getTracedInput()
	 * @generated
	 */
	EReference getTracedInput_InputValuesSequence();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.activitydiagram.TracedInputValue <em>Traced Input Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Input Value</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedInputValue
	 * @generated
	 */
	EClass getTracedInputValue();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.States.activitydiagram.TracedInputValue#getValueSequence <em>Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value Sequence</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedInputValue#getValueSequence()
	 * @see #getTracedInputValue()
	 * @generated
	 */
	EReference getTracedInputValue_ValueSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.States.activitydiagram.TracedInputValue#getVariableSequence <em>Variable Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable Sequence</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedInputValue#getVariableSequence()
	 * @see #getTracedInputValue()
	 * @generated
	 */
	EReference getTracedInputValue_VariableSequence();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.activitydiagram.TracedIntegerVariable <em>Traced Integer Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Integer Variable</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedIntegerVariable
	 * @generated
	 */
	EClass getTracedIntegerVariable();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.activitydiagram.TracedJoinNode <em>Traced Join Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Join Node</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedJoinNode
	 * @generated
	 */
	EClass getTracedJoinNode();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.activitydiagram.TracedMergeNode <em>Traced Merge Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Merge Node</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedMergeNode
	 * @generated
	 */
	EClass getTracedMergeNode();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.activitydiagram.TracedNamedElement <em>Traced Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Named Element</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedNamedElement
	 * @generated
	 */
	EClass getTracedNamedElement();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.activitydiagram.TracedOffer <em>Traced Offer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Offer</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedOffer
	 * @generated
	 */
	EClass getTracedOffer();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.States.activitydiagram.TracedOffer#getOfferedTokensSequence <em>Offered Tokens Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Offered Tokens Sequence</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedOffer#getOfferedTokensSequence()
	 * @see #getTracedOffer()
	 * @generated
	 */
	EReference getTracedOffer_OfferedTokensSequence();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.activitydiagram.TracedOpaqueAction <em>Traced Opaque Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Opaque Action</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedOpaqueAction
	 * @generated
	 */
	EClass getTracedOpaqueAction();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.activitydiagram.TracedToken <em>Traced Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Token</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedToken
	 * @generated
	 */
	EClass getTracedToken();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.activitydiagram.TracedTrace <em>Traced Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Trace</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedTrace
	 * @generated
	 */
	EClass getTracedTrace();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.States.activitydiagram.TracedTrace#getExecutedNodesSequence <em>Executed Nodes Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Executed Nodes Sequence</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedTrace#getExecutedNodesSequence()
	 * @see #getTracedTrace()
	 * @generated
	 */
	EReference getTracedTrace_ExecutedNodesSequence();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.activitydiagram.TracedVariable <em>Traced Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Variable</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedVariable
	 * @generated
	 */
	EClass getTracedVariable();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.States.activitydiagram.TracedVariable#getCurrentValueSequence <em>Current Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Current Value Sequence</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedVariable#getCurrentValueSequence()
	 * @see #getTracedVariable()
	 * @generated
	 */
	EReference getTracedVariable_CurrentValueSequence();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.States.activitydiagram.TracedVariable#getOriginalObject_Variable <em>Original Object Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object Variable</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedVariable#getOriginalObject_Variable()
	 * @see #getTracedVariable()
	 * @generated
	 */
	EReference getTracedVariable_OriginalObject_Variable();

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
		 * The meta object literal for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedActionImpl <em>Traced Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.activitydiagram.impl.TracedActionImpl
		 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedAction()
		 * @generated
		 */
		EClass TRACED_ACTION = eINSTANCE.getTracedAction();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedActivityImpl <em>Traced Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.activitydiagram.impl.TracedActivityImpl
		 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedActivity()
		 * @generated
		 */
		EClass TRACED_ACTIVITY = eINSTANCE.getTracedActivity();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ACTIVITY__ORIGINAL_OBJECT = eINSTANCE.getTracedActivity_OriginalObject();

		/**
		 * The meta object literal for the '<em><b>Trace Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ACTIVITY__TRACE_SEQUENCE = eINSTANCE.getTracedActivity_TraceSequence();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedActivityEdgeImpl <em>Traced Activity Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.activitydiagram.impl.TracedActivityEdgeImpl
		 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedActivityEdge()
		 * @generated
		 */
		EClass TRACED_ACTIVITY_EDGE = eINSTANCE.getTracedActivityEdge();

		/**
		 * The meta object literal for the '<em><b>Offers Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ACTIVITY_EDGE__OFFERS_SEQUENCE = eINSTANCE.getTracedActivityEdge_OffersSequence();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedActivityFinalNodeImpl <em>Traced Activity Final Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.activitydiagram.impl.TracedActivityFinalNodeImpl
		 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedActivityFinalNode()
		 * @generated
		 */
		EClass TRACED_ACTIVITY_FINAL_NODE = eINSTANCE.getTracedActivityFinalNode();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedActivityNodeImpl <em>Traced Activity Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.activitydiagram.impl.TracedActivityNodeImpl
		 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedActivityNode()
		 * @generated
		 */
		EClass TRACED_ACTIVITY_NODE = eINSTANCE.getTracedActivityNode();

		/**
		 * The meta object literal for the '<em><b>Held Tokens Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ACTIVITY_NODE__HELD_TOKENS_SEQUENCE = eINSTANCE.getTracedActivityNode_HeldTokensSequence();

		/**
		 * The meta object literal for the '<em><b>Original Object Activity Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ACTIVITY_NODE__ORIGINAL_OBJECT_ACTIVITY_NODE = eINSTANCE.getTracedActivityNode_OriginalObject_ActivityNode();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedBooleanVariableImpl <em>Traced Boolean Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.activitydiagram.impl.TracedBooleanVariableImpl
		 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedBooleanVariable()
		 * @generated
		 */
		EClass TRACED_BOOLEAN_VARIABLE = eINSTANCE.getTracedBooleanVariable();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedControlFlowImpl <em>Traced Control Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.activitydiagram.impl.TracedControlFlowImpl
		 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedControlFlow()
		 * @generated
		 */
		EClass TRACED_CONTROL_FLOW = eINSTANCE.getTracedControlFlow();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_CONTROL_FLOW__ORIGINAL_OBJECT = eINSTANCE.getTracedControlFlow_OriginalObject();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedControlNodeImpl <em>Traced Control Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.activitydiagram.impl.TracedControlNodeImpl
		 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedControlNode()
		 * @generated
		 */
		EClass TRACED_CONTROL_NODE = eINSTANCE.getTracedControlNode();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedControlTokenImpl <em>Traced Control Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.activitydiagram.impl.TracedControlTokenImpl
		 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedControlToken()
		 * @generated
		 */
		EClass TRACED_CONTROL_TOKEN = eINSTANCE.getTracedControlToken();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedDecisionNodeImpl <em>Traced Decision Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.activitydiagram.impl.TracedDecisionNodeImpl
		 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedDecisionNode()
		 * @generated
		 */
		EClass TRACED_DECISION_NODE = eINSTANCE.getTracedDecisionNode();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedExecutableNodeImpl <em>Traced Executable Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.activitydiagram.impl.TracedExecutableNodeImpl
		 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedExecutableNode()
		 * @generated
		 */
		EClass TRACED_EXECUTABLE_NODE = eINSTANCE.getTracedExecutableNode();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedFinalNodeImpl <em>Traced Final Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.activitydiagram.impl.TracedFinalNodeImpl
		 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedFinalNode()
		 * @generated
		 */
		EClass TRACED_FINAL_NODE = eINSTANCE.getTracedFinalNode();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedForkNodeImpl <em>Traced Fork Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.activitydiagram.impl.TracedForkNodeImpl
		 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedForkNode()
		 * @generated
		 */
		EClass TRACED_FORK_NODE = eINSTANCE.getTracedForkNode();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedForkedTokenImpl <em>Traced Forked Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.activitydiagram.impl.TracedForkedTokenImpl
		 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedForkedToken()
		 * @generated
		 */
		EClass TRACED_FORKED_TOKEN = eINSTANCE.getTracedForkedToken();

		/**
		 * The meta object literal for the '<em><b>Base Token Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_FORKED_TOKEN__BASE_TOKEN_SEQUENCE = eINSTANCE.getTracedForkedToken_BaseTokenSequence();

		/**
		 * The meta object literal for the '<em><b>Remaining Offers Count Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_FORKED_TOKEN__REMAINING_OFFERS_COUNT_SEQUENCE = eINSTANCE.getTracedForkedToken_RemainingOffersCountSequence();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedInitialNodeImpl <em>Traced Initial Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.activitydiagram.impl.TracedInitialNodeImpl
		 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedInitialNode()
		 * @generated
		 */
		EClass TRACED_INITIAL_NODE = eINSTANCE.getTracedInitialNode();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedInputImpl <em>Traced Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.activitydiagram.impl.TracedInputImpl
		 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedInput()
		 * @generated
		 */
		EClass TRACED_INPUT = eINSTANCE.getTracedInput();

		/**
		 * The meta object literal for the '<em><b>Input Values Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_INPUT__INPUT_VALUES_SEQUENCE = eINSTANCE.getTracedInput_InputValuesSequence();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedInputValueImpl <em>Traced Input Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.activitydiagram.impl.TracedInputValueImpl
		 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedInputValue()
		 * @generated
		 */
		EClass TRACED_INPUT_VALUE = eINSTANCE.getTracedInputValue();

		/**
		 * The meta object literal for the '<em><b>Value Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_INPUT_VALUE__VALUE_SEQUENCE = eINSTANCE.getTracedInputValue_ValueSequence();

		/**
		 * The meta object literal for the '<em><b>Variable Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_INPUT_VALUE__VARIABLE_SEQUENCE = eINSTANCE.getTracedInputValue_VariableSequence();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedIntegerVariableImpl <em>Traced Integer Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.activitydiagram.impl.TracedIntegerVariableImpl
		 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedIntegerVariable()
		 * @generated
		 */
		EClass TRACED_INTEGER_VARIABLE = eINSTANCE.getTracedIntegerVariable();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedJoinNodeImpl <em>Traced Join Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.activitydiagram.impl.TracedJoinNodeImpl
		 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedJoinNode()
		 * @generated
		 */
		EClass TRACED_JOIN_NODE = eINSTANCE.getTracedJoinNode();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedMergeNodeImpl <em>Traced Merge Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.activitydiagram.impl.TracedMergeNodeImpl
		 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedMergeNode()
		 * @generated
		 */
		EClass TRACED_MERGE_NODE = eINSTANCE.getTracedMergeNode();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedNamedElementImpl <em>Traced Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.activitydiagram.impl.TracedNamedElementImpl
		 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedNamedElement()
		 * @generated
		 */
		EClass TRACED_NAMED_ELEMENT = eINSTANCE.getTracedNamedElement();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedOfferImpl <em>Traced Offer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.activitydiagram.impl.TracedOfferImpl
		 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedOffer()
		 * @generated
		 */
		EClass TRACED_OFFER = eINSTANCE.getTracedOffer();

		/**
		 * The meta object literal for the '<em><b>Offered Tokens Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_OFFER__OFFERED_TOKENS_SEQUENCE = eINSTANCE.getTracedOffer_OfferedTokensSequence();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedOpaqueActionImpl <em>Traced Opaque Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.activitydiagram.impl.TracedOpaqueActionImpl
		 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedOpaqueAction()
		 * @generated
		 */
		EClass TRACED_OPAQUE_ACTION = eINSTANCE.getTracedOpaqueAction();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedTokenImpl <em>Traced Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.activitydiagram.impl.TracedTokenImpl
		 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedToken()
		 * @generated
		 */
		EClass TRACED_TOKEN = eINSTANCE.getTracedToken();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedTraceImpl <em>Traced Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.activitydiagram.impl.TracedTraceImpl
		 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedTrace()
		 * @generated
		 */
		EClass TRACED_TRACE = eINSTANCE.getTracedTrace();

		/**
		 * The meta object literal for the '<em><b>Executed Nodes Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_TRACE__EXECUTED_NODES_SEQUENCE = eINSTANCE.getTracedTrace_ExecutedNodesSequence();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedVariableImpl <em>Traced Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.activitydiagram.impl.TracedVariableImpl
		 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedVariable()
		 * @generated
		 */
		EClass TRACED_VARIABLE = eINSTANCE.getTracedVariable();

		/**
		 * The meta object literal for the '<em><b>Current Value Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_VARIABLE__CURRENT_VALUE_SEQUENCE = eINSTANCE.getTracedVariable_CurrentValueSequence();

		/**
		 * The meta object literal for the '<em><b>Original Object Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_VARIABLE__ORIGINAL_OBJECT_VARIABLE = eINSTANCE.getTracedVariable_OriginalObject_Variable();

	}

} //ActivitydiagramPackage
