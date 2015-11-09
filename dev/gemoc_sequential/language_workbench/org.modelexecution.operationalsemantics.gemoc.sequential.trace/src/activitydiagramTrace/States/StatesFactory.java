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
	 * Returns a new object of class '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State</em>'.
	 * @generated
	 */
	State createState();

	/**
	 * Returns a new object of class '<em>Forked Token base Token Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Forked Token base Token Value</em>'.
	 * @generated
	 */
	ForkedToken_baseToken_Value createForkedToken_baseToken_Value();

	/**
	 * Returns a new object of class '<em>Forked Token remaining Offers Count Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Forked Token remaining Offers Count Value</em>'.
	 * @generated
	 */
	ForkedToken_remainingOffersCount_Value createForkedToken_remainingOffersCount_Value();

	/**
	 * Returns a new object of class '<em>Boolean Value value Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Value value Value</em>'.
	 * @generated
	 */
	BooleanValue_value_Value createBooleanValue_value_Value();

	/**
	 * Returns a new object of class '<em>Input Value value Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Value value Value</em>'.
	 * @generated
	 */
	InputValue_value_Value createInputValue_value_Value();

	/**
	 * Returns a new object of class '<em>Input Value variable Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Value variable Value</em>'.
	 * @generated
	 */
	InputValue_variable_Value createInputValue_variable_Value();

	/**
	 * Returns a new object of class '<em>Activity trace Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity trace Value</em>'.
	 * @generated
	 */
	Activity_trace_Value createActivity_trace_Value();

	/**
	 * Returns a new object of class '<em>Activity Edge offers Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Edge offers Value</em>'.
	 * @generated
	 */
	ActivityEdge_offers_Value createActivityEdge_offers_Value();

	/**
	 * Returns a new object of class '<em>Input input Values Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input input Values Value</em>'.
	 * @generated
	 */
	Input_inputValues_Value createInput_inputValues_Value();

	/**
	 * Returns a new object of class '<em>Offer offered Tokens Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Offer offered Tokens Value</em>'.
	 * @generated
	 */
	Offer_offeredTokens_Value createOffer_offeredTokens_Value();

	/**
	 * Returns a new object of class '<em>Token holder Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Token holder Value</em>'.
	 * @generated
	 */
	Token_holder_Value createToken_holder_Value();

	/**
	 * Returns a new object of class '<em>Variable current Value Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable current Value Value</em>'.
	 * @generated
	 */
	Variable_currentValue_Value createVariable_currentValue_Value();

	/**
	 * Returns a new object of class '<em>Integer Value value Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Value value Value</em>'.
	 * @generated
	 */
	IntegerValue_value_Value createIntegerValue_value_Value();

	/**
	 * Returns a new object of class '<em>Activity Node held Tokens Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Node held Tokens Value</em>'.
	 * @generated
	 */
	ActivityNode_heldTokens_Value createActivityNode_heldTokens_Value();

	/**
	 * Returns a new object of class '<em>Trace executed Nodes Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trace executed Nodes Value</em>'.
	 * @generated
	 */
	Trace_executedNodes_Value createTrace_executedNodes_Value();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StatesPackage getStatesPackage();

} //StatesFactory
