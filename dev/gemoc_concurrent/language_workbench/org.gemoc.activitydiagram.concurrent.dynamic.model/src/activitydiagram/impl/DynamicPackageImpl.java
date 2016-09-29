/**
 */
package activitydiagram.impl;

import activitydiagram.ControlToken;
import activitydiagram.DynamicFactory;
import activitydiagram.DynamicPackage;
import activitydiagram.ForkedToken;
import activitydiagram.Input;
import activitydiagram.InputValue;
import activitydiagram.Offer;
import activitydiagram.RuntimeTrace;
import activitydiagram.Token;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DynamicPackageImpl extends EPackageImpl implements DynamicPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass offerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimeTraceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlTokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forkedTokenEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see activitydiagram.DynamicPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DynamicPackageImpl() {
		super(eNS_URI, DynamicFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DynamicPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DynamicPackage init() {
		if (isInited) return (DynamicPackage)EPackage.Registry.INSTANCE.getEPackage(DynamicPackage.eNS_URI);

		// Obtain or create and register package
		DynamicPackageImpl theDynamicPackage = (DynamicPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DynamicPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DynamicPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theDynamicPackage.createPackageContents();

		// Initialize created meta-data
		theDynamicPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDynamicPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DynamicPackage.eNS_URI, theDynamicPackage);
		return theDynamicPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToken() {
		return tokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOffer() {
		return offerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuntimeTrace() {
		return runtimeTraceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputValue() {
		return inputValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInput() {
		return inputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlToken() {
		return controlTokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForkedToken() {
		return forkedTokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicFactory getDynamicFactory() {
		return (DynamicFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		tokenEClass = createEClass(TOKEN);

		offerEClass = createEClass(OFFER);

		runtimeTraceEClass = createEClass(RUNTIME_TRACE);

		inputValueEClass = createEClass(INPUT_VALUE);

		inputEClass = createEClass(INPUT);

		controlTokenEClass = createEClass(CONTROL_TOKEN);

		forkedTokenEClass = createEClass(FORKED_TOKEN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		controlTokenEClass.getESuperTypes().add(this.getToken());
		forkedTokenEClass.getESuperTypes().add(this.getToken());

		// Initialize classes, features, and operations; add parameters
		initEClass(tokenEClass, Token.class, "Token", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(offerEClass, Offer.class, "Offer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(runtimeTraceEClass, RuntimeTrace.class, "RuntimeTrace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inputValueEClass, InputValue.class, "InputValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inputEClass, Input.class, "Input", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(controlTokenEClass, ControlToken.class, "ControlToken", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(forkedTokenEClass, ForkedToken.class, "ForkedToken", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// aspect
		createAspectAnnotations();
	}

	/**
	 * Initializes the annotations for <b>aspect</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createAspectAnnotations() {
		String source = "aspect";	
		addAnnotation
		  (tokenEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (offerEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (runtimeTraceEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (inputValueEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (inputEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (controlTokenEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (forkedTokenEClass, 
		   source, 
		   new String[] {
		   });
	}

} //DynamicPackageImpl
