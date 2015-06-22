/**
 */
package activitydiagramTrace.impl;

import activitydiagramTrace.ActivitydiagramTracePackage;
import activitydiagramTrace.State;

import activitydiagramTrace.Steps.BigStep;
import activitydiagramTrace.Steps.SmallStep;
import activitydiagramTrace.Steps.StepsPackage;

import activitydiagramTrace.Values.ActivityEdge_offers_Value;
import activitydiagramTrace.Values.ActivityNode_heldTokens_Value;
import activitydiagramTrace.Values.Activity_trace_Value;
import activitydiagramTrace.Values.BooleanValue_value_Value;
import activitydiagramTrace.Values.ForkedToken_baseToken_Value;
import activitydiagramTrace.Values.ForkedToken_remainingOffersCount_Value;
import activitydiagramTrace.Values.InputValue_value_Value;
import activitydiagramTrace.Values.InputValue_variable_Value;
import activitydiagramTrace.Values.Input_inputValues_Value;
import activitydiagramTrace.Values.IntegerValue_value_Value;
import activitydiagramTrace.Values.Offer_offeredTokens_Value;
import activitydiagramTrace.Values.Token_holder_Value;
import activitydiagramTrace.Values.Trace_executedNodes_Value;
import activitydiagramTrace.Values.ValuesPackage;
import activitydiagramTrace.Values.Variable_currentValue_Value;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activitydiagramTrace.impl.StateImpl#getFollowingStep <em>Following Step</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.StateImpl#getStartedBigSteps <em>Started Big Steps</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.StateImpl#getEndedBigSteps <em>Ended Big Steps</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.StateImpl#getToken_holder_Values <em>Token holder Values</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.StateImpl#getInput_inputValues_Values <em>Input input Values Values</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.StateImpl#getForkedToken_baseToken_Values <em>Forked Token base Token Values</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.StateImpl#getForkedToken_remainingOffersCount_Values <em>Forked Token remaining Offers Count Values</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.StateImpl#getActivityNode_heldTokens_Values <em>Activity Node held Tokens Values</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.StateImpl#getIntegerValue_value_Values <em>Integer Value value Values</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.StateImpl#getActivityEdge_offers_Values <em>Activity Edge offers Values</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.StateImpl#getOffer_offeredTokens_Values <em>Offer offered Tokens Values</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.StateImpl#getInputValue_value_Values <em>Input Value value Values</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.StateImpl#getInputValue_variable_Values <em>Input Value variable Values</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.StateImpl#getVariable_currentValue_Values <em>Variable current Value Values</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.StateImpl#getBooleanValue_value_Values <em>Boolean Value value Values</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.StateImpl#getActivity_trace_Values <em>Activity trace Values</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.StateImpl#getTrace_executedNodes_Values <em>Trace executed Nodes Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateImpl extends MinimalEObjectImpl.Container implements State {
	/**
	 * The cached value of the '{@link #getFollowingStep() <em>Following Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFollowingStep()
	 * @generated
	 * @ordered
	 */
	protected SmallStep followingStep;

	/**
	 * The cached value of the '{@link #getStartedBigSteps() <em>Started Big Steps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartedBigSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<BigStep> startedBigSteps;

	/**
	 * The cached value of the '{@link #getEndedBigSteps() <em>Ended Big Steps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndedBigSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<BigStep> endedBigSteps;

	/**
	 * The cached value of the '{@link #getToken_holder_Values() <em>Token holder Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken_holder_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<Token_holder_Value> token_holder_Values;

	/**
	 * The cached value of the '{@link #getInput_inputValues_Values() <em>Input input Values Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput_inputValues_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<Input_inputValues_Value> input_inputValues_Values;

	/**
	 * The cached value of the '{@link #getForkedToken_baseToken_Values() <em>Forked Token base Token Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForkedToken_baseToken_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<ForkedToken_baseToken_Value> forkedToken_baseToken_Values;

	/**
	 * The cached value of the '{@link #getForkedToken_remainingOffersCount_Values() <em>Forked Token remaining Offers Count Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForkedToken_remainingOffersCount_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<ForkedToken_remainingOffersCount_Value> forkedToken_remainingOffersCount_Values;

	/**
	 * The cached value of the '{@link #getActivityNode_heldTokens_Values() <em>Activity Node held Tokens Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityNode_heldTokens_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNode_heldTokens_Value> activityNode_heldTokens_Values;

	/**
	 * The cached value of the '{@link #getIntegerValue_value_Values() <em>Integer Value value Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegerValue_value_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<IntegerValue_value_Value> integerValue_value_Values;

	/**
	 * The cached value of the '{@link #getActivityEdge_offers_Values() <em>Activity Edge offers Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityEdge_offers_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdge_offers_Value> activityEdge_offers_Values;

	/**
	 * The cached value of the '{@link #getOffer_offeredTokens_Values() <em>Offer offered Tokens Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffer_offeredTokens_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<Offer_offeredTokens_Value> offer_offeredTokens_Values;

	/**
	 * The cached value of the '{@link #getInputValue_value_Values() <em>Input Value value Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputValue_value_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<InputValue_value_Value> inputValue_value_Values;

	/**
	 * The cached value of the '{@link #getInputValue_variable_Values() <em>Input Value variable Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputValue_variable_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<InputValue_variable_Value> inputValue_variable_Values;

	/**
	 * The cached value of the '{@link #getVariable_currentValue_Values() <em>Variable current Value Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable_currentValue_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable_currentValue_Value> variable_currentValue_Values;

	/**
	 * The cached value of the '{@link #getBooleanValue_value_Values() <em>Boolean Value value Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanValue_value_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<BooleanValue_value_Value> booleanValue_value_Values;

	/**
	 * The cached value of the '{@link #getActivity_trace_Values() <em>Activity trace Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity_trace_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity_trace_Value> activity_trace_Values;

	/**
	 * The cached value of the '{@link #getTrace_executedNodes_Values() <em>Trace executed Nodes Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrace_executedNodes_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<Trace_executedNodes_Value> trace_executedNodes_Values;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitydiagramTracePackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmallStep getFollowingStep() {
		if (followingStep != null && followingStep.eIsProxy()) {
			InternalEObject oldFollowingStep = (InternalEObject)followingStep;
			followingStep = (SmallStep)eResolveProxy(oldFollowingStep);
			if (followingStep != oldFollowingStep) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivitydiagramTracePackage.STATE__FOLLOWING_STEP, oldFollowingStep, followingStep));
			}
		}
		return followingStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmallStep basicGetFollowingStep() {
		return followingStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFollowingStep(SmallStep newFollowingStep, NotificationChain msgs) {
		SmallStep oldFollowingStep = followingStep;
		followingStep = newFollowingStep;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivitydiagramTracePackage.STATE__FOLLOWING_STEP, oldFollowingStep, newFollowingStep);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFollowingStep(SmallStep newFollowingStep) {
		if (newFollowingStep != followingStep) {
			NotificationChain msgs = null;
			if (followingStep != null)
				msgs = ((InternalEObject)followingStep).eInverseRemove(this, StepsPackage.SMALL_STEP__PRECEDING_STATE, SmallStep.class, msgs);
			if (newFollowingStep != null)
				msgs = ((InternalEObject)newFollowingStep).eInverseAdd(this, StepsPackage.SMALL_STEP__PRECEDING_STATE, SmallStep.class, msgs);
			msgs = basicSetFollowingStep(newFollowingStep, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitydiagramTracePackage.STATE__FOLLOWING_STEP, newFollowingStep, newFollowingStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BigStep> getStartedBigSteps() {
		if (startedBigSteps == null) {
			startedBigSteps = new EObjectWithInverseResolvingEList<BigStep>(BigStep.class, this, ActivitydiagramTracePackage.STATE__STARTED_BIG_STEPS, StepsPackage.BIG_STEP__STARTING_STATE);
		}
		return startedBigSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BigStep> getEndedBigSteps() {
		if (endedBigSteps == null) {
			endedBigSteps = new EObjectWithInverseResolvingEList<BigStep>(BigStep.class, this, ActivitydiagramTracePackage.STATE__ENDED_BIG_STEPS, StepsPackage.BIG_STEP__ENDING_STATE);
		}
		return endedBigSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Token_holder_Value> getToken_holder_Values() {
		if (token_holder_Values == null) {
			token_holder_Values = new EObjectWithInverseResolvingEList.ManyInverse<Token_holder_Value>(Token_holder_Value.class, this, ActivitydiagramTracePackage.STATE__TOKEN_HOLDER_VALUES, ValuesPackage.TOKEN_HOLDER_VALUE__STATES);
		}
		return token_holder_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Input_inputValues_Value> getInput_inputValues_Values() {
		if (input_inputValues_Values == null) {
			input_inputValues_Values = new EObjectWithInverseResolvingEList.ManyInverse<Input_inputValues_Value>(Input_inputValues_Value.class, this, ActivitydiagramTracePackage.STATE__INPUT_INPUT_VALUES_VALUES, ValuesPackage.INPUT_INPUT_VALUES_VALUE__STATES);
		}
		return input_inputValues_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ForkedToken_baseToken_Value> getForkedToken_baseToken_Values() {
		if (forkedToken_baseToken_Values == null) {
			forkedToken_baseToken_Values = new EObjectWithInverseResolvingEList.ManyInverse<ForkedToken_baseToken_Value>(ForkedToken_baseToken_Value.class, this, ActivitydiagramTracePackage.STATE__FORKED_TOKEN_BASE_TOKEN_VALUES, ValuesPackage.FORKED_TOKEN_BASE_TOKEN_VALUE__STATES);
		}
		return forkedToken_baseToken_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ForkedToken_remainingOffersCount_Value> getForkedToken_remainingOffersCount_Values() {
		if (forkedToken_remainingOffersCount_Values == null) {
			forkedToken_remainingOffersCount_Values = new EObjectWithInverseResolvingEList.ManyInverse<ForkedToken_remainingOffersCount_Value>(ForkedToken_remainingOffersCount_Value.class, this, ActivitydiagramTracePackage.STATE__FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUES, ValuesPackage.FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE__STATES);
		}
		return forkedToken_remainingOffersCount_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNode_heldTokens_Value> getActivityNode_heldTokens_Values() {
		if (activityNode_heldTokens_Values == null) {
			activityNode_heldTokens_Values = new EObjectWithInverseResolvingEList.ManyInverse<ActivityNode_heldTokens_Value>(ActivityNode_heldTokens_Value.class, this, ActivitydiagramTracePackage.STATE__ACTIVITY_NODE_HELD_TOKENS_VALUES, ValuesPackage.ACTIVITY_NODE_HELD_TOKENS_VALUE__STATES);
		}
		return activityNode_heldTokens_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IntegerValue_value_Value> getIntegerValue_value_Values() {
		if (integerValue_value_Values == null) {
			integerValue_value_Values = new EObjectWithInverseResolvingEList.ManyInverse<IntegerValue_value_Value>(IntegerValue_value_Value.class, this, ActivitydiagramTracePackage.STATE__INTEGER_VALUE_VALUE_VALUES, ValuesPackage.INTEGER_VALUE_VALUE_VALUE__STATES);
		}
		return integerValue_value_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge_offers_Value> getActivityEdge_offers_Values() {
		if (activityEdge_offers_Values == null) {
			activityEdge_offers_Values = new EObjectWithInverseResolvingEList.ManyInverse<ActivityEdge_offers_Value>(ActivityEdge_offers_Value.class, this, ActivitydiagramTracePackage.STATE__ACTIVITY_EDGE_OFFERS_VALUES, ValuesPackage.ACTIVITY_EDGE_OFFERS_VALUE__STATES);
		}
		return activityEdge_offers_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Offer_offeredTokens_Value> getOffer_offeredTokens_Values() {
		if (offer_offeredTokens_Values == null) {
			offer_offeredTokens_Values = new EObjectWithInverseResolvingEList.ManyInverse<Offer_offeredTokens_Value>(Offer_offeredTokens_Value.class, this, ActivitydiagramTracePackage.STATE__OFFER_OFFERED_TOKENS_VALUES, ValuesPackage.OFFER_OFFERED_TOKENS_VALUE__STATES);
		}
		return offer_offeredTokens_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputValue_value_Value> getInputValue_value_Values() {
		if (inputValue_value_Values == null) {
			inputValue_value_Values = new EObjectWithInverseResolvingEList.ManyInverse<InputValue_value_Value>(InputValue_value_Value.class, this, ActivitydiagramTracePackage.STATE__INPUT_VALUE_VALUE_VALUES, ValuesPackage.INPUT_VALUE_VALUE_VALUE__STATES);
		}
		return inputValue_value_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputValue_variable_Value> getInputValue_variable_Values() {
		if (inputValue_variable_Values == null) {
			inputValue_variable_Values = new EObjectWithInverseResolvingEList.ManyInverse<InputValue_variable_Value>(InputValue_variable_Value.class, this, ActivitydiagramTracePackage.STATE__INPUT_VALUE_VARIABLE_VALUES, ValuesPackage.INPUT_VALUE_VARIABLE_VALUE__STATES);
		}
		return inputValue_variable_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable_currentValue_Value> getVariable_currentValue_Values() {
		if (variable_currentValue_Values == null) {
			variable_currentValue_Values = new EObjectWithInverseResolvingEList.ManyInverse<Variable_currentValue_Value>(Variable_currentValue_Value.class, this, ActivitydiagramTracePackage.STATE__VARIABLE_CURRENT_VALUE_VALUES, ValuesPackage.VARIABLE_CURRENT_VALUE_VALUE__STATES);
		}
		return variable_currentValue_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BooleanValue_value_Value> getBooleanValue_value_Values() {
		if (booleanValue_value_Values == null) {
			booleanValue_value_Values = new EObjectWithInverseResolvingEList.ManyInverse<BooleanValue_value_Value>(BooleanValue_value_Value.class, this, ActivitydiagramTracePackage.STATE__BOOLEAN_VALUE_VALUE_VALUES, ValuesPackage.BOOLEAN_VALUE_VALUE_VALUE__STATES);
		}
		return booleanValue_value_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activity_trace_Value> getActivity_trace_Values() {
		if (activity_trace_Values == null) {
			activity_trace_Values = new EObjectWithInverseResolvingEList.ManyInverse<Activity_trace_Value>(Activity_trace_Value.class, this, ActivitydiagramTracePackage.STATE__ACTIVITY_TRACE_VALUES, ValuesPackage.ACTIVITY_TRACE_VALUE__STATES);
		}
		return activity_trace_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trace_executedNodes_Value> getTrace_executedNodes_Values() {
		if (trace_executedNodes_Values == null) {
			trace_executedNodes_Values = new EObjectWithInverseResolvingEList.ManyInverse<Trace_executedNodes_Value>(Trace_executedNodes_Value.class, this, ActivitydiagramTracePackage.STATE__TRACE_EXECUTED_NODES_VALUES, ValuesPackage.TRACE_EXECUTED_NODES_VALUE__STATES);
		}
		return trace_executedNodes_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivitydiagramTracePackage.STATE__FOLLOWING_STEP:
				if (followingStep != null)
					msgs = ((InternalEObject)followingStep).eInverseRemove(this, StepsPackage.SMALL_STEP__PRECEDING_STATE, SmallStep.class, msgs);
				return basicSetFollowingStep((SmallStep)otherEnd, msgs);
			case ActivitydiagramTracePackage.STATE__STARTED_BIG_STEPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStartedBigSteps()).basicAdd(otherEnd, msgs);
			case ActivitydiagramTracePackage.STATE__ENDED_BIG_STEPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEndedBigSteps()).basicAdd(otherEnd, msgs);
			case ActivitydiagramTracePackage.STATE__TOKEN_HOLDER_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getToken_holder_Values()).basicAdd(otherEnd, msgs);
			case ActivitydiagramTracePackage.STATE__INPUT_INPUT_VALUES_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInput_inputValues_Values()).basicAdd(otherEnd, msgs);
			case ActivitydiagramTracePackage.STATE__FORKED_TOKEN_BASE_TOKEN_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getForkedToken_baseToken_Values()).basicAdd(otherEnd, msgs);
			case ActivitydiagramTracePackage.STATE__FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getForkedToken_remainingOffersCount_Values()).basicAdd(otherEnd, msgs);
			case ActivitydiagramTracePackage.STATE__ACTIVITY_NODE_HELD_TOKENS_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivityNode_heldTokens_Values()).basicAdd(otherEnd, msgs);
			case ActivitydiagramTracePackage.STATE__INTEGER_VALUE_VALUE_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIntegerValue_value_Values()).basicAdd(otherEnd, msgs);
			case ActivitydiagramTracePackage.STATE__ACTIVITY_EDGE_OFFERS_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivityEdge_offers_Values()).basicAdd(otherEnd, msgs);
			case ActivitydiagramTracePackage.STATE__OFFER_OFFERED_TOKENS_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOffer_offeredTokens_Values()).basicAdd(otherEnd, msgs);
			case ActivitydiagramTracePackage.STATE__INPUT_VALUE_VALUE_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInputValue_value_Values()).basicAdd(otherEnd, msgs);
			case ActivitydiagramTracePackage.STATE__INPUT_VALUE_VARIABLE_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInputValue_variable_Values()).basicAdd(otherEnd, msgs);
			case ActivitydiagramTracePackage.STATE__VARIABLE_CURRENT_VALUE_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVariable_currentValue_Values()).basicAdd(otherEnd, msgs);
			case ActivitydiagramTracePackage.STATE__BOOLEAN_VALUE_VALUE_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBooleanValue_value_Values()).basicAdd(otherEnd, msgs);
			case ActivitydiagramTracePackage.STATE__ACTIVITY_TRACE_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivity_trace_Values()).basicAdd(otherEnd, msgs);
			case ActivitydiagramTracePackage.STATE__TRACE_EXECUTED_NODES_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTrace_executedNodes_Values()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivitydiagramTracePackage.STATE__FOLLOWING_STEP:
				return basicSetFollowingStep(null, msgs);
			case ActivitydiagramTracePackage.STATE__STARTED_BIG_STEPS:
				return ((InternalEList<?>)getStartedBigSteps()).basicRemove(otherEnd, msgs);
			case ActivitydiagramTracePackage.STATE__ENDED_BIG_STEPS:
				return ((InternalEList<?>)getEndedBigSteps()).basicRemove(otherEnd, msgs);
			case ActivitydiagramTracePackage.STATE__TOKEN_HOLDER_VALUES:
				return ((InternalEList<?>)getToken_holder_Values()).basicRemove(otherEnd, msgs);
			case ActivitydiagramTracePackage.STATE__INPUT_INPUT_VALUES_VALUES:
				return ((InternalEList<?>)getInput_inputValues_Values()).basicRemove(otherEnd, msgs);
			case ActivitydiagramTracePackage.STATE__FORKED_TOKEN_BASE_TOKEN_VALUES:
				return ((InternalEList<?>)getForkedToken_baseToken_Values()).basicRemove(otherEnd, msgs);
			case ActivitydiagramTracePackage.STATE__FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUES:
				return ((InternalEList<?>)getForkedToken_remainingOffersCount_Values()).basicRemove(otherEnd, msgs);
			case ActivitydiagramTracePackage.STATE__ACTIVITY_NODE_HELD_TOKENS_VALUES:
				return ((InternalEList<?>)getActivityNode_heldTokens_Values()).basicRemove(otherEnd, msgs);
			case ActivitydiagramTracePackage.STATE__INTEGER_VALUE_VALUE_VALUES:
				return ((InternalEList<?>)getIntegerValue_value_Values()).basicRemove(otherEnd, msgs);
			case ActivitydiagramTracePackage.STATE__ACTIVITY_EDGE_OFFERS_VALUES:
				return ((InternalEList<?>)getActivityEdge_offers_Values()).basicRemove(otherEnd, msgs);
			case ActivitydiagramTracePackage.STATE__OFFER_OFFERED_TOKENS_VALUES:
				return ((InternalEList<?>)getOffer_offeredTokens_Values()).basicRemove(otherEnd, msgs);
			case ActivitydiagramTracePackage.STATE__INPUT_VALUE_VALUE_VALUES:
				return ((InternalEList<?>)getInputValue_value_Values()).basicRemove(otherEnd, msgs);
			case ActivitydiagramTracePackage.STATE__INPUT_VALUE_VARIABLE_VALUES:
				return ((InternalEList<?>)getInputValue_variable_Values()).basicRemove(otherEnd, msgs);
			case ActivitydiagramTracePackage.STATE__VARIABLE_CURRENT_VALUE_VALUES:
				return ((InternalEList<?>)getVariable_currentValue_Values()).basicRemove(otherEnd, msgs);
			case ActivitydiagramTracePackage.STATE__BOOLEAN_VALUE_VALUE_VALUES:
				return ((InternalEList<?>)getBooleanValue_value_Values()).basicRemove(otherEnd, msgs);
			case ActivitydiagramTracePackage.STATE__ACTIVITY_TRACE_VALUES:
				return ((InternalEList<?>)getActivity_trace_Values()).basicRemove(otherEnd, msgs);
			case ActivitydiagramTracePackage.STATE__TRACE_EXECUTED_NODES_VALUES:
				return ((InternalEList<?>)getTrace_executedNodes_Values()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActivitydiagramTracePackage.STATE__FOLLOWING_STEP:
				if (resolve) return getFollowingStep();
				return basicGetFollowingStep();
			case ActivitydiagramTracePackage.STATE__STARTED_BIG_STEPS:
				return getStartedBigSteps();
			case ActivitydiagramTracePackage.STATE__ENDED_BIG_STEPS:
				return getEndedBigSteps();
			case ActivitydiagramTracePackage.STATE__TOKEN_HOLDER_VALUES:
				return getToken_holder_Values();
			case ActivitydiagramTracePackage.STATE__INPUT_INPUT_VALUES_VALUES:
				return getInput_inputValues_Values();
			case ActivitydiagramTracePackage.STATE__FORKED_TOKEN_BASE_TOKEN_VALUES:
				return getForkedToken_baseToken_Values();
			case ActivitydiagramTracePackage.STATE__FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUES:
				return getForkedToken_remainingOffersCount_Values();
			case ActivitydiagramTracePackage.STATE__ACTIVITY_NODE_HELD_TOKENS_VALUES:
				return getActivityNode_heldTokens_Values();
			case ActivitydiagramTracePackage.STATE__INTEGER_VALUE_VALUE_VALUES:
				return getIntegerValue_value_Values();
			case ActivitydiagramTracePackage.STATE__ACTIVITY_EDGE_OFFERS_VALUES:
				return getActivityEdge_offers_Values();
			case ActivitydiagramTracePackage.STATE__OFFER_OFFERED_TOKENS_VALUES:
				return getOffer_offeredTokens_Values();
			case ActivitydiagramTracePackage.STATE__INPUT_VALUE_VALUE_VALUES:
				return getInputValue_value_Values();
			case ActivitydiagramTracePackage.STATE__INPUT_VALUE_VARIABLE_VALUES:
				return getInputValue_variable_Values();
			case ActivitydiagramTracePackage.STATE__VARIABLE_CURRENT_VALUE_VALUES:
				return getVariable_currentValue_Values();
			case ActivitydiagramTracePackage.STATE__BOOLEAN_VALUE_VALUE_VALUES:
				return getBooleanValue_value_Values();
			case ActivitydiagramTracePackage.STATE__ACTIVITY_TRACE_VALUES:
				return getActivity_trace_Values();
			case ActivitydiagramTracePackage.STATE__TRACE_EXECUTED_NODES_VALUES:
				return getTrace_executedNodes_Values();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ActivitydiagramTracePackage.STATE__FOLLOWING_STEP:
				setFollowingStep((SmallStep)newValue);
				return;
			case ActivitydiagramTracePackage.STATE__STARTED_BIG_STEPS:
				getStartedBigSteps().clear();
				getStartedBigSteps().addAll((Collection<? extends BigStep>)newValue);
				return;
			case ActivitydiagramTracePackage.STATE__ENDED_BIG_STEPS:
				getEndedBigSteps().clear();
				getEndedBigSteps().addAll((Collection<? extends BigStep>)newValue);
				return;
			case ActivitydiagramTracePackage.STATE__TOKEN_HOLDER_VALUES:
				getToken_holder_Values().clear();
				getToken_holder_Values().addAll((Collection<? extends Token_holder_Value>)newValue);
				return;
			case ActivitydiagramTracePackage.STATE__INPUT_INPUT_VALUES_VALUES:
				getInput_inputValues_Values().clear();
				getInput_inputValues_Values().addAll((Collection<? extends Input_inputValues_Value>)newValue);
				return;
			case ActivitydiagramTracePackage.STATE__FORKED_TOKEN_BASE_TOKEN_VALUES:
				getForkedToken_baseToken_Values().clear();
				getForkedToken_baseToken_Values().addAll((Collection<? extends ForkedToken_baseToken_Value>)newValue);
				return;
			case ActivitydiagramTracePackage.STATE__FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUES:
				getForkedToken_remainingOffersCount_Values().clear();
				getForkedToken_remainingOffersCount_Values().addAll((Collection<? extends ForkedToken_remainingOffersCount_Value>)newValue);
				return;
			case ActivitydiagramTracePackage.STATE__ACTIVITY_NODE_HELD_TOKENS_VALUES:
				getActivityNode_heldTokens_Values().clear();
				getActivityNode_heldTokens_Values().addAll((Collection<? extends ActivityNode_heldTokens_Value>)newValue);
				return;
			case ActivitydiagramTracePackage.STATE__INTEGER_VALUE_VALUE_VALUES:
				getIntegerValue_value_Values().clear();
				getIntegerValue_value_Values().addAll((Collection<? extends IntegerValue_value_Value>)newValue);
				return;
			case ActivitydiagramTracePackage.STATE__ACTIVITY_EDGE_OFFERS_VALUES:
				getActivityEdge_offers_Values().clear();
				getActivityEdge_offers_Values().addAll((Collection<? extends ActivityEdge_offers_Value>)newValue);
				return;
			case ActivitydiagramTracePackage.STATE__OFFER_OFFERED_TOKENS_VALUES:
				getOffer_offeredTokens_Values().clear();
				getOffer_offeredTokens_Values().addAll((Collection<? extends Offer_offeredTokens_Value>)newValue);
				return;
			case ActivitydiagramTracePackage.STATE__INPUT_VALUE_VALUE_VALUES:
				getInputValue_value_Values().clear();
				getInputValue_value_Values().addAll((Collection<? extends InputValue_value_Value>)newValue);
				return;
			case ActivitydiagramTracePackage.STATE__INPUT_VALUE_VARIABLE_VALUES:
				getInputValue_variable_Values().clear();
				getInputValue_variable_Values().addAll((Collection<? extends InputValue_variable_Value>)newValue);
				return;
			case ActivitydiagramTracePackage.STATE__VARIABLE_CURRENT_VALUE_VALUES:
				getVariable_currentValue_Values().clear();
				getVariable_currentValue_Values().addAll((Collection<? extends Variable_currentValue_Value>)newValue);
				return;
			case ActivitydiagramTracePackage.STATE__BOOLEAN_VALUE_VALUE_VALUES:
				getBooleanValue_value_Values().clear();
				getBooleanValue_value_Values().addAll((Collection<? extends BooleanValue_value_Value>)newValue);
				return;
			case ActivitydiagramTracePackage.STATE__ACTIVITY_TRACE_VALUES:
				getActivity_trace_Values().clear();
				getActivity_trace_Values().addAll((Collection<? extends Activity_trace_Value>)newValue);
				return;
			case ActivitydiagramTracePackage.STATE__TRACE_EXECUTED_NODES_VALUES:
				getTrace_executedNodes_Values().clear();
				getTrace_executedNodes_Values().addAll((Collection<? extends Trace_executedNodes_Value>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ActivitydiagramTracePackage.STATE__FOLLOWING_STEP:
				setFollowingStep((SmallStep)null);
				return;
			case ActivitydiagramTracePackage.STATE__STARTED_BIG_STEPS:
				getStartedBigSteps().clear();
				return;
			case ActivitydiagramTracePackage.STATE__ENDED_BIG_STEPS:
				getEndedBigSteps().clear();
				return;
			case ActivitydiagramTracePackage.STATE__TOKEN_HOLDER_VALUES:
				getToken_holder_Values().clear();
				return;
			case ActivitydiagramTracePackage.STATE__INPUT_INPUT_VALUES_VALUES:
				getInput_inputValues_Values().clear();
				return;
			case ActivitydiagramTracePackage.STATE__FORKED_TOKEN_BASE_TOKEN_VALUES:
				getForkedToken_baseToken_Values().clear();
				return;
			case ActivitydiagramTracePackage.STATE__FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUES:
				getForkedToken_remainingOffersCount_Values().clear();
				return;
			case ActivitydiagramTracePackage.STATE__ACTIVITY_NODE_HELD_TOKENS_VALUES:
				getActivityNode_heldTokens_Values().clear();
				return;
			case ActivitydiagramTracePackage.STATE__INTEGER_VALUE_VALUE_VALUES:
				getIntegerValue_value_Values().clear();
				return;
			case ActivitydiagramTracePackage.STATE__ACTIVITY_EDGE_OFFERS_VALUES:
				getActivityEdge_offers_Values().clear();
				return;
			case ActivitydiagramTracePackage.STATE__OFFER_OFFERED_TOKENS_VALUES:
				getOffer_offeredTokens_Values().clear();
				return;
			case ActivitydiagramTracePackage.STATE__INPUT_VALUE_VALUE_VALUES:
				getInputValue_value_Values().clear();
				return;
			case ActivitydiagramTracePackage.STATE__INPUT_VALUE_VARIABLE_VALUES:
				getInputValue_variable_Values().clear();
				return;
			case ActivitydiagramTracePackage.STATE__VARIABLE_CURRENT_VALUE_VALUES:
				getVariable_currentValue_Values().clear();
				return;
			case ActivitydiagramTracePackage.STATE__BOOLEAN_VALUE_VALUE_VALUES:
				getBooleanValue_value_Values().clear();
				return;
			case ActivitydiagramTracePackage.STATE__ACTIVITY_TRACE_VALUES:
				getActivity_trace_Values().clear();
				return;
			case ActivitydiagramTracePackage.STATE__TRACE_EXECUTED_NODES_VALUES:
				getTrace_executedNodes_Values().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ActivitydiagramTracePackage.STATE__FOLLOWING_STEP:
				return followingStep != null;
			case ActivitydiagramTracePackage.STATE__STARTED_BIG_STEPS:
				return startedBigSteps != null && !startedBigSteps.isEmpty();
			case ActivitydiagramTracePackage.STATE__ENDED_BIG_STEPS:
				return endedBigSteps != null && !endedBigSteps.isEmpty();
			case ActivitydiagramTracePackage.STATE__TOKEN_HOLDER_VALUES:
				return token_holder_Values != null && !token_holder_Values.isEmpty();
			case ActivitydiagramTracePackage.STATE__INPUT_INPUT_VALUES_VALUES:
				return input_inputValues_Values != null && !input_inputValues_Values.isEmpty();
			case ActivitydiagramTracePackage.STATE__FORKED_TOKEN_BASE_TOKEN_VALUES:
				return forkedToken_baseToken_Values != null && !forkedToken_baseToken_Values.isEmpty();
			case ActivitydiagramTracePackage.STATE__FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUES:
				return forkedToken_remainingOffersCount_Values != null && !forkedToken_remainingOffersCount_Values.isEmpty();
			case ActivitydiagramTracePackage.STATE__ACTIVITY_NODE_HELD_TOKENS_VALUES:
				return activityNode_heldTokens_Values != null && !activityNode_heldTokens_Values.isEmpty();
			case ActivitydiagramTracePackage.STATE__INTEGER_VALUE_VALUE_VALUES:
				return integerValue_value_Values != null && !integerValue_value_Values.isEmpty();
			case ActivitydiagramTracePackage.STATE__ACTIVITY_EDGE_OFFERS_VALUES:
				return activityEdge_offers_Values != null && !activityEdge_offers_Values.isEmpty();
			case ActivitydiagramTracePackage.STATE__OFFER_OFFERED_TOKENS_VALUES:
				return offer_offeredTokens_Values != null && !offer_offeredTokens_Values.isEmpty();
			case ActivitydiagramTracePackage.STATE__INPUT_VALUE_VALUE_VALUES:
				return inputValue_value_Values != null && !inputValue_value_Values.isEmpty();
			case ActivitydiagramTracePackage.STATE__INPUT_VALUE_VARIABLE_VALUES:
				return inputValue_variable_Values != null && !inputValue_variable_Values.isEmpty();
			case ActivitydiagramTracePackage.STATE__VARIABLE_CURRENT_VALUE_VALUES:
				return variable_currentValue_Values != null && !variable_currentValue_Values.isEmpty();
			case ActivitydiagramTracePackage.STATE__BOOLEAN_VALUE_VALUE_VALUES:
				return booleanValue_value_Values != null && !booleanValue_value_Values.isEmpty();
			case ActivitydiagramTracePackage.STATE__ACTIVITY_TRACE_VALUES:
				return activity_trace_Values != null && !activity_trace_Values.isEmpty();
			case ActivitydiagramTracePackage.STATE__TRACE_EXECUTED_NODES_VALUES:
				return trace_executedNodes_Values != null && !trace_executedNodes_Values.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StateImpl
