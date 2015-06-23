/**
 */
package activitydiagramTrace;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see activitydiagramTrace.ActivitydiagramTraceFactory
 * @model kind="package"
 * @generated
 */
public interface ActivitydiagramTracePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "activitydiagramTrace";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "activitydiagramTrace";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "activitydiagramTrace";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ActivitydiagramTracePackage eINSTANCE = activitydiagramTrace.impl.ActivitydiagramTracePackageImpl.init();

	/**
	 * The meta object id for the '{@link activitydiagramTrace.impl.TraceImpl <em>Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.impl.TraceImpl
	 * @see activitydiagramTrace.impl.ActivitydiagramTracePackageImpl#getTrace()
	 * @generated
	 */
	int TRACE = 0;

	/**
	 * The feature id for the '<em><b>States Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__STATES_TRACE = 0;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__STEPS = 1;

	/**
	 * The feature id for the '<em><b>Traced Objects</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__TRACED_OBJECTS = 2;

	/**
	 * The number of structural features of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.impl.StateImpl
	 * @see activitydiagramTrace.impl.ActivitydiagramTracePackageImpl#getState()
	 * @generated
	 */
	int STATE = 1;

	/**
	 * The feature id for the '<em><b>Following Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__FOLLOWING_STEP = 0;

	/**
	 * The feature id for the '<em><b>Started Big Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__STARTED_BIG_STEPS = 1;

	/**
	 * The feature id for the '<em><b>Ended Big Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ENDED_BIG_STEPS = 2;

	/**
	 * The feature id for the '<em><b>Activity Edge offers Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ACTIVITY_EDGE_OFFERS_VALUES = 3;

	/**
	 * The feature id for the '<em><b>Activity trace Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ACTIVITY_TRACE_VALUES = 4;

	/**
	 * The feature id for the '<em><b>Activity Node held Tokens Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ACTIVITY_NODE_HELD_TOKENS_VALUES = 5;

	/**
	 * The feature id for the '<em><b>Boolean Value value Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__BOOLEAN_VALUE_VALUE_VALUES = 6;

	/**
	 * The feature id for the '<em><b>Offer offered Tokens Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OFFER_OFFERED_TOKENS_VALUES = 7;

	/**
	 * The feature id for the '<em><b>Trace executed Nodes Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__TRACE_EXECUTED_NODES_VALUES = 8;

	/**
	 * The feature id for the '<em><b>Token holder Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__TOKEN_HOLDER_VALUES = 9;

	/**
	 * The feature id for the '<em><b>Forked Token base Token Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__FORKED_TOKEN_BASE_TOKEN_VALUES = 10;

	/**
	 * The feature id for the '<em><b>Forked Token remaining Offers Count Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUES = 11;

	/**
	 * The feature id for the '<em><b>Input input Values Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INPUT_INPUT_VALUES_VALUES = 12;

	/**
	 * The feature id for the '<em><b>Integer Value value Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INTEGER_VALUE_VALUE_VALUES = 13;

	/**
	 * The feature id for the '<em><b>Input Value value Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INPUT_VALUE_VALUE_VALUES = 14;

	/**
	 * The feature id for the '<em><b>Input Value variable Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INPUT_VALUE_VARIABLE_VALUES = 15;

	/**
	 * The feature id for the '<em><b>Variable current Value Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__VARIABLE_CURRENT_VALUE_VALUES = 16;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 17;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace</em>'.
	 * @see activitydiagramTrace.Trace
	 * @generated
	 */
	EClass getTrace();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramTrace.Trace#getStatesTrace <em>States Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States Trace</em>'.
	 * @see activitydiagramTrace.Trace#getStatesTrace()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_StatesTrace();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagramTrace.Trace#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Steps</em>'.
	 * @see activitydiagramTrace.Trace#getSteps()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Steps();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagramTrace.Trace#getTracedObjects <em>Traced Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Traced Objects</em>'.
	 * @see activitydiagramTrace.Trace#getTracedObjects()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_TracedObjects();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see activitydiagramTrace.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.State#getFollowingStep <em>Following Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Following Step</em>'.
	 * @see activitydiagramTrace.State#getFollowingStep()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_FollowingStep();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.State#getStartedBigSteps <em>Started Big Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Started Big Steps</em>'.
	 * @see activitydiagramTrace.State#getStartedBigSteps()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_StartedBigSteps();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.State#getEndedBigSteps <em>Ended Big Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ended Big Steps</em>'.
	 * @see activitydiagramTrace.State#getEndedBigSteps()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_EndedBigSteps();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.State#getActivityEdge_offers_Values <em>Activity Edge offers Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activity Edge offers Values</em>'.
	 * @see activitydiagramTrace.State#getActivityEdge_offers_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ActivityEdge_offers_Values();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.State#getActivity_trace_Values <em>Activity trace Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activity trace Values</em>'.
	 * @see activitydiagramTrace.State#getActivity_trace_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Activity_trace_Values();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.State#getActivityNode_heldTokens_Values <em>Activity Node held Tokens Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activity Node held Tokens Values</em>'.
	 * @see activitydiagramTrace.State#getActivityNode_heldTokens_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ActivityNode_heldTokens_Values();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.State#getBooleanValue_value_Values <em>Boolean Value value Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Boolean Value value Values</em>'.
	 * @see activitydiagramTrace.State#getBooleanValue_value_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_BooleanValue_value_Values();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.State#getOffer_offeredTokens_Values <em>Offer offered Tokens Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Offer offered Tokens Values</em>'.
	 * @see activitydiagramTrace.State#getOffer_offeredTokens_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Offer_offeredTokens_Values();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.State#getTrace_executedNodes_Values <em>Trace executed Nodes Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Trace executed Nodes Values</em>'.
	 * @see activitydiagramTrace.State#getTrace_executedNodes_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Trace_executedNodes_Values();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.State#getToken_holder_Values <em>Token holder Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Token holder Values</em>'.
	 * @see activitydiagramTrace.State#getToken_holder_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Token_holder_Values();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.State#getForkedToken_baseToken_Values <em>Forked Token base Token Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Forked Token base Token Values</em>'.
	 * @see activitydiagramTrace.State#getForkedToken_baseToken_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ForkedToken_baseToken_Values();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.State#getForkedToken_remainingOffersCount_Values <em>Forked Token remaining Offers Count Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Forked Token remaining Offers Count Values</em>'.
	 * @see activitydiagramTrace.State#getForkedToken_remainingOffersCount_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ForkedToken_remainingOffersCount_Values();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.State#getInput_inputValues_Values <em>Input input Values Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input input Values Values</em>'.
	 * @see activitydiagramTrace.State#getInput_inputValues_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Input_inputValues_Values();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.State#getIntegerValue_value_Values <em>Integer Value value Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Integer Value value Values</em>'.
	 * @see activitydiagramTrace.State#getIntegerValue_value_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_IntegerValue_value_Values();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.State#getInputValue_value_Values <em>Input Value value Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Value value Values</em>'.
	 * @see activitydiagramTrace.State#getInputValue_value_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_InputValue_value_Values();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.State#getInputValue_variable_Values <em>Input Value variable Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Value variable Values</em>'.
	 * @see activitydiagramTrace.State#getInputValue_variable_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_InputValue_variable_Values();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.State#getVariable_currentValue_Values <em>Variable current Value Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Variable current Value Values</em>'.
	 * @see activitydiagramTrace.State#getVariable_currentValue_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Variable_currentValue_Values();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ActivitydiagramTraceFactory getActivitydiagramTraceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link activitydiagramTrace.impl.TraceImpl <em>Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.impl.TraceImpl
		 * @see activitydiagramTrace.impl.ActivitydiagramTracePackageImpl#getTrace()
		 * @generated
		 */
		EClass TRACE = eINSTANCE.getTrace();

		/**
		 * The meta object literal for the '<em><b>States Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__STATES_TRACE = eINSTANCE.getTrace_StatesTrace();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__STEPS = eINSTANCE.getTrace_Steps();

		/**
		 * The meta object literal for the '<em><b>Traced Objects</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__TRACED_OBJECTS = eINSTANCE.getTrace_TracedObjects();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.impl.StateImpl
		 * @see activitydiagramTrace.impl.ActivitydiagramTracePackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Following Step</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__FOLLOWING_STEP = eINSTANCE.getState_FollowingStep();

		/**
		 * The meta object literal for the '<em><b>Started Big Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__STARTED_BIG_STEPS = eINSTANCE.getState_StartedBigSteps();

		/**
		 * The meta object literal for the '<em><b>Ended Big Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ENDED_BIG_STEPS = eINSTANCE.getState_EndedBigSteps();

		/**
		 * The meta object literal for the '<em><b>Activity Edge offers Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ACTIVITY_EDGE_OFFERS_VALUES = eINSTANCE.getState_ActivityEdge_offers_Values();

		/**
		 * The meta object literal for the '<em><b>Activity trace Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ACTIVITY_TRACE_VALUES = eINSTANCE.getState_Activity_trace_Values();

		/**
		 * The meta object literal for the '<em><b>Activity Node held Tokens Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ACTIVITY_NODE_HELD_TOKENS_VALUES = eINSTANCE.getState_ActivityNode_heldTokens_Values();

		/**
		 * The meta object literal for the '<em><b>Boolean Value value Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__BOOLEAN_VALUE_VALUE_VALUES = eINSTANCE.getState_BooleanValue_value_Values();

		/**
		 * The meta object literal for the '<em><b>Offer offered Tokens Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__OFFER_OFFERED_TOKENS_VALUES = eINSTANCE.getState_Offer_offeredTokens_Values();

		/**
		 * The meta object literal for the '<em><b>Trace executed Nodes Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__TRACE_EXECUTED_NODES_VALUES = eINSTANCE.getState_Trace_executedNodes_Values();

		/**
		 * The meta object literal for the '<em><b>Token holder Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__TOKEN_HOLDER_VALUES = eINSTANCE.getState_Token_holder_Values();

		/**
		 * The meta object literal for the '<em><b>Forked Token base Token Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__FORKED_TOKEN_BASE_TOKEN_VALUES = eINSTANCE.getState_ForkedToken_baseToken_Values();

		/**
		 * The meta object literal for the '<em><b>Forked Token remaining Offers Count Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUES = eINSTANCE.getState_ForkedToken_remainingOffersCount_Values();

		/**
		 * The meta object literal for the '<em><b>Input input Values Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__INPUT_INPUT_VALUES_VALUES = eINSTANCE.getState_Input_inputValues_Values();

		/**
		 * The meta object literal for the '<em><b>Integer Value value Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__INTEGER_VALUE_VALUE_VALUES = eINSTANCE.getState_IntegerValue_value_Values();

		/**
		 * The meta object literal for the '<em><b>Input Value value Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__INPUT_VALUE_VALUE_VALUES = eINSTANCE.getState_InputValue_value_Values();

		/**
		 * The meta object literal for the '<em><b>Input Value variable Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__INPUT_VALUE_VARIABLE_VALUES = eINSTANCE.getState_InputValue_variable_Values();

		/**
		 * The meta object literal for the '<em><b>Variable current Value Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__VARIABLE_CURRENT_VALUE_VALUES = eINSTANCE.getState_Variable_currentValue_Values();

	}

} //ActivitydiagramTracePackage
