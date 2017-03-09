/**
 */
package activitydiagramTrace.States.util;

import activitydiagramTrace.States.*;

import fr.inria.diverse.trace.commons.model.trace.Dimension;
import fr.inria.diverse.trace.commons.model.trace.State;
import fr.inria.diverse.trace.commons.model.trace.Step;
import fr.inria.diverse.trace.commons.model.trace.TracedObject;
import fr.inria.diverse.trace.commons.model.trace.Value;

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
public class StatesSwitch<T1> extends Switch<T1> {
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
	 * @param ePackage the package in question.
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
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case StatesPackage.ACTIVITY_EDGE_OFFERS_DIMENSION: {
				ActivityEdge_offers_Dimension activityEdge_offers_Dimension = (ActivityEdge_offers_Dimension)theEObject;
				T1 result = caseActivityEdge_offers_Dimension(activityEdge_offers_Dimension);
				if (result == null) result = caseSpecificDimension(activityEdge_offers_Dimension);
				if (result == null) result = caseDimension(activityEdge_offers_Dimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.ACTIVITY_EDGE_OFFERS_VALUE: {
				ActivityEdge_offers_Value activityEdge_offers_Value = (ActivityEdge_offers_Value)theEObject;
				T1 result = caseActivityEdge_offers_Value(activityEdge_offers_Value);
				if (result == null) result = caseSpecificReferenceValue(activityEdge_offers_Value);
				if (result == null) result = caseSpecificValue(activityEdge_offers_Value);
				if (result == null) result = caseValue(activityEdge_offers_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.ACTIVITY_NODE_HELD_TOKENS_DIMENSION: {
				ActivityNode_heldTokens_Dimension activityNode_heldTokens_Dimension = (ActivityNode_heldTokens_Dimension)theEObject;
				T1 result = caseActivityNode_heldTokens_Dimension(activityNode_heldTokens_Dimension);
				if (result == null) result = caseSpecificDimension(activityNode_heldTokens_Dimension);
				if (result == null) result = caseDimension(activityNode_heldTokens_Dimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.ACTIVITY_NODE_HELD_TOKENS_VALUE: {
				ActivityNode_heldTokens_Value activityNode_heldTokens_Value = (ActivityNode_heldTokens_Value)theEObject;
				T1 result = caseActivityNode_heldTokens_Value(activityNode_heldTokens_Value);
				if (result == null) result = caseSpecificReferenceValue(activityNode_heldTokens_Value);
				if (result == null) result = caseSpecificValue(activityNode_heldTokens_Value);
				if (result == null) result = caseValue(activityNode_heldTokens_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.ACTIVITY_TRACE_DIMENSION: {
				Activity_trace_Dimension activity_trace_Dimension = (Activity_trace_Dimension)theEObject;
				T1 result = caseActivity_trace_Dimension(activity_trace_Dimension);
				if (result == null) result = caseSpecificDimension(activity_trace_Dimension);
				if (result == null) result = caseDimension(activity_trace_Dimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.ACTIVITY_TRACE_VALUE: {
				Activity_trace_Value activity_trace_Value = (Activity_trace_Value)theEObject;
				T1 result = caseActivity_trace_Value(activity_trace_Value);
				if (result == null) result = caseSpecificReferenceValue(activity_trace_Value);
				if (result == null) result = caseSpecificValue(activity_trace_Value);
				if (result == null) result = caseValue(activity_trace_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.DYNAMIC_BOOLEAN_VALUE_VALUE_DIMENSION: {
				DynamicBooleanValue_value_Dimension dynamicBooleanValue_value_Dimension = (DynamicBooleanValue_value_Dimension)theEObject;
				T1 result = caseDynamicBooleanValue_value_Dimension(dynamicBooleanValue_value_Dimension);
				if (result == null) result = caseSpecificDimension(dynamicBooleanValue_value_Dimension);
				if (result == null) result = caseDimension(dynamicBooleanValue_value_Dimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.DYNAMIC_BOOLEAN_VALUE_VALUE_VALUE: {
				DynamicBooleanValue_value_Value dynamicBooleanValue_value_Value = (DynamicBooleanValue_value_Value)theEObject;
				T1 result = caseDynamicBooleanValue_value_Value(dynamicBooleanValue_value_Value);
				if (result == null) result = caseSpecificAttributeValue(dynamicBooleanValue_value_Value);
				if (result == null) result = caseSpecificValue(dynamicBooleanValue_value_Value);
				if (result == null) result = caseValue(dynamicBooleanValue_value_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.DYNAMIC_INTEGER_VALUE_VALUE_DIMENSION: {
				DynamicIntegerValue_value_Dimension dynamicIntegerValue_value_Dimension = (DynamicIntegerValue_value_Dimension)theEObject;
				T1 result = caseDynamicIntegerValue_value_Dimension(dynamicIntegerValue_value_Dimension);
				if (result == null) result = caseSpecificDimension(dynamicIntegerValue_value_Dimension);
				if (result == null) result = caseDimension(dynamicIntegerValue_value_Dimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.DYNAMIC_INTEGER_VALUE_VALUE_VALUE: {
				DynamicIntegerValue_value_Value dynamicIntegerValue_value_Value = (DynamicIntegerValue_value_Value)theEObject;
				T1 result = caseDynamicIntegerValue_value_Value(dynamicIntegerValue_value_Value);
				if (result == null) result = caseSpecificAttributeValue(dynamicIntegerValue_value_Value);
				if (result == null) result = caseSpecificValue(dynamicIntegerValue_value_Value);
				if (result == null) result = caseValue(dynamicIntegerValue_value_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.FORKED_TOKEN_BASE_TOKEN_DIMENSION: {
				ForkedToken_baseToken_Dimension forkedToken_baseToken_Dimension = (ForkedToken_baseToken_Dimension)theEObject;
				T1 result = caseForkedToken_baseToken_Dimension(forkedToken_baseToken_Dimension);
				if (result == null) result = caseSpecificDimension(forkedToken_baseToken_Dimension);
				if (result == null) result = caseDimension(forkedToken_baseToken_Dimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.FORKED_TOKEN_BASE_TOKEN_VALUE: {
				ForkedToken_baseToken_Value forkedToken_baseToken_Value = (ForkedToken_baseToken_Value)theEObject;
				T1 result = caseForkedToken_baseToken_Value(forkedToken_baseToken_Value);
				if (result == null) result = caseSpecificReferenceValue(forkedToken_baseToken_Value);
				if (result == null) result = caseSpecificValue(forkedToken_baseToken_Value);
				if (result == null) result = caseValue(forkedToken_baseToken_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.FORKED_TOKEN_REMAINING_OFFERS_COUNT_DIMENSION: {
				ForkedToken_remainingOffersCount_Dimension forkedToken_remainingOffersCount_Dimension = (ForkedToken_remainingOffersCount_Dimension)theEObject;
				T1 result = caseForkedToken_remainingOffersCount_Dimension(forkedToken_remainingOffersCount_Dimension);
				if (result == null) result = caseSpecificDimension(forkedToken_remainingOffersCount_Dimension);
				if (result == null) result = caseDimension(forkedToken_remainingOffersCount_Dimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE: {
				ForkedToken_remainingOffersCount_Value forkedToken_remainingOffersCount_Value = (ForkedToken_remainingOffersCount_Value)theEObject;
				T1 result = caseForkedToken_remainingOffersCount_Value(forkedToken_remainingOffersCount_Value);
				if (result == null) result = caseSpecificAttributeValue(forkedToken_remainingOffersCount_Value);
				if (result == null) result = caseSpecificValue(forkedToken_remainingOffersCount_Value);
				if (result == null) result = caseValue(forkedToken_remainingOffersCount_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.INPUT_INPUT_VALUES_DIMENSION: {
				Input_inputValues_Dimension input_inputValues_Dimension = (Input_inputValues_Dimension)theEObject;
				T1 result = caseInput_inputValues_Dimension(input_inputValues_Dimension);
				if (result == null) result = caseSpecificDimension(input_inputValues_Dimension);
				if (result == null) result = caseDimension(input_inputValues_Dimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.INPUT_INPUT_VALUES_VALUE: {
				Input_inputValues_Value input_inputValues_Value = (Input_inputValues_Value)theEObject;
				T1 result = caseInput_inputValues_Value(input_inputValues_Value);
				if (result == null) result = caseSpecificReferenceValue(input_inputValues_Value);
				if (result == null) result = caseSpecificValue(input_inputValues_Value);
				if (result == null) result = caseValue(input_inputValues_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.OFFER_OFFERED_TOKENS_DIMENSION: {
				Offer_offeredTokens_Dimension offer_offeredTokens_Dimension = (Offer_offeredTokens_Dimension)theEObject;
				T1 result = caseOffer_offeredTokens_Dimension(offer_offeredTokens_Dimension);
				if (result == null) result = caseSpecificDimension(offer_offeredTokens_Dimension);
				if (result == null) result = caseDimension(offer_offeredTokens_Dimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.OFFER_OFFERED_TOKENS_VALUE: {
				Offer_offeredTokens_Value offer_offeredTokens_Value = (Offer_offeredTokens_Value)theEObject;
				T1 result = caseOffer_offeredTokens_Value(offer_offeredTokens_Value);
				if (result == null) result = caseSpecificReferenceValue(offer_offeredTokens_Value);
				if (result == null) result = caseSpecificValue(offer_offeredTokens_Value);
				if (result == null) result = caseValue(offer_offeredTokens_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.SPECIFIC_ATTRIBUTE_VALUE: {
				SpecificAttributeValue specificAttributeValue = (SpecificAttributeValue)theEObject;
				T1 result = caseSpecificAttributeValue(specificAttributeValue);
				if (result == null) result = caseSpecificValue(specificAttributeValue);
				if (result == null) result = caseValue(specificAttributeValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.SPECIFIC_DIMENSION: {
				SpecificDimension<?> specificDimension = (SpecificDimension<?>)theEObject;
				T1 result = caseSpecificDimension(specificDimension);
				if (result == null) result = caseDimension(specificDimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.SPECIFIC_REFERENCE_VALUE: {
				SpecificReferenceValue<?> specificReferenceValue = (SpecificReferenceValue<?>)theEObject;
				T1 result = caseSpecificReferenceValue(specificReferenceValue);
				if (result == null) result = caseSpecificValue(specificReferenceValue);
				if (result == null) result = caseValue(specificReferenceValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.SPECIFIC_STATE: {
				SpecificState specificState = (SpecificState)theEObject;
				T1 result = caseSpecificState(specificState);
				if (result == null) result = caseState(specificState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.SPECIFIC_TRACED_OBJECT: {
				SpecificTracedObject<?> specificTracedObject = (SpecificTracedObject<?>)theEObject;
				T1 result = caseSpecificTracedObject(specificTracedObject);
				if (result == null) result = caseTracedObject(specificTracedObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.SPECIFIC_VALUE: {
				SpecificValue specificValue = (SpecificValue)theEObject;
				T1 result = caseSpecificValue(specificValue);
				if (result == null) result = caseValue(specificValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.TRACE_EXECUTED_NODES_DIMENSION: {
				Trace_executedNodes_Dimension trace_executedNodes_Dimension = (Trace_executedNodes_Dimension)theEObject;
				T1 result = caseTrace_executedNodes_Dimension(trace_executedNodes_Dimension);
				if (result == null) result = caseSpecificDimension(trace_executedNodes_Dimension);
				if (result == null) result = caseDimension(trace_executedNodes_Dimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.TRACE_EXECUTED_NODES_VALUE: {
				Trace_executedNodes_Value trace_executedNodes_Value = (Trace_executedNodes_Value)theEObject;
				T1 result = caseTrace_executedNodes_Value(trace_executedNodes_Value);
				if (result == null) result = caseSpecificReferenceValue(trace_executedNodes_Value);
				if (result == null) result = caseSpecificValue(trace_executedNodes_Value);
				if (result == null) result = caseValue(trace_executedNodes_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Edge offers Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Edge offers Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseActivityEdge_offers_Dimension(ActivityEdge_offers_Dimension object) {
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
	public T1 caseActivityEdge_offers_Value(ActivityEdge_offers_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Node held Tokens Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Node held Tokens Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseActivityNode_heldTokens_Dimension(ActivityNode_heldTokens_Dimension object) {
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
	public T1 caseActivityNode_heldTokens_Value(ActivityNode_heldTokens_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity trace Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity trace Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseActivity_trace_Dimension(Activity_trace_Dimension object) {
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
	public T1 caseActivity_trace_Value(Activity_trace_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dynamic Boolean Value value Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dynamic Boolean Value value Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDynamicBooleanValue_value_Dimension(DynamicBooleanValue_value_Dimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dynamic Boolean Value value Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dynamic Boolean Value value Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDynamicBooleanValue_value_Value(DynamicBooleanValue_value_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dynamic Integer Value value Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dynamic Integer Value value Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDynamicIntegerValue_value_Dimension(DynamicIntegerValue_value_Dimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dynamic Integer Value value Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dynamic Integer Value value Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDynamicIntegerValue_value_Value(DynamicIntegerValue_value_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Forked Token base Token Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Forked Token base Token Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseForkedToken_baseToken_Dimension(ForkedToken_baseToken_Dimension object) {
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
	public T1 caseForkedToken_baseToken_Value(ForkedToken_baseToken_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Forked Token remaining Offers Count Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Forked Token remaining Offers Count Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseForkedToken_remainingOffersCount_Dimension(ForkedToken_remainingOffersCount_Dimension object) {
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
	public T1 caseForkedToken_remainingOffersCount_Value(ForkedToken_remainingOffersCount_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input input Values Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input input Values Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseInput_inputValues_Dimension(Input_inputValues_Dimension object) {
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
	public T1 caseInput_inputValues_Value(Input_inputValues_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Offer offered Tokens Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Offer offered Tokens Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseOffer_offeredTokens_Dimension(Offer_offeredTokens_Dimension object) {
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
	public T1 caseOffer_offeredTokens_Value(Offer_offeredTokens_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specific Attribute Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specific Attribute Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSpecificAttributeValue(SpecificAttributeValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specific Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specific Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <ValueSubType extends SpecificValue> T1 caseSpecificDimension(SpecificDimension<ValueSubType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specific Reference Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specific Reference Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseSpecificReferenceValue(SpecificReferenceValue<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specific State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specific State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSpecificState(SpecificState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specific Traced Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specific Traced Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <DimensionSubType extends SpecificDimension<? extends SpecificValue>> T1 caseSpecificTracedObject(SpecificTracedObject<DimensionSubType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specific Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specific Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSpecificValue(SpecificValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trace executed Nodes Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trace executed Nodes Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTrace_executedNodes_Dimension(Trace_executedNodes_Dimension object) {
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
	public T1 caseTrace_executedNodes_Value(Trace_executedNodes_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <ValueSubType extends Value<?>> T1 caseDimension(Dimension<ValueSubType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StateSubType extends State<?, ?>> T1 caseValue(Value<StateSubType> object) {
		return null;
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
	public <StepSubType extends Step<?>, ValueSubType extends Value<?>> T1 caseState(State<StepSubType, ValueSubType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <DimensionSubType extends Dimension<?>> T1 caseTracedObject(TracedObject<DimensionSubType> object) {
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
	public T1 defaultCase(EObject object) {
		return null;
	}

} //StatesSwitch
