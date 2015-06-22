/**
 */
package activitydiagramTrace.Values.impl;

import activitydiagram.ActivitydiagramPackage;

import activitydiagramTrace.ActivitydiagramTracePackage;

import activitydiagramTrace.Steps.StepsPackage;

import activitydiagramTrace.Steps.impl.StepsPackageImpl;

import activitydiagramTrace.Traced.TracedPackage;

import activitydiagramTrace.Traced.activitydiagram.impl.ActivitydiagramPackageImpl;

import activitydiagramTrace.Traced.impl.TracedPackageImpl;

import activitydiagramTrace.Values.ActivityEdge_offers_Value;
import activitydiagramTrace.Values.ActivityNode_heldTokens_Value;
import activitydiagramTrace.Values.Activity_trace_Value;
import activitydiagramTrace.Values.BooleanValue_value_Value;
import activitydiagramTrace.Values.ForkedToken_baseToken_Value;
import activitydiagramTrace.Values.ForkedToken_remainingOffersCount_Value;
import activitydiagramTrace.Values.InputValue_value_Value;
import activitydiagramTrace.Values.InputValue_variable_Value;
import activitydiagramTrace.Values.Input_inputValues_Value;
import activitydiagramTrace.Values.IntegerValue_value_Value;
import activitydiagramTrace.Values.Offer_offeredTokens_Value;
import activitydiagramTrace.Values.Token_holder_Value;
import activitydiagramTrace.Values.Trace_executedNodes_Value;
import activitydiagramTrace.Values.ValuesFactory;
import activitydiagramTrace.Values.ValuesPackage;
import activitydiagramTrace.Values.Variable_currentValue_Value;

import activitydiagramTrace.impl.ActivitydiagramTracePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
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
public class ValuesPackageImpl extends EPackageImpl implements ValuesPackage {
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
	private EClass input_inputValues_ValueEClass = null;

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
	private EClass activityNode_heldTokens_ValueEClass = null;

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
	private EClass activityEdge_offers_ValueEClass = null;

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
	private EClass variable_currentValue_ValueEClass = null;

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
	private EClass activity_trace_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trace_executedNodes_ValueEClass = null;

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
	 * @see activitydiagramTrace.Values.ValuesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ValuesPackageImpl() {
		super(eNS_URI, ValuesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ValuesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ValuesPackage init() {
		if (isInited) return (ValuesPackage)EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI);

		// Obtain or create and register package
		ValuesPackageImpl theValuesPackage = (ValuesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ValuesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ValuesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ActivitydiagramPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ActivitydiagramTracePackageImpl theActivitydiagramTracePackage = (ActivitydiagramTracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramTracePackage.eNS_URI) instanceof ActivitydiagramTracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramTracePackage.eNS_URI) : ActivitydiagramTracePackage.eINSTANCE);
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) : StepsPackage.eINSTANCE);
		TracedPackageImpl theTracedPackage = (TracedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TracedPackage.eNS_URI) instanceof TracedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TracedPackage.eNS_URI) : TracedPackage.eINSTANCE);
		ActivitydiagramPackageImpl theActivitydiagramPackage_1 = (ActivitydiagramPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage.eNS_URI) instanceof ActivitydiagramPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage.eNS_URI) : activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage.eINSTANCE);

		// Create package meta-data objects
		theValuesPackage.createPackageContents();
		theActivitydiagramTracePackage.createPackageContents();
		theStepsPackage.createPackageContents();
		theTracedPackage.createPackageContents();
		theActivitydiagramPackage_1.createPackageContents();

		// Initialize created meta-data
		theValuesPackage.initializePackageContents();
		theActivitydiagramTracePackage.initializePackageContents();
		theStepsPackage.initializePackageContents();
		theTracedPackage.initializePackageContents();
		theActivitydiagramPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theValuesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ValuesPackage.eNS_URI, theValuesPackage);
		return theValuesPackage;
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
	public EAttribute getForkedToken_remainingOffersCount_Value_RemainingOffersCount() {
		return (EAttribute)forkedToken_remainingOffersCount_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForkedToken_remainingOffersCount_Value_Parent() {
		return (EReference)forkedToken_remainingOffersCount_ValueEClass.getEStructuralFeatures().get(1);
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
	public EClass getIntegerValue_value_Value() {
		return integerValue_value_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerValue_value_Value_Value() {
		return (EAttribute)integerValue_value_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerValue_value_Value_Parent() {
		return (EReference)integerValue_value_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerValue_value_Value_States() {
		return (EReference)integerValue_value_ValueEClass.getEStructuralFeatures().get(2);
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
	public EClass getInputValue_value_Value() {
		return inputValue_value_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputValue_value_Value_Value() {
		return (EReference)inputValue_value_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputValue_value_Value_Parent() {
		return (EReference)inputValue_value_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputValue_value_Value_States() {
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
	public EReference getInputValue_variable_Value_Variable() {
		return (EReference)inputValue_variable_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputValue_variable_Value_Parent() {
		return (EReference)inputValue_variable_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputValue_variable_Value_States() {
		return (EReference)inputValue_variable_ValueEClass.getEStructuralFeatures().get(2);
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
	public EClass getBooleanValue_value_Value() {
		return booleanValue_value_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanValue_value_Value_Value() {
		return (EAttribute)booleanValue_value_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanValue_value_Value_Parent() {
		return (EReference)booleanValue_value_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanValue_value_Value_States() {
		return (EReference)booleanValue_value_ValueEClass.getEStructuralFeatures().get(2);
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
	public EReference getActivity_trace_Value_Trace() {
		return (EReference)activity_trace_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_trace_Value_Parent() {
		return (EReference)activity_trace_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_trace_Value_States() {
		return (EReference)activity_trace_ValueEClass.getEStructuralFeatures().get(2);
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
	public ValuesFactory getValuesFactory() {
		return (ValuesFactory)getEFactoryInstance();
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
		token_holder_ValueEClass = createEClass(TOKEN_HOLDER_VALUE);
		createEReference(token_holder_ValueEClass, TOKEN_HOLDER_VALUE__HOLDER);
		createEReference(token_holder_ValueEClass, TOKEN_HOLDER_VALUE__PARENT);
		createEReference(token_holder_ValueEClass, TOKEN_HOLDER_VALUE__STATES);

		input_inputValues_ValueEClass = createEClass(INPUT_INPUT_VALUES_VALUE);
		createEReference(input_inputValues_ValueEClass, INPUT_INPUT_VALUES_VALUE__INPUT_VALUES);
		createEReference(input_inputValues_ValueEClass, INPUT_INPUT_VALUES_VALUE__PARENT);
		createEReference(input_inputValues_ValueEClass, INPUT_INPUT_VALUES_VALUE__STATES);

		forkedToken_baseToken_ValueEClass = createEClass(FORKED_TOKEN_BASE_TOKEN_VALUE);
		createEReference(forkedToken_baseToken_ValueEClass, FORKED_TOKEN_BASE_TOKEN_VALUE__BASE_TOKEN);
		createEReference(forkedToken_baseToken_ValueEClass, FORKED_TOKEN_BASE_TOKEN_VALUE__PARENT);
		createEReference(forkedToken_baseToken_ValueEClass, FORKED_TOKEN_BASE_TOKEN_VALUE__STATES);

		forkedToken_remainingOffersCount_ValueEClass = createEClass(FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE);
		createEAttribute(forkedToken_remainingOffersCount_ValueEClass, FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE__REMAINING_OFFERS_COUNT);
		createEReference(forkedToken_remainingOffersCount_ValueEClass, FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE__PARENT);
		createEReference(forkedToken_remainingOffersCount_ValueEClass, FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE__STATES);

		activityNode_heldTokens_ValueEClass = createEClass(ACTIVITY_NODE_HELD_TOKENS_VALUE);
		createEReference(activityNode_heldTokens_ValueEClass, ACTIVITY_NODE_HELD_TOKENS_VALUE__HELD_TOKENS);
		createEReference(activityNode_heldTokens_ValueEClass, ACTIVITY_NODE_HELD_TOKENS_VALUE__PARENT);
		createEReference(activityNode_heldTokens_ValueEClass, ACTIVITY_NODE_HELD_TOKENS_VALUE__STATES);

		integerValue_value_ValueEClass = createEClass(INTEGER_VALUE_VALUE_VALUE);
		createEAttribute(integerValue_value_ValueEClass, INTEGER_VALUE_VALUE_VALUE__VALUE);
		createEReference(integerValue_value_ValueEClass, INTEGER_VALUE_VALUE_VALUE__PARENT);
		createEReference(integerValue_value_ValueEClass, INTEGER_VALUE_VALUE_VALUE__STATES);

		activityEdge_offers_ValueEClass = createEClass(ACTIVITY_EDGE_OFFERS_VALUE);
		createEReference(activityEdge_offers_ValueEClass, ACTIVITY_EDGE_OFFERS_VALUE__OFFERS);
		createEReference(activityEdge_offers_ValueEClass, ACTIVITY_EDGE_OFFERS_VALUE__PARENT);
		createEReference(activityEdge_offers_ValueEClass, ACTIVITY_EDGE_OFFERS_VALUE__STATES);

		offer_offeredTokens_ValueEClass = createEClass(OFFER_OFFERED_TOKENS_VALUE);
		createEReference(offer_offeredTokens_ValueEClass, OFFER_OFFERED_TOKENS_VALUE__OFFERED_TOKENS);
		createEReference(offer_offeredTokens_ValueEClass, OFFER_OFFERED_TOKENS_VALUE__PARENT);
		createEReference(offer_offeredTokens_ValueEClass, OFFER_OFFERED_TOKENS_VALUE__STATES);

		inputValue_value_ValueEClass = createEClass(INPUT_VALUE_VALUE_VALUE);
		createEReference(inputValue_value_ValueEClass, INPUT_VALUE_VALUE_VALUE__VALUE);
		createEReference(inputValue_value_ValueEClass, INPUT_VALUE_VALUE_VALUE__PARENT);
		createEReference(inputValue_value_ValueEClass, INPUT_VALUE_VALUE_VALUE__STATES);

		inputValue_variable_ValueEClass = createEClass(INPUT_VALUE_VARIABLE_VALUE);
		createEReference(inputValue_variable_ValueEClass, INPUT_VALUE_VARIABLE_VALUE__VARIABLE);
		createEReference(inputValue_variable_ValueEClass, INPUT_VALUE_VARIABLE_VALUE__PARENT);
		createEReference(inputValue_variable_ValueEClass, INPUT_VALUE_VARIABLE_VALUE__STATES);

		variable_currentValue_ValueEClass = createEClass(VARIABLE_CURRENT_VALUE_VALUE);
		createEReference(variable_currentValue_ValueEClass, VARIABLE_CURRENT_VALUE_VALUE__CURRENT_VALUE);
		createEReference(variable_currentValue_ValueEClass, VARIABLE_CURRENT_VALUE_VALUE__PARENT);
		createEReference(variable_currentValue_ValueEClass, VARIABLE_CURRENT_VALUE_VALUE__STATES);

		booleanValue_value_ValueEClass = createEClass(BOOLEAN_VALUE_VALUE_VALUE);
		createEAttribute(booleanValue_value_ValueEClass, BOOLEAN_VALUE_VALUE_VALUE__VALUE);
		createEReference(booleanValue_value_ValueEClass, BOOLEAN_VALUE_VALUE_VALUE__PARENT);
		createEReference(booleanValue_value_ValueEClass, BOOLEAN_VALUE_VALUE_VALUE__STATES);

		activity_trace_ValueEClass = createEClass(ACTIVITY_TRACE_VALUE);
		createEReference(activity_trace_ValueEClass, ACTIVITY_TRACE_VALUE__TRACE);
		createEReference(activity_trace_ValueEClass, ACTIVITY_TRACE_VALUE__PARENT);
		createEReference(activity_trace_ValueEClass, ACTIVITY_TRACE_VALUE__STATES);

		trace_executedNodes_ValueEClass = createEClass(TRACE_EXECUTED_NODES_VALUE);
		createEReference(trace_executedNodes_ValueEClass, TRACE_EXECUTED_NODES_VALUE__EXECUTED_NODES);
		createEReference(trace_executedNodes_ValueEClass, TRACE_EXECUTED_NODES_VALUE__PARENT);
		createEReference(trace_executedNodes_ValueEClass, TRACE_EXECUTED_NODES_VALUE__STATES);
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
		ActivitydiagramTracePackage theActivitydiagramTracePackage = (ActivitydiagramTracePackage)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramTracePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(token_holder_ValueEClass, Token_holder_Value.class, "Token_holder_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getToken_holder_Value_Holder(), theActivitydiagramPackage_1.getTracedActivityNode(), null, "holder", null, 1, 1, Token_holder_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToken_holder_Value_Parent(), theActivitydiagramPackage_1.getTracedToken(), theActivitydiagramPackage_1.getTracedToken_HolderTrace(), "parent", null, 1, 1, Token_holder_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToken_holder_Value_States(), theActivitydiagramTracePackage.getState(), theActivitydiagramTracePackage.getState_Token_holder_Values(), "states", null, 1, -1, Token_holder_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(input_inputValues_ValueEClass, Input_inputValues_Value.class, "Input_inputValues_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInput_inputValues_Value_InputValues(), theActivitydiagramPackage_1.getTracedInputValue(), null, "inputValues", null, 0, -1, Input_inputValues_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInput_inputValues_Value_Parent(), theActivitydiagramPackage_1.getTracedInput(), theActivitydiagramPackage_1.getTracedInput_InputValuesTrace(), "parent", null, 1, 1, Input_inputValues_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInput_inputValues_Value_States(), theActivitydiagramTracePackage.getState(), theActivitydiagramTracePackage.getState_Input_inputValues_Values(), "states", null, 1, -1, Input_inputValues_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forkedToken_baseToken_ValueEClass, ForkedToken_baseToken_Value.class, "ForkedToken_baseToken_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForkedToken_baseToken_Value_BaseToken(), theActivitydiagramPackage_1.getTracedToken(), null, "baseToken", null, 1, 1, ForkedToken_baseToken_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForkedToken_baseToken_Value_Parent(), theActivitydiagramPackage_1.getTracedForkedToken(), theActivitydiagramPackage_1.getTracedForkedToken_BaseTokenTrace(), "parent", null, 1, 1, ForkedToken_baseToken_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForkedToken_baseToken_Value_States(), theActivitydiagramTracePackage.getState(), theActivitydiagramTracePackage.getState_ForkedToken_baseToken_Values(), "states", null, 1, -1, ForkedToken_baseToken_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forkedToken_remainingOffersCount_ValueEClass, ForkedToken_remainingOffersCount_Value.class, "ForkedToken_remainingOffersCount_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getForkedToken_remainingOffersCount_Value_RemainingOffersCount(), ecorePackage.getEInt(), "remainingOffersCount", null, 1, 1, ForkedToken_remainingOffersCount_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForkedToken_remainingOffersCount_Value_Parent(), theActivitydiagramPackage_1.getTracedForkedToken(), theActivitydiagramPackage_1.getTracedForkedToken_RemainingOffersCountTrace(), "parent", null, 1, 1, ForkedToken_remainingOffersCount_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForkedToken_remainingOffersCount_Value_States(), theActivitydiagramTracePackage.getState(), theActivitydiagramTracePackage.getState_ForkedToken_remainingOffersCount_Values(), "states", null, 1, -1, ForkedToken_remainingOffersCount_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityNode_heldTokens_ValueEClass, ActivityNode_heldTokens_Value.class, "ActivityNode_heldTokens_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityNode_heldTokens_Value_HeldTokens(), theActivitydiagramPackage_1.getTracedToken(), null, "heldTokens", null, 0, -1, ActivityNode_heldTokens_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityNode_heldTokens_Value_Parent(), theActivitydiagramPackage_1.getTracedActivityNode(), theActivitydiagramPackage_1.getTracedActivityNode_HeldTokensTrace(), "parent", null, 1, 1, ActivityNode_heldTokens_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityNode_heldTokens_Value_States(), theActivitydiagramTracePackage.getState(), theActivitydiagramTracePackage.getState_ActivityNode_heldTokens_Values(), "states", null, 1, -1, ActivityNode_heldTokens_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerValue_value_ValueEClass, IntegerValue_value_Value.class, "IntegerValue_value_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerValue_value_Value_Value(), ecorePackage.getEInt(), "value", null, 1, 1, IntegerValue_value_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntegerValue_value_Value_Parent(), theActivitydiagramPackage_1.getTracedIntegerValue(), theActivitydiagramPackage_1.getTracedIntegerValue_ValueTrace(), "parent", null, 1, 1, IntegerValue_value_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntegerValue_value_Value_States(), theActivitydiagramTracePackage.getState(), theActivitydiagramTracePackage.getState_IntegerValue_value_Values(), "states", null, 1, -1, IntegerValue_value_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityEdge_offers_ValueEClass, ActivityEdge_offers_Value.class, "ActivityEdge_offers_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityEdge_offers_Value_Offers(), theActivitydiagramPackage_1.getTracedOffer(), null, "offers", null, 0, -1, ActivityEdge_offers_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityEdge_offers_Value_Parent(), theActivitydiagramPackage_1.getTracedActivityEdge(), theActivitydiagramPackage_1.getTracedActivityEdge_OffersTrace(), "parent", null, 1, 1, ActivityEdge_offers_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityEdge_offers_Value_States(), theActivitydiagramTracePackage.getState(), theActivitydiagramTracePackage.getState_ActivityEdge_offers_Values(), "states", null, 1, -1, ActivityEdge_offers_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(offer_offeredTokens_ValueEClass, Offer_offeredTokens_Value.class, "Offer_offeredTokens_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOffer_offeredTokens_Value_OfferedTokens(), theActivitydiagramPackage_1.getTracedToken(), null, "offeredTokens", null, 0, -1, Offer_offeredTokens_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOffer_offeredTokens_Value_Parent(), theActivitydiagramPackage_1.getTracedOffer(), theActivitydiagramPackage_1.getTracedOffer_OfferedTokensTrace(), "parent", null, 1, 1, Offer_offeredTokens_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOffer_offeredTokens_Value_States(), theActivitydiagramTracePackage.getState(), theActivitydiagramTracePackage.getState_Offer_offeredTokens_Values(), "states", null, 1, -1, Offer_offeredTokens_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputValue_value_ValueEClass, InputValue_value_Value.class, "InputValue_value_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputValue_value_Value_Value(), theActivitydiagramPackage_1.getTracedValue(), null, "value", null, 1, 1, InputValue_value_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInputValue_value_Value_Parent(), theActivitydiagramPackage_1.getTracedInputValue(), theActivitydiagramPackage_1.getTracedInputValue_ValueTrace(), "parent", null, 1, 1, InputValue_value_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInputValue_value_Value_States(), theActivitydiagramTracePackage.getState(), theActivitydiagramTracePackage.getState_InputValue_value_Values(), "states", null, 1, -1, InputValue_value_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputValue_variable_ValueEClass, InputValue_variable_Value.class, "InputValue_variable_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputValue_variable_Value_Variable(), theActivitydiagramPackage_1.getTracedVariable(), null, "variable", null, 1, 1, InputValue_variable_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInputValue_variable_Value_Parent(), theActivitydiagramPackage_1.getTracedInputValue(), theActivitydiagramPackage_1.getTracedInputValue_VariableTrace(), "parent", null, 1, 1, InputValue_variable_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInputValue_variable_Value_States(), theActivitydiagramTracePackage.getState(), theActivitydiagramTracePackage.getState_InputValue_variable_Values(), "states", null, 1, -1, InputValue_variable_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variable_currentValue_ValueEClass, Variable_currentValue_Value.class, "Variable_currentValue_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariable_currentValue_Value_CurrentValue(), theActivitydiagramPackage_1.getTracedValue(), null, "currentValue", null, 0, 1, Variable_currentValue_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariable_currentValue_Value_Parent(), theActivitydiagramPackage_1.getTracedVariable(), theActivitydiagramPackage_1.getTracedVariable_CurrentValueTrace(), "parent", null, 1, 1, Variable_currentValue_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariable_currentValue_Value_States(), theActivitydiagramTracePackage.getState(), theActivitydiagramTracePackage.getState_Variable_currentValue_Values(), "states", null, 1, -1, Variable_currentValue_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanValue_value_ValueEClass, BooleanValue_value_Value.class, "BooleanValue_value_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanValue_value_Value_Value(), ecorePackage.getEBoolean(), "value", null, 1, 1, BooleanValue_value_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBooleanValue_value_Value_Parent(), theActivitydiagramPackage_1.getTracedBooleanValue(), theActivitydiagramPackage_1.getTracedBooleanValue_ValueTrace(), "parent", null, 1, 1, BooleanValue_value_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBooleanValue_value_Value_States(), theActivitydiagramTracePackage.getState(), theActivitydiagramTracePackage.getState_BooleanValue_value_Values(), "states", null, 1, -1, BooleanValue_value_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activity_trace_ValueEClass, Activity_trace_Value.class, "Activity_trace_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivity_trace_Value_Trace(), theActivitydiagramPackage_1.getTracedTrace(), null, "trace", null, 0, 1, Activity_trace_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_trace_Value_Parent(), theActivitydiagramPackage_1.getTracedActivity(), theActivitydiagramPackage_1.getTracedActivity_TraceTrace(), "parent", null, 1, 1, Activity_trace_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_trace_Value_States(), theActivitydiagramTracePackage.getState(), theActivitydiagramTracePackage.getState_Activity_trace_Values(), "states", null, 1, -1, Activity_trace_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trace_executedNodes_ValueEClass, Trace_executedNodes_Value.class, "Trace_executedNodes_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrace_executedNodes_Value_ExecutedNodes(), theActivitydiagramPackage_1.getTracedActivityNode(), null, "executedNodes", null, 0, -1, Trace_executedNodes_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrace_executedNodes_Value_Parent(), theActivitydiagramPackage_1.getTracedTrace(), theActivitydiagramPackage_1.getTracedTrace_ExecutedNodesTrace(), "parent", null, 1, 1, Trace_executedNodes_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrace_executedNodes_Value_States(), theActivitydiagramTracePackage.getState(), theActivitydiagramTracePackage.getState_Trace_executedNodes_Values(), "states", null, 1, -1, Trace_executedNodes_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (getActivityNode_heldTokens_Value_HeldTokens(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActivityEdge_offers_Value_Offers(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getVariable_currentValue_Value_CurrentValue(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActivity_trace_Value_Trace(), 
		   source, 
		   new String[] {
		   });
	}

} //ValuesPackageImpl
