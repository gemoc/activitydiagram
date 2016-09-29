/**
 */
package activitydiagram;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see activitydiagram.DynamicFactory
 * @model kind="package"
 * @generated
 */
public interface DynamicPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "activitydiagram";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.gemoc.activitydiagram.concurrent/activitydiagram_dynamic";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "activitydiagram";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DynamicPackage eINSTANCE = activitydiagram.impl.DynamicPackageImpl.init();

	/**
	 * The meta object id for the '{@link activitydiagram.impl.TokenImpl <em>Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.TokenImpl
	 * @see activitydiagram.impl.DynamicPackageImpl#getToken()
	 * @generated
	 */
	int TOKEN = 0;

	/**
	 * The number of structural features of the '<em>Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.OfferImpl <em>Offer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.OfferImpl
	 * @see activitydiagram.impl.DynamicPackageImpl#getOffer()
	 * @generated
	 */
	int OFFER = 1;

	/**
	 * The number of structural features of the '<em>Offer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Offer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.RuntimeTraceImpl <em>Runtime Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.RuntimeTraceImpl
	 * @see activitydiagram.impl.DynamicPackageImpl#getRuntimeTrace()
	 * @generated
	 */
	int RUNTIME_TRACE = 2;

	/**
	 * The number of structural features of the '<em>Runtime Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_TRACE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Runtime Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_TRACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.InputValueImpl <em>Input Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.InputValueImpl
	 * @see activitydiagram.impl.DynamicPackageImpl#getInputValue()
	 * @generated
	 */
	int INPUT_VALUE = 3;

	/**
	 * The number of structural features of the '<em>Input Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VALUE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Input Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.InputImpl
	 * @see activitydiagram.impl.DynamicPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 4;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.ControlTokenImpl <em>Control Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.ControlTokenImpl
	 * @see activitydiagram.impl.DynamicPackageImpl#getControlToken()
	 * @generated
	 */
	int CONTROL_TOKEN = 5;

	/**
	 * The number of structural features of the '<em>Control Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN_FEATURE_COUNT = TOKEN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Control Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN_OPERATION_COUNT = TOKEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.ForkedTokenImpl <em>Forked Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.ForkedTokenImpl
	 * @see activitydiagram.impl.DynamicPackageImpl#getForkedToken()
	 * @generated
	 */
	int FORKED_TOKEN = 6;

	/**
	 * The number of structural features of the '<em>Forked Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN_FEATURE_COUNT = TOKEN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Forked Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN_OPERATION_COUNT = TOKEN_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link activitydiagram.Token <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token</em>'.
	 * @see activitydiagram.Token
	 * @generated
	 */
	EClass getToken();

	/**
	 * Returns the meta object for class '{@link activitydiagram.Offer <em>Offer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Offer</em>'.
	 * @see activitydiagram.Offer
	 * @generated
	 */
	EClass getOffer();

	/**
	 * Returns the meta object for class '{@link activitydiagram.RuntimeTrace <em>Runtime Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runtime Trace</em>'.
	 * @see activitydiagram.RuntimeTrace
	 * @generated
	 */
	EClass getRuntimeTrace();

	/**
	 * Returns the meta object for class '{@link activitydiagram.InputValue <em>Input Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Value</em>'.
	 * @see activitydiagram.InputValue
	 * @generated
	 */
	EClass getInputValue();

	/**
	 * Returns the meta object for class '{@link activitydiagram.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see activitydiagram.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for class '{@link activitydiagram.ControlToken <em>Control Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Token</em>'.
	 * @see activitydiagram.ControlToken
	 * @generated
	 */
	EClass getControlToken();

	/**
	 * Returns the meta object for class '{@link activitydiagram.ForkedToken <em>Forked Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forked Token</em>'.
	 * @see activitydiagram.ForkedToken
	 * @generated
	 */
	EClass getForkedToken();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DynamicFactory getDynamicFactory();

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
		 * The meta object literal for the '{@link activitydiagram.impl.TokenImpl <em>Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.TokenImpl
		 * @see activitydiagram.impl.DynamicPackageImpl#getToken()
		 * @generated
		 */
		EClass TOKEN = eINSTANCE.getToken();

		/**
		 * The meta object literal for the '{@link activitydiagram.impl.OfferImpl <em>Offer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.OfferImpl
		 * @see activitydiagram.impl.DynamicPackageImpl#getOffer()
		 * @generated
		 */
		EClass OFFER = eINSTANCE.getOffer();

		/**
		 * The meta object literal for the '{@link activitydiagram.impl.RuntimeTraceImpl <em>Runtime Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.RuntimeTraceImpl
		 * @see activitydiagram.impl.DynamicPackageImpl#getRuntimeTrace()
		 * @generated
		 */
		EClass RUNTIME_TRACE = eINSTANCE.getRuntimeTrace();

		/**
		 * The meta object literal for the '{@link activitydiagram.impl.InputValueImpl <em>Input Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.InputValueImpl
		 * @see activitydiagram.impl.DynamicPackageImpl#getInputValue()
		 * @generated
		 */
		EClass INPUT_VALUE = eINSTANCE.getInputValue();

		/**
		 * The meta object literal for the '{@link activitydiagram.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.InputImpl
		 * @see activitydiagram.impl.DynamicPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '{@link activitydiagram.impl.ControlTokenImpl <em>Control Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.ControlTokenImpl
		 * @see activitydiagram.impl.DynamicPackageImpl#getControlToken()
		 * @generated
		 */
		EClass CONTROL_TOKEN = eINSTANCE.getControlToken();

		/**
		 * The meta object literal for the '{@link activitydiagram.impl.ForkedTokenImpl <em>Forked Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.ForkedTokenImpl
		 * @see activitydiagram.impl.DynamicPackageImpl#getForkedToken()
		 * @generated
		 */
		EClass FORKED_TOKEN = eINSTANCE.getForkedToken();

	}

} //DynamicPackage
