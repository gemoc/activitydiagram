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
import activitydiagramTrace.States.activitydiagram.TracedExecutableNode;
import activitydiagramTrace.States.activitydiagram.TracedExpression;
import activitydiagramTrace.States.activitydiagram.TracedFinalNode;
import activitydiagramTrace.States.activitydiagram.TracedForkNode;
import activitydiagramTrace.States.activitydiagram.TracedForkedToken;
import activitydiagramTrace.States.activitydiagram.TracedInitialNode;
import activitydiagramTrace.States.activitydiagram.TracedInput;
import activitydiagramTrace.States.activitydiagram.TracedInputValue;
import activitydiagramTrace.States.activitydiagram.TracedIntegerCalculationExpression;
import activitydiagramTrace.States.activitydiagram.TracedIntegerComparisonExpression;
import activitydiagramTrace.States.activitydiagram.TracedIntegerExpression;
import activitydiagramTrace.States.activitydiagram.TracedIntegerValue;
import activitydiagramTrace.States.activitydiagram.TracedIntegerVariable;
import activitydiagramTrace.States.activitydiagram.TracedJoinNode;
import activitydiagramTrace.States.activitydiagram.TracedMergeNode;
import activitydiagramTrace.States.activitydiagram.TracedNamedElement;
import activitydiagramTrace.States.activitydiagram.TracedOffer;
import activitydiagramTrace.States.activitydiagram.TracedOpaqueAction;
import activitydiagramTrace.States.activitydiagram.TracedToken;
import activitydiagramTrace.States.activitydiagram.TracedTrace;
import activitydiagramTrace.States.activitydiagram.TracedValue;
import activitydiagramTrace.States.activitydiagram.TracedVariable;

import activitydiagramTrace.States.impl.StatesPackageImpl;

import activitydiagramTrace.Steps.StepsPackage;

import activitydiagramTrace.Steps.impl.StepsPackageImpl;

import activitydiagramTrace.impl.ActivitydiagramTracePackageImpl;

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
	private EClass tracedExecutableNodeEClass = null;

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
	private EClass tracedIntegerCalculationExpressionEClass = null;

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
		activitydiagram.ActivitydiagramPackage.eINSTANCE.eClass();
		Engine_msePackage.eINSTANCE.eClass();

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
	public EReference getTracedActivity_EdgesSequence() {
		return (EReference)tracedActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActivity_InputsSequence() {
		return (EReference)tracedActivityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActivity_LocalsSequence() {
		return (EReference)tracedActivityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActivity_NodesSequence() {
		return (EReference)tracedActivityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActivity_TraceSequence() {
		return (EReference)tracedActivityEClass.getEStructuralFeatures().get(4);
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
	public EReference getTracedActivityEdge_OffersSequence() {
		return (EReference)tracedActivityEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActivityEdge_SourceSequence() {
		return (EReference)tracedActivityEdgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActivityEdge_TargetSequence() {
		return (EReference)tracedActivityEdgeEClass.getEStructuralFeatures().get(2);
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
	public EReference getTracedActivityNode_ActivitySequence() {
		return (EReference)tracedActivityNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActivityNode_HeldTokensSequence() {
		return (EReference)tracedActivityNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActivityNode_IncomingSequence() {
		return (EReference)tracedActivityNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActivityNode_OutgoingSequence() {
		return (EReference)tracedActivityNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActivityNode_RunningSequence() {
		return (EReference)tracedActivityNodeEClass.getEStructuralFeatures().get(4);
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
	public EReference getTracedBooleanBinaryExpression_Operand1Sequence() {
		return (EReference)tracedBooleanBinaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedBooleanBinaryExpression_Operand2Sequence() {
		return (EReference)tracedBooleanBinaryExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedBooleanBinaryExpression_OperatorSequence() {
		return (EReference)tracedBooleanBinaryExpressionEClass.getEStructuralFeatures().get(2);
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
	public EReference getTracedBooleanExpression_AssigneeSequence() {
		return (EReference)tracedBooleanExpressionEClass.getEStructuralFeatures().get(0);
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
	public EReference getTracedBooleanUnaryExpression_OperandSequence() {
		return (EReference)tracedBooleanUnaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedBooleanUnaryExpression_OperatorSequence() {
		return (EReference)tracedBooleanUnaryExpressionEClass.getEStructuralFeatures().get(1);
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
	public EReference getTracedBooleanValue_ValueSequence() {
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
	public EClass getTracedControlFlow() {
		return tracedControlFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedControlFlow_GuardSequence() {
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
	public EClass getTracedExecutableNode() {
		return tracedExecutableNodeEClass;
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
	public EReference getTracedForkedToken_BaseTokenSequence() {
		return (EReference)tracedForkedTokenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedForkedToken_RemainingOffersCountSequence() {
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
	public EReference getTracedInput_InputValuesSequence() {
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
	public EReference getTracedInputValue_ValueSequence() {
		return (EReference)tracedInputValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedInputValue_VariableSequence() {
		return (EReference)tracedInputValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedIntegerCalculationExpression() {
		return tracedIntegerCalculationExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedIntegerCalculationExpression_AssigneeSequence() {
		return (EReference)tracedIntegerCalculationExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedIntegerCalculationExpression_OperatorSequence() {
		return (EReference)tracedIntegerCalculationExpressionEClass.getEStructuralFeatures().get(1);
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
	public EReference getTracedIntegerComparisonExpression_AssigneeSequence() {
		return (EReference)tracedIntegerComparisonExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedIntegerComparisonExpression_OperatorSequence() {
		return (EReference)tracedIntegerComparisonExpressionEClass.getEStructuralFeatures().get(1);
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
	public EReference getTracedIntegerExpression_Operand1Sequence() {
		return (EReference)tracedIntegerExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedIntegerExpression_Operand2Sequence() {
		return (EReference)tracedIntegerExpressionEClass.getEStructuralFeatures().get(1);
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
	public EReference getTracedIntegerValue_ValueSequence() {
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
	public EReference getTracedNamedElement_NameSequence() {
		return (EReference)tracedNamedElementEClass.getEStructuralFeatures().get(0);
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
	public EReference getTracedOffer_OfferedTokensSequence() {
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
	public EReference getTracedOpaqueAction_ExpressionsSequence() {
		return (EReference)tracedOpaqueActionEClass.getEStructuralFeatures().get(0);
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
	public EReference getTracedToken_HolderSequence() {
		return (EReference)tracedTokenEClass.getEStructuralFeatures().get(0);
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
	public EReference getTracedTrace_ExecutedNodesSequence() {
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
	public EClass getTracedVariable() {
		return tracedVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedVariable_CurrentValueSequence() {
		return (EReference)tracedVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedVariable_InitialValueSequence() {
		return (EReference)tracedVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedVariable_NameSequence() {
		return (EReference)tracedVariableEClass.getEStructuralFeatures().get(2);
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
		createEReference(tracedActivityEClass, TRACED_ACTIVITY__EDGES_SEQUENCE);
		createEReference(tracedActivityEClass, TRACED_ACTIVITY__INPUTS_SEQUENCE);
		createEReference(tracedActivityEClass, TRACED_ACTIVITY__LOCALS_SEQUENCE);
		createEReference(tracedActivityEClass, TRACED_ACTIVITY__NODES_SEQUENCE);
		createEReference(tracedActivityEClass, TRACED_ACTIVITY__TRACE_SEQUENCE);

		tracedActivityEdgeEClass = createEClass(TRACED_ACTIVITY_EDGE);
		createEReference(tracedActivityEdgeEClass, TRACED_ACTIVITY_EDGE__OFFERS_SEQUENCE);
		createEReference(tracedActivityEdgeEClass, TRACED_ACTIVITY_EDGE__SOURCE_SEQUENCE);
		createEReference(tracedActivityEdgeEClass, TRACED_ACTIVITY_EDGE__TARGET_SEQUENCE);

		tracedActivityFinalNodeEClass = createEClass(TRACED_ACTIVITY_FINAL_NODE);

		tracedActivityNodeEClass = createEClass(TRACED_ACTIVITY_NODE);
		createEReference(tracedActivityNodeEClass, TRACED_ACTIVITY_NODE__ACTIVITY_SEQUENCE);
		createEReference(tracedActivityNodeEClass, TRACED_ACTIVITY_NODE__HELD_TOKENS_SEQUENCE);
		createEReference(tracedActivityNodeEClass, TRACED_ACTIVITY_NODE__INCOMING_SEQUENCE);
		createEReference(tracedActivityNodeEClass, TRACED_ACTIVITY_NODE__OUTGOING_SEQUENCE);
		createEReference(tracedActivityNodeEClass, TRACED_ACTIVITY_NODE__RUNNING_SEQUENCE);

		tracedBooleanBinaryExpressionEClass = createEClass(TRACED_BOOLEAN_BINARY_EXPRESSION);
		createEReference(tracedBooleanBinaryExpressionEClass, TRACED_BOOLEAN_BINARY_EXPRESSION__OPERAND1_SEQUENCE);
		createEReference(tracedBooleanBinaryExpressionEClass, TRACED_BOOLEAN_BINARY_EXPRESSION__OPERAND2_SEQUENCE);
		createEReference(tracedBooleanBinaryExpressionEClass, TRACED_BOOLEAN_BINARY_EXPRESSION__OPERATOR_SEQUENCE);

		tracedBooleanExpressionEClass = createEClass(TRACED_BOOLEAN_EXPRESSION);
		createEReference(tracedBooleanExpressionEClass, TRACED_BOOLEAN_EXPRESSION__ASSIGNEE_SEQUENCE);

		tracedBooleanUnaryExpressionEClass = createEClass(TRACED_BOOLEAN_UNARY_EXPRESSION);
		createEReference(tracedBooleanUnaryExpressionEClass, TRACED_BOOLEAN_UNARY_EXPRESSION__OPERAND_SEQUENCE);
		createEReference(tracedBooleanUnaryExpressionEClass, TRACED_BOOLEAN_UNARY_EXPRESSION__OPERATOR_SEQUENCE);

		tracedBooleanValueEClass = createEClass(TRACED_BOOLEAN_VALUE);
		createEReference(tracedBooleanValueEClass, TRACED_BOOLEAN_VALUE__VALUE_SEQUENCE);

		tracedBooleanVariableEClass = createEClass(TRACED_BOOLEAN_VARIABLE);

		tracedControlFlowEClass = createEClass(TRACED_CONTROL_FLOW);
		createEReference(tracedControlFlowEClass, TRACED_CONTROL_FLOW__GUARD_SEQUENCE);

		tracedControlNodeEClass = createEClass(TRACED_CONTROL_NODE);

		tracedControlTokenEClass = createEClass(TRACED_CONTROL_TOKEN);

		tracedDecisionNodeEClass = createEClass(TRACED_DECISION_NODE);

		tracedExecutableNodeEClass = createEClass(TRACED_EXECUTABLE_NODE);

		tracedExpressionEClass = createEClass(TRACED_EXPRESSION);

		tracedFinalNodeEClass = createEClass(TRACED_FINAL_NODE);

		tracedForkNodeEClass = createEClass(TRACED_FORK_NODE);

		tracedForkedTokenEClass = createEClass(TRACED_FORKED_TOKEN);
		createEReference(tracedForkedTokenEClass, TRACED_FORKED_TOKEN__BASE_TOKEN_SEQUENCE);
		createEReference(tracedForkedTokenEClass, TRACED_FORKED_TOKEN__REMAINING_OFFERS_COUNT_SEQUENCE);

		tracedInitialNodeEClass = createEClass(TRACED_INITIAL_NODE);

		tracedInputEClass = createEClass(TRACED_INPUT);
		createEReference(tracedInputEClass, TRACED_INPUT__INPUT_VALUES_SEQUENCE);

		tracedInputValueEClass = createEClass(TRACED_INPUT_VALUE);
		createEReference(tracedInputValueEClass, TRACED_INPUT_VALUE__VALUE_SEQUENCE);
		createEReference(tracedInputValueEClass, TRACED_INPUT_VALUE__VARIABLE_SEQUENCE);

		tracedIntegerCalculationExpressionEClass = createEClass(TRACED_INTEGER_CALCULATION_EXPRESSION);
		createEReference(tracedIntegerCalculationExpressionEClass, TRACED_INTEGER_CALCULATION_EXPRESSION__ASSIGNEE_SEQUENCE);
		createEReference(tracedIntegerCalculationExpressionEClass, TRACED_INTEGER_CALCULATION_EXPRESSION__OPERATOR_SEQUENCE);

		tracedIntegerComparisonExpressionEClass = createEClass(TRACED_INTEGER_COMPARISON_EXPRESSION);
		createEReference(tracedIntegerComparisonExpressionEClass, TRACED_INTEGER_COMPARISON_EXPRESSION__ASSIGNEE_SEQUENCE);
		createEReference(tracedIntegerComparisonExpressionEClass, TRACED_INTEGER_COMPARISON_EXPRESSION__OPERATOR_SEQUENCE);

		tracedIntegerExpressionEClass = createEClass(TRACED_INTEGER_EXPRESSION);
		createEReference(tracedIntegerExpressionEClass, TRACED_INTEGER_EXPRESSION__OPERAND1_SEQUENCE);
		createEReference(tracedIntegerExpressionEClass, TRACED_INTEGER_EXPRESSION__OPERAND2_SEQUENCE);

		tracedIntegerValueEClass = createEClass(TRACED_INTEGER_VALUE);
		createEReference(tracedIntegerValueEClass, TRACED_INTEGER_VALUE__VALUE_SEQUENCE);

		tracedIntegerVariableEClass = createEClass(TRACED_INTEGER_VARIABLE);

		tracedJoinNodeEClass = createEClass(TRACED_JOIN_NODE);

		tracedMergeNodeEClass = createEClass(TRACED_MERGE_NODE);

		tracedNamedElementEClass = createEClass(TRACED_NAMED_ELEMENT);
		createEReference(tracedNamedElementEClass, TRACED_NAMED_ELEMENT__NAME_SEQUENCE);

		tracedOfferEClass = createEClass(TRACED_OFFER);
		createEReference(tracedOfferEClass, TRACED_OFFER__OFFERED_TOKENS_SEQUENCE);

		tracedOpaqueActionEClass = createEClass(TRACED_OPAQUE_ACTION);
		createEReference(tracedOpaqueActionEClass, TRACED_OPAQUE_ACTION__EXPRESSIONS_SEQUENCE);

		tracedTokenEClass = createEClass(TRACED_TOKEN);
		createEReference(tracedTokenEClass, TRACED_TOKEN__HOLDER_SEQUENCE);

		tracedTraceEClass = createEClass(TRACED_TRACE);
		createEReference(tracedTraceEClass, TRACED_TRACE__EXECUTED_NODES_SEQUENCE);

		tracedValueEClass = createEClass(TRACED_VALUE);

		tracedVariableEClass = createEClass(TRACED_VARIABLE);
		createEReference(tracedVariableEClass, TRACED_VARIABLE__CURRENT_VALUE_SEQUENCE);
		createEReference(tracedVariableEClass, TRACED_VARIABLE__INITIAL_VALUE_SEQUENCE);
		createEReference(tracedVariableEClass, TRACED_VARIABLE__NAME_SEQUENCE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tracedActionEClass.getESuperTypes().add(this.getTracedExecutableNode());
		tracedActivityEClass.getESuperTypes().add(this.getTracedNamedElement());
		tracedActivityEdgeEClass.getESuperTypes().add(this.getTracedNamedElement());
		tracedActivityFinalNodeEClass.getESuperTypes().add(this.getTracedFinalNode());
		tracedActivityNodeEClass.getESuperTypes().add(this.getTracedNamedElement());
		tracedBooleanBinaryExpressionEClass.getESuperTypes().add(this.getTracedBooleanExpression());
		tracedBooleanExpressionEClass.getESuperTypes().add(this.getTracedExpression());
		tracedBooleanUnaryExpressionEClass.getESuperTypes().add(this.getTracedBooleanExpression());
		tracedBooleanValueEClass.getESuperTypes().add(this.getTracedValue());
		tracedBooleanVariableEClass.getESuperTypes().add(this.getTracedVariable());
		tracedControlFlowEClass.getESuperTypes().add(this.getTracedActivityEdge());
		tracedControlNodeEClass.getESuperTypes().add(this.getTracedActivityNode());
		tracedControlTokenEClass.getESuperTypes().add(this.getTracedToken());
		tracedDecisionNodeEClass.getESuperTypes().add(this.getTracedControlNode());
		tracedExecutableNodeEClass.getESuperTypes().add(this.getTracedActivityNode());
		tracedFinalNodeEClass.getESuperTypes().add(this.getTracedControlNode());
		tracedForkNodeEClass.getESuperTypes().add(this.getTracedControlNode());
		tracedForkedTokenEClass.getESuperTypes().add(this.getTracedToken());
		tracedInitialNodeEClass.getESuperTypes().add(this.getTracedControlNode());
		tracedIntegerCalculationExpressionEClass.getESuperTypes().add(this.getTracedIntegerExpression());
		tracedIntegerComparisonExpressionEClass.getESuperTypes().add(this.getTracedIntegerExpression());
		tracedIntegerExpressionEClass.getESuperTypes().add(this.getTracedExpression());
		tracedIntegerValueEClass.getESuperTypes().add(this.getTracedValue());
		tracedIntegerVariableEClass.getESuperTypes().add(this.getTracedVariable());
		tracedJoinNodeEClass.getESuperTypes().add(this.getTracedControlNode());
		tracedMergeNodeEClass.getESuperTypes().add(this.getTracedControlNode());
		tracedOpaqueActionEClass.getESuperTypes().add(this.getTracedAction());

		// Initialize classes, features, and operations; add parameters
		initEClass(tracedActionEClass, TracedAction.class, "TracedAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tracedActivityEClass, TracedActivity.class, "TracedActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedActivity_EdgesSequence(), theStatesPackage.getActivity_edges_Value(), theStatesPackage.getActivity_edges_Value_Parent(), "edgesSequence", null, 0, -1, TracedActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedActivity_InputsSequence(), theStatesPackage.getActivity_inputs_Value(), theStatesPackage.getActivity_inputs_Value_Parent(), "inputsSequence", null, 0, -1, TracedActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedActivity_LocalsSequence(), theStatesPackage.getActivity_locals_Value(), theStatesPackage.getActivity_locals_Value_Parent(), "localsSequence", null, 0, -1, TracedActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedActivity_NodesSequence(), theStatesPackage.getActivity_nodes_Value(), theStatesPackage.getActivity_nodes_Value_Parent(), "nodesSequence", null, 0, -1, TracedActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedActivity_TraceSequence(), theStatesPackage.getActivity_trace_Value(), theStatesPackage.getActivity_trace_Value_Parent(), "traceSequence", null, 0, -1, TracedActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedActivityEdgeEClass, TracedActivityEdge.class, "TracedActivityEdge", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedActivityEdge_OffersSequence(), theStatesPackage.getActivityEdge_offers_Value(), theStatesPackage.getActivityEdge_offers_Value_Parent(), "offersSequence", null, 0, -1, TracedActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedActivityEdge_SourceSequence(), theStatesPackage.getActivityEdge_source_Value(), theStatesPackage.getActivityEdge_source_Value_Parent(), "sourceSequence", null, 0, -1, TracedActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedActivityEdge_TargetSequence(), theStatesPackage.getActivityEdge_target_Value(), theStatesPackage.getActivityEdge_target_Value_Parent(), "targetSequence", null, 0, -1, TracedActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedActivityFinalNodeEClass, TracedActivityFinalNode.class, "TracedActivityFinalNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tracedActivityNodeEClass, TracedActivityNode.class, "TracedActivityNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedActivityNode_ActivitySequence(), theStatesPackage.getActivityNode_activity_Value(), theStatesPackage.getActivityNode_activity_Value_Parent(), "activitySequence", null, 0, -1, TracedActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedActivityNode_HeldTokensSequence(), theStatesPackage.getActivityNode_heldTokens_Value(), theStatesPackage.getActivityNode_heldTokens_Value_Parent(), "heldTokensSequence", null, 0, -1, TracedActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedActivityNode_IncomingSequence(), theStatesPackage.getActivityNode_incoming_Value(), theStatesPackage.getActivityNode_incoming_Value_Parent(), "incomingSequence", null, 0, -1, TracedActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedActivityNode_OutgoingSequence(), theStatesPackage.getActivityNode_outgoing_Value(), theStatesPackage.getActivityNode_outgoing_Value_Parent(), "outgoingSequence", null, 0, -1, TracedActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedActivityNode_RunningSequence(), theStatesPackage.getActivityNode_running_Value(), theStatesPackage.getActivityNode_running_Value_Parent(), "runningSequence", null, 0, -1, TracedActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedBooleanBinaryExpressionEClass, TracedBooleanBinaryExpression.class, "TracedBooleanBinaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedBooleanBinaryExpression_Operand1Sequence(), theStatesPackage.getBooleanBinaryExpression_operand1_Value(), theStatesPackage.getBooleanBinaryExpression_operand1_Value_Parent(), "operand1Sequence", null, 0, -1, TracedBooleanBinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedBooleanBinaryExpression_Operand2Sequence(), theStatesPackage.getBooleanBinaryExpression_operand2_Value(), theStatesPackage.getBooleanBinaryExpression_operand2_Value_Parent(), "operand2Sequence", null, 0, -1, TracedBooleanBinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedBooleanBinaryExpression_OperatorSequence(), theStatesPackage.getBooleanBinaryExpression_operator_Value(), theStatesPackage.getBooleanBinaryExpression_operator_Value_Parent(), "operatorSequence", null, 0, -1, TracedBooleanBinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedBooleanExpressionEClass, TracedBooleanExpression.class, "TracedBooleanExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedBooleanExpression_AssigneeSequence(), theStatesPackage.getBooleanExpression_assignee_Value(), theStatesPackage.getBooleanExpression_assignee_Value_Parent(), "assigneeSequence", null, 0, -1, TracedBooleanExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedBooleanUnaryExpressionEClass, TracedBooleanUnaryExpression.class, "TracedBooleanUnaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedBooleanUnaryExpression_OperandSequence(), theStatesPackage.getBooleanUnaryExpression_operand_Value(), theStatesPackage.getBooleanUnaryExpression_operand_Value_Parent(), "operandSequence", null, 0, -1, TracedBooleanUnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedBooleanUnaryExpression_OperatorSequence(), theStatesPackage.getBooleanUnaryExpression_operator_Value(), theStatesPackage.getBooleanUnaryExpression_operator_Value_Parent(), "operatorSequence", null, 0, -1, TracedBooleanUnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedBooleanValueEClass, TracedBooleanValue.class, "TracedBooleanValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedBooleanValue_ValueSequence(), theStatesPackage.getBooleanValue_value_Value(), theStatesPackage.getBooleanValue_value_Value_Parent(), "valueSequence", null, 0, -1, TracedBooleanValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedBooleanVariableEClass, TracedBooleanVariable.class, "TracedBooleanVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tracedControlFlowEClass, TracedControlFlow.class, "TracedControlFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedControlFlow_GuardSequence(), theStatesPackage.getControlFlow_guard_Value(), theStatesPackage.getControlFlow_guard_Value_Parent(), "guardSequence", null, 0, -1, TracedControlFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedControlNodeEClass, TracedControlNode.class, "TracedControlNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tracedControlTokenEClass, TracedControlToken.class, "TracedControlToken", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tracedDecisionNodeEClass, TracedDecisionNode.class, "TracedDecisionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tracedExecutableNodeEClass, TracedExecutableNode.class, "TracedExecutableNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tracedExpressionEClass, TracedExpression.class, "TracedExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tracedFinalNodeEClass, TracedFinalNode.class, "TracedFinalNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tracedForkNodeEClass, TracedForkNode.class, "TracedForkNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tracedForkedTokenEClass, TracedForkedToken.class, "TracedForkedToken", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedForkedToken_BaseTokenSequence(), theStatesPackage.getForkedToken_baseToken_Value(), theStatesPackage.getForkedToken_baseToken_Value_Parent(), "baseTokenSequence", null, 0, -1, TracedForkedToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedForkedToken_RemainingOffersCountSequence(), theStatesPackage.getForkedToken_remainingOffersCount_Value(), theStatesPackage.getForkedToken_remainingOffersCount_Value_Parent(), "remainingOffersCountSequence", null, 0, -1, TracedForkedToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedInitialNodeEClass, TracedInitialNode.class, "TracedInitialNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tracedInputEClass, TracedInput.class, "TracedInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedInput_InputValuesSequence(), theStatesPackage.getInput_inputValues_Value(), theStatesPackage.getInput_inputValues_Value_Parent(), "inputValuesSequence", null, 0, -1, TracedInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedInputValueEClass, TracedInputValue.class, "TracedInputValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedInputValue_ValueSequence(), theStatesPackage.getInputValue_value_Value(), theStatesPackage.getInputValue_value_Value_Parent(), "valueSequence", null, 0, -1, TracedInputValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedInputValue_VariableSequence(), theStatesPackage.getInputValue_variable_Value(), theStatesPackage.getInputValue_variable_Value_Parent(), "variableSequence", null, 0, -1, TracedInputValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedIntegerCalculationExpressionEClass, TracedIntegerCalculationExpression.class, "TracedIntegerCalculationExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedIntegerCalculationExpression_AssigneeSequence(), theStatesPackage.getIntegerCalculationExpression_assignee_Value(), theStatesPackage.getIntegerCalculationExpression_assignee_Value_Parent(), "assigneeSequence", null, 0, -1, TracedIntegerCalculationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedIntegerCalculationExpression_OperatorSequence(), theStatesPackage.getIntegerCalculationExpression_operator_Value(), theStatesPackage.getIntegerCalculationExpression_operator_Value_Parent(), "operatorSequence", null, 0, -1, TracedIntegerCalculationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedIntegerComparisonExpressionEClass, TracedIntegerComparisonExpression.class, "TracedIntegerComparisonExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedIntegerComparisonExpression_AssigneeSequence(), theStatesPackage.getIntegerComparisonExpression_assignee_Value(), theStatesPackage.getIntegerComparisonExpression_assignee_Value_Parent(), "assigneeSequence", null, 0, -1, TracedIntegerComparisonExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedIntegerComparisonExpression_OperatorSequence(), theStatesPackage.getIntegerComparisonExpression_operator_Value(), theStatesPackage.getIntegerComparisonExpression_operator_Value_Parent(), "operatorSequence", null, 0, -1, TracedIntegerComparisonExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedIntegerExpressionEClass, TracedIntegerExpression.class, "TracedIntegerExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedIntegerExpression_Operand1Sequence(), theStatesPackage.getIntegerExpression_operand1_Value(), theStatesPackage.getIntegerExpression_operand1_Value_Parent(), "operand1Sequence", null, 0, -1, TracedIntegerExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedIntegerExpression_Operand2Sequence(), theStatesPackage.getIntegerExpression_operand2_Value(), theStatesPackage.getIntegerExpression_operand2_Value_Parent(), "operand2Sequence", null, 0, -1, TracedIntegerExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedIntegerValueEClass, TracedIntegerValue.class, "TracedIntegerValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedIntegerValue_ValueSequence(), theStatesPackage.getIntegerValue_value_Value(), theStatesPackage.getIntegerValue_value_Value_Parent(), "valueSequence", null, 0, -1, TracedIntegerValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedIntegerVariableEClass, TracedIntegerVariable.class, "TracedIntegerVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tracedJoinNodeEClass, TracedJoinNode.class, "TracedJoinNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tracedMergeNodeEClass, TracedMergeNode.class, "TracedMergeNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tracedNamedElementEClass, TracedNamedElement.class, "TracedNamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedNamedElement_NameSequence(), theStatesPackage.getNamedElement_name_Value(), theStatesPackage.getNamedElement_name_Value_Parent(), "nameSequence", null, 0, -1, TracedNamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedOfferEClass, TracedOffer.class, "TracedOffer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedOffer_OfferedTokensSequence(), theStatesPackage.getOffer_offeredTokens_Value(), theStatesPackage.getOffer_offeredTokens_Value_Parent(), "offeredTokensSequence", null, 0, -1, TracedOffer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedOpaqueActionEClass, TracedOpaqueAction.class, "TracedOpaqueAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedOpaqueAction_ExpressionsSequence(), theStatesPackage.getOpaqueAction_expressions_Value(), theStatesPackage.getOpaqueAction_expressions_Value_Parent(), "expressionsSequence", null, 0, -1, TracedOpaqueAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedTokenEClass, TracedToken.class, "TracedToken", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedToken_HolderSequence(), theStatesPackage.getToken_holder_Value(), theStatesPackage.getToken_holder_Value_Parent(), "holderSequence", null, 0, -1, TracedToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedTraceEClass, TracedTrace.class, "TracedTrace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedTrace_ExecutedNodesSequence(), theStatesPackage.getTrace_executedNodes_Value(), theStatesPackage.getTrace_executedNodes_Value_Parent(), "executedNodesSequence", null, 0, -1, TracedTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedValueEClass, TracedValue.class, "TracedValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tracedVariableEClass, TracedVariable.class, "TracedVariable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedVariable_CurrentValueSequence(), theStatesPackage.getVariable_currentValue_Value(), theStatesPackage.getVariable_currentValue_Value_Parent(), "currentValueSequence", null, 0, -1, TracedVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedVariable_InitialValueSequence(), theStatesPackage.getVariable_initialValue_Value(), theStatesPackage.getVariable_initialValue_Value_Parent(), "initialValueSequence", null, 0, -1, TracedVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedVariable_NameSequence(), theStatesPackage.getVariable_name_Value(), theStatesPackage.getVariable_name_Value_Parent(), "nameSequence", null, 0, -1, TracedVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //ActivitydiagramPackageImpl
