/**
 */
package dynamic.activitydiagram;

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
 * @see dynamic.activitydiagram.ActivitydiagramFactory
 * @model kind="package"
 * @generated
 */
public interface ActivitydiagramPackage extends EPackage {
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
	ActivitydiagramPackage eINSTANCE = dynamic.activitydiagram.impl.ActivitydiagramPackageImpl.init();

	/**
	 * The meta object id for the '{@link dynamic.activitydiagram.impl.TokenImpl <em>Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dynamic.activitydiagram.impl.TokenImpl
	 * @see dynamic.activitydiagram.impl.ActivitydiagramPackageImpl#getToken()
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
	 * The meta object id for the '{@link dynamic.activitydiagram.impl.OfferImpl <em>Offer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dynamic.activitydiagram.impl.OfferImpl
	 * @see dynamic.activitydiagram.impl.ActivitydiagramPackageImpl#getOffer()
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
	 * The meta object id for the '{@link dynamic.activitydiagram.impl.TraceImpl <em>Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dynamic.activitydiagram.impl.TraceImpl
	 * @see dynamic.activitydiagram.impl.ActivitydiagramPackageImpl#getTrace()
	 * @generated
	 */
	int TRACE = 2;

	/**
	 * The number of structural features of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dynamic.activitydiagram.impl.ControlTokenImpl <em>Control Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dynamic.activitydiagram.impl.ControlTokenImpl
	 * @see dynamic.activitydiagram.impl.ActivitydiagramPackageImpl#getControlToken()
	 * @generated
	 */
	int CONTROL_TOKEN = 3;

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
	 * The meta object id for the '{@link dynamic.activitydiagram.impl.ForkedTokenImpl <em>Forked Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dynamic.activitydiagram.impl.ForkedTokenImpl
	 * @see dynamic.activitydiagram.impl.ActivitydiagramPackageImpl#getForkedToken()
	 * @generated
	 */
	int FORKED_TOKEN = 4;

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
	 * The meta object id for the '{@link dynamic.activitydiagram.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dynamic.activitydiagram.impl.ContextImpl
	 * @see dynamic.activitydiagram.impl.ActivitydiagramPackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 5;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link dynamic.activitydiagram.Token <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token</em>'.
	 * @see dynamic.activitydiagram.Token
	 * @generated
	 */
	EClass getToken();

	/**
	 * Returns the meta object for class '{@link dynamic.activitydiagram.Offer <em>Offer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Offer</em>'.
	 * @see dynamic.activitydiagram.Offer
	 * @generated
	 */
	EClass getOffer();

	/**
	 * Returns the meta object for class '{@link dynamic.activitydiagram.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace</em>'.
	 * @see dynamic.activitydiagram.Trace
	 * @generated
	 */
	EClass getTrace();

	/**
	 * Returns the meta object for class '{@link dynamic.activitydiagram.ControlToken <em>Control Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Token</em>'.
	 * @see dynamic.activitydiagram.ControlToken
	 * @generated
	 */
	EClass getControlToken();

	/**
	 * Returns the meta object for class '{@link dynamic.activitydiagram.ForkedToken <em>Forked Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forked Token</em>'.
	 * @see dynamic.activitydiagram.ForkedToken
	 * @generated
	 */
	EClass getForkedToken();

	/**
	 * Returns the meta object for class '{@link dynamic.activitydiagram.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see dynamic.activitydiagram.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ActivitydiagramFactory getActivitydiagramFactory();

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
		 * The meta object literal for the '{@link dynamic.activitydiagram.impl.TokenImpl <em>Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dynamic.activitydiagram.impl.TokenImpl
		 * @see dynamic.activitydiagram.impl.ActivitydiagramPackageImpl#getToken()
		 * @generated
		 */
		EClass TOKEN = eINSTANCE.getToken();

		/**
		 * The meta object literal for the '{@link dynamic.activitydiagram.impl.OfferImpl <em>Offer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dynamic.activitydiagram.impl.OfferImpl
		 * @see dynamic.activitydiagram.impl.ActivitydiagramPackageImpl#getOffer()
		 * @generated
		 */
		EClass OFFER = eINSTANCE.getOffer();

		/**
		 * The meta object literal for the '{@link dynamic.activitydiagram.impl.TraceImpl <em>Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dynamic.activitydiagram.impl.TraceImpl
		 * @see dynamic.activitydiagram.impl.ActivitydiagramPackageImpl#getTrace()
		 * @generated
		 */
		EClass TRACE = eINSTANCE.getTrace();

		/**
		 * The meta object literal for the '{@link dynamic.activitydiagram.impl.ControlTokenImpl <em>Control Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dynamic.activitydiagram.impl.ControlTokenImpl
		 * @see dynamic.activitydiagram.impl.ActivitydiagramPackageImpl#getControlToken()
		 * @generated
		 */
		EClass CONTROL_TOKEN = eINSTANCE.getControlToken();

		/**
		 * The meta object literal for the '{@link dynamic.activitydiagram.impl.ForkedTokenImpl <em>Forked Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dynamic.activitydiagram.impl.ForkedTokenImpl
		 * @see dynamic.activitydiagram.impl.ActivitydiagramPackageImpl#getForkedToken()
		 * @generated
		 */
		EClass FORKED_TOKEN = eINSTANCE.getForkedToken();

		/**
		 * The meta object literal for the '{@link dynamic.activitydiagram.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dynamic.activitydiagram.impl.ContextImpl
		 * @see dynamic.activitydiagram.impl.ActivitydiagramPackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

	}

} //ActivitydiagramPackage
