/**
 */
package activitydiagramTrace.States.activitydiagram.impl;

import activitydiagramTrace.ActivitydiagramTracePackage;

import activitydiagramTrace.States.StatesPackage;

import activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory;
import activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage;
import activitydiagramTrace.States.activitydiagram.TracedAction;
import activitydiagramTrace.States.activitydiagram.TracedActivity;
import activitydiagramTrace.States.activitydiagram.TracedActivityEdge;
import activitydiagramTrace.States.activitydiagram.TracedActivityFinalNode;
import activitydiagramTrace.States.activitydiagram.TracedActivityNode;
import activitydiagramTrace.States.activitydiagram.TracedControlFlow;
import activitydiagramTrace.States.activitydiagram.TracedControlNode;
import activitydiagramTrace.States.activitydiagram.TracedControlToken;
import activitydiagramTrace.States.activitydiagram.TracedDecisionNode;
import activitydiagramTrace.States.activitydiagram.TracedDynamicBooleanValue;
import activitydiagramTrace.States.activitydiagram.TracedDynamicIntegerValue;
import activitydiagramTrace.States.activitydiagram.TracedExecutableNode;
import activitydiagramTrace.States.activitydiagram.TracedFinalNode;
import activitydiagramTrace.States.activitydiagram.TracedForkNode;
import activitydiagramTrace.States.activitydiagram.TracedForkedToken;
import activitydiagramTrace.States.activitydiagram.TracedInitialNode;
import activitydiagramTrace.States.activitydiagram.TracedInput;
import activitydiagramTrace.States.activitydiagram.TracedInputValue;
import activitydiagramTrace.States.activitydiagram.TracedJoinNode;
import activitydiagramTrace.States.activitydiagram.TracedMergeNode;
import activitydiagramTrace.States.activitydiagram.TracedNamedElement;
import activitydiagramTrace.States.activitydiagram.TracedOffer;
import activitydiagramTrace.States.activitydiagram.TracedOpaqueAction;
import activitydiagramTrace.States.activitydiagram.TracedStaticBooleanValue;
import activitydiagramTrace.States.activitydiagram.TracedStaticIntegerValue;
import activitydiagramTrace.States.activitydiagram.TracedToken;
import activitydiagramTrace.States.activitydiagram.TracedTrace;
import activitydiagramTrace.States.activitydiagram.TracedValue;

import activitydiagramTrace.States.impl.StatesPackageImpl;

import activitydiagramTrace.Steps.StepsPackage;

import activitydiagramTrace.Steps.impl.StepsPackageImpl;

import activitydiagramTrace.impl.ActivitydiagramTracePackageImpl;

import fr.inria.diverse.trace.commons.model.trace.TracePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivitydiagramPackageImpl extends EPackageImpl implements ActivitydiagramPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedActivityEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedActivityFinalNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedActivityNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedControlFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedControlNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedControlTokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedDecisionNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedDynamicBooleanValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedDynamicIntegerValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedExecutableNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedFinalNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedForkNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedForkedTokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedInitialNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedInputValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedJoinNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedMergeNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedNamedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedOfferEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedOpaqueActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedStaticBooleanValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedStaticIntegerValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedTokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedTraceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedValueEClass = null;

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
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ActivitydiagramPackageImpl() {
		super(eNS_URI, ActivitydiagramFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ActivitydiagramPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ActivitydiagramPackage init() {
		if (isInited) return (ActivitydiagramPackage)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI);

		// Obtain or create and register package
		ActivitydiagramPackageImpl theActivitydiagramPackage = (ActivitydiagramPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ActivitydiagramPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ActivitydiagramPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TracePackage.eINSTANCE.eClass();
		org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ActivitydiagramTracePackageImpl theActivitydiagramTracePackage = (ActivitydiagramTracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramTracePackage.eNS_URI) instanceof ActivitydiagramTracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramTracePackage.eNS_URI) : ActivitydiagramTracePackage.eINSTANCE);
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) : StepsPackage.eINSTANCE);
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) : StatesPackage.eINSTANCE);

		// Create package meta-data objects
		theActivitydiagramPackage.createPackageContents();
		theActivitydiagramTracePackage.createPackageContents();
		theStepsPackage.createPackageContents();
		theStatesPackage.createPackageContents();

		// Initialize created meta-data
		theActivitydiagramPackage.initializePackageContents();
		theActivitydiagramTracePackage.initializePackageContents();
		theStepsPackage.initializePackageContents();
		theStatesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theActivitydiagramPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ActivitydiagramPackage.eNS_URI, theActivitydiagramPackage);
		return theActivitydiagramPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedAction() {
		return tracedActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedActivity() {
		return tracedActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActivity_Activity_trace_Dimension() {
		return (EReference)tracedActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActivity_OriginalObject() {
		return (EReference)tracedActivityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedActivityEdge() {
		return tracedActivityEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActivityEdge_ActivityEdge_offers_Dimension() {
		return (EReference)tracedActivityEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedActivityFinalNode() {
		return tracedActivityFinalNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedActivityNode() {
		return tracedActivityNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActivityNode_ActivityNode_heldTokens_Dimension() {
		return (EReference)tracedActivityNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActivityNode_OriginalObject_ActivityNode() {
		return (EReference)tracedActivityNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedControlFlow() {
		return tracedControlFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedControlFlow_OriginalObject() {
		return (EReference)tracedControlFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedControlNode() {
		return tracedControlNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedControlToken() {
		return tracedControlTokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedDecisionNode() {
		return tracedDecisionNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedDynamicBooleanValue() {
		return tracedDynamicBooleanValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedDynamicBooleanValue_DynamicBooleanValue_value_Dimension() {
		return (EReference)tracedDynamicBooleanValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedDynamicBooleanValue_OriginalObject() {
		return (EReference)tracedDynamicBooleanValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedDynamicIntegerValue() {
		return tracedDynamicIntegerValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedDynamicIntegerValue_DynamicIntegerValue_value_Dimension() {
		return (EReference)tracedDynamicIntegerValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedDynamicIntegerValue_OriginalObject() {
		return (EReference)tracedDynamicIntegerValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedExecutableNode() {
		return tracedExecutableNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedFinalNode() {
		return tracedFinalNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedForkNode() {
		return tracedForkNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedForkedToken() {
		return tracedForkedTokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedForkedToken_ForkedToken_baseToken_Dimension() {
		return (EReference)tracedForkedTokenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedForkedToken_ForkedToken_remainingOffersCount_Dimension() {
		return (EReference)tracedForkedTokenEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedInitialNode() {
		return tracedInitialNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedInput() {
		return tracedInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedInput_Input_inputValues_Dimension() {
		return (EReference)tracedInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedInputValue() {
		return tracedInputValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedJoinNode() {
		return tracedJoinNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedMergeNode() {
		return tracedMergeNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedNamedElement() {
		return tracedNamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedOffer() {
		return tracedOfferEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedOffer_Offer_offeredTokens_Dimension() {
		return (EReference)tracedOfferEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedOpaqueAction() {
		return tracedOpaqueActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedStaticBooleanValue() {
		return tracedStaticBooleanValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedStaticBooleanValue_OriginalObject() {
		return (EReference)tracedStaticBooleanValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedStaticIntegerValue() {
		return tracedStaticIntegerValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedStaticIntegerValue_OriginalObject() {
		return (EReference)tracedStaticIntegerValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedToken() {
		return tracedTokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedTrace() {
		return tracedTraceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedTrace_Trace_executedNodes_Dimension() {
		return (EReference)tracedTraceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedValue() {
		return tracedValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivitydiagramFactory getActivitydiagramFactory() {
		return (ActivitydiagramFactory)getEFactoryInstance();
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
		tracedActionEClass = createEClass(TRACED_ACTION);

		tracedActivityEClass = createEClass(TRACED_ACTIVITY);
		createEReference(tracedActivityEClass, TRACED_ACTIVITY__ACTIVITY_TRACE_DIMENSION);
		createEReference(tracedActivityEClass, TRACED_ACTIVITY__ORIGINAL_OBJECT);

		tracedActivityEdgeEClass = createEClass(TRACED_ACTIVITY_EDGE);
		createEReference(tracedActivityEdgeEClass, TRACED_ACTIVITY_EDGE__ACTIVITY_EDGE_OFFERS_DIMENSION);

		tracedActivityFinalNodeEClass = createEClass(TRACED_ACTIVITY_FINAL_NODE);

		tracedActivityNodeEClass = createEClass(TRACED_ACTIVITY_NODE);
		createEReference(tracedActivityNodeEClass, TRACED_ACTIVITY_NODE__ACTIVITY_NODE_HELD_TOKENS_DIMENSION);
		createEReference(tracedActivityNodeEClass, TRACED_ACTIVITY_NODE__ORIGINAL_OBJECT_ACTIVITY_NODE);

		tracedControlFlowEClass = createEClass(TRACED_CONTROL_FLOW);
		createEReference(tracedControlFlowEClass, TRACED_CONTROL_FLOW__ORIGINAL_OBJECT);

		tracedControlNodeEClass = createEClass(TRACED_CONTROL_NODE);

		tracedControlTokenEClass = createEClass(TRACED_CONTROL_TOKEN);

		tracedDecisionNodeEClass = createEClass(TRACED_DECISION_NODE);

		tracedDynamicBooleanValueEClass = createEClass(TRACED_DYNAMIC_BOOLEAN_VALUE);
		createEReference(tracedDynamicBooleanValueEClass, TRACED_DYNAMIC_BOOLEAN_VALUE__DYNAMIC_BOOLEAN_VALUE_VALUE_DIMENSION);
		createEReference(tracedDynamicBooleanValueEClass, TRACED_DYNAMIC_BOOLEAN_VALUE__ORIGINAL_OBJECT);

		tracedDynamicIntegerValueEClass = createEClass(TRACED_DYNAMIC_INTEGER_VALUE);
		createEReference(tracedDynamicIntegerValueEClass, TRACED_DYNAMIC_INTEGER_VALUE__DYNAMIC_INTEGER_VALUE_VALUE_DIMENSION);
		createEReference(tracedDynamicIntegerValueEClass, TRACED_DYNAMIC_INTEGER_VALUE__ORIGINAL_OBJECT);

		tracedExecutableNodeEClass = createEClass(TRACED_EXECUTABLE_NODE);

		tracedFinalNodeEClass = createEClass(TRACED_FINAL_NODE);

		tracedForkNodeEClass = createEClass(TRACED_FORK_NODE);

		tracedForkedTokenEClass = createEClass(TRACED_FORKED_TOKEN);
		createEReference(tracedForkedTokenEClass, TRACED_FORKED_TOKEN__FORKED_TOKEN_BASE_TOKEN_DIMENSION);
		createEReference(tracedForkedTokenEClass, TRACED_FORKED_TOKEN__FORKED_TOKEN_REMAINING_OFFERS_COUNT_DIMENSION);

		tracedInitialNodeEClass = createEClass(TRACED_INITIAL_NODE);

		tracedInputEClass = createEClass(TRACED_INPUT);
		createEReference(tracedInputEClass, TRACED_INPUT__INPUT_INPUT_VALUES_DIMENSION);

		tracedInputValueEClass = createEClass(TRACED_INPUT_VALUE);

		tracedJoinNodeEClass = createEClass(TRACED_JOIN_NODE);

		tracedMergeNodeEClass = createEClass(TRACED_MERGE_NODE);

		tracedNamedElementEClass = createEClass(TRACED_NAMED_ELEMENT);

		tracedOfferEClass = createEClass(TRACED_OFFER);
		createEReference(tracedOfferEClass, TRACED_OFFER__OFFER_OFFERED_TOKENS_DIMENSION);

		tracedOpaqueActionEClass = createEClass(TRACED_OPAQUE_ACTION);

		tracedStaticBooleanValueEClass = createEClass(TRACED_STATIC_BOOLEAN_VALUE);
		createEReference(tracedStaticBooleanValueEClass, TRACED_STATIC_BOOLEAN_VALUE__ORIGINAL_OBJECT);

		tracedStaticIntegerValueEClass = createEClass(TRACED_STATIC_INTEGER_VALUE);
		createEReference(tracedStaticIntegerValueEClass, TRACED_STATIC_INTEGER_VALUE__ORIGINAL_OBJECT);

		tracedTokenEClass = createEClass(TRACED_TOKEN);

		tracedTraceEClass = createEClass(TRACED_TRACE);
		createEReference(tracedTraceEClass, TRACED_TRACE__TRACE_EXECUTED_NODES_DIMENSION);

		tracedValueEClass = createEClass(TRACED_VALUE);
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
		org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage theActivitydiagramPackage_1 = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage)EPackage.Registry.INSTANCE.getEPackage(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tracedActionEClass.getESuperTypes().add(this.getTracedExecutableNode());
		tracedActivityEClass.getESuperTypes().add(this.getTracedNamedElement());
		tracedActivityEdgeEClass.getESuperTypes().add(this.getTracedNamedElement());
		tracedActivityFinalNodeEClass.getESuperTypes().add(this.getTracedFinalNode());
		tracedActivityNodeEClass.getESuperTypes().add(this.getTracedNamedElement());
		tracedControlFlowEClass.getESuperTypes().add(this.getTracedActivityEdge());
		tracedControlNodeEClass.getESuperTypes().add(this.getTracedActivityNode());
		tracedControlTokenEClass.getESuperTypes().add(this.getTracedToken());
		tracedDecisionNodeEClass.getESuperTypes().add(this.getTracedControlNode());
		tracedDynamicBooleanValueEClass.getESuperTypes().add(this.getTracedValue());
		tracedDynamicIntegerValueEClass.getESuperTypes().add(this.getTracedValue());
		tracedExecutableNodeEClass.getESuperTypes().add(this.getTracedActivityNode());
		tracedFinalNodeEClass.getESuperTypes().add(this.getTracedControlNode());
		tracedForkNodeEClass.getESuperTypes().add(this.getTracedControlNode());
		tracedForkedTokenEClass.getESuperTypes().add(this.getTracedToken());
		tracedInitialNodeEClass.getESuperTypes().add(this.getTracedControlNode());
		EGenericType g1 = createEGenericType(theStatesPackage.getSpecificTracedObject());
		EGenericType g2 = createEGenericType(theStatesPackage.getSpecificDimension());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		tracedInputEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theStatesPackage.getSpecificTracedObject());
		g2 = createEGenericType(theStatesPackage.getSpecificDimension());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		tracedInputValueEClass.getEGenericSuperTypes().add(g1);
		tracedJoinNodeEClass.getESuperTypes().add(this.getTracedControlNode());
		tracedMergeNodeEClass.getESuperTypes().add(this.getTracedControlNode());
		g1 = createEGenericType(theStatesPackage.getSpecificTracedObject());
		g2 = createEGenericType(theStatesPackage.getSpecificDimension());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		tracedNamedElementEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theStatesPackage.getSpecificTracedObject());
		g2 = createEGenericType(theStatesPackage.getSpecificDimension());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		tracedOfferEClass.getEGenericSuperTypes().add(g1);
		tracedOpaqueActionEClass.getESuperTypes().add(this.getTracedAction());
		tracedStaticBooleanValueEClass.getESuperTypes().add(this.getTracedValue());
		tracedStaticIntegerValueEClass.getESuperTypes().add(this.getTracedValue());
		g1 = createEGenericType(theStatesPackage.getSpecificTracedObject());
		g2 = createEGenericType(theStatesPackage.getSpecificDimension());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		tracedTokenEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theStatesPackage.getSpecificTracedObject());
		g2 = createEGenericType(theStatesPackage.getSpecificDimension());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		tracedTraceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theStatesPackage.getSpecificTracedObject());
		g2 = createEGenericType(theStatesPackage.getSpecificDimension());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		tracedValueEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(tracedActionEClass, TracedAction.class, "TracedAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(tracedActionEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedActivityEClass, TracedActivity.class, "TracedActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedActivity_Activity_trace_Dimension(), theStatesPackage.getActivity_trace_Dimension(), null, "activity_trace_Dimension", null, 0, 1, TracedActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedActivity_OriginalObject(), theActivitydiagramPackage_1.getActivity(), null, "originalObject", null, 0, 1, TracedActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(tracedActivityEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedActivityEdgeEClass, TracedActivityEdge.class, "TracedActivityEdge", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedActivityEdge_ActivityEdge_offers_Dimension(), theStatesPackage.getActivityEdge_offers_Dimension(), null, "activityEdge_offers_Dimension", null, 0, 1, TracedActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(tracedActivityEdgeEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedActivityFinalNodeEClass, TracedActivityFinalNode.class, "TracedActivityFinalNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(tracedActivityFinalNodeEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedActivityNodeEClass, TracedActivityNode.class, "TracedActivityNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedActivityNode_ActivityNode_heldTokens_Dimension(), theStatesPackage.getActivityNode_heldTokens_Dimension(), null, "activityNode_heldTokens_Dimension", null, 0, 1, TracedActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedActivityNode_OriginalObject_ActivityNode(), theActivitydiagramPackage_1.getActivityNode(), null, "originalObject_ActivityNode", null, 0, 1, TracedActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(tracedActivityNodeEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedControlFlowEClass, TracedControlFlow.class, "TracedControlFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedControlFlow_OriginalObject(), theActivitydiagramPackage_1.getControlFlow(), null, "originalObject", null, 0, 1, TracedControlFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(tracedControlFlowEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedControlNodeEClass, TracedControlNode.class, "TracedControlNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(tracedControlNodeEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedControlTokenEClass, TracedControlToken.class, "TracedControlToken", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(tracedControlTokenEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedDecisionNodeEClass, TracedDecisionNode.class, "TracedDecisionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(tracedDecisionNodeEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedDynamicBooleanValueEClass, TracedDynamicBooleanValue.class, "TracedDynamicBooleanValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedDynamicBooleanValue_DynamicBooleanValue_value_Dimension(), theStatesPackage.getDynamicBooleanValue_value_Dimension(), null, "dynamicBooleanValue_value_Dimension", null, 0, 1, TracedDynamicBooleanValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedDynamicBooleanValue_OriginalObject(), theActivitydiagramPackage_1.getDynamicBooleanValue(), null, "originalObject", null, 0, 1, TracedDynamicBooleanValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(tracedDynamicBooleanValueEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedDynamicIntegerValueEClass, TracedDynamicIntegerValue.class, "TracedDynamicIntegerValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedDynamicIntegerValue_DynamicIntegerValue_value_Dimension(), theStatesPackage.getDynamicIntegerValue_value_Dimension(), null, "dynamicIntegerValue_value_Dimension", null, 0, 1, TracedDynamicIntegerValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedDynamicIntegerValue_OriginalObject(), theActivitydiagramPackage_1.getDynamicIntegerValue(), null, "originalObject", null, 0, 1, TracedDynamicIntegerValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(tracedDynamicIntegerValueEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedExecutableNodeEClass, TracedExecutableNode.class, "TracedExecutableNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(tracedExecutableNodeEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedFinalNodeEClass, TracedFinalNode.class, "TracedFinalNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(tracedFinalNodeEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedForkNodeEClass, TracedForkNode.class, "TracedForkNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(tracedForkNodeEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedForkedTokenEClass, TracedForkedToken.class, "TracedForkedToken", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedForkedToken_ForkedToken_baseToken_Dimension(), theStatesPackage.getForkedToken_baseToken_Dimension(), null, "forkedToken_baseToken_Dimension", null, 0, 1, TracedForkedToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedForkedToken_ForkedToken_remainingOffersCount_Dimension(), theStatesPackage.getForkedToken_remainingOffersCount_Dimension(), null, "forkedToken_remainingOffersCount_Dimension", null, 0, 1, TracedForkedToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(tracedForkedTokenEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedInitialNodeEClass, TracedInitialNode.class, "TracedInitialNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(tracedInitialNodeEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedInputEClass, TracedInput.class, "TracedInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedInput_Input_inputValues_Dimension(), theStatesPackage.getInput_inputValues_Dimension(), null, "input_inputValues_Dimension", null, 0, 1, TracedInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(tracedInputEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedInputValueEClass, TracedInputValue.class, "TracedInputValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(tracedInputValueEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedJoinNodeEClass, TracedJoinNode.class, "TracedJoinNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(tracedJoinNodeEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedMergeNodeEClass, TracedMergeNode.class, "TracedMergeNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(tracedMergeNodeEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedNamedElementEClass, TracedNamedElement.class, "TracedNamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(tracedNamedElementEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedOfferEClass, TracedOffer.class, "TracedOffer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedOffer_Offer_offeredTokens_Dimension(), theStatesPackage.getOffer_offeredTokens_Dimension(), null, "offer_offeredTokens_Dimension", null, 0, 1, TracedOffer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(tracedOfferEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedOpaqueActionEClass, TracedOpaqueAction.class, "TracedOpaqueAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(tracedOpaqueActionEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedStaticBooleanValueEClass, TracedStaticBooleanValue.class, "TracedStaticBooleanValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedStaticBooleanValue_OriginalObject(), theActivitydiagramPackage_1.getStaticBooleanValue(), null, "originalObject", null, 0, 1, TracedStaticBooleanValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(tracedStaticBooleanValueEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedStaticIntegerValueEClass, TracedStaticIntegerValue.class, "TracedStaticIntegerValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedStaticIntegerValue_OriginalObject(), theActivitydiagramPackage_1.getStaticIntegerValue(), null, "originalObject", null, 0, 1, TracedStaticIntegerValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(tracedStaticIntegerValueEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedTokenEClass, TracedToken.class, "TracedToken", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(tracedTokenEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedTraceEClass, TracedTrace.class, "TracedTrace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedTrace_Trace_executedNodes_Dimension(), theStatesPackage.getTrace_executedNodes_Dimension(), null, "trace_executedNodes_Dimension", null, 0, 1, TracedTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(tracedTraceEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedValueEClass, TracedValue.class, "TracedValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(tracedValueEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);
	}

} //ActivitydiagramPackageImpl
