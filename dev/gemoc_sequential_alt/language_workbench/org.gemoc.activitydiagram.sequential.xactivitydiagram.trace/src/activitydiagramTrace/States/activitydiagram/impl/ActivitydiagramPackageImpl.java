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
import activitydiagramTrace.States.activitydiagram.TracedBooleanBinaryExpression;
import activitydiagramTrace.States.activitydiagram.TracedBooleanExpression;
import activitydiagramTrace.States.activitydiagram.TracedBooleanUnaryExpression;
import activitydiagramTrace.States.activitydiagram.TracedBooleanValue;
import activitydiagramTrace.States.activitydiagram.TracedBooleanVariable;
import activitydiagramTrace.States.activitydiagram.TracedControlFlow;
import activitydiagramTrace.States.activitydiagram.TracedControlNode;
import activitydiagramTrace.States.activitydiagram.TracedControlToken;
import activitydiagramTrace.States.activitydiagram.TracedDecisionNode;
import activitydiagramTrace.States.activitydiagram.TracedExpression;
import activitydiagramTrace.States.activitydiagram.TracedFinalNode;
import activitydiagramTrace.States.activitydiagram.TracedFlowFinalNode;
import activitydiagramTrace.States.activitydiagram.TracedForkNode;
import activitydiagramTrace.States.activitydiagram.TracedInitialNode;
import activitydiagramTrace.States.activitydiagram.TracedIntegerBinaryExpression;
import activitydiagramTrace.States.activitydiagram.TracedIntegerComparisonExpression;
import activitydiagramTrace.States.activitydiagram.TracedIntegerExpression;
import activitydiagramTrace.States.activitydiagram.TracedIntegerValue;
import activitydiagramTrace.States.activitydiagram.TracedIntegerVariable;
import activitydiagramTrace.States.activitydiagram.TracedJoinNode;
import activitydiagramTrace.States.activitydiagram.TracedMergeNode;
import activitydiagramTrace.States.activitydiagram.TracedNamedElement;
import activitydiagramTrace.States.activitydiagram.TracedOffer;
import activitydiagramTrace.States.activitydiagram.TracedOpaqueAction;
import activitydiagramTrace.States.activitydiagram.TracedValue;
import activitydiagramTrace.States.activitydiagram.TracedVariable;

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
	private EClass tracedBooleanBinaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedBooleanExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedBooleanUnaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedBooleanValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedBooleanVariableEClass = null;

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
	private EClass tracedExpressionEClass = null;

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
	private EClass tracedFlowFinalNodeEClass = null;

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
	private EClass tracedInitialNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedIntegerBinaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedIntegerComparisonExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedIntegerExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedIntegerValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedIntegerVariableEClass = null;

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
	private EClass tracedValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedVariableEClass = null;

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
	public EReference getTracedActivity_OriginalObject() {
		return (EReference)tracedActivityEClass.getEStructuralFeatures().get(0);
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
	public EReference getTracedActivityEdge_ActivityEdge_offeredTokens_Dimension() {
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
	public EReference getTracedActivityFinalNode_OriginalObject() {
		return (EReference)tracedActivityFinalNodeEClass.getEStructuralFeatures().get(0);
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
	public EClass getTracedBooleanBinaryExpression() {
		return tracedBooleanBinaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedBooleanBinaryExpression_OriginalObject() {
		return (EReference)tracedBooleanBinaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedBooleanExpression() {
		return tracedBooleanExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedBooleanUnaryExpression() {
		return tracedBooleanUnaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedBooleanUnaryExpression_OriginalObject() {
		return (EReference)tracedBooleanUnaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedBooleanValue() {
		return tracedBooleanValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedBooleanValue_OriginalObject() {
		return (EReference)tracedBooleanValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedBooleanVariable() {
		return tracedBooleanVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedBooleanVariable_BooleanVariable_currentValue_Dimension() {
		return (EReference)tracedBooleanVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedBooleanVariable_OriginalObject() {
		return (EReference)tracedBooleanVariableEClass.getEStructuralFeatures().get(1);
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
	public EReference getTracedDecisionNode_OriginalObject() {
		return (EReference)tracedDecisionNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedExpression() {
		return tracedExpressionEClass;
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
	public EClass getTracedFlowFinalNode() {
		return tracedFlowFinalNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedFlowFinalNode_OriginalObject() {
		return (EReference)tracedFlowFinalNodeEClass.getEStructuralFeatures().get(0);
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
	public EReference getTracedForkNode_OriginalObject() {
		return (EReference)tracedForkNodeEClass.getEStructuralFeatures().get(0);
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
	public EReference getTracedInitialNode_OriginalObject() {
		return (EReference)tracedInitialNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedIntegerBinaryExpression() {
		return tracedIntegerBinaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedIntegerBinaryExpression_OriginalObject() {
		return (EReference)tracedIntegerBinaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedIntegerComparisonExpression() {
		return tracedIntegerComparisonExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedIntegerComparisonExpression_OriginalObject() {
		return (EReference)tracedIntegerComparisonExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedIntegerExpression() {
		return tracedIntegerExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedIntegerValue() {
		return tracedIntegerValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedIntegerValue_OriginalObject() {
		return (EReference)tracedIntegerValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedIntegerVariable() {
		return tracedIntegerVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedIntegerVariable_IntegerVariable_currentValue_Dimension() {
		return (EReference)tracedIntegerVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedIntegerVariable_OriginalObject() {
		return (EReference)tracedIntegerVariableEClass.getEStructuralFeatures().get(1);
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
	public EReference getTracedJoinNode_OriginalObject() {
		return (EReference)tracedJoinNodeEClass.getEStructuralFeatures().get(0);
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
	public EReference getTracedMergeNode_OriginalObject() {
		return (EReference)tracedMergeNodeEClass.getEStructuralFeatures().get(0);
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
	public EClass getTracedOpaqueAction() {
		return tracedOpaqueActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedOpaqueAction_OriginalObject() {
		return (EReference)tracedOpaqueActionEClass.getEStructuralFeatures().get(0);
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
	public EClass getTracedVariable() {
		return tracedVariableEClass;
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
		createEReference(tracedActivityEClass, TRACED_ACTIVITY__ORIGINAL_OBJECT);

		tracedActivityEdgeEClass = createEClass(TRACED_ACTIVITY_EDGE);
		createEReference(tracedActivityEdgeEClass, TRACED_ACTIVITY_EDGE__ACTIVITY_EDGE_OFFERED_TOKENS_DIMENSION);

		tracedActivityFinalNodeEClass = createEClass(TRACED_ACTIVITY_FINAL_NODE);
		createEReference(tracedActivityFinalNodeEClass, TRACED_ACTIVITY_FINAL_NODE__ORIGINAL_OBJECT);

		tracedActivityNodeEClass = createEClass(TRACED_ACTIVITY_NODE);
		createEReference(tracedActivityNodeEClass, TRACED_ACTIVITY_NODE__ACTIVITY_NODE_HELD_TOKENS_DIMENSION);

		tracedBooleanBinaryExpressionEClass = createEClass(TRACED_BOOLEAN_BINARY_EXPRESSION);
		createEReference(tracedBooleanBinaryExpressionEClass, TRACED_BOOLEAN_BINARY_EXPRESSION__ORIGINAL_OBJECT);

		tracedBooleanExpressionEClass = createEClass(TRACED_BOOLEAN_EXPRESSION);

		tracedBooleanUnaryExpressionEClass = createEClass(TRACED_BOOLEAN_UNARY_EXPRESSION);
		createEReference(tracedBooleanUnaryExpressionEClass, TRACED_BOOLEAN_UNARY_EXPRESSION__ORIGINAL_OBJECT);

		tracedBooleanValueEClass = createEClass(TRACED_BOOLEAN_VALUE);
		createEReference(tracedBooleanValueEClass, TRACED_BOOLEAN_VALUE__ORIGINAL_OBJECT);

		tracedBooleanVariableEClass = createEClass(TRACED_BOOLEAN_VARIABLE);
		createEReference(tracedBooleanVariableEClass, TRACED_BOOLEAN_VARIABLE__BOOLEAN_VARIABLE_CURRENT_VALUE_DIMENSION);
		createEReference(tracedBooleanVariableEClass, TRACED_BOOLEAN_VARIABLE__ORIGINAL_OBJECT);

		tracedControlFlowEClass = createEClass(TRACED_CONTROL_FLOW);
		createEReference(tracedControlFlowEClass, TRACED_CONTROL_FLOW__ORIGINAL_OBJECT);

		tracedControlNodeEClass = createEClass(TRACED_CONTROL_NODE);

		tracedControlTokenEClass = createEClass(TRACED_CONTROL_TOKEN);

		tracedDecisionNodeEClass = createEClass(TRACED_DECISION_NODE);
		createEReference(tracedDecisionNodeEClass, TRACED_DECISION_NODE__ORIGINAL_OBJECT);

		tracedExpressionEClass = createEClass(TRACED_EXPRESSION);

		tracedFinalNodeEClass = createEClass(TRACED_FINAL_NODE);

		tracedFlowFinalNodeEClass = createEClass(TRACED_FLOW_FINAL_NODE);
		createEReference(tracedFlowFinalNodeEClass, TRACED_FLOW_FINAL_NODE__ORIGINAL_OBJECT);

		tracedForkNodeEClass = createEClass(TRACED_FORK_NODE);
		createEReference(tracedForkNodeEClass, TRACED_FORK_NODE__ORIGINAL_OBJECT);

		tracedInitialNodeEClass = createEClass(TRACED_INITIAL_NODE);
		createEReference(tracedInitialNodeEClass, TRACED_INITIAL_NODE__ORIGINAL_OBJECT);

		tracedIntegerBinaryExpressionEClass = createEClass(TRACED_INTEGER_BINARY_EXPRESSION);
		createEReference(tracedIntegerBinaryExpressionEClass, TRACED_INTEGER_BINARY_EXPRESSION__ORIGINAL_OBJECT);

		tracedIntegerComparisonExpressionEClass = createEClass(TRACED_INTEGER_COMPARISON_EXPRESSION);
		createEReference(tracedIntegerComparisonExpressionEClass, TRACED_INTEGER_COMPARISON_EXPRESSION__ORIGINAL_OBJECT);

		tracedIntegerExpressionEClass = createEClass(TRACED_INTEGER_EXPRESSION);

		tracedIntegerValueEClass = createEClass(TRACED_INTEGER_VALUE);
		createEReference(tracedIntegerValueEClass, TRACED_INTEGER_VALUE__ORIGINAL_OBJECT);

		tracedIntegerVariableEClass = createEClass(TRACED_INTEGER_VARIABLE);
		createEReference(tracedIntegerVariableEClass, TRACED_INTEGER_VARIABLE__INTEGER_VARIABLE_CURRENT_VALUE_DIMENSION);
		createEReference(tracedIntegerVariableEClass, TRACED_INTEGER_VARIABLE__ORIGINAL_OBJECT);

		tracedJoinNodeEClass = createEClass(TRACED_JOIN_NODE);
		createEReference(tracedJoinNodeEClass, TRACED_JOIN_NODE__ORIGINAL_OBJECT);

		tracedMergeNodeEClass = createEClass(TRACED_MERGE_NODE);
		createEReference(tracedMergeNodeEClass, TRACED_MERGE_NODE__ORIGINAL_OBJECT);

		tracedNamedElementEClass = createEClass(TRACED_NAMED_ELEMENT);

		tracedOfferEClass = createEClass(TRACED_OFFER);

		tracedOpaqueActionEClass = createEClass(TRACED_OPAQUE_ACTION);
		createEReference(tracedOpaqueActionEClass, TRACED_OPAQUE_ACTION__ORIGINAL_OBJECT);

		tracedValueEClass = createEClass(TRACED_VALUE);

		tracedVariableEClass = createEClass(TRACED_VARIABLE);
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
		tracedActionEClass.getESuperTypes().add(this.getTracedActivityNode());
		tracedActivityEClass.getESuperTypes().add(this.getTracedNamedElement());
		tracedActivityEdgeEClass.getESuperTypes().add(this.getTracedNamedElement());
		tracedActivityFinalNodeEClass.getESuperTypes().add(this.getTracedFinalNode());
		tracedActivityNodeEClass.getESuperTypes().add(this.getTracedNamedElement());
		tracedBooleanBinaryExpressionEClass.getESuperTypes().add(this.getTracedBooleanExpression());
		tracedBooleanExpressionEClass.getESuperTypes().add(this.getTracedExpression());
		tracedBooleanUnaryExpressionEClass.getESuperTypes().add(this.getTracedBooleanExpression());
		tracedBooleanValueEClass.getESuperTypes().add(this.getTracedValue());
		tracedBooleanValueEClass.getESuperTypes().add(this.getTracedBooleanExpression());
		tracedBooleanVariableEClass.getESuperTypes().add(this.getTracedVariable());
		tracedBooleanVariableEClass.getESuperTypes().add(this.getTracedBooleanExpression());
		tracedControlFlowEClass.getESuperTypes().add(this.getTracedActivityEdge());
		tracedControlNodeEClass.getESuperTypes().add(this.getTracedActivityNode());
		EGenericType g1 = createEGenericType(theStatesPackage.getSpecificTracedObject());
		EGenericType g2 = createEGenericType(theStatesPackage.getSpecificDimension());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		tracedControlTokenEClass.getEGenericSuperTypes().add(g1);
		tracedDecisionNodeEClass.getESuperTypes().add(this.getTracedControlNode());
		g1 = createEGenericType(theStatesPackage.getSpecificTracedObject());
		g2 = createEGenericType(theStatesPackage.getSpecificDimension());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		tracedExpressionEClass.getEGenericSuperTypes().add(g1);
		tracedFinalNodeEClass.getESuperTypes().add(this.getTracedControlNode());
		tracedFlowFinalNodeEClass.getESuperTypes().add(this.getTracedFinalNode());
		tracedForkNodeEClass.getESuperTypes().add(this.getTracedControlNode());
		tracedInitialNodeEClass.getESuperTypes().add(this.getTracedControlNode());
		tracedIntegerBinaryExpressionEClass.getESuperTypes().add(this.getTracedExpression());
		tracedIntegerBinaryExpressionEClass.getESuperTypes().add(this.getTracedIntegerExpression());
		tracedIntegerComparisonExpressionEClass.getESuperTypes().add(this.getTracedBooleanExpression());
		tracedIntegerExpressionEClass.getESuperTypes().add(this.getTracedExpression());
		tracedIntegerValueEClass.getESuperTypes().add(this.getTracedValue());
		tracedIntegerValueEClass.getESuperTypes().add(this.getTracedIntegerExpression());
		tracedIntegerVariableEClass.getESuperTypes().add(this.getTracedVariable());
		tracedIntegerVariableEClass.getESuperTypes().add(this.getTracedIntegerExpression());
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
		tracedValueEClass.getESuperTypes().add(this.getTracedExpression());
		tracedVariableEClass.getESuperTypes().add(this.getTracedExpression());

		// Initialize classes and features; add operations and parameters
		initEClass(tracedActionEClass, TracedAction.class, "TracedAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(tracedActionEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedActivityEClass, TracedActivity.class, "TracedActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedActivity_OriginalObject(), theActivitydiagramPackage_1.getActivity(), null, "originalObject", null, 0, 1, TracedActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(tracedActivityEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedActivityEdgeEClass, TracedActivityEdge.class, "TracedActivityEdge", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedActivityEdge_ActivityEdge_offeredTokens_Dimension(), theStatesPackage.getActivityEdge_offeredTokens_Dimension(), null, "activityEdge_offeredTokens_Dimension", null, 0, 1, TracedActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(tracedActivityEdgeEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedActivityFinalNodeEClass, TracedActivityFinalNode.class, "TracedActivityFinalNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedActivityFinalNode_OriginalObject(), theActivitydiagramPackage_1.getActivityFinalNode(), null, "originalObject", null, 0, 1, TracedActivityFinalNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(tracedActivityFinalNodeEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedActivityNodeEClass, TracedActivityNode.class, "TracedActivityNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedActivityNode_ActivityNode_heldTokens_Dimension(), theStatesPackage.getActivityNode_heldTokens_Dimension(), null, "activityNode_heldTokens_Dimension", null, 0, 1, TracedActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(tracedActivityNodeEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedBooleanBinaryExpressionEClass, TracedBooleanBinaryExpression.class, "TracedBooleanBinaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedBooleanBinaryExpression_OriginalObject(), theActivitydiagramPackage_1.getBooleanBinaryExpression(), null, "originalObject", null, 0, 1, TracedBooleanBinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(tracedBooleanBinaryExpressionEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedBooleanExpressionEClass, TracedBooleanExpression.class, "TracedBooleanExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(tracedBooleanExpressionEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedBooleanUnaryExpressionEClass, TracedBooleanUnaryExpression.class, "TracedBooleanUnaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedBooleanUnaryExpression_OriginalObject(), theActivitydiagramPackage_1.getBooleanUnaryExpression(), null, "originalObject", null, 0, 1, TracedBooleanUnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(tracedBooleanUnaryExpressionEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedBooleanValueEClass, TracedBooleanValue.class, "TracedBooleanValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedBooleanValue_OriginalObject(), theActivitydiagramPackage_1.getBooleanValue(), null, "originalObject", null, 0, 1, TracedBooleanValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(tracedBooleanValueEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedBooleanVariableEClass, TracedBooleanVariable.class, "TracedBooleanVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedBooleanVariable_BooleanVariable_currentValue_Dimension(), theStatesPackage.getBooleanVariable_currentValue_Dimension(), null, "booleanVariable_currentValue_Dimension", null, 0, 1, TracedBooleanVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedBooleanVariable_OriginalObject(), theActivitydiagramPackage_1.getBooleanVariable(), null, "originalObject", null, 0, 1, TracedBooleanVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(tracedBooleanVariableEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
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
		initEReference(getTracedDecisionNode_OriginalObject(), theActivitydiagramPackage_1.getDecisionNode(), null, "originalObject", null, 0, 1, TracedDecisionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(tracedDecisionNodeEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedExpressionEClass, TracedExpression.class, "TracedExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(tracedExpressionEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
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

		initEClass(tracedFlowFinalNodeEClass, TracedFlowFinalNode.class, "TracedFlowFinalNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedFlowFinalNode_OriginalObject(), theActivitydiagramPackage_1.getFlowFinalNode(), null, "originalObject", null, 0, 1, TracedFlowFinalNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(tracedFlowFinalNodeEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedForkNodeEClass, TracedForkNode.class, "TracedForkNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedForkNode_OriginalObject(), theActivitydiagramPackage_1.getForkNode(), null, "originalObject", null, 0, 1, TracedForkNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(tracedForkNodeEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedInitialNodeEClass, TracedInitialNode.class, "TracedInitialNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedInitialNode_OriginalObject(), theActivitydiagramPackage_1.getInitialNode(), null, "originalObject", null, 0, 1, TracedInitialNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(tracedInitialNodeEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedIntegerBinaryExpressionEClass, TracedIntegerBinaryExpression.class, "TracedIntegerBinaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedIntegerBinaryExpression_OriginalObject(), theActivitydiagramPackage_1.getIntegerBinaryExpression(), null, "originalObject", null, 0, 1, TracedIntegerBinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(tracedIntegerBinaryExpressionEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedIntegerComparisonExpressionEClass, TracedIntegerComparisonExpression.class, "TracedIntegerComparisonExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedIntegerComparisonExpression_OriginalObject(), theActivitydiagramPackage_1.getIntegerComparisonExpression(), null, "originalObject", null, 0, 1, TracedIntegerComparisonExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(tracedIntegerComparisonExpressionEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedIntegerExpressionEClass, TracedIntegerExpression.class, "TracedIntegerExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(tracedIntegerExpressionEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedIntegerValueEClass, TracedIntegerValue.class, "TracedIntegerValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedIntegerValue_OriginalObject(), theActivitydiagramPackage_1.getIntegerValue(), null, "originalObject", null, 0, 1, TracedIntegerValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(tracedIntegerValueEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedIntegerVariableEClass, TracedIntegerVariable.class, "TracedIntegerVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedIntegerVariable_IntegerVariable_currentValue_Dimension(), theStatesPackage.getIntegerVariable_currentValue_Dimension(), null, "integerVariable_currentValue_Dimension", null, 0, 1, TracedIntegerVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedIntegerVariable_OriginalObject(), theActivitydiagramPackage_1.getIntegerVariable(), null, "originalObject", null, 0, 1, TracedIntegerVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(tracedIntegerVariableEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedJoinNodeEClass, TracedJoinNode.class, "TracedJoinNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedJoinNode_OriginalObject(), theActivitydiagramPackage_1.getJoinNode(), null, "originalObject", null, 0, 1, TracedJoinNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(tracedJoinNodeEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedMergeNodeEClass, TracedMergeNode.class, "TracedMergeNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedMergeNode_OriginalObject(), theActivitydiagramPackage_1.getMergeNode(), null, "originalObject", null, 0, 1, TracedMergeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		op = addEOperation(tracedOfferEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedOpaqueActionEClass, TracedOpaqueAction.class, "TracedOpaqueAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedOpaqueAction_OriginalObject(), theActivitydiagramPackage_1.getOpaqueAction(), null, "originalObject", null, 0, 1, TracedOpaqueAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(tracedOpaqueActionEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
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

		initEClass(tracedVariableEClass, TracedVariable.class, "TracedVariable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(tracedVariableEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);
	}

} //ActivitydiagramPackageImpl
