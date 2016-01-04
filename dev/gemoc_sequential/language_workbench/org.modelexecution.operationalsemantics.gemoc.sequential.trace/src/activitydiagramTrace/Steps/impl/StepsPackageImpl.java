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
import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1_ImplicitStep;
import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute;
import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute_AbstractSubStep;
import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute_ImplicitStep;
import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_RemoveToken1;
import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_SendOffers1;
import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1;
import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStep;
import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStep;
import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Terminate;
import activitydiagramTrace.Steps.Activitydiagram_Activity_Execute;
import activitydiagramTrace.Steps.Activitydiagram_Activity_Execute_AbstractSubStep;
import activitydiagramTrace.Steps.Activitydiagram_Activity_Execute_ImplicitStep;
import activitydiagramTrace.Steps.Activitydiagram_Activity_InitializeContext;
import activitydiagramTrace.Steps.Activitydiagram_Activity_Reset;
import activitydiagramTrace.Steps.Activitydiagram_Activity_WriteTrace;
import activitydiagramTrace.Steps.Activitydiagram_Activity_WriteTrace_AbstractSubStep;
import activitydiagramTrace.Steps.Activitydiagram_Activity_WriteTrace_ImplicitStep;
import activitydiagramTrace.Steps.Activitydiagram_Variable_Execute;
import activitydiagramTrace.Steps.Activitydiagram_Variable_Init;
import activitydiagramTrace.Steps.BigStep;
import activitydiagramTrace.Steps.RootImplicitStep;
import activitydiagramTrace.Steps.SmallStep;
import activitydiagramTrace.Steps.Step;
import activitydiagramTrace.Steps.StepsFactory;
import activitydiagramTrace.Steps.StepsPackage;

import activitydiagramTrace.impl.ActivitydiagramTracePackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gemoc.execution.engine.mse.engine_mse.Engine_msePackage;

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
	private EClass rootImplicitStepEClass = null;

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
	private EClass activitydiagram_Activity_Execute_ImplicitStepEClass = null;

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
	private EClass activitydiagram_ActivityNode_Execute_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitydiagram_ActivityNode_Execute_ImplicitStepEClass = null;

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
	private EClass activitydiagram_ActivityNode_TakeOfferdTokens1EClass = null;

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
	private EClass activitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStepEClass = null;

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
	private EClass activitydiagram_ActivityNode_AddTokens1_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitydiagram_ActivityNode_AddTokens1_ImplicitStepEClass = null;

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
	private EClass activitydiagram_Variable_ExecuteEClass = null;

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
	private EClass activitydiagram_Activity_InitializeContextEClass = null;

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
	private EClass activitydiagram_Activity_WriteTrace_ImplicitStepEClass = null;

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
		Engine_msePackage.eINSTANCE.eClass();

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
	public EClass getRootImplicitStep() {
		return rootImplicitStepEClass;
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
	public EReference getActivitydiagram_Activity_Execute_SubSteps() {
		return (EReference)activitydiagram_Activity_ExecuteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivitydiagram_Activity_Execute__GetCaller() {
		return activitydiagram_Activity_ExecuteEClass.getEOperations().get(0);
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
	public EClass getActivitydiagram_Activity_Execute_ImplicitStep() {
		return activitydiagram_Activity_Execute_ImplicitStepEClass;
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
	public EOperation getActivitydiagram_Variable_Init__GetCaller() {
		return activitydiagram_Variable_InitEClass.getEOperations().get(0);
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
	public EReference getActivitydiagram_ActivityNode_Execute_SubSteps() {
		return (EReference)activitydiagram_ActivityNode_ExecuteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivitydiagram_ActivityNode_Execute__GetCaller() {
		return activitydiagram_ActivityNode_ExecuteEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivitydiagram_ActivityNode_Execute_AbstractSubStep() {
		return activitydiagram_ActivityNode_Execute_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivitydiagram_ActivityNode_Execute_ImplicitStep() {
		return activitydiagram_ActivityNode_Execute_ImplicitStepEClass;
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
	public EOperation getActivitydiagram_ActivityNode_SendOffers1__GetCaller() {
		return activitydiagram_ActivityNode_SendOffers1EClass.getEOperations().get(0);
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
	public EReference getActivitydiagram_ActivityNode_TakeOfferdTokens1_SubSteps() {
		return (EReference)activitydiagram_ActivityNode_TakeOfferdTokens1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivitydiagram_ActivityNode_TakeOfferdTokens1__GetCaller() {
		return activitydiagram_ActivityNode_TakeOfferdTokens1EClass.getEOperations().get(0);
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
	public EReference getActivitydiagram_ActivityNode_AddTokens1_SubSteps() {
		return (EReference)activitydiagram_ActivityNode_AddTokens1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivitydiagram_ActivityNode_AddTokens1__GetCaller() {
		return activitydiagram_ActivityNode_AddTokens1EClass.getEOperations().get(0);
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
	public EClass getActivitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStep() {
		return activitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStepEClass;
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
	public EOperation getActivitydiagram_ActivityNode_RemoveToken1__GetCaller() {
		return activitydiagram_ActivityNode_RemoveToken1EClass.getEOperations().get(0);
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
	public EClass getActivitydiagram_ActivityNode_AddTokens1_ImplicitStep() {
		return activitydiagram_ActivityNode_AddTokens1_ImplicitStepEClass;
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
	public EOperation getActivitydiagram_ActivityNode_Terminate__GetCaller() {
		return activitydiagram_ActivityNode_TerminateEClass.getEOperations().get(0);
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
	public EOperation getActivitydiagram_Variable_Execute__GetCaller() {
		return activitydiagram_Variable_ExecuteEClass.getEOperations().get(0);
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
	public EOperation getActivitydiagram_Activity_Reset__GetCaller() {
		return activitydiagram_Activity_ResetEClass.getEOperations().get(0);
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
	public EOperation getActivitydiagram_Activity_InitializeContext__GetCaller() {
		return activitydiagram_Activity_InitializeContextEClass.getEOperations().get(0);
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
	public EReference getActivitydiagram_Activity_WriteTrace_SubSteps() {
		return (EReference)activitydiagram_Activity_WriteTraceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivitydiagram_Activity_WriteTrace__GetCaller() {
		return activitydiagram_Activity_WriteTraceEClass.getEOperations().get(0);
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
	public EClass getActivitydiagram_Activity_WriteTrace_ImplicitStep() {
		return activitydiagram_Activity_WriteTrace_ImplicitStepEClass;
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

		rootImplicitStepEClass = createEClass(ROOT_IMPLICIT_STEP);

		activitydiagram_Activity_ExecuteEClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_EXECUTE);
		createEReference(activitydiagram_Activity_ExecuteEClass, ACTIVITYDIAGRAM_ACTIVITY_EXECUTE__SUB_STEPS);
		createEOperation(activitydiagram_Activity_ExecuteEClass, ACTIVITYDIAGRAM_ACTIVITY_EXECUTE___GET_CALLER);

		activitydiagram_Activity_Execute_AbstractSubStepEClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP);

		activitydiagram_Activity_Execute_ImplicitStepEClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_IMPLICIT_STEP);

		activitydiagram_Variable_InitEClass = createEClass(ACTIVITYDIAGRAM_VARIABLE_INIT);
		createEOperation(activitydiagram_Variable_InitEClass, ACTIVITYDIAGRAM_VARIABLE_INIT___GET_CALLER);

		activitydiagram_ActivityNode_ExecuteEClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE);
		createEReference(activitydiagram_ActivityNode_ExecuteEClass, ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE__SUB_STEPS);
		createEOperation(activitydiagram_ActivityNode_ExecuteEClass, ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE___GET_CALLER);

		activitydiagram_ActivityNode_Execute_AbstractSubStepEClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_STEP);

		activitydiagram_ActivityNode_Execute_ImplicitStepEClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_IMPLICIT_STEP);

		activitydiagram_ActivityNode_SendOffers1EClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1);
		createEOperation(activitydiagram_ActivityNode_SendOffers1EClass, ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1___GET_CALLER);

		activitydiagram_ActivityNode_TakeOfferdTokens1EClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1);
		createEReference(activitydiagram_ActivityNode_TakeOfferdTokens1EClass, ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1__SUB_STEPS);
		createEOperation(activitydiagram_ActivityNode_TakeOfferdTokens1EClass, ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1___GET_CALLER);

		activitydiagram_ActivityNode_AddTokens1EClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1);
		createEReference(activitydiagram_ActivityNode_AddTokens1EClass, ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1__SUB_STEPS);
		createEOperation(activitydiagram_ActivityNode_AddTokens1EClass, ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1___GET_CALLER);

		activitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStepEClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_ABSTRACT_SUB_STEP);

		activitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStepEClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_IMPLICIT_STEP);

		activitydiagram_ActivityNode_RemoveToken1EClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN1);
		createEOperation(activitydiagram_ActivityNode_RemoveToken1EClass, ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN1___GET_CALLER);

		activitydiagram_ActivityNode_AddTokens1_AbstractSubStepEClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_ABSTRACT_SUB_STEP);

		activitydiagram_ActivityNode_AddTokens1_ImplicitStepEClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_IMPLICIT_STEP);

		activitydiagram_ActivityNode_TerminateEClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE);
		createEOperation(activitydiagram_ActivityNode_TerminateEClass, ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE___GET_CALLER);

		activitydiagram_Variable_ExecuteEClass = createEClass(ACTIVITYDIAGRAM_VARIABLE_EXECUTE);
		createEOperation(activitydiagram_Variable_ExecuteEClass, ACTIVITYDIAGRAM_VARIABLE_EXECUTE___GET_CALLER);

		activitydiagram_Activity_ResetEClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_RESET);
		createEOperation(activitydiagram_Activity_ResetEClass, ACTIVITYDIAGRAM_ACTIVITY_RESET___GET_CALLER);

		activitydiagram_Activity_InitializeContextEClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_INITIALIZE_CONTEXT);
		createEOperation(activitydiagram_Activity_InitializeContextEClass, ACTIVITYDIAGRAM_ACTIVITY_INITIALIZE_CONTEXT___GET_CALLER);

		activitydiagram_Activity_WriteTraceEClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE);
		createEReference(activitydiagram_Activity_WriteTraceEClass, ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE__SUB_STEPS);
		createEOperation(activitydiagram_Activity_WriteTraceEClass, ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE___GET_CALLER);

		activitydiagram_Activity_WriteTrace_AbstractSubStepEClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_ABSTRACT_SUB_STEP);

		activitydiagram_Activity_WriteTrace_ImplicitStepEClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_IMPLICIT_STEP);
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
		Engine_msePackage theEngine_msePackage = (Engine_msePackage)EPackage.Registry.INSTANCE.getEPackage(Engine_msePackage.eNS_URI);
		StatesPackage theStatesPackage = (StatesPackage)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI);
		ActivitydiagramPackage theActivitydiagramPackage = (ActivitydiagramPackage)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		smallStepEClass.getESuperTypes().add(this.getStep());
		bigStepEClass.getESuperTypes().add(this.getStep());
		stepEClass.getESuperTypes().add(theEngine_msePackage.getMSEOccurrence());
		rootImplicitStepEClass.getESuperTypes().add(this.getSmallStep());
		activitydiagram_Activity_ExecuteEClass.getESuperTypes().add(this.getBigStep());
		activitydiagram_Activity_Execute_ImplicitStepEClass.getESuperTypes().add(this.getActivitydiagram_Activity_Execute_AbstractSubStep());
		activitydiagram_Activity_Execute_ImplicitStepEClass.getESuperTypes().add(this.getSmallStep());
		activitydiagram_Variable_InitEClass.getESuperTypes().add(this.getActivitydiagram_Activity_Execute_AbstractSubStep());
		activitydiagram_Variable_InitEClass.getESuperTypes().add(this.getSmallStep());
		activitydiagram_ActivityNode_ExecuteEClass.getESuperTypes().add(this.getActivitydiagram_Activity_Execute_AbstractSubStep());
		activitydiagram_ActivityNode_ExecuteEClass.getESuperTypes().add(this.getBigStep());
		activitydiagram_ActivityNode_Execute_ImplicitStepEClass.getESuperTypes().add(this.getActivitydiagram_ActivityNode_Execute_AbstractSubStep());
		activitydiagram_ActivityNode_Execute_ImplicitStepEClass.getESuperTypes().add(this.getSmallStep());
		activitydiagram_ActivityNode_SendOffers1EClass.getESuperTypes().add(this.getActivitydiagram_ActivityNode_Execute_AbstractSubStep());
		activitydiagram_ActivityNode_SendOffers1EClass.getESuperTypes().add(this.getSmallStep());
		activitydiagram_ActivityNode_TakeOfferdTokens1EClass.getESuperTypes().add(this.getActivitydiagram_ActivityNode_Execute_AbstractSubStep());
		activitydiagram_ActivityNode_TakeOfferdTokens1EClass.getESuperTypes().add(this.getBigStep());
		activitydiagram_ActivityNode_AddTokens1EClass.getESuperTypes().add(this.getActivitydiagram_ActivityNode_Execute_AbstractSubStep());
		activitydiagram_ActivityNode_AddTokens1EClass.getESuperTypes().add(this.getBigStep());
		activitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStepEClass.getESuperTypes().add(this.getActivitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStep());
		activitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStepEClass.getESuperTypes().add(this.getSmallStep());
		activitydiagram_ActivityNode_RemoveToken1EClass.getESuperTypes().add(this.getActivitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStep());
		activitydiagram_ActivityNode_RemoveToken1EClass.getESuperTypes().add(this.getActivitydiagram_ActivityNode_AddTokens1_AbstractSubStep());
		activitydiagram_ActivityNode_RemoveToken1EClass.getESuperTypes().add(this.getSmallStep());
		activitydiagram_ActivityNode_AddTokens1_ImplicitStepEClass.getESuperTypes().add(this.getActivitydiagram_ActivityNode_AddTokens1_AbstractSubStep());
		activitydiagram_ActivityNode_AddTokens1_ImplicitStepEClass.getESuperTypes().add(this.getSmallStep());
		activitydiagram_ActivityNode_TerminateEClass.getESuperTypes().add(this.getSmallStep());
		activitydiagram_Variable_ExecuteEClass.getESuperTypes().add(this.getSmallStep());
		activitydiagram_Activity_ResetEClass.getESuperTypes().add(this.getSmallStep());
		activitydiagram_Activity_ResetEClass.getESuperTypes().add(this.getActivitydiagram_Activity_WriteTrace_AbstractSubStep());
		activitydiagram_Activity_InitializeContextEClass.getESuperTypes().add(this.getSmallStep());
		activitydiagram_Activity_WriteTraceEClass.getESuperTypes().add(this.getBigStep());
		activitydiagram_Activity_WriteTrace_ImplicitStepEClass.getESuperTypes().add(this.getActivitydiagram_Activity_WriteTrace_AbstractSubStep());
		activitydiagram_Activity_WriteTrace_ImplicitStepEClass.getESuperTypes().add(this.getSmallStep());

		// Initialize classes, features, and operations; add parameters
		initEClass(smallStepEClass, SmallStep.class, "SmallStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bigStepEClass, BigStep.class, "BigStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stepEClass, Step.class, "Step", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStep_StartingState(), theStatesPackage.getState(), theStatesPackage.getState_StartedSteps(), "startingState", null, 1, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStep_EndingState(), theStatesPackage.getState(), theStatesPackage.getState_EndedSteps(), "endingState", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rootImplicitStepEClass, RootImplicitStep.class, "RootImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activitydiagram_Activity_ExecuteEClass, Activitydiagram_Activity_Execute.class, "Activitydiagram_Activity_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivitydiagram_Activity_Execute_SubSteps(), this.getActivitydiagram_Activity_Execute_AbstractSubStep(), null, "subSteps", null, 0, -1, Activitydiagram_Activity_Execute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getActivitydiagram_Activity_Execute__GetCaller(), theActivitydiagramPackage.getActivity(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(activitydiagram_Activity_Execute_AbstractSubStepEClass, Activitydiagram_Activity_Execute_AbstractSubStep.class, "Activitydiagram_Activity_Execute_AbstractSubStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activitydiagram_Activity_Execute_ImplicitStepEClass, Activitydiagram_Activity_Execute_ImplicitStep.class, "Activitydiagram_Activity_Execute_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activitydiagram_Variable_InitEClass, Activitydiagram_Variable_Init.class, "Activitydiagram_Variable_Init", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getActivitydiagram_Variable_Init__GetCaller(), theActivitydiagramPackage.getVariable(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(activitydiagram_ActivityNode_ExecuteEClass, Activitydiagram_ActivityNode_Execute.class, "Activitydiagram_ActivityNode_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivitydiagram_ActivityNode_Execute_SubSteps(), this.getActivitydiagram_ActivityNode_Execute_AbstractSubStep(), null, "subSteps", null, 0, -1, Activitydiagram_ActivityNode_Execute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getActivitydiagram_ActivityNode_Execute__GetCaller(), theActivitydiagramPackage.getActivityNode(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(activitydiagram_ActivityNode_Execute_AbstractSubStepEClass, Activitydiagram_ActivityNode_Execute_AbstractSubStep.class, "Activitydiagram_ActivityNode_Execute_AbstractSubStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activitydiagram_ActivityNode_Execute_ImplicitStepEClass, Activitydiagram_ActivityNode_Execute_ImplicitStep.class, "Activitydiagram_ActivityNode_Execute_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activitydiagram_ActivityNode_SendOffers1EClass, Activitydiagram_ActivityNode_SendOffers1.class, "Activitydiagram_ActivityNode_SendOffers1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getActivitydiagram_ActivityNode_SendOffers1__GetCaller(), theActivitydiagramPackage.getActivityNode(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(activitydiagram_ActivityNode_TakeOfferdTokens1EClass, Activitydiagram_ActivityNode_TakeOfferdTokens1.class, "Activitydiagram_ActivityNode_TakeOfferdTokens1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivitydiagram_ActivityNode_TakeOfferdTokens1_SubSteps(), this.getActivitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStep(), null, "subSteps", null, 0, -1, Activitydiagram_ActivityNode_TakeOfferdTokens1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getActivitydiagram_ActivityNode_TakeOfferdTokens1__GetCaller(), theActivitydiagramPackage.getActivityNode(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(activitydiagram_ActivityNode_AddTokens1EClass, Activitydiagram_ActivityNode_AddTokens1.class, "Activitydiagram_ActivityNode_AddTokens1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivitydiagram_ActivityNode_AddTokens1_SubSteps(), this.getActivitydiagram_ActivityNode_AddTokens1_AbstractSubStep(), null, "subSteps", null, 0, -1, Activitydiagram_ActivityNode_AddTokens1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getActivitydiagram_ActivityNode_AddTokens1__GetCaller(), theActivitydiagramPackage.getActivityNode(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(activitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStepEClass, Activitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStep.class, "Activitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStepEClass, Activitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStep.class, "Activitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activitydiagram_ActivityNode_RemoveToken1EClass, Activitydiagram_ActivityNode_RemoveToken1.class, "Activitydiagram_ActivityNode_RemoveToken1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getActivitydiagram_ActivityNode_RemoveToken1__GetCaller(), theActivitydiagramPackage.getActivityNode(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(activitydiagram_ActivityNode_AddTokens1_AbstractSubStepEClass, Activitydiagram_ActivityNode_AddTokens1_AbstractSubStep.class, "Activitydiagram_ActivityNode_AddTokens1_AbstractSubStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activitydiagram_ActivityNode_AddTokens1_ImplicitStepEClass, Activitydiagram_ActivityNode_AddTokens1_ImplicitStep.class, "Activitydiagram_ActivityNode_AddTokens1_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activitydiagram_ActivityNode_TerminateEClass, Activitydiagram_ActivityNode_Terminate.class, "Activitydiagram_ActivityNode_Terminate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getActivitydiagram_ActivityNode_Terminate__GetCaller(), theActivitydiagramPackage.getActivityNode(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(activitydiagram_Variable_ExecuteEClass, Activitydiagram_Variable_Execute.class, "Activitydiagram_Variable_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getActivitydiagram_Variable_Execute__GetCaller(), theActivitydiagramPackage.getVariable(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(activitydiagram_Activity_ResetEClass, Activitydiagram_Activity_Reset.class, "Activitydiagram_Activity_Reset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getActivitydiagram_Activity_Reset__GetCaller(), theActivitydiagramPackage.getActivity(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(activitydiagram_Activity_InitializeContextEClass, Activitydiagram_Activity_InitializeContext.class, "Activitydiagram_Activity_InitializeContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getActivitydiagram_Activity_InitializeContext__GetCaller(), theActivitydiagramPackage.getActivity(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(activitydiagram_Activity_WriteTraceEClass, Activitydiagram_Activity_WriteTrace.class, "Activitydiagram_Activity_WriteTrace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivitydiagram_Activity_WriteTrace_SubSteps(), this.getActivitydiagram_Activity_WriteTrace_AbstractSubStep(), null, "subSteps", null, 0, -1, Activitydiagram_Activity_WriteTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getActivitydiagram_Activity_WriteTrace__GetCaller(), theActivitydiagramPackage.getActivity(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(activitydiagram_Activity_WriteTrace_AbstractSubStepEClass, Activitydiagram_Activity_WriteTrace_AbstractSubStep.class, "Activitydiagram_Activity_WriteTrace_AbstractSubStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activitydiagram_Activity_WriteTrace_ImplicitStepEClass, Activitydiagram_Activity_WriteTrace_ImplicitStep.class, "Activitydiagram_Activity_WriteTrace_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //StepsPackageImpl
