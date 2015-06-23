/**
 */
package activitydiagramTrace.Steps.util;

import activitydiagramTrace.Steps.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

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
			public Adapter caseSmallStep(SmallStep object) {
				return createSmallStepAdapter();
			}
			@Override
			public Adapter caseSteps(Steps object) {
				return createStepsAdapter();
			}
			@Override
			public Adapter caseBigStep(BigStep object) {
				return createBigStepAdapter();
			}
			@Override
			public Adapter caseActivitydiagram_ActivityNode_Terminate(Activitydiagram_ActivityNode_Terminate object) {
				return createActivitydiagram_ActivityNode_TerminateAdapter();
			}
			@Override
			public Adapter caseActivitydiagram_ActivityNode_SendOffers1(Activitydiagram_ActivityNode_SendOffers1 object) {
				return createActivitydiagram_ActivityNode_SendOffers1Adapter();
			}
			@Override
			public Adapter caseActivitydiagram_ActivityNode_Execute_AbstractSubEvent(Activitydiagram_ActivityNode_Execute_AbstractSubEvent object) {
				return createActivitydiagram_ActivityNode_Execute_AbstractSubEventAdapter();
			}
			@Override
			public Adapter caseActivitydiagram_ActivityNode_Execute_FillEvent(Activitydiagram_ActivityNode_Execute_FillEvent object) {
				return createActivitydiagram_ActivityNode_Execute_FillEventAdapter();
			}
			@Override
			public Adapter caseActivitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubEvent(Activitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubEvent object) {
				return createActivitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubEventAdapter();
			}
			@Override
			public Adapter caseActivitydiagram_ActivityNode_TakeOfferdTokens1_FillEvent(Activitydiagram_ActivityNode_TakeOfferdTokens1_FillEvent object) {
				return createActivitydiagram_ActivityNode_TakeOfferdTokens1_FillEventAdapter();
			}
			@Override
			public Adapter caseActivitydiagram_ActivityNode_RemoveToken1(Activitydiagram_ActivityNode_RemoveToken1 object) {
				return createActivitydiagram_ActivityNode_RemoveToken1Adapter();
			}
			@Override
			public Adapter caseActivitydiagram_ActivityNode_AddTokens1_AbstractSubEvent(Activitydiagram_ActivityNode_AddTokens1_AbstractSubEvent object) {
				return createActivitydiagram_ActivityNode_AddTokens1_AbstractSubEventAdapter();
			}
			@Override
			public Adapter caseActivitydiagram_ActivityNode_AddTokens1_FillEvent(Activitydiagram_ActivityNode_AddTokens1_FillEvent object) {
				return createActivitydiagram_ActivityNode_AddTokens1_FillEventAdapter();
			}
			@Override
			public Adapter caseActivitydiagram_Variable_Execute(Activitydiagram_Variable_Execute object) {
				return createActivitydiagram_Variable_ExecuteAdapter();
			}
			@Override
			public Adapter caseActivitydiagram_ActivityNode_HasOffers1(Activitydiagram_ActivityNode_HasOffers1 object) {
				return createActivitydiagram_ActivityNode_HasOffers1Adapter();
			}
			@Override
			public Adapter caseActivitydiagram_Activity_InitializeContext(Activitydiagram_Activity_InitializeContext object) {
				return createActivitydiagram_Activity_InitializeContextAdapter();
			}
			@Override
			public Adapter caseActivitydiagram_Variable_Init(Activitydiagram_Variable_Init object) {
				return createActivitydiagram_Variable_InitAdapter();
			}
			@Override
			public Adapter caseActivitydiagram_ActivityNode_IsReady(Activitydiagram_ActivityNode_IsReady object) {
				return createActivitydiagram_ActivityNode_IsReadyAdapter();
			}
			@Override
			public Adapter caseActivitydiagram_Variable_Print(Activitydiagram_Variable_Print object) {
				return createActivitydiagram_Variable_PrintAdapter();
			}
			@Override
			public Adapter caseFillEvent(FillEvent object) {
				return createFillEventAdapter();
			}
			@Override
			public Adapter caseActivitydiagram_ActivityNode_Execute(Activitydiagram_ActivityNode_Execute object) {
				return createActivitydiagram_ActivityNode_ExecuteAdapter();
			}
			@Override
			public Adapter caseActivitydiagram_ActivityNode_TakeOfferdTokens1(Activitydiagram_ActivityNode_TakeOfferdTokens1 object) {
				return createActivitydiagram_ActivityNode_TakeOfferdTokens1Adapter();
			}
			@Override
			public Adapter caseActivitydiagram_ActivityNode_AddTokens1(Activitydiagram_ActivityNode_AddTokens1 object) {
				return createActivitydiagram_ActivityNode_AddTokens1Adapter();
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
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.SmallStep <em>Small Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.SmallStep
	 * @generated
	 */
	public Adapter createSmallStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.Steps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.Steps
	 * @generated
	 */
	public Adapter createStepsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.BigStep <em>Big Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.BigStep
	 * @generated
	 */
	public Adapter createBigStepAdapter() {
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
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute_AbstractSubEvent <em>Activitydiagram Activity Node Execute Abstract Sub Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute_AbstractSubEvent
	 * @generated
	 */
	public Adapter createActivitydiagram_ActivityNode_Execute_AbstractSubEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute_FillEvent <em>Activitydiagram Activity Node Execute Fill Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute_FillEvent
	 * @generated
	 */
	public Adapter createActivitydiagram_ActivityNode_Execute_FillEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubEvent <em>Activitydiagram Activity Node Take Offerd Tokens1 Abstract Sub Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubEvent
	 * @generated
	 */
	public Adapter createActivitydiagram_ActivityNode_TakeOfferdTokens1_AbstractSubEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1_FillEvent <em>Activitydiagram Activity Node Take Offerd Tokens1 Fill Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1_FillEvent
	 * @generated
	 */
	public Adapter createActivitydiagram_ActivityNode_TakeOfferdTokens1_FillEventAdapter() {
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
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1_AbstractSubEvent <em>Activitydiagram Activity Node Add Tokens1 Abstract Sub Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1_AbstractSubEvent
	 * @generated
	 */
	public Adapter createActivitydiagram_ActivityNode_AddTokens1_AbstractSubEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1_FillEvent <em>Activitydiagram Activity Node Add Tokens1 Fill Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1_FillEvent
	 * @generated
	 */
	public Adapter createActivitydiagram_ActivityNode_AddTokens1_FillEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.Activitydiagram_Variable_Execute <em>Activitydiagram Variable Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.Activitydiagram_Variable_Execute
	 * @generated
	 */
	public Adapter createActivitydiagram_Variable_ExecuteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_HasOffers1 <em>Activitydiagram Activity Node Has Offers1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_HasOffers1
	 * @generated
	 */
	public Adapter createActivitydiagram_ActivityNode_HasOffers1Adapter() {
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
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.Activitydiagram_Variable_Init <em>Activitydiagram Variable Init</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.Activitydiagram_Variable_Init
	 * @generated
	 */
	public Adapter createActivitydiagram_Variable_InitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.Activitydiagram_ActivityNode_IsReady <em>Activitydiagram Activity Node Is Ready</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.Activitydiagram_ActivityNode_IsReady
	 * @generated
	 */
	public Adapter createActivitydiagram_ActivityNode_IsReadyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.Activitydiagram_Variable_Print <em>Activitydiagram Variable Print</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.Activitydiagram_Variable_Print
	 * @generated
	 */
	public Adapter createActivitydiagram_Variable_PrintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Steps.FillEvent <em>Fill Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Steps.FillEvent
	 * @generated
	 */
	public Adapter createFillEventAdapter() {
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
