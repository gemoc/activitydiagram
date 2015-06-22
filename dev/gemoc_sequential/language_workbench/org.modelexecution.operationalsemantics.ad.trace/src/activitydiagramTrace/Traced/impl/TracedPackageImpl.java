/**
 */
package activitydiagramTrace.Traced.impl;

import activitydiagram.ActivitydiagramPackage;

import activitydiagramTrace.ActivitydiagramTracePackage;

import activitydiagramTrace.Steps.StepsPackage;

import activitydiagramTrace.Steps.impl.StepsPackageImpl;

import activitydiagramTrace.Traced.TracedFactory;
import activitydiagramTrace.Traced.TracedObjects;
import activitydiagramTrace.Traced.TracedPackage;

import activitydiagramTrace.Traced.activitydiagram.impl.ActivitydiagramPackageImpl;

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
public class TracedPackageImpl extends EPackageImpl implements TracedPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedObjectsEClass = null;

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
	 * @see activitydiagramTrace.Traced.TracedPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TracedPackageImpl() {
		super(eNS_URI, TracedFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TracedPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TracedPackage init() {
		if (isInited) return (TracedPackage)EPackage.Registry.INSTANCE.getEPackage(TracedPackage.eNS_URI);

		// Obtain or create and register package
		TracedPackageImpl theTracedPackage = (TracedPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TracedPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TracedPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ActivitydiagramPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ActivitydiagramTracePackageImpl theActivitydiagramTracePackage = (ActivitydiagramTracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramTracePackage.eNS_URI) instanceof ActivitydiagramTracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramTracePackage.eNS_URI) : ActivitydiagramTracePackage.eINSTANCE);
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) : StepsPackage.eINSTANCE);
		ValuesPackageImpl theValuesPackage = (ValuesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI) instanceof ValuesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI) : ValuesPackage.eINSTANCE);
		ActivitydiagramPackageImpl theActivitydiagramPackage_1 = (ActivitydiagramPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage.eNS_URI) instanceof ActivitydiagramPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage.eNS_URI) : activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage.eINSTANCE);

		// Create package meta-data objects
		theTracedPackage.createPackageContents();
		theActivitydiagramTracePackage.createPackageContents();
		theStepsPackage.createPackageContents();
		theValuesPackage.createPackageContents();
		theActivitydiagramPackage_1.createPackageContents();

		// Initialize created meta-data
		theTracedPackage.initializePackageContents();
		theActivitydiagramTracePackage.initializePackageContents();
		theStepsPackage.initializePackageContents();
		theValuesPackage.initializePackageContents();
		theActivitydiagramPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTracedPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TracedPackage.eNS_URI, theTracedPackage);
		return theTracedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedObjects() {
		return tracedObjectsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedObjects_Activitydiagram_tracedDecisionNodes() {
		return (EReference)tracedObjectsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedObjects_Activitydiagram_tracedIntegerVariables() {
		return (EReference)tracedObjectsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedObjects_Activitydiagram_tracedControlTokens() {
		return (EReference)tracedObjectsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedObjects_Activitydiagram_tracedInputs() {
		return (EReference)tracedObjectsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedObjects_Activitydiagram_tracedForkedTokens() {
		return (EReference)tracedObjectsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedObjects_Activitydiagram_tracedBooleanVariables() {
		return (EReference)tracedObjectsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedObjects_Activitydiagram_tracedInitialNodes() {
		return (EReference)tracedObjectsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedObjects_Activitydiagram_tracedMergeNodes() {
		return (EReference)tracedObjectsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedObjects_Activitydiagram_tracedIntegerValues() {
		return (EReference)tracedObjectsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedObjects_Activitydiagram_tracedOpaqueActions() {
		return (EReference)tracedObjectsEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedObjects_Activitydiagram_tracedForkNodes() {
		return (EReference)tracedObjectsEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedObjects_Activitydiagram_tracedOffers() {
		return (EReference)tracedObjectsEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedObjects_Activitydiagram_tracedInputValues() {
		return (EReference)tracedObjectsEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedObjects_Activitydiagram_tracedControlFlows() {
		return (EReference)tracedObjectsEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedObjects_Activitydiagram_tracedActivityFinalNodes() {
		return (EReference)tracedObjectsEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedObjects_Activitydiagram_tracedJoinNodes() {
		return (EReference)tracedObjectsEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedObjects_Activitydiagram_tracedBooleanValues() {
		return (EReference)tracedObjectsEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedObjects_Activitydiagram_tracedActivitys() {
		return (EReference)tracedObjectsEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedObjects_Activitydiagram_tracedTraces() {
		return (EReference)tracedObjectsEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedFactory getTracedFactory() {
		return (TracedFactory)getEFactoryInstance();
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
		tracedObjectsEClass = createEClass(TRACED_OBJECTS);
		createEReference(tracedObjectsEClass, TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_DECISION_NODES);
		createEReference(tracedObjectsEClass, TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_INTEGER_VARIABLES);
		createEReference(tracedObjectsEClass, TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_CONTROL_TOKENS);
		createEReference(tracedObjectsEClass, TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_INPUTS);
		createEReference(tracedObjectsEClass, TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_FORKED_TOKENS);
		createEReference(tracedObjectsEClass, TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_BOOLEAN_VARIABLES);
		createEReference(tracedObjectsEClass, TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_INITIAL_NODES);
		createEReference(tracedObjectsEClass, TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_MERGE_NODES);
		createEReference(tracedObjectsEClass, TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_INTEGER_VALUES);
		createEReference(tracedObjectsEClass, TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_OPAQUE_ACTIONS);
		createEReference(tracedObjectsEClass, TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_FORK_NODES);
		createEReference(tracedObjectsEClass, TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_OFFERS);
		createEReference(tracedObjectsEClass, TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_INPUT_VALUES);
		createEReference(tracedObjectsEClass, TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_CONTROL_FLOWS);
		createEReference(tracedObjectsEClass, TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_ACTIVITY_FINAL_NODES);
		createEReference(tracedObjectsEClass, TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_JOIN_NODES);
		createEReference(tracedObjectsEClass, TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_BOOLEAN_VALUES);
		createEReference(tracedObjectsEClass, TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_ACTIVITYS);
		createEReference(tracedObjectsEClass, TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_TRACES);
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
		activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage theActivitydiagramPackage_1 = (activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage)EPackage.Registry.INSTANCE.getEPackage(activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theActivitydiagramPackage_1);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(tracedObjectsEClass, TracedObjects.class, "TracedObjects", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedObjects_Activitydiagram_tracedDecisionNodes(), theActivitydiagramPackage_1.getTracedDecisionNode(), null, "activitydiagram_tracedDecisionNodes", null, 0, -1, TracedObjects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTracedObjects_Activitydiagram_tracedIntegerVariables(), theActivitydiagramPackage_1.getTracedIntegerVariable(), null, "activitydiagram_tracedIntegerVariables", null, 0, -1, TracedObjects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTracedObjects_Activitydiagram_tracedControlTokens(), theActivitydiagramPackage_1.getTracedControlToken(), null, "activitydiagram_tracedControlTokens", null, 0, -1, TracedObjects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTracedObjects_Activitydiagram_tracedInputs(), theActivitydiagramPackage_1.getTracedInput(), null, "activitydiagram_tracedInputs", null, 0, -1, TracedObjects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTracedObjects_Activitydiagram_tracedForkedTokens(), theActivitydiagramPackage_1.getTracedForkedToken(), null, "activitydiagram_tracedForkedTokens", null, 0, -1, TracedObjects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTracedObjects_Activitydiagram_tracedBooleanVariables(), theActivitydiagramPackage_1.getTracedBooleanVariable(), null, "activitydiagram_tracedBooleanVariables", null, 0, -1, TracedObjects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTracedObjects_Activitydiagram_tracedInitialNodes(), theActivitydiagramPackage_1.getTracedInitialNode(), null, "activitydiagram_tracedInitialNodes", null, 0, -1, TracedObjects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTracedObjects_Activitydiagram_tracedMergeNodes(), theActivitydiagramPackage_1.getTracedMergeNode(), null, "activitydiagram_tracedMergeNodes", null, 0, -1, TracedObjects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTracedObjects_Activitydiagram_tracedIntegerValues(), theActivitydiagramPackage_1.getTracedIntegerValue(), null, "activitydiagram_tracedIntegerValues", null, 0, -1, TracedObjects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTracedObjects_Activitydiagram_tracedOpaqueActions(), theActivitydiagramPackage_1.getTracedOpaqueAction(), null, "activitydiagram_tracedOpaqueActions", null, 0, -1, TracedObjects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTracedObjects_Activitydiagram_tracedForkNodes(), theActivitydiagramPackage_1.getTracedForkNode(), null, "activitydiagram_tracedForkNodes", null, 0, -1, TracedObjects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTracedObjects_Activitydiagram_tracedOffers(), theActivitydiagramPackage_1.getTracedOffer(), null, "activitydiagram_tracedOffers", null, 0, -1, TracedObjects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTracedObjects_Activitydiagram_tracedInputValues(), theActivitydiagramPackage_1.getTracedInputValue(), null, "activitydiagram_tracedInputValues", null, 0, -1, TracedObjects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTracedObjects_Activitydiagram_tracedControlFlows(), theActivitydiagramPackage_1.getTracedControlFlow(), null, "activitydiagram_tracedControlFlows", null, 0, -1, TracedObjects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTracedObjects_Activitydiagram_tracedActivityFinalNodes(), theActivitydiagramPackage_1.getTracedActivityFinalNode(), null, "activitydiagram_tracedActivityFinalNodes", null, 0, -1, TracedObjects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTracedObjects_Activitydiagram_tracedJoinNodes(), theActivitydiagramPackage_1.getTracedJoinNode(), null, "activitydiagram_tracedJoinNodes", null, 0, -1, TracedObjects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTracedObjects_Activitydiagram_tracedBooleanValues(), theActivitydiagramPackage_1.getTracedBooleanValue(), null, "activitydiagram_tracedBooleanValues", null, 0, -1, TracedObjects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTracedObjects_Activitydiagram_tracedActivitys(), theActivitydiagramPackage_1.getTracedActivity(), null, "activitydiagram_tracedActivitys", null, 0, -1, TracedObjects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTracedObjects_Activitydiagram_tracedTraces(), theActivitydiagramPackage_1.getTracedTrace(), null, "activitydiagram_tracedTraces", null, 0, -1, TracedObjects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
	}

} //TracedPackageImpl
