/**
 */
package activitydiagramTrace.States.impl;

import activitydiagramTrace.States.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StatesFactoryImpl extends EFactoryImpl implements StatesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StatesFactory init() {
		try {
			StatesFactory theStatesFactory = (StatesFactory)EPackage.Registry.INSTANCE.getEFactory(StatesPackage.eNS_URI);
			if (theStatesFactory != null) {
				return theStatesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StatesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case StatesPackage.ACTIVITY_EDGE_OFFERS_DIMENSION: return createActivityEdge_offers_Dimension();
			case StatesPackage.ACTIVITY_EDGE_OFFERS_VALUE: return createActivityEdge_offers_Value();
			case StatesPackage.ACTIVITY_NODE_HELD_TOKENS_DIMENSION: return createActivityNode_heldTokens_Dimension();
			case StatesPackage.ACTIVITY_NODE_HELD_TOKENS_VALUE: return createActivityNode_heldTokens_Value();
			case StatesPackage.ACTIVITY_TRACE_DIMENSION: return createActivity_trace_Dimension();
			case StatesPackage.ACTIVITY_TRACE_VALUE: return createActivity_trace_Value();
			case StatesPackage.DYNAMIC_BOOLEAN_VALUE_VALUE_DIMENSION: return createDynamicBooleanValue_value_Dimension();
			case StatesPackage.DYNAMIC_BOOLEAN_VALUE_VALUE_VALUE: return createDynamicBooleanValue_value_Value();
			case StatesPackage.DYNAMIC_INTEGER_VALUE_VALUE_DIMENSION: return createDynamicIntegerValue_value_Dimension();
			case StatesPackage.DYNAMIC_INTEGER_VALUE_VALUE_VALUE: return createDynamicIntegerValue_value_Value();
			case StatesPackage.FORKED_TOKEN_BASE_TOKEN_DIMENSION: return createForkedToken_baseToken_Dimension();
			case StatesPackage.FORKED_TOKEN_BASE_TOKEN_VALUE: return createForkedToken_baseToken_Value();
			case StatesPackage.FORKED_TOKEN_REMAINING_OFFERS_COUNT_DIMENSION: return createForkedToken_remainingOffersCount_Dimension();
			case StatesPackage.FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE: return createForkedToken_remainingOffersCount_Value();
			case StatesPackage.INPUT_INPUT_VALUES_DIMENSION: return createInput_inputValues_Dimension();
			case StatesPackage.INPUT_INPUT_VALUES_VALUE: return createInput_inputValues_Value();
			case StatesPackage.OFFER_OFFERED_TOKENS_DIMENSION: return createOffer_offeredTokens_Dimension();
			case StatesPackage.OFFER_OFFERED_TOKENS_VALUE: return createOffer_offeredTokens_Value();
			case StatesPackage.SPECIFIC_STATE: return createSpecificState();
			case StatesPackage.TRACE_EXECUTED_NODES_DIMENSION: return createTrace_executedNodes_Dimension();
			case StatesPackage.TRACE_EXECUTED_NODES_VALUE: return createTrace_executedNodes_Value();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdge_offers_Dimension createActivityEdge_offers_Dimension() {
		ActivityEdge_offers_DimensionImpl activityEdge_offers_Dimension = new ActivityEdge_offers_DimensionImpl();
		return activityEdge_offers_Dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdge_offers_Value createActivityEdge_offers_Value() {
		ActivityEdge_offers_ValueImpl activityEdge_offers_Value = new ActivityEdge_offers_ValueImpl();
		return activityEdge_offers_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode_heldTokens_Dimension createActivityNode_heldTokens_Dimension() {
		ActivityNode_heldTokens_DimensionImpl activityNode_heldTokens_Dimension = new ActivityNode_heldTokens_DimensionImpl();
		return activityNode_heldTokens_Dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode_heldTokens_Value createActivityNode_heldTokens_Value() {
		ActivityNode_heldTokens_ValueImpl activityNode_heldTokens_Value = new ActivityNode_heldTokens_ValueImpl();
		return activityNode_heldTokens_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity_trace_Dimension createActivity_trace_Dimension() {
		Activity_trace_DimensionImpl activity_trace_Dimension = new Activity_trace_DimensionImpl();
		return activity_trace_Dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity_trace_Value createActivity_trace_Value() {
		Activity_trace_ValueImpl activity_trace_Value = new Activity_trace_ValueImpl();
		return activity_trace_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicBooleanValue_value_Dimension createDynamicBooleanValue_value_Dimension() {
		DynamicBooleanValue_value_DimensionImpl dynamicBooleanValue_value_Dimension = new DynamicBooleanValue_value_DimensionImpl();
		return dynamicBooleanValue_value_Dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicBooleanValue_value_Value createDynamicBooleanValue_value_Value() {
		DynamicBooleanValue_value_ValueImpl dynamicBooleanValue_value_Value = new DynamicBooleanValue_value_ValueImpl();
		return dynamicBooleanValue_value_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicIntegerValue_value_Dimension createDynamicIntegerValue_value_Dimension() {
		DynamicIntegerValue_value_DimensionImpl dynamicIntegerValue_value_Dimension = new DynamicIntegerValue_value_DimensionImpl();
		return dynamicIntegerValue_value_Dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicIntegerValue_value_Value createDynamicIntegerValue_value_Value() {
		DynamicIntegerValue_value_ValueImpl dynamicIntegerValue_value_Value = new DynamicIntegerValue_value_ValueImpl();
		return dynamicIntegerValue_value_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForkedToken_baseToken_Dimension createForkedToken_baseToken_Dimension() {
		ForkedToken_baseToken_DimensionImpl forkedToken_baseToken_Dimension = new ForkedToken_baseToken_DimensionImpl();
		return forkedToken_baseToken_Dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForkedToken_baseToken_Value createForkedToken_baseToken_Value() {
		ForkedToken_baseToken_ValueImpl forkedToken_baseToken_Value = new ForkedToken_baseToken_ValueImpl();
		return forkedToken_baseToken_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForkedToken_remainingOffersCount_Dimension createForkedToken_remainingOffersCount_Dimension() {
		ForkedToken_remainingOffersCount_DimensionImpl forkedToken_remainingOffersCount_Dimension = new ForkedToken_remainingOffersCount_DimensionImpl();
		return forkedToken_remainingOffersCount_Dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForkedToken_remainingOffersCount_Value createForkedToken_remainingOffersCount_Value() {
		ForkedToken_remainingOffersCount_ValueImpl forkedToken_remainingOffersCount_Value = new ForkedToken_remainingOffersCount_ValueImpl();
		return forkedToken_remainingOffersCount_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input_inputValues_Dimension createInput_inputValues_Dimension() {
		Input_inputValues_DimensionImpl input_inputValues_Dimension = new Input_inputValues_DimensionImpl();
		return input_inputValues_Dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input_inputValues_Value createInput_inputValues_Value() {
		Input_inputValues_ValueImpl input_inputValues_Value = new Input_inputValues_ValueImpl();
		return input_inputValues_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Offer_offeredTokens_Dimension createOffer_offeredTokens_Dimension() {
		Offer_offeredTokens_DimensionImpl offer_offeredTokens_Dimension = new Offer_offeredTokens_DimensionImpl();
		return offer_offeredTokens_Dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Offer_offeredTokens_Value createOffer_offeredTokens_Value() {
		Offer_offeredTokens_ValueImpl offer_offeredTokens_Value = new Offer_offeredTokens_ValueImpl();
		return offer_offeredTokens_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificState createSpecificState() {
		SpecificStateImpl specificState = new SpecificStateImpl();
		return specificState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trace_executedNodes_Dimension createTrace_executedNodes_Dimension() {
		Trace_executedNodes_DimensionImpl trace_executedNodes_Dimension = new Trace_executedNodes_DimensionImpl();
		return trace_executedNodes_Dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trace_executedNodes_Value createTrace_executedNodes_Value() {
		Trace_executedNodes_ValueImpl trace_executedNodes_Value = new Trace_executedNodes_ValueImpl();
		return trace_executedNodes_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatesPackage getStatesPackage() {
		return (StatesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StatesPackage getPackage() {
		return StatesPackage.eINSTANCE;
	}

} //StatesFactoryImpl
