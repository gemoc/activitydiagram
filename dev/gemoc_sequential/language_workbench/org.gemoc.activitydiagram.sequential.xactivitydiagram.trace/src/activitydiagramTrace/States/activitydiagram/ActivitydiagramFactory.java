/**
 */
package activitydiagramTrace.States.activitydiagram;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage
 * @generated
 */
public interface ActivitydiagramFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ActivitydiagramFactory eINSTANCE = activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Traced Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Activity</em>'.
	 * @generated
	 */
	TracedActivity createTracedActivity();

	/**
	 * Returns a new object of class '<em>Traced Activity Final Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Activity Final Node</em>'.
	 * @generated
	 */
	TracedActivityFinalNode createTracedActivityFinalNode();

	/**
	 * Returns a new object of class '<em>Traced Activity Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Activity Node</em>'.
	 * @generated
	 */
	TracedActivityNode createTracedActivityNode();

	/**
	 * Returns a new object of class '<em>Traced Control Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Control Flow</em>'.
	 * @generated
	 */
	TracedControlFlow createTracedControlFlow();

	/**
	 * Returns a new object of class '<em>Traced Control Token</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Control Token</em>'.
	 * @generated
	 */
	TracedControlToken createTracedControlToken();

	/**
	 * Returns a new object of class '<em>Traced Decision Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Decision Node</em>'.
	 * @generated
	 */
	TracedDecisionNode createTracedDecisionNode();

	/**
	 * Returns a new object of class '<em>Traced Dynamic Boolean Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Dynamic Boolean Value</em>'.
	 * @generated
	 */
	TracedDynamicBooleanValue createTracedDynamicBooleanValue();

	/**
	 * Returns a new object of class '<em>Traced Dynamic Integer Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Dynamic Integer Value</em>'.
	 * @generated
	 */
	TracedDynamicIntegerValue createTracedDynamicIntegerValue();

	/**
	 * Returns a new object of class '<em>Traced Fork Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Fork Node</em>'.
	 * @generated
	 */
	TracedForkNode createTracedForkNode();

	/**
	 * Returns a new object of class '<em>Traced Forked Token</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Forked Token</em>'.
	 * @generated
	 */
	TracedForkedToken createTracedForkedToken();

	/**
	 * Returns a new object of class '<em>Traced Initial Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Initial Node</em>'.
	 * @generated
	 */
	TracedInitialNode createTracedInitialNode();

	/**
	 * Returns a new object of class '<em>Traced Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Input</em>'.
	 * @generated
	 */
	TracedInput createTracedInput();

	/**
	 * Returns a new object of class '<em>Traced Input Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Input Value</em>'.
	 * @generated
	 */
	TracedInputValue createTracedInputValue();

	/**
	 * Returns a new object of class '<em>Traced Join Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Join Node</em>'.
	 * @generated
	 */
	TracedJoinNode createTracedJoinNode();

	/**
	 * Returns a new object of class '<em>Traced Merge Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Merge Node</em>'.
	 * @generated
	 */
	TracedMergeNode createTracedMergeNode();

	/**
	 * Returns a new object of class '<em>Traced Offer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Offer</em>'.
	 * @generated
	 */
	TracedOffer createTracedOffer();

	/**
	 * Returns a new object of class '<em>Traced Opaque Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Opaque Action</em>'.
	 * @generated
	 */
	TracedOpaqueAction createTracedOpaqueAction();

	/**
	 * Returns a new object of class '<em>Traced Static Boolean Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Static Boolean Value</em>'.
	 * @generated
	 */
	TracedStaticBooleanValue createTracedStaticBooleanValue();

	/**
	 * Returns a new object of class '<em>Traced Static Integer Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Static Integer Value</em>'.
	 * @generated
	 */
	TracedStaticIntegerValue createTracedStaticIntegerValue();

	/**
	 * Returns a new object of class '<em>Traced Token</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Token</em>'.
	 * @generated
	 */
	TracedToken createTracedToken();

	/**
	 * Returns a new object of class '<em>Traced Trace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Trace</em>'.
	 * @generated
	 */
	TracedTrace createTracedTrace();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ActivitydiagramPackage getActivitydiagramPackage();

} //ActivitydiagramFactory
