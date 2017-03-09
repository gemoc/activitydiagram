/**
 */
package activitydiagramTrace.States.activitydiagram;

import activitydiagramTrace.States.StatesPackage;

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
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_NAMED_ELEMENT__DIMENSIONS = StatesPackage.SPECIFIC_TRACED_OBJECT__DIMENSIONS;

	/**
	 * The number of structural features of the '<em>Traced Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_NAMED_ELEMENT_FEATURE_COUNT = StatesPackage.SPECIFIC_TRACED_OBJECT_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_NODE__DIMENSIONS = TRACED_NAMED_ELEMENT__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Activity Node held Tokens Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_NODE__ACTIVITY_NODE_HELD_TOKENS_DIMENSION = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 0;

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
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedExecutableNodeImpl <em>Traced Executable Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedExecutableNodeImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedExecutableNode()
	 * @generated
	 */
	int TRACED_EXECUTABLE_NODE = 11;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXECUTABLE_NODE__DIMENSIONS = TRACED_ACTIVITY_NODE__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Activity Node held Tokens Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXECUTABLE_NODE__ACTIVITY_NODE_HELD_TOKENS_DIMENSION = TRACED_ACTIVITY_NODE__ACTIVITY_NODE_HELD_TOKENS_DIMENSION;

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
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedActionImpl <em>Traced Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedActionImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedAction()
	 * @generated
	 */
	int TRACED_ACTION = 0;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTION__DIMENSIONS = TRACED_EXECUTABLE_NODE__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Activity Node held Tokens Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTION__ACTIVITY_NODE_HELD_TOKENS_DIMENSION = TRACED_EXECUTABLE_NODE__ACTIVITY_NODE_HELD_TOKENS_DIMENSION;

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
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedActivityImpl <em>Traced Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedActivityImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedActivity()
	 * @generated
	 */
	int TRACED_ACTIVITY = 1;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY__DIMENSIONS = TRACED_NAMED_ELEMENT__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Activity trace Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY__ACTIVITY_TRACE_DIMENSION = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY__ORIGINAL_OBJECT = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Traced Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_FEATURE_COUNT = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 2;

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
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_EDGE__DIMENSIONS = TRACED_NAMED_ELEMENT__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Activity Edge offers Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_EDGE__ACTIVITY_EDGE_OFFERS_DIMENSION = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Activity Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_EDGE_FEATURE_COUNT = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedControlNodeImpl <em>Traced Control Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedControlNodeImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedControlNode()
	 * @generated
	 */
	int TRACED_CONTROL_NODE = 6;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONTROL_NODE__DIMENSIONS = TRACED_ACTIVITY_NODE__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Activity Node held Tokens Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONTROL_NODE__ACTIVITY_NODE_HELD_TOKENS_DIMENSION = TRACED_ACTIVITY_NODE__ACTIVITY_NODE_HELD_TOKENS_DIMENSION;

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
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedFinalNodeImpl <em>Traced Final Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedFinalNodeImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedFinalNode()
	 * @generated
	 */
	int TRACED_FINAL_NODE = 12;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FINAL_NODE__DIMENSIONS = TRACED_CONTROL_NODE__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Activity Node held Tokens Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FINAL_NODE__ACTIVITY_NODE_HELD_TOKENS_DIMENSION = TRACED_CONTROL_NODE__ACTIVITY_NODE_HELD_TOKENS_DIMENSION;

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
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedActivityFinalNodeImpl <em>Traced Activity Final Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedActivityFinalNodeImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedActivityFinalNode()
	 * @generated
	 */
	int TRACED_ACTIVITY_FINAL_NODE = 3;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_FINAL_NODE__DIMENSIONS = TRACED_FINAL_NODE__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Activity Node held Tokens Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_FINAL_NODE__ACTIVITY_NODE_HELD_TOKENS_DIMENSION = TRACED_FINAL_NODE__ACTIVITY_NODE_HELD_TOKENS_DIMENSION;

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
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedControlFlowImpl <em>Traced Control Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedControlFlowImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedControlFlow()
	 * @generated
	 */
	int TRACED_CONTROL_FLOW = 5;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONTROL_FLOW__DIMENSIONS = TRACED_ACTIVITY_EDGE__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Activity Edge offers Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONTROL_FLOW__ACTIVITY_EDGE_OFFERS_DIMENSION = TRACED_ACTIVITY_EDGE__ACTIVITY_EDGE_OFFERS_DIMENSION;

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
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedTokenImpl <em>Traced Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedTokenImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedToken()
	 * @generated
	 */
	int TRACED_TOKEN = 25;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TOKEN__DIMENSIONS = StatesPackage.SPECIFIC_TRACED_OBJECT__DIMENSIONS;

	/**
	 * The number of structural features of the '<em>Traced Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TOKEN_FEATURE_COUNT = StatesPackage.SPECIFIC_TRACED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedControlTokenImpl <em>Traced Control Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedControlTokenImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedControlToken()
	 * @generated
	 */
	int TRACED_CONTROL_TOKEN = 7;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONTROL_TOKEN__DIMENSIONS = TRACED_TOKEN__DIMENSIONS;

	/**
	 * The number of structural features of the '<em>Traced Control Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONTROL_TOKEN_FEATURE_COUNT = TRACED_TOKEN_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedDecisionNodeImpl <em>Traced Decision Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedDecisionNodeImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedDecisionNode()
	 * @generated
	 */
	int TRACED_DECISION_NODE = 8;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DECISION_NODE__DIMENSIONS = TRACED_CONTROL_NODE__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Activity Node held Tokens Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DECISION_NODE__ACTIVITY_NODE_HELD_TOKENS_DIMENSION = TRACED_CONTROL_NODE__ACTIVITY_NODE_HELD_TOKENS_DIMENSION;

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
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedValueImpl <em>Traced Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedValueImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedValue()
	 * @generated
	 */
	int TRACED_VALUE = 27;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VALUE__DIMENSIONS = StatesPackage.SPECIFIC_TRACED_OBJECT__DIMENSIONS;

	/**
	 * The number of structural features of the '<em>Traced Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VALUE_FEATURE_COUNT = StatesPackage.SPECIFIC_TRACED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedDynamicBooleanValueImpl <em>Traced Dynamic Boolean Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedDynamicBooleanValueImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedDynamicBooleanValue()
	 * @generated
	 */
	int TRACED_DYNAMIC_BOOLEAN_VALUE = 9;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DYNAMIC_BOOLEAN_VALUE__DIMENSIONS = TRACED_VALUE__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Dynamic Boolean Value value Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DYNAMIC_BOOLEAN_VALUE__DYNAMIC_BOOLEAN_VALUE_VALUE_DIMENSION = TRACED_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DYNAMIC_BOOLEAN_VALUE__ORIGINAL_OBJECT = TRACED_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Traced Dynamic Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DYNAMIC_BOOLEAN_VALUE_FEATURE_COUNT = TRACED_VALUE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedDynamicIntegerValueImpl <em>Traced Dynamic Integer Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedDynamicIntegerValueImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedDynamicIntegerValue()
	 * @generated
	 */
	int TRACED_DYNAMIC_INTEGER_VALUE = 10;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DYNAMIC_INTEGER_VALUE__DIMENSIONS = TRACED_VALUE__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Dynamic Integer Value value Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DYNAMIC_INTEGER_VALUE__DYNAMIC_INTEGER_VALUE_VALUE_DIMENSION = TRACED_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DYNAMIC_INTEGER_VALUE__ORIGINAL_OBJECT = TRACED_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Traced Dynamic Integer Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DYNAMIC_INTEGER_VALUE_FEATURE_COUNT = TRACED_VALUE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedForkNodeImpl <em>Traced Fork Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedForkNodeImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedForkNode()
	 * @generated
	 */
	int TRACED_FORK_NODE = 13;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FORK_NODE__DIMENSIONS = TRACED_CONTROL_NODE__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Activity Node held Tokens Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FORK_NODE__ACTIVITY_NODE_HELD_TOKENS_DIMENSION = TRACED_CONTROL_NODE__ACTIVITY_NODE_HELD_TOKENS_DIMENSION;

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
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedForkedTokenImpl <em>Traced Forked Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedForkedTokenImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedForkedToken()
	 * @generated
	 */
	int TRACED_FORKED_TOKEN = 14;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FORKED_TOKEN__DIMENSIONS = TRACED_TOKEN__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Forked Token base Token Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FORKED_TOKEN__FORKED_TOKEN_BASE_TOKEN_DIMENSION = TRACED_TOKEN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Forked Token remaining Offers Count Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FORKED_TOKEN__FORKED_TOKEN_REMAINING_OFFERS_COUNT_DIMENSION = TRACED_TOKEN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Traced Forked Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FORKED_TOKEN_FEATURE_COUNT = TRACED_TOKEN_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedInitialNodeImpl <em>Traced Initial Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedInitialNodeImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedInitialNode()
	 * @generated
	 */
	int TRACED_INITIAL_NODE = 15;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INITIAL_NODE__DIMENSIONS = TRACED_CONTROL_NODE__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Activity Node held Tokens Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INITIAL_NODE__ACTIVITY_NODE_HELD_TOKENS_DIMENSION = TRACED_CONTROL_NODE__ACTIVITY_NODE_HELD_TOKENS_DIMENSION;

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
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedInputImpl <em>Traced Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedInputImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedInput()
	 * @generated
	 */
	int TRACED_INPUT = 16;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INPUT__DIMENSIONS = StatesPackage.SPECIFIC_TRACED_OBJECT__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Input input Values Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INPUT__INPUT_INPUT_VALUES_DIMENSION = StatesPackage.SPECIFIC_TRACED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INPUT_FEATURE_COUNT = StatesPackage.SPECIFIC_TRACED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedInputValueImpl <em>Traced Input Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedInputValueImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedInputValue()
	 * @generated
	 */
	int TRACED_INPUT_VALUE = 17;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INPUT_VALUE__DIMENSIONS = StatesPackage.SPECIFIC_TRACED_OBJECT__DIMENSIONS;

	/**
	 * The number of structural features of the '<em>Traced Input Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INPUT_VALUE_FEATURE_COUNT = StatesPackage.SPECIFIC_TRACED_OBJECT_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_JOIN_NODE__DIMENSIONS = TRACED_CONTROL_NODE__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Activity Node held Tokens Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_JOIN_NODE__ACTIVITY_NODE_HELD_TOKENS_DIMENSION = TRACED_CONTROL_NODE__ACTIVITY_NODE_HELD_TOKENS_DIMENSION;

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
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedMergeNodeImpl <em>Traced Merge Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedMergeNodeImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedMergeNode()
	 * @generated
	 */
	int TRACED_MERGE_NODE = 19;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MERGE_NODE__DIMENSIONS = TRACED_CONTROL_NODE__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Activity Node held Tokens Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MERGE_NODE__ACTIVITY_NODE_HELD_TOKENS_DIMENSION = TRACED_CONTROL_NODE__ACTIVITY_NODE_HELD_TOKENS_DIMENSION;

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
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedOfferImpl <em>Traced Offer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedOfferImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedOffer()
	 * @generated
	 */
	int TRACED_OFFER = 21;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OFFER__DIMENSIONS = StatesPackage.SPECIFIC_TRACED_OBJECT__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Offer offered Tokens Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OFFER__OFFER_OFFERED_TOKENS_DIMENSION = StatesPackage.SPECIFIC_TRACED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Offer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OFFER_FEATURE_COUNT = StatesPackage.SPECIFIC_TRACED_OBJECT_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPAQUE_ACTION__DIMENSIONS = TRACED_ACTION__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Activity Node held Tokens Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPAQUE_ACTION__ACTIVITY_NODE_HELD_TOKENS_DIMENSION = TRACED_ACTION__ACTIVITY_NODE_HELD_TOKENS_DIMENSION;

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
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedStaticBooleanValueImpl <em>Traced Static Boolean Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedStaticBooleanValueImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedStaticBooleanValue()
	 * @generated
	 */
	int TRACED_STATIC_BOOLEAN_VALUE = 23;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STATIC_BOOLEAN_VALUE__DIMENSIONS = TRACED_VALUE__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STATIC_BOOLEAN_VALUE__ORIGINAL_OBJECT = TRACED_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Static Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STATIC_BOOLEAN_VALUE_FEATURE_COUNT = TRACED_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedStaticIntegerValueImpl <em>Traced Static Integer Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedStaticIntegerValueImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedStaticIntegerValue()
	 * @generated
	 */
	int TRACED_STATIC_INTEGER_VALUE = 24;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STATIC_INTEGER_VALUE__DIMENSIONS = TRACED_VALUE__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STATIC_INTEGER_VALUE__ORIGINAL_OBJECT = TRACED_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Static Integer Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STATIC_INTEGER_VALUE_FEATURE_COUNT = TRACED_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedTraceImpl <em>Traced Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedTraceImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedTrace()
	 * @generated
	 */
	int TRACED_TRACE = 26;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TRACE__DIMENSIONS = StatesPackage.SPECIFIC_TRACED_OBJECT__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Trace executed Nodes Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TRACE__TRACE_EXECUTED_NODES_DIMENSION = StatesPackage.SPECIFIC_TRACED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TRACE_FEATURE_COUNT = StatesPackage.SPECIFIC_TRACED_OBJECT_FEATURE_COUNT + 1;


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
	 * Returns the meta object for the containment reference '{@link activitydiagramTrace.States.activitydiagram.TracedActivity#getActivity_trace_Dimension <em>Activity trace Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activity trace Dimension</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedActivity#getActivity_trace_Dimension()
	 * @see #getTracedActivity()
	 * @generated
	 */
	EReference getTracedActivity_Activity_trace_Dimension();

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
	 * Returns the meta object for class '{@link activitydiagramTrace.States.activitydiagram.TracedActivityEdge <em>Traced Activity Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Activity Edge</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedActivityEdge
	 * @generated
	 */
	EClass getTracedActivityEdge();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagramTrace.States.activitydiagram.TracedActivityEdge#getActivityEdge_offers_Dimension <em>Activity Edge offers Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activity Edge offers Dimension</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedActivityEdge#getActivityEdge_offers_Dimension()
	 * @see #getTracedActivityEdge()
	 * @generated
	 */
	EReference getTracedActivityEdge_ActivityEdge_offers_Dimension();

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
	 * Returns the meta object for the containment reference '{@link activitydiagramTrace.States.activitydiagram.TracedActivityNode#getActivityNode_heldTokens_Dimension <em>Activity Node held Tokens Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activity Node held Tokens Dimension</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedActivityNode#getActivityNode_heldTokens_Dimension()
	 * @see #getTracedActivityNode()
	 * @generated
	 */
	EReference getTracedActivityNode_ActivityNode_heldTokens_Dimension();

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
	 * Returns the meta object for class '{@link activitydiagramTrace.States.activitydiagram.TracedDynamicBooleanValue <em>Traced Dynamic Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Dynamic Boolean Value</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedDynamicBooleanValue
	 * @generated
	 */
	EClass getTracedDynamicBooleanValue();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagramTrace.States.activitydiagram.TracedDynamicBooleanValue#getDynamicBooleanValue_value_Dimension <em>Dynamic Boolean Value value Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dynamic Boolean Value value Dimension</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedDynamicBooleanValue#getDynamicBooleanValue_value_Dimension()
	 * @see #getTracedDynamicBooleanValue()
	 * @generated
	 */
	EReference getTracedDynamicBooleanValue_DynamicBooleanValue_value_Dimension();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.States.activitydiagram.TracedDynamicBooleanValue#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedDynamicBooleanValue#getOriginalObject()
	 * @see #getTracedDynamicBooleanValue()
	 * @generated
	 */
	EReference getTracedDynamicBooleanValue_OriginalObject();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.activitydiagram.TracedDynamicIntegerValue <em>Traced Dynamic Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Dynamic Integer Value</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedDynamicIntegerValue
	 * @generated
	 */
	EClass getTracedDynamicIntegerValue();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagramTrace.States.activitydiagram.TracedDynamicIntegerValue#getDynamicIntegerValue_value_Dimension <em>Dynamic Integer Value value Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dynamic Integer Value value Dimension</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedDynamicIntegerValue#getDynamicIntegerValue_value_Dimension()
	 * @see #getTracedDynamicIntegerValue()
	 * @generated
	 */
	EReference getTracedDynamicIntegerValue_DynamicIntegerValue_value_Dimension();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.States.activitydiagram.TracedDynamicIntegerValue#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedDynamicIntegerValue#getOriginalObject()
	 * @see #getTracedDynamicIntegerValue()
	 * @generated
	 */
	EReference getTracedDynamicIntegerValue_OriginalObject();

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
	 * Returns the meta object for the containment reference '{@link activitydiagramTrace.States.activitydiagram.TracedForkedToken#getForkedToken_baseToken_Dimension <em>Forked Token base Token Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Forked Token base Token Dimension</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedForkedToken#getForkedToken_baseToken_Dimension()
	 * @see #getTracedForkedToken()
	 * @generated
	 */
	EReference getTracedForkedToken_ForkedToken_baseToken_Dimension();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagramTrace.States.activitydiagram.TracedForkedToken#getForkedToken_remainingOffersCount_Dimension <em>Forked Token remaining Offers Count Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Forked Token remaining Offers Count Dimension</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedForkedToken#getForkedToken_remainingOffersCount_Dimension()
	 * @see #getTracedForkedToken()
	 * @generated
	 */
	EReference getTracedForkedToken_ForkedToken_remainingOffersCount_Dimension();

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
	 * Returns the meta object for the containment reference '{@link activitydiagramTrace.States.activitydiagram.TracedInput#getInput_inputValues_Dimension <em>Input input Values Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input input Values Dimension</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedInput#getInput_inputValues_Dimension()
	 * @see #getTracedInput()
	 * @generated
	 */
	EReference getTracedInput_Input_inputValues_Dimension();

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
	 * Returns the meta object for the containment reference '{@link activitydiagramTrace.States.activitydiagram.TracedOffer#getOffer_offeredTokens_Dimension <em>Offer offered Tokens Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Offer offered Tokens Dimension</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedOffer#getOffer_offeredTokens_Dimension()
	 * @see #getTracedOffer()
	 * @generated
	 */
	EReference getTracedOffer_Offer_offeredTokens_Dimension();

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
	 * Returns the meta object for class '{@link activitydiagramTrace.States.activitydiagram.TracedStaticBooleanValue <em>Traced Static Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Static Boolean Value</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedStaticBooleanValue
	 * @generated
	 */
	EClass getTracedStaticBooleanValue();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.States.activitydiagram.TracedStaticBooleanValue#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedStaticBooleanValue#getOriginalObject()
	 * @see #getTracedStaticBooleanValue()
	 * @generated
	 */
	EReference getTracedStaticBooleanValue_OriginalObject();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.activitydiagram.TracedStaticIntegerValue <em>Traced Static Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Static Integer Value</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedStaticIntegerValue
	 * @generated
	 */
	EClass getTracedStaticIntegerValue();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.States.activitydiagram.TracedStaticIntegerValue#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedStaticIntegerValue#getOriginalObject()
	 * @see #getTracedStaticIntegerValue()
	 * @generated
	 */
	EReference getTracedStaticIntegerValue_OriginalObject();

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
	 * Returns the meta object for the containment reference '{@link activitydiagramTrace.States.activitydiagram.TracedTrace#getTrace_executedNodes_Dimension <em>Trace executed Nodes Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trace executed Nodes Dimension</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedTrace#getTrace_executedNodes_Dimension()
	 * @see #getTracedTrace()
	 * @generated
	 */
	EReference getTracedTrace_Trace_executedNodes_Dimension();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.activitydiagram.TracedValue <em>Traced Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Value</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedValue
	 * @generated
	 */
	EClass getTracedValue();

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
		 * The meta object literal for the '<em><b>Activity trace Dimension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ACTIVITY__ACTIVITY_TRACE_DIMENSION = eINSTANCE.getTracedActivity_Activity_trace_Dimension();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ACTIVITY__ORIGINAL_OBJECT = eINSTANCE.getTracedActivity_OriginalObject();

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
		 * The meta object literal for the '<em><b>Activity Edge offers Dimension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ACTIVITY_EDGE__ACTIVITY_EDGE_OFFERS_DIMENSION = eINSTANCE.getTracedActivityEdge_ActivityEdge_offers_Dimension();

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
		 * The meta object literal for the '<em><b>Activity Node held Tokens Dimension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ACTIVITY_NODE__ACTIVITY_NODE_HELD_TOKENS_DIMENSION = eINSTANCE.getTracedActivityNode_ActivityNode_heldTokens_Dimension();

		/**
		 * The meta object literal for the '<em><b>Original Object Activity Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ACTIVITY_NODE__ORIGINAL_OBJECT_ACTIVITY_NODE = eINSTANCE.getTracedActivityNode_OriginalObject_ActivityNode();

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
		 * The meta object literal for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedDynamicBooleanValueImpl <em>Traced Dynamic Boolean Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.activitydiagram.impl.TracedDynamicBooleanValueImpl
		 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedDynamicBooleanValue()
		 * @generated
		 */
		EClass TRACED_DYNAMIC_BOOLEAN_VALUE = eINSTANCE.getTracedDynamicBooleanValue();

		/**
		 * The meta object literal for the '<em><b>Dynamic Boolean Value value Dimension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_DYNAMIC_BOOLEAN_VALUE__DYNAMIC_BOOLEAN_VALUE_VALUE_DIMENSION = eINSTANCE.getTracedDynamicBooleanValue_DynamicBooleanValue_value_Dimension();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_DYNAMIC_BOOLEAN_VALUE__ORIGINAL_OBJECT = eINSTANCE.getTracedDynamicBooleanValue_OriginalObject();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedDynamicIntegerValueImpl <em>Traced Dynamic Integer Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.activitydiagram.impl.TracedDynamicIntegerValueImpl
		 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedDynamicIntegerValue()
		 * @generated
		 */
		EClass TRACED_DYNAMIC_INTEGER_VALUE = eINSTANCE.getTracedDynamicIntegerValue();

		/**
		 * The meta object literal for the '<em><b>Dynamic Integer Value value Dimension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_DYNAMIC_INTEGER_VALUE__DYNAMIC_INTEGER_VALUE_VALUE_DIMENSION = eINSTANCE.getTracedDynamicIntegerValue_DynamicIntegerValue_value_Dimension();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_DYNAMIC_INTEGER_VALUE__ORIGINAL_OBJECT = eINSTANCE.getTracedDynamicIntegerValue_OriginalObject();

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
		 * The meta object literal for the '<em><b>Forked Token base Token Dimension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_FORKED_TOKEN__FORKED_TOKEN_BASE_TOKEN_DIMENSION = eINSTANCE.getTracedForkedToken_ForkedToken_baseToken_Dimension();

		/**
		 * The meta object literal for the '<em><b>Forked Token remaining Offers Count Dimension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_FORKED_TOKEN__FORKED_TOKEN_REMAINING_OFFERS_COUNT_DIMENSION = eINSTANCE.getTracedForkedToken_ForkedToken_remainingOffersCount_Dimension();

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
		 * The meta object literal for the '<em><b>Input input Values Dimension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_INPUT__INPUT_INPUT_VALUES_DIMENSION = eINSTANCE.getTracedInput_Input_inputValues_Dimension();

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
		 * The meta object literal for the '<em><b>Offer offered Tokens Dimension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_OFFER__OFFER_OFFERED_TOKENS_DIMENSION = eINSTANCE.getTracedOffer_Offer_offeredTokens_Dimension();

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
		 * The meta object literal for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedStaticBooleanValueImpl <em>Traced Static Boolean Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.activitydiagram.impl.TracedStaticBooleanValueImpl
		 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedStaticBooleanValue()
		 * @generated
		 */
		EClass TRACED_STATIC_BOOLEAN_VALUE = eINSTANCE.getTracedStaticBooleanValue();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_STATIC_BOOLEAN_VALUE__ORIGINAL_OBJECT = eINSTANCE.getTracedStaticBooleanValue_OriginalObject();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedStaticIntegerValueImpl <em>Traced Static Integer Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.activitydiagram.impl.TracedStaticIntegerValueImpl
		 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedStaticIntegerValue()
		 * @generated
		 */
		EClass TRACED_STATIC_INTEGER_VALUE = eINSTANCE.getTracedStaticIntegerValue();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_STATIC_INTEGER_VALUE__ORIGINAL_OBJECT = eINSTANCE.getTracedStaticIntegerValue_OriginalObject();

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
		 * The meta object literal for the '<em><b>Trace executed Nodes Dimension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_TRACE__TRACE_EXECUTED_NODES_DIMENSION = eINSTANCE.getTracedTrace_Trace_executedNodes_Dimension();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedValueImpl <em>Traced Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.activitydiagram.impl.TracedValueImpl
		 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedValue()
		 * @generated
		 */
		EClass TRACED_VALUE = eINSTANCE.getTracedValue();

	}

} //ActivitydiagramPackage
