/**
 */
package activitydiagramTrace.Traced.activitydiagram.impl;

import activitydiagramTrace.Traced.activitydiagram.*;

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
public class ActivitydiagramFactoryImpl extends EFactoryImpl implements ActivitydiagramFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActivitydiagramFactory init() {
		try {
			ActivitydiagramFactory theActivitydiagramFactory = (ActivitydiagramFactory)EPackage.Registry.INSTANCE.getEFactory(ActivitydiagramPackage.eNS_URI);
			if (theActivitydiagramFactory != null) {
				return theActivitydiagramFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ActivitydiagramFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivitydiagramFactoryImpl() {
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
			case ActivitydiagramPackage.TRACED_ACTIVITY: return createTracedActivity();
			case ActivitydiagramPackage.TRACED_INITIAL_NODE: return createTracedInitialNode();
			case ActivitydiagramPackage.TRACED_INTEGER_VARIABLE: return createTracedIntegerVariable();
			case ActivitydiagramPackage.TRACED_BOOLEAN_VALUE: return createTracedBooleanValue();
			case ActivitydiagramPackage.TRACED_OFFER: return createTracedOffer();
			case ActivitydiagramPackage.TRACED_TRACE: return createTracedTrace();
			case ActivitydiagramPackage.TRACED_OPAQUE_ACTION: return createTracedOpaqueAction();
			case ActivitydiagramPackage.TRACED_DECISION_NODE: return createTracedDecisionNode();
			case ActivitydiagramPackage.TRACED_FORK_NODE: return createTracedForkNode();
			case ActivitydiagramPackage.TRACED_CONTROL_TOKEN: return createTracedControlToken();
			case ActivitydiagramPackage.TRACED_CONTROL_FLOW: return createTracedControlFlow();
			case ActivitydiagramPackage.TRACED_JOIN_NODE: return createTracedJoinNode();
			case ActivitydiagramPackage.TRACED_FORKED_TOKEN: return createTracedForkedToken();
			case ActivitydiagramPackage.TRACED_INPUT: return createTracedInput();
			case ActivitydiagramPackage.TRACED_MERGE_NODE: return createTracedMergeNode();
			case ActivitydiagramPackage.TRACED_BOOLEAN_VARIABLE: return createTracedBooleanVariable();
			case ActivitydiagramPackage.TRACED_INTEGER_VALUE: return createTracedIntegerValue();
			case ActivitydiagramPackage.TRACED_ACTIVITY_FINAL_NODE: return createTracedActivityFinalNode();
			case ActivitydiagramPackage.TRACED_INPUT_VALUE: return createTracedInputValue();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedActivity createTracedActivity() {
		TracedActivityImpl tracedActivity = new TracedActivityImpl();
		return tracedActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedInitialNode createTracedInitialNode() {
		TracedInitialNodeImpl tracedInitialNode = new TracedInitialNodeImpl();
		return tracedInitialNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedIntegerVariable createTracedIntegerVariable() {
		TracedIntegerVariableImpl tracedIntegerVariable = new TracedIntegerVariableImpl();
		return tracedIntegerVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedBooleanValue createTracedBooleanValue() {
		TracedBooleanValueImpl tracedBooleanValue = new TracedBooleanValueImpl();
		return tracedBooleanValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedOffer createTracedOffer() {
		TracedOfferImpl tracedOffer = new TracedOfferImpl();
		return tracedOffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedTrace createTracedTrace() {
		TracedTraceImpl tracedTrace = new TracedTraceImpl();
		return tracedTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedOpaqueAction createTracedOpaqueAction() {
		TracedOpaqueActionImpl tracedOpaqueAction = new TracedOpaqueActionImpl();
		return tracedOpaqueAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedDecisionNode createTracedDecisionNode() {
		TracedDecisionNodeImpl tracedDecisionNode = new TracedDecisionNodeImpl();
		return tracedDecisionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedForkNode createTracedForkNode() {
		TracedForkNodeImpl tracedForkNode = new TracedForkNodeImpl();
		return tracedForkNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedControlToken createTracedControlToken() {
		TracedControlTokenImpl tracedControlToken = new TracedControlTokenImpl();
		return tracedControlToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedControlFlow createTracedControlFlow() {
		TracedControlFlowImpl tracedControlFlow = new TracedControlFlowImpl();
		return tracedControlFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedJoinNode createTracedJoinNode() {
		TracedJoinNodeImpl tracedJoinNode = new TracedJoinNodeImpl();
		return tracedJoinNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedForkedToken createTracedForkedToken() {
		TracedForkedTokenImpl tracedForkedToken = new TracedForkedTokenImpl();
		return tracedForkedToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedInput createTracedInput() {
		TracedInputImpl tracedInput = new TracedInputImpl();
		return tracedInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedMergeNode createTracedMergeNode() {
		TracedMergeNodeImpl tracedMergeNode = new TracedMergeNodeImpl();
		return tracedMergeNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedBooleanVariable createTracedBooleanVariable() {
		TracedBooleanVariableImpl tracedBooleanVariable = new TracedBooleanVariableImpl();
		return tracedBooleanVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedIntegerValue createTracedIntegerValue() {
		TracedIntegerValueImpl tracedIntegerValue = new TracedIntegerValueImpl();
		return tracedIntegerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedActivityFinalNode createTracedActivityFinalNode() {
		TracedActivityFinalNodeImpl tracedActivityFinalNode = new TracedActivityFinalNodeImpl();
		return tracedActivityFinalNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedInputValue createTracedInputValue() {
		TracedInputValueImpl tracedInputValue = new TracedInputValueImpl();
		return tracedInputValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivitydiagramPackage getActivitydiagramPackage() {
		return (ActivitydiagramPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ActivitydiagramPackage getPackage() {
		return ActivitydiagramPackage.eINSTANCE;
	}

} //ActivitydiagramFactoryImpl
