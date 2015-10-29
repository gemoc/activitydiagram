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
	 * The feature id for the '<em><b>Activitydiagram Activity Reset Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPS__ACTIVITYDIAGRAM_ACTIVITY_RESET_TRACE = 0;

	/**
	 * The feature id for the '<em><b>Activitydiagram Activity Node Execute Fill Step Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_FILL_STEP_TRACE = 1;

	/**
	 * The feature id for the '<em><b>Activitydiagram Activity Node Send Offers1 Fill Step Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1_FILL_STEP_TRACE = 2;

	/**
	 * The feature id for the '<em><b>Activitydiagram Activity Node Add Tokens1 Fill Step Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_FILL_STEP_TRACE = 3;

	/**
	 * The feature id for the '<em><b>Activitydiagram Activity Node Take Offerd Tokens1 Fill Step Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_FILL_STEP_TRACE = 4;

	/**
	 * The feature id for the '<em><b>Activitydiagram Activity Node Remove Token1 Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN1_TRACE = 5;

	/**
	 * The feature id for the '<em><b>Activitydiagram Activity Execute Fill Step Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPS__ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_FILL_STEP_TRACE = 6;

	/**
	 * The feature id for the '<em><b>Activitydiagram Variable Init Fill Step Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPS__ACTIVITYDIAGRAM_VARIABLE_INIT_FILL_STEP_TRACE = 7;

	/**
	 * The feature id for the '<em><b>Activitydiagram Activity Write Trace Fill Step Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPS__ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_FILL_STEP_TRACE = 8;

	/**
	 * The feature id for the '<em><b>Activitydiagram Activity Node Terminate Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE_TRACE = 9;

	/**
	 * The feature id for the '<em><b>Activitydiagram Activity Initialize Context Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPS__ACTIVITYDIAGRAM_ACTIVITY_INITIALIZE_CONTEXT_TRACE = 10;

	/**
	 * The feature id for the '<em><b>Activitydiagram Variable Execute Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPS__ACTIVITYDIAGRAM_VARIABLE_EXECUTE_TRACE = 11;

	/**
	 * The feature id for the '<em><b>Fill Step Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPS__FILL_STEP_TRACE = 12;

	/**
	 * The feature id for the '<em><b>Activitydiagram Activity Node Execute Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_TRACE = 13;

	/**
	 * The feature id for the '<em><b>Activitydiagram Activity Node Send Offers1 Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1_TRACE = 14;

	/**
	 * The feature id for the '<em><b>Activitydiagram Activity Node Add Tokens1 Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_TRACE = 15;

	/**
	 * The feature id for the '<em><b>Activitydiagram Activity Node Take Offerd Tokens1 Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_TRACE = 16;

	/**
	 * The feature id for the '<em><b>Activitydiagram Activity Execute Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPS__ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_TRACE = 17;

	/**
	 * The feature id for the '<em><b>Activitydiagram Variable Init Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPS__ACTIVITYDIAGRAM_VARIABLE_INIT_TRACE = 18;

	/**
	 * The feature id for the '<em><b>Activitydiagram Activity Write Trace Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPS__ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_TRACE = 19;

	/**
	 * The number of structural features of the '<em>Steps</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEPS_FEATURE_COUNT = 20;

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
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_Activity_WriteTrace_AbstractSubStepImpl <em>Activitydiagram Activity Write Trace Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_Activity_WriteTrace_AbstractSubStepImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_Activity_WriteTrace_AbstractSubStep()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_ABSTRACT_SUB_STEP = 17;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Write Trace Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_ABSTRACT_SUB_STEP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Write Trace Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_ABSTRACT_SUB_STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_Activity_ResetImpl <em>Activitydiagram Activity Reset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_Activity_ResetImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_Activity_Reset()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_RESET = 3;

	/**
	 * The feature id for the '<em><b>Preceding State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_RESET__PRECEDING_STATE = ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>This</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_RESET__THIS = ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Reset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_RESET_FEATURE_COUNT = ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Reset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_RESET_OPERATION_COUNT = ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_Execute_AbstractSubStepImpl <em>Activitydiagram Activity Node Execute Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_Execute_AbstractSubStepImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_Execute_AbstractSubStep()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_STEP = 4;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Node Execute Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Node Execute Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_Execute_FillStepImpl <em>Activitydiagram Activity Node Execute Fill Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_Execute_FillStepImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_Execute_FillStep()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_FILL_STEP = 5;

	/**
	 * The feature id for the '<em><b>Preceding State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_FILL_STEP__PRECEDING_STATE = ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Node Execute Fill Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_FILL_STEP_FEATURE_COUNT = ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Node Execute Fill Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_FILL_STEP_OPERATION_COUNT = ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_SendOffers1_AbstractSubStepImpl <em>Activitydiagram Activity Node Send Offers1 Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_SendOffers1_AbstractSubStepImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_SendOffers1_AbstractSubStep()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1_ABSTRACT_SUB_STEP = 6;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Node Send Offers1 Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1_ABSTRACT_SUB_STEP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Node Send Offers1 Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1_ABSTRACT_SUB_STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_SendOffers1_FillStepImpl <em>Activitydiagram Activity Node Send Offers1 Fill Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_SendOffers1_FillStepImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_SendOffers1_FillStep()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1_FILL_STEP = 7;

	/**
	 * The feature id for the '<em><b>Preceding State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1_FILL_STEP__PRECEDING_STATE = ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Node Send Offers1 Fill Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1_FILL_STEP_FEATURE_COUNT = ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Node Send Offers1 Fill Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1_FILL_STEP_OPERATION_COUNT = ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_AddTokens1_AbstractSubStepImpl <em>Activitydiagram Activity Node Add Tokens1 Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_AddTokens1_AbstractSubStepImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_AddTokens1_AbstractSubStep()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_ABSTRACT_SUB_STEP = 8;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Node Add Tokens1 Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_ABSTRACT_SUB_STEP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Node Add Tokens1 Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_ABSTRACT_SUB_STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_AddTokens1_FillStepImpl <em>Activitydiagram Activity Node Add Tokens1 Fill Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_AddTokens1_FillStepImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_AddTokens1_FillStep()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_FILL_STEP = 9;

	/**
	 * The feature id for the '<em><b>Preceding State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_FILL_STEP__PRECEDING_STATE = ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Node Add Tokens1 Fill Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_FILL_STEP_FEATURE_COUNT = ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Node Add Tokens1 Fill Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_FILL_STEP_OPERATION_COUNT = ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStepImpl <em>Activitydiagram Activity Node Take Offerd Tokens1 Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStepImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStep()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_ABSTRACT_SUB_STEP = 10;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Node Take Offerd Tokens1 Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_ABSTRACT_SUB_STEP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Node Take Offerd Tokens1 Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_ABSTRACT_SUB_STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_TakeOfferdTokens1_FillStepImpl <em>Activitydiagram Activity Node Take Offerd Tokens1 Fill Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_TakeOfferdTokens1_FillStepImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_TakeOfferdTokens1_FillStep()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_FILL_STEP = 11;

	/**
	 * The feature id for the '<em><b>Preceding State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_FILL_STEP__PRECEDING_STATE = ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Node Take Offerd Tokens1 Fill Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_FILL_STEP_FEATURE_COUNT = ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Node Take Offerd Tokens1 Fill Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_FILL_STEP_OPERATION_COUNT = ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_RemoveToken1Impl <em>Activitydiagram Activity Node Remove Token1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_RemoveToken1Impl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_RemoveToken1()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN1 = 12;

	/**
	 * The feature id for the '<em><b>Preceding State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN1__PRECEDING_STATE = SMALL_STEP__PRECEDING_STATE;

	/**
	 * The feature id for the '<em><b>This</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN1__THIS = SMALL_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Node Remove Token1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN1_FEATURE_COUNT = SMALL_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Node Remove Token1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN1_OPERATION_COUNT = SMALL_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_Activity_Execute_AbstractSubStepImpl <em>Activitydiagram Activity Execute Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_Activity_Execute_AbstractSubStepImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_Activity_Execute_AbstractSubStep()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP = 13;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Execute Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Execute Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_Activity_Execute_FillStepImpl <em>Activitydiagram Activity Execute Fill Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_Activity_Execute_FillStepImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_Activity_Execute_FillStep()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_FILL_STEP = 14;

	/**
	 * The feature id for the '<em><b>Preceding State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_FILL_STEP__PRECEDING_STATE = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Execute Fill Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_FILL_STEP_FEATURE_COUNT = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Execute Fill Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_FILL_STEP_OPERATION_COUNT = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_Variable_Init_AbstractSubStepImpl <em>Activitydiagram Variable Init Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_Variable_Init_AbstractSubStepImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_Variable_Init_AbstractSubStep()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_VARIABLE_INIT_ABSTRACT_SUB_STEP = 15;

	/**
	 * The number of structural features of the '<em>Activitydiagram Variable Init Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_VARIABLE_INIT_ABSTRACT_SUB_STEP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Variable Init Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_VARIABLE_INIT_ABSTRACT_SUB_STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_Variable_Init_FillStepImpl <em>Activitydiagram Variable Init Fill Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_Variable_Init_FillStepImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_Variable_Init_FillStep()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_VARIABLE_INIT_FILL_STEP = 16;

	/**
	 * The feature id for the '<em><b>Preceding State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_VARIABLE_INIT_FILL_STEP__PRECEDING_STATE = ACTIVITYDIAGRAM_VARIABLE_INIT_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activitydiagram Variable Init Fill Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_VARIABLE_INIT_FILL_STEP_FEATURE_COUNT = ACTIVITYDIAGRAM_VARIABLE_INIT_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Activitydiagram Variable Init Fill Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_VARIABLE_INIT_FILL_STEP_OPERATION_COUNT = ACTIVITYDIAGRAM_VARIABLE_INIT_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_Activity_WriteTrace_FillStepImpl <em>Activitydiagram Activity Write Trace Fill Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_Activity_WriteTrace_FillStepImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_Activity_WriteTrace_FillStep()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_FILL_STEP = 18;

	/**
	 * The feature id for the '<em><b>Preceding State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_FILL_STEP__PRECEDING_STATE = ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Write Trace Fill Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_FILL_STEP_FEATURE_COUNT = ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Write Trace Fill Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_FILL_STEP_OPERATION_COUNT = ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_TerminateImpl <em>Activitydiagram Activity Node Terminate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_TerminateImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_Terminate()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE = 19;

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
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_Activity_InitializeContextImpl <em>Activitydiagram Activity Initialize Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_Activity_InitializeContextImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_Activity_InitializeContext()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_INITIALIZE_CONTEXT = 20;

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
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_Variable_ExecuteImpl <em>Activitydiagram Variable Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_Variable_ExecuteImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_Variable_Execute()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_VARIABLE_EXECUTE = 21;

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
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.FillStepImpl <em>Fill Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.FillStepImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getFillStep()
	 * @generated
	 */
	int FILL_STEP = 22;

	/**
	 * The feature id for the '<em><b>Preceding State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILL_STEP__PRECEDING_STATE = SMALL_STEP__PRECEDING_STATE;

	/**
	 * The number of structural features of the '<em>Fill Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILL_STEP_FEATURE_COUNT = SMALL_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fill Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILL_STEP_OPERATION_COUNT = SMALL_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_ExecuteImpl <em>Activitydiagram Activity Node Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_ExecuteImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_Execute()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE = 23;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE__STARTING_STATE = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE__ENDING_STATE = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>This</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE__THIS = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE__SUB_STEPS = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Node Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_FEATURE_COUNT = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Node Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_OPERATION_COUNT = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_SendOffers1Impl <em>Activitydiagram Activity Node Send Offers1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_SendOffers1Impl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_SendOffers1()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1 = 24;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1__STARTING_STATE = ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1__ENDING_STATE = ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>This</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1__THIS = ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1__SUB_STEPS = ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Node Send Offers1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1_FEATURE_COUNT = ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Node Send Offers1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1_OPERATION_COUNT = ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_AddTokens1Impl <em>Activitydiagram Activity Node Add Tokens1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_AddTokens1Impl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_AddTokens1()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1 = 25;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1__STARTING_STATE = ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1__ENDING_STATE = ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>This</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1__THIS = ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1__SUB_STEPS = ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Node Add Tokens1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_FEATURE_COUNT = ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Node Add Tokens1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_OPERATION_COUNT = ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_TakeOfferdTokens1Impl <em>Activitydiagram Activity Node Take Offerd Tokens1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_TakeOfferdTokens1Impl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_TakeOfferdTokens1()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1 = 26;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1__STARTING_STATE = ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1__ENDING_STATE = ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>This</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1__THIS = ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1__SUB_STEPS = ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Node Take Offerd Tokens1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_FEATURE_COUNT = ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Node Take Offerd Tokens1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_OPERATION_COUNT = ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_Activity_ExecuteImpl <em>Activitydiagram Activity Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_Activity_ExecuteImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_Activity_Execute()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE = 27;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE__STARTING_STATE = BIG_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE__ENDING_STATE = BIG_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>This</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE__THIS = BIG_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE__SUB_STEPS = BIG_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_FEATURE_COUNT = BIG_STEP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_OPERATION_COUNT = BIG_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_Variable_InitImpl <em>Activitydiagram Variable Init</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_Variable_InitImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_Variable_Init()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_VARIABLE_INIT = 28;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_VARIABLE_INIT__STARTING_STATE = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_VARIABLE_INIT__ENDING_STATE = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>This</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_VARIABLE_INIT__THIS = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_VARIABLE_INIT__SUB_STEPS = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Activitydiagram Variable Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_VARIABLE_INIT_FEATURE_COUNT = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Activitydiagram Variable Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_VARIABLE_INIT_OPERATION_COUNT = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_Activity_WriteTraceImpl <em>Activitydiagram Activity Write Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_Activity_WriteTraceImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_Activity_WriteTrace()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE = 29;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE__STARTING_STATE = BIG_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE__ENDING_STATE = BIG_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>This</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE__THIS = BIG_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE__SUB_STEPS = BIG_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Write Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_FEATURE_COUNT = BIG_STEP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Write Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_OPERATION_COUNT = BIG_STEP_OPERATION_COUNT + 0;


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
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Steps.Steps#getActivitydiagram_Activity_Reset_Trace <em>Activitydiagram Activity Reset Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram Activity Reset Trace</em>'.
	 * @see activitydiagramTrace.Steps.Steps#getActivitydiagram_Activity_Reset_Trace()
	 * @see #getSteps()
	 * @generated
	 */
	EReference getSteps_Activitydiagram_Activity_Reset_Trace();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Steps.Steps#getActivitydiagram_ActivityNode_Execute_FillStep_Trace <em>Activitydiagram Activity Node Execute Fill Step Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram Activity Node Execute Fill Step Trace</em>'.
	 * @see activitydiagramTrace.Steps.Steps#getActivitydiagram_ActivityNode_Execute_FillStep_Trace()
	 * @see #getSteps()
	 * @generated
	 */
	EReference getSteps_Activitydiagram_ActivityNode_Execute_FillStep_Trace();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Steps.Steps#getActivitydiagram_ActivityNode_SendOffers1_FillStep_Trace <em>Activitydiagram Activity Node Send Offers1 Fill Step Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram Activity Node Send Offers1 Fill Step Trace</em>'.
	 * @see activitydiagramTrace.Steps.Steps#getActivitydiagram_ActivityNode_SendOffers1_FillStep_Trace()
	 * @see #getSteps()
	 * @generated
	 */
	EReference getSteps_Activitydiagram_ActivityNode_SendOffers1_FillStep_Trace();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Steps.Steps#getActivitydiagram_ActivityNode_AddTokens1_FillStep_Trace <em>Activitydiagram Activity Node Add Tokens1 Fill Step Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram Activity Node Add Tokens1 Fill Step Trace</em>'.
	 * @see activitydiagramTrace.Steps.Steps#getActivitydiagram_ActivityNode_AddTokens1_FillStep_Trace()
	 * @see #getSteps()
	 * @generated
	 */
	EReference getSteps_Activitydiagram_ActivityNode_AddTokens1_FillStep_Trace();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Steps.Steps#getActivitydiagram_ActivityNode_TakeOfferdTokens1_FillStep_Trace <em>Activitydiagram Activity Node Take Offerd Tokens1 Fill Step Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram Activity Node Take Offerd Tokens1 Fill Step Trace</em>'.
	 * @see activitydiagramTrace.Steps.Steps#getActivitydiagram_ActivityNode_TakeOfferdTokens1_FillStep_Trace()
	 * @see #getSteps()
	 * @generated
	 */
	EReference getSteps_Activitydiagram_ActivityNode_TakeOfferdTokens1_FillStep_Trace();

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
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Steps.Steps#getActivitydiagram_Activity_Execute_FillStep_Trace <em>Activitydiagram Activity Execute Fill Step Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram Activity Execute Fill Step Trace</em>'.
	 * @see activitydiagramTrace.Steps.Steps#getActivitydiagram_Activity_Execute_FillStep_Trace()
	 * @see #getSteps()
	 * @generated
	 */
	EReference getSteps_Activitydiagram_Activity_Execute_FillStep_Trace();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Steps.Steps#getActivitydiagram_Variable_Init_FillStep_Trace <em>Activitydiagram Variable Init Fill Step Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram Variable Init Fill Step Trace</em>'.
	 * @see activitydiagramTrace.Steps.Steps#getActivitydiagram_Variable_Init_FillStep_Trace()
	 * @see #getSteps()
	 * @generated
	 */
	EReference getSteps_Activitydiagram_Variable_Init_FillStep_Trace();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Steps.Steps#getActivitydiagram_Activity_WriteTrace_FillStep_Trace <em>Activitydiagram Activity Write Trace Fill Step Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram Activity Write Trace Fill Step Trace</em>'.
	 * @see activitydiagramTrace.Steps.Steps#getActivitydiagram_Activity_WriteTrace_FillStep_Trace()
	 * @see #getSteps()
	 * @generated
	 */
	EReference getSteps_Activitydiagram_Activity_WriteTrace_FillStep_Trace();

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
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Steps.Steps#getFillStep_Trace <em>Fill Step Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fill Step Trace</em>'.
	 * @see activitydiagramTrace.Steps.Steps#getFillStep_Trace()
	 * @see #getSteps()
	 * @generated
	 */
	EReference getSteps_FillStep_Trace();

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
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Steps.Steps#getActivitydiagram_Activity_Execute_Trace <em>Activitydiagram Activity Execute Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram Activity Execute Trace</em>'.
	 * @see activitydiagramTrace.Steps.Steps#getActivitydiagram_Activity_Execute_Trace()
	 * @see #getSteps()
	 * @generated
	 */
	EReference getSteps_Activitydiagram_Activity_Execute_Trace();

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
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Steps.Steps#getActivitydiagram_Activity_WriteTrace_Trace <em>Activitydiagram Activity Write Trace Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitydiagram Activity Write Trace Trace</em>'.
	 * @see activitydiagramTrace.Steps.Steps#getActivitydiagram_Activity_WriteTrace_Trace()
	 * @see #getSteps()
	 * @generated
	 */
	EReference getSteps_Activitydiagram_Activity_WriteTrace_Trace();

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
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_Activity_Reset <em>Activitydiagram Activity Reset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Activity Reset</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_Activity_Reset
	 * @generated
	 */
	EClass getActivitydiagram_Activity_Reset();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.Steps.Activitydiagram_Activity_Reset#getThis <em>This</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>This</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_Activity_Reset#getThis()
	 * @see #getActivitydiagram_Activity_Reset()
	 * @generated
	 */
	EReference getActivitydiagram_Activity_Reset_This();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute_AbstractSubStep <em>Activitydiagram Activity Node Execute Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Activity Node Execute Abstract Sub Step</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute_AbstractSubStep
	 * @generated
	 */
	EClass getActivitydiagram_ActivityNode_Execute_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute_FillStep <em>Activitydiagram Activity Node Execute Fill Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Activity Node Execute Fill Step</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute_FillStep
	 * @generated
	 */
	EClass getActivitydiagram_ActivityNode_Execute_FillStep();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_SendOffers1_AbstractSubStep <em>Activitydiagram Activity Node Send Offers1 Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Activity Node Send Offers1 Abstract Sub Step</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_SendOffers1_AbstractSubStep
	 * @generated
	 */
	EClass getActivitydiagram_ActivityNode_SendOffers1_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_SendOffers1_FillStep <em>Activitydiagram Activity Node Send Offers1 Fill Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Activity Node Send Offers1 Fill Step</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_SendOffers1_FillStep
	 * @generated
	 */
	EClass getActivitydiagram_ActivityNode_SendOffers1_FillStep();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1_AbstractSubStep <em>Activitydiagram Activity Node Add Tokens1 Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Activity Node Add Tokens1 Abstract Sub Step</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1_AbstractSubStep
	 * @generated
	 */
	EClass getActivitydiagram_ActivityNode_AddTokens1_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1_FillStep <em>Activitydiagram Activity Node Add Tokens1 Fill Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Activity Node Add Tokens1 Fill Step</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1_FillStep
	 * @generated
	 */
	EClass getActivitydiagram_ActivityNode_AddTokens1_FillStep();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStep <em>Activitydiagram Activity Node Take Offerd Tokens1 Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Activity Node Take Offerd Tokens1 Abstract Sub Step</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStep
	 * @generated
	 */
	EClass getActivitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1_FillStep <em>Activitydiagram Activity Node Take Offerd Tokens1 Fill Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Activity Node Take Offerd Tokens1 Fill Step</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1_FillStep
	 * @generated
	 */
	EClass getActivitydiagram_ActivityNode_TakeOfferdTokens1_FillStep();

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
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_Activity_Execute_AbstractSubStep <em>Activitydiagram Activity Execute Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Activity Execute Abstract Sub Step</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_Activity_Execute_AbstractSubStep
	 * @generated
	 */
	EClass getActivitydiagram_Activity_Execute_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_Activity_Execute_FillStep <em>Activitydiagram Activity Execute Fill Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Activity Execute Fill Step</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_Activity_Execute_FillStep
	 * @generated
	 */
	EClass getActivitydiagram_Activity_Execute_FillStep();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_Variable_Init_AbstractSubStep <em>Activitydiagram Variable Init Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Variable Init Abstract Sub Step</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_Variable_Init_AbstractSubStep
	 * @generated
	 */
	EClass getActivitydiagram_Variable_Init_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_Variable_Init_FillStep <em>Activitydiagram Variable Init Fill Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Variable Init Fill Step</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_Variable_Init_FillStep
	 * @generated
	 */
	EClass getActivitydiagram_Variable_Init_FillStep();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_Activity_WriteTrace_AbstractSubStep <em>Activitydiagram Activity Write Trace Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Activity Write Trace Abstract Sub Step</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_Activity_WriteTrace_AbstractSubStep
	 * @generated
	 */
	EClass getActivitydiagram_Activity_WriteTrace_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_Activity_WriteTrace_FillStep <em>Activitydiagram Activity Write Trace Fill Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Activity Write Trace Fill Step</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_Activity_WriteTrace_FillStep
	 * @generated
	 */
	EClass getActivitydiagram_Activity_WriteTrace_FillStep();

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
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.FillStep <em>Fill Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fill Step</em>'.
	 * @see activitydiagramTrace.Steps.FillStep
	 * @generated
	 */
	EClass getFillStep();

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
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_SendOffers1#getSubSteps <em>Sub Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Steps</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_SendOffers1#getSubSteps()
	 * @see #getActivitydiagram_ActivityNode_SendOffers1()
	 * @generated
	 */
	EReference getActivitydiagram_ActivityNode_SendOffers1_SubSteps();

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
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_Activity_Execute <em>Activitydiagram Activity Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Activity Execute</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_Activity_Execute
	 * @generated
	 */
	EClass getActivitydiagram_Activity_Execute();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.Steps.Activitydiagram_Activity_Execute#getThis <em>This</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>This</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_Activity_Execute#getThis()
	 * @see #getActivitydiagram_Activity_Execute()
	 * @generated
	 */
	EReference getActivitydiagram_Activity_Execute_This();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.Steps.Activitydiagram_Activity_Execute#getSubSteps <em>Sub Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Steps</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_Activity_Execute#getSubSteps()
	 * @see #getActivitydiagram_Activity_Execute()
	 * @generated
	 */
	EReference getActivitydiagram_Activity_Execute_SubSteps();

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
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.Steps.Activitydiagram_Variable_Init#getSubSteps <em>Sub Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Steps</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_Variable_Init#getSubSteps()
	 * @see #getActivitydiagram_Variable_Init()
	 * @generated
	 */
	EReference getActivitydiagram_Variable_Init_SubSteps();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_Activity_WriteTrace <em>Activitydiagram Activity Write Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Activity Write Trace</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_Activity_WriteTrace
	 * @generated
	 */
	EClass getActivitydiagram_Activity_WriteTrace();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.Steps.Activitydiagram_Activity_WriteTrace#getThis <em>This</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>This</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_Activity_WriteTrace#getThis()
	 * @see #getActivitydiagram_Activity_WriteTrace()
	 * @generated
	 */
	EReference getActivitydiagram_Activity_WriteTrace_This();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.Steps.Activitydiagram_Activity_WriteTrace#getSubSteps <em>Sub Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Steps</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_Activity_WriteTrace#getSubSteps()
	 * @see #getActivitydiagram_Activity_WriteTrace()
	 * @generated
	 */
	EReference getActivitydiagram_Activity_WriteTrace_SubSteps();

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
		 * The meta object literal for the '<em><b>Activitydiagram Activity Reset Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEPS__ACTIVITYDIAGRAM_ACTIVITY_RESET_TRACE = eINSTANCE.getSteps_Activitydiagram_Activity_Reset_Trace();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Activity Node Execute Fill Step Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_FILL_STEP_TRACE = eINSTANCE.getSteps_Activitydiagram_ActivityNode_Execute_FillStep_Trace();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Activity Node Send Offers1 Fill Step Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1_FILL_STEP_TRACE = eINSTANCE.getSteps_Activitydiagram_ActivityNode_SendOffers1_FillStep_Trace();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Activity Node Add Tokens1 Fill Step Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_FILL_STEP_TRACE = eINSTANCE.getSteps_Activitydiagram_ActivityNode_AddTokens1_FillStep_Trace();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Activity Node Take Offerd Tokens1 Fill Step Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_FILL_STEP_TRACE = eINSTANCE.getSteps_Activitydiagram_ActivityNode_TakeOfferdTokens1_FillStep_Trace();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Activity Node Remove Token1 Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN1_TRACE = eINSTANCE.getSteps_Activitydiagram_ActivityNode_RemoveToken1_Trace();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Activity Execute Fill Step Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEPS__ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_FILL_STEP_TRACE = eINSTANCE.getSteps_Activitydiagram_Activity_Execute_FillStep_Trace();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Variable Init Fill Step Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEPS__ACTIVITYDIAGRAM_VARIABLE_INIT_FILL_STEP_TRACE = eINSTANCE.getSteps_Activitydiagram_Variable_Init_FillStep_Trace();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Activity Write Trace Fill Step Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEPS__ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_FILL_STEP_TRACE = eINSTANCE.getSteps_Activitydiagram_Activity_WriteTrace_FillStep_Trace();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Activity Node Terminate Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE_TRACE = eINSTANCE.getSteps_Activitydiagram_ActivityNode_Terminate_Trace();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Activity Initialize Context Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEPS__ACTIVITYDIAGRAM_ACTIVITY_INITIALIZE_CONTEXT_TRACE = eINSTANCE.getSteps_Activitydiagram_Activity_InitializeContext_Trace();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Variable Execute Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEPS__ACTIVITYDIAGRAM_VARIABLE_EXECUTE_TRACE = eINSTANCE.getSteps_Activitydiagram_Variable_Execute_Trace();

		/**
		 * The meta object literal for the '<em><b>Fill Step Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEPS__FILL_STEP_TRACE = eINSTANCE.getSteps_FillStep_Trace();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Activity Node Execute Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_TRACE = eINSTANCE.getSteps_Activitydiagram_ActivityNode_Execute_Trace();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Activity Node Send Offers1 Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1_TRACE = eINSTANCE.getSteps_Activitydiagram_ActivityNode_SendOffers1_Trace();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Activity Node Add Tokens1 Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_TRACE = eINSTANCE.getSteps_Activitydiagram_ActivityNode_AddTokens1_Trace();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Activity Node Take Offerd Tokens1 Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_TRACE = eINSTANCE.getSteps_Activitydiagram_ActivityNode_TakeOfferdTokens1_Trace();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Activity Execute Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEPS__ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_TRACE = eINSTANCE.getSteps_Activitydiagram_Activity_Execute_Trace();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Variable Init Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEPS__ACTIVITYDIAGRAM_VARIABLE_INIT_TRACE = eINSTANCE.getSteps_Activitydiagram_Variable_Init_Trace();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram Activity Write Trace Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEPS__ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_TRACE = eINSTANCE.getSteps_Activitydiagram_Activity_WriteTrace_Trace();

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
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_Activity_ResetImpl <em>Activitydiagram Activity Reset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_Activity_ResetImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_Activity_Reset()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_ACTIVITY_RESET = eINSTANCE.getActivitydiagram_Activity_Reset();

		/**
		 * The meta object literal for the '<em><b>This</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITYDIAGRAM_ACTIVITY_RESET__THIS = eINSTANCE.getActivitydiagram_Activity_Reset_This();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_Execute_AbstractSubStepImpl <em>Activitydiagram Activity Node Execute Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_Execute_AbstractSubStepImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_Execute_AbstractSubStep()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_STEP = eINSTANCE.getActivitydiagram_ActivityNode_Execute_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_Execute_FillStepImpl <em>Activitydiagram Activity Node Execute Fill Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_Execute_FillStepImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_Execute_FillStep()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_FILL_STEP = eINSTANCE.getActivitydiagram_ActivityNode_Execute_FillStep();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_SendOffers1_AbstractSubStepImpl <em>Activitydiagram Activity Node Send Offers1 Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_SendOffers1_AbstractSubStepImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_SendOffers1_AbstractSubStep()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1_ABSTRACT_SUB_STEP = eINSTANCE.getActivitydiagram_ActivityNode_SendOffers1_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_SendOffers1_FillStepImpl <em>Activitydiagram Activity Node Send Offers1 Fill Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_SendOffers1_FillStepImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_SendOffers1_FillStep()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1_FILL_STEP = eINSTANCE.getActivitydiagram_ActivityNode_SendOffers1_FillStep();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_AddTokens1_AbstractSubStepImpl <em>Activitydiagram Activity Node Add Tokens1 Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_AddTokens1_AbstractSubStepImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_AddTokens1_AbstractSubStep()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_ABSTRACT_SUB_STEP = eINSTANCE.getActivitydiagram_ActivityNode_AddTokens1_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_AddTokens1_FillStepImpl <em>Activitydiagram Activity Node Add Tokens1 Fill Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_AddTokens1_FillStepImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_AddTokens1_FillStep()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_FILL_STEP = eINSTANCE.getActivitydiagram_ActivityNode_AddTokens1_FillStep();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStepImpl <em>Activitydiagram Activity Node Take Offerd Tokens1 Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStepImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStep()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_ABSTRACT_SUB_STEP = eINSTANCE.getActivitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_TakeOfferdTokens1_FillStepImpl <em>Activitydiagram Activity Node Take Offerd Tokens1 Fill Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_TakeOfferdTokens1_FillStepImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_TakeOfferdTokens1_FillStep()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_FILL_STEP = eINSTANCE.getActivitydiagram_ActivityNode_TakeOfferdTokens1_FillStep();

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
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_Activity_Execute_AbstractSubStepImpl <em>Activitydiagram Activity Execute Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_Activity_Execute_AbstractSubStepImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_Activity_Execute_AbstractSubStep()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP = eINSTANCE.getActivitydiagram_Activity_Execute_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_Activity_Execute_FillStepImpl <em>Activitydiagram Activity Execute Fill Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_Activity_Execute_FillStepImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_Activity_Execute_FillStep()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_FILL_STEP = eINSTANCE.getActivitydiagram_Activity_Execute_FillStep();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_Variable_Init_AbstractSubStepImpl <em>Activitydiagram Variable Init Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_Variable_Init_AbstractSubStepImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_Variable_Init_AbstractSubStep()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_VARIABLE_INIT_ABSTRACT_SUB_STEP = eINSTANCE.getActivitydiagram_Variable_Init_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_Variable_Init_FillStepImpl <em>Activitydiagram Variable Init Fill Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_Variable_Init_FillStepImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_Variable_Init_FillStep()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_VARIABLE_INIT_FILL_STEP = eINSTANCE.getActivitydiagram_Variable_Init_FillStep();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_Activity_WriteTrace_AbstractSubStepImpl <em>Activitydiagram Activity Write Trace Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_Activity_WriteTrace_AbstractSubStepImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_Activity_WriteTrace_AbstractSubStep()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_ABSTRACT_SUB_STEP = eINSTANCE.getActivitydiagram_Activity_WriteTrace_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_Activity_WriteTrace_FillStepImpl <em>Activitydiagram Activity Write Trace Fill Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_Activity_WriteTrace_FillStepImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_Activity_WriteTrace_FillStep()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_FILL_STEP = eINSTANCE.getActivitydiagram_Activity_WriteTrace_FillStep();

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
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.FillStepImpl <em>Fill Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.FillStepImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getFillStep()
		 * @generated
		 */
		EClass FILL_STEP = eINSTANCE.getFillStep();

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
		 * The meta object literal for the '<em><b>Sub Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1__SUB_STEPS = eINSTANCE.getActivitydiagram_ActivityNode_SendOffers1_SubSteps();

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
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_Activity_ExecuteImpl <em>Activitydiagram Activity Execute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_Activity_ExecuteImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_Activity_Execute()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_ACTIVITY_EXECUTE = eINSTANCE.getActivitydiagram_Activity_Execute();

		/**
		 * The meta object literal for the '<em><b>This</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITYDIAGRAM_ACTIVITY_EXECUTE__THIS = eINSTANCE.getActivitydiagram_Activity_Execute_This();

		/**
		 * The meta object literal for the '<em><b>Sub Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITYDIAGRAM_ACTIVITY_EXECUTE__SUB_STEPS = eINSTANCE.getActivitydiagram_Activity_Execute_SubSteps();

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
		 * The meta object literal for the '<em><b>Sub Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITYDIAGRAM_VARIABLE_INIT__SUB_STEPS = eINSTANCE.getActivitydiagram_Variable_Init_SubSteps();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_Activity_WriteTraceImpl <em>Activitydiagram Activity Write Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_Activity_WriteTraceImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_Activity_WriteTrace()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE = eINSTANCE.getActivitydiagram_Activity_WriteTrace();

		/**
		 * The meta object literal for the '<em><b>This</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE__THIS = eINSTANCE.getActivitydiagram_Activity_WriteTrace_This();

		/**
		 * The meta object literal for the '<em><b>Sub Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE__SUB_STEPS = eINSTANCE.getActivitydiagram_Activity_WriteTrace_SubSteps();

	}

} //StepsPackage
