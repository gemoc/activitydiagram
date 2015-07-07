/**
 */
package activitydiagramTrace.Values.impl;

import activitydiagramTrace.Values.*;

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
public class ValuesFactoryImpl extends EFactoryImpl implements ValuesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ValuesFactory init() {
		try {
			ValuesFactory theValuesFactory = (ValuesFactory)EPackage.Registry.INSTANCE.getEFactory(ValuesPackage.eNS_URI);
			if (theValuesFactory != null) {
				return theValuesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ValuesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuesFactoryImpl() {
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
			case ValuesPackage.INTEGER_VALUE_VALUE_VALUE: return createIntegerValue_value_Value();
			case ValuesPackage.INPUT_INPUT_VALUES_VALUE: return createInput_inputValues_Value();
			case ValuesPackage.BOOLEAN_VALUE_VALUE_VALUE: return createBooleanValue_value_Value();
			case ValuesPackage.TRACE_EXECUTED_NODES_VALUE: return createTrace_executedNodes_Value();
			case ValuesPackage.ACTIVITY_EDGE_OFFERS_VALUE: return createActivityEdge_offers_Value();
			case ValuesPackage.TOKEN_HOLDER_VALUE: return createToken_holder_Value();
			case ValuesPackage.INPUT_VALUE_VALUE_VALUE: return createInputValue_value_Value();
			case ValuesPackage.INPUT_VALUE_VARIABLE_VALUE: return createInputValue_variable_Value();
			case ValuesPackage.FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE: return createForkedToken_remainingOffersCount_Value();
			case ValuesPackage.FORKED_TOKEN_BASE_TOKEN_VALUE: return createForkedToken_baseToken_Value();
			case ValuesPackage.ACTIVITY_NODE_HELD_TOKENS_VALUE: return createActivityNode_heldTokens_Value();
			case ValuesPackage.ACTIVITY_TRACE_VALUE: return createActivity_trace_Value();
			case ValuesPackage.OFFER_OFFERED_TOKENS_VALUE: return createOffer_offeredTokens_Value();
			case ValuesPackage.VARIABLE_CURRENT_VALUE_VALUE: return createVariable_currentValue_Value();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerValue_value_Value createIntegerValue_value_Value() {
		IntegerValue_value_ValueImpl integerValue_value_Value = new IntegerValue_value_ValueImpl();
		return integerValue_value_Value;
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
	public BooleanValue_value_Value createBooleanValue_value_Value() {
		BooleanValue_value_ValueImpl booleanValue_value_Value = new BooleanValue_value_ValueImpl();
		return booleanValue_value_Value;
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
	public ActivityEdge_offers_Value createActivityEdge_offers_Value() {
		ActivityEdge_offers_ValueImpl activityEdge_offers_Value = new ActivityEdge_offers_ValueImpl();
		return activityEdge_offers_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Token_holder_Value createToken_holder_Value() {
		Token_holder_ValueImpl token_holder_Value = new Token_holder_ValueImpl();
		return token_holder_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputValue_value_Value createInputValue_value_Value() {
		InputValue_value_ValueImpl inputValue_value_Value = new InputValue_value_ValueImpl();
		return inputValue_value_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputValue_variable_Value createInputValue_variable_Value() {
		InputValue_variable_ValueImpl inputValue_variable_Value = new InputValue_variable_ValueImpl();
		return inputValue_variable_Value;
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
	public ForkedToken_baseToken_Value createForkedToken_baseToken_Value() {
		ForkedToken_baseToken_ValueImpl forkedToken_baseToken_Value = new ForkedToken_baseToken_ValueImpl();
		return forkedToken_baseToken_Value;
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
	public Activity_trace_Value createActivity_trace_Value() {
		Activity_trace_ValueImpl activity_trace_Value = new Activity_trace_ValueImpl();
		return activity_trace_Value;
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
	public Variable_currentValue_Value createVariable_currentValue_Value() {
		Variable_currentValue_ValueImpl variable_currentValue_Value = new Variable_currentValue_ValueImpl();
		return variable_currentValue_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuesPackage getValuesPackage() {
		return (ValuesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ValuesPackage getPackage() {
		return ValuesPackage.eINSTANCE;
	}

} //ValuesFactoryImpl
