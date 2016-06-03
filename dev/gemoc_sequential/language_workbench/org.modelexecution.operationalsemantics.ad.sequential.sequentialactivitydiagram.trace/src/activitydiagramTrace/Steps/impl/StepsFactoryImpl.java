/**
 */
package activitydiagramTrace.Steps.impl;

import activitydiagramTrace.Steps.*;

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
public class StepsFactoryImpl extends EFactoryImpl implements StepsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StepsFactory init() {
		try {
			StepsFactory theStepsFactory = (StepsFactory)EPackage.Registry.INSTANCE.getEFactory(StepsPackage.eNS_URI);
			if (theStepsFactory != null) {
				return theStepsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StepsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepsFactoryImpl() {
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
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_FINAL_NODE_EXECUTE: return createActivitydiagram_ActivityFinalNode_Execute();
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_FINAL_NODE_EXECUTE_IMPLICIT_STEP: return createActivitydiagram_ActivityFinalNode_Execute_ImplicitStep();
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1: return createActivitydiagram_ActivityNode_AddTokens1();
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_IMPLICIT_STEP: return createActivitydiagram_ActivityNode_AddTokens1_ImplicitStep();
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE: return createActivitydiagram_ActivityNode_Execute();
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_IMPLICIT_STEP: return createActivitydiagram_ActivityNode_Execute_ImplicitStep();
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN1: return createActivitydiagram_ActivityNode_RemoveToken1();
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1: return createActivitydiagram_ActivityNode_SendOffers1();
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1: return createActivitydiagram_ActivityNode_TakeOfferdTokens1();
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_IMPLICIT_STEP: return createActivitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStep();
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE: return createActivitydiagram_ActivityNode_Terminate();
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_EXECUTE: return createActivitydiagram_Activity_Execute();
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_IMPLICIT_STEP: return createActivitydiagram_Activity_Execute_ImplicitStep();
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_INITIALIZE_CONTEXT: return createActivitydiagram_Activity_InitializeContext();
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_RESET: return createActivitydiagram_Activity_Reset();
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE: return createActivitydiagram_Activity_WriteTrace();
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_WRITE_TRACE_IMPLICIT_STEP: return createActivitydiagram_Activity_WriteTrace_ImplicitStep();
			case StepsPackage.ACTIVITYDIAGRAM_BOOLEAN_BINARY_EXPRESSION_EXECUTE: return createActivitydiagram_BooleanBinaryExpression_Execute();
			case StepsPackage.ACTIVITYDIAGRAM_BOOLEAN_UNARY_EXPRESSION_EXECUTE: return createActivitydiagram_BooleanUnaryExpression_Execute();
			case StepsPackage.ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_EXECUTE: return createActivitydiagram_BooleanVariable_Execute();
			case StepsPackage.ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_EXECUTE_IMPLICIT_STEP: return createActivitydiagram_BooleanVariable_Execute_ImplicitStep();
			case StepsPackage.ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_INIT: return createActivitydiagram_BooleanVariable_Init();
			case StepsPackage.ACTIVITYDIAGRAM_DECISION_NODE_EXECUTE: return createActivitydiagram_DecisionNode_Execute();
			case StepsPackage.ACTIVITYDIAGRAM_DECISION_NODE_EXECUTE_IMPLICIT_STEP: return createActivitydiagram_DecisionNode_Execute_ImplicitStep();
			case StepsPackage.ACTIVITYDIAGRAM_DECISION_NODE_SEND_OFFERS1: return createActivitydiagram_DecisionNode_SendOffers1();
			case StepsPackage.ACTIVITYDIAGRAM_EXPRESSION_EXECUTE: return createActivitydiagram_Expression_Execute();
			case StepsPackage.ACTIVITYDIAGRAM_FORK_NODE_EXECUTE: return createActivitydiagram_ForkNode_Execute();
			case StepsPackage.ACTIVITYDIAGRAM_FORK_NODE_EXECUTE_IMPLICIT_STEP: return createActivitydiagram_ForkNode_Execute_ImplicitStep();
			case StepsPackage.ACTIVITYDIAGRAM_INITIAL_NODE_EXECUTE: return createActivitydiagram_InitialNode_Execute();
			case StepsPackage.ACTIVITYDIAGRAM_INITIAL_NODE_EXECUTE_IMPLICIT_STEP: return createActivitydiagram_InitialNode_Execute_ImplicitStep();
			case StepsPackage.ACTIVITYDIAGRAM_INTEGER_CALCULATION_EXPRESSION_EXECUTE: return createActivitydiagram_IntegerCalculationExpression_Execute();
			case StepsPackage.ACTIVITYDIAGRAM_INTEGER_COMPARISON_EXPRESSION_EXECUTE: return createActivitydiagram_IntegerComparisonExpression_Execute();
			case StepsPackage.ACTIVITYDIAGRAM_INTEGER_VARIABLE_EXECUTE: return createActivitydiagram_IntegerVariable_Execute();
			case StepsPackage.ACTIVITYDIAGRAM_INTEGER_VARIABLE_INIT: return createActivitydiagram_IntegerVariable_Init();
			case StepsPackage.ACTIVITYDIAGRAM_JOIN_NODE_EXECUTE: return createActivitydiagram_JoinNode_Execute();
			case StepsPackage.ACTIVITYDIAGRAM_JOIN_NODE_EXECUTE_IMPLICIT_STEP: return createActivitydiagram_JoinNode_Execute_ImplicitStep();
			case StepsPackage.ACTIVITYDIAGRAM_MERGE_NODE_EXECUTE: return createActivitydiagram_MergeNode_Execute();
			case StepsPackage.ACTIVITYDIAGRAM_MERGE_NODE_EXECUTE_IMPLICIT_STEP: return createActivitydiagram_MergeNode_Execute_ImplicitStep();
			case StepsPackage.ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE: return createActivitydiagram_NamedElement_Execute();
			case StepsPackage.ACTIVITYDIAGRAM_NAMED_ELEMENT_EXECUTE_IMPLICIT_STEP: return createActivitydiagram_NamedElement_Execute_ImplicitStep();
			case StepsPackage.ACTIVITYDIAGRAM_OPAQUE_ACTION_EXECUTE: return createActivitydiagram_OpaqueAction_Execute();
			case StepsPackage.ACTIVITYDIAGRAM_OPAQUE_ACTION_EXECUTE_IMPLICIT_STEP: return createActivitydiagram_OpaqueAction_Execute_ImplicitStep();
			case StepsPackage.ROOT_IMPLICIT_STEP: return createRootImplicitStep();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activitydiagram_ActivityFinalNode_Execute createActivitydiagram_ActivityFinalNode_Execute() {
		Activitydiagram_ActivityFinalNode_ExecuteImpl activitydiagram_ActivityFinalNode_Execute = new Activitydiagram_ActivityFinalNode_ExecuteImpl();
		return activitydiagram_ActivityFinalNode_Execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activitydiagram_ActivityFinalNode_Execute_ImplicitStep createActivitydiagram_ActivityFinalNode_Execute_ImplicitStep() {
		Activitydiagram_ActivityFinalNode_Execute_ImplicitStepImpl activitydiagram_ActivityFinalNode_Execute_ImplicitStep = new Activitydiagram_ActivityFinalNode_Execute_ImplicitStepImpl();
		return activitydiagram_ActivityFinalNode_Execute_ImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activitydiagram_ActivityNode_AddTokens1 createActivitydiagram_ActivityNode_AddTokens1() {
		Activitydiagram_ActivityNode_AddTokens1Impl activitydiagram_ActivityNode_AddTokens1 = new Activitydiagram_ActivityNode_AddTokens1Impl();
		return activitydiagram_ActivityNode_AddTokens1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activitydiagram_ActivityNode_AddTokens1_ImplicitStep createActivitydiagram_ActivityNode_AddTokens1_ImplicitStep() {
		Activitydiagram_ActivityNode_AddTokens1_ImplicitStepImpl activitydiagram_ActivityNode_AddTokens1_ImplicitStep = new Activitydiagram_ActivityNode_AddTokens1_ImplicitStepImpl();
		return activitydiagram_ActivityNode_AddTokens1_ImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activitydiagram_ActivityNode_Execute createActivitydiagram_ActivityNode_Execute() {
		Activitydiagram_ActivityNode_ExecuteImpl activitydiagram_ActivityNode_Execute = new Activitydiagram_ActivityNode_ExecuteImpl();
		return activitydiagram_ActivityNode_Execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activitydiagram_ActivityNode_Execute_ImplicitStep createActivitydiagram_ActivityNode_Execute_ImplicitStep() {
		Activitydiagram_ActivityNode_Execute_ImplicitStepImpl activitydiagram_ActivityNode_Execute_ImplicitStep = new Activitydiagram_ActivityNode_Execute_ImplicitStepImpl();
		return activitydiagram_ActivityNode_Execute_ImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activitydiagram_ActivityNode_RemoveToken1 createActivitydiagram_ActivityNode_RemoveToken1() {
		Activitydiagram_ActivityNode_RemoveToken1Impl activitydiagram_ActivityNode_RemoveToken1 = new Activitydiagram_ActivityNode_RemoveToken1Impl();
		return activitydiagram_ActivityNode_RemoveToken1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activitydiagram_ActivityNode_SendOffers1 createActivitydiagram_ActivityNode_SendOffers1() {
		Activitydiagram_ActivityNode_SendOffers1Impl activitydiagram_ActivityNode_SendOffers1 = new Activitydiagram_ActivityNode_SendOffers1Impl();
		return activitydiagram_ActivityNode_SendOffers1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activitydiagram_ActivityNode_TakeOfferdTokens1 createActivitydiagram_ActivityNode_TakeOfferdTokens1() {
		Activitydiagram_ActivityNode_TakeOfferdTokens1Impl activitydiagram_ActivityNode_TakeOfferdTokens1 = new Activitydiagram_ActivityNode_TakeOfferdTokens1Impl();
		return activitydiagram_ActivityNode_TakeOfferdTokens1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStep createActivitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStep() {
		Activitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStepImpl activitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStep = new Activitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStepImpl();
		return activitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activitydiagram_ActivityNode_Terminate createActivitydiagram_ActivityNode_Terminate() {
		Activitydiagram_ActivityNode_TerminateImpl activitydiagram_ActivityNode_Terminate = new Activitydiagram_ActivityNode_TerminateImpl();
		return activitydiagram_ActivityNode_Terminate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activitydiagram_Activity_Execute createActivitydiagram_Activity_Execute() {
		Activitydiagram_Activity_ExecuteImpl activitydiagram_Activity_Execute = new Activitydiagram_Activity_ExecuteImpl();
		return activitydiagram_Activity_Execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activitydiagram_Activity_Execute_ImplicitStep createActivitydiagram_Activity_Execute_ImplicitStep() {
		Activitydiagram_Activity_Execute_ImplicitStepImpl activitydiagram_Activity_Execute_ImplicitStep = new Activitydiagram_Activity_Execute_ImplicitStepImpl();
		return activitydiagram_Activity_Execute_ImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activitydiagram_Activity_InitializeContext createActivitydiagram_Activity_InitializeContext() {
		Activitydiagram_Activity_InitializeContextImpl activitydiagram_Activity_InitializeContext = new Activitydiagram_Activity_InitializeContextImpl();
		return activitydiagram_Activity_InitializeContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activitydiagram_Activity_Reset createActivitydiagram_Activity_Reset() {
		Activitydiagram_Activity_ResetImpl activitydiagram_Activity_Reset = new Activitydiagram_Activity_ResetImpl();
		return activitydiagram_Activity_Reset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activitydiagram_Activity_WriteTrace createActivitydiagram_Activity_WriteTrace() {
		Activitydiagram_Activity_WriteTraceImpl activitydiagram_Activity_WriteTrace = new Activitydiagram_Activity_WriteTraceImpl();
		return activitydiagram_Activity_WriteTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activitydiagram_Activity_WriteTrace_ImplicitStep createActivitydiagram_Activity_WriteTrace_ImplicitStep() {
		Activitydiagram_Activity_WriteTrace_ImplicitStepImpl activitydiagram_Activity_WriteTrace_ImplicitStep = new Activitydiagram_Activity_WriteTrace_ImplicitStepImpl();
		return activitydiagram_Activity_WriteTrace_ImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activitydiagram_BooleanBinaryExpression_Execute createActivitydiagram_BooleanBinaryExpression_Execute() {
		Activitydiagram_BooleanBinaryExpression_ExecuteImpl activitydiagram_BooleanBinaryExpression_Execute = new Activitydiagram_BooleanBinaryExpression_ExecuteImpl();
		return activitydiagram_BooleanBinaryExpression_Execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activitydiagram_BooleanUnaryExpression_Execute createActivitydiagram_BooleanUnaryExpression_Execute() {
		Activitydiagram_BooleanUnaryExpression_ExecuteImpl activitydiagram_BooleanUnaryExpression_Execute = new Activitydiagram_BooleanUnaryExpression_ExecuteImpl();
		return activitydiagram_BooleanUnaryExpression_Execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activitydiagram_BooleanVariable_Execute createActivitydiagram_BooleanVariable_Execute() {
		Activitydiagram_BooleanVariable_ExecuteImpl activitydiagram_BooleanVariable_Execute = new Activitydiagram_BooleanVariable_ExecuteImpl();
		return activitydiagram_BooleanVariable_Execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activitydiagram_BooleanVariable_Execute_ImplicitStep createActivitydiagram_BooleanVariable_Execute_ImplicitStep() {
		Activitydiagram_BooleanVariable_Execute_ImplicitStepImpl activitydiagram_BooleanVariable_Execute_ImplicitStep = new Activitydiagram_BooleanVariable_Execute_ImplicitStepImpl();
		return activitydiagram_BooleanVariable_Execute_ImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activitydiagram_BooleanVariable_Init createActivitydiagram_BooleanVariable_Init() {
		Activitydiagram_BooleanVariable_InitImpl activitydiagram_BooleanVariable_Init = new Activitydiagram_BooleanVariable_InitImpl();
		return activitydiagram_BooleanVariable_Init;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activitydiagram_DecisionNode_Execute createActivitydiagram_DecisionNode_Execute() {
		Activitydiagram_DecisionNode_ExecuteImpl activitydiagram_DecisionNode_Execute = new Activitydiagram_DecisionNode_ExecuteImpl();
		return activitydiagram_DecisionNode_Execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activitydiagram_DecisionNode_Execute_ImplicitStep createActivitydiagram_DecisionNode_Execute_ImplicitStep() {
		Activitydiagram_DecisionNode_Execute_ImplicitStepImpl activitydiagram_DecisionNode_Execute_ImplicitStep = new Activitydiagram_DecisionNode_Execute_ImplicitStepImpl();
		return activitydiagram_DecisionNode_Execute_ImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activitydiagram_DecisionNode_SendOffers1 createActivitydiagram_DecisionNode_SendOffers1() {
		Activitydiagram_DecisionNode_SendOffers1Impl activitydiagram_DecisionNode_SendOffers1 = new Activitydiagram_DecisionNode_SendOffers1Impl();
		return activitydiagram_DecisionNode_SendOffers1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activitydiagram_Expression_Execute createActivitydiagram_Expression_Execute() {
		Activitydiagram_Expression_ExecuteImpl activitydiagram_Expression_Execute = new Activitydiagram_Expression_ExecuteImpl();
		return activitydiagram_Expression_Execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activitydiagram_ForkNode_Execute createActivitydiagram_ForkNode_Execute() {
		Activitydiagram_ForkNode_ExecuteImpl activitydiagram_ForkNode_Execute = new Activitydiagram_ForkNode_ExecuteImpl();
		return activitydiagram_ForkNode_Execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activitydiagram_ForkNode_Execute_ImplicitStep createActivitydiagram_ForkNode_Execute_ImplicitStep() {
		Activitydiagram_ForkNode_Execute_ImplicitStepImpl activitydiagram_ForkNode_Execute_ImplicitStep = new Activitydiagram_ForkNode_Execute_ImplicitStepImpl();
		return activitydiagram_ForkNode_Execute_ImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activitydiagram_InitialNode_Execute createActivitydiagram_InitialNode_Execute() {
		Activitydiagram_InitialNode_ExecuteImpl activitydiagram_InitialNode_Execute = new Activitydiagram_InitialNode_ExecuteImpl();
		return activitydiagram_InitialNode_Execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activitydiagram_InitialNode_Execute_ImplicitStep createActivitydiagram_InitialNode_Execute_ImplicitStep() {
		Activitydiagram_InitialNode_Execute_ImplicitStepImpl activitydiagram_InitialNode_Execute_ImplicitStep = new Activitydiagram_InitialNode_Execute_ImplicitStepImpl();
		return activitydiagram_InitialNode_Execute_ImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activitydiagram_IntegerCalculationExpression_Execute createActivitydiagram_IntegerCalculationExpression_Execute() {
		Activitydiagram_IntegerCalculationExpression_ExecuteImpl activitydiagram_IntegerCalculationExpression_Execute = new Activitydiagram_IntegerCalculationExpression_ExecuteImpl();
		return activitydiagram_IntegerCalculationExpression_Execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activitydiagram_IntegerComparisonExpression_Execute createActivitydiagram_IntegerComparisonExpression_Execute() {
		Activitydiagram_IntegerComparisonExpression_ExecuteImpl activitydiagram_IntegerComparisonExpression_Execute = new Activitydiagram_IntegerComparisonExpression_ExecuteImpl();
		return activitydiagram_IntegerComparisonExpression_Execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activitydiagram_IntegerVariable_Execute createActivitydiagram_IntegerVariable_Execute() {
		Activitydiagram_IntegerVariable_ExecuteImpl activitydiagram_IntegerVariable_Execute = new Activitydiagram_IntegerVariable_ExecuteImpl();
		return activitydiagram_IntegerVariable_Execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activitydiagram_IntegerVariable_Init createActivitydiagram_IntegerVariable_Init() {
		Activitydiagram_IntegerVariable_InitImpl activitydiagram_IntegerVariable_Init = new Activitydiagram_IntegerVariable_InitImpl();
		return activitydiagram_IntegerVariable_Init;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activitydiagram_JoinNode_Execute createActivitydiagram_JoinNode_Execute() {
		Activitydiagram_JoinNode_ExecuteImpl activitydiagram_JoinNode_Execute = new Activitydiagram_JoinNode_ExecuteImpl();
		return activitydiagram_JoinNode_Execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activitydiagram_JoinNode_Execute_ImplicitStep createActivitydiagram_JoinNode_Execute_ImplicitStep() {
		Activitydiagram_JoinNode_Execute_ImplicitStepImpl activitydiagram_JoinNode_Execute_ImplicitStep = new Activitydiagram_JoinNode_Execute_ImplicitStepImpl();
		return activitydiagram_JoinNode_Execute_ImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activitydiagram_MergeNode_Execute createActivitydiagram_MergeNode_Execute() {
		Activitydiagram_MergeNode_ExecuteImpl activitydiagram_MergeNode_Execute = new Activitydiagram_MergeNode_ExecuteImpl();
		return activitydiagram_MergeNode_Execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activitydiagram_MergeNode_Execute_ImplicitStep createActivitydiagram_MergeNode_Execute_ImplicitStep() {
		Activitydiagram_MergeNode_Execute_ImplicitStepImpl activitydiagram_MergeNode_Execute_ImplicitStep = new Activitydiagram_MergeNode_Execute_ImplicitStepImpl();
		return activitydiagram_MergeNode_Execute_ImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activitydiagram_NamedElement_Execute createActivitydiagram_NamedElement_Execute() {
		Activitydiagram_NamedElement_ExecuteImpl activitydiagram_NamedElement_Execute = new Activitydiagram_NamedElement_ExecuteImpl();
		return activitydiagram_NamedElement_Execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activitydiagram_NamedElement_Execute_ImplicitStep createActivitydiagram_NamedElement_Execute_ImplicitStep() {
		Activitydiagram_NamedElement_Execute_ImplicitStepImpl activitydiagram_NamedElement_Execute_ImplicitStep = new Activitydiagram_NamedElement_Execute_ImplicitStepImpl();
		return activitydiagram_NamedElement_Execute_ImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activitydiagram_OpaqueAction_Execute createActivitydiagram_OpaqueAction_Execute() {
		Activitydiagram_OpaqueAction_ExecuteImpl activitydiagram_OpaqueAction_Execute = new Activitydiagram_OpaqueAction_ExecuteImpl();
		return activitydiagram_OpaqueAction_Execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activitydiagram_OpaqueAction_Execute_ImplicitStep createActivitydiagram_OpaqueAction_Execute_ImplicitStep() {
		Activitydiagram_OpaqueAction_Execute_ImplicitStepImpl activitydiagram_OpaqueAction_Execute_ImplicitStep = new Activitydiagram_OpaqueAction_Execute_ImplicitStepImpl();
		return activitydiagram_OpaqueAction_Execute_ImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootImplicitStep createRootImplicitStep() {
		RootImplicitStepImpl rootImplicitStep = new RootImplicitStepImpl();
		return rootImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepsPackage getStepsPackage() {
		return (StepsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StepsPackage getPackage() {
		return StepsPackage.eINSTANCE;
	}

} //StepsFactoryImpl
