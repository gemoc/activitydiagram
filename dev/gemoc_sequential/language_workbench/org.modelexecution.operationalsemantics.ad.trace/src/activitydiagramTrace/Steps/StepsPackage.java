/**
 */
package activitydiagramTrace.Steps;

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
 * @see activitydiagramTrace.Steps.StepsFactory
 * @model kind="package"
 * @generated
 */
public interface StepsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Steps";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "activitydiagramTrace_Steps";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "events";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StepsPackage eINSTANCE = activitydiagramTrace.Steps.impl.StepsPackageImpl.init();

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.SmallStepImpl <em>Small Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.SmallStepImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getSmallStep()
	 * @generated
	 */
	int SMALL_STEP = 0;

	/**
	 * The feature id for the '<em><b>Preceding State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_STEP__PRECEDING_STATE = 0;

	/**
	 * The number of structural features of the '<em>Small Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_STEP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Small Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.StepsImpl <em>Steps</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.StepsImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getSteps()
	 * @generated
	 */
	int STEPS = 1;

	/**
	 * The feature id for the '<em><b>Activitydiagram Activity Node Has Offers1 Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_HAS_OFFERS1_TRACE = 0;

	/**
	 * The feature id for the '<em><b>Activitydiagram Activity Node Send Offers1 Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1_TRACE = 1;

	/**
	 * The feature id for the '<em><b>Activitydiagram Activity Node Terminate Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE_TRACE = 2;

	/**
	 * The feature id for the '<em><b>Activitydiagram Variable Print Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPS__ACTIVITYDIAGRAM_VARIABLE_PRINT_TRACE = 3;

	/**
	 * The feature id for the '<em><b>Activitydiagram Activity Node Remove Token1 Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN1_TRACE = 4;

	/**
	 * The feature id for the '<em><b>Activitydiagram Activity Node Execute Fill Event Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_FILL_EVENT_TRACE = 5;

	/**
	 * The feature id for the '<em><b>Activitydiagram Activity Node Take Offerd Tokens1 Fill Event Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_FILL_EVENT_TRACE = 6;

	/**
	 * The feature id for the '<em><b>Activitydiagram Activity Node Add Tokens1 Fill Event Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_FILL_EVENT_TRACE = 7;

	/**
	 * The feature id for the '<em><b>Activitydiagram Variable Execute Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPS__ACTIVITYDIAGRAM_VARIABLE_EXECUTE_TRACE = 8;

	/**
	 * The feature id for the '<em><b>Activitydiagram Activity Initialize Context Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPS__ACTIVITYDIAGRAM_ACTIVITY_INITIALIZE_CONTEXT_TRACE = 9;

	/**
	 * The feature id for the '<em><b>Activitydiagram Variable Init Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPS__ACTIVITYDIAGRAM_VARIABLE_INIT_TRACE = 10;

	/**
	 * The feature id for the '<em><b>Activitydiagram Activity Node Is Ready Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_IS_READY_TRACE = 11;

	/**
	 * The feature id for the '<em><b>Fill Event Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPS__FILL_EVENT_TRACE = 12;

	/**
	 * The feature id for the '<em><b>Activitydiagram Activity Node Execute Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_TRACE = 13;

	/**
	 * The feature id for the '<em><b>Activitydiagram Activity Node Take Offerd Tokens1 Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_TRACE = 14;

	/**
	 * The feature id for the '<em><b>Activitydiagram Activity Node Add Tokens1 Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_TRACE = 15;

	/**
	 * The number of structural features of the '<em>Steps</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPS_FEATURE_COUNT = 16;

	/**
	 * The number of operations of the '<em>Steps</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.BigStepImpl <em>Big Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.BigStepImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getBigStep()
	 * @generated
	 */
	int BIG_STEP = 2;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_STEP__STARTING_STATE = 0;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_STEP__ENDING_STATE = 1;

	/**
	 * The number of structural features of the '<em>Big Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_STEP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Big Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_HasOffers1Impl <em>Activitydiagram Activity Node Has Offers1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_HasOffers1Impl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_HasOffers1()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_HAS_OFFERS1 = 3;

	/**
	 * The feature id for the '<em><b>Preceding State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_HAS_OFFERS1__PRECEDING_STATE = SMALL_STEP__PRECEDING_STATE;

	/**
	 * The feature id for the '<em><b>This</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_HAS_OFFERS1__THIS = SMALL_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Node Has Offers1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_HAS_OFFERS1_FEATURE_COUNT = SMALL_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Node Has Offers1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_HAS_OFFERS1_OPERATION_COUNT = SMALL_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_Execute_AbstractSubEventImpl <em>Activitydiagram Activity Node Execute Abstract Sub Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_Execute_AbstractSubEventImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_Execute_AbstractSubEvent()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_EVENT = 8;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Node Execute Abstract Sub Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_EVENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Node Execute Abstract Sub Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_SendOffers1Impl <em>Activitydiagram Activity Node Send Offers1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_SendOffers1Impl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_SendOffers1()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1 = 4;

	/**
	 * The feature id for the '<em><b>Preceding State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1__PRECEDING_STATE = ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>This</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1__THIS = ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Node Send Offers1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1_FEATURE_COUNT = ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Node Send Offers1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1_OPERATION_COUNT = ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_TerminateImpl <em>Activitydiagram Activity Node Terminate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_TerminateImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_Terminate()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE = 5;

	/**
	 * The feature id for the '<em><b>Preceding State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE__PRECEDING_STATE = SMALL_STEP__PRECEDING_STATE;

	/**
	 * The feature id for the '<em><b>This</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE__THIS = SMALL_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Node Terminate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE_FEATURE_COUNT = SMALL_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Node Terminate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE_OPERATION_COUNT = SMALL_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_Variable_PrintImpl <em>Activitydiagram Variable Print</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_Variable_PrintImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_Variable_Print()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_VARIABLE_PRINT = 6;

	/**
	 * The feature id for the '<em><b>Preceding State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_VARIABLE_PRINT__PRECEDING_STATE = SMALL_STEP__PRECEDING_STATE;

	/**
	 * The feature id for the '<em><b>This</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_VARIABLE_PRINT__THIS = SMALL_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activitydiagram Variable Print</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_VARIABLE_PRINT_FEATURE_COUNT = SMALL_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Activitydiagram Variable Print</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_VARIABLE_PRINT_OPERATION_COUNT = SMALL_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubEventImpl <em>Activitydiagram Activity Node Take Offerd Tokens1 Abstract Sub Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubEventImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubEvent()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_ABSTRACT_SUB_EVENT = 10;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Node Take Offerd Tokens1 Abstract Sub Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_ABSTRACT_SUB_EVENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Node Take Offerd Tokens1 Abstract Sub Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_ABSTRACT_SUB_EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_RemoveToken1Impl <em>Activitydiagram Activity Node Remove Token1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_RemoveToken1Impl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_RemoveToken1()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN1 = 7;

	/**
	 * The feature id for the '<em><b>Preceding State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN1__PRECEDING_STATE = ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_ABSTRACT_SUB_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>This</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN1__THIS = ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_ABSTRACT_SUB_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Node Remove Token1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN1_FEATURE_COUNT = ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_ABSTRACT_SUB_EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Node Remove Token1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN1_OPERATION_COUNT = ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_ABSTRACT_SUB_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_Execute_FillEventImpl <em>Activitydiagram Activity Node Execute Fill Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_Execute_FillEventImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_Execute_FillEvent()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_FILL_EVENT = 9;

	/**
	 * The feature id for the '<em><b>Preceding State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_FILL_EVENT__PRECEDING_STATE = ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Node Execute Fill Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_FILL_EVENT_FEATURE_COUNT = ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Node Execute Fill Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_FILL_EVENT_OPERATION_COUNT = ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_TakeOfferdTokens1_FillEventImpl <em>Activitydiagram Activity Node Take Offerd Tokens1 Fill Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_TakeOfferdTokens1_FillEventImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_TakeOfferdTokens1_FillEvent()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_FILL_EVENT = 11;

	/**
	 * The feature id for the '<em><b>Preceding State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_FILL_EVENT__PRECEDING_STATE = ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_ABSTRACT_SUB_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Node Take Offerd Tokens1 Fill Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_FILL_EVENT_FEATURE_COUNT = ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_ABSTRACT_SUB_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Node Take Offerd Tokens1 Fill Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_FILL_EVENT_OPERATION_COUNT = ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_ABSTRACT_SUB_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_AddTokens1_AbstractSubEventImpl <em>Activitydiagram Activity Node Add Tokens1 Abstract Sub Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_AddTokens1_AbstractSubEventImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_AddTokens1_AbstractSubEvent()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_ABSTRACT_SUB_EVENT = 12;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Node Add Tokens1 Abstract Sub Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_ABSTRACT_SUB_EVENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Node Add Tokens1 Abstract Sub Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_ABSTRACT_SUB_EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_AddTokens1_FillEventImpl <em>Activitydiagram Activity Node Add Tokens1 Fill Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_AddTokens1_FillEventImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_AddTokens1_FillEvent()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_FILL_EVENT = 13;

	/**
	 * The feature id for the '<em><b>Preceding State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_FILL_EVENT__PRECEDING_STATE = ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_ABSTRACT_SUB_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Node Add Tokens1 Fill Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_FILL_EVENT_FEATURE_COUNT = ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_ABSTRACT_SUB_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Node Add Tokens1 Fill Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_FILL_EVENT_OPERATION_COUNT = ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_ABSTRACT_SUB_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_Variable_ExecuteImpl <em>Activitydiagram Variable Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_Variable_ExecuteImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_Variable_Execute()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_VARIABLE_EXECUTE = 14;

	/**
	 * The feature id for the '<em><b>Preceding State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_VARIABLE_EXECUTE__PRECEDING_STATE = SMALL_STEP__PRECEDING_STATE;

	/**
	 * The feature id for the '<em><b>This</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_VARIABLE_EXECUTE__THIS = SMALL_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activitydiagram Variable Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_VARIABLE_EXECUTE_FEATURE_COUNT = SMALL_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Activitydiagram Variable Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_VARIABLE_EXECUTE_OPERATION_COUNT = SMALL_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_Activity_InitializeContextImpl <em>Activitydiagram Activity Initialize Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_Activity_InitializeContextImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_Activity_InitializeContext()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_INITIALIZE_CONTEXT = 15;

	/**
	 * The feature id for the '<em><b>Preceding State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_INITIALIZE_CONTEXT__PRECEDING_STATE = SMALL_STEP__PRECEDING_STATE;

	/**
	 * The feature id for the '<em><b>This</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_INITIALIZE_CONTEXT__THIS = SMALL_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Initialize Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_INITIALIZE_CONTEXT_FEATURE_COUNT = SMALL_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Initialize Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_INITIALIZE_CONTEXT_OPERATION_COUNT = SMALL_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_Variable_InitImpl <em>Activitydiagram Variable Init</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_Variable_InitImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_Variable_Init()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_VARIABLE_INIT = 16;

	/**
	 * The feature id for the '<em><b>Preceding State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_VARIABLE_INIT__PRECEDING_STATE = SMALL_STEP__PRECEDING_STATE;

	/**
	 * The feature id for the '<em><b>This</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_VARIABLE_INIT__THIS = SMALL_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activitydiagram Variable Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_VARIABLE_INIT_FEATURE_COUNT = SMALL_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Activitydiagram Variable Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_VARIABLE_INIT_OPERATION_COUNT = SMALL_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_IsReadyImpl <em>Activitydiagram Activity Node Is Ready</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_IsReadyImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_IsReady()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_IS_READY = 17;

	/**
	 * The feature id for the '<em><b>Preceding State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_IS_READY__PRECEDING_STATE = SMALL_STEP__PRECEDING_STATE;

	/**
	 * The feature id for the '<em><b>This</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_IS_READY__THIS = SMALL_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Node Is Ready</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_IS_READY_FEATURE_COUNT = SMALL_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Node Is Ready</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_IS_READY_OPERATION_COUNT = SMALL_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.FillEventImpl <em>Fill Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.FillEventImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getFillEvent()
	 * @generated
	 */
	int FILL_EVENT = 18;

	/**
	 * The feature id for the '<em><b>Preceding State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILL_EVENT__PRECEDING_STATE = SMALL_STEP__PRECEDING_STATE;

	/**
	 * The number of structural features of the '<em>Fill Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILL_EVENT_FEATURE_COUNT = SMALL_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fill Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILL_EVENT_OPERATION_COUNT = SMALL_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_ExecuteImpl <em>Activitydiagram Activity Node Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_ExecuteImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_Execute()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE = 19;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE__STARTING_STATE = BIG_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE__ENDING_STATE = BIG_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>This</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE__THIS = BIG_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE__SUB_STEPS = BIG_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Node Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_FEATURE_COUNT = BIG_STEP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Node Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_OPERATION_COUNT = BIG_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_TakeOfferdTokens1Impl <em>Activitydiagram Activity Node Take Offerd Tokens1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_TakeOfferdTokens1Impl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_TakeOfferdTokens1()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1 = 20;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1__STARTING_STATE = ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1__ENDING_STATE = ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>This</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1__THIS = ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_EVENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1__SUB_STEPS = ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_EVENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Node Take Offerd Tokens1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_FEATURE_COUNT = ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_EVENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Node Take Offerd Tokens1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_OPERATION_COUNT = ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_AddTokens1Impl <em>Activitydiagram Activity Node Add Tokens1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_AddTokens1Impl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_AddTokens1()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1 = 21;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1__STARTING_STATE = ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1__ENDING_STATE = ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>This</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1__THIS = ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_EVENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1__SUB_STEPS = ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_EVENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Node Add Tokens1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_FEATURE_COUNT = ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_EVENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Node Add Tokens1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_OPERATION_COUNT = ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_EVENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.SmallStep <em>Small Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Small Step</em>'.
	 * @see activitydiagramTrace.Steps.SmallStep
	 * @generated
	 */
	EClass getSmallStep();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.Steps.SmallStep#getPrecedingState <em>Preceding State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Preceding State</em>'.
	 * @see activitydiagramTrace.Steps.SmallStep#getPrecedingState()
	 * @see #getSmallStep()
	 * @generated
	 */
	EReference getSmallStep_PrecedingState();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Steps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Steps</em>'.
	 * @see activitydiagramTrace.Steps.Steps
	 * @generated
	 */
	EClass getSteps();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Steps.Steps#getActivitydiagram_ActivityNode_HasOffers1_Trace <em>Activitydiagram Activity Node Has Offers1 Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram Activity Node Has Offers1 Trace</em>'.
	 * @see activitydiagramTrace.Steps.Steps#getActivitydiagram_ActivityNode_HasOffers1_Trace()
	 * @see #getSteps()
	 * @generated
	 */
	EReference getSteps_Activitydiagram_ActivityNode_HasOffers1_Trace();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Steps.Steps#getActivitydiagram_ActivityNode_SendOffers1_Trace <em>Activitydiagram Activity Node Send Offers1 Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram Activity Node Send Offers1 Trace</em>'.
	 * @see activitydiagramTrace.Steps.Steps#getActivitydiagram_ActivityNode_SendOffers1_Trace()
	 * @see #getSteps()
	 * @generated
	 */
	EReference getSteps_Activitydiagram_ActivityNode_SendOffers1_Trace();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Steps.Steps#getActivitydiagram_ActivityNode_Terminate_Trace <em>Activitydiagram Activity Node Terminate Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram Activity Node Terminate Trace</em>'.
	 * @see activitydiagramTrace.Steps.Steps#getActivitydiagram_ActivityNode_Terminate_Trace()
	 * @see #getSteps()
	 * @generated
	 */
	EReference getSteps_Activitydiagram_ActivityNode_Terminate_Trace();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Steps.Steps#getActivitydiagram_Variable_Print_Trace <em>Activitydiagram Variable Print Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram Variable Print Trace</em>'.
	 * @see activitydiagramTrace.Steps.Steps#getActivitydiagram_Variable_Print_Trace()
	 * @see #getSteps()
	 * @generated
	 */
	EReference getSteps_Activitydiagram_Variable_Print_Trace();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Steps.Steps#getActivitydiagram_ActivityNode_RemoveToken1_Trace <em>Activitydiagram Activity Node Remove Token1 Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram Activity Node Remove Token1 Trace</em>'.
	 * @see activitydiagramTrace.Steps.Steps#getActivitydiagram_ActivityNode_RemoveToken1_Trace()
	 * @see #getSteps()
	 * @generated
	 */
	EReference getSteps_Activitydiagram_ActivityNode_RemoveToken1_Trace();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Steps.Steps#getActivitydiagram_ActivityNode_Execute_FillEvent_Trace <em>Activitydiagram Activity Node Execute Fill Event Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram Activity Node Execute Fill Event Trace</em>'.
	 * @see activitydiagramTrace.Steps.Steps#getActivitydiagram_ActivityNode_Execute_FillEvent_Trace()
	 * @see #getSteps()
	 * @generated
	 */
	EReference getSteps_Activitydiagram_ActivityNode_Execute_FillEvent_Trace();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Steps.Steps#getActivitydiagram_ActivityNode_TakeOfferdTokens1_FillEvent_Trace <em>Activitydiagram Activity Node Take Offerd Tokens1 Fill Event Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram Activity Node Take Offerd Tokens1 Fill Event Trace</em>'.
	 * @see activitydiagramTrace.Steps.Steps#getActivitydiagram_ActivityNode_TakeOfferdTokens1_FillEvent_Trace()
	 * @see #getSteps()
	 * @generated
	 */
	EReference getSteps_Activitydiagram_ActivityNode_TakeOfferdTokens1_FillEvent_Trace();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Steps.Steps#getActivitydiagram_ActivityNode_AddTokens1_FillEvent_Trace <em>Activitydiagram Activity Node Add Tokens1 Fill Event Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram Activity Node Add Tokens1 Fill Event Trace</em>'.
	 * @see activitydiagramTrace.Steps.Steps#getActivitydiagram_ActivityNode_AddTokens1_FillEvent_Trace()
	 * @see #getSteps()
	 * @generated
	 */
	EReference getSteps_Activitydiagram_ActivityNode_AddTokens1_FillEvent_Trace();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Steps.Steps#getActivitydiagram_Variable_Execute_Trace <em>Activitydiagram Variable Execute Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram Variable Execute Trace</em>'.
	 * @see activitydiagramTrace.Steps.Steps#getActivitydiagram_Variable_Execute_Trace()
	 * @see #getSteps()
	 * @generated
	 */
	EReference getSteps_Activitydiagram_Variable_Execute_Trace();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Steps.Steps#getActivitydiagram_Activity_InitializeContext_Trace <em>Activitydiagram Activity Initialize Context Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram Activity Initialize Context Trace</em>'.
	 * @see activitydiagramTrace.Steps.Steps#getActivitydiagram_Activity_InitializeContext_Trace()
	 * @see #getSteps()
	 * @generated
	 */
	EReference getSteps_Activitydiagram_Activity_InitializeContext_Trace();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Steps.Steps#getActivitydiagram_Variable_Init_Trace <em>Activitydiagram Variable Init Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram Variable Init Trace</em>'.
	 * @see activitydiagramTrace.Steps.Steps#getActivitydiagram_Variable_Init_Trace()
	 * @see #getSteps()
	 * @generated
	 */
	EReference getSteps_Activitydiagram_Variable_Init_Trace();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Steps.Steps#getActivitydiagram_ActivityNode_IsReady_Trace <em>Activitydiagram Activity Node Is Ready Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram Activity Node Is Ready Trace</em>'.
	 * @see activitydiagramTrace.Steps.Steps#getActivitydiagram_ActivityNode_IsReady_Trace()
	 * @see #getSteps()
	 * @generated
	 */
	EReference getSteps_Activitydiagram_ActivityNode_IsReady_Trace();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Steps.Steps#getFillEvent_Trace <em>Fill Event Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fill Event Trace</em>'.
	 * @see activitydiagramTrace.Steps.Steps#getFillEvent_Trace()
	 * @see #getSteps()
	 * @generated
	 */
	EReference getSteps_FillEvent_Trace();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Steps.Steps#getActivitydiagram_ActivityNode_Execute_Trace <em>Activitydiagram Activity Node Execute Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram Activity Node Execute Trace</em>'.
	 * @see activitydiagramTrace.Steps.Steps#getActivitydiagram_ActivityNode_Execute_Trace()
	 * @see #getSteps()
	 * @generated
	 */
	EReference getSteps_Activitydiagram_ActivityNode_Execute_Trace();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Steps.Steps#getActivitydiagram_ActivityNode_TakeOfferdTokens1_Trace <em>Activitydiagram Activity Node Take Offerd Tokens1 Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram Activity Node Take Offerd Tokens1 Trace</em>'.
	 * @see activitydiagramTrace.Steps.Steps#getActivitydiagram_ActivityNode_TakeOfferdTokens1_Trace()
	 * @see #getSteps()
	 * @generated
	 */
	EReference getSteps_Activitydiagram_ActivityNode_TakeOfferdTokens1_Trace();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Steps.Steps#getActivitydiagram_ActivityNode_AddTokens1_Trace <em>Activitydiagram Activity Node Add Tokens1 Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram Activity Node Add Tokens1 Trace</em>'.
	 * @see activitydiagramTrace.Steps.Steps#getActivitydiagram_ActivityNode_AddTokens1_Trace()
	 * @see #getSteps()
	 * @generated
	 */
	EReference getSteps_Activitydiagram_ActivityNode_AddTokens1_Trace();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.BigStep <em>Big Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Big Step</em>'.
	 * @see activitydiagramTrace.Steps.BigStep
	 * @generated
	 */
	EClass getBigStep();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.Steps.BigStep#getStartingState <em>Starting State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Starting State</em>'.
	 * @see activitydiagramTrace.Steps.BigStep#getStartingState()
	 * @see #getBigStep()
	 * @generated
	 */
	EReference getBigStep_StartingState();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.Steps.BigStep#getEndingState <em>Ending State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ending State</em>'.
	 * @see activitydiagramTrace.Steps.BigStep#getEndingState()
	 * @see #getBigStep()
	 * @generated
	 */
	EReference getBigStep_EndingState();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_HasOffers1 <em>Activitydiagram Activity Node Has Offers1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Activity Node Has Offers1</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_HasOffers1
	 * @generated
	 */
	EClass getActivitydiagram_ActivityNode_HasOffers1();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_HasOffers1#getThis <em>This</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>This</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_HasOffers1#getThis()
	 * @see #getActivitydiagram_ActivityNode_HasOffers1()
	 * @generated
	 */
	EReference getActivitydiagram_ActivityNode_HasOffers1_This();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_SendOffers1 <em>Activitydiagram Activity Node Send Offers1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Activity Node Send Offers1</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_SendOffers1
	 * @generated
	 */
	EClass getActivitydiagram_ActivityNode_SendOffers1();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_SendOffers1#getThis <em>This</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>This</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_SendOffers1#getThis()
	 * @see #getActivitydiagram_ActivityNode_SendOffers1()
	 * @generated
	 */
	EReference getActivitydiagram_ActivityNode_SendOffers1_This();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Terminate <em>Activitydiagram Activity Node Terminate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Activity Node Terminate</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Terminate
	 * @generated
	 */
	EClass getActivitydiagram_ActivityNode_Terminate();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Terminate#getThis <em>This</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>This</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Terminate#getThis()
	 * @see #getActivitydiagram_ActivityNode_Terminate()
	 * @generated
	 */
	EReference getActivitydiagram_ActivityNode_Terminate_This();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_Variable_Print <em>Activitydiagram Variable Print</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Variable Print</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_Variable_Print
	 * @generated
	 */
	EClass getActivitydiagram_Variable_Print();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.Steps.Activitydiagram_Variable_Print#getThis <em>This</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>This</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_Variable_Print#getThis()
	 * @see #getActivitydiagram_Variable_Print()
	 * @generated
	 */
	EReference getActivitydiagram_Variable_Print_This();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_RemoveToken1 <em>Activitydiagram Activity Node Remove Token1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Activity Node Remove Token1</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_RemoveToken1
	 * @generated
	 */
	EClass getActivitydiagram_ActivityNode_RemoveToken1();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_RemoveToken1#getThis <em>This</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>This</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_RemoveToken1#getThis()
	 * @see #getActivitydiagram_ActivityNode_RemoveToken1()
	 * @generated
	 */
	EReference getActivitydiagram_ActivityNode_RemoveToken1_This();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute_AbstractSubEvent <em>Activitydiagram Activity Node Execute Abstract Sub Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Activity Node Execute Abstract Sub Event</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute_AbstractSubEvent
	 * @generated
	 */
	EClass getActivitydiagram_ActivityNode_Execute_AbstractSubEvent();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute_FillEvent <em>Activitydiagram Activity Node Execute Fill Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Activity Node Execute Fill Event</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute_FillEvent
	 * @generated
	 */
	EClass getActivitydiagram_ActivityNode_Execute_FillEvent();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubEvent <em>Activitydiagram Activity Node Take Offerd Tokens1 Abstract Sub Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Activity Node Take Offerd Tokens1 Abstract Sub Event</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubEvent
	 * @generated
	 */
	EClass getActivitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubEvent();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1_FillEvent <em>Activitydiagram Activity Node Take Offerd Tokens1 Fill Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Activity Node Take Offerd Tokens1 Fill Event</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1_FillEvent
	 * @generated
	 */
	EClass getActivitydiagram_ActivityNode_TakeOfferdTokens1_FillEvent();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1_AbstractSubEvent <em>Activitydiagram Activity Node Add Tokens1 Abstract Sub Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Activity Node Add Tokens1 Abstract Sub Event</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1_AbstractSubEvent
	 * @generated
	 */
	EClass getActivitydiagram_ActivityNode_AddTokens1_AbstractSubEvent();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1_FillEvent <em>Activitydiagram Activity Node Add Tokens1 Fill Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Activity Node Add Tokens1 Fill Event</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1_FillEvent
	 * @generated
	 */
	EClass getActivitydiagram_ActivityNode_AddTokens1_FillEvent();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_Variable_Execute <em>Activitydiagram Variable Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Variable Execute</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_Variable_Execute
	 * @generated
	 */
	EClass getActivitydiagram_Variable_Execute();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.Steps.Activitydiagram_Variable_Execute#getThis <em>This</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>This</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_Variable_Execute#getThis()
	 * @see #getActivitydiagram_Variable_Execute()
	 * @generated
	 */
	EReference getActivitydiagram_Variable_Execute_This();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_Activity_InitializeContext <em>Activitydiagram Activity Initialize Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Activity Initialize Context</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_Activity_InitializeContext
	 * @generated
	 */
	EClass getActivitydiagram_Activity_InitializeContext();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.Steps.Activitydiagram_Activity_InitializeContext#getThis <em>This</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>This</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_Activity_InitializeContext#getThis()
	 * @see #getActivitydiagram_Activity_InitializeContext()
	 * @generated
	 */
	EReference getActivitydiagram_Activity_InitializeContext_This();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_Variable_Init <em>Activitydiagram Variable Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Variable Init</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_Variable_Init
	 * @generated
	 */
	EClass getActivitydiagram_Variable_Init();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.Steps.Activitydiagram_Variable_Init#getThis <em>This</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>This</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_Variable_Init#getThis()
	 * @see #getActivitydiagram_Variable_Init()
	 * @generated
	 */
	EReference getActivitydiagram_Variable_Init_This();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_IsReady <em>Activitydiagram Activity Node Is Ready</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Activity Node Is Ready</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_IsReady
	 * @generated
	 */
	EClass getActivitydiagram_ActivityNode_IsReady();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_IsReady#getThis <em>This</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>This</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_IsReady#getThis()
	 * @see #getActivitydiagram_ActivityNode_IsReady()
	 * @generated
	 */
	EReference getActivitydiagram_ActivityNode_IsReady_This();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.FillEvent <em>Fill Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fill Event</em>'.
	 * @see activitydiagramTrace.Steps.FillEvent
	 * @generated
	 */
	EClass getFillEvent();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute <em>Activitydiagram Activity Node Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Activity Node Execute</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute
	 * @generated
	 */
	EClass getActivitydiagram_ActivityNode_Execute();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute#getThis <em>This</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>This</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute#getThis()
	 * @see #getActivitydiagram_ActivityNode_Execute()
	 * @generated
	 */
	EReference getActivitydiagram_ActivityNode_Execute_This();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute#getSubSteps <em>Sub Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Steps</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute#getSubSteps()
	 * @see #getActivitydiagram_ActivityNode_Execute()
	 * @generated
	 */
	EReference getActivitydiagram_ActivityNode_Execute_SubSteps();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1 <em>Activitydiagram Activity Node Take Offerd Tokens1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Activity Node Take Offerd Tokens1</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1
	 * @generated
	 */
	EClass getActivitydiagram_ActivityNode_TakeOfferdTokens1();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1#getThis <em>This</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>This</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1#getThis()
	 * @see #getActivitydiagram_ActivityNode_TakeOfferdTokens1()
	 * @generated
	 */
	EReference getActivitydiagram_ActivityNode_TakeOfferdTokens1_This();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1#getSubSteps <em>Sub Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Steps</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1#getSubSteps()
	 * @see #getActivitydiagram_ActivityNode_TakeOfferdTokens1()
	 * @generated
	 */
	EReference getActivitydiagram_ActivityNode_TakeOfferdTokens1_SubSteps();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1 <em>Activitydiagram Activity Node Add Tokens1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Activity Node Add Tokens1</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1
	 * @generated
	 */
	EClass getActivitydiagram_ActivityNode_AddTokens1();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1#getThis <em>This</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>This</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1#getThis()
	 * @see #getActivitydiagram_ActivityNode_AddTokens1()
	 * @generated
	 */
	EReference getActivitydiagram_ActivityNode_AddTokens1_This();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1#getSubSteps <em>Sub Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Steps</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1#getSubSteps()
	 * @see #getActivitydiagram_ActivityNode_AddTokens1()
	 * @generated
	 */
	EReference getActivitydiagram_ActivityNode_AddTokens1_SubSteps();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StepsFactory getStepsFactory();

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
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.SmallStepImpl <em>Small Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.SmallStepImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getSmallStep()
		 * @generated
		 */
		EClass SMALL_STEP = eINSTANCE.getSmallStep();

		/**
		 * The meta object literal for the '<em><b>Preceding State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMALL_STEP__PRECEDING_STATE = eINSTANCE.getSmallStep_PrecedingState();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.StepsImpl <em>Steps</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.StepsImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getSteps()
		 * @generated
		 */
		EClass STEPS = eINSTANCE.getSteps();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Activity Node Has Offers1 Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_HAS_OFFERS1_TRACE = eINSTANCE.getSteps_Activitydiagram_ActivityNode_HasOffers1_Trace();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Activity Node Send Offers1 Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1_TRACE = eINSTANCE.getSteps_Activitydiagram_ActivityNode_SendOffers1_Trace();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Activity Node Terminate Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE_TRACE = eINSTANCE.getSteps_Activitydiagram_ActivityNode_Terminate_Trace();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Variable Print Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEPS__ACTIVITYDIAGRAM_VARIABLE_PRINT_TRACE = eINSTANCE.getSteps_Activitydiagram_Variable_Print_Trace();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Activity Node Remove Token1 Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN1_TRACE = eINSTANCE.getSteps_Activitydiagram_ActivityNode_RemoveToken1_Trace();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Activity Node Execute Fill Event Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_FILL_EVENT_TRACE = eINSTANCE.getSteps_Activitydiagram_ActivityNode_Execute_FillEvent_Trace();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Activity Node Take Offerd Tokens1 Fill Event Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_FILL_EVENT_TRACE = eINSTANCE.getSteps_Activitydiagram_ActivityNode_TakeOfferdTokens1_FillEvent_Trace();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Activity Node Add Tokens1 Fill Event Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_FILL_EVENT_TRACE = eINSTANCE.getSteps_Activitydiagram_ActivityNode_AddTokens1_FillEvent_Trace();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Variable Execute Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEPS__ACTIVITYDIAGRAM_VARIABLE_EXECUTE_TRACE = eINSTANCE.getSteps_Activitydiagram_Variable_Execute_Trace();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Activity Initialize Context Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEPS__ACTIVITYDIAGRAM_ACTIVITY_INITIALIZE_CONTEXT_TRACE = eINSTANCE.getSteps_Activitydiagram_Activity_InitializeContext_Trace();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Variable Init Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEPS__ACTIVITYDIAGRAM_VARIABLE_INIT_TRACE = eINSTANCE.getSteps_Activitydiagram_Variable_Init_Trace();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Activity Node Is Ready Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_IS_READY_TRACE = eINSTANCE.getSteps_Activitydiagram_ActivityNode_IsReady_Trace();

		/**
		 * The meta object literal for the '<em><b>Fill Event Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEPS__FILL_EVENT_TRACE = eINSTANCE.getSteps_FillEvent_Trace();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Activity Node Execute Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_TRACE = eINSTANCE.getSteps_Activitydiagram_ActivityNode_Execute_Trace();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Activity Node Take Offerd Tokens1 Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_TRACE = eINSTANCE.getSteps_Activitydiagram_ActivityNode_TakeOfferdTokens1_Trace();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Activity Node Add Tokens1 Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_TRACE = eINSTANCE.getSteps_Activitydiagram_ActivityNode_AddTokens1_Trace();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.BigStepImpl <em>Big Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.BigStepImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getBigStep()
		 * @generated
		 */
		EClass BIG_STEP = eINSTANCE.getBigStep();

		/**
		 * The meta object literal for the '<em><b>Starting State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIG_STEP__STARTING_STATE = eINSTANCE.getBigStep_StartingState();

		/**
		 * The meta object literal for the '<em><b>Ending State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIG_STEP__ENDING_STATE = eINSTANCE.getBigStep_EndingState();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_HasOffers1Impl <em>Activitydiagram Activity Node Has Offers1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_HasOffers1Impl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_HasOffers1()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_ACTIVITY_NODE_HAS_OFFERS1 = eINSTANCE.getActivitydiagram_ActivityNode_HasOffers1();

		/**
		 * The meta object literal for the '<em><b>This</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITYDIAGRAM_ACTIVITY_NODE_HAS_OFFERS1__THIS = eINSTANCE.getActivitydiagram_ActivityNode_HasOffers1_This();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_SendOffers1Impl <em>Activitydiagram Activity Node Send Offers1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_SendOffers1Impl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_SendOffers1()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1 = eINSTANCE.getActivitydiagram_ActivityNode_SendOffers1();

		/**
		 * The meta object literal for the '<em><b>This</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1__THIS = eINSTANCE.getActivitydiagram_ActivityNode_SendOffers1_This();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_TerminateImpl <em>Activitydiagram Activity Node Terminate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_TerminateImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_Terminate()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE = eINSTANCE.getActivitydiagram_ActivityNode_Terminate();

		/**
		 * The meta object literal for the '<em><b>This</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE__THIS = eINSTANCE.getActivitydiagram_ActivityNode_Terminate_This();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_Variable_PrintImpl <em>Activitydiagram Variable Print</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_Variable_PrintImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_Variable_Print()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_VARIABLE_PRINT = eINSTANCE.getActivitydiagram_Variable_Print();

		/**
		 * The meta object literal for the '<em><b>This</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITYDIAGRAM_VARIABLE_PRINT__THIS = eINSTANCE.getActivitydiagram_Variable_Print_This();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_RemoveToken1Impl <em>Activitydiagram Activity Node Remove Token1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_RemoveToken1Impl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_RemoveToken1()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN1 = eINSTANCE.getActivitydiagram_ActivityNode_RemoveToken1();

		/**
		 * The meta object literal for the '<em><b>This</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN1__THIS = eINSTANCE.getActivitydiagram_ActivityNode_RemoveToken1_This();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_Execute_AbstractSubEventImpl <em>Activitydiagram Activity Node Execute Abstract Sub Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_Execute_AbstractSubEventImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_Execute_AbstractSubEvent()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_EVENT = eINSTANCE.getActivitydiagram_ActivityNode_Execute_AbstractSubEvent();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_Execute_FillEventImpl <em>Activitydiagram Activity Node Execute Fill Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_Execute_FillEventImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_Execute_FillEvent()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_FILL_EVENT = eINSTANCE.getActivitydiagram_ActivityNode_Execute_FillEvent();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubEventImpl <em>Activitydiagram Activity Node Take Offerd Tokens1 Abstract Sub Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubEventImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubEvent()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_ABSTRACT_SUB_EVENT = eINSTANCE.getActivitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubEvent();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_TakeOfferdTokens1_FillEventImpl <em>Activitydiagram Activity Node Take Offerd Tokens1 Fill Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_TakeOfferdTokens1_FillEventImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_TakeOfferdTokens1_FillEvent()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_FILL_EVENT = eINSTANCE.getActivitydiagram_ActivityNode_TakeOfferdTokens1_FillEvent();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_AddTokens1_AbstractSubEventImpl <em>Activitydiagram Activity Node Add Tokens1 Abstract Sub Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_AddTokens1_AbstractSubEventImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_AddTokens1_AbstractSubEvent()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_ABSTRACT_SUB_EVENT = eINSTANCE.getActivitydiagram_ActivityNode_AddTokens1_AbstractSubEvent();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_AddTokens1_FillEventImpl <em>Activitydiagram Activity Node Add Tokens1 Fill Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_AddTokens1_FillEventImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_AddTokens1_FillEvent()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_FILL_EVENT = eINSTANCE.getActivitydiagram_ActivityNode_AddTokens1_FillEvent();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_Variable_ExecuteImpl <em>Activitydiagram Variable Execute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_Variable_ExecuteImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_Variable_Execute()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_VARIABLE_EXECUTE = eINSTANCE.getActivitydiagram_Variable_Execute();

		/**
		 * The meta object literal for the '<em><b>This</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITYDIAGRAM_VARIABLE_EXECUTE__THIS = eINSTANCE.getActivitydiagram_Variable_Execute_This();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_Activity_InitializeContextImpl <em>Activitydiagram Activity Initialize Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_Activity_InitializeContextImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_Activity_InitializeContext()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_ACTIVITY_INITIALIZE_CONTEXT = eINSTANCE.getActivitydiagram_Activity_InitializeContext();

		/**
		 * The meta object literal for the '<em><b>This</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITYDIAGRAM_ACTIVITY_INITIALIZE_CONTEXT__THIS = eINSTANCE.getActivitydiagram_Activity_InitializeContext_This();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_Variable_InitImpl <em>Activitydiagram Variable Init</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_Variable_InitImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_Variable_Init()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_VARIABLE_INIT = eINSTANCE.getActivitydiagram_Variable_Init();

		/**
		 * The meta object literal for the '<em><b>This</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITYDIAGRAM_VARIABLE_INIT__THIS = eINSTANCE.getActivitydiagram_Variable_Init_This();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_IsReadyImpl <em>Activitydiagram Activity Node Is Ready</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_IsReadyImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_IsReady()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_ACTIVITY_NODE_IS_READY = eINSTANCE.getActivitydiagram_ActivityNode_IsReady();

		/**
		 * The meta object literal for the '<em><b>This</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITYDIAGRAM_ACTIVITY_NODE_IS_READY__THIS = eINSTANCE.getActivitydiagram_ActivityNode_IsReady_This();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.FillEventImpl <em>Fill Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.FillEventImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getFillEvent()
		 * @generated
		 */
		EClass FILL_EVENT = eINSTANCE.getFillEvent();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_ExecuteImpl <em>Activitydiagram Activity Node Execute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_ExecuteImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_Execute()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE = eINSTANCE.getActivitydiagram_ActivityNode_Execute();

		/**
		 * The meta object literal for the '<em><b>This</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE__THIS = eINSTANCE.getActivitydiagram_ActivityNode_Execute_This();

		/**
		 * The meta object literal for the '<em><b>Sub Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE__SUB_STEPS = eINSTANCE.getActivitydiagram_ActivityNode_Execute_SubSteps();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_TakeOfferdTokens1Impl <em>Activitydiagram Activity Node Take Offerd Tokens1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_TakeOfferdTokens1Impl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_TakeOfferdTokens1()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1 = eINSTANCE.getActivitydiagram_ActivityNode_TakeOfferdTokens1();

		/**
		 * The meta object literal for the '<em><b>This</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1__THIS = eINSTANCE.getActivitydiagram_ActivityNode_TakeOfferdTokens1_This();

		/**
		 * The meta object literal for the '<em><b>Sub Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1__SUB_STEPS = eINSTANCE.getActivitydiagram_ActivityNode_TakeOfferdTokens1_SubSteps();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_AddTokens1Impl <em>Activitydiagram Activity Node Add Tokens1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_AddTokens1Impl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_AddTokens1()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1 = eINSTANCE.getActivitydiagram_ActivityNode_AddTokens1();

		/**
		 * The meta object literal for the '<em><b>This</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1__THIS = eINSTANCE.getActivitydiagram_ActivityNode_AddTokens1_This();

		/**
		 * The meta object literal for the '<em><b>Sub Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1__SUB_STEPS = eINSTANCE.getActivitydiagram_ActivityNode_AddTokens1_SubSteps();

	}

} //StepsPackage
