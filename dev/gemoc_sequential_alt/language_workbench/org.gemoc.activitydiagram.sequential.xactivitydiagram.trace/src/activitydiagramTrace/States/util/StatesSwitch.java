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
			case StatesPackage.ACTIVITY_EDGE_OFFERED_TOKENS_DIMENSION: {
				ActivityEdge_offeredTokens_Dimension activityEdge_offeredTokens_Dimension = (ActivityEdge_offeredTokens_Dimension)theEObject;
				T1 result = caseActivityEdge_offeredTokens_Dimension(activityEdge_offeredTokens_Dimension);
				if (result == null) result = caseSpecificDimension(activityEdge_offeredTokens_Dimension);
				if (result == null) result = caseDimension(activityEdge_offeredTokens_Dimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.ACTIVITY_EDGE_OFFERED_TOKENS_VALUE: {
				ActivityEdge_offeredTokens_Value activityEdge_offeredTokens_Value = (ActivityEdge_offeredTokens_Value)theEObject;
				T1 result = caseActivityEdge_offeredTokens_Value(activityEdge_offeredTokens_Value);
				if (result == null) result = caseSpecificReferenceValue(activityEdge_offeredTokens_Value);
				if (result == null) result = caseSpecificValue(activityEdge_offeredTokens_Value);
				if (result == null) result = caseValue(activityEdge_offeredTokens_Value);
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
			case StatesPackage.BOOLEAN_VARIABLE_CURRENT_VALUE_DIMENSION: {
				BooleanVariable_currentValue_Dimension booleanVariable_currentValue_Dimension = (BooleanVariable_currentValue_Dimension)theEObject;
				T1 result = caseBooleanVariable_currentValue_Dimension(booleanVariable_currentValue_Dimension);
				if (result == null) result = caseSpecificDimension(booleanVariable_currentValue_Dimension);
				if (result == null) result = caseDimension(booleanVariable_currentValue_Dimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.BOOLEAN_VARIABLE_CURRENT_VALUE_VALUE: {
				BooleanVariable_currentValue_Value booleanVariable_currentValue_Value = (BooleanVariable_currentValue_Value)theEObject;
				T1 result = caseBooleanVariable_currentValue_Value(booleanVariable_currentValue_Value);
				if (result == null) result = caseSpecificAttributeValue(booleanVariable_currentValue_Value);
				if (result == null) result = caseSpecificValue(booleanVariable_currentValue_Value);
				if (result == null) result = caseValue(booleanVariable_currentValue_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.INTEGER_VARIABLE_CURRENT_VALUE_DIMENSION: {
				IntegerVariable_currentValue_Dimension integerVariable_currentValue_Dimension = (IntegerVariable_currentValue_Dimension)theEObject;
				T1 result = caseIntegerVariable_currentValue_Dimension(integerVariable_currentValue_Dimension);
				if (result == null) result = caseSpecificDimension(integerVariable_currentValue_Dimension);
				if (result == null) result = caseDimension(integerVariable_currentValue_Dimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.INTEGER_VARIABLE_CURRENT_VALUE_VALUE: {
				IntegerVariable_currentValue_Value integerVariable_currentValue_Value = (IntegerVariable_currentValue_Value)theEObject;
				T1 result = caseIntegerVariable_currentValue_Value(integerVariable_currentValue_Value);
				if (result == null) result = caseSpecificAttributeValue(integerVariable_currentValue_Value);
				if (result == null) result = caseSpecificValue(integerVariable_currentValue_Value);
				if (result == null) result = caseValue(integerVariable_currentValue_Value);
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
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Edge offered Tokens Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Edge offered Tokens Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseActivityEdge_offeredTokens_Dimension(ActivityEdge_offeredTokens_Dimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Edge offered Tokens Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Edge offered Tokens Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseActivityEdge_offeredTokens_Value(ActivityEdge_offeredTokens_Value object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Variable current Value Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Variable current Value Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBooleanVariable_currentValue_Dimension(BooleanVariable_currentValue_Dimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Variable current Value Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Variable current Value Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBooleanVariable_currentValue_Value(BooleanVariable_currentValue_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Variable current Value Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Variable current Value Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIntegerVariable_currentValue_Dimension(IntegerVariable_currentValue_Dimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Variable current Value Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Variable current Value Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIntegerVariable_currentValue_Value(IntegerVariable_currentValue_Value object) {
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
