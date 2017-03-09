/**
 */
package activitydiagramTrace.Steps;

import fr.inria.diverse.trace.commons.model.trace.TracePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.SpecificStepImpl <em>Specific Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.SpecificStepImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getSpecificStep()
	 * @generated
	 */
	int SPECIFIC_STEP = 14;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP__MSEOCCURRENCE = TracePackage.STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP__STARTING_STATE = TracePackage.STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP__ENDING_STATE = TracePackage.STEP__ENDING_STATE;

	/**
	 * The number of structural features of the '<em>Specific Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP_FEATURE_COUNT = TracePackage.STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_AddTokenImpl <em>Activitydiagram Activity Node Add Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_AddTokenImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_AddToken()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKEN = 0;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKEN__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKEN__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKEN__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Node Add Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKEN_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.Activitydiagram_Activity_Execute_AbstractSubStep <em>Activitydiagram Activity Execute Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.Activitydiagram_Activity_Execute_AbstractSubStep
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_Activity_Execute_AbstractSubStep()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP = 7;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Execute Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_ExecuteImpl <em>Activitydiagram Activity Node Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_ExecuteImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_Execute()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE = 1;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE__MSEOCCURRENCE = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE__STARTING_STATE = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE__ENDING_STATE = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE;

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
	 * The meta object id for the '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute_AbstractSubStep <em>Activitydiagram Activity Node Execute Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute_AbstractSubStep
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_Execute_AbstractSubStep()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_STEP = 2;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Node Execute Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_Execute_ImplicitStepImpl <em>Activitydiagram Activity Node Execute Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_Execute_ImplicitStepImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_Execute_ImplicitStep()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_IMPLICIT_STEP = 3;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_IMPLICIT_STEP__MSEOCCURRENCE = ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_IMPLICIT_STEP__STARTING_STATE = ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_IMPLICIT_STEP__ENDING_STATE = ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Node Execute Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_IMPLICIT_STEP_FEATURE_COUNT = ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_RemoveTokenImpl <em>Activitydiagram Activity Node Remove Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_RemoveTokenImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_RemoveToken()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN = 4;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Node Remove Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Node Terminate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_Activity_ExecuteImpl <em>Activitydiagram Activity Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_Activity_ExecuteImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_Activity_Execute()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE = 6;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

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
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_Activity_Execute_ImplicitStepImpl <em>Activitydiagram Activity Execute Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_Activity_Execute_ImplicitStepImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_Activity_Execute_ImplicitStep()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_IMPLICIT_STEP = 8;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_IMPLICIT_STEP__MSEOCCURRENCE = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_IMPLICIT_STEP__STARTING_STATE = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_IMPLICIT_STEP__ENDING_STATE = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Execute Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_IMPLICIT_STEP_FEATURE_COUNT = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_BooleanVariable_InitImpl <em>Activitydiagram Boolean Variable Init</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_BooleanVariable_InitImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_BooleanVariable_Init()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_INIT = 9;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_INIT__MSEOCCURRENCE = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_INIT__STARTING_STATE = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_INIT__ENDING_STATE = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The number of structural features of the '<em>Activitydiagram Boolean Variable Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_INIT_FEATURE_COUNT = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_IntegerVariable_InitImpl <em>Activitydiagram Integer Variable Init</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_IntegerVariable_InitImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_IntegerVariable_Init()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_INTEGER_VARIABLE_INIT = 10;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_INTEGER_VARIABLE_INIT__MSEOCCURRENCE = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_INTEGER_VARIABLE_INIT__STARTING_STATE = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_INTEGER_VARIABLE_INIT__ENDING_STATE = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The number of structural features of the '<em>Activitydiagram Integer Variable Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_INTEGER_VARIABLE_INIT_FEATURE_COUNT = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_Variable_InitImpl <em>Activitydiagram Variable Init</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_Variable_InitImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_Variable_Init()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_VARIABLE_INIT = 11;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_VARIABLE_INIT__MSEOCCURRENCE = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_VARIABLE_INIT__STARTING_STATE = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_VARIABLE_INIT__ENDING_STATE = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The number of structural features of the '<em>Activitydiagram Variable Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_VARIABLE_INIT_FEATURE_COUNT = ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.RootImplicitStepImpl <em>Root Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.RootImplicitStepImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getRootImplicitStep()
	 * @generated
	 */
	int ROOT_IMPLICIT_STEP = 12;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP__MSEOCCURRENCE = TracePackage.SMALL_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP__STARTING_STATE = TracePackage.SMALL_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP__ENDING_STATE = TracePackage.SMALL_STEP__ENDING_STATE;

	/**
	 * The number of structural features of the '<em>Root Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP_FEATURE_COUNT = TracePackage.SMALL_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.SpecificRootStepImpl <em>Specific Root Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.SpecificRootStepImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getSpecificRootStep()
	 * @generated
	 */
	int SPECIFIC_ROOT_STEP = 13;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_ROOT_STEP__MSEOCCURRENCE = TracePackage.SEQUENTIAL_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_ROOT_STEP__STARTING_STATE = TracePackage.SEQUENTIAL_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_ROOT_STEP__ENDING_STATE = TracePackage.SEQUENTIAL_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_ROOT_STEP__SUB_STEPS = TracePackage.SEQUENTIAL_STEP__SUB_STEPS;

	/**
	 * The number of structural features of the '<em>Specific Root Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_ROOT_STEP_FEATURE_COUNT = TracePackage.SEQUENTIAL_STEP_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddToken <em>Activitydiagram Activity Node Add Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Activity Node Add Token</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddToken
	 * @generated
	 */
	EClass getActivitydiagram_ActivityNode_AddToken();

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
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_RemoveToken <em>Activitydiagram Activity Node Remove Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Activity Node Remove Token</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_RemoveToken
	 * @generated
	 */
	EClass getActivitydiagram_ActivityNode_RemoveToken();

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
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_Activity_Execute <em>Activitydiagram Activity Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Activity Execute</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_Activity_Execute
	 * @generated
	 */
	EClass getActivitydiagram_Activity_Execute();

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
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_BooleanVariable_Init <em>Activitydiagram Boolean Variable Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Boolean Variable Init</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_BooleanVariable_Init
	 * @generated
	 */
	EClass getActivitydiagram_BooleanVariable_Init();

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
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_Variable_Init <em>Activitydiagram Variable Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Variable Init</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_Variable_Init
	 * @generated
	 */
	EClass getActivitydiagram_Variable_Init();

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
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.SpecificRootStep <em>Specific Root Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Root Step</em>'.
	 * @see activitydiagramTrace.Steps.SpecificRootStep
	 * @generated
	 */
	EClass getSpecificRootStep();

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
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_AddTokenImpl <em>Activitydiagram Activity Node Add Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_AddTokenImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_AddToken()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKEN = eINSTANCE.getActivitydiagram_ActivityNode_AddToken();

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
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_RemoveTokenImpl <em>Activitydiagram Activity Node Remove Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_RemoveTokenImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_RemoveToken()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN = eINSTANCE.getActivitydiagram_ActivityNode_RemoveToken();

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
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_Activity_ExecuteImpl <em>Activitydiagram Activity Execute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_Activity_ExecuteImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_Activity_Execute()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_ACTIVITY_EXECUTE = eINSTANCE.getActivitydiagram_Activity_Execute();

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
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_BooleanVariable_InitImpl <em>Activitydiagram Boolean Variable Init</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_BooleanVariable_InitImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_BooleanVariable_Init()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_INIT = eINSTANCE.getActivitydiagram_BooleanVariable_Init();

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
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_Variable_InitImpl <em>Activitydiagram Variable Init</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_Variable_InitImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_Variable_Init()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_VARIABLE_INIT = eINSTANCE.getActivitydiagram_Variable_Init();

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
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.SpecificRootStepImpl <em>Specific Root Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.SpecificRootStepImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getSpecificRootStep()
		 * @generated
		 */
		EClass SPECIFIC_ROOT_STEP = eINSTANCE.getSpecificRootStep();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.SpecificStepImpl <em>Specific Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.SpecificStepImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getSpecificStep()
		 * @generated
		 */
		EClass SPECIFIC_STEP = eINSTANCE.getSpecificStep();

	}

} //StepsPackage
