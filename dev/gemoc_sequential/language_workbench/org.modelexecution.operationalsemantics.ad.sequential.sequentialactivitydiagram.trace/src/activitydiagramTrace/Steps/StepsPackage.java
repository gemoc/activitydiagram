/**
 */
package activitydiagramTrace.Steps;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.gemoc.executionframework.engine.mse.MsePackage;

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
	int SPECIFIC_STEP = 57;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP__MSEOCCURRENCE = MsePackage.STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP__ENDING_STATE = MsePackage.STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP__STARTING_STATE = MsePackage.STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Specific Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP_FEATURE_COUNT = MsePackage.STEP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Specific Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP_OPERATION_COUNT = MsePackage.STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.Activitydiagram_NamedElement_Execute_AbstractSubStep <em>Activitydiagram Named Element Execute Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.Activitydiagram_NamedElement_Execute_AbstractSubStep
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_NamedElement_Execute_AbstractSubStep()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP = 51;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Activitydiagram Named Element Execute Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Named Element Execute Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT = SPECIFIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityFinalNode_ExecuteImpl <em>Activitydiagram Activity Final Node Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityFinalNode_ExecuteImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityFinalNode_Execute()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_FINAL_NODE_EXECUTE = 0;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_FINAL_NODE_EXECUTE__MSEOCCURRENCE = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_FINAL_NODE_EXECUTE__ENDING_STATE = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_FINAL_NODE_EXECUTE__STARTING_STATE = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_FINAL_NODE_EXECUTE__SUB_STEPS = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Final Node Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_FINAL_NODE_EXECUTE_FEATURE_COUNT = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_FINAL_NODE_EXECUTE___GET_CALLER = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Final Node Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_FINAL_NODE_EXECUTE_OPERATION_COUNT = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityFinalNode_Execute_AbstractSubStep <em>Activitydiagram Activity Final Node Execute Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityFinalNode_Execute_AbstractSubStep
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityFinalNode_Execute_AbstractSubStep()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_FINAL_NODE_EXECUTE_ABSTRACT_SUB_STEP = 1;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_FINAL_NODE_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_FINAL_NODE_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_FINAL_NODE_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Final Node Execute Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_FINAL_NODE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Final Node Execute Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_FINAL_NODE_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT = SPECIFIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityFinalNode_Execute_ImplicitStepImpl <em>Activitydiagram Activity Final Node Execute Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityFinalNode_Execute_ImplicitStepImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityFinalNode_Execute_ImplicitStep()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_FINAL_NODE_EXECUTE_IMPLICIT_STEP = 2;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_FINAL_NODE_EXECUTE_IMPLICIT_STEP__MSEOCCURRENCE = ACTIVITYDIAGRAM_ACTIVITY_FINAL_NODE_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_FINAL_NODE_EXECUTE_IMPLICIT_STEP__ENDING_STATE = ACTIVITYDIAGRAM_ACTIVITY_FINAL_NODE_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_FINAL_NODE_EXECUTE_IMPLICIT_STEP__STARTING_STATE = ACTIVITYDIAGRAM_ACTIVITY_FINAL_NODE_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Final Node Execute Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_FINAL_NODE_EXECUTE_IMPLICIT_STEP_FEATURE_COUNT = ACTIVITYDIAGRAM_ACTIVITY_FINAL_NODE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Final Node Execute Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_FINAL_NODE_EXECUTE_IMPLICIT_STEP_OPERATION_COUNT = ACTIVITYDIAGRAM_ACTIVITY_FINAL_NODE_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_AddTokens1Impl <em>Activitydiagram Activity Node Add Tokens1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_AddTokens1Impl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_AddTokens1()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1 = 3;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1__SUB_STEPS = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Node Add Tokens1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1___GET_CALLER = SPECIFIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Node Add Tokens1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_OPERATION_COUNT = SPECIFIC_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1_AbstractSubStep <em>Activitydiagram Activity Node Add Tokens1 Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1_AbstractSubStep
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_AddTokens1_AbstractSubStep()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_ABSTRACT_SUB_STEP = 4;

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
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_IMPLICIT_STEP = 5;

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
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE = 6;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE__MSEOCCURRENCE = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE__ENDING_STATE = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE__STARTING_STATE = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE__SUB_STEPS = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Node Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_FEATURE_COUNT = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE___GET_CALLER = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Node Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_OPERATION_COUNT = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute_AbstractSubStep <em>Activitydiagram Activity Node Execute Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute_AbstractSubStep
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_Execute_AbstractSubStep()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_STEP = 7;

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
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_IMPLICIT_STEP = 8;

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
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_ABSTRACT_SUB_STEP = 12;

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
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN1 = 9;

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
	 * The meta object id for the '{@link activitydiagramTrace.Steps.Activitydiagram_MergeNode_Execute_AbstractSubStep <em>Activitydiagram Merge Node Execute Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.Activitydiagram_MergeNode_Execute_AbstractSubStep
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_MergeNode_Execute_AbstractSubStep()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_MERGE_NODE_EXECUTE_ABSTRACT_SUB_STEP = 48;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_MERGE_NODE_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_MERGE_NODE_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_MERGE_NODE_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Activitydiagram Merge Node Execute Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_MERGE_NODE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Merge Node Execute Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_MERGE_NODE_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT = SPECIFIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_SendOffers1Impl <em>Activitydiagram Activity Node Send Offers1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_SendOffers1Impl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_SendOffers1()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1 = 10;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1__MSEOCCURRENCE = ACTIVITYDIAGRAM_MERGE_NODE_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1__ENDING_STATE = ACTIVITYDIAGRAM_MERGE_NODE_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1__STARTING_STATE = ACTIVITYDIAGRAM_MERGE_NODE_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Node Send Offers1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1_FEATURE_COUNT = ACTIVITYDIAGRAM_MERGE_NODE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1___GET_CALLER = ACTIVITYDIAGRAM_MERGE_NODE_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Node Send Offers1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1_OPERATION_COUNT = ACTIVITYDIAGRAM_MERGE_NODE_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_TakeOfferdTokens1Impl <em>Activitydiagram Activity Node Take Offerd Tokens1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_TakeOfferdTokens1Impl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_TakeOfferdTokens1()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1 = 11;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1__MSEOCCURRENCE = ACTIVITYDIAGRAM_MERGE_NODE_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1__ENDING_STATE = ACTIVITYDIAGRAM_MERGE_NODE_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1__STARTING_STATE = ACTIVITYDIAGRAM_MERGE_NODE_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1__SUB_STEPS = ACTIVITYDIAGRAM_MERGE_NODE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Node Take Offerd Tokens1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_FEATURE_COUNT = ACTIVITYDIAGRAM_MERGE_NODE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1___GET_CALLER = ACTIVITYDIAGRAM_MERGE_NODE_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Node Take Offerd Tokens1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_OPERATION_COUNT = ACTIVITYDIAGRAM_MERGE_NODE_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStepImpl <em>Activitydiagram Activity Node Take Offerd Tokens1 Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStepImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStep()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_IMPLICIT_STEP = 13;

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
	int ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE = 14;

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
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE = 15;

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
	 * The meta object id for the '{@link activitydiagramTrace.Steps.Activitydiagram_Activity_Execute_AbstractSubStep <em>Activitydiagram Activity Execute Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.Activitydiagram_Activity_Execute_AbstractSubStep
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_Activity_Execute_AbstractSubStep()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP = 16;

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
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_Activity_Execute_ImplicitStepImpl <em>Activitydiagram Activity Execute Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_Activity_Execute_ImplicitStepImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_Activity_Execute_ImplicitStep()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_IMPLICIT_STEP = 17;

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
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_Activity_InitializeContextImpl <em>Activitydiagram Activity Initialize Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_Activity_InitializeContextImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_Activity_InitializeContext()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_INITIALIZE_CONTEXT = 18;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_INITIALIZE_CONTEXT__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_INITIALIZE_CONTEXT__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_INITIALIZE_CONTEXT__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Initialize Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_INITIALIZE_CONTEXT_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_INITIALIZE_CONTEXT___GET_CALLER = SPECIFIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Initialize Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_INITIALIZE_CONTEXT_OPERATION_COUNT = SPECIFIC_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.Activitydiagram_Activity_WriteTrace_AbstractSubStep <em>Activitydiagram Activity Write Trace Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.Activitydiagram_Activity_WriteTrace_AbstractSubStep
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_Activity_WriteTrace_AbstractSubStep()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_ABSTRACT_SUB_STEP = 21;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Write Trace Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Write Trace Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_ABSTRACT_SUB_STEP_OPERATION_COUNT = SPECIFIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_Activity_ResetImpl <em>Activitydiagram Activity Reset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_Activity_ResetImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_Activity_Reset()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_RESET = 19;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_RESET__MSEOCCURRENCE = ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_RESET__ENDING_STATE = ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_RESET__STARTING_STATE = ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Reset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_RESET_FEATURE_COUNT = ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

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
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_Activity_WriteTraceImpl <em>Activitydiagram Activity Write Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_Activity_WriteTraceImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_Activity_WriteTrace()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE = 20;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE__SUB_STEPS = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Write Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE___GET_CALLER = SPECIFIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Write Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_OPERATION_COUNT = SPECIFIC_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_Activity_WriteTrace_ImplicitStepImpl <em>Activitydiagram Activity Write Trace Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_Activity_WriteTrace_ImplicitStepImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_Activity_WriteTrace_ImplicitStep()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_IMPLICIT_STEP = 22;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_IMPLICIT_STEP__MSEOCCURRENCE = ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_IMPLICIT_STEP__ENDING_STATE = ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_IMPLICIT_STEP__STARTING_STATE = ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Activitydiagram Activity Write Trace Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_IMPLICIT_STEP_FEATURE_COUNT = ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Activity Write Trace Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_IMPLICIT_STEP_OPERATION_COUNT = ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_BooleanBinaryExpression_ExecuteImpl <em>Activitydiagram Boolean Binary Expression Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_BooleanBinaryExpression_ExecuteImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_BooleanBinaryExpression_Execute()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_BOOLEAN_BINARY_EXPRESSION_EXECUTE = 23;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_BOOLEAN_BINARY_EXPRESSION_EXECUTE__MSEOCCURRENCE = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_BOOLEAN_BINARY_EXPRESSION_EXECUTE__ENDING_STATE = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_BOOLEAN_BINARY_EXPRESSION_EXECUTE__STARTING_STATE = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Activitydiagram Boolean Binary Expression Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_BOOLEAN_BINARY_EXPRESSION_EXECUTE_FEATURE_COUNT = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_BOOLEAN_BINARY_EXPRESSION_EXECUTE___GET_CALLER = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Boolean Binary Expression Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_BOOLEAN_BINARY_EXPRESSION_EXECUTE_OPERATION_COUNT = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_BooleanUnaryExpression_ExecuteImpl <em>Activitydiagram Boolean Unary Expression Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_BooleanUnaryExpression_ExecuteImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_BooleanUnaryExpression_Execute()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_BOOLEAN_UNARY_EXPRESSION_EXECUTE = 24;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_BOOLEAN_UNARY_EXPRESSION_EXECUTE__MSEOCCURRENCE = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_BOOLEAN_UNARY_EXPRESSION_EXECUTE__ENDING_STATE = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_BOOLEAN_UNARY_EXPRESSION_EXECUTE__STARTING_STATE = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Activitydiagram Boolean Unary Expression Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_BOOLEAN_UNARY_EXPRESSION_EXECUTE_FEATURE_COUNT = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_BOOLEAN_UNARY_EXPRESSION_EXECUTE___GET_CALLER = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Boolean Unary Expression Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_BOOLEAN_UNARY_EXPRESSION_EXECUTE_OPERATION_COUNT = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_BooleanVariable_ExecuteImpl <em>Activitydiagram Boolean Variable Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_BooleanVariable_ExecuteImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_BooleanVariable_Execute()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_EXECUTE = 25;

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
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_EXECUTE__SUB_STEPS = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activitydiagram Boolean Variable Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_EXECUTE_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 1;

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
	 * The meta object id for the '{@link activitydiagramTrace.Steps.Activitydiagram_BooleanVariable_Execute_AbstractSubStep <em>Activitydiagram Boolean Variable Execute Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.Activitydiagram_BooleanVariable_Execute_AbstractSubStep
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_BooleanVariable_Execute_AbstractSubStep()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_EXECUTE_ABSTRACT_SUB_STEP = 26;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Activitydiagram Boolean Variable Execute Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Boolean Variable Execute Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT = SPECIFIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_BooleanVariable_Execute_ImplicitStepImpl <em>Activitydiagram Boolean Variable Execute Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_BooleanVariable_Execute_ImplicitStepImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_BooleanVariable_Execute_ImplicitStep()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_EXECUTE_IMPLICIT_STEP = 27;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_EXECUTE_IMPLICIT_STEP__MSEOCCURRENCE = ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_EXECUTE_IMPLICIT_STEP__ENDING_STATE = ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_EXECUTE_IMPLICIT_STEP__STARTING_STATE = ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Activitydiagram Boolean Variable Execute Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_EXECUTE_IMPLICIT_STEP_FEATURE_COUNT = ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Boolean Variable Execute Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_EXECUTE_IMPLICIT_STEP_OPERATION_COUNT = ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_BooleanVariable_InitImpl <em>Activitydiagram Boolean Variable Init</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_BooleanVariable_InitImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_BooleanVariable_Init()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_INIT = 28;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_INIT__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_INIT__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_INIT__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Activitydiagram Boolean Variable Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_INIT_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_INIT___GET_CALLER = SPECIFIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Boolean Variable Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_INIT_OPERATION_COUNT = SPECIFIC_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_DecisionNode_ExecuteImpl <em>Activitydiagram Decision Node Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_DecisionNode_ExecuteImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_DecisionNode_Execute()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_DECISION_NODE_EXECUTE = 29;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_DECISION_NODE_EXECUTE__MSEOCCURRENCE = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_DECISION_NODE_EXECUTE__ENDING_STATE = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_DECISION_NODE_EXECUTE__STARTING_STATE = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_DECISION_NODE_EXECUTE__SUB_STEPS = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activitydiagram Decision Node Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_DECISION_NODE_EXECUTE_FEATURE_COUNT = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_DECISION_NODE_EXECUTE___GET_CALLER = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Decision Node Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_DECISION_NODE_EXECUTE_OPERATION_COUNT = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.Activitydiagram_DecisionNode_Execute_AbstractSubStep <em>Activitydiagram Decision Node Execute Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.Activitydiagram_DecisionNode_Execute_AbstractSubStep
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_DecisionNode_Execute_AbstractSubStep()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_DECISION_NODE_EXECUTE_ABSTRACT_SUB_STEP = 30;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_DECISION_NODE_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_DECISION_NODE_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_DECISION_NODE_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Activitydiagram Decision Node Execute Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_DECISION_NODE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Decision Node Execute Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_DECISION_NODE_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT = SPECIFIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_DecisionNode_Execute_ImplicitStepImpl <em>Activitydiagram Decision Node Execute Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_DecisionNode_Execute_ImplicitStepImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_DecisionNode_Execute_ImplicitStep()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_DECISION_NODE_EXECUTE_IMPLICIT_STEP = 31;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_DECISION_NODE_EXECUTE_IMPLICIT_STEP__MSEOCCURRENCE = ACTIVITYDIAGRAM_DECISION_NODE_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_DECISION_NODE_EXECUTE_IMPLICIT_STEP__ENDING_STATE = ACTIVITYDIAGRAM_DECISION_NODE_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_DECISION_NODE_EXECUTE_IMPLICIT_STEP__STARTING_STATE = ACTIVITYDIAGRAM_DECISION_NODE_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Activitydiagram Decision Node Execute Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_DECISION_NODE_EXECUTE_IMPLICIT_STEP_FEATURE_COUNT = ACTIVITYDIAGRAM_DECISION_NODE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Decision Node Execute Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_DECISION_NODE_EXECUTE_IMPLICIT_STEP_OPERATION_COUNT = ACTIVITYDIAGRAM_DECISION_NODE_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_DecisionNode_SendOffers1Impl <em>Activitydiagram Decision Node Send Offers1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_DecisionNode_SendOffers1Impl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_DecisionNode_SendOffers1()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_DECISION_NODE_SEND_OFFERS1 = 32;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_DECISION_NODE_SEND_OFFERS1__MSEOCCURRENCE = ACTIVITYDIAGRAM_MERGE_NODE_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_DECISION_NODE_SEND_OFFERS1__ENDING_STATE = ACTIVITYDIAGRAM_MERGE_NODE_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_DECISION_NODE_SEND_OFFERS1__STARTING_STATE = ACTIVITYDIAGRAM_MERGE_NODE_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Activitydiagram Decision Node Send Offers1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_DECISION_NODE_SEND_OFFERS1_FEATURE_COUNT = ACTIVITYDIAGRAM_MERGE_NODE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_DECISION_NODE_SEND_OFFERS1___GET_CALLER = ACTIVITYDIAGRAM_MERGE_NODE_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Decision Node Send Offers1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_DECISION_NODE_SEND_OFFERS1_OPERATION_COUNT = ACTIVITYDIAGRAM_MERGE_NODE_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_Expression_ExecuteImpl <em>Activitydiagram Expression Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_Expression_ExecuteImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_Expression_Execute()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_EXPRESSION_EXECUTE = 33;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_EXPRESSION_EXECUTE__MSEOCCURRENCE = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_EXPRESSION_EXECUTE__ENDING_STATE = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_EXPRESSION_EXECUTE__STARTING_STATE = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Activitydiagram Expression Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_EXPRESSION_EXECUTE_FEATURE_COUNT = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_EXPRESSION_EXECUTE___GET_CALLER = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Expression Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_EXPRESSION_EXECUTE_OPERATION_COUNT = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ForkNode_ExecuteImpl <em>Activitydiagram Fork Node Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ForkNode_ExecuteImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ForkNode_Execute()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_FORK_NODE_EXECUTE = 34;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_FORK_NODE_EXECUTE__MSEOCCURRENCE = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_FORK_NODE_EXECUTE__ENDING_STATE = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_FORK_NODE_EXECUTE__STARTING_STATE = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_FORK_NODE_EXECUTE__SUB_STEPS = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activitydiagram Fork Node Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_FORK_NODE_EXECUTE_FEATURE_COUNT = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_FORK_NODE_EXECUTE___GET_CALLER = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Fork Node Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_FORK_NODE_EXECUTE_OPERATION_COUNT = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.Activitydiagram_ForkNode_Execute_AbstractSubStep <em>Activitydiagram Fork Node Execute Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.Activitydiagram_ForkNode_Execute_AbstractSubStep
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ForkNode_Execute_AbstractSubStep()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_FORK_NODE_EXECUTE_ABSTRACT_SUB_STEP = 35;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_FORK_NODE_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_FORK_NODE_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_FORK_NODE_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Activitydiagram Fork Node Execute Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_FORK_NODE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Fork Node Execute Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_FORK_NODE_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT = SPECIFIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ForkNode_Execute_ImplicitStepImpl <em>Activitydiagram Fork Node Execute Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ForkNode_Execute_ImplicitStepImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ForkNode_Execute_ImplicitStep()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_FORK_NODE_EXECUTE_IMPLICIT_STEP = 36;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_FORK_NODE_EXECUTE_IMPLICIT_STEP__MSEOCCURRENCE = ACTIVITYDIAGRAM_FORK_NODE_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_FORK_NODE_EXECUTE_IMPLICIT_STEP__ENDING_STATE = ACTIVITYDIAGRAM_FORK_NODE_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_FORK_NODE_EXECUTE_IMPLICIT_STEP__STARTING_STATE = ACTIVITYDIAGRAM_FORK_NODE_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Activitydiagram Fork Node Execute Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_FORK_NODE_EXECUTE_IMPLICIT_STEP_FEATURE_COUNT = ACTIVITYDIAGRAM_FORK_NODE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Fork Node Execute Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_FORK_NODE_EXECUTE_IMPLICIT_STEP_OPERATION_COUNT = ACTIVITYDIAGRAM_FORK_NODE_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_InitialNode_ExecuteImpl <em>Activitydiagram Initial Node Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_InitialNode_ExecuteImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_InitialNode_Execute()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_INITIAL_NODE_EXECUTE = 37;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_INITIAL_NODE_EXECUTE__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_INITIAL_NODE_EXECUTE__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_INITIAL_NODE_EXECUTE__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_INITIAL_NODE_EXECUTE__SUB_STEPS = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activitydiagram Initial Node Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_INITIAL_NODE_EXECUTE_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_INITIAL_NODE_EXECUTE___GET_CALLER = SPECIFIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Initial Node Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_INITIAL_NODE_EXECUTE_OPERATION_COUNT = SPECIFIC_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.Activitydiagram_InitialNode_Execute_AbstractSubStep <em>Activitydiagram Initial Node Execute Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.Activitydiagram_InitialNode_Execute_AbstractSubStep
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_InitialNode_Execute_AbstractSubStep()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_INITIAL_NODE_EXECUTE_ABSTRACT_SUB_STEP = 38;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_INITIAL_NODE_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_INITIAL_NODE_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_INITIAL_NODE_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Activitydiagram Initial Node Execute Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_INITIAL_NODE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Initial Node Execute Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_INITIAL_NODE_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT = SPECIFIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_InitialNode_Execute_ImplicitStepImpl <em>Activitydiagram Initial Node Execute Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_InitialNode_Execute_ImplicitStepImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_InitialNode_Execute_ImplicitStep()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_INITIAL_NODE_EXECUTE_IMPLICIT_STEP = 39;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_INITIAL_NODE_EXECUTE_IMPLICIT_STEP__MSEOCCURRENCE = ACTIVITYDIAGRAM_INITIAL_NODE_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_INITIAL_NODE_EXECUTE_IMPLICIT_STEP__ENDING_STATE = ACTIVITYDIAGRAM_INITIAL_NODE_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_INITIAL_NODE_EXECUTE_IMPLICIT_STEP__STARTING_STATE = ACTIVITYDIAGRAM_INITIAL_NODE_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Activitydiagram Initial Node Execute Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_INITIAL_NODE_EXECUTE_IMPLICIT_STEP_FEATURE_COUNT = ACTIVITYDIAGRAM_INITIAL_NODE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Initial Node Execute Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_INITIAL_NODE_EXECUTE_IMPLICIT_STEP_OPERATION_COUNT = ACTIVITYDIAGRAM_INITIAL_NODE_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_IntegerCalculationExpression_ExecuteImpl <em>Activitydiagram Integer Calculation Expression Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_IntegerCalculationExpression_ExecuteImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_IntegerCalculationExpression_Execute()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_INTEGER_CALCULATION_EXPRESSION_EXECUTE = 40;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_INTEGER_CALCULATION_EXPRESSION_EXECUTE__MSEOCCURRENCE = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_INTEGER_CALCULATION_EXPRESSION_EXECUTE__ENDING_STATE = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_INTEGER_CALCULATION_EXPRESSION_EXECUTE__STARTING_STATE = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Activitydiagram Integer Calculation Expression Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_INTEGER_CALCULATION_EXPRESSION_EXECUTE_FEATURE_COUNT = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_INTEGER_CALCULATION_EXPRESSION_EXECUTE___GET_CALLER = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Integer Calculation Expression Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_INTEGER_CALCULATION_EXPRESSION_EXECUTE_OPERATION_COUNT = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_IntegerComparisonExpression_ExecuteImpl <em>Activitydiagram Integer Comparison Expression Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_IntegerComparisonExpression_ExecuteImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_IntegerComparisonExpression_Execute()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_INTEGER_COMPARISON_EXPRESSION_EXECUTE = 41;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_INTEGER_COMPARISON_EXPRESSION_EXECUTE__MSEOCCURRENCE = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_INTEGER_COMPARISON_EXPRESSION_EXECUTE__ENDING_STATE = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_INTEGER_COMPARISON_EXPRESSION_EXECUTE__STARTING_STATE = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Activitydiagram Integer Comparison Expression Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_INTEGER_COMPARISON_EXPRESSION_EXECUTE_FEATURE_COUNT = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_INTEGER_COMPARISON_EXPRESSION_EXECUTE___GET_CALLER = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Integer Comparison Expression Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_INTEGER_COMPARISON_EXPRESSION_EXECUTE_OPERATION_COUNT = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_IntegerVariable_ExecuteImpl <em>Activitydiagram Integer Variable Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_IntegerVariable_ExecuteImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_IntegerVariable_Execute()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_INTEGER_VARIABLE_EXECUTE = 42;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_INTEGER_VARIABLE_EXECUTE__MSEOCCURRENCE = ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_INTEGER_VARIABLE_EXECUTE__ENDING_STATE = ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_INTEGER_VARIABLE_EXECUTE__STARTING_STATE = ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Activitydiagram Integer Variable Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_INTEGER_VARIABLE_EXECUTE_FEATURE_COUNT = ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_INTEGER_VARIABLE_EXECUTE___GET_CALLER = ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Integer Variable Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_INTEGER_VARIABLE_EXECUTE_OPERATION_COUNT = ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_IntegerVariable_InitImpl <em>Activitydiagram Integer Variable Init</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_IntegerVariable_InitImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_IntegerVariable_Init()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_INTEGER_VARIABLE_INIT = 43;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_INTEGER_VARIABLE_INIT__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_INTEGER_VARIABLE_INIT__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_INTEGER_VARIABLE_INIT__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Activitydiagram Integer Variable Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_INTEGER_VARIABLE_INIT_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_INTEGER_VARIABLE_INIT___GET_CALLER = SPECIFIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Integer Variable Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_INTEGER_VARIABLE_INIT_OPERATION_COUNT = SPECIFIC_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_JoinNode_ExecuteImpl <em>Activitydiagram Join Node Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_JoinNode_ExecuteImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_JoinNode_Execute()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_JOIN_NODE_EXECUTE = 44;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_JOIN_NODE_EXECUTE__MSEOCCURRENCE = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_JOIN_NODE_EXECUTE__ENDING_STATE = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_JOIN_NODE_EXECUTE__STARTING_STATE = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_JOIN_NODE_EXECUTE__SUB_STEPS = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activitydiagram Join Node Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_JOIN_NODE_EXECUTE_FEATURE_COUNT = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_JOIN_NODE_EXECUTE___GET_CALLER = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Join Node Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_JOIN_NODE_EXECUTE_OPERATION_COUNT = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.Activitydiagram_JoinNode_Execute_AbstractSubStep <em>Activitydiagram Join Node Execute Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.Activitydiagram_JoinNode_Execute_AbstractSubStep
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_JoinNode_Execute_AbstractSubStep()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_JOIN_NODE_EXECUTE_ABSTRACT_SUB_STEP = 45;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_JOIN_NODE_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_JOIN_NODE_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_JOIN_NODE_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Activitydiagram Join Node Execute Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_JOIN_NODE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Join Node Execute Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_JOIN_NODE_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT = SPECIFIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_JoinNode_Execute_ImplicitStepImpl <em>Activitydiagram Join Node Execute Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_JoinNode_Execute_ImplicitStepImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_JoinNode_Execute_ImplicitStep()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_JOIN_NODE_EXECUTE_IMPLICIT_STEP = 46;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_JOIN_NODE_EXECUTE_IMPLICIT_STEP__MSEOCCURRENCE = ACTIVITYDIAGRAM_JOIN_NODE_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_JOIN_NODE_EXECUTE_IMPLICIT_STEP__ENDING_STATE = ACTIVITYDIAGRAM_JOIN_NODE_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_JOIN_NODE_EXECUTE_IMPLICIT_STEP__STARTING_STATE = ACTIVITYDIAGRAM_JOIN_NODE_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Activitydiagram Join Node Execute Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_JOIN_NODE_EXECUTE_IMPLICIT_STEP_FEATURE_COUNT = ACTIVITYDIAGRAM_JOIN_NODE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Join Node Execute Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_JOIN_NODE_EXECUTE_IMPLICIT_STEP_OPERATION_COUNT = ACTIVITYDIAGRAM_JOIN_NODE_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_MergeNode_ExecuteImpl <em>Activitydiagram Merge Node Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_MergeNode_ExecuteImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_MergeNode_Execute()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_MERGE_NODE_EXECUTE = 47;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_MERGE_NODE_EXECUTE__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_MERGE_NODE_EXECUTE__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_MERGE_NODE_EXECUTE__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_MERGE_NODE_EXECUTE__SUB_STEPS = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activitydiagram Merge Node Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_MERGE_NODE_EXECUTE_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_MERGE_NODE_EXECUTE___GET_CALLER = SPECIFIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Merge Node Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_MERGE_NODE_EXECUTE_OPERATION_COUNT = SPECIFIC_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_MergeNode_Execute_ImplicitStepImpl <em>Activitydiagram Merge Node Execute Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_MergeNode_Execute_ImplicitStepImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_MergeNode_Execute_ImplicitStep()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_MERGE_NODE_EXECUTE_IMPLICIT_STEP = 49;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_MERGE_NODE_EXECUTE_IMPLICIT_STEP__MSEOCCURRENCE = ACTIVITYDIAGRAM_MERGE_NODE_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_MERGE_NODE_EXECUTE_IMPLICIT_STEP__ENDING_STATE = ACTIVITYDIAGRAM_MERGE_NODE_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_MERGE_NODE_EXECUTE_IMPLICIT_STEP__STARTING_STATE = ACTIVITYDIAGRAM_MERGE_NODE_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Activitydiagram Merge Node Execute Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_MERGE_NODE_EXECUTE_IMPLICIT_STEP_FEATURE_COUNT = ACTIVITYDIAGRAM_MERGE_NODE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Merge Node Execute Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_MERGE_NODE_EXECUTE_IMPLICIT_STEP_OPERATION_COUNT = ACTIVITYDIAGRAM_MERGE_NODE_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_NamedElement_ExecuteImpl <em>Activitydiagram Named Element Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_NamedElement_ExecuteImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_NamedElement_Execute()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE = 50;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE__SUB_STEPS = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activitydiagram Named Element Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE___GET_CALLER = SPECIFIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Named Element Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_OPERATION_COUNT = SPECIFIC_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_NamedElement_Execute_ImplicitStepImpl <em>Activitydiagram Named Element Execute Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_NamedElement_Execute_ImplicitStepImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_NamedElement_Execute_ImplicitStep()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_IMPLICIT_STEP = 52;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_IMPLICIT_STEP__MSEOCCURRENCE = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_IMPLICIT_STEP__ENDING_STATE = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_IMPLICIT_STEP__STARTING_STATE = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Activitydiagram Named Element Execute Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_IMPLICIT_STEP_FEATURE_COUNT = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Named Element Execute Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_IMPLICIT_STEP_OPERATION_COUNT = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_OpaqueAction_ExecuteImpl <em>Activitydiagram Opaque Action Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_OpaqueAction_ExecuteImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_OpaqueAction_Execute()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_OPAQUE_ACTION_EXECUTE = 53;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_OPAQUE_ACTION_EXECUTE__MSEOCCURRENCE = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_OPAQUE_ACTION_EXECUTE__ENDING_STATE = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_OPAQUE_ACTION_EXECUTE__STARTING_STATE = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_OPAQUE_ACTION_EXECUTE__SUB_STEPS = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activitydiagram Opaque Action Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_OPAQUE_ACTION_EXECUTE_FEATURE_COUNT = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_OPAQUE_ACTION_EXECUTE___GET_CALLER = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Opaque Action Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_OPAQUE_ACTION_EXECUTE_OPERATION_COUNT = ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.Activitydiagram_OpaqueAction_Execute_AbstractSubStep <em>Activitydiagram Opaque Action Execute Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.Activitydiagram_OpaqueAction_Execute_AbstractSubStep
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_OpaqueAction_Execute_AbstractSubStep()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_OPAQUE_ACTION_EXECUTE_ABSTRACT_SUB_STEP = 54;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_OPAQUE_ACTION_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_OPAQUE_ACTION_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_OPAQUE_ACTION_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Activitydiagram Opaque Action Execute Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_OPAQUE_ACTION_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Opaque Action Execute Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_OPAQUE_ACTION_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT = SPECIFIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_OpaqueAction_Execute_ImplicitStepImpl <em>Activitydiagram Opaque Action Execute Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.Activitydiagram_OpaqueAction_Execute_ImplicitStepImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_OpaqueAction_Execute_ImplicitStep()
	 * @generated
	 */
	int ACTIVITYDIAGRAM_OPAQUE_ACTION_EXECUTE_IMPLICIT_STEP = 55;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_OPAQUE_ACTION_EXECUTE_IMPLICIT_STEP__MSEOCCURRENCE = ACTIVITYDIAGRAM_OPAQUE_ACTION_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_OPAQUE_ACTION_EXECUTE_IMPLICIT_STEP__ENDING_STATE = ACTIVITYDIAGRAM_OPAQUE_ACTION_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_OPAQUE_ACTION_EXECUTE_IMPLICIT_STEP__STARTING_STATE = ACTIVITYDIAGRAM_OPAQUE_ACTION_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Activitydiagram Opaque Action Execute Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_OPAQUE_ACTION_EXECUTE_IMPLICIT_STEP_FEATURE_COUNT = ACTIVITYDIAGRAM_OPAQUE_ACTION_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitydiagram Opaque Action Execute Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYDIAGRAM_OPAQUE_ACTION_EXECUTE_IMPLICIT_STEP_OPERATION_COUNT = ACTIVITYDIAGRAM_OPAQUE_ACTION_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.Steps.impl.RootImplicitStepImpl <em>Root Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.Steps.impl.RootImplicitStepImpl
	 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getRootImplicitStep()
	 * @generated
	 */
	int ROOT_IMPLICIT_STEP = 56;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP__MSEOCCURRENCE = MsePackage.SMALL_STEP__MSEOCCURRENCE;

	/**
	 * The number of structural features of the '<em>Root Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP_FEATURE_COUNT = MsePackage.SMALL_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Root Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP_OPERATION_COUNT = MsePackage.SMALL_STEP_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityFinalNode_Execute <em>Activitydiagram Activity Final Node Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Activity Final Node Execute</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityFinalNode_Execute
	 * @generated
	 */
	EClass getActivitydiagram_ActivityFinalNode_Execute();

	/**
	 * Returns the meta object for the '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityFinalNode_Execute#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityFinalNode_Execute#getCaller()
	 * @generated
	 */
	EOperation getActivitydiagram_ActivityFinalNode_Execute__GetCaller();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityFinalNode_Execute_AbstractSubStep <em>Activitydiagram Activity Final Node Execute Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Activity Final Node Execute Abstract Sub Step</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityFinalNode_Execute_AbstractSubStep
	 * @generated
	 */
	EClass getActivitydiagram_ActivityFinalNode_Execute_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityFinalNode_Execute_ImplicitStep <em>Activitydiagram Activity Final Node Execute Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Activity Final Node Execute Implicit Step</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityFinalNode_Execute_ImplicitStep
	 * @generated
	 */
	EClass getActivitydiagram_ActivityFinalNode_Execute_ImplicitStep();

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
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_Activity_WriteTrace <em>Activitydiagram Activity Write Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Activity Write Trace</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_Activity_WriteTrace
	 * @generated
	 */
	EClass getActivitydiagram_Activity_WriteTrace();

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
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_BooleanBinaryExpression_Execute <em>Activitydiagram Boolean Binary Expression Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Boolean Binary Expression Execute</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_BooleanBinaryExpression_Execute
	 * @generated
	 */
	EClass getActivitydiagram_BooleanBinaryExpression_Execute();

	/**
	 * Returns the meta object for the '{@link activitydiagramTrace.Steps.Activitydiagram_BooleanBinaryExpression_Execute#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see activitydiagramTrace.Steps.Activitydiagram_BooleanBinaryExpression_Execute#getCaller()
	 * @generated
	 */
	EOperation getActivitydiagram_BooleanBinaryExpression_Execute__GetCaller();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_BooleanUnaryExpression_Execute <em>Activitydiagram Boolean Unary Expression Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Boolean Unary Expression Execute</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_BooleanUnaryExpression_Execute
	 * @generated
	 */
	EClass getActivitydiagram_BooleanUnaryExpression_Execute();

	/**
	 * Returns the meta object for the '{@link activitydiagramTrace.Steps.Activitydiagram_BooleanUnaryExpression_Execute#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see activitydiagramTrace.Steps.Activitydiagram_BooleanUnaryExpression_Execute#getCaller()
	 * @generated
	 */
	EOperation getActivitydiagram_BooleanUnaryExpression_Execute__GetCaller();

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
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_BooleanVariable_Execute_AbstractSubStep <em>Activitydiagram Boolean Variable Execute Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Boolean Variable Execute Abstract Sub Step</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_BooleanVariable_Execute_AbstractSubStep
	 * @generated
	 */
	EClass getActivitydiagram_BooleanVariable_Execute_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_BooleanVariable_Execute_ImplicitStep <em>Activitydiagram Boolean Variable Execute Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Boolean Variable Execute Implicit Step</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_BooleanVariable_Execute_ImplicitStep
	 * @generated
	 */
	EClass getActivitydiagram_BooleanVariable_Execute_ImplicitStep();

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
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_DecisionNode_Execute <em>Activitydiagram Decision Node Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Decision Node Execute</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_DecisionNode_Execute
	 * @generated
	 */
	EClass getActivitydiagram_DecisionNode_Execute();

	/**
	 * Returns the meta object for the '{@link activitydiagramTrace.Steps.Activitydiagram_DecisionNode_Execute#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see activitydiagramTrace.Steps.Activitydiagram_DecisionNode_Execute#getCaller()
	 * @generated
	 */
	EOperation getActivitydiagram_DecisionNode_Execute__GetCaller();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_DecisionNode_Execute_AbstractSubStep <em>Activitydiagram Decision Node Execute Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Decision Node Execute Abstract Sub Step</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_DecisionNode_Execute_AbstractSubStep
	 * @generated
	 */
	EClass getActivitydiagram_DecisionNode_Execute_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_DecisionNode_Execute_ImplicitStep <em>Activitydiagram Decision Node Execute Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Decision Node Execute Implicit Step</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_DecisionNode_Execute_ImplicitStep
	 * @generated
	 */
	EClass getActivitydiagram_DecisionNode_Execute_ImplicitStep();

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
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_Expression_Execute <em>Activitydiagram Expression Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Expression Execute</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_Expression_Execute
	 * @generated
	 */
	EClass getActivitydiagram_Expression_Execute();

	/**
	 * Returns the meta object for the '{@link activitydiagramTrace.Steps.Activitydiagram_Expression_Execute#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see activitydiagramTrace.Steps.Activitydiagram_Expression_Execute#getCaller()
	 * @generated
	 */
	EOperation getActivitydiagram_Expression_Execute__GetCaller();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_ForkNode_Execute <em>Activitydiagram Fork Node Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Fork Node Execute</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ForkNode_Execute
	 * @generated
	 */
	EClass getActivitydiagram_ForkNode_Execute();

	/**
	 * Returns the meta object for the '{@link activitydiagramTrace.Steps.Activitydiagram_ForkNode_Execute#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ForkNode_Execute#getCaller()
	 * @generated
	 */
	EOperation getActivitydiagram_ForkNode_Execute__GetCaller();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_ForkNode_Execute_AbstractSubStep <em>Activitydiagram Fork Node Execute Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Fork Node Execute Abstract Sub Step</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ForkNode_Execute_AbstractSubStep
	 * @generated
	 */
	EClass getActivitydiagram_ForkNode_Execute_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_ForkNode_Execute_ImplicitStep <em>Activitydiagram Fork Node Execute Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Fork Node Execute Implicit Step</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ForkNode_Execute_ImplicitStep
	 * @generated
	 */
	EClass getActivitydiagram_ForkNode_Execute_ImplicitStep();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_InitialNode_Execute <em>Activitydiagram Initial Node Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Initial Node Execute</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_InitialNode_Execute
	 * @generated
	 */
	EClass getActivitydiagram_InitialNode_Execute();

	/**
	 * Returns the meta object for the '{@link activitydiagramTrace.Steps.Activitydiagram_InitialNode_Execute#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see activitydiagramTrace.Steps.Activitydiagram_InitialNode_Execute#getCaller()
	 * @generated
	 */
	EOperation getActivitydiagram_InitialNode_Execute__GetCaller();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_InitialNode_Execute_AbstractSubStep <em>Activitydiagram Initial Node Execute Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Initial Node Execute Abstract Sub Step</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_InitialNode_Execute_AbstractSubStep
	 * @generated
	 */
	EClass getActivitydiagram_InitialNode_Execute_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_InitialNode_Execute_ImplicitStep <em>Activitydiagram Initial Node Execute Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Initial Node Execute Implicit Step</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_InitialNode_Execute_ImplicitStep
	 * @generated
	 */
	EClass getActivitydiagram_InitialNode_Execute_ImplicitStep();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_IntegerCalculationExpression_Execute <em>Activitydiagram Integer Calculation Expression Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Integer Calculation Expression Execute</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_IntegerCalculationExpression_Execute
	 * @generated
	 */
	EClass getActivitydiagram_IntegerCalculationExpression_Execute();

	/**
	 * Returns the meta object for the '{@link activitydiagramTrace.Steps.Activitydiagram_IntegerCalculationExpression_Execute#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see activitydiagramTrace.Steps.Activitydiagram_IntegerCalculationExpression_Execute#getCaller()
	 * @generated
	 */
	EOperation getActivitydiagram_IntegerCalculationExpression_Execute__GetCaller();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_IntegerComparisonExpression_Execute <em>Activitydiagram Integer Comparison Expression Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Integer Comparison Expression Execute</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_IntegerComparisonExpression_Execute
	 * @generated
	 */
	EClass getActivitydiagram_IntegerComparisonExpression_Execute();

	/**
	 * Returns the meta object for the '{@link activitydiagramTrace.Steps.Activitydiagram_IntegerComparisonExpression_Execute#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see activitydiagramTrace.Steps.Activitydiagram_IntegerComparisonExpression_Execute#getCaller()
	 * @generated
	 */
	EOperation getActivitydiagram_IntegerComparisonExpression_Execute__GetCaller();

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
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_JoinNode_Execute <em>Activitydiagram Join Node Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Join Node Execute</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_JoinNode_Execute
	 * @generated
	 */
	EClass getActivitydiagram_JoinNode_Execute();

	/**
	 * Returns the meta object for the '{@link activitydiagramTrace.Steps.Activitydiagram_JoinNode_Execute#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see activitydiagramTrace.Steps.Activitydiagram_JoinNode_Execute#getCaller()
	 * @generated
	 */
	EOperation getActivitydiagram_JoinNode_Execute__GetCaller();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_JoinNode_Execute_AbstractSubStep <em>Activitydiagram Join Node Execute Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Join Node Execute Abstract Sub Step</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_JoinNode_Execute_AbstractSubStep
	 * @generated
	 */
	EClass getActivitydiagram_JoinNode_Execute_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_JoinNode_Execute_ImplicitStep <em>Activitydiagram Join Node Execute Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Join Node Execute Implicit Step</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_JoinNode_Execute_ImplicitStep
	 * @generated
	 */
	EClass getActivitydiagram_JoinNode_Execute_ImplicitStep();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_MergeNode_Execute <em>Activitydiagram Merge Node Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Merge Node Execute</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_MergeNode_Execute
	 * @generated
	 */
	EClass getActivitydiagram_MergeNode_Execute();

	/**
	 * Returns the meta object for the '{@link activitydiagramTrace.Steps.Activitydiagram_MergeNode_Execute#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see activitydiagramTrace.Steps.Activitydiagram_MergeNode_Execute#getCaller()
	 * @generated
	 */
	EOperation getActivitydiagram_MergeNode_Execute__GetCaller();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_MergeNode_Execute_AbstractSubStep <em>Activitydiagram Merge Node Execute Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Merge Node Execute Abstract Sub Step</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_MergeNode_Execute_AbstractSubStep
	 * @generated
	 */
	EClass getActivitydiagram_MergeNode_Execute_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_MergeNode_Execute_ImplicitStep <em>Activitydiagram Merge Node Execute Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Merge Node Execute Implicit Step</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_MergeNode_Execute_ImplicitStep
	 * @generated
	 */
	EClass getActivitydiagram_MergeNode_Execute_ImplicitStep();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_NamedElement_Execute <em>Activitydiagram Named Element Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Named Element Execute</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_NamedElement_Execute
	 * @generated
	 */
	EClass getActivitydiagram_NamedElement_Execute();

	/**
	 * Returns the meta object for the '{@link activitydiagramTrace.Steps.Activitydiagram_NamedElement_Execute#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see activitydiagramTrace.Steps.Activitydiagram_NamedElement_Execute#getCaller()
	 * @generated
	 */
	EOperation getActivitydiagram_NamedElement_Execute__GetCaller();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_NamedElement_Execute_AbstractSubStep <em>Activitydiagram Named Element Execute Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Named Element Execute Abstract Sub Step</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_NamedElement_Execute_AbstractSubStep
	 * @generated
	 */
	EClass getActivitydiagram_NamedElement_Execute_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_NamedElement_Execute_ImplicitStep <em>Activitydiagram Named Element Execute Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Named Element Execute Implicit Step</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_NamedElement_Execute_ImplicitStep
	 * @generated
	 */
	EClass getActivitydiagram_NamedElement_Execute_ImplicitStep();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_OpaqueAction_Execute <em>Activitydiagram Opaque Action Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Opaque Action Execute</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_OpaqueAction_Execute
	 * @generated
	 */
	EClass getActivitydiagram_OpaqueAction_Execute();

	/**
	 * Returns the meta object for the '{@link activitydiagramTrace.Steps.Activitydiagram_OpaqueAction_Execute#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see activitydiagramTrace.Steps.Activitydiagram_OpaqueAction_Execute#getCaller()
	 * @generated
	 */
	EOperation getActivitydiagram_OpaqueAction_Execute__GetCaller();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_OpaqueAction_Execute_AbstractSubStep <em>Activitydiagram Opaque Action Execute Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Opaque Action Execute Abstract Sub Step</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_OpaqueAction_Execute_AbstractSubStep
	 * @generated
	 */
	EClass getActivitydiagram_OpaqueAction_Execute_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Steps.Activitydiagram_OpaqueAction_Execute_ImplicitStep <em>Activitydiagram Opaque Action Execute Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitydiagram Opaque Action Execute Implicit Step</em>'.
	 * @see activitydiagramTrace.Steps.Activitydiagram_OpaqueAction_Execute_ImplicitStep
	 * @generated
	 */
	EClass getActivitydiagram_OpaqueAction_Execute_ImplicitStep();

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
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityFinalNode_ExecuteImpl <em>Activitydiagram Activity Final Node Execute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityFinalNode_ExecuteImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityFinalNode_Execute()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_ACTIVITY_FINAL_NODE_EXECUTE = eINSTANCE.getActivitydiagram_ActivityFinalNode_Execute();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITYDIAGRAM_ACTIVITY_FINAL_NODE_EXECUTE___GET_CALLER = eINSTANCE.getActivitydiagram_ActivityFinalNode_Execute__GetCaller();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityFinalNode_Execute_AbstractSubStep <em>Activitydiagram Activity Final Node Execute Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityFinalNode_Execute_AbstractSubStep
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityFinalNode_Execute_AbstractSubStep()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_ACTIVITY_FINAL_NODE_EXECUTE_ABSTRACT_SUB_STEP = eINSTANCE.getActivitydiagram_ActivityFinalNode_Execute_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityFinalNode_Execute_ImplicitStepImpl <em>Activitydiagram Activity Final Node Execute Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ActivityFinalNode_Execute_ImplicitStepImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ActivityFinalNode_Execute_ImplicitStep()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_ACTIVITY_FINAL_NODE_EXECUTE_IMPLICIT_STEP = eINSTANCE.getActivitydiagram_ActivityFinalNode_Execute_ImplicitStep();

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
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_Activity_WriteTraceImpl <em>Activitydiagram Activity Write Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_Activity_WriteTraceImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_Activity_WriteTrace()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE = eINSTANCE.getActivitydiagram_Activity_WriteTrace();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE___GET_CALLER = eINSTANCE.getActivitydiagram_Activity_WriteTrace__GetCaller();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.Activitydiagram_Activity_WriteTrace_AbstractSubStep <em>Activitydiagram Activity Write Trace Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.Activitydiagram_Activity_WriteTrace_AbstractSubStep
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
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_BooleanBinaryExpression_ExecuteImpl <em>Activitydiagram Boolean Binary Expression Execute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_BooleanBinaryExpression_ExecuteImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_BooleanBinaryExpression_Execute()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_BOOLEAN_BINARY_EXPRESSION_EXECUTE = eINSTANCE.getActivitydiagram_BooleanBinaryExpression_Execute();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITYDIAGRAM_BOOLEAN_BINARY_EXPRESSION_EXECUTE___GET_CALLER = eINSTANCE.getActivitydiagram_BooleanBinaryExpression_Execute__GetCaller();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_BooleanUnaryExpression_ExecuteImpl <em>Activitydiagram Boolean Unary Expression Execute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_BooleanUnaryExpression_ExecuteImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_BooleanUnaryExpression_Execute()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_BOOLEAN_UNARY_EXPRESSION_EXECUTE = eINSTANCE.getActivitydiagram_BooleanUnaryExpression_Execute();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITYDIAGRAM_BOOLEAN_UNARY_EXPRESSION_EXECUTE___GET_CALLER = eINSTANCE.getActivitydiagram_BooleanUnaryExpression_Execute__GetCaller();

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
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.Activitydiagram_BooleanVariable_Execute_AbstractSubStep <em>Activitydiagram Boolean Variable Execute Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.Activitydiagram_BooleanVariable_Execute_AbstractSubStep
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_BooleanVariable_Execute_AbstractSubStep()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_EXECUTE_ABSTRACT_SUB_STEP = eINSTANCE.getActivitydiagram_BooleanVariable_Execute_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_BooleanVariable_Execute_ImplicitStepImpl <em>Activitydiagram Boolean Variable Execute Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_BooleanVariable_Execute_ImplicitStepImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_BooleanVariable_Execute_ImplicitStep()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_EXECUTE_IMPLICIT_STEP = eINSTANCE.getActivitydiagram_BooleanVariable_Execute_ImplicitStep();

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
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_DecisionNode_ExecuteImpl <em>Activitydiagram Decision Node Execute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_DecisionNode_ExecuteImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_DecisionNode_Execute()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_DECISION_NODE_EXECUTE = eINSTANCE.getActivitydiagram_DecisionNode_Execute();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITYDIAGRAM_DECISION_NODE_EXECUTE___GET_CALLER = eINSTANCE.getActivitydiagram_DecisionNode_Execute__GetCaller();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.Activitydiagram_DecisionNode_Execute_AbstractSubStep <em>Activitydiagram Decision Node Execute Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.Activitydiagram_DecisionNode_Execute_AbstractSubStep
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_DecisionNode_Execute_AbstractSubStep()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_DECISION_NODE_EXECUTE_ABSTRACT_SUB_STEP = eINSTANCE.getActivitydiagram_DecisionNode_Execute_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_DecisionNode_Execute_ImplicitStepImpl <em>Activitydiagram Decision Node Execute Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_DecisionNode_Execute_ImplicitStepImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_DecisionNode_Execute_ImplicitStep()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_DECISION_NODE_EXECUTE_IMPLICIT_STEP = eINSTANCE.getActivitydiagram_DecisionNode_Execute_ImplicitStep();

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
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_Expression_ExecuteImpl <em>Activitydiagram Expression Execute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_Expression_ExecuteImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_Expression_Execute()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_EXPRESSION_EXECUTE = eINSTANCE.getActivitydiagram_Expression_Execute();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITYDIAGRAM_EXPRESSION_EXECUTE___GET_CALLER = eINSTANCE.getActivitydiagram_Expression_Execute__GetCaller();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ForkNode_ExecuteImpl <em>Activitydiagram Fork Node Execute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ForkNode_ExecuteImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ForkNode_Execute()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_FORK_NODE_EXECUTE = eINSTANCE.getActivitydiagram_ForkNode_Execute();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITYDIAGRAM_FORK_NODE_EXECUTE___GET_CALLER = eINSTANCE.getActivitydiagram_ForkNode_Execute__GetCaller();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.Activitydiagram_ForkNode_Execute_AbstractSubStep <em>Activitydiagram Fork Node Execute Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.Activitydiagram_ForkNode_Execute_AbstractSubStep
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ForkNode_Execute_AbstractSubStep()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_FORK_NODE_EXECUTE_ABSTRACT_SUB_STEP = eINSTANCE.getActivitydiagram_ForkNode_Execute_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_ForkNode_Execute_ImplicitStepImpl <em>Activitydiagram Fork Node Execute Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_ForkNode_Execute_ImplicitStepImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_ForkNode_Execute_ImplicitStep()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_FORK_NODE_EXECUTE_IMPLICIT_STEP = eINSTANCE.getActivitydiagram_ForkNode_Execute_ImplicitStep();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_InitialNode_ExecuteImpl <em>Activitydiagram Initial Node Execute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_InitialNode_ExecuteImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_InitialNode_Execute()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_INITIAL_NODE_EXECUTE = eINSTANCE.getActivitydiagram_InitialNode_Execute();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITYDIAGRAM_INITIAL_NODE_EXECUTE___GET_CALLER = eINSTANCE.getActivitydiagram_InitialNode_Execute__GetCaller();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.Activitydiagram_InitialNode_Execute_AbstractSubStep <em>Activitydiagram Initial Node Execute Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.Activitydiagram_InitialNode_Execute_AbstractSubStep
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_InitialNode_Execute_AbstractSubStep()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_INITIAL_NODE_EXECUTE_ABSTRACT_SUB_STEP = eINSTANCE.getActivitydiagram_InitialNode_Execute_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_InitialNode_Execute_ImplicitStepImpl <em>Activitydiagram Initial Node Execute Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_InitialNode_Execute_ImplicitStepImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_InitialNode_Execute_ImplicitStep()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_INITIAL_NODE_EXECUTE_IMPLICIT_STEP = eINSTANCE.getActivitydiagram_InitialNode_Execute_ImplicitStep();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_IntegerCalculationExpression_ExecuteImpl <em>Activitydiagram Integer Calculation Expression Execute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_IntegerCalculationExpression_ExecuteImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_IntegerCalculationExpression_Execute()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_INTEGER_CALCULATION_EXPRESSION_EXECUTE = eINSTANCE.getActivitydiagram_IntegerCalculationExpression_Execute();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITYDIAGRAM_INTEGER_CALCULATION_EXPRESSION_EXECUTE___GET_CALLER = eINSTANCE.getActivitydiagram_IntegerCalculationExpression_Execute__GetCaller();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_IntegerComparisonExpression_ExecuteImpl <em>Activitydiagram Integer Comparison Expression Execute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_IntegerComparisonExpression_ExecuteImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_IntegerComparisonExpression_Execute()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_INTEGER_COMPARISON_EXPRESSION_EXECUTE = eINSTANCE.getActivitydiagram_IntegerComparisonExpression_Execute();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITYDIAGRAM_INTEGER_COMPARISON_EXPRESSION_EXECUTE___GET_CALLER = eINSTANCE.getActivitydiagram_IntegerComparisonExpression_Execute__GetCaller();

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
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_JoinNode_ExecuteImpl <em>Activitydiagram Join Node Execute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_JoinNode_ExecuteImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_JoinNode_Execute()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_JOIN_NODE_EXECUTE = eINSTANCE.getActivitydiagram_JoinNode_Execute();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITYDIAGRAM_JOIN_NODE_EXECUTE___GET_CALLER = eINSTANCE.getActivitydiagram_JoinNode_Execute__GetCaller();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.Activitydiagram_JoinNode_Execute_AbstractSubStep <em>Activitydiagram Join Node Execute Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.Activitydiagram_JoinNode_Execute_AbstractSubStep
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_JoinNode_Execute_AbstractSubStep()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_JOIN_NODE_EXECUTE_ABSTRACT_SUB_STEP = eINSTANCE.getActivitydiagram_JoinNode_Execute_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_JoinNode_Execute_ImplicitStepImpl <em>Activitydiagram Join Node Execute Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_JoinNode_Execute_ImplicitStepImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_JoinNode_Execute_ImplicitStep()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_JOIN_NODE_EXECUTE_IMPLICIT_STEP = eINSTANCE.getActivitydiagram_JoinNode_Execute_ImplicitStep();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_MergeNode_ExecuteImpl <em>Activitydiagram Merge Node Execute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_MergeNode_ExecuteImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_MergeNode_Execute()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_MERGE_NODE_EXECUTE = eINSTANCE.getActivitydiagram_MergeNode_Execute();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITYDIAGRAM_MERGE_NODE_EXECUTE___GET_CALLER = eINSTANCE.getActivitydiagram_MergeNode_Execute__GetCaller();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.Activitydiagram_MergeNode_Execute_AbstractSubStep <em>Activitydiagram Merge Node Execute Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.Activitydiagram_MergeNode_Execute_AbstractSubStep
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_MergeNode_Execute_AbstractSubStep()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_MERGE_NODE_EXECUTE_ABSTRACT_SUB_STEP = eINSTANCE.getActivitydiagram_MergeNode_Execute_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_MergeNode_Execute_ImplicitStepImpl <em>Activitydiagram Merge Node Execute Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_MergeNode_Execute_ImplicitStepImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_MergeNode_Execute_ImplicitStep()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_MERGE_NODE_EXECUTE_IMPLICIT_STEP = eINSTANCE.getActivitydiagram_MergeNode_Execute_ImplicitStep();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_NamedElement_ExecuteImpl <em>Activitydiagram Named Element Execute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_NamedElement_ExecuteImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_NamedElement_Execute()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE = eINSTANCE.getActivitydiagram_NamedElement_Execute();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE___GET_CALLER = eINSTANCE.getActivitydiagram_NamedElement_Execute__GetCaller();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.Activitydiagram_NamedElement_Execute_AbstractSubStep <em>Activitydiagram Named Element Execute Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.Activitydiagram_NamedElement_Execute_AbstractSubStep
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_NamedElement_Execute_AbstractSubStep()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP = eINSTANCE.getActivitydiagram_NamedElement_Execute_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_NamedElement_Execute_ImplicitStepImpl <em>Activitydiagram Named Element Execute Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_NamedElement_Execute_ImplicitStepImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_NamedElement_Execute_ImplicitStep()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_IMPLICIT_STEP = eINSTANCE.getActivitydiagram_NamedElement_Execute_ImplicitStep();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_OpaqueAction_ExecuteImpl <em>Activitydiagram Opaque Action Execute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_OpaqueAction_ExecuteImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_OpaqueAction_Execute()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_OPAQUE_ACTION_EXECUTE = eINSTANCE.getActivitydiagram_OpaqueAction_Execute();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITYDIAGRAM_OPAQUE_ACTION_EXECUTE___GET_CALLER = eINSTANCE.getActivitydiagram_OpaqueAction_Execute__GetCaller();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.Activitydiagram_OpaqueAction_Execute_AbstractSubStep <em>Activitydiagram Opaque Action Execute Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.Activitydiagram_OpaqueAction_Execute_AbstractSubStep
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_OpaqueAction_Execute_AbstractSubStep()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_OPAQUE_ACTION_EXECUTE_ABSTRACT_SUB_STEP = eINSTANCE.getActivitydiagram_OpaqueAction_Execute_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.Steps.impl.Activitydiagram_OpaqueAction_Execute_ImplicitStepImpl <em>Activitydiagram Opaque Action Execute Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.Steps.impl.Activitydiagram_OpaqueAction_Execute_ImplicitStepImpl
		 * @see activitydiagramTrace.Steps.impl.StepsPackageImpl#getActivitydiagram_OpaqueAction_Execute_ImplicitStep()
		 * @generated
		 */
		EClass ACTIVITYDIAGRAM_OPAQUE_ACTION_EXECUTE_IMPLICIT_STEP = eINSTANCE.getActivitydiagram_OpaqueAction_Execute_ImplicitStep();

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
