/**
 */
package activitydiagramTrace.Traced.activitydiagram.util;

import activitydiagramTrace.Traced.activitydiagram.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage
 * @generated
 */
public class ActivitydiagramAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ActivitydiagramPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivitydiagramAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ActivitydiagramPackage.eINSTANCE;
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
	protected ActivitydiagramSwitch<Adapter> modelSwitch =
		new ActivitydiagramSwitch<Adapter>() {
			@Override
			public Adapter caseTracedDecisionNode(TracedDecisionNode object) {
				return createTracedDecisionNodeAdapter();
			}
			@Override
			public Adapter caseTracedIntegerVariable(TracedIntegerVariable object) {
				return createTracedIntegerVariableAdapter();
			}
			@Override
			public Adapter caseTracedControlToken(TracedControlToken object) {
				return createTracedControlTokenAdapter();
			}
			@Override
			public Adapter caseTracedToken(TracedToken object) {
				return createTracedTokenAdapter();
			}
			@Override
			public Adapter caseTracedInput(TracedInput object) {
				return createTracedInputAdapter();
			}
			@Override
			public Adapter caseTracedForkedToken(TracedForkedToken object) {
				return createTracedForkedTokenAdapter();
			}
			@Override
			public Adapter caseTracedBooleanVariable(TracedBooleanVariable object) {
				return createTracedBooleanVariableAdapter();
			}
			@Override
			public Adapter caseTracedControlNode(TracedControlNode object) {
				return createTracedControlNodeAdapter();
			}
			@Override
			public Adapter caseTracedValue(TracedValue object) {
				return createTracedValueAdapter();
			}
			@Override
			public Adapter caseTracedInitialNode(TracedInitialNode object) {
				return createTracedInitialNodeAdapter();
			}
			@Override
			public Adapter caseTracedMergeNode(TracedMergeNode object) {
				return createTracedMergeNodeAdapter();
			}
			@Override
			public Adapter caseTracedExecutableNode(TracedExecutableNode object) {
				return createTracedExecutableNodeAdapter();
			}
			@Override
			public Adapter caseTracedActivityNode(TracedActivityNode object) {
				return createTracedActivityNodeAdapter();
			}
			@Override
			public Adapter caseTracedIntegerValue(TracedIntegerValue object) {
				return createTracedIntegerValueAdapter();
			}
			@Override
			public Adapter caseTracedNamedElement(TracedNamedElement object) {
				return createTracedNamedElementAdapter();
			}
			@Override
			public Adapter caseTracedAction(TracedAction object) {
				return createTracedActionAdapter();
			}
			@Override
			public Adapter caseTracedOpaqueAction(TracedOpaqueAction object) {
				return createTracedOpaqueActionAdapter();
			}
			@Override
			public Adapter caseTracedForkNode(TracedForkNode object) {
				return createTracedForkNodeAdapter();
			}
			@Override
			public Adapter caseTracedActivityEdge(TracedActivityEdge object) {
				return createTracedActivityEdgeAdapter();
			}
			@Override
			public Adapter caseTracedOffer(TracedOffer object) {
				return createTracedOfferAdapter();
			}
			@Override
			public Adapter caseTracedInputValue(TracedInputValue object) {
				return createTracedInputValueAdapter();
			}
			@Override
			public Adapter caseTracedControlFlow(TracedControlFlow object) {
				return createTracedControlFlowAdapter();
			}
			@Override
			public Adapter caseTracedVariable(TracedVariable object) {
				return createTracedVariableAdapter();
			}
			@Override
			public Adapter caseTracedFinalNode(TracedFinalNode object) {
				return createTracedFinalNodeAdapter();
			}
			@Override
			public Adapter caseTracedActivityFinalNode(TracedActivityFinalNode object) {
				return createTracedActivityFinalNodeAdapter();
			}
			@Override
			public Adapter caseTracedJoinNode(TracedJoinNode object) {
				return createTracedJoinNodeAdapter();
			}
			@Override
			public Adapter caseTracedBooleanValue(TracedBooleanValue object) {
				return createTracedBooleanValueAdapter();
			}
			@Override
			public Adapter caseTracedActivity(TracedActivity object) {
				return createTracedActivityAdapter();
			}
			@Override
			public Adapter caseTracedTrace(TracedTrace object) {
				return createTracedTraceAdapter();
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
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Traced.activitydiagram.TracedDecisionNode <em>Traced Decision Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedDecisionNode
	 * @generated
	 */
	public Adapter createTracedDecisionNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Traced.activitydiagram.TracedIntegerVariable <em>Traced Integer Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedIntegerVariable
	 * @generated
	 */
	public Adapter createTracedIntegerVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Traced.activitydiagram.TracedControlToken <em>Traced Control Token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedControlToken
	 * @generated
	 */
	public Adapter createTracedControlTokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Traced.activitydiagram.TracedToken <em>Traced Token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedToken
	 * @generated
	 */
	public Adapter createTracedTokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Traced.activitydiagram.TracedInput <em>Traced Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedInput
	 * @generated
	 */
	public Adapter createTracedInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Traced.activitydiagram.TracedForkedToken <em>Traced Forked Token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedForkedToken
	 * @generated
	 */
	public Adapter createTracedForkedTokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Traced.activitydiagram.TracedBooleanVariable <em>Traced Boolean Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedBooleanVariable
	 * @generated
	 */
	public Adapter createTracedBooleanVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Traced.activitydiagram.TracedControlNode <em>Traced Control Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedControlNode
	 * @generated
	 */
	public Adapter createTracedControlNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Traced.activitydiagram.TracedValue <em>Traced Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedValue
	 * @generated
	 */
	public Adapter createTracedValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Traced.activitydiagram.TracedInitialNode <em>Traced Initial Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedInitialNode
	 * @generated
	 */
	public Adapter createTracedInitialNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Traced.activitydiagram.TracedMergeNode <em>Traced Merge Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedMergeNode
	 * @generated
	 */
	public Adapter createTracedMergeNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Traced.activitydiagram.TracedExecutableNode <em>Traced Executable Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedExecutableNode
	 * @generated
	 */
	public Adapter createTracedExecutableNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Traced.activitydiagram.TracedActivityNode <em>Traced Activity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedActivityNode
	 * @generated
	 */
	public Adapter createTracedActivityNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Traced.activitydiagram.TracedIntegerValue <em>Traced Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedIntegerValue
	 * @generated
	 */
	public Adapter createTracedIntegerValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Traced.activitydiagram.TracedNamedElement <em>Traced Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedNamedElement
	 * @generated
	 */
	public Adapter createTracedNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Traced.activitydiagram.TracedAction <em>Traced Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedAction
	 * @generated
	 */
	public Adapter createTracedActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Traced.activitydiagram.TracedOpaqueAction <em>Traced Opaque Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedOpaqueAction
	 * @generated
	 */
	public Adapter createTracedOpaqueActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Traced.activitydiagram.TracedForkNode <em>Traced Fork Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedForkNode
	 * @generated
	 */
	public Adapter createTracedForkNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Traced.activitydiagram.TracedActivityEdge <em>Traced Activity Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedActivityEdge
	 * @generated
	 */
	public Adapter createTracedActivityEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Traced.activitydiagram.TracedOffer <em>Traced Offer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedOffer
	 * @generated
	 */
	public Adapter createTracedOfferAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Traced.activitydiagram.TracedInputValue <em>Traced Input Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedInputValue
	 * @generated
	 */
	public Adapter createTracedInputValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Traced.activitydiagram.TracedControlFlow <em>Traced Control Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedControlFlow
	 * @generated
	 */
	public Adapter createTracedControlFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Traced.activitydiagram.TracedVariable <em>Traced Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedVariable
	 * @generated
	 */
	public Adapter createTracedVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Traced.activitydiagram.TracedFinalNode <em>Traced Final Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedFinalNode
	 * @generated
	 */
	public Adapter createTracedFinalNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Traced.activitydiagram.TracedActivityFinalNode <em>Traced Activity Final Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedActivityFinalNode
	 * @generated
	 */
	public Adapter createTracedActivityFinalNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Traced.activitydiagram.TracedJoinNode <em>Traced Join Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedJoinNode
	 * @generated
	 */
	public Adapter createTracedJoinNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Traced.activitydiagram.TracedBooleanValue <em>Traced Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedBooleanValue
	 * @generated
	 */
	public Adapter createTracedBooleanValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Traced.activitydiagram.TracedActivity <em>Traced Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedActivity
	 * @generated
	 */
	public Adapter createTracedActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramTrace.Traced.activitydiagram.TracedTrace <em>Traced Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramTrace.Traced.activitydiagram.TracedTrace
	 * @generated
	 */
	public Adapter createTracedTraceAdapter() {
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

} //ActivitydiagramAdapterFactory
