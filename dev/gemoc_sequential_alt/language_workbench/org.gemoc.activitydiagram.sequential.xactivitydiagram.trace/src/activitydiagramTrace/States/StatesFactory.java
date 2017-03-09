/**
 */
package activitydiagramTrace.States;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see activitydiagramTrace.States.StatesPackage
 * @generated
 */
public interface StatesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StatesFactory eINSTANCE = activitydiagramTrace.States.impl.StatesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Activity Edge offered Tokens Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Edge offered Tokens Dimension</em>'.
	 * @generated
	 */
	ActivityEdge_offeredTokens_Dimension createActivityEdge_offeredTokens_Dimension();

	/**
	 * Returns a new object of class '<em>Activity Edge offered Tokens Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Edge offered Tokens Value</em>'.
	 * @generated
	 */
	ActivityEdge_offeredTokens_Value createActivityEdge_offeredTokens_Value();

	/**
	 * Returns a new object of class '<em>Activity Node held Tokens Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Node held Tokens Dimension</em>'.
	 * @generated
	 */
	ActivityNode_heldTokens_Dimension createActivityNode_heldTokens_Dimension();

	/**
	 * Returns a new object of class '<em>Activity Node held Tokens Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Node held Tokens Value</em>'.
	 * @generated
	 */
	ActivityNode_heldTokens_Value createActivityNode_heldTokens_Value();

	/**
	 * Returns a new object of class '<em>Boolean Variable current Value Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Variable current Value Dimension</em>'.
	 * @generated
	 */
	BooleanVariable_currentValue_Dimension createBooleanVariable_currentValue_Dimension();

	/**
	 * Returns a new object of class '<em>Boolean Variable current Value Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Variable current Value Value</em>'.
	 * @generated
	 */
	BooleanVariable_currentValue_Value createBooleanVariable_currentValue_Value();

	/**
	 * Returns a new object of class '<em>Integer Variable current Value Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Variable current Value Dimension</em>'.
	 * @generated
	 */
	IntegerVariable_currentValue_Dimension createIntegerVariable_currentValue_Dimension();

	/**
	 * Returns a new object of class '<em>Integer Variable current Value Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Variable current Value Value</em>'.
	 * @generated
	 */
	IntegerVariable_currentValue_Value createIntegerVariable_currentValue_Value();

	/**
	 * Returns a new object of class '<em>Specific State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specific State</em>'.
	 * @generated
	 */
	SpecificState createSpecificState();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StatesPackage getStatesPackage();

} //StatesFactory
