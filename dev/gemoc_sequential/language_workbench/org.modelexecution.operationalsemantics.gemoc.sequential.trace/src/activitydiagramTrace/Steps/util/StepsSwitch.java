/**
 */
package activitydiagramTrace.Steps.util;

import activitydiagramTrace.Steps.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.gemoc.executionframework.engine.mse.MSEOccurrence;

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
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1: {
				Activitydiagram_ActivityNode_AddTokens1 activitydiagram_ActivityNode_AddTokens1 = (Activitydiagram_ActivityNode_AddTokens1)theEObject;
				T result = caseActivitydiagram_ActivityNode_AddTokens1(activitydiagram_ActivityNode_AddTokens1);
				if (result == null) result = caseActivitydiagram_ActivityNode_Execute_AbstractSubStep(activitydiagram_ActivityNode_AddTokens1);
				if (result == null) result = caseBigStep(activitydiagram_ActivityNode_AddTokens1);
				if (result == null) result = caseStep(activitydiagram_ActivityNode_AddTokens1);
				if (result == null) result = caseMSEOccurrence(activitydiagram_ActivityNode_AddTokens1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_ABSTRACT_SUB_STEP: {
				Activitydiagram_ActivityNode_AddTokens1_AbstractSubStep activitydiagram_ActivityNode_AddTokens1_AbstractSubStep = (Activitydiagram_ActivityNode_AddTokens1_AbstractSubStep)theEObject;
				T result = caseActivitydiagram_ActivityNode_AddTokens1_AbstractSubStep(activitydiagram_ActivityNode_AddTokens1_AbstractSubStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_IMPLICIT_STEP: {
				Activitydiagram_ActivityNode_AddTokens1_ImplicitStep activitydiagram_ActivityNode_AddTokens1_ImplicitStep = (Activitydiagram_ActivityNode_AddTokens1_ImplicitStep)theEObject;
				T result = caseActivitydiagram_ActivityNode_AddTokens1_ImplicitStep(activitydiagram_ActivityNode_AddTokens1_ImplicitStep);
				if (result == null) result = caseActivitydiagram_ActivityNode_AddTokens1_AbstractSubStep(activitydiagram_ActivityNode_AddTokens1_ImplicitStep);
				if (result == null) result = caseSmallStep(activitydiagram_ActivityNode_AddTokens1_ImplicitStep);
				if (result == null) result = caseStep(activitydiagram_ActivityNode_AddTokens1_ImplicitStep);
				if (result == null) result = caseMSEOccurrence(activitydiagram_ActivityNode_AddTokens1_ImplicitStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE: {
				Activitydiagram_ActivityNode_Execute activitydiagram_ActivityNode_Execute = (Activitydiagram_ActivityNode_Execute)theEObject;
				T result = caseActivitydiagram_ActivityNode_Execute(activitydiagram_ActivityNode_Execute);
				if (result == null) result = caseActivitydiagram_Activity_Execute_AbstractSubStep(activitydiagram_ActivityNode_Execute);
				if (result == null) result = caseBigStep(activitydiagram_ActivityNode_Execute);
				if (result == null) result = caseStep(activitydiagram_ActivityNode_Execute);
				if (result == null) result = caseMSEOccurrence(activitydiagram_ActivityNode_Execute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_ABSTRACT_SUB_STEP: {
				Activitydiagram_ActivityNode_Execute_AbstractSubStep activitydiagram_ActivityNode_Execute_AbstractSubStep = (Activitydiagram_ActivityNode_Execute_AbstractSubStep)theEObject;
				T result = caseActivitydiagram_ActivityNode_Execute_AbstractSubStep(activitydiagram_ActivityNode_Execute_AbstractSubStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_IMPLICIT_STEP: {
				Activitydiagram_ActivityNode_Execute_ImplicitStep activitydiagram_ActivityNode_Execute_ImplicitStep = (Activitydiagram_ActivityNode_Execute_ImplicitStep)theEObject;
				T result = caseActivitydiagram_ActivityNode_Execute_ImplicitStep(activitydiagram_ActivityNode_Execute_ImplicitStep);
				if (result == null) result = caseActivitydiagram_ActivityNode_Execute_AbstractSubStep(activitydiagram_ActivityNode_Execute_ImplicitStep);
				if (result == null) result = caseSmallStep(activitydiagram_ActivityNode_Execute_ImplicitStep);
				if (result == null) result = caseStep(activitydiagram_ActivityNode_Execute_ImplicitStep);
				if (result == null) result = caseMSEOccurrence(activitydiagram_ActivityNode_Execute_ImplicitStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN1: {
				Activitydiagram_ActivityNode_RemoveToken1 activitydiagram_ActivityNode_RemoveToken1 = (Activitydiagram_ActivityNode_RemoveToken1)theEObject;
				T result = caseActivitydiagram_ActivityNode_RemoveToken1(activitydiagram_ActivityNode_RemoveToken1);
				if (result == null) result = caseActivitydiagram_ActivityNode_AddTokens1_AbstractSubStep(activitydiagram_ActivityNode_RemoveToken1);
				if (result == null) result = caseActivitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStep(activitydiagram_ActivityNode_RemoveToken1);
				if (result == null) result = caseSmallStep(activitydiagram_ActivityNode_RemoveToken1);
				if (result == null) result = caseStep(activitydiagram_ActivityNode_RemoveToken1);
				if (result == null) result = caseMSEOccurrence(activitydiagram_ActivityNode_RemoveToken1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1: {
				Activitydiagram_ActivityNode_SendOffers1 activitydiagram_ActivityNode_SendOffers1 = (Activitydiagram_ActivityNode_SendOffers1)theEObject;
				T result = caseActivitydiagram_ActivityNode_SendOffers1(activitydiagram_ActivityNode_SendOffers1);
				if (result == null) result = caseActivitydiagram_ActivityNode_Execute_AbstractSubStep(activitydiagram_ActivityNode_SendOffers1);
				if (result == null) result = caseSmallStep(activitydiagram_ActivityNode_SendOffers1);
				if (result == null) result = caseStep(activitydiagram_ActivityNode_SendOffers1);
				if (result == null) result = caseMSEOccurrence(activitydiagram_ActivityNode_SendOffers1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1: {
				Activitydiagram_ActivityNode_TakeOfferdTokens1 activitydiagram_ActivityNode_TakeOfferdTokens1 = (Activitydiagram_ActivityNode_TakeOfferdTokens1)theEObject;
				T result = caseActivitydiagram_ActivityNode_TakeOfferdTokens1(activitydiagram_ActivityNode_TakeOfferdTokens1);
				if (result == null) result = caseActivitydiagram_ActivityNode_Execute_AbstractSubStep(activitydiagram_ActivityNode_TakeOfferdTokens1);
				if (result == null) result = caseBigStep(activitydiagram_ActivityNode_TakeOfferdTokens1);
				if (result == null) result = caseStep(activitydiagram_ActivityNode_TakeOfferdTokens1);
				if (result == null) result = caseMSEOccurrence(activitydiagram_ActivityNode_TakeOfferdTokens1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_ABSTRACT_SUB_STEP: {
				Activitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStep activitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStep = (Activitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStep)theEObject;
				T result = caseActivitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStep(activitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_IMPLICIT_STEP: {
				Activitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStep activitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStep = (Activitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStep)theEObject;
				T result = caseActivitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStep(activitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStep);
				if (result == null) result = caseActivitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStep(activitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStep);
				if (result == null) result = caseSmallStep(activitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStep);
				if (result == null) result = caseStep(activitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStep);
				if (result == null) result = caseMSEOccurrence(activitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE: {
				Activitydiagram_ActivityNode_Terminate activitydiagram_ActivityNode_Terminate = (Activitydiagram_ActivityNode_Terminate)theEObject;
				T result = caseActivitydiagram_ActivityNode_Terminate(activitydiagram_ActivityNode_Terminate);
				if (result == null) result = caseSmallStep(activitydiagram_ActivityNode_Terminate);
				if (result == null) result = caseStep(activitydiagram_ActivityNode_Terminate);
				if (result == null) result = caseMSEOccurrence(activitydiagram_ActivityNode_Terminate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_EXECUTE: {
				Activitydiagram_Activity_Execute activitydiagram_Activity_Execute = (Activitydiagram_Activity_Execute)theEObject;
				T result = caseActivitydiagram_Activity_Execute(activitydiagram_Activity_Execute);
				if (result == null) result = caseBigStep(activitydiagram_Activity_Execute);
				if (result == null) result = caseStep(activitydiagram_Activity_Execute);
				if (result == null) result = caseMSEOccurrence(activitydiagram_Activity_Execute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_ABSTRACT_SUB_STEP: {
				Activitydiagram_Activity_Execute_AbstractSubStep activitydiagram_Activity_Execute_AbstractSubStep = (Activitydiagram_Activity_Execute_AbstractSubStep)theEObject;
				T result = caseActivitydiagram_Activity_Execute_AbstractSubStep(activitydiagram_Activity_Execute_AbstractSubStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_IMPLICIT_STEP: {
				Activitydiagram_Activity_Execute_ImplicitStep activitydiagram_Activity_Execute_ImplicitStep = (Activitydiagram_Activity_Execute_ImplicitStep)theEObject;
				T result = caseActivitydiagram_Activity_Execute_ImplicitStep(activitydiagram_Activity_Execute_ImplicitStep);
				if (result == null) result = caseActivitydiagram_Activity_Execute_AbstractSubStep(activitydiagram_Activity_Execute_ImplicitStep);
				if (result == null) result = caseSmallStep(activitydiagram_Activity_Execute_ImplicitStep);
				if (result == null) result = caseStep(activitydiagram_Activity_Execute_ImplicitStep);
				if (result == null) result = caseMSEOccurrence(activitydiagram_Activity_Execute_ImplicitStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_INITIALIZE_CONTEXT: {
				Activitydiagram_Activity_InitializeContext activitydiagram_Activity_InitializeContext = (Activitydiagram_Activity_InitializeContext)theEObject;
				T result = caseActivitydiagram_Activity_InitializeContext(activitydiagram_Activity_InitializeContext);
				if (result == null) result = caseSmallStep(activitydiagram_Activity_InitializeContext);
				if (result == null) result = caseStep(activitydiagram_Activity_InitializeContext);
				if (result == null) result = caseMSEOccurrence(activitydiagram_Activity_InitializeContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_RESET: {
				Activitydiagram_Activity_Reset activitydiagram_Activity_Reset = (Activitydiagram_Activity_Reset)theEObject;
				T result = caseActivitydiagram_Activity_Reset(activitydiagram_Activity_Reset);
				if (result == null) result = caseActivitydiagram_Activity_WriteTrace_AbstractSubStep(activitydiagram_Activity_Reset);
				if (result == null) result = caseSmallStep(activitydiagram_Activity_Reset);
				if (result == null) result = caseStep(activitydiagram_Activity_Reset);
				if (result == null) result = caseMSEOccurrence(activitydiagram_Activity_Reset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE: {
				Activitydiagram_Activity_WriteTrace activitydiagram_Activity_WriteTrace = (Activitydiagram_Activity_WriteTrace)theEObject;
				T result = caseActivitydiagram_Activity_WriteTrace(activitydiagram_Activity_WriteTrace);
				if (result == null) result = caseBigStep(activitydiagram_Activity_WriteTrace);
				if (result == null) result = caseStep(activitydiagram_Activity_WriteTrace);
				if (result == null) result = caseMSEOccurrence(activitydiagram_Activity_WriteTrace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_ABSTRACT_SUB_STEP: {
				Activitydiagram_Activity_WriteTrace_AbstractSubStep activitydiagram_Activity_WriteTrace_AbstractSubStep = (Activitydiagram_Activity_WriteTrace_AbstractSubStep)theEObject;
				T result = caseActivitydiagram_Activity_WriteTrace_AbstractSubStep(activitydiagram_Activity_WriteTrace_AbstractSubStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_IMPLICIT_STEP: {
				Activitydiagram_Activity_WriteTrace_ImplicitStep activitydiagram_Activity_WriteTrace_ImplicitStep = (Activitydiagram_Activity_WriteTrace_ImplicitStep)theEObject;
				T result = caseActivitydiagram_Activity_WriteTrace_ImplicitStep(activitydiagram_Activity_WriteTrace_ImplicitStep);
				if (result == null) result = caseActivitydiagram_Activity_WriteTrace_AbstractSubStep(activitydiagram_Activity_WriteTrace_ImplicitStep);
				if (result == null) result = caseSmallStep(activitydiagram_Activity_WriteTrace_ImplicitStep);
				if (result == null) result = caseStep(activitydiagram_Activity_WriteTrace_ImplicitStep);
				if (result == null) result = caseMSEOccurrence(activitydiagram_Activity_WriteTrace_ImplicitStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_VARIABLE_EXECUTE: {
				Activitydiagram_Variable_Execute activitydiagram_Variable_Execute = (Activitydiagram_Variable_Execute)theEObject;
				T result = caseActivitydiagram_Variable_Execute(activitydiagram_Variable_Execute);
				if (result == null) result = caseSmallStep(activitydiagram_Variable_Execute);
				if (result == null) result = caseStep(activitydiagram_Variable_Execute);
				if (result == null) result = caseMSEOccurrence(activitydiagram_Variable_Execute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_VARIABLE_INIT: {
				Activitydiagram_Variable_Init activitydiagram_Variable_Init = (Activitydiagram_Variable_Init)theEObject;
				T result = caseActivitydiagram_Variable_Init(activitydiagram_Variable_Init);
				if (result == null) result = caseActivitydiagram_Activity_Execute_AbstractSubStep(activitydiagram_Variable_Init);
				if (result == null) result = caseSmallStep(activitydiagram_Variable_Init);
				if (result == null) result = caseStep(activitydiagram_Variable_Init);
				if (result == null) result = caseMSEOccurrence(activitydiagram_Variable_Init);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.BIG_STEP: {
				BigStep bigStep = (BigStep)theEObject;
				T result = caseBigStep(bigStep);
				if (result == null) result = caseStep(bigStep);
				if (result == null) result = caseMSEOccurrence(bigStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ROOT_IMPLICIT_STEP: {
				RootImplicitStep rootImplicitStep = (RootImplicitStep)theEObject;
				T result = caseRootImplicitStep(rootImplicitStep);
				if (result == null) result = caseSmallStep(rootImplicitStep);
				if (result == null) result = caseStep(rootImplicitStep);
				if (result == null) result = caseMSEOccurrence(rootImplicitStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.SMALL_STEP: {
				SmallStep smallStep = (SmallStep)theEObject;
				T result = caseSmallStep(smallStep);
				if (result == null) result = caseStep(smallStep);
				if (result == null) result = caseMSEOccurrence(smallStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.STEP: {
				Step step = (Step)theEObject;
				T result = caseStep(step);
				if (result == null) result = caseMSEOccurrence(step);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Activitydiagram Activity Node Add Tokens1 Abstract Sub Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activitydiagram Activity Node Add Tokens1 Abstract Sub Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivitydiagram_ActivityNode_AddTokens1_AbstractSubStep(Activitydiagram_ActivityNode_AddTokens1_AbstractSubStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activitydiagram Activity Node Add Tokens1 Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activitydiagram Activity Node Add Tokens1 Implicit Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivitydiagram_ActivityNode_AddTokens1_ImplicitStep(Activitydiagram_ActivityNode_AddTokens1_ImplicitStep object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Activitydiagram Activity Node Take Offerd Tokens1 Abstract Sub Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activitydiagram Activity Node Take Offerd Tokens1 Abstract Sub Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStep(Activitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activitydiagram Activity Node Take Offerd Tokens1 Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activitydiagram Activity Node Take Offerd Tokens1 Implicit Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStep(Activitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStep object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Activitydiagram Activity Initialize Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activitydiagram Activity Initialize Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivitydiagram_Activity_InitializeContext(Activitydiagram_Activity_InitializeContext object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Activitydiagram Activity Write Trace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activitydiagram Activity Write Trace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivitydiagram_Activity_WriteTrace(Activitydiagram_Activity_WriteTrace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activitydiagram Activity Write Trace Abstract Sub Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activitydiagram Activity Write Trace Abstract Sub Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivitydiagram_Activity_WriteTrace_AbstractSubStep(Activitydiagram_Activity_WriteTrace_AbstractSubStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activitydiagram Activity Write Trace Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activitydiagram Activity Write Trace Implicit Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivitydiagram_Activity_WriteTrace_ImplicitStep(Activitydiagram_Activity_WriteTrace_ImplicitStep object) {
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
	public T caseBigStep(BigStep object) {
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
	public T caseSmallStep(SmallStep object) {
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
	public T caseStep(Step object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MSE Occurrence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MSE Occurrence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMSEOccurrence(MSEOccurrence object) {
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
