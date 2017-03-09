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
	int TRACED_NAMED_ELEMENT = 26;

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
	 * The number of structural features of the '<em>Traced Activity Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_NODE_FEATURE_COUNT = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 1;

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
	int TRACED_ACTION__DIMENSIONS = TRACED_ACTIVITY_NODE__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Activity Node held Tokens Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTION__ACTIVITY_NODE_HELD_TOKENS_DIMENSION = TRACED_ACTIVITY_NODE__ACTIVITY_NODE_HELD_TOKENS_DIMENSION;

	/**
	 * The number of structural features of the '<em>Traced Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTION_FEATURE_COUNT = TRACED_ACTIVITY_NODE_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY__ORIGINAL_OBJECT = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_FEATURE_COUNT = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Activity Edge offered Tokens Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_EDGE__ACTIVITY_EDGE_OFFERED_TOKENS_DIMENSION = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 0;

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
	int TRACED_CONTROL_NODE = 11;

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
	int TRACED_FINAL_NODE = 15;

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
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedExpressionImpl <em>Traced Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedExpressionImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedExpression()
	 * @generated
	 */
	int TRACED_EXPRESSION = 14;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXPRESSION__DIMENSIONS = StatesPackage.SPECIFIC_TRACED_OBJECT__DIMENSIONS;

	/**
	 * The number of structural features of the '<em>Traced Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXPRESSION_FEATURE_COUNT = StatesPackage.SPECIFIC_TRACED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedBooleanExpressionImpl <em>Traced Boolean Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedBooleanExpressionImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedBooleanExpression()
	 * @generated
	 */
	int TRACED_BOOLEAN_EXPRESSION = 6;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_EXPRESSION__DIMENSIONS = TRACED_EXPRESSION__DIMENSIONS;

	/**
	 * The number of structural features of the '<em>Traced Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_EXPRESSION_FEATURE_COUNT = TRACED_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedBooleanBinaryExpressionImpl <em>Traced Boolean Binary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedBooleanBinaryExpressionImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedBooleanBinaryExpression()
	 * @generated
	 */
	int TRACED_BOOLEAN_BINARY_EXPRESSION = 5;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_BINARY_EXPRESSION__DIMENSIONS = TRACED_BOOLEAN_EXPRESSION__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_BINARY_EXPRESSION__ORIGINAL_OBJECT = TRACED_BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Boolean Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_BINARY_EXPRESSION_FEATURE_COUNT = TRACED_BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedBooleanUnaryExpressionImpl <em>Traced Boolean Unary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedBooleanUnaryExpressionImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedBooleanUnaryExpression()
	 * @generated
	 */
	int TRACED_BOOLEAN_UNARY_EXPRESSION = 7;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_UNARY_EXPRESSION__DIMENSIONS = TRACED_BOOLEAN_EXPRESSION__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_UNARY_EXPRESSION__ORIGINAL_OBJECT = TRACED_BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Boolean Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_UNARY_EXPRESSION_FEATURE_COUNT = TRACED_BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedValueImpl <em>Traced Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedValueImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedValue()
	 * @generated
	 */
	int TRACED_VALUE = 29;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VALUE__DIMENSIONS = TRACED_EXPRESSION__DIMENSIONS;

	/**
	 * The number of structural features of the '<em>Traced Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VALUE_FEATURE_COUNT = TRACED_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedBooleanValueImpl <em>Traced Boolean Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedBooleanValueImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedBooleanValue()
	 * @generated
	 */
	int TRACED_BOOLEAN_VALUE = 8;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_VALUE__DIMENSIONS = TRACED_VALUE__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_VALUE__ORIGINAL_OBJECT = TRACED_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_VALUE_FEATURE_COUNT = TRACED_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedVariableImpl <em>Traced Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedVariableImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedVariable()
	 * @generated
	 */
	int TRACED_VARIABLE = 30;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VARIABLE__DIMENSIONS = TRACED_EXPRESSION__DIMENSIONS;

	/**
	 * The number of structural features of the '<em>Traced Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VARIABLE_FEATURE_COUNT = TRACED_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedBooleanVariableImpl <em>Traced Boolean Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedBooleanVariableImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedBooleanVariable()
	 * @generated
	 */
	int TRACED_BOOLEAN_VARIABLE = 9;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_VARIABLE__DIMENSIONS = TRACED_VARIABLE__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Boolean Variable current Value Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_VARIABLE__BOOLEAN_VARIABLE_CURRENT_VALUE_DIMENSION = TRACED_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_VARIABLE__ORIGINAL_OBJECT = TRACED_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Traced Boolean Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_VARIABLE_FEATURE_COUNT = TRACED_VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedControlFlowImpl <em>Traced Control Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedControlFlowImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedControlFlow()
	 * @generated
	 */
	int TRACED_CONTROL_FLOW = 10;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONTROL_FLOW__DIMENSIONS = TRACED_ACTIVITY_EDGE__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Activity Edge offered Tokens Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONTROL_FLOW__ACTIVITY_EDGE_OFFERED_TOKENS_DIMENSION = TRACED_ACTIVITY_EDGE__ACTIVITY_EDGE_OFFERED_TOKENS_DIMENSION;

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
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedControlTokenImpl <em>Traced Control Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedControlTokenImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedControlToken()
	 * @generated
	 */
	int TRACED_CONTROL_TOKEN = 12;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONTROL_TOKEN__DIMENSIONS = StatesPackage.SPECIFIC_TRACED_OBJECT__DIMENSIONS;

	/**
	 * The number of structural features of the '<em>Traced Control Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONTROL_TOKEN_FEATURE_COUNT = StatesPackage.SPECIFIC_TRACED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedDecisionNodeImpl <em>Traced Decision Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedDecisionNodeImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedDecisionNode()
	 * @generated
	 */
	int TRACED_DECISION_NODE = 13;

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
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedFlowFinalNodeImpl <em>Traced Flow Final Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedFlowFinalNodeImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedFlowFinalNode()
	 * @generated
	 */
	int TRACED_FLOW_FINAL_NODE = 16;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FLOW_FINAL_NODE__DIMENSIONS = TRACED_FINAL_NODE__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Activity Node held Tokens Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FLOW_FINAL_NODE__ACTIVITY_NODE_HELD_TOKENS_DIMENSION = TRACED_FINAL_NODE__ACTIVITY_NODE_HELD_TOKENS_DIMENSION;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FLOW_FINAL_NODE__ORIGINAL_OBJECT = TRACED_FINAL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Flow Final Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FLOW_FINAL_NODE_FEATURE_COUNT = TRACED_FINAL_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedForkNodeImpl <em>Traced Fork Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedForkNodeImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedForkNode()
	 * @generated
	 */
	int TRACED_FORK_NODE = 17;

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
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedInitialNodeImpl <em>Traced Initial Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedInitialNodeImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedInitialNode()
	 * @generated
	 */
	int TRACED_INITIAL_NODE = 18;

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
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedIntegerBinaryExpressionImpl <em>Traced Integer Binary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedIntegerBinaryExpressionImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedIntegerBinaryExpression()
	 * @generated
	 */
	int TRACED_INTEGER_BINARY_EXPRESSION = 19;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_BINARY_EXPRESSION__DIMENSIONS = TRACED_EXPRESSION__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_BINARY_EXPRESSION__ORIGINAL_OBJECT = TRACED_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Integer Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_BINARY_EXPRESSION_FEATURE_COUNT = TRACED_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedIntegerComparisonExpressionImpl <em>Traced Integer Comparison Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedIntegerComparisonExpressionImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedIntegerComparisonExpression()
	 * @generated
	 */
	int TRACED_INTEGER_COMPARISON_EXPRESSION = 20;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_COMPARISON_EXPRESSION__DIMENSIONS = TRACED_BOOLEAN_EXPRESSION__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_COMPARISON_EXPRESSION__ORIGINAL_OBJECT = TRACED_BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Integer Comparison Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_COMPARISON_EXPRESSION_FEATURE_COUNT = TRACED_BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedIntegerExpressionImpl <em>Traced Integer Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedIntegerExpressionImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedIntegerExpression()
	 * @generated
	 */
	int TRACED_INTEGER_EXPRESSION = 21;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_EXPRESSION__DIMENSIONS = TRACED_EXPRESSION__DIMENSIONS;

	/**
	 * The number of structural features of the '<em>Traced Integer Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_EXPRESSION_FEATURE_COUNT = TRACED_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedIntegerValueImpl <em>Traced Integer Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedIntegerValueImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedIntegerValue()
	 * @generated
	 */
	int TRACED_INTEGER_VALUE = 22;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_VALUE__DIMENSIONS = TRACED_VALUE__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_VALUE__ORIGINAL_OBJECT = TRACED_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Integer Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_VALUE_FEATURE_COUNT = TRACED_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedIntegerVariableImpl <em>Traced Integer Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedIntegerVariableImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedIntegerVariable()
	 * @generated
	 */
	int TRACED_INTEGER_VARIABLE = 23;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_VARIABLE__DIMENSIONS = TRACED_VARIABLE__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Integer Variable current Value Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_VARIABLE__INTEGER_VARIABLE_CURRENT_VALUE_DIMENSION = TRACED_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_VARIABLE__ORIGINAL_OBJECT = TRACED_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Traced Integer Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_VARIABLE_FEATURE_COUNT = TRACED_VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedJoinNodeImpl <em>Traced Join Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedJoinNodeImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedJoinNode()
	 * @generated
	 */
	int TRACED_JOIN_NODE = 24;

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
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedMergeNodeImpl <em>Traced Merge Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedMergeNodeImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedMergeNode()
	 * @generated
	 */
	int TRACED_MERGE_NODE = 25;

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
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedOfferImpl <em>Traced Offer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedOfferImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedOffer()
	 * @generated
	 */
	int TRACED_OFFER = 27;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OFFER__DIMENSIONS = StatesPackage.SPECIFIC_TRACED_OBJECT__DIMENSIONS;

	/**
	 * The number of structural features of the '<em>Traced Offer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OFFER_FEATURE_COUNT = StatesPackage.SPECIFIC_TRACED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedOpaqueActionImpl <em>Traced Opaque Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedOpaqueActionImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedOpaqueAction()
	 * @generated
	 */
	int TRACED_OPAQUE_ACTION = 28;

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
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPAQUE_ACTION__ORIGINAL_OBJECT = TRACED_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Opaque Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPAQUE_ACTION_FEATURE_COUNT = TRACED_ACTION_FEATURE_COUNT + 1;


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
	 * Returns the meta object for class '{@link activitydiagramTrace.States.activitydiagram.TracedActivityEdge <em>Traced Activity Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Activity Edge</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedActivityEdge
	 * @generated
	 */
	EClass getTracedActivityEdge();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagramTrace.States.activitydiagram.TracedActivityEdge#getActivityEdge_offeredTokens_Dimension <em>Activity Edge offered Tokens Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activity Edge offered Tokens Dimension</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedActivityEdge#getActivityEdge_offeredTokens_Dimension()
	 * @see #getTracedActivityEdge()
	 * @generated
	 */
	EReference getTracedActivityEdge_ActivityEdge_offeredTokens_Dimension();

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
	 * Returns the meta object for the reference '{@link activitydiagramTrace.States.activitydiagram.TracedActivityFinalNode#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedActivityFinalNode#getOriginalObject()
	 * @see #getTracedActivityFinalNode()
	 * @generated
	 */
	EReference getTracedActivityFinalNode_OriginalObject();

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
	 * Returns the meta object for class '{@link activitydiagramTrace.States.activitydiagram.TracedBooleanBinaryExpression <em>Traced Boolean Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Boolean Binary Expression</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedBooleanBinaryExpression
	 * @generated
	 */
	EClass getTracedBooleanBinaryExpression();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.States.activitydiagram.TracedBooleanBinaryExpression#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedBooleanBinaryExpression#getOriginalObject()
	 * @see #getTracedBooleanBinaryExpression()
	 * @generated
	 */
	EReference getTracedBooleanBinaryExpression_OriginalObject();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.activitydiagram.TracedBooleanExpression <em>Traced Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Boolean Expression</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedBooleanExpression
	 * @generated
	 */
	EClass getTracedBooleanExpression();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.activitydiagram.TracedBooleanUnaryExpression <em>Traced Boolean Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Boolean Unary Expression</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedBooleanUnaryExpression
	 * @generated
	 */
	EClass getTracedBooleanUnaryExpression();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.States.activitydiagram.TracedBooleanUnaryExpression#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedBooleanUnaryExpression#getOriginalObject()
	 * @see #getTracedBooleanUnaryExpression()
	 * @generated
	 */
	EReference getTracedBooleanUnaryExpression_OriginalObject();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.activitydiagram.TracedBooleanValue <em>Traced Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Boolean Value</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedBooleanValue
	 * @generated
	 */
	EClass getTracedBooleanValue();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.States.activitydiagram.TracedBooleanValue#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedBooleanValue#getOriginalObject()
	 * @see #getTracedBooleanValue()
	 * @generated
	 */
	EReference getTracedBooleanValue_OriginalObject();

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
	 * Returns the meta object for the containment reference '{@link activitydiagramTrace.States.activitydiagram.TracedBooleanVariable#getBooleanVariable_currentValue_Dimension <em>Boolean Variable current Value Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Boolean Variable current Value Dimension</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedBooleanVariable#getBooleanVariable_currentValue_Dimension()
	 * @see #getTracedBooleanVariable()
	 * @generated
	 */
	EReference getTracedBooleanVariable_BooleanVariable_currentValue_Dimension();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.States.activitydiagram.TracedBooleanVariable#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedBooleanVariable#getOriginalObject()
	 * @see #getTracedBooleanVariable()
	 * @generated
	 */
	EReference getTracedBooleanVariable_OriginalObject();

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
	 * Returns the meta object for the reference '{@link activitydiagramTrace.States.activitydiagram.TracedDecisionNode#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedDecisionNode#getOriginalObject()
	 * @see #getTracedDecisionNode()
	 * @generated
	 */
	EReference getTracedDecisionNode_OriginalObject();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.activitydiagram.TracedExpression <em>Traced Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Expression</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedExpression
	 * @generated
	 */
	EClass getTracedExpression();

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
	 * Returns the meta object for class '{@link activitydiagramTrace.States.activitydiagram.TracedFlowFinalNode <em>Traced Flow Final Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Flow Final Node</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedFlowFinalNode
	 * @generated
	 */
	EClass getTracedFlowFinalNode();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.States.activitydiagram.TracedFlowFinalNode#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedFlowFinalNode#getOriginalObject()
	 * @see #getTracedFlowFinalNode()
	 * @generated
	 */
	EReference getTracedFlowFinalNode_OriginalObject();

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
	 * Returns the meta object for the reference '{@link activitydiagramTrace.States.activitydiagram.TracedForkNode#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedForkNode#getOriginalObject()
	 * @see #getTracedForkNode()
	 * @generated
	 */
	EReference getTracedForkNode_OriginalObject();

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
	 * Returns the meta object for the reference '{@link activitydiagramTrace.States.activitydiagram.TracedInitialNode#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedInitialNode#getOriginalObject()
	 * @see #getTracedInitialNode()
	 * @generated
	 */
	EReference getTracedInitialNode_OriginalObject();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.activitydiagram.TracedIntegerBinaryExpression <em>Traced Integer Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Integer Binary Expression</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedIntegerBinaryExpression
	 * @generated
	 */
	EClass getTracedIntegerBinaryExpression();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.States.activitydiagram.TracedIntegerBinaryExpression#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedIntegerBinaryExpression#getOriginalObject()
	 * @see #getTracedIntegerBinaryExpression()
	 * @generated
	 */
	EReference getTracedIntegerBinaryExpression_OriginalObject();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.activitydiagram.TracedIntegerComparisonExpression <em>Traced Integer Comparison Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Integer Comparison Expression</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedIntegerComparisonExpression
	 * @generated
	 */
	EClass getTracedIntegerComparisonExpression();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.States.activitydiagram.TracedIntegerComparisonExpression#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedIntegerComparisonExpression#getOriginalObject()
	 * @see #getTracedIntegerComparisonExpression()
	 * @generated
	 */
	EReference getTracedIntegerComparisonExpression_OriginalObject();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.activitydiagram.TracedIntegerExpression <em>Traced Integer Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Integer Expression</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedIntegerExpression
	 * @generated
	 */
	EClass getTracedIntegerExpression();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.activitydiagram.TracedIntegerValue <em>Traced Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Integer Value</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedIntegerValue
	 * @generated
	 */
	EClass getTracedIntegerValue();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.States.activitydiagram.TracedIntegerValue#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedIntegerValue#getOriginalObject()
	 * @see #getTracedIntegerValue()
	 * @generated
	 */
	EReference getTracedIntegerValue_OriginalObject();

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
	 * Returns the meta object for the containment reference '{@link activitydiagramTrace.States.activitydiagram.TracedIntegerVariable#getIntegerVariable_currentValue_Dimension <em>Integer Variable current Value Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Integer Variable current Value Dimension</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedIntegerVariable#getIntegerVariable_currentValue_Dimension()
	 * @see #getTracedIntegerVariable()
	 * @generated
	 */
	EReference getTracedIntegerVariable_IntegerVariable_currentValue_Dimension();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.States.activitydiagram.TracedIntegerVariable#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedIntegerVariable#getOriginalObject()
	 * @see #getTracedIntegerVariable()
	 * @generated
	 */
	EReference getTracedIntegerVariable_OriginalObject();

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
	 * Returns the meta object for the reference '{@link activitydiagramTrace.States.activitydiagram.TracedJoinNode#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedJoinNode#getOriginalObject()
	 * @see #getTracedJoinNode()
	 * @generated
	 */
	EReference getTracedJoinNode_OriginalObject();

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
	 * Returns the meta object for the reference '{@link activitydiagramTrace.States.activitydiagram.TracedMergeNode#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedMergeNode#getOriginalObject()
	 * @see #getTracedMergeNode()
	 * @generated
	 */
	EReference getTracedMergeNode_OriginalObject();

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
	 * Returns the meta object for class '{@link activitydiagramTrace.States.activitydiagram.TracedOpaqueAction <em>Traced Opaque Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Opaque Action</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedOpaqueAction
	 * @generated
	 */
	EClass getTracedOpaqueAction();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.States.activitydiagram.TracedOpaqueAction#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedOpaqueAction#getOriginalObject()
	 * @see #getTracedOpaqueAction()
	 * @generated
	 */
	EReference getTracedOpaqueAction_OriginalObject();

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
	 * Returns the meta object for class '{@link activitydiagramTrace.States.activitydiagram.TracedVariable <em>Traced Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Variable</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedVariable
	 * @generated
	 */
	EClass getTracedVariable();

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
		 * The meta object literal for the '<em><b>Activity Edge offered Tokens Dimension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ACTIVITY_EDGE__ACTIVITY_EDGE_OFFERED_TOKENS_DIMENSION = eINSTANCE.getTracedActivityEdge_ActivityEdge_offeredTokens_Dimension();

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
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ACTIVITY_FINAL_NODE__ORIGINAL_OBJECT = eINSTANCE.getTracedActivityFinalNode_OriginalObject();

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
		 * The meta object literal for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedBooleanBinaryExpressionImpl <em>Traced Boolean Binary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.activitydiagram.impl.TracedBooleanBinaryExpressionImpl
		 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedBooleanBinaryExpression()
		 * @generated
		 */
		EClass TRACED_BOOLEAN_BINARY_EXPRESSION = eINSTANCE.getTracedBooleanBinaryExpression();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_BOOLEAN_BINARY_EXPRESSION__ORIGINAL_OBJECT = eINSTANCE.getTracedBooleanBinaryExpression_OriginalObject();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedBooleanExpressionImpl <em>Traced Boolean Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.activitydiagram.impl.TracedBooleanExpressionImpl
		 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedBooleanExpression()
		 * @generated
		 */
		EClass TRACED_BOOLEAN_EXPRESSION = eINSTANCE.getTracedBooleanExpression();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedBooleanUnaryExpressionImpl <em>Traced Boolean Unary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.activitydiagram.impl.TracedBooleanUnaryExpressionImpl
		 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedBooleanUnaryExpression()
		 * @generated
		 */
		EClass TRACED_BOOLEAN_UNARY_EXPRESSION = eINSTANCE.getTracedBooleanUnaryExpression();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_BOOLEAN_UNARY_EXPRESSION__ORIGINAL_OBJECT = eINSTANCE.getTracedBooleanUnaryExpression_OriginalObject();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedBooleanValueImpl <em>Traced Boolean Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.activitydiagram.impl.TracedBooleanValueImpl
		 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedBooleanValue()
		 * @generated
		 */
		EClass TRACED_BOOLEAN_VALUE = eINSTANCE.getTracedBooleanValue();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_BOOLEAN_VALUE__ORIGINAL_OBJECT = eINSTANCE.getTracedBooleanValue_OriginalObject();

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
		 * The meta object literal for the '<em><b>Boolean Variable current Value Dimension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_BOOLEAN_VARIABLE__BOOLEAN_VARIABLE_CURRENT_VALUE_DIMENSION = eINSTANCE.getTracedBooleanVariable_BooleanVariable_currentValue_Dimension();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_BOOLEAN_VARIABLE__ORIGINAL_OBJECT = eINSTANCE.getTracedBooleanVariable_OriginalObject();

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
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_DECISION_NODE__ORIGINAL_OBJECT = eINSTANCE.getTracedDecisionNode_OriginalObject();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedExpressionImpl <em>Traced Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.activitydiagram.impl.TracedExpressionImpl
		 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedExpression()
		 * @generated
		 */
		EClass TRACED_EXPRESSION = eINSTANCE.getTracedExpression();

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
		 * The meta object literal for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedFlowFinalNodeImpl <em>Traced Flow Final Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.activitydiagram.impl.TracedFlowFinalNodeImpl
		 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedFlowFinalNode()
		 * @generated
		 */
		EClass TRACED_FLOW_FINAL_NODE = eINSTANCE.getTracedFlowFinalNode();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_FLOW_FINAL_NODE__ORIGINAL_OBJECT = eINSTANCE.getTracedFlowFinalNode_OriginalObject();

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
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_FORK_NODE__ORIGINAL_OBJECT = eINSTANCE.getTracedForkNode_OriginalObject();

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
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_INITIAL_NODE__ORIGINAL_OBJECT = eINSTANCE.getTracedInitialNode_OriginalObject();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedIntegerBinaryExpressionImpl <em>Traced Integer Binary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.activitydiagram.impl.TracedIntegerBinaryExpressionImpl
		 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedIntegerBinaryExpression()
		 * @generated
		 */
		EClass TRACED_INTEGER_BINARY_EXPRESSION = eINSTANCE.getTracedIntegerBinaryExpression();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_INTEGER_BINARY_EXPRESSION__ORIGINAL_OBJECT = eINSTANCE.getTracedIntegerBinaryExpression_OriginalObject();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedIntegerComparisonExpressionImpl <em>Traced Integer Comparison Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.activitydiagram.impl.TracedIntegerComparisonExpressionImpl
		 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedIntegerComparisonExpression()
		 * @generated
		 */
		EClass TRACED_INTEGER_COMPARISON_EXPRESSION = eINSTANCE.getTracedIntegerComparisonExpression();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_INTEGER_COMPARISON_EXPRESSION__ORIGINAL_OBJECT = eINSTANCE.getTracedIntegerComparisonExpression_OriginalObject();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedIntegerExpressionImpl <em>Traced Integer Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.activitydiagram.impl.TracedIntegerExpressionImpl
		 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedIntegerExpression()
		 * @generated
		 */
		EClass TRACED_INTEGER_EXPRESSION = eINSTANCE.getTracedIntegerExpression();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedIntegerValueImpl <em>Traced Integer Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.activitydiagram.impl.TracedIntegerValueImpl
		 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedIntegerValue()
		 * @generated
		 */
		EClass TRACED_INTEGER_VALUE = eINSTANCE.getTracedIntegerValue();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_INTEGER_VALUE__ORIGINAL_OBJECT = eINSTANCE.getTracedIntegerValue_OriginalObject();

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
		 * The meta object literal for the '<em><b>Integer Variable current Value Dimension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_INTEGER_VARIABLE__INTEGER_VARIABLE_CURRENT_VALUE_DIMENSION = eINSTANCE.getTracedIntegerVariable_IntegerVariable_currentValue_Dimension();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_INTEGER_VARIABLE__ORIGINAL_OBJECT = eINSTANCE.getTracedIntegerVariable_OriginalObject();

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
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_JOIN_NODE__ORIGINAL_OBJECT = eINSTANCE.getTracedJoinNode_OriginalObject();

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
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_MERGE_NODE__ORIGINAL_OBJECT = eINSTANCE.getTracedMergeNode_OriginalObject();

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
		 * The meta object literal for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedOpaqueActionImpl <em>Traced Opaque Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.activitydiagram.impl.TracedOpaqueActionImpl
		 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedOpaqueAction()
		 * @generated
		 */
		EClass TRACED_OPAQUE_ACTION = eINSTANCE.getTracedOpaqueAction();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_OPAQUE_ACTION__ORIGINAL_OBJECT = eINSTANCE.getTracedOpaqueAction_OriginalObject();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedValueImpl <em>Traced Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.activitydiagram.impl.TracedValueImpl
		 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedValue()
		 * @generated
		 */
		EClass TRACED_VALUE = eINSTANCE.getTracedValue();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedVariableImpl <em>Traced Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.activitydiagram.impl.TracedVariableImpl
		 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedVariable()
		 * @generated
		 */
		EClass TRACED_VARIABLE = eINSTANCE.getTracedVariable();

	}

} //ActivitydiagramPackage
