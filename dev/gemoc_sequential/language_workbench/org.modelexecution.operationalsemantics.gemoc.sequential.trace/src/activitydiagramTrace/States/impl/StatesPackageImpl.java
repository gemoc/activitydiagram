/**
 */
package activitydiagramTrace.States.impl;

import activitydiagram.ActivitydiagramPackage;

import activitydiagramTrace.ActivitydiagramTracePackage;

import activitydiagramTrace.States.ActivityEdge_offers_Value;
import activitydiagramTrace.States.ActivityEdge_source_Value;
import activitydiagramTrace.States.ActivityEdge_target_Value;
import activitydiagramTrace.States.ActivityNode_activity_Value;
import activitydiagramTrace.States.ActivityNode_heldTokens_Value;
import activitydiagramTrace.States.ActivityNode_incoming_Value;
import activitydiagramTrace.States.ActivityNode_outgoing_Value;
import activitydiagramTrace.States.ActivityNode_running_Value;
import activitydiagramTrace.States.Activity_edges_Value;
import activitydiagramTrace.States.Activity_inputs_Value;
import activitydiagramTrace.States.Activity_locals_Value;
import activitydiagramTrace.States.Activity_nodes_Value;
import activitydiagramTrace.States.Activity_trace_Value;
import activitydiagramTrace.States.BooleanBinaryExpression_operand1_Value;
import activitydiagramTrace.States.BooleanBinaryExpression_operand2_Value;
import activitydiagramTrace.States.BooleanBinaryExpression_operator_Value;
import activitydiagramTrace.States.BooleanExpression_assignee_Value;
import activitydiagramTrace.States.BooleanUnaryExpression_operand_Value;
import activitydiagramTrace.States.BooleanUnaryExpression_operator_Value;
import activitydiagramTrace.States.BooleanValue_value_Value;
import activitydiagramTrace.States.ControlFlow_guard_Value;
import activitydiagramTrace.States.ForkedToken_baseToken_Value;
import activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value;
import activitydiagramTrace.States.InputValue_value_Value;
import activitydiagramTrace.States.InputValue_variable_Value;
import activitydiagramTrace.States.Input_inputValues_Value;
import activitydiagramTrace.States.IntegerCalculationExpression_assignee_Value;
import activitydiagramTrace.States.IntegerCalculationExpression_operator_Value;
import activitydiagramTrace.States.IntegerComparisonExpression_assignee_Value;
import activitydiagramTrace.States.IntegerComparisonExpression_operator_Value;
import activitydiagramTrace.States.IntegerExpression_operand1_Value;
import activitydiagramTrace.States.IntegerExpression_operand2_Value;
import activitydiagramTrace.States.IntegerValue_value_Value;
import activitydiagramTrace.States.NamedElement_name_Value;
import activitydiagramTrace.States.Offer_offeredTokens_Value;
import activitydiagramTrace.States.OpaqueAction_expressions_Value;
import activitydiagramTrace.States.State;
import activitydiagramTrace.States.StatesFactory;
import activitydiagramTrace.States.StatesPackage;
import activitydiagramTrace.States.Token_holder_Value;
import activitydiagramTrace.States.Trace_executedNodes_Value;
import activitydiagramTrace.States.Variable_currentValue_Value;
import activitydiagramTrace.States.Variable_initialValue_Value;
import activitydiagramTrace.States.Variable_name_Value;

import activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl;

import activitydiagramTrace.Steps.StepsPackage;

import activitydiagramTrace.Steps.impl.StepsPackageImpl;

import activitydiagramTrace.impl.ActivitydiagramTracePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
public class StatesPackageImpl extends EPackageImpl implements StatesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEdge_offers_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEdge_source_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEdge_target_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityNode_activity_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityNode_heldTokens_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityNode_incoming_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityNode_outgoing_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityNode_running_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activity_edges_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activity_inputs_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activity_locals_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activity_nodes_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activity_trace_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanBinaryExpression_operand1_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanBinaryExpression_operand2_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanBinaryExpression_operator_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanExpression_assignee_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanUnaryExpression_operand_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanUnaryExpression_operator_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanValue_value_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlFlow_guard_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forkedToken_baseToken_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forkedToken_remainingOffersCount_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputValue_value_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputValue_variable_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass input_inputValues_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerCalculationExpression_assignee_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerCalculationExpression_operator_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerComparisonExpression_assignee_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerComparisonExpression_operator_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerExpression_operand1_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerExpression_operand2_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerValue_value_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElement_name_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass offer_offeredTokens_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opaqueAction_expressions_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass token_holder_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trace_executedNodes_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variable_currentValue_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variable_initialValue_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variable_name_ValueEClass = null;

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
	 * @see activitydiagramTrace.States.StatesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StatesPackageImpl() {
		super(eNS_URI, StatesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StatesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StatesPackage init() {
		if (isInited) return (StatesPackage)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI);

		// Obtain or create and register package
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StatesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ActivitydiagramPackage.eINSTANCE.eClass();
		MsePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ActivitydiagramTracePackageImpl theActivitydiagramTracePackage = (ActivitydiagramTracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramTracePackage.eNS_URI) instanceof ActivitydiagramTracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramTracePackage.eNS_URI) : ActivitydiagramTracePackage.eINSTANCE);
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) : StepsPackage.eINSTANCE);
		ActivitydiagramPackageImpl theActivitydiagramPackage_1 = (ActivitydiagramPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage.eNS_URI) instanceof ActivitydiagramPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage.eNS_URI) : activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage.eINSTANCE);

		// Create package meta-data objects
		theStatesPackage.createPackageContents();
		theActivitydiagramTracePackage.createPackageContents();
		theStepsPackage.createPackageContents();
		theActivitydiagramPackage_1.createPackageContents();

		// Initialize created meta-data
		theStatesPackage.initializePackageContents();
		theActivitydiagramTracePackage.initializePackageContents();
		theStepsPackage.initializePackageContents();
		theActivitydiagramPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStatesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StatesPackage.eNS_URI, theStatesPackage);
		return theStatesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityEdge_offers_Value() {
		return activityEdge_offers_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_offers_Value_Offers() {
		return (EReference)activityEdge_offers_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_offers_Value_Parent() {
		return (EReference)activityEdge_offers_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_offers_Value_States() {
		return (EReference)activityEdge_offers_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityEdge_source_Value() {
		return activityEdge_source_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_source_Value_Parent() {
		return (EReference)activityEdge_source_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_source_Value_Source() {
		return (EReference)activityEdge_source_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_source_Value_States() {
		return (EReference)activityEdge_source_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityEdge_target_Value() {
		return activityEdge_target_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_target_Value_Parent() {
		return (EReference)activityEdge_target_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_target_Value_States() {
		return (EReference)activityEdge_target_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_target_Value_Target() {
		return (EReference)activityEdge_target_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityNode_activity_Value() {
		return activityNode_activity_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_activity_Value_Activity() {
		return (EReference)activityNode_activity_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_activity_Value_Parent() {
		return (EReference)activityNode_activity_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_activity_Value_States() {
		return (EReference)activityNode_activity_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityNode_heldTokens_Value() {
		return activityNode_heldTokens_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_heldTokens_Value_HeldTokens() {
		return (EReference)activityNode_heldTokens_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_heldTokens_Value_Parent() {
		return (EReference)activityNode_heldTokens_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_heldTokens_Value_States() {
		return (EReference)activityNode_heldTokens_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityNode_incoming_Value() {
		return activityNode_incoming_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_incoming_Value_Incoming() {
		return (EReference)activityNode_incoming_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_incoming_Value_Parent() {
		return (EReference)activityNode_incoming_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_incoming_Value_States() {
		return (EReference)activityNode_incoming_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityNode_outgoing_Value() {
		return activityNode_outgoing_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_outgoing_Value_Outgoing() {
		return (EReference)activityNode_outgoing_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_outgoing_Value_Parent() {
		return (EReference)activityNode_outgoing_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_outgoing_Value_States() {
		return (EReference)activityNode_outgoing_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityNode_running_Value() {
		return activityNode_running_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_running_Value_Parent() {
		return (EReference)activityNode_running_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityNode_running_Value_Running() {
		return (EAttribute)activityNode_running_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_running_Value_States() {
		return (EReference)activityNode_running_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivity_edges_Value() {
		return activity_edges_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_edges_Value_Edges() {
		return (EReference)activity_edges_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_edges_Value_Parent() {
		return (EReference)activity_edges_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_edges_Value_States() {
		return (EReference)activity_edges_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivity_inputs_Value() {
		return activity_inputs_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_inputs_Value_Inputs() {
		return (EReference)activity_inputs_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_inputs_Value_Parent() {
		return (EReference)activity_inputs_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_inputs_Value_States() {
		return (EReference)activity_inputs_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivity_locals_Value() {
		return activity_locals_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_locals_Value_Locals() {
		return (EReference)activity_locals_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_locals_Value_Parent() {
		return (EReference)activity_locals_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_locals_Value_States() {
		return (EReference)activity_locals_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivity_nodes_Value() {
		return activity_nodes_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_nodes_Value_Nodes() {
		return (EReference)activity_nodes_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_nodes_Value_Parent() {
		return (EReference)activity_nodes_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_nodes_Value_States() {
		return (EReference)activity_nodes_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivity_trace_Value() {
		return activity_trace_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_trace_Value_Parent() {
		return (EReference)activity_trace_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_trace_Value_States() {
		return (EReference)activity_trace_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_trace_Value_Trace() {
		return (EReference)activity_trace_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanBinaryExpression_operand1_Value() {
		return booleanBinaryExpression_operand1_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanBinaryExpression_operand1_Value_Operand1() {
		return (EReference)booleanBinaryExpression_operand1_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanBinaryExpression_operand1_Value_Parent() {
		return (EReference)booleanBinaryExpression_operand1_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanBinaryExpression_operand1_Value_States() {
		return (EReference)booleanBinaryExpression_operand1_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanBinaryExpression_operand2_Value() {
		return booleanBinaryExpression_operand2_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanBinaryExpression_operand2_Value_Operand2() {
		return (EReference)booleanBinaryExpression_operand2_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanBinaryExpression_operand2_Value_Parent() {
		return (EReference)booleanBinaryExpression_operand2_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanBinaryExpression_operand2_Value_States() {
		return (EReference)booleanBinaryExpression_operand2_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanBinaryExpression_operator_Value() {
		return booleanBinaryExpression_operator_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanBinaryExpression_operator_Value_Operator() {
		return (EAttribute)booleanBinaryExpression_operator_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanBinaryExpression_operator_Value_Parent() {
		return (EReference)booleanBinaryExpression_operator_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanBinaryExpression_operator_Value_States() {
		return (EReference)booleanBinaryExpression_operator_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanExpression_assignee_Value() {
		return booleanExpression_assignee_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanExpression_assignee_Value_Assignee() {
		return (EReference)booleanExpression_assignee_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanExpression_assignee_Value_Parent() {
		return (EReference)booleanExpression_assignee_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanExpression_assignee_Value_States() {
		return (EReference)booleanExpression_assignee_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanUnaryExpression_operand_Value() {
		return booleanUnaryExpression_operand_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanUnaryExpression_operand_Value_Operand() {
		return (EReference)booleanUnaryExpression_operand_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanUnaryExpression_operand_Value_Parent() {
		return (EReference)booleanUnaryExpression_operand_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanUnaryExpression_operand_Value_States() {
		return (EReference)booleanUnaryExpression_operand_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanUnaryExpression_operator_Value() {
		return booleanUnaryExpression_operator_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanUnaryExpression_operator_Value_Operator() {
		return (EAttribute)booleanUnaryExpression_operator_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanUnaryExpression_operator_Value_Parent() {
		return (EReference)booleanUnaryExpression_operator_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanUnaryExpression_operator_Value_States() {
		return (EReference)booleanUnaryExpression_operator_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanValue_value_Value() {
		return booleanValue_value_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanValue_value_Value_Parent() {
		return (EReference)booleanValue_value_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanValue_value_Value_States() {
		return (EReference)booleanValue_value_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanValue_value_Value_Value() {
		return (EAttribute)booleanValue_value_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlFlow_guard_Value() {
		return controlFlow_guard_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlFlow_guard_Value_Guard() {
		return (EReference)controlFlow_guard_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlFlow_guard_Value_Parent() {
		return (EReference)controlFlow_guard_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlFlow_guard_Value_States() {
		return (EReference)controlFlow_guard_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForkedToken_baseToken_Value() {
		return forkedToken_baseToken_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForkedToken_baseToken_Value_BaseToken() {
		return (EReference)forkedToken_baseToken_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForkedToken_baseToken_Value_Parent() {
		return (EReference)forkedToken_baseToken_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForkedToken_baseToken_Value_States() {
		return (EReference)forkedToken_baseToken_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForkedToken_remainingOffersCount_Value() {
		return forkedToken_remainingOffersCount_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForkedToken_remainingOffersCount_Value_Parent() {
		return (EReference)forkedToken_remainingOffersCount_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForkedToken_remainingOffersCount_Value_RemainingOffersCount() {
		return (EAttribute)forkedToken_remainingOffersCount_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForkedToken_remainingOffersCount_Value_States() {
		return (EReference)forkedToken_remainingOffersCount_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputValue_value_Value() {
		return inputValue_value_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputValue_value_Value_Parent() {
		return (EReference)inputValue_value_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputValue_value_Value_States() {
		return (EReference)inputValue_value_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputValue_value_Value_Value() {
		return (EReference)inputValue_value_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputValue_variable_Value() {
		return inputValue_variable_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputValue_variable_Value_Parent() {
		return (EReference)inputValue_variable_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputValue_variable_Value_States() {
		return (EReference)inputValue_variable_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputValue_variable_Value_Variable() {
		return (EReference)inputValue_variable_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInput_inputValues_Value() {
		return input_inputValues_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInput_inputValues_Value_InputValues() {
		return (EReference)input_inputValues_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInput_inputValues_Value_Parent() {
		return (EReference)input_inputValues_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInput_inputValues_Value_States() {
		return (EReference)input_inputValues_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerCalculationExpression_assignee_Value() {
		return integerCalculationExpression_assignee_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerCalculationExpression_assignee_Value_Assignee() {
		return (EReference)integerCalculationExpression_assignee_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerCalculationExpression_assignee_Value_Parent() {
		return (EReference)integerCalculationExpression_assignee_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerCalculationExpression_assignee_Value_States() {
		return (EReference)integerCalculationExpression_assignee_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerCalculationExpression_operator_Value() {
		return integerCalculationExpression_operator_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerCalculationExpression_operator_Value_Operator() {
		return (EAttribute)integerCalculationExpression_operator_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerCalculationExpression_operator_Value_Parent() {
		return (EReference)integerCalculationExpression_operator_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerCalculationExpression_operator_Value_States() {
		return (EReference)integerCalculationExpression_operator_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerComparisonExpression_assignee_Value() {
		return integerComparisonExpression_assignee_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerComparisonExpression_assignee_Value_Assignee() {
		return (EReference)integerComparisonExpression_assignee_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerComparisonExpression_assignee_Value_Parent() {
		return (EReference)integerComparisonExpression_assignee_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerComparisonExpression_assignee_Value_States() {
		return (EReference)integerComparisonExpression_assignee_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerComparisonExpression_operator_Value() {
		return integerComparisonExpression_operator_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerComparisonExpression_operator_Value_Operator() {
		return (EAttribute)integerComparisonExpression_operator_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerComparisonExpression_operator_Value_Parent() {
		return (EReference)integerComparisonExpression_operator_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerComparisonExpression_operator_Value_States() {
		return (EReference)integerComparisonExpression_operator_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerExpression_operand1_Value() {
		return integerExpression_operand1_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerExpression_operand1_Value_Operand1() {
		return (EReference)integerExpression_operand1_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerExpression_operand1_Value_Parent() {
		return (EReference)integerExpression_operand1_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerExpression_operand1_Value_States() {
		return (EReference)integerExpression_operand1_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerExpression_operand2_Value() {
		return integerExpression_operand2_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerExpression_operand2_Value_Operand2() {
		return (EReference)integerExpression_operand2_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerExpression_operand2_Value_Parent() {
		return (EReference)integerExpression_operand2_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerExpression_operand2_Value_States() {
		return (EReference)integerExpression_operand2_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerValue_value_Value() {
		return integerValue_value_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerValue_value_Value_Parent() {
		return (EReference)integerValue_value_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerValue_value_Value_States() {
		return (EReference)integerValue_value_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerValue_value_Value_Value() {
		return (EAttribute)integerValue_value_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement_name_Value() {
		return namedElement_name_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_name_Value_Name() {
		return (EAttribute)namedElement_name_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedElement_name_Value_Parent() {
		return (EReference)namedElement_name_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedElement_name_Value_States() {
		return (EReference)namedElement_name_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOffer_offeredTokens_Value() {
		return offer_offeredTokens_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOffer_offeredTokens_Value_OfferedTokens() {
		return (EReference)offer_offeredTokens_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOffer_offeredTokens_Value_Parent() {
		return (EReference)offer_offeredTokens_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOffer_offeredTokens_Value_States() {
		return (EReference)offer_offeredTokens_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpaqueAction_expressions_Value() {
		return opaqueAction_expressions_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpaqueAction_expressions_Value_Expressions() {
		return (EReference)opaqueAction_expressions_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpaqueAction_expressions_Value_Parent() {
		return (EReference)opaqueAction_expressions_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpaqueAction_expressions_Value_States() {
		return (EReference)opaqueAction_expressions_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ActivityEdge_offers_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ActivityEdge_source_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ActivityEdge_target_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ActivityNode_activity_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ActivityNode_heldTokens_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ActivityNode_incoming_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ActivityNode_outgoing_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ActivityNode_running_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Activity_edges_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Activity_inputs_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Activity_locals_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Activity_nodes_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Activity_trace_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_BooleanBinaryExpression_operand1_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_BooleanBinaryExpression_operand2_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_BooleanBinaryExpression_operator_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_BooleanExpression_assignee_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_BooleanUnaryExpression_operand_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_BooleanUnaryExpression_operator_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_BooleanValue_value_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ControlFlow_guard_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_EndedSteps() {
		return (EReference)stateEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ForkedToken_baseToken_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ForkedToken_remainingOffersCount_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_InputValue_value_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_InputValue_variable_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Input_inputValues_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_IntegerCalculationExpression_assignee_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_IntegerCalculationExpression_operator_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_IntegerComparisonExpression_assignee_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_IntegerComparisonExpression_operator_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_IntegerExpression_operand1_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_IntegerExpression_operand2_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_IntegerValue_value_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_NamedElement_name_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Offer_offeredTokens_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_OpaqueAction_expressions_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_StartedSteps() {
		return (EReference)stateEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Token_holder_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Trace_executedNodes_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Variable_currentValue_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Variable_initialValue_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Variable_name_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToken_holder_Value() {
		return token_holder_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToken_holder_Value_Holder() {
		return (EReference)token_holder_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToken_holder_Value_Parent() {
		return (EReference)token_holder_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToken_holder_Value_States() {
		return (EReference)token_holder_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrace_executedNodes_Value() {
		return trace_executedNodes_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_executedNodes_Value_ExecutedNodes() {
		return (EReference)trace_executedNodes_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_executedNodes_Value_Parent() {
		return (EReference)trace_executedNodes_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_executedNodes_Value_States() {
		return (EReference)trace_executedNodes_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable_currentValue_Value() {
		return variable_currentValue_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_currentValue_Value_CurrentValue() {
		return (EReference)variable_currentValue_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_currentValue_Value_Parent() {
		return (EReference)variable_currentValue_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_currentValue_Value_States() {
		return (EReference)variable_currentValue_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable_initialValue_Value() {
		return variable_initialValue_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_initialValue_Value_InitialValue() {
		return (EReference)variable_initialValue_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_initialValue_Value_Parent() {
		return (EReference)variable_initialValue_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_initialValue_Value_States() {
		return (EReference)variable_initialValue_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable_name_Value() {
		return variable_name_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_name_Value_Name() {
		return (EAttribute)variable_name_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_name_Value_Parent() {
		return (EReference)variable_name_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_name_Value_States() {
		return (EReference)variable_name_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatesFactory getStatesFactory() {
		return (StatesFactory)getEFactoryInstance();
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
		activityEdge_offers_ValueEClass = createEClass(ACTIVITY_EDGE_OFFERS_VALUE);
		createEReference(activityEdge_offers_ValueEClass, ACTIVITY_EDGE_OFFERS_VALUE__OFFERS);
		createEReference(activityEdge_offers_ValueEClass, ACTIVITY_EDGE_OFFERS_VALUE__PARENT);
		createEReference(activityEdge_offers_ValueEClass, ACTIVITY_EDGE_OFFERS_VALUE__STATES);

		activityEdge_source_ValueEClass = createEClass(ACTIVITY_EDGE_SOURCE_VALUE);
		createEReference(activityEdge_source_ValueEClass, ACTIVITY_EDGE_SOURCE_VALUE__PARENT);
		createEReference(activityEdge_source_ValueEClass, ACTIVITY_EDGE_SOURCE_VALUE__SOURCE);
		createEReference(activityEdge_source_ValueEClass, ACTIVITY_EDGE_SOURCE_VALUE__STATES);

		activityEdge_target_ValueEClass = createEClass(ACTIVITY_EDGE_TARGET_VALUE);
		createEReference(activityEdge_target_ValueEClass, ACTIVITY_EDGE_TARGET_VALUE__PARENT);
		createEReference(activityEdge_target_ValueEClass, ACTIVITY_EDGE_TARGET_VALUE__STATES);
		createEReference(activityEdge_target_ValueEClass, ACTIVITY_EDGE_TARGET_VALUE__TARGET);

		activityNode_activity_ValueEClass = createEClass(ACTIVITY_NODE_ACTIVITY_VALUE);
		createEReference(activityNode_activity_ValueEClass, ACTIVITY_NODE_ACTIVITY_VALUE__ACTIVITY);
		createEReference(activityNode_activity_ValueEClass, ACTIVITY_NODE_ACTIVITY_VALUE__PARENT);
		createEReference(activityNode_activity_ValueEClass, ACTIVITY_NODE_ACTIVITY_VALUE__STATES);

		activityNode_heldTokens_ValueEClass = createEClass(ACTIVITY_NODE_HELD_TOKENS_VALUE);
		createEReference(activityNode_heldTokens_ValueEClass, ACTIVITY_NODE_HELD_TOKENS_VALUE__HELD_TOKENS);
		createEReference(activityNode_heldTokens_ValueEClass, ACTIVITY_NODE_HELD_TOKENS_VALUE__PARENT);
		createEReference(activityNode_heldTokens_ValueEClass, ACTIVITY_NODE_HELD_TOKENS_VALUE__STATES);

		activityNode_incoming_ValueEClass = createEClass(ACTIVITY_NODE_INCOMING_VALUE);
		createEReference(activityNode_incoming_ValueEClass, ACTIVITY_NODE_INCOMING_VALUE__INCOMING);
		createEReference(activityNode_incoming_ValueEClass, ACTIVITY_NODE_INCOMING_VALUE__PARENT);
		createEReference(activityNode_incoming_ValueEClass, ACTIVITY_NODE_INCOMING_VALUE__STATES);

		activityNode_outgoing_ValueEClass = createEClass(ACTIVITY_NODE_OUTGOING_VALUE);
		createEReference(activityNode_outgoing_ValueEClass, ACTIVITY_NODE_OUTGOING_VALUE__OUTGOING);
		createEReference(activityNode_outgoing_ValueEClass, ACTIVITY_NODE_OUTGOING_VALUE__PARENT);
		createEReference(activityNode_outgoing_ValueEClass, ACTIVITY_NODE_OUTGOING_VALUE__STATES);

		activityNode_running_ValueEClass = createEClass(ACTIVITY_NODE_RUNNING_VALUE);
		createEReference(activityNode_running_ValueEClass, ACTIVITY_NODE_RUNNING_VALUE__PARENT);
		createEAttribute(activityNode_running_ValueEClass, ACTIVITY_NODE_RUNNING_VALUE__RUNNING);
		createEReference(activityNode_running_ValueEClass, ACTIVITY_NODE_RUNNING_VALUE__STATES);

		activity_edges_ValueEClass = createEClass(ACTIVITY_EDGES_VALUE);
		createEReference(activity_edges_ValueEClass, ACTIVITY_EDGES_VALUE__EDGES);
		createEReference(activity_edges_ValueEClass, ACTIVITY_EDGES_VALUE__PARENT);
		createEReference(activity_edges_ValueEClass, ACTIVITY_EDGES_VALUE__STATES);

		activity_inputs_ValueEClass = createEClass(ACTIVITY_INPUTS_VALUE);
		createEReference(activity_inputs_ValueEClass, ACTIVITY_INPUTS_VALUE__INPUTS);
		createEReference(activity_inputs_ValueEClass, ACTIVITY_INPUTS_VALUE__PARENT);
		createEReference(activity_inputs_ValueEClass, ACTIVITY_INPUTS_VALUE__STATES);

		activity_locals_ValueEClass = createEClass(ACTIVITY_LOCALS_VALUE);
		createEReference(activity_locals_ValueEClass, ACTIVITY_LOCALS_VALUE__LOCALS);
		createEReference(activity_locals_ValueEClass, ACTIVITY_LOCALS_VALUE__PARENT);
		createEReference(activity_locals_ValueEClass, ACTIVITY_LOCALS_VALUE__STATES);

		activity_nodes_ValueEClass = createEClass(ACTIVITY_NODES_VALUE);
		createEReference(activity_nodes_ValueEClass, ACTIVITY_NODES_VALUE__NODES);
		createEReference(activity_nodes_ValueEClass, ACTIVITY_NODES_VALUE__PARENT);
		createEReference(activity_nodes_ValueEClass, ACTIVITY_NODES_VALUE__STATES);

		activity_trace_ValueEClass = createEClass(ACTIVITY_TRACE_VALUE);
		createEReference(activity_trace_ValueEClass, ACTIVITY_TRACE_VALUE__PARENT);
		createEReference(activity_trace_ValueEClass, ACTIVITY_TRACE_VALUE__STATES);
		createEReference(activity_trace_ValueEClass, ACTIVITY_TRACE_VALUE__TRACE);

		booleanBinaryExpression_operand1_ValueEClass = createEClass(BOOLEAN_BINARY_EXPRESSION_OPERAND1_VALUE);
		createEReference(booleanBinaryExpression_operand1_ValueEClass, BOOLEAN_BINARY_EXPRESSION_OPERAND1_VALUE__OPERAND1);
		createEReference(booleanBinaryExpression_operand1_ValueEClass, BOOLEAN_BINARY_EXPRESSION_OPERAND1_VALUE__PARENT);
		createEReference(booleanBinaryExpression_operand1_ValueEClass, BOOLEAN_BINARY_EXPRESSION_OPERAND1_VALUE__STATES);

		booleanBinaryExpression_operand2_ValueEClass = createEClass(BOOLEAN_BINARY_EXPRESSION_OPERAND2_VALUE);
		createEReference(booleanBinaryExpression_operand2_ValueEClass, BOOLEAN_BINARY_EXPRESSION_OPERAND2_VALUE__OPERAND2);
		createEReference(booleanBinaryExpression_operand2_ValueEClass, BOOLEAN_BINARY_EXPRESSION_OPERAND2_VALUE__PARENT);
		createEReference(booleanBinaryExpression_operand2_ValueEClass, BOOLEAN_BINARY_EXPRESSION_OPERAND2_VALUE__STATES);

		booleanBinaryExpression_operator_ValueEClass = createEClass(BOOLEAN_BINARY_EXPRESSION_OPERATOR_VALUE);
		createEAttribute(booleanBinaryExpression_operator_ValueEClass, BOOLEAN_BINARY_EXPRESSION_OPERATOR_VALUE__OPERATOR);
		createEReference(booleanBinaryExpression_operator_ValueEClass, BOOLEAN_BINARY_EXPRESSION_OPERATOR_VALUE__PARENT);
		createEReference(booleanBinaryExpression_operator_ValueEClass, BOOLEAN_BINARY_EXPRESSION_OPERATOR_VALUE__STATES);

		booleanExpression_assignee_ValueEClass = createEClass(BOOLEAN_EXPRESSION_ASSIGNEE_VALUE);
		createEReference(booleanExpression_assignee_ValueEClass, BOOLEAN_EXPRESSION_ASSIGNEE_VALUE__ASSIGNEE);
		createEReference(booleanExpression_assignee_ValueEClass, BOOLEAN_EXPRESSION_ASSIGNEE_VALUE__PARENT);
		createEReference(booleanExpression_assignee_ValueEClass, BOOLEAN_EXPRESSION_ASSIGNEE_VALUE__STATES);

		booleanUnaryExpression_operand_ValueEClass = createEClass(BOOLEAN_UNARY_EXPRESSION_OPERAND_VALUE);
		createEReference(booleanUnaryExpression_operand_ValueEClass, BOOLEAN_UNARY_EXPRESSION_OPERAND_VALUE__OPERAND);
		createEReference(booleanUnaryExpression_operand_ValueEClass, BOOLEAN_UNARY_EXPRESSION_OPERAND_VALUE__PARENT);
		createEReference(booleanUnaryExpression_operand_ValueEClass, BOOLEAN_UNARY_EXPRESSION_OPERAND_VALUE__STATES);

		booleanUnaryExpression_operator_ValueEClass = createEClass(BOOLEAN_UNARY_EXPRESSION_OPERATOR_VALUE);
		createEAttribute(booleanUnaryExpression_operator_ValueEClass, BOOLEAN_UNARY_EXPRESSION_OPERATOR_VALUE__OPERATOR);
		createEReference(booleanUnaryExpression_operator_ValueEClass, BOOLEAN_UNARY_EXPRESSION_OPERATOR_VALUE__PARENT);
		createEReference(booleanUnaryExpression_operator_ValueEClass, BOOLEAN_UNARY_EXPRESSION_OPERATOR_VALUE__STATES);

		booleanValue_value_ValueEClass = createEClass(BOOLEAN_VALUE_VALUE_VALUE);
		createEReference(booleanValue_value_ValueEClass, BOOLEAN_VALUE_VALUE_VALUE__PARENT);
		createEReference(booleanValue_value_ValueEClass, BOOLEAN_VALUE_VALUE_VALUE__STATES);
		createEAttribute(booleanValue_value_ValueEClass, BOOLEAN_VALUE_VALUE_VALUE__VALUE);

		controlFlow_guard_ValueEClass = createEClass(CONTROL_FLOW_GUARD_VALUE);
		createEReference(controlFlow_guard_ValueEClass, CONTROL_FLOW_GUARD_VALUE__GUARD);
		createEReference(controlFlow_guard_ValueEClass, CONTROL_FLOW_GUARD_VALUE__PARENT);
		createEReference(controlFlow_guard_ValueEClass, CONTROL_FLOW_GUARD_VALUE__STATES);

		forkedToken_baseToken_ValueEClass = createEClass(FORKED_TOKEN_BASE_TOKEN_VALUE);
		createEReference(forkedToken_baseToken_ValueEClass, FORKED_TOKEN_BASE_TOKEN_VALUE__BASE_TOKEN);
		createEReference(forkedToken_baseToken_ValueEClass, FORKED_TOKEN_BASE_TOKEN_VALUE__PARENT);
		createEReference(forkedToken_baseToken_ValueEClass, FORKED_TOKEN_BASE_TOKEN_VALUE__STATES);

		forkedToken_remainingOffersCount_ValueEClass = createEClass(FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE);
		createEReference(forkedToken_remainingOffersCount_ValueEClass, FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE__PARENT);
		createEAttribute(forkedToken_remainingOffersCount_ValueEClass, FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE__REMAINING_OFFERS_COUNT);
		createEReference(forkedToken_remainingOffersCount_ValueEClass, FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE__STATES);

		inputValue_value_ValueEClass = createEClass(INPUT_VALUE_VALUE_VALUE);
		createEReference(inputValue_value_ValueEClass, INPUT_VALUE_VALUE_VALUE__PARENT);
		createEReference(inputValue_value_ValueEClass, INPUT_VALUE_VALUE_VALUE__STATES);
		createEReference(inputValue_value_ValueEClass, INPUT_VALUE_VALUE_VALUE__VALUE);

		inputValue_variable_ValueEClass = createEClass(INPUT_VALUE_VARIABLE_VALUE);
		createEReference(inputValue_variable_ValueEClass, INPUT_VALUE_VARIABLE_VALUE__PARENT);
		createEReference(inputValue_variable_ValueEClass, INPUT_VALUE_VARIABLE_VALUE__STATES);
		createEReference(inputValue_variable_ValueEClass, INPUT_VALUE_VARIABLE_VALUE__VARIABLE);

		input_inputValues_ValueEClass = createEClass(INPUT_INPUT_VALUES_VALUE);
		createEReference(input_inputValues_ValueEClass, INPUT_INPUT_VALUES_VALUE__INPUT_VALUES);
		createEReference(input_inputValues_ValueEClass, INPUT_INPUT_VALUES_VALUE__PARENT);
		createEReference(input_inputValues_ValueEClass, INPUT_INPUT_VALUES_VALUE__STATES);

		integerCalculationExpression_assignee_ValueEClass = createEClass(INTEGER_CALCULATION_EXPRESSION_ASSIGNEE_VALUE);
		createEReference(integerCalculationExpression_assignee_ValueEClass, INTEGER_CALCULATION_EXPRESSION_ASSIGNEE_VALUE__ASSIGNEE);
		createEReference(integerCalculationExpression_assignee_ValueEClass, INTEGER_CALCULATION_EXPRESSION_ASSIGNEE_VALUE__PARENT);
		createEReference(integerCalculationExpression_assignee_ValueEClass, INTEGER_CALCULATION_EXPRESSION_ASSIGNEE_VALUE__STATES);

		integerCalculationExpression_operator_ValueEClass = createEClass(INTEGER_CALCULATION_EXPRESSION_OPERATOR_VALUE);
		createEAttribute(integerCalculationExpression_operator_ValueEClass, INTEGER_CALCULATION_EXPRESSION_OPERATOR_VALUE__OPERATOR);
		createEReference(integerCalculationExpression_operator_ValueEClass, INTEGER_CALCULATION_EXPRESSION_OPERATOR_VALUE__PARENT);
		createEReference(integerCalculationExpression_operator_ValueEClass, INTEGER_CALCULATION_EXPRESSION_OPERATOR_VALUE__STATES);

		integerComparisonExpression_assignee_ValueEClass = createEClass(INTEGER_COMPARISON_EXPRESSION_ASSIGNEE_VALUE);
		createEReference(integerComparisonExpression_assignee_ValueEClass, INTEGER_COMPARISON_EXPRESSION_ASSIGNEE_VALUE__ASSIGNEE);
		createEReference(integerComparisonExpression_assignee_ValueEClass, INTEGER_COMPARISON_EXPRESSION_ASSIGNEE_VALUE__PARENT);
		createEReference(integerComparisonExpression_assignee_ValueEClass, INTEGER_COMPARISON_EXPRESSION_ASSIGNEE_VALUE__STATES);

		integerComparisonExpression_operator_ValueEClass = createEClass(INTEGER_COMPARISON_EXPRESSION_OPERATOR_VALUE);
		createEAttribute(integerComparisonExpression_operator_ValueEClass, INTEGER_COMPARISON_EXPRESSION_OPERATOR_VALUE__OPERATOR);
		createEReference(integerComparisonExpression_operator_ValueEClass, INTEGER_COMPARISON_EXPRESSION_OPERATOR_VALUE__PARENT);
		createEReference(integerComparisonExpression_operator_ValueEClass, INTEGER_COMPARISON_EXPRESSION_OPERATOR_VALUE__STATES);

		integerExpression_operand1_ValueEClass = createEClass(INTEGER_EXPRESSION_OPERAND1_VALUE);
		createEReference(integerExpression_operand1_ValueEClass, INTEGER_EXPRESSION_OPERAND1_VALUE__OPERAND1);
		createEReference(integerExpression_operand1_ValueEClass, INTEGER_EXPRESSION_OPERAND1_VALUE__PARENT);
		createEReference(integerExpression_operand1_ValueEClass, INTEGER_EXPRESSION_OPERAND1_VALUE__STATES);

		integerExpression_operand2_ValueEClass = createEClass(INTEGER_EXPRESSION_OPERAND2_VALUE);
		createEReference(integerExpression_operand2_ValueEClass, INTEGER_EXPRESSION_OPERAND2_VALUE__OPERAND2);
		createEReference(integerExpression_operand2_ValueEClass, INTEGER_EXPRESSION_OPERAND2_VALUE__PARENT);
		createEReference(integerExpression_operand2_ValueEClass, INTEGER_EXPRESSION_OPERAND2_VALUE__STATES);

		integerValue_value_ValueEClass = createEClass(INTEGER_VALUE_VALUE_VALUE);
		createEReference(integerValue_value_ValueEClass, INTEGER_VALUE_VALUE_VALUE__PARENT);
		createEReference(integerValue_value_ValueEClass, INTEGER_VALUE_VALUE_VALUE__STATES);
		createEAttribute(integerValue_value_ValueEClass, INTEGER_VALUE_VALUE_VALUE__VALUE);

		namedElement_name_ValueEClass = createEClass(NAMED_ELEMENT_NAME_VALUE);
		createEAttribute(namedElement_name_ValueEClass, NAMED_ELEMENT_NAME_VALUE__NAME);
		createEReference(namedElement_name_ValueEClass, NAMED_ELEMENT_NAME_VALUE__PARENT);
		createEReference(namedElement_name_ValueEClass, NAMED_ELEMENT_NAME_VALUE__STATES);

		offer_offeredTokens_ValueEClass = createEClass(OFFER_OFFERED_TOKENS_VALUE);
		createEReference(offer_offeredTokens_ValueEClass, OFFER_OFFERED_TOKENS_VALUE__OFFERED_TOKENS);
		createEReference(offer_offeredTokens_ValueEClass, OFFER_OFFERED_TOKENS_VALUE__PARENT);
		createEReference(offer_offeredTokens_ValueEClass, OFFER_OFFERED_TOKENS_VALUE__STATES);

		opaqueAction_expressions_ValueEClass = createEClass(OPAQUE_ACTION_EXPRESSIONS_VALUE);
		createEReference(opaqueAction_expressions_ValueEClass, OPAQUE_ACTION_EXPRESSIONS_VALUE__EXPRESSIONS);
		createEReference(opaqueAction_expressions_ValueEClass, OPAQUE_ACTION_EXPRESSIONS_VALUE__PARENT);
		createEReference(opaqueAction_expressions_ValueEClass, OPAQUE_ACTION_EXPRESSIONS_VALUE__STATES);

		stateEClass = createEClass(STATE);
		createEReference(stateEClass, STATE__ACTIVITY_EDGE_OFFERS_VALUES);
		createEReference(stateEClass, STATE__ACTIVITY_EDGE_SOURCE_VALUES);
		createEReference(stateEClass, STATE__ACTIVITY_EDGE_TARGET_VALUES);
		createEReference(stateEClass, STATE__ACTIVITY_NODE_ACTIVITY_VALUES);
		createEReference(stateEClass, STATE__ACTIVITY_NODE_HELD_TOKENS_VALUES);
		createEReference(stateEClass, STATE__ACTIVITY_NODE_INCOMING_VALUES);
		createEReference(stateEClass, STATE__ACTIVITY_NODE_OUTGOING_VALUES);
		createEReference(stateEClass, STATE__ACTIVITY_NODE_RUNNING_VALUES);
		createEReference(stateEClass, STATE__ACTIVITY_EDGES_VALUES);
		createEReference(stateEClass, STATE__ACTIVITY_INPUTS_VALUES);
		createEReference(stateEClass, STATE__ACTIVITY_LOCALS_VALUES);
		createEReference(stateEClass, STATE__ACTIVITY_NODES_VALUES);
		createEReference(stateEClass, STATE__ACTIVITY_TRACE_VALUES);
		createEReference(stateEClass, STATE__BOOLEAN_BINARY_EXPRESSION_OPERAND1_VALUES);
		createEReference(stateEClass, STATE__BOOLEAN_BINARY_EXPRESSION_OPERAND2_VALUES);
		createEReference(stateEClass, STATE__BOOLEAN_BINARY_EXPRESSION_OPERATOR_VALUES);
		createEReference(stateEClass, STATE__BOOLEAN_EXPRESSION_ASSIGNEE_VALUES);
		createEReference(stateEClass, STATE__BOOLEAN_UNARY_EXPRESSION_OPERAND_VALUES);
		createEReference(stateEClass, STATE__BOOLEAN_UNARY_EXPRESSION_OPERATOR_VALUES);
		createEReference(stateEClass, STATE__BOOLEAN_VALUE_VALUE_VALUES);
		createEReference(stateEClass, STATE__CONTROL_FLOW_GUARD_VALUES);
		createEReference(stateEClass, STATE__ENDED_STEPS);
		createEReference(stateEClass, STATE__FORKED_TOKEN_BASE_TOKEN_VALUES);
		createEReference(stateEClass, STATE__FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUES);
		createEReference(stateEClass, STATE__INPUT_VALUE_VALUE_VALUES);
		createEReference(stateEClass, STATE__INPUT_VALUE_VARIABLE_VALUES);
		createEReference(stateEClass, STATE__INPUT_INPUT_VALUES_VALUES);
		createEReference(stateEClass, STATE__INTEGER_CALCULATION_EXPRESSION_ASSIGNEE_VALUES);
		createEReference(stateEClass, STATE__INTEGER_CALCULATION_EXPRESSION_OPERATOR_VALUES);
		createEReference(stateEClass, STATE__INTEGER_COMPARISON_EXPRESSION_ASSIGNEE_VALUES);
		createEReference(stateEClass, STATE__INTEGER_COMPARISON_EXPRESSION_OPERATOR_VALUES);
		createEReference(stateEClass, STATE__INTEGER_EXPRESSION_OPERAND1_VALUES);
		createEReference(stateEClass, STATE__INTEGER_EXPRESSION_OPERAND2_VALUES);
		createEReference(stateEClass, STATE__INTEGER_VALUE_VALUE_VALUES);
		createEReference(stateEClass, STATE__NAMED_ELEMENT_NAME_VALUES);
		createEReference(stateEClass, STATE__OFFER_OFFERED_TOKENS_VALUES);
		createEReference(stateEClass, STATE__OPAQUE_ACTION_EXPRESSIONS_VALUES);
		createEReference(stateEClass, STATE__STARTED_STEPS);
		createEReference(stateEClass, STATE__TOKEN_HOLDER_VALUES);
		createEReference(stateEClass, STATE__TRACE_EXECUTED_NODES_VALUES);
		createEReference(stateEClass, STATE__VARIABLE_CURRENT_VALUE_VALUES);
		createEReference(stateEClass, STATE__VARIABLE_INITIAL_VALUE_VALUES);
		createEReference(stateEClass, STATE__VARIABLE_NAME_VALUES);

		token_holder_ValueEClass = createEClass(TOKEN_HOLDER_VALUE);
		createEReference(token_holder_ValueEClass, TOKEN_HOLDER_VALUE__HOLDER);
		createEReference(token_holder_ValueEClass, TOKEN_HOLDER_VALUE__PARENT);
		createEReference(token_holder_ValueEClass, TOKEN_HOLDER_VALUE__STATES);

		trace_executedNodes_ValueEClass = createEClass(TRACE_EXECUTED_NODES_VALUE);
		createEReference(trace_executedNodes_ValueEClass, TRACE_EXECUTED_NODES_VALUE__EXECUTED_NODES);
		createEReference(trace_executedNodes_ValueEClass, TRACE_EXECUTED_NODES_VALUE__PARENT);
		createEReference(trace_executedNodes_ValueEClass, TRACE_EXECUTED_NODES_VALUE__STATES);

		variable_currentValue_ValueEClass = createEClass(VARIABLE_CURRENT_VALUE_VALUE);
		createEReference(variable_currentValue_ValueEClass, VARIABLE_CURRENT_VALUE_VALUE__CURRENT_VALUE);
		createEReference(variable_currentValue_ValueEClass, VARIABLE_CURRENT_VALUE_VALUE__PARENT);
		createEReference(variable_currentValue_ValueEClass, VARIABLE_CURRENT_VALUE_VALUE__STATES);

		variable_initialValue_ValueEClass = createEClass(VARIABLE_INITIAL_VALUE_VALUE);
		createEReference(variable_initialValue_ValueEClass, VARIABLE_INITIAL_VALUE_VALUE__INITIAL_VALUE);
		createEReference(variable_initialValue_ValueEClass, VARIABLE_INITIAL_VALUE_VALUE__PARENT);
		createEReference(variable_initialValue_ValueEClass, VARIABLE_INITIAL_VALUE_VALUE__STATES);

		variable_name_ValueEClass = createEClass(VARIABLE_NAME_VALUE);
		createEAttribute(variable_name_ValueEClass, VARIABLE_NAME_VALUE__NAME);
		createEReference(variable_name_ValueEClass, VARIABLE_NAME_VALUE__PARENT);
		createEReference(variable_name_ValueEClass, VARIABLE_NAME_VALUE__STATES);
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
		activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage theActivitydiagramPackage_1 = (activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage)EPackage.Registry.INSTANCE.getEPackage(activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage.eNS_URI);
		ActivitydiagramPackage theActivitydiagramPackage = (ActivitydiagramPackage)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI);
		StepsPackage theStepsPackage = (StepsPackage)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theActivitydiagramPackage_1);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(activityEdge_offers_ValueEClass, ActivityEdge_offers_Value.class, "ActivityEdge_offers_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityEdge_offers_Value_Offers(), theActivitydiagramPackage_1.getTracedOffer(), null, "offers", null, 0, -1, ActivityEdge_offers_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityEdge_offers_Value_Parent(), theActivitydiagramPackage_1.getTracedActivityEdge(), theActivitydiagramPackage_1.getTracedActivityEdge_OffersSequence(), "parent", null, 1, 1, ActivityEdge_offers_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityEdge_offers_Value_States(), this.getState(), this.getState_ActivityEdge_offers_Values(), "states", null, 1, -1, ActivityEdge_offers_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityEdge_source_ValueEClass, ActivityEdge_source_Value.class, "ActivityEdge_source_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityEdge_source_Value_Parent(), theActivitydiagramPackage_1.getTracedActivityEdge(), theActivitydiagramPackage_1.getTracedActivityEdge_SourceSequence(), "parent", null, 1, 1, ActivityEdge_source_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityEdge_source_Value_Source(), theActivitydiagramPackage_1.getTracedActivityNode(), null, "source", null, 1, 1, ActivityEdge_source_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityEdge_source_Value_States(), this.getState(), this.getState_ActivityEdge_source_Values(), "states", null, 1, -1, ActivityEdge_source_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityEdge_target_ValueEClass, ActivityEdge_target_Value.class, "ActivityEdge_target_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityEdge_target_Value_Parent(), theActivitydiagramPackage_1.getTracedActivityEdge(), theActivitydiagramPackage_1.getTracedActivityEdge_TargetSequence(), "parent", null, 1, 1, ActivityEdge_target_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityEdge_target_Value_States(), this.getState(), this.getState_ActivityEdge_target_Values(), "states", null, 1, -1, ActivityEdge_target_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityEdge_target_Value_Target(), theActivitydiagramPackage_1.getTracedActivityNode(), null, "target", null, 1, 1, ActivityEdge_target_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityNode_activity_ValueEClass, ActivityNode_activity_Value.class, "ActivityNode_activity_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityNode_activity_Value_Activity(), theActivitydiagramPackage_1.getTracedActivity(), null, "activity", null, 1, 1, ActivityNode_activity_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityNode_activity_Value_Parent(), theActivitydiagramPackage_1.getTracedActivityNode(), theActivitydiagramPackage_1.getTracedActivityNode_ActivitySequence(), "parent", null, 1, 1, ActivityNode_activity_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityNode_activity_Value_States(), this.getState(), this.getState_ActivityNode_activity_Values(), "states", null, 1, -1, ActivityNode_activity_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityNode_heldTokens_ValueEClass, ActivityNode_heldTokens_Value.class, "ActivityNode_heldTokens_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityNode_heldTokens_Value_HeldTokens(), theActivitydiagramPackage_1.getTracedToken(), null, "heldTokens", null, 0, -1, ActivityNode_heldTokens_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityNode_heldTokens_Value_Parent(), theActivitydiagramPackage_1.getTracedActivityNode(), theActivitydiagramPackage_1.getTracedActivityNode_HeldTokensSequence(), "parent", null, 1, 1, ActivityNode_heldTokens_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityNode_heldTokens_Value_States(), this.getState(), this.getState_ActivityNode_heldTokens_Values(), "states", null, 1, -1, ActivityNode_heldTokens_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityNode_incoming_ValueEClass, ActivityNode_incoming_Value.class, "ActivityNode_incoming_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityNode_incoming_Value_Incoming(), theActivitydiagramPackage_1.getTracedActivityEdge(), null, "incoming", null, 0, -1, ActivityNode_incoming_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityNode_incoming_Value_Parent(), theActivitydiagramPackage_1.getTracedActivityNode(), theActivitydiagramPackage_1.getTracedActivityNode_IncomingSequence(), "parent", null, 1, 1, ActivityNode_incoming_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityNode_incoming_Value_States(), this.getState(), this.getState_ActivityNode_incoming_Values(), "states", null, 1, -1, ActivityNode_incoming_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityNode_outgoing_ValueEClass, ActivityNode_outgoing_Value.class, "ActivityNode_outgoing_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityNode_outgoing_Value_Outgoing(), theActivitydiagramPackage_1.getTracedActivityEdge(), null, "outgoing", null, 0, -1, ActivityNode_outgoing_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityNode_outgoing_Value_Parent(), theActivitydiagramPackage_1.getTracedActivityNode(), theActivitydiagramPackage_1.getTracedActivityNode_OutgoingSequence(), "parent", null, 1, 1, ActivityNode_outgoing_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityNode_outgoing_Value_States(), this.getState(), this.getState_ActivityNode_outgoing_Values(), "states", null, 1, -1, ActivityNode_outgoing_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityNode_running_ValueEClass, ActivityNode_running_Value.class, "ActivityNode_running_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityNode_running_Value_Parent(), theActivitydiagramPackage_1.getTracedActivityNode(), theActivitydiagramPackage_1.getTracedActivityNode_RunningSequence(), "parent", null, 1, 1, ActivityNode_running_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivityNode_running_Value_Running(), ecorePackage.getEBoolean(), "running", null, 1, 1, ActivityNode_running_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityNode_running_Value_States(), this.getState(), this.getState_ActivityNode_running_Values(), "states", null, 1, -1, ActivityNode_running_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activity_edges_ValueEClass, Activity_edges_Value.class, "Activity_edges_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivity_edges_Value_Edges(), theActivitydiagramPackage_1.getTracedActivityEdge(), null, "edges", null, 0, -1, Activity_edges_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_edges_Value_Parent(), theActivitydiagramPackage_1.getTracedActivity(), theActivitydiagramPackage_1.getTracedActivity_EdgesSequence(), "parent", null, 1, 1, Activity_edges_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_edges_Value_States(), this.getState(), this.getState_Activity_edges_Values(), "states", null, 1, -1, Activity_edges_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activity_inputs_ValueEClass, Activity_inputs_Value.class, "Activity_inputs_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivity_inputs_Value_Inputs(), theActivitydiagramPackage_1.getTracedVariable(), null, "inputs", null, 0, -1, Activity_inputs_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_inputs_Value_Parent(), theActivitydiagramPackage_1.getTracedActivity(), theActivitydiagramPackage_1.getTracedActivity_InputsSequence(), "parent", null, 1, 1, Activity_inputs_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_inputs_Value_States(), this.getState(), this.getState_Activity_inputs_Values(), "states", null, 1, -1, Activity_inputs_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activity_locals_ValueEClass, Activity_locals_Value.class, "Activity_locals_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivity_locals_Value_Locals(), theActivitydiagramPackage_1.getTracedVariable(), null, "locals", null, 0, -1, Activity_locals_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_locals_Value_Parent(), theActivitydiagramPackage_1.getTracedActivity(), theActivitydiagramPackage_1.getTracedActivity_LocalsSequence(), "parent", null, 1, 1, Activity_locals_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_locals_Value_States(), this.getState(), this.getState_Activity_locals_Values(), "states", null, 1, -1, Activity_locals_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activity_nodes_ValueEClass, Activity_nodes_Value.class, "Activity_nodes_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivity_nodes_Value_Nodes(), theActivitydiagramPackage_1.getTracedActivityNode(), null, "nodes", null, 0, -1, Activity_nodes_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_nodes_Value_Parent(), theActivitydiagramPackage_1.getTracedActivity(), theActivitydiagramPackage_1.getTracedActivity_NodesSequence(), "parent", null, 1, 1, Activity_nodes_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_nodes_Value_States(), this.getState(), this.getState_Activity_nodes_Values(), "states", null, 1, -1, Activity_nodes_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activity_trace_ValueEClass, Activity_trace_Value.class, "Activity_trace_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivity_trace_Value_Parent(), theActivitydiagramPackage_1.getTracedActivity(), theActivitydiagramPackage_1.getTracedActivity_TraceSequence(), "parent", null, 1, 1, Activity_trace_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_trace_Value_States(), this.getState(), this.getState_Activity_trace_Values(), "states", null, 1, -1, Activity_trace_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_trace_Value_Trace(), theActivitydiagramPackage_1.getTracedTrace(), null, "trace", null, 0, 1, Activity_trace_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanBinaryExpression_operand1_ValueEClass, BooleanBinaryExpression_operand1_Value.class, "BooleanBinaryExpression_operand1_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBooleanBinaryExpression_operand1_Value_Operand1(), theActivitydiagramPackage_1.getTracedBooleanVariable(), null, "operand1", null, 1, 1, BooleanBinaryExpression_operand1_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBooleanBinaryExpression_operand1_Value_Parent(), theActivitydiagramPackage_1.getTracedBooleanBinaryExpression(), theActivitydiagramPackage_1.getTracedBooleanBinaryExpression_Operand1Sequence(), "parent", null, 1, 1, BooleanBinaryExpression_operand1_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBooleanBinaryExpression_operand1_Value_States(), this.getState(), this.getState_BooleanBinaryExpression_operand1_Values(), "states", null, 1, -1, BooleanBinaryExpression_operand1_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanBinaryExpression_operand2_ValueEClass, BooleanBinaryExpression_operand2_Value.class, "BooleanBinaryExpression_operand2_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBooleanBinaryExpression_operand2_Value_Operand2(), theActivitydiagramPackage_1.getTracedBooleanVariable(), null, "operand2", null, 1, 1, BooleanBinaryExpression_operand2_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBooleanBinaryExpression_operand2_Value_Parent(), theActivitydiagramPackage_1.getTracedBooleanBinaryExpression(), theActivitydiagramPackage_1.getTracedBooleanBinaryExpression_Operand2Sequence(), "parent", null, 1, 1, BooleanBinaryExpression_operand2_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBooleanBinaryExpression_operand2_Value_States(), this.getState(), this.getState_BooleanBinaryExpression_operand2_Values(), "states", null, 1, -1, BooleanBinaryExpression_operand2_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanBinaryExpression_operator_ValueEClass, BooleanBinaryExpression_operator_Value.class, "BooleanBinaryExpression_operator_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanBinaryExpression_operator_Value_Operator(), theActivitydiagramPackage.getBooleanBinaryOperator(), "operator", null, 1, 1, BooleanBinaryExpression_operator_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBooleanBinaryExpression_operator_Value_Parent(), theActivitydiagramPackage_1.getTracedBooleanBinaryExpression(), theActivitydiagramPackage_1.getTracedBooleanBinaryExpression_OperatorSequence(), "parent", null, 1, 1, BooleanBinaryExpression_operator_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBooleanBinaryExpression_operator_Value_States(), this.getState(), this.getState_BooleanBinaryExpression_operator_Values(), "states", null, 1, -1, BooleanBinaryExpression_operator_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanExpression_assignee_ValueEClass, BooleanExpression_assignee_Value.class, "BooleanExpression_assignee_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBooleanExpression_assignee_Value_Assignee(), theActivitydiagramPackage_1.getTracedBooleanVariable(), null, "assignee", null, 1, 1, BooleanExpression_assignee_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBooleanExpression_assignee_Value_Parent(), theActivitydiagramPackage_1.getTracedBooleanExpression(), theActivitydiagramPackage_1.getTracedBooleanExpression_AssigneeSequence(), "parent", null, 1, 1, BooleanExpression_assignee_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBooleanExpression_assignee_Value_States(), this.getState(), this.getState_BooleanExpression_assignee_Values(), "states", null, 1, -1, BooleanExpression_assignee_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanUnaryExpression_operand_ValueEClass, BooleanUnaryExpression_operand_Value.class, "BooleanUnaryExpression_operand_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBooleanUnaryExpression_operand_Value_Operand(), theActivitydiagramPackage_1.getTracedBooleanVariable(), null, "operand", null, 1, 1, BooleanUnaryExpression_operand_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBooleanUnaryExpression_operand_Value_Parent(), theActivitydiagramPackage_1.getTracedBooleanUnaryExpression(), theActivitydiagramPackage_1.getTracedBooleanUnaryExpression_OperandSequence(), "parent", null, 1, 1, BooleanUnaryExpression_operand_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBooleanUnaryExpression_operand_Value_States(), this.getState(), this.getState_BooleanUnaryExpression_operand_Values(), "states", null, 1, -1, BooleanUnaryExpression_operand_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanUnaryExpression_operator_ValueEClass, BooleanUnaryExpression_operator_Value.class, "BooleanUnaryExpression_operator_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanUnaryExpression_operator_Value_Operator(), theActivitydiagramPackage.getBooleanUnaryOperator(), "operator", null, 1, 1, BooleanUnaryExpression_operator_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBooleanUnaryExpression_operator_Value_Parent(), theActivitydiagramPackage_1.getTracedBooleanUnaryExpression(), theActivitydiagramPackage_1.getTracedBooleanUnaryExpression_OperatorSequence(), "parent", null, 1, 1, BooleanUnaryExpression_operator_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBooleanUnaryExpression_operator_Value_States(), this.getState(), this.getState_BooleanUnaryExpression_operator_Values(), "states", null, 1, -1, BooleanUnaryExpression_operator_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanValue_value_ValueEClass, BooleanValue_value_Value.class, "BooleanValue_value_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBooleanValue_value_Value_Parent(), theActivitydiagramPackage_1.getTracedBooleanValue(), theActivitydiagramPackage_1.getTracedBooleanValue_ValueSequence(), "parent", null, 1, 1, BooleanValue_value_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBooleanValue_value_Value_States(), this.getState(), this.getState_BooleanValue_value_Values(), "states", null, 1, -1, BooleanValue_value_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBooleanValue_value_Value_Value(), ecorePackage.getEBoolean(), "value", null, 1, 1, BooleanValue_value_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlFlow_guard_ValueEClass, ControlFlow_guard_Value.class, "ControlFlow_guard_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControlFlow_guard_Value_Guard(), theActivitydiagramPackage_1.getTracedBooleanVariable(), null, "guard", null, 0, 1, ControlFlow_guard_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlFlow_guard_Value_Parent(), theActivitydiagramPackage_1.getTracedControlFlow(), theActivitydiagramPackage_1.getTracedControlFlow_GuardSequence(), "parent", null, 1, 1, ControlFlow_guard_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlFlow_guard_Value_States(), this.getState(), this.getState_ControlFlow_guard_Values(), "states", null, 1, -1, ControlFlow_guard_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forkedToken_baseToken_ValueEClass, ForkedToken_baseToken_Value.class, "ForkedToken_baseToken_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForkedToken_baseToken_Value_BaseToken(), theActivitydiagramPackage_1.getTracedToken(), null, "baseToken", null, 1, 1, ForkedToken_baseToken_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForkedToken_baseToken_Value_Parent(), theActivitydiagramPackage_1.getTracedForkedToken(), theActivitydiagramPackage_1.getTracedForkedToken_BaseTokenSequence(), "parent", null, 1, 1, ForkedToken_baseToken_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForkedToken_baseToken_Value_States(), this.getState(), this.getState_ForkedToken_baseToken_Values(), "states", null, 1, -1, ForkedToken_baseToken_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forkedToken_remainingOffersCount_ValueEClass, ForkedToken_remainingOffersCount_Value.class, "ForkedToken_remainingOffersCount_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForkedToken_remainingOffersCount_Value_Parent(), theActivitydiagramPackage_1.getTracedForkedToken(), theActivitydiagramPackage_1.getTracedForkedToken_RemainingOffersCountSequence(), "parent", null, 1, 1, ForkedToken_remainingOffersCount_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForkedToken_remainingOffersCount_Value_RemainingOffersCount(), ecorePackage.getEInt(), "remainingOffersCount", null, 1, 1, ForkedToken_remainingOffersCount_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForkedToken_remainingOffersCount_Value_States(), this.getState(), this.getState_ForkedToken_remainingOffersCount_Values(), "states", null, 1, -1, ForkedToken_remainingOffersCount_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputValue_value_ValueEClass, InputValue_value_Value.class, "InputValue_value_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputValue_value_Value_Parent(), theActivitydiagramPackage_1.getTracedInputValue(), theActivitydiagramPackage_1.getTracedInputValue_ValueSequence(), "parent", null, 1, 1, InputValue_value_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInputValue_value_Value_States(), this.getState(), this.getState_InputValue_value_Values(), "states", null, 1, -1, InputValue_value_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInputValue_value_Value_Value(), theActivitydiagramPackage_1.getTracedValue(), null, "value", null, 1, 1, InputValue_value_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputValue_variable_ValueEClass, InputValue_variable_Value.class, "InputValue_variable_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputValue_variable_Value_Parent(), theActivitydiagramPackage_1.getTracedInputValue(), theActivitydiagramPackage_1.getTracedInputValue_VariableSequence(), "parent", null, 1, 1, InputValue_variable_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInputValue_variable_Value_States(), this.getState(), this.getState_InputValue_variable_Values(), "states", null, 1, -1, InputValue_variable_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInputValue_variable_Value_Variable(), theActivitydiagramPackage_1.getTracedVariable(), null, "variable", null, 1, 1, InputValue_variable_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(input_inputValues_ValueEClass, Input_inputValues_Value.class, "Input_inputValues_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInput_inputValues_Value_InputValues(), theActivitydiagramPackage_1.getTracedInputValue(), null, "inputValues", null, 0, -1, Input_inputValues_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInput_inputValues_Value_Parent(), theActivitydiagramPackage_1.getTracedInput(), theActivitydiagramPackage_1.getTracedInput_InputValuesSequence(), "parent", null, 1, 1, Input_inputValues_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInput_inputValues_Value_States(), this.getState(), this.getState_Input_inputValues_Values(), "states", null, 1, -1, Input_inputValues_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerCalculationExpression_assignee_ValueEClass, IntegerCalculationExpression_assignee_Value.class, "IntegerCalculationExpression_assignee_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntegerCalculationExpression_assignee_Value_Assignee(), theActivitydiagramPackage_1.getTracedIntegerVariable(), null, "assignee", null, 1, 1, IntegerCalculationExpression_assignee_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntegerCalculationExpression_assignee_Value_Parent(), theActivitydiagramPackage_1.getTracedIntegerCalculationExpression(), theActivitydiagramPackage_1.getTracedIntegerCalculationExpression_AssigneeSequence(), "parent", null, 1, 1, IntegerCalculationExpression_assignee_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntegerCalculationExpression_assignee_Value_States(), this.getState(), this.getState_IntegerCalculationExpression_assignee_Values(), "states", null, 1, -1, IntegerCalculationExpression_assignee_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerCalculationExpression_operator_ValueEClass, IntegerCalculationExpression_operator_Value.class, "IntegerCalculationExpression_operator_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerCalculationExpression_operator_Value_Operator(), theActivitydiagramPackage.getIntegerCalculationOperator(), "operator", null, 1, 1, IntegerCalculationExpression_operator_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntegerCalculationExpression_operator_Value_Parent(), theActivitydiagramPackage_1.getTracedIntegerCalculationExpression(), theActivitydiagramPackage_1.getTracedIntegerCalculationExpression_OperatorSequence(), "parent", null, 1, 1, IntegerCalculationExpression_operator_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntegerCalculationExpression_operator_Value_States(), this.getState(), this.getState_IntegerCalculationExpression_operator_Values(), "states", null, 1, -1, IntegerCalculationExpression_operator_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerComparisonExpression_assignee_ValueEClass, IntegerComparisonExpression_assignee_Value.class, "IntegerComparisonExpression_assignee_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntegerComparisonExpression_assignee_Value_Assignee(), theActivitydiagramPackage_1.getTracedBooleanVariable(), null, "assignee", null, 1, 1, IntegerComparisonExpression_assignee_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntegerComparisonExpression_assignee_Value_Parent(), theActivitydiagramPackage_1.getTracedIntegerComparisonExpression(), theActivitydiagramPackage_1.getTracedIntegerComparisonExpression_AssigneeSequence(), "parent", null, 1, 1, IntegerComparisonExpression_assignee_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntegerComparisonExpression_assignee_Value_States(), this.getState(), this.getState_IntegerComparisonExpression_assignee_Values(), "states", null, 1, -1, IntegerComparisonExpression_assignee_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerComparisonExpression_operator_ValueEClass, IntegerComparisonExpression_operator_Value.class, "IntegerComparisonExpression_operator_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerComparisonExpression_operator_Value_Operator(), theActivitydiagramPackage.getIntegerComparisonOperator(), "operator", null, 1, 1, IntegerComparisonExpression_operator_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntegerComparisonExpression_operator_Value_Parent(), theActivitydiagramPackage_1.getTracedIntegerComparisonExpression(), theActivitydiagramPackage_1.getTracedIntegerComparisonExpression_OperatorSequence(), "parent", null, 1, 1, IntegerComparisonExpression_operator_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntegerComparisonExpression_operator_Value_States(), this.getState(), this.getState_IntegerComparisonExpression_operator_Values(), "states", null, 1, -1, IntegerComparisonExpression_operator_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerExpression_operand1_ValueEClass, IntegerExpression_operand1_Value.class, "IntegerExpression_operand1_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntegerExpression_operand1_Value_Operand1(), theActivitydiagramPackage_1.getTracedIntegerVariable(), null, "operand1", null, 0, 1, IntegerExpression_operand1_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntegerExpression_operand1_Value_Parent(), theActivitydiagramPackage_1.getTracedIntegerExpression(), theActivitydiagramPackage_1.getTracedIntegerExpression_Operand1Sequence(), "parent", null, 1, 1, IntegerExpression_operand1_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntegerExpression_operand1_Value_States(), this.getState(), this.getState_IntegerExpression_operand1_Values(), "states", null, 1, -1, IntegerExpression_operand1_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerExpression_operand2_ValueEClass, IntegerExpression_operand2_Value.class, "IntegerExpression_operand2_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntegerExpression_operand2_Value_Operand2(), theActivitydiagramPackage_1.getTracedIntegerVariable(), null, "operand2", null, 0, 1, IntegerExpression_operand2_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntegerExpression_operand2_Value_Parent(), theActivitydiagramPackage_1.getTracedIntegerExpression(), theActivitydiagramPackage_1.getTracedIntegerExpression_Operand2Sequence(), "parent", null, 1, 1, IntegerExpression_operand2_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntegerExpression_operand2_Value_States(), this.getState(), this.getState_IntegerExpression_operand2_Values(), "states", null, 1, -1, IntegerExpression_operand2_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerValue_value_ValueEClass, IntegerValue_value_Value.class, "IntegerValue_value_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntegerValue_value_Value_Parent(), theActivitydiagramPackage_1.getTracedIntegerValue(), theActivitydiagramPackage_1.getTracedIntegerValue_ValueSequence(), "parent", null, 1, 1, IntegerValue_value_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntegerValue_value_Value_States(), this.getState(), this.getState_IntegerValue_value_Values(), "states", null, 1, -1, IntegerValue_value_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegerValue_value_Value_Value(), ecorePackage.getEInt(), "value", null, 1, 1, IntegerValue_value_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElement_name_ValueEClass, NamedElement_name_Value.class, "NamedElement_name_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_name_Value_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement_name_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNamedElement_name_Value_Parent(), theActivitydiagramPackage_1.getTracedNamedElement(), theActivitydiagramPackage_1.getTracedNamedElement_NameSequence(), "parent", null, 1, 1, NamedElement_name_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNamedElement_name_Value_States(), this.getState(), this.getState_NamedElement_name_Values(), "states", null, 1, -1, NamedElement_name_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(offer_offeredTokens_ValueEClass, Offer_offeredTokens_Value.class, "Offer_offeredTokens_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOffer_offeredTokens_Value_OfferedTokens(), theActivitydiagramPackage_1.getTracedToken(), null, "offeredTokens", null, 0, -1, Offer_offeredTokens_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOffer_offeredTokens_Value_Parent(), theActivitydiagramPackage_1.getTracedOffer(), theActivitydiagramPackage_1.getTracedOffer_OfferedTokensSequence(), "parent", null, 1, 1, Offer_offeredTokens_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOffer_offeredTokens_Value_States(), this.getState(), this.getState_Offer_offeredTokens_Values(), "states", null, 1, -1, Offer_offeredTokens_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(opaqueAction_expressions_ValueEClass, OpaqueAction_expressions_Value.class, "OpaqueAction_expressions_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOpaqueAction_expressions_Value_Expressions(), theActivitydiagramPackage_1.getTracedExpression(), null, "expressions", null, 0, -1, OpaqueAction_expressions_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOpaqueAction_expressions_Value_Parent(), theActivitydiagramPackage_1.getTracedOpaqueAction(), theActivitydiagramPackage_1.getTracedOpaqueAction_ExpressionsSequence(), "parent", null, 1, 1, OpaqueAction_expressions_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOpaqueAction_expressions_Value_States(), this.getState(), this.getState_OpaqueAction_expressions_Values(), "states", null, 1, -1, OpaqueAction_expressions_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getState_ActivityEdge_offers_Values(), this.getActivityEdge_offers_Value(), this.getActivityEdge_offers_Value_States(), "activityEdge_offers_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_ActivityEdge_source_Values(), this.getActivityEdge_source_Value(), this.getActivityEdge_source_Value_States(), "activityEdge_source_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_ActivityEdge_target_Values(), this.getActivityEdge_target_Value(), this.getActivityEdge_target_Value_States(), "activityEdge_target_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_ActivityNode_activity_Values(), this.getActivityNode_activity_Value(), this.getActivityNode_activity_Value_States(), "activityNode_activity_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_ActivityNode_heldTokens_Values(), this.getActivityNode_heldTokens_Value(), this.getActivityNode_heldTokens_Value_States(), "activityNode_heldTokens_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_ActivityNode_incoming_Values(), this.getActivityNode_incoming_Value(), this.getActivityNode_incoming_Value_States(), "activityNode_incoming_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_ActivityNode_outgoing_Values(), this.getActivityNode_outgoing_Value(), this.getActivityNode_outgoing_Value_States(), "activityNode_outgoing_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_ActivityNode_running_Values(), this.getActivityNode_running_Value(), this.getActivityNode_running_Value_States(), "activityNode_running_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_Activity_edges_Values(), this.getActivity_edges_Value(), this.getActivity_edges_Value_States(), "activity_edges_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_Activity_inputs_Values(), this.getActivity_inputs_Value(), this.getActivity_inputs_Value_States(), "activity_inputs_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_Activity_locals_Values(), this.getActivity_locals_Value(), this.getActivity_locals_Value_States(), "activity_locals_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_Activity_nodes_Values(), this.getActivity_nodes_Value(), this.getActivity_nodes_Value_States(), "activity_nodes_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_Activity_trace_Values(), this.getActivity_trace_Value(), this.getActivity_trace_Value_States(), "activity_trace_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_BooleanBinaryExpression_operand1_Values(), this.getBooleanBinaryExpression_operand1_Value(), this.getBooleanBinaryExpression_operand1_Value_States(), "booleanBinaryExpression_operand1_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_BooleanBinaryExpression_operand2_Values(), this.getBooleanBinaryExpression_operand2_Value(), this.getBooleanBinaryExpression_operand2_Value_States(), "booleanBinaryExpression_operand2_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_BooleanBinaryExpression_operator_Values(), this.getBooleanBinaryExpression_operator_Value(), this.getBooleanBinaryExpression_operator_Value_States(), "booleanBinaryExpression_operator_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_BooleanExpression_assignee_Values(), this.getBooleanExpression_assignee_Value(), this.getBooleanExpression_assignee_Value_States(), "booleanExpression_assignee_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_BooleanUnaryExpression_operand_Values(), this.getBooleanUnaryExpression_operand_Value(), this.getBooleanUnaryExpression_operand_Value_States(), "booleanUnaryExpression_operand_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_BooleanUnaryExpression_operator_Values(), this.getBooleanUnaryExpression_operator_Value(), this.getBooleanUnaryExpression_operator_Value_States(), "booleanUnaryExpression_operator_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_BooleanValue_value_Values(), this.getBooleanValue_value_Value(), this.getBooleanValue_value_Value_States(), "booleanValue_value_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_ControlFlow_guard_Values(), this.getControlFlow_guard_Value(), this.getControlFlow_guard_Value_States(), "controlFlow_guard_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_EndedSteps(), theStepsPackage.getStep(), theStepsPackage.getStep_EndingState(), "endedSteps", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_ForkedToken_baseToken_Values(), this.getForkedToken_baseToken_Value(), this.getForkedToken_baseToken_Value_States(), "forkedToken_baseToken_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_ForkedToken_remainingOffersCount_Values(), this.getForkedToken_remainingOffersCount_Value(), this.getForkedToken_remainingOffersCount_Value_States(), "forkedToken_remainingOffersCount_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_InputValue_value_Values(), this.getInputValue_value_Value(), this.getInputValue_value_Value_States(), "inputValue_value_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_InputValue_variable_Values(), this.getInputValue_variable_Value(), this.getInputValue_variable_Value_States(), "inputValue_variable_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_Input_inputValues_Values(), this.getInput_inputValues_Value(), this.getInput_inputValues_Value_States(), "input_inputValues_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_IntegerCalculationExpression_assignee_Values(), this.getIntegerCalculationExpression_assignee_Value(), this.getIntegerCalculationExpression_assignee_Value_States(), "integerCalculationExpression_assignee_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_IntegerCalculationExpression_operator_Values(), this.getIntegerCalculationExpression_operator_Value(), this.getIntegerCalculationExpression_operator_Value_States(), "integerCalculationExpression_operator_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_IntegerComparisonExpression_assignee_Values(), this.getIntegerComparisonExpression_assignee_Value(), this.getIntegerComparisonExpression_assignee_Value_States(), "integerComparisonExpression_assignee_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_IntegerComparisonExpression_operator_Values(), this.getIntegerComparisonExpression_operator_Value(), this.getIntegerComparisonExpression_operator_Value_States(), "integerComparisonExpression_operator_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_IntegerExpression_operand1_Values(), this.getIntegerExpression_operand1_Value(), this.getIntegerExpression_operand1_Value_States(), "integerExpression_operand1_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_IntegerExpression_operand2_Values(), this.getIntegerExpression_operand2_Value(), this.getIntegerExpression_operand2_Value_States(), "integerExpression_operand2_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_IntegerValue_value_Values(), this.getIntegerValue_value_Value(), this.getIntegerValue_value_Value_States(), "integerValue_value_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_NamedElement_name_Values(), this.getNamedElement_name_Value(), this.getNamedElement_name_Value_States(), "namedElement_name_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_Offer_offeredTokens_Values(), this.getOffer_offeredTokens_Value(), this.getOffer_offeredTokens_Value_States(), "offer_offeredTokens_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_OpaqueAction_expressions_Values(), this.getOpaqueAction_expressions_Value(), this.getOpaqueAction_expressions_Value_States(), "opaqueAction_expressions_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_StartedSteps(), theStepsPackage.getStep(), theStepsPackage.getStep_StartingState(), "startedSteps", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Token_holder_Values(), this.getToken_holder_Value(), this.getToken_holder_Value_States(), "token_holder_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_Trace_executedNodes_Values(), this.getTrace_executedNodes_Value(), this.getTrace_executedNodes_Value_States(), "trace_executedNodes_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_Variable_currentValue_Values(), this.getVariable_currentValue_Value(), this.getVariable_currentValue_Value_States(), "variable_currentValue_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_Variable_initialValue_Values(), this.getVariable_initialValue_Value(), this.getVariable_initialValue_Value_States(), "variable_initialValue_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_Variable_name_Values(), this.getVariable_name_Value(), this.getVariable_name_Value_States(), "variable_name_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(token_holder_ValueEClass, Token_holder_Value.class, "Token_holder_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getToken_holder_Value_Holder(), theActivitydiagramPackage_1.getTracedActivityNode(), null, "holder", null, 1, 1, Token_holder_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToken_holder_Value_Parent(), theActivitydiagramPackage_1.getTracedToken(), theActivitydiagramPackage_1.getTracedToken_HolderSequence(), "parent", null, 1, 1, Token_holder_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToken_holder_Value_States(), this.getState(), this.getState_Token_holder_Values(), "states", null, 1, -1, Token_holder_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trace_executedNodes_ValueEClass, Trace_executedNodes_Value.class, "Trace_executedNodes_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrace_executedNodes_Value_ExecutedNodes(), theActivitydiagramPackage_1.getTracedActivityNode(), null, "executedNodes", null, 0, -1, Trace_executedNodes_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrace_executedNodes_Value_Parent(), theActivitydiagramPackage_1.getTracedTrace(), theActivitydiagramPackage_1.getTracedTrace_ExecutedNodesSequence(), "parent", null, 1, 1, Trace_executedNodes_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrace_executedNodes_Value_States(), this.getState(), this.getState_Trace_executedNodes_Values(), "states", null, 1, -1, Trace_executedNodes_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variable_currentValue_ValueEClass, Variable_currentValue_Value.class, "Variable_currentValue_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariable_currentValue_Value_CurrentValue(), theActivitydiagramPackage_1.getTracedValue(), null, "currentValue", null, 0, 1, Variable_currentValue_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariable_currentValue_Value_Parent(), theActivitydiagramPackage_1.getTracedVariable(), theActivitydiagramPackage_1.getTracedVariable_CurrentValueSequence(), "parent", null, 1, 1, Variable_currentValue_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariable_currentValue_Value_States(), this.getState(), this.getState_Variable_currentValue_Values(), "states", null, 1, -1, Variable_currentValue_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variable_initialValue_ValueEClass, Variable_initialValue_Value.class, "Variable_initialValue_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariable_initialValue_Value_InitialValue(), theActivitydiagramPackage_1.getTracedValue(), null, "initialValue", null, 0, 1, Variable_initialValue_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariable_initialValue_Value_Parent(), theActivitydiagramPackage_1.getTracedVariable(), theActivitydiagramPackage_1.getTracedVariable_InitialValueSequence(), "parent", null, 1, 1, Variable_initialValue_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariable_initialValue_Value_States(), this.getState(), this.getState_Variable_initialValue_Values(), "states", null, 1, -1, Variable_initialValue_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variable_name_ValueEClass, Variable_name_Value.class, "Variable_name_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariable_name_Value_Name(), ecorePackage.getEString(), "name", null, 1, 1, Variable_name_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariable_name_Value_Parent(), theActivitydiagramPackage_1.getTracedVariable(), theActivitydiagramPackage_1.getTracedVariable_NameSequence(), "parent", null, 1, 1, Variable_name_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariable_name_Value_States(), this.getState(), this.getState_Variable_name_Values(), "states", null, 1, -1, Variable_name_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create annotations
		// http://www.modelexecution.org/trace/XMOF
		createXMOFAnnotations();
		// dynamic
		createDynamicAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.modelexecution.org/trace/XMOF</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createXMOFAnnotations() {
		String source = "http://www.modelexecution.org/trace/XMOF";	
		addAnnotation
		  (activityEdge_offers_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (activityEdge_source_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (activityEdge_target_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (activityNode_activity_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (activityNode_heldTokens_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (activityNode_incoming_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (activityNode_outgoing_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (activityNode_running_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (activity_edges_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (activity_inputs_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (activity_locals_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (activity_nodes_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (activity_trace_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (booleanBinaryExpression_operand1_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (booleanBinaryExpression_operand2_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (booleanBinaryExpression_operator_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (booleanExpression_assignee_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (booleanUnaryExpression_operand_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (booleanUnaryExpression_operator_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (booleanValue_value_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (controlFlow_guard_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (forkedToken_baseToken_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (forkedToken_remainingOffersCount_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (inputValue_value_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (inputValue_variable_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (input_inputValues_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (integerCalculationExpression_assignee_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (integerCalculationExpression_operator_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (integerComparisonExpression_assignee_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (integerComparisonExpression_operator_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (integerExpression_operand1_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (integerExpression_operand2_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (integerValue_value_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (namedElement_name_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (offer_offeredTokens_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (opaqueAction_expressions_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (token_holder_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (trace_executedNodes_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (variable_currentValue_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (variable_initialValue_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (variable_name_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });
	}

	/**
	 * Initializes the annotations for <b>dynamic</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDynamicAnnotations() {
		String source = "dynamic";	
		addAnnotation
		  (getActivityEdge_offers_Value_Offers(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActivityNode_heldTokens_Value_HeldTokens(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActivity_trace_Value_Trace(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getVariable_currentValue_Value_CurrentValue(), 
		   source, 
		   new String[] {
		   });
	}

} //StatesPackageImpl
