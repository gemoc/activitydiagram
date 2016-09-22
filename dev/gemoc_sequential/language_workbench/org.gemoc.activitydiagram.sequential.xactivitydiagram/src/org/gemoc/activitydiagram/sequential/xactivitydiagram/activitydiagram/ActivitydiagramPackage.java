/**
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramFactory
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
	String eNS_URI = "http://xactivitydiagram/activitydiagram/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "activitydiagram";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ActivitydiagramPackage eINSTANCE = org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.NamedElementImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivityImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NODES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__EDGES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Locals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__LOCALS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__INPUTS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Trace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__TRACE = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivityNodeImpl <em>Activity Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivityNodeImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getActivityNode()
	 * @generated
	 */
	int ACTIVITY_NODE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__OUTGOING = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__INCOMING = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__ACTIVITY = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__RUNNING = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__HELD_TOKENS = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Activity Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivityEdgeImpl <em>Activity Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivityEdgeImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getActivityEdge()
	 * @generated
	 */
	int ACTIVITY_EDGE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__SOURCE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__TARGET = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Offers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__OFFERS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Activity Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ControlFlowImpl <em>Control Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ControlFlowImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getControlFlow()
	 * @generated
	 */
	int CONTROL_FLOW = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__NAME = ACTIVITY_EDGE__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__SOURCE = ACTIVITY_EDGE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__TARGET = ACTIVITY_EDGE__TARGET;

	/**
	 * The feature id for the '<em><b>Offers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__OFFERS = ACTIVITY_EDGE__OFFERS;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__GUARD = ACTIVITY_EDGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Control Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_FEATURE_COUNT = ACTIVITY_EDGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ControlNodeImpl <em>Control Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ControlNodeImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getControlNode()
	 * @generated
	 */
	int CONTROL_NODE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__NAME = ACTIVITY_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__OUTGOING = ACTIVITY_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__INCOMING = ACTIVITY_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__ACTIVITY = ACTIVITY_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__RUNNING = ACTIVITY_NODE__RUNNING;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__HELD_TOKENS = ACTIVITY_NODE__HELD_TOKENS;

	/**
	 * The number of structural features of the '<em>Control Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_FEATURE_COUNT = ACTIVITY_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ExecutableNodeImpl <em>Executable Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ExecutableNodeImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getExecutableNode()
	 * @generated
	 */
	int EXECUTABLE_NODE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__NAME = ACTIVITY_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__OUTGOING = ACTIVITY_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__INCOMING = ACTIVITY_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__ACTIVITY = ACTIVITY_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__RUNNING = ACTIVITY_NODE__RUNNING;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__HELD_TOKENS = ACTIVITY_NODE__HELD_TOKENS;

	/**
	 * The number of structural features of the '<em>Executable Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE_FEATURE_COUNT = ACTIVITY_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActionImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = EXECUTABLE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__OUTGOING = EXECUTABLE_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__INCOMING = EXECUTABLE_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ACTIVITY = EXECUTABLE_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__RUNNING = EXECUTABLE_NODE__RUNNING;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__HELD_TOKENS = EXECUTABLE_NODE__HELD_TOKENS;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = EXECUTABLE_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.OpaqueActionImpl <em>Opaque Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.OpaqueActionImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getOpaqueAction()
	 * @generated
	 */
	int OPAQUE_ACTION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION__OUTGOING = ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION__INCOMING = ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION__ACTIVITY = ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION__RUNNING = ACTION__RUNNING;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION__HELD_TOKENS = ACTION__HELD_TOKENS;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION__EXPRESSIONS = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Opaque Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.InitialNodeImpl <em>Initial Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.InitialNodeImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getInitialNode()
	 * @generated
	 */
	int INITIAL_NODE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE__NAME = CONTROL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE__OUTGOING = CONTROL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE__INCOMING = CONTROL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE__ACTIVITY = CONTROL_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE__RUNNING = CONTROL_NODE__RUNNING;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE__HELD_TOKENS = CONTROL_NODE__HELD_TOKENS;

	/**
	 * The number of structural features of the '<em>Initial Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.FinalNodeImpl <em>Final Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.FinalNodeImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getFinalNode()
	 * @generated
	 */
	int FINAL_NODE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE__NAME = CONTROL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE__OUTGOING = CONTROL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE__INCOMING = CONTROL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE__ACTIVITY = CONTROL_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE__RUNNING = CONTROL_NODE__RUNNING;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE__HELD_TOKENS = CONTROL_NODE__HELD_TOKENS;

	/**
	 * The number of structural features of the '<em>Final Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivityFinalNodeImpl <em>Activity Final Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivityFinalNodeImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getActivityFinalNode()
	 * @generated
	 */
	int ACTIVITY_FINAL_NODE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE__NAME = FINAL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE__OUTGOING = FINAL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE__INCOMING = FINAL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE__ACTIVITY = FINAL_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE__RUNNING = FINAL_NODE__RUNNING;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE__HELD_TOKENS = FINAL_NODE__HELD_TOKENS;

	/**
	 * The number of structural features of the '<em>Activity Final Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_FEATURE_COUNT = FINAL_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ForkNodeImpl <em>Fork Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ForkNodeImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getForkNode()
	 * @generated
	 */
	int FORK_NODE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE__NAME = CONTROL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE__OUTGOING = CONTROL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE__INCOMING = CONTROL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE__ACTIVITY = CONTROL_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE__RUNNING = CONTROL_NODE__RUNNING;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE__HELD_TOKENS = CONTROL_NODE__HELD_TOKENS;

	/**
	 * The number of structural features of the '<em>Fork Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.JoinNodeImpl <em>Join Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.JoinNodeImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getJoinNode()
	 * @generated
	 */
	int JOIN_NODE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE__NAME = CONTROL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE__OUTGOING = CONTROL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE__INCOMING = CONTROL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE__ACTIVITY = CONTROL_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE__RUNNING = CONTROL_NODE__RUNNING;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE__HELD_TOKENS = CONTROL_NODE__HELD_TOKENS;

	/**
	 * The number of structural features of the '<em>Join Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.MergeNodeImpl <em>Merge Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.MergeNodeImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getMergeNode()
	 * @generated
	 */
	int MERGE_NODE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE__NAME = CONTROL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE__OUTGOING = CONTROL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE__INCOMING = CONTROL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE__ACTIVITY = CONTROL_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE__RUNNING = CONTROL_NODE__RUNNING;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE__HELD_TOKENS = CONTROL_NODE__HELD_TOKENS;

	/**
	 * The number of structural features of the '<em>Merge Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.DecisionNodeImpl <em>Decision Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.DecisionNodeImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getDecisionNode()
	 * @generated
	 */
	int DECISION_NODE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE__NAME = CONTROL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE__OUTGOING = CONTROL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE__INCOMING = CONTROL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE__ACTIVITY = CONTROL_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE__RUNNING = CONTROL_NODE__RUNNING;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE__HELD_TOKENS = CONTROL_NODE__HELD_TOKENS;

	/**
	 * The number of structural features of the '<em>Decision Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.VariableImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 16;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__INITIAL_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__CURRENT_VALUE = 2;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.IntegerVariableImpl <em>Integer Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.IntegerVariableImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getIntegerVariable()
	 * @generated
	 */
	int INTEGER_VARIABLE = 17;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE__INITIAL_VALUE = VARIABLE__INITIAL_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE__CURRENT_VALUE = VARIABLE__CURRENT_VALUE;

	/**
	 * The number of structural features of the '<em>Integer Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.BooleanVariableImpl <em>Boolean Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.BooleanVariableImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getBooleanVariable()
	 * @generated
	 */
	int BOOLEAN_VARIABLE = 18;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE__INITIAL_VALUE = VARIABLE__INITIAL_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE__CURRENT_VALUE = VARIABLE__CURRENT_VALUE;

	/**
	 * The number of structural features of the '<em>Boolean Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ValueImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 19;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.BooleanValueImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getBooleanValue()
	 * @generated
	 */
	int BOOLEAN_VALUE = 20;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.IntegerValueImpl <em>Integer Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.IntegerValueImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getIntegerValue()
	 * @generated
	 */
	int INTEGER_VALUE = 21;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ExpressionImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 22;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.IntegerExpressionImpl <em>Integer Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.IntegerExpressionImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getIntegerExpression()
	 * @generated
	 */
	int INTEGER_EXPRESSION = 23;

	/**
	 * The feature id for the '<em><b>Operand2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXPRESSION__OPERAND2 = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operand1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXPRESSION__OPERAND1 = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Integer Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.BooleanExpressionImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getBooleanExpression()
	 * @generated
	 */
	int BOOLEAN_EXPRESSION = 24;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION__ASSIGNEE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.IntegerCalculationExpressionImpl <em>Integer Calculation Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.IntegerCalculationExpressionImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getIntegerCalculationExpression()
	 * @generated
	 */
	int INTEGER_CALCULATION_EXPRESSION = 25;

	/**
	 * The feature id for the '<em><b>Operand2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CALCULATION_EXPRESSION__OPERAND2 = INTEGER_EXPRESSION__OPERAND2;

	/**
	 * The feature id for the '<em><b>Operand1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CALCULATION_EXPRESSION__OPERAND1 = INTEGER_EXPRESSION__OPERAND1;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CALCULATION_EXPRESSION__ASSIGNEE = INTEGER_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CALCULATION_EXPRESSION__OPERATOR = INTEGER_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Integer Calculation Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CALCULATION_EXPRESSION_FEATURE_COUNT = INTEGER_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.IntegerComparisonExpressionImpl <em>Integer Comparison Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.IntegerComparisonExpressionImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getIntegerComparisonExpression()
	 * @generated
	 */
	int INTEGER_COMPARISON_EXPRESSION = 26;

	/**
	 * The feature id for the '<em><b>Operand2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_COMPARISON_EXPRESSION__OPERAND2 = INTEGER_EXPRESSION__OPERAND2;

	/**
	 * The feature id for the '<em><b>Operand1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_COMPARISON_EXPRESSION__OPERAND1 = INTEGER_EXPRESSION__OPERAND1;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_COMPARISON_EXPRESSION__ASSIGNEE = INTEGER_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_COMPARISON_EXPRESSION__OPERATOR = INTEGER_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Integer Comparison Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_COMPARISON_EXPRESSION_FEATURE_COUNT = INTEGER_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.BooleanUnaryExpressionImpl <em>Boolean Unary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.BooleanUnaryExpressionImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getBooleanUnaryExpression()
	 * @generated
	 */
	int BOOLEAN_UNARY_EXPRESSION = 27;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_UNARY_EXPRESSION__ASSIGNEE = BOOLEAN_EXPRESSION__ASSIGNEE;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_UNARY_EXPRESSION__OPERAND = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_UNARY_EXPRESSION__OPERATOR = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Boolean Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_UNARY_EXPRESSION_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.BooleanBinaryExpressionImpl <em>Boolean Binary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.BooleanBinaryExpressionImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getBooleanBinaryExpression()
	 * @generated
	 */
	int BOOLEAN_BINARY_EXPRESSION = 28;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BINARY_EXPRESSION__ASSIGNEE = BOOLEAN_EXPRESSION__ASSIGNEE;

	/**
	 * The feature id for the '<em><b>Operand1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BINARY_EXPRESSION__OPERAND1 = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operand2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BINARY_EXPRESSION__OPERAND2 = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BINARY_EXPRESSION__OPERATOR = BOOLEAN_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Boolean Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BINARY_EXPRESSION_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.OfferImpl <em>Offer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.OfferImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getOffer()
	 * @generated
	 */
	int OFFER = 29;

	/**
	 * The feature id for the '<em><b>Offered Tokens</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER__OFFERED_TOKENS = 0;

	/**
	 * The number of structural features of the '<em>Offer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.TokenImpl <em>Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.TokenImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getToken()
	 * @generated
	 */
	int TOKEN = 30;

	/**
	 * The feature id for the '<em><b>Holder</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__HOLDER = 0;

	/**
	 * The number of structural features of the '<em>Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.TraceImpl <em>Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.TraceImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getTrace()
	 * @generated
	 */
	int TRACE = 31;

	/**
	 * The feature id for the '<em><b>Executed Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__EXECUTED_NODES = 0;

	/**
	 * The number of structural features of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.InputValueImpl <em>Input Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.InputValueImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getInputValue()
	 * @generated
	 */
	int INPUT_VALUE = 32;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VALUE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VALUE__VARIABLE = 1;

	/**
	 * The number of structural features of the '<em>Input Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VALUE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.InputImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 33;

	/**
	 * The feature id for the '<em><b>Input Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__INPUT_VALUES = 0;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ControlTokenImpl <em>Control Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ControlTokenImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getControlToken()
	 * @generated
	 */
	int CONTROL_TOKEN = 34;

	/**
	 * The feature id for the '<em><b>Holder</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN__HOLDER = TOKEN__HOLDER;

	/**
	 * The number of structural features of the '<em>Control Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN_FEATURE_COUNT = TOKEN_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ForkedTokenImpl <em>Forked Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ForkedTokenImpl
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getForkedToken()
	 * @generated
	 */
	int FORKED_TOKEN = 35;

	/**
	 * The feature id for the '<em><b>Holder</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN__HOLDER = TOKEN__HOLDER;

	/**
	 * The feature id for the '<em><b>Base Token</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN__BASE_TOKEN = TOKEN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Remaining Offers Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN__REMAINING_OFFERS_COUNT = TOKEN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Forked Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN_FEATURE_COUNT = TOKEN_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerCalculationOperator <em>Integer Calculation Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerCalculationOperator
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getIntegerCalculationOperator()
	 * @generated
	 */
	int INTEGER_CALCULATION_OPERATOR = 36;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerComparisonOperator <em>Integer Comparison Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerComparisonOperator
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getIntegerComparisonOperator()
	 * @generated
	 */
	int INTEGER_COMPARISON_OPERATOR = 37;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanUnaryOperator <em>Boolean Unary Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanUnaryOperator
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getBooleanUnaryOperator()
	 * @generated
	 */
	int BOOLEAN_UNARY_OPERATOR = 38;

	/**
	 * The meta object id for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanBinaryOperator <em>Boolean Binary Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanBinaryOperator
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getBooleanBinaryOperator()
	 * @generated
	 */
	int BOOLEAN_BINARY_OPERATOR = 39;


	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Activity#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Activity#getNodes()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Activity#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Edges</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Activity#getEdges()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Edges();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Activity#getLocals <em>Locals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locals</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Activity#getLocals()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Locals();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Activity#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Activity#getInputs()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Inputs();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Activity#getTrace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trace</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Activity#getTrace()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Trace();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode <em>Activity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Node</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode
	 * @generated
	 */
	EClass getActivityNode();

	/**
	 * Returns the meta object for the reference list '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode#getOutgoing()
	 * @see #getActivityNode()
	 * @generated
	 */
	EReference getActivityNode_Outgoing();

	/**
	 * Returns the meta object for the reference list '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode#getIncoming()
	 * @see #getActivityNode()
	 * @generated
	 */
	EReference getActivityNode_Incoming();

	/**
	 * Returns the meta object for the container reference '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Activity</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode#getActivity()
	 * @see #getActivityNode()
	 * @generated
	 */
	EReference getActivityNode_Activity();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode#isRunning <em>Running</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Running</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode#isRunning()
	 * @see #getActivityNode()
	 * @generated
	 */
	EAttribute getActivityNode_Running();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode#getHeldTokens <em>Held Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Held Tokens</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode#getHeldTokens()
	 * @see #getActivityNode()
	 * @generated
	 */
	EReference getActivityNode_HeldTokens();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityEdge <em>Activity Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Edge</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityEdge
	 * @generated
	 */
	EClass getActivityEdge();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityEdge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityEdge#getSource()
	 * @see #getActivityEdge()
	 * @generated
	 */
	EReference getActivityEdge_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityEdge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityEdge#getTarget()
	 * @see #getActivityEdge()
	 * @generated
	 */
	EReference getActivityEdge_Target();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityEdge#getOffers <em>Offers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Offers</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityEdge#getOffers()
	 * @see #getActivityEdge()
	 * @generated
	 */
	EReference getActivityEdge_Offers();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlFlow <em>Control Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Flow</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlFlow
	 * @generated
	 */
	EClass getControlFlow();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlFlow#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Guard</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlFlow#getGuard()
	 * @see #getControlFlow()
	 * @generated
	 */
	EReference getControlFlow_Guard();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlNode <em>Control Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Node</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlNode
	 * @generated
	 */
	EClass getControlNode();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ExecutableNode <em>Executable Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executable Node</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ExecutableNode
	 * @generated
	 */
	EClass getExecutableNode();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.OpaqueAction <em>Opaque Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opaque Action</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.OpaqueAction
	 * @generated
	 */
	EClass getOpaqueAction();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.OpaqueAction#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.OpaqueAction#getExpressions()
	 * @see #getOpaqueAction()
	 * @generated
	 */
	EReference getOpaqueAction_Expressions();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InitialNode <em>Initial Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial Node</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InitialNode
	 * @generated
	 */
	EClass getInitialNode();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.FinalNode <em>Final Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final Node</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.FinalNode
	 * @generated
	 */
	EClass getFinalNode();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityFinalNode <em>Activity Final Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Final Node</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityFinalNode
	 * @generated
	 */
	EClass getActivityFinalNode();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ForkNode <em>Fork Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fork Node</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ForkNode
	 * @generated
	 */
	EClass getForkNode();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.JoinNode <em>Join Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join Node</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.JoinNode
	 * @generated
	 */
	EClass getJoinNode();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.MergeNode <em>Merge Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merge Node</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.MergeNode
	 * @generated
	 */
	EClass getMergeNode();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DecisionNode <em>Decision Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision Node</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DecisionNode
	 * @generated
	 */
	EClass getDecisionNode();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Variable#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial Value</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Variable#getInitialValue()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_InitialValue();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Variable#getCurrentValue <em>Current Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Current Value</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Variable#getCurrentValue()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_CurrentValue();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariable <em>Integer Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Variable</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariable
	 * @generated
	 */
	EClass getIntegerVariable();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariable <em>Boolean Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Variable</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariable
	 * @generated
	 */
	EClass getBooleanVariable();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Value</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanValue
	 * @generated
	 */
	EClass getBooleanValue();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanValue#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanValue#isValue()
	 * @see #getBooleanValue()
	 * @generated
	 */
	EAttribute getBooleanValue_Value();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Value</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerValue
	 * @generated
	 */
	EClass getIntegerValue();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerValue#getValue()
	 * @see #getIntegerValue()
	 * @generated
	 */
	EAttribute getIntegerValue_Value();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerExpression <em>Integer Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Expression</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerExpression
	 * @generated
	 */
	EClass getIntegerExpression();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerExpression#getOperand2 <em>Operand2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operand2</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerExpression#getOperand2()
	 * @see #getIntegerExpression()
	 * @generated
	 */
	EReference getIntegerExpression_Operand2();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerExpression#getOperand1 <em>Operand1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operand1</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerExpression#getOperand1()
	 * @see #getIntegerExpression()
	 * @generated
	 */
	EReference getIntegerExpression_Operand1();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanExpression <em>Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Expression</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanExpression
	 * @generated
	 */
	EClass getBooleanExpression();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanExpression#getAssignee <em>Assignee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assignee</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanExpression#getAssignee()
	 * @see #getBooleanExpression()
	 * @generated
	 */
	EReference getBooleanExpression_Assignee();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerCalculationExpression <em>Integer Calculation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Calculation Expression</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerCalculationExpression
	 * @generated
	 */
	EClass getIntegerCalculationExpression();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerCalculationExpression#getAssignee <em>Assignee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assignee</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerCalculationExpression#getAssignee()
	 * @see #getIntegerCalculationExpression()
	 * @generated
	 */
	EReference getIntegerCalculationExpression_Assignee();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerCalculationExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerCalculationExpression#getOperator()
	 * @see #getIntegerCalculationExpression()
	 * @generated
	 */
	EAttribute getIntegerCalculationExpression_Operator();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerComparisonExpression <em>Integer Comparison Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Comparison Expression</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerComparisonExpression
	 * @generated
	 */
	EClass getIntegerComparisonExpression();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerComparisonExpression#getAssignee <em>Assignee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assignee</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerComparisonExpression#getAssignee()
	 * @see #getIntegerComparisonExpression()
	 * @generated
	 */
	EReference getIntegerComparisonExpression_Assignee();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerComparisonExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerComparisonExpression#getOperator()
	 * @see #getIntegerComparisonExpression()
	 * @generated
	 */
	EAttribute getIntegerComparisonExpression_Operator();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanUnaryExpression <em>Boolean Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Unary Expression</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanUnaryExpression
	 * @generated
	 */
	EClass getBooleanUnaryExpression();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanUnaryExpression#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operand</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanUnaryExpression#getOperand()
	 * @see #getBooleanUnaryExpression()
	 * @generated
	 */
	EReference getBooleanUnaryExpression_Operand();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanUnaryExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanUnaryExpression#getOperator()
	 * @see #getBooleanUnaryExpression()
	 * @generated
	 */
	EAttribute getBooleanUnaryExpression_Operator();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanBinaryExpression <em>Boolean Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Binary Expression</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanBinaryExpression
	 * @generated
	 */
	EClass getBooleanBinaryExpression();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanBinaryExpression#getOperand1 <em>Operand1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operand1</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanBinaryExpression#getOperand1()
	 * @see #getBooleanBinaryExpression()
	 * @generated
	 */
	EReference getBooleanBinaryExpression_Operand1();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanBinaryExpression#getOperand2 <em>Operand2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operand2</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanBinaryExpression#getOperand2()
	 * @see #getBooleanBinaryExpression()
	 * @generated
	 */
	EReference getBooleanBinaryExpression_Operand2();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanBinaryExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanBinaryExpression#getOperator()
	 * @see #getBooleanBinaryExpression()
	 * @generated
	 */
	EAttribute getBooleanBinaryExpression_Operator();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Offer <em>Offer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Offer</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Offer
	 * @generated
	 */
	EClass getOffer();

	/**
	 * Returns the meta object for the reference list '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Offer#getOfferedTokens <em>Offered Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Offered Tokens</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Offer#getOfferedTokens()
	 * @see #getOffer()
	 * @generated
	 */
	EReference getOffer_OfferedTokens();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token
	 * @generated
	 */
	EClass getToken();

	/**
	 * Returns the meta object for the container reference '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token#getHolder <em>Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Holder</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token#getHolder()
	 * @see #getToken()
	 * @generated
	 */
	EReference getToken_Holder();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Trace
	 * @generated
	 */
	EClass getTrace();

	/**
	 * Returns the meta object for the reference list '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Trace#getExecutedNodes <em>Executed Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Executed Nodes</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Trace#getExecutedNodes()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_ExecutedNodes();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InputValue <em>Input Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Value</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InputValue
	 * @generated
	 */
	EClass getInputValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InputValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InputValue#getValue()
	 * @see #getInputValue()
	 * @generated
	 */
	EReference getInputValue_Value();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InputValue#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InputValue#getVariable()
	 * @see #getInputValue()
	 * @generated
	 */
	EReference getInputValue_Variable();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Input#getInputValues <em>Input Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Values</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Input#getInputValues()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_InputValues();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken <em>Control Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Token</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken
	 * @generated
	 */
	EClass getControlToken();

	/**
	 * Returns the meta object for class '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ForkedToken <em>Forked Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forked Token</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ForkedToken
	 * @generated
	 */
	EClass getForkedToken();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ForkedToken#getBaseToken <em>Base Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Token</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ForkedToken#getBaseToken()
	 * @see #getForkedToken()
	 * @generated
	 */
	EReference getForkedToken_BaseToken();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ForkedToken#getRemainingOffersCount <em>Remaining Offers Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remaining Offers Count</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ForkedToken#getRemainingOffersCount()
	 * @see #getForkedToken()
	 * @generated
	 */
	EAttribute getForkedToken_RemainingOffersCount();

	/**
	 * Returns the meta object for enum '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerCalculationOperator <em>Integer Calculation Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Integer Calculation Operator</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerCalculationOperator
	 * @generated
	 */
	EEnum getIntegerCalculationOperator();

	/**
	 * Returns the meta object for enum '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerComparisonOperator <em>Integer Comparison Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Integer Comparison Operator</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerComparisonOperator
	 * @generated
	 */
	EEnum getIntegerComparisonOperator();

	/**
	 * Returns the meta object for enum '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanUnaryOperator <em>Boolean Unary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Boolean Unary Operator</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanUnaryOperator
	 * @generated
	 */
	EEnum getBooleanUnaryOperator();

	/**
	 * Returns the meta object for enum '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanBinaryOperator <em>Boolean Binary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Boolean Binary Operator</em>'.
	 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanBinaryOperator
	 * @generated
	 */
	EEnum getBooleanBinaryOperator();

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
		 * The meta object literal for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivityImpl
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__NODES = eINSTANCE.getActivity_Nodes();

		/**
		 * The meta object literal for the '<em><b>Edges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__EDGES = eINSTANCE.getActivity_Edges();

		/**
		 * The meta object literal for the '<em><b>Locals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__LOCALS = eINSTANCE.getActivity_Locals();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__INPUTS = eINSTANCE.getActivity_Inputs();

		/**
		 * The meta object literal for the '<em><b>Trace</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__TRACE = eINSTANCE.getActivity_Trace();

		/**
		 * The meta object literal for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivityNodeImpl <em>Activity Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivityNodeImpl
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getActivityNode()
		 * @generated
		 */
		EClass ACTIVITY_NODE = eINSTANCE.getActivityNode();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE__OUTGOING = eINSTANCE.getActivityNode_Outgoing();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE__INCOMING = eINSTANCE.getActivityNode_Incoming();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE__ACTIVITY = eINSTANCE.getActivityNode_Activity();

		/**
		 * The meta object literal for the '<em><b>Running</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_NODE__RUNNING = eINSTANCE.getActivityNode_Running();

		/**
		 * The meta object literal for the '<em><b>Held Tokens</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE__HELD_TOKENS = eINSTANCE.getActivityNode_HeldTokens();

		/**
		 * The meta object literal for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivityEdgeImpl <em>Activity Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivityEdgeImpl
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getActivityEdge()
		 * @generated
		 */
		EClass ACTIVITY_EDGE = eINSTANCE.getActivityEdge();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE__SOURCE = eINSTANCE.getActivityEdge_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE__TARGET = eINSTANCE.getActivityEdge_Target();

		/**
		 * The meta object literal for the '<em><b>Offers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE__OFFERS = eINSTANCE.getActivityEdge_Offers();

		/**
		 * The meta object literal for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ControlFlowImpl <em>Control Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ControlFlowImpl
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getControlFlow()
		 * @generated
		 */
		EClass CONTROL_FLOW = eINSTANCE.getControlFlow();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_FLOW__GUARD = eINSTANCE.getControlFlow_Guard();

		/**
		 * The meta object literal for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ControlNodeImpl <em>Control Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ControlNodeImpl
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getControlNode()
		 * @generated
		 */
		EClass CONTROL_NODE = eINSTANCE.getControlNode();

		/**
		 * The meta object literal for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ExecutableNodeImpl <em>Executable Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ExecutableNodeImpl
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getExecutableNode()
		 * @generated
		 */
		EClass EXECUTABLE_NODE = eINSTANCE.getExecutableNode();

		/**
		 * The meta object literal for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActionImpl
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.OpaqueActionImpl <em>Opaque Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.OpaqueActionImpl
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getOpaqueAction()
		 * @generated
		 */
		EClass OPAQUE_ACTION = eINSTANCE.getOpaqueAction();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPAQUE_ACTION__EXPRESSIONS = eINSTANCE.getOpaqueAction_Expressions();

		/**
		 * The meta object literal for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.NamedElementImpl
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.InitialNodeImpl <em>Initial Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.InitialNodeImpl
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getInitialNode()
		 * @generated
		 */
		EClass INITIAL_NODE = eINSTANCE.getInitialNode();

		/**
		 * The meta object literal for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.FinalNodeImpl <em>Final Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.FinalNodeImpl
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getFinalNode()
		 * @generated
		 */
		EClass FINAL_NODE = eINSTANCE.getFinalNode();

		/**
		 * The meta object literal for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivityFinalNodeImpl <em>Activity Final Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivityFinalNodeImpl
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getActivityFinalNode()
		 * @generated
		 */
		EClass ACTIVITY_FINAL_NODE = eINSTANCE.getActivityFinalNode();

		/**
		 * The meta object literal for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ForkNodeImpl <em>Fork Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ForkNodeImpl
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getForkNode()
		 * @generated
		 */
		EClass FORK_NODE = eINSTANCE.getForkNode();

		/**
		 * The meta object literal for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.JoinNodeImpl <em>Join Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.JoinNodeImpl
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getJoinNode()
		 * @generated
		 */
		EClass JOIN_NODE = eINSTANCE.getJoinNode();

		/**
		 * The meta object literal for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.MergeNodeImpl <em>Merge Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.MergeNodeImpl
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getMergeNode()
		 * @generated
		 */
		EClass MERGE_NODE = eINSTANCE.getMergeNode();

		/**
		 * The meta object literal for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.DecisionNodeImpl <em>Decision Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.DecisionNodeImpl
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getDecisionNode()
		 * @generated
		 */
		EClass DECISION_NODE = eINSTANCE.getDecisionNode();

		/**
		 * The meta object literal for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.VariableImpl
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Initial Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__INITIAL_VALUE = eINSTANCE.getVariable_InitialValue();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Current Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__CURRENT_VALUE = eINSTANCE.getVariable_CurrentValue();

		/**
		 * The meta object literal for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.IntegerVariableImpl <em>Integer Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.IntegerVariableImpl
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getIntegerVariable()
		 * @generated
		 */
		EClass INTEGER_VARIABLE = eINSTANCE.getIntegerVariable();

		/**
		 * The meta object literal for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.BooleanVariableImpl <em>Boolean Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.BooleanVariableImpl
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getBooleanVariable()
		 * @generated
		 */
		EClass BOOLEAN_VARIABLE = eINSTANCE.getBooleanVariable();

		/**
		 * The meta object literal for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ValueImpl
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.BooleanValueImpl
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getBooleanValue()
		 * @generated
		 */
		EClass BOOLEAN_VALUE = eINSTANCE.getBooleanValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_VALUE__VALUE = eINSTANCE.getBooleanValue_Value();

		/**
		 * The meta object literal for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.IntegerValueImpl <em>Integer Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.IntegerValueImpl
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getIntegerValue()
		 * @generated
		 */
		EClass INTEGER_VALUE = eINSTANCE.getIntegerValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_VALUE__VALUE = eINSTANCE.getIntegerValue_Value();

		/**
		 * The meta object literal for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ExpressionImpl
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.IntegerExpressionImpl <em>Integer Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.IntegerExpressionImpl
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getIntegerExpression()
		 * @generated
		 */
		EClass INTEGER_EXPRESSION = eINSTANCE.getIntegerExpression();

		/**
		 * The meta object literal for the '<em><b>Operand2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGER_EXPRESSION__OPERAND2 = eINSTANCE.getIntegerExpression_Operand2();

		/**
		 * The meta object literal for the '<em><b>Operand1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGER_EXPRESSION__OPERAND1 = eINSTANCE.getIntegerExpression_Operand1();

		/**
		 * The meta object literal for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.BooleanExpressionImpl
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getBooleanExpression()
		 * @generated
		 */
		EClass BOOLEAN_EXPRESSION = eINSTANCE.getBooleanExpression();

		/**
		 * The meta object literal for the '<em><b>Assignee</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_EXPRESSION__ASSIGNEE = eINSTANCE.getBooleanExpression_Assignee();

		/**
		 * The meta object literal for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.IntegerCalculationExpressionImpl <em>Integer Calculation Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.IntegerCalculationExpressionImpl
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getIntegerCalculationExpression()
		 * @generated
		 */
		EClass INTEGER_CALCULATION_EXPRESSION = eINSTANCE.getIntegerCalculationExpression();

		/**
		 * The meta object literal for the '<em><b>Assignee</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGER_CALCULATION_EXPRESSION__ASSIGNEE = eINSTANCE.getIntegerCalculationExpression_Assignee();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_CALCULATION_EXPRESSION__OPERATOR = eINSTANCE.getIntegerCalculationExpression_Operator();

		/**
		 * The meta object literal for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.IntegerComparisonExpressionImpl <em>Integer Comparison Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.IntegerComparisonExpressionImpl
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getIntegerComparisonExpression()
		 * @generated
		 */
		EClass INTEGER_COMPARISON_EXPRESSION = eINSTANCE.getIntegerComparisonExpression();

		/**
		 * The meta object literal for the '<em><b>Assignee</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGER_COMPARISON_EXPRESSION__ASSIGNEE = eINSTANCE.getIntegerComparisonExpression_Assignee();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_COMPARISON_EXPRESSION__OPERATOR = eINSTANCE.getIntegerComparisonExpression_Operator();

		/**
		 * The meta object literal for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.BooleanUnaryExpressionImpl <em>Boolean Unary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.BooleanUnaryExpressionImpl
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getBooleanUnaryExpression()
		 * @generated
		 */
		EClass BOOLEAN_UNARY_EXPRESSION = eINSTANCE.getBooleanUnaryExpression();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_UNARY_EXPRESSION__OPERAND = eINSTANCE.getBooleanUnaryExpression_Operand();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_UNARY_EXPRESSION__OPERATOR = eINSTANCE.getBooleanUnaryExpression_Operator();

		/**
		 * The meta object literal for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.BooleanBinaryExpressionImpl <em>Boolean Binary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.BooleanBinaryExpressionImpl
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getBooleanBinaryExpression()
		 * @generated
		 */
		EClass BOOLEAN_BINARY_EXPRESSION = eINSTANCE.getBooleanBinaryExpression();

		/**
		 * The meta object literal for the '<em><b>Operand1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_BINARY_EXPRESSION__OPERAND1 = eINSTANCE.getBooleanBinaryExpression_Operand1();

		/**
		 * The meta object literal for the '<em><b>Operand2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_BINARY_EXPRESSION__OPERAND2 = eINSTANCE.getBooleanBinaryExpression_Operand2();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_BINARY_EXPRESSION__OPERATOR = eINSTANCE.getBooleanBinaryExpression_Operator();

		/**
		 * The meta object literal for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.OfferImpl <em>Offer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.OfferImpl
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getOffer()
		 * @generated
		 */
		EClass OFFER = eINSTANCE.getOffer();

		/**
		 * The meta object literal for the '<em><b>Offered Tokens</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OFFER__OFFERED_TOKENS = eINSTANCE.getOffer_OfferedTokens();

		/**
		 * The meta object literal for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.TokenImpl <em>Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.TokenImpl
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getToken()
		 * @generated
		 */
		EClass TOKEN = eINSTANCE.getToken();

		/**
		 * The meta object literal for the '<em><b>Holder</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN__HOLDER = eINSTANCE.getToken_Holder();

		/**
		 * The meta object literal for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.TraceImpl <em>Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.TraceImpl
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getTrace()
		 * @generated
		 */
		EClass TRACE = eINSTANCE.getTrace();

		/**
		 * The meta object literal for the '<em><b>Executed Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__EXECUTED_NODES = eINSTANCE.getTrace_ExecutedNodes();

		/**
		 * The meta object literal for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.InputValueImpl <em>Input Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.InputValueImpl
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getInputValue()
		 * @generated
		 */
		EClass INPUT_VALUE = eINSTANCE.getInputValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_VALUE__VALUE = eINSTANCE.getInputValue_Value();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_VALUE__VARIABLE = eINSTANCE.getInputValue_Variable();

		/**
		 * The meta object literal for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.InputImpl
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '<em><b>Input Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__INPUT_VALUES = eINSTANCE.getInput_InputValues();

		/**
		 * The meta object literal for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ControlTokenImpl <em>Control Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ControlTokenImpl
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getControlToken()
		 * @generated
		 */
		EClass CONTROL_TOKEN = eINSTANCE.getControlToken();

		/**
		 * The meta object literal for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ForkedTokenImpl <em>Forked Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ForkedTokenImpl
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getForkedToken()
		 * @generated
		 */
		EClass FORKED_TOKEN = eINSTANCE.getForkedToken();

		/**
		 * The meta object literal for the '<em><b>Base Token</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORKED_TOKEN__BASE_TOKEN = eINSTANCE.getForkedToken_BaseToken();

		/**
		 * The meta object literal for the '<em><b>Remaining Offers Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORKED_TOKEN__REMAINING_OFFERS_COUNT = eINSTANCE.getForkedToken_RemainingOffersCount();

		/**
		 * The meta object literal for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerCalculationOperator <em>Integer Calculation Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerCalculationOperator
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getIntegerCalculationOperator()
		 * @generated
		 */
		EEnum INTEGER_CALCULATION_OPERATOR = eINSTANCE.getIntegerCalculationOperator();

		/**
		 * The meta object literal for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerComparisonOperator <em>Integer Comparison Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerComparisonOperator
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getIntegerComparisonOperator()
		 * @generated
		 */
		EEnum INTEGER_COMPARISON_OPERATOR = eINSTANCE.getIntegerComparisonOperator();

		/**
		 * The meta object literal for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanUnaryOperator <em>Boolean Unary Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanUnaryOperator
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getBooleanUnaryOperator()
		 * @generated
		 */
		EEnum BOOLEAN_UNARY_OPERATOR = eINSTANCE.getBooleanUnaryOperator();

		/**
		 * The meta object literal for the '{@link org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanBinaryOperator <em>Boolean Binary Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanBinaryOperator
		 * @see org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getBooleanBinaryOperator()
		 * @generated
		 */
		EEnum BOOLEAN_BINARY_OPERATOR = eINSTANCE.getBooleanBinaryOperator();

	}

} //ActivitydiagramPackage
