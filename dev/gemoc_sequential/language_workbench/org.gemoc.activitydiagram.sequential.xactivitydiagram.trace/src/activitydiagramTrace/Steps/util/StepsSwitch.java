/**
 */
package activitydiagramTrace.Steps.util;

import activitydiagramTrace.Steps.*;

import fr.inria.diverse.trace.commons.model.trace.BigStep;
import fr.inria.diverse.trace.commons.model.trace.SequentialStep;
import fr.inria.diverse.trace.commons.model.trace.SmallStep;
import fr.inria.diverse.trace.commons.model.trace.State;
import fr.inria.diverse.trace.commons.model.trace.Step;

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
 * @see activitydiagramTrace.Steps.StepsPackage
 * @generated
 */
public class StepsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StepsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepsSwitch() {
		if (modelPackage == null) {
			modelPackage = StepsPackage.eINSTANCE;
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
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKEN: {
				Activitydiagram_ActivityNode_AddToken activitydiagram_ActivityNode_AddToken = (Activitydiagram_ActivityNode_AddToken)theEObject;
				T result = caseActivitydiagram_ActivityNode_AddToken(activitydiagram_ActivityNode_AddToken);
				if (result == null) result = caseSpecificStep(activitydiagram_ActivityNode_AddToken);
				if (result == null) result = caseSmallStep(activitydiagram_ActivityNode_AddToken);
				if (result == null) result = caseStep(activitydiagram_ActivityNode_AddToken);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1: {
				Activitydiagram_ActivityNode_AddTokens1 activitydiagram_ActivityNode_AddTokens1 = (Activitydiagram_ActivityNode_AddTokens1)theEObject;
				T result = caseActivitydiagram_ActivityNode_AddTokens1(activitydiagram_ActivityNode_AddTokens1);
				if (result == null) result = caseActivitydiagram_Activity_Execute_AbstractSubStep(activitydiagram_ActivityNode_AddTokens1);
				if (result == null) result = caseActivitydiagram_ActivityNode_Execute_AbstractSubStep(activitydiagram_ActivityNode_AddTokens1);
				if (result == null) result = caseSmallStep(activitydiagram_ActivityNode_AddTokens1);
				if (result == null) result = caseSpecificStep(activitydiagram_ActivityNode_AddTokens1);
				if (result == null) result = caseStep(activitydiagram_ActivityNode_AddTokens1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE: {
				Activitydiagram_ActivityNode_Execute activitydiagram_ActivityNode_Execute = (Activitydiagram_ActivityNode_Execute)theEObject;
				T result = caseActivitydiagram_ActivityNode_Execute(activitydiagram_ActivityNode_Execute);
				if (result == null) result = caseActivitydiagram_Activity_Execute_AbstractSubStep(activitydiagram_ActivityNode_Execute);
				if (result == null) result = caseSequentialStep(activitydiagram_ActivityNode_Execute);
				if (result == null) result = caseSpecificStep(activitydiagram_ActivityNode_Execute);
				if (result == null) result = caseBigStep(activitydiagram_ActivityNode_Execute);
				if (result == null) result = caseStep(activitydiagram_ActivityNode_Execute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_STEP: {
				Activitydiagram_ActivityNode_Execute_AbstractSubStep activitydiagram_ActivityNode_Execute_AbstractSubStep = (Activitydiagram_ActivityNode_Execute_AbstractSubStep)theEObject;
				T result = caseActivitydiagram_ActivityNode_Execute_AbstractSubStep(activitydiagram_ActivityNode_Execute_AbstractSubStep);
				if (result == null) result = caseSpecificStep(activitydiagram_ActivityNode_Execute_AbstractSubStep);
				if (result == null) result = caseStep(activitydiagram_ActivityNode_Execute_AbstractSubStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_IMPLICIT_STEP: {
				Activitydiagram_ActivityNode_Execute_ImplicitStep activitydiagram_ActivityNode_Execute_ImplicitStep = (Activitydiagram_ActivityNode_Execute_ImplicitStep)theEObject;
				T result = caseActivitydiagram_ActivityNode_Execute_ImplicitStep(activitydiagram_ActivityNode_Execute_ImplicitStep);
				if (result == null) result = caseActivitydiagram_ActivityNode_Execute_AbstractSubStep(activitydiagram_ActivityNode_Execute_ImplicitStep);
				if (result == null) result = caseSmallStep(activitydiagram_ActivityNode_Execute_ImplicitStep);
				if (result == null) result = caseSpecificStep(activitydiagram_ActivityNode_Execute_ImplicitStep);
				if (result == null) result = caseStep(activitydiagram_ActivityNode_Execute_ImplicitStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN1: {
				Activitydiagram_ActivityNode_RemoveToken1 activitydiagram_ActivityNode_RemoveToken1 = (Activitydiagram_ActivityNode_RemoveToken1)theEObject;
				T result = caseActivitydiagram_ActivityNode_RemoveToken1(activitydiagram_ActivityNode_RemoveToken1);
				if (result == null) result = caseSpecificStep(activitydiagram_ActivityNode_RemoveToken1);
				if (result == null) result = caseSmallStep(activitydiagram_ActivityNode_RemoveToken1);
				if (result == null) result = caseStep(activitydiagram_ActivityNode_RemoveToken1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1: {
				Activitydiagram_ActivityNode_SendOffers1 activitydiagram_ActivityNode_SendOffers1 = (Activitydiagram_ActivityNode_SendOffers1)theEObject;
				T result = caseActivitydiagram_ActivityNode_SendOffers1(activitydiagram_ActivityNode_SendOffers1);
				if (result == null) result = caseSmallStep(activitydiagram_ActivityNode_SendOffers1);
				if (result == null) result = caseActivitydiagram_Activity_Execute_AbstractSubStep(activitydiagram_ActivityNode_SendOffers1);
				if (result == null) result = caseActivitydiagram_ActivityNode_Execute_AbstractSubStep(activitydiagram_ActivityNode_SendOffers1);
				if (result == null) result = caseSpecificStep(activitydiagram_ActivityNode_SendOffers1);
				if (result == null) result = caseStep(activitydiagram_ActivityNode_SendOffers1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1: {
				Activitydiagram_ActivityNode_TakeOfferdTokens1 activitydiagram_ActivityNode_TakeOfferdTokens1 = (Activitydiagram_ActivityNode_TakeOfferdTokens1)theEObject;
				T result = caseActivitydiagram_ActivityNode_TakeOfferdTokens1(activitydiagram_ActivityNode_TakeOfferdTokens1);
				if (result == null) result = caseSmallStep(activitydiagram_ActivityNode_TakeOfferdTokens1);
				if (result == null) result = caseActivitydiagram_Activity_Execute_AbstractSubStep(activitydiagram_ActivityNode_TakeOfferdTokens1);
				if (result == null) result = caseActivitydiagram_ActivityNode_Execute_AbstractSubStep(activitydiagram_ActivityNode_TakeOfferdTokens1);
				if (result == null) result = caseSpecificStep(activitydiagram_ActivityNode_TakeOfferdTokens1);
				if (result == null) result = caseStep(activitydiagram_ActivityNode_TakeOfferdTokens1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE: {
				Activitydiagram_ActivityNode_Terminate activitydiagram_ActivityNode_Terminate = (Activitydiagram_ActivityNode_Terminate)theEObject;
				T result = caseActivitydiagram_ActivityNode_Terminate(activitydiagram_ActivityNode_Terminate);
				if (result == null) result = caseSpecificStep(activitydiagram_ActivityNode_Terminate);
				if (result == null) result = caseSmallStep(activitydiagram_ActivityNode_Terminate);
				if (result == null) result = caseStep(activitydiagram_ActivityNode_Terminate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_EXECUTE: {
				Activitydiagram_Activity_Execute activitydiagram_Activity_Execute = (Activitydiagram_Activity_Execute)theEObject;
				T result = caseActivitydiagram_Activity_Execute(activitydiagram_Activity_Execute);
				if (result == null) result = caseSpecificStep(activitydiagram_Activity_Execute);
				if (result == null) result = caseSequentialStep(activitydiagram_Activity_Execute);
				if (result == null) result = caseBigStep(activitydiagram_Activity_Execute);
				if (result == null) result = caseStep(activitydiagram_Activity_Execute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP: {
				Activitydiagram_Activity_Execute_AbstractSubStep activitydiagram_Activity_Execute_AbstractSubStep = (Activitydiagram_Activity_Execute_AbstractSubStep)theEObject;
				T result = caseActivitydiagram_Activity_Execute_AbstractSubStep(activitydiagram_Activity_Execute_AbstractSubStep);
				if (result == null) result = caseSpecificStep(activitydiagram_Activity_Execute_AbstractSubStep);
				if (result == null) result = caseStep(activitydiagram_Activity_Execute_AbstractSubStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_IMPLICIT_STEP: {
				Activitydiagram_Activity_Execute_ImplicitStep activitydiagram_Activity_Execute_ImplicitStep = (Activitydiagram_Activity_Execute_ImplicitStep)theEObject;
				T result = caseActivitydiagram_Activity_Execute_ImplicitStep(activitydiagram_Activity_Execute_ImplicitStep);
				if (result == null) result = caseActivitydiagram_Activity_Execute_AbstractSubStep(activitydiagram_Activity_Execute_ImplicitStep);
				if (result == null) result = caseSmallStep(activitydiagram_Activity_Execute_ImplicitStep);
				if (result == null) result = caseSpecificStep(activitydiagram_Activity_Execute_ImplicitStep);
				if (result == null) result = caseStep(activitydiagram_Activity_Execute_ImplicitStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_RESET: {
				Activitydiagram_Activity_Reset activitydiagram_Activity_Reset = (Activitydiagram_Activity_Reset)theEObject;
				T result = caseActivitydiagram_Activity_Reset(activitydiagram_Activity_Reset);
				if (result == null) result = caseSpecificStep(activitydiagram_Activity_Reset);
				if (result == null) result = caseSmallStep(activitydiagram_Activity_Reset);
				if (result == null) result = caseStep(activitydiagram_Activity_Reset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_EXECUTE: {
				Activitydiagram_BooleanVariable_Execute activitydiagram_BooleanVariable_Execute = (Activitydiagram_BooleanVariable_Execute)theEObject;
				T result = caseActivitydiagram_BooleanVariable_Execute(activitydiagram_BooleanVariable_Execute);
				if (result == null) result = caseSpecificStep(activitydiagram_BooleanVariable_Execute);
				if (result == null) result = caseSmallStep(activitydiagram_BooleanVariable_Execute);
				if (result == null) result = caseStep(activitydiagram_BooleanVariable_Execute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_INIT: {
				Activitydiagram_BooleanVariable_Init activitydiagram_BooleanVariable_Init = (Activitydiagram_BooleanVariable_Init)theEObject;
				T result = caseActivitydiagram_BooleanVariable_Init(activitydiagram_BooleanVariable_Init);
				if (result == null) result = caseActivitydiagram_Activity_Execute_AbstractSubStep(activitydiagram_BooleanVariable_Init);
				if (result == null) result = caseSmallStep(activitydiagram_BooleanVariable_Init);
				if (result == null) result = caseSpecificStep(activitydiagram_BooleanVariable_Init);
				if (result == null) result = caseStep(activitydiagram_BooleanVariable_Init);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_DECISION_NODE_SEND_OFFERS1: {
				Activitydiagram_DecisionNode_SendOffers1 activitydiagram_DecisionNode_SendOffers1 = (Activitydiagram_DecisionNode_SendOffers1)theEObject;
				T result = caseActivitydiagram_DecisionNode_SendOffers1(activitydiagram_DecisionNode_SendOffers1);
				if (result == null) result = caseActivitydiagram_Activity_Execute_AbstractSubStep(activitydiagram_DecisionNode_SendOffers1);
				if (result == null) result = caseActivitydiagram_ActivityNode_Execute_AbstractSubStep(activitydiagram_DecisionNode_SendOffers1);
				if (result == null) result = caseSmallStep(activitydiagram_DecisionNode_SendOffers1);
				if (result == null) result = caseSpecificStep(activitydiagram_DecisionNode_SendOffers1);
				if (result == null) result = caseStep(activitydiagram_DecisionNode_SendOffers1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_INTEGER_VARIABLE_EXECUTE: {
				Activitydiagram_IntegerVariable_Execute activitydiagram_IntegerVariable_Execute = (Activitydiagram_IntegerVariable_Execute)theEObject;
				T result = caseActivitydiagram_IntegerVariable_Execute(activitydiagram_IntegerVariable_Execute);
				if (result == null) result = caseSpecificStep(activitydiagram_IntegerVariable_Execute);
				if (result == null) result = caseSmallStep(activitydiagram_IntegerVariable_Execute);
				if (result == null) result = caseStep(activitydiagram_IntegerVariable_Execute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_INTEGER_VARIABLE_INIT: {
				Activitydiagram_IntegerVariable_Init activitydiagram_IntegerVariable_Init = (Activitydiagram_IntegerVariable_Init)theEObject;
				T result = caseActivitydiagram_IntegerVariable_Init(activitydiagram_IntegerVariable_Init);
				if (result == null) result = caseActivitydiagram_Activity_Execute_AbstractSubStep(activitydiagram_IntegerVariable_Init);
				if (result == null) result = caseSmallStep(activitydiagram_IntegerVariable_Init);
				if (result == null) result = caseSpecificStep(activitydiagram_IntegerVariable_Init);
				if (result == null) result = caseStep(activitydiagram_IntegerVariable_Init);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_VARIABLE_EXECUTE: {
				Activitydiagram_Variable_Execute activitydiagram_Variable_Execute = (Activitydiagram_Variable_Execute)theEObject;
				T result = caseActivitydiagram_Variable_Execute(activitydiagram_Variable_Execute);
				if (result == null) result = caseSpecificStep(activitydiagram_Variable_Execute);
				if (result == null) result = caseSmallStep(activitydiagram_Variable_Execute);
				if (result == null) result = caseStep(activitydiagram_Variable_Execute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_VARIABLE_INIT: {
				Activitydiagram_Variable_Init activitydiagram_Variable_Init = (Activitydiagram_Variable_Init)theEObject;
				T result = caseActivitydiagram_Variable_Init(activitydiagram_Variable_Init);
				if (result == null) result = caseActivitydiagram_Activity_Execute_AbstractSubStep(activitydiagram_Variable_Init);
				if (result == null) result = caseSmallStep(activitydiagram_Variable_Init);
				if (result == null) result = caseSpecificStep(activitydiagram_Variable_Init);
				if (result == null) result = caseStep(activitydiagram_Variable_Init);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ROOT_IMPLICIT_STEP: {
				RootImplicitStep rootImplicitStep = (RootImplicitStep)theEObject;
				T result = caseRootImplicitStep(rootImplicitStep);
				if (result == null) result = caseSmallStep(rootImplicitStep);
				if (result == null) result = caseStep(rootImplicitStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.SPECIFIC_ROOT_STEP: {
				SpecificRootStep specificRootStep = (SpecificRootStep)theEObject;
				T result = caseSpecificRootStep(specificRootStep);
				if (result == null) result = caseSequentialStep(specificRootStep);
				if (result == null) result = caseSpecificStep(specificRootStep);
				if (result == null) result = caseBigStep(specificRootStep);
				if (result == null) result = caseStep(specificRootStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.SPECIFIC_STEP: {
				SpecificStep specificStep = (SpecificStep)theEObject;
				T result = caseSpecificStep(specificStep);
				if (result == null) result = caseStep(specificStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activitydiagram Activity Node Add Token</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activitydiagram Activity Node Add Token</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivitydiagram_ActivityNode_AddToken(Activitydiagram_ActivityNode_AddToken object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activitydiagram Activity Node Add Tokens1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activitydiagram Activity Node Add Tokens1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivitydiagram_ActivityNode_AddTokens1(Activitydiagram_ActivityNode_AddTokens1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activitydiagram Activity Node Execute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activitydiagram Activity Node Execute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivitydiagram_ActivityNode_Execute(Activitydiagram_ActivityNode_Execute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activitydiagram Activity Node Execute Abstract Sub Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activitydiagram Activity Node Execute Abstract Sub Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivitydiagram_ActivityNode_Execute_AbstractSubStep(Activitydiagram_ActivityNode_Execute_AbstractSubStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activitydiagram Activity Node Execute Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activitydiagram Activity Node Execute Implicit Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivitydiagram_ActivityNode_Execute_ImplicitStep(Activitydiagram_ActivityNode_Execute_ImplicitStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activitydiagram Activity Node Remove Token1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activitydiagram Activity Node Remove Token1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivitydiagram_ActivityNode_RemoveToken1(Activitydiagram_ActivityNode_RemoveToken1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activitydiagram Activity Node Send Offers1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activitydiagram Activity Node Send Offers1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivitydiagram_ActivityNode_SendOffers1(Activitydiagram_ActivityNode_SendOffers1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activitydiagram Activity Node Take Offerd Tokens1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activitydiagram Activity Node Take Offerd Tokens1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivitydiagram_ActivityNode_TakeOfferdTokens1(Activitydiagram_ActivityNode_TakeOfferdTokens1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activitydiagram Activity Node Terminate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activitydiagram Activity Node Terminate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivitydiagram_ActivityNode_Terminate(Activitydiagram_ActivityNode_Terminate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activitydiagram Activity Execute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activitydiagram Activity Execute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivitydiagram_Activity_Execute(Activitydiagram_Activity_Execute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activitydiagram Activity Execute Abstract Sub Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activitydiagram Activity Execute Abstract Sub Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivitydiagram_Activity_Execute_AbstractSubStep(Activitydiagram_Activity_Execute_AbstractSubStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activitydiagram Activity Execute Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activitydiagram Activity Execute Implicit Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivitydiagram_Activity_Execute_ImplicitStep(Activitydiagram_Activity_Execute_ImplicitStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activitydiagram Activity Reset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activitydiagram Activity Reset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivitydiagram_Activity_Reset(Activitydiagram_Activity_Reset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activitydiagram Boolean Variable Execute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activitydiagram Boolean Variable Execute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivitydiagram_BooleanVariable_Execute(Activitydiagram_BooleanVariable_Execute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activitydiagram Boolean Variable Init</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activitydiagram Boolean Variable Init</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivitydiagram_BooleanVariable_Init(Activitydiagram_BooleanVariable_Init object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activitydiagram Decision Node Send Offers1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activitydiagram Decision Node Send Offers1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivitydiagram_DecisionNode_SendOffers1(Activitydiagram_DecisionNode_SendOffers1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activitydiagram Integer Variable Execute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activitydiagram Integer Variable Execute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivitydiagram_IntegerVariable_Execute(Activitydiagram_IntegerVariable_Execute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activitydiagram Integer Variable Init</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activitydiagram Integer Variable Init</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivitydiagram_IntegerVariable_Init(Activitydiagram_IntegerVariable_Init object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activitydiagram Variable Execute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activitydiagram Variable Execute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivitydiagram_Variable_Execute(Activitydiagram_Variable_Execute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activitydiagram Variable Init</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activitydiagram Variable Init</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivitydiagram_Variable_Init(Activitydiagram_Variable_Init object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Implicit Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRootImplicitStep(RootImplicitStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specific Root Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specific Root Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecificRootStep(SpecificRootStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specific Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specific Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecificStep(SpecificStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StateSubType extends State<?, ?>> T caseStep(Step<StateSubType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Small Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Small Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StateSubType extends State<?, ?>> T caseSmallStep(SmallStep<StateSubType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Big Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Big Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StepSubtype extends Step<StateSubType>, StateSubType extends State<?, ?>> T caseBigStep(BigStep<StepSubtype, StateSubType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequential Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequential Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StepSubtype extends Step<StateSubType>, StateSubType extends State<?, ?>> T caseSequentialStep(SequentialStep<StepSubtype, StateSubType> object) {
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

} //StepsSwitch
