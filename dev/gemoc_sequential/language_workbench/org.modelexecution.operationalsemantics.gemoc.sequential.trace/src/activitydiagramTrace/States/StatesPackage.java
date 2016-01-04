/**
 */
package activitydiagramTrace.States;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see activitydiagramTrace.States.StatesFactory
 * @model kind="package"
 * @generated
 */
public interface StatesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "States";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "activitydiagramTrace_States";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tracedclasses";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StatesPackage eINSTANCE = activitydiagramTrace.States.impl.StatesPackageImpl.init();

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.StateImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getState()
	 * @generated
	 */
	int STATE = 0;

	/**
	 * The feature id for the '<em><b>Started Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__STARTED_STEPS = 0;

	/**
	 * The feature id for the '<em><b>Ended Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ENDED_STEPS = 1;

	/**
	 * The feature id for the '<em><b>Integer Comparison Expression operator Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INTEGER_COMPARISON_EXPRESSION_OPERATOR_VALUES = 2;

	/**
	 * The feature id for the '<em><b>Integer Comparison Expression assignee Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INTEGER_COMPARISON_EXPRESSION_ASSIGNEE_VALUES = 3;

	/**
	 * The feature id for the '<em><b>Activity Edge target Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ACTIVITY_EDGE_TARGET_VALUES = 4;

	/**
	 * The feature id for the '<em><b>Activity Edge offers Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ACTIVITY_EDGE_OFFERS_VALUES = 5;

	/**
	 * The feature id for the '<em><b>Activity Edge source Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ACTIVITY_EDGE_SOURCE_VALUES = 6;

	/**
	 * The feature id for the '<em><b>Activity Node activity Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ACTIVITY_NODE_ACTIVITY_VALUES = 7;

	/**
	 * The feature id for the '<em><b>Activity Node running Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ACTIVITY_NODE_RUNNING_VALUES = 8;

	/**
	 * The feature id for the '<em><b>Activity Node outgoing Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ACTIVITY_NODE_OUTGOING_VALUES = 9;

	/**
	 * The feature id for the '<em><b>Activity Node incoming Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ACTIVITY_NODE_INCOMING_VALUES = 10;

	/**
	 * The feature id for the '<em><b>Activity Node held Tokens Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ACTIVITY_NODE_HELD_TOKENS_VALUES = 11;

	/**
	 * The feature id for the '<em><b>Control Flow guard Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__CONTROL_FLOW_GUARD_VALUES = 12;

	/**
	 * The feature id for the '<em><b>Named Element name Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAMED_ELEMENT_NAME_VALUES = 13;

	/**
	 * The feature id for the '<em><b>Boolean Value value Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__BOOLEAN_VALUE_VALUE_VALUES = 14;

	/**
	 * The feature id for the '<em><b>Integer Calculation Expression operator Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INTEGER_CALCULATION_EXPRESSION_OPERATOR_VALUES = 15;

	/**
	 * The feature id for the '<em><b>Integer Calculation Expression assignee Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INTEGER_CALCULATION_EXPRESSION_ASSIGNEE_VALUES = 16;

	/**
	 * The feature id for the '<em><b>Opaque Action expressions Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OPAQUE_ACTION_EXPRESSIONS_VALUES = 17;

	/**
	 * The feature id for the '<em><b>Variable initial Value Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__VARIABLE_INITIAL_VALUE_VALUES = 18;

	/**
	 * The feature id for the '<em><b>Variable name Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__VARIABLE_NAME_VALUES = 19;

	/**
	 * The feature id for the '<em><b>Variable current Value Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__VARIABLE_CURRENT_VALUE_VALUES = 20;

	/**
	 * The feature id for the '<em><b>Token holder Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__TOKEN_HOLDER_VALUES = 21;

	/**
	 * The feature id for the '<em><b>Input input Values Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INPUT_INPUT_VALUES_VALUES = 22;

	/**
	 * The feature id for the '<em><b>Integer Value value Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INTEGER_VALUE_VALUE_VALUES = 23;

	/**
	 * The feature id for the '<em><b>Activity locals Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ACTIVITY_LOCALS_VALUES = 24;

	/**
	 * The feature id for the '<em><b>Activity edges Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ACTIVITY_EDGES_VALUES = 25;

	/**
	 * The feature id for the '<em><b>Activity inputs Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ACTIVITY_INPUTS_VALUES = 26;

	/**
	 * The feature id for the '<em><b>Activity nodes Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ACTIVITY_NODES_VALUES = 27;

	/**
	 * The feature id for the '<em><b>Activity trace Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ACTIVITY_TRACE_VALUES = 28;

	/**
	 * The feature id for the '<em><b>Offer offered Tokens Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OFFER_OFFERED_TOKENS_VALUES = 29;

	/**
	 * The feature id for the '<em><b>Forked Token remaining Offers Count Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUES = 30;

	/**
	 * The feature id for the '<em><b>Forked Token base Token Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__FORKED_TOKEN_BASE_TOKEN_VALUES = 31;

	/**
	 * The feature id for the '<em><b>Integer Expression operand2 Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INTEGER_EXPRESSION_OPERAND2_VALUES = 32;

	/**
	 * The feature id for the '<em><b>Integer Expression operand1 Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INTEGER_EXPRESSION_OPERAND1_VALUES = 33;

	/**
	 * The feature id for the '<em><b>Boolean Expression assignee Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__BOOLEAN_EXPRESSION_ASSIGNEE_VALUES = 34;

	/**
	 * The feature id for the '<em><b>Boolean Unary Expression operator Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__BOOLEAN_UNARY_EXPRESSION_OPERATOR_VALUES = 35;

	/**
	 * The feature id for the '<em><b>Boolean Unary Expression operand Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__BOOLEAN_UNARY_EXPRESSION_OPERAND_VALUES = 36;

	/**
	 * The feature id for the '<em><b>Boolean Binary Expression operand2 Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__BOOLEAN_BINARY_EXPRESSION_OPERAND2_VALUES = 37;

	/**
	 * The feature id for the '<em><b>Boolean Binary Expression operator Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__BOOLEAN_BINARY_EXPRESSION_OPERATOR_VALUES = 38;

	/**
	 * The feature id for the '<em><b>Boolean Binary Expression operand1 Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__BOOLEAN_BINARY_EXPRESSION_OPERAND1_VALUES = 39;

	/**
	 * The feature id for the '<em><b>Trace executed Nodes Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__TRACE_EXECUTED_NODES_VALUES = 40;

	/**
	 * The feature id for the '<em><b>Input Value value Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INPUT_VALUE_VALUE_VALUES = 41;

	/**
	 * The feature id for the '<em><b>Input Value variable Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INPUT_VALUE_VARIABLE_VALUES = 42;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 43;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.IntegerComparisonExpression_operator_ValueImpl <em>Integer Comparison Expression operator Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.IntegerComparisonExpression_operator_ValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getIntegerComparisonExpression_operator_Value()
	 * @generated
	 */
	int INTEGER_COMPARISON_EXPRESSION_OPERATOR_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_COMPARISON_EXPRESSION_OPERATOR_VALUE__OPERATOR = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_COMPARISON_EXPRESSION_OPERATOR_VALUE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_COMPARISON_EXPRESSION_OPERATOR_VALUE__STATES = 2;

	/**
	 * The number of structural features of the '<em>Integer Comparison Expression operator Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_COMPARISON_EXPRESSION_OPERATOR_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Integer Comparison Expression operator Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_COMPARISON_EXPRESSION_OPERATOR_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.IntegerComparisonExpression_assignee_ValueImpl <em>Integer Comparison Expression assignee Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.IntegerComparisonExpression_assignee_ValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getIntegerComparisonExpression_assignee_Value()
	 * @generated
	 */
	int INTEGER_COMPARISON_EXPRESSION_ASSIGNEE_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_COMPARISON_EXPRESSION_ASSIGNEE_VALUE__ASSIGNEE = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_COMPARISON_EXPRESSION_ASSIGNEE_VALUE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_COMPARISON_EXPRESSION_ASSIGNEE_VALUE__STATES = 2;

	/**
	 * The number of structural features of the '<em>Integer Comparison Expression assignee Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_COMPARISON_EXPRESSION_ASSIGNEE_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Integer Comparison Expression assignee Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_COMPARISON_EXPRESSION_ASSIGNEE_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.ActivityEdge_target_ValueImpl <em>Activity Edge target Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.ActivityEdge_target_ValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getActivityEdge_target_Value()
	 * @generated
	 */
	int ACTIVITY_EDGE_TARGET_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_TARGET_VALUE__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_TARGET_VALUE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_TARGET_VALUE__STATES = 2;

	/**
	 * The number of structural features of the '<em>Activity Edge target Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_TARGET_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Activity Edge target Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_TARGET_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.ActivityEdge_offers_ValueImpl <em>Activity Edge offers Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.ActivityEdge_offers_ValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getActivityEdge_offers_Value()
	 * @generated
	 */
	int ACTIVITY_EDGE_OFFERS_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Offers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_OFFERS_VALUE__OFFERS = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_OFFERS_VALUE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_OFFERS_VALUE__STATES = 2;

	/**
	 * The number of structural features of the '<em>Activity Edge offers Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_OFFERS_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Activity Edge offers Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_OFFERS_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.ActivityEdge_source_ValueImpl <em>Activity Edge source Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.ActivityEdge_source_ValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getActivityEdge_source_Value()
	 * @generated
	 */
	int ACTIVITY_EDGE_SOURCE_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_SOURCE_VALUE__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_SOURCE_VALUE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_SOURCE_VALUE__STATES = 2;

	/**
	 * The number of structural features of the '<em>Activity Edge source Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_SOURCE_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Activity Edge source Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_SOURCE_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.ActivityNode_activity_ValueImpl <em>Activity Node activity Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.ActivityNode_activity_ValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getActivityNode_activity_Value()
	 * @generated
	 */
	int ACTIVITY_NODE_ACTIVITY_VALUE = 6;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVITY_VALUE__ACTIVITY = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVITY_VALUE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVITY_VALUE__STATES = 2;

	/**
	 * The number of structural features of the '<em>Activity Node activity Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVITY_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Activity Node activity Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ACTIVITY_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.ActivityNode_running_ValueImpl <em>Activity Node running Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.ActivityNode_running_ValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getActivityNode_running_Value()
	 * @generated
	 */
	int ACTIVITY_NODE_RUNNING_VALUE = 7;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_RUNNING_VALUE__RUNNING = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_RUNNING_VALUE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_RUNNING_VALUE__STATES = 2;

	/**
	 * The number of structural features of the '<em>Activity Node running Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_RUNNING_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Activity Node running Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_RUNNING_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.ActivityNode_outgoing_ValueImpl <em>Activity Node outgoing Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.ActivityNode_outgoing_ValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getActivityNode_outgoing_Value()
	 * @generated
	 */
	int ACTIVITY_NODE_OUTGOING_VALUE = 8;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_OUTGOING_VALUE__OUTGOING = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_OUTGOING_VALUE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_OUTGOING_VALUE__STATES = 2;

	/**
	 * The number of structural features of the '<em>Activity Node outgoing Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_OUTGOING_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Activity Node outgoing Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_OUTGOING_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.ActivityNode_incoming_ValueImpl <em>Activity Node incoming Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.ActivityNode_incoming_ValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getActivityNode_incoming_Value()
	 * @generated
	 */
	int ACTIVITY_NODE_INCOMING_VALUE = 9;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_INCOMING_VALUE__INCOMING = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_INCOMING_VALUE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_INCOMING_VALUE__STATES = 2;

	/**
	 * The number of structural features of the '<em>Activity Node incoming Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_INCOMING_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Activity Node incoming Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_INCOMING_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.ActivityNode_heldTokens_ValueImpl <em>Activity Node held Tokens Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.ActivityNode_heldTokens_ValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getActivityNode_heldTokens_Value()
	 * @generated
	 */
	int ACTIVITY_NODE_HELD_TOKENS_VALUE = 10;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_HELD_TOKENS_VALUE__HELD_TOKENS = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_HELD_TOKENS_VALUE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_HELD_TOKENS_VALUE__STATES = 2;

	/**
	 * The number of structural features of the '<em>Activity Node held Tokens Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_HELD_TOKENS_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Activity Node held Tokens Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_HELD_TOKENS_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.ControlFlow_guard_ValueImpl <em>Control Flow guard Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.ControlFlow_guard_ValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getControlFlow_guard_Value()
	 * @generated
	 */
	int CONTROL_FLOW_GUARD_VALUE = 11;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_GUARD_VALUE__GUARD = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_GUARD_VALUE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_GUARD_VALUE__STATES = 2;

	/**
	 * The number of structural features of the '<em>Control Flow guard Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_GUARD_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Control Flow guard Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_GUARD_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.NamedElement_name_ValueImpl <em>Named Element name Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.NamedElement_name_ValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getNamedElement_name_Value()
	 * @generated
	 */
	int NAMED_ELEMENT_NAME_VALUE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_NAME_VALUE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_NAME_VALUE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_NAME_VALUE__STATES = 2;

	/**
	 * The number of structural features of the '<em>Named Element name Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_NAME_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Named Element name Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_NAME_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.BooleanValue_value_ValueImpl <em>Boolean Value value Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.BooleanValue_value_ValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getBooleanValue_value_Value()
	 * @generated
	 */
	int BOOLEAN_VALUE_VALUE_VALUE = 13;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_VALUE_VALUE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_VALUE_VALUE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_VALUE_VALUE__STATES = 2;

	/**
	 * The number of structural features of the '<em>Boolean Value value Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_VALUE_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Boolean Value value Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_VALUE_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.IntegerCalculationExpression_operator_ValueImpl <em>Integer Calculation Expression operator Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.IntegerCalculationExpression_operator_ValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getIntegerCalculationExpression_operator_Value()
	 * @generated
	 */
	int INTEGER_CALCULATION_EXPRESSION_OPERATOR_VALUE = 14;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CALCULATION_EXPRESSION_OPERATOR_VALUE__OPERATOR = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CALCULATION_EXPRESSION_OPERATOR_VALUE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CALCULATION_EXPRESSION_OPERATOR_VALUE__STATES = 2;

	/**
	 * The number of structural features of the '<em>Integer Calculation Expression operator Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CALCULATION_EXPRESSION_OPERATOR_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Integer Calculation Expression operator Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CALCULATION_EXPRESSION_OPERATOR_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.IntegerCalculationExpression_assignee_ValueImpl <em>Integer Calculation Expression assignee Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.IntegerCalculationExpression_assignee_ValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getIntegerCalculationExpression_assignee_Value()
	 * @generated
	 */
	int INTEGER_CALCULATION_EXPRESSION_ASSIGNEE_VALUE = 15;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CALCULATION_EXPRESSION_ASSIGNEE_VALUE__ASSIGNEE = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CALCULATION_EXPRESSION_ASSIGNEE_VALUE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CALCULATION_EXPRESSION_ASSIGNEE_VALUE__STATES = 2;

	/**
	 * The number of structural features of the '<em>Integer Calculation Expression assignee Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CALCULATION_EXPRESSION_ASSIGNEE_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Integer Calculation Expression assignee Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CALCULATION_EXPRESSION_ASSIGNEE_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.OpaqueAction_expressions_ValueImpl <em>Opaque Action expressions Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.OpaqueAction_expressions_ValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getOpaqueAction_expressions_Value()
	 * @generated
	 */
	int OPAQUE_ACTION_EXPRESSIONS_VALUE = 16;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_EXPRESSIONS_VALUE__EXPRESSIONS = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_EXPRESSIONS_VALUE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_EXPRESSIONS_VALUE__STATES = 2;

	/**
	 * The number of structural features of the '<em>Opaque Action expressions Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_EXPRESSIONS_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Opaque Action expressions Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_EXPRESSIONS_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.Variable_initialValue_ValueImpl <em>Variable initial Value Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.Variable_initialValue_ValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getVariable_initialValue_Value()
	 * @generated
	 */
	int VARIABLE_INITIAL_VALUE_VALUE = 17;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_INITIAL_VALUE_VALUE__INITIAL_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_INITIAL_VALUE_VALUE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_INITIAL_VALUE_VALUE__STATES = 2;

	/**
	 * The number of structural features of the '<em>Variable initial Value Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_INITIAL_VALUE_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Variable initial Value Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_INITIAL_VALUE_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.Variable_name_ValueImpl <em>Variable name Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.Variable_name_ValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getVariable_name_Value()
	 * @generated
	 */
	int VARIABLE_NAME_VALUE = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_NAME_VALUE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_NAME_VALUE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_NAME_VALUE__STATES = 2;

	/**
	 * The number of structural features of the '<em>Variable name Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_NAME_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Variable name Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_NAME_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.Variable_currentValue_ValueImpl <em>Variable current Value Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.Variable_currentValue_ValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getVariable_currentValue_Value()
	 * @generated
	 */
	int VARIABLE_CURRENT_VALUE_VALUE = 19;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CURRENT_VALUE_VALUE__CURRENT_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CURRENT_VALUE_VALUE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CURRENT_VALUE_VALUE__STATES = 2;

	/**
	 * The number of structural features of the '<em>Variable current Value Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CURRENT_VALUE_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Variable current Value Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CURRENT_VALUE_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.Token_holder_ValueImpl <em>Token holder Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.Token_holder_ValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getToken_holder_Value()
	 * @generated
	 */
	int TOKEN_HOLDER_VALUE = 20;

	/**
	 * The feature id for the '<em><b>Holder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_HOLDER_VALUE__HOLDER = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_HOLDER_VALUE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_HOLDER_VALUE__STATES = 2;

	/**
	 * The number of structural features of the '<em>Token holder Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_HOLDER_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Token holder Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_HOLDER_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.Input_inputValues_ValueImpl <em>Input input Values Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.Input_inputValues_ValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getInput_inputValues_Value()
	 * @generated
	 */
	int INPUT_INPUT_VALUES_VALUE = 21;

	/**
	 * The feature id for the '<em><b>Input Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_INPUT_VALUES_VALUE__INPUT_VALUES = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_INPUT_VALUES_VALUE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_INPUT_VALUES_VALUE__STATES = 2;

	/**
	 * The number of structural features of the '<em>Input input Values Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_INPUT_VALUES_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Input input Values Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_INPUT_VALUES_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.IntegerValue_value_ValueImpl <em>Integer Value value Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.IntegerValue_value_ValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getIntegerValue_value_Value()
	 * @generated
	 */
	int INTEGER_VALUE_VALUE_VALUE = 22;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_VALUE_VALUE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_VALUE_VALUE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_VALUE_VALUE__STATES = 2;

	/**
	 * The number of structural features of the '<em>Integer Value value Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_VALUE_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Integer Value value Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_VALUE_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.Activity_locals_ValueImpl <em>Activity locals Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.Activity_locals_ValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getActivity_locals_Value()
	 * @generated
	 */
	int ACTIVITY_LOCALS_VALUE = 23;

	/**
	 * The feature id for the '<em><b>Locals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LOCALS_VALUE__LOCALS = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LOCALS_VALUE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LOCALS_VALUE__STATES = 2;

	/**
	 * The number of structural features of the '<em>Activity locals Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LOCALS_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Activity locals Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LOCALS_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.Activity_edges_ValueImpl <em>Activity edges Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.Activity_edges_ValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getActivity_edges_Value()
	 * @generated
	 */
	int ACTIVITY_EDGES_VALUE = 24;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGES_VALUE__EDGES = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGES_VALUE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGES_VALUE__STATES = 2;

	/**
	 * The number of structural features of the '<em>Activity edges Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGES_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Activity edges Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGES_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.Activity_inputs_ValueImpl <em>Activity inputs Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.Activity_inputs_ValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getActivity_inputs_Value()
	 * @generated
	 */
	int ACTIVITY_INPUTS_VALUE = 25;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_INPUTS_VALUE__INPUTS = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_INPUTS_VALUE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_INPUTS_VALUE__STATES = 2;

	/**
	 * The number of structural features of the '<em>Activity inputs Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_INPUTS_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Activity inputs Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_INPUTS_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.Activity_nodes_ValueImpl <em>Activity nodes Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.Activity_nodes_ValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getActivity_nodes_Value()
	 * @generated
	 */
	int ACTIVITY_NODES_VALUE = 26;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODES_VALUE__NODES = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODES_VALUE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODES_VALUE__STATES = 2;

	/**
	 * The number of structural features of the '<em>Activity nodes Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODES_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Activity nodes Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODES_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.Activity_trace_ValueImpl <em>Activity trace Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.Activity_trace_ValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getActivity_trace_Value()
	 * @generated
	 */
	int ACTIVITY_TRACE_VALUE = 27;

	/**
	 * The feature id for the '<em><b>Trace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_TRACE_VALUE__TRACE = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_TRACE_VALUE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_TRACE_VALUE__STATES = 2;

	/**
	 * The number of structural features of the '<em>Activity trace Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_TRACE_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Activity trace Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_TRACE_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.Offer_offeredTokens_ValueImpl <em>Offer offered Tokens Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.Offer_offeredTokens_ValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getOffer_offeredTokens_Value()
	 * @generated
	 */
	int OFFER_OFFERED_TOKENS_VALUE = 28;

	/**
	 * The feature id for the '<em><b>Offered Tokens</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_OFFERED_TOKENS_VALUE__OFFERED_TOKENS = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_OFFERED_TOKENS_VALUE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_OFFERED_TOKENS_VALUE__STATES = 2;

	/**
	 * The number of structural features of the '<em>Offer offered Tokens Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_OFFERED_TOKENS_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Offer offered Tokens Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_OFFERED_TOKENS_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.ForkedToken_remainingOffersCount_ValueImpl <em>Forked Token remaining Offers Count Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.ForkedToken_remainingOffersCount_ValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getForkedToken_remainingOffersCount_Value()
	 * @generated
	 */
	int FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE = 29;

	/**
	 * The feature id for the '<em><b>Remaining Offers Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE__REMAINING_OFFERS_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE__STATES = 2;

	/**
	 * The number of structural features of the '<em>Forked Token remaining Offers Count Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Forked Token remaining Offers Count Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.ForkedToken_baseToken_ValueImpl <em>Forked Token base Token Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.ForkedToken_baseToken_ValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getForkedToken_baseToken_Value()
	 * @generated
	 */
	int FORKED_TOKEN_BASE_TOKEN_VALUE = 30;

	/**
	 * The feature id for the '<em><b>Base Token</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN_BASE_TOKEN_VALUE__BASE_TOKEN = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN_BASE_TOKEN_VALUE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN_BASE_TOKEN_VALUE__STATES = 2;

	/**
	 * The number of structural features of the '<em>Forked Token base Token Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN_BASE_TOKEN_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Forked Token base Token Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN_BASE_TOKEN_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.IntegerExpression_operand2_ValueImpl <em>Integer Expression operand2 Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.IntegerExpression_operand2_ValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getIntegerExpression_operand2_Value()
	 * @generated
	 */
	int INTEGER_EXPRESSION_OPERAND2_VALUE = 31;

	/**
	 * The feature id for the '<em><b>Operand2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXPRESSION_OPERAND2_VALUE__OPERAND2 = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXPRESSION_OPERAND2_VALUE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXPRESSION_OPERAND2_VALUE__STATES = 2;

	/**
	 * The number of structural features of the '<em>Integer Expression operand2 Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXPRESSION_OPERAND2_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Integer Expression operand2 Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXPRESSION_OPERAND2_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.IntegerExpression_operand1_ValueImpl <em>Integer Expression operand1 Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.IntegerExpression_operand1_ValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getIntegerExpression_operand1_Value()
	 * @generated
	 */
	int INTEGER_EXPRESSION_OPERAND1_VALUE = 32;

	/**
	 * The feature id for the '<em><b>Operand1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXPRESSION_OPERAND1_VALUE__OPERAND1 = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXPRESSION_OPERAND1_VALUE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXPRESSION_OPERAND1_VALUE__STATES = 2;

	/**
	 * The number of structural features of the '<em>Integer Expression operand1 Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXPRESSION_OPERAND1_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Integer Expression operand1 Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXPRESSION_OPERAND1_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.BooleanExpression_assignee_ValueImpl <em>Boolean Expression assignee Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.BooleanExpression_assignee_ValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getBooleanExpression_assignee_Value()
	 * @generated
	 */
	int BOOLEAN_EXPRESSION_ASSIGNEE_VALUE = 33;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_ASSIGNEE_VALUE__ASSIGNEE = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_ASSIGNEE_VALUE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_ASSIGNEE_VALUE__STATES = 2;

	/**
	 * The number of structural features of the '<em>Boolean Expression assignee Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_ASSIGNEE_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Boolean Expression assignee Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_ASSIGNEE_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.BooleanUnaryExpression_operator_ValueImpl <em>Boolean Unary Expression operator Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.BooleanUnaryExpression_operator_ValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getBooleanUnaryExpression_operator_Value()
	 * @generated
	 */
	int BOOLEAN_UNARY_EXPRESSION_OPERATOR_VALUE = 34;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_UNARY_EXPRESSION_OPERATOR_VALUE__OPERATOR = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_UNARY_EXPRESSION_OPERATOR_VALUE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_UNARY_EXPRESSION_OPERATOR_VALUE__STATES = 2;

	/**
	 * The number of structural features of the '<em>Boolean Unary Expression operator Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_UNARY_EXPRESSION_OPERATOR_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Boolean Unary Expression operator Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_UNARY_EXPRESSION_OPERATOR_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.BooleanUnaryExpression_operand_ValueImpl <em>Boolean Unary Expression operand Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.BooleanUnaryExpression_operand_ValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getBooleanUnaryExpression_operand_Value()
	 * @generated
	 */
	int BOOLEAN_UNARY_EXPRESSION_OPERAND_VALUE = 35;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_UNARY_EXPRESSION_OPERAND_VALUE__OPERAND = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_UNARY_EXPRESSION_OPERAND_VALUE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_UNARY_EXPRESSION_OPERAND_VALUE__STATES = 2;

	/**
	 * The number of structural features of the '<em>Boolean Unary Expression operand Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_UNARY_EXPRESSION_OPERAND_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Boolean Unary Expression operand Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_UNARY_EXPRESSION_OPERAND_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.BooleanBinaryExpression_operand2_ValueImpl <em>Boolean Binary Expression operand2 Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.BooleanBinaryExpression_operand2_ValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getBooleanBinaryExpression_operand2_Value()
	 * @generated
	 */
	int BOOLEAN_BINARY_EXPRESSION_OPERAND2_VALUE = 36;

	/**
	 * The feature id for the '<em><b>Operand2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BINARY_EXPRESSION_OPERAND2_VALUE__OPERAND2 = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BINARY_EXPRESSION_OPERAND2_VALUE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BINARY_EXPRESSION_OPERAND2_VALUE__STATES = 2;

	/**
	 * The number of structural features of the '<em>Boolean Binary Expression operand2 Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BINARY_EXPRESSION_OPERAND2_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Boolean Binary Expression operand2 Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BINARY_EXPRESSION_OPERAND2_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.BooleanBinaryExpression_operator_ValueImpl <em>Boolean Binary Expression operator Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.BooleanBinaryExpression_operator_ValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getBooleanBinaryExpression_operator_Value()
	 * @generated
	 */
	int BOOLEAN_BINARY_EXPRESSION_OPERATOR_VALUE = 37;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BINARY_EXPRESSION_OPERATOR_VALUE__OPERATOR = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BINARY_EXPRESSION_OPERATOR_VALUE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BINARY_EXPRESSION_OPERATOR_VALUE__STATES = 2;

	/**
	 * The number of structural features of the '<em>Boolean Binary Expression operator Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BINARY_EXPRESSION_OPERATOR_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Boolean Binary Expression operator Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BINARY_EXPRESSION_OPERATOR_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.BooleanBinaryExpression_operand1_ValueImpl <em>Boolean Binary Expression operand1 Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.BooleanBinaryExpression_operand1_ValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getBooleanBinaryExpression_operand1_Value()
	 * @generated
	 */
	int BOOLEAN_BINARY_EXPRESSION_OPERAND1_VALUE = 38;

	/**
	 * The feature id for the '<em><b>Operand1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BINARY_EXPRESSION_OPERAND1_VALUE__OPERAND1 = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BINARY_EXPRESSION_OPERAND1_VALUE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BINARY_EXPRESSION_OPERAND1_VALUE__STATES = 2;

	/**
	 * The number of structural features of the '<em>Boolean Binary Expression operand1 Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BINARY_EXPRESSION_OPERAND1_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Boolean Binary Expression operand1 Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BINARY_EXPRESSION_OPERAND1_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.Trace_executedNodes_ValueImpl <em>Trace executed Nodes Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.Trace_executedNodes_ValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getTrace_executedNodes_Value()
	 * @generated
	 */
	int TRACE_EXECUTED_NODES_VALUE = 39;

	/**
	 * The feature id for the '<em><b>Executed Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_EXECUTED_NODES_VALUE__EXECUTED_NODES = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_EXECUTED_NODES_VALUE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_EXECUTED_NODES_VALUE__STATES = 2;

	/**
	 * The number of structural features of the '<em>Trace executed Nodes Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_EXECUTED_NODES_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Trace executed Nodes Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_EXECUTED_NODES_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.InputValue_value_ValueImpl <em>Input Value value Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.InputValue_value_ValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getInputValue_value_Value()
	 * @generated
	 */
	int INPUT_VALUE_VALUE_VALUE = 40;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VALUE_VALUE_VALUE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VALUE_VALUE_VALUE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VALUE_VALUE_VALUE__STATES = 2;

	/**
	 * The number of structural features of the '<em>Input Value value Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VALUE_VALUE_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Input Value value Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VALUE_VALUE_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.InputValue_variable_ValueImpl <em>Input Value variable Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.InputValue_variable_ValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getInputValue_variable_Value()
	 * @generated
	 */
	int INPUT_VALUE_VARIABLE_VALUE = 41;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VALUE_VARIABLE_VALUE__VARIABLE = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VALUE_VARIABLE_VALUE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VALUE_VARIABLE_VALUE__STATES = 2;

	/**
	 * The number of structural features of the '<em>Input Value variable Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VALUE_VARIABLE_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Input Value variable Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VALUE_VARIABLE_VALUE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see activitydiagramTrace.States.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.State#getStartedSteps <em>Started Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Started Steps</em>'.
	 * @see activitydiagramTrace.States.State#getStartedSteps()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_StartedSteps();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.State#getEndedSteps <em>Ended Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ended Steps</em>'.
	 * @see activitydiagramTrace.States.State#getEndedSteps()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_EndedSteps();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.State#getIntegerComparisonExpression_operator_Values <em>Integer Comparison Expression operator Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Integer Comparison Expression operator Values</em>'.
	 * @see activitydiagramTrace.States.State#getIntegerComparisonExpression_operator_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_IntegerComparisonExpression_operator_Values();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.State#getIntegerComparisonExpression_assignee_Values <em>Integer Comparison Expression assignee Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Integer Comparison Expression assignee Values</em>'.
	 * @see activitydiagramTrace.States.State#getIntegerComparisonExpression_assignee_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_IntegerComparisonExpression_assignee_Values();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.State#getActivityEdge_target_Values <em>Activity Edge target Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activity Edge target Values</em>'.
	 * @see activitydiagramTrace.States.State#getActivityEdge_target_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ActivityEdge_target_Values();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.State#getActivityEdge_offers_Values <em>Activity Edge offers Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activity Edge offers Values</em>'.
	 * @see activitydiagramTrace.States.State#getActivityEdge_offers_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ActivityEdge_offers_Values();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.State#getActivityEdge_source_Values <em>Activity Edge source Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activity Edge source Values</em>'.
	 * @see activitydiagramTrace.States.State#getActivityEdge_source_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ActivityEdge_source_Values();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.State#getActivityNode_activity_Values <em>Activity Node activity Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activity Node activity Values</em>'.
	 * @see activitydiagramTrace.States.State#getActivityNode_activity_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ActivityNode_activity_Values();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.State#getActivityNode_running_Values <em>Activity Node running Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activity Node running Values</em>'.
	 * @see activitydiagramTrace.States.State#getActivityNode_running_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ActivityNode_running_Values();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.State#getActivityNode_outgoing_Values <em>Activity Node outgoing Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activity Node outgoing Values</em>'.
	 * @see activitydiagramTrace.States.State#getActivityNode_outgoing_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ActivityNode_outgoing_Values();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.State#getActivityNode_incoming_Values <em>Activity Node incoming Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activity Node incoming Values</em>'.
	 * @see activitydiagramTrace.States.State#getActivityNode_incoming_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ActivityNode_incoming_Values();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.State#getActivityNode_heldTokens_Values <em>Activity Node held Tokens Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activity Node held Tokens Values</em>'.
	 * @see activitydiagramTrace.States.State#getActivityNode_heldTokens_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ActivityNode_heldTokens_Values();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.State#getControlFlow_guard_Values <em>Control Flow guard Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Control Flow guard Values</em>'.
	 * @see activitydiagramTrace.States.State#getControlFlow_guard_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ControlFlow_guard_Values();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.State#getNamedElement_name_Values <em>Named Element name Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Named Element name Values</em>'.
	 * @see activitydiagramTrace.States.State#getNamedElement_name_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_NamedElement_name_Values();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.State#getBooleanValue_value_Values <em>Boolean Value value Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Boolean Value value Values</em>'.
	 * @see activitydiagramTrace.States.State#getBooleanValue_value_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_BooleanValue_value_Values();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.State#getIntegerCalculationExpression_operator_Values <em>Integer Calculation Expression operator Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Integer Calculation Expression operator Values</em>'.
	 * @see activitydiagramTrace.States.State#getIntegerCalculationExpression_operator_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_IntegerCalculationExpression_operator_Values();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.State#getIntegerCalculationExpression_assignee_Values <em>Integer Calculation Expression assignee Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Integer Calculation Expression assignee Values</em>'.
	 * @see activitydiagramTrace.States.State#getIntegerCalculationExpression_assignee_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_IntegerCalculationExpression_assignee_Values();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.State#getOpaqueAction_expressions_Values <em>Opaque Action expressions Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Opaque Action expressions Values</em>'.
	 * @see activitydiagramTrace.States.State#getOpaqueAction_expressions_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_OpaqueAction_expressions_Values();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.State#getVariable_initialValue_Values <em>Variable initial Value Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Variable initial Value Values</em>'.
	 * @see activitydiagramTrace.States.State#getVariable_initialValue_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Variable_initialValue_Values();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.State#getVariable_name_Values <em>Variable name Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Variable name Values</em>'.
	 * @see activitydiagramTrace.States.State#getVariable_name_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Variable_name_Values();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.State#getVariable_currentValue_Values <em>Variable current Value Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Variable current Value Values</em>'.
	 * @see activitydiagramTrace.States.State#getVariable_currentValue_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Variable_currentValue_Values();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.State#getToken_holder_Values <em>Token holder Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Token holder Values</em>'.
	 * @see activitydiagramTrace.States.State#getToken_holder_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Token_holder_Values();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.State#getInput_inputValues_Values <em>Input input Values Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input input Values Values</em>'.
	 * @see activitydiagramTrace.States.State#getInput_inputValues_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Input_inputValues_Values();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.State#getIntegerValue_value_Values <em>Integer Value value Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Integer Value value Values</em>'.
	 * @see activitydiagramTrace.States.State#getIntegerValue_value_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_IntegerValue_value_Values();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.State#getActivity_locals_Values <em>Activity locals Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activity locals Values</em>'.
	 * @see activitydiagramTrace.States.State#getActivity_locals_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Activity_locals_Values();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.State#getActivity_edges_Values <em>Activity edges Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activity edges Values</em>'.
	 * @see activitydiagramTrace.States.State#getActivity_edges_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Activity_edges_Values();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.State#getActivity_inputs_Values <em>Activity inputs Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activity inputs Values</em>'.
	 * @see activitydiagramTrace.States.State#getActivity_inputs_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Activity_inputs_Values();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.State#getActivity_nodes_Values <em>Activity nodes Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activity nodes Values</em>'.
	 * @see activitydiagramTrace.States.State#getActivity_nodes_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Activity_nodes_Values();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.State#getActivity_trace_Values <em>Activity trace Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activity trace Values</em>'.
	 * @see activitydiagramTrace.States.State#getActivity_trace_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Activity_trace_Values();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.State#getOffer_offeredTokens_Values <em>Offer offered Tokens Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Offer offered Tokens Values</em>'.
	 * @see activitydiagramTrace.States.State#getOffer_offeredTokens_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Offer_offeredTokens_Values();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.State#getForkedToken_remainingOffersCount_Values <em>Forked Token remaining Offers Count Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Forked Token remaining Offers Count Values</em>'.
	 * @see activitydiagramTrace.States.State#getForkedToken_remainingOffersCount_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ForkedToken_remainingOffersCount_Values();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.State#getForkedToken_baseToken_Values <em>Forked Token base Token Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Forked Token base Token Values</em>'.
	 * @see activitydiagramTrace.States.State#getForkedToken_baseToken_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ForkedToken_baseToken_Values();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.State#getIntegerExpression_operand2_Values <em>Integer Expression operand2 Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Integer Expression operand2 Values</em>'.
	 * @see activitydiagramTrace.States.State#getIntegerExpression_operand2_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_IntegerExpression_operand2_Values();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.State#getIntegerExpression_operand1_Values <em>Integer Expression operand1 Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Integer Expression operand1 Values</em>'.
	 * @see activitydiagramTrace.States.State#getIntegerExpression_operand1_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_IntegerExpression_operand1_Values();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.State#getBooleanExpression_assignee_Values <em>Boolean Expression assignee Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Boolean Expression assignee Values</em>'.
	 * @see activitydiagramTrace.States.State#getBooleanExpression_assignee_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_BooleanExpression_assignee_Values();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.State#getBooleanUnaryExpression_operator_Values <em>Boolean Unary Expression operator Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Boolean Unary Expression operator Values</em>'.
	 * @see activitydiagramTrace.States.State#getBooleanUnaryExpression_operator_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_BooleanUnaryExpression_operator_Values();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.State#getBooleanUnaryExpression_operand_Values <em>Boolean Unary Expression operand Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Boolean Unary Expression operand Values</em>'.
	 * @see activitydiagramTrace.States.State#getBooleanUnaryExpression_operand_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_BooleanUnaryExpression_operand_Values();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.State#getBooleanBinaryExpression_operand2_Values <em>Boolean Binary Expression operand2 Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Boolean Binary Expression operand2 Values</em>'.
	 * @see activitydiagramTrace.States.State#getBooleanBinaryExpression_operand2_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_BooleanBinaryExpression_operand2_Values();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.State#getBooleanBinaryExpression_operator_Values <em>Boolean Binary Expression operator Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Boolean Binary Expression operator Values</em>'.
	 * @see activitydiagramTrace.States.State#getBooleanBinaryExpression_operator_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_BooleanBinaryExpression_operator_Values();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.State#getBooleanBinaryExpression_operand1_Values <em>Boolean Binary Expression operand1 Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Boolean Binary Expression operand1 Values</em>'.
	 * @see activitydiagramTrace.States.State#getBooleanBinaryExpression_operand1_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_BooleanBinaryExpression_operand1_Values();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.State#getTrace_executedNodes_Values <em>Trace executed Nodes Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Trace executed Nodes Values</em>'.
	 * @see activitydiagramTrace.States.State#getTrace_executedNodes_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Trace_executedNodes_Values();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.State#getInputValue_value_Values <em>Input Value value Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Value value Values</em>'.
	 * @see activitydiagramTrace.States.State#getInputValue_value_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_InputValue_value_Values();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.State#getInputValue_variable_Values <em>Input Value variable Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Value variable Values</em>'.
	 * @see activitydiagramTrace.States.State#getInputValue_variable_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_InputValue_variable_Values();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.IntegerComparisonExpression_operator_Value <em>Integer Comparison Expression operator Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Comparison Expression operator Value</em>'.
	 * @see activitydiagramTrace.States.IntegerComparisonExpression_operator_Value
	 * @generated
	 */
	EClass getIntegerComparisonExpression_operator_Value();

	/**
	 * Returns the meta object for the attribute '{@link activitydiagramTrace.States.IntegerComparisonExpression_operator_Value#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see activitydiagramTrace.States.IntegerComparisonExpression_operator_Value#getOperator()
	 * @see #getIntegerComparisonExpression_operator_Value()
	 * @generated
	 */
	EAttribute getIntegerComparisonExpression_operator_Value_Operator();

	/**
	 * Returns the meta object for the container reference '{@link activitydiagramTrace.States.IntegerComparisonExpression_operator_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see activitydiagramTrace.States.IntegerComparisonExpression_operator_Value#getParent()
	 * @see #getIntegerComparisonExpression_operator_Value()
	 * @generated
	 */
	EReference getIntegerComparisonExpression_operator_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.IntegerComparisonExpression_operator_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see activitydiagramTrace.States.IntegerComparisonExpression_operator_Value#getStates()
	 * @see #getIntegerComparisonExpression_operator_Value()
	 * @generated
	 */
	EReference getIntegerComparisonExpression_operator_Value_States();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.IntegerComparisonExpression_assignee_Value <em>Integer Comparison Expression assignee Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Comparison Expression assignee Value</em>'.
	 * @see activitydiagramTrace.States.IntegerComparisonExpression_assignee_Value
	 * @generated
	 */
	EClass getIntegerComparisonExpression_assignee_Value();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.States.IntegerComparisonExpression_assignee_Value#getAssignee <em>Assignee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assignee</em>'.
	 * @see activitydiagramTrace.States.IntegerComparisonExpression_assignee_Value#getAssignee()
	 * @see #getIntegerComparisonExpression_assignee_Value()
	 * @generated
	 */
	EReference getIntegerComparisonExpression_assignee_Value_Assignee();

	/**
	 * Returns the meta object for the container reference '{@link activitydiagramTrace.States.IntegerComparisonExpression_assignee_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see activitydiagramTrace.States.IntegerComparisonExpression_assignee_Value#getParent()
	 * @see #getIntegerComparisonExpression_assignee_Value()
	 * @generated
	 */
	EReference getIntegerComparisonExpression_assignee_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.IntegerComparisonExpression_assignee_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see activitydiagramTrace.States.IntegerComparisonExpression_assignee_Value#getStates()
	 * @see #getIntegerComparisonExpression_assignee_Value()
	 * @generated
	 */
	EReference getIntegerComparisonExpression_assignee_Value_States();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.ActivityEdge_target_Value <em>Activity Edge target Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Edge target Value</em>'.
	 * @see activitydiagramTrace.States.ActivityEdge_target_Value
	 * @generated
	 */
	EClass getActivityEdge_target_Value();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.States.ActivityEdge_target_Value#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see activitydiagramTrace.States.ActivityEdge_target_Value#getTarget()
	 * @see #getActivityEdge_target_Value()
	 * @generated
	 */
	EReference getActivityEdge_target_Value_Target();

	/**
	 * Returns the meta object for the container reference '{@link activitydiagramTrace.States.ActivityEdge_target_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see activitydiagramTrace.States.ActivityEdge_target_Value#getParent()
	 * @see #getActivityEdge_target_Value()
	 * @generated
	 */
	EReference getActivityEdge_target_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.ActivityEdge_target_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see activitydiagramTrace.States.ActivityEdge_target_Value#getStates()
	 * @see #getActivityEdge_target_Value()
	 * @generated
	 */
	EReference getActivityEdge_target_Value_States();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.ActivityEdge_offers_Value <em>Activity Edge offers Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Edge offers Value</em>'.
	 * @see activitydiagramTrace.States.ActivityEdge_offers_Value
	 * @generated
	 */
	EClass getActivityEdge_offers_Value();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.ActivityEdge_offers_Value#getOffers <em>Offers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Offers</em>'.
	 * @see activitydiagramTrace.States.ActivityEdge_offers_Value#getOffers()
	 * @see #getActivityEdge_offers_Value()
	 * @generated
	 */
	EReference getActivityEdge_offers_Value_Offers();

	/**
	 * Returns the meta object for the container reference '{@link activitydiagramTrace.States.ActivityEdge_offers_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see activitydiagramTrace.States.ActivityEdge_offers_Value#getParent()
	 * @see #getActivityEdge_offers_Value()
	 * @generated
	 */
	EReference getActivityEdge_offers_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.ActivityEdge_offers_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see activitydiagramTrace.States.ActivityEdge_offers_Value#getStates()
	 * @see #getActivityEdge_offers_Value()
	 * @generated
	 */
	EReference getActivityEdge_offers_Value_States();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.ActivityEdge_source_Value <em>Activity Edge source Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Edge source Value</em>'.
	 * @see activitydiagramTrace.States.ActivityEdge_source_Value
	 * @generated
	 */
	EClass getActivityEdge_source_Value();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.States.ActivityEdge_source_Value#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see activitydiagramTrace.States.ActivityEdge_source_Value#getSource()
	 * @see #getActivityEdge_source_Value()
	 * @generated
	 */
	EReference getActivityEdge_source_Value_Source();

	/**
	 * Returns the meta object for the container reference '{@link activitydiagramTrace.States.ActivityEdge_source_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see activitydiagramTrace.States.ActivityEdge_source_Value#getParent()
	 * @see #getActivityEdge_source_Value()
	 * @generated
	 */
	EReference getActivityEdge_source_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.ActivityEdge_source_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see activitydiagramTrace.States.ActivityEdge_source_Value#getStates()
	 * @see #getActivityEdge_source_Value()
	 * @generated
	 */
	EReference getActivityEdge_source_Value_States();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.ActivityNode_activity_Value <em>Activity Node activity Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Node activity Value</em>'.
	 * @see activitydiagramTrace.States.ActivityNode_activity_Value
	 * @generated
	 */
	EClass getActivityNode_activity_Value();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.States.ActivityNode_activity_Value#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activity</em>'.
	 * @see activitydiagramTrace.States.ActivityNode_activity_Value#getActivity()
	 * @see #getActivityNode_activity_Value()
	 * @generated
	 */
	EReference getActivityNode_activity_Value_Activity();

	/**
	 * Returns the meta object for the container reference '{@link activitydiagramTrace.States.ActivityNode_activity_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see activitydiagramTrace.States.ActivityNode_activity_Value#getParent()
	 * @see #getActivityNode_activity_Value()
	 * @generated
	 */
	EReference getActivityNode_activity_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.ActivityNode_activity_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see activitydiagramTrace.States.ActivityNode_activity_Value#getStates()
	 * @see #getActivityNode_activity_Value()
	 * @generated
	 */
	EReference getActivityNode_activity_Value_States();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.ActivityNode_running_Value <em>Activity Node running Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Node running Value</em>'.
	 * @see activitydiagramTrace.States.ActivityNode_running_Value
	 * @generated
	 */
	EClass getActivityNode_running_Value();

	/**
	 * Returns the meta object for the attribute '{@link activitydiagramTrace.States.ActivityNode_running_Value#isRunning <em>Running</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Running</em>'.
	 * @see activitydiagramTrace.States.ActivityNode_running_Value#isRunning()
	 * @see #getActivityNode_running_Value()
	 * @generated
	 */
	EAttribute getActivityNode_running_Value_Running();

	/**
	 * Returns the meta object for the container reference '{@link activitydiagramTrace.States.ActivityNode_running_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see activitydiagramTrace.States.ActivityNode_running_Value#getParent()
	 * @see #getActivityNode_running_Value()
	 * @generated
	 */
	EReference getActivityNode_running_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.ActivityNode_running_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see activitydiagramTrace.States.ActivityNode_running_Value#getStates()
	 * @see #getActivityNode_running_Value()
	 * @generated
	 */
	EReference getActivityNode_running_Value_States();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.ActivityNode_outgoing_Value <em>Activity Node outgoing Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Node outgoing Value</em>'.
	 * @see activitydiagramTrace.States.ActivityNode_outgoing_Value
	 * @generated
	 */
	EClass getActivityNode_outgoing_Value();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.ActivityNode_outgoing_Value#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see activitydiagramTrace.States.ActivityNode_outgoing_Value#getOutgoing()
	 * @see #getActivityNode_outgoing_Value()
	 * @generated
	 */
	EReference getActivityNode_outgoing_Value_Outgoing();

	/**
	 * Returns the meta object for the container reference '{@link activitydiagramTrace.States.ActivityNode_outgoing_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see activitydiagramTrace.States.ActivityNode_outgoing_Value#getParent()
	 * @see #getActivityNode_outgoing_Value()
	 * @generated
	 */
	EReference getActivityNode_outgoing_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.ActivityNode_outgoing_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see activitydiagramTrace.States.ActivityNode_outgoing_Value#getStates()
	 * @see #getActivityNode_outgoing_Value()
	 * @generated
	 */
	EReference getActivityNode_outgoing_Value_States();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.ActivityNode_incoming_Value <em>Activity Node incoming Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Node incoming Value</em>'.
	 * @see activitydiagramTrace.States.ActivityNode_incoming_Value
	 * @generated
	 */
	EClass getActivityNode_incoming_Value();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.ActivityNode_incoming_Value#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see activitydiagramTrace.States.ActivityNode_incoming_Value#getIncoming()
	 * @see #getActivityNode_incoming_Value()
	 * @generated
	 */
	EReference getActivityNode_incoming_Value_Incoming();

	/**
	 * Returns the meta object for the container reference '{@link activitydiagramTrace.States.ActivityNode_incoming_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see activitydiagramTrace.States.ActivityNode_incoming_Value#getParent()
	 * @see #getActivityNode_incoming_Value()
	 * @generated
	 */
	EReference getActivityNode_incoming_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.ActivityNode_incoming_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see activitydiagramTrace.States.ActivityNode_incoming_Value#getStates()
	 * @see #getActivityNode_incoming_Value()
	 * @generated
	 */
	EReference getActivityNode_incoming_Value_States();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.ActivityNode_heldTokens_Value <em>Activity Node held Tokens Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Node held Tokens Value</em>'.
	 * @see activitydiagramTrace.States.ActivityNode_heldTokens_Value
	 * @generated
	 */
	EClass getActivityNode_heldTokens_Value();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.ActivityNode_heldTokens_Value#getHeldTokens <em>Held Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Held Tokens</em>'.
	 * @see activitydiagramTrace.States.ActivityNode_heldTokens_Value#getHeldTokens()
	 * @see #getActivityNode_heldTokens_Value()
	 * @generated
	 */
	EReference getActivityNode_heldTokens_Value_HeldTokens();

	/**
	 * Returns the meta object for the container reference '{@link activitydiagramTrace.States.ActivityNode_heldTokens_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see activitydiagramTrace.States.ActivityNode_heldTokens_Value#getParent()
	 * @see #getActivityNode_heldTokens_Value()
	 * @generated
	 */
	EReference getActivityNode_heldTokens_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.ActivityNode_heldTokens_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see activitydiagramTrace.States.ActivityNode_heldTokens_Value#getStates()
	 * @see #getActivityNode_heldTokens_Value()
	 * @generated
	 */
	EReference getActivityNode_heldTokens_Value_States();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.ControlFlow_guard_Value <em>Control Flow guard Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Flow guard Value</em>'.
	 * @see activitydiagramTrace.States.ControlFlow_guard_Value
	 * @generated
	 */
	EClass getControlFlow_guard_Value();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.States.ControlFlow_guard_Value#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Guard</em>'.
	 * @see activitydiagramTrace.States.ControlFlow_guard_Value#getGuard()
	 * @see #getControlFlow_guard_Value()
	 * @generated
	 */
	EReference getControlFlow_guard_Value_Guard();

	/**
	 * Returns the meta object for the container reference '{@link activitydiagramTrace.States.ControlFlow_guard_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see activitydiagramTrace.States.ControlFlow_guard_Value#getParent()
	 * @see #getControlFlow_guard_Value()
	 * @generated
	 */
	EReference getControlFlow_guard_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.ControlFlow_guard_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see activitydiagramTrace.States.ControlFlow_guard_Value#getStates()
	 * @see #getControlFlow_guard_Value()
	 * @generated
	 */
	EReference getControlFlow_guard_Value_States();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.NamedElement_name_Value <em>Named Element name Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element name Value</em>'.
	 * @see activitydiagramTrace.States.NamedElement_name_Value
	 * @generated
	 */
	EClass getNamedElement_name_Value();

	/**
	 * Returns the meta object for the attribute '{@link activitydiagramTrace.States.NamedElement_name_Value#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see activitydiagramTrace.States.NamedElement_name_Value#getName()
	 * @see #getNamedElement_name_Value()
	 * @generated
	 */
	EAttribute getNamedElement_name_Value_Name();

	/**
	 * Returns the meta object for the container reference '{@link activitydiagramTrace.States.NamedElement_name_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see activitydiagramTrace.States.NamedElement_name_Value#getParent()
	 * @see #getNamedElement_name_Value()
	 * @generated
	 */
	EReference getNamedElement_name_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.NamedElement_name_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see activitydiagramTrace.States.NamedElement_name_Value#getStates()
	 * @see #getNamedElement_name_Value()
	 * @generated
	 */
	EReference getNamedElement_name_Value_States();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.BooleanValue_value_Value <em>Boolean Value value Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Value value Value</em>'.
	 * @see activitydiagramTrace.States.BooleanValue_value_Value
	 * @generated
	 */
	EClass getBooleanValue_value_Value();

	/**
	 * Returns the meta object for the attribute '{@link activitydiagramTrace.States.BooleanValue_value_Value#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see activitydiagramTrace.States.BooleanValue_value_Value#isValue()
	 * @see #getBooleanValue_value_Value()
	 * @generated
	 */
	EAttribute getBooleanValue_value_Value_Value();

	/**
	 * Returns the meta object for the container reference '{@link activitydiagramTrace.States.BooleanValue_value_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see activitydiagramTrace.States.BooleanValue_value_Value#getParent()
	 * @see #getBooleanValue_value_Value()
	 * @generated
	 */
	EReference getBooleanValue_value_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.BooleanValue_value_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see activitydiagramTrace.States.BooleanValue_value_Value#getStates()
	 * @see #getBooleanValue_value_Value()
	 * @generated
	 */
	EReference getBooleanValue_value_Value_States();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.IntegerCalculationExpression_operator_Value <em>Integer Calculation Expression operator Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Calculation Expression operator Value</em>'.
	 * @see activitydiagramTrace.States.IntegerCalculationExpression_operator_Value
	 * @generated
	 */
	EClass getIntegerCalculationExpression_operator_Value();

	/**
	 * Returns the meta object for the attribute '{@link activitydiagramTrace.States.IntegerCalculationExpression_operator_Value#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see activitydiagramTrace.States.IntegerCalculationExpression_operator_Value#getOperator()
	 * @see #getIntegerCalculationExpression_operator_Value()
	 * @generated
	 */
	EAttribute getIntegerCalculationExpression_operator_Value_Operator();

	/**
	 * Returns the meta object for the container reference '{@link activitydiagramTrace.States.IntegerCalculationExpression_operator_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see activitydiagramTrace.States.IntegerCalculationExpression_operator_Value#getParent()
	 * @see #getIntegerCalculationExpression_operator_Value()
	 * @generated
	 */
	EReference getIntegerCalculationExpression_operator_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.IntegerCalculationExpression_operator_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see activitydiagramTrace.States.IntegerCalculationExpression_operator_Value#getStates()
	 * @see #getIntegerCalculationExpression_operator_Value()
	 * @generated
	 */
	EReference getIntegerCalculationExpression_operator_Value_States();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.IntegerCalculationExpression_assignee_Value <em>Integer Calculation Expression assignee Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Calculation Expression assignee Value</em>'.
	 * @see activitydiagramTrace.States.IntegerCalculationExpression_assignee_Value
	 * @generated
	 */
	EClass getIntegerCalculationExpression_assignee_Value();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.States.IntegerCalculationExpression_assignee_Value#getAssignee <em>Assignee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assignee</em>'.
	 * @see activitydiagramTrace.States.IntegerCalculationExpression_assignee_Value#getAssignee()
	 * @see #getIntegerCalculationExpression_assignee_Value()
	 * @generated
	 */
	EReference getIntegerCalculationExpression_assignee_Value_Assignee();

	/**
	 * Returns the meta object for the container reference '{@link activitydiagramTrace.States.IntegerCalculationExpression_assignee_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see activitydiagramTrace.States.IntegerCalculationExpression_assignee_Value#getParent()
	 * @see #getIntegerCalculationExpression_assignee_Value()
	 * @generated
	 */
	EReference getIntegerCalculationExpression_assignee_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.IntegerCalculationExpression_assignee_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see activitydiagramTrace.States.IntegerCalculationExpression_assignee_Value#getStates()
	 * @see #getIntegerCalculationExpression_assignee_Value()
	 * @generated
	 */
	EReference getIntegerCalculationExpression_assignee_Value_States();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.OpaqueAction_expressions_Value <em>Opaque Action expressions Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opaque Action expressions Value</em>'.
	 * @see activitydiagramTrace.States.OpaqueAction_expressions_Value
	 * @generated
	 */
	EClass getOpaqueAction_expressions_Value();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.OpaqueAction_expressions_Value#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Expressions</em>'.
	 * @see activitydiagramTrace.States.OpaqueAction_expressions_Value#getExpressions()
	 * @see #getOpaqueAction_expressions_Value()
	 * @generated
	 */
	EReference getOpaqueAction_expressions_Value_Expressions();

	/**
	 * Returns the meta object for the container reference '{@link activitydiagramTrace.States.OpaqueAction_expressions_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see activitydiagramTrace.States.OpaqueAction_expressions_Value#getParent()
	 * @see #getOpaqueAction_expressions_Value()
	 * @generated
	 */
	EReference getOpaqueAction_expressions_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.OpaqueAction_expressions_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see activitydiagramTrace.States.OpaqueAction_expressions_Value#getStates()
	 * @see #getOpaqueAction_expressions_Value()
	 * @generated
	 */
	EReference getOpaqueAction_expressions_Value_States();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.Variable_initialValue_Value <em>Variable initial Value Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable initial Value Value</em>'.
	 * @see activitydiagramTrace.States.Variable_initialValue_Value
	 * @generated
	 */
	EClass getVariable_initialValue_Value();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.States.Variable_initialValue_Value#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial Value</em>'.
	 * @see activitydiagramTrace.States.Variable_initialValue_Value#getInitialValue()
	 * @see #getVariable_initialValue_Value()
	 * @generated
	 */
	EReference getVariable_initialValue_Value_InitialValue();

	/**
	 * Returns the meta object for the container reference '{@link activitydiagramTrace.States.Variable_initialValue_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see activitydiagramTrace.States.Variable_initialValue_Value#getParent()
	 * @see #getVariable_initialValue_Value()
	 * @generated
	 */
	EReference getVariable_initialValue_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.Variable_initialValue_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see activitydiagramTrace.States.Variable_initialValue_Value#getStates()
	 * @see #getVariable_initialValue_Value()
	 * @generated
	 */
	EReference getVariable_initialValue_Value_States();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.Variable_name_Value <em>Variable name Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable name Value</em>'.
	 * @see activitydiagramTrace.States.Variable_name_Value
	 * @generated
	 */
	EClass getVariable_name_Value();

	/**
	 * Returns the meta object for the attribute '{@link activitydiagramTrace.States.Variable_name_Value#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see activitydiagramTrace.States.Variable_name_Value#getName()
	 * @see #getVariable_name_Value()
	 * @generated
	 */
	EAttribute getVariable_name_Value_Name();

	/**
	 * Returns the meta object for the container reference '{@link activitydiagramTrace.States.Variable_name_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see activitydiagramTrace.States.Variable_name_Value#getParent()
	 * @see #getVariable_name_Value()
	 * @generated
	 */
	EReference getVariable_name_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.Variable_name_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see activitydiagramTrace.States.Variable_name_Value#getStates()
	 * @see #getVariable_name_Value()
	 * @generated
	 */
	EReference getVariable_name_Value_States();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.Variable_currentValue_Value <em>Variable current Value Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable current Value Value</em>'.
	 * @see activitydiagramTrace.States.Variable_currentValue_Value
	 * @generated
	 */
	EClass getVariable_currentValue_Value();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.States.Variable_currentValue_Value#getCurrentValue <em>Current Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Value</em>'.
	 * @see activitydiagramTrace.States.Variable_currentValue_Value#getCurrentValue()
	 * @see #getVariable_currentValue_Value()
	 * @generated
	 */
	EReference getVariable_currentValue_Value_CurrentValue();

	/**
	 * Returns the meta object for the container reference '{@link activitydiagramTrace.States.Variable_currentValue_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see activitydiagramTrace.States.Variable_currentValue_Value#getParent()
	 * @see #getVariable_currentValue_Value()
	 * @generated
	 */
	EReference getVariable_currentValue_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.Variable_currentValue_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see activitydiagramTrace.States.Variable_currentValue_Value#getStates()
	 * @see #getVariable_currentValue_Value()
	 * @generated
	 */
	EReference getVariable_currentValue_Value_States();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.Token_holder_Value <em>Token holder Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token holder Value</em>'.
	 * @see activitydiagramTrace.States.Token_holder_Value
	 * @generated
	 */
	EClass getToken_holder_Value();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.States.Token_holder_Value#getHolder <em>Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Holder</em>'.
	 * @see activitydiagramTrace.States.Token_holder_Value#getHolder()
	 * @see #getToken_holder_Value()
	 * @generated
	 */
	EReference getToken_holder_Value_Holder();

	/**
	 * Returns the meta object for the container reference '{@link activitydiagramTrace.States.Token_holder_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see activitydiagramTrace.States.Token_holder_Value#getParent()
	 * @see #getToken_holder_Value()
	 * @generated
	 */
	EReference getToken_holder_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.Token_holder_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see activitydiagramTrace.States.Token_holder_Value#getStates()
	 * @see #getToken_holder_Value()
	 * @generated
	 */
	EReference getToken_holder_Value_States();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.Input_inputValues_Value <em>Input input Values Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input input Values Value</em>'.
	 * @see activitydiagramTrace.States.Input_inputValues_Value
	 * @generated
	 */
	EClass getInput_inputValues_Value();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.Input_inputValues_Value#getInputValues <em>Input Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Values</em>'.
	 * @see activitydiagramTrace.States.Input_inputValues_Value#getInputValues()
	 * @see #getInput_inputValues_Value()
	 * @generated
	 */
	EReference getInput_inputValues_Value_InputValues();

	/**
	 * Returns the meta object for the container reference '{@link activitydiagramTrace.States.Input_inputValues_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see activitydiagramTrace.States.Input_inputValues_Value#getParent()
	 * @see #getInput_inputValues_Value()
	 * @generated
	 */
	EReference getInput_inputValues_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.Input_inputValues_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see activitydiagramTrace.States.Input_inputValues_Value#getStates()
	 * @see #getInput_inputValues_Value()
	 * @generated
	 */
	EReference getInput_inputValues_Value_States();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.IntegerValue_value_Value <em>Integer Value value Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Value value Value</em>'.
	 * @see activitydiagramTrace.States.IntegerValue_value_Value
	 * @generated
	 */
	EClass getIntegerValue_value_Value();

	/**
	 * Returns the meta object for the attribute '{@link activitydiagramTrace.States.IntegerValue_value_Value#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see activitydiagramTrace.States.IntegerValue_value_Value#getValue()
	 * @see #getIntegerValue_value_Value()
	 * @generated
	 */
	EAttribute getIntegerValue_value_Value_Value();

	/**
	 * Returns the meta object for the container reference '{@link activitydiagramTrace.States.IntegerValue_value_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see activitydiagramTrace.States.IntegerValue_value_Value#getParent()
	 * @see #getIntegerValue_value_Value()
	 * @generated
	 */
	EReference getIntegerValue_value_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.IntegerValue_value_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see activitydiagramTrace.States.IntegerValue_value_Value#getStates()
	 * @see #getIntegerValue_value_Value()
	 * @generated
	 */
	EReference getIntegerValue_value_Value_States();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.Activity_locals_Value <em>Activity locals Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity locals Value</em>'.
	 * @see activitydiagramTrace.States.Activity_locals_Value
	 * @generated
	 */
	EClass getActivity_locals_Value();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.Activity_locals_Value#getLocals <em>Locals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Locals</em>'.
	 * @see activitydiagramTrace.States.Activity_locals_Value#getLocals()
	 * @see #getActivity_locals_Value()
	 * @generated
	 */
	EReference getActivity_locals_Value_Locals();

	/**
	 * Returns the meta object for the container reference '{@link activitydiagramTrace.States.Activity_locals_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see activitydiagramTrace.States.Activity_locals_Value#getParent()
	 * @see #getActivity_locals_Value()
	 * @generated
	 */
	EReference getActivity_locals_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.Activity_locals_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see activitydiagramTrace.States.Activity_locals_Value#getStates()
	 * @see #getActivity_locals_Value()
	 * @generated
	 */
	EReference getActivity_locals_Value_States();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.Activity_edges_Value <em>Activity edges Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity edges Value</em>'.
	 * @see activitydiagramTrace.States.Activity_edges_Value
	 * @generated
	 */
	EClass getActivity_edges_Value();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.Activity_edges_Value#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Edges</em>'.
	 * @see activitydiagramTrace.States.Activity_edges_Value#getEdges()
	 * @see #getActivity_edges_Value()
	 * @generated
	 */
	EReference getActivity_edges_Value_Edges();

	/**
	 * Returns the meta object for the container reference '{@link activitydiagramTrace.States.Activity_edges_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see activitydiagramTrace.States.Activity_edges_Value#getParent()
	 * @see #getActivity_edges_Value()
	 * @generated
	 */
	EReference getActivity_edges_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.Activity_edges_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see activitydiagramTrace.States.Activity_edges_Value#getStates()
	 * @see #getActivity_edges_Value()
	 * @generated
	 */
	EReference getActivity_edges_Value_States();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.Activity_inputs_Value <em>Activity inputs Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity inputs Value</em>'.
	 * @see activitydiagramTrace.States.Activity_inputs_Value
	 * @generated
	 */
	EClass getActivity_inputs_Value();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.Activity_inputs_Value#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inputs</em>'.
	 * @see activitydiagramTrace.States.Activity_inputs_Value#getInputs()
	 * @see #getActivity_inputs_Value()
	 * @generated
	 */
	EReference getActivity_inputs_Value_Inputs();

	/**
	 * Returns the meta object for the container reference '{@link activitydiagramTrace.States.Activity_inputs_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see activitydiagramTrace.States.Activity_inputs_Value#getParent()
	 * @see #getActivity_inputs_Value()
	 * @generated
	 */
	EReference getActivity_inputs_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.Activity_inputs_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see activitydiagramTrace.States.Activity_inputs_Value#getStates()
	 * @see #getActivity_inputs_Value()
	 * @generated
	 */
	EReference getActivity_inputs_Value_States();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.Activity_nodes_Value <em>Activity nodes Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity nodes Value</em>'.
	 * @see activitydiagramTrace.States.Activity_nodes_Value
	 * @generated
	 */
	EClass getActivity_nodes_Value();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.Activity_nodes_Value#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Nodes</em>'.
	 * @see activitydiagramTrace.States.Activity_nodes_Value#getNodes()
	 * @see #getActivity_nodes_Value()
	 * @generated
	 */
	EReference getActivity_nodes_Value_Nodes();

	/**
	 * Returns the meta object for the container reference '{@link activitydiagramTrace.States.Activity_nodes_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see activitydiagramTrace.States.Activity_nodes_Value#getParent()
	 * @see #getActivity_nodes_Value()
	 * @generated
	 */
	EReference getActivity_nodes_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.Activity_nodes_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see activitydiagramTrace.States.Activity_nodes_Value#getStates()
	 * @see #getActivity_nodes_Value()
	 * @generated
	 */
	EReference getActivity_nodes_Value_States();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.Activity_trace_Value <em>Activity trace Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity trace Value</em>'.
	 * @see activitydiagramTrace.States.Activity_trace_Value
	 * @generated
	 */
	EClass getActivity_trace_Value();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.States.Activity_trace_Value#getTrace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trace</em>'.
	 * @see activitydiagramTrace.States.Activity_trace_Value#getTrace()
	 * @see #getActivity_trace_Value()
	 * @generated
	 */
	EReference getActivity_trace_Value_Trace();

	/**
	 * Returns the meta object for the container reference '{@link activitydiagramTrace.States.Activity_trace_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see activitydiagramTrace.States.Activity_trace_Value#getParent()
	 * @see #getActivity_trace_Value()
	 * @generated
	 */
	EReference getActivity_trace_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.Activity_trace_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see activitydiagramTrace.States.Activity_trace_Value#getStates()
	 * @see #getActivity_trace_Value()
	 * @generated
	 */
	EReference getActivity_trace_Value_States();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.Offer_offeredTokens_Value <em>Offer offered Tokens Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Offer offered Tokens Value</em>'.
	 * @see activitydiagramTrace.States.Offer_offeredTokens_Value
	 * @generated
	 */
	EClass getOffer_offeredTokens_Value();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.Offer_offeredTokens_Value#getOfferedTokens <em>Offered Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Offered Tokens</em>'.
	 * @see activitydiagramTrace.States.Offer_offeredTokens_Value#getOfferedTokens()
	 * @see #getOffer_offeredTokens_Value()
	 * @generated
	 */
	EReference getOffer_offeredTokens_Value_OfferedTokens();

	/**
	 * Returns the meta object for the container reference '{@link activitydiagramTrace.States.Offer_offeredTokens_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see activitydiagramTrace.States.Offer_offeredTokens_Value#getParent()
	 * @see #getOffer_offeredTokens_Value()
	 * @generated
	 */
	EReference getOffer_offeredTokens_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.Offer_offeredTokens_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see activitydiagramTrace.States.Offer_offeredTokens_Value#getStates()
	 * @see #getOffer_offeredTokens_Value()
	 * @generated
	 */
	EReference getOffer_offeredTokens_Value_States();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value <em>Forked Token remaining Offers Count Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forked Token remaining Offers Count Value</em>'.
	 * @see activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value
	 * @generated
	 */
	EClass getForkedToken_remainingOffersCount_Value();

	/**
	 * Returns the meta object for the attribute '{@link activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value#getRemainingOffersCount <em>Remaining Offers Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remaining Offers Count</em>'.
	 * @see activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value#getRemainingOffersCount()
	 * @see #getForkedToken_remainingOffersCount_Value()
	 * @generated
	 */
	EAttribute getForkedToken_remainingOffersCount_Value_RemainingOffersCount();

	/**
	 * Returns the meta object for the container reference '{@link activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value#getParent()
	 * @see #getForkedToken_remainingOffersCount_Value()
	 * @generated
	 */
	EReference getForkedToken_remainingOffersCount_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value#getStates()
	 * @see #getForkedToken_remainingOffersCount_Value()
	 * @generated
	 */
	EReference getForkedToken_remainingOffersCount_Value_States();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.ForkedToken_baseToken_Value <em>Forked Token base Token Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forked Token base Token Value</em>'.
	 * @see activitydiagramTrace.States.ForkedToken_baseToken_Value
	 * @generated
	 */
	EClass getForkedToken_baseToken_Value();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.States.ForkedToken_baseToken_Value#getBaseToken <em>Base Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Token</em>'.
	 * @see activitydiagramTrace.States.ForkedToken_baseToken_Value#getBaseToken()
	 * @see #getForkedToken_baseToken_Value()
	 * @generated
	 */
	EReference getForkedToken_baseToken_Value_BaseToken();

	/**
	 * Returns the meta object for the container reference '{@link activitydiagramTrace.States.ForkedToken_baseToken_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see activitydiagramTrace.States.ForkedToken_baseToken_Value#getParent()
	 * @see #getForkedToken_baseToken_Value()
	 * @generated
	 */
	EReference getForkedToken_baseToken_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.ForkedToken_baseToken_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see activitydiagramTrace.States.ForkedToken_baseToken_Value#getStates()
	 * @see #getForkedToken_baseToken_Value()
	 * @generated
	 */
	EReference getForkedToken_baseToken_Value_States();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.IntegerExpression_operand2_Value <em>Integer Expression operand2 Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Expression operand2 Value</em>'.
	 * @see activitydiagramTrace.States.IntegerExpression_operand2_Value
	 * @generated
	 */
	EClass getIntegerExpression_operand2_Value();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.States.IntegerExpression_operand2_Value#getOperand2 <em>Operand2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operand2</em>'.
	 * @see activitydiagramTrace.States.IntegerExpression_operand2_Value#getOperand2()
	 * @see #getIntegerExpression_operand2_Value()
	 * @generated
	 */
	EReference getIntegerExpression_operand2_Value_Operand2();

	/**
	 * Returns the meta object for the container reference '{@link activitydiagramTrace.States.IntegerExpression_operand2_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see activitydiagramTrace.States.IntegerExpression_operand2_Value#getParent()
	 * @see #getIntegerExpression_operand2_Value()
	 * @generated
	 */
	EReference getIntegerExpression_operand2_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.IntegerExpression_operand2_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see activitydiagramTrace.States.IntegerExpression_operand2_Value#getStates()
	 * @see #getIntegerExpression_operand2_Value()
	 * @generated
	 */
	EReference getIntegerExpression_operand2_Value_States();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.IntegerExpression_operand1_Value <em>Integer Expression operand1 Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Expression operand1 Value</em>'.
	 * @see activitydiagramTrace.States.IntegerExpression_operand1_Value
	 * @generated
	 */
	EClass getIntegerExpression_operand1_Value();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.States.IntegerExpression_operand1_Value#getOperand1 <em>Operand1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operand1</em>'.
	 * @see activitydiagramTrace.States.IntegerExpression_operand1_Value#getOperand1()
	 * @see #getIntegerExpression_operand1_Value()
	 * @generated
	 */
	EReference getIntegerExpression_operand1_Value_Operand1();

	/**
	 * Returns the meta object for the container reference '{@link activitydiagramTrace.States.IntegerExpression_operand1_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see activitydiagramTrace.States.IntegerExpression_operand1_Value#getParent()
	 * @see #getIntegerExpression_operand1_Value()
	 * @generated
	 */
	EReference getIntegerExpression_operand1_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.IntegerExpression_operand1_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see activitydiagramTrace.States.IntegerExpression_operand1_Value#getStates()
	 * @see #getIntegerExpression_operand1_Value()
	 * @generated
	 */
	EReference getIntegerExpression_operand1_Value_States();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.BooleanExpression_assignee_Value <em>Boolean Expression assignee Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Expression assignee Value</em>'.
	 * @see activitydiagramTrace.States.BooleanExpression_assignee_Value
	 * @generated
	 */
	EClass getBooleanExpression_assignee_Value();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.States.BooleanExpression_assignee_Value#getAssignee <em>Assignee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assignee</em>'.
	 * @see activitydiagramTrace.States.BooleanExpression_assignee_Value#getAssignee()
	 * @see #getBooleanExpression_assignee_Value()
	 * @generated
	 */
	EReference getBooleanExpression_assignee_Value_Assignee();

	/**
	 * Returns the meta object for the container reference '{@link activitydiagramTrace.States.BooleanExpression_assignee_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see activitydiagramTrace.States.BooleanExpression_assignee_Value#getParent()
	 * @see #getBooleanExpression_assignee_Value()
	 * @generated
	 */
	EReference getBooleanExpression_assignee_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.BooleanExpression_assignee_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see activitydiagramTrace.States.BooleanExpression_assignee_Value#getStates()
	 * @see #getBooleanExpression_assignee_Value()
	 * @generated
	 */
	EReference getBooleanExpression_assignee_Value_States();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.BooleanUnaryExpression_operator_Value <em>Boolean Unary Expression operator Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Unary Expression operator Value</em>'.
	 * @see activitydiagramTrace.States.BooleanUnaryExpression_operator_Value
	 * @generated
	 */
	EClass getBooleanUnaryExpression_operator_Value();

	/**
	 * Returns the meta object for the attribute '{@link activitydiagramTrace.States.BooleanUnaryExpression_operator_Value#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see activitydiagramTrace.States.BooleanUnaryExpression_operator_Value#getOperator()
	 * @see #getBooleanUnaryExpression_operator_Value()
	 * @generated
	 */
	EAttribute getBooleanUnaryExpression_operator_Value_Operator();

	/**
	 * Returns the meta object for the container reference '{@link activitydiagramTrace.States.BooleanUnaryExpression_operator_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see activitydiagramTrace.States.BooleanUnaryExpression_operator_Value#getParent()
	 * @see #getBooleanUnaryExpression_operator_Value()
	 * @generated
	 */
	EReference getBooleanUnaryExpression_operator_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.BooleanUnaryExpression_operator_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see activitydiagramTrace.States.BooleanUnaryExpression_operator_Value#getStates()
	 * @see #getBooleanUnaryExpression_operator_Value()
	 * @generated
	 */
	EReference getBooleanUnaryExpression_operator_Value_States();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.BooleanUnaryExpression_operand_Value <em>Boolean Unary Expression operand Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Unary Expression operand Value</em>'.
	 * @see activitydiagramTrace.States.BooleanUnaryExpression_operand_Value
	 * @generated
	 */
	EClass getBooleanUnaryExpression_operand_Value();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.States.BooleanUnaryExpression_operand_Value#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operand</em>'.
	 * @see activitydiagramTrace.States.BooleanUnaryExpression_operand_Value#getOperand()
	 * @see #getBooleanUnaryExpression_operand_Value()
	 * @generated
	 */
	EReference getBooleanUnaryExpression_operand_Value_Operand();

	/**
	 * Returns the meta object for the container reference '{@link activitydiagramTrace.States.BooleanUnaryExpression_operand_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see activitydiagramTrace.States.BooleanUnaryExpression_operand_Value#getParent()
	 * @see #getBooleanUnaryExpression_operand_Value()
	 * @generated
	 */
	EReference getBooleanUnaryExpression_operand_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.BooleanUnaryExpression_operand_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see activitydiagramTrace.States.BooleanUnaryExpression_operand_Value#getStates()
	 * @see #getBooleanUnaryExpression_operand_Value()
	 * @generated
	 */
	EReference getBooleanUnaryExpression_operand_Value_States();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.BooleanBinaryExpression_operand2_Value <em>Boolean Binary Expression operand2 Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Binary Expression operand2 Value</em>'.
	 * @see activitydiagramTrace.States.BooleanBinaryExpression_operand2_Value
	 * @generated
	 */
	EClass getBooleanBinaryExpression_operand2_Value();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.States.BooleanBinaryExpression_operand2_Value#getOperand2 <em>Operand2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operand2</em>'.
	 * @see activitydiagramTrace.States.BooleanBinaryExpression_operand2_Value#getOperand2()
	 * @see #getBooleanBinaryExpression_operand2_Value()
	 * @generated
	 */
	EReference getBooleanBinaryExpression_operand2_Value_Operand2();

	/**
	 * Returns the meta object for the container reference '{@link activitydiagramTrace.States.BooleanBinaryExpression_operand2_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see activitydiagramTrace.States.BooleanBinaryExpression_operand2_Value#getParent()
	 * @see #getBooleanBinaryExpression_operand2_Value()
	 * @generated
	 */
	EReference getBooleanBinaryExpression_operand2_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.BooleanBinaryExpression_operand2_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see activitydiagramTrace.States.BooleanBinaryExpression_operand2_Value#getStates()
	 * @see #getBooleanBinaryExpression_operand2_Value()
	 * @generated
	 */
	EReference getBooleanBinaryExpression_operand2_Value_States();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.BooleanBinaryExpression_operator_Value <em>Boolean Binary Expression operator Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Binary Expression operator Value</em>'.
	 * @see activitydiagramTrace.States.BooleanBinaryExpression_operator_Value
	 * @generated
	 */
	EClass getBooleanBinaryExpression_operator_Value();

	/**
	 * Returns the meta object for the attribute '{@link activitydiagramTrace.States.BooleanBinaryExpression_operator_Value#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see activitydiagramTrace.States.BooleanBinaryExpression_operator_Value#getOperator()
	 * @see #getBooleanBinaryExpression_operator_Value()
	 * @generated
	 */
	EAttribute getBooleanBinaryExpression_operator_Value_Operator();

	/**
	 * Returns the meta object for the container reference '{@link activitydiagramTrace.States.BooleanBinaryExpression_operator_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see activitydiagramTrace.States.BooleanBinaryExpression_operator_Value#getParent()
	 * @see #getBooleanBinaryExpression_operator_Value()
	 * @generated
	 */
	EReference getBooleanBinaryExpression_operator_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.BooleanBinaryExpression_operator_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see activitydiagramTrace.States.BooleanBinaryExpression_operator_Value#getStates()
	 * @see #getBooleanBinaryExpression_operator_Value()
	 * @generated
	 */
	EReference getBooleanBinaryExpression_operator_Value_States();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.BooleanBinaryExpression_operand1_Value <em>Boolean Binary Expression operand1 Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Binary Expression operand1 Value</em>'.
	 * @see activitydiagramTrace.States.BooleanBinaryExpression_operand1_Value
	 * @generated
	 */
	EClass getBooleanBinaryExpression_operand1_Value();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.States.BooleanBinaryExpression_operand1_Value#getOperand1 <em>Operand1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operand1</em>'.
	 * @see activitydiagramTrace.States.BooleanBinaryExpression_operand1_Value#getOperand1()
	 * @see #getBooleanBinaryExpression_operand1_Value()
	 * @generated
	 */
	EReference getBooleanBinaryExpression_operand1_Value_Operand1();

	/**
	 * Returns the meta object for the container reference '{@link activitydiagramTrace.States.BooleanBinaryExpression_operand1_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see activitydiagramTrace.States.BooleanBinaryExpression_operand1_Value#getParent()
	 * @see #getBooleanBinaryExpression_operand1_Value()
	 * @generated
	 */
	EReference getBooleanBinaryExpression_operand1_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.BooleanBinaryExpression_operand1_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see activitydiagramTrace.States.BooleanBinaryExpression_operand1_Value#getStates()
	 * @see #getBooleanBinaryExpression_operand1_Value()
	 * @generated
	 */
	EReference getBooleanBinaryExpression_operand1_Value_States();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.Trace_executedNodes_Value <em>Trace executed Nodes Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace executed Nodes Value</em>'.
	 * @see activitydiagramTrace.States.Trace_executedNodes_Value
	 * @generated
	 */
	EClass getTrace_executedNodes_Value();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.Trace_executedNodes_Value#getExecutedNodes <em>Executed Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Executed Nodes</em>'.
	 * @see activitydiagramTrace.States.Trace_executedNodes_Value#getExecutedNodes()
	 * @see #getTrace_executedNodes_Value()
	 * @generated
	 */
	EReference getTrace_executedNodes_Value_ExecutedNodes();

	/**
	 * Returns the meta object for the container reference '{@link activitydiagramTrace.States.Trace_executedNodes_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see activitydiagramTrace.States.Trace_executedNodes_Value#getParent()
	 * @see #getTrace_executedNodes_Value()
	 * @generated
	 */
	EReference getTrace_executedNodes_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.Trace_executedNodes_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see activitydiagramTrace.States.Trace_executedNodes_Value#getStates()
	 * @see #getTrace_executedNodes_Value()
	 * @generated
	 */
	EReference getTrace_executedNodes_Value_States();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.InputValue_value_Value <em>Input Value value Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Value value Value</em>'.
	 * @see activitydiagramTrace.States.InputValue_value_Value
	 * @generated
	 */
	EClass getInputValue_value_Value();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.States.InputValue_value_Value#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see activitydiagramTrace.States.InputValue_value_Value#getValue()
	 * @see #getInputValue_value_Value()
	 * @generated
	 */
	EReference getInputValue_value_Value_Value();

	/**
	 * Returns the meta object for the container reference '{@link activitydiagramTrace.States.InputValue_value_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see activitydiagramTrace.States.InputValue_value_Value#getParent()
	 * @see #getInputValue_value_Value()
	 * @generated
	 */
	EReference getInputValue_value_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.InputValue_value_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see activitydiagramTrace.States.InputValue_value_Value#getStates()
	 * @see #getInputValue_value_Value()
	 * @generated
	 */
	EReference getInputValue_value_Value_States();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.InputValue_variable_Value <em>Input Value variable Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Value variable Value</em>'.
	 * @see activitydiagramTrace.States.InputValue_variable_Value
	 * @generated
	 */
	EClass getInputValue_variable_Value();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.States.InputValue_variable_Value#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see activitydiagramTrace.States.InputValue_variable_Value#getVariable()
	 * @see #getInputValue_variable_Value()
	 * @generated
	 */
	EReference getInputValue_variable_Value_Variable();

	/**
	 * Returns the meta object for the container reference '{@link activitydiagramTrace.States.InputValue_variable_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see activitydiagramTrace.States.InputValue_variable_Value#getParent()
	 * @see #getInputValue_variable_Value()
	 * @generated
	 */
	EReference getInputValue_variable_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.InputValue_variable_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see activitydiagramTrace.States.InputValue_variable_Value#getStates()
	 * @see #getInputValue_variable_Value()
	 * @generated
	 */
	EReference getInputValue_variable_Value_States();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StatesFactory getStatesFactory();

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
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.StateImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Started Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__STARTED_STEPS = eINSTANCE.getState_StartedSteps();

		/**
		 * The meta object literal for the '<em><b>Ended Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ENDED_STEPS = eINSTANCE.getState_EndedSteps();

		/**
		 * The meta object literal for the '<em><b>Integer Comparison Expression operator Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__INTEGER_COMPARISON_EXPRESSION_OPERATOR_VALUES = eINSTANCE.getState_IntegerComparisonExpression_operator_Values();

		/**
		 * The meta object literal for the '<em><b>Integer Comparison Expression assignee Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__INTEGER_COMPARISON_EXPRESSION_ASSIGNEE_VALUES = eINSTANCE.getState_IntegerComparisonExpression_assignee_Values();

		/**
		 * The meta object literal for the '<em><b>Activity Edge target Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ACTIVITY_EDGE_TARGET_VALUES = eINSTANCE.getState_ActivityEdge_target_Values();

		/**
		 * The meta object literal for the '<em><b>Activity Edge offers Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ACTIVITY_EDGE_OFFERS_VALUES = eINSTANCE.getState_ActivityEdge_offers_Values();

		/**
		 * The meta object literal for the '<em><b>Activity Edge source Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ACTIVITY_EDGE_SOURCE_VALUES = eINSTANCE.getState_ActivityEdge_source_Values();

		/**
		 * The meta object literal for the '<em><b>Activity Node activity Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ACTIVITY_NODE_ACTIVITY_VALUES = eINSTANCE.getState_ActivityNode_activity_Values();

		/**
		 * The meta object literal for the '<em><b>Activity Node running Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ACTIVITY_NODE_RUNNING_VALUES = eINSTANCE.getState_ActivityNode_running_Values();

		/**
		 * The meta object literal for the '<em><b>Activity Node outgoing Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ACTIVITY_NODE_OUTGOING_VALUES = eINSTANCE.getState_ActivityNode_outgoing_Values();

		/**
		 * The meta object literal for the '<em><b>Activity Node incoming Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ACTIVITY_NODE_INCOMING_VALUES = eINSTANCE.getState_ActivityNode_incoming_Values();

		/**
		 * The meta object literal for the '<em><b>Activity Node held Tokens Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ACTIVITY_NODE_HELD_TOKENS_VALUES = eINSTANCE.getState_ActivityNode_heldTokens_Values();

		/**
		 * The meta object literal for the '<em><b>Control Flow guard Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__CONTROL_FLOW_GUARD_VALUES = eINSTANCE.getState_ControlFlow_guard_Values();

		/**
		 * The meta object literal for the '<em><b>Named Element name Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__NAMED_ELEMENT_NAME_VALUES = eINSTANCE.getState_NamedElement_name_Values();

		/**
		 * The meta object literal for the '<em><b>Boolean Value value Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__BOOLEAN_VALUE_VALUE_VALUES = eINSTANCE.getState_BooleanValue_value_Values();

		/**
		 * The meta object literal for the '<em><b>Integer Calculation Expression operator Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__INTEGER_CALCULATION_EXPRESSION_OPERATOR_VALUES = eINSTANCE.getState_IntegerCalculationExpression_operator_Values();

		/**
		 * The meta object literal for the '<em><b>Integer Calculation Expression assignee Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__INTEGER_CALCULATION_EXPRESSION_ASSIGNEE_VALUES = eINSTANCE.getState_IntegerCalculationExpression_assignee_Values();

		/**
		 * The meta object literal for the '<em><b>Opaque Action expressions Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__OPAQUE_ACTION_EXPRESSIONS_VALUES = eINSTANCE.getState_OpaqueAction_expressions_Values();

		/**
		 * The meta object literal for the '<em><b>Variable initial Value Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__VARIABLE_INITIAL_VALUE_VALUES = eINSTANCE.getState_Variable_initialValue_Values();

		/**
		 * The meta object literal for the '<em><b>Variable name Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__VARIABLE_NAME_VALUES = eINSTANCE.getState_Variable_name_Values();

		/**
		 * The meta object literal for the '<em><b>Variable current Value Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__VARIABLE_CURRENT_VALUE_VALUES = eINSTANCE.getState_Variable_currentValue_Values();

		/**
		 * The meta object literal for the '<em><b>Token holder Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__TOKEN_HOLDER_VALUES = eINSTANCE.getState_Token_holder_Values();

		/**
		 * The meta object literal for the '<em><b>Input input Values Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__INPUT_INPUT_VALUES_VALUES = eINSTANCE.getState_Input_inputValues_Values();

		/**
		 * The meta object literal for the '<em><b>Integer Value value Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__INTEGER_VALUE_VALUE_VALUES = eINSTANCE.getState_IntegerValue_value_Values();

		/**
		 * The meta object literal for the '<em><b>Activity locals Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ACTIVITY_LOCALS_VALUES = eINSTANCE.getState_Activity_locals_Values();

		/**
		 * The meta object literal for the '<em><b>Activity edges Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ACTIVITY_EDGES_VALUES = eINSTANCE.getState_Activity_edges_Values();

		/**
		 * The meta object literal for the '<em><b>Activity inputs Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ACTIVITY_INPUTS_VALUES = eINSTANCE.getState_Activity_inputs_Values();

		/**
		 * The meta object literal for the '<em><b>Activity nodes Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ACTIVITY_NODES_VALUES = eINSTANCE.getState_Activity_nodes_Values();

		/**
		 * The meta object literal for the '<em><b>Activity trace Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ACTIVITY_TRACE_VALUES = eINSTANCE.getState_Activity_trace_Values();

		/**
		 * The meta object literal for the '<em><b>Offer offered Tokens Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__OFFER_OFFERED_TOKENS_VALUES = eINSTANCE.getState_Offer_offeredTokens_Values();

		/**
		 * The meta object literal for the '<em><b>Forked Token remaining Offers Count Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUES = eINSTANCE.getState_ForkedToken_remainingOffersCount_Values();

		/**
		 * The meta object literal for the '<em><b>Forked Token base Token Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__FORKED_TOKEN_BASE_TOKEN_VALUES = eINSTANCE.getState_ForkedToken_baseToken_Values();

		/**
		 * The meta object literal for the '<em><b>Integer Expression operand2 Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__INTEGER_EXPRESSION_OPERAND2_VALUES = eINSTANCE.getState_IntegerExpression_operand2_Values();

		/**
		 * The meta object literal for the '<em><b>Integer Expression operand1 Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__INTEGER_EXPRESSION_OPERAND1_VALUES = eINSTANCE.getState_IntegerExpression_operand1_Values();

		/**
		 * The meta object literal for the '<em><b>Boolean Expression assignee Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__BOOLEAN_EXPRESSION_ASSIGNEE_VALUES = eINSTANCE.getState_BooleanExpression_assignee_Values();

		/**
		 * The meta object literal for the '<em><b>Boolean Unary Expression operator Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__BOOLEAN_UNARY_EXPRESSION_OPERATOR_VALUES = eINSTANCE.getState_BooleanUnaryExpression_operator_Values();

		/**
		 * The meta object literal for the '<em><b>Boolean Unary Expression operand Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__BOOLEAN_UNARY_EXPRESSION_OPERAND_VALUES = eINSTANCE.getState_BooleanUnaryExpression_operand_Values();

		/**
		 * The meta object literal for the '<em><b>Boolean Binary Expression operand2 Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__BOOLEAN_BINARY_EXPRESSION_OPERAND2_VALUES = eINSTANCE.getState_BooleanBinaryExpression_operand2_Values();

		/**
		 * The meta object literal for the '<em><b>Boolean Binary Expression operator Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__BOOLEAN_BINARY_EXPRESSION_OPERATOR_VALUES = eINSTANCE.getState_BooleanBinaryExpression_operator_Values();

		/**
		 * The meta object literal for the '<em><b>Boolean Binary Expression operand1 Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__BOOLEAN_BINARY_EXPRESSION_OPERAND1_VALUES = eINSTANCE.getState_BooleanBinaryExpression_operand1_Values();

		/**
		 * The meta object literal for the '<em><b>Trace executed Nodes Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__TRACE_EXECUTED_NODES_VALUES = eINSTANCE.getState_Trace_executedNodes_Values();

		/**
		 * The meta object literal for the '<em><b>Input Value value Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__INPUT_VALUE_VALUE_VALUES = eINSTANCE.getState_InputValue_value_Values();

		/**
		 * The meta object literal for the '<em><b>Input Value variable Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__INPUT_VALUE_VARIABLE_VALUES = eINSTANCE.getState_InputValue_variable_Values();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.IntegerComparisonExpression_operator_ValueImpl <em>Integer Comparison Expression operator Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.IntegerComparisonExpression_operator_ValueImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getIntegerComparisonExpression_operator_Value()
		 * @generated
		 */
		EClass INTEGER_COMPARISON_EXPRESSION_OPERATOR_VALUE = eINSTANCE.getIntegerComparisonExpression_operator_Value();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_COMPARISON_EXPRESSION_OPERATOR_VALUE__OPERATOR = eINSTANCE.getIntegerComparisonExpression_operator_Value_Operator();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGER_COMPARISON_EXPRESSION_OPERATOR_VALUE__PARENT = eINSTANCE.getIntegerComparisonExpression_operator_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGER_COMPARISON_EXPRESSION_OPERATOR_VALUE__STATES = eINSTANCE.getIntegerComparisonExpression_operator_Value_States();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.IntegerComparisonExpression_assignee_ValueImpl <em>Integer Comparison Expression assignee Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.IntegerComparisonExpression_assignee_ValueImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getIntegerComparisonExpression_assignee_Value()
		 * @generated
		 */
		EClass INTEGER_COMPARISON_EXPRESSION_ASSIGNEE_VALUE = eINSTANCE.getIntegerComparisonExpression_assignee_Value();

		/**
		 * The meta object literal for the '<em><b>Assignee</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGER_COMPARISON_EXPRESSION_ASSIGNEE_VALUE__ASSIGNEE = eINSTANCE.getIntegerComparisonExpression_assignee_Value_Assignee();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGER_COMPARISON_EXPRESSION_ASSIGNEE_VALUE__PARENT = eINSTANCE.getIntegerComparisonExpression_assignee_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGER_COMPARISON_EXPRESSION_ASSIGNEE_VALUE__STATES = eINSTANCE.getIntegerComparisonExpression_assignee_Value_States();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.ActivityEdge_target_ValueImpl <em>Activity Edge target Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.ActivityEdge_target_ValueImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getActivityEdge_target_Value()
		 * @generated
		 */
		EClass ACTIVITY_EDGE_TARGET_VALUE = eINSTANCE.getActivityEdge_target_Value();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE_TARGET_VALUE__TARGET = eINSTANCE.getActivityEdge_target_Value_Target();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE_TARGET_VALUE__PARENT = eINSTANCE.getActivityEdge_target_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE_TARGET_VALUE__STATES = eINSTANCE.getActivityEdge_target_Value_States();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.ActivityEdge_offers_ValueImpl <em>Activity Edge offers Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.ActivityEdge_offers_ValueImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getActivityEdge_offers_Value()
		 * @generated
		 */
		EClass ACTIVITY_EDGE_OFFERS_VALUE = eINSTANCE.getActivityEdge_offers_Value();

		/**
		 * The meta object literal for the '<em><b>Offers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE_OFFERS_VALUE__OFFERS = eINSTANCE.getActivityEdge_offers_Value_Offers();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE_OFFERS_VALUE__PARENT = eINSTANCE.getActivityEdge_offers_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE_OFFERS_VALUE__STATES = eINSTANCE.getActivityEdge_offers_Value_States();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.ActivityEdge_source_ValueImpl <em>Activity Edge source Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.ActivityEdge_source_ValueImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getActivityEdge_source_Value()
		 * @generated
		 */
		EClass ACTIVITY_EDGE_SOURCE_VALUE = eINSTANCE.getActivityEdge_source_Value();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE_SOURCE_VALUE__SOURCE = eINSTANCE.getActivityEdge_source_Value_Source();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE_SOURCE_VALUE__PARENT = eINSTANCE.getActivityEdge_source_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE_SOURCE_VALUE__STATES = eINSTANCE.getActivityEdge_source_Value_States();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.ActivityNode_activity_ValueImpl <em>Activity Node activity Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.ActivityNode_activity_ValueImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getActivityNode_activity_Value()
		 * @generated
		 */
		EClass ACTIVITY_NODE_ACTIVITY_VALUE = eINSTANCE.getActivityNode_activity_Value();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE_ACTIVITY_VALUE__ACTIVITY = eINSTANCE.getActivityNode_activity_Value_Activity();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE_ACTIVITY_VALUE__PARENT = eINSTANCE.getActivityNode_activity_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE_ACTIVITY_VALUE__STATES = eINSTANCE.getActivityNode_activity_Value_States();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.ActivityNode_running_ValueImpl <em>Activity Node running Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.ActivityNode_running_ValueImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getActivityNode_running_Value()
		 * @generated
		 */
		EClass ACTIVITY_NODE_RUNNING_VALUE = eINSTANCE.getActivityNode_running_Value();

		/**
		 * The meta object literal for the '<em><b>Running</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_NODE_RUNNING_VALUE__RUNNING = eINSTANCE.getActivityNode_running_Value_Running();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE_RUNNING_VALUE__PARENT = eINSTANCE.getActivityNode_running_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE_RUNNING_VALUE__STATES = eINSTANCE.getActivityNode_running_Value_States();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.ActivityNode_outgoing_ValueImpl <em>Activity Node outgoing Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.ActivityNode_outgoing_ValueImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getActivityNode_outgoing_Value()
		 * @generated
		 */
		EClass ACTIVITY_NODE_OUTGOING_VALUE = eINSTANCE.getActivityNode_outgoing_Value();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE_OUTGOING_VALUE__OUTGOING = eINSTANCE.getActivityNode_outgoing_Value_Outgoing();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE_OUTGOING_VALUE__PARENT = eINSTANCE.getActivityNode_outgoing_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE_OUTGOING_VALUE__STATES = eINSTANCE.getActivityNode_outgoing_Value_States();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.ActivityNode_incoming_ValueImpl <em>Activity Node incoming Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.ActivityNode_incoming_ValueImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getActivityNode_incoming_Value()
		 * @generated
		 */
		EClass ACTIVITY_NODE_INCOMING_VALUE = eINSTANCE.getActivityNode_incoming_Value();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE_INCOMING_VALUE__INCOMING = eINSTANCE.getActivityNode_incoming_Value_Incoming();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE_INCOMING_VALUE__PARENT = eINSTANCE.getActivityNode_incoming_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE_INCOMING_VALUE__STATES = eINSTANCE.getActivityNode_incoming_Value_States();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.ActivityNode_heldTokens_ValueImpl <em>Activity Node held Tokens Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.ActivityNode_heldTokens_ValueImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getActivityNode_heldTokens_Value()
		 * @generated
		 */
		EClass ACTIVITY_NODE_HELD_TOKENS_VALUE = eINSTANCE.getActivityNode_heldTokens_Value();

		/**
		 * The meta object literal for the '<em><b>Held Tokens</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE_HELD_TOKENS_VALUE__HELD_TOKENS = eINSTANCE.getActivityNode_heldTokens_Value_HeldTokens();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE_HELD_TOKENS_VALUE__PARENT = eINSTANCE.getActivityNode_heldTokens_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE_HELD_TOKENS_VALUE__STATES = eINSTANCE.getActivityNode_heldTokens_Value_States();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.ControlFlow_guard_ValueImpl <em>Control Flow guard Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.ControlFlow_guard_ValueImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getControlFlow_guard_Value()
		 * @generated
		 */
		EClass CONTROL_FLOW_GUARD_VALUE = eINSTANCE.getControlFlow_guard_Value();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_FLOW_GUARD_VALUE__GUARD = eINSTANCE.getControlFlow_guard_Value_Guard();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_FLOW_GUARD_VALUE__PARENT = eINSTANCE.getControlFlow_guard_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_FLOW_GUARD_VALUE__STATES = eINSTANCE.getControlFlow_guard_Value_States();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.NamedElement_name_ValueImpl <em>Named Element name Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.NamedElement_name_ValueImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getNamedElement_name_Value()
		 * @generated
		 */
		EClass NAMED_ELEMENT_NAME_VALUE = eINSTANCE.getNamedElement_name_Value();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT_NAME_VALUE__NAME = eINSTANCE.getNamedElement_name_Value_Name();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_ELEMENT_NAME_VALUE__PARENT = eINSTANCE.getNamedElement_name_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_ELEMENT_NAME_VALUE__STATES = eINSTANCE.getNamedElement_name_Value_States();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.BooleanValue_value_ValueImpl <em>Boolean Value value Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.BooleanValue_value_ValueImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getBooleanValue_value_Value()
		 * @generated
		 */
		EClass BOOLEAN_VALUE_VALUE_VALUE = eINSTANCE.getBooleanValue_value_Value();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_VALUE_VALUE_VALUE__VALUE = eINSTANCE.getBooleanValue_value_Value_Value();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_VALUE_VALUE_VALUE__PARENT = eINSTANCE.getBooleanValue_value_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_VALUE_VALUE_VALUE__STATES = eINSTANCE.getBooleanValue_value_Value_States();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.IntegerCalculationExpression_operator_ValueImpl <em>Integer Calculation Expression operator Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.IntegerCalculationExpression_operator_ValueImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getIntegerCalculationExpression_operator_Value()
		 * @generated
		 */
		EClass INTEGER_CALCULATION_EXPRESSION_OPERATOR_VALUE = eINSTANCE.getIntegerCalculationExpression_operator_Value();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_CALCULATION_EXPRESSION_OPERATOR_VALUE__OPERATOR = eINSTANCE.getIntegerCalculationExpression_operator_Value_Operator();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGER_CALCULATION_EXPRESSION_OPERATOR_VALUE__PARENT = eINSTANCE.getIntegerCalculationExpression_operator_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGER_CALCULATION_EXPRESSION_OPERATOR_VALUE__STATES = eINSTANCE.getIntegerCalculationExpression_operator_Value_States();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.IntegerCalculationExpression_assignee_ValueImpl <em>Integer Calculation Expression assignee Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.IntegerCalculationExpression_assignee_ValueImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getIntegerCalculationExpression_assignee_Value()
		 * @generated
		 */
		EClass INTEGER_CALCULATION_EXPRESSION_ASSIGNEE_VALUE = eINSTANCE.getIntegerCalculationExpression_assignee_Value();

		/**
		 * The meta object literal for the '<em><b>Assignee</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGER_CALCULATION_EXPRESSION_ASSIGNEE_VALUE__ASSIGNEE = eINSTANCE.getIntegerCalculationExpression_assignee_Value_Assignee();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGER_CALCULATION_EXPRESSION_ASSIGNEE_VALUE__PARENT = eINSTANCE.getIntegerCalculationExpression_assignee_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGER_CALCULATION_EXPRESSION_ASSIGNEE_VALUE__STATES = eINSTANCE.getIntegerCalculationExpression_assignee_Value_States();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.OpaqueAction_expressions_ValueImpl <em>Opaque Action expressions Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.OpaqueAction_expressions_ValueImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getOpaqueAction_expressions_Value()
		 * @generated
		 */
		EClass OPAQUE_ACTION_EXPRESSIONS_VALUE = eINSTANCE.getOpaqueAction_expressions_Value();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPAQUE_ACTION_EXPRESSIONS_VALUE__EXPRESSIONS = eINSTANCE.getOpaqueAction_expressions_Value_Expressions();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPAQUE_ACTION_EXPRESSIONS_VALUE__PARENT = eINSTANCE.getOpaqueAction_expressions_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPAQUE_ACTION_EXPRESSIONS_VALUE__STATES = eINSTANCE.getOpaqueAction_expressions_Value_States();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.Variable_initialValue_ValueImpl <em>Variable initial Value Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.Variable_initialValue_ValueImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getVariable_initialValue_Value()
		 * @generated
		 */
		EClass VARIABLE_INITIAL_VALUE_VALUE = eINSTANCE.getVariable_initialValue_Value();

		/**
		 * The meta object literal for the '<em><b>Initial Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_INITIAL_VALUE_VALUE__INITIAL_VALUE = eINSTANCE.getVariable_initialValue_Value_InitialValue();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_INITIAL_VALUE_VALUE__PARENT = eINSTANCE.getVariable_initialValue_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_INITIAL_VALUE_VALUE__STATES = eINSTANCE.getVariable_initialValue_Value_States();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.Variable_name_ValueImpl <em>Variable name Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.Variable_name_ValueImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getVariable_name_Value()
		 * @generated
		 */
		EClass VARIABLE_NAME_VALUE = eINSTANCE.getVariable_name_Value();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_NAME_VALUE__NAME = eINSTANCE.getVariable_name_Value_Name();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_NAME_VALUE__PARENT = eINSTANCE.getVariable_name_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_NAME_VALUE__STATES = eINSTANCE.getVariable_name_Value_States();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.Variable_currentValue_ValueImpl <em>Variable current Value Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.Variable_currentValue_ValueImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getVariable_currentValue_Value()
		 * @generated
		 */
		EClass VARIABLE_CURRENT_VALUE_VALUE = eINSTANCE.getVariable_currentValue_Value();

		/**
		 * The meta object literal for the '<em><b>Current Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_CURRENT_VALUE_VALUE__CURRENT_VALUE = eINSTANCE.getVariable_currentValue_Value_CurrentValue();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_CURRENT_VALUE_VALUE__PARENT = eINSTANCE.getVariable_currentValue_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_CURRENT_VALUE_VALUE__STATES = eINSTANCE.getVariable_currentValue_Value_States();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.Token_holder_ValueImpl <em>Token holder Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.Token_holder_ValueImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getToken_holder_Value()
		 * @generated
		 */
		EClass TOKEN_HOLDER_VALUE = eINSTANCE.getToken_holder_Value();

		/**
		 * The meta object literal for the '<em><b>Holder</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_HOLDER_VALUE__HOLDER = eINSTANCE.getToken_holder_Value_Holder();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_HOLDER_VALUE__PARENT = eINSTANCE.getToken_holder_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_HOLDER_VALUE__STATES = eINSTANCE.getToken_holder_Value_States();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.Input_inputValues_ValueImpl <em>Input input Values Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.Input_inputValues_ValueImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getInput_inputValues_Value()
		 * @generated
		 */
		EClass INPUT_INPUT_VALUES_VALUE = eINSTANCE.getInput_inputValues_Value();

		/**
		 * The meta object literal for the '<em><b>Input Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_INPUT_VALUES_VALUE__INPUT_VALUES = eINSTANCE.getInput_inputValues_Value_InputValues();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_INPUT_VALUES_VALUE__PARENT = eINSTANCE.getInput_inputValues_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_INPUT_VALUES_VALUE__STATES = eINSTANCE.getInput_inputValues_Value_States();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.IntegerValue_value_ValueImpl <em>Integer Value value Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.IntegerValue_value_ValueImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getIntegerValue_value_Value()
		 * @generated
		 */
		EClass INTEGER_VALUE_VALUE_VALUE = eINSTANCE.getIntegerValue_value_Value();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_VALUE_VALUE_VALUE__VALUE = eINSTANCE.getIntegerValue_value_Value_Value();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGER_VALUE_VALUE_VALUE__PARENT = eINSTANCE.getIntegerValue_value_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGER_VALUE_VALUE_VALUE__STATES = eINSTANCE.getIntegerValue_value_Value_States();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.Activity_locals_ValueImpl <em>Activity locals Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.Activity_locals_ValueImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getActivity_locals_Value()
		 * @generated
		 */
		EClass ACTIVITY_LOCALS_VALUE = eINSTANCE.getActivity_locals_Value();

		/**
		 * The meta object literal for the '<em><b>Locals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_LOCALS_VALUE__LOCALS = eINSTANCE.getActivity_locals_Value_Locals();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_LOCALS_VALUE__PARENT = eINSTANCE.getActivity_locals_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_LOCALS_VALUE__STATES = eINSTANCE.getActivity_locals_Value_States();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.Activity_edges_ValueImpl <em>Activity edges Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.Activity_edges_ValueImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getActivity_edges_Value()
		 * @generated
		 */
		EClass ACTIVITY_EDGES_VALUE = eINSTANCE.getActivity_edges_Value();

		/**
		 * The meta object literal for the '<em><b>Edges</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGES_VALUE__EDGES = eINSTANCE.getActivity_edges_Value_Edges();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGES_VALUE__PARENT = eINSTANCE.getActivity_edges_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGES_VALUE__STATES = eINSTANCE.getActivity_edges_Value_States();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.Activity_inputs_ValueImpl <em>Activity inputs Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.Activity_inputs_ValueImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getActivity_inputs_Value()
		 * @generated
		 */
		EClass ACTIVITY_INPUTS_VALUE = eINSTANCE.getActivity_inputs_Value();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_INPUTS_VALUE__INPUTS = eINSTANCE.getActivity_inputs_Value_Inputs();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_INPUTS_VALUE__PARENT = eINSTANCE.getActivity_inputs_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_INPUTS_VALUE__STATES = eINSTANCE.getActivity_inputs_Value_States();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.Activity_nodes_ValueImpl <em>Activity nodes Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.Activity_nodes_ValueImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getActivity_nodes_Value()
		 * @generated
		 */
		EClass ACTIVITY_NODES_VALUE = eINSTANCE.getActivity_nodes_Value();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODES_VALUE__NODES = eINSTANCE.getActivity_nodes_Value_Nodes();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODES_VALUE__PARENT = eINSTANCE.getActivity_nodes_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODES_VALUE__STATES = eINSTANCE.getActivity_nodes_Value_States();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.Activity_trace_ValueImpl <em>Activity trace Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.Activity_trace_ValueImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getActivity_trace_Value()
		 * @generated
		 */
		EClass ACTIVITY_TRACE_VALUE = eINSTANCE.getActivity_trace_Value();

		/**
		 * The meta object literal for the '<em><b>Trace</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_TRACE_VALUE__TRACE = eINSTANCE.getActivity_trace_Value_Trace();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_TRACE_VALUE__PARENT = eINSTANCE.getActivity_trace_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_TRACE_VALUE__STATES = eINSTANCE.getActivity_trace_Value_States();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.Offer_offeredTokens_ValueImpl <em>Offer offered Tokens Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.Offer_offeredTokens_ValueImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getOffer_offeredTokens_Value()
		 * @generated
		 */
		EClass OFFER_OFFERED_TOKENS_VALUE = eINSTANCE.getOffer_offeredTokens_Value();

		/**
		 * The meta object literal for the '<em><b>Offered Tokens</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OFFER_OFFERED_TOKENS_VALUE__OFFERED_TOKENS = eINSTANCE.getOffer_offeredTokens_Value_OfferedTokens();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OFFER_OFFERED_TOKENS_VALUE__PARENT = eINSTANCE.getOffer_offeredTokens_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OFFER_OFFERED_TOKENS_VALUE__STATES = eINSTANCE.getOffer_offeredTokens_Value_States();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.ForkedToken_remainingOffersCount_ValueImpl <em>Forked Token remaining Offers Count Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.ForkedToken_remainingOffersCount_ValueImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getForkedToken_remainingOffersCount_Value()
		 * @generated
		 */
		EClass FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE = eINSTANCE.getForkedToken_remainingOffersCount_Value();

		/**
		 * The meta object literal for the '<em><b>Remaining Offers Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE__REMAINING_OFFERS_COUNT = eINSTANCE.getForkedToken_remainingOffersCount_Value_RemainingOffersCount();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE__PARENT = eINSTANCE.getForkedToken_remainingOffersCount_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE__STATES = eINSTANCE.getForkedToken_remainingOffersCount_Value_States();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.ForkedToken_baseToken_ValueImpl <em>Forked Token base Token Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.ForkedToken_baseToken_ValueImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getForkedToken_baseToken_Value()
		 * @generated
		 */
		EClass FORKED_TOKEN_BASE_TOKEN_VALUE = eINSTANCE.getForkedToken_baseToken_Value();

		/**
		 * The meta object literal for the '<em><b>Base Token</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORKED_TOKEN_BASE_TOKEN_VALUE__BASE_TOKEN = eINSTANCE.getForkedToken_baseToken_Value_BaseToken();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORKED_TOKEN_BASE_TOKEN_VALUE__PARENT = eINSTANCE.getForkedToken_baseToken_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORKED_TOKEN_BASE_TOKEN_VALUE__STATES = eINSTANCE.getForkedToken_baseToken_Value_States();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.IntegerExpression_operand2_ValueImpl <em>Integer Expression operand2 Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.IntegerExpression_operand2_ValueImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getIntegerExpression_operand2_Value()
		 * @generated
		 */
		EClass INTEGER_EXPRESSION_OPERAND2_VALUE = eINSTANCE.getIntegerExpression_operand2_Value();

		/**
		 * The meta object literal for the '<em><b>Operand2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGER_EXPRESSION_OPERAND2_VALUE__OPERAND2 = eINSTANCE.getIntegerExpression_operand2_Value_Operand2();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGER_EXPRESSION_OPERAND2_VALUE__PARENT = eINSTANCE.getIntegerExpression_operand2_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGER_EXPRESSION_OPERAND2_VALUE__STATES = eINSTANCE.getIntegerExpression_operand2_Value_States();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.IntegerExpression_operand1_ValueImpl <em>Integer Expression operand1 Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.IntegerExpression_operand1_ValueImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getIntegerExpression_operand1_Value()
		 * @generated
		 */
		EClass INTEGER_EXPRESSION_OPERAND1_VALUE = eINSTANCE.getIntegerExpression_operand1_Value();

		/**
		 * The meta object literal for the '<em><b>Operand1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGER_EXPRESSION_OPERAND1_VALUE__OPERAND1 = eINSTANCE.getIntegerExpression_operand1_Value_Operand1();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGER_EXPRESSION_OPERAND1_VALUE__PARENT = eINSTANCE.getIntegerExpression_operand1_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGER_EXPRESSION_OPERAND1_VALUE__STATES = eINSTANCE.getIntegerExpression_operand1_Value_States();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.BooleanExpression_assignee_ValueImpl <em>Boolean Expression assignee Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.BooleanExpression_assignee_ValueImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getBooleanExpression_assignee_Value()
		 * @generated
		 */
		EClass BOOLEAN_EXPRESSION_ASSIGNEE_VALUE = eINSTANCE.getBooleanExpression_assignee_Value();

		/**
		 * The meta object literal for the '<em><b>Assignee</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_EXPRESSION_ASSIGNEE_VALUE__ASSIGNEE = eINSTANCE.getBooleanExpression_assignee_Value_Assignee();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_EXPRESSION_ASSIGNEE_VALUE__PARENT = eINSTANCE.getBooleanExpression_assignee_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_EXPRESSION_ASSIGNEE_VALUE__STATES = eINSTANCE.getBooleanExpression_assignee_Value_States();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.BooleanUnaryExpression_operator_ValueImpl <em>Boolean Unary Expression operator Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.BooleanUnaryExpression_operator_ValueImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getBooleanUnaryExpression_operator_Value()
		 * @generated
		 */
		EClass BOOLEAN_UNARY_EXPRESSION_OPERATOR_VALUE = eINSTANCE.getBooleanUnaryExpression_operator_Value();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_UNARY_EXPRESSION_OPERATOR_VALUE__OPERATOR = eINSTANCE.getBooleanUnaryExpression_operator_Value_Operator();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_UNARY_EXPRESSION_OPERATOR_VALUE__PARENT = eINSTANCE.getBooleanUnaryExpression_operator_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_UNARY_EXPRESSION_OPERATOR_VALUE__STATES = eINSTANCE.getBooleanUnaryExpression_operator_Value_States();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.BooleanUnaryExpression_operand_ValueImpl <em>Boolean Unary Expression operand Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.BooleanUnaryExpression_operand_ValueImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getBooleanUnaryExpression_operand_Value()
		 * @generated
		 */
		EClass BOOLEAN_UNARY_EXPRESSION_OPERAND_VALUE = eINSTANCE.getBooleanUnaryExpression_operand_Value();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_UNARY_EXPRESSION_OPERAND_VALUE__OPERAND = eINSTANCE.getBooleanUnaryExpression_operand_Value_Operand();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_UNARY_EXPRESSION_OPERAND_VALUE__PARENT = eINSTANCE.getBooleanUnaryExpression_operand_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_UNARY_EXPRESSION_OPERAND_VALUE__STATES = eINSTANCE.getBooleanUnaryExpression_operand_Value_States();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.BooleanBinaryExpression_operand2_ValueImpl <em>Boolean Binary Expression operand2 Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.BooleanBinaryExpression_operand2_ValueImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getBooleanBinaryExpression_operand2_Value()
		 * @generated
		 */
		EClass BOOLEAN_BINARY_EXPRESSION_OPERAND2_VALUE = eINSTANCE.getBooleanBinaryExpression_operand2_Value();

		/**
		 * The meta object literal for the '<em><b>Operand2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_BINARY_EXPRESSION_OPERAND2_VALUE__OPERAND2 = eINSTANCE.getBooleanBinaryExpression_operand2_Value_Operand2();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_BINARY_EXPRESSION_OPERAND2_VALUE__PARENT = eINSTANCE.getBooleanBinaryExpression_operand2_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_BINARY_EXPRESSION_OPERAND2_VALUE__STATES = eINSTANCE.getBooleanBinaryExpression_operand2_Value_States();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.BooleanBinaryExpression_operator_ValueImpl <em>Boolean Binary Expression operator Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.BooleanBinaryExpression_operator_ValueImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getBooleanBinaryExpression_operator_Value()
		 * @generated
		 */
		EClass BOOLEAN_BINARY_EXPRESSION_OPERATOR_VALUE = eINSTANCE.getBooleanBinaryExpression_operator_Value();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_BINARY_EXPRESSION_OPERATOR_VALUE__OPERATOR = eINSTANCE.getBooleanBinaryExpression_operator_Value_Operator();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_BINARY_EXPRESSION_OPERATOR_VALUE__PARENT = eINSTANCE.getBooleanBinaryExpression_operator_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_BINARY_EXPRESSION_OPERATOR_VALUE__STATES = eINSTANCE.getBooleanBinaryExpression_operator_Value_States();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.BooleanBinaryExpression_operand1_ValueImpl <em>Boolean Binary Expression operand1 Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.BooleanBinaryExpression_operand1_ValueImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getBooleanBinaryExpression_operand1_Value()
		 * @generated
		 */
		EClass BOOLEAN_BINARY_EXPRESSION_OPERAND1_VALUE = eINSTANCE.getBooleanBinaryExpression_operand1_Value();

		/**
		 * The meta object literal for the '<em><b>Operand1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_BINARY_EXPRESSION_OPERAND1_VALUE__OPERAND1 = eINSTANCE.getBooleanBinaryExpression_operand1_Value_Operand1();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_BINARY_EXPRESSION_OPERAND1_VALUE__PARENT = eINSTANCE.getBooleanBinaryExpression_operand1_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_BINARY_EXPRESSION_OPERAND1_VALUE__STATES = eINSTANCE.getBooleanBinaryExpression_operand1_Value_States();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.Trace_executedNodes_ValueImpl <em>Trace executed Nodes Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.Trace_executedNodes_ValueImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getTrace_executedNodes_Value()
		 * @generated
		 */
		EClass TRACE_EXECUTED_NODES_VALUE = eINSTANCE.getTrace_executedNodes_Value();

		/**
		 * The meta object literal for the '<em><b>Executed Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_EXECUTED_NODES_VALUE__EXECUTED_NODES = eINSTANCE.getTrace_executedNodes_Value_ExecutedNodes();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_EXECUTED_NODES_VALUE__PARENT = eINSTANCE.getTrace_executedNodes_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_EXECUTED_NODES_VALUE__STATES = eINSTANCE.getTrace_executedNodes_Value_States();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.InputValue_value_ValueImpl <em>Input Value value Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.InputValue_value_ValueImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getInputValue_value_Value()
		 * @generated
		 */
		EClass INPUT_VALUE_VALUE_VALUE = eINSTANCE.getInputValue_value_Value();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_VALUE_VALUE_VALUE__VALUE = eINSTANCE.getInputValue_value_Value_Value();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_VALUE_VALUE_VALUE__PARENT = eINSTANCE.getInputValue_value_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_VALUE_VALUE_VALUE__STATES = eINSTANCE.getInputValue_value_Value_States();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.InputValue_variable_ValueImpl <em>Input Value variable Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.InputValue_variable_ValueImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getInputValue_variable_Value()
		 * @generated
		 */
		EClass INPUT_VALUE_VARIABLE_VALUE = eINSTANCE.getInputValue_variable_Value();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_VALUE_VARIABLE_VALUE__VARIABLE = eINSTANCE.getInputValue_variable_Value_Variable();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_VALUE_VARIABLE_VALUE__PARENT = eINSTANCE.getInputValue_variable_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_VALUE_VARIABLE_VALUE__STATES = eINSTANCE.getInputValue_variable_Value_States();

	}

} //StatesPackage
