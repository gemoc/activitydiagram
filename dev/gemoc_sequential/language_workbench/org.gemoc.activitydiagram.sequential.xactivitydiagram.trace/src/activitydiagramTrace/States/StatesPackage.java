/**
 */
package activitydiagramTrace.States;

import fr.inria.diverse.trace.commons.model.trace.TracePackage;

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
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.SpecificDimensionImpl <em>Specific Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.SpecificDimensionImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getSpecificDimension()
	 * @generated
	 */
	int SPECIFIC_DIMENSION = 19;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_DIMENSION__VALUES = TracePackage.DIMENSION__VALUES;

	/**
	 * The number of structural features of the '<em>Specific Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_DIMENSION_FEATURE_COUNT = TracePackage.DIMENSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.ActivityEdge_offers_DimensionImpl <em>Activity Edge offers Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.ActivityEdge_offers_DimensionImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getActivityEdge_offers_Dimension()
	 * @generated
	 */
	int ACTIVITY_EDGE_OFFERS_DIMENSION = 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_OFFERS_DIMENSION__VALUES = SPECIFIC_DIMENSION__VALUES;

	/**
	 * The number of structural features of the '<em>Activity Edge offers Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_OFFERS_DIMENSION_FEATURE_COUNT = SPECIFIC_DIMENSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.SpecificValueImpl <em>Specific Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.SpecificValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getSpecificValue()
	 * @generated
	 */
	int SPECIFIC_VALUE = 23;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_VALUE__STATES = TracePackage.VALUE__STATES;

	/**
	 * The number of structural features of the '<em>Specific Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_VALUE_FEATURE_COUNT = TracePackage.VALUE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.SpecificReferenceValue <em>Specific Reference Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.SpecificReferenceValue
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getSpecificReferenceValue()
	 * @generated
	 */
	int SPECIFIC_REFERENCE_VALUE = 20;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_REFERENCE_VALUE__STATES = SPECIFIC_VALUE__STATES;

	/**
	 * The number of structural features of the '<em>Specific Reference Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_REFERENCE_VALUE_FEATURE_COUNT = SPECIFIC_VALUE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.ActivityEdge_offers_ValueImpl <em>Activity Edge offers Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.ActivityEdge_offers_ValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getActivityEdge_offers_Value()
	 * @generated
	 */
	int ACTIVITY_EDGE_OFFERS_VALUE = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_OFFERS_VALUE__STATES = SPECIFIC_REFERENCE_VALUE__STATES;

	/**
	 * The feature id for the '<em><b>Offers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_OFFERS_VALUE__OFFERS = SPECIFIC_REFERENCE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activity Edge offers Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_OFFERS_VALUE_FEATURE_COUNT = SPECIFIC_REFERENCE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.ActivityNode_heldTokens_DimensionImpl <em>Activity Node held Tokens Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.ActivityNode_heldTokens_DimensionImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getActivityNode_heldTokens_Dimension()
	 * @generated
	 */
	int ACTIVITY_NODE_HELD_TOKENS_DIMENSION = 2;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_HELD_TOKENS_DIMENSION__VALUES = SPECIFIC_DIMENSION__VALUES;

	/**
	 * The number of structural features of the '<em>Activity Node held Tokens Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_HELD_TOKENS_DIMENSION_FEATURE_COUNT = SPECIFIC_DIMENSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.ActivityNode_heldTokens_ValueImpl <em>Activity Node held Tokens Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.ActivityNode_heldTokens_ValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getActivityNode_heldTokens_Value()
	 * @generated
	 */
	int ACTIVITY_NODE_HELD_TOKENS_VALUE = 3;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_HELD_TOKENS_VALUE__STATES = SPECIFIC_REFERENCE_VALUE__STATES;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_HELD_TOKENS_VALUE__HELD_TOKENS = SPECIFIC_REFERENCE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activity Node held Tokens Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_HELD_TOKENS_VALUE_FEATURE_COUNT = SPECIFIC_REFERENCE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.Activity_trace_DimensionImpl <em>Activity trace Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.Activity_trace_DimensionImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getActivity_trace_Dimension()
	 * @generated
	 */
	int ACTIVITY_TRACE_DIMENSION = 4;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_TRACE_DIMENSION__VALUES = SPECIFIC_DIMENSION__VALUES;

	/**
	 * The number of structural features of the '<em>Activity trace Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_TRACE_DIMENSION_FEATURE_COUNT = SPECIFIC_DIMENSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.Activity_trace_ValueImpl <em>Activity trace Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.Activity_trace_ValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getActivity_trace_Value()
	 * @generated
	 */
	int ACTIVITY_TRACE_VALUE = 5;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_TRACE_VALUE__STATES = SPECIFIC_REFERENCE_VALUE__STATES;

	/**
	 * The feature id for the '<em><b>Trace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_TRACE_VALUE__TRACE = SPECIFIC_REFERENCE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activity trace Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_TRACE_VALUE_FEATURE_COUNT = SPECIFIC_REFERENCE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.DynamicBooleanValue_value_DimensionImpl <em>Dynamic Boolean Value value Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.DynamicBooleanValue_value_DimensionImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getDynamicBooleanValue_value_Dimension()
	 * @generated
	 */
	int DYNAMIC_BOOLEAN_VALUE_VALUE_DIMENSION = 6;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BOOLEAN_VALUE_VALUE_DIMENSION__VALUES = SPECIFIC_DIMENSION__VALUES;

	/**
	 * The number of structural features of the '<em>Dynamic Boolean Value value Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BOOLEAN_VALUE_VALUE_DIMENSION_FEATURE_COUNT = SPECIFIC_DIMENSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.SpecificAttributeValue <em>Specific Attribute Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.SpecificAttributeValue
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getSpecificAttributeValue()
	 * @generated
	 */
	int SPECIFIC_ATTRIBUTE_VALUE = 18;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_ATTRIBUTE_VALUE__STATES = SPECIFIC_VALUE__STATES;

	/**
	 * The number of structural features of the '<em>Specific Attribute Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_ATTRIBUTE_VALUE_FEATURE_COUNT = SPECIFIC_VALUE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.DynamicBooleanValue_value_ValueImpl <em>Dynamic Boolean Value value Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.DynamicBooleanValue_value_ValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getDynamicBooleanValue_value_Value()
	 * @generated
	 */
	int DYNAMIC_BOOLEAN_VALUE_VALUE_VALUE = 7;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BOOLEAN_VALUE_VALUE_VALUE__STATES = SPECIFIC_ATTRIBUTE_VALUE__STATES;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BOOLEAN_VALUE_VALUE_VALUE__VALUE = SPECIFIC_ATTRIBUTE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dynamic Boolean Value value Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BOOLEAN_VALUE_VALUE_VALUE_FEATURE_COUNT = SPECIFIC_ATTRIBUTE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.DynamicIntegerValue_value_DimensionImpl <em>Dynamic Integer Value value Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.DynamicIntegerValue_value_DimensionImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getDynamicIntegerValue_value_Dimension()
	 * @generated
	 */
	int DYNAMIC_INTEGER_VALUE_VALUE_DIMENSION = 8;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_INTEGER_VALUE_VALUE_DIMENSION__VALUES = SPECIFIC_DIMENSION__VALUES;

	/**
	 * The number of structural features of the '<em>Dynamic Integer Value value Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_INTEGER_VALUE_VALUE_DIMENSION_FEATURE_COUNT = SPECIFIC_DIMENSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.DynamicIntegerValue_value_ValueImpl <em>Dynamic Integer Value value Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.DynamicIntegerValue_value_ValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getDynamicIntegerValue_value_Value()
	 * @generated
	 */
	int DYNAMIC_INTEGER_VALUE_VALUE_VALUE = 9;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_INTEGER_VALUE_VALUE_VALUE__STATES = SPECIFIC_ATTRIBUTE_VALUE__STATES;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_INTEGER_VALUE_VALUE_VALUE__VALUE = SPECIFIC_ATTRIBUTE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dynamic Integer Value value Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_INTEGER_VALUE_VALUE_VALUE_FEATURE_COUNT = SPECIFIC_ATTRIBUTE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.ForkedToken_baseToken_DimensionImpl <em>Forked Token base Token Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.ForkedToken_baseToken_DimensionImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getForkedToken_baseToken_Dimension()
	 * @generated
	 */
	int FORKED_TOKEN_BASE_TOKEN_DIMENSION = 10;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN_BASE_TOKEN_DIMENSION__VALUES = SPECIFIC_DIMENSION__VALUES;

	/**
	 * The number of structural features of the '<em>Forked Token base Token Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN_BASE_TOKEN_DIMENSION_FEATURE_COUNT = SPECIFIC_DIMENSION_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN_BASE_TOKEN_VALUE__STATES = SPECIFIC_REFERENCE_VALUE__STATES;

	/**
	 * The feature id for the '<em><b>Base Token</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN_BASE_TOKEN_VALUE__BASE_TOKEN = SPECIFIC_REFERENCE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Forked Token base Token Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN_BASE_TOKEN_VALUE_FEATURE_COUNT = SPECIFIC_REFERENCE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.ForkedToken_remainingOffersCount_DimensionImpl <em>Forked Token remaining Offers Count Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.ForkedToken_remainingOffersCount_DimensionImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getForkedToken_remainingOffersCount_Dimension()
	 * @generated
	 */
	int FORKED_TOKEN_REMAINING_OFFERS_COUNT_DIMENSION = 12;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN_REMAINING_OFFERS_COUNT_DIMENSION__VALUES = SPECIFIC_DIMENSION__VALUES;

	/**
	 * The number of structural features of the '<em>Forked Token remaining Offers Count Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN_REMAINING_OFFERS_COUNT_DIMENSION_FEATURE_COUNT = SPECIFIC_DIMENSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.ForkedToken_remainingOffersCount_ValueImpl <em>Forked Token remaining Offers Count Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.ForkedToken_remainingOffersCount_ValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getForkedToken_remainingOffersCount_Value()
	 * @generated
	 */
	int FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE = 13;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE__STATES = SPECIFIC_ATTRIBUTE_VALUE__STATES;

	/**
	 * The feature id for the '<em><b>Remaining Offers Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE__REMAINING_OFFERS_COUNT = SPECIFIC_ATTRIBUTE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Forked Token remaining Offers Count Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN_REMAINING_OFFERS_COUNT_VALUE_FEATURE_COUNT = SPECIFIC_ATTRIBUTE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.Input_inputValues_DimensionImpl <em>Input input Values Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.Input_inputValues_DimensionImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getInput_inputValues_Dimension()
	 * @generated
	 */
	int INPUT_INPUT_VALUES_DIMENSION = 14;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_INPUT_VALUES_DIMENSION__VALUES = SPECIFIC_DIMENSION__VALUES;

	/**
	 * The number of structural features of the '<em>Input input Values Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_INPUT_VALUES_DIMENSION_FEATURE_COUNT = SPECIFIC_DIMENSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.Input_inputValues_ValueImpl <em>Input input Values Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.Input_inputValues_ValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getInput_inputValues_Value()
	 * @generated
	 */
	int INPUT_INPUT_VALUES_VALUE = 15;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_INPUT_VALUES_VALUE__STATES = SPECIFIC_REFERENCE_VALUE__STATES;

	/**
	 * The feature id for the '<em><b>Input Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_INPUT_VALUES_VALUE__INPUT_VALUES = SPECIFIC_REFERENCE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Input input Values Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_INPUT_VALUES_VALUE_FEATURE_COUNT = SPECIFIC_REFERENCE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.Offer_offeredTokens_DimensionImpl <em>Offer offered Tokens Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.Offer_offeredTokens_DimensionImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getOffer_offeredTokens_Dimension()
	 * @generated
	 */
	int OFFER_OFFERED_TOKENS_DIMENSION = 16;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_OFFERED_TOKENS_DIMENSION__VALUES = SPECIFIC_DIMENSION__VALUES;

	/**
	 * The number of structural features of the '<em>Offer offered Tokens Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_OFFERED_TOKENS_DIMENSION_FEATURE_COUNT = SPECIFIC_DIMENSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.Offer_offeredTokens_ValueImpl <em>Offer offered Tokens Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.Offer_offeredTokens_ValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getOffer_offeredTokens_Value()
	 * @generated
	 */
	int OFFER_OFFERED_TOKENS_VALUE = 17;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_OFFERED_TOKENS_VALUE__STATES = SPECIFIC_REFERENCE_VALUE__STATES;

	/**
	 * The feature id for the '<em><b>Offered Tokens</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_OFFERED_TOKENS_VALUE__OFFERED_TOKENS = SPECIFIC_REFERENCE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Offer offered Tokens Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_OFFERED_TOKENS_VALUE_FEATURE_COUNT = SPECIFIC_REFERENCE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.SpecificStateImpl <em>Specific State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.SpecificStateImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getSpecificState()
	 * @generated
	 */
	int SPECIFIC_STATE = 21;

	/**
	 * The feature id for the '<em><b>Started Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STATE__STARTED_STEPS = TracePackage.STATE__STARTED_STEPS;

	/**
	 * The feature id for the '<em><b>Ended Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STATE__ENDED_STEPS = TracePackage.STATE__ENDED_STEPS;

	/**
	 * The feature id for the '<em><b>Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STATE__VALUES = TracePackage.STATE__VALUES;

	/**
	 * The number of structural features of the '<em>Specific State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STATE_FEATURE_COUNT = TracePackage.STATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.SpecificTracedObjectImpl <em>Specific Traced Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.SpecificTracedObjectImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getSpecificTracedObject()
	 * @generated
	 */
	int SPECIFIC_TRACED_OBJECT = 22;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACED_OBJECT__DIMENSIONS = TracePackage.TRACED_OBJECT__DIMENSIONS;

	/**
	 * The number of structural features of the '<em>Specific Traced Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACED_OBJECT_FEATURE_COUNT = TracePackage.TRACED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.Trace_executedNodes_DimensionImpl <em>Trace executed Nodes Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.Trace_executedNodes_DimensionImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getTrace_executedNodes_Dimension()
	 * @generated
	 */
	int TRACE_EXECUTED_NODES_DIMENSION = 24;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_EXECUTED_NODES_DIMENSION__VALUES = SPECIFIC_DIMENSION__VALUES;

	/**
	 * The number of structural features of the '<em>Trace executed Nodes Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_EXECUTED_NODES_DIMENSION_FEATURE_COUNT = SPECIFIC_DIMENSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.Trace_executedNodes_ValueImpl <em>Trace executed Nodes Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.Trace_executedNodes_ValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getTrace_executedNodes_Value()
	 * @generated
	 */
	int TRACE_EXECUTED_NODES_VALUE = 25;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_EXECUTED_NODES_VALUE__STATES = SPECIFIC_REFERENCE_VALUE__STATES;

	/**
	 * The feature id for the '<em><b>Executed Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_EXECUTED_NODES_VALUE__EXECUTED_NODES = SPECIFIC_REFERENCE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trace executed Nodes Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_EXECUTED_NODES_VALUE_FEATURE_COUNT = SPECIFIC_REFERENCE_VALUE_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.ActivityEdge_offers_Dimension <em>Activity Edge offers Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Edge offers Dimension</em>'.
	 * @see activitydiagramTrace.States.ActivityEdge_offers_Dimension
	 * @generated
	 */
	EClass getActivityEdge_offers_Dimension();

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
	 * Returns the meta object for class '{@link activitydiagramTrace.States.ActivityNode_heldTokens_Dimension <em>Activity Node held Tokens Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Node held Tokens Dimension</em>'.
	 * @see activitydiagramTrace.States.ActivityNode_heldTokens_Dimension
	 * @generated
	 */
	EClass getActivityNode_heldTokens_Dimension();

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
	 * Returns the meta object for class '{@link activitydiagramTrace.States.Activity_trace_Dimension <em>Activity trace Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity trace Dimension</em>'.
	 * @see activitydiagramTrace.States.Activity_trace_Dimension
	 * @generated
	 */
	EClass getActivity_trace_Dimension();

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
	 * Returns the meta object for class '{@link activitydiagramTrace.States.DynamicBooleanValue_value_Dimension <em>Dynamic Boolean Value value Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Boolean Value value Dimension</em>'.
	 * @see activitydiagramTrace.States.DynamicBooleanValue_value_Dimension
	 * @generated
	 */
	EClass getDynamicBooleanValue_value_Dimension();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.DynamicBooleanValue_value_Value <em>Dynamic Boolean Value value Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Boolean Value value Value</em>'.
	 * @see activitydiagramTrace.States.DynamicBooleanValue_value_Value
	 * @generated
	 */
	EClass getDynamicBooleanValue_value_Value();

	/**
	 * Returns the meta object for the attribute '{@link activitydiagramTrace.States.DynamicBooleanValue_value_Value#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see activitydiagramTrace.States.DynamicBooleanValue_value_Value#isValue()
	 * @see #getDynamicBooleanValue_value_Value()
	 * @generated
	 */
	EAttribute getDynamicBooleanValue_value_Value_Value();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.DynamicIntegerValue_value_Dimension <em>Dynamic Integer Value value Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Integer Value value Dimension</em>'.
	 * @see activitydiagramTrace.States.DynamicIntegerValue_value_Dimension
	 * @generated
	 */
	EClass getDynamicIntegerValue_value_Dimension();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.DynamicIntegerValue_value_Value <em>Dynamic Integer Value value Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Integer Value value Value</em>'.
	 * @see activitydiagramTrace.States.DynamicIntegerValue_value_Value
	 * @generated
	 */
	EClass getDynamicIntegerValue_value_Value();

	/**
	 * Returns the meta object for the attribute '{@link activitydiagramTrace.States.DynamicIntegerValue_value_Value#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see activitydiagramTrace.States.DynamicIntegerValue_value_Value#getValue()
	 * @see #getDynamicIntegerValue_value_Value()
	 * @generated
	 */
	EAttribute getDynamicIntegerValue_value_Value_Value();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.ForkedToken_baseToken_Dimension <em>Forked Token base Token Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forked Token base Token Dimension</em>'.
	 * @see activitydiagramTrace.States.ForkedToken_baseToken_Dimension
	 * @generated
	 */
	EClass getForkedToken_baseToken_Dimension();

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
	 * Returns the meta object for class '{@link activitydiagramTrace.States.ForkedToken_remainingOffersCount_Dimension <em>Forked Token remaining Offers Count Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forked Token remaining Offers Count Dimension</em>'.
	 * @see activitydiagramTrace.States.ForkedToken_remainingOffersCount_Dimension
	 * @generated
	 */
	EClass getForkedToken_remainingOffersCount_Dimension();

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
	 * Returns the meta object for class '{@link activitydiagramTrace.States.Input_inputValues_Dimension <em>Input input Values Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input input Values Dimension</em>'.
	 * @see activitydiagramTrace.States.Input_inputValues_Dimension
	 * @generated
	 */
	EClass getInput_inputValues_Dimension();

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
	 * Returns the meta object for class '{@link activitydiagramTrace.States.Offer_offeredTokens_Dimension <em>Offer offered Tokens Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Offer offered Tokens Dimension</em>'.
	 * @see activitydiagramTrace.States.Offer_offeredTokens_Dimension
	 * @generated
	 */
	EClass getOffer_offeredTokens_Dimension();

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
	 * Returns the meta object for class '{@link activitydiagramTrace.States.SpecificAttributeValue <em>Specific Attribute Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Attribute Value</em>'.
	 * @see activitydiagramTrace.States.SpecificAttributeValue
	 * @generated
	 */
	EClass getSpecificAttributeValue();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.SpecificDimension <em>Specific Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Dimension</em>'.
	 * @see activitydiagramTrace.States.SpecificDimension
	 * @generated
	 */
	EClass getSpecificDimension();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.SpecificReferenceValue <em>Specific Reference Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Reference Value</em>'.
	 * @see activitydiagramTrace.States.SpecificReferenceValue
	 * @generated
	 */
	EClass getSpecificReferenceValue();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.SpecificState <em>Specific State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific State</em>'.
	 * @see activitydiagramTrace.States.SpecificState
	 * @generated
	 */
	EClass getSpecificState();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.SpecificTracedObject <em>Specific Traced Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Traced Object</em>'.
	 * @see activitydiagramTrace.States.SpecificTracedObject
	 * @generated
	 */
	EClass getSpecificTracedObject();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.SpecificValue <em>Specific Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Value</em>'.
	 * @see activitydiagramTrace.States.SpecificValue
	 * @generated
	 */
	EClass getSpecificValue();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.Trace_executedNodes_Dimension <em>Trace executed Nodes Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace executed Nodes Dimension</em>'.
	 * @see activitydiagramTrace.States.Trace_executedNodes_Dimension
	 * @generated
	 */
	EClass getTrace_executedNodes_Dimension();

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
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.ActivityEdge_offers_DimensionImpl <em>Activity Edge offers Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.ActivityEdge_offers_DimensionImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getActivityEdge_offers_Dimension()
		 * @generated
		 */
		EClass ACTIVITY_EDGE_OFFERS_DIMENSION = eINSTANCE.getActivityEdge_offers_Dimension();

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
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.ActivityNode_heldTokens_DimensionImpl <em>Activity Node held Tokens Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.ActivityNode_heldTokens_DimensionImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getActivityNode_heldTokens_Dimension()
		 * @generated
		 */
		EClass ACTIVITY_NODE_HELD_TOKENS_DIMENSION = eINSTANCE.getActivityNode_heldTokens_Dimension();

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
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.Activity_trace_DimensionImpl <em>Activity trace Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.Activity_trace_DimensionImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getActivity_trace_Dimension()
		 * @generated
		 */
		EClass ACTIVITY_TRACE_DIMENSION = eINSTANCE.getActivity_trace_Dimension();

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
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.DynamicBooleanValue_value_DimensionImpl <em>Dynamic Boolean Value value Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.DynamicBooleanValue_value_DimensionImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getDynamicBooleanValue_value_Dimension()
		 * @generated
		 */
		EClass DYNAMIC_BOOLEAN_VALUE_VALUE_DIMENSION = eINSTANCE.getDynamicBooleanValue_value_Dimension();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.DynamicBooleanValue_value_ValueImpl <em>Dynamic Boolean Value value Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.DynamicBooleanValue_value_ValueImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getDynamicBooleanValue_value_Value()
		 * @generated
		 */
		EClass DYNAMIC_BOOLEAN_VALUE_VALUE_VALUE = eINSTANCE.getDynamicBooleanValue_value_Value();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_BOOLEAN_VALUE_VALUE_VALUE__VALUE = eINSTANCE.getDynamicBooleanValue_value_Value_Value();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.DynamicIntegerValue_value_DimensionImpl <em>Dynamic Integer Value value Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.DynamicIntegerValue_value_DimensionImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getDynamicIntegerValue_value_Dimension()
		 * @generated
		 */
		EClass DYNAMIC_INTEGER_VALUE_VALUE_DIMENSION = eINSTANCE.getDynamicIntegerValue_value_Dimension();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.DynamicIntegerValue_value_ValueImpl <em>Dynamic Integer Value value Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.DynamicIntegerValue_value_ValueImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getDynamicIntegerValue_value_Value()
		 * @generated
		 */
		EClass DYNAMIC_INTEGER_VALUE_VALUE_VALUE = eINSTANCE.getDynamicIntegerValue_value_Value();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_INTEGER_VALUE_VALUE_VALUE__VALUE = eINSTANCE.getDynamicIntegerValue_value_Value_Value();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.ForkedToken_baseToken_DimensionImpl <em>Forked Token base Token Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.ForkedToken_baseToken_DimensionImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getForkedToken_baseToken_Dimension()
		 * @generated
		 */
		EClass FORKED_TOKEN_BASE_TOKEN_DIMENSION = eINSTANCE.getForkedToken_baseToken_Dimension();

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
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.ForkedToken_remainingOffersCount_DimensionImpl <em>Forked Token remaining Offers Count Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.ForkedToken_remainingOffersCount_DimensionImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getForkedToken_remainingOffersCount_Dimension()
		 * @generated
		 */
		EClass FORKED_TOKEN_REMAINING_OFFERS_COUNT_DIMENSION = eINSTANCE.getForkedToken_remainingOffersCount_Dimension();

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
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.Input_inputValues_DimensionImpl <em>Input input Values Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.Input_inputValues_DimensionImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getInput_inputValues_Dimension()
		 * @generated
		 */
		EClass INPUT_INPUT_VALUES_DIMENSION = eINSTANCE.getInput_inputValues_Dimension();

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
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.Offer_offeredTokens_DimensionImpl <em>Offer offered Tokens Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.Offer_offeredTokens_DimensionImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getOffer_offeredTokens_Dimension()
		 * @generated
		 */
		EClass OFFER_OFFERED_TOKENS_DIMENSION = eINSTANCE.getOffer_offeredTokens_Dimension();

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
		 * The meta object literal for the '{@link activitydiagramTrace.States.SpecificAttributeValue <em>Specific Attribute Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.SpecificAttributeValue
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getSpecificAttributeValue()
		 * @generated
		 */
		EClass SPECIFIC_ATTRIBUTE_VALUE = eINSTANCE.getSpecificAttributeValue();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.SpecificDimensionImpl <em>Specific Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.SpecificDimensionImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getSpecificDimension()
		 * @generated
		 */
		EClass SPECIFIC_DIMENSION = eINSTANCE.getSpecificDimension();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.SpecificReferenceValue <em>Specific Reference Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.SpecificReferenceValue
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getSpecificReferenceValue()
		 * @generated
		 */
		EClass SPECIFIC_REFERENCE_VALUE = eINSTANCE.getSpecificReferenceValue();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.SpecificStateImpl <em>Specific State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.SpecificStateImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getSpecificState()
		 * @generated
		 */
		EClass SPECIFIC_STATE = eINSTANCE.getSpecificState();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.SpecificTracedObjectImpl <em>Specific Traced Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.SpecificTracedObjectImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getSpecificTracedObject()
		 * @generated
		 */
		EClass SPECIFIC_TRACED_OBJECT = eINSTANCE.getSpecificTracedObject();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.SpecificValueImpl <em>Specific Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.SpecificValueImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getSpecificValue()
		 * @generated
		 */
		EClass SPECIFIC_VALUE = eINSTANCE.getSpecificValue();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.Trace_executedNodes_DimensionImpl <em>Trace executed Nodes Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.Trace_executedNodes_DimensionImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getTrace_executedNodes_Dimension()
		 * @generated
		 */
		EClass TRACE_EXECUTED_NODES_DIMENSION = eINSTANCE.getTrace_executedNodes_Dimension();

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

	}

} //StatesPackage
