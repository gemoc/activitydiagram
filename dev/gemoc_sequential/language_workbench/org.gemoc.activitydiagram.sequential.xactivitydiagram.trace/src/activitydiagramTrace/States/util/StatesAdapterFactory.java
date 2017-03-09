/**
 */
package activitydiagramTrace.States.util;

import activitydiagramTrace.States.*;

import fr.inria.diverse.trace.commons.model.trace.Dimension;
import fr.inria.diverse.trace.commons.model.trace.State;
import fr.inria.diverse.trace.commons.model.trace.Step;
import fr.inria.diverse.trace.commons.model.trace.TracedObject;
import fr.inria.diverse.trace.commons.model.trace.Value;

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
			public Adapter caseActivityEdge_offers_Dimension(ActivityEdge_offers_Dimension object) {
				return createActivityEdge_offers_DimensionAdapter();
			}
			@Override
			public Adapter caseActivityEdge_offers_Value(ActivityEdge_offers_Value object) {
				return createActivityEdge_offers_ValueAdapter();
			}
			@Override
			public Adapter caseActivityNode_heldTokens_Dimension(ActivityNode_heldTokens_Dimension object) {
				return createActivityNode_heldTokens_DimensionAdapter();
			}
			@Override
			public Adapter caseActivityNode_heldTokens_Value(ActivityNode_heldTokens_Value object) {
				return createActivityNode_heldTokens_ValueAdapter();
			}
			@Override
			public Adapter caseActivity_trace_Dimension(Activity_trace_Dimension object) {
				return createActivity_trace_DimensionAdapter();
			}
			@Override
			public Adapter caseActivity_trace_Value(Activity_trace_Value object) {
				return createActivity_trace_ValueAdapter();
			}
			@Override
			public Adapter caseDynamicBooleanValue_value_Dimension(DynamicBooleanValue_value_Dimension object) {
				return createDynamicBooleanValue_value_DimensionAdapter();
			}
			@Override
			public Adapter caseDynamicBooleanValue_value_Value(DynamicBooleanValue_value_Value object) {
				return createDynamicBooleanValue_value_ValueAdapter();
			}
			@Override
			public Adapter caseDynamicIntegerValue_value_Dimension(DynamicIntegerValue_value_Dimension object) {
				return createDynamicIntegerValue_value_DimensionAdapter();
			}
			@Override
			public Adapter caseDynamicIntegerValue_value_Value(DynamicIntegerValue_value_Value object) {
				return createDynamicIntegerValue_value_ValueAdapter();
			}
			@Override
			public Adapter caseForkedToken_baseToken_Dimension(ForkedToken_baseToken_Dimension object) {
				return createForkedToken_baseToken_DimensionAdapter();
			}
			@Override
			public Adapter caseForkedToken_baseToken_Value(ForkedToken_baseToken_Value object) {
				return createForkedToken_baseToken_ValueAdapter();
			}
			@Override
			public Adapter caseForkedToken_remainingOffersCount_Dimension(ForkedToken_remainingOffersCount_Dimension object) {
				return createForkedToken_remainingOffersCount_DimensionAdapter();
			}
			@Override
			public Adapter caseForkedToken_remainingOffersCount_Value(ForkedToken_remainingOffersCount_Value object) {
				return createForkedToken_remainingOffersCount_ValueAdapter();
			}
			@Override
			public Adapter caseInput_inputValues_Dimension(Input_inputValues_Dimension object) {
				return createInput_inputValues_DimensionAdapter();
			}
			@Override
			public Adapter caseInput_inputValues_Value(Input_inputValues_Value object) {
				return createInput_inputValues_ValueAdapter();
			}
			@Override
			public Adapter caseOffer_offeredTokens_Dimension(Offer_offeredTokens_Dimension object) {
				return createOffer_offeredTokens_DimensionAdapter();
			}
			@Override
			public Adapter caseOffer_offeredTokens_Value(Offer_offeredTokens_Value object) {
				return createOffer_offeredTokens_ValueAdapter();
			}
			@Override
			public Adapter caseSpecificAttributeValue(SpecificAttributeValue object) {
				return createSpecificAttributeValueAdapter();
			}
			@Override
			public <ValueSubType extends SpecificValue> Adapter caseSpecificDimension(SpecificDimension<ValueSubType> object) {
				return createSpecificDimensionAdapter();
			}
			@Override
			public <T> Adapter caseSpecificReferenceValue(SpecificReferenceValue<T> object) {
				return createSpecificReferenceValueAdapter();
			}
			@Override
			public Adapter caseSpecificState(SpecificState object) {
				return createSpecificStateAdapter();
			}
			@Override
			public <DimensionSubType extends SpecificDimension<? extends SpecificValue>> Adapter caseSpecificTracedObject(SpecificTracedObject<DimensionSubType> object) {
				return createSpecificTracedObjectAdapter();
			}
			@Override
			public Adapter caseSpecificValue(SpecificValue object) {
				return createSpecificValueAdapter();
			}
			@Override
			public Adapter caseTrace_executedNodes_Dimension(Trace_executedNodes_Dimension object) {
				return createTrace_executedNodes_DimensionAdapter();
			}
			@Override
			public Adapter caseTrace_executedNodes_Value(Trace_executedNodes_Value object) {
				return createTrace_executedNodes_ValueAdapter();
			}
			@Override
			public <ValueSubType extends Value<?>> Adapter caseDimension(Dimension<ValueSubType> object) {
				return createDimensionAdapter();
			}
			@Override
			public <StateSubType extends State<?, ?>> Adapter caseValue(Value<StateSubType> object) {
				return createValueAdapter();
			}
			@Override
			public <StepSubType extends Step<?>, ValueSubType extends Value<?>> Adapter caseState(State<StepSubType, ValueSubType> object) {
				return createStateAdapter();
			}
			@Override
			public <DimensionSubType extends Dimension<?>> Adapter caseTracedObject(TracedObject<DimensionSubType> object) {
				return createTracedObjectAdapter();
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
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.States.ActivityEdge_offers_Dimension <em>Activity Edge offers Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.States.ActivityEdge_offers_Dimension
	 * @generated
	 */
	public Adapter createActivityEdge_offers_DimensionAdapter() {
		return null;
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
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.States.ActivityNode_heldTokens_Dimension <em>Activity Node held Tokens Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.States.ActivityNode_heldTokens_Dimension
	 * @generated
	 */
	public Adapter createActivityNode_heldTokens_DimensionAdapter() {
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
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.States.Activity_trace_Dimension <em>Activity trace Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.States.Activity_trace_Dimension
	 * @generated
	 */
	public Adapter createActivity_trace_DimensionAdapter() {
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
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.States.DynamicBooleanValue_value_Dimension <em>Dynamic Boolean Value value Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.States.DynamicBooleanValue_value_Dimension
	 * @generated
	 */
	public Adapter createDynamicBooleanValue_value_DimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.States.DynamicBooleanValue_value_Value <em>Dynamic Boolean Value value Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.States.DynamicBooleanValue_value_Value
	 * @generated
	 */
	public Adapter createDynamicBooleanValue_value_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.States.DynamicIntegerValue_value_Dimension <em>Dynamic Integer Value value Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.States.DynamicIntegerValue_value_Dimension
	 * @generated
	 */
	public Adapter createDynamicIntegerValue_value_DimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.States.DynamicIntegerValue_value_Value <em>Dynamic Integer Value value Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.States.DynamicIntegerValue_value_Value
	 * @generated
	 */
	public Adapter createDynamicIntegerValue_value_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.States.ForkedToken_baseToken_Dimension <em>Forked Token base Token Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.States.ForkedToken_baseToken_Dimension
	 * @generated
	 */
	public Adapter createForkedToken_baseToken_DimensionAdapter() {
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
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.States.ForkedToken_remainingOffersCount_Dimension <em>Forked Token remaining Offers Count Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.States.ForkedToken_remainingOffersCount_Dimension
	 * @generated
	 */
	public Adapter createForkedToken_remainingOffersCount_DimensionAdapter() {
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
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.States.Input_inputValues_Dimension <em>Input input Values Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.States.Input_inputValues_Dimension
	 * @generated
	 */
	public Adapter createInput_inputValues_DimensionAdapter() {
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
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.States.Offer_offeredTokens_Dimension <em>Offer offered Tokens Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.States.Offer_offeredTokens_Dimension
	 * @generated
	 */
	public Adapter createOffer_offeredTokens_DimensionAdapter() {
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
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.States.SpecificAttributeValue <em>Specific Attribute Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.States.SpecificAttributeValue
	 * @generated
	 */
	public Adapter createSpecificAttributeValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.States.SpecificDimension <em>Specific Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.States.SpecificDimension
	 * @generated
	 */
	public Adapter createSpecificDimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.States.SpecificReferenceValue <em>Specific Reference Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.States.SpecificReferenceValue
	 * @generated
	 */
	public Adapter createSpecificReferenceValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.States.SpecificState <em>Specific State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.States.SpecificState
	 * @generated
	 */
	public Adapter createSpecificStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.States.SpecificTracedObject <em>Specific Traced Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.States.SpecificTracedObject
	 * @generated
	 */
	public Adapter createSpecificTracedObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.States.SpecificValue <em>Specific Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.States.SpecificValue
	 * @generated
	 */
	public Adapter createSpecificValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.States.Trace_executedNodes_Dimension <em>Trace executed Nodes Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.States.Trace_executedNodes_Dimension
	 * @generated
	 */
	public Adapter createTrace_executedNodes_DimensionAdapter() {
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
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.trace.commons.model.trace.Dimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.trace.commons.model.trace.Dimension
	 * @generated
	 */
	public Adapter createDimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.trace.commons.model.trace.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.trace.commons.model.trace.Value
	 * @generated
	 */
	public Adapter createValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.trace.commons.model.trace.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.trace.commons.model.trace.State
	 * @generated
	 */
	public Adapter createStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.trace.commons.model.trace.TracedObject <em>Traced Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.trace.commons.model.trace.TracedObject
	 * @generated
	 */
	public Adapter createTracedObjectAdapter() {
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
