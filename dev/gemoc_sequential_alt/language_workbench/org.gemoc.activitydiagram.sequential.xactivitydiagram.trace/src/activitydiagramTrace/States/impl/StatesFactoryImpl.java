/**
 */
package activitydiagramTrace.States.impl;

import activitydiagramTrace.States.*;

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
public class StatesFactoryImpl extends EFactoryImpl implements StatesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StatesFactory init() {
		try {
			StatesFactory theStatesFactory = (StatesFactory)EPackage.Registry.INSTANCE.getEFactory(StatesPackage.eNS_URI);
			if (theStatesFactory != null) {
				return theStatesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StatesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatesFactoryImpl() {
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
			case StatesPackage.ACTIVITY_EDGE_OFFERED_TOKENS_DIMENSION: return createActivityEdge_offeredTokens_Dimension();
			case StatesPackage.ACTIVITY_EDGE_OFFERED_TOKENS_VALUE: return createActivityEdge_offeredTokens_Value();
			case StatesPackage.ACTIVITY_NODE_HELD_TOKENS_DIMENSION: return createActivityNode_heldTokens_Dimension();
			case StatesPackage.ACTIVITY_NODE_HELD_TOKENS_VALUE: return createActivityNode_heldTokens_Value();
			case StatesPackage.BOOLEAN_VARIABLE_CURRENT_VALUE_DIMENSION: return createBooleanVariable_currentValue_Dimension();
			case StatesPackage.BOOLEAN_VARIABLE_CURRENT_VALUE_VALUE: return createBooleanVariable_currentValue_Value();
			case StatesPackage.INTEGER_VARIABLE_CURRENT_VALUE_DIMENSION: return createIntegerVariable_currentValue_Dimension();
			case StatesPackage.INTEGER_VARIABLE_CURRENT_VALUE_VALUE: return createIntegerVariable_currentValue_Value();
			case StatesPackage.SPECIFIC_STATE: return createSpecificState();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdge_offeredTokens_Dimension createActivityEdge_offeredTokens_Dimension() {
		ActivityEdge_offeredTokens_DimensionImpl activityEdge_offeredTokens_Dimension = new ActivityEdge_offeredTokens_DimensionImpl();
		return activityEdge_offeredTokens_Dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdge_offeredTokens_Value createActivityEdge_offeredTokens_Value() {
		ActivityEdge_offeredTokens_ValueImpl activityEdge_offeredTokens_Value = new ActivityEdge_offeredTokens_ValueImpl();
		return activityEdge_offeredTokens_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode_heldTokens_Dimension createActivityNode_heldTokens_Dimension() {
		ActivityNode_heldTokens_DimensionImpl activityNode_heldTokens_Dimension = new ActivityNode_heldTokens_DimensionImpl();
		return activityNode_heldTokens_Dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode_heldTokens_Value createActivityNode_heldTokens_Value() {
		ActivityNode_heldTokens_ValueImpl activityNode_heldTokens_Value = new ActivityNode_heldTokens_ValueImpl();
		return activityNode_heldTokens_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanVariable_currentValue_Dimension createBooleanVariable_currentValue_Dimension() {
		BooleanVariable_currentValue_DimensionImpl booleanVariable_currentValue_Dimension = new BooleanVariable_currentValue_DimensionImpl();
		return booleanVariable_currentValue_Dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanVariable_currentValue_Value createBooleanVariable_currentValue_Value() {
		BooleanVariable_currentValue_ValueImpl booleanVariable_currentValue_Value = new BooleanVariable_currentValue_ValueImpl();
		return booleanVariable_currentValue_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerVariable_currentValue_Dimension createIntegerVariable_currentValue_Dimension() {
		IntegerVariable_currentValue_DimensionImpl integerVariable_currentValue_Dimension = new IntegerVariable_currentValue_DimensionImpl();
		return integerVariable_currentValue_Dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerVariable_currentValue_Value createIntegerVariable_currentValue_Value() {
		IntegerVariable_currentValue_ValueImpl integerVariable_currentValue_Value = new IntegerVariable_currentValue_ValueImpl();
		return integerVariable_currentValue_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificState createSpecificState() {
		SpecificStateImpl specificState = new SpecificStateImpl();
		return specificState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatesPackage getStatesPackage() {
		return (StatesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StatesPackage getPackage() {
		return StatesPackage.eINSTANCE;
	}

} //StatesFactoryImpl
