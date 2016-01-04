/**
 */
package activitydiagramTrace.States.util;

import activitydiagramTrace.States.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see activitydiagramTrace.States.StatesPackage
 * @generated
 */
public class StatesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StatesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = StatesPackage.eINSTANCE;
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
	protected StatesSwitch<Adapter> modelSwitch =
		new StatesSwitch<Adapter>() {
			@Override
			public Adapter caseActivityEdge_offers_Value(ActivityEdge_offers_Value object) {
				return createActivityEdge_offers_ValueAdapter();
			}
			@Override
			public Adapter caseActivityEdge_source_Value(ActivityEdge_source_Value object) {
				return createActivityEdge_source_ValueAdapter();
			}
			@Override
			public Adapter caseActivityEdge_target_Value(ActivityEdge_target_Value object) {
				return createActivityEdge_target_ValueAdapter();
			}
			@Override
			public Adapter caseActivityNode_activity_Value(ActivityNode_activity_Value object) {
				return createActivityNode_activity_ValueAdapter();
			}
			@Override
			public Adapter caseActivityNode_heldTokens_Value(ActivityNode_heldTokens_Value object) {
				return createActivityNode_heldTokens_ValueAdapter();
			}
			@Override
			public Adapter caseActivityNode_incoming_Value(ActivityNode_incoming_Value object) {
				return createActivityNode_incoming_ValueAdapter();
			}
			@Override
			public Adapter caseActivityNode_outgoing_Value(ActivityNode_outgoing_Value object) {
				return createActivityNode_outgoing_ValueAdapter();
			}
			@Override
			public Adapter caseActivityNode_running_Value(ActivityNode_running_Value object) {
				return createActivityNode_running_ValueAdapter();
			}
			@Override
			public Adapter caseActivity_edges_Value(Activity_edges_Value object) {
				return createActivity_edges_ValueAdapter();
			}
			@Override
			public Adapter caseActivity_inputs_Value(Activity_inputs_Value object) {
				return createActivity_inputs_ValueAdapter();
			}
			@Override
			public Adapter caseActivity_locals_Value(Activity_locals_Value object) {
				return createActivity_locals_ValueAdapter();
			}
			@Override
			public Adapter caseActivity_nodes_Value(Activity_nodes_Value object) {
				return createActivity_nodes_ValueAdapter();
			}
			@Override
			public Adapter caseActivity_trace_Value(Activity_trace_Value object) {
				return createActivity_trace_ValueAdapter();
			}
			@Override
			public Adapter caseBooleanBinaryExpression_operand1_Value(BooleanBinaryExpression_operand1_Value object) {
				return createBooleanBinaryExpression_operand1_ValueAdapter();
			}
			@Override
			public Adapter caseBooleanBinaryExpression_operand2_Value(BooleanBinaryExpression_operand2_Value object) {
				return createBooleanBinaryExpression_operand2_ValueAdapter();
			}
			@Override
			public Adapter caseBooleanBinaryExpression_operator_Value(BooleanBinaryExpression_operator_Value object) {
				return createBooleanBinaryExpression_operator_ValueAdapter();
			}
			@Override
			public Adapter caseBooleanExpression_assignee_Value(BooleanExpression_assignee_Value object) {
				return createBooleanExpression_assignee_ValueAdapter();
			}
			@Override
			public Adapter caseBooleanUnaryExpression_operand_Value(BooleanUnaryExpression_operand_Value object) {
				return createBooleanUnaryExpression_operand_ValueAdapter();
			}
			@Override
			public Adapter caseBooleanUnaryExpression_operator_Value(BooleanUnaryExpression_operator_Value object) {
				return createBooleanUnaryExpression_operator_ValueAdapter();
			}
			@Override
			public Adapter caseBooleanValue_value_Value(BooleanValue_value_Value object) {
				return createBooleanValue_value_ValueAdapter();
			}
			@Override
			public Adapter caseControlFlow_guard_Value(ControlFlow_guard_Value object) {
				return createControlFlow_guard_ValueAdapter();
			}
			@Override
			public Adapter caseForkedToken_baseToken_Value(ForkedToken_baseToken_Value object) {
				return createForkedToken_baseToken_ValueAdapter();
			}
			@Override
			public Adapter caseForkedToken_remainingOffersCount_Value(ForkedToken_remainingOffersCount_Value object) {
				return createForkedToken_remainingOffersCount_ValueAdapter();
			}
			@Override
			public Adapter caseInputValue_value_Value(InputValue_value_Value object) {
				return createInputValue_value_ValueAdapter();
			}
			@Override
			public Adapter caseInputValue_variable_Value(InputValue_variable_Value object) {
				return createInputValue_variable_ValueAdapter();
			}
			@Override
			public Adapter caseInput_inputValues_Value(Input_inputValues_Value object) {
				return createInput_inputValues_ValueAdapter();
			}
			@Override
			public Adapter caseIntegerCalculationExpression_assignee_Value(IntegerCalculationExpression_assignee_Value object) {
				return createIntegerCalculationExpression_assignee_ValueAdapter();
			}
			@Override
			public Adapter caseIntegerCalculationExpression_operator_Value(IntegerCalculationExpression_operator_Value object) {
				return createIntegerCalculationExpression_operator_ValueAdapter();
			}
			@Override
			public Adapter caseIntegerComparisonExpression_assignee_Value(IntegerComparisonExpression_assignee_Value object) {
				return createIntegerComparisonExpression_assignee_ValueAdapter();
			}
			@Override
			public Adapter caseIntegerComparisonExpression_operator_Value(IntegerComparisonExpression_operator_Value object) {
				return createIntegerComparisonExpression_operator_ValueAdapter();
			}
			@Override
			public Adapter caseIntegerExpression_operand1_Value(IntegerExpression_operand1_Value object) {
				return createIntegerExpression_operand1_ValueAdapter();
			}
			@Override
			public Adapter caseIntegerExpression_operand2_Value(IntegerExpression_operand2_Value object) {
				return createIntegerExpression_operand2_ValueAdapter();
			}
			@Override
			public Adapter caseIntegerValue_value_Value(IntegerValue_value_Value object) {
				return createIntegerValue_value_ValueAdapter();
			}
			@Override
			public Adapter caseNamedElement_name_Value(NamedElement_name_Value object) {
				return createNamedElement_name_ValueAdapter();
			}
			@Override
			public Adapter caseOffer_offeredTokens_Value(Offer_offeredTokens_Value object) {
				return createOffer_offeredTokens_ValueAdapter();
			}
			@Override
			public Adapter caseOpaqueAction_expressions_Value(OpaqueAction_expressions_Value object) {
				return createOpaqueAction_expressions_ValueAdapter();
			}
			@Override
			public Adapter caseState(State object) {
				return createStateAdapter();
			}
			@Override
			public Adapter caseToken_holder_Value(Token_holder_Value object) {
				return createToken_holder_ValueAdapter();
			}
			@Override
			public Adapter caseTrace_executedNodes_Value(Trace_executedNodes_Value object) {
				return createTrace_executedNodes_ValueAdapter();
			}
			@Override
			public Adapter caseVariable_currentValue_Value(Variable_currentValue_Value object) {
				return createVariable_currentValue_ValueAdapter();
			}
			@Override
			public Adapter caseVariable_initialValue_Value(Variable_initialValue_Value object) {
				return createVariable_initialValue_ValueAdapter();
			}
			@Override
			public Adapter caseVariable_name_Value(Variable_name_Value object) {
				return createVariable_name_ValueAdapter();
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
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.States.ActivityEdge_offers_Value <em>Activity Edge offers Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.States.ActivityEdge_offers_Value
	 * @generated
	 */
	public Adapter createActivityEdge_offers_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.States.ActivityEdge_source_Value <em>Activity Edge source Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.States.ActivityEdge_source_Value
	 * @generated
	 */
	public Adapter createActivityEdge_source_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.States.ActivityEdge_target_Value <em>Activity Edge target Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.States.ActivityEdge_target_Value
	 * @generated
	 */
	public Adapter createActivityEdge_target_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.States.ActivityNode_activity_Value <em>Activity Node activity Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.States.ActivityNode_activity_Value
	 * @generated
	 */
	public Adapter createActivityNode_activity_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.States.ActivityNode_heldTokens_Value <em>Activity Node held Tokens Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.States.ActivityNode_heldTokens_Value
	 * @generated
	 */
	public Adapter createActivityNode_heldTokens_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.States.ActivityNode_incoming_Value <em>Activity Node incoming Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.States.ActivityNode_incoming_Value
	 * @generated
	 */
	public Adapter createActivityNode_incoming_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.States.ActivityNode_outgoing_Value <em>Activity Node outgoing Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.States.ActivityNode_outgoing_Value
	 * @generated
	 */
	public Adapter createActivityNode_outgoing_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.States.ActivityNode_running_Value <em>Activity Node running Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.States.ActivityNode_running_Value
	 * @generated
	 */
	public Adapter createActivityNode_running_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.States.Activity_edges_Value <em>Activity edges Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.States.Activity_edges_Value
	 * @generated
	 */
	public Adapter createActivity_edges_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.States.Activity_inputs_Value <em>Activity inputs Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.States.Activity_inputs_Value
	 * @generated
	 */
	public Adapter createActivity_inputs_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.States.Activity_locals_Value <em>Activity locals Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.States.Activity_locals_Value
	 * @generated
	 */
	public Adapter createActivity_locals_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.States.Activity_nodes_Value <em>Activity nodes Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.States.Activity_nodes_Value
	 * @generated
	 */
	public Adapter createActivity_nodes_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.States.Activity_trace_Value <em>Activity trace Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.States.Activity_trace_Value
	 * @generated
	 */
	public Adapter createActivity_trace_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.States.BooleanBinaryExpression_operand1_Value <em>Boolean Binary Expression operand1 Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.States.BooleanBinaryExpression_operand1_Value
	 * @generated
	 */
	public Adapter createBooleanBinaryExpression_operand1_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.States.BooleanBinaryExpression_operand2_Value <em>Boolean Binary Expression operand2 Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.States.BooleanBinaryExpression_operand2_Value
	 * @generated
	 */
	public Adapter createBooleanBinaryExpression_operand2_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.States.BooleanBinaryExpression_operator_Value <em>Boolean Binary Expression operator Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.States.BooleanBinaryExpression_operator_Value
	 * @generated
	 */
	public Adapter createBooleanBinaryExpression_operator_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.States.BooleanExpression_assignee_Value <em>Boolean Expression assignee Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.States.BooleanExpression_assignee_Value
	 * @generated
	 */
	public Adapter createBooleanExpression_assignee_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.States.BooleanUnaryExpression_operand_Value <em>Boolean Unary Expression operand Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.States.BooleanUnaryExpression_operand_Value
	 * @generated
	 */
	public Adapter createBooleanUnaryExpression_operand_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.States.BooleanUnaryExpression_operator_Value <em>Boolean Unary Expression operator Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.States.BooleanUnaryExpression_operator_Value
	 * @generated
	 */
	public Adapter createBooleanUnaryExpression_operator_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.States.BooleanValue_value_Value <em>Boolean Value value Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.States.BooleanValue_value_Value
	 * @generated
	 */
	public Adapter createBooleanValue_value_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.States.ControlFlow_guard_Value <em>Control Flow guard Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.States.ControlFlow_guard_Value
	 * @generated
	 */
	public Adapter createControlFlow_guard_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.States.ForkedToken_baseToken_Value <em>Forked Token base Token Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.States.ForkedToken_baseToken_Value
	 * @generated
	 */
	public Adapter createForkedToken_baseToken_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value <em>Forked Token remaining Offers Count Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value
	 * @generated
	 */
	public Adapter createForkedToken_remainingOffersCount_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.States.InputValue_value_Value <em>Input Value value Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.States.InputValue_value_Value
	 * @generated
	 */
	public Adapter createInputValue_value_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.States.InputValue_variable_Value <em>Input Value variable Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.States.InputValue_variable_Value
	 * @generated
	 */
	public Adapter createInputValue_variable_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.States.Input_inputValues_Value <em>Input input Values Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.States.Input_inputValues_Value
	 * @generated
	 */
	public Adapter createInput_inputValues_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.States.IntegerCalculationExpression_assignee_Value <em>Integer Calculation Expression assignee Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.States.IntegerCalculationExpression_assignee_Value
	 * @generated
	 */
	public Adapter createIntegerCalculationExpression_assignee_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.States.IntegerCalculationExpression_operator_Value <em>Integer Calculation Expression operator Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.States.IntegerCalculationExpression_operator_Value
	 * @generated
	 */
	public Adapter createIntegerCalculationExpression_operator_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.States.IntegerComparisonExpression_assignee_Value <em>Integer Comparison Expression assignee Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.States.IntegerComparisonExpression_assignee_Value
	 * @generated
	 */
	public Adapter createIntegerComparisonExpression_assignee_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.States.IntegerComparisonExpression_operator_Value <em>Integer Comparison Expression operator Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.States.IntegerComparisonExpression_operator_Value
	 * @generated
	 */
	public Adapter createIntegerComparisonExpression_operator_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.States.IntegerExpression_operand1_Value <em>Integer Expression operand1 Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.States.IntegerExpression_operand1_Value
	 * @generated
	 */
	public Adapter createIntegerExpression_operand1_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.States.IntegerExpression_operand2_Value <em>Integer Expression operand2 Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.States.IntegerExpression_operand2_Value
	 * @generated
	 */
	public Adapter createIntegerExpression_operand2_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.States.IntegerValue_value_Value <em>Integer Value value Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.States.IntegerValue_value_Value
	 * @generated
	 */
	public Adapter createIntegerValue_value_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.States.NamedElement_name_Value <em>Named Element name Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.States.NamedElement_name_Value
	 * @generated
	 */
	public Adapter createNamedElement_name_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.States.Offer_offeredTokens_Value <em>Offer offered Tokens Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.States.Offer_offeredTokens_Value
	 * @generated
	 */
	public Adapter createOffer_offeredTokens_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.States.OpaqueAction_expressions_Value <em>Opaque Action expressions Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.States.OpaqueAction_expressions_Value
	 * @generated
	 */
	public Adapter createOpaqueAction_expressions_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.States.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.States.State
	 * @generated
	 */
	public Adapter createStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.States.Token_holder_Value <em>Token holder Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.States.Token_holder_Value
	 * @generated
	 */
	public Adapter createToken_holder_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.States.Trace_executedNodes_Value <em>Trace executed Nodes Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.States.Trace_executedNodes_Value
	 * @generated
	 */
	public Adapter createTrace_executedNodes_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.States.Variable_currentValue_Value <em>Variable current Value Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.States.Variable_currentValue_Value
	 * @generated
	 */
	public Adapter createVariable_currentValue_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.States.Variable_initialValue_Value <em>Variable initial Value Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.States.Variable_initialValue_Value
	 * @generated
	 */
	public Adapter createVariable_initialValue_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.States.Variable_name_Value <em>Variable name Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.States.Variable_name_Value
	 * @generated
	 */
	public Adapter createVariable_name_ValueAdapter() {
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

} //StatesAdapterFactory
