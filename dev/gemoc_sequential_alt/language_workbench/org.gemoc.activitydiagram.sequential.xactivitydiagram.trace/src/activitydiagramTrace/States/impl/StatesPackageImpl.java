/**
 */
package activitydiagramTrace.States.impl;

import activitydiagramTrace.ActivitydiagramTracePackage;

import activitydiagramTrace.States.ActivityEdge_offeredTokens_Dimension;
import activitydiagramTrace.States.ActivityEdge_offeredTokens_Value;
import activitydiagramTrace.States.ActivityNode_heldTokens_Dimension;
import activitydiagramTrace.States.ActivityNode_heldTokens_Value;
import activitydiagramTrace.States.BooleanVariable_currentValue_Dimension;
import activitydiagramTrace.States.BooleanVariable_currentValue_Value;
import activitydiagramTrace.States.IntegerVariable_currentValue_Dimension;
import activitydiagramTrace.States.IntegerVariable_currentValue_Value;
import activitydiagramTrace.States.SpecificAttributeValue;
import activitydiagramTrace.States.SpecificDimension;
import activitydiagramTrace.States.SpecificReferenceValue;
import activitydiagramTrace.States.SpecificState;
import activitydiagramTrace.States.SpecificTracedObject;
import activitydiagramTrace.States.SpecificValue;
import activitydiagramTrace.States.StatesFactory;
import activitydiagramTrace.States.StatesPackage;

import activitydiagramTrace.States.activitydiagram.impl.ActivitydiagramPackageImpl;

import activitydiagramTrace.Steps.StepsPackage;

import activitydiagramTrace.Steps.impl.StepsPackageImpl;

import activitydiagramTrace.impl.ActivitydiagramTracePackageImpl;

import fr.inria.diverse.trace.commons.model.trace.TracePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StatesPackageImpl extends EPackageImpl implements StatesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEdge_offeredTokens_DimensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEdge_offeredTokens_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityNode_heldTokens_DimensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityNode_heldTokens_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanVariable_currentValue_DimensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanVariable_currentValue_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerVariable_currentValue_DimensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerVariable_currentValue_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificAttributeValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificDimensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificReferenceValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificTracedObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificValueEClass = null;

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
	 * @see activitydiagramTrace.States.StatesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StatesPackageImpl() {
		super(eNS_URI, StatesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StatesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StatesPackage init() {
		if (isInited) return (StatesPackage)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI);

		// Obtain or create and register package
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StatesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TracePackage.eINSTANCE.eClass();
		ActivitydiagramPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ActivitydiagramTracePackageImpl theActivitydiagramTracePackage = (ActivitydiagramTracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramTracePackage.eNS_URI) instanceof ActivitydiagramTracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramTracePackage.eNS_URI) : ActivitydiagramTracePackage.eINSTANCE);
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) : StepsPackage.eINSTANCE);
		ActivitydiagramPackageImpl theActivitydiagramPackage_1 = (ActivitydiagramPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage.eNS_URI) instanceof ActivitydiagramPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage.eNS_URI) : activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage.eINSTANCE);

		// Create package meta-data objects
		theStatesPackage.createPackageContents();
		theActivitydiagramTracePackage.createPackageContents();
		theStepsPackage.createPackageContents();
		theActivitydiagramPackage_1.createPackageContents();

		// Initialize created meta-data
		theStatesPackage.initializePackageContents();
		theActivitydiagramTracePackage.initializePackageContents();
		theStepsPackage.initializePackageContents();
		theActivitydiagramPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStatesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StatesPackage.eNS_URI, theStatesPackage);
		return theStatesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityEdge_offeredTokens_Dimension() {
		return activityEdge_offeredTokens_DimensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityEdge_offeredTokens_Value() {
		return activityEdge_offeredTokens_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_offeredTokens_Value_OfferedTokens() {
		return (EReference)activityEdge_offeredTokens_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityNode_heldTokens_Dimension() {
		return activityNode_heldTokens_DimensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityNode_heldTokens_Value() {
		return activityNode_heldTokens_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_heldTokens_Value_HeldTokens() {
		return (EReference)activityNode_heldTokens_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanVariable_currentValue_Dimension() {
		return booleanVariable_currentValue_DimensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanVariable_currentValue_Value() {
		return booleanVariable_currentValue_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanVariable_currentValue_Value_CurrentValue() {
		return (EAttribute)booleanVariable_currentValue_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerVariable_currentValue_Dimension() {
		return integerVariable_currentValue_DimensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerVariable_currentValue_Value() {
		return integerVariable_currentValue_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerVariable_currentValue_Value_CurrentValue() {
		return (EAttribute)integerVariable_currentValue_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificAttributeValue() {
		return specificAttributeValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificDimension() {
		return specificDimensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificReferenceValue() {
		return specificReferenceValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificState() {
		return specificStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificTracedObject() {
		return specificTracedObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificValue() {
		return specificValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatesFactory getStatesFactory() {
		return (StatesFactory)getEFactoryInstance();
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
		activityEdge_offeredTokens_DimensionEClass = createEClass(ACTIVITY_EDGE_OFFERED_TOKENS_DIMENSION);

		activityEdge_offeredTokens_ValueEClass = createEClass(ACTIVITY_EDGE_OFFERED_TOKENS_VALUE);
		createEReference(activityEdge_offeredTokens_ValueEClass, ACTIVITY_EDGE_OFFERED_TOKENS_VALUE__OFFERED_TOKENS);

		activityNode_heldTokens_DimensionEClass = createEClass(ACTIVITY_NODE_HELD_TOKENS_DIMENSION);

		activityNode_heldTokens_ValueEClass = createEClass(ACTIVITY_NODE_HELD_TOKENS_VALUE);
		createEReference(activityNode_heldTokens_ValueEClass, ACTIVITY_NODE_HELD_TOKENS_VALUE__HELD_TOKENS);

		booleanVariable_currentValue_DimensionEClass = createEClass(BOOLEAN_VARIABLE_CURRENT_VALUE_DIMENSION);

		booleanVariable_currentValue_ValueEClass = createEClass(BOOLEAN_VARIABLE_CURRENT_VALUE_VALUE);
		createEAttribute(booleanVariable_currentValue_ValueEClass, BOOLEAN_VARIABLE_CURRENT_VALUE_VALUE__CURRENT_VALUE);

		integerVariable_currentValue_DimensionEClass = createEClass(INTEGER_VARIABLE_CURRENT_VALUE_DIMENSION);

		integerVariable_currentValue_ValueEClass = createEClass(INTEGER_VARIABLE_CURRENT_VALUE_VALUE);
		createEAttribute(integerVariable_currentValue_ValueEClass, INTEGER_VARIABLE_CURRENT_VALUE_VALUE__CURRENT_VALUE);

		specificAttributeValueEClass = createEClass(SPECIFIC_ATTRIBUTE_VALUE);

		specificDimensionEClass = createEClass(SPECIFIC_DIMENSION);

		specificReferenceValueEClass = createEClass(SPECIFIC_REFERENCE_VALUE);

		specificStateEClass = createEClass(SPECIFIC_STATE);

		specificTracedObjectEClass = createEClass(SPECIFIC_TRACED_OBJECT);

		specificValueEClass = createEClass(SPECIFIC_VALUE);
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

		// Obtain other dependent packages
		activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage theActivitydiagramPackage_1 = (activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage)EPackage.Registry.INSTANCE.getEPackage(activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage.eNS_URI);
		TracePackage theTracePackage = (TracePackage)EPackage.Registry.INSTANCE.getEPackage(TracePackage.eNS_URI);
		StepsPackage theStepsPackage = (StepsPackage)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theActivitydiagramPackage_1);

		// Create type parameters
		ETypeParameter specificDimensionEClass_ValueSubType = addETypeParameter(specificDimensionEClass, "ValueSubType");
		addETypeParameter(specificReferenceValueEClass, "T");
		ETypeParameter specificTracedObjectEClass_DimensionSubType = addETypeParameter(specificTracedObjectEClass, "DimensionSubType");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getSpecificValue());
		specificDimensionEClass_ValueSubType.getEBounds().add(g1);
		g1 = createEGenericType(this.getSpecificDimension());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType(this.getSpecificValue());
		g2.setEUpperBound(g3);
		specificTracedObjectEClass_DimensionSubType.getEBounds().add(g1);

		// Add supertypes to classes
		g1 = createEGenericType(this.getSpecificDimension());
		g2 = createEGenericType(this.getActivityEdge_offeredTokens_Value());
		g1.getETypeArguments().add(g2);
		activityEdge_offeredTokens_DimensionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificReferenceValue());
		g2 = createEGenericType(theActivitydiagramPackage_1.getTracedControlToken());
		g1.getETypeArguments().add(g2);
		activityEdge_offeredTokens_ValueEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificDimension());
		g2 = createEGenericType(this.getActivityNode_heldTokens_Value());
		g1.getETypeArguments().add(g2);
		activityNode_heldTokens_DimensionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificReferenceValue());
		g2 = createEGenericType(theActivitydiagramPackage_1.getTracedControlToken());
		g1.getETypeArguments().add(g2);
		activityNode_heldTokens_ValueEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificDimension());
		g2 = createEGenericType(this.getBooleanVariable_currentValue_Value());
		g1.getETypeArguments().add(g2);
		booleanVariable_currentValue_DimensionEClass.getEGenericSuperTypes().add(g1);
		booleanVariable_currentValue_ValueEClass.getESuperTypes().add(this.getSpecificAttributeValue());
		g1 = createEGenericType(this.getSpecificDimension());
		g2 = createEGenericType(this.getIntegerVariable_currentValue_Value());
		g1.getETypeArguments().add(g2);
		integerVariable_currentValue_DimensionEClass.getEGenericSuperTypes().add(g1);
		integerVariable_currentValue_ValueEClass.getESuperTypes().add(this.getSpecificAttributeValue());
		specificAttributeValueEClass.getESuperTypes().add(this.getSpecificValue());
		g1 = createEGenericType(theTracePackage.getDimension());
		g2 = createEGenericType(specificDimensionEClass_ValueSubType);
		g1.getETypeArguments().add(g2);
		specificDimensionEClass.getEGenericSuperTypes().add(g1);
		specificReferenceValueEClass.getESuperTypes().add(this.getSpecificValue());
		g1 = createEGenericType(theTracePackage.getState());
		g2 = createEGenericType(theStepsPackage.getSpecificStep());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getSpecificValue());
		g1.getETypeArguments().add(g2);
		specificStateEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getTracedObject());
		g2 = createEGenericType(specificTracedObjectEClass_DimensionSubType);
		g1.getETypeArguments().add(g2);
		specificTracedObjectEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getValue());
		g2 = createEGenericType(this.getSpecificState());
		g1.getETypeArguments().add(g2);
		specificValueEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(activityEdge_offeredTokens_DimensionEClass, ActivityEdge_offeredTokens_Dimension.class, "ActivityEdge_offeredTokens_Dimension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activityEdge_offeredTokens_ValueEClass, ActivityEdge_offeredTokens_Value.class, "ActivityEdge_offeredTokens_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityEdge_offeredTokens_Value_OfferedTokens(), theActivitydiagramPackage_1.getTracedControlToken(), null, "offeredTokens", null, 0, -1, ActivityEdge_offeredTokens_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityNode_heldTokens_DimensionEClass, ActivityNode_heldTokens_Dimension.class, "ActivityNode_heldTokens_Dimension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activityNode_heldTokens_ValueEClass, ActivityNode_heldTokens_Value.class, "ActivityNode_heldTokens_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityNode_heldTokens_Value_HeldTokens(), theActivitydiagramPackage_1.getTracedControlToken(), null, "heldTokens", null, 0, -1, ActivityNode_heldTokens_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanVariable_currentValue_DimensionEClass, BooleanVariable_currentValue_Dimension.class, "BooleanVariable_currentValue_Dimension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(booleanVariable_currentValue_ValueEClass, BooleanVariable_currentValue_Value.class, "BooleanVariable_currentValue_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanVariable_currentValue_Value_CurrentValue(), ecorePackage.getEBoolean(), "currentValue", null, 0, 1, BooleanVariable_currentValue_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerVariable_currentValue_DimensionEClass, IntegerVariable_currentValue_Dimension.class, "IntegerVariable_currentValue_Dimension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(integerVariable_currentValue_ValueEClass, IntegerVariable_currentValue_Value.class, "IntegerVariable_currentValue_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerVariable_currentValue_Value_CurrentValue(), ecorePackage.getEInt(), "currentValue", null, 0, 1, IntegerVariable_currentValue_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specificAttributeValueEClass, SpecificAttributeValue.class, "SpecificAttributeValue", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(specificDimensionEClass, SpecificDimension.class, "SpecificDimension", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(specificReferenceValueEClass, SpecificReferenceValue.class, "SpecificReferenceValue", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(specificStateEClass, SpecificState.class, "SpecificState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(specificTracedObjectEClass, SpecificTracedObject.class, "SpecificTracedObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(specificValueEClass, SpecificValue.class, "SpecificValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create annotations
		// http://www.modelexecution.org/trace/XMOF
		createXMOFAnnotations();
		// aspect
		createAspectAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.modelexecution.org/trace/XMOF</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createXMOFAnnotations() {
		String source = "http://www.modelexecution.org/trace/XMOF";	
		addAnnotation
		  (activityEdge_offeredTokens_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (activityNode_heldTokens_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (booleanVariable_currentValue_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (integerVariable_currentValue_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });
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
		  (getActivityEdge_offeredTokens_Value_OfferedTokens(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActivityNode_heldTokens_Value_HeldTokens(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getBooleanVariable_currentValue_Value_CurrentValue(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getIntegerVariable_currentValue_Value_CurrentValue(), 
		   source, 
		   new String[] {
		   });
	}

} //StatesPackageImpl
