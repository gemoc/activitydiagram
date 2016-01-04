/**
 */
package activitydiagramTrace.Steps;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.gemoc.execution.engine.mse.engine_mse.Engine_msePackage;

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
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.StepImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getStep()
	 * @generated
	 */
	int STEP = 2;

	/**
	 * The feature id for the '<em><b>Mse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__MSE = Engine_msePackage.MSE_OCCURRENCE__MSE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__PARAMETERS = Engine_msePackage.MSE_OCCURRENCE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__RESULT = Engine_msePackage.MSE_OCCURRENCE__RESULT;

	/**
	 * The feature id for the '<em><b>Logical Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__LOGICAL_STEP = Engine_msePackage.MSE_OCCURRENCE__LOGICAL_STEP;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__STARTING_STATE = Engine_msePackage.MSE_OCCURRENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__ENDING_STATE = Engine_msePackage.MSE_OCCURRENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = Engine_msePackage.MSE_OCCURRENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_OPERATION_COUNT = Engine_msePackage.MSE_OCCURRENCE_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Mse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_STEP__MSE = STEP__MSE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_STEP__PARAMETERS = STEP__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_STEP__RESULT = STEP__RESULT;

	/**
	 * The feature id for the '<em><b>Logical Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_STEP__LOGICAL_STEP = STEP__LOGICAL_STEP;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_STEP__STARTING_STATE = STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_STEP__ENDING_STATE = STEP__ENDING_STATE;

	/**
	 * The number of structural features of the '<em>Small Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_STEP_FEATURE_COUNT = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Small Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_STEP_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.BigStepImpl <em>Big Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.BigStepImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getBigStep()
	 * @generated
	 */
	int BIG_STEP = 1;

	/**
	 * The feature id for the '<em><b>Mse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_STEP__MSE = STEP__MSE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_STEP__PARAMETERS = STEP__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_STEP__RESULT = STEP__RESULT;

	/**
	 * The feature id for the '<em><b>Logical Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_STEP__LOGICAL_STEP = STEP__LOGICAL_STEP;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_STEP__STARTING_STATE = STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_STEP__ENDING_STATE = STEP__ENDING_STATE;

	/**
	 * The number of structural features of the '<em>Big Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_STEP_FEATURE_COUNT = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Big Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_STEP_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.RootImplicitStepImpl <em>Root Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.RootImplicitStepImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getRootImplicitStep()
	 * @generated
	 */
	int ROOT_IMPLICIT_STEP = 3;

	/**
	 * The feature id for the '<em><b>Mse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP__MSE = SMALL_STEP__MSE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP__PARAMETERS = SMALL_STEP__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP__RESULT = SMALL_STEP__RESULT;

	/**
	 * The feature id for the '<em><b>Logical Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP__LOGICAL_STEP = SMALL_STEP__LOGICAL_STEP;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP__STARTING_STATE = SMALL_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP__ENDING_STATE = SMALL_STEP__ENDING_STATE;

	/**
	 * The number of structural features of the '<em>Root Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP_FEATURE_COUNT = SMALL_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Root Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP_OPERATION_COUNT = SMALL_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_TakeOfferdTokens1Impl <em>Activitydiagram Activity Node Take Offerd Tokens1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_TakeOfferdTokens1Impl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_TakeOfferdTokens1()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1 = 4;

	/**
	 * The feature id for the '<em><b>Mse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1__MSE = BIG_STEP__MSE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1__PARAMETERS = BIG_STEP__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1__RESULT = BIG_STEP__RESULT;

	/**
	 * The feature id for the '<em><b>Logical Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1__LOGICAL_STEP = BIG_STEP__LOGICAL_STEP;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1__STARTING_STATE = BIG_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1__ENDING_STATE = BIG_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1__SUB_STEPS = BIG_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Node Take Offerd Tokens1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_FEATURE_COUNT = BIG_STEP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1___GET_CALLER = BIG_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Node Take Offerd Tokens1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_OPERATION_COUNT = BIG_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStepImpl <em>Activitydiagram Activity Node Take Offerd Tokens1 Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStepImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStep()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_ABSTRACT_SUB_STEP = 5;

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
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStepImpl <em>Activitydiagram Activity Node Take Offerd Tokens1 Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStepImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStep()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_IMPLICIT_STEP = 6;

	/**
	 * The feature id for the '<em><b>Mse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_IMPLICIT_STEP__MSE = ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_IMPLICIT_STEP__PARAMETERS = ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_IMPLICIT_STEP__RESULT = ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_ABSTRACT_SUB_STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Logical Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_IMPLICIT_STEP__LOGICAL_STEP = ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_ABSTRACT_SUB_STEP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_IMPLICIT_STEP__STARTING_STATE = ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_ABSTRACT_SUB_STEP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_IMPLICIT_STEP__ENDING_STATE = ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_ABSTRACT_SUB_STEP_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Node Take Offerd Tokens1 Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_IMPLICIT_STEP_FEATURE_COUNT = ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_ABSTRACT_SUB_STEP_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Node Take Offerd Tokens1 Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_IMPLICIT_STEP_OPERATION_COUNT = ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Mse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN1__MSE = ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN1__PARAMETERS = ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN1__RESULT = ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_ABSTRACT_SUB_STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Logical Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN1__LOGICAL_STEP = ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_ABSTRACT_SUB_STEP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN1__STARTING_STATE = ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_ABSTRACT_SUB_STEP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN1__ENDING_STATE = ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_ABSTRACT_SUB_STEP_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Node Remove Token1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN1_FEATURE_COUNT = ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_ABSTRACT_SUB_STEP_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN1___GET_CALLER = ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Node Remove Token1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN1_OPERATION_COUNT = ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_ABSTRACT_SUB_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_SendOffers1Impl <em>Activitydiagram Activity Node Send Offers1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_SendOffers1Impl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_SendOffers1()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1 = 8;

	/**
	 * The feature id for the '<em><b>Mse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1__MSE = SMALL_STEP__MSE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1__PARAMETERS = SMALL_STEP__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1__RESULT = SMALL_STEP__RESULT;

	/**
	 * The feature id for the '<em><b>Logical Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1__LOGICAL_STEP = SMALL_STEP__LOGICAL_STEP;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1__STARTING_STATE = SMALL_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1__ENDING_STATE = SMALL_STEP__ENDING_STATE;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Node Send Offers1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1_FEATURE_COUNT = SMALL_STEP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1___GET_CALLER = SMALL_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Node Send Offers1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1_OPERATION_COUNT = SMALL_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_Variable_InitImpl <em>Activitydiagram Variable Init</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_Variable_InitImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_Variable_Init()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_VARIABLE_INIT = 9;

	/**
	 * The feature id for the '<em><b>Mse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_VARIABLE_INIT__MSE = SMALL_STEP__MSE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_VARIABLE_INIT__PARAMETERS = SMALL_STEP__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_VARIABLE_INIT__RESULT = SMALL_STEP__RESULT;

	/**
	 * The feature id for the '<em><b>Logical Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_VARIABLE_INIT__LOGICAL_STEP = SMALL_STEP__LOGICAL_STEP;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_VARIABLE_INIT__STARTING_STATE = SMALL_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_VARIABLE_INIT__ENDING_STATE = SMALL_STEP__ENDING_STATE;

	/**
	 * The number of structural features of the '<em>Activitydiagram Variable Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_VARIABLE_INIT_FEATURE_COUNT = SMALL_STEP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_VARIABLE_INIT___GET_CALLER = SMALL_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Variable Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_VARIABLE_INIT_OPERATION_COUNT = SMALL_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_TerminateImpl <em>Activitydiagram Activity Node Terminate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_TerminateImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_Terminate()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE = 10;

	/**
	 * The feature id for the '<em><b>Mse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE__MSE = SMALL_STEP__MSE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE__PARAMETERS = SMALL_STEP__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE__RESULT = SMALL_STEP__RESULT;

	/**
	 * The feature id for the '<em><b>Logical Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE__LOGICAL_STEP = SMALL_STEP__LOGICAL_STEP;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE__STARTING_STATE = SMALL_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE__ENDING_STATE = SMALL_STEP__ENDING_STATE;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Node Terminate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE_FEATURE_COUNT = SMALL_STEP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE___GET_CALLER = SMALL_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Node Terminate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE_OPERATION_COUNT = SMALL_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_AddTokens1Impl <em>Activitydiagram Activity Node Add Tokens1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_AddTokens1Impl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_AddTokens1()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1 = 11;

	/**
	 * The feature id for the '<em><b>Mse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1__MSE = BIG_STEP__MSE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1__PARAMETERS = BIG_STEP__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1__RESULT = BIG_STEP__RESULT;

	/**
	 * The feature id for the '<em><b>Logical Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1__LOGICAL_STEP = BIG_STEP__LOGICAL_STEP;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1__STARTING_STATE = BIG_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1__ENDING_STATE = BIG_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1__SUB_STEPS = BIG_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Node Add Tokens1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_FEATURE_COUNT = BIG_STEP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1___GET_CALLER = BIG_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Node Add Tokens1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_OPERATION_COUNT = BIG_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_AddTokens1_AbstractSubStepImpl <em>Activitydiagram Activity Node Add Tokens1 Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_AddTokens1_AbstractSubStepImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_AddTokens1_AbstractSubStep()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_ABSTRACT_SUB_STEP = 12;

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
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_AddTokens1_ImplicitStepImpl <em>Activitydiagram Activity Node Add Tokens1 Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_AddTokens1_ImplicitStepImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_AddTokens1_ImplicitStep()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_IMPLICIT_STEP = 13;

	/**
	 * The feature id for the '<em><b>Mse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_IMPLICIT_STEP__MSE = ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_IMPLICIT_STEP__PARAMETERS = ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_IMPLICIT_STEP__RESULT = ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_ABSTRACT_SUB_STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Logical Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_IMPLICIT_STEP__LOGICAL_STEP = ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_ABSTRACT_SUB_STEP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_IMPLICIT_STEP__STARTING_STATE = ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_ABSTRACT_SUB_STEP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_IMPLICIT_STEP__ENDING_STATE = ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_ABSTRACT_SUB_STEP_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Node Add Tokens1 Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_IMPLICIT_STEP_FEATURE_COUNT = ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_ABSTRACT_SUB_STEP_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Node Add Tokens1 Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_IMPLICIT_STEP_OPERATION_COUNT = ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_Activity_InitializeContextImpl <em>Activitydiagram Activity Initialize Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_Activity_InitializeContextImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_Activity_InitializeContext()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_INITIALIZE_CONTEXT = 14;

	/**
	 * The feature id for the '<em><b>Mse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_INITIALIZE_CONTEXT__MSE = SMALL_STEP__MSE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_INITIALIZE_CONTEXT__PARAMETERS = SMALL_STEP__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_INITIALIZE_CONTEXT__RESULT = SMALL_STEP__RESULT;

	/**
	 * The feature id for the '<em><b>Logical Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_INITIALIZE_CONTEXT__LOGICAL_STEP = SMALL_STEP__LOGICAL_STEP;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_INITIALIZE_CONTEXT__STARTING_STATE = SMALL_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_INITIALIZE_CONTEXT__ENDING_STATE = SMALL_STEP__ENDING_STATE;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Initialize Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_INITIALIZE_CONTEXT_FEATURE_COUNT = SMALL_STEP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_INITIALIZE_CONTEXT___GET_CALLER = SMALL_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Initialize Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_INITIALIZE_CONTEXT_OPERATION_COUNT = SMALL_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_Variable_ExecuteImpl <em>Activitydiagram Variable Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_Variable_ExecuteImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_Variable_Execute()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_VARIABLE_EXECUTE = 15;

	/**
	 * The feature id for the '<em><b>Mse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_VARIABLE_EXECUTE__MSE = SMALL_STEP__MSE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_VARIABLE_EXECUTE__PARAMETERS = SMALL_STEP__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_VARIABLE_EXECUTE__RESULT = SMALL_STEP__RESULT;

	/**
	 * The feature id for the '<em><b>Logical Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_VARIABLE_EXECUTE__LOGICAL_STEP = SMALL_STEP__LOGICAL_STEP;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_VARIABLE_EXECUTE__STARTING_STATE = SMALL_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_VARIABLE_EXECUTE__ENDING_STATE = SMALL_STEP__ENDING_STATE;

	/**
	 * The number of structural features of the '<em>Activitydiagram Variable Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_VARIABLE_EXECUTE_FEATURE_COUNT = SMALL_STEP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_VARIABLE_EXECUTE___GET_CALLER = SMALL_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Variable Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_VARIABLE_EXECUTE_OPERATION_COUNT = SMALL_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_Activity_ExecuteImpl <em>Activitydiagram Activity Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_Activity_ExecuteImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_Activity_Execute()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE = 16;

	/**
	 * The feature id for the '<em><b>Mse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE__MSE = BIG_STEP__MSE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE__PARAMETERS = BIG_STEP__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE__RESULT = BIG_STEP__RESULT;

	/**
	 * The feature id for the '<em><b>Logical Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE__LOGICAL_STEP = BIG_STEP__LOGICAL_STEP;

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
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE__SUB_STEPS = BIG_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_FEATURE_COUNT = BIG_STEP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE___GET_CALLER = BIG_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_OPERATION_COUNT = BIG_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_Activity_Execute_AbstractSubStepImpl <em>Activitydiagram Activity Execute Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_Activity_Execute_AbstractSubStepImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_Activity_Execute_AbstractSubStep()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP = 17;

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
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_Activity_Execute_ImplicitStepImpl <em>Activitydiagram Activity Execute Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_Activity_Execute_ImplicitStepImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_Activity_Execute_ImplicitStep()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_IMPLICIT_STEP = 18;

	/**
	 * The feature id for the '<em><b>Mse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_IMPLICIT_STEP__MSE = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_IMPLICIT_STEP__PARAMETERS = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_IMPLICIT_STEP__RESULT = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Logical Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_IMPLICIT_STEP__LOGICAL_STEP = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_IMPLICIT_STEP__STARTING_STATE = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_IMPLICIT_STEP__ENDING_STATE = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Execute Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_IMPLICIT_STEP_FEATURE_COUNT = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Execute Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_IMPLICIT_STEP_OPERATION_COUNT = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Mse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE__MSE = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE__PARAMETERS = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE__RESULT = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Logical Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE__LOGICAL_STEP = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE__STARTING_STATE = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE__ENDING_STATE = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE__SUB_STEPS = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Node Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_FEATURE_COUNT = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE___GET_CALLER = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Node Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_OPERATION_COUNT = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_Execute_AbstractSubStepImpl <em>Activitydiagram Activity Node Execute Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_Execute_AbstractSubStepImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_Execute_AbstractSubStep()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_STEP = 20;

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
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_Execute_ImplicitStepImpl <em>Activitydiagram Activity Node Execute Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_Execute_ImplicitStepImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_Execute_ImplicitStep()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_IMPLICIT_STEP = 21;

	/**
	 * The feature id for the '<em><b>Mse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_IMPLICIT_STEP__MSE = ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_IMPLICIT_STEP__PARAMETERS = ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_IMPLICIT_STEP__RESULT = ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Logical Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_IMPLICIT_STEP__LOGICAL_STEP = ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_IMPLICIT_STEP__STARTING_STATE = ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_IMPLICIT_STEP__ENDING_STATE = ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Node Execute Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_IMPLICIT_STEP_FEATURE_COUNT = ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Node Execute Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_IMPLICIT_STEP_OPERATION_COUNT = ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_Activity_WriteTraceImpl <em>Activitydiagram Activity Write Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_Activity_WriteTraceImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_Activity_WriteTrace()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE = 22;

	/**
	 * The feature id for the '<em><b>Mse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE__MSE = BIG_STEP__MSE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE__PARAMETERS = BIG_STEP__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE__RESULT = BIG_STEP__RESULT;

	/**
	 * The feature id for the '<em><b>Logical Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE__LOGICAL_STEP = BIG_STEP__LOGICAL_STEP;

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
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE__SUB_STEPS = BIG_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Write Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_FEATURE_COUNT = BIG_STEP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE___GET_CALLER = BIG_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Write Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_OPERATION_COUNT = BIG_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_Activity_WriteTrace_AbstractSubStepImpl <em>Activitydiagram Activity Write Trace Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_Activity_WriteTrace_AbstractSubStepImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_Activity_WriteTrace_AbstractSubStep()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_ABSTRACT_SUB_STEP = 23;

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
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_Activity_WriteTrace_ImplicitStepImpl <em>Activitydiagram Activity Write Trace Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_Activity_WriteTrace_ImplicitStepImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_Activity_WriteTrace_ImplicitStep()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_IMPLICIT_STEP = 24;

	/**
	 * The feature id for the '<em><b>Mse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_IMPLICIT_STEP__MSE = ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_IMPLICIT_STEP__PARAMETERS = ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_IMPLICIT_STEP__RESULT = ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Logical Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_IMPLICIT_STEP__LOGICAL_STEP = ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_IMPLICIT_STEP__STARTING_STATE = ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_IMPLICIT_STEP__ENDING_STATE = ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Write Trace Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_IMPLICIT_STEP_FEATURE_COUNT = ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Write Trace Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_IMPLICIT_STEP_OPERATION_COUNT = ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_Activity_ResetImpl <em>Activitydiagram Activity Reset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_Activity_ResetImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_Activity_Reset()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_RESET = 25;

	/**
	 * The feature id for the '<em><b>Mse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_RESET__MSE = ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_RESET__PARAMETERS = ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_RESET__RESULT = ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Logical Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_RESET__LOGICAL_STEP = ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_RESET__STARTING_STATE = ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_RESET__ENDING_STATE = ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Reset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_RESET_FEATURE_COUNT = ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_RESET___GET_CALLER = ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Reset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_RESET_OPERATION_COUNT = ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 1;


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
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.BigStep <em>Big Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Big Step</em>'.
	 * @see activitydiagramTrace.Steps.BigStep
	 * @generated
	 */
	EClass getBigStep();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see activitydiagramTrace.Steps.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.Steps.Step#getStartingState <em>Starting State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Starting State</em>'.
	 * @see activitydiagramTrace.Steps.Step#getStartingState()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_StartingState();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.Steps.Step#getEndingState <em>Ending State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ending State</em>'.
	 * @see activitydiagramTrace.Steps.Step#getEndingState()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_EndingState();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.RootImplicitStep <em>Root Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Implicit Step</em>'.
	 * @see activitydiagramTrace.Steps.RootImplicitStep
	 * @generated
	 */
	EClass getRootImplicitStep();

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
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1#getSubSteps <em>Sub Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Steps</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1#getSubSteps()
	 * @see #getActivitydiagram_ActivityNode_TakeOfferdTokens1()
	 * @generated
	 */
	EReference getActivitydiagram_ActivityNode_TakeOfferdTokens1_SubSteps();

	/**
	 * Returns the meta object for the '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1#getCaller()
	 * @generated
	 */
	EOperation getActivitydiagram_ActivityNode_TakeOfferdTokens1__GetCaller();

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
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStep <em>Activitydiagram Activity Node Take Offerd Tokens1 Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Activity Node Take Offerd Tokens1 Implicit Step</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStep
	 * @generated
	 */
	EClass getActivitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStep();

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
	 * Returns the meta object for the '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_RemoveToken1#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_RemoveToken1#getCaller()
	 * @generated
	 */
	EOperation getActivitydiagram_ActivityNode_RemoveToken1__GetCaller();

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
	 * Returns the meta object for the '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_SendOffers1#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_SendOffers1#getCaller()
	 * @generated
	 */
	EOperation getActivitydiagram_ActivityNode_SendOffers1__GetCaller();

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
	 * Returns the meta object for the '{@link activitydiagramTrace.Steps.Activitydiagram_Variable_Init#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see activitydiagramTrace.Steps.Activitydiagram_Variable_Init#getCaller()
	 * @generated
	 */
	EOperation getActivitydiagram_Variable_Init__GetCaller();

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
	 * Returns the meta object for the '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Terminate#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Terminate#getCaller()
	 * @generated
	 */
	EOperation getActivitydiagram_ActivityNode_Terminate__GetCaller();

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
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1#getSubSteps <em>Sub Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Steps</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1#getSubSteps()
	 * @see #getActivitydiagram_ActivityNode_AddTokens1()
	 * @generated
	 */
	EReference getActivitydiagram_ActivityNode_AddTokens1_SubSteps();

	/**
	 * Returns the meta object for the '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1#getCaller()
	 * @generated
	 */
	EOperation getActivitydiagram_ActivityNode_AddTokens1__GetCaller();

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
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1_ImplicitStep <em>Activitydiagram Activity Node Add Tokens1 Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Activity Node Add Tokens1 Implicit Step</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1_ImplicitStep
	 * @generated
	 */
	EClass getActivitydiagram_ActivityNode_AddTokens1_ImplicitStep();

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
	 * Returns the meta object for the '{@link activitydiagramTrace.Steps.Activitydiagram_Activity_InitializeContext#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see activitydiagramTrace.Steps.Activitydiagram_Activity_InitializeContext#getCaller()
	 * @generated
	 */
	EOperation getActivitydiagram_Activity_InitializeContext__GetCaller();

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
	 * Returns the meta object for the '{@link activitydiagramTrace.Steps.Activitydiagram_Variable_Execute#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see activitydiagramTrace.Steps.Activitydiagram_Variable_Execute#getCaller()
	 * @generated
	 */
	EOperation getActivitydiagram_Variable_Execute__GetCaller();

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
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Steps.Activitydiagram_Activity_Execute#getSubSteps <em>Sub Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Steps</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_Activity_Execute#getSubSteps()
	 * @see #getActivitydiagram_Activity_Execute()
	 * @generated
	 */
	EReference getActivitydiagram_Activity_Execute_SubSteps();

	/**
	 * Returns the meta object for the '{@link activitydiagramTrace.Steps.Activitydiagram_Activity_Execute#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see activitydiagramTrace.Steps.Activitydiagram_Activity_Execute#getCaller()
	 * @generated
	 */
	EOperation getActivitydiagram_Activity_Execute__GetCaller();

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
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_Activity_Execute_ImplicitStep <em>Activitydiagram Activity Execute Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Activity Execute Implicit Step</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_Activity_Execute_ImplicitStep
	 * @generated
	 */
	EClass getActivitydiagram_Activity_Execute_ImplicitStep();

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
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute#getSubSteps <em>Sub Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Steps</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute#getSubSteps()
	 * @see #getActivitydiagram_ActivityNode_Execute()
	 * @generated
	 */
	EReference getActivitydiagram_ActivityNode_Execute_SubSteps();

	/**
	 * Returns the meta object for the '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute#getCaller()
	 * @generated
	 */
	EOperation getActivitydiagram_ActivityNode_Execute__GetCaller();

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
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute_ImplicitStep <em>Activitydiagram Activity Node Execute Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Activity Node Execute Implicit Step</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute_ImplicitStep
	 * @generated
	 */
	EClass getActivitydiagram_ActivityNode_Execute_ImplicitStep();

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
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Steps.Activitydiagram_Activity_WriteTrace#getSubSteps <em>Sub Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Steps</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_Activity_WriteTrace#getSubSteps()
	 * @see #getActivitydiagram_Activity_WriteTrace()
	 * @generated
	 */
	EReference getActivitydiagram_Activity_WriteTrace_SubSteps();

	/**
	 * Returns the meta object for the '{@link activitydiagramTrace.Steps.Activitydiagram_Activity_WriteTrace#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see activitydiagramTrace.Steps.Activitydiagram_Activity_WriteTrace#getCaller()
	 * @generated
	 */
	EOperation getActivitydiagram_Activity_WriteTrace__GetCaller();

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
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_Activity_WriteTrace_ImplicitStep <em>Activitydiagram Activity Write Trace Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Activity Write Trace Implicit Step</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_Activity_WriteTrace_ImplicitStep
	 * @generated
	 */
	EClass getActivitydiagram_Activity_WriteTrace_ImplicitStep();

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
	 * Returns the meta object for the '{@link activitydiagramTrace.Steps.Activitydiagram_Activity_Reset#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see activitydiagramTrace.Steps.Activitydiagram_Activity_Reset#getCaller()
	 * @generated
	 */
	EOperation getActivitydiagram_Activity_Reset__GetCaller();

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
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.BigStepImpl <em>Big Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.BigStepImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getBigStep()
		 * @generated
		 */
		EClass BIG_STEP = eINSTANCE.getBigStep();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.StepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.StepImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getStep()
		 * @generated
		 */
		EClass STEP = eINSTANCE.getStep();

		/**
		 * The meta object literal for the '<em><b>Starting State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__STARTING_STATE = eINSTANCE.getStep_StartingState();

		/**
		 * The meta object literal for the '<em><b>Ending State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__ENDING_STATE = eINSTANCE.getStep_EndingState();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.RootImplicitStepImpl <em>Root Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.RootImplicitStepImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getRootImplicitStep()
		 * @generated
		 */
		EClass ROOT_IMPLICIT_STEP = eINSTANCE.getRootImplicitStep();

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
		 * The meta object literal for the '<em><b>Sub Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1__SUB_STEPS = eINSTANCE.getActivitydiagram_ActivityNode_TakeOfferdTokens1_SubSteps();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1___GET_CALLER = eINSTANCE.getActivitydiagram_ActivityNode_TakeOfferdTokens1__GetCaller();

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
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStepImpl <em>Activitydiagram Activity Node Take Offerd Tokens1 Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStepImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStep()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_IMPLICIT_STEP = eINSTANCE.getActivitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStep();

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
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN1___GET_CALLER = eINSTANCE.getActivitydiagram_ActivityNode_RemoveToken1__GetCaller();

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
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1___GET_CALLER = eINSTANCE.getActivitydiagram_ActivityNode_SendOffers1__GetCaller();

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
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITYDIAGRAM_VARIABLE_INIT___GET_CALLER = eINSTANCE.getActivitydiagram_Variable_Init__GetCaller();

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
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE___GET_CALLER = eINSTANCE.getActivitydiagram_ActivityNode_Terminate__GetCaller();

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
		 * The meta object literal for the '<em><b>Sub Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1__SUB_STEPS = eINSTANCE.getActivitydiagram_ActivityNode_AddTokens1_SubSteps();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1___GET_CALLER = eINSTANCE.getActivitydiagram_ActivityNode_AddTokens1__GetCaller();

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
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_AddTokens1_ImplicitStepImpl <em>Activitydiagram Activity Node Add Tokens1 Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_AddTokens1_ImplicitStepImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_AddTokens1_ImplicitStep()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_IMPLICIT_STEP = eINSTANCE.getActivitydiagram_ActivityNode_AddTokens1_ImplicitStep();

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
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITYDIAGRAM_ACTIVITY_INITIALIZE_CONTEXT___GET_CALLER = eINSTANCE.getActivitydiagram_Activity_InitializeContext__GetCaller();

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
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITYDIAGRAM_VARIABLE_EXECUTE___GET_CALLER = eINSTANCE.getActivitydiagram_Variable_Execute__GetCaller();

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
		 * The meta object literal for the '<em><b>Sub Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITYDIAGRAM_ACTIVITY_EXECUTE__SUB_STEPS = eINSTANCE.getActivitydiagram_Activity_Execute_SubSteps();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITYDIAGRAM_ACTIVITY_EXECUTE___GET_CALLER = eINSTANCE.getActivitydiagram_Activity_Execute__GetCaller();

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
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_Activity_Execute_ImplicitStepImpl <em>Activitydiagram Activity Execute Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_Activity_Execute_ImplicitStepImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_Activity_Execute_ImplicitStep()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_IMPLICIT_STEP = eINSTANCE.getActivitydiagram_Activity_Execute_ImplicitStep();

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
		 * The meta object literal for the '<em><b>Sub Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE__SUB_STEPS = eINSTANCE.getActivitydiagram_ActivityNode_Execute_SubSteps();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE___GET_CALLER = eINSTANCE.getActivitydiagram_ActivityNode_Execute__GetCaller();

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
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_Execute_ImplicitStepImpl <em>Activitydiagram Activity Node Execute Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_Execute_ImplicitStepImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_Execute_ImplicitStep()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_IMPLICIT_STEP = eINSTANCE.getActivitydiagram_ActivityNode_Execute_ImplicitStep();

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
		 * The meta object literal for the '<em><b>Sub Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE__SUB_STEPS = eINSTANCE.getActivitydiagram_Activity_WriteTrace_SubSteps();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE___GET_CALLER = eINSTANCE.getActivitydiagram_Activity_WriteTrace__GetCaller();

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
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_Activity_WriteTrace_ImplicitStepImpl <em>Activitydiagram Activity Write Trace Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_Activity_WriteTrace_ImplicitStepImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_Activity_WriteTrace_ImplicitStep()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_IMPLICIT_STEP = eINSTANCE.getActivitydiagram_Activity_WriteTrace_ImplicitStep();

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
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITYDIAGRAM_ACTIVITY_RESET___GET_CALLER = eINSTANCE.getActivitydiagram_Activity_Reset__GetCaller();

	}

} //StepsPackage
