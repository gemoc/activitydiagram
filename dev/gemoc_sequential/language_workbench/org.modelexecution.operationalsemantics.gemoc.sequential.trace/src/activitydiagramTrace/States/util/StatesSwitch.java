/**
 */
package activitydiagramTrace.States.util;

import activitydiagramTrace.States.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see activitydiagramTrace.States.StatesPackage
 * @generated
 */
public class StatesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StatesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatesSwitch() {
		if (modelPackage == null) {
			modelPackage = StatesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case StatesPackage.STATE: {
				State state = (State)theEObject;
				T result = caseState(state);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.OFFER_OFFERED_TOKENS_VALUE: {
				Offer_offeredTokens_Value offer_offeredTokens_Value = (Offer_offeredTokens_Value)theEObject;
				T result = caseOffer_offeredTokens_Value(offer_offeredTokens_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.ACTIVITY_EDGE_OFFERS_VALUE: {
				ActivityEdge_offers_Value activityEdge_offers_Value = (ActivityEdge_offers_Value)theEObject;
				T result = caseActivityEdge_offers_Value(activityEdge_offers_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.BOOLEAN_VALUE_VALUE_VALUE: {
				BooleanValue_value_Value booleanValue_value_Value = (BooleanValue_value_Value)theEObject;
				T result = caseBooleanValue_value_Value(booleanValue_value_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.ACTIVITY_NODE_HELD_TOKENS_VALUE: {
				ActivityNode_heldTokens_Value activityNode_heldTokens_Value = (ActivityNode_heldTokens_Value)theEObject;
				T result = caseActivityNode_heldTokens_Value(activityNode_heldTokens_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.INPUT_INPUT_VALUES_VALUE: {
				Input_inputValues_Value input_inputValues_Value = (Input_inputValues_Value)theEObject;
				T result = caseInput_inputValues_Value(input_inputValues_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.INPUT_VALUE_VARIABLE_VALUE: {
				InputValue_variable_Value inputValue_variable_Value = (InputValue_variable_Value)theEObject;
				T result = caseInputValue_variable_Value(inputValue_variable_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.INPUT_VALUE_VALUE_VALUE: {
				InputValue_value_Value inputValue_value_Value = (InputValue_value_Value)theEObject;
				T result = caseInputValue_value_Value(inputValue_value_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.TRACE_EXECUTED_NODES_VALUE: {
				Trace_executedNodes_Value trace_executedNodes_Value = (Trace_executedNodes_Value)theEObject;
				T result = caseTrace_executedNodes_Value(trace_executedNodes_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.ACTIVITY_TRACE_VALUE: {
				Activity_trace_Value activity_trace_Value = (Activity_trace_Value)theEObject;
				T result = caseActivity_trace_Value(activity_trace_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.TOKEN_HOLDER_VALUE: {
				Token_holder_Value token_holder_Value = (Token_holder_Value)theEObject;
				T result = caseToken_holder_Value(token_holder_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.VARIABLE_CURRENT_VALUE_VALUE: {
				Variable_currentValue_Value variable_currentValue_Value = (Variable_currentValue_Value)theEObject;
				T result = caseVariable_currentValue_Value(variable_currentValue_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.INTEGER_VALUE_VALUE_VALUE: {
				IntegerValue_value_Value integerValue_value_Value = (IntegerValue_value_Value)theEObject;
				T result = caseIntegerValue_value_Value(integerValue_value_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.FORKED_TOKEN_BASE_TOKEN_VALUE: {
				ForkedToken_baseToken_Value forkedToken_baseToken_Value = (ForkedToken_baseToken_Value)theEObject;
				T result = caseForkedToken_baseToken_Value(forkedToken_baseToken_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE: {
				ForkedToken_remainingOffersCount_Value forkedToken_remainingOffersCount_Value = (ForkedToken_remainingOffersCount_Value)theEObject;
				T result = caseForkedToken_remainingOffersCount_Value(forkedToken_remainingOffersCount_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseState(State object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Offer offered Tokens Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Offer offered Tokens Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOffer_offeredTokens_Value(Offer_offeredTokens_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Edge offers Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Edge offers Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityEdge_offers_Value(ActivityEdge_offers_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Value value Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Value value Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanValue_value_Value(BooleanValue_value_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Node held Tokens Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Node held Tokens Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityNode_heldTokens_Value(ActivityNode_heldTokens_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input input Values Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input input Values Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInput_inputValues_Value(Input_inputValues_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Value variable Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Value variable Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputValue_variable_Value(InputValue_variable_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Value value Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Value value Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputValue_value_Value(InputValue_value_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trace executed Nodes Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trace executed Nodes Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrace_executedNodes_Value(Trace_executedNodes_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity trace Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity trace Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivity_trace_Value(Activity_trace_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Token holder Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Token holder Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToken_holder_Value(Token_holder_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable current Value Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable current Value Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable_currentValue_Value(Variable_currentValue_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Value value Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Value value Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerValue_value_Value(IntegerValue_value_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Forked Token base Token Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Forked Token base Token Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForkedToken_baseToken_Value(ForkedToken_baseToken_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Forked Token remaining Offers Count Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Forked Token remaining Offers Count Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForkedToken_remainingOffersCount_Value(ForkedToken_remainingOffersCount_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //StatesSwitch
