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
	int TRACED_NAMED_ELEMENT = 29;

	/**
	 * The feature id for the '<em><b>Name Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_NAMED_ELEMENT__NAME_SEQUENCE = 0;

	/**
	 * The number of structural features of the '<em>Traced Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_NAMED_ELEMENT_FEATURE_COUNT = 1;

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
	 * The feature id for the '<em><b>Name Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_NODE__NAME_SEQUENCE = TRACED_NAMED_ELEMENT__NAME_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Activity Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_NODE__ACTIVITY_SEQUENCE = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Held Tokens Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_NODE__HELD_TOKENS_SEQUENCE = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Incoming Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_NODE__INCOMING_SEQUENCE = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Outgoing Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_NODE__OUTGOING_SEQUENCE = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Running Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_NODE__RUNNING_SEQUENCE = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 4;

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
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedExecutableNodeImpl <em>Traced Executable Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedExecutableNodeImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedExecutableNode()
	 * @generated
	 */
	int TRACED_EXECUTABLE_NODE = 14;

	/**
	 * The feature id for the '<em><b>Name Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXECUTABLE_NODE__NAME_SEQUENCE = TRACED_ACTIVITY_NODE__NAME_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Activity Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXECUTABLE_NODE__ACTIVITY_SEQUENCE = TRACED_ACTIVITY_NODE__ACTIVITY_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Held Tokens Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXECUTABLE_NODE__HELD_TOKENS_SEQUENCE = TRACED_ACTIVITY_NODE__HELD_TOKENS_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Incoming Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXECUTABLE_NODE__INCOMING_SEQUENCE = TRACED_ACTIVITY_NODE__INCOMING_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Outgoing Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXECUTABLE_NODE__OUTGOING_SEQUENCE = TRACED_ACTIVITY_NODE__OUTGOING_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Running Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXECUTABLE_NODE__RUNNING_SEQUENCE = TRACED_ACTIVITY_NODE__RUNNING_SEQUENCE;

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
	 * The feature id for the '<em><b>Name Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTION__NAME_SEQUENCE = TRACED_EXECUTABLE_NODE__NAME_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Activity Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTION__ACTIVITY_SEQUENCE = TRACED_EXECUTABLE_NODE__ACTIVITY_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Held Tokens Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTION__HELD_TOKENS_SEQUENCE = TRACED_EXECUTABLE_NODE__HELD_TOKENS_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Incoming Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTION__INCOMING_SEQUENCE = TRACED_EXECUTABLE_NODE__INCOMING_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Outgoing Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTION__OUTGOING_SEQUENCE = TRACED_EXECUTABLE_NODE__OUTGOING_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Running Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTION__RUNNING_SEQUENCE = TRACED_EXECUTABLE_NODE__RUNNING_SEQUENCE;

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
	 * The feature id for the '<em><b>Name Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY__NAME_SEQUENCE = TRACED_NAMED_ELEMENT__NAME_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Edges Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY__EDGES_SEQUENCE = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inputs Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY__INPUTS_SEQUENCE = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Locals Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY__LOCALS_SEQUENCE = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Nodes Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY__NODES_SEQUENCE = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Trace Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY__TRACE_SEQUENCE = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Traced Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_FEATURE_COUNT = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 5;

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
	 * The feature id for the '<em><b>Name Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_EDGE__NAME_SEQUENCE = TRACED_NAMED_ELEMENT__NAME_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Offers Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_EDGE__OFFERS_SEQUENCE = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_EDGE__SOURCE_SEQUENCE = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_EDGE__TARGET_SEQUENCE = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Traced Activity Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_EDGE_FEATURE_COUNT = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 3;

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
	int TRACED_CONTROL_NODE = 11;

	/**
	 * The feature id for the '<em><b>Name Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONTROL_NODE__NAME_SEQUENCE = TRACED_ACTIVITY_NODE__NAME_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Activity Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONTROL_NODE__ACTIVITY_SEQUENCE = TRACED_ACTIVITY_NODE__ACTIVITY_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Held Tokens Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONTROL_NODE__HELD_TOKENS_SEQUENCE = TRACED_ACTIVITY_NODE__HELD_TOKENS_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Incoming Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONTROL_NODE__INCOMING_SEQUENCE = TRACED_ACTIVITY_NODE__INCOMING_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Outgoing Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONTROL_NODE__OUTGOING_SEQUENCE = TRACED_ACTIVITY_NODE__OUTGOING_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Running Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONTROL_NODE__RUNNING_SEQUENCE = TRACED_ACTIVITY_NODE__RUNNING_SEQUENCE;

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
	int TRACED_FINAL_NODE = 16;

	/**
	 * The feature id for the '<em><b>Name Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FINAL_NODE__NAME_SEQUENCE = TRACED_CONTROL_NODE__NAME_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Activity Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FINAL_NODE__ACTIVITY_SEQUENCE = TRACED_CONTROL_NODE__ACTIVITY_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Held Tokens Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FINAL_NODE__HELD_TOKENS_SEQUENCE = TRACED_CONTROL_NODE__HELD_TOKENS_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Incoming Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FINAL_NODE__INCOMING_SEQUENCE = TRACED_CONTROL_NODE__INCOMING_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Outgoing Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FINAL_NODE__OUTGOING_SEQUENCE = TRACED_CONTROL_NODE__OUTGOING_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Running Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FINAL_NODE__RUNNING_SEQUENCE = TRACED_CONTROL_NODE__RUNNING_SEQUENCE;

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
	 * The feature id for the '<em><b>Name Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_FINAL_NODE__NAME_SEQUENCE = TRACED_FINAL_NODE__NAME_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Activity Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_FINAL_NODE__ACTIVITY_SEQUENCE = TRACED_FINAL_NODE__ACTIVITY_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Held Tokens Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_FINAL_NODE__HELD_TOKENS_SEQUENCE = TRACED_FINAL_NODE__HELD_TOKENS_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Incoming Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_FINAL_NODE__INCOMING_SEQUENCE = TRACED_FINAL_NODE__INCOMING_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Outgoing Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_FINAL_NODE__OUTGOING_SEQUENCE = TRACED_FINAL_NODE__OUTGOING_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Running Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ACTIVITY_FINAL_NODE__RUNNING_SEQUENCE = TRACED_FINAL_NODE__RUNNING_SEQUENCE;

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
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedExpressionImpl <em>Traced Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedExpressionImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedExpression()
	 * @generated
	 */
	int TRACED_EXPRESSION = 15;

	/**
	 * The number of structural features of the '<em>Traced Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Traced Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXPRESSION_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Assignee Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_EXPRESSION__ASSIGNEE_SEQUENCE = TRACED_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_EXPRESSION_FEATURE_COUNT = TRACED_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Traced Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_EXPRESSION_OPERATION_COUNT = TRACED_EXPRESSION_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Assignee Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_BINARY_EXPRESSION__ASSIGNEE_SEQUENCE = TRACED_BOOLEAN_EXPRESSION__ASSIGNEE_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Operand1 Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_BINARY_EXPRESSION__OPERAND1_SEQUENCE = TRACED_BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operand2 Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_BINARY_EXPRESSION__OPERAND2_SEQUENCE = TRACED_BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_BINARY_EXPRESSION__OPERATOR_SEQUENCE = TRACED_BOOLEAN_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Traced Boolean Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_BINARY_EXPRESSION_FEATURE_COUNT = TRACED_BOOLEAN_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Traced Boolean Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_BINARY_EXPRESSION_OPERATION_COUNT = TRACED_BOOLEAN_EXPRESSION_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Assignee Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_UNARY_EXPRESSION__ASSIGNEE_SEQUENCE = TRACED_BOOLEAN_EXPRESSION__ASSIGNEE_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Operand Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_UNARY_EXPRESSION__OPERAND_SEQUENCE = TRACED_BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_UNARY_EXPRESSION__OPERATOR_SEQUENCE = TRACED_BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Traced Boolean Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_UNARY_EXPRESSION_FEATURE_COUNT = TRACED_BOOLEAN_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Traced Boolean Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_UNARY_EXPRESSION_OPERATION_COUNT = TRACED_BOOLEAN_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedValueImpl <em>Traced Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedValueImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedValue()
	 * @generated
	 */
	int TRACED_VALUE = 34;

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
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedBooleanValueImpl <em>Traced Boolean Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedBooleanValueImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedBooleanValue()
	 * @generated
	 */
	int TRACED_BOOLEAN_VALUE = 8;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_VALUE__ORIGINAL_OBJECT = TRACED_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_VALUE__VALUE_SEQUENCE = TRACED_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Traced Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_VALUE_FEATURE_COUNT = TRACED_VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Traced Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_VALUE_OPERATION_COUNT = TRACED_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedVariableImpl <em>Traced Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedVariableImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedVariable()
	 * @generated
	 */
	int TRACED_VARIABLE = 35;

	/**
	 * The feature id for the '<em><b>Current Value Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VARIABLE__CURRENT_VALUE_SEQUENCE = 0;

	/**
	 * The feature id for the '<em><b>Initial Value Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VARIABLE__INITIAL_VALUE_SEQUENCE = 1;

	/**
	 * The feature id for the '<em><b>Name Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VARIABLE__NAME_SEQUENCE = 2;

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
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedBooleanVariableImpl <em>Traced Boolean Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedBooleanVariableImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedBooleanVariable()
	 * @generated
	 */
	int TRACED_BOOLEAN_VARIABLE = 9;

	/**
	 * The feature id for the '<em><b>Current Value Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_VARIABLE__CURRENT_VALUE_SEQUENCE = TRACED_VARIABLE__CURRENT_VALUE_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Initial Value Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_VARIABLE__INITIAL_VALUE_SEQUENCE = TRACED_VARIABLE__INITIAL_VALUE_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Name Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_VARIABLE__NAME_SEQUENCE = TRACED_VARIABLE__NAME_SEQUENCE;

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
	int TRACED_CONTROL_FLOW = 10;

	/**
	 * The feature id for the '<em><b>Name Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONTROL_FLOW__NAME_SEQUENCE = TRACED_ACTIVITY_EDGE__NAME_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Offers Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONTROL_FLOW__OFFERS_SEQUENCE = TRACED_ACTIVITY_EDGE__OFFERS_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Source Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONTROL_FLOW__SOURCE_SEQUENCE = TRACED_ACTIVITY_EDGE__SOURCE_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Target Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONTROL_FLOW__TARGET_SEQUENCE = TRACED_ACTIVITY_EDGE__TARGET_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Guard Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONTROL_FLOW__GUARD_SEQUENCE = TRACED_ACTIVITY_EDGE_FEATURE_COUNT + 0;

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
	int TRACED_TOKEN = 32;

	/**
	 * The feature id for the '<em><b>Holder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TOKEN__HOLDER = 0;

	/**
	 * The feature id for the '<em><b>Holder Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TOKEN__HOLDER_SEQUENCE = 1;

	/**
	 * The number of structural features of the '<em>Traced Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TOKEN_FEATURE_COUNT = 2;

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
	int TRACED_CONTROL_TOKEN = 12;

	/**
	 * The feature id for the '<em><b>Holder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONTROL_TOKEN__HOLDER = TRACED_TOKEN__HOLDER;

	/**
	 * The feature id for the '<em><b>Holder Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONTROL_TOKEN__HOLDER_SEQUENCE = TRACED_TOKEN__HOLDER_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONTROL_TOKEN__ORIGINAL_OBJECT = TRACED_TOKEN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Control Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONTROL_TOKEN_FEATURE_COUNT = TRACED_TOKEN_FEATURE_COUNT + 1;

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
	int TRACED_DECISION_NODE = 13;

	/**
	 * The feature id for the '<em><b>Name Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DECISION_NODE__NAME_SEQUENCE = TRACED_CONTROL_NODE__NAME_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Activity Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DECISION_NODE__ACTIVITY_SEQUENCE = TRACED_CONTROL_NODE__ACTIVITY_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Held Tokens Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DECISION_NODE__HELD_TOKENS_SEQUENCE = TRACED_CONTROL_NODE__HELD_TOKENS_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Incoming Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DECISION_NODE__INCOMING_SEQUENCE = TRACED_CONTROL_NODE__INCOMING_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Outgoing Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DECISION_NODE__OUTGOING_SEQUENCE = TRACED_CONTROL_NODE__OUTGOING_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Running Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DECISION_NODE__RUNNING_SEQUENCE = TRACED_CONTROL_NODE__RUNNING_SEQUENCE;

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
	int TRACED_FORK_NODE = 17;

	/**
	 * The feature id for the '<em><b>Name Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FORK_NODE__NAME_SEQUENCE = TRACED_CONTROL_NODE__NAME_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Activity Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FORK_NODE__ACTIVITY_SEQUENCE = TRACED_CONTROL_NODE__ACTIVITY_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Held Tokens Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FORK_NODE__HELD_TOKENS_SEQUENCE = TRACED_CONTROL_NODE__HELD_TOKENS_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Incoming Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FORK_NODE__INCOMING_SEQUENCE = TRACED_CONTROL_NODE__INCOMING_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Outgoing Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FORK_NODE__OUTGOING_SEQUENCE = TRACED_CONTROL_NODE__OUTGOING_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Running Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FORK_NODE__RUNNING_SEQUENCE = TRACED_CONTROL_NODE__RUNNING_SEQUENCE;

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
	int TRACED_FORKED_TOKEN = 18;

	/**
	 * The feature id for the '<em><b>Holder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FORKED_TOKEN__HOLDER = TRACED_TOKEN__HOLDER;

	/**
	 * The feature id for the '<em><b>Holder Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FORKED_TOKEN__HOLDER_SEQUENCE = TRACED_TOKEN__HOLDER_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Base Token</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FORKED_TOKEN__BASE_TOKEN = TRACED_TOKEN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Token Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FORKED_TOKEN__BASE_TOKEN_SEQUENCE = TRACED_TOKEN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FORKED_TOKEN__ORIGINAL_OBJECT = TRACED_TOKEN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Remaining Offers Count Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FORKED_TOKEN__REMAINING_OFFERS_COUNT_SEQUENCE = TRACED_TOKEN_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Traced Forked Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FORKED_TOKEN_FEATURE_COUNT = TRACED_TOKEN_FEATURE_COUNT + 4;

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
	int TRACED_INITIAL_NODE = 19;

	/**
	 * The feature id for the '<em><b>Name Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INITIAL_NODE__NAME_SEQUENCE = TRACED_CONTROL_NODE__NAME_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Activity Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INITIAL_NODE__ACTIVITY_SEQUENCE = TRACED_CONTROL_NODE__ACTIVITY_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Held Tokens Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INITIAL_NODE__HELD_TOKENS_SEQUENCE = TRACED_CONTROL_NODE__HELD_TOKENS_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Incoming Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INITIAL_NODE__INCOMING_SEQUENCE = TRACED_CONTROL_NODE__INCOMING_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Outgoing Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INITIAL_NODE__OUTGOING_SEQUENCE = TRACED_CONTROL_NODE__OUTGOING_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Running Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INITIAL_NODE__RUNNING_SEQUENCE = TRACED_CONTROL_NODE__RUNNING_SEQUENCE;

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
	int TRACED_INPUT = 20;

	/**
	 * The feature id for the '<em><b>Input Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INPUT__INPUT_VALUES = 0;

	/**
	 * The feature id for the '<em><b>Input Values Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INPUT__INPUT_VALUES_SEQUENCE = 1;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INPUT__ORIGINAL_OBJECT = 2;

	/**
	 * The number of structural features of the '<em>Traced Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INPUT_FEATURE_COUNT = 3;

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
	int TRACED_INPUT_VALUE = 21;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INPUT_VALUE__ORIGINAL_OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INPUT_VALUE__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Value Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INPUT_VALUE__VALUE_SEQUENCE = 2;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INPUT_VALUE__VARIABLE = 3;

	/**
	 * The feature id for the '<em><b>Variable Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INPUT_VALUE__VARIABLE_SEQUENCE = 4;

	/**
	 * The number of structural features of the '<em>Traced Input Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INPUT_VALUE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Traced Input Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INPUT_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedIntegerExpressionImpl <em>Traced Integer Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedIntegerExpressionImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedIntegerExpression()
	 * @generated
	 */
	int TRACED_INTEGER_EXPRESSION = 24;

	/**
	 * The feature id for the '<em><b>Operand1 Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_EXPRESSION__OPERAND1_SEQUENCE = TRACED_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operand2 Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_EXPRESSION__OPERAND2_SEQUENCE = TRACED_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Traced Integer Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_EXPRESSION_FEATURE_COUNT = TRACED_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Traced Integer Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_EXPRESSION_OPERATION_COUNT = TRACED_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedIntegerCalculationExpressionImpl <em>Traced Integer Calculation Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedIntegerCalculationExpressionImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedIntegerCalculationExpression()
	 * @generated
	 */
	int TRACED_INTEGER_CALCULATION_EXPRESSION = 22;

	/**
	 * The feature id for the '<em><b>Operand1 Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_CALCULATION_EXPRESSION__OPERAND1_SEQUENCE = TRACED_INTEGER_EXPRESSION__OPERAND1_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Operand2 Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_CALCULATION_EXPRESSION__OPERAND2_SEQUENCE = TRACED_INTEGER_EXPRESSION__OPERAND2_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Assignee Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_CALCULATION_EXPRESSION__ASSIGNEE_SEQUENCE = TRACED_INTEGER_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_CALCULATION_EXPRESSION__OPERATOR_SEQUENCE = TRACED_INTEGER_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Traced Integer Calculation Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_CALCULATION_EXPRESSION_FEATURE_COUNT = TRACED_INTEGER_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Traced Integer Calculation Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_CALCULATION_EXPRESSION_OPERATION_COUNT = TRACED_INTEGER_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedIntegerComparisonExpressionImpl <em>Traced Integer Comparison Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedIntegerComparisonExpressionImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedIntegerComparisonExpression()
	 * @generated
	 */
	int TRACED_INTEGER_COMPARISON_EXPRESSION = 23;

	/**
	 * The feature id for the '<em><b>Operand1 Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_COMPARISON_EXPRESSION__OPERAND1_SEQUENCE = TRACED_INTEGER_EXPRESSION__OPERAND1_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Operand2 Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_COMPARISON_EXPRESSION__OPERAND2_SEQUENCE = TRACED_INTEGER_EXPRESSION__OPERAND2_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Assignee Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_COMPARISON_EXPRESSION__ASSIGNEE_SEQUENCE = TRACED_INTEGER_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_COMPARISON_EXPRESSION__OPERATOR_SEQUENCE = TRACED_INTEGER_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Traced Integer Comparison Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_COMPARISON_EXPRESSION_FEATURE_COUNT = TRACED_INTEGER_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Traced Integer Comparison Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_COMPARISON_EXPRESSION_OPERATION_COUNT = TRACED_INTEGER_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedIntegerValueImpl <em>Traced Integer Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedIntegerValueImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedIntegerValue()
	 * @generated
	 */
	int TRACED_INTEGER_VALUE = 25;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_VALUE__ORIGINAL_OBJECT = TRACED_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_VALUE__VALUE_SEQUENCE = TRACED_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Traced Integer Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_VALUE_FEATURE_COUNT = TRACED_VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Traced Integer Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_VALUE_OPERATION_COUNT = TRACED_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedIntegerVariableImpl <em>Traced Integer Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.activitydiagram.impl.TracedIntegerVariableImpl
	 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedIntegerVariable()
	 * @generated
	 */
	int TRACED_INTEGER_VARIABLE = 26;

	/**
	 * The feature id for the '<em><b>Current Value Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_VARIABLE__CURRENT_VALUE_SEQUENCE = TRACED_VARIABLE__CURRENT_VALUE_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Initial Value Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_VARIABLE__INITIAL_VALUE_SEQUENCE = TRACED_VARIABLE__INITIAL_VALUE_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Name Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_VARIABLE__NAME_SEQUENCE = TRACED_VARIABLE__NAME_SEQUENCE;

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
	int TRACED_JOIN_NODE = 27;

	/**
	 * The feature id for the '<em><b>Name Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_JOIN_NODE__NAME_SEQUENCE = TRACED_CONTROL_NODE__NAME_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Activity Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_JOIN_NODE__ACTIVITY_SEQUENCE = TRACED_CONTROL_NODE__ACTIVITY_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Held Tokens Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_JOIN_NODE__HELD_TOKENS_SEQUENCE = TRACED_CONTROL_NODE__HELD_TOKENS_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Incoming Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_JOIN_NODE__INCOMING_SEQUENCE = TRACED_CONTROL_NODE__INCOMING_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Outgoing Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_JOIN_NODE__OUTGOING_SEQUENCE = TRACED_CONTROL_NODE__OUTGOING_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Running Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_JOIN_NODE__RUNNING_SEQUENCE = TRACED_CONTROL_NODE__RUNNING_SEQUENCE;

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
	int TRACED_MERGE_NODE = 28;

	/**
	 * The feature id for the '<em><b>Name Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MERGE_NODE__NAME_SEQUENCE = TRACED_CONTROL_NODE__NAME_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Activity Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MERGE_NODE__ACTIVITY_SEQUENCE = TRACED_CONTROL_NODE__ACTIVITY_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Held Tokens Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MERGE_NODE__HELD_TOKENS_SEQUENCE = TRACED_CONTROL_NODE__HELD_TOKENS_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Incoming Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MERGE_NODE__INCOMING_SEQUENCE = TRACED_CONTROL_NODE__INCOMING_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Outgoing Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MERGE_NODE__OUTGOING_SEQUENCE = TRACED_CONTROL_NODE__OUTGOING_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Running Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MERGE_NODE__RUNNING_SEQUENCE = TRACED_CONTROL_NODE__RUNNING_SEQUENCE;

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
	int TRACED_OFFER = 30;

	/**
	 * The feature id for the '<em><b>Offered Tokens</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OFFER__OFFERED_TOKENS = 0;

	/**
	 * The feature id for the '<em><b>Offered Tokens Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OFFER__OFFERED_TOKENS_SEQUENCE = 1;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OFFER__ORIGINAL_OBJECT = 2;

	/**
	 * The number of structural features of the '<em>Traced Offer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OFFER_FEATURE_COUNT = 3;

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
	int TRACED_OPAQUE_ACTION = 31;

	/**
	 * The feature id for the '<em><b>Name Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPAQUE_ACTION__NAME_SEQUENCE = TRACED_ACTION__NAME_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Activity Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPAQUE_ACTION__ACTIVITY_SEQUENCE = TRACED_ACTION__ACTIVITY_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Held Tokens Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPAQUE_ACTION__HELD_TOKENS_SEQUENCE = TRACED_ACTION__HELD_TOKENS_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Incoming Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPAQUE_ACTION__INCOMING_SEQUENCE = TRACED_ACTION__INCOMING_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Outgoing Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPAQUE_ACTION__OUTGOING_SEQUENCE = TRACED_ACTION__OUTGOING_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Running Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPAQUE_ACTION__RUNNING_SEQUENCE = TRACED_ACTION__RUNNING_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Expressions Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPAQUE_ACTION__EXPRESSIONS_SEQUENCE = TRACED_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Opaque Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPAQUE_ACTION_FEATURE_COUNT = TRACED_ACTION_FEATURE_COUNT + 1;

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
	int TRACED_TRACE = 33;

	/**
	 * The feature id for the '<em><b>Executed Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TRACE__EXECUTED_NODES = 0;

	/**
	 * The feature id for the '<em><b>Executed Nodes Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TRACE__EXECUTED_NODES_SEQUENCE = 1;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TRACE__ORIGINAL_OBJECT = 2;

	/**
	 * The number of structural features of the '<em>Traced Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TRACE_FEATURE_COUNT = 3;

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
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.States.activitydiagram.TracedActivity#getEdgesSequence <em>Edges Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Edges Sequence</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedActivity#getEdgesSequence()
	 * @see #getTracedActivity()
	 * @generated
	 */
	EReference getTracedActivity_EdgesSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.States.activitydiagram.TracedActivity#getInputsSequence <em>Inputs Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs Sequence</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedActivity#getInputsSequence()
	 * @see #getTracedActivity()
	 * @generated
	 */
	EReference getTracedActivity_InputsSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.States.activitydiagram.TracedActivity#getLocalsSequence <em>Locals Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locals Sequence</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedActivity#getLocalsSequence()
	 * @see #getTracedActivity()
	 * @generated
	 */
	EReference getTracedActivity_LocalsSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.States.activitydiagram.TracedActivity#getNodesSequence <em>Nodes Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes Sequence</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedActivity#getNodesSequence()
	 * @see #getTracedActivity()
	 * @generated
	 */
	EReference getTracedActivity_NodesSequence();

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
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.States.activitydiagram.TracedActivityEdge#getSourceSequence <em>Source Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source Sequence</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedActivityEdge#getSourceSequence()
	 * @see #getTracedActivityEdge()
	 * @generated
	 */
	EReference getTracedActivityEdge_SourceSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.States.activitydiagram.TracedActivityEdge#getTargetSequence <em>Target Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target Sequence</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedActivityEdge#getTargetSequence()
	 * @see #getTracedActivityEdge()
	 * @generated
	 */
	EReference getTracedActivityEdge_TargetSequence();

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
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.States.activitydiagram.TracedActivityNode#getActivitySequence <em>Activity Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activity Sequence</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedActivityNode#getActivitySequence()
	 * @see #getTracedActivityNode()
	 * @generated
	 */
	EReference getTracedActivityNode_ActivitySequence();

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
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.States.activitydiagram.TracedActivityNode#getIncomingSequence <em>Incoming Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Incoming Sequence</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedActivityNode#getIncomingSequence()
	 * @see #getTracedActivityNode()
	 * @generated
	 */
	EReference getTracedActivityNode_IncomingSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.States.activitydiagram.TracedActivityNode#getOutgoingSequence <em>Outgoing Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outgoing Sequence</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedActivityNode#getOutgoingSequence()
	 * @see #getTracedActivityNode()
	 * @generated
	 */
	EReference getTracedActivityNode_OutgoingSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.States.activitydiagram.TracedActivityNode#getRunningSequence <em>Running Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Running Sequence</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedActivityNode#getRunningSequence()
	 * @see #getTracedActivityNode()
	 * @generated
	 */
	EReference getTracedActivityNode_RunningSequence();

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
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.States.activitydiagram.TracedBooleanBinaryExpression#getOperand1Sequence <em>Operand1 Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operand1 Sequence</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedBooleanBinaryExpression#getOperand1Sequence()
	 * @see #getTracedBooleanBinaryExpression()
	 * @generated
	 */
	EReference getTracedBooleanBinaryExpression_Operand1Sequence();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.States.activitydiagram.TracedBooleanBinaryExpression#getOperand2Sequence <em>Operand2 Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operand2 Sequence</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedBooleanBinaryExpression#getOperand2Sequence()
	 * @see #getTracedBooleanBinaryExpression()
	 * @generated
	 */
	EReference getTracedBooleanBinaryExpression_Operand2Sequence();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.States.activitydiagram.TracedBooleanBinaryExpression#getOperatorSequence <em>Operator Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operator Sequence</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedBooleanBinaryExpression#getOperatorSequence()
	 * @see #getTracedBooleanBinaryExpression()
	 * @generated
	 */
	EReference getTracedBooleanBinaryExpression_OperatorSequence();

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
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.States.activitydiagram.TracedBooleanExpression#getAssigneeSequence <em>Assignee Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assignee Sequence</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedBooleanExpression#getAssigneeSequence()
	 * @see #getTracedBooleanExpression()
	 * @generated
	 */
	EReference getTracedBooleanExpression_AssigneeSequence();

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
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.States.activitydiagram.TracedBooleanUnaryExpression#getOperandSequence <em>Operand Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operand Sequence</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedBooleanUnaryExpression#getOperandSequence()
	 * @see #getTracedBooleanUnaryExpression()
	 * @generated
	 */
	EReference getTracedBooleanUnaryExpression_OperandSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.States.activitydiagram.TracedBooleanUnaryExpression#getOperatorSequence <em>Operator Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operator Sequence</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedBooleanUnaryExpression#getOperatorSequence()
	 * @see #getTracedBooleanUnaryExpression()
	 * @generated
	 */
	EReference getTracedBooleanUnaryExpression_OperatorSequence();

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
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.States.activitydiagram.TracedBooleanValue#getValueSequence <em>Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value Sequence</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedBooleanValue#getValueSequence()
	 * @see #getTracedBooleanValue()
	 * @generated
	 */
	EReference getTracedBooleanValue_ValueSequence();

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
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.States.activitydiagram.TracedControlFlow#getGuardSequence <em>Guard Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Guard Sequence</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedControlFlow#getGuardSequence()
	 * @see #getTracedControlFlow()
	 * @generated
	 */
	EReference getTracedControlFlow_GuardSequence();

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
	 * Returns the meta object for the reference '{@link activitydiagramTrace.States.activitydiagram.TracedControlToken#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedControlToken#getOriginalObject()
	 * @see #getTracedControlToken()
	 * @generated
	 */
	EReference getTracedControlToken_OriginalObject();

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
	 * Returns the meta object for the reference '{@link activitydiagramTrace.States.activitydiagram.TracedForkedToken#getBaseToken <em>Base Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Token</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedForkedToken#getBaseToken()
	 * @see #getTracedForkedToken()
	 * @generated
	 */
	EReference getTracedForkedToken_BaseToken();

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
	 * Returns the meta object for the reference '{@link activitydiagramTrace.States.activitydiagram.TracedForkedToken#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedForkedToken#getOriginalObject()
	 * @see #getTracedForkedToken()
	 * @generated
	 */
	EReference getTracedForkedToken_OriginalObject();

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
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.activitydiagram.TracedInput#getInputValues <em>Input Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Values</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedInput#getInputValues()
	 * @see #getTracedInput()
	 * @generated
	 */
	EReference getTracedInput_InputValues();

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
	 * Returns the meta object for the reference '{@link activitydiagramTrace.States.activitydiagram.TracedInput#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedInput#getOriginalObject()
	 * @see #getTracedInput()
	 * @generated
	 */
	EReference getTracedInput_OriginalObject();

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
	 * Returns the meta object for the reference '{@link activitydiagramTrace.States.activitydiagram.TracedInputValue#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedInputValue#getOriginalObject()
	 * @see #getTracedInputValue()
	 * @generated
	 */
	EReference getTracedInputValue_OriginalObject();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.States.activitydiagram.TracedInputValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedInputValue#getValue()
	 * @see #getTracedInputValue()
	 * @generated
	 */
	EReference getTracedInputValue_Value();

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
	 * Returns the meta object for the reference '{@link activitydiagramTrace.States.activitydiagram.TracedInputValue#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedInputValue#getVariable()
	 * @see #getTracedInputValue()
	 * @generated
	 */
	EReference getTracedInputValue_Variable();

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
	 * Returns the meta object for class '{@link activitydiagramTrace.States.activitydiagram.TracedIntegerCalculationExpression <em>Traced Integer Calculation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Integer Calculation Expression</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedIntegerCalculationExpression
	 * @generated
	 */
	EClass getTracedIntegerCalculationExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.States.activitydiagram.TracedIntegerCalculationExpression#getAssigneeSequence <em>Assignee Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assignee Sequence</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedIntegerCalculationExpression#getAssigneeSequence()
	 * @see #getTracedIntegerCalculationExpression()
	 * @generated
	 */
	EReference getTracedIntegerCalculationExpression_AssigneeSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.States.activitydiagram.TracedIntegerCalculationExpression#getOperatorSequence <em>Operator Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operator Sequence</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedIntegerCalculationExpression#getOperatorSequence()
	 * @see #getTracedIntegerCalculationExpression()
	 * @generated
	 */
	EReference getTracedIntegerCalculationExpression_OperatorSequence();

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
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.States.activitydiagram.TracedIntegerComparisonExpression#getAssigneeSequence <em>Assignee Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assignee Sequence</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedIntegerComparisonExpression#getAssigneeSequence()
	 * @see #getTracedIntegerComparisonExpression()
	 * @generated
	 */
	EReference getTracedIntegerComparisonExpression_AssigneeSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.States.activitydiagram.TracedIntegerComparisonExpression#getOperatorSequence <em>Operator Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operator Sequence</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedIntegerComparisonExpression#getOperatorSequence()
	 * @see #getTracedIntegerComparisonExpression()
	 * @generated
	 */
	EReference getTracedIntegerComparisonExpression_OperatorSequence();

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
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.States.activitydiagram.TracedIntegerExpression#getOperand1Sequence <em>Operand1 Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operand1 Sequence</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedIntegerExpression#getOperand1Sequence()
	 * @see #getTracedIntegerExpression()
	 * @generated
	 */
	EReference getTracedIntegerExpression_Operand1Sequence();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.States.activitydiagram.TracedIntegerExpression#getOperand2Sequence <em>Operand2 Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operand2 Sequence</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedIntegerExpression#getOperand2Sequence()
	 * @see #getTracedIntegerExpression()
	 * @generated
	 */
	EReference getTracedIntegerExpression_Operand2Sequence();

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
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.States.activitydiagram.TracedIntegerValue#getValueSequence <em>Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value Sequence</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedIntegerValue#getValueSequence()
	 * @see #getTracedIntegerValue()
	 * @generated
	 */
	EReference getTracedIntegerValue_ValueSequence();

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
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.States.activitydiagram.TracedNamedElement#getNameSequence <em>Name Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Name Sequence</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedNamedElement#getNameSequence()
	 * @see #getTracedNamedElement()
	 * @generated
	 */
	EReference getTracedNamedElement_NameSequence();

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
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.activitydiagram.TracedOffer#getOfferedTokens <em>Offered Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Offered Tokens</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedOffer#getOfferedTokens()
	 * @see #getTracedOffer()
	 * @generated
	 */
	EReference getTracedOffer_OfferedTokens();

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
	 * Returns the meta object for the reference '{@link activitydiagramTrace.States.activitydiagram.TracedOffer#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedOffer#getOriginalObject()
	 * @see #getTracedOffer()
	 * @generated
	 */
	EReference getTracedOffer_OriginalObject();

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
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.States.activitydiagram.TracedOpaqueAction#getExpressionsSequence <em>Expressions Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions Sequence</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedOpaqueAction#getExpressionsSequence()
	 * @see #getTracedOpaqueAction()
	 * @generated
	 */
	EReference getTracedOpaqueAction_ExpressionsSequence();

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
	 * Returns the meta object for the reference '{@link activitydiagramTrace.States.activitydiagram.TracedToken#getHolder <em>Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Holder</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedToken#getHolder()
	 * @see #getTracedToken()
	 * @generated
	 */
	EReference getTracedToken_Holder();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.States.activitydiagram.TracedToken#getHolderSequence <em>Holder Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Holder Sequence</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedToken#getHolderSequence()
	 * @see #getTracedToken()
	 * @generated
	 */
	EReference getTracedToken_HolderSequence();

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
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.activitydiagram.TracedTrace#getExecutedNodes <em>Executed Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Executed Nodes</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedTrace#getExecutedNodes()
	 * @see #getTracedTrace()
	 * @generated
	 */
	EReference getTracedTrace_ExecutedNodes();

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
	 * Returns the meta object for the reference '{@link activitydiagramTrace.States.activitydiagram.TracedTrace#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedTrace#getOriginalObject()
	 * @see #getTracedTrace()
	 * @generated
	 */
	EReference getTracedTrace_OriginalObject();

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
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.States.activitydiagram.TracedVariable#getInitialValueSequence <em>Initial Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Initial Value Sequence</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedVariable#getInitialValueSequence()
	 * @see #getTracedVariable()
	 * @generated
	 */
	EReference getTracedVariable_InitialValueSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.States.activitydiagram.TracedVariable#getNameSequence <em>Name Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Name Sequence</em>'.
	 * @see activitydiagramTrace.States.activitydiagram.TracedVariable#getNameSequence()
	 * @see #getTracedVariable()
	 * @generated
	 */
	EReference getTracedVariable_NameSequence();

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
		 * The meta object literal for the '<em><b>Edges Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ACTIVITY__EDGES_SEQUENCE = eINSTANCE.getTracedActivity_EdgesSequence();

		/**
		 * The meta object literal for the '<em><b>Inputs Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ACTIVITY__INPUTS_SEQUENCE = eINSTANCE.getTracedActivity_InputsSequence();

		/**
		 * The meta object literal for the '<em><b>Locals Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ACTIVITY__LOCALS_SEQUENCE = eINSTANCE.getTracedActivity_LocalsSequence();

		/**
		 * The meta object literal for the '<em><b>Nodes Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ACTIVITY__NODES_SEQUENCE = eINSTANCE.getTracedActivity_NodesSequence();

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
		 * The meta object literal for the '<em><b>Source Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ACTIVITY_EDGE__SOURCE_SEQUENCE = eINSTANCE.getTracedActivityEdge_SourceSequence();

		/**
		 * The meta object literal for the '<em><b>Target Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ACTIVITY_EDGE__TARGET_SEQUENCE = eINSTANCE.getTracedActivityEdge_TargetSequence();

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
		 * The meta object literal for the '<em><b>Activity Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ACTIVITY_NODE__ACTIVITY_SEQUENCE = eINSTANCE.getTracedActivityNode_ActivitySequence();

		/**
		 * The meta object literal for the '<em><b>Held Tokens Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ACTIVITY_NODE__HELD_TOKENS_SEQUENCE = eINSTANCE.getTracedActivityNode_HeldTokensSequence();

		/**
		 * The meta object literal for the '<em><b>Incoming Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ACTIVITY_NODE__INCOMING_SEQUENCE = eINSTANCE.getTracedActivityNode_IncomingSequence();

		/**
		 * The meta object literal for the '<em><b>Outgoing Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ACTIVITY_NODE__OUTGOING_SEQUENCE = eINSTANCE.getTracedActivityNode_OutgoingSequence();

		/**
		 * The meta object literal for the '<em><b>Running Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ACTIVITY_NODE__RUNNING_SEQUENCE = eINSTANCE.getTracedActivityNode_RunningSequence();

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
		 * The meta object literal for the '<em><b>Operand1 Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_BOOLEAN_BINARY_EXPRESSION__OPERAND1_SEQUENCE = eINSTANCE.getTracedBooleanBinaryExpression_Operand1Sequence();

		/**
		 * The meta object literal for the '<em><b>Operand2 Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_BOOLEAN_BINARY_EXPRESSION__OPERAND2_SEQUENCE = eINSTANCE.getTracedBooleanBinaryExpression_Operand2Sequence();

		/**
		 * The meta object literal for the '<em><b>Operator Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_BOOLEAN_BINARY_EXPRESSION__OPERATOR_SEQUENCE = eINSTANCE.getTracedBooleanBinaryExpression_OperatorSequence();

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
		 * The meta object literal for the '<em><b>Assignee Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_BOOLEAN_EXPRESSION__ASSIGNEE_SEQUENCE = eINSTANCE.getTracedBooleanExpression_AssigneeSequence();

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
		 * The meta object literal for the '<em><b>Operand Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_BOOLEAN_UNARY_EXPRESSION__OPERAND_SEQUENCE = eINSTANCE.getTracedBooleanUnaryExpression_OperandSequence();

		/**
		 * The meta object literal for the '<em><b>Operator Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_BOOLEAN_UNARY_EXPRESSION__OPERATOR_SEQUENCE = eINSTANCE.getTracedBooleanUnaryExpression_OperatorSequence();

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
		 * The meta object literal for the '<em><b>Value Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_BOOLEAN_VALUE__VALUE_SEQUENCE = eINSTANCE.getTracedBooleanValue_ValueSequence();

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
		 * The meta object literal for the '<em><b>Guard Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_CONTROL_FLOW__GUARD_SEQUENCE = eINSTANCE.getTracedControlFlow_GuardSequence();

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
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_CONTROL_TOKEN__ORIGINAL_OBJECT = eINSTANCE.getTracedControlToken_OriginalObject();

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
		 * The meta object literal for the '<em><b>Base Token</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_FORKED_TOKEN__BASE_TOKEN = eINSTANCE.getTracedForkedToken_BaseToken();

		/**
		 * The meta object literal for the '<em><b>Base Token Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_FORKED_TOKEN__BASE_TOKEN_SEQUENCE = eINSTANCE.getTracedForkedToken_BaseTokenSequence();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_FORKED_TOKEN__ORIGINAL_OBJECT = eINSTANCE.getTracedForkedToken_OriginalObject();

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
		 * The meta object literal for the '<em><b>Input Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_INPUT__INPUT_VALUES = eINSTANCE.getTracedInput_InputValues();

		/**
		 * The meta object literal for the '<em><b>Input Values Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_INPUT__INPUT_VALUES_SEQUENCE = eINSTANCE.getTracedInput_InputValuesSequence();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_INPUT__ORIGINAL_OBJECT = eINSTANCE.getTracedInput_OriginalObject();

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
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_INPUT_VALUE__ORIGINAL_OBJECT = eINSTANCE.getTracedInputValue_OriginalObject();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_INPUT_VALUE__VALUE = eINSTANCE.getTracedInputValue_Value();

		/**
		 * The meta object literal for the '<em><b>Value Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_INPUT_VALUE__VALUE_SEQUENCE = eINSTANCE.getTracedInputValue_ValueSequence();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_INPUT_VALUE__VARIABLE = eINSTANCE.getTracedInputValue_Variable();

		/**
		 * The meta object literal for the '<em><b>Variable Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_INPUT_VALUE__VARIABLE_SEQUENCE = eINSTANCE.getTracedInputValue_VariableSequence();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.activitydiagram.impl.TracedIntegerCalculationExpressionImpl <em>Traced Integer Calculation Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.activitydiagram.impl.TracedIntegerCalculationExpressionImpl
		 * @see activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl#getTracedIntegerCalculationExpression()
		 * @generated
		 */
		EClass TRACED_INTEGER_CALCULATION_EXPRESSION = eINSTANCE.getTracedIntegerCalculationExpression();

		/**
		 * The meta object literal for the '<em><b>Assignee Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_INTEGER_CALCULATION_EXPRESSION__ASSIGNEE_SEQUENCE = eINSTANCE.getTracedIntegerCalculationExpression_AssigneeSequence();

		/**
		 * The meta object literal for the '<em><b>Operator Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_INTEGER_CALCULATION_EXPRESSION__OPERATOR_SEQUENCE = eINSTANCE.getTracedIntegerCalculationExpression_OperatorSequence();

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
		 * The meta object literal for the '<em><b>Assignee Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_INTEGER_COMPARISON_EXPRESSION__ASSIGNEE_SEQUENCE = eINSTANCE.getTracedIntegerComparisonExpression_AssigneeSequence();

		/**
		 * The meta object literal for the '<em><b>Operator Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_INTEGER_COMPARISON_EXPRESSION__OPERATOR_SEQUENCE = eINSTANCE.getTracedIntegerComparisonExpression_OperatorSequence();

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
		 * The meta object literal for the '<em><b>Operand1 Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_INTEGER_EXPRESSION__OPERAND1_SEQUENCE = eINSTANCE.getTracedIntegerExpression_Operand1Sequence();

		/**
		 * The meta object literal for the '<em><b>Operand2 Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_INTEGER_EXPRESSION__OPERAND2_SEQUENCE = eINSTANCE.getTracedIntegerExpression_Operand2Sequence();

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
		 * The meta object literal for the '<em><b>Value Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_INTEGER_VALUE__VALUE_SEQUENCE = eINSTANCE.getTracedIntegerValue_ValueSequence();

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
		 * The meta object literal for the '<em><b>Name Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_NAMED_ELEMENT__NAME_SEQUENCE = eINSTANCE.getTracedNamedElement_NameSequence();

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
		 * The meta object literal for the '<em><b>Offered Tokens</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_OFFER__OFFERED_TOKENS = eINSTANCE.getTracedOffer_OfferedTokens();

		/**
		 * The meta object literal for the '<em><b>Offered Tokens Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_OFFER__OFFERED_TOKENS_SEQUENCE = eINSTANCE.getTracedOffer_OfferedTokensSequence();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_OFFER__ORIGINAL_OBJECT = eINSTANCE.getTracedOffer_OriginalObject();

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
		 * The meta object literal for the '<em><b>Expressions Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_OPAQUE_ACTION__EXPRESSIONS_SEQUENCE = eINSTANCE.getTracedOpaqueAction_ExpressionsSequence();

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
		 * The meta object literal for the '<em><b>Holder</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_TOKEN__HOLDER = eINSTANCE.getTracedToken_Holder();

		/**
		 * The meta object literal for the '<em><b>Holder Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_TOKEN__HOLDER_SEQUENCE = eINSTANCE.getTracedToken_HolderSequence();

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
		 * The meta object literal for the '<em><b>Executed Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_TRACE__EXECUTED_NODES = eINSTANCE.getTracedTrace_ExecutedNodes();

		/**
		 * The meta object literal for the '<em><b>Executed Nodes Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_TRACE__EXECUTED_NODES_SEQUENCE = eINSTANCE.getTracedTrace_ExecutedNodesSequence();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_TRACE__ORIGINAL_OBJECT = eINSTANCE.getTracedTrace_OriginalObject();

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

		/**
		 * The meta object literal for the '<em><b>Current Value Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_VARIABLE__CURRENT_VALUE_SEQUENCE = eINSTANCE.getTracedVariable_CurrentValueSequence();

		/**
		 * The meta object literal for the '<em><b>Initial Value Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_VARIABLE__INITIAL_VALUE_SEQUENCE = eINSTANCE.getTracedVariable_InitialValueSequence();

		/**
		 * The meta object literal for the '<em><b>Name Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_VARIABLE__NAME_SEQUENCE = eINSTANCE.getTracedVariable_NameSequence();

	}

} //ActivitydiagramPackage
