/**
 */
package activitydiagramTrace.Steps.impl;

import activitydiagram.ActivitydiagramPackage;

import activitydiagramTrace.ActivitydiagramTracePackage;

import activitydiagramTrace.States.StatesPackage;

import activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl;

import activitydiagramTrace.States.impl.StatesPackageImpl;

import activitydiagramTrace.Steps.Activitydiagram_ActivityFinalNode_Execute;
import activitydiagramTrace.Steps.Activitydiagram_ActivityFinalNode_Execute_AbstractSubStep;
import activitydiagramTrace.Steps.Activitydiagram_ActivityFinalNode_Execute_ImplicitStep;
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
import activitydiagramTrace.Steps.Activitydiagram_BooleanBinaryExpression_Execute;
import activitydiagramTrace.Steps.Activitydiagram_BooleanUnaryExpression_Execute;
import activitydiagramTrace.Steps.Activitydiagram_BooleanVariable_Execute;
import activitydiagramTrace.Steps.Activitydiagram_BooleanVariable_Execute_AbstractSubStep;
import activitydiagramTrace.Steps.Activitydiagram_BooleanVariable_Execute_ImplicitStep;
import activitydiagramTrace.Steps.Activitydiagram_BooleanVariable_Init;
import activitydiagramTrace.Steps.Activitydiagram_DecisionNode_Execute;
import activitydiagramTrace.Steps.Activitydiagram_DecisionNode_Execute_AbstractSubStep;
import activitydiagramTrace.Steps.Activitydiagram_DecisionNode_Execute_ImplicitStep;
import activitydiagramTrace.Steps.Activitydiagram_DecisionNode_SendOffers1;
import activitydiagramTrace.Steps.Activitydiagram_Expression_Execute;
import activitydiagramTrace.Steps.Activitydiagram_ForkNode_Execute;
import activitydiagramTrace.Steps.Activitydiagram_ForkNode_Execute_AbstractSubStep;
import activitydiagramTrace.Steps.Activitydiagram_ForkNode_Execute_ImplicitStep;
import activitydiagramTrace.Steps.Activitydiagram_InitialNode_Execute;
import activitydiagramTrace.Steps.Activitydiagram_InitialNode_Execute_AbstractSubStep;
import activitydiagramTrace.Steps.Activitydiagram_InitialNode_Execute_ImplicitStep;
import activitydiagramTrace.Steps.Activitydiagram_IntegerCalculationExpression_Execute;
import activitydiagramTrace.Steps.Activitydiagram_IntegerComparisonExpression_Execute;
import activitydiagramTrace.Steps.Activitydiagram_IntegerVariable_Execute;
import activitydiagramTrace.Steps.Activitydiagram_IntegerVariable_Init;
import activitydiagramTrace.Steps.Activitydiagram_JoinNode_Execute;
import activitydiagramTrace.Steps.Activitydiagram_JoinNode_Execute_AbstractSubStep;
import activitydiagramTrace.Steps.Activitydiagram_JoinNode_Execute_ImplicitStep;
import activitydiagramTrace.Steps.Activitydiagram_MergeNode_Execute;
import activitydiagramTrace.Steps.Activitydiagram_MergeNode_Execute_AbstractSubStep;
import activitydiagramTrace.Steps.Activitydiagram_MergeNode_Execute_ImplicitStep;
import activitydiagramTrace.Steps.Activitydiagram_NamedElement_Execute;
import activitydiagramTrace.Steps.Activitydiagram_NamedElement_Execute_AbstractSubStep;
import activitydiagramTrace.Steps.Activitydiagram_NamedElement_Execute_ImplicitStep;
import activitydiagramTrace.Steps.Activitydiagram_OpaqueAction_Execute;
import activitydiagramTrace.Steps.Activitydiagram_OpaqueAction_Execute_AbstractSubStep;
import activitydiagramTrace.Steps.Activitydiagram_OpaqueAction_Execute_ImplicitStep;
import activitydiagramTrace.Steps.RootImplicitStep;
import activitydiagramTrace.Steps.SpecificStep;
import activitydiagramTrace.Steps.StepsFactory;
import activitydiagramTrace.Steps.StepsPackage;

import activitydiagramTrace.impl.ActivitydiagramTracePackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gemoc.executionframework.engine.mse.MsePackage;

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
	private EClass activitydiagram_ActivityFinalNode_ExecuteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitydiagram_ActivityFinalNode_Execute_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitydiagram_ActivityFinalNode_Execute_ImplicitStepEClass = null;

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
	private EClass activitydiagram_ActivityNode_RemoveToken1EClass = null;

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
	private EClass activitydiagram_ActivityNode_TerminateEClass = null;

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
	private EClass activitydiagram_Activity_InitializeContextEClass = null;

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
	private EClass activitydiagram_Activity_WriteTrace_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitydiagram_BooleanBinaryExpression_ExecuteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitydiagram_BooleanUnaryExpression_ExecuteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitydiagram_BooleanVariable_ExecuteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitydiagram_BooleanVariable_Execute_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitydiagram_BooleanVariable_Execute_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitydiagram_BooleanVariable_InitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitydiagram_DecisionNode_ExecuteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitydiagram_DecisionNode_Execute_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitydiagram_DecisionNode_Execute_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitydiagram_DecisionNode_SendOffers1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitydiagram_Expression_ExecuteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitydiagram_ForkNode_ExecuteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitydiagram_ForkNode_Execute_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitydiagram_ForkNode_Execute_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitydiagram_InitialNode_ExecuteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitydiagram_InitialNode_Execute_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitydiagram_InitialNode_Execute_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitydiagram_IntegerCalculationExpression_ExecuteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitydiagram_IntegerComparisonExpression_ExecuteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitydiagram_IntegerVariable_ExecuteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitydiagram_IntegerVariable_InitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitydiagram_JoinNode_ExecuteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitydiagram_JoinNode_Execute_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitydiagram_JoinNode_Execute_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitydiagram_MergeNode_ExecuteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitydiagram_MergeNode_Execute_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitydiagram_MergeNode_Execute_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitydiagram_NamedElement_ExecuteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitydiagram_NamedElement_Execute_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitydiagram_NamedElement_Execute_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitydiagram_OpaqueAction_ExecuteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitydiagram_OpaqueAction_Execute_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitydiagram_OpaqueAction_Execute_ImplicitStepEClass = null;

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
	private EClass specificStepEClass = null;

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
		MsePackage.eINSTANCE.eClass();

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
	public EClass getActivitydiagram_ActivityFinalNode_Execute() {
		return activitydiagram_ActivityFinalNode_ExecuteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivitydiagram_ActivityFinalNode_Execute__GetCaller() {
		return activitydiagram_ActivityFinalNode_ExecuteEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivitydiagram_ActivityFinalNode_Execute_AbstractSubStep() {
		return activitydiagram_ActivityFinalNode_Execute_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivitydiagram_ActivityFinalNode_Execute_ImplicitStep() {
		return activitydiagram_ActivityFinalNode_Execute_ImplicitStepEClass;
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
	public EOperation getActivitydiagram_ActivityNode_AddTokens1__GetCaller() {
		return activitydiagram_ActivityNode_AddTokens1EClass.getEOperations().get(0);
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
	public EClass getActivitydiagram_ActivityNode_Execute() {
		return activitydiagram_ActivityNode_ExecuteEClass;
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
	public EOperation getActivitydiagram_ActivityNode_TakeOfferdTokens1__GetCaller() {
		return activitydiagram_ActivityNode_TakeOfferdTokens1EClass.getEOperations().get(0);
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
	public EClass getActivitydiagram_Activity_Execute() {
		return activitydiagram_Activity_ExecuteEClass;
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
	public EClass getActivitydiagram_Activity_WriteTrace() {
		return activitydiagram_Activity_WriteTraceEClass;
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
	public EClass getActivitydiagram_BooleanBinaryExpression_Execute() {
		return activitydiagram_BooleanBinaryExpression_ExecuteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivitydiagram_BooleanBinaryExpression_Execute__GetCaller() {
		return activitydiagram_BooleanBinaryExpression_ExecuteEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivitydiagram_BooleanUnaryExpression_Execute() {
		return activitydiagram_BooleanUnaryExpression_ExecuteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivitydiagram_BooleanUnaryExpression_Execute__GetCaller() {
		return activitydiagram_BooleanUnaryExpression_ExecuteEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivitydiagram_BooleanVariable_Execute() {
		return activitydiagram_BooleanVariable_ExecuteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivitydiagram_BooleanVariable_Execute__GetCaller() {
		return activitydiagram_BooleanVariable_ExecuteEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivitydiagram_BooleanVariable_Execute_AbstractSubStep() {
		return activitydiagram_BooleanVariable_Execute_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivitydiagram_BooleanVariable_Execute_ImplicitStep() {
		return activitydiagram_BooleanVariable_Execute_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivitydiagram_BooleanVariable_Init() {
		return activitydiagram_BooleanVariable_InitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivitydiagram_BooleanVariable_Init__GetCaller() {
		return activitydiagram_BooleanVariable_InitEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivitydiagram_DecisionNode_Execute() {
		return activitydiagram_DecisionNode_ExecuteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivitydiagram_DecisionNode_Execute__GetCaller() {
		return activitydiagram_DecisionNode_ExecuteEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivitydiagram_DecisionNode_Execute_AbstractSubStep() {
		return activitydiagram_DecisionNode_Execute_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivitydiagram_DecisionNode_Execute_ImplicitStep() {
		return activitydiagram_DecisionNode_Execute_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivitydiagram_DecisionNode_SendOffers1() {
		return activitydiagram_DecisionNode_SendOffers1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivitydiagram_DecisionNode_SendOffers1__GetCaller() {
		return activitydiagram_DecisionNode_SendOffers1EClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivitydiagram_Expression_Execute() {
		return activitydiagram_Expression_ExecuteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivitydiagram_Expression_Execute__GetCaller() {
		return activitydiagram_Expression_ExecuteEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivitydiagram_ForkNode_Execute() {
		return activitydiagram_ForkNode_ExecuteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivitydiagram_ForkNode_Execute__GetCaller() {
		return activitydiagram_ForkNode_ExecuteEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivitydiagram_ForkNode_Execute_AbstractSubStep() {
		return activitydiagram_ForkNode_Execute_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivitydiagram_ForkNode_Execute_ImplicitStep() {
		return activitydiagram_ForkNode_Execute_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivitydiagram_InitialNode_Execute() {
		return activitydiagram_InitialNode_ExecuteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivitydiagram_InitialNode_Execute__GetCaller() {
		return activitydiagram_InitialNode_ExecuteEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivitydiagram_InitialNode_Execute_AbstractSubStep() {
		return activitydiagram_InitialNode_Execute_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivitydiagram_InitialNode_Execute_ImplicitStep() {
		return activitydiagram_InitialNode_Execute_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivitydiagram_IntegerCalculationExpression_Execute() {
		return activitydiagram_IntegerCalculationExpression_ExecuteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivitydiagram_IntegerCalculationExpression_Execute__GetCaller() {
		return activitydiagram_IntegerCalculationExpression_ExecuteEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivitydiagram_IntegerComparisonExpression_Execute() {
		return activitydiagram_IntegerComparisonExpression_ExecuteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivitydiagram_IntegerComparisonExpression_Execute__GetCaller() {
		return activitydiagram_IntegerComparisonExpression_ExecuteEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivitydiagram_IntegerVariable_Execute() {
		return activitydiagram_IntegerVariable_ExecuteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivitydiagram_IntegerVariable_Execute__GetCaller() {
		return activitydiagram_IntegerVariable_ExecuteEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivitydiagram_IntegerVariable_Init() {
		return activitydiagram_IntegerVariable_InitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivitydiagram_IntegerVariable_Init__GetCaller() {
		return activitydiagram_IntegerVariable_InitEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivitydiagram_JoinNode_Execute() {
		return activitydiagram_JoinNode_ExecuteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivitydiagram_JoinNode_Execute__GetCaller() {
		return activitydiagram_JoinNode_ExecuteEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivitydiagram_JoinNode_Execute_AbstractSubStep() {
		return activitydiagram_JoinNode_Execute_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivitydiagram_JoinNode_Execute_ImplicitStep() {
		return activitydiagram_JoinNode_Execute_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivitydiagram_MergeNode_Execute() {
		return activitydiagram_MergeNode_ExecuteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivitydiagram_MergeNode_Execute__GetCaller() {
		return activitydiagram_MergeNode_ExecuteEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivitydiagram_MergeNode_Execute_AbstractSubStep() {
		return activitydiagram_MergeNode_Execute_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivitydiagram_MergeNode_Execute_ImplicitStep() {
		return activitydiagram_MergeNode_Execute_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivitydiagram_NamedElement_Execute() {
		return activitydiagram_NamedElement_ExecuteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivitydiagram_NamedElement_Execute__GetCaller() {
		return activitydiagram_NamedElement_ExecuteEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivitydiagram_NamedElement_Execute_AbstractSubStep() {
		return activitydiagram_NamedElement_Execute_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivitydiagram_NamedElement_Execute_ImplicitStep() {
		return activitydiagram_NamedElement_Execute_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivitydiagram_OpaqueAction_Execute() {
		return activitydiagram_OpaqueAction_ExecuteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivitydiagram_OpaqueAction_Execute__GetCaller() {
		return activitydiagram_OpaqueAction_ExecuteEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivitydiagram_OpaqueAction_Execute_AbstractSubStep() {
		return activitydiagram_OpaqueAction_Execute_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivitydiagram_OpaqueAction_Execute_ImplicitStep() {
		return activitydiagram_OpaqueAction_Execute_ImplicitStepEClass;
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
	public EClass getSpecificStep() {
		return specificStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificStep_EndingState() {
		return (EReference)specificStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificStep_StartingState() {
		return (EReference)specificStepEClass.getEStructuralFeatures().get(1);
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
		activitydiagram_ActivityFinalNode_ExecuteEClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_FINAL_NODE_EXECUTE);
		createEOperation(activitydiagram_ActivityFinalNode_ExecuteEClass, ACTIVITYDIAGRAM_ACTIVITY_FINAL_NODE_EXECUTE___GET_CALLER);

		activitydiagram_ActivityFinalNode_Execute_AbstractSubStepEClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_FINAL_NODE_EXECUTE_ABSTRACT_SUB_STEP);

		activitydiagram_ActivityFinalNode_Execute_ImplicitStepEClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_FINAL_NODE_EXECUTE_IMPLICIT_STEP);

		activitydiagram_ActivityNode_AddTokens1EClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1);
		createEOperation(activitydiagram_ActivityNode_AddTokens1EClass, ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1___GET_CALLER);

		activitydiagram_ActivityNode_AddTokens1_AbstractSubStepEClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_ABSTRACT_SUB_STEP);

		activitydiagram_ActivityNode_AddTokens1_ImplicitStepEClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_IMPLICIT_STEP);

		activitydiagram_ActivityNode_ExecuteEClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE);
		createEOperation(activitydiagram_ActivityNode_ExecuteEClass, ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE___GET_CALLER);

		activitydiagram_ActivityNode_Execute_AbstractSubStepEClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_STEP);

		activitydiagram_ActivityNode_Execute_ImplicitStepEClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_IMPLICIT_STEP);

		activitydiagram_ActivityNode_RemoveToken1EClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN1);
		createEOperation(activitydiagram_ActivityNode_RemoveToken1EClass, ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN1___GET_CALLER);

		activitydiagram_ActivityNode_SendOffers1EClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1);
		createEOperation(activitydiagram_ActivityNode_SendOffers1EClass, ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1___GET_CALLER);

		activitydiagram_ActivityNode_TakeOfferdTokens1EClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1);
		createEOperation(activitydiagram_ActivityNode_TakeOfferdTokens1EClass, ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1___GET_CALLER);

		activitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStepEClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_ABSTRACT_SUB_STEP);

		activitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStepEClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_IMPLICIT_STEP);

		activitydiagram_ActivityNode_TerminateEClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE);
		createEOperation(activitydiagram_ActivityNode_TerminateEClass, ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE___GET_CALLER);

		activitydiagram_Activity_ExecuteEClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_EXECUTE);
		createEOperation(activitydiagram_Activity_ExecuteEClass, ACTIVITYDIAGRAM_ACTIVITY_EXECUTE___GET_CALLER);

		activitydiagram_Activity_Execute_AbstractSubStepEClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP);

		activitydiagram_Activity_Execute_ImplicitStepEClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_IMPLICIT_STEP);

		activitydiagram_Activity_InitializeContextEClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_INITIALIZE_CONTEXT);
		createEOperation(activitydiagram_Activity_InitializeContextEClass, ACTIVITYDIAGRAM_ACTIVITY_INITIALIZE_CONTEXT___GET_CALLER);

		activitydiagram_Activity_ResetEClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_RESET);
		createEOperation(activitydiagram_Activity_ResetEClass, ACTIVITYDIAGRAM_ACTIVITY_RESET___GET_CALLER);

		activitydiagram_Activity_WriteTraceEClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE);
		createEOperation(activitydiagram_Activity_WriteTraceEClass, ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE___GET_CALLER);

		activitydiagram_Activity_WriteTrace_AbstractSubStepEClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_ABSTRACT_SUB_STEP);

		activitydiagram_Activity_WriteTrace_ImplicitStepEClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_IMPLICIT_STEP);

		activitydiagram_BooleanBinaryExpression_ExecuteEClass = createEClass(ACTIVITYDIAGRAM_BOOLEAN_BINARY_EXPRESSION_EXECUTE);
		createEOperation(activitydiagram_BooleanBinaryExpression_ExecuteEClass, ACTIVITYDIAGRAM_BOOLEAN_BINARY_EXPRESSION_EXECUTE___GET_CALLER);

		activitydiagram_BooleanUnaryExpression_ExecuteEClass = createEClass(ACTIVITYDIAGRAM_BOOLEAN_UNARY_EXPRESSION_EXECUTE);
		createEOperation(activitydiagram_BooleanUnaryExpression_ExecuteEClass, ACTIVITYDIAGRAM_BOOLEAN_UNARY_EXPRESSION_EXECUTE___GET_CALLER);

		activitydiagram_BooleanVariable_ExecuteEClass = createEClass(ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_EXECUTE);
		createEOperation(activitydiagram_BooleanVariable_ExecuteEClass, ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_EXECUTE___GET_CALLER);

		activitydiagram_BooleanVariable_Execute_AbstractSubStepEClass = createEClass(ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_EXECUTE_ABSTRACT_SUB_STEP);

		activitydiagram_BooleanVariable_Execute_ImplicitStepEClass = createEClass(ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_EXECUTE_IMPLICIT_STEP);

		activitydiagram_BooleanVariable_InitEClass = createEClass(ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_INIT);
		createEOperation(activitydiagram_BooleanVariable_InitEClass, ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_INIT___GET_CALLER);

		activitydiagram_DecisionNode_ExecuteEClass = createEClass(ACTIVITYDIAGRAM_DECISION_NODE_EXECUTE);
		createEOperation(activitydiagram_DecisionNode_ExecuteEClass, ACTIVITYDIAGRAM_DECISION_NODE_EXECUTE___GET_CALLER);

		activitydiagram_DecisionNode_Execute_AbstractSubStepEClass = createEClass(ACTIVITYDIAGRAM_DECISION_NODE_EXECUTE_ABSTRACT_SUB_STEP);

		activitydiagram_DecisionNode_Execute_ImplicitStepEClass = createEClass(ACTIVITYDIAGRAM_DECISION_NODE_EXECUTE_IMPLICIT_STEP);

		activitydiagram_DecisionNode_SendOffers1EClass = createEClass(ACTIVITYDIAGRAM_DECISION_NODE_SEND_OFFERS1);
		createEOperation(activitydiagram_DecisionNode_SendOffers1EClass, ACTIVITYDIAGRAM_DECISION_NODE_SEND_OFFERS1___GET_CALLER);

		activitydiagram_Expression_ExecuteEClass = createEClass(ACTIVITYDIAGRAM_EXPRESSION_EXECUTE);
		createEOperation(activitydiagram_Expression_ExecuteEClass, ACTIVITYDIAGRAM_EXPRESSION_EXECUTE___GET_CALLER);

		activitydiagram_ForkNode_ExecuteEClass = createEClass(ACTIVITYDIAGRAM_FORK_NODE_EXECUTE);
		createEOperation(activitydiagram_ForkNode_ExecuteEClass, ACTIVITYDIAGRAM_FORK_NODE_EXECUTE___GET_CALLER);

		activitydiagram_ForkNode_Execute_AbstractSubStepEClass = createEClass(ACTIVITYDIAGRAM_FORK_NODE_EXECUTE_ABSTRACT_SUB_STEP);

		activitydiagram_ForkNode_Execute_ImplicitStepEClass = createEClass(ACTIVITYDIAGRAM_FORK_NODE_EXECUTE_IMPLICIT_STEP);

		activitydiagram_InitialNode_ExecuteEClass = createEClass(ACTIVITYDIAGRAM_INITIAL_NODE_EXECUTE);
		createEOperation(activitydiagram_InitialNode_ExecuteEClass, ACTIVITYDIAGRAM_INITIAL_NODE_EXECUTE___GET_CALLER);

		activitydiagram_InitialNode_Execute_AbstractSubStepEClass = createEClass(ACTIVITYDIAGRAM_INITIAL_NODE_EXECUTE_ABSTRACT_SUB_STEP);

		activitydiagram_InitialNode_Execute_ImplicitStepEClass = createEClass(ACTIVITYDIAGRAM_INITIAL_NODE_EXECUTE_IMPLICIT_STEP);

		activitydiagram_IntegerCalculationExpression_ExecuteEClass = createEClass(ACTIVITYDIAGRAM_INTEGER_CALCULATION_EXPRESSION_EXECUTE);
		createEOperation(activitydiagram_IntegerCalculationExpression_ExecuteEClass, ACTIVITYDIAGRAM_INTEGER_CALCULATION_EXPRESSION_EXECUTE___GET_CALLER);

		activitydiagram_IntegerComparisonExpression_ExecuteEClass = createEClass(ACTIVITYDIAGRAM_INTEGER_COMPARISON_EXPRESSION_EXECUTE);
		createEOperation(activitydiagram_IntegerComparisonExpression_ExecuteEClass, ACTIVITYDIAGRAM_INTEGER_COMPARISON_EXPRESSION_EXECUTE___GET_CALLER);

		activitydiagram_IntegerVariable_ExecuteEClass = createEClass(ACTIVITYDIAGRAM_INTEGER_VARIABLE_EXECUTE);
		createEOperation(activitydiagram_IntegerVariable_ExecuteEClass, ACTIVITYDIAGRAM_INTEGER_VARIABLE_EXECUTE___GET_CALLER);

		activitydiagram_IntegerVariable_InitEClass = createEClass(ACTIVITYDIAGRAM_INTEGER_VARIABLE_INIT);
		createEOperation(activitydiagram_IntegerVariable_InitEClass, ACTIVITYDIAGRAM_INTEGER_VARIABLE_INIT___GET_CALLER);

		activitydiagram_JoinNode_ExecuteEClass = createEClass(ACTIVITYDIAGRAM_JOIN_NODE_EXECUTE);
		createEOperation(activitydiagram_JoinNode_ExecuteEClass, ACTIVITYDIAGRAM_JOIN_NODE_EXECUTE___GET_CALLER);

		activitydiagram_JoinNode_Execute_AbstractSubStepEClass = createEClass(ACTIVITYDIAGRAM_JOIN_NODE_EXECUTE_ABSTRACT_SUB_STEP);

		activitydiagram_JoinNode_Execute_ImplicitStepEClass = createEClass(ACTIVITYDIAGRAM_JOIN_NODE_EXECUTE_IMPLICIT_STEP);

		activitydiagram_MergeNode_ExecuteEClass = createEClass(ACTIVITYDIAGRAM_MERGE_NODE_EXECUTE);
		createEOperation(activitydiagram_MergeNode_ExecuteEClass, ACTIVITYDIAGRAM_MERGE_NODE_EXECUTE___GET_CALLER);

		activitydiagram_MergeNode_Execute_AbstractSubStepEClass = createEClass(ACTIVITYDIAGRAM_MERGE_NODE_EXECUTE_ABSTRACT_SUB_STEP);

		activitydiagram_MergeNode_Execute_ImplicitStepEClass = createEClass(ACTIVITYDIAGRAM_MERGE_NODE_EXECUTE_IMPLICIT_STEP);

		activitydiagram_NamedElement_ExecuteEClass = createEClass(ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE);
		createEOperation(activitydiagram_NamedElement_ExecuteEClass, ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE___GET_CALLER);

		activitydiagram_NamedElement_Execute_AbstractSubStepEClass = createEClass(ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP);

		activitydiagram_NamedElement_Execute_ImplicitStepEClass = createEClass(ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_IMPLICIT_STEP);

		activitydiagram_OpaqueAction_ExecuteEClass = createEClass(ACTIVITYDIAGRAM_OPAQUE_ACTION_EXECUTE);
		createEOperation(activitydiagram_OpaqueAction_ExecuteEClass, ACTIVITYDIAGRAM_OPAQUE_ACTION_EXECUTE___GET_CALLER);

		activitydiagram_OpaqueAction_Execute_AbstractSubStepEClass = createEClass(ACTIVITYDIAGRAM_OPAQUE_ACTION_EXECUTE_ABSTRACT_SUB_STEP);

		activitydiagram_OpaqueAction_Execute_ImplicitStepEClass = createEClass(ACTIVITYDIAGRAM_OPAQUE_ACTION_EXECUTE_IMPLICIT_STEP);

		rootImplicitStepEClass = createEClass(ROOT_IMPLICIT_STEP);

		specificStepEClass = createEClass(SPECIFIC_STEP);
		createEReference(specificStepEClass, SPECIFIC_STEP__ENDING_STATE);
		createEReference(specificStepEClass, SPECIFIC_STEP__STARTING_STATE);
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
		MsePackage theMsePackage = (MsePackage)EPackage.Registry.INSTANCE.getEPackage(MsePackage.eNS_URI);
		activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage theActivitydiagramPackage_1 = (activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage)EPackage.Registry.INSTANCE.getEPackage(activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage.eNS_URI);
		ActivitydiagramPackage theActivitydiagramPackage = (ActivitydiagramPackage)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI);
		StatesPackage theStatesPackage = (StatesPackage)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(this.getActivitydiagram_NamedElement_Execute_AbstractSubStep());
		activitydiagram_ActivityFinalNode_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificStep());
		activitydiagram_ActivityFinalNode_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theMsePackage.getSequentialStep());
		EGenericType g2 = createEGenericType(this.getActivitydiagram_ActivityFinalNode_Execute_AbstractSubStep());
		g1.getETypeArguments().add(g2);
		activitydiagram_ActivityFinalNode_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getActivitydiagram_Activity_Execute_AbstractSubStep());
		activitydiagram_ActivityFinalNode_ExecuteEClass.getEGenericSuperTypes().add(g1);
		activitydiagram_ActivityFinalNode_Execute_AbstractSubStepEClass.getESuperTypes().add(this.getSpecificStep());
		activitydiagram_ActivityFinalNode_Execute_ImplicitStepEClass.getESuperTypes().add(this.getActivitydiagram_ActivityFinalNode_Execute_AbstractSubStep());
		activitydiagram_ActivityFinalNode_Execute_ImplicitStepEClass.getESuperTypes().add(theMsePackage.getSmallStep());
		g1 = createEGenericType(this.getSpecificStep());
		activitydiagram_ActivityNode_AddTokens1EClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theMsePackage.getSequentialStep());
		g2 = createEGenericType(this.getActivitydiagram_ActivityNode_AddTokens1_AbstractSubStep());
		g1.getETypeArguments().add(g2);
		activitydiagram_ActivityNode_AddTokens1EClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getActivitydiagram_NamedElement_Execute_AbstractSubStep());
		activitydiagram_ActivityNode_AddTokens1EClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getActivitydiagram_ActivityNode_Execute_AbstractSubStep());
		activitydiagram_ActivityNode_AddTokens1EClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getActivitydiagram_ForkNode_Execute_AbstractSubStep());
		activitydiagram_ActivityNode_AddTokens1EClass.getEGenericSuperTypes().add(g1);
		activitydiagram_ActivityNode_AddTokens1_AbstractSubStepEClass.getESuperTypes().add(this.getSpecificStep());
		activitydiagram_ActivityNode_AddTokens1_ImplicitStepEClass.getESuperTypes().add(this.getActivitydiagram_ActivityNode_AddTokens1_AbstractSubStep());
		activitydiagram_ActivityNode_AddTokens1_ImplicitStepEClass.getESuperTypes().add(theMsePackage.getSmallStep());
		g1 = createEGenericType(this.getActivitydiagram_NamedElement_Execute_AbstractSubStep());
		activitydiagram_ActivityNode_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificStep());
		activitydiagram_ActivityNode_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theMsePackage.getSequentialStep());
		g2 = createEGenericType(this.getActivitydiagram_ActivityNode_Execute_AbstractSubStep());
		g1.getETypeArguments().add(g2);
		activitydiagram_ActivityNode_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getActivitydiagram_Activity_Execute_AbstractSubStep());
		activitydiagram_ActivityNode_ExecuteEClass.getEGenericSuperTypes().add(g1);
		activitydiagram_ActivityNode_Execute_AbstractSubStepEClass.getESuperTypes().add(this.getSpecificStep());
		activitydiagram_ActivityNode_Execute_ImplicitStepEClass.getESuperTypes().add(this.getActivitydiagram_ActivityNode_Execute_AbstractSubStep());
		activitydiagram_ActivityNode_Execute_ImplicitStepEClass.getESuperTypes().add(theMsePackage.getSmallStep());
		activitydiagram_ActivityNode_RemoveToken1EClass.getESuperTypes().add(this.getActivitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStep());
		activitydiagram_ActivityNode_RemoveToken1EClass.getESuperTypes().add(this.getActivitydiagram_ActivityNode_AddTokens1_AbstractSubStep());
		activitydiagram_ActivityNode_RemoveToken1EClass.getESuperTypes().add(this.getSpecificStep());
		activitydiagram_ActivityNode_RemoveToken1EClass.getESuperTypes().add(theMsePackage.getSmallStep());
		activitydiagram_ActivityNode_SendOffers1EClass.getESuperTypes().add(this.getActivitydiagram_MergeNode_Execute_AbstractSubStep());
		activitydiagram_ActivityNode_SendOffers1EClass.getESuperTypes().add(this.getSpecificStep());
		activitydiagram_ActivityNode_SendOffers1EClass.getESuperTypes().add(theMsePackage.getSmallStep());
		activitydiagram_ActivityNode_SendOffers1EClass.getESuperTypes().add(this.getActivitydiagram_InitialNode_Execute_AbstractSubStep());
		activitydiagram_ActivityNode_SendOffers1EClass.getESuperTypes().add(this.getActivitydiagram_NamedElement_Execute_AbstractSubStep());
		activitydiagram_ActivityNode_SendOffers1EClass.getESuperTypes().add(this.getActivitydiagram_JoinNode_Execute_AbstractSubStep());
		activitydiagram_ActivityNode_SendOffers1EClass.getESuperTypes().add(this.getActivitydiagram_OpaqueAction_Execute_AbstractSubStep());
		activitydiagram_ActivityNode_SendOffers1EClass.getESuperTypes().add(this.getActivitydiagram_ActivityFinalNode_Execute_AbstractSubStep());
		activitydiagram_ActivityNode_SendOffers1EClass.getESuperTypes().add(this.getActivitydiagram_ActivityNode_Execute_AbstractSubStep());
		activitydiagram_ActivityNode_SendOffers1EClass.getESuperTypes().add(this.getActivitydiagram_ForkNode_Execute_AbstractSubStep());
		g1 = createEGenericType(this.getActivitydiagram_MergeNode_Execute_AbstractSubStep());
		activitydiagram_ActivityNode_TakeOfferdTokens1EClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificStep());
		activitydiagram_ActivityNode_TakeOfferdTokens1EClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theMsePackage.getSequentialStep());
		g2 = createEGenericType(this.getActivitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStep());
		g1.getETypeArguments().add(g2);
		activitydiagram_ActivityNode_TakeOfferdTokens1EClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getActivitydiagram_NamedElement_Execute_AbstractSubStep());
		activitydiagram_ActivityNode_TakeOfferdTokens1EClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getActivitydiagram_JoinNode_Execute_AbstractSubStep());
		activitydiagram_ActivityNode_TakeOfferdTokens1EClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getActivitydiagram_OpaqueAction_Execute_AbstractSubStep());
		activitydiagram_ActivityNode_TakeOfferdTokens1EClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getActivitydiagram_DecisionNode_Execute_AbstractSubStep());
		activitydiagram_ActivityNode_TakeOfferdTokens1EClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getActivitydiagram_ActivityFinalNode_Execute_AbstractSubStep());
		activitydiagram_ActivityNode_TakeOfferdTokens1EClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getActivitydiagram_ActivityNode_Execute_AbstractSubStep());
		activitydiagram_ActivityNode_TakeOfferdTokens1EClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getActivitydiagram_ForkNode_Execute_AbstractSubStep());
		activitydiagram_ActivityNode_TakeOfferdTokens1EClass.getEGenericSuperTypes().add(g1);
		activitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStepEClass.getESuperTypes().add(this.getSpecificStep());
		activitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStepEClass.getESuperTypes().add(this.getActivitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStep());
		activitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStepEClass.getESuperTypes().add(theMsePackage.getSmallStep());
		activitydiagram_ActivityNode_TerminateEClass.getESuperTypes().add(this.getSpecificStep());
		activitydiagram_ActivityNode_TerminateEClass.getESuperTypes().add(theMsePackage.getSmallStep());
		g1 = createEGenericType(this.getSpecificStep());
		activitydiagram_Activity_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theMsePackage.getSequentialStep());
		g2 = createEGenericType(this.getActivitydiagram_Activity_Execute_AbstractSubStep());
		g1.getETypeArguments().add(g2);
		activitydiagram_Activity_ExecuteEClass.getEGenericSuperTypes().add(g1);
		activitydiagram_Activity_Execute_AbstractSubStepEClass.getESuperTypes().add(this.getSpecificStep());
		activitydiagram_Activity_Execute_ImplicitStepEClass.getESuperTypes().add(this.getActivitydiagram_Activity_Execute_AbstractSubStep());
		activitydiagram_Activity_Execute_ImplicitStepEClass.getESuperTypes().add(theMsePackage.getSmallStep());
		activitydiagram_Activity_InitializeContextEClass.getESuperTypes().add(this.getSpecificStep());
		activitydiagram_Activity_InitializeContextEClass.getESuperTypes().add(theMsePackage.getSmallStep());
		activitydiagram_Activity_ResetEClass.getESuperTypes().add(this.getActivitydiagram_Activity_WriteTrace_AbstractSubStep());
		activitydiagram_Activity_ResetEClass.getESuperTypes().add(this.getSpecificStep());
		activitydiagram_Activity_ResetEClass.getESuperTypes().add(theMsePackage.getSmallStep());
		g1 = createEGenericType(this.getSpecificStep());
		activitydiagram_Activity_WriteTraceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theMsePackage.getSequentialStep());
		g2 = createEGenericType(this.getActivitydiagram_Activity_WriteTrace_AbstractSubStep());
		g1.getETypeArguments().add(g2);
		activitydiagram_Activity_WriteTraceEClass.getEGenericSuperTypes().add(g1);
		activitydiagram_Activity_WriteTrace_AbstractSubStepEClass.getESuperTypes().add(this.getSpecificStep());
		activitydiagram_Activity_WriteTrace_ImplicitStepEClass.getESuperTypes().add(this.getActivitydiagram_Activity_WriteTrace_AbstractSubStep());
		activitydiagram_Activity_WriteTrace_ImplicitStepEClass.getESuperTypes().add(theMsePackage.getSmallStep());
		activitydiagram_BooleanBinaryExpression_ExecuteEClass.getESuperTypes().add(this.getActivitydiagram_NamedElement_Execute_AbstractSubStep());
		activitydiagram_BooleanBinaryExpression_ExecuteEClass.getESuperTypes().add(this.getActivitydiagram_OpaqueAction_Execute_AbstractSubStep());
		activitydiagram_BooleanBinaryExpression_ExecuteEClass.getESuperTypes().add(this.getSpecificStep());
		activitydiagram_BooleanBinaryExpression_ExecuteEClass.getESuperTypes().add(theMsePackage.getSmallStep());
		activitydiagram_BooleanBinaryExpression_ExecuteEClass.getESuperTypes().add(this.getActivitydiagram_ActivityNode_Execute_AbstractSubStep());
		activitydiagram_BooleanUnaryExpression_ExecuteEClass.getESuperTypes().add(this.getActivitydiagram_NamedElement_Execute_AbstractSubStep());
		activitydiagram_BooleanUnaryExpression_ExecuteEClass.getESuperTypes().add(this.getActivitydiagram_OpaqueAction_Execute_AbstractSubStep());
		activitydiagram_BooleanUnaryExpression_ExecuteEClass.getESuperTypes().add(this.getActivitydiagram_ActivityNode_Execute_AbstractSubStep());
		activitydiagram_BooleanUnaryExpression_ExecuteEClass.getESuperTypes().add(this.getSpecificStep());
		activitydiagram_BooleanUnaryExpression_ExecuteEClass.getESuperTypes().add(theMsePackage.getSmallStep());
		g1 = createEGenericType(this.getSpecificStep());
		activitydiagram_BooleanVariable_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theMsePackage.getSequentialStep());
		g2 = createEGenericType(this.getActivitydiagram_BooleanVariable_Execute_AbstractSubStep());
		g1.getETypeArguments().add(g2);
		activitydiagram_BooleanVariable_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getActivitydiagram_BooleanVariable_Execute_AbstractSubStep());
		activitydiagram_BooleanVariable_ExecuteEClass.getEGenericSuperTypes().add(g1);
		activitydiagram_BooleanVariable_Execute_AbstractSubStepEClass.getESuperTypes().add(this.getSpecificStep());
		activitydiagram_BooleanVariable_Execute_ImplicitStepEClass.getESuperTypes().add(this.getActivitydiagram_BooleanVariable_Execute_AbstractSubStep());
		activitydiagram_BooleanVariable_Execute_ImplicitStepEClass.getESuperTypes().add(theMsePackage.getSmallStep());
		activitydiagram_BooleanVariable_InitEClass.getESuperTypes().add(this.getSpecificStep());
		activitydiagram_BooleanVariable_InitEClass.getESuperTypes().add(theMsePackage.getSmallStep());
		activitydiagram_BooleanVariable_InitEClass.getESuperTypes().add(this.getActivitydiagram_NamedElement_Execute_AbstractSubStep());
		activitydiagram_BooleanVariable_InitEClass.getESuperTypes().add(this.getActivitydiagram_Activity_Execute_AbstractSubStep());
		g1 = createEGenericType(this.getActivitydiagram_NamedElement_Execute_AbstractSubStep());
		activitydiagram_DecisionNode_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificStep());
		activitydiagram_DecisionNode_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theMsePackage.getSequentialStep());
		g2 = createEGenericType(this.getActivitydiagram_DecisionNode_Execute_AbstractSubStep());
		g1.getETypeArguments().add(g2);
		activitydiagram_DecisionNode_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getActivitydiagram_Activity_Execute_AbstractSubStep());
		activitydiagram_DecisionNode_ExecuteEClass.getEGenericSuperTypes().add(g1);
		activitydiagram_DecisionNode_Execute_AbstractSubStepEClass.getESuperTypes().add(this.getSpecificStep());
		activitydiagram_DecisionNode_Execute_ImplicitStepEClass.getESuperTypes().add(this.getActivitydiagram_DecisionNode_Execute_AbstractSubStep());
		activitydiagram_DecisionNode_Execute_ImplicitStepEClass.getESuperTypes().add(theMsePackage.getSmallStep());
		activitydiagram_DecisionNode_SendOffers1EClass.getESuperTypes().add(this.getActivitydiagram_MergeNode_Execute_AbstractSubStep());
		activitydiagram_DecisionNode_SendOffers1EClass.getESuperTypes().add(this.getSpecificStep());
		activitydiagram_DecisionNode_SendOffers1EClass.getESuperTypes().add(theMsePackage.getSmallStep());
		activitydiagram_DecisionNode_SendOffers1EClass.getESuperTypes().add(this.getActivitydiagram_InitialNode_Execute_AbstractSubStep());
		activitydiagram_DecisionNode_SendOffers1EClass.getESuperTypes().add(this.getActivitydiagram_NamedElement_Execute_AbstractSubStep());
		activitydiagram_DecisionNode_SendOffers1EClass.getESuperTypes().add(this.getActivitydiagram_JoinNode_Execute_AbstractSubStep());
		activitydiagram_DecisionNode_SendOffers1EClass.getESuperTypes().add(this.getActivitydiagram_OpaqueAction_Execute_AbstractSubStep());
		activitydiagram_DecisionNode_SendOffers1EClass.getESuperTypes().add(this.getActivitydiagram_DecisionNode_Execute_AbstractSubStep());
		activitydiagram_DecisionNode_SendOffers1EClass.getESuperTypes().add(this.getActivitydiagram_ActivityFinalNode_Execute_AbstractSubStep());
		activitydiagram_DecisionNode_SendOffers1EClass.getESuperTypes().add(this.getActivitydiagram_ActivityNode_Execute_AbstractSubStep());
		activitydiagram_DecisionNode_SendOffers1EClass.getESuperTypes().add(this.getActivitydiagram_ForkNode_Execute_AbstractSubStep());
		activitydiagram_Expression_ExecuteEClass.getESuperTypes().add(this.getActivitydiagram_NamedElement_Execute_AbstractSubStep());
		activitydiagram_Expression_ExecuteEClass.getESuperTypes().add(this.getActivitydiagram_OpaqueAction_Execute_AbstractSubStep());
		activitydiagram_Expression_ExecuteEClass.getESuperTypes().add(this.getActivitydiagram_ActivityNode_Execute_AbstractSubStep());
		activitydiagram_Expression_ExecuteEClass.getESuperTypes().add(this.getSpecificStep());
		activitydiagram_Expression_ExecuteEClass.getESuperTypes().add(theMsePackage.getSmallStep());
		g1 = createEGenericType(this.getActivitydiagram_NamedElement_Execute_AbstractSubStep());
		activitydiagram_ForkNode_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificStep());
		activitydiagram_ForkNode_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theMsePackage.getSequentialStep());
		g2 = createEGenericType(this.getActivitydiagram_ForkNode_Execute_AbstractSubStep());
		g1.getETypeArguments().add(g2);
		activitydiagram_ForkNode_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getActivitydiagram_Activity_Execute_AbstractSubStep());
		activitydiagram_ForkNode_ExecuteEClass.getEGenericSuperTypes().add(g1);
		activitydiagram_ForkNode_Execute_AbstractSubStepEClass.getESuperTypes().add(this.getSpecificStep());
		activitydiagram_ForkNode_Execute_ImplicitStepEClass.getESuperTypes().add(this.getActivitydiagram_ForkNode_Execute_AbstractSubStep());
		activitydiagram_ForkNode_Execute_ImplicitStepEClass.getESuperTypes().add(theMsePackage.getSmallStep());
		g1 = createEGenericType(this.getSpecificStep());
		activitydiagram_InitialNode_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theMsePackage.getSequentialStep());
		g2 = createEGenericType(this.getActivitydiagram_InitialNode_Execute_AbstractSubStep());
		g1.getETypeArguments().add(g2);
		activitydiagram_InitialNode_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getActivitydiagram_NamedElement_Execute_AbstractSubStep());
		activitydiagram_InitialNode_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getActivitydiagram_Activity_Execute_AbstractSubStep());
		activitydiagram_InitialNode_ExecuteEClass.getEGenericSuperTypes().add(g1);
		activitydiagram_InitialNode_Execute_AbstractSubStepEClass.getESuperTypes().add(this.getSpecificStep());
		activitydiagram_InitialNode_Execute_ImplicitStepEClass.getESuperTypes().add(this.getActivitydiagram_InitialNode_Execute_AbstractSubStep());
		activitydiagram_InitialNode_Execute_ImplicitStepEClass.getESuperTypes().add(theMsePackage.getSmallStep());
		activitydiagram_IntegerCalculationExpression_ExecuteEClass.getESuperTypes().add(this.getActivitydiagram_NamedElement_Execute_AbstractSubStep());
		activitydiagram_IntegerCalculationExpression_ExecuteEClass.getESuperTypes().add(this.getActivitydiagram_OpaqueAction_Execute_AbstractSubStep());
		activitydiagram_IntegerCalculationExpression_ExecuteEClass.getESuperTypes().add(this.getSpecificStep());
		activitydiagram_IntegerCalculationExpression_ExecuteEClass.getESuperTypes().add(theMsePackage.getSmallStep());
		activitydiagram_IntegerCalculationExpression_ExecuteEClass.getESuperTypes().add(this.getActivitydiagram_ActivityNode_Execute_AbstractSubStep());
		activitydiagram_IntegerComparisonExpression_ExecuteEClass.getESuperTypes().add(this.getActivitydiagram_NamedElement_Execute_AbstractSubStep());
		activitydiagram_IntegerComparisonExpression_ExecuteEClass.getESuperTypes().add(this.getSpecificStep());
		activitydiagram_IntegerComparisonExpression_ExecuteEClass.getESuperTypes().add(theMsePackage.getSmallStep());
		activitydiagram_IntegerComparisonExpression_ExecuteEClass.getESuperTypes().add(this.getActivitydiagram_OpaqueAction_Execute_AbstractSubStep());
		activitydiagram_IntegerComparisonExpression_ExecuteEClass.getESuperTypes().add(this.getActivitydiagram_ActivityNode_Execute_AbstractSubStep());
		activitydiagram_IntegerVariable_ExecuteEClass.getESuperTypes().add(this.getActivitydiagram_BooleanVariable_Execute_AbstractSubStep());
		activitydiagram_IntegerVariable_ExecuteEClass.getESuperTypes().add(this.getSpecificStep());
		activitydiagram_IntegerVariable_ExecuteEClass.getESuperTypes().add(theMsePackage.getSmallStep());
		activitydiagram_IntegerVariable_InitEClass.getESuperTypes().add(this.getSpecificStep());
		activitydiagram_IntegerVariable_InitEClass.getESuperTypes().add(theMsePackage.getSmallStep());
		activitydiagram_IntegerVariable_InitEClass.getESuperTypes().add(this.getActivitydiagram_NamedElement_Execute_AbstractSubStep());
		activitydiagram_IntegerVariable_InitEClass.getESuperTypes().add(this.getActivitydiagram_Activity_Execute_AbstractSubStep());
		g1 = createEGenericType(this.getActivitydiagram_NamedElement_Execute_AbstractSubStep());
		activitydiagram_JoinNode_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificStep());
		activitydiagram_JoinNode_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theMsePackage.getSequentialStep());
		g2 = createEGenericType(this.getActivitydiagram_JoinNode_Execute_AbstractSubStep());
		g1.getETypeArguments().add(g2);
		activitydiagram_JoinNode_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getActivitydiagram_Activity_Execute_AbstractSubStep());
		activitydiagram_JoinNode_ExecuteEClass.getEGenericSuperTypes().add(g1);
		activitydiagram_JoinNode_Execute_AbstractSubStepEClass.getESuperTypes().add(this.getSpecificStep());
		activitydiagram_JoinNode_Execute_ImplicitStepEClass.getESuperTypes().add(this.getActivitydiagram_JoinNode_Execute_AbstractSubStep());
		activitydiagram_JoinNode_Execute_ImplicitStepEClass.getESuperTypes().add(theMsePackage.getSmallStep());
		g1 = createEGenericType(this.getSpecificStep());
		activitydiagram_MergeNode_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theMsePackage.getSequentialStep());
		g2 = createEGenericType(this.getActivitydiagram_MergeNode_Execute_AbstractSubStep());
		g1.getETypeArguments().add(g2);
		activitydiagram_MergeNode_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getActivitydiagram_NamedElement_Execute_AbstractSubStep());
		activitydiagram_MergeNode_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getActivitydiagram_Activity_Execute_AbstractSubStep());
		activitydiagram_MergeNode_ExecuteEClass.getEGenericSuperTypes().add(g1);
		activitydiagram_MergeNode_Execute_AbstractSubStepEClass.getESuperTypes().add(this.getSpecificStep());
		activitydiagram_MergeNode_Execute_ImplicitStepEClass.getESuperTypes().add(this.getActivitydiagram_MergeNode_Execute_AbstractSubStep());
		activitydiagram_MergeNode_Execute_ImplicitStepEClass.getESuperTypes().add(theMsePackage.getSmallStep());
		g1 = createEGenericType(this.getSpecificStep());
		activitydiagram_NamedElement_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theMsePackage.getSequentialStep());
		g2 = createEGenericType(this.getActivitydiagram_NamedElement_Execute_AbstractSubStep());
		g1.getETypeArguments().add(g2);
		activitydiagram_NamedElement_ExecuteEClass.getEGenericSuperTypes().add(g1);
		activitydiagram_NamedElement_Execute_AbstractSubStepEClass.getESuperTypes().add(this.getSpecificStep());
		activitydiagram_NamedElement_Execute_ImplicitStepEClass.getESuperTypes().add(this.getActivitydiagram_NamedElement_Execute_AbstractSubStep());
		activitydiagram_NamedElement_Execute_ImplicitStepEClass.getESuperTypes().add(theMsePackage.getSmallStep());
		g1 = createEGenericType(this.getActivitydiagram_NamedElement_Execute_AbstractSubStep());
		activitydiagram_OpaqueAction_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificStep());
		activitydiagram_OpaqueAction_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theMsePackage.getSequentialStep());
		g2 = createEGenericType(this.getActivitydiagram_OpaqueAction_Execute_AbstractSubStep());
		g1.getETypeArguments().add(g2);
		activitydiagram_OpaqueAction_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getActivitydiagram_Activity_Execute_AbstractSubStep());
		activitydiagram_OpaqueAction_ExecuteEClass.getEGenericSuperTypes().add(g1);
		activitydiagram_OpaqueAction_Execute_AbstractSubStepEClass.getESuperTypes().add(this.getSpecificStep());
		activitydiagram_OpaqueAction_Execute_ImplicitStepEClass.getESuperTypes().add(this.getActivitydiagram_OpaqueAction_Execute_AbstractSubStep());
		activitydiagram_OpaqueAction_Execute_ImplicitStepEClass.getESuperTypes().add(theMsePackage.getSmallStep());
		rootImplicitStepEClass.getESuperTypes().add(theMsePackage.getSmallStep());
		specificStepEClass.getESuperTypes().add(theMsePackage.getStep());

		// Initialize classes, features, and operations; add parameters
		initEClass(activitydiagram_ActivityFinalNode_ExecuteEClass, Activitydiagram_ActivityFinalNode_Execute.class, "Activitydiagram_ActivityFinalNode_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getActivitydiagram_ActivityFinalNode_Execute__GetCaller(), theActivitydiagramPackage_1.getTracedActivityFinalNode(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(activitydiagram_ActivityFinalNode_Execute_AbstractSubStepEClass, Activitydiagram_ActivityFinalNode_Execute_AbstractSubStep.class, "Activitydiagram_ActivityFinalNode_Execute_AbstractSubStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activitydiagram_ActivityFinalNode_Execute_ImplicitStepEClass, Activitydiagram_ActivityFinalNode_Execute_ImplicitStep.class, "Activitydiagram_ActivityFinalNode_Execute_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activitydiagram_ActivityNode_AddTokens1EClass, Activitydiagram_ActivityNode_AddTokens1.class, "Activitydiagram_ActivityNode_AddTokens1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getActivitydiagram_ActivityNode_AddTokens1__GetCaller(), theActivitydiagramPackage_1.getTracedActivityNode(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(activitydiagram_ActivityNode_AddTokens1_AbstractSubStepEClass, Activitydiagram_ActivityNode_AddTokens1_AbstractSubStep.class, "Activitydiagram_ActivityNode_AddTokens1_AbstractSubStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activitydiagram_ActivityNode_AddTokens1_ImplicitStepEClass, Activitydiagram_ActivityNode_AddTokens1_ImplicitStep.class, "Activitydiagram_ActivityNode_AddTokens1_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activitydiagram_ActivityNode_ExecuteEClass, Activitydiagram_ActivityNode_Execute.class, "Activitydiagram_ActivityNode_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getActivitydiagram_ActivityNode_Execute__GetCaller(), theActivitydiagramPackage_1.getTracedActivityNode(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(activitydiagram_ActivityNode_Execute_AbstractSubStepEClass, Activitydiagram_ActivityNode_Execute_AbstractSubStep.class, "Activitydiagram_ActivityNode_Execute_AbstractSubStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activitydiagram_ActivityNode_Execute_ImplicitStepEClass, Activitydiagram_ActivityNode_Execute_ImplicitStep.class, "Activitydiagram_ActivityNode_Execute_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activitydiagram_ActivityNode_RemoveToken1EClass, Activitydiagram_ActivityNode_RemoveToken1.class, "Activitydiagram_ActivityNode_RemoveToken1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getActivitydiagram_ActivityNode_RemoveToken1__GetCaller(), theActivitydiagramPackage_1.getTracedActivityNode(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(activitydiagram_ActivityNode_SendOffers1EClass, Activitydiagram_ActivityNode_SendOffers1.class, "Activitydiagram_ActivityNode_SendOffers1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getActivitydiagram_ActivityNode_SendOffers1__GetCaller(), theActivitydiagramPackage_1.getTracedActivityNode(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(activitydiagram_ActivityNode_TakeOfferdTokens1EClass, Activitydiagram_ActivityNode_TakeOfferdTokens1.class, "Activitydiagram_ActivityNode_TakeOfferdTokens1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getActivitydiagram_ActivityNode_TakeOfferdTokens1__GetCaller(), theActivitydiagramPackage_1.getTracedActivityNode(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(activitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStepEClass, Activitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStep.class, "Activitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStepEClass, Activitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStep.class, "Activitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activitydiagram_ActivityNode_TerminateEClass, Activitydiagram_ActivityNode_Terminate.class, "Activitydiagram_ActivityNode_Terminate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getActivitydiagram_ActivityNode_Terminate__GetCaller(), theActivitydiagramPackage_1.getTracedActivityNode(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(activitydiagram_Activity_ExecuteEClass, Activitydiagram_Activity_Execute.class, "Activitydiagram_Activity_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getActivitydiagram_Activity_Execute__GetCaller(), theActivitydiagramPackage_1.getTracedActivity(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(activitydiagram_Activity_Execute_AbstractSubStepEClass, Activitydiagram_Activity_Execute_AbstractSubStep.class, "Activitydiagram_Activity_Execute_AbstractSubStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activitydiagram_Activity_Execute_ImplicitStepEClass, Activitydiagram_Activity_Execute_ImplicitStep.class, "Activitydiagram_Activity_Execute_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activitydiagram_Activity_InitializeContextEClass, Activitydiagram_Activity_InitializeContext.class, "Activitydiagram_Activity_InitializeContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getActivitydiagram_Activity_InitializeContext__GetCaller(), theActivitydiagramPackage_1.getTracedActivity(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(activitydiagram_Activity_ResetEClass, Activitydiagram_Activity_Reset.class, "Activitydiagram_Activity_Reset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getActivitydiagram_Activity_Reset__GetCaller(), theActivitydiagramPackage_1.getTracedActivity(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(activitydiagram_Activity_WriteTraceEClass, Activitydiagram_Activity_WriteTrace.class, "Activitydiagram_Activity_WriteTrace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getActivitydiagram_Activity_WriteTrace__GetCaller(), theActivitydiagramPackage_1.getTracedActivity(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(activitydiagram_Activity_WriteTrace_AbstractSubStepEClass, Activitydiagram_Activity_WriteTrace_AbstractSubStep.class, "Activitydiagram_Activity_WriteTrace_AbstractSubStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activitydiagram_Activity_WriteTrace_ImplicitStepEClass, Activitydiagram_Activity_WriteTrace_ImplicitStep.class, "Activitydiagram_Activity_WriteTrace_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activitydiagram_BooleanBinaryExpression_ExecuteEClass, Activitydiagram_BooleanBinaryExpression_Execute.class, "Activitydiagram_BooleanBinaryExpression_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getActivitydiagram_BooleanBinaryExpression_Execute__GetCaller(), theActivitydiagramPackage.getBooleanBinaryExpression(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(activitydiagram_BooleanUnaryExpression_ExecuteEClass, Activitydiagram_BooleanUnaryExpression_Execute.class, "Activitydiagram_BooleanUnaryExpression_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getActivitydiagram_BooleanUnaryExpression_Execute__GetCaller(), theActivitydiagramPackage.getBooleanUnaryExpression(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(activitydiagram_BooleanVariable_ExecuteEClass, Activitydiagram_BooleanVariable_Execute.class, "Activitydiagram_BooleanVariable_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getActivitydiagram_BooleanVariable_Execute__GetCaller(), theActivitydiagramPackage_1.getTracedBooleanVariable(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(activitydiagram_BooleanVariable_Execute_AbstractSubStepEClass, Activitydiagram_BooleanVariable_Execute_AbstractSubStep.class, "Activitydiagram_BooleanVariable_Execute_AbstractSubStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activitydiagram_BooleanVariable_Execute_ImplicitStepEClass, Activitydiagram_BooleanVariable_Execute_ImplicitStep.class, "Activitydiagram_BooleanVariable_Execute_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activitydiagram_BooleanVariable_InitEClass, Activitydiagram_BooleanVariable_Init.class, "Activitydiagram_BooleanVariable_Init", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getActivitydiagram_BooleanVariable_Init__GetCaller(), theActivitydiagramPackage_1.getTracedBooleanVariable(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(activitydiagram_DecisionNode_ExecuteEClass, Activitydiagram_DecisionNode_Execute.class, "Activitydiagram_DecisionNode_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getActivitydiagram_DecisionNode_Execute__GetCaller(), theActivitydiagramPackage_1.getTracedDecisionNode(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(activitydiagram_DecisionNode_Execute_AbstractSubStepEClass, Activitydiagram_DecisionNode_Execute_AbstractSubStep.class, "Activitydiagram_DecisionNode_Execute_AbstractSubStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activitydiagram_DecisionNode_Execute_ImplicitStepEClass, Activitydiagram_DecisionNode_Execute_ImplicitStep.class, "Activitydiagram_DecisionNode_Execute_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activitydiagram_DecisionNode_SendOffers1EClass, Activitydiagram_DecisionNode_SendOffers1.class, "Activitydiagram_DecisionNode_SendOffers1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getActivitydiagram_DecisionNode_SendOffers1__GetCaller(), theActivitydiagramPackage_1.getTracedDecisionNode(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(activitydiagram_Expression_ExecuteEClass, Activitydiagram_Expression_Execute.class, "Activitydiagram_Expression_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getActivitydiagram_Expression_Execute__GetCaller(), theActivitydiagramPackage.getExpression(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(activitydiagram_ForkNode_ExecuteEClass, Activitydiagram_ForkNode_Execute.class, "Activitydiagram_ForkNode_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getActivitydiagram_ForkNode_Execute__GetCaller(), theActivitydiagramPackage_1.getTracedForkNode(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(activitydiagram_ForkNode_Execute_AbstractSubStepEClass, Activitydiagram_ForkNode_Execute_AbstractSubStep.class, "Activitydiagram_ForkNode_Execute_AbstractSubStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activitydiagram_ForkNode_Execute_ImplicitStepEClass, Activitydiagram_ForkNode_Execute_ImplicitStep.class, "Activitydiagram_ForkNode_Execute_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activitydiagram_InitialNode_ExecuteEClass, Activitydiagram_InitialNode_Execute.class, "Activitydiagram_InitialNode_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getActivitydiagram_InitialNode_Execute__GetCaller(), theActivitydiagramPackage_1.getTracedInitialNode(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(activitydiagram_InitialNode_Execute_AbstractSubStepEClass, Activitydiagram_InitialNode_Execute_AbstractSubStep.class, "Activitydiagram_InitialNode_Execute_AbstractSubStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activitydiagram_InitialNode_Execute_ImplicitStepEClass, Activitydiagram_InitialNode_Execute_ImplicitStep.class, "Activitydiagram_InitialNode_Execute_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activitydiagram_IntegerCalculationExpression_ExecuteEClass, Activitydiagram_IntegerCalculationExpression_Execute.class, "Activitydiagram_IntegerCalculationExpression_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getActivitydiagram_IntegerCalculationExpression_Execute__GetCaller(), theActivitydiagramPackage.getIntegerCalculationExpression(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(activitydiagram_IntegerComparisonExpression_ExecuteEClass, Activitydiagram_IntegerComparisonExpression_Execute.class, "Activitydiagram_IntegerComparisonExpression_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getActivitydiagram_IntegerComparisonExpression_Execute__GetCaller(), theActivitydiagramPackage.getIntegerComparisonExpression(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(activitydiagram_IntegerVariable_ExecuteEClass, Activitydiagram_IntegerVariable_Execute.class, "Activitydiagram_IntegerVariable_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getActivitydiagram_IntegerVariable_Execute__GetCaller(), theActivitydiagramPackage_1.getTracedIntegerVariable(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(activitydiagram_IntegerVariable_InitEClass, Activitydiagram_IntegerVariable_Init.class, "Activitydiagram_IntegerVariable_Init", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getActivitydiagram_IntegerVariable_Init__GetCaller(), theActivitydiagramPackage_1.getTracedIntegerVariable(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(activitydiagram_JoinNode_ExecuteEClass, Activitydiagram_JoinNode_Execute.class, "Activitydiagram_JoinNode_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getActivitydiagram_JoinNode_Execute__GetCaller(), theActivitydiagramPackage_1.getTracedJoinNode(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(activitydiagram_JoinNode_Execute_AbstractSubStepEClass, Activitydiagram_JoinNode_Execute_AbstractSubStep.class, "Activitydiagram_JoinNode_Execute_AbstractSubStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activitydiagram_JoinNode_Execute_ImplicitStepEClass, Activitydiagram_JoinNode_Execute_ImplicitStep.class, "Activitydiagram_JoinNode_Execute_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activitydiagram_MergeNode_ExecuteEClass, Activitydiagram_MergeNode_Execute.class, "Activitydiagram_MergeNode_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getActivitydiagram_MergeNode_Execute__GetCaller(), theActivitydiagramPackage_1.getTracedMergeNode(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(activitydiagram_MergeNode_Execute_AbstractSubStepEClass, Activitydiagram_MergeNode_Execute_AbstractSubStep.class, "Activitydiagram_MergeNode_Execute_AbstractSubStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activitydiagram_MergeNode_Execute_ImplicitStepEClass, Activitydiagram_MergeNode_Execute_ImplicitStep.class, "Activitydiagram_MergeNode_Execute_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activitydiagram_NamedElement_ExecuteEClass, Activitydiagram_NamedElement_Execute.class, "Activitydiagram_NamedElement_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getActivitydiagram_NamedElement_Execute__GetCaller(), theActivitydiagramPackage_1.getTracedNamedElement(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(activitydiagram_NamedElement_Execute_AbstractSubStepEClass, Activitydiagram_NamedElement_Execute_AbstractSubStep.class, "Activitydiagram_NamedElement_Execute_AbstractSubStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activitydiagram_NamedElement_Execute_ImplicitStepEClass, Activitydiagram_NamedElement_Execute_ImplicitStep.class, "Activitydiagram_NamedElement_Execute_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activitydiagram_OpaqueAction_ExecuteEClass, Activitydiagram_OpaqueAction_Execute.class, "Activitydiagram_OpaqueAction_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getActivitydiagram_OpaqueAction_Execute__GetCaller(), theActivitydiagramPackage_1.getTracedOpaqueAction(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(activitydiagram_OpaqueAction_Execute_AbstractSubStepEClass, Activitydiagram_OpaqueAction_Execute_AbstractSubStep.class, "Activitydiagram_OpaqueAction_Execute_AbstractSubStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activitydiagram_OpaqueAction_Execute_ImplicitStepEClass, Activitydiagram_OpaqueAction_Execute_ImplicitStep.class, "Activitydiagram_OpaqueAction_Execute_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rootImplicitStepEClass, RootImplicitStep.class, "RootImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(specificStepEClass, SpecificStep.class, "SpecificStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecificStep_EndingState(), theStatesPackage.getState(), theStatesPackage.getState_EndedSteps(), "endingState", null, 0, 1, SpecificStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificStep_StartingState(), theStatesPackage.getState(), theStatesPackage.getState_StartedSteps(), "startingState", null, 1, 1, SpecificStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //StepsPackageImpl
