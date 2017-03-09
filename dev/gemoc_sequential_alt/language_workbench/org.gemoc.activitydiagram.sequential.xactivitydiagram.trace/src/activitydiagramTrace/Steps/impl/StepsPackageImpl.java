/**
 */
package activitydiagramTrace.Steps.impl;

import activitydiagramTrace.ActivitydiagramTracePackage;

import activitydiagramTrace.States.StatesPackage;

import activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl;

import activitydiagramTrace.States.impl.StatesPackageImpl;

import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddToken;
import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute;
import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute_AbstractSubStep;
import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute_ImplicitStep;
import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_RemoveToken;
import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Terminate;
import activitydiagramTrace.Steps.Activitydiagram_Activity_Execute;
import activitydiagramTrace.Steps.Activitydiagram_Activity_Execute_AbstractSubStep;
import activitydiagramTrace.Steps.Activitydiagram_Activity_Execute_ImplicitStep;
import activitydiagramTrace.Steps.Activitydiagram_BooleanVariable_Init;
import activitydiagramTrace.Steps.Activitydiagram_IntegerVariable_Init;
import activitydiagramTrace.Steps.Activitydiagram_Variable_Init;
import activitydiagramTrace.Steps.RootImplicitStep;
import activitydiagramTrace.Steps.SpecificRootStep;
import activitydiagramTrace.Steps.SpecificStep;
import activitydiagramTrace.Steps.StepsFactory;
import activitydiagramTrace.Steps.StepsPackage;

import activitydiagramTrace.impl.ActivitydiagramTracePackageImpl;

import fr.inria.diverse.trace.commons.model.trace.TracePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage;

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
	private EClass activitydiagram_ActivityNode_AddTokenEClass = null;

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
	private EClass activitydiagram_ActivityNode_RemoveTokenEClass = null;

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
	private EClass activitydiagram_BooleanVariable_InitEClass = null;

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
	private EClass activitydiagram_Variable_InitEClass = null;

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
	private EClass specificRootStepEClass = null;

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
		TracePackage.eINSTANCE.eClass();
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
	public EClass getActivitydiagram_ActivityNode_AddToken() {
		return activitydiagram_ActivityNode_AddTokenEClass;
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
	public EClass getActivitydiagram_ActivityNode_RemoveToken() {
		return activitydiagram_ActivityNode_RemoveTokenEClass;
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
	public EClass getActivitydiagram_Activity_Execute() {
		return activitydiagram_Activity_ExecuteEClass;
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
	public EClass getActivitydiagram_BooleanVariable_Init() {
		return activitydiagram_BooleanVariable_InitEClass;
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
	public EClass getActivitydiagram_Variable_Init() {
		return activitydiagram_Variable_InitEClass;
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
	public EClass getSpecificRootStep() {
		return specificRootStepEClass;
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
		activitydiagram_ActivityNode_AddTokenEClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKEN);

		activitydiagram_ActivityNode_ExecuteEClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE);

		activitydiagram_ActivityNode_Execute_AbstractSubStepEClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_STEP);

		activitydiagram_ActivityNode_Execute_ImplicitStepEClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_IMPLICIT_STEP);

		activitydiagram_ActivityNode_RemoveTokenEClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN);

		activitydiagram_ActivityNode_TerminateEClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE);

		activitydiagram_Activity_ExecuteEClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_EXECUTE);

		activitydiagram_Activity_Execute_AbstractSubStepEClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP);

		activitydiagram_Activity_Execute_ImplicitStepEClass = createEClass(ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_IMPLICIT_STEP);

		activitydiagram_BooleanVariable_InitEClass = createEClass(ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_INIT);

		activitydiagram_IntegerVariable_InitEClass = createEClass(ACTIVITYDIAGRAM_INTEGER_VARIABLE_INIT);

		activitydiagram_Variable_InitEClass = createEClass(ACTIVITYDIAGRAM_VARIABLE_INIT);

		rootImplicitStepEClass = createEClass(ROOT_IMPLICIT_STEP);

		specificRootStepEClass = createEClass(SPECIFIC_ROOT_STEP);

		specificStepEClass = createEClass(SPECIFIC_STEP);
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
		TracePackage theTracePackage = (TracePackage)EPackage.Registry.INSTANCE.getEPackage(TracePackage.eNS_URI);
		StatesPackage theStatesPackage = (StatesPackage)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI);
		activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage theActivitydiagramPackage_1 = (activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage)EPackage.Registry.INSTANCE.getEPackage(activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(this.getSpecificStep());
		activitydiagram_ActivityNode_AddTokenEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSmallStep());
		EGenericType g2 = createEGenericType(theStatesPackage.getSpecificState());
		g1.getETypeArguments().add(g2);
		activitydiagram_ActivityNode_AddTokenEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getActivitydiagram_Activity_Execute_AbstractSubStep());
		activitydiagram_ActivityNode_AddTokenEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getActivitydiagram_ActivityNode_Execute_AbstractSubStep());
		activitydiagram_ActivityNode_AddTokenEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getActivitydiagram_Activity_Execute_AbstractSubStep());
		activitydiagram_ActivityNode_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificStep());
		activitydiagram_ActivityNode_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSequentialStep());
		g2 = createEGenericType(this.getActivitydiagram_ActivityNode_Execute_AbstractSubStep());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theStatesPackage.getSpecificState());
		g1.getETypeArguments().add(g2);
		activitydiagram_ActivityNode_ExecuteEClass.getEGenericSuperTypes().add(g1);
		activitydiagram_ActivityNode_Execute_AbstractSubStepEClass.getESuperTypes().add(this.getSpecificStep());
		g1 = createEGenericType(this.getActivitydiagram_ActivityNode_Execute_AbstractSubStep());
		activitydiagram_ActivityNode_Execute_ImplicitStepEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSmallStep());
		g2 = createEGenericType(theStatesPackage.getSpecificState());
		g1.getETypeArguments().add(g2);
		activitydiagram_ActivityNode_Execute_ImplicitStepEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificStep());
		activitydiagram_ActivityNode_RemoveTokenEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSmallStep());
		g2 = createEGenericType(theStatesPackage.getSpecificState());
		g1.getETypeArguments().add(g2);
		activitydiagram_ActivityNode_RemoveTokenEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificStep());
		activitydiagram_ActivityNode_TerminateEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSmallStep());
		g2 = createEGenericType(theStatesPackage.getSpecificState());
		g1.getETypeArguments().add(g2);
		activitydiagram_ActivityNode_TerminateEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificStep());
		activitydiagram_Activity_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSequentialStep());
		g2 = createEGenericType(this.getActivitydiagram_Activity_Execute_AbstractSubStep());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theStatesPackage.getSpecificState());
		g1.getETypeArguments().add(g2);
		activitydiagram_Activity_ExecuteEClass.getEGenericSuperTypes().add(g1);
		activitydiagram_Activity_Execute_AbstractSubStepEClass.getESuperTypes().add(this.getSpecificStep());
		g1 = createEGenericType(this.getActivitydiagram_Activity_Execute_AbstractSubStep());
		activitydiagram_Activity_Execute_ImplicitStepEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSmallStep());
		g2 = createEGenericType(theStatesPackage.getSpecificState());
		g1.getETypeArguments().add(g2);
		activitydiagram_Activity_Execute_ImplicitStepEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getActivitydiagram_Activity_Execute_AbstractSubStep());
		activitydiagram_BooleanVariable_InitEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificStep());
		activitydiagram_BooleanVariable_InitEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSmallStep());
		g2 = createEGenericType(theStatesPackage.getSpecificState());
		g1.getETypeArguments().add(g2);
		activitydiagram_BooleanVariable_InitEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getActivitydiagram_Activity_Execute_AbstractSubStep());
		activitydiagram_IntegerVariable_InitEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificStep());
		activitydiagram_IntegerVariable_InitEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSmallStep());
		g2 = createEGenericType(theStatesPackage.getSpecificState());
		g1.getETypeArguments().add(g2);
		activitydiagram_IntegerVariable_InitEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getActivitydiagram_Activity_Execute_AbstractSubStep());
		activitydiagram_Variable_InitEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificStep());
		activitydiagram_Variable_InitEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSmallStep());
		g2 = createEGenericType(theStatesPackage.getSpecificState());
		g1.getETypeArguments().add(g2);
		activitydiagram_Variable_InitEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSmallStep());
		g2 = createEGenericType(theStatesPackage.getSpecificState());
		g1.getETypeArguments().add(g2);
		rootImplicitStepEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSequentialStep());
		g2 = createEGenericType(this.getSpecificStep());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theStatesPackage.getSpecificState());
		g1.getETypeArguments().add(g2);
		specificRootStepEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificStep());
		specificRootStepEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getStep());
		g2 = createEGenericType(theStatesPackage.getSpecificState());
		g1.getETypeArguments().add(g2);
		specificStepEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(activitydiagram_ActivityNode_AddTokenEClass, Activitydiagram_ActivityNode_AddToken.class, "Activitydiagram_ActivityNode_AddToken", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(activitydiagram_ActivityNode_AddTokenEClass, theActivitydiagramPackage_1.getTracedActivityNode(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(activitydiagram_ActivityNode_ExecuteEClass, Activitydiagram_ActivityNode_Execute.class, "Activitydiagram_ActivityNode_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(activitydiagram_ActivityNode_ExecuteEClass, theActivitydiagramPackage_1.getTracedActivityNode(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(activitydiagram_ActivityNode_Execute_AbstractSubStepEClass, Activitydiagram_ActivityNode_Execute_AbstractSubStep.class, "Activitydiagram_ActivityNode_Execute_AbstractSubStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activitydiagram_ActivityNode_Execute_ImplicitStepEClass, Activitydiagram_ActivityNode_Execute_ImplicitStep.class, "Activitydiagram_ActivityNode_Execute_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activitydiagram_ActivityNode_RemoveTokenEClass, Activitydiagram_ActivityNode_RemoveToken.class, "Activitydiagram_ActivityNode_RemoveToken", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(activitydiagram_ActivityNode_RemoveTokenEClass, theActivitydiagramPackage_1.getTracedActivityNode(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(activitydiagram_ActivityNode_TerminateEClass, Activitydiagram_ActivityNode_Terminate.class, "Activitydiagram_ActivityNode_Terminate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(activitydiagram_ActivityNode_TerminateEClass, theActivitydiagramPackage_1.getTracedActivityNode(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(activitydiagram_Activity_ExecuteEClass, Activitydiagram_Activity_Execute.class, "Activitydiagram_Activity_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(activitydiagram_Activity_ExecuteEClass, theActivitydiagramPackage_1.getTracedActivity(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(activitydiagram_Activity_Execute_AbstractSubStepEClass, Activitydiagram_Activity_Execute_AbstractSubStep.class, "Activitydiagram_Activity_Execute_AbstractSubStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activitydiagram_Activity_Execute_ImplicitStepEClass, Activitydiagram_Activity_Execute_ImplicitStep.class, "Activitydiagram_Activity_Execute_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activitydiagram_BooleanVariable_InitEClass, Activitydiagram_BooleanVariable_Init.class, "Activitydiagram_BooleanVariable_Init", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(activitydiagram_BooleanVariable_InitEClass, theActivitydiagramPackage_1.getTracedBooleanVariable(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(activitydiagram_IntegerVariable_InitEClass, Activitydiagram_IntegerVariable_Init.class, "Activitydiagram_IntegerVariable_Init", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(activitydiagram_IntegerVariable_InitEClass, theActivitydiagramPackage_1.getTracedIntegerVariable(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(activitydiagram_Variable_InitEClass, Activitydiagram_Variable_Init.class, "Activitydiagram_Variable_Init", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(activitydiagram_Variable_InitEClass, theActivitydiagramPackage_1.getTracedVariable(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rootImplicitStepEClass, RootImplicitStep.class, "RootImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(specificRootStepEClass, SpecificRootStep.class, "SpecificRootStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(specificStepEClass, SpecificStep.class, "SpecificStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //StepsPackageImpl
