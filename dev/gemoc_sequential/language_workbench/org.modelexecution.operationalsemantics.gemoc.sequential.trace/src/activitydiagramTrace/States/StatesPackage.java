/**
 */
package activitydiagramTrace.States;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see activitydiagramTrace.States.StatesFactory
 * @model kind="package"
 * @generated
 */
public interface StatesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "States";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "activitydiagramTrace_States";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tracedclasses";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StatesPackage eINSTANCE = activitydiagramTrace.States.impl.StatesPackageImpl.init();

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.StateImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getState()
	 * @generated
	 */
	int STATE = 0;

	/**
	 * The feature id for the '<em><b>Started Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__STARTED_STEPS = 0;

	/**
	 * The feature id for the '<em><b>Ended Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ENDED_STEPS = 1;

	/**
	 * The feature id for the '<em><b>Offer offered Tokens Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OFFER_OFFERED_TOKENS_VALUES = 2;

	/**
	 * The feature id for the '<em><b>Integer Value value Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INTEGER_VALUE_VALUE_VALUES = 3;

	/**
	 * The feature id for the '<em><b>Input Value value Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INPUT_VALUE_VALUE_VALUES = 4;

	/**
	 * The feature id for the '<em><b>Input Value variable Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INPUT_VALUE_VARIABLE_VALUES = 5;

	/**
	 * The feature id for the '<em><b>Variable current Value Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__VARIABLE_CURRENT_VALUE_VALUES = 6;

	/**
	 * The feature id for the '<em><b>Activity Edge offers Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ACTIVITY_EDGE_OFFERS_VALUES = 7;

	/**
	 * The feature id for the '<em><b>Boolean Value value Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__BOOLEAN_VALUE_VALUE_VALUES = 8;

	/**
	 * The feature id for the '<em><b>Input input Values Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INPUT_INPUT_VALUES_VALUES = 9;

	/**
	 * The feature id for the '<em><b>Activity trace Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ACTIVITY_TRACE_VALUES = 10;

	/**
	 * The feature id for the '<em><b>Forked Token remaining Offers Count Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUES = 11;

	/**
	 * The feature id for the '<em><b>Forked Token base Token Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__FORKED_TOKEN_BASE_TOKEN_VALUES = 12;

	/**
	 * The feature id for the '<em><b>Token holder Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__TOKEN_HOLDER_VALUES = 13;

	/**
	 * The feature id for the '<em><b>Trace executed Nodes Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__TRACE_EXECUTED_NODES_VALUES = 14;

	/**
	 * The feature id for the '<em><b>Activity Node held Tokens Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ACTIVITY_NODE_HELD_TOKENS_VALUES = 15;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 16;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.Offer_offeredTokens_ValueImpl <em>Offer offered Tokens Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.Offer_offeredTokens_ValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getOffer_offeredTokens_Value()
	 * @generated
	 */
	int OFFER_OFFERED_TOKENS_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Offered Tokens</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_OFFERED_TOKENS_VALUE__OFFERED_TOKENS = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_OFFERED_TOKENS_VALUE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_OFFERED_TOKENS_VALUE__STATES = 2;

	/**
	 * The number of structural features of the '<em>Offer offered Tokens Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_OFFERED_TOKENS_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Offer offered Tokens Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_OFFERED_TOKENS_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.IntegerValue_value_ValueImpl <em>Integer Value value Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.IntegerValue_value_ValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getIntegerValue_value_Value()
	 * @generated
	 */
	int INTEGER_VALUE_VALUE_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_VALUE_VALUE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_VALUE_VALUE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_VALUE_VALUE__STATES = 2;

	/**
	 * The number of structural features of the '<em>Integer Value value Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_VALUE_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Integer Value value Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_VALUE_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.InputValue_value_ValueImpl <em>Input Value value Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.InputValue_value_ValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getInputValue_value_Value()
	 * @generated
	 */
	int INPUT_VALUE_VALUE_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VALUE_VALUE_VALUE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VALUE_VALUE_VALUE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VALUE_VALUE_VALUE__STATES = 2;

	/**
	 * The number of structural features of the '<em>Input Value value Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VALUE_VALUE_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Input Value value Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VALUE_VALUE_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.InputValue_variable_ValueImpl <em>Input Value variable Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.InputValue_variable_ValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getInputValue_variable_Value()
	 * @generated
	 */
	int INPUT_VALUE_VARIABLE_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VALUE_VARIABLE_VALUE__VARIABLE = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VALUE_VARIABLE_VALUE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VALUE_VARIABLE_VALUE__STATES = 2;

	/**
	 * The number of structural features of the '<em>Input Value variable Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VALUE_VARIABLE_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Input Value variable Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VALUE_VARIABLE_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.Variable_currentValue_ValueImpl <em>Variable current Value Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.Variable_currentValue_ValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getVariable_currentValue_Value()
	 * @generated
	 */
	int VARIABLE_CURRENT_VALUE_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CURRENT_VALUE_VALUE__CURRENT_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CURRENT_VALUE_VALUE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CURRENT_VALUE_VALUE__STATES = 2;

	/**
	 * The number of structural features of the '<em>Variable current Value Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CURRENT_VALUE_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Variable current Value Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CURRENT_VALUE_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.ActivityEdge_offers_ValueImpl <em>Activity Edge offers Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.ActivityEdge_offers_ValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getActivityEdge_offers_Value()
	 * @generated
	 */
	int ACTIVITY_EDGE_OFFERS_VALUE = 6;

	/**
	 * The feature id for the '<em><b>Offers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_OFFERS_VALUE__OFFERS = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_OFFERS_VALUE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_OFFERS_VALUE__STATES = 2;

	/**
	 * The number of structural features of the '<em>Activity Edge offers Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_OFFERS_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Activity Edge offers Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_OFFERS_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.BooleanValue_value_ValueImpl <em>Boolean Value value Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.BooleanValue_value_ValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getBooleanValue_value_Value()
	 * @generated
	 */
	int BOOLEAN_VALUE_VALUE_VALUE = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_VALUE_VALUE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_VALUE_VALUE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_VALUE_VALUE__STATES = 2;

	/**
	 * The number of structural features of the '<em>Boolean Value value Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_VALUE_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Boolean Value value Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_VALUE_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.Input_inputValues_ValueImpl <em>Input input Values Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.Input_inputValues_ValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getInput_inputValues_Value()
	 * @generated
	 */
	int INPUT_INPUT_VALUES_VALUE = 8;

	/**
	 * The feature id for the '<em><b>Input Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_INPUT_VALUES_VALUE__INPUT_VALUES = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_INPUT_VALUES_VALUE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_INPUT_VALUES_VALUE__STATES = 2;

	/**
	 * The number of structural features of the '<em>Input input Values Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_INPUT_VALUES_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Input input Values Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_INPUT_VALUES_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.Activity_trace_ValueImpl <em>Activity trace Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.Activity_trace_ValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getActivity_trace_Value()
	 * @generated
	 */
	int ACTIVITY_TRACE_VALUE = 9;

	/**
	 * The feature id for the '<em><b>Trace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_TRACE_VALUE__TRACE = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_TRACE_VALUE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_TRACE_VALUE__STATES = 2;

	/**
	 * The number of structural features of the '<em>Activity trace Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_TRACE_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Activity trace Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_TRACE_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.ForkedToken_remainingOffersCount_ValueImpl <em>Forked Token remaining Offers Count Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.ForkedToken_remainingOffersCount_ValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getForkedToken_remainingOffersCount_Value()
	 * @generated
	 */
	int FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE = 10;

	/**
	 * The feature id for the '<em><b>Remaining Offers Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE__REMAINING_OFFERS_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE__STATES = 2;

	/**
	 * The number of structural features of the '<em>Forked Token remaining Offers Count Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Forked Token remaining Offers Count Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.ForkedToken_baseToken_ValueImpl <em>Forked Token base Token Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.ForkedToken_baseToken_ValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getForkedToken_baseToken_Value()
	 * @generated
	 */
	int FORKED_TOKEN_BASE_TOKEN_VALUE = 11;

	/**
	 * The feature id for the '<em><b>Base Token</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN_BASE_TOKEN_VALUE__BASE_TOKEN = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN_BASE_TOKEN_VALUE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN_BASE_TOKEN_VALUE__STATES = 2;

	/**
	 * The number of structural features of the '<em>Forked Token base Token Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN_BASE_TOKEN_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Forked Token base Token Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN_BASE_TOKEN_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.Token_holder_ValueImpl <em>Token holder Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.Token_holder_ValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getToken_holder_Value()
	 * @generated
	 */
	int TOKEN_HOLDER_VALUE = 12;

	/**
	 * The feature id for the '<em><b>Holder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_HOLDER_VALUE__HOLDER = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_HOLDER_VALUE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_HOLDER_VALUE__STATES = 2;

	/**
	 * The number of structural features of the '<em>Token holder Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_HOLDER_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Token holder Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_HOLDER_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.Trace_executedNodes_ValueImpl <em>Trace executed Nodes Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.Trace_executedNodes_ValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getTrace_executedNodes_Value()
	 * @generated
	 */
	int TRACE_EXECUTED_NODES_VALUE = 13;

	/**
	 * The feature id for the '<em><b>Executed Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_EXECUTED_NODES_VALUE__EXECUTED_NODES = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_EXECUTED_NODES_VALUE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_EXECUTED_NODES_VALUE__STATES = 2;

	/**
	 * The number of structural features of the '<em>Trace executed Nodes Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_EXECUTED_NODES_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Trace executed Nodes Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_EXECUTED_NODES_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.ActivityNode_heldTokens_ValueImpl <em>Activity Node held Tokens Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.ActivityNode_heldTokens_ValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getActivityNode_heldTokens_Value()
	 * @generated
	 */
	int ACTIVITY_NODE_HELD_TOKENS_VALUE = 14;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_HELD_TOKENS_VALUE__HELD_TOKENS = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_HELD_TOKENS_VALUE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_HELD_TOKENS_VALUE__STATES = 2;

	/**
	 * The number of structural features of the '<em>Activity Node held Tokens Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_HELD_TOKENS_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Activity Node held Tokens Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_HELD_TOKENS_VALUE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see activitydiagramTrace.States.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.State#getStartedSteps <em>Started Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Started Steps</em>'.
	 * @see activitydiagramTrace.States.State#getStartedSteps()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_StartedSteps();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.State#getEndedSteps <em>Ended Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ended Steps</em>'.
	 * @see activitydiagramTrace.States.State#getEndedSteps()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_EndedSteps();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.State#getOffer_offeredTokens_Values <em>Offer offered Tokens Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Offer offered Tokens Values</em>'.
	 * @see activitydiagramTrace.States.State#getOffer_offeredTokens_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Offer_offeredTokens_Values();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.State#getIntegerValue_value_Values <em>Integer Value value Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Integer Value value Values</em>'.
	 * @see activitydiagramTrace.States.State#getIntegerValue_value_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_IntegerValue_value_Values();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.State#getInputValue_value_Values <em>Input Value value Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Value value Values</em>'.
	 * @see activitydiagramTrace.States.State#getInputValue_value_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_InputValue_value_Values();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.State#getInputValue_variable_Values <em>Input Value variable Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Value variable Values</em>'.
	 * @see activitydiagramTrace.States.State#getInputValue_variable_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_InputValue_variable_Values();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.State#getVariable_currentValue_Values <em>Variable current Value Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Variable current Value Values</em>'.
	 * @see activitydiagramTrace.States.State#getVariable_currentValue_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Variable_currentValue_Values();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.State#getActivityEdge_offers_Values <em>Activity Edge offers Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activity Edge offers Values</em>'.
	 * @see activitydiagramTrace.States.State#getActivityEdge_offers_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ActivityEdge_offers_Values();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.State#getBooleanValue_value_Values <em>Boolean Value value Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Boolean Value value Values</em>'.
	 * @see activitydiagramTrace.States.State#getBooleanValue_value_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_BooleanValue_value_Values();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.State#getInput_inputValues_Values <em>Input input Values Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input input Values Values</em>'.
	 * @see activitydiagramTrace.States.State#getInput_inputValues_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Input_inputValues_Values();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.State#getActivity_trace_Values <em>Activity trace Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activity trace Values</em>'.
	 * @see activitydiagramTrace.States.State#getActivity_trace_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Activity_trace_Values();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.State#getForkedToken_remainingOffersCount_Values <em>Forked Token remaining Offers Count Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Forked Token remaining Offers Count Values</em>'.
	 * @see activitydiagramTrace.States.State#getForkedToken_remainingOffersCount_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ForkedToken_remainingOffersCount_Values();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.State#getForkedToken_baseToken_Values <em>Forked Token base Token Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Forked Token base Token Values</em>'.
	 * @see activitydiagramTrace.States.State#getForkedToken_baseToken_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ForkedToken_baseToken_Values();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.State#getToken_holder_Values <em>Token holder Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Token holder Values</em>'.
	 * @see activitydiagramTrace.States.State#getToken_holder_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Token_holder_Values();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.State#getTrace_executedNodes_Values <em>Trace executed Nodes Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Trace executed Nodes Values</em>'.
	 * @see activitydiagramTrace.States.State#getTrace_executedNodes_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Trace_executedNodes_Values();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.State#getActivityNode_heldTokens_Values <em>Activity Node held Tokens Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activity Node held Tokens Values</em>'.
	 * @see activitydiagramTrace.States.State#getActivityNode_heldTokens_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ActivityNode_heldTokens_Values();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.Offer_offeredTokens_Value <em>Offer offered Tokens Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Offer offered Tokens Value</em>'.
	 * @see activitydiagramTrace.States.Offer_offeredTokens_Value
	 * @generated
	 */
	EClass getOffer_offeredTokens_Value();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.Offer_offeredTokens_Value#getOfferedTokens <em>Offered Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Offered Tokens</em>'.
	 * @see activitydiagramTrace.States.Offer_offeredTokens_Value#getOfferedTokens()
	 * @see #getOffer_offeredTokens_Value()
	 * @generated
	 */
	EReference getOffer_offeredTokens_Value_OfferedTokens();

	/**
	 * Returns the meta object for the container reference '{@link activitydiagramTrace.States.Offer_offeredTokens_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see activitydiagramTrace.States.Offer_offeredTokens_Value#getParent()
	 * @see #getOffer_offeredTokens_Value()
	 * @generated
	 */
	EReference getOffer_offeredTokens_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.Offer_offeredTokens_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see activitydiagramTrace.States.Offer_offeredTokens_Value#getStates()
	 * @see #getOffer_offeredTokens_Value()
	 * @generated
	 */
	EReference getOffer_offeredTokens_Value_States();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.IntegerValue_value_Value <em>Integer Value value Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Value value Value</em>'.
	 * @see activitydiagramTrace.States.IntegerValue_value_Value
	 * @generated
	 */
	EClass getIntegerValue_value_Value();

	/**
	 * Returns the meta object for the attribute '{@link activitydiagramTrace.States.IntegerValue_value_Value#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see activitydiagramTrace.States.IntegerValue_value_Value#getValue()
	 * @see #getIntegerValue_value_Value()
	 * @generated
	 */
	EAttribute getIntegerValue_value_Value_Value();

	/**
	 * Returns the meta object for the container reference '{@link activitydiagramTrace.States.IntegerValue_value_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see activitydiagramTrace.States.IntegerValue_value_Value#getParent()
	 * @see #getIntegerValue_value_Value()
	 * @generated
	 */
	EReference getIntegerValue_value_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.IntegerValue_value_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see activitydiagramTrace.States.IntegerValue_value_Value#getStates()
	 * @see #getIntegerValue_value_Value()
	 * @generated
	 */
	EReference getIntegerValue_value_Value_States();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.InputValue_value_Value <em>Input Value value Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Value value Value</em>'.
	 * @see activitydiagramTrace.States.InputValue_value_Value
	 * @generated
	 */
	EClass getInputValue_value_Value();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.States.InputValue_value_Value#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see activitydiagramTrace.States.InputValue_value_Value#getValue()
	 * @see #getInputValue_value_Value()
	 * @generated
	 */
	EReference getInputValue_value_Value_Value();

	/**
	 * Returns the meta object for the container reference '{@link activitydiagramTrace.States.InputValue_value_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see activitydiagramTrace.States.InputValue_value_Value#getParent()
	 * @see #getInputValue_value_Value()
	 * @generated
	 */
	EReference getInputValue_value_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.InputValue_value_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see activitydiagramTrace.States.InputValue_value_Value#getStates()
	 * @see #getInputValue_value_Value()
	 * @generated
	 */
	EReference getInputValue_value_Value_States();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.InputValue_variable_Value <em>Input Value variable Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Value variable Value</em>'.
	 * @see activitydiagramTrace.States.InputValue_variable_Value
	 * @generated
	 */
	EClass getInputValue_variable_Value();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.States.InputValue_variable_Value#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see activitydiagramTrace.States.InputValue_variable_Value#getVariable()
	 * @see #getInputValue_variable_Value()
	 * @generated
	 */
	EReference getInputValue_variable_Value_Variable();

	/**
	 * Returns the meta object for the container reference '{@link activitydiagramTrace.States.InputValue_variable_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see activitydiagramTrace.States.InputValue_variable_Value#getParent()
	 * @see #getInputValue_variable_Value()
	 * @generated
	 */
	EReference getInputValue_variable_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.InputValue_variable_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see activitydiagramTrace.States.InputValue_variable_Value#getStates()
	 * @see #getInputValue_variable_Value()
	 * @generated
	 */
	EReference getInputValue_variable_Value_States();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.Variable_currentValue_Value <em>Variable current Value Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable current Value Value</em>'.
	 * @see activitydiagramTrace.States.Variable_currentValue_Value
	 * @generated
	 */
	EClass getVariable_currentValue_Value();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.States.Variable_currentValue_Value#getCurrentValue <em>Current Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Value</em>'.
	 * @see activitydiagramTrace.States.Variable_currentValue_Value#getCurrentValue()
	 * @see #getVariable_currentValue_Value()
	 * @generated
	 */
	EReference getVariable_currentValue_Value_CurrentValue();

	/**
	 * Returns the meta object for the container reference '{@link activitydiagramTrace.States.Variable_currentValue_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see activitydiagramTrace.States.Variable_currentValue_Value#getParent()
	 * @see #getVariable_currentValue_Value()
	 * @generated
	 */
	EReference getVariable_currentValue_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.Variable_currentValue_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see activitydiagramTrace.States.Variable_currentValue_Value#getStates()
	 * @see #getVariable_currentValue_Value()
	 * @generated
	 */
	EReference getVariable_currentValue_Value_States();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.ActivityEdge_offers_Value <em>Activity Edge offers Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Edge offers Value</em>'.
	 * @see activitydiagramTrace.States.ActivityEdge_offers_Value
	 * @generated
	 */
	EClass getActivityEdge_offers_Value();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.ActivityEdge_offers_Value#getOffers <em>Offers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Offers</em>'.
	 * @see activitydiagramTrace.States.ActivityEdge_offers_Value#getOffers()
	 * @see #getActivityEdge_offers_Value()
	 * @generated
	 */
	EReference getActivityEdge_offers_Value_Offers();

	/**
	 * Returns the meta object for the container reference '{@link activitydiagramTrace.States.ActivityEdge_offers_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see activitydiagramTrace.States.ActivityEdge_offers_Value#getParent()
	 * @see #getActivityEdge_offers_Value()
	 * @generated
	 */
	EReference getActivityEdge_offers_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.ActivityEdge_offers_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see activitydiagramTrace.States.ActivityEdge_offers_Value#getStates()
	 * @see #getActivityEdge_offers_Value()
	 * @generated
	 */
	EReference getActivityEdge_offers_Value_States();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.BooleanValue_value_Value <em>Boolean Value value Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Value value Value</em>'.
	 * @see activitydiagramTrace.States.BooleanValue_value_Value
	 * @generated
	 */
	EClass getBooleanValue_value_Value();

	/**
	 * Returns the meta object for the attribute '{@link activitydiagramTrace.States.BooleanValue_value_Value#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see activitydiagramTrace.States.BooleanValue_value_Value#isValue()
	 * @see #getBooleanValue_value_Value()
	 * @generated
	 */
	EAttribute getBooleanValue_value_Value_Value();

	/**
	 * Returns the meta object for the container reference '{@link activitydiagramTrace.States.BooleanValue_value_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see activitydiagramTrace.States.BooleanValue_value_Value#getParent()
	 * @see #getBooleanValue_value_Value()
	 * @generated
	 */
	EReference getBooleanValue_value_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.BooleanValue_value_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see activitydiagramTrace.States.BooleanValue_value_Value#getStates()
	 * @see #getBooleanValue_value_Value()
	 * @generated
	 */
	EReference getBooleanValue_value_Value_States();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.Input_inputValues_Value <em>Input input Values Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input input Values Value</em>'.
	 * @see activitydiagramTrace.States.Input_inputValues_Value
	 * @generated
	 */
	EClass getInput_inputValues_Value();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.Input_inputValues_Value#getInputValues <em>Input Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Values</em>'.
	 * @see activitydiagramTrace.States.Input_inputValues_Value#getInputValues()
	 * @see #getInput_inputValues_Value()
	 * @generated
	 */
	EReference getInput_inputValues_Value_InputValues();

	/**
	 * Returns the meta object for the container reference '{@link activitydiagramTrace.States.Input_inputValues_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see activitydiagramTrace.States.Input_inputValues_Value#getParent()
	 * @see #getInput_inputValues_Value()
	 * @generated
	 */
	EReference getInput_inputValues_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.Input_inputValues_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see activitydiagramTrace.States.Input_inputValues_Value#getStates()
	 * @see #getInput_inputValues_Value()
	 * @generated
	 */
	EReference getInput_inputValues_Value_States();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.Activity_trace_Value <em>Activity trace Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity trace Value</em>'.
	 * @see activitydiagramTrace.States.Activity_trace_Value
	 * @generated
	 */
	EClass getActivity_trace_Value();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.States.Activity_trace_Value#getTrace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trace</em>'.
	 * @see activitydiagramTrace.States.Activity_trace_Value#getTrace()
	 * @see #getActivity_trace_Value()
	 * @generated
	 */
	EReference getActivity_trace_Value_Trace();

	/**
	 * Returns the meta object for the container reference '{@link activitydiagramTrace.States.Activity_trace_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see activitydiagramTrace.States.Activity_trace_Value#getParent()
	 * @see #getActivity_trace_Value()
	 * @generated
	 */
	EReference getActivity_trace_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.Activity_trace_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see activitydiagramTrace.States.Activity_trace_Value#getStates()
	 * @see #getActivity_trace_Value()
	 * @generated
	 */
	EReference getActivity_trace_Value_States();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value <em>Forked Token remaining Offers Count Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forked Token remaining Offers Count Value</em>'.
	 * @see activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value
	 * @generated
	 */
	EClass getForkedToken_remainingOffersCount_Value();

	/**
	 * Returns the meta object for the attribute '{@link activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value#getRemainingOffersCount <em>Remaining Offers Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remaining Offers Count</em>'.
	 * @see activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value#getRemainingOffersCount()
	 * @see #getForkedToken_remainingOffersCount_Value()
	 * @generated
	 */
	EAttribute getForkedToken_remainingOffersCount_Value_RemainingOffersCount();

	/**
	 * Returns the meta object for the container reference '{@link activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value#getParent()
	 * @see #getForkedToken_remainingOffersCount_Value()
	 * @generated
	 */
	EReference getForkedToken_remainingOffersCount_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value#getStates()
	 * @see #getForkedToken_remainingOffersCount_Value()
	 * @generated
	 */
	EReference getForkedToken_remainingOffersCount_Value_States();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.ForkedToken_baseToken_Value <em>Forked Token base Token Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forked Token base Token Value</em>'.
	 * @see activitydiagramTrace.States.ForkedToken_baseToken_Value
	 * @generated
	 */
	EClass getForkedToken_baseToken_Value();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.States.ForkedToken_baseToken_Value#getBaseToken <em>Base Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Token</em>'.
	 * @see activitydiagramTrace.States.ForkedToken_baseToken_Value#getBaseToken()
	 * @see #getForkedToken_baseToken_Value()
	 * @generated
	 */
	EReference getForkedToken_baseToken_Value_BaseToken();

	/**
	 * Returns the meta object for the container reference '{@link activitydiagramTrace.States.ForkedToken_baseToken_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see activitydiagramTrace.States.ForkedToken_baseToken_Value#getParent()
	 * @see #getForkedToken_baseToken_Value()
	 * @generated
	 */
	EReference getForkedToken_baseToken_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.ForkedToken_baseToken_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see activitydiagramTrace.States.ForkedToken_baseToken_Value#getStates()
	 * @see #getForkedToken_baseToken_Value()
	 * @generated
	 */
	EReference getForkedToken_baseToken_Value_States();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.Token_holder_Value <em>Token holder Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token holder Value</em>'.
	 * @see activitydiagramTrace.States.Token_holder_Value
	 * @generated
	 */
	EClass getToken_holder_Value();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramTrace.States.Token_holder_Value#getHolder <em>Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Holder</em>'.
	 * @see activitydiagramTrace.States.Token_holder_Value#getHolder()
	 * @see #getToken_holder_Value()
	 * @generated
	 */
	EReference getToken_holder_Value_Holder();

	/**
	 * Returns the meta object for the container reference '{@link activitydiagramTrace.States.Token_holder_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see activitydiagramTrace.States.Token_holder_Value#getParent()
	 * @see #getToken_holder_Value()
	 * @generated
	 */
	EReference getToken_holder_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.Token_holder_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see activitydiagramTrace.States.Token_holder_Value#getStates()
	 * @see #getToken_holder_Value()
	 * @generated
	 */
	EReference getToken_holder_Value_States();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.Trace_executedNodes_Value <em>Trace executed Nodes Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace executed Nodes Value</em>'.
	 * @see activitydiagramTrace.States.Trace_executedNodes_Value
	 * @generated
	 */
	EClass getTrace_executedNodes_Value();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.Trace_executedNodes_Value#getExecutedNodes <em>Executed Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Executed Nodes</em>'.
	 * @see activitydiagramTrace.States.Trace_executedNodes_Value#getExecutedNodes()
	 * @see #getTrace_executedNodes_Value()
	 * @generated
	 */
	EReference getTrace_executedNodes_Value_ExecutedNodes();

	/**
	 * Returns the meta object for the container reference '{@link activitydiagramTrace.States.Trace_executedNodes_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see activitydiagramTrace.States.Trace_executedNodes_Value#getParent()
	 * @see #getTrace_executedNodes_Value()
	 * @generated
	 */
	EReference getTrace_executedNodes_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.Trace_executedNodes_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see activitydiagramTrace.States.Trace_executedNodes_Value#getStates()
	 * @see #getTrace_executedNodes_Value()
	 * @generated
	 */
	EReference getTrace_executedNodes_Value_States();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.ActivityNode_heldTokens_Value <em>Activity Node held Tokens Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Node held Tokens Value</em>'.
	 * @see activitydiagramTrace.States.ActivityNode_heldTokens_Value
	 * @generated
	 */
	EClass getActivityNode_heldTokens_Value();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.ActivityNode_heldTokens_Value#getHeldTokens <em>Held Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Held Tokens</em>'.
	 * @see activitydiagramTrace.States.ActivityNode_heldTokens_Value#getHeldTokens()
	 * @see #getActivityNode_heldTokens_Value()
	 * @generated
	 */
	EReference getActivityNode_heldTokens_Value_HeldTokens();

	/**
	 * Returns the meta object for the container reference '{@link activitydiagramTrace.States.ActivityNode_heldTokens_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see activitydiagramTrace.States.ActivityNode_heldTokens_Value#getParent()
	 * @see #getActivityNode_heldTokens_Value()
	 * @generated
	 */
	EReference getActivityNode_heldTokens_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.ActivityNode_heldTokens_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see activitydiagramTrace.States.ActivityNode_heldTokens_Value#getStates()
	 * @see #getActivityNode_heldTokens_Value()
	 * @generated
	 */
	EReference getActivityNode_heldTokens_Value_States();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StatesFactory getStatesFactory();

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
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.StateImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Started Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__STARTED_STEPS = eINSTANCE.getState_StartedSteps();

		/**
		 * The meta object literal for the '<em><b>Ended Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ENDED_STEPS = eINSTANCE.getState_EndedSteps();

		/**
		 * The meta object literal for the '<em><b>Offer offered Tokens Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__OFFER_OFFERED_TOKENS_VALUES = eINSTANCE.getState_Offer_offeredTokens_Values();

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

		/**
		 * The meta object literal for the '<em><b>Activity Edge offers Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ACTIVITY_EDGE_OFFERS_VALUES = eINSTANCE.getState_ActivityEdge_offers_Values();

		/**
		 * The meta object literal for the '<em><b>Boolean Value value Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__BOOLEAN_VALUE_VALUE_VALUES = eINSTANCE.getState_BooleanValue_value_Values();

		/**
		 * The meta object literal for the '<em><b>Input input Values Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__INPUT_INPUT_VALUES_VALUES = eINSTANCE.getState_Input_inputValues_Values();

		/**
		 * The meta object literal for the '<em><b>Activity trace Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ACTIVITY_TRACE_VALUES = eINSTANCE.getState_Activity_trace_Values();

		/**
		 * The meta object literal for the '<em><b>Forked Token remaining Offers Count Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUES = eINSTANCE.getState_ForkedToken_remainingOffersCount_Values();

		/**
		 * The meta object literal for the '<em><b>Forked Token base Token Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__FORKED_TOKEN_BASE_TOKEN_VALUES = eINSTANCE.getState_ForkedToken_baseToken_Values();

		/**
		 * The meta object literal for the '<em><b>Token holder Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__TOKEN_HOLDER_VALUES = eINSTANCE.getState_Token_holder_Values();

		/**
		 * The meta object literal for the '<em><b>Trace executed Nodes Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__TRACE_EXECUTED_NODES_VALUES = eINSTANCE.getState_Trace_executedNodes_Values();

		/**
		 * The meta object literal for the '<em><b>Activity Node held Tokens Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ACTIVITY_NODE_HELD_TOKENS_VALUES = eINSTANCE.getState_ActivityNode_heldTokens_Values();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.Offer_offeredTokens_ValueImpl <em>Offer offered Tokens Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.Offer_offeredTokens_ValueImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getOffer_offeredTokens_Value()
		 * @generated
		 */
		EClass OFFER_OFFERED_TOKENS_VALUE = eINSTANCE.getOffer_offeredTokens_Value();

		/**
		 * The meta object literal for the '<em><b>Offered Tokens</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OFFER_OFFERED_TOKENS_VALUE__OFFERED_TOKENS = eINSTANCE.getOffer_offeredTokens_Value_OfferedTokens();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OFFER_OFFERED_TOKENS_VALUE__PARENT = eINSTANCE.getOffer_offeredTokens_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OFFER_OFFERED_TOKENS_VALUE__STATES = eINSTANCE.getOffer_offeredTokens_Value_States();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.IntegerValue_value_ValueImpl <em>Integer Value value Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.IntegerValue_value_ValueImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getIntegerValue_value_Value()
		 * @generated
		 */
		EClass INTEGER_VALUE_VALUE_VALUE = eINSTANCE.getIntegerValue_value_Value();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_VALUE_VALUE_VALUE__VALUE = eINSTANCE.getIntegerValue_value_Value_Value();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGER_VALUE_VALUE_VALUE__PARENT = eINSTANCE.getIntegerValue_value_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGER_VALUE_VALUE_VALUE__STATES = eINSTANCE.getIntegerValue_value_Value_States();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.InputValue_value_ValueImpl <em>Input Value value Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.InputValue_value_ValueImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getInputValue_value_Value()
		 * @generated
		 */
		EClass INPUT_VALUE_VALUE_VALUE = eINSTANCE.getInputValue_value_Value();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_VALUE_VALUE_VALUE__VALUE = eINSTANCE.getInputValue_value_Value_Value();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_VALUE_VALUE_VALUE__PARENT = eINSTANCE.getInputValue_value_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_VALUE_VALUE_VALUE__STATES = eINSTANCE.getInputValue_value_Value_States();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.InputValue_variable_ValueImpl <em>Input Value variable Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.InputValue_variable_ValueImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getInputValue_variable_Value()
		 * @generated
		 */
		EClass INPUT_VALUE_VARIABLE_VALUE = eINSTANCE.getInputValue_variable_Value();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_VALUE_VARIABLE_VALUE__VARIABLE = eINSTANCE.getInputValue_variable_Value_Variable();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_VALUE_VARIABLE_VALUE__PARENT = eINSTANCE.getInputValue_variable_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_VALUE_VARIABLE_VALUE__STATES = eINSTANCE.getInputValue_variable_Value_States();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.Variable_currentValue_ValueImpl <em>Variable current Value Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.Variable_currentValue_ValueImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getVariable_currentValue_Value()
		 * @generated
		 */
		EClass VARIABLE_CURRENT_VALUE_VALUE = eINSTANCE.getVariable_currentValue_Value();

		/**
		 * The meta object literal for the '<em><b>Current Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_CURRENT_VALUE_VALUE__CURRENT_VALUE = eINSTANCE.getVariable_currentValue_Value_CurrentValue();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_CURRENT_VALUE_VALUE__PARENT = eINSTANCE.getVariable_currentValue_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_CURRENT_VALUE_VALUE__STATES = eINSTANCE.getVariable_currentValue_Value_States();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.ActivityEdge_offers_ValueImpl <em>Activity Edge offers Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.ActivityEdge_offers_ValueImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getActivityEdge_offers_Value()
		 * @generated
		 */
		EClass ACTIVITY_EDGE_OFFERS_VALUE = eINSTANCE.getActivityEdge_offers_Value();

		/**
		 * The meta object literal for the '<em><b>Offers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE_OFFERS_VALUE__OFFERS = eINSTANCE.getActivityEdge_offers_Value_Offers();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE_OFFERS_VALUE__PARENT = eINSTANCE.getActivityEdge_offers_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE_OFFERS_VALUE__STATES = eINSTANCE.getActivityEdge_offers_Value_States();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.BooleanValue_value_ValueImpl <em>Boolean Value value Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.BooleanValue_value_ValueImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getBooleanValue_value_Value()
		 * @generated
		 */
		EClass BOOLEAN_VALUE_VALUE_VALUE = eINSTANCE.getBooleanValue_value_Value();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_VALUE_VALUE_VALUE__VALUE = eINSTANCE.getBooleanValue_value_Value_Value();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_VALUE_VALUE_VALUE__PARENT = eINSTANCE.getBooleanValue_value_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_VALUE_VALUE_VALUE__STATES = eINSTANCE.getBooleanValue_value_Value_States();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.Input_inputValues_ValueImpl <em>Input input Values Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.Input_inputValues_ValueImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getInput_inputValues_Value()
		 * @generated
		 */
		EClass INPUT_INPUT_VALUES_VALUE = eINSTANCE.getInput_inputValues_Value();

		/**
		 * The meta object literal for the '<em><b>Input Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_INPUT_VALUES_VALUE__INPUT_VALUES = eINSTANCE.getInput_inputValues_Value_InputValues();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_INPUT_VALUES_VALUE__PARENT = eINSTANCE.getInput_inputValues_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_INPUT_VALUES_VALUE__STATES = eINSTANCE.getInput_inputValues_Value_States();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.Activity_trace_ValueImpl <em>Activity trace Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.Activity_trace_ValueImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getActivity_trace_Value()
		 * @generated
		 */
		EClass ACTIVITY_TRACE_VALUE = eINSTANCE.getActivity_trace_Value();

		/**
		 * The meta object literal for the '<em><b>Trace</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_TRACE_VALUE__TRACE = eINSTANCE.getActivity_trace_Value_Trace();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_TRACE_VALUE__PARENT = eINSTANCE.getActivity_trace_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_TRACE_VALUE__STATES = eINSTANCE.getActivity_trace_Value_States();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.ForkedToken_remainingOffersCount_ValueImpl <em>Forked Token remaining Offers Count Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.ForkedToken_remainingOffersCount_ValueImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getForkedToken_remainingOffersCount_Value()
		 * @generated
		 */
		EClass FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE = eINSTANCE.getForkedToken_remainingOffersCount_Value();

		/**
		 * The meta object literal for the '<em><b>Remaining Offers Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE__REMAINING_OFFERS_COUNT = eINSTANCE.getForkedToken_remainingOffersCount_Value_RemainingOffersCount();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE__PARENT = eINSTANCE.getForkedToken_remainingOffersCount_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE__STATES = eINSTANCE.getForkedToken_remainingOffersCount_Value_States();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.ForkedToken_baseToken_ValueImpl <em>Forked Token base Token Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.ForkedToken_baseToken_ValueImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getForkedToken_baseToken_Value()
		 * @generated
		 */
		EClass FORKED_TOKEN_BASE_TOKEN_VALUE = eINSTANCE.getForkedToken_baseToken_Value();

		/**
		 * The meta object literal for the '<em><b>Base Token</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORKED_TOKEN_BASE_TOKEN_VALUE__BASE_TOKEN = eINSTANCE.getForkedToken_baseToken_Value_BaseToken();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORKED_TOKEN_BASE_TOKEN_VALUE__PARENT = eINSTANCE.getForkedToken_baseToken_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORKED_TOKEN_BASE_TOKEN_VALUE__STATES = eINSTANCE.getForkedToken_baseToken_Value_States();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.Token_holder_ValueImpl <em>Token holder Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.Token_holder_ValueImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getToken_holder_Value()
		 * @generated
		 */
		EClass TOKEN_HOLDER_VALUE = eINSTANCE.getToken_holder_Value();

		/**
		 * The meta object literal for the '<em><b>Holder</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_HOLDER_VALUE__HOLDER = eINSTANCE.getToken_holder_Value_Holder();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_HOLDER_VALUE__PARENT = eINSTANCE.getToken_holder_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_HOLDER_VALUE__STATES = eINSTANCE.getToken_holder_Value_States();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.Trace_executedNodes_ValueImpl <em>Trace executed Nodes Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.Trace_executedNodes_ValueImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getTrace_executedNodes_Value()
		 * @generated
		 */
		EClass TRACE_EXECUTED_NODES_VALUE = eINSTANCE.getTrace_executedNodes_Value();

		/**
		 * The meta object literal for the '<em><b>Executed Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_EXECUTED_NODES_VALUE__EXECUTED_NODES = eINSTANCE.getTrace_executedNodes_Value_ExecutedNodes();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_EXECUTED_NODES_VALUE__PARENT = eINSTANCE.getTrace_executedNodes_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_EXECUTED_NODES_VALUE__STATES = eINSTANCE.getTrace_executedNodes_Value_States();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.ActivityNode_heldTokens_ValueImpl <em>Activity Node held Tokens Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.ActivityNode_heldTokens_ValueImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getActivityNode_heldTokens_Value()
		 * @generated
		 */
		EClass ACTIVITY_NODE_HELD_TOKENS_VALUE = eINSTANCE.getActivityNode_heldTokens_Value();

		/**
		 * The meta object literal for the '<em><b>Held Tokens</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE_HELD_TOKENS_VALUE__HELD_TOKENS = eINSTANCE.getActivityNode_heldTokens_Value_HeldTokens();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE_HELD_TOKENS_VALUE__PARENT = eINSTANCE.getActivityNode_heldTokens_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE_HELD_TOKENS_VALUE__STATES = eINSTANCE.getActivityNode_heldTokens_Value_States();

	}

} //StatesPackage
