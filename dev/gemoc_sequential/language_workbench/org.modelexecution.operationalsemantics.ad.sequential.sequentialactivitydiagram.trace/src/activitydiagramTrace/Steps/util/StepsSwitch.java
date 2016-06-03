/**
 */
package activitydiagramTrace.Steps.util;

import activitydiagramTrace.Steps.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.gemoc.executionframework.engine.mse.BigStep;
import org.gemoc.executionframework.engine.mse.SequentialStep;
import org.gemoc.executionframework.engine.mse.SmallStep;
import org.gemoc.executionframework.engine.mse.Step;

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
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_FINAL_NODE_EXECUTE: {
				Activitydiagram_ActivityFinalNode_Execute activitydiagram_ActivityFinalNode_Execute = (Activitydiagram_ActivityFinalNode_Execute)theEObject;
				T result = caseActivitydiagram_ActivityFinalNode_Execute(activitydiagram_ActivityFinalNode_Execute);
				if (result == null) result = caseActivitydiagram_NamedElement_Execute_AbstractSubStep(activitydiagram_ActivityFinalNode_Execute);
				if (result == null) result = caseSequentialStep(activitydiagram_ActivityFinalNode_Execute);
				if (result == null) result = caseActivitydiagram_Activity_Execute_AbstractSubStep(activitydiagram_ActivityFinalNode_Execute);
				if (result == null) result = caseSpecificStep(activitydiagram_ActivityFinalNode_Execute);
				if (result == null) result = caseBigStep(activitydiagram_ActivityFinalNode_Execute);
				if (result == null) result = caseStep(activitydiagram_ActivityFinalNode_Execute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_FINAL_NODE_EXECUTE_ABSTRACT_SUB_STEP: {
				Activitydiagram_ActivityFinalNode_Execute_AbstractSubStep activitydiagram_ActivityFinalNode_Execute_AbstractSubStep = (Activitydiagram_ActivityFinalNode_Execute_AbstractSubStep)theEObject;
				T result = caseActivitydiagram_ActivityFinalNode_Execute_AbstractSubStep(activitydiagram_ActivityFinalNode_Execute_AbstractSubStep);
				if (result == null) result = caseSpecificStep(activitydiagram_ActivityFinalNode_Execute_AbstractSubStep);
				if (result == null) result = caseStep(activitydiagram_ActivityFinalNode_Execute_AbstractSubStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_FINAL_NODE_EXECUTE_IMPLICIT_STEP: {
				Activitydiagram_ActivityFinalNode_Execute_ImplicitStep activitydiagram_ActivityFinalNode_Execute_ImplicitStep = (Activitydiagram_ActivityFinalNode_Execute_ImplicitStep)theEObject;
				T result = caseActivitydiagram_ActivityFinalNode_Execute_ImplicitStep(activitydiagram_ActivityFinalNode_Execute_ImplicitStep);
				if (result == null) result = caseActivitydiagram_ActivityFinalNode_Execute_AbstractSubStep(activitydiagram_ActivityFinalNode_Execute_ImplicitStep);
				if (result == null) result = caseSmallStep(activitydiagram_ActivityFinalNode_Execute_ImplicitStep);
				if (result == null) result = caseSpecificStep(activitydiagram_ActivityFinalNode_Execute_ImplicitStep);
				if (result == null) result = caseStep(activitydiagram_ActivityFinalNode_Execute_ImplicitStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1: {
				Activitydiagram_ActivityNode_AddTokens1 activitydiagram_ActivityNode_AddTokens1 = (Activitydiagram_ActivityNode_AddTokens1)theEObject;
				T result = caseActivitydiagram_ActivityNode_AddTokens1(activitydiagram_ActivityNode_AddTokens1);
				if (result == null) result = caseSequentialStep(activitydiagram_ActivityNode_AddTokens1);
				if (result == null) result = caseActivitydiagram_NamedElement_Execute_AbstractSubStep(activitydiagram_ActivityNode_AddTokens1);
				if (result == null) result = caseActivitydiagram_ActivityNode_Execute_AbstractSubStep(activitydiagram_ActivityNode_AddTokens1);
				if (result == null) result = caseActivitydiagram_ForkNode_Execute_AbstractSubStep(activitydiagram_ActivityNode_AddTokens1);
				if (result == null) result = caseSpecificStep(activitydiagram_ActivityNode_AddTokens1);
				if (result == null) result = caseBigStep(activitydiagram_ActivityNode_AddTokens1);
				if (result == null) result = caseStep(activitydiagram_ActivityNode_AddTokens1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_ABSTRACT_SUB_STEP: {
				Activitydiagram_ActivityNode_AddTokens1_AbstractSubStep activitydiagram_ActivityNode_AddTokens1_AbstractSubStep = (Activitydiagram_ActivityNode_AddTokens1_AbstractSubStep)theEObject;
				T result = caseActivitydiagram_ActivityNode_AddTokens1_AbstractSubStep(activitydiagram_ActivityNode_AddTokens1_AbstractSubStep);
				if (result == null) result = caseSpecificStep(activitydiagram_ActivityNode_AddTokens1_AbstractSubStep);
				if (result == null) result = caseStep(activitydiagram_ActivityNode_AddTokens1_AbstractSubStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_IMPLICIT_STEP: {
				Activitydiagram_ActivityNode_AddTokens1_ImplicitStep activitydiagram_ActivityNode_AddTokens1_ImplicitStep = (Activitydiagram_ActivityNode_AddTokens1_ImplicitStep)theEObject;
				T result = caseActivitydiagram_ActivityNode_AddTokens1_ImplicitStep(activitydiagram_ActivityNode_AddTokens1_ImplicitStep);
				if (result == null) result = caseActivitydiagram_ActivityNode_AddTokens1_AbstractSubStep(activitydiagram_ActivityNode_AddTokens1_ImplicitStep);
				if (result == null) result = caseSmallStep(activitydiagram_ActivityNode_AddTokens1_ImplicitStep);
				if (result == null) result = caseSpecificStep(activitydiagram_ActivityNode_AddTokens1_ImplicitStep);
				if (result == null) result = caseStep(activitydiagram_ActivityNode_AddTokens1_ImplicitStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE: {
				Activitydiagram_ActivityNode_Execute activitydiagram_ActivityNode_Execute = (Activitydiagram_ActivityNode_Execute)theEObject;
				T result = caseActivitydiagram_ActivityNode_Execute(activitydiagram_ActivityNode_Execute);
				if (result == null) result = caseActivitydiagram_NamedElement_Execute_AbstractSubStep(activitydiagram_ActivityNode_Execute);
				if (result == null) result = caseSequentialStep(activitydiagram_ActivityNode_Execute);
				if (result == null) result = caseActivitydiagram_Activity_Execute_AbstractSubStep(activitydiagram_ActivityNode_Execute);
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
				if (result == null) result = caseActivitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStep(activitydiagram_ActivityNode_RemoveToken1);
				if (result == null) result = caseActivitydiagram_ActivityNode_AddTokens1_AbstractSubStep(activitydiagram_ActivityNode_RemoveToken1);
				if (result == null) result = caseSmallStep(activitydiagram_ActivityNode_RemoveToken1);
				if (result == null) result = caseSpecificStep(activitydiagram_ActivityNode_RemoveToken1);
				if (result == null) result = caseStep(activitydiagram_ActivityNode_RemoveToken1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1: {
				Activitydiagram_ActivityNode_SendOffers1 activitydiagram_ActivityNode_SendOffers1 = (Activitydiagram_ActivityNode_SendOffers1)theEObject;
				T result = caseActivitydiagram_ActivityNode_SendOffers1(activitydiagram_ActivityNode_SendOffers1);
				if (result == null) result = caseActivitydiagram_MergeNode_Execute_AbstractSubStep(activitydiagram_ActivityNode_SendOffers1);
				if (result == null) result = caseSmallStep(activitydiagram_ActivityNode_SendOffers1);
				if (result == null) result = caseActivitydiagram_InitialNode_Execute_AbstractSubStep(activitydiagram_ActivityNode_SendOffers1);
				if (result == null) result = caseActivitydiagram_NamedElement_Execute_AbstractSubStep(activitydiagram_ActivityNode_SendOffers1);
				if (result == null) result = caseActivitydiagram_JoinNode_Execute_AbstractSubStep(activitydiagram_ActivityNode_SendOffers1);
				if (result == null) result = caseActivitydiagram_OpaqueAction_Execute_AbstractSubStep(activitydiagram_ActivityNode_SendOffers1);
				if (result == null) result = caseActivitydiagram_ActivityFinalNode_Execute_AbstractSubStep(activitydiagram_ActivityNode_SendOffers1);
				if (result == null) result = caseActivitydiagram_ActivityNode_Execute_AbstractSubStep(activitydiagram_ActivityNode_SendOffers1);
				if (result == null) result = caseActivitydiagram_ForkNode_Execute_AbstractSubStep(activitydiagram_ActivityNode_SendOffers1);
				if (result == null) result = caseSpecificStep(activitydiagram_ActivityNode_SendOffers1);
				if (result == null) result = caseStep(activitydiagram_ActivityNode_SendOffers1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1: {
				Activitydiagram_ActivityNode_TakeOfferdTokens1 activitydiagram_ActivityNode_TakeOfferdTokens1 = (Activitydiagram_ActivityNode_TakeOfferdTokens1)theEObject;
				T result = caseActivitydiagram_ActivityNode_TakeOfferdTokens1(activitydiagram_ActivityNode_TakeOfferdTokens1);
				if (result == null) result = caseActivitydiagram_MergeNode_Execute_AbstractSubStep(activitydiagram_ActivityNode_TakeOfferdTokens1);
				if (result == null) result = caseSequentialStep(activitydiagram_ActivityNode_TakeOfferdTokens1);
				if (result == null) result = caseActivitydiagram_NamedElement_Execute_AbstractSubStep(activitydiagram_ActivityNode_TakeOfferdTokens1);
				if (result == null) result = caseActivitydiagram_JoinNode_Execute_AbstractSubStep(activitydiagram_ActivityNode_TakeOfferdTokens1);
				if (result == null) result = caseActivitydiagram_OpaqueAction_Execute_AbstractSubStep(activitydiagram_ActivityNode_TakeOfferdTokens1);
				if (result == null) result = caseActivitydiagram_DecisionNode_Execute_AbstractSubStep(activitydiagram_ActivityNode_TakeOfferdTokens1);
				if (result == null) result = caseActivitydiagram_ActivityFinalNode_Execute_AbstractSubStep(activitydiagram_ActivityNode_TakeOfferdTokens1);
				if (result == null) result = caseActivitydiagram_ActivityNode_Execute_AbstractSubStep(activitydiagram_ActivityNode_TakeOfferdTokens1);
				if (result == null) result = caseActivitydiagram_ForkNode_Execute_AbstractSubStep(activitydiagram_ActivityNode_TakeOfferdTokens1);
				if (result == null) result = caseSpecificStep(activitydiagram_ActivityNode_TakeOfferdTokens1);
				if (result == null) result = caseBigStep(activitydiagram_ActivityNode_TakeOfferdTokens1);
				if (result == null) result = caseStep(activitydiagram_ActivityNode_TakeOfferdTokens1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_ABSTRACT_SUB_STEP: {
				Activitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStep activitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStep = (Activitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStep)theEObject;
				T result = caseActivitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStep(activitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStep);
				if (result == null) result = caseSpecificStep(activitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStep);
				if (result == null) result = caseStep(activitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_IMPLICIT_STEP: {
				Activitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStep activitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStep = (Activitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStep)theEObject;
				T result = caseActivitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStep(activitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStep);
				if (result == null) result = caseActivitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStep(activitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStep);
				if (result == null) result = caseSmallStep(activitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStep);
				if (result == null) result = caseSpecificStep(activitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStep);
				if (result == null) result = caseStep(activitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStep);
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
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_INITIALIZE_CONTEXT: {
				Activitydiagram_Activity_InitializeContext activitydiagram_Activity_InitializeContext = (Activitydiagram_Activity_InitializeContext)theEObject;
				T result = caseActivitydiagram_Activity_InitializeContext(activitydiagram_Activity_InitializeContext);
				if (result == null) result = caseSpecificStep(activitydiagram_Activity_InitializeContext);
				if (result == null) result = caseSmallStep(activitydiagram_Activity_InitializeContext);
				if (result == null) result = caseStep(activitydiagram_Activity_InitializeContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_RESET: {
				Activitydiagram_Activity_Reset activitydiagram_Activity_Reset = (Activitydiagram_Activity_Reset)theEObject;
				T result = caseActivitydiagram_Activity_Reset(activitydiagram_Activity_Reset);
				if (result == null) result = caseActivitydiagram_Activity_WriteTrace_AbstractSubStep(activitydiagram_Activity_Reset);
				if (result == null) result = caseSmallStep(activitydiagram_Activity_Reset);
				if (result == null) result = caseSpecificStep(activitydiagram_Activity_Reset);
				if (result == null) result = caseStep(activitydiagram_Activity_Reset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE: {
				Activitydiagram_Activity_WriteTrace activitydiagram_Activity_WriteTrace = (Activitydiagram_Activity_WriteTrace)theEObject;
				T result = caseActivitydiagram_Activity_WriteTrace(activitydiagram_Activity_WriteTrace);
				if (result == null) result = caseSpecificStep(activitydiagram_Activity_WriteTrace);
				if (result == null) result = caseSequentialStep(activitydiagram_Activity_WriteTrace);
				if (result == null) result = caseBigStep(activitydiagram_Activity_WriteTrace);
				if (result == null) result = caseStep(activitydiagram_Activity_WriteTrace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_ABSTRACT_SUB_STEP: {
				Activitydiagram_Activity_WriteTrace_AbstractSubStep activitydiagram_Activity_WriteTrace_AbstractSubStep = (Activitydiagram_Activity_WriteTrace_AbstractSubStep)theEObject;
				T result = caseActivitydiagram_Activity_WriteTrace_AbstractSubStep(activitydiagram_Activity_WriteTrace_AbstractSubStep);
				if (result == null) result = caseSpecificStep(activitydiagram_Activity_WriteTrace_AbstractSubStep);
				if (result == null) result = caseStep(activitydiagram_Activity_WriteTrace_AbstractSubStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_IMPLICIT_STEP: {
				Activitydiagram_Activity_WriteTrace_ImplicitStep activitydiagram_Activity_WriteTrace_ImplicitStep = (Activitydiagram_Activity_WriteTrace_ImplicitStep)theEObject;
				T result = caseActivitydiagram_Activity_WriteTrace_ImplicitStep(activitydiagram_Activity_WriteTrace_ImplicitStep);
				if (result == null) result = caseActivitydiagram_Activity_WriteTrace_AbstractSubStep(activitydiagram_Activity_WriteTrace_ImplicitStep);
				if (result == null) result = caseSmallStep(activitydiagram_Activity_WriteTrace_ImplicitStep);
				if (result == null) result = caseSpecificStep(activitydiagram_Activity_WriteTrace_ImplicitStep);
				if (result == null) result = caseStep(activitydiagram_Activity_WriteTrace_ImplicitStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_BOOLEAN_BINARY_EXPRESSION_EXECUTE: {
				Activitydiagram_BooleanBinaryExpression_Execute activitydiagram_BooleanBinaryExpression_Execute = (Activitydiagram_BooleanBinaryExpression_Execute)theEObject;
				T result = caseActivitydiagram_BooleanBinaryExpression_Execute(activitydiagram_BooleanBinaryExpression_Execute);
				if (result == null) result = caseActivitydiagram_NamedElement_Execute_AbstractSubStep(activitydiagram_BooleanBinaryExpression_Execute);
				if (result == null) result = caseActivitydiagram_OpaqueAction_Execute_AbstractSubStep(activitydiagram_BooleanBinaryExpression_Execute);
				if (result == null) result = caseSmallStep(activitydiagram_BooleanBinaryExpression_Execute);
				if (result == null) result = caseActivitydiagram_ActivityNode_Execute_AbstractSubStep(activitydiagram_BooleanBinaryExpression_Execute);
				if (result == null) result = caseSpecificStep(activitydiagram_BooleanBinaryExpression_Execute);
				if (result == null) result = caseStep(activitydiagram_BooleanBinaryExpression_Execute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_BOOLEAN_UNARY_EXPRESSION_EXECUTE: {
				Activitydiagram_BooleanUnaryExpression_Execute activitydiagram_BooleanUnaryExpression_Execute = (Activitydiagram_BooleanUnaryExpression_Execute)theEObject;
				T result = caseActivitydiagram_BooleanUnaryExpression_Execute(activitydiagram_BooleanUnaryExpression_Execute);
				if (result == null) result = caseActivitydiagram_NamedElement_Execute_AbstractSubStep(activitydiagram_BooleanUnaryExpression_Execute);
				if (result == null) result = caseActivitydiagram_OpaqueAction_Execute_AbstractSubStep(activitydiagram_BooleanUnaryExpression_Execute);
				if (result == null) result = caseActivitydiagram_ActivityNode_Execute_AbstractSubStep(activitydiagram_BooleanUnaryExpression_Execute);
				if (result == null) result = caseSmallStep(activitydiagram_BooleanUnaryExpression_Execute);
				if (result == null) result = caseSpecificStep(activitydiagram_BooleanUnaryExpression_Execute);
				if (result == null) result = caseStep(activitydiagram_BooleanUnaryExpression_Execute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_EXECUTE: {
				Activitydiagram_BooleanVariable_Execute activitydiagram_BooleanVariable_Execute = (Activitydiagram_BooleanVariable_Execute)theEObject;
				T result = caseActivitydiagram_BooleanVariable_Execute(activitydiagram_BooleanVariable_Execute);
				if (result == null) result = caseSequentialStep(activitydiagram_BooleanVariable_Execute);
				if (result == null) result = caseActivitydiagram_BooleanVariable_Execute_AbstractSubStep(activitydiagram_BooleanVariable_Execute);
				if (result == null) result = caseSpecificStep(activitydiagram_BooleanVariable_Execute);
				if (result == null) result = caseBigStep(activitydiagram_BooleanVariable_Execute);
				if (result == null) result = caseStep(activitydiagram_BooleanVariable_Execute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_EXECUTE_ABSTRACT_SUB_STEP: {
				Activitydiagram_BooleanVariable_Execute_AbstractSubStep activitydiagram_BooleanVariable_Execute_AbstractSubStep = (Activitydiagram_BooleanVariable_Execute_AbstractSubStep)theEObject;
				T result = caseActivitydiagram_BooleanVariable_Execute_AbstractSubStep(activitydiagram_BooleanVariable_Execute_AbstractSubStep);
				if (result == null) result = caseSpecificStep(activitydiagram_BooleanVariable_Execute_AbstractSubStep);
				if (result == null) result = caseStep(activitydiagram_BooleanVariable_Execute_AbstractSubStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_EXECUTE_IMPLICIT_STEP: {
				Activitydiagram_BooleanVariable_Execute_ImplicitStep activitydiagram_BooleanVariable_Execute_ImplicitStep = (Activitydiagram_BooleanVariable_Execute_ImplicitStep)theEObject;
				T result = caseActivitydiagram_BooleanVariable_Execute_ImplicitStep(activitydiagram_BooleanVariable_Execute_ImplicitStep);
				if (result == null) result = caseActivitydiagram_BooleanVariable_Execute_AbstractSubStep(activitydiagram_BooleanVariable_Execute_ImplicitStep);
				if (result == null) result = caseSmallStep(activitydiagram_BooleanVariable_Execute_ImplicitStep);
				if (result == null) result = caseSpecificStep(activitydiagram_BooleanVariable_Execute_ImplicitStep);
				if (result == null) result = caseStep(activitydiagram_BooleanVariable_Execute_ImplicitStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_INIT: {
				Activitydiagram_BooleanVariable_Init activitydiagram_BooleanVariable_Init = (Activitydiagram_BooleanVariable_Init)theEObject;
				T result = caseActivitydiagram_BooleanVariable_Init(activitydiagram_BooleanVariable_Init);
				if (result == null) result = caseSmallStep(activitydiagram_BooleanVariable_Init);
				if (result == null) result = caseActivitydiagram_NamedElement_Execute_AbstractSubStep(activitydiagram_BooleanVariable_Init);
				if (result == null) result = caseActivitydiagram_Activity_Execute_AbstractSubStep(activitydiagram_BooleanVariable_Init);
				if (result == null) result = caseSpecificStep(activitydiagram_BooleanVariable_Init);
				if (result == null) result = caseStep(activitydiagram_BooleanVariable_Init);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_DECISION_NODE_EXECUTE: {
				Activitydiagram_DecisionNode_Execute activitydiagram_DecisionNode_Execute = (Activitydiagram_DecisionNode_Execute)theEObject;
				T result = caseActivitydiagram_DecisionNode_Execute(activitydiagram_DecisionNode_Execute);
				if (result == null) result = caseActivitydiagram_NamedElement_Execute_AbstractSubStep(activitydiagram_DecisionNode_Execute);
				if (result == null) result = caseSequentialStep(activitydiagram_DecisionNode_Execute);
				if (result == null) result = caseActivitydiagram_Activity_Execute_AbstractSubStep(activitydiagram_DecisionNode_Execute);
				if (result == null) result = caseSpecificStep(activitydiagram_DecisionNode_Execute);
				if (result == null) result = caseBigStep(activitydiagram_DecisionNode_Execute);
				if (result == null) result = caseStep(activitydiagram_DecisionNode_Execute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_DECISION_NODE_EXECUTE_ABSTRACT_SUB_STEP: {
				Activitydiagram_DecisionNode_Execute_AbstractSubStep activitydiagram_DecisionNode_Execute_AbstractSubStep = (Activitydiagram_DecisionNode_Execute_AbstractSubStep)theEObject;
				T result = caseActivitydiagram_DecisionNode_Execute_AbstractSubStep(activitydiagram_DecisionNode_Execute_AbstractSubStep);
				if (result == null) result = caseSpecificStep(activitydiagram_DecisionNode_Execute_AbstractSubStep);
				if (result == null) result = caseStep(activitydiagram_DecisionNode_Execute_AbstractSubStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_DECISION_NODE_EXECUTE_IMPLICIT_STEP: {
				Activitydiagram_DecisionNode_Execute_ImplicitStep activitydiagram_DecisionNode_Execute_ImplicitStep = (Activitydiagram_DecisionNode_Execute_ImplicitStep)theEObject;
				T result = caseActivitydiagram_DecisionNode_Execute_ImplicitStep(activitydiagram_DecisionNode_Execute_ImplicitStep);
				if (result == null) result = caseActivitydiagram_DecisionNode_Execute_AbstractSubStep(activitydiagram_DecisionNode_Execute_ImplicitStep);
				if (result == null) result = caseSmallStep(activitydiagram_DecisionNode_Execute_ImplicitStep);
				if (result == null) result = caseSpecificStep(activitydiagram_DecisionNode_Execute_ImplicitStep);
				if (result == null) result = caseStep(activitydiagram_DecisionNode_Execute_ImplicitStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_DECISION_NODE_SEND_OFFERS1: {
				Activitydiagram_DecisionNode_SendOffers1 activitydiagram_DecisionNode_SendOffers1 = (Activitydiagram_DecisionNode_SendOffers1)theEObject;
				T result = caseActivitydiagram_DecisionNode_SendOffers1(activitydiagram_DecisionNode_SendOffers1);
				if (result == null) result = caseActivitydiagram_MergeNode_Execute_AbstractSubStep(activitydiagram_DecisionNode_SendOffers1);
				if (result == null) result = caseSmallStep(activitydiagram_DecisionNode_SendOffers1);
				if (result == null) result = caseActivitydiagram_InitialNode_Execute_AbstractSubStep(activitydiagram_DecisionNode_SendOffers1);
				if (result == null) result = caseActivitydiagram_NamedElement_Execute_AbstractSubStep(activitydiagram_DecisionNode_SendOffers1);
				if (result == null) result = caseActivitydiagram_JoinNode_Execute_AbstractSubStep(activitydiagram_DecisionNode_SendOffers1);
				if (result == null) result = caseActivitydiagram_OpaqueAction_Execute_AbstractSubStep(activitydiagram_DecisionNode_SendOffers1);
				if (result == null) result = caseActivitydiagram_DecisionNode_Execute_AbstractSubStep(activitydiagram_DecisionNode_SendOffers1);
				if (result == null) result = caseActivitydiagram_ActivityFinalNode_Execute_AbstractSubStep(activitydiagram_DecisionNode_SendOffers1);
				if (result == null) result = caseActivitydiagram_ActivityNode_Execute_AbstractSubStep(activitydiagram_DecisionNode_SendOffers1);
				if (result == null) result = caseActivitydiagram_ForkNode_Execute_AbstractSubStep(activitydiagram_DecisionNode_SendOffers1);
				if (result == null) result = caseSpecificStep(activitydiagram_DecisionNode_SendOffers1);
				if (result == null) result = caseStep(activitydiagram_DecisionNode_SendOffers1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_EXPRESSION_EXECUTE: {
				Activitydiagram_Expression_Execute activitydiagram_Expression_Execute = (Activitydiagram_Expression_Execute)theEObject;
				T result = caseActivitydiagram_Expression_Execute(activitydiagram_Expression_Execute);
				if (result == null) result = caseActivitydiagram_NamedElement_Execute_AbstractSubStep(activitydiagram_Expression_Execute);
				if (result == null) result = caseActivitydiagram_OpaqueAction_Execute_AbstractSubStep(activitydiagram_Expression_Execute);
				if (result == null) result = caseActivitydiagram_ActivityNode_Execute_AbstractSubStep(activitydiagram_Expression_Execute);
				if (result == null) result = caseSmallStep(activitydiagram_Expression_Execute);
				if (result == null) result = caseSpecificStep(activitydiagram_Expression_Execute);
				if (result == null) result = caseStep(activitydiagram_Expression_Execute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_FORK_NODE_EXECUTE: {
				Activitydiagram_ForkNode_Execute activitydiagram_ForkNode_Execute = (Activitydiagram_ForkNode_Execute)theEObject;
				T result = caseActivitydiagram_ForkNode_Execute(activitydiagram_ForkNode_Execute);
				if (result == null) result = caseActivitydiagram_NamedElement_Execute_AbstractSubStep(activitydiagram_ForkNode_Execute);
				if (result == null) result = caseSequentialStep(activitydiagram_ForkNode_Execute);
				if (result == null) result = caseActivitydiagram_Activity_Execute_AbstractSubStep(activitydiagram_ForkNode_Execute);
				if (result == null) result = caseSpecificStep(activitydiagram_ForkNode_Execute);
				if (result == null) result = caseBigStep(activitydiagram_ForkNode_Execute);
				if (result == null) result = caseStep(activitydiagram_ForkNode_Execute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_FORK_NODE_EXECUTE_ABSTRACT_SUB_STEP: {
				Activitydiagram_ForkNode_Execute_AbstractSubStep activitydiagram_ForkNode_Execute_AbstractSubStep = (Activitydiagram_ForkNode_Execute_AbstractSubStep)theEObject;
				T result = caseActivitydiagram_ForkNode_Execute_AbstractSubStep(activitydiagram_ForkNode_Execute_AbstractSubStep);
				if (result == null) result = caseSpecificStep(activitydiagram_ForkNode_Execute_AbstractSubStep);
				if (result == null) result = caseStep(activitydiagram_ForkNode_Execute_AbstractSubStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_FORK_NODE_EXECUTE_IMPLICIT_STEP: {
				Activitydiagram_ForkNode_Execute_ImplicitStep activitydiagram_ForkNode_Execute_ImplicitStep = (Activitydiagram_ForkNode_Execute_ImplicitStep)theEObject;
				T result = caseActivitydiagram_ForkNode_Execute_ImplicitStep(activitydiagram_ForkNode_Execute_ImplicitStep);
				if (result == null) result = caseActivitydiagram_ForkNode_Execute_AbstractSubStep(activitydiagram_ForkNode_Execute_ImplicitStep);
				if (result == null) result = caseSmallStep(activitydiagram_ForkNode_Execute_ImplicitStep);
				if (result == null) result = caseSpecificStep(activitydiagram_ForkNode_Execute_ImplicitStep);
				if (result == null) result = caseStep(activitydiagram_ForkNode_Execute_ImplicitStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_INITIAL_NODE_EXECUTE: {
				Activitydiagram_InitialNode_Execute activitydiagram_InitialNode_Execute = (Activitydiagram_InitialNode_Execute)theEObject;
				T result = caseActivitydiagram_InitialNode_Execute(activitydiagram_InitialNode_Execute);
				if (result == null) result = caseSequentialStep(activitydiagram_InitialNode_Execute);
				if (result == null) result = caseActivitydiagram_NamedElement_Execute_AbstractSubStep(activitydiagram_InitialNode_Execute);
				if (result == null) result = caseActivitydiagram_Activity_Execute_AbstractSubStep(activitydiagram_InitialNode_Execute);
				if (result == null) result = caseSpecificStep(activitydiagram_InitialNode_Execute);
				if (result == null) result = caseBigStep(activitydiagram_InitialNode_Execute);
				if (result == null) result = caseStep(activitydiagram_InitialNode_Execute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_INITIAL_NODE_EXECUTE_ABSTRACT_SUB_STEP: {
				Activitydiagram_InitialNode_Execute_AbstractSubStep activitydiagram_InitialNode_Execute_AbstractSubStep = (Activitydiagram_InitialNode_Execute_AbstractSubStep)theEObject;
				T result = caseActivitydiagram_InitialNode_Execute_AbstractSubStep(activitydiagram_InitialNode_Execute_AbstractSubStep);
				if (result == null) result = caseSpecificStep(activitydiagram_InitialNode_Execute_AbstractSubStep);
				if (result == null) result = caseStep(activitydiagram_InitialNode_Execute_AbstractSubStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_INITIAL_NODE_EXECUTE_IMPLICIT_STEP: {
				Activitydiagram_InitialNode_Execute_ImplicitStep activitydiagram_InitialNode_Execute_ImplicitStep = (Activitydiagram_InitialNode_Execute_ImplicitStep)theEObject;
				T result = caseActivitydiagram_InitialNode_Execute_ImplicitStep(activitydiagram_InitialNode_Execute_ImplicitStep);
				if (result == null) result = caseActivitydiagram_InitialNode_Execute_AbstractSubStep(activitydiagram_InitialNode_Execute_ImplicitStep);
				if (result == null) result = caseSmallStep(activitydiagram_InitialNode_Execute_ImplicitStep);
				if (result == null) result = caseSpecificStep(activitydiagram_InitialNode_Execute_ImplicitStep);
				if (result == null) result = caseStep(activitydiagram_InitialNode_Execute_ImplicitStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_INTEGER_CALCULATION_EXPRESSION_EXECUTE: {
				Activitydiagram_IntegerCalculationExpression_Execute activitydiagram_IntegerCalculationExpression_Execute = (Activitydiagram_IntegerCalculationExpression_Execute)theEObject;
				T result = caseActivitydiagram_IntegerCalculationExpression_Execute(activitydiagram_IntegerCalculationExpression_Execute);
				if (result == null) result = caseActivitydiagram_NamedElement_Execute_AbstractSubStep(activitydiagram_IntegerCalculationExpression_Execute);
				if (result == null) result = caseActivitydiagram_OpaqueAction_Execute_AbstractSubStep(activitydiagram_IntegerCalculationExpression_Execute);
				if (result == null) result = caseSmallStep(activitydiagram_IntegerCalculationExpression_Execute);
				if (result == null) result = caseActivitydiagram_ActivityNode_Execute_AbstractSubStep(activitydiagram_IntegerCalculationExpression_Execute);
				if (result == null) result = caseSpecificStep(activitydiagram_IntegerCalculationExpression_Execute);
				if (result == null) result = caseStep(activitydiagram_IntegerCalculationExpression_Execute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_INTEGER_COMPARISON_EXPRESSION_EXECUTE: {
				Activitydiagram_IntegerComparisonExpression_Execute activitydiagram_IntegerComparisonExpression_Execute = (Activitydiagram_IntegerComparisonExpression_Execute)theEObject;
				T result = caseActivitydiagram_IntegerComparisonExpression_Execute(activitydiagram_IntegerComparisonExpression_Execute);
				if (result == null) result = caseActivitydiagram_NamedElement_Execute_AbstractSubStep(activitydiagram_IntegerComparisonExpression_Execute);
				if (result == null) result = caseSmallStep(activitydiagram_IntegerComparisonExpression_Execute);
				if (result == null) result = caseActivitydiagram_OpaqueAction_Execute_AbstractSubStep(activitydiagram_IntegerComparisonExpression_Execute);
				if (result == null) result = caseActivitydiagram_ActivityNode_Execute_AbstractSubStep(activitydiagram_IntegerComparisonExpression_Execute);
				if (result == null) result = caseSpecificStep(activitydiagram_IntegerComparisonExpression_Execute);
				if (result == null) result = caseStep(activitydiagram_IntegerComparisonExpression_Execute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_INTEGER_VARIABLE_EXECUTE: {
				Activitydiagram_IntegerVariable_Execute activitydiagram_IntegerVariable_Execute = (Activitydiagram_IntegerVariable_Execute)theEObject;
				T result = caseActivitydiagram_IntegerVariable_Execute(activitydiagram_IntegerVariable_Execute);
				if (result == null) result = caseActivitydiagram_BooleanVariable_Execute_AbstractSubStep(activitydiagram_IntegerVariable_Execute);
				if (result == null) result = caseSmallStep(activitydiagram_IntegerVariable_Execute);
				if (result == null) result = caseSpecificStep(activitydiagram_IntegerVariable_Execute);
				if (result == null) result = caseStep(activitydiagram_IntegerVariable_Execute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_INTEGER_VARIABLE_INIT: {
				Activitydiagram_IntegerVariable_Init activitydiagram_IntegerVariable_Init = (Activitydiagram_IntegerVariable_Init)theEObject;
				T result = caseActivitydiagram_IntegerVariable_Init(activitydiagram_IntegerVariable_Init);
				if (result == null) result = caseSmallStep(activitydiagram_IntegerVariable_Init);
				if (result == null) result = caseActivitydiagram_NamedElement_Execute_AbstractSubStep(activitydiagram_IntegerVariable_Init);
				if (result == null) result = caseActivitydiagram_Activity_Execute_AbstractSubStep(activitydiagram_IntegerVariable_Init);
				if (result == null) result = caseSpecificStep(activitydiagram_IntegerVariable_Init);
				if (result == null) result = caseStep(activitydiagram_IntegerVariable_Init);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_JOIN_NODE_EXECUTE: {
				Activitydiagram_JoinNode_Execute activitydiagram_JoinNode_Execute = (Activitydiagram_JoinNode_Execute)theEObject;
				T result = caseActivitydiagram_JoinNode_Execute(activitydiagram_JoinNode_Execute);
				if (result == null) result = caseActivitydiagram_NamedElement_Execute_AbstractSubStep(activitydiagram_JoinNode_Execute);
				if (result == null) result = caseSequentialStep(activitydiagram_JoinNode_Execute);
				if (result == null) result = caseActivitydiagram_Activity_Execute_AbstractSubStep(activitydiagram_JoinNode_Execute);
				if (result == null) result = caseSpecificStep(activitydiagram_JoinNode_Execute);
				if (result == null) result = caseBigStep(activitydiagram_JoinNode_Execute);
				if (result == null) result = caseStep(activitydiagram_JoinNode_Execute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_JOIN_NODE_EXECUTE_ABSTRACT_SUB_STEP: {
				Activitydiagram_JoinNode_Execute_AbstractSubStep activitydiagram_JoinNode_Execute_AbstractSubStep = (Activitydiagram_JoinNode_Execute_AbstractSubStep)theEObject;
				T result = caseActivitydiagram_JoinNode_Execute_AbstractSubStep(activitydiagram_JoinNode_Execute_AbstractSubStep);
				if (result == null) result = caseSpecificStep(activitydiagram_JoinNode_Execute_AbstractSubStep);
				if (result == null) result = caseStep(activitydiagram_JoinNode_Execute_AbstractSubStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_JOIN_NODE_EXECUTE_IMPLICIT_STEP: {
				Activitydiagram_JoinNode_Execute_ImplicitStep activitydiagram_JoinNode_Execute_ImplicitStep = (Activitydiagram_JoinNode_Execute_ImplicitStep)theEObject;
				T result = caseActivitydiagram_JoinNode_Execute_ImplicitStep(activitydiagram_JoinNode_Execute_ImplicitStep);
				if (result == null) result = caseActivitydiagram_JoinNode_Execute_AbstractSubStep(activitydiagram_JoinNode_Execute_ImplicitStep);
				if (result == null) result = caseSmallStep(activitydiagram_JoinNode_Execute_ImplicitStep);
				if (result == null) result = caseSpecificStep(activitydiagram_JoinNode_Execute_ImplicitStep);
				if (result == null) result = caseStep(activitydiagram_JoinNode_Execute_ImplicitStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_MERGE_NODE_EXECUTE: {
				Activitydiagram_MergeNode_Execute activitydiagram_MergeNode_Execute = (Activitydiagram_MergeNode_Execute)theEObject;
				T result = caseActivitydiagram_MergeNode_Execute(activitydiagram_MergeNode_Execute);
				if (result == null) result = caseSequentialStep(activitydiagram_MergeNode_Execute);
				if (result == null) result = caseActivitydiagram_NamedElement_Execute_AbstractSubStep(activitydiagram_MergeNode_Execute);
				if (result == null) result = caseActivitydiagram_Activity_Execute_AbstractSubStep(activitydiagram_MergeNode_Execute);
				if (result == null) result = caseSpecificStep(activitydiagram_MergeNode_Execute);
				if (result == null) result = caseBigStep(activitydiagram_MergeNode_Execute);
				if (result == null) result = caseStep(activitydiagram_MergeNode_Execute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_MERGE_NODE_EXECUTE_ABSTRACT_SUB_STEP: {
				Activitydiagram_MergeNode_Execute_AbstractSubStep activitydiagram_MergeNode_Execute_AbstractSubStep = (Activitydiagram_MergeNode_Execute_AbstractSubStep)theEObject;
				T result = caseActivitydiagram_MergeNode_Execute_AbstractSubStep(activitydiagram_MergeNode_Execute_AbstractSubStep);
				if (result == null) result = caseSpecificStep(activitydiagram_MergeNode_Execute_AbstractSubStep);
				if (result == null) result = caseStep(activitydiagram_MergeNode_Execute_AbstractSubStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_MERGE_NODE_EXECUTE_IMPLICIT_STEP: {
				Activitydiagram_MergeNode_Execute_ImplicitStep activitydiagram_MergeNode_Execute_ImplicitStep = (Activitydiagram_MergeNode_Execute_ImplicitStep)theEObject;
				T result = caseActivitydiagram_MergeNode_Execute_ImplicitStep(activitydiagram_MergeNode_Execute_ImplicitStep);
				if (result == null) result = caseActivitydiagram_MergeNode_Execute_AbstractSubStep(activitydiagram_MergeNode_Execute_ImplicitStep);
				if (result == null) result = caseSmallStep(activitydiagram_MergeNode_Execute_ImplicitStep);
				if (result == null) result = caseSpecificStep(activitydiagram_MergeNode_Execute_ImplicitStep);
				if (result == null) result = caseStep(activitydiagram_MergeNode_Execute_ImplicitStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE: {
				Activitydiagram_NamedElement_Execute activitydiagram_NamedElement_Execute = (Activitydiagram_NamedElement_Execute)theEObject;
				T result = caseActivitydiagram_NamedElement_Execute(activitydiagram_NamedElement_Execute);
				if (result == null) result = caseSpecificStep(activitydiagram_NamedElement_Execute);
				if (result == null) result = caseSequentialStep(activitydiagram_NamedElement_Execute);
				if (result == null) result = caseBigStep(activitydiagram_NamedElement_Execute);
				if (result == null) result = caseStep(activitydiagram_NamedElement_Execute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_ABSTRACT_SUB_STEP: {
				Activitydiagram_NamedElement_Execute_AbstractSubStep activitydiagram_NamedElement_Execute_AbstractSubStep = (Activitydiagram_NamedElement_Execute_AbstractSubStep)theEObject;
				T result = caseActivitydiagram_NamedElement_Execute_AbstractSubStep(activitydiagram_NamedElement_Execute_AbstractSubStep);
				if (result == null) result = caseSpecificStep(activitydiagram_NamedElement_Execute_AbstractSubStep);
				if (result == null) result = caseStep(activitydiagram_NamedElement_Execute_AbstractSubStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_IMPLICIT_STEP: {
				Activitydiagram_NamedElement_Execute_ImplicitStep activitydiagram_NamedElement_Execute_ImplicitStep = (Activitydiagram_NamedElement_Execute_ImplicitStep)theEObject;
				T result = caseActivitydiagram_NamedElement_Execute_ImplicitStep(activitydiagram_NamedElement_Execute_ImplicitStep);
				if (result == null) result = caseActivitydiagram_NamedElement_Execute_AbstractSubStep(activitydiagram_NamedElement_Execute_ImplicitStep);
				if (result == null) result = caseSmallStep(activitydiagram_NamedElement_Execute_ImplicitStep);
				if (result == null) result = caseSpecificStep(activitydiagram_NamedElement_Execute_ImplicitStep);
				if (result == null) result = caseStep(activitydiagram_NamedElement_Execute_ImplicitStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_OPAQUE_ACTION_EXECUTE: {
				Activitydiagram_OpaqueAction_Execute activitydiagram_OpaqueAction_Execute = (Activitydiagram_OpaqueAction_Execute)theEObject;
				T result = caseActivitydiagram_OpaqueAction_Execute(activitydiagram_OpaqueAction_Execute);
				if (result == null) result = caseActivitydiagram_NamedElement_Execute_AbstractSubStep(activitydiagram_OpaqueAction_Execute);
				if (result == null) result = caseSequentialStep(activitydiagram_OpaqueAction_Execute);
				if (result == null) result = caseActivitydiagram_Activity_Execute_AbstractSubStep(activitydiagram_OpaqueAction_Execute);
				if (result == null) result = caseSpecificStep(activitydiagram_OpaqueAction_Execute);
				if (result == null) result = caseBigStep(activitydiagram_OpaqueAction_Execute);
				if (result == null) result = caseStep(activitydiagram_OpaqueAction_Execute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_OPAQUE_ACTION_EXECUTE_ABSTRACT_SUB_STEP: {
				Activitydiagram_OpaqueAction_Execute_AbstractSubStep activitydiagram_OpaqueAction_Execute_AbstractSubStep = (Activitydiagram_OpaqueAction_Execute_AbstractSubStep)theEObject;
				T result = caseActivitydiagram_OpaqueAction_Execute_AbstractSubStep(activitydiagram_OpaqueAction_Execute_AbstractSubStep);
				if (result == null) result = caseSpecificStep(activitydiagram_OpaqueAction_Execute_AbstractSubStep);
				if (result == null) result = caseStep(activitydiagram_OpaqueAction_Execute_AbstractSubStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ACTIVITYDIAGRAM_OPAQUE_ACTION_EXECUTE_IMPLICIT_STEP: {
				Activitydiagram_OpaqueAction_Execute_ImplicitStep activitydiagram_OpaqueAction_Execute_ImplicitStep = (Activitydiagram_OpaqueAction_Execute_ImplicitStep)theEObject;
				T result = caseActivitydiagram_OpaqueAction_Execute_ImplicitStep(activitydiagram_OpaqueAction_Execute_ImplicitStep);
				if (result == null) result = caseActivitydiagram_OpaqueAction_Execute_AbstractSubStep(activitydiagram_OpaqueAction_Execute_ImplicitStep);
				if (result == null) result = caseSmallStep(activitydiagram_OpaqueAction_Execute_ImplicitStep);
				if (result == null) result = caseSpecificStep(activitydiagram_OpaqueAction_Execute_ImplicitStep);
				if (result == null) result = caseStep(activitydiagram_OpaqueAction_Execute_ImplicitStep);
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
	 * Returns the result of interpreting the object as an instance of '<em>Activitydiagram Activity Final Node Execute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activitydiagram Activity Final Node Execute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivitydiagram_ActivityFinalNode_Execute(Activitydiagram_ActivityFinalNode_Execute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activitydiagram Activity Final Node Execute Abstract Sub Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activitydiagram Activity Final Node Execute Abstract Sub Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivitydiagram_ActivityFinalNode_Execute_AbstractSubStep(Activitydiagram_ActivityFinalNode_Execute_AbstractSubStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activitydiagram Activity Final Node Execute Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activitydiagram Activity Final Node Execute Implicit Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivitydiagram_ActivityFinalNode_Execute_ImplicitStep(Activitydiagram_ActivityFinalNode_Execute_ImplicitStep object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Activitydiagram Boolean Binary Expression Execute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activitydiagram Boolean Binary Expression Execute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivitydiagram_BooleanBinaryExpression_Execute(Activitydiagram_BooleanBinaryExpression_Execute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activitydiagram Boolean Unary Expression Execute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activitydiagram Boolean Unary Expression Execute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivitydiagram_BooleanUnaryExpression_Execute(Activitydiagram_BooleanUnaryExpression_Execute object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Activitydiagram Boolean Variable Execute Abstract Sub Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activitydiagram Boolean Variable Execute Abstract Sub Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivitydiagram_BooleanVariable_Execute_AbstractSubStep(Activitydiagram_BooleanVariable_Execute_AbstractSubStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activitydiagram Boolean Variable Execute Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activitydiagram Boolean Variable Execute Implicit Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivitydiagram_BooleanVariable_Execute_ImplicitStep(Activitydiagram_BooleanVariable_Execute_ImplicitStep object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Activitydiagram Decision Node Execute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activitydiagram Decision Node Execute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivitydiagram_DecisionNode_Execute(Activitydiagram_DecisionNode_Execute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activitydiagram Decision Node Execute Abstract Sub Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activitydiagram Decision Node Execute Abstract Sub Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivitydiagram_DecisionNode_Execute_AbstractSubStep(Activitydiagram_DecisionNode_Execute_AbstractSubStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activitydiagram Decision Node Execute Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activitydiagram Decision Node Execute Implicit Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivitydiagram_DecisionNode_Execute_ImplicitStep(Activitydiagram_DecisionNode_Execute_ImplicitStep object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Activitydiagram Expression Execute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activitydiagram Expression Execute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivitydiagram_Expression_Execute(Activitydiagram_Expression_Execute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activitydiagram Fork Node Execute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activitydiagram Fork Node Execute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivitydiagram_ForkNode_Execute(Activitydiagram_ForkNode_Execute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activitydiagram Fork Node Execute Abstract Sub Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activitydiagram Fork Node Execute Abstract Sub Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivitydiagram_ForkNode_Execute_AbstractSubStep(Activitydiagram_ForkNode_Execute_AbstractSubStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activitydiagram Fork Node Execute Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activitydiagram Fork Node Execute Implicit Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivitydiagram_ForkNode_Execute_ImplicitStep(Activitydiagram_ForkNode_Execute_ImplicitStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activitydiagram Initial Node Execute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activitydiagram Initial Node Execute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivitydiagram_InitialNode_Execute(Activitydiagram_InitialNode_Execute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activitydiagram Initial Node Execute Abstract Sub Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activitydiagram Initial Node Execute Abstract Sub Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivitydiagram_InitialNode_Execute_AbstractSubStep(Activitydiagram_InitialNode_Execute_AbstractSubStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activitydiagram Initial Node Execute Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activitydiagram Initial Node Execute Implicit Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivitydiagram_InitialNode_Execute_ImplicitStep(Activitydiagram_InitialNode_Execute_ImplicitStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activitydiagram Integer Calculation Expression Execute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activitydiagram Integer Calculation Expression Execute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivitydiagram_IntegerCalculationExpression_Execute(Activitydiagram_IntegerCalculationExpression_Execute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activitydiagram Integer Comparison Expression Execute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activitydiagram Integer Comparison Expression Execute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivitydiagram_IntegerComparisonExpression_Execute(Activitydiagram_IntegerComparisonExpression_Execute object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Activitydiagram Join Node Execute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activitydiagram Join Node Execute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivitydiagram_JoinNode_Execute(Activitydiagram_JoinNode_Execute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activitydiagram Join Node Execute Abstract Sub Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activitydiagram Join Node Execute Abstract Sub Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivitydiagram_JoinNode_Execute_AbstractSubStep(Activitydiagram_JoinNode_Execute_AbstractSubStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activitydiagram Join Node Execute Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activitydiagram Join Node Execute Implicit Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivitydiagram_JoinNode_Execute_ImplicitStep(Activitydiagram_JoinNode_Execute_ImplicitStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activitydiagram Merge Node Execute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activitydiagram Merge Node Execute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivitydiagram_MergeNode_Execute(Activitydiagram_MergeNode_Execute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activitydiagram Merge Node Execute Abstract Sub Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activitydiagram Merge Node Execute Abstract Sub Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivitydiagram_MergeNode_Execute_AbstractSubStep(Activitydiagram_MergeNode_Execute_AbstractSubStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activitydiagram Merge Node Execute Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activitydiagram Merge Node Execute Implicit Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivitydiagram_MergeNode_Execute_ImplicitStep(Activitydiagram_MergeNode_Execute_ImplicitStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activitydiagram Named Element Execute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activitydiagram Named Element Execute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivitydiagram_NamedElement_Execute(Activitydiagram_NamedElement_Execute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activitydiagram Named Element Execute Abstract Sub Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activitydiagram Named Element Execute Abstract Sub Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivitydiagram_NamedElement_Execute_AbstractSubStep(Activitydiagram_NamedElement_Execute_AbstractSubStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activitydiagram Named Element Execute Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activitydiagram Named Element Execute Implicit Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivitydiagram_NamedElement_Execute_ImplicitStep(Activitydiagram_NamedElement_Execute_ImplicitStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activitydiagram Opaque Action Execute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activitydiagram Opaque Action Execute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivitydiagram_OpaqueAction_Execute(Activitydiagram_OpaqueAction_Execute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activitydiagram Opaque Action Execute Abstract Sub Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activitydiagram Opaque Action Execute Abstract Sub Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivitydiagram_OpaqueAction_Execute_AbstractSubStep(Activitydiagram_OpaqueAction_Execute_AbstractSubStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activitydiagram Opaque Action Execute Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activitydiagram Opaque Action Execute Implicit Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivitydiagram_OpaqueAction_Execute_ImplicitStep(Activitydiagram_OpaqueAction_Execute_ImplicitStep object) {
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
	public T caseStep(Step object) {
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
	public <StepSubtype extends Step> T caseBigStep(BigStep<StepSubtype> object) {
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
	public <StepSubtype extends Step> T caseSequentialStep(SequentialStep<StepSubtype> object) {
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
