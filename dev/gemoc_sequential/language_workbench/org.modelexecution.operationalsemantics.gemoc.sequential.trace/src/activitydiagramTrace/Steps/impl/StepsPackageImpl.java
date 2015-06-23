/**
 */
package activitydiagramTrace.Steps.impl;

import activitydiagram.ActivitydiagramPackage;

import activitydiagramTrace.ActivitydiagramTracePackage;

import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1;
import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1_AbstractSubEvent;
import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1_FillEvent;
import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute;
import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute_AbstractSubEvent;
import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute_FillEvent;
import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_HasOffers1;
import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_IsReady;
import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_RemoveToken1;
import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_SendOffers1;
import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1;
import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubEvent;
import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1_FillEvent;
import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Terminate;
import activitydiagramTrace.Steps.Activitydiagram_Activity_InitializeContext;
import activitydiagramTrace.Steps.Activitydiagram_Variable_Execute;
import activitydiagramTrace.Steps.Activitydiagram_Variable_Init;
import activitydiagramTrace.Steps.Activitydiagram_Variable_Print;
import activitydiagramTrace.Steps.BigStep;
import activitydiagramTrace.Steps.FillEvent;
import activitydiagramTrace.Steps.SmallStep;
import activitydiagramTrace.Steps.Steps;
import activitydiagramTrace.Steps.StepsFactory;
import activitydiagramTrace.Steps.StepsPackage;

import activitydiagramTrace.Traced.TracedPackage;

import activitydiagramTrace.Traced.activitydiagram.impl.ActivitydiagramPackageImpl;

import activitydiagramTrace.Traced.impl.TracedPackageImpl;

import activitydiagramTrace.Values.ValuesPackage;

import activitydiagramTrace.Values.impl.ValuesPackageImpl;

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
	private EClass stepsEClass = null;

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
	private EClass activitydiagram_ActivityNode_TerminateEClass = null;

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
	private EClass activitydiagram_ActivityNode_Execute_AbstractSubEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitydiagram_ActivityNode_Execute_FillEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitydiagram_ActivityNode_TakeOfferdTokens1_FillEventEClass = null;

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
	private EClass activitydiagram_ActivityNode_AddTokens1_AbstractSubEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitydiagram_ActivityNode_AddTokens1_FillEventEClass = null;

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
	private EClass activitydiagram_ActivityNode_HasOffers1EClass = null;

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
	private EClass activitydiagram_Variable_InitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitydiagram_ActivityNode_IsReadyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitydiagram_Variable_PrintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fillEventEClass = null;

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
	private EClass activitydiagram_ActivityNode_AddTokens1EClass = null;

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
		ValuesPackageImpl theValuesPackage = (ValuesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI) instanceof ValuesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI) : ValuesPackage.eINSTANCE);
		TracedPackageImpl theTracedPackage = (TracedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TracedPackage.eNS_URI) instanceof TracedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TracedPackage.eNS_URI) : TracedPackage.eINSTANCE);
		ActivitydiagramPackageImpl theActivitydiagramPackage_1 = (ActivitydiagramPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage.eNS_URI) instanceof ActivitydiagramPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage.eNS_URI) : activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage.eINSTANCE);

		// Create package meta-data objects
		theStepsPackage.createPackageContents();
		theActivitydiagramTracePackage.createPackageContents();
		theValuesPackage.createPackageContents();
		theTracedPackage.createPackageContents();
		theActivitydiagramPackage_1.createPackageContents();

		// Initialize created meta-data
		theStepsPackage.initializePackageContents();
		theActivitydiagramTracePackage.initializePackageContents();
		theValuesPackage.initializePackageContents();
		theTracedPackage.initializePackageContents();
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
	public EReference getSmallStep_PrecedingState() {
		return (EReference)smallStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSteps() {
		return stepsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSteps_Activitydiagram_ActivityNode_Terminate_Trace() {
		return (EReference)stepsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSteps_Activitydiagram_ActivityNode_SendOffers1_Trace() {
		return (EReference)stepsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSteps_Activitydiagram_ActivityNode_Execute_FillEvent_Trace() {
		return (EReference)stepsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSteps_Activitydiagram_ActivityNode_TakeOfferdTokens1_FillEvent_Trace() {
		return (EReference)stepsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSteps_Activitydiagram_ActivityNode_RemoveToken1_Trace() {
		return (EReference)stepsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSteps_Activitydiagram_ActivityNode_AddTokens1_FillEvent_Trace() {
		return (EReference)stepsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSteps_Activitydiagram_Variable_Execute_Trace() {
		return (EReference)stepsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSteps_Activitydiagram_ActivityNode_HasOffers1_Trace() {
		return (EReference)stepsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSteps_Activitydiagram_Activity_InitializeContext_Trace() {
		return (EReference)stepsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSteps_Activitydiagram_Variable_Init_Trace() {
		return (EReference)stepsEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSteps_Activitydiagram_ActivityNode_IsReady_Trace() {
		return (EReference)stepsEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSteps_Activitydiagram_Variable_Print_Trace() {
		return (EReference)stepsEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSteps_FillEvent_Trace() {
		return (EReference)stepsEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSteps_Activitydiagram_ActivityNode_Execute_Trace() {
		return (EReference)stepsEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSteps_Activitydiagram_ActivityNode_TakeOfferdTokens1_Trace() {
		return (EReference)stepsEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSteps_Activitydiagram_ActivityNode_AddTokens1_Trace() {
		return (EReference)stepsEClass.getEStructuralFeatures().get(15);
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
	public EReference getBigStep_StartingState() {
		return (EReference)bigStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBigStep_EndingState() {
		return (EReference)bigStepEClass.getEStructuralFeatures().get(1);
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
	public EClass getActivitydiagram_ActivityNode_Execute_AbstractSubEvent() {
		return activitydiagram_ActivityNode_Execute_AbstractSubEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivitydiagram_ActivityNode_Execute_FillEvent() {
		return activitydiagram_ActivityNode_Execute_FillEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubEvent() {
		return activitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivitydiagram_ActivityNode_TakeOfferdTokens1_FillEvent() {
		return activitydiagram_ActivityNode_TakeOfferdTokens1_FillEventEClass;
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
	public EClass getActivitydiagram_ActivityNode_AddTokens1_AbstractSubEvent() {
		return activitydiagram_ActivityNode_AddTokens1_AbstractSubEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivitydiagram_ActivityNode_AddTokens1_FillEvent() {
		return activitydiagram_ActivityNode_AddTokens1_FillEventEClass;
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
	public EClass getActivitydiagram_ActivityNode_HasOffers1() {
		return activitydiagram_ActivityNode_HasOffers1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivitydiagram_ActivityNode_HasOffers1_This() {
		return (EReference)activitydiagram_ActivityNode_HasOffers1EClass.getEStructuralFeatures().get(0);
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
	public EClass getActivitydiagram_ActivityNode_IsReady() {
		return activitydiagram_ActivityNode_IsReadyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivitydiagram_ActivityNode_IsReady_This() {
		return (EReference)activitydiagram_ActivityNode_IsReadyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivitydiagram_Variable_Print() {
		return activitydiagram_Variable_PrintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivitydiagram_Variable_Print_This() {
		return (EReference)activitydiagram_Variable_PrintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFillEvent() {
		return fillEventEClass;
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
	public EReference getActivitydiagram_ActivityNode_Execute_SubSteps() {
		return (EReference)activitydiagram_ActivityNode_ExecuteEClass.getEStructuralFeatures().get(1);
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
		createEReference(smallStepEClass, SMALL_STEP__PRECEDING_STATE);

		stepsEClass = createEClass(STEPS);
		createEReference(stepsEClass, STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE_TRACE);
		createEReference(stepsEClass, STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1_TRACE);
		createEReference(stepsEClass, STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_FILL_EVENT_TRACE);
		createEReference(stepsEClass, STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_FILL_EVENT_TRACE);
		createEReference(stepsEClass, STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN1_TRACE);
		createEReference(stepsEClass, STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_FILL_EVENT_TRACE);
		createEReference(stepsEClass, STEPS__ACTIVITYDIAGRAM_VARIABLE_EXECUTE_TRACE);
		createEReference(stepsEClass, STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_HAS_OFFERS1_TRACE);
		createEReference(stepsEClass, STEPS__ACTIVITYDIAGRAM_ACTIVITY_INITIALIZE_CONTEXT_TRACE);
		createEReference(stepsEClass, STEPS__ACTIVITYDIAGRAM_VARIABLE_INIT_TRACE);
		createEReference(stepsEClass, STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_IS_READY_TRACE);
		createEReference(stepsEClass, STEPS__ACTIVITYDIAGRAM_VARIABLE_PRINT_TRACE);
		createEReference(stepsEClass, STEPS__FILL_EVENT_TRACE);
		createEReference(stepsEClass, STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_TRACE);
		createEReference(stepsEClass, STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_TRACE);
		createEReference(stepsEClass, STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_TRACE);

		bigStepEClass = createEClass(BIG_STEP);
		createEReference(bigStepEClass, BIG_STEP__STARTING_STATE);
		createEReference(bigStepEClass, BIG_STEP__ENDING_STATE);

		activitydiagram_ActivityNode_TerminateEClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE);
		createEReference(activitydiagram_ActivityNode_TerminateEClass, ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE__THIS);

		activitydiagram_ActivityNode_SendOffers1EClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1);
		createEReference(activitydiagram_ActivityNode_SendOffers1EClass, ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1__THIS);

		activitydiagram_ActivityNode_Execute_AbstractSubEventEClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_EVENT);

		activitydiagram_ActivityNode_Execute_FillEventEClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_FILL_EVENT);

		activitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubEventEClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_ABSTRACT_SUB_EVENT);

		activitydiagram_ActivityNode_TakeOfferdTokens1_FillEventEClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_FILL_EVENT);

		activitydiagram_ActivityNode_RemoveToken1EClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN1);
		createEReference(activitydiagram_ActivityNode_RemoveToken1EClass, ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN1__THIS);

		activitydiagram_ActivityNode_AddTokens1_AbstractSubEventEClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_ABSTRACT_SUB_EVENT);

		activitydiagram_ActivityNode_AddTokens1_FillEventEClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_FILL_EVENT);

		activitydiagram_Variable_ExecuteEClass = createEClass(ACTIVITYDIAGRAM_VARIABLE_EXECUTE);
		createEReference(activitydiagram_Variable_ExecuteEClass, ACTIVITYDIAGRAM_VARIABLE_EXECUTE__THIS);

		activitydiagram_ActivityNode_HasOffers1EClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_NODE_HAS_OFFERS1);
		createEReference(activitydiagram_ActivityNode_HasOffers1EClass, ACTIVITYDIAGRAM_ACTIVITY_NODE_HAS_OFFERS1__THIS);

		activitydiagram_Activity_InitializeContextEClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_INITIALIZE_CONTEXT);
		createEReference(activitydiagram_Activity_InitializeContextEClass, ACTIVITYDIAGRAM_ACTIVITY_INITIALIZE_CONTEXT__THIS);

		activitydiagram_Variable_InitEClass = createEClass(ACTIVITYDIAGRAM_VARIABLE_INIT);
		createEReference(activitydiagram_Variable_InitEClass, ACTIVITYDIAGRAM_VARIABLE_INIT__THIS);

		activitydiagram_ActivityNode_IsReadyEClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_NODE_IS_READY);
		createEReference(activitydiagram_ActivityNode_IsReadyEClass, ACTIVITYDIAGRAM_ACTIVITY_NODE_IS_READY__THIS);

		activitydiagram_Variable_PrintEClass = createEClass(ACTIVITYDIAGRAM_VARIABLE_PRINT);
		createEReference(activitydiagram_Variable_PrintEClass, ACTIVITYDIAGRAM_VARIABLE_PRINT__THIS);

		fillEventEClass = createEClass(FILL_EVENT);

		activitydiagram_ActivityNode_ExecuteEClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE);
		createEReference(activitydiagram_ActivityNode_ExecuteEClass, ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE__THIS);
		createEReference(activitydiagram_ActivityNode_ExecuteEClass, ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE__SUB_STEPS);

		activitydiagram_ActivityNode_TakeOfferdTokens1EClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1);
		createEReference(activitydiagram_ActivityNode_TakeOfferdTokens1EClass, ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1__THIS);
		createEReference(activitydiagram_ActivityNode_TakeOfferdTokens1EClass, ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1__SUB_STEPS);

		activitydiagram_ActivityNode_AddTokens1EClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1);
		createEReference(activitydiagram_ActivityNode_AddTokens1EClass, ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1__THIS);
		createEReference(activitydiagram_ActivityNode_AddTokens1EClass, ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1__SUB_STEPS);
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
		ActivitydiagramTracePackage theActivitydiagramTracePackage = (ActivitydiagramTracePackage)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramTracePackage.eNS_URI);
		activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage theActivitydiagramPackage_1 = (activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage)EPackage.Registry.INSTANCE.getEPackage(activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		activitydiagram_ActivityNode_TerminateEClass.getESuperTypes().add(this.getSmallStep());
		activitydiagram_ActivityNode_SendOffers1EClass.getESuperTypes().add(this.getActivitydiagram_ActivityNode_Execute_AbstractSubEvent());
		activitydiagram_ActivityNode_SendOffers1EClass.getESuperTypes().add(this.getSmallStep());
		activitydiagram_ActivityNode_Execute_FillEventEClass.getESuperTypes().add(this.getActivitydiagram_ActivityNode_Execute_AbstractSubEvent());
		activitydiagram_ActivityNode_Execute_FillEventEClass.getESuperTypes().add(this.getSmallStep());
		activitydiagram_ActivityNode_TakeOfferdTokens1_FillEventEClass.getESuperTypes().add(this.getActivitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubEvent());
		activitydiagram_ActivityNode_TakeOfferdTokens1_FillEventEClass.getESuperTypes().add(this.getSmallStep());
		activitydiagram_ActivityNode_RemoveToken1EClass.getESuperTypes().add(this.getActivitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubEvent());
		activitydiagram_ActivityNode_RemoveToken1EClass.getESuperTypes().add(this.getActivitydiagram_ActivityNode_AddTokens1_AbstractSubEvent());
		activitydiagram_ActivityNode_RemoveToken1EClass.getESuperTypes().add(this.getSmallStep());
		activitydiagram_ActivityNode_AddTokens1_FillEventEClass.getESuperTypes().add(this.getActivitydiagram_ActivityNode_AddTokens1_AbstractSubEvent());
		activitydiagram_ActivityNode_AddTokens1_FillEventEClass.getESuperTypes().add(this.getSmallStep());
		activitydiagram_Variable_ExecuteEClass.getESuperTypes().add(this.getSmallStep());
		activitydiagram_ActivityNode_HasOffers1EClass.getESuperTypes().add(this.getSmallStep());
		activitydiagram_Activity_InitializeContextEClass.getESuperTypes().add(this.getSmallStep());
		activitydiagram_Variable_InitEClass.getESuperTypes().add(this.getSmallStep());
		activitydiagram_ActivityNode_IsReadyEClass.getESuperTypes().add(this.getSmallStep());
		activitydiagram_Variable_PrintEClass.getESuperTypes().add(this.getSmallStep());
		fillEventEClass.getESuperTypes().add(this.getSmallStep());
		activitydiagram_ActivityNode_ExecuteEClass.getESuperTypes().add(this.getBigStep());
		activitydiagram_ActivityNode_TakeOfferdTokens1EClass.getESuperTypes().add(this.getActivitydiagram_ActivityNode_Execute_AbstractSubEvent());
		activitydiagram_ActivityNode_TakeOfferdTokens1EClass.getESuperTypes().add(this.getBigStep());
		activitydiagram_ActivityNode_AddTokens1EClass.getESuperTypes().add(this.getActivitydiagram_ActivityNode_Execute_AbstractSubEvent());
		activitydiagram_ActivityNode_AddTokens1EClass.getESuperTypes().add(this.getBigStep());

		// Initialize classes, features, and operations; add parameters
		initEClass(smallStepEClass, SmallStep.class, "SmallStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSmallStep_PrecedingState(), theActivitydiagramTracePackage.getState(), theActivitydiagramTracePackage.getState_FollowingStep(), "precedingState", null, 1, 1, SmallStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stepsEClass, Steps.class, "Steps", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSteps_Activitydiagram_ActivityNode_Terminate_Trace(), this.getActivitydiagram_ActivityNode_Terminate(), null, "Activitydiagram_ActivityNode_Terminate_Trace", null, 0, -1, Steps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSteps_Activitydiagram_ActivityNode_SendOffers1_Trace(), this.getActivitydiagram_ActivityNode_SendOffers1(), null, "Activitydiagram_ActivityNode_SendOffers1_Trace", null, 0, -1, Steps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSteps_Activitydiagram_ActivityNode_Execute_FillEvent_Trace(), this.getActivitydiagram_ActivityNode_Execute_FillEvent(), null, "Activitydiagram_ActivityNode_Execute_FillEvent_Trace", null, 0, -1, Steps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSteps_Activitydiagram_ActivityNode_TakeOfferdTokens1_FillEvent_Trace(), this.getActivitydiagram_ActivityNode_TakeOfferdTokens1_FillEvent(), null, "Activitydiagram_ActivityNode_TakeOfferdTokens1_FillEvent_Trace", null, 0, -1, Steps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSteps_Activitydiagram_ActivityNode_RemoveToken1_Trace(), this.getActivitydiagram_ActivityNode_RemoveToken1(), null, "Activitydiagram_ActivityNode_RemoveToken1_Trace", null, 0, -1, Steps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSteps_Activitydiagram_ActivityNode_AddTokens1_FillEvent_Trace(), this.getActivitydiagram_ActivityNode_AddTokens1_FillEvent(), null, "Activitydiagram_ActivityNode_AddTokens1_FillEvent_Trace", null, 0, -1, Steps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSteps_Activitydiagram_Variable_Execute_Trace(), this.getActivitydiagram_Variable_Execute(), null, "Activitydiagram_Variable_Execute_Trace", null, 0, -1, Steps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSteps_Activitydiagram_ActivityNode_HasOffers1_Trace(), this.getActivitydiagram_ActivityNode_HasOffers1(), null, "Activitydiagram_ActivityNode_HasOffers1_Trace", null, 0, -1, Steps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSteps_Activitydiagram_Activity_InitializeContext_Trace(), this.getActivitydiagram_Activity_InitializeContext(), null, "Activitydiagram_Activity_InitializeContext_Trace", null, 0, -1, Steps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSteps_Activitydiagram_Variable_Init_Trace(), this.getActivitydiagram_Variable_Init(), null, "Activitydiagram_Variable_Init_Trace", null, 0, -1, Steps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSteps_Activitydiagram_ActivityNode_IsReady_Trace(), this.getActivitydiagram_ActivityNode_IsReady(), null, "Activitydiagram_ActivityNode_IsReady_Trace", null, 0, -1, Steps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSteps_Activitydiagram_Variable_Print_Trace(), this.getActivitydiagram_Variable_Print(), null, "Activitydiagram_Variable_Print_Trace", null, 0, -1, Steps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSteps_FillEvent_Trace(), this.getFillEvent(), null, "FillEvent_Trace", null, 0, -1, Steps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSteps_Activitydiagram_ActivityNode_Execute_Trace(), this.getActivitydiagram_ActivityNode_Execute(), null, "Activitydiagram_ActivityNode_Execute_Trace", null, 0, -1, Steps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSteps_Activitydiagram_ActivityNode_TakeOfferdTokens1_Trace(), this.getActivitydiagram_ActivityNode_TakeOfferdTokens1(), null, "Activitydiagram_ActivityNode_TakeOfferdTokens1_Trace", null, 0, -1, Steps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSteps_Activitydiagram_ActivityNode_AddTokens1_Trace(), this.getActivitydiagram_ActivityNode_AddTokens1(), null, "Activitydiagram_ActivityNode_AddTokens1_Trace", null, 0, -1, Steps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bigStepEClass, BigStep.class, "BigStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBigStep_StartingState(), theActivitydiagramTracePackage.getState(), theActivitydiagramTracePackage.getState_StartedBigSteps(), "startingState", null, 1, 1, BigStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBigStep_EndingState(), theActivitydiagramTracePackage.getState(), theActivitydiagramTracePackage.getState_EndedBigSteps(), "endingState", null, 0, 1, BigStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activitydiagram_ActivityNode_TerminateEClass, Activitydiagram_ActivityNode_Terminate.class, "Activitydiagram_ActivityNode_Terminate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivitydiagram_ActivityNode_Terminate_This(), theActivitydiagramPackage_1.getTracedActivityNode(), null, "this", null, 0, 1, Activitydiagram_ActivityNode_Terminate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activitydiagram_ActivityNode_SendOffers1EClass, Activitydiagram_ActivityNode_SendOffers1.class, "Activitydiagram_ActivityNode_SendOffers1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivitydiagram_ActivityNode_SendOffers1_This(), theActivitydiagramPackage_1.getTracedActivityNode(), null, "this", null, 0, 1, Activitydiagram_ActivityNode_SendOffers1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activitydiagram_ActivityNode_Execute_AbstractSubEventEClass, Activitydiagram_ActivityNode_Execute_AbstractSubEvent.class, "Activitydiagram_ActivityNode_Execute_AbstractSubEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activitydiagram_ActivityNode_Execute_FillEventEClass, Activitydiagram_ActivityNode_Execute_FillEvent.class, "Activitydiagram_ActivityNode_Execute_FillEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubEventEClass, Activitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubEvent.class, "Activitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activitydiagram_ActivityNode_TakeOfferdTokens1_FillEventEClass, Activitydiagram_ActivityNode_TakeOfferdTokens1_FillEvent.class, "Activitydiagram_ActivityNode_TakeOfferdTokens1_FillEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activitydiagram_ActivityNode_RemoveToken1EClass, Activitydiagram_ActivityNode_RemoveToken1.class, "Activitydiagram_ActivityNode_RemoveToken1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivitydiagram_ActivityNode_RemoveToken1_This(), theActivitydiagramPackage_1.getTracedActivityNode(), null, "this", null, 0, 1, Activitydiagram_ActivityNode_RemoveToken1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activitydiagram_ActivityNode_AddTokens1_AbstractSubEventEClass, Activitydiagram_ActivityNode_AddTokens1_AbstractSubEvent.class, "Activitydiagram_ActivityNode_AddTokens1_AbstractSubEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activitydiagram_ActivityNode_AddTokens1_FillEventEClass, Activitydiagram_ActivityNode_AddTokens1_FillEvent.class, "Activitydiagram_ActivityNode_AddTokens1_FillEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activitydiagram_Variable_ExecuteEClass, Activitydiagram_Variable_Execute.class, "Activitydiagram_Variable_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivitydiagram_Variable_Execute_This(), theActivitydiagramPackage_1.getTracedVariable(), null, "this", null, 0, 1, Activitydiagram_Variable_Execute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activitydiagram_ActivityNode_HasOffers1EClass, Activitydiagram_ActivityNode_HasOffers1.class, "Activitydiagram_ActivityNode_HasOffers1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivitydiagram_ActivityNode_HasOffers1_This(), theActivitydiagramPackage_1.getTracedActivityNode(), null, "this", null, 0, 1, Activitydiagram_ActivityNode_HasOffers1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activitydiagram_Activity_InitializeContextEClass, Activitydiagram_Activity_InitializeContext.class, "Activitydiagram_Activity_InitializeContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivitydiagram_Activity_InitializeContext_This(), theActivitydiagramPackage_1.getTracedActivity(), null, "this", null, 0, 1, Activitydiagram_Activity_InitializeContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activitydiagram_Variable_InitEClass, Activitydiagram_Variable_Init.class, "Activitydiagram_Variable_Init", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivitydiagram_Variable_Init_This(), theActivitydiagramPackage_1.getTracedVariable(), null, "this", null, 0, 1, Activitydiagram_Variable_Init.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activitydiagram_ActivityNode_IsReadyEClass, Activitydiagram_ActivityNode_IsReady.class, "Activitydiagram_ActivityNode_IsReady", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivitydiagram_ActivityNode_IsReady_This(), theActivitydiagramPackage_1.getTracedActivityNode(), null, "this", null, 0, 1, Activitydiagram_ActivityNode_IsReady.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activitydiagram_Variable_PrintEClass, Activitydiagram_Variable_Print.class, "Activitydiagram_Variable_Print", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivitydiagram_Variable_Print_This(), theActivitydiagramPackage_1.getTracedVariable(), null, "this", null, 0, 1, Activitydiagram_Variable_Print.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fillEventEClass, FillEvent.class, "FillEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activitydiagram_ActivityNode_ExecuteEClass, Activitydiagram_ActivityNode_Execute.class, "Activitydiagram_ActivityNode_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivitydiagram_ActivityNode_Execute_This(), theActivitydiagramPackage_1.getTracedActivityNode(), null, "this", null, 0, 1, Activitydiagram_ActivityNode_Execute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivitydiagram_ActivityNode_Execute_SubSteps(), this.getActivitydiagram_ActivityNode_Execute_AbstractSubEvent(), null, "subSteps", null, 0, -1, Activitydiagram_ActivityNode_Execute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activitydiagram_ActivityNode_TakeOfferdTokens1EClass, Activitydiagram_ActivityNode_TakeOfferdTokens1.class, "Activitydiagram_ActivityNode_TakeOfferdTokens1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivitydiagram_ActivityNode_TakeOfferdTokens1_This(), theActivitydiagramPackage_1.getTracedActivityNode(), null, "this", null, 0, 1, Activitydiagram_ActivityNode_TakeOfferdTokens1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivitydiagram_ActivityNode_TakeOfferdTokens1_SubSteps(), this.getActivitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubEvent(), null, "subSteps", null, 0, -1, Activitydiagram_ActivityNode_TakeOfferdTokens1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activitydiagram_ActivityNode_AddTokens1EClass, Activitydiagram_ActivityNode_AddTokens1.class, "Activitydiagram_ActivityNode_AddTokens1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivitydiagram_ActivityNode_AddTokens1_This(), theActivitydiagramPackage_1.getTracedActivityNode(), null, "this", null, 0, 1, Activitydiagram_ActivityNode_AddTokens1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivitydiagram_ActivityNode_AddTokens1_SubSteps(), this.getActivitydiagram_ActivityNode_AddTokens1_AbstractSubEvent(), null, "subSteps", null, 0, -1, Activitydiagram_ActivityNode_AddTokens1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //StepsPackageImpl
