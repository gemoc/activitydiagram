/**
 */
package activitydiagramTrace.Steps.util;

import activitydiagramTrace.Steps.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.gemoc.executionframework.engine.mse.BigStep;
import org.gemoc.executionframework.engine.mse.SequentialStep;
import org.gemoc.executionframework.engine.mse.SmallStep;
import org.gemoc.executionframework.engine.mse.Step;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see activitydiagramTrace.Steps.StepsPackage
 * @generated
 */
public class StepsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StepsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = StepsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StepsSwitch<Adapter> modelSwitch =
		new StepsSwitch<Adapter>() {
			@Override
			public Adapter caseActivitydiagram_ActivityFinalNode_Execute(Activitydiagram_ActivityFinalNode_Execute object) {
				return createActivitydiagram_ActivityFinalNode_ExecuteAdapter();
			}
			@Override
			public Adapter caseActivitydiagram_ActivityFinalNode_Execute_AbstractSubStep(Activitydiagram_ActivityFinalNode_Execute_AbstractSubStep object) {
				return createActivitydiagram_ActivityFinalNode_Execute_AbstractSubStepAdapter();
			}
			@Override
			public Adapter caseActivitydiagram_ActivityFinalNode_Execute_ImplicitStep(Activitydiagram_ActivityFinalNode_Execute_ImplicitStep object) {
				return createActivitydiagram_ActivityFinalNode_Execute_ImplicitStepAdapter();
			}
			@Override
			public Adapter caseActivitydiagram_ActivityNode_AddTokens1(Activitydiagram_ActivityNode_AddTokens1 object) {
				return createActivitydiagram_ActivityNode_AddTokens1Adapter();
			}
			@Override
			public Adapter caseActivitydiagram_ActivityNode_AddTokens1_AbstractSubStep(Activitydiagram_ActivityNode_AddTokens1_AbstractSubStep object) {
				return createActivitydiagram_ActivityNode_AddTokens1_AbstractSubStepAdapter();
			}
			@Override
			public Adapter caseActivitydiagram_ActivityNode_AddTokens1_ImplicitStep(Activitydiagram_ActivityNode_AddTokens1_ImplicitStep object) {
				return createActivitydiagram_ActivityNode_AddTokens1_ImplicitStepAdapter();
			}
			@Override
			public Adapter caseActivitydiagram_ActivityNode_Execute(Activitydiagram_ActivityNode_Execute object) {
				return createActivitydiagram_ActivityNode_ExecuteAdapter();
			}
			@Override
			public Adapter caseActivitydiagram_ActivityNode_Execute_AbstractSubStep(Activitydiagram_ActivityNode_Execute_AbstractSubStep object) {
				return createActivitydiagram_ActivityNode_Execute_AbstractSubStepAdapter();
			}
			@Override
			public Adapter caseActivitydiagram_ActivityNode_Execute_ImplicitStep(Activitydiagram_ActivityNode_Execute_ImplicitStep object) {
				return createActivitydiagram_ActivityNode_Execute_ImplicitStepAdapter();
			}
			@Override
			public Adapter caseActivitydiagram_ActivityNode_RemoveToken1(Activitydiagram_ActivityNode_RemoveToken1 object) {
				return createActivitydiagram_ActivityNode_RemoveToken1Adapter();
			}
			@Override
			public Adapter caseActivitydiagram_ActivityNode_SendOffers1(Activitydiagram_ActivityNode_SendOffers1 object) {
				return createActivitydiagram_ActivityNode_SendOffers1Adapter();
			}
			@Override
			public Adapter caseActivitydiagram_ActivityNode_TakeOfferdTokens1(Activitydiagram_ActivityNode_TakeOfferdTokens1 object) {
				return createActivitydiagram_ActivityNode_TakeOfferdTokens1Adapter();
			}
			@Override
			public Adapter caseActivitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStep(Activitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStep object) {
				return createActivitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStepAdapter();
			}
			@Override
			public Adapter caseActivitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStep(Activitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStep object) {
				return createActivitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStepAdapter();
			}
			@Override
			public Adapter caseActivitydiagram_ActivityNode_Terminate(Activitydiagram_ActivityNode_Terminate object) {
				return createActivitydiagram_ActivityNode_TerminateAdapter();
			}
			@Override
			public Adapter caseActivitydiagram_Activity_Execute(Activitydiagram_Activity_Execute object) {
				return createActivitydiagram_Activity_ExecuteAdapter();
			}
			@Override
			public Adapter caseActivitydiagram_Activity_Execute_AbstractSubStep(Activitydiagram_Activity_Execute_AbstractSubStep object) {
				return createActivitydiagram_Activity_Execute_AbstractSubStepAdapter();
			}
			@Override
			public Adapter caseActivitydiagram_Activity_Execute_ImplicitStep(Activitydiagram_Activity_Execute_ImplicitStep object) {
				return createActivitydiagram_Activity_Execute_ImplicitStepAdapter();
			}
			@Override
			public Adapter caseActivitydiagram_Activity_InitializeContext(Activitydiagram_Activity_InitializeContext object) {
				return createActivitydiagram_Activity_InitializeContextAdapter();
			}
			@Override
			public Adapter caseActivitydiagram_Activity_Reset(Activitydiagram_Activity_Reset object) {
				return createActivitydiagram_Activity_ResetAdapter();
			}
			@Override
			public Adapter caseActivitydiagram_Activity_WriteTrace(Activitydiagram_Activity_WriteTrace object) {
				return createActivitydiagram_Activity_WriteTraceAdapter();
			}
			@Override
			public Adapter caseActivitydiagram_Activity_WriteTrace_AbstractSubStep(Activitydiagram_Activity_WriteTrace_AbstractSubStep object) {
				return createActivitydiagram_Activity_WriteTrace_AbstractSubStepAdapter();
			}
			@Override
			public Adapter caseActivitydiagram_Activity_WriteTrace_ImplicitStep(Activitydiagram_Activity_WriteTrace_ImplicitStep object) {
				return createActivitydiagram_Activity_WriteTrace_ImplicitStepAdapter();
			}
			@Override
			public Adapter caseActivitydiagram_BooleanBinaryExpression_Execute(Activitydiagram_BooleanBinaryExpression_Execute object) {
				return createActivitydiagram_BooleanBinaryExpression_ExecuteAdapter();
			}
			@Override
			public Adapter caseActivitydiagram_BooleanUnaryExpression_Execute(Activitydiagram_BooleanUnaryExpression_Execute object) {
				return createActivitydiagram_BooleanUnaryExpression_ExecuteAdapter();
			}
			@Override
			public Adapter caseActivitydiagram_BooleanVariable_Execute(Activitydiagram_BooleanVariable_Execute object) {
				return createActivitydiagram_BooleanVariable_ExecuteAdapter();
			}
			@Override
			public Adapter caseActivitydiagram_BooleanVariable_Execute_AbstractSubStep(Activitydiagram_BooleanVariable_Execute_AbstractSubStep object) {
				return createActivitydiagram_BooleanVariable_Execute_AbstractSubStepAdapter();
			}
			@Override
			public Adapter caseActivitydiagram_BooleanVariable_Execute_ImplicitStep(Activitydiagram_BooleanVariable_Execute_ImplicitStep object) {
				return createActivitydiagram_BooleanVariable_Execute_ImplicitStepAdapter();
			}
			@Override
			public Adapter caseActivitydiagram_BooleanVariable_Init(Activitydiagram_BooleanVariable_Init object) {
				return createActivitydiagram_BooleanVariable_InitAdapter();
			}
			@Override
			public Adapter caseActivitydiagram_DecisionNode_Execute(Activitydiagram_DecisionNode_Execute object) {
				return createActivitydiagram_DecisionNode_ExecuteAdapter();
			}
			@Override
			public Adapter caseActivitydiagram_DecisionNode_Execute_AbstractSubStep(Activitydiagram_DecisionNode_Execute_AbstractSubStep object) {
				return createActivitydiagram_DecisionNode_Execute_AbstractSubStepAdapter();
			}
			@Override
			public Adapter caseActivitydiagram_DecisionNode_Execute_ImplicitStep(Activitydiagram_DecisionNode_Execute_ImplicitStep object) {
				return createActivitydiagram_DecisionNode_Execute_ImplicitStepAdapter();
			}
			@Override
			public Adapter caseActivitydiagram_DecisionNode_SendOffers1(Activitydiagram_DecisionNode_SendOffers1 object) {
				return createActivitydiagram_DecisionNode_SendOffers1Adapter();
			}
			@Override
			public Adapter caseActivitydiagram_Expression_Execute(Activitydiagram_Expression_Execute object) {
				return createActivitydiagram_Expression_ExecuteAdapter();
			}
			@Override
			public Adapter caseActivitydiagram_ForkNode_Execute(Activitydiagram_ForkNode_Execute object) {
				return createActivitydiagram_ForkNode_ExecuteAdapter();
			}
			@Override
			public Adapter caseActivitydiagram_ForkNode_Execute_AbstractSubStep(Activitydiagram_ForkNode_Execute_AbstractSubStep object) {
				return createActivitydiagram_ForkNode_Execute_AbstractSubStepAdapter();
			}
			@Override
			public Adapter caseActivitydiagram_ForkNode_Execute_ImplicitStep(Activitydiagram_ForkNode_Execute_ImplicitStep object) {
				return createActivitydiagram_ForkNode_Execute_ImplicitStepAdapter();
			}
			@Override
			public Adapter caseActivitydiagram_InitialNode_Execute(Activitydiagram_InitialNode_Execute object) {
				return createActivitydiagram_InitialNode_ExecuteAdapter();
			}
			@Override
			public Adapter caseActivitydiagram_InitialNode_Execute_AbstractSubStep(Activitydiagram_InitialNode_Execute_AbstractSubStep object) {
				return createActivitydiagram_InitialNode_Execute_AbstractSubStepAdapter();
			}
			@Override
			public Adapter caseActivitydiagram_InitialNode_Execute_ImplicitStep(Activitydiagram_InitialNode_Execute_ImplicitStep object) {
				return createActivitydiagram_InitialNode_Execute_ImplicitStepAdapter();
			}
			@Override
			public Adapter caseActivitydiagram_IntegerCalculationExpression_Execute(Activitydiagram_IntegerCalculationExpression_Execute object) {
				return createActivitydiagram_IntegerCalculationExpression_ExecuteAdapter();
			}
			@Override
			public Adapter caseActivitydiagram_IntegerComparisonExpression_Execute(Activitydiagram_IntegerComparisonExpression_Execute object) {
				return createActivitydiagram_IntegerComparisonExpression_ExecuteAdapter();
			}
			@Override
			public Adapter caseActivitydiagram_IntegerVariable_Execute(Activitydiagram_IntegerVariable_Execute object) {
				return createActivitydiagram_IntegerVariable_ExecuteAdapter();
			}
			@Override
			public Adapter caseActivitydiagram_IntegerVariable_Init(Activitydiagram_IntegerVariable_Init object) {
				return createActivitydiagram_IntegerVariable_InitAdapter();
			}
			@Override
			public Adapter caseActivitydiagram_JoinNode_Execute(Activitydiagram_JoinNode_Execute object) {
				return createActivitydiagram_JoinNode_ExecuteAdapter();
			}
			@Override
			public Adapter caseActivitydiagram_JoinNode_Execute_AbstractSubStep(Activitydiagram_JoinNode_Execute_AbstractSubStep object) {
				return createActivitydiagram_JoinNode_Execute_AbstractSubStepAdapter();
			}
			@Override
			public Adapter caseActivitydiagram_JoinNode_Execute_ImplicitStep(Activitydiagram_JoinNode_Execute_ImplicitStep object) {
				return createActivitydiagram_JoinNode_Execute_ImplicitStepAdapter();
			}
			@Override
			public Adapter caseActivitydiagram_MergeNode_Execute(Activitydiagram_MergeNode_Execute object) {
				return createActivitydiagram_MergeNode_ExecuteAdapter();
			}
			@Override
			public Adapter caseActivitydiagram_MergeNode_Execute_AbstractSubStep(Activitydiagram_MergeNode_Execute_AbstractSubStep object) {
				return createActivitydiagram_MergeNode_Execute_AbstractSubStepAdapter();
			}
			@Override
			public Adapter caseActivitydiagram_MergeNode_Execute_ImplicitStep(Activitydiagram_MergeNode_Execute_ImplicitStep object) {
				return createActivitydiagram_MergeNode_Execute_ImplicitStepAdapter();
			}
			@Override
			public Adapter caseActivitydiagram_NamedElement_Execute(Activitydiagram_NamedElement_Execute object) {
				return createActivitydiagram_NamedElement_ExecuteAdapter();
			}
			@Override
			public Adapter caseActivitydiagram_NamedElement_Execute_AbstractSubStep(Activitydiagram_NamedElement_Execute_AbstractSubStep object) {
				return createActivitydiagram_NamedElement_Execute_AbstractSubStepAdapter();
			}
			@Override
			public Adapter caseActivitydiagram_NamedElement_Execute_ImplicitStep(Activitydiagram_NamedElement_Execute_ImplicitStep object) {
				return createActivitydiagram_NamedElement_Execute_ImplicitStepAdapter();
			}
			@Override
			public Adapter caseActivitydiagram_OpaqueAction_Execute(Activitydiagram_OpaqueAction_Execute object) {
				return createActivitydiagram_OpaqueAction_ExecuteAdapter();
			}
			@Override
			public Adapter caseActivitydiagram_OpaqueAction_Execute_AbstractSubStep(Activitydiagram_OpaqueAction_Execute_AbstractSubStep object) {
				return createActivitydiagram_OpaqueAction_Execute_AbstractSubStepAdapter();
			}
			@Override
			public Adapter caseActivitydiagram_OpaqueAction_Execute_ImplicitStep(Activitydiagram_OpaqueAction_Execute_ImplicitStep object) {
				return createActivitydiagram_OpaqueAction_Execute_ImplicitStepAdapter();
			}
			@Override
			public Adapter caseRootImplicitStep(RootImplicitStep object) {
				return createRootImplicitStepAdapter();
			}
			@Override
			public Adapter caseSpecificStep(SpecificStep object) {
				return createSpecificStepAdapter();
			}
			@Override
			public Adapter caseStep(Step object) {
				return createStepAdapter();
			}
			@Override
			public <StepSubtype extends Step> Adapter caseBigStep(BigStep<StepSubtype> object) {
				return createBigStepAdapter();
			}
			@Override
			public <StepSubtype extends Step> Adapter caseSequentialStep(SequentialStep<StepSubtype> object) {
				return createSequentialStepAdapter();
			}
			@Override
			public Adapter caseSmallStep(SmallStep object) {
				return createSmallStepAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityFinalNode_Execute <em>Activitydiagram Activity Final Node Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityFinalNode_Execute
	 * @generated
	 */
	public Adapter createActivitydiagram_ActivityFinalNode_ExecuteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityFinalNode_Execute_AbstractSubStep <em>Activitydiagram Activity Final Node Execute Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityFinalNode_Execute_AbstractSubStep
	 * @generated
	 */
	public Adapter createActivitydiagram_ActivityFinalNode_Execute_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityFinalNode_Execute_ImplicitStep <em>Activitydiagram Activity Final Node Execute Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityFinalNode_Execute_ImplicitStep
	 * @generated
	 */
	public Adapter createActivitydiagram_ActivityFinalNode_Execute_ImplicitStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1 <em>Activitydiagram Activity Node Add Tokens1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1
	 * @generated
	 */
	public Adapter createActivitydiagram_ActivityNode_AddTokens1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1_AbstractSubStep <em>Activitydiagram Activity Node Add Tokens1 Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1_AbstractSubStep
	 * @generated
	 */
	public Adapter createActivitydiagram_ActivityNode_AddTokens1_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1_ImplicitStep <em>Activitydiagram Activity Node Add Tokens1 Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1_ImplicitStep
	 * @generated
	 */
	public Adapter createActivitydiagram_ActivityNode_AddTokens1_ImplicitStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute <em>Activitydiagram Activity Node Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute
	 * @generated
	 */
	public Adapter createActivitydiagram_ActivityNode_ExecuteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute_AbstractSubStep <em>Activitydiagram Activity Node Execute Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute_AbstractSubStep
	 * @generated
	 */
	public Adapter createActivitydiagram_ActivityNode_Execute_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute_ImplicitStep <em>Activitydiagram Activity Node Execute Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute_ImplicitStep
	 * @generated
	 */
	public Adapter createActivitydiagram_ActivityNode_Execute_ImplicitStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_RemoveToken1 <em>Activitydiagram Activity Node Remove Token1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_RemoveToken1
	 * @generated
	 */
	public Adapter createActivitydiagram_ActivityNode_RemoveToken1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_SendOffers1 <em>Activitydiagram Activity Node Send Offers1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_SendOffers1
	 * @generated
	 */
	public Adapter createActivitydiagram_ActivityNode_SendOffers1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1 <em>Activitydiagram Activity Node Take Offerd Tokens1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1
	 * @generated
	 */
	public Adapter createActivitydiagram_ActivityNode_TakeOfferdTokens1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStep <em>Activitydiagram Activity Node Take Offerd Tokens1 Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStep
	 * @generated
	 */
	public Adapter createActivitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStep <em>Activitydiagram Activity Node Take Offerd Tokens1 Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStep
	 * @generated
	 */
	public Adapter createActivitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Terminate <em>Activitydiagram Activity Node Terminate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Terminate
	 * @generated
	 */
	public Adapter createActivitydiagram_ActivityNode_TerminateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.Activitydiagram_Activity_Execute <em>Activitydiagram Activity Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.Activitydiagram_Activity_Execute
	 * @generated
	 */
	public Adapter createActivitydiagram_Activity_ExecuteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.Activitydiagram_Activity_Execute_AbstractSubStep <em>Activitydiagram Activity Execute Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.Activitydiagram_Activity_Execute_AbstractSubStep
	 * @generated
	 */
	public Adapter createActivitydiagram_Activity_Execute_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.Activitydiagram_Activity_Execute_ImplicitStep <em>Activitydiagram Activity Execute Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.Activitydiagram_Activity_Execute_ImplicitStep
	 * @generated
	 */
	public Adapter createActivitydiagram_Activity_Execute_ImplicitStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.Activitydiagram_Activity_InitializeContext <em>Activitydiagram Activity Initialize Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.Activitydiagram_Activity_InitializeContext
	 * @generated
	 */
	public Adapter createActivitydiagram_Activity_InitializeContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.Activitydiagram_Activity_Reset <em>Activitydiagram Activity Reset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.Activitydiagram_Activity_Reset
	 * @generated
	 */
	public Adapter createActivitydiagram_Activity_ResetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.Activitydiagram_Activity_WriteTrace <em>Activitydiagram Activity Write Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.Activitydiagram_Activity_WriteTrace
	 * @generated
	 */
	public Adapter createActivitydiagram_Activity_WriteTraceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.Activitydiagram_Activity_WriteTrace_AbstractSubStep <em>Activitydiagram Activity Write Trace Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.Activitydiagram_Activity_WriteTrace_AbstractSubStep
	 * @generated
	 */
	public Adapter createActivitydiagram_Activity_WriteTrace_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.Activitydiagram_Activity_WriteTrace_ImplicitStep <em>Activitydiagram Activity Write Trace Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.Activitydiagram_Activity_WriteTrace_ImplicitStep
	 * @generated
	 */
	public Adapter createActivitydiagram_Activity_WriteTrace_ImplicitStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.Activitydiagram_BooleanBinaryExpression_Execute <em>Activitydiagram Boolean Binary Expression Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.Activitydiagram_BooleanBinaryExpression_Execute
	 * @generated
	 */
	public Adapter createActivitydiagram_BooleanBinaryExpression_ExecuteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.Activitydiagram_BooleanUnaryExpression_Execute <em>Activitydiagram Boolean Unary Expression Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.Activitydiagram_BooleanUnaryExpression_Execute
	 * @generated
	 */
	public Adapter createActivitydiagram_BooleanUnaryExpression_ExecuteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.Activitydiagram_BooleanVariable_Execute <em>Activitydiagram Boolean Variable Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.Activitydiagram_BooleanVariable_Execute
	 * @generated
	 */
	public Adapter createActivitydiagram_BooleanVariable_ExecuteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.Activitydiagram_BooleanVariable_Execute_AbstractSubStep <em>Activitydiagram Boolean Variable Execute Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.Activitydiagram_BooleanVariable_Execute_AbstractSubStep
	 * @generated
	 */
	public Adapter createActivitydiagram_BooleanVariable_Execute_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.Activitydiagram_BooleanVariable_Execute_ImplicitStep <em>Activitydiagram Boolean Variable Execute Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.Activitydiagram_BooleanVariable_Execute_ImplicitStep
	 * @generated
	 */
	public Adapter createActivitydiagram_BooleanVariable_Execute_ImplicitStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.Activitydiagram_BooleanVariable_Init <em>Activitydiagram Boolean Variable Init</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.Activitydiagram_BooleanVariable_Init
	 * @generated
	 */
	public Adapter createActivitydiagram_BooleanVariable_InitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.Activitydiagram_DecisionNode_Execute <em>Activitydiagram Decision Node Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.Activitydiagram_DecisionNode_Execute
	 * @generated
	 */
	public Adapter createActivitydiagram_DecisionNode_ExecuteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.Activitydiagram_DecisionNode_Execute_AbstractSubStep <em>Activitydiagram Decision Node Execute Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.Activitydiagram_DecisionNode_Execute_AbstractSubStep
	 * @generated
	 */
	public Adapter createActivitydiagram_DecisionNode_Execute_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.Activitydiagram_DecisionNode_Execute_ImplicitStep <em>Activitydiagram Decision Node Execute Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.Activitydiagram_DecisionNode_Execute_ImplicitStep
	 * @generated
	 */
	public Adapter createActivitydiagram_DecisionNode_Execute_ImplicitStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.Activitydiagram_DecisionNode_SendOffers1 <em>Activitydiagram Decision Node Send Offers1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.Activitydiagram_DecisionNode_SendOffers1
	 * @generated
	 */
	public Adapter createActivitydiagram_DecisionNode_SendOffers1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.Activitydiagram_Expression_Execute <em>Activitydiagram Expression Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.Activitydiagram_Expression_Execute
	 * @generated
	 */
	public Adapter createActivitydiagram_Expression_ExecuteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.Activitydiagram_ForkNode_Execute <em>Activitydiagram Fork Node Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ForkNode_Execute
	 * @generated
	 */
	public Adapter createActivitydiagram_ForkNode_ExecuteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.Activitydiagram_ForkNode_Execute_AbstractSubStep <em>Activitydiagram Fork Node Execute Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ForkNode_Execute_AbstractSubStep
	 * @generated
	 */
	public Adapter createActivitydiagram_ForkNode_Execute_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.Activitydiagram_ForkNode_Execute_ImplicitStep <em>Activitydiagram Fork Node Execute Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ForkNode_Execute_ImplicitStep
	 * @generated
	 */
	public Adapter createActivitydiagram_ForkNode_Execute_ImplicitStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.Activitydiagram_InitialNode_Execute <em>Activitydiagram Initial Node Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.Activitydiagram_InitialNode_Execute
	 * @generated
	 */
	public Adapter createActivitydiagram_InitialNode_ExecuteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.Activitydiagram_InitialNode_Execute_AbstractSubStep <em>Activitydiagram Initial Node Execute Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.Activitydiagram_InitialNode_Execute_AbstractSubStep
	 * @generated
	 */
	public Adapter createActivitydiagram_InitialNode_Execute_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.Activitydiagram_InitialNode_Execute_ImplicitStep <em>Activitydiagram Initial Node Execute Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.Activitydiagram_InitialNode_Execute_ImplicitStep
	 * @generated
	 */
	public Adapter createActivitydiagram_InitialNode_Execute_ImplicitStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.Activitydiagram_IntegerCalculationExpression_Execute <em>Activitydiagram Integer Calculation Expression Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.Activitydiagram_IntegerCalculationExpression_Execute
	 * @generated
	 */
	public Adapter createActivitydiagram_IntegerCalculationExpression_ExecuteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.Activitydiagram_IntegerComparisonExpression_Execute <em>Activitydiagram Integer Comparison Expression Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.Activitydiagram_IntegerComparisonExpression_Execute
	 * @generated
	 */
	public Adapter createActivitydiagram_IntegerComparisonExpression_ExecuteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.Activitydiagram_IntegerVariable_Execute <em>Activitydiagram Integer Variable Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.Activitydiagram_IntegerVariable_Execute
	 * @generated
	 */
	public Adapter createActivitydiagram_IntegerVariable_ExecuteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.Activitydiagram_IntegerVariable_Init <em>Activitydiagram Integer Variable Init</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.Activitydiagram_IntegerVariable_Init
	 * @generated
	 */
	public Adapter createActivitydiagram_IntegerVariable_InitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.Activitydiagram_JoinNode_Execute <em>Activitydiagram Join Node Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.Activitydiagram_JoinNode_Execute
	 * @generated
	 */
	public Adapter createActivitydiagram_JoinNode_ExecuteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.Activitydiagram_JoinNode_Execute_AbstractSubStep <em>Activitydiagram Join Node Execute Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.Activitydiagram_JoinNode_Execute_AbstractSubStep
	 * @generated
	 */
	public Adapter createActivitydiagram_JoinNode_Execute_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.Activitydiagram_JoinNode_Execute_ImplicitStep <em>Activitydiagram Join Node Execute Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.Activitydiagram_JoinNode_Execute_ImplicitStep
	 * @generated
	 */
	public Adapter createActivitydiagram_JoinNode_Execute_ImplicitStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.Activitydiagram_MergeNode_Execute <em>Activitydiagram Merge Node Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.Activitydiagram_MergeNode_Execute
	 * @generated
	 */
	public Adapter createActivitydiagram_MergeNode_ExecuteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.Activitydiagram_MergeNode_Execute_AbstractSubStep <em>Activitydiagram Merge Node Execute Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.Activitydiagram_MergeNode_Execute_AbstractSubStep
	 * @generated
	 */
	public Adapter createActivitydiagram_MergeNode_Execute_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.Activitydiagram_MergeNode_Execute_ImplicitStep <em>Activitydiagram Merge Node Execute Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.Activitydiagram_MergeNode_Execute_ImplicitStep
	 * @generated
	 */
	public Adapter createActivitydiagram_MergeNode_Execute_ImplicitStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.Activitydiagram_NamedElement_Execute <em>Activitydiagram Named Element Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.Activitydiagram_NamedElement_Execute
	 * @generated
	 */
	public Adapter createActivitydiagram_NamedElement_ExecuteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.Activitydiagram_NamedElement_Execute_AbstractSubStep <em>Activitydiagram Named Element Execute Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.Activitydiagram_NamedElement_Execute_AbstractSubStep
	 * @generated
	 */
	public Adapter createActivitydiagram_NamedElement_Execute_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.Activitydiagram_NamedElement_Execute_ImplicitStep <em>Activitydiagram Named Element Execute Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.Activitydiagram_NamedElement_Execute_ImplicitStep
	 * @generated
	 */
	public Adapter createActivitydiagram_NamedElement_Execute_ImplicitStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.Activitydiagram_OpaqueAction_Execute <em>Activitydiagram Opaque Action Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.Activitydiagram_OpaqueAction_Execute
	 * @generated
	 */
	public Adapter createActivitydiagram_OpaqueAction_ExecuteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.Activitydiagram_OpaqueAction_Execute_AbstractSubStep <em>Activitydiagram Opaque Action Execute Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.Activitydiagram_OpaqueAction_Execute_AbstractSubStep
	 * @generated
	 */
	public Adapter createActivitydiagram_OpaqueAction_Execute_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.Activitydiagram_OpaqueAction_Execute_ImplicitStep <em>Activitydiagram Opaque Action Execute Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.Activitydiagram_OpaqueAction_Execute_ImplicitStep
	 * @generated
	 */
	public Adapter createActivitydiagram_OpaqueAction_Execute_ImplicitStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.RootImplicitStep <em>Root Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.RootImplicitStep
	 * @generated
	 */
	public Adapter createRootImplicitStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.SpecificStep <em>Specific Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.SpecificStep
	 * @generated
	 */
	public Adapter createSpecificStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.executionframework.engine.mse.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.executionframework.engine.mse.Step
	 * @generated
	 */
	public Adapter createStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.executionframework.engine.mse.BigStep <em>Big Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.executionframework.engine.mse.BigStep
	 * @generated
	 */
	public Adapter createBigStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.executionframework.engine.mse.SequentialStep <em>Sequential Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.executionframework.engine.mse.SequentialStep
	 * @generated
	 */
	public Adapter createSequentialStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.executionframework.engine.mse.SmallStep <em>Small Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.executionframework.engine.mse.SmallStep
	 * @generated
	 */
	public Adapter createSmallStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //StepsAdapterFactory
