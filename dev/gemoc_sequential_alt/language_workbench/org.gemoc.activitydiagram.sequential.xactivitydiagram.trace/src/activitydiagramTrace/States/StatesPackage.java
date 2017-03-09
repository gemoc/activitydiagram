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
	int SPECIFIC_DIMENSION = 9;

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
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.ActivityEdge_offeredTokens_DimensionImpl <em>Activity Edge offered Tokens Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.ActivityEdge_offeredTokens_DimensionImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getActivityEdge_offeredTokens_Dimension()
	 * @generated
	 */
	int ACTIVITY_EDGE_OFFERED_TOKENS_DIMENSION = 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_OFFERED_TOKENS_DIMENSION__VALUES = SPECIFIC_DIMENSION__VALUES;

	/**
	 * The number of structural features of the '<em>Activity Edge offered Tokens Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_OFFERED_TOKENS_DIMENSION_FEATURE_COUNT = SPECIFIC_DIMENSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.SpecificValueImpl <em>Specific Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.SpecificValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getSpecificValue()
	 * @generated
	 */
	int SPECIFIC_VALUE = 13;

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
	int SPECIFIC_REFERENCE_VALUE = 10;

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
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.ActivityEdge_offeredTokens_ValueImpl <em>Activity Edge offered Tokens Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.ActivityEdge_offeredTokens_ValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getActivityEdge_offeredTokens_Value()
	 * @generated
	 */
	int ACTIVITY_EDGE_OFFERED_TOKENS_VALUE = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_OFFERED_TOKENS_VALUE__STATES = SPECIFIC_REFERENCE_VALUE__STATES;

	/**
	 * The feature id for the '<em><b>Offered Tokens</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_OFFERED_TOKENS_VALUE__OFFERED_TOKENS = SPECIFIC_REFERENCE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activity Edge offered Tokens Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_OFFERED_TOKENS_VALUE_FEATURE_COUNT = SPECIFIC_REFERENCE_VALUE_FEATURE_COUNT + 1;

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
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.BooleanVariable_currentValue_DimensionImpl <em>Boolean Variable current Value Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.BooleanVariable_currentValue_DimensionImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getBooleanVariable_currentValue_Dimension()
	 * @generated
	 */
	int BOOLEAN_VARIABLE_CURRENT_VALUE_DIMENSION = 4;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_CURRENT_VALUE_DIMENSION__VALUES = SPECIFIC_DIMENSION__VALUES;

	/**
	 * The number of structural features of the '<em>Boolean Variable current Value Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_CURRENT_VALUE_DIMENSION_FEATURE_COUNT = SPECIFIC_DIMENSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.SpecificAttributeValue <em>Specific Attribute Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.SpecificAttributeValue
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getSpecificAttributeValue()
	 * @generated
	 */
	int SPECIFIC_ATTRIBUTE_VALUE = 8;

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
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.BooleanVariable_currentValue_ValueImpl <em>Boolean Variable current Value Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.BooleanVariable_currentValue_ValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getBooleanVariable_currentValue_Value()
	 * @generated
	 */
	int BOOLEAN_VARIABLE_CURRENT_VALUE_VALUE = 5;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_CURRENT_VALUE_VALUE__STATES = SPECIFIC_ATTRIBUTE_VALUE__STATES;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_CURRENT_VALUE_VALUE__CURRENT_VALUE = SPECIFIC_ATTRIBUTE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Variable current Value Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_CURRENT_VALUE_VALUE_FEATURE_COUNT = SPECIFIC_ATTRIBUTE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.IntegerVariable_currentValue_DimensionImpl <em>Integer Variable current Value Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.IntegerVariable_currentValue_DimensionImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getIntegerVariable_currentValue_Dimension()
	 * @generated
	 */
	int INTEGER_VARIABLE_CURRENT_VALUE_DIMENSION = 6;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_CURRENT_VALUE_DIMENSION__VALUES = SPECIFIC_DIMENSION__VALUES;

	/**
	 * The number of structural features of the '<em>Integer Variable current Value Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_CURRENT_VALUE_DIMENSION_FEATURE_COUNT = SPECIFIC_DIMENSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.IntegerVariable_currentValue_ValueImpl <em>Integer Variable current Value Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.IntegerVariable_currentValue_ValueImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getIntegerVariable_currentValue_Value()
	 * @generated
	 */
	int INTEGER_VARIABLE_CURRENT_VALUE_VALUE = 7;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_CURRENT_VALUE_VALUE__STATES = SPECIFIC_ATTRIBUTE_VALUE__STATES;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_CURRENT_VALUE_VALUE__CURRENT_VALUE = SPECIFIC_ATTRIBUTE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Variable current Value Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_CURRENT_VALUE_VALUE_FEATURE_COUNT = SPECIFIC_ATTRIBUTE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link activitydiagramTrace.States.impl.SpecificStateImpl <em>Specific State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramTrace.States.impl.SpecificStateImpl
	 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getSpecificState()
	 * @generated
	 */
	int SPECIFIC_STATE = 11;

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
	int SPECIFIC_TRACED_OBJECT = 12;

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
	 * Returns the meta object for class '{@link activitydiagramTrace.States.ActivityEdge_offeredTokens_Dimension <em>Activity Edge offered Tokens Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Edge offered Tokens Dimension</em>'.
	 * @see activitydiagramTrace.States.ActivityEdge_offeredTokens_Dimension
	 * @generated
	 */
	EClass getActivityEdge_offeredTokens_Dimension();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.ActivityEdge_offeredTokens_Value <em>Activity Edge offered Tokens Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Edge offered Tokens Value</em>'.
	 * @see activitydiagramTrace.States.ActivityEdge_offeredTokens_Value
	 * @generated
	 */
	EClass getActivityEdge_offeredTokens_Value();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramTrace.States.ActivityEdge_offeredTokens_Value#getOfferedTokens <em>Offered Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Offered Tokens</em>'.
	 * @see activitydiagramTrace.States.ActivityEdge_offeredTokens_Value#getOfferedTokens()
	 * @see #getActivityEdge_offeredTokens_Value()
	 * @generated
	 */
	EReference getActivityEdge_offeredTokens_Value_OfferedTokens();

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
	 * Returns the meta object for class '{@link activitydiagramTrace.States.BooleanVariable_currentValue_Dimension <em>Boolean Variable current Value Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Variable current Value Dimension</em>'.
	 * @see activitydiagramTrace.States.BooleanVariable_currentValue_Dimension
	 * @generated
	 */
	EClass getBooleanVariable_currentValue_Dimension();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.BooleanVariable_currentValue_Value <em>Boolean Variable current Value Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Variable current Value Value</em>'.
	 * @see activitydiagramTrace.States.BooleanVariable_currentValue_Value
	 * @generated
	 */
	EClass getBooleanVariable_currentValue_Value();

	/**
	 * Returns the meta object for the attribute '{@link activitydiagramTrace.States.BooleanVariable_currentValue_Value#isCurrentValue <em>Current Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Value</em>'.
	 * @see activitydiagramTrace.States.BooleanVariable_currentValue_Value#isCurrentValue()
	 * @see #getBooleanVariable_currentValue_Value()
	 * @generated
	 */
	EAttribute getBooleanVariable_currentValue_Value_CurrentValue();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.IntegerVariable_currentValue_Dimension <em>Integer Variable current Value Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Variable current Value Dimension</em>'.
	 * @see activitydiagramTrace.States.IntegerVariable_currentValue_Dimension
	 * @generated
	 */
	EClass getIntegerVariable_currentValue_Dimension();

	/**
	 * Returns the meta object for class '{@link activitydiagramTrace.States.IntegerVariable_currentValue_Value <em>Integer Variable current Value Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Variable current Value Value</em>'.
	 * @see activitydiagramTrace.States.IntegerVariable_currentValue_Value
	 * @generated
	 */
	EClass getIntegerVariable_currentValue_Value();

	/**
	 * Returns the meta object for the attribute '{@link activitydiagramTrace.States.IntegerVariable_currentValue_Value#getCurrentValue <em>Current Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Value</em>'.
	 * @see activitydiagramTrace.States.IntegerVariable_currentValue_Value#getCurrentValue()
	 * @see #getIntegerVariable_currentValue_Value()
	 * @generated
	 */
	EAttribute getIntegerVariable_currentValue_Value_CurrentValue();

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
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.ActivityEdge_offeredTokens_DimensionImpl <em>Activity Edge offered Tokens Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.ActivityEdge_offeredTokens_DimensionImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getActivityEdge_offeredTokens_Dimension()
		 * @generated
		 */
		EClass ACTIVITY_EDGE_OFFERED_TOKENS_DIMENSION = eINSTANCE.getActivityEdge_offeredTokens_Dimension();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.ActivityEdge_offeredTokens_ValueImpl <em>Activity Edge offered Tokens Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.ActivityEdge_offeredTokens_ValueImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getActivityEdge_offeredTokens_Value()
		 * @generated
		 */
		EClass ACTIVITY_EDGE_OFFERED_TOKENS_VALUE = eINSTANCE.getActivityEdge_offeredTokens_Value();

		/**
		 * The meta object literal for the '<em><b>Offered Tokens</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE_OFFERED_TOKENS_VALUE__OFFERED_TOKENS = eINSTANCE.getActivityEdge_offeredTokens_Value_OfferedTokens();

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
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.BooleanVariable_currentValue_DimensionImpl <em>Boolean Variable current Value Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.BooleanVariable_currentValue_DimensionImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getBooleanVariable_currentValue_Dimension()
		 * @generated
		 */
		EClass BOOLEAN_VARIABLE_CURRENT_VALUE_DIMENSION = eINSTANCE.getBooleanVariable_currentValue_Dimension();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.BooleanVariable_currentValue_ValueImpl <em>Boolean Variable current Value Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.BooleanVariable_currentValue_ValueImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getBooleanVariable_currentValue_Value()
		 * @generated
		 */
		EClass BOOLEAN_VARIABLE_CURRENT_VALUE_VALUE = eINSTANCE.getBooleanVariable_currentValue_Value();

		/**
		 * The meta object literal for the '<em><b>Current Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_VARIABLE_CURRENT_VALUE_VALUE__CURRENT_VALUE = eINSTANCE.getBooleanVariable_currentValue_Value_CurrentValue();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.IntegerVariable_currentValue_DimensionImpl <em>Integer Variable current Value Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.IntegerVariable_currentValue_DimensionImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getIntegerVariable_currentValue_Dimension()
		 * @generated
		 */
		EClass INTEGER_VARIABLE_CURRENT_VALUE_DIMENSION = eINSTANCE.getIntegerVariable_currentValue_Dimension();

		/**
		 * The meta object literal for the '{@link activitydiagramTrace.States.impl.IntegerVariable_currentValue_ValueImpl <em>Integer Variable current Value Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramTrace.States.impl.IntegerVariable_currentValue_ValueImpl
		 * @see activitydiagramTrace.States.impl.StatesPackageImpl#getIntegerVariable_currentValue_Value()
		 * @generated
		 */
		EClass INTEGER_VARIABLE_CURRENT_VALUE_VALUE = eINSTANCE.getIntegerVariable_currentValue_Value();

		/**
		 * The meta object literal for the '<em><b>Current Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_VARIABLE_CURRENT_VALUE_VALUE__CURRENT_VALUE = eINSTANCE.getIntegerVariable_currentValue_Value_CurrentValue();

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

	}

} //StatesPackage
