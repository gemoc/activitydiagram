/**
 */
package activitydiagramTrace.Steps.impl;

import activitydiagramTrace.Steps.*;

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
public class StepsFactoryImpl extends EFactoryImpl implements StepsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StepsFactory init() {
		try {
			StepsFactory theStepsFactory = (StepsFactory)EPackage.Registry.INSTANCE.getEFactory(StepsPackage.eNS_URI);
			if (theStepsFactory != null) {
				return theStepsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StepsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepsFactoryImpl() {
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
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKEN: return createActivitydiagram_ActivityNode_AddToken();
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE: return createActivitydiagram_ActivityNode_Execute();
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_IMPLICIT_STEP: return createActivitydiagram_ActivityNode_Execute_ImplicitStep();
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN: return createActivitydiagram_ActivityNode_RemoveToken();
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE: return createActivitydiagram_ActivityNode_Terminate();
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_EXECUTE: return createActivitydiagram_Activity_Execute();
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_IMPLICIT_STEP: return createActivitydiagram_Activity_Execute_ImplicitStep();
			case StepsPackage.ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_INIT: return createActivitydiagram_BooleanVariable_Init();
			case StepsPackage.ACTIVITYDIAGRAM_INTEGER_VARIABLE_INIT: return createActivitydiagram_IntegerVariable_Init();
			case StepsPackage.ACTIVITYDIAGRAM_VARIABLE_INIT: return createActivitydiagram_Variable_Init();
			case StepsPackage.ROOT_IMPLICIT_STEP: return createRootImplicitStep();
			case StepsPackage.SPECIFIC_ROOT_STEP: return createSpecificRootStep();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activitydiagram_ActivityNode_AddToken createActivitydiagram_ActivityNode_AddToken() {
		Activitydiagram_ActivityNode_AddTokenImpl activitydiagram_ActivityNode_AddToken = new Activitydiagram_ActivityNode_AddTokenImpl();
		return activitydiagram_ActivityNode_AddToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activitydiagram_ActivityNode_Execute createActivitydiagram_ActivityNode_Execute() {
		Activitydiagram_ActivityNode_ExecuteImpl activitydiagram_ActivityNode_Execute = new Activitydiagram_ActivityNode_ExecuteImpl();
		return activitydiagram_ActivityNode_Execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activitydiagram_ActivityNode_Execute_ImplicitStep createActivitydiagram_ActivityNode_Execute_ImplicitStep() {
		Activitydiagram_ActivityNode_Execute_ImplicitStepImpl activitydiagram_ActivityNode_Execute_ImplicitStep = new Activitydiagram_ActivityNode_Execute_ImplicitStepImpl();
		return activitydiagram_ActivityNode_Execute_ImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activitydiagram_ActivityNode_RemoveToken createActivitydiagram_ActivityNode_RemoveToken() {
		Activitydiagram_ActivityNode_RemoveTokenImpl activitydiagram_ActivityNode_RemoveToken = new Activitydiagram_ActivityNode_RemoveTokenImpl();
		return activitydiagram_ActivityNode_RemoveToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activitydiagram_ActivityNode_Terminate createActivitydiagram_ActivityNode_Terminate() {
		Activitydiagram_ActivityNode_TerminateImpl activitydiagram_ActivityNode_Terminate = new Activitydiagram_ActivityNode_TerminateImpl();
		return activitydiagram_ActivityNode_Terminate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activitydiagram_Activity_Execute createActivitydiagram_Activity_Execute() {
		Activitydiagram_Activity_ExecuteImpl activitydiagram_Activity_Execute = new Activitydiagram_Activity_ExecuteImpl();
		return activitydiagram_Activity_Execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activitydiagram_Activity_Execute_ImplicitStep createActivitydiagram_Activity_Execute_ImplicitStep() {
		Activitydiagram_Activity_Execute_ImplicitStepImpl activitydiagram_Activity_Execute_ImplicitStep = new Activitydiagram_Activity_Execute_ImplicitStepImpl();
		return activitydiagram_Activity_Execute_ImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activitydiagram_BooleanVariable_Init createActivitydiagram_BooleanVariable_Init() {
		Activitydiagram_BooleanVariable_InitImpl activitydiagram_BooleanVariable_Init = new Activitydiagram_BooleanVariable_InitImpl();
		return activitydiagram_BooleanVariable_Init;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activitydiagram_IntegerVariable_Init createActivitydiagram_IntegerVariable_Init() {
		Activitydiagram_IntegerVariable_InitImpl activitydiagram_IntegerVariable_Init = new Activitydiagram_IntegerVariable_InitImpl();
		return activitydiagram_IntegerVariable_Init;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activitydiagram_Variable_Init createActivitydiagram_Variable_Init() {
		Activitydiagram_Variable_InitImpl activitydiagram_Variable_Init = new Activitydiagram_Variable_InitImpl();
		return activitydiagram_Variable_Init;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootImplicitStep createRootImplicitStep() {
		RootImplicitStepImpl rootImplicitStep = new RootImplicitStepImpl();
		return rootImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificRootStep createSpecificRootStep() {
		SpecificRootStepImpl specificRootStep = new SpecificRootStepImpl();
		return specificRootStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepsPackage getStepsPackage() {
		return (StepsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StepsPackage getPackage() {
		return StepsPackage.eINSTANCE;
	}

} //StepsFactoryImpl
