/**
 */
package activitydiagramTrace.Steps.impl;

import activitydiagram.ActivitydiagramPackage;

import activitydiagramTrace.ActivitydiagramTracePackage;

import activitydiagramTrace.States.StatesPackage;

import activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl;

import activitydiagramTrace.States.impl.StatesPackageImpl;

import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1;
import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1_AbstractSubStep;
import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1_FillStep;
import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute;
import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_RemoveToken1;
import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_SendOffers1;
import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1;
import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStep;
import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1_FillStep;
import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Terminate;
import activitydiagramTrace.Steps.Activitydiagram_Activity_Execute;
import activitydiagramTrace.Steps.Activitydiagram_Activity_Execute_AbstractSubStep;
import activitydiagramTrace.Steps.Activitydiagram_Activity_Execute_FillStep;
import activitydiagramTrace.Steps.Activitydiagram_Activity_InitializeContext;
import activitydiagramTrace.Steps.Activitydiagram_Activity_Reset;
import activitydiagramTrace.Steps.Activitydiagram_Activity_WriteTrace;
import activitydiagramTrace.Steps.Activitydiagram_Activity_WriteTrace_AbstractSubStep;
import activitydiagramTrace.Steps.Activitydiagram_Activity_WriteTrace_FillStep;
import activitydiagramTrace.Steps.Activitydiagram_Variable_Execute;
import activitydiagramTrace.Steps.Activitydiagram_Variable_Init;
import activitydiagramTrace.Steps.BigStep;
import activitydiagramTrace.Steps.RootFillStep;
import activitydiagramTrace.Steps.SmallStep;
import activitydiagramTrace.Steps.Step;
import activitydiagramTrace.Steps.StepsFactory;
import activitydiagramTrace.Steps.StepsPackage;

import activitydiagramTrace.impl.ActivitydiagramTracePackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StepsPackageImpl extends EPackageImpl implements StepsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smallStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bigStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootFillStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitydiagram_Activity_InitializeContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitydiagram_Activity_ExecuteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitydiagram_Activity_Execute_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitydiagram_Activity_Execute_FillStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitydiagram_Variable_InitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitydiagram_ActivityNode_ExecuteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitydiagram_ActivityNode_TakeOfferdTokens1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitydiagram_ActivityNode_SendOffers1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitydiagram_ActivityNode_AddTokens1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitydiagram_ActivityNode_TakeOfferdTokens1_FillStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitydiagram_ActivityNode_RemoveToken1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitydiagram_ActivityNode_TerminateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitydiagram_Activity_ResetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitydiagram_Activity_WriteTraceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitydiagram_Activity_WriteTrace_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitydiagram_Activity_WriteTrace_FillStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitydiagram_Variable_ExecuteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitydiagram_ActivityNode_AddTokens1_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitydiagram_ActivityNode_AddTokens1_FillStepEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see activitydiagramTrace.Steps.StepsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StepsPackageImpl() {
		super(eNS_URI, StepsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link StepsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StepsPackage init() {
		if (isInited) return (StepsPackage)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI);

		// Obtain or create and register package
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StepsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ActivitydiagramPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ActivitydiagramTracePackageImpl theActivitydiagramTracePackage = (ActivitydiagramTracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramTracePackage.eNS_URI) instanceof ActivitydiagramTracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramTracePackage.eNS_URI) : ActivitydiagramTracePackage.eINSTANCE);
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) : StatesPackage.eINSTANCE);
		ActivitydiagramPackageImpl theActivitydiagramPackage_1 = (ActivitydiagramPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage.eNS_URI) instanceof ActivitydiagramPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage.eNS_URI) : activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage.eINSTANCE);

		// Create package meta-data objects
		theStepsPackage.createPackageContents();
		theActivitydiagramTracePackage.createPackageContents();
		theStatesPackage.createPackageContents();
		theActivitydiagramPackage_1.createPackageContents();

		// Initialize created meta-data
		theStepsPackage.initializePackageContents();
		theActivitydiagramTracePackage.initializePackageContents();
		theStatesPackage.initializePackageContents();
		theActivitydiagramPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStepsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StepsPackage.eNS_URI, theStepsPackage);
		return theStepsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSmallStep() {
		return smallStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBigStep() {
		return bigStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStep() {
		return stepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStep_StartingState() {
		return (EReference)stepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStep_EndingState() {
		return (EReference)stepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRootFillStep() {
		return rootFillStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivitydiagram_Activity_InitializeContext() {
		return activitydiagram_Activity_InitializeContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivitydiagram_Activity_InitializeContext_This() {
		return (EReference)activitydiagram_Activity_InitializeContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivitydiagram_Activity_Execute() {
		return activitydiagram_Activity_ExecuteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivitydiagram_Activity_Execute_This() {
		return (EReference)activitydiagram_Activity_ExecuteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivitydiagram_Activity_Execute_SubSteps() {
		return (EReference)activitydiagram_Activity_ExecuteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivitydiagram_Activity_Execute_AbstractSubStep() {
		return activitydiagram_Activity_Execute_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivitydiagram_Activity_Execute_FillStep() {
		return activitydiagram_Activity_Execute_FillStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivitydiagram_Variable_Init() {
		return activitydiagram_Variable_InitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivitydiagram_Variable_Init_This() {
		return (EReference)activitydiagram_Variable_InitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivitydiagram_ActivityNode_Execute() {
		return activitydiagram_ActivityNode_ExecuteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivitydiagram_ActivityNode_Execute_This() {
		return (EReference)activitydiagram_ActivityNode_ExecuteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivitydiagram_ActivityNode_TakeOfferdTokens1() {
		return activitydiagram_ActivityNode_TakeOfferdTokens1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivitydiagram_ActivityNode_TakeOfferdTokens1_This() {
		return (EReference)activitydiagram_ActivityNode_TakeOfferdTokens1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivitydiagram_ActivityNode_TakeOfferdTokens1_SubSteps() {
		return (EReference)activitydiagram_ActivityNode_TakeOfferdTokens1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivitydiagram_ActivityNode_SendOffers1() {
		return activitydiagram_ActivityNode_SendOffers1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivitydiagram_ActivityNode_SendOffers1_This() {
		return (EReference)activitydiagram_ActivityNode_SendOffers1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivitydiagram_ActivityNode_AddTokens1() {
		return activitydiagram_ActivityNode_AddTokens1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivitydiagram_ActivityNode_AddTokens1_This() {
		return (EReference)activitydiagram_ActivityNode_AddTokens1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivitydiagram_ActivityNode_AddTokens1_SubSteps() {
		return (EReference)activitydiagram_ActivityNode_AddTokens1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStep() {
		return activitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivitydiagram_ActivityNode_TakeOfferdTokens1_FillStep() {
		return activitydiagram_ActivityNode_TakeOfferdTokens1_FillStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivitydiagram_ActivityNode_RemoveToken1() {
		return activitydiagram_ActivityNode_RemoveToken1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivitydiagram_ActivityNode_RemoveToken1_This() {
		return (EReference)activitydiagram_ActivityNode_RemoveToken1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivitydiagram_ActivityNode_Terminate() {
		return activitydiagram_ActivityNode_TerminateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivitydiagram_ActivityNode_Terminate_This() {
		return (EReference)activitydiagram_ActivityNode_TerminateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivitydiagram_Activity_Reset() {
		return activitydiagram_Activity_ResetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivitydiagram_Activity_Reset_This() {
		return (EReference)activitydiagram_Activity_ResetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivitydiagram_Activity_WriteTrace() {
		return activitydiagram_Activity_WriteTraceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivitydiagram_Activity_WriteTrace_This() {
		return (EReference)activitydiagram_Activity_WriteTraceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivitydiagram_Activity_WriteTrace_SubSteps() {
		return (EReference)activitydiagram_Activity_WriteTraceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivitydiagram_Activity_WriteTrace_AbstractSubStep() {
		return activitydiagram_Activity_WriteTrace_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivitydiagram_Activity_WriteTrace_FillStep() {
		return activitydiagram_Activity_WriteTrace_FillStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivitydiagram_Variable_Execute() {
		return activitydiagram_Variable_ExecuteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivitydiagram_Variable_Execute_This() {
		return (EReference)activitydiagram_Variable_ExecuteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivitydiagram_ActivityNode_AddTokens1_AbstractSubStep() {
		return activitydiagram_ActivityNode_AddTokens1_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivitydiagram_ActivityNode_AddTokens1_FillStep() {
		return activitydiagram_ActivityNode_AddTokens1_FillStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepsFactory getStepsFactory() {
		return (StepsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		smallStepEClass = createEClass(SMALL_STEP);

		bigStepEClass = createEClass(BIG_STEP);

		stepEClass = createEClass(STEP);
		createEReference(stepEClass, STEP__STARTING_STATE);
		createEReference(stepEClass, STEP__ENDING_STATE);

		rootFillStepEClass = createEClass(ROOT_FILL_STEP);

		activitydiagram_Activity_InitializeContextEClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_INITIALIZE_CONTEXT);
		createEReference(activitydiagram_Activity_InitializeContextEClass, ACTIVITYDIAGRAM_ACTIVITY_INITIALIZE_CONTEXT__THIS);

		activitydiagram_Activity_ExecuteEClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_EXECUTE);
		createEReference(activitydiagram_Activity_ExecuteEClass, ACTIVITYDIAGRAM_ACTIVITY_EXECUTE__THIS);
		createEReference(activitydiagram_Activity_ExecuteEClass, ACTIVITYDIAGRAM_ACTIVITY_EXECUTE__SUB_STEPS);

		activitydiagram_Activity_Execute_AbstractSubStepEClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP);

		activitydiagram_Activity_Execute_FillStepEClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_FILL_STEP);

		activitydiagram_Variable_InitEClass = createEClass(ACTIVITYDIAGRAM_VARIABLE_INIT);
		createEReference(activitydiagram_Variable_InitEClass, ACTIVITYDIAGRAM_VARIABLE_INIT__THIS);

		activitydiagram_ActivityNode_ExecuteEClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE);
		createEReference(activitydiagram_ActivityNode_ExecuteEClass, ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE__THIS);

		activitydiagram_ActivityNode_TakeOfferdTokens1EClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1);
		createEReference(activitydiagram_ActivityNode_TakeOfferdTokens1EClass, ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1__THIS);
		createEReference(activitydiagram_ActivityNode_TakeOfferdTokens1EClass, ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1__SUB_STEPS);

		activitydiagram_ActivityNode_SendOffers1EClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1);
		createEReference(activitydiagram_ActivityNode_SendOffers1EClass, ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1__THIS);

		activitydiagram_ActivityNode_AddTokens1EClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1);
		createEReference(activitydiagram_ActivityNode_AddTokens1EClass, ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1__THIS);
		createEReference(activitydiagram_ActivityNode_AddTokens1EClass, ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1__SUB_STEPS);

		activitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStepEClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_ABSTRACT_SUB_STEP);

		activitydiagram_ActivityNode_TakeOfferdTokens1_FillStepEClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_FILL_STEP);

		activitydiagram_ActivityNode_RemoveToken1EClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN1);
		createEReference(activitydiagram_ActivityNode_RemoveToken1EClass, ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN1__THIS);

		activitydiagram_ActivityNode_TerminateEClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE);
		createEReference(activitydiagram_ActivityNode_TerminateEClass, ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE__THIS);

		activitydiagram_Activity_ResetEClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_RESET);
		createEReference(activitydiagram_Activity_ResetEClass, ACTIVITYDIAGRAM_ACTIVITY_RESET__THIS);

		activitydiagram_Activity_WriteTraceEClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE);
		createEReference(activitydiagram_Activity_WriteTraceEClass, ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE__THIS);
		createEReference(activitydiagram_Activity_WriteTraceEClass, ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE__SUB_STEPS);

		activitydiagram_Activity_WriteTrace_AbstractSubStepEClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_ABSTRACT_SUB_STEP);

		activitydiagram_Activity_WriteTrace_FillStepEClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_FILL_STEP);

		activitydiagram_Variable_ExecuteEClass = createEClass(ACTIVITYDIAGRAM_VARIABLE_EXECUTE);
		createEReference(activitydiagram_Variable_ExecuteEClass, ACTIVITYDIAGRAM_VARIABLE_EXECUTE__THIS);

		activitydiagram_ActivityNode_AddTokens1_AbstractSubStepEClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_ABSTRACT_SUB_STEP);

		activitydiagram_ActivityNode_AddTokens1_FillStepEClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_FILL_STEP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		StatesPackage theStatesPackage = (StatesPackage)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI);
		ActivitydiagramPackage theActivitydiagramPackage = (ActivitydiagramPackage)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		smallStepEClass.getESuperTypes().add(this.getStep());
		bigStepEClass.getESuperTypes().add(this.getStep());
		rootFillStepEClass.getESuperTypes().add(this.getSmallStep());
		activitydiagram_Activity_InitializeContextEClass.getESuperTypes().add(this.getSmallStep());
		activitydiagram_Activity_ExecuteEClass.getESuperTypes().add(this.getBigStep());
		activitydiagram_Activity_Execute_FillStepEClass.getESuperTypes().add(this.getActivitydiagram_Activity_Execute_AbstractSubStep());
		activitydiagram_Variable_InitEClass.getESuperTypes().add(this.getActivitydiagram_Activity_Execute_AbstractSubStep());
		activitydiagram_Variable_InitEClass.getESuperTypes().add(this.getSmallStep());
		activitydiagram_ActivityNode_ExecuteEClass.getESuperTypes().add(this.getActivitydiagram_Activity_Execute_AbstractSubStep());
		activitydiagram_ActivityNode_ExecuteEClass.getESuperTypes().add(this.getSmallStep());
		activitydiagram_ActivityNode_TakeOfferdTokens1EClass.getESuperTypes().add(this.getActivitydiagram_Activity_Execute_AbstractSubStep());
		activitydiagram_ActivityNode_TakeOfferdTokens1EClass.getESuperTypes().add(this.getBigStep());
		activitydiagram_ActivityNode_SendOffers1EClass.getESuperTypes().add(this.getActivitydiagram_Activity_Execute_AbstractSubStep());
		activitydiagram_ActivityNode_SendOffers1EClass.getESuperTypes().add(this.getSmallStep());
		activitydiagram_ActivityNode_AddTokens1EClass.getESuperTypes().add(this.getActivitydiagram_Activity_Execute_AbstractSubStep());
		activitydiagram_ActivityNode_AddTokens1EClass.getESuperTypes().add(this.getBigStep());
		activitydiagram_ActivityNode_TakeOfferdTokens1_FillStepEClass.getESuperTypes().add(this.getActivitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStep());
		activitydiagram_ActivityNode_RemoveToken1EClass.getESuperTypes().add(this.getActivitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStep());
		activitydiagram_ActivityNode_RemoveToken1EClass.getESuperTypes().add(this.getActivitydiagram_ActivityNode_AddTokens1_AbstractSubStep());
		activitydiagram_ActivityNode_RemoveToken1EClass.getESuperTypes().add(this.getSmallStep());
		activitydiagram_ActivityNode_TerminateEClass.getESuperTypes().add(this.getSmallStep());
		activitydiagram_Activity_ResetEClass.getESuperTypes().add(this.getSmallStep());
		activitydiagram_Activity_ResetEClass.getESuperTypes().add(this.getActivitydiagram_Activity_WriteTrace_AbstractSubStep());
		activitydiagram_Activity_WriteTraceEClass.getESuperTypes().add(this.getBigStep());
		activitydiagram_Activity_WriteTrace_FillStepEClass.getESuperTypes().add(this.getActivitydiagram_Activity_WriteTrace_AbstractSubStep());
		activitydiagram_Variable_ExecuteEClass.getESuperTypes().add(this.getSmallStep());
		activitydiagram_ActivityNode_AddTokens1_FillStepEClass.getESuperTypes().add(this.getActivitydiagram_ActivityNode_AddTokens1_AbstractSubStep());

		// Initialize classes, features, and operations; add parameters
		initEClass(smallStepEClass, SmallStep.class, "SmallStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bigStepEClass, BigStep.class, "BigStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stepEClass, Step.class, "Step", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStep_StartingState(), theStatesPackage.getState(), theStatesPackage.getState_StartedSteps(), "startingState", null, 1, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStep_EndingState(), theStatesPackage.getState(), theStatesPackage.getState_EndedSteps(), "endingState", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rootFillStepEClass, RootFillStep.class, "RootFillStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activitydiagram_Activity_InitializeContextEClass, Activitydiagram_Activity_InitializeContext.class, "Activitydiagram_Activity_InitializeContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivitydiagram_Activity_InitializeContext_This(), theActivitydiagramPackage.getActivity(), null, "this", null, 0, 1, Activitydiagram_Activity_InitializeContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activitydiagram_Activity_ExecuteEClass, Activitydiagram_Activity_Execute.class, "Activitydiagram_Activity_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivitydiagram_Activity_Execute_This(), theActivitydiagramPackage.getActivity(), null, "this", null, 0, 1, Activitydiagram_Activity_Execute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivitydiagram_Activity_Execute_SubSteps(), this.getActivitydiagram_Activity_Execute_AbstractSubStep(), null, "subSteps", null, 0, -1, Activitydiagram_Activity_Execute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activitydiagram_Activity_Execute_AbstractSubStepEClass, Activitydiagram_Activity_Execute_AbstractSubStep.class, "Activitydiagram_Activity_Execute_AbstractSubStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activitydiagram_Activity_Execute_FillStepEClass, Activitydiagram_Activity_Execute_FillStep.class, "Activitydiagram_Activity_Execute_FillStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activitydiagram_Variable_InitEClass, Activitydiagram_Variable_Init.class, "Activitydiagram_Variable_Init", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivitydiagram_Variable_Init_This(), theActivitydiagramPackage.getVariable(), null, "this", null, 0, 1, Activitydiagram_Variable_Init.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activitydiagram_ActivityNode_ExecuteEClass, Activitydiagram_ActivityNode_Execute.class, "Activitydiagram_ActivityNode_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivitydiagram_ActivityNode_Execute_This(), theActivitydiagramPackage.getActivityNode(), null, "this", null, 0, 1, Activitydiagram_ActivityNode_Execute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activitydiagram_ActivityNode_TakeOfferdTokens1EClass, Activitydiagram_ActivityNode_TakeOfferdTokens1.class, "Activitydiagram_ActivityNode_TakeOfferdTokens1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivitydiagram_ActivityNode_TakeOfferdTokens1_This(), theActivitydiagramPackage.getActivityNode(), null, "this", null, 0, 1, Activitydiagram_ActivityNode_TakeOfferdTokens1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivitydiagram_ActivityNode_TakeOfferdTokens1_SubSteps(), this.getActivitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStep(), null, "subSteps", null, 0, -1, Activitydiagram_ActivityNode_TakeOfferdTokens1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activitydiagram_ActivityNode_SendOffers1EClass, Activitydiagram_ActivityNode_SendOffers1.class, "Activitydiagram_ActivityNode_SendOffers1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivitydiagram_ActivityNode_SendOffers1_This(), theActivitydiagramPackage.getActivityNode(), null, "this", null, 0, 1, Activitydiagram_ActivityNode_SendOffers1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activitydiagram_ActivityNode_AddTokens1EClass, Activitydiagram_ActivityNode_AddTokens1.class, "Activitydiagram_ActivityNode_AddTokens1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivitydiagram_ActivityNode_AddTokens1_This(), theActivitydiagramPackage.getActivityNode(), null, "this", null, 0, 1, Activitydiagram_ActivityNode_AddTokens1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivitydiagram_ActivityNode_AddTokens1_SubSteps(), this.getActivitydiagram_ActivityNode_AddTokens1_AbstractSubStep(), null, "subSteps", null, 0, -1, Activitydiagram_ActivityNode_AddTokens1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStepEClass, Activitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStep.class, "Activitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activitydiagram_ActivityNode_TakeOfferdTokens1_FillStepEClass, Activitydiagram_ActivityNode_TakeOfferdTokens1_FillStep.class, "Activitydiagram_ActivityNode_TakeOfferdTokens1_FillStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activitydiagram_ActivityNode_RemoveToken1EClass, Activitydiagram_ActivityNode_RemoveToken1.class, "Activitydiagram_ActivityNode_RemoveToken1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivitydiagram_ActivityNode_RemoveToken1_This(), theActivitydiagramPackage.getActivityNode(), null, "this", null, 0, 1, Activitydiagram_ActivityNode_RemoveToken1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activitydiagram_ActivityNode_TerminateEClass, Activitydiagram_ActivityNode_Terminate.class, "Activitydiagram_ActivityNode_Terminate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivitydiagram_ActivityNode_Terminate_This(), theActivitydiagramPackage.getActivityNode(), null, "this", null, 0, 1, Activitydiagram_ActivityNode_Terminate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activitydiagram_Activity_ResetEClass, Activitydiagram_Activity_Reset.class, "Activitydiagram_Activity_Reset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivitydiagram_Activity_Reset_This(), theActivitydiagramPackage.getActivity(), null, "this", null, 0, 1, Activitydiagram_Activity_Reset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activitydiagram_Activity_WriteTraceEClass, Activitydiagram_Activity_WriteTrace.class, "Activitydiagram_Activity_WriteTrace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivitydiagram_Activity_WriteTrace_This(), theActivitydiagramPackage.getActivity(), null, "this", null, 0, 1, Activitydiagram_Activity_WriteTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivitydiagram_Activity_WriteTrace_SubSteps(), this.getActivitydiagram_Activity_WriteTrace_AbstractSubStep(), null, "subSteps", null, 0, -1, Activitydiagram_Activity_WriteTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activitydiagram_Activity_WriteTrace_AbstractSubStepEClass, Activitydiagram_Activity_WriteTrace_AbstractSubStep.class, "Activitydiagram_Activity_WriteTrace_AbstractSubStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activitydiagram_Activity_WriteTrace_FillStepEClass, Activitydiagram_Activity_WriteTrace_FillStep.class, "Activitydiagram_Activity_WriteTrace_FillStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activitydiagram_Variable_ExecuteEClass, Activitydiagram_Variable_Execute.class, "Activitydiagram_Variable_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivitydiagram_Variable_Execute_This(), theActivitydiagramPackage.getVariable(), null, "this", null, 0, 1, Activitydiagram_Variable_Execute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activitydiagram_ActivityNode_AddTokens1_AbstractSubStepEClass, Activitydiagram_ActivityNode_AddTokens1_AbstractSubStep.class, "Activitydiagram_ActivityNode_AddTokens1_AbstractSubStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activitydiagram_ActivityNode_AddTokens1_FillStepEClass, Activitydiagram_ActivityNode_AddTokens1_FillStep.class, "Activitydiagram_ActivityNode_AddTokens1_FillStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //StepsPackageImpl
