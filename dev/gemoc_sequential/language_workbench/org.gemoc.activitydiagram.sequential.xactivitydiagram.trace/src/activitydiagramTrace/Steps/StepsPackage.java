/**
 */
package activitydiagramTrace.Steps;

import fr.inria.diverse.trace.commons.model.trace.TracePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
	 * The meta object id for the '{@link activitydiagramTrace.Steps.SpecificStep <em>Specific Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.SpecificStep
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getSpecificStep()
	 * @generated
	 */
	int SPECIFIC_STEP = 24;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP__MSEOCCURRENCE = TracePackage.STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP__ENDING_STATE = TracePackage.STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP__STARTING_STATE = TracePackage.STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Specific Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP_FEATURE_COUNT = TracePackage.STEP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Specific Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP_OPERATION_COUNT = TracePackage.STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.Activitydiagram_Activity_Execute_AbstractSubStep <em>Activitydiagram Activity Execute Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.Activitydiagram_Activity_Execute_AbstractSubStep
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_Activity_Execute_AbstractSubStep()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP = 13;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Execute Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Execute Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT = SPECIFIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_AddTokens1Impl <em>Activitydiagram Activity Node Add Tokens1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_AddTokens1Impl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_AddTokens1()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1 = 0;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1__MSEOCCURRENCE = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1__ENDING_STATE = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1__STARTING_STATE = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1__SUB_STEPS = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Node Add Tokens1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_FEATURE_COUNT = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1___GET_CALLER = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Node Add Tokens1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_OPERATION_COUNT = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1_AbstractSubStep <em>Activitydiagram Activity Node Add Tokens1 Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1_AbstractSubStep
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_AddTokens1_AbstractSubStep()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_ABSTRACT_SUB_STEP = 1;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Node Add Tokens1 Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Node Add Tokens1 Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_ABSTRACT_SUB_STEP_OPERATION_COUNT = SPECIFIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_AddTokens1_ImplicitStepImpl <em>Activitydiagram Activity Node Add Tokens1 Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_AddTokens1_ImplicitStepImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_AddTokens1_ImplicitStep()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_IMPLICIT_STEP = 2;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_IMPLICIT_STEP__MSEOCCURRENCE = ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_IMPLICIT_STEP__ENDING_STATE = ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_IMPLICIT_STEP__STARTING_STATE = ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Node Add Tokens1 Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_IMPLICIT_STEP_FEATURE_COUNT = ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Node Add Tokens1 Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_IMPLICIT_STEP_OPERATION_COUNT = ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_ExecuteImpl <em>Activitydiagram Activity Node Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_ExecuteImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_Execute()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE = 3;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE__MSEOCCURRENCE = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE__ENDING_STATE = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE__STARTING_STATE = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE__SUB_STEPS = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Node Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_FEATURE_COUNT = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

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
	 * The meta object id for the '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute_AbstractSubStep <em>Activitydiagram Activity Node Execute Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute_AbstractSubStep
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_Execute_AbstractSubStep()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_STEP = 4;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Node Execute Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Node Execute Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT = SPECIFIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_Execute_ImplicitStepImpl <em>Activitydiagram Activity Node Execute Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_Execute_ImplicitStepImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_Execute_ImplicitStep()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_IMPLICIT_STEP = 5;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_IMPLICIT_STEP__MSEOCCURRENCE = ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_IMPLICIT_STEP__ENDING_STATE = ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_IMPLICIT_STEP__STARTING_STATE = ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Node Execute Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_IMPLICIT_STEP_FEATURE_COUNT = ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Node Execute Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_IMPLICIT_STEP_OPERATION_COUNT = ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStep <em>Activitydiagram Activity Node Take Offerd Tokens1 Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStep
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStep()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_ABSTRACT_SUB_STEP = 9;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Node Take Offerd Tokens1 Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Node Take Offerd Tokens1 Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_ABSTRACT_SUB_STEP_OPERATION_COUNT = SPECIFIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_RemoveToken1Impl <em>Activitydiagram Activity Node Remove Token1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_RemoveToken1Impl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_RemoveToken1()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN1 = 6;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN1__MSEOCCURRENCE = ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN1__ENDING_STATE = ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN1__STARTING_STATE = ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Node Remove Token1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN1_FEATURE_COUNT = ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

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
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1 = 7;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Node Send Offers1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1___GET_CALLER = SPECIFIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Node Send Offers1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1_OPERATION_COUNT = SPECIFIC_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_TakeOfferdTokens1Impl <em>Activitydiagram Activity Node Take Offerd Tokens1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_TakeOfferdTokens1Impl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_TakeOfferdTokens1()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1 = 8;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1__SUB_STEPS = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Node Take Offerd Tokens1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1___GET_CALLER = SPECIFIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Node Take Offerd Tokens1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_OPERATION_COUNT = SPECIFIC_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStepImpl <em>Activitydiagram Activity Node Take Offerd Tokens1 Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStepImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStep()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_IMPLICIT_STEP = 10;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_IMPLICIT_STEP__MSEOCCURRENCE = ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_IMPLICIT_STEP__ENDING_STATE = ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_IMPLICIT_STEP__STARTING_STATE = ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Node Take Offerd Tokens1 Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_IMPLICIT_STEP_FEATURE_COUNT = ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Node Take Offerd Tokens1 Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_IMPLICIT_STEP_OPERATION_COUNT = ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_TerminateImpl <em>Activitydiagram Activity Node Terminate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_TerminateImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_Terminate()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE = 11;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Node Terminate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE___GET_CALLER = SPECIFIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Node Terminate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE_OPERATION_COUNT = SPECIFIC_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_Activity_ExecuteImpl <em>Activitydiagram Activity Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_Activity_ExecuteImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_Activity_Execute()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE = 12;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE__SUB_STEPS = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE___GET_CALLER = SPECIFIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_OPERATION_COUNT = SPECIFIC_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_Activity_Execute_ImplicitStepImpl <em>Activitydiagram Activity Execute Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_Activity_Execute_ImplicitStepImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_Activity_Execute_ImplicitStep()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_IMPLICIT_STEP = 14;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_IMPLICIT_STEP__MSEOCCURRENCE = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_IMPLICIT_STEP__ENDING_STATE = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_IMPLICIT_STEP__STARTING_STATE = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Execute Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_IMPLICIT_STEP_FEATURE_COUNT = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Execute Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_IMPLICIT_STEP_OPERATION_COUNT = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_Activity_ResetImpl <em>Activitydiagram Activity Reset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_Activity_ResetImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_Activity_Reset()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_RESET = 15;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_RESET__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_RESET__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_RESET__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Reset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_RESET_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_RESET___GET_CALLER = SPECIFIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Reset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_RESET_OPERATION_COUNT = SPECIFIC_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_BooleanVariable_ExecuteImpl <em>Activitydiagram Boolean Variable Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_BooleanVariable_ExecuteImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_BooleanVariable_Execute()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_EXECUTE = 16;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_EXECUTE__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_EXECUTE__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_EXECUTE__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Activitydiagram Boolean Variable Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_EXECUTE_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_EXECUTE___GET_CALLER = SPECIFIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Boolean Variable Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_EXECUTE_OPERATION_COUNT = SPECIFIC_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_BooleanVariable_InitImpl <em>Activitydiagram Boolean Variable Init</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_BooleanVariable_InitImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_BooleanVariable_Init()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_INIT = 17;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_INIT__MSEOCCURRENCE = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_INIT__ENDING_STATE = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_INIT__STARTING_STATE = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Activitydiagram Boolean Variable Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_INIT_FEATURE_COUNT = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_INIT___GET_CALLER = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Boolean Variable Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_INIT_OPERATION_COUNT = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_DecisionNode_SendOffers1Impl <em>Activitydiagram Decision Node Send Offers1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_DecisionNode_SendOffers1Impl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_DecisionNode_SendOffers1()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_DECISION_NODE_SEND_OFFERS1 = 18;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_DECISION_NODE_SEND_OFFERS1__MSEOCCURRENCE = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_DECISION_NODE_SEND_OFFERS1__ENDING_STATE = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_DECISION_NODE_SEND_OFFERS1__STARTING_STATE = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Activitydiagram Decision Node Send Offers1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_DECISION_NODE_SEND_OFFERS1_FEATURE_COUNT = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_DECISION_NODE_SEND_OFFERS1___GET_CALLER = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Decision Node Send Offers1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_DECISION_NODE_SEND_OFFERS1_OPERATION_COUNT = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_IntegerVariable_ExecuteImpl <em>Activitydiagram Integer Variable Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_IntegerVariable_ExecuteImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_IntegerVariable_Execute()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_INTEGER_VARIABLE_EXECUTE = 19;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_INTEGER_VARIABLE_EXECUTE__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_INTEGER_VARIABLE_EXECUTE__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_INTEGER_VARIABLE_EXECUTE__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Activitydiagram Integer Variable Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_INTEGER_VARIABLE_EXECUTE_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_INTEGER_VARIABLE_EXECUTE___GET_CALLER = SPECIFIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Integer Variable Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_INTEGER_VARIABLE_EXECUTE_OPERATION_COUNT = SPECIFIC_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_IntegerVariable_InitImpl <em>Activitydiagram Integer Variable Init</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_IntegerVariable_InitImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_IntegerVariable_Init()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_INTEGER_VARIABLE_INIT = 20;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_INTEGER_VARIABLE_INIT__MSEOCCURRENCE = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_INTEGER_VARIABLE_INIT__ENDING_STATE = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_INTEGER_VARIABLE_INIT__STARTING_STATE = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Activitydiagram Integer Variable Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_INTEGER_VARIABLE_INIT_FEATURE_COUNT = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_INTEGER_VARIABLE_INIT___GET_CALLER = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Integer Variable Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_INTEGER_VARIABLE_INIT_OPERATION_COUNT = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 1;

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
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_VARIABLE_EXECUTE__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_VARIABLE_EXECUTE__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_VARIABLE_EXECUTE__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Activitydiagram Variable Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_VARIABLE_EXECUTE_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_VARIABLE_EXECUTE___GET_CALLER = SPECIFIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Variable Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_VARIABLE_EXECUTE_OPERATION_COUNT = SPECIFIC_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_Variable_InitImpl <em>Activitydiagram Variable Init</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_Variable_InitImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_Variable_Init()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_VARIABLE_INIT = 22;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_VARIABLE_INIT__MSEOCCURRENCE = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_VARIABLE_INIT__ENDING_STATE = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_VARIABLE_INIT__STARTING_STATE = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Activitydiagram Variable Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_VARIABLE_INIT_FEATURE_COUNT = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_VARIABLE_INIT___GET_CALLER = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Variable Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_VARIABLE_INIT_OPERATION_COUNT = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.RootImplicitStepImpl <em>Root Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.RootImplicitStepImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getRootImplicitStep()
	 * @generated
	 */
	int ROOT_IMPLICIT_STEP = 23;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP__MSEOCCURRENCE = TracePackage.SMALL_STEP__MSEOCCURRENCE;

	/**
	 * The number of structural features of the '<em>Root Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP_FEATURE_COUNT = TracePackage.SMALL_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Root Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP_OPERATION_COUNT = TracePackage.SMALL_STEP_OPERATION_COUNT + 0;


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
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute <em>Activitydiagram Activity Node Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Activity Node Execute</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute
	 * @generated
	 */
	EClass getActivitydiagram_ActivityNode_Execute();

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
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1 <em>Activitydiagram Activity Node Take Offerd Tokens1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Activity Node Take Offerd Tokens1</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1
	 * @generated
	 */
	EClass getActivitydiagram_ActivityNode_TakeOfferdTokens1();

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
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_Activity_Execute <em>Activitydiagram Activity Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Activity Execute</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_Activity_Execute
	 * @generated
	 */
	EClass getActivitydiagram_Activity_Execute();

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
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_BooleanVariable_Execute <em>Activitydiagram Boolean Variable Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Boolean Variable Execute</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_BooleanVariable_Execute
	 * @generated
	 */
	EClass getActivitydiagram_BooleanVariable_Execute();

	/**
	 * Returns the meta object for the '{@link activitydiagramTrace.Steps.Activitydiagram_BooleanVariable_Execute#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see activitydiagramTrace.Steps.Activitydiagram_BooleanVariable_Execute#getCaller()
	 * @generated
	 */
	EOperation getActivitydiagram_BooleanVariable_Execute__GetCaller();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_BooleanVariable_Init <em>Activitydiagram Boolean Variable Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Boolean Variable Init</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_BooleanVariable_Init
	 * @generated
	 */
	EClass getActivitydiagram_BooleanVariable_Init();

	/**
	 * Returns the meta object for the '{@link activitydiagramTrace.Steps.Activitydiagram_BooleanVariable_Init#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see activitydiagramTrace.Steps.Activitydiagram_BooleanVariable_Init#getCaller()
	 * @generated
	 */
	EOperation getActivitydiagram_BooleanVariable_Init__GetCaller();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_DecisionNode_SendOffers1 <em>Activitydiagram Decision Node Send Offers1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Decision Node Send Offers1</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_DecisionNode_SendOffers1
	 * @generated
	 */
	EClass getActivitydiagram_DecisionNode_SendOffers1();

	/**
	 * Returns the meta object for the '{@link activitydiagramTrace.Steps.Activitydiagram_DecisionNode_SendOffers1#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see activitydiagramTrace.Steps.Activitydiagram_DecisionNode_SendOffers1#getCaller()
	 * @generated
	 */
	EOperation getActivitydiagram_DecisionNode_SendOffers1__GetCaller();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_IntegerVariable_Execute <em>Activitydiagram Integer Variable Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Integer Variable Execute</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_IntegerVariable_Execute
	 * @generated
	 */
	EClass getActivitydiagram_IntegerVariable_Execute();

	/**
	 * Returns the meta object for the '{@link activitydiagramTrace.Steps.Activitydiagram_IntegerVariable_Execute#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see activitydiagramTrace.Steps.Activitydiagram_IntegerVariable_Execute#getCaller()
	 * @generated
	 */
	EOperation getActivitydiagram_IntegerVariable_Execute__GetCaller();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_IntegerVariable_Init <em>Activitydiagram Integer Variable Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Integer Variable Init</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_IntegerVariable_Init
	 * @generated
	 */
	EClass getActivitydiagram_IntegerVariable_Init();

	/**
	 * Returns the meta object for the '{@link activitydiagramTrace.Steps.Activitydiagram_IntegerVariable_Init#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see activitydiagramTrace.Steps.Activitydiagram_IntegerVariable_Init#getCaller()
	 * @generated
	 */
	EOperation getActivitydiagram_IntegerVariable_Init__GetCaller();

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
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.RootImplicitStep <em>Root Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Implicit Step</em>'.
	 * @see activitydiagramTrace.Steps.RootImplicitStep
	 * @generated
	 */
	EClass getRootImplicitStep();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.SpecificStep <em>Specific Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Step</em>'.
	 * @see activitydiagramTrace.Steps.SpecificStep
	 * @generated
	 */
	EClass getSpecificStep();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.Steps.SpecificStep#getEndingState <em>Ending State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ending State</em>'.
	 * @see activitydiagramTrace.Steps.SpecificStep#getEndingState()
	 * @see #getSpecificStep()
	 * @generated
	 */
	EReference getSpecificStep_EndingState();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.Steps.SpecificStep#getStartingState <em>Starting State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Starting State</em>'.
	 * @see activitydiagramTrace.Steps.SpecificStep#getStartingState()
	 * @see #getSpecificStep()
	 * @generated
	 */
	EReference getSpecificStep_StartingState();

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
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_AddTokens1Impl <em>Activitydiagram Activity Node Add Tokens1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_AddTokens1Impl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_AddTokens1()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1 = eINSTANCE.getActivitydiagram_ActivityNode_AddTokens1();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1___GET_CALLER = eINSTANCE.getActivitydiagram_ActivityNode_AddTokens1__GetCaller();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1_AbstractSubStep <em>Activitydiagram Activity Node Add Tokens1 Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1_AbstractSubStep
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
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_ExecuteImpl <em>Activitydiagram Activity Node Execute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_ExecuteImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_Execute()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE = eINSTANCE.getActivitydiagram_ActivityNode_Execute();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE___GET_CALLER = eINSTANCE.getActivitydiagram_ActivityNode_Execute__GetCaller();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute_AbstractSubStep <em>Activitydiagram Activity Node Execute Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute_AbstractSubStep
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
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_TakeOfferdTokens1Impl <em>Activitydiagram Activity Node Take Offerd Tokens1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_TakeOfferdTokens1Impl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_TakeOfferdTokens1()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1 = eINSTANCE.getActivitydiagram_ActivityNode_TakeOfferdTokens1();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1___GET_CALLER = eINSTANCE.getActivitydiagram_ActivityNode_TakeOfferdTokens1__GetCaller();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStep <em>Activitydiagram Activity Node Take Offerd Tokens1 Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStep
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
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_Activity_ExecuteImpl <em>Activitydiagram Activity Execute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_Activity_ExecuteImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_Activity_Execute()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_ACTIVITY_EXECUTE = eINSTANCE.getActivitydiagram_Activity_Execute();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITYDIAGRAM_ACTIVITY_EXECUTE___GET_CALLER = eINSTANCE.getActivitydiagram_Activity_Execute__GetCaller();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.Activitydiagram_Activity_Execute_AbstractSubStep <em>Activitydiagram Activity Execute Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.Activitydiagram_Activity_Execute_AbstractSubStep
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

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_BooleanVariable_ExecuteImpl <em>Activitydiagram Boolean Variable Execute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_BooleanVariable_ExecuteImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_BooleanVariable_Execute()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_EXECUTE = eINSTANCE.getActivitydiagram_BooleanVariable_Execute();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_EXECUTE___GET_CALLER = eINSTANCE.getActivitydiagram_BooleanVariable_Execute__GetCaller();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_BooleanVariable_InitImpl <em>Activitydiagram Boolean Variable Init</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_BooleanVariable_InitImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_BooleanVariable_Init()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_INIT = eINSTANCE.getActivitydiagram_BooleanVariable_Init();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_INIT___GET_CALLER = eINSTANCE.getActivitydiagram_BooleanVariable_Init__GetCaller();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_DecisionNode_SendOffers1Impl <em>Activitydiagram Decision Node Send Offers1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_DecisionNode_SendOffers1Impl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_DecisionNode_SendOffers1()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_DECISION_NODE_SEND_OFFERS1 = eINSTANCE.getActivitydiagram_DecisionNode_SendOffers1();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITYDIAGRAM_DECISION_NODE_SEND_OFFERS1___GET_CALLER = eINSTANCE.getActivitydiagram_DecisionNode_SendOffers1__GetCaller();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_IntegerVariable_ExecuteImpl <em>Activitydiagram Integer Variable Execute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_IntegerVariable_ExecuteImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_IntegerVariable_Execute()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_INTEGER_VARIABLE_EXECUTE = eINSTANCE.getActivitydiagram_IntegerVariable_Execute();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITYDIAGRAM_INTEGER_VARIABLE_EXECUTE___GET_CALLER = eINSTANCE.getActivitydiagram_IntegerVariable_Execute__GetCaller();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_IntegerVariable_InitImpl <em>Activitydiagram Integer Variable Init</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_IntegerVariable_InitImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_IntegerVariable_Init()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_INTEGER_VARIABLE_INIT = eINSTANCE.getActivitydiagram_IntegerVariable_Init();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITYDIAGRAM_INTEGER_VARIABLE_INIT___GET_CALLER = eINSTANCE.getActivitydiagram_IntegerVariable_Init__GetCaller();

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
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.RootImplicitStepImpl <em>Root Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.RootImplicitStepImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getRootImplicitStep()
		 * @generated
		 */
		EClass ROOT_IMPLICIT_STEP = eINSTANCE.getRootImplicitStep();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.SpecificStep <em>Specific Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.SpecificStep
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getSpecificStep()
		 * @generated
		 */
		EClass SPECIFIC_STEP = eINSTANCE.getSpecificStep();

		/**
		 * The meta object literal for the '<em><b>Ending State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_STEP__ENDING_STATE = eINSTANCE.getSpecificStep_EndingState();

		/**
		 * The meta object literal for the '<em><b>Starting State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_STEP__STARTING_STATE = eINSTANCE.getSpecificStep_StartingState();

	}

} //StepsPackage
