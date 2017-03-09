/**
 */
package activitydiagramTrace.States.impl;

import activitydiagramTrace.ActivitydiagramTracePackage;

import activitydiagramTrace.States.ActivityEdge_offers_Dimension;
import activitydiagramTrace.States.ActivityEdge_offers_Value;
import activitydiagramTrace.States.ActivityNode_heldTokens_Dimension;
import activitydiagramTrace.States.ActivityNode_heldTokens_Value;
import activitydiagramTrace.States.Activity_trace_Dimension;
import activitydiagramTrace.States.Activity_trace_Value;
import activitydiagramTrace.States.DynamicBooleanValue_value_Dimension;
import activitydiagramTrace.States.DynamicBooleanValue_value_Value;
import activitydiagramTrace.States.DynamicIntegerValue_value_Dimension;
import activitydiagramTrace.States.DynamicIntegerValue_value_Value;
import activitydiagramTrace.States.ForkedToken_baseToken_Dimension;
import activitydiagramTrace.States.ForkedToken_baseToken_Value;
import activitydiagramTrace.States.ForkedToken_remainingOffersCount_Dimension;
import activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value;
import activitydiagramTrace.States.Input_inputValues_Dimension;
import activitydiagramTrace.States.Input_inputValues_Value;
import activitydiagramTrace.States.Offer_offeredTokens_Dimension;
import activitydiagramTrace.States.Offer_offeredTokens_Value;
import activitydiagramTrace.States.SpecificAttributeValue;
import activitydiagramTrace.States.SpecificDimension;
import activitydiagramTrace.States.SpecificReferenceValue;
import activitydiagramTrace.States.SpecificState;
import activitydiagramTrace.States.SpecificTracedObject;
import activitydiagramTrace.States.SpecificValue;
import activitydiagramTrace.States.StatesFactory;
import activitydiagramTrace.States.StatesPackage;
import activitydiagramTrace.States.Trace_executedNodes_Dimension;
import activitydiagramTrace.States.Trace_executedNodes_Value;

import activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl;

import activitydiagramTrace.Steps.StepsPackage;

import activitydiagramTrace.Steps.impl.StepsPackageImpl;

import activitydiagramTrace.impl.ActivitydiagramTracePackageImpl;

import fr.inria.diverse.trace.commons.model.trace.TracePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage;

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
	private EClass activityEdge_offers_DimensionEClass = null;

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
	private EClass activityNode_heldTokens_DimensionEClass = null;

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
	private EClass activity_trace_DimensionEClass = null;

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
	private EClass dynamicBooleanValue_value_DimensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dynamicBooleanValue_value_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dynamicIntegerValue_value_DimensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dynamicIntegerValue_value_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forkedToken_baseToken_DimensionEClass = null;

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
	private EClass forkedToken_remainingOffersCount_DimensionEClass = null;

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
	private EClass input_inputValues_DimensionEClass = null;

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
	private EClass offer_offeredTokens_DimensionEClass = null;

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
	private EClass specificAttributeValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificDimensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificReferenceValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificTracedObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trace_executedNodes_DimensionEClass = null;

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
		TracePackage.eINSTANCE.eClass();
		ActivitydiagramPackage.eINSTANCE.eClass();

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
	public EClass getActivityEdge_offers_Dimension() {
		return activityEdge_offers_DimensionEClass;
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
	public EClass getActivityNode_heldTokens_Dimension() {
		return activityNode_heldTokens_DimensionEClass;
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
	public EClass getActivity_trace_Dimension() {
		return activity_trace_DimensionEClass;
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
	public EClass getDynamicBooleanValue_value_Dimension() {
		return dynamicBooleanValue_value_DimensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDynamicBooleanValue_value_Value() {
		return dynamicBooleanValue_value_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicBooleanValue_value_Value_Value() {
		return (EAttribute)dynamicBooleanValue_value_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDynamicIntegerValue_value_Dimension() {
		return dynamicIntegerValue_value_DimensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDynamicIntegerValue_value_Value() {
		return dynamicIntegerValue_value_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicIntegerValue_value_Value_Value() {
		return (EAttribute)dynamicIntegerValue_value_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForkedToken_baseToken_Dimension() {
		return forkedToken_baseToken_DimensionEClass;
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
	public EClass getForkedToken_remainingOffersCount_Dimension() {
		return forkedToken_remainingOffersCount_DimensionEClass;
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
	public EClass getInput_inputValues_Dimension() {
		return input_inputValues_DimensionEClass;
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
	public EClass getOffer_offeredTokens_Dimension() {
		return offer_offeredTokens_DimensionEClass;
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
	public EClass getSpecificAttributeValue() {
		return specificAttributeValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificDimension() {
		return specificDimensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificReferenceValue() {
		return specificReferenceValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificState() {
		return specificStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificTracedObject() {
		return specificTracedObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificValue() {
		return specificValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrace_executedNodes_Dimension() {
		return trace_executedNodes_DimensionEClass;
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
		activityEdge_offers_DimensionEClass = createEClass(ACTIVITY_EDGE_OFFERS_DIMENSION);

		activityEdge_offers_ValueEClass = createEClass(ACTIVITY_EDGE_OFFERS_VALUE);
		createEReference(activityEdge_offers_ValueEClass, ACTIVITY_EDGE_OFFERS_VALUE__OFFERS);

		activityNode_heldTokens_DimensionEClass = createEClass(ACTIVITY_NODE_HELD_TOKENS_DIMENSION);

		activityNode_heldTokens_ValueEClass = createEClass(ACTIVITY_NODE_HELD_TOKENS_VALUE);
		createEReference(activityNode_heldTokens_ValueEClass, ACTIVITY_NODE_HELD_TOKENS_VALUE__HELD_TOKENS);

		activity_trace_DimensionEClass = createEClass(ACTIVITY_TRACE_DIMENSION);

		activity_trace_ValueEClass = createEClass(ACTIVITY_TRACE_VALUE);
		createEReference(activity_trace_ValueEClass, ACTIVITY_TRACE_VALUE__TRACE);

		dynamicBooleanValue_value_DimensionEClass = createEClass(DYNAMIC_BOOLEAN_VALUE_VALUE_DIMENSION);

		dynamicBooleanValue_value_ValueEClass = createEClass(DYNAMIC_BOOLEAN_VALUE_VALUE_VALUE);
		createEAttribute(dynamicBooleanValue_value_ValueEClass, DYNAMIC_BOOLEAN_VALUE_VALUE_VALUE__VALUE);

		dynamicIntegerValue_value_DimensionEClass = createEClass(DYNAMIC_INTEGER_VALUE_VALUE_DIMENSION);

		dynamicIntegerValue_value_ValueEClass = createEClass(DYNAMIC_INTEGER_VALUE_VALUE_VALUE);
		createEAttribute(dynamicIntegerValue_value_ValueEClass, DYNAMIC_INTEGER_VALUE_VALUE_VALUE__VALUE);

		forkedToken_baseToken_DimensionEClass = createEClass(FORKED_TOKEN_BASE_TOKEN_DIMENSION);

		forkedToken_baseToken_ValueEClass = createEClass(FORKED_TOKEN_BASE_TOKEN_VALUE);
		createEReference(forkedToken_baseToken_ValueEClass, FORKED_TOKEN_BASE_TOKEN_VALUE__BASE_TOKEN);

		forkedToken_remainingOffersCount_DimensionEClass = createEClass(FORKED_TOKEN_REMAINING_OFFERS_COUNT_DIMENSION);

		forkedToken_remainingOffersCount_ValueEClass = createEClass(FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE);
		createEAttribute(forkedToken_remainingOffersCount_ValueEClass, FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE__REMAINING_OFFERS_COUNT);

		input_inputValues_DimensionEClass = createEClass(INPUT_INPUT_VALUES_DIMENSION);

		input_inputValues_ValueEClass = createEClass(INPUT_INPUT_VALUES_VALUE);
		createEReference(input_inputValues_ValueEClass, INPUT_INPUT_VALUES_VALUE__INPUT_VALUES);

		offer_offeredTokens_DimensionEClass = createEClass(OFFER_OFFERED_TOKENS_DIMENSION);

		offer_offeredTokens_ValueEClass = createEClass(OFFER_OFFERED_TOKENS_VALUE);
		createEReference(offer_offeredTokens_ValueEClass, OFFER_OFFERED_TOKENS_VALUE__OFFERED_TOKENS);

		specificAttributeValueEClass = createEClass(SPECIFIC_ATTRIBUTE_VALUE);

		specificDimensionEClass = createEClass(SPECIFIC_DIMENSION);

		specificReferenceValueEClass = createEClass(SPECIFIC_REFERENCE_VALUE);

		specificStateEClass = createEClass(SPECIFIC_STATE);

		specificTracedObjectEClass = createEClass(SPECIFIC_TRACED_OBJECT);

		specificValueEClass = createEClass(SPECIFIC_VALUE);

		trace_executedNodes_DimensionEClass = createEClass(TRACE_EXECUTED_NODES_DIMENSION);

		trace_executedNodes_ValueEClass = createEClass(TRACE_EXECUTED_NODES_VALUE);
		createEReference(trace_executedNodes_ValueEClass, TRACE_EXECUTED_NODES_VALUE__EXECUTED_NODES);
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
		TracePackage theTracePackage = (TracePackage)EPackage.Registry.INSTANCE.getEPackage(TracePackage.eNS_URI);
		StepsPackage theStepsPackage = (StepsPackage)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theActivitydiagramPackage_1);

		// Create type parameters
		ETypeParameter specificDimensionEClass_ValueSubType = addETypeParameter(specificDimensionEClass, "ValueSubType");
		addETypeParameter(specificReferenceValueEClass, "T");
		ETypeParameter specificTracedObjectEClass_DimensionSubType = addETypeParameter(specificTracedObjectEClass, "DimensionSubType");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getSpecificValue());
		specificDimensionEClass_ValueSubType.getEBounds().add(g1);
		g1 = createEGenericType(this.getSpecificDimension());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType(this.getSpecificValue());
		g2.setEUpperBound(g3);
		specificTracedObjectEClass_DimensionSubType.getEBounds().add(g1);

		// Add supertypes to classes
		g1 = createEGenericType(this.getSpecificDimension());
		g2 = createEGenericType(this.getActivityEdge_offers_Value());
		g1.getETypeArguments().add(g2);
		activityEdge_offers_DimensionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificReferenceValue());
		g2 = createEGenericType(theActivitydiagramPackage_1.getTracedOffer());
		g1.getETypeArguments().add(g2);
		activityEdge_offers_ValueEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificDimension());
		g2 = createEGenericType(this.getActivityNode_heldTokens_Value());
		g1.getETypeArguments().add(g2);
		activityNode_heldTokens_DimensionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificReferenceValue());
		g2 = createEGenericType(theActivitydiagramPackage_1.getTracedToken());
		g1.getETypeArguments().add(g2);
		activityNode_heldTokens_ValueEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificDimension());
		g2 = createEGenericType(this.getActivity_trace_Value());
		g1.getETypeArguments().add(g2);
		activity_trace_DimensionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificReferenceValue());
		g2 = createEGenericType(theActivitydiagramPackage_1.getTracedTrace());
		g1.getETypeArguments().add(g2);
		activity_trace_ValueEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificDimension());
		g2 = createEGenericType(this.getDynamicBooleanValue_value_Value());
		g1.getETypeArguments().add(g2);
		dynamicBooleanValue_value_DimensionEClass.getEGenericSuperTypes().add(g1);
		dynamicBooleanValue_value_ValueEClass.getESuperTypes().add(this.getSpecificAttributeValue());
		g1 = createEGenericType(this.getSpecificDimension());
		g2 = createEGenericType(this.getDynamicIntegerValue_value_Value());
		g1.getETypeArguments().add(g2);
		dynamicIntegerValue_value_DimensionEClass.getEGenericSuperTypes().add(g1);
		dynamicIntegerValue_value_ValueEClass.getESuperTypes().add(this.getSpecificAttributeValue());
		g1 = createEGenericType(this.getSpecificDimension());
		g2 = createEGenericType(this.getForkedToken_baseToken_Value());
		g1.getETypeArguments().add(g2);
		forkedToken_baseToken_DimensionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificReferenceValue());
		g2 = createEGenericType(theActivitydiagramPackage_1.getTracedToken());
		g1.getETypeArguments().add(g2);
		forkedToken_baseToken_ValueEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificDimension());
		g2 = createEGenericType(this.getForkedToken_remainingOffersCount_Value());
		g1.getETypeArguments().add(g2);
		forkedToken_remainingOffersCount_DimensionEClass.getEGenericSuperTypes().add(g1);
		forkedToken_remainingOffersCount_ValueEClass.getESuperTypes().add(this.getSpecificAttributeValue());
		g1 = createEGenericType(this.getSpecificDimension());
		g2 = createEGenericType(this.getInput_inputValues_Value());
		g1.getETypeArguments().add(g2);
		input_inputValues_DimensionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificReferenceValue());
		g2 = createEGenericType(theActivitydiagramPackage_1.getTracedInputValue());
		g1.getETypeArguments().add(g2);
		input_inputValues_ValueEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificDimension());
		g2 = createEGenericType(this.getOffer_offeredTokens_Value());
		g1.getETypeArguments().add(g2);
		offer_offeredTokens_DimensionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificReferenceValue());
		g2 = createEGenericType(theActivitydiagramPackage_1.getTracedToken());
		g1.getETypeArguments().add(g2);
		offer_offeredTokens_ValueEClass.getEGenericSuperTypes().add(g1);
		specificAttributeValueEClass.getESuperTypes().add(this.getSpecificValue());
		g1 = createEGenericType(theTracePackage.getDimension());
		g2 = createEGenericType(specificDimensionEClass_ValueSubType);
		g1.getETypeArguments().add(g2);
		specificDimensionEClass.getEGenericSuperTypes().add(g1);
		specificReferenceValueEClass.getESuperTypes().add(this.getSpecificValue());
		g1 = createEGenericType(theTracePackage.getState());
		g2 = createEGenericType(theStepsPackage.getSpecificStep());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getSpecificValue());
		g1.getETypeArguments().add(g2);
		specificStateEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getTracedObject());
		g2 = createEGenericType(specificTracedObjectEClass_DimensionSubType);
		g1.getETypeArguments().add(g2);
		specificTracedObjectEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getValue());
		g2 = createEGenericType(this.getSpecificState());
		g1.getETypeArguments().add(g2);
		specificValueEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificDimension());
		g2 = createEGenericType(this.getTrace_executedNodes_Value());
		g1.getETypeArguments().add(g2);
		trace_executedNodes_DimensionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificReferenceValue());
		g2 = createEGenericType(theActivitydiagramPackage_1.getTracedActivityNode());
		g1.getETypeArguments().add(g2);
		trace_executedNodes_ValueEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(activityEdge_offers_DimensionEClass, ActivityEdge_offers_Dimension.class, "ActivityEdge_offers_Dimension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activityEdge_offers_ValueEClass, ActivityEdge_offers_Value.class, "ActivityEdge_offers_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityEdge_offers_Value_Offers(), theActivitydiagramPackage_1.getTracedOffer(), null, "offers", null, 0, -1, ActivityEdge_offers_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityNode_heldTokens_DimensionEClass, ActivityNode_heldTokens_Dimension.class, "ActivityNode_heldTokens_Dimension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activityNode_heldTokens_ValueEClass, ActivityNode_heldTokens_Value.class, "ActivityNode_heldTokens_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityNode_heldTokens_Value_HeldTokens(), theActivitydiagramPackage_1.getTracedToken(), null, "heldTokens", null, 0, -1, ActivityNode_heldTokens_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activity_trace_DimensionEClass, Activity_trace_Dimension.class, "Activity_trace_Dimension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activity_trace_ValueEClass, Activity_trace_Value.class, "Activity_trace_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivity_trace_Value_Trace(), theActivitydiagramPackage_1.getTracedTrace(), null, "trace", null, 0, 1, Activity_trace_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dynamicBooleanValue_value_DimensionEClass, DynamicBooleanValue_value_Dimension.class, "DynamicBooleanValue_value_Dimension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dynamicBooleanValue_value_ValueEClass, DynamicBooleanValue_value_Value.class, "DynamicBooleanValue_value_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDynamicBooleanValue_value_Value_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, DynamicBooleanValue_value_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dynamicIntegerValue_value_DimensionEClass, DynamicIntegerValue_value_Dimension.class, "DynamicIntegerValue_value_Dimension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dynamicIntegerValue_value_ValueEClass, DynamicIntegerValue_value_Value.class, "DynamicIntegerValue_value_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDynamicIntegerValue_value_Value_Value(), ecorePackage.getEInt(), "value", null, 0, 1, DynamicIntegerValue_value_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forkedToken_baseToken_DimensionEClass, ForkedToken_baseToken_Dimension.class, "ForkedToken_baseToken_Dimension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(forkedToken_baseToken_ValueEClass, ForkedToken_baseToken_Value.class, "ForkedToken_baseToken_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForkedToken_baseToken_Value_BaseToken(), theActivitydiagramPackage_1.getTracedToken(), null, "baseToken", null, 0, 1, ForkedToken_baseToken_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forkedToken_remainingOffersCount_DimensionEClass, ForkedToken_remainingOffersCount_Dimension.class, "ForkedToken_remainingOffersCount_Dimension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(forkedToken_remainingOffersCount_ValueEClass, ForkedToken_remainingOffersCount_Value.class, "ForkedToken_remainingOffersCount_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getForkedToken_remainingOffersCount_Value_RemainingOffersCount(), ecorePackage.getEInt(), "remainingOffersCount", null, 0, 1, ForkedToken_remainingOffersCount_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(input_inputValues_DimensionEClass, Input_inputValues_Dimension.class, "Input_inputValues_Dimension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(input_inputValues_ValueEClass, Input_inputValues_Value.class, "Input_inputValues_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInput_inputValues_Value_InputValues(), theActivitydiagramPackage_1.getTracedInputValue(), null, "inputValues", null, 0, -1, Input_inputValues_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(offer_offeredTokens_DimensionEClass, Offer_offeredTokens_Dimension.class, "Offer_offeredTokens_Dimension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(offer_offeredTokens_ValueEClass, Offer_offeredTokens_Value.class, "Offer_offeredTokens_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOffer_offeredTokens_Value_OfferedTokens(), theActivitydiagramPackage_1.getTracedToken(), null, "offeredTokens", null, 0, -1, Offer_offeredTokens_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specificAttributeValueEClass, SpecificAttributeValue.class, "SpecificAttributeValue", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(specificDimensionEClass, SpecificDimension.class, "SpecificDimension", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(specificReferenceValueEClass, SpecificReferenceValue.class, "SpecificReferenceValue", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(specificStateEClass, SpecificState.class, "SpecificState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(specificTracedObjectEClass, SpecificTracedObject.class, "SpecificTracedObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(specificValueEClass, SpecificValue.class, "SpecificValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(trace_executedNodes_DimensionEClass, Trace_executedNodes_Dimension.class, "Trace_executedNodes_Dimension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(trace_executedNodes_ValueEClass, Trace_executedNodes_Value.class, "Trace_executedNodes_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrace_executedNodes_Value_ExecutedNodes(), theActivitydiagramPackage_1.getTracedActivityNode(), null, "executedNodes", null, 0, -1, Trace_executedNodes_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create annotations
		// http://www.modelexecution.org/trace/XMOF
		createXMOFAnnotations();
		// aspect
		createAspectAnnotations();
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
		  (activityNode_heldTokens_ValueEClass, 
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
		  (dynamicBooleanValue_value_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (dynamicIntegerValue_value_ValueEClass, 
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
		  (input_inputValues_ValueEClass, 
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
		  (trace_executedNodes_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });
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
		  (getDynamicBooleanValue_value_Value_Value(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getDynamicIntegerValue_value_Value_Value(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getForkedToken_baseToken_Value_BaseToken(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getForkedToken_remainingOffersCount_Value_RemainingOffersCount(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInput_inputValues_Value_InputValues(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getOffer_offeredTokens_Value_OfferedTokens(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getTrace_executedNodes_Value_ExecutedNodes(), 
		   source, 
		   new String[] {
		   });
	}

} //StatesPackageImpl
