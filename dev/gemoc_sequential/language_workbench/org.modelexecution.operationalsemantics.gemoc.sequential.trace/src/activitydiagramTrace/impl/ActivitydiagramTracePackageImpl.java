/**
 */
package activitydiagramTrace.impl;

import activitydiagram.ActivitydiagramPackage;

import activitydiagramTrace.ActivitydiagramTraceFactory;
import activitydiagramTrace.ActivitydiagramTracePackage;

import activitydiagramTrace.States.StatesPackage;

import activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl;

import activitydiagramTrace.States.impl.StatesPackageImpl;

import activitydiagramTrace.Steps.StepsPackage;

import activitydiagramTrace.Steps.impl.StepsPackageImpl;

import activitydiagramTrace.Trace;

import org.eclipse.emf.ecore.EClass;
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
public class ActivitydiagramTracePackageImpl extends EPackageImpl implements ActivitydiagramTracePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traceEClass = null;

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
	 * @see activitydiagramTrace.ActivitydiagramTracePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ActivitydiagramTracePackageImpl() {
		super(eNS_URI, ActivitydiagramTraceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ActivitydiagramTracePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ActivitydiagramTracePackage init() {
		if (isInited) return (ActivitydiagramTracePackage)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramTracePackage.eNS_URI);

		// Obtain or create and register package
		ActivitydiagramTracePackageImpl theActivitydiagramTracePackage = (ActivitydiagramTracePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ActivitydiagramTracePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ActivitydiagramTracePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ActivitydiagramPackage.eINSTANCE.eClass();
		Engine_msePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) : StepsPackage.eINSTANCE);
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) : StatesPackage.eINSTANCE);
		ActivitydiagramPackageImpl theActivitydiagramPackage_1 = (ActivitydiagramPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage.eNS_URI) instanceof ActivitydiagramPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage.eNS_URI) : activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage.eINSTANCE);

		// Create package meta-data objects
		theActivitydiagramTracePackage.createPackageContents();
		theStepsPackage.createPackageContents();
		theStatesPackage.createPackageContents();
		theActivitydiagramPackage_1.createPackageContents();

		// Initialize created meta-data
		theActivitydiagramTracePackage.initializePackageContents();
		theStepsPackage.initializePackageContents();
		theStatesPackage.initializePackageContents();
		theActivitydiagramPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theActivitydiagramTracePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ActivitydiagramTracePackage.eNS_URI, theActivitydiagramTracePackage);
		return theActivitydiagramTracePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrace() {
		return traceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_StatesTrace() {
		return (EReference)traceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_RootSteps() {
		return (EReference)traceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_Activitydiagram_tracedIntegerVariables() {
		return (EReference)traceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_Activitydiagram_tracedIntegerComparisonExpressions() {
		return (EReference)traceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_Activitydiagram_tracedControlTokens() {
		return (EReference)traceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_Activitydiagram_tracedJoinNodes() {
		return (EReference)traceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_Activitydiagram_tracedControlFlows() {
		return (EReference)traceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_Activitydiagram_tracedBooleanValues() {
		return (EReference)traceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_Activitydiagram_tracedIntegerCalculationExpressions() {
		return (EReference)traceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_Activitydiagram_tracedOpaqueActions() {
		return (EReference)traceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_Activitydiagram_tracedDecisionNodes() {
		return (EReference)traceEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_Activitydiagram_tracedInputs() {
		return (EReference)traceEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_Activitydiagram_tracedActivityFinalNodes() {
		return (EReference)traceEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_Activitydiagram_tracedIntegerValues() {
		return (EReference)traceEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_Activitydiagram_tracedActivitys() {
		return (EReference)traceEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_Activitydiagram_tracedForkNodes() {
		return (EReference)traceEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_Activitydiagram_tracedMergeNodes() {
		return (EReference)traceEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_Activitydiagram_tracedOffers() {
		return (EReference)traceEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_Activitydiagram_tracedForkedTokens() {
		return (EReference)traceEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_Activitydiagram_tracedBooleanVariables() {
		return (EReference)traceEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_Activitydiagram_tracedInitialNodes() {
		return (EReference)traceEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_Activitydiagram_tracedBooleanUnaryExpressions() {
		return (EReference)traceEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_Activitydiagram_tracedBooleanBinaryExpressions() {
		return (EReference)traceEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_Activitydiagram_tracedTraces() {
		return (EReference)traceEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_Activitydiagram_tracedInputValues() {
		return (EReference)traceEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_Activitydiagram_Activity_Execute_Sequence() {
		return (EReference)traceEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_Activitydiagram_Variable_Init_Sequence() {
		return (EReference)traceEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_Activitydiagram_ActivityNode_Execute_Sequence() {
		return (EReference)traceEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_Activitydiagram_ActivityNode_SendOffers1_Sequence() {
		return (EReference)traceEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_Activitydiagram_ActivityNode_TakeOfferdTokens1_Sequence() {
		return (EReference)traceEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_Activitydiagram_ActivityNode_AddTokens1_Sequence() {
		return (EReference)traceEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_Activitydiagram_ActivityNode_Terminate_Sequence() {
		return (EReference)traceEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_Activitydiagram_Variable_Execute_Sequence() {
		return (EReference)traceEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_Activitydiagram_Activity_Reset_Sequence() {
		return (EReference)traceEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_Activitydiagram_Activity_InitializeContext_Sequence() {
		return (EReference)traceEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_Activitydiagram_ActivityNode_RemoveToken1_Sequence() {
		return (EReference)traceEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_Activitydiagram_Activity_WriteTrace_Sequence() {
		return (EReference)traceEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivitydiagramTraceFactory getActivitydiagramTraceFactory() {
		return (ActivitydiagramTraceFactory)getEFactoryInstance();
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
		traceEClass = createEClass(TRACE);
		createEReference(traceEClass, TRACE__STATES_TRACE);
		createEReference(traceEClass, TRACE__ROOT_STEPS);
		createEReference(traceEClass, TRACE__ACTIVITYDIAGRAM_TRACED_INTEGER_VARIABLES);
		createEReference(traceEClass, TRACE__ACTIVITYDIAGRAM_TRACED_INTEGER_COMPARISON_EXPRESSIONS);
		createEReference(traceEClass, TRACE__ACTIVITYDIAGRAM_TRACED_CONTROL_TOKENS);
		createEReference(traceEClass, TRACE__ACTIVITYDIAGRAM_TRACED_JOIN_NODES);
		createEReference(traceEClass, TRACE__ACTIVITYDIAGRAM_TRACED_CONTROL_FLOWS);
		createEReference(traceEClass, TRACE__ACTIVITYDIAGRAM_TRACED_BOOLEAN_VALUES);
		createEReference(traceEClass, TRACE__ACTIVITYDIAGRAM_TRACED_INTEGER_CALCULATION_EXPRESSIONS);
		createEReference(traceEClass, TRACE__ACTIVITYDIAGRAM_TRACED_OPAQUE_ACTIONS);
		createEReference(traceEClass, TRACE__ACTIVITYDIAGRAM_TRACED_DECISION_NODES);
		createEReference(traceEClass, TRACE__ACTIVITYDIAGRAM_TRACED_INPUTS);
		createEReference(traceEClass, TRACE__ACTIVITYDIAGRAM_TRACED_ACTIVITY_FINAL_NODES);
		createEReference(traceEClass, TRACE__ACTIVITYDIAGRAM_TRACED_INTEGER_VALUES);
		createEReference(traceEClass, TRACE__ACTIVITYDIAGRAM_TRACED_ACTIVITYS);
		createEReference(traceEClass, TRACE__ACTIVITYDIAGRAM_TRACED_FORK_NODES);
		createEReference(traceEClass, TRACE__ACTIVITYDIAGRAM_TRACED_MERGE_NODES);
		createEReference(traceEClass, TRACE__ACTIVITYDIAGRAM_TRACED_OFFERS);
		createEReference(traceEClass, TRACE__ACTIVITYDIAGRAM_TRACED_FORKED_TOKENS);
		createEReference(traceEClass, TRACE__ACTIVITYDIAGRAM_TRACED_BOOLEAN_VARIABLES);
		createEReference(traceEClass, TRACE__ACTIVITYDIAGRAM_TRACED_INITIAL_NODES);
		createEReference(traceEClass, TRACE__ACTIVITYDIAGRAM_TRACED_BOOLEAN_UNARY_EXPRESSIONS);
		createEReference(traceEClass, TRACE__ACTIVITYDIAGRAM_TRACED_BOOLEAN_BINARY_EXPRESSIONS);
		createEReference(traceEClass, TRACE__ACTIVITYDIAGRAM_TRACED_TRACES);
		createEReference(traceEClass, TRACE__ACTIVITYDIAGRAM_TRACED_INPUT_VALUES);
		createEReference(traceEClass, TRACE__ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_SEQUENCE);
		createEReference(traceEClass, TRACE__ACTIVITYDIAGRAM_VARIABLE_INIT_SEQUENCE);
		createEReference(traceEClass, TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_SEQUENCE);
		createEReference(traceEClass, TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1_SEQUENCE);
		createEReference(traceEClass, TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_SEQUENCE);
		createEReference(traceEClass, TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_SEQUENCE);
		createEReference(traceEClass, TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE_SEQUENCE);
		createEReference(traceEClass, TRACE__ACTIVITYDIAGRAM_VARIABLE_EXECUTE_SEQUENCE);
		createEReference(traceEClass, TRACE__ACTIVITYDIAGRAM_ACTIVITY_RESET_SEQUENCE);
		createEReference(traceEClass, TRACE__ACTIVITYDIAGRAM_ACTIVITY_INITIALIZE_CONTEXT_SEQUENCE);
		createEReference(traceEClass, TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN1_SEQUENCE);
		createEReference(traceEClass, TRACE__ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_SEQUENCE);
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
		StepsPackage theStepsPackage = (StepsPackage)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI);
		StatesPackage theStatesPackage = (StatesPackage)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI);
		activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage theActivitydiagramPackage_1 = (activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage)EPackage.Registry.INSTANCE.getEPackage(activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theStepsPackage);
		getESubpackages().add(theStatesPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(traceEClass, Trace.class, "Trace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrace_StatesTrace(), theStatesPackage.getState(), null, "statesTrace", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrace_RootSteps(), theStepsPackage.getStep(), null, "rootSteps", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrace_Activitydiagram_tracedIntegerVariables(), theActivitydiagramPackage_1.getTracedIntegerVariable(), null, "activitydiagram_tracedIntegerVariables", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrace_Activitydiagram_tracedIntegerComparisonExpressions(), theActivitydiagramPackage_1.getTracedIntegerComparisonExpression(), null, "activitydiagram_tracedIntegerComparisonExpressions", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrace_Activitydiagram_tracedControlTokens(), theActivitydiagramPackage_1.getTracedControlToken(), null, "activitydiagram_tracedControlTokens", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrace_Activitydiagram_tracedJoinNodes(), theActivitydiagramPackage_1.getTracedJoinNode(), null, "activitydiagram_tracedJoinNodes", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrace_Activitydiagram_tracedControlFlows(), theActivitydiagramPackage_1.getTracedControlFlow(), null, "activitydiagram_tracedControlFlows", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrace_Activitydiagram_tracedBooleanValues(), theActivitydiagramPackage_1.getTracedBooleanValue(), null, "activitydiagram_tracedBooleanValues", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrace_Activitydiagram_tracedIntegerCalculationExpressions(), theActivitydiagramPackage_1.getTracedIntegerCalculationExpression(), null, "activitydiagram_tracedIntegerCalculationExpressions", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrace_Activitydiagram_tracedOpaqueActions(), theActivitydiagramPackage_1.getTracedOpaqueAction(), null, "activitydiagram_tracedOpaqueActions", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrace_Activitydiagram_tracedDecisionNodes(), theActivitydiagramPackage_1.getTracedDecisionNode(), null, "activitydiagram_tracedDecisionNodes", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrace_Activitydiagram_tracedInputs(), theActivitydiagramPackage_1.getTracedInput(), null, "activitydiagram_tracedInputs", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrace_Activitydiagram_tracedActivityFinalNodes(), theActivitydiagramPackage_1.getTracedActivityFinalNode(), null, "activitydiagram_tracedActivityFinalNodes", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrace_Activitydiagram_tracedIntegerValues(), theActivitydiagramPackage_1.getTracedIntegerValue(), null, "activitydiagram_tracedIntegerValues", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrace_Activitydiagram_tracedActivitys(), theActivitydiagramPackage_1.getTracedActivity(), null, "activitydiagram_tracedActivitys", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrace_Activitydiagram_tracedForkNodes(), theActivitydiagramPackage_1.getTracedForkNode(), null, "activitydiagram_tracedForkNodes", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrace_Activitydiagram_tracedMergeNodes(), theActivitydiagramPackage_1.getTracedMergeNode(), null, "activitydiagram_tracedMergeNodes", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrace_Activitydiagram_tracedOffers(), theActivitydiagramPackage_1.getTracedOffer(), null, "activitydiagram_tracedOffers", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrace_Activitydiagram_tracedForkedTokens(), theActivitydiagramPackage_1.getTracedForkedToken(), null, "activitydiagram_tracedForkedTokens", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrace_Activitydiagram_tracedBooleanVariables(), theActivitydiagramPackage_1.getTracedBooleanVariable(), null, "activitydiagram_tracedBooleanVariables", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrace_Activitydiagram_tracedInitialNodes(), theActivitydiagramPackage_1.getTracedInitialNode(), null, "activitydiagram_tracedInitialNodes", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrace_Activitydiagram_tracedBooleanUnaryExpressions(), theActivitydiagramPackage_1.getTracedBooleanUnaryExpression(), null, "activitydiagram_tracedBooleanUnaryExpressions", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrace_Activitydiagram_tracedBooleanBinaryExpressions(), theActivitydiagramPackage_1.getTracedBooleanBinaryExpression(), null, "activitydiagram_tracedBooleanBinaryExpressions", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrace_Activitydiagram_tracedTraces(), theActivitydiagramPackage_1.getTracedTrace(), null, "activitydiagram_tracedTraces", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrace_Activitydiagram_tracedInputValues(), theActivitydiagramPackage_1.getTracedInputValue(), null, "activitydiagram_tracedInputValues", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrace_Activitydiagram_Activity_Execute_Sequence(), theStepsPackage.getActivitydiagram_Activity_Execute(), null, "Activitydiagram_Activity_Execute_Sequence", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrace_Activitydiagram_Variable_Init_Sequence(), theStepsPackage.getActivitydiagram_Variable_Init(), null, "Activitydiagram_Variable_Init_Sequence", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrace_Activitydiagram_ActivityNode_Execute_Sequence(), theStepsPackage.getActivitydiagram_ActivityNode_Execute(), null, "Activitydiagram_ActivityNode_Execute_Sequence", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrace_Activitydiagram_ActivityNode_SendOffers1_Sequence(), theStepsPackage.getActivitydiagram_ActivityNode_SendOffers1(), null, "Activitydiagram_ActivityNode_SendOffers1_Sequence", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrace_Activitydiagram_ActivityNode_TakeOfferdTokens1_Sequence(), theStepsPackage.getActivitydiagram_ActivityNode_TakeOfferdTokens1(), null, "Activitydiagram_ActivityNode_TakeOfferdTokens1_Sequence", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrace_Activitydiagram_ActivityNode_AddTokens1_Sequence(), theStepsPackage.getActivitydiagram_ActivityNode_AddTokens1(), null, "Activitydiagram_ActivityNode_AddTokens1_Sequence", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrace_Activitydiagram_ActivityNode_Terminate_Sequence(), theStepsPackage.getActivitydiagram_ActivityNode_Terminate(), null, "Activitydiagram_ActivityNode_Terminate_Sequence", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrace_Activitydiagram_Variable_Execute_Sequence(), theStepsPackage.getActivitydiagram_Variable_Execute(), null, "Activitydiagram_Variable_Execute_Sequence", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrace_Activitydiagram_Activity_Reset_Sequence(), theStepsPackage.getActivitydiagram_Activity_Reset(), null, "Activitydiagram_Activity_Reset_Sequence", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrace_Activitydiagram_Activity_InitializeContext_Sequence(), theStepsPackage.getActivitydiagram_Activity_InitializeContext(), null, "Activitydiagram_Activity_InitializeContext_Sequence", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrace_Activitydiagram_ActivityNode_RemoveToken1_Sequence(), theStepsPackage.getActivitydiagram_ActivityNode_RemoveToken1(), null, "Activitydiagram_ActivityNode_RemoveToken1_Sequence", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrace_Activitydiagram_Activity_WriteTrace_Sequence(), theStepsPackage.getActivitydiagram_Activity_WriteTrace(), null, "Activitydiagram_Activity_WriteTrace_Sequence", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ActivitydiagramTracePackageImpl
