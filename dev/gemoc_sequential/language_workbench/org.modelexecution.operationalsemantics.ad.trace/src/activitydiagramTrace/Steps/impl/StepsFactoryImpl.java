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
			case StepsPackage.STEPS: return createSteps();
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_HAS_OFFERS1: return createActivitydiagram_ActivityNode_HasOffers1();
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1: return createActivitydiagram_ActivityNode_SendOffers1();
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE: return createActivitydiagram_ActivityNode_Terminate();
			case StepsPackage.ACTIVITYDIAGRAM_VARIABLE_PRINT: return createActivitydiagram_Variable_Print();
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN1: return createActivitydiagram_ActivityNode_RemoveToken1();
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_FILL_EVENT: return createActivitydiagram_ActivityNode_Execute_FillEvent();
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_FILL_EVENT: return createActivitydiagram_ActivityNode_TakeOfferdTokens1_FillEvent();
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_FILL_EVENT: return createActivitydiagram_ActivityNode_AddTokens1_FillEvent();
			case StepsPackage.ACTIVITYDIAGRAM_VARIABLE_EXECUTE: return createActivitydiagram_Variable_Execute();
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_INITIALIZE_CONTEXT: return createActivitydiagram_Activity_InitializeContext();
			case StepsPackage.ACTIVITYDIAGRAM_VARIABLE_INIT: return createActivitydiagram_Variable_Init();
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_IS_READY: return createActivitydiagram_ActivityNode_IsReady();
			case StepsPackage.FILL_EVENT: return createFillEvent();
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE: return createActivitydiagram_ActivityNode_Execute();
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1: return createActivitydiagram_ActivityNode_TakeOfferdTokens1();
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1: return createActivitydiagram_ActivityNode_AddTokens1();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Steps createSteps() {
		StepsImpl steps = new StepsImpl();
		return steps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activitydiagram_ActivityNode_HasOffers1 createActivitydiagram_ActivityNode_HasOffers1() {
		Activitydiagram_ActivityNode_HasOffers1Impl activitydiagram_ActivityNode_HasOffers1 = new Activitydiagram_ActivityNode_HasOffers1Impl();
		return activitydiagram_ActivityNode_HasOffers1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activitydiagram_ActivityNode_SendOffers1 createActivitydiagram_ActivityNode_SendOffers1() {
		Activitydiagram_ActivityNode_SendOffers1Impl activitydiagram_ActivityNode_SendOffers1 = new Activitydiagram_ActivityNode_SendOffers1Impl();
		return activitydiagram_ActivityNode_SendOffers1;
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
	public Activitydiagram_Variable_Print createActivitydiagram_Variable_Print() {
		Activitydiagram_Variable_PrintImpl activitydiagram_Variable_Print = new Activitydiagram_Variable_PrintImpl();
		return activitydiagram_Variable_Print;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activitydiagram_ActivityNode_RemoveToken1 createActivitydiagram_ActivityNode_RemoveToken1() {
		Activitydiagram_ActivityNode_RemoveToken1Impl activitydiagram_ActivityNode_RemoveToken1 = new Activitydiagram_ActivityNode_RemoveToken1Impl();
		return activitydiagram_ActivityNode_RemoveToken1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activitydiagram_ActivityNode_Execute_FillEvent createActivitydiagram_ActivityNode_Execute_FillEvent() {
		Activitydiagram_ActivityNode_Execute_FillEventImpl activitydiagram_ActivityNode_Execute_FillEvent = new Activitydiagram_ActivityNode_Execute_FillEventImpl();
		return activitydiagram_ActivityNode_Execute_FillEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activitydiagram_ActivityNode_TakeOfferdTokens1_FillEvent createActivitydiagram_ActivityNode_TakeOfferdTokens1_FillEvent() {
		Activitydiagram_ActivityNode_TakeOfferdTokens1_FillEventImpl activitydiagram_ActivityNode_TakeOfferdTokens1_FillEvent = new Activitydiagram_ActivityNode_TakeOfferdTokens1_FillEventImpl();
		return activitydiagram_ActivityNode_TakeOfferdTokens1_FillEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activitydiagram_ActivityNode_AddTokens1_FillEvent createActivitydiagram_ActivityNode_AddTokens1_FillEvent() {
		Activitydiagram_ActivityNode_AddTokens1_FillEventImpl activitydiagram_ActivityNode_AddTokens1_FillEvent = new Activitydiagram_ActivityNode_AddTokens1_FillEventImpl();
		return activitydiagram_ActivityNode_AddTokens1_FillEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activitydiagram_Variable_Execute createActivitydiagram_Variable_Execute() {
		Activitydiagram_Variable_ExecuteImpl activitydiagram_Variable_Execute = new Activitydiagram_Variable_ExecuteImpl();
		return activitydiagram_Variable_Execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activitydiagram_Activity_InitializeContext createActivitydiagram_Activity_InitializeContext() {
		Activitydiagram_Activity_InitializeContextImpl activitydiagram_Activity_InitializeContext = new Activitydiagram_Activity_InitializeContextImpl();
		return activitydiagram_Activity_InitializeContext;
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
	public Activitydiagram_ActivityNode_IsReady createActivitydiagram_ActivityNode_IsReady() {
		Activitydiagram_ActivityNode_IsReadyImpl activitydiagram_ActivityNode_IsReady = new Activitydiagram_ActivityNode_IsReadyImpl();
		return activitydiagram_ActivityNode_IsReady;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FillEvent createFillEvent() {
		FillEventImpl fillEvent = new FillEventImpl();
		return fillEvent;
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
	public Activitydiagram_ActivityNode_TakeOfferdTokens1 createActivitydiagram_ActivityNode_TakeOfferdTokens1() {
		Activitydiagram_ActivityNode_TakeOfferdTokens1Impl activitydiagram_ActivityNode_TakeOfferdTokens1 = new Activitydiagram_ActivityNode_TakeOfferdTokens1Impl();
		return activitydiagram_ActivityNode_TakeOfferdTokens1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activitydiagram_ActivityNode_AddTokens1 createActivitydiagram_ActivityNode_AddTokens1() {
		Activitydiagram_ActivityNode_AddTokens1Impl activitydiagram_ActivityNode_AddTokens1 = new Activitydiagram_ActivityNode_AddTokens1Impl();
		return activitydiagram_ActivityNode_AddTokens1;
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
