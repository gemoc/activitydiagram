/**
 */
package activitydiagramTrace.Traced.activitydiagram.impl;

import activitydiagramTrace.ActivitydiagramTracePackage;

import activitydiagramTrace.Steps.StepsPackage;

import activitydiagramTrace.Steps.impl.StepsPackageImpl;

import activitydiagramTrace.Traced.TracedPackage;

import activitydiagramTrace.Traced.activitydiagram.ActivitydiagramFactory;
import activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage;
import activitydiagramTrace.Traced.activitydiagram.TracedAction;
import activitydiagramTrace.Traced.activitydiagram.TracedActivity;
import activitydiagramTrace.Traced.activitydiagram.TracedActivityEdge;
import activitydiagramTrace.Traced.activitydiagram.TracedActivityFinalNode;
import activitydiagramTrace.Traced.activitydiagram.TracedActivityNode;
import activitydiagramTrace.Traced.activitydiagram.TracedBooleanValue;
import activitydiagramTrace.Traced.activitydiagram.TracedBooleanVariable;
import activitydiagramTrace.Traced.activitydiagram.TracedControlFlow;
import activitydiagramTrace.Traced.activitydiagram.TracedControlNode;
import activitydiagramTrace.Traced.activitydiagram.TracedControlToken;
import activitydiagramTrace.Traced.activitydiagram.TracedDecisionNode;
import activitydiagramTrace.Traced.activitydiagram.TracedExecutableNode;
import activitydiagramTrace.Traced.activitydiagram.TracedFinalNode;
import activitydiagramTrace.Traced.activitydiagram.TracedForkNode;
import activitydiagramTrace.Traced.activitydiagram.TracedForkedToken;
import activitydiagramTrace.Traced.activitydiagram.TracedInitialNode;
import activitydiagramTrace.Traced.activitydiagram.TracedInput;
import activitydiagramTrace.Traced.activitydiagram.TracedInputValue;
import activitydiagramTrace.Traced.activitydiagram.TracedIntegerValue;
import activitydiagramTrace.Traced.activitydiagram.TracedIntegerVariable;
import activitydiagramTrace.Traced.activitydiagram.TracedJoinNode;
import activitydiagramTrace.Traced.activitydiagram.TracedMergeNode;
import activitydiagramTrace.Traced.activitydiagram.TracedNamedElement;
import activitydiagramTrace.Traced.activitydiagram.TracedOffer;
import activitydiagramTrace.Traced.activitydiagram.TracedOpaqueAction;
import activitydiagramTrace.Traced.activitydiagram.TracedToken;
import activitydiagramTrace.Traced.activitydiagram.TracedTrace;
import activitydiagramTrace.Traced.activitydiagram.TracedValue;
import activitydiagramTrace.Traced.activitydiagram.TracedVariable;

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
public class ActivitydiagramPackageImpl extends EPackageImpl implements ActivitydiagramPackage {
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
	private EClass tracedNamedElementEClass = null;

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
	private EClass tracedBooleanValueEClass = null;

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
	private EClass tracedActivityEdgeEClass = null;

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
	private EClass tracedJoinNodeEClass = null;

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
	private EClass tracedBooleanVariableEClass = null;

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
	private EClass tracedTokenEClass = null;

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
	private EClass tracedInputValueEClass = null;

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
	private EClass tracedControlFlowEClass = null;

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
	private EClass tracedIntegerVariableEClass = null;

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
	private EClass tracedActivityEClass = null;

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
	private EClass tracedFinalNodeEClass = null;

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
	private EClass tracedMergeNodeEClass = null;

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
	 * @see activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage#eNS_URI
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

		// Obtain or create and register interdependencies
		ActivitydiagramTracePackageImpl theActivitydiagramTracePackage = (ActivitydiagramTracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramTracePackage.eNS_URI) instanceof ActivitydiagramTracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramTracePackage.eNS_URI) : ActivitydiagramTracePackage.eINSTANCE);
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) : StepsPackage.eINSTANCE);
		ValuesPackageImpl theValuesPackage = (ValuesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI) instanceof ValuesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI) : ValuesPackage.eINSTANCE);
		TracedPackageImpl theTracedPackage = (TracedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TracedPackage.eNS_URI) instanceof TracedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TracedPackage.eNS_URI) : TracedPackage.eINSTANCE);

		// Create package meta-data objects
		theActivitydiagramPackage.createPackageContents();
		theActivitydiagramTracePackage.createPackageContents();
		theStepsPackage.createPackageContents();
		theValuesPackage.createPackageContents();
		theTracedPackage.createPackageContents();

		// Initialize created meta-data
		theActivitydiagramPackage.initializePackageContents();
		theActivitydiagramTracePackage.initializePackageContents();
		theStepsPackage.initializePackageContents();
		theValuesPackage.initializePackageContents();
		theTracedPackage.initializePackageContents();

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
	public EClass getTracedIntegerValue() {
		return tracedIntegerValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedIntegerValue_ValueTrace() {
		return (EReference)tracedIntegerValueEClass.getEStructuralFeatures().get(0);
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
	public EClass getTracedInput() {
		return tracedInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedInput_InputValuesTrace() {
		return (EReference)tracedInputEClass.getEStructuralFeatures().get(0);
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
	public EReference getTracedBooleanValue_ValueTrace() {
		return (EReference)tracedBooleanValueEClass.getEStructuralFeatures().get(0);
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
	public EReference getTracedTrace_ExecutedNodesTrace() {
		return (EReference)tracedTraceEClass.getEStructuralFeatures().get(0);
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
	public EClass getTracedActivityEdge() {
		return tracedActivityEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActivityEdge_Source() {
		return (EReference)tracedActivityEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActivityEdge_Target() {
		return (EReference)tracedActivityEdgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActivityEdge_Offers() {
		return (EReference)tracedActivityEdgeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActivityEdge_OffersTrace() {
		return (EReference)tracedActivityEdgeEClass.getEStructuralFeatures().get(3);
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
	public EClass getTracedValue() {
		return tracedValueEClass;
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
	public EReference getTracedBooleanVariable_OriginalObject() {
		return (EReference)tracedBooleanVariableEClass.getEStructuralFeatures().get(0);
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
	public EClass getTracedToken() {
		return tracedTokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedToken_HolderTrace() {
		return (EReference)tracedTokenEClass.getEStructuralFeatures().get(0);
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
	public EClass getTracedInputValue() {
		return tracedInputValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedInputValue_ValueTrace() {
		return (EReference)tracedInputValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedInputValue_VariableTrace() {
		return (EReference)tracedInputValueEClass.getEStructuralFeatures().get(1);
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
	public EClass getTracedControlFlow() {
		return tracedControlFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedControlFlow_Guard() {
		return (EReference)tracedControlFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedControlFlow_OriginalObject() {
		return (EReference)tracedControlFlowEClass.getEStructuralFeatures().get(1);
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
	public EClass getTracedForkedToken() {
		return tracedForkedTokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedForkedToken_RemainingOffersCountTrace() {
		return (EReference)tracedForkedTokenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedForkedToken_BaseTokenTrace() {
		return (EReference)tracedForkedTokenEClass.getEStructuralFeatures().get(1);
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
	public EReference getTracedIntegerVariable_OriginalObject() {
		return (EReference)tracedIntegerVariableEClass.getEStructuralFeatures().get(0);
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
	public EReference getTracedActivityNode_Outgoing() {
		return (EReference)tracedActivityNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActivityNode_Incoming() {
		return (EReference)tracedActivityNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActivityNode_Activity() {
		return (EReference)tracedActivityNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActivityNode_HeldTokens() {
		return (EReference)tracedActivityNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActivityNode_HeldTokensTrace() {
		return (EReference)tracedActivityNodeEClass.getEStructuralFeatures().get(4);
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
	public EReference getTracedActivity_Nodes() {
		return (EReference)tracedActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActivity_Edges() {
		return (EReference)tracedActivityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActivity_Locals() {
		return (EReference)tracedActivityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActivity_Inputs() {
		return (EReference)tracedActivityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActivity_Trace() {
		return (EReference)tracedActivityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActivity_OriginalObject() {
		return (EReference)tracedActivityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActivity_TraceTrace() {
		return (EReference)tracedActivityEClass.getEStructuralFeatures().get(6);
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
	public EReference getTracedOpaqueAction_Expressions() {
		return (EReference)tracedOpaqueActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedOpaqueAction_OriginalObject() {
		return (EReference)tracedOpaqueActionEClass.getEStructuralFeatures().get(1);
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
	public EClass getTracedOffer() {
		return tracedOfferEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedOffer_OfferedTokensTrace() {
		return (EReference)tracedOfferEClass.getEStructuralFeatures().get(0);
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
	public EReference getTracedVariable_InitialValue() {
		return (EReference)tracedVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedVariable_CurrentValue() {
		return (EReference)tracedVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedVariable_CurrentValueTrace() {
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
		tracedIntegerValueEClass = createEClass(TRACED_INTEGER_VALUE);
		createEReference(tracedIntegerValueEClass, TRACED_INTEGER_VALUE__VALUE_TRACE);

		tracedNamedElementEClass = createEClass(TRACED_NAMED_ELEMENT);

		tracedInputEClass = createEClass(TRACED_INPUT);
		createEReference(tracedInputEClass, TRACED_INPUT__INPUT_VALUES_TRACE);

		tracedBooleanValueEClass = createEClass(TRACED_BOOLEAN_VALUE);
		createEReference(tracedBooleanValueEClass, TRACED_BOOLEAN_VALUE__VALUE_TRACE);

		tracedTraceEClass = createEClass(TRACED_TRACE);
		createEReference(tracedTraceEClass, TRACED_TRACE__EXECUTED_NODES_TRACE);

		tracedControlTokenEClass = createEClass(TRACED_CONTROL_TOKEN);

		tracedDecisionNodeEClass = createEClass(TRACED_DECISION_NODE);
		createEReference(tracedDecisionNodeEClass, TRACED_DECISION_NODE__ORIGINAL_OBJECT);

		tracedActivityEdgeEClass = createEClass(TRACED_ACTIVITY_EDGE);
		createEReference(tracedActivityEdgeEClass, TRACED_ACTIVITY_EDGE__SOURCE);
		createEReference(tracedActivityEdgeEClass, TRACED_ACTIVITY_EDGE__TARGET);
		createEReference(tracedActivityEdgeEClass, TRACED_ACTIVITY_EDGE__OFFERS);
		createEReference(tracedActivityEdgeEClass, TRACED_ACTIVITY_EDGE__OFFERS_TRACE);

		tracedControlNodeEClass = createEClass(TRACED_CONTROL_NODE);

		tracedJoinNodeEClass = createEClass(TRACED_JOIN_NODE);
		createEReference(tracedJoinNodeEClass, TRACED_JOIN_NODE__ORIGINAL_OBJECT);

		tracedValueEClass = createEClass(TRACED_VALUE);

		tracedBooleanVariableEClass = createEClass(TRACED_BOOLEAN_VARIABLE);
		createEReference(tracedBooleanVariableEClass, TRACED_BOOLEAN_VARIABLE__ORIGINAL_OBJECT);

		tracedActivityFinalNodeEClass = createEClass(TRACED_ACTIVITY_FINAL_NODE);
		createEReference(tracedActivityFinalNodeEClass, TRACED_ACTIVITY_FINAL_NODE__ORIGINAL_OBJECT);

		tracedTokenEClass = createEClass(TRACED_TOKEN);
		createEReference(tracedTokenEClass, TRACED_TOKEN__HOLDER_TRACE);

		tracedExecutableNodeEClass = createEClass(TRACED_EXECUTABLE_NODE);

		tracedInputValueEClass = createEClass(TRACED_INPUT_VALUE);
		createEReference(tracedInputValueEClass, TRACED_INPUT_VALUE__VALUE_TRACE);
		createEReference(tracedInputValueEClass, TRACED_INPUT_VALUE__VARIABLE_TRACE);

		tracedActionEClass = createEClass(TRACED_ACTION);

		tracedControlFlowEClass = createEClass(TRACED_CONTROL_FLOW);
		createEReference(tracedControlFlowEClass, TRACED_CONTROL_FLOW__GUARD);
		createEReference(tracedControlFlowEClass, TRACED_CONTROL_FLOW__ORIGINAL_OBJECT);

		tracedForkNodeEClass = createEClass(TRACED_FORK_NODE);
		createEReference(tracedForkNodeEClass, TRACED_FORK_NODE__ORIGINAL_OBJECT);

		tracedForkedTokenEClass = createEClass(TRACED_FORKED_TOKEN);
		createEReference(tracedForkedTokenEClass, TRACED_FORKED_TOKEN__REMAINING_OFFERS_COUNT_TRACE);
		createEReference(tracedForkedTokenEClass, TRACED_FORKED_TOKEN__BASE_TOKEN_TRACE);

		tracedIntegerVariableEClass = createEClass(TRACED_INTEGER_VARIABLE);
		createEReference(tracedIntegerVariableEClass, TRACED_INTEGER_VARIABLE__ORIGINAL_OBJECT);

		tracedActivityNodeEClass = createEClass(TRACED_ACTIVITY_NODE);
		createEReference(tracedActivityNodeEClass, TRACED_ACTIVITY_NODE__OUTGOING);
		createEReference(tracedActivityNodeEClass, TRACED_ACTIVITY_NODE__INCOMING);
		createEReference(tracedActivityNodeEClass, TRACED_ACTIVITY_NODE__ACTIVITY);
		createEReference(tracedActivityNodeEClass, TRACED_ACTIVITY_NODE__HELD_TOKENS);
		createEReference(tracedActivityNodeEClass, TRACED_ACTIVITY_NODE__HELD_TOKENS_TRACE);

		tracedActivityEClass = createEClass(TRACED_ACTIVITY);
		createEReference(tracedActivityEClass, TRACED_ACTIVITY__NODES);
		createEReference(tracedActivityEClass, TRACED_ACTIVITY__EDGES);
		createEReference(tracedActivityEClass, TRACED_ACTIVITY__LOCALS);
		createEReference(tracedActivityEClass, TRACED_ACTIVITY__INPUTS);
		createEReference(tracedActivityEClass, TRACED_ACTIVITY__TRACE);
		createEReference(tracedActivityEClass, TRACED_ACTIVITY__ORIGINAL_OBJECT);
		createEReference(tracedActivityEClass, TRACED_ACTIVITY__TRACE_TRACE);

		tracedOpaqueActionEClass = createEClass(TRACED_OPAQUE_ACTION);
		createEReference(tracedOpaqueActionEClass, TRACED_OPAQUE_ACTION__EXPRESSIONS);
		createEReference(tracedOpaqueActionEClass, TRACED_OPAQUE_ACTION__ORIGINAL_OBJECT);

		tracedFinalNodeEClass = createEClass(TRACED_FINAL_NODE);

		tracedInitialNodeEClass = createEClass(TRACED_INITIAL_NODE);
		createEReference(tracedInitialNodeEClass, TRACED_INITIAL_NODE__ORIGINAL_OBJECT);

		tracedMergeNodeEClass = createEClass(TRACED_MERGE_NODE);
		createEReference(tracedMergeNodeEClass, TRACED_MERGE_NODE__ORIGINAL_OBJECT);

		tracedOfferEClass = createEClass(TRACED_OFFER);
		createEReference(tracedOfferEClass, TRACED_OFFER__OFFERED_TOKENS_TRACE);

		tracedVariableEClass = createEClass(TRACED_VARIABLE);
		createEReference(tracedVariableEClass, TRACED_VARIABLE__INITIAL_VALUE);
		createEReference(tracedVariableEClass, TRACED_VARIABLE__CURRENT_VALUE);
		createEReference(tracedVariableEClass, TRACED_VARIABLE__CURRENT_VALUE_TRACE);
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
		ValuesPackage theValuesPackage = (ValuesPackage)EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI);
		activitydiagram.ActivitydiagramPackage theActivitydiagramPackage_1 = (activitydiagram.ActivitydiagramPackage)EPackage.Registry.INSTANCE.getEPackage(activitydiagram.ActivitydiagramPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tracedIntegerValueEClass.getESuperTypes().add(this.getTracedValue());
		tracedBooleanValueEClass.getESuperTypes().add(this.getTracedValue());
		tracedControlTokenEClass.getESuperTypes().add(this.getTracedToken());
		tracedDecisionNodeEClass.getESuperTypes().add(this.getTracedControlNode());
		tracedActivityEdgeEClass.getESuperTypes().add(this.getTracedNamedElement());
		tracedControlNodeEClass.getESuperTypes().add(this.getTracedActivityNode());
		tracedJoinNodeEClass.getESuperTypes().add(this.getTracedControlNode());
		tracedBooleanVariableEClass.getESuperTypes().add(this.getTracedVariable());
		tracedActivityFinalNodeEClass.getESuperTypes().add(this.getTracedFinalNode());
		tracedExecutableNodeEClass.getESuperTypes().add(this.getTracedActivityNode());
		tracedActionEClass.getESuperTypes().add(this.getTracedExecutableNode());
		tracedControlFlowEClass.getESuperTypes().add(this.getTracedActivityEdge());
		tracedForkNodeEClass.getESuperTypes().add(this.getTracedControlNode());
		tracedForkedTokenEClass.getESuperTypes().add(this.getTracedToken());
		tracedIntegerVariableEClass.getESuperTypes().add(this.getTracedVariable());
		tracedActivityNodeEClass.getESuperTypes().add(this.getTracedNamedElement());
		tracedActivityEClass.getESuperTypes().add(this.getTracedNamedElement());
		tracedOpaqueActionEClass.getESuperTypes().add(this.getTracedAction());
		tracedFinalNodeEClass.getESuperTypes().add(this.getTracedControlNode());
		tracedInitialNodeEClass.getESuperTypes().add(this.getTracedControlNode());
		tracedMergeNodeEClass.getESuperTypes().add(this.getTracedControlNode());

		// Initialize classes, features, and operations; add parameters
		initEClass(tracedIntegerValueEClass, TracedIntegerValue.class, "TracedIntegerValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedIntegerValue_ValueTrace(), theValuesPackage.getIntegerValue_value_Value(), theValuesPackage.getIntegerValue_value_Value_Parent(), "valueTrace", null, 0, -1, TracedIntegerValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedNamedElementEClass, TracedNamedElement.class, "TracedNamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tracedInputEClass, TracedInput.class, "TracedInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedInput_InputValuesTrace(), theValuesPackage.getInput_inputValues_Value(), theValuesPackage.getInput_inputValues_Value_Parent(), "inputValuesTrace", null, 0, -1, TracedInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedBooleanValueEClass, TracedBooleanValue.class, "TracedBooleanValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedBooleanValue_ValueTrace(), theValuesPackage.getBooleanValue_value_Value(), theValuesPackage.getBooleanValue_value_Value_Parent(), "valueTrace", null, 0, -1, TracedBooleanValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedTraceEClass, TracedTrace.class, "TracedTrace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedTrace_ExecutedNodesTrace(), theValuesPackage.getTrace_executedNodes_Value(), theValuesPackage.getTrace_executedNodes_Value_Parent(), "executedNodesTrace", null, 0, -1, TracedTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedControlTokenEClass, TracedControlToken.class, "TracedControlToken", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tracedDecisionNodeEClass, TracedDecisionNode.class, "TracedDecisionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedDecisionNode_OriginalObject(), theActivitydiagramPackage_1.getDecisionNode(), null, "originalObject", null, 0, 1, TracedDecisionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedActivityEdgeEClass, TracedActivityEdge.class, "TracedActivityEdge", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedActivityEdge_Source(), this.getTracedActivityNode(), null, "source", null, 1, 1, TracedActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedActivityEdge_Target(), this.getTracedActivityNode(), null, "target", null, 1, 1, TracedActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedActivityEdge_Offers(), theActivitydiagramPackage_1.getOffer(), null, "offers", null, 0, -1, TracedActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedActivityEdge_OffersTrace(), theValuesPackage.getActivityEdge_offers_Value(), theValuesPackage.getActivityEdge_offers_Value_Parent(), "offersTrace", null, 0, -1, TracedActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedControlNodeEClass, TracedControlNode.class, "TracedControlNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tracedJoinNodeEClass, TracedJoinNode.class, "TracedJoinNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedJoinNode_OriginalObject(), theActivitydiagramPackage_1.getJoinNode(), null, "originalObject", null, 0, 1, TracedJoinNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedValueEClass, TracedValue.class, "TracedValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tracedBooleanVariableEClass, TracedBooleanVariable.class, "TracedBooleanVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedBooleanVariable_OriginalObject(), theActivitydiagramPackage_1.getBooleanVariable(), null, "originalObject", null, 0, 1, TracedBooleanVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedActivityFinalNodeEClass, TracedActivityFinalNode.class, "TracedActivityFinalNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedActivityFinalNode_OriginalObject(), theActivitydiagramPackage_1.getActivityFinalNode(), null, "originalObject", null, 0, 1, TracedActivityFinalNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedTokenEClass, TracedToken.class, "TracedToken", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedToken_HolderTrace(), theValuesPackage.getToken_holder_Value(), theValuesPackage.getToken_holder_Value_Parent(), "holderTrace", null, 0, -1, TracedToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedExecutableNodeEClass, TracedExecutableNode.class, "TracedExecutableNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tracedInputValueEClass, TracedInputValue.class, "TracedInputValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedInputValue_ValueTrace(), theValuesPackage.getInputValue_value_Value(), theValuesPackage.getInputValue_value_Value_Parent(), "valueTrace", null, 0, -1, TracedInputValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedInputValue_VariableTrace(), theValuesPackage.getInputValue_variable_Value(), theValuesPackage.getInputValue_variable_Value_Parent(), "variableTrace", null, 0, -1, TracedInputValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedActionEClass, TracedAction.class, "TracedAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tracedControlFlowEClass, TracedControlFlow.class, "TracedControlFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedControlFlow_Guard(), this.getTracedBooleanVariable(), null, "guard", null, 0, 1, TracedControlFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedControlFlow_OriginalObject(), theActivitydiagramPackage_1.getControlFlow(), null, "originalObject", null, 0, 1, TracedControlFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedForkNodeEClass, TracedForkNode.class, "TracedForkNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedForkNode_OriginalObject(), theActivitydiagramPackage_1.getForkNode(), null, "originalObject", null, 0, 1, TracedForkNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedForkedTokenEClass, TracedForkedToken.class, "TracedForkedToken", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedForkedToken_RemainingOffersCountTrace(), theValuesPackage.getForkedToken_remainingOffersCount_Value(), theValuesPackage.getForkedToken_remainingOffersCount_Value_Parent(), "remainingOffersCountTrace", null, 0, -1, TracedForkedToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedForkedToken_BaseTokenTrace(), theValuesPackage.getForkedToken_baseToken_Value(), theValuesPackage.getForkedToken_baseToken_Value_Parent(), "baseTokenTrace", null, 0, -1, TracedForkedToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedIntegerVariableEClass, TracedIntegerVariable.class, "TracedIntegerVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedIntegerVariable_OriginalObject(), theActivitydiagramPackage_1.getIntegerVariable(), null, "originalObject", null, 0, 1, TracedIntegerVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedActivityNodeEClass, TracedActivityNode.class, "TracedActivityNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedActivityNode_Outgoing(), this.getTracedActivityEdge(), null, "outgoing", null, 0, -1, TracedActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedActivityNode_Incoming(), this.getTracedActivityEdge(), null, "incoming", null, 0, -1, TracedActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedActivityNode_Activity(), this.getTracedActivity(), null, "activity", null, 1, 1, TracedActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedActivityNode_HeldTokens(), theActivitydiagramPackage_1.getToken(), null, "heldTokens", null, 0, -1, TracedActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedActivityNode_HeldTokensTrace(), theValuesPackage.getActivityNode_heldTokens_Value(), theValuesPackage.getActivityNode_heldTokens_Value_Parent(), "heldTokensTrace", null, 0, -1, TracedActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedActivityEClass, TracedActivity.class, "TracedActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedActivity_Nodes(), this.getTracedActivityNode(), null, "nodes", null, 0, -1, TracedActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedActivity_Edges(), this.getTracedActivityEdge(), null, "edges", null, 0, -1, TracedActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedActivity_Locals(), this.getTracedVariable(), null, "locals", null, 0, -1, TracedActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedActivity_Inputs(), this.getTracedVariable(), null, "inputs", null, 0, -1, TracedActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedActivity_Trace(), theActivitydiagramPackage_1.getTrace(), null, "trace", null, 0, 1, TracedActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedActivity_OriginalObject(), theActivitydiagramPackage_1.getActivity(), null, "originalObject", null, 0, 1, TracedActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedActivity_TraceTrace(), theValuesPackage.getActivity_trace_Value(), theValuesPackage.getActivity_trace_Value_Parent(), "traceTrace", null, 0, -1, TracedActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedOpaqueActionEClass, TracedOpaqueAction.class, "TracedOpaqueAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedOpaqueAction_Expressions(), theActivitydiagramPackage_1.getExpression(), null, "expressions", null, 0, -1, TracedOpaqueAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedOpaqueAction_OriginalObject(), theActivitydiagramPackage_1.getOpaqueAction(), null, "originalObject", null, 0, 1, TracedOpaqueAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedFinalNodeEClass, TracedFinalNode.class, "TracedFinalNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tracedInitialNodeEClass, TracedInitialNode.class, "TracedInitialNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedInitialNode_OriginalObject(), theActivitydiagramPackage_1.getInitialNode(), null, "originalObject", null, 0, 1, TracedInitialNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedMergeNodeEClass, TracedMergeNode.class, "TracedMergeNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedMergeNode_OriginalObject(), theActivitydiagramPackage_1.getMergeNode(), null, "originalObject", null, 0, 1, TracedMergeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedOfferEClass, TracedOffer.class, "TracedOffer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedOffer_OfferedTokensTrace(), theValuesPackage.getOffer_offeredTokens_Value(), theValuesPackage.getOffer_offeredTokens_Value_Parent(), "offeredTokensTrace", null, 0, -1, TracedOffer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedVariableEClass, TracedVariable.class, "TracedVariable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedVariable_InitialValue(), theActivitydiagramPackage_1.getValue(), null, "initialValue", null, 0, 1, TracedVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedVariable_CurrentValue(), theActivitydiagramPackage_1.getValue(), null, "currentValue", null, 0, 1, TracedVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedVariable_CurrentValueTrace(), theValuesPackage.getVariable_currentValue_Value(), theValuesPackage.getVariable_currentValue_Value_Parent(), "currentValueTrace", null, 0, -1, TracedVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create annotations
		// aspect
		createAspectAnnotations();
	}

	/**
	 * Initializes the annotations for <b>aspect</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createAspectAnnotations() {
		String source = "aspect";	
		addAnnotation
		  (getTracedActivityEdge_Offers(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getTracedActivityNode_HeldTokens(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getTracedActivity_Trace(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getTracedVariable_CurrentValue(), 
		   source, 
		   new String[] {
		   });
	}

} //ActivitydiagramPackageImpl
