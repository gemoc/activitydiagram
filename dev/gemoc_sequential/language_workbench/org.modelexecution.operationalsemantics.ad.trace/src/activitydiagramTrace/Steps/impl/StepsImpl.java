/**
 */
package activitydiagramTrace.Steps.impl;

import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1;
import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1_FillEvent;
import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute;
import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute_FillEvent;
import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_HasOffers1;
import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_IsReady;
import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_RemoveToken1;
import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_SendOffers1;
import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1;
import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1_FillEvent;
import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Terminate;
import activitydiagramTrace.Steps.Activitydiagram_Activity_InitializeContext;
import activitydiagramTrace.Steps.Activitydiagram_Variable_Execute;
import activitydiagramTrace.Steps.Activitydiagram_Variable_Init;
import activitydiagramTrace.Steps.Activitydiagram_Variable_Print;
import activitydiagramTrace.Steps.FillEvent;
import activitydiagramTrace.Steps.Steps;
import activitydiagramTrace.Steps.StepsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Steps</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activitydiagramTrace.Steps.impl.StepsImpl#getActivitydiagram_ActivityNode_HasOffers1_Trace <em>Activitydiagram Activity Node Has Offers1 Trace</em>}</li>
 *   <li>{@link activitydiagramTrace.Steps.impl.StepsImpl#getActivitydiagram_ActivityNode_SendOffers1_Trace <em>Activitydiagram Activity Node Send Offers1 Trace</em>}</li>
 *   <li>{@link activitydiagramTrace.Steps.impl.StepsImpl#getActivitydiagram_ActivityNode_Terminate_Trace <em>Activitydiagram Activity Node Terminate Trace</em>}</li>
 *   <li>{@link activitydiagramTrace.Steps.impl.StepsImpl#getActivitydiagram_Variable_Print_Trace <em>Activitydiagram Variable Print Trace</em>}</li>
 *   <li>{@link activitydiagramTrace.Steps.impl.StepsImpl#getActivitydiagram_ActivityNode_RemoveToken1_Trace <em>Activitydiagram Activity Node Remove Token1 Trace</em>}</li>
 *   <li>{@link activitydiagramTrace.Steps.impl.StepsImpl#getActivitydiagram_ActivityNode_Execute_FillEvent_Trace <em>Activitydiagram Activity Node Execute Fill Event Trace</em>}</li>
 *   <li>{@link activitydiagramTrace.Steps.impl.StepsImpl#getActivitydiagram_ActivityNode_TakeOfferdTokens1_FillEvent_Trace <em>Activitydiagram Activity Node Take Offerd Tokens1 Fill Event Trace</em>}</li>
 *   <li>{@link activitydiagramTrace.Steps.impl.StepsImpl#getActivitydiagram_ActivityNode_AddTokens1_FillEvent_Trace <em>Activitydiagram Activity Node Add Tokens1 Fill Event Trace</em>}</li>
 *   <li>{@link activitydiagramTrace.Steps.impl.StepsImpl#getActivitydiagram_Variable_Execute_Trace <em>Activitydiagram Variable Execute Trace</em>}</li>
 *   <li>{@link activitydiagramTrace.Steps.impl.StepsImpl#getActivitydiagram_Activity_InitializeContext_Trace <em>Activitydiagram Activity Initialize Context Trace</em>}</li>
 *   <li>{@link activitydiagramTrace.Steps.impl.StepsImpl#getActivitydiagram_Variable_Init_Trace <em>Activitydiagram Variable Init Trace</em>}</li>
 *   <li>{@link activitydiagramTrace.Steps.impl.StepsImpl#getActivitydiagram_ActivityNode_IsReady_Trace <em>Activitydiagram Activity Node Is Ready Trace</em>}</li>
 *   <li>{@link activitydiagramTrace.Steps.impl.StepsImpl#getFillEvent_Trace <em>Fill Event Trace</em>}</li>
 *   <li>{@link activitydiagramTrace.Steps.impl.StepsImpl#getActivitydiagram_ActivityNode_Execute_Trace <em>Activitydiagram Activity Node Execute Trace</em>}</li>
 *   <li>{@link activitydiagramTrace.Steps.impl.StepsImpl#getActivitydiagram_ActivityNode_TakeOfferdTokens1_Trace <em>Activitydiagram Activity Node Take Offerd Tokens1 Trace</em>}</li>
 *   <li>{@link activitydiagramTrace.Steps.impl.StepsImpl#getActivitydiagram_ActivityNode_AddTokens1_Trace <em>Activitydiagram Activity Node Add Tokens1 Trace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StepsImpl extends MinimalEObjectImpl.Container implements Steps {
	/**
	 * The cached value of the '{@link #getActivitydiagram_ActivityNode_HasOffers1_Trace() <em>Activitydiagram Activity Node Has Offers1 Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_ActivityNode_HasOffers1_Trace()
	 * @generated
	 * @ordered
	 */
	protected EList<Activitydiagram_ActivityNode_HasOffers1> activitydiagram_ActivityNode_HasOffers1_Trace;

	/**
	 * The cached value of the '{@link #getActivitydiagram_ActivityNode_SendOffers1_Trace() <em>Activitydiagram Activity Node Send Offers1 Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_ActivityNode_SendOffers1_Trace()
	 * @generated
	 * @ordered
	 */
	protected EList<Activitydiagram_ActivityNode_SendOffers1> activitydiagram_ActivityNode_SendOffers1_Trace;

	/**
	 * The cached value of the '{@link #getActivitydiagram_ActivityNode_Terminate_Trace() <em>Activitydiagram Activity Node Terminate Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_ActivityNode_Terminate_Trace()
	 * @generated
	 * @ordered
	 */
	protected EList<Activitydiagram_ActivityNode_Terminate> activitydiagram_ActivityNode_Terminate_Trace;

	/**
	 * The cached value of the '{@link #getActivitydiagram_Variable_Print_Trace() <em>Activitydiagram Variable Print Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_Variable_Print_Trace()
	 * @generated
	 * @ordered
	 */
	protected EList<Activitydiagram_Variable_Print> activitydiagram_Variable_Print_Trace;

	/**
	 * The cached value of the '{@link #getActivitydiagram_ActivityNode_RemoveToken1_Trace() <em>Activitydiagram Activity Node Remove Token1 Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_ActivityNode_RemoveToken1_Trace()
	 * @generated
	 * @ordered
	 */
	protected EList<Activitydiagram_ActivityNode_RemoveToken1> activitydiagram_ActivityNode_RemoveToken1_Trace;

	/**
	 * The cached value of the '{@link #getActivitydiagram_ActivityNode_Execute_FillEvent_Trace() <em>Activitydiagram Activity Node Execute Fill Event Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_ActivityNode_Execute_FillEvent_Trace()
	 * @generated
	 * @ordered
	 */
	protected EList<Activitydiagram_ActivityNode_Execute_FillEvent> activitydiagram_ActivityNode_Execute_FillEvent_Trace;

	/**
	 * The cached value of the '{@link #getActivitydiagram_ActivityNode_TakeOfferdTokens1_FillEvent_Trace() <em>Activitydiagram Activity Node Take Offerd Tokens1 Fill Event Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_ActivityNode_TakeOfferdTokens1_FillEvent_Trace()
	 * @generated
	 * @ordered
	 */
	protected EList<Activitydiagram_ActivityNode_TakeOfferdTokens1_FillEvent> activitydiagram_ActivityNode_TakeOfferdTokens1_FillEvent_Trace;

	/**
	 * The cached value of the '{@link #getActivitydiagram_ActivityNode_AddTokens1_FillEvent_Trace() <em>Activitydiagram Activity Node Add Tokens1 Fill Event Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_ActivityNode_AddTokens1_FillEvent_Trace()
	 * @generated
	 * @ordered
	 */
	protected EList<Activitydiagram_ActivityNode_AddTokens1_FillEvent> activitydiagram_ActivityNode_AddTokens1_FillEvent_Trace;

	/**
	 * The cached value of the '{@link #getActivitydiagram_Variable_Execute_Trace() <em>Activitydiagram Variable Execute Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_Variable_Execute_Trace()
	 * @generated
	 * @ordered
	 */
	protected EList<Activitydiagram_Variable_Execute> activitydiagram_Variable_Execute_Trace;

	/**
	 * The cached value of the '{@link #getActivitydiagram_Activity_InitializeContext_Trace() <em>Activitydiagram Activity Initialize Context Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_Activity_InitializeContext_Trace()
	 * @generated
	 * @ordered
	 */
	protected EList<Activitydiagram_Activity_InitializeContext> activitydiagram_Activity_InitializeContext_Trace;

	/**
	 * The cached value of the '{@link #getActivitydiagram_Variable_Init_Trace() <em>Activitydiagram Variable Init Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_Variable_Init_Trace()
	 * @generated
	 * @ordered
	 */
	protected EList<Activitydiagram_Variable_Init> activitydiagram_Variable_Init_Trace;

	/**
	 * The cached value of the '{@link #getActivitydiagram_ActivityNode_IsReady_Trace() <em>Activitydiagram Activity Node Is Ready Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_ActivityNode_IsReady_Trace()
	 * @generated
	 * @ordered
	 */
	protected EList<Activitydiagram_ActivityNode_IsReady> activitydiagram_ActivityNode_IsReady_Trace;

	/**
	 * The cached value of the '{@link #getFillEvent_Trace() <em>Fill Event Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillEvent_Trace()
	 * @generated
	 * @ordered
	 */
	protected EList<FillEvent> fillEvent_Trace;

	/**
	 * The cached value of the '{@link #getActivitydiagram_ActivityNode_Execute_Trace() <em>Activitydiagram Activity Node Execute Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_ActivityNode_Execute_Trace()
	 * @generated
	 * @ordered
	 */
	protected EList<Activitydiagram_ActivityNode_Execute> activitydiagram_ActivityNode_Execute_Trace;

	/**
	 * The cached value of the '{@link #getActivitydiagram_ActivityNode_TakeOfferdTokens1_Trace() <em>Activitydiagram Activity Node Take Offerd Tokens1 Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_ActivityNode_TakeOfferdTokens1_Trace()
	 * @generated
	 * @ordered
	 */
	protected EList<Activitydiagram_ActivityNode_TakeOfferdTokens1> activitydiagram_ActivityNode_TakeOfferdTokens1_Trace;

	/**
	 * The cached value of the '{@link #getActivitydiagram_ActivityNode_AddTokens1_Trace() <em>Activitydiagram Activity Node Add Tokens1 Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_ActivityNode_AddTokens1_Trace()
	 * @generated
	 * @ordered
	 */
	protected EList<Activitydiagram_ActivityNode_AddTokens1> activitydiagram_ActivityNode_AddTokens1_Trace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StepsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StepsPackage.Literals.STEPS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activitydiagram_ActivityNode_HasOffers1> getActivitydiagram_ActivityNode_HasOffers1_Trace() {
		if (activitydiagram_ActivityNode_HasOffers1_Trace == null) {
			activitydiagram_ActivityNode_HasOffers1_Trace = new EObjectContainmentEList<Activitydiagram_ActivityNode_HasOffers1>(Activitydiagram_ActivityNode_HasOffers1.class, this, StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_HAS_OFFERS1_TRACE);
		}
		return activitydiagram_ActivityNode_HasOffers1_Trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activitydiagram_ActivityNode_SendOffers1> getActivitydiagram_ActivityNode_SendOffers1_Trace() {
		if (activitydiagram_ActivityNode_SendOffers1_Trace == null) {
			activitydiagram_ActivityNode_SendOffers1_Trace = new EObjectContainmentEList<Activitydiagram_ActivityNode_SendOffers1>(Activitydiagram_ActivityNode_SendOffers1.class, this, StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1_TRACE);
		}
		return activitydiagram_ActivityNode_SendOffers1_Trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activitydiagram_ActivityNode_Terminate> getActivitydiagram_ActivityNode_Terminate_Trace() {
		if (activitydiagram_ActivityNode_Terminate_Trace == null) {
			activitydiagram_ActivityNode_Terminate_Trace = new EObjectContainmentEList<Activitydiagram_ActivityNode_Terminate>(Activitydiagram_ActivityNode_Terminate.class, this, StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE_TRACE);
		}
		return activitydiagram_ActivityNode_Terminate_Trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activitydiagram_Variable_Print> getActivitydiagram_Variable_Print_Trace() {
		if (activitydiagram_Variable_Print_Trace == null) {
			activitydiagram_Variable_Print_Trace = new EObjectContainmentEList<Activitydiagram_Variable_Print>(Activitydiagram_Variable_Print.class, this, StepsPackage.STEPS__ACTIVITYDIAGRAM_VARIABLE_PRINT_TRACE);
		}
		return activitydiagram_Variable_Print_Trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activitydiagram_ActivityNode_RemoveToken1> getActivitydiagram_ActivityNode_RemoveToken1_Trace() {
		if (activitydiagram_ActivityNode_RemoveToken1_Trace == null) {
			activitydiagram_ActivityNode_RemoveToken1_Trace = new EObjectContainmentEList<Activitydiagram_ActivityNode_RemoveToken1>(Activitydiagram_ActivityNode_RemoveToken1.class, this, StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN1_TRACE);
		}
		return activitydiagram_ActivityNode_RemoveToken1_Trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activitydiagram_ActivityNode_Execute_FillEvent> getActivitydiagram_ActivityNode_Execute_FillEvent_Trace() {
		if (activitydiagram_ActivityNode_Execute_FillEvent_Trace == null) {
			activitydiagram_ActivityNode_Execute_FillEvent_Trace = new EObjectContainmentEList<Activitydiagram_ActivityNode_Execute_FillEvent>(Activitydiagram_ActivityNode_Execute_FillEvent.class, this, StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_FILL_EVENT_TRACE);
		}
		return activitydiagram_ActivityNode_Execute_FillEvent_Trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activitydiagram_ActivityNode_TakeOfferdTokens1_FillEvent> getActivitydiagram_ActivityNode_TakeOfferdTokens1_FillEvent_Trace() {
		if (activitydiagram_ActivityNode_TakeOfferdTokens1_FillEvent_Trace == null) {
			activitydiagram_ActivityNode_TakeOfferdTokens1_FillEvent_Trace = new EObjectContainmentEList<Activitydiagram_ActivityNode_TakeOfferdTokens1_FillEvent>(Activitydiagram_ActivityNode_TakeOfferdTokens1_FillEvent.class, this, StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_FILL_EVENT_TRACE);
		}
		return activitydiagram_ActivityNode_TakeOfferdTokens1_FillEvent_Trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activitydiagram_ActivityNode_AddTokens1_FillEvent> getActivitydiagram_ActivityNode_AddTokens1_FillEvent_Trace() {
		if (activitydiagram_ActivityNode_AddTokens1_FillEvent_Trace == null) {
			activitydiagram_ActivityNode_AddTokens1_FillEvent_Trace = new EObjectContainmentEList<Activitydiagram_ActivityNode_AddTokens1_FillEvent>(Activitydiagram_ActivityNode_AddTokens1_FillEvent.class, this, StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_FILL_EVENT_TRACE);
		}
		return activitydiagram_ActivityNode_AddTokens1_FillEvent_Trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activitydiagram_Variable_Execute> getActivitydiagram_Variable_Execute_Trace() {
		if (activitydiagram_Variable_Execute_Trace == null) {
			activitydiagram_Variable_Execute_Trace = new EObjectContainmentEList<Activitydiagram_Variable_Execute>(Activitydiagram_Variable_Execute.class, this, StepsPackage.STEPS__ACTIVITYDIAGRAM_VARIABLE_EXECUTE_TRACE);
		}
		return activitydiagram_Variable_Execute_Trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activitydiagram_Activity_InitializeContext> getActivitydiagram_Activity_InitializeContext_Trace() {
		if (activitydiagram_Activity_InitializeContext_Trace == null) {
			activitydiagram_Activity_InitializeContext_Trace = new EObjectContainmentEList<Activitydiagram_Activity_InitializeContext>(Activitydiagram_Activity_InitializeContext.class, this, StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_INITIALIZE_CONTEXT_TRACE);
		}
		return activitydiagram_Activity_InitializeContext_Trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activitydiagram_Variable_Init> getActivitydiagram_Variable_Init_Trace() {
		if (activitydiagram_Variable_Init_Trace == null) {
			activitydiagram_Variable_Init_Trace = new EObjectContainmentEList<Activitydiagram_Variable_Init>(Activitydiagram_Variable_Init.class, this, StepsPackage.STEPS__ACTIVITYDIAGRAM_VARIABLE_INIT_TRACE);
		}
		return activitydiagram_Variable_Init_Trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activitydiagram_ActivityNode_IsReady> getActivitydiagram_ActivityNode_IsReady_Trace() {
		if (activitydiagram_ActivityNode_IsReady_Trace == null) {
			activitydiagram_ActivityNode_IsReady_Trace = new EObjectContainmentEList<Activitydiagram_ActivityNode_IsReady>(Activitydiagram_ActivityNode_IsReady.class, this, StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_IS_READY_TRACE);
		}
		return activitydiagram_ActivityNode_IsReady_Trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FillEvent> getFillEvent_Trace() {
		if (fillEvent_Trace == null) {
			fillEvent_Trace = new EObjectContainmentEList<FillEvent>(FillEvent.class, this, StepsPackage.STEPS__FILL_EVENT_TRACE);
		}
		return fillEvent_Trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activitydiagram_ActivityNode_Execute> getActivitydiagram_ActivityNode_Execute_Trace() {
		if (activitydiagram_ActivityNode_Execute_Trace == null) {
			activitydiagram_ActivityNode_Execute_Trace = new EObjectContainmentEList<Activitydiagram_ActivityNode_Execute>(Activitydiagram_ActivityNode_Execute.class, this, StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_TRACE);
		}
		return activitydiagram_ActivityNode_Execute_Trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activitydiagram_ActivityNode_TakeOfferdTokens1> getActivitydiagram_ActivityNode_TakeOfferdTokens1_Trace() {
		if (activitydiagram_ActivityNode_TakeOfferdTokens1_Trace == null) {
			activitydiagram_ActivityNode_TakeOfferdTokens1_Trace = new EObjectContainmentEList<Activitydiagram_ActivityNode_TakeOfferdTokens1>(Activitydiagram_ActivityNode_TakeOfferdTokens1.class, this, StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_TRACE);
		}
		return activitydiagram_ActivityNode_TakeOfferdTokens1_Trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activitydiagram_ActivityNode_AddTokens1> getActivitydiagram_ActivityNode_AddTokens1_Trace() {
		if (activitydiagram_ActivityNode_AddTokens1_Trace == null) {
			activitydiagram_ActivityNode_AddTokens1_Trace = new EObjectContainmentEList<Activitydiagram_ActivityNode_AddTokens1>(Activitydiagram_ActivityNode_AddTokens1.class, this, StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_TRACE);
		}
		return activitydiagram_ActivityNode_AddTokens1_Trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_HAS_OFFERS1_TRACE:
				return ((InternalEList<?>)getActivitydiagram_ActivityNode_HasOffers1_Trace()).basicRemove(otherEnd, msgs);
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1_TRACE:
				return ((InternalEList<?>)getActivitydiagram_ActivityNode_SendOffers1_Trace()).basicRemove(otherEnd, msgs);
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE_TRACE:
				return ((InternalEList<?>)getActivitydiagram_ActivityNode_Terminate_Trace()).basicRemove(otherEnd, msgs);
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_VARIABLE_PRINT_TRACE:
				return ((InternalEList<?>)getActivitydiagram_Variable_Print_Trace()).basicRemove(otherEnd, msgs);
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN1_TRACE:
				return ((InternalEList<?>)getActivitydiagram_ActivityNode_RemoveToken1_Trace()).basicRemove(otherEnd, msgs);
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_FILL_EVENT_TRACE:
				return ((InternalEList<?>)getActivitydiagram_ActivityNode_Execute_FillEvent_Trace()).basicRemove(otherEnd, msgs);
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_FILL_EVENT_TRACE:
				return ((InternalEList<?>)getActivitydiagram_ActivityNode_TakeOfferdTokens1_FillEvent_Trace()).basicRemove(otherEnd, msgs);
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_FILL_EVENT_TRACE:
				return ((InternalEList<?>)getActivitydiagram_ActivityNode_AddTokens1_FillEvent_Trace()).basicRemove(otherEnd, msgs);
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_VARIABLE_EXECUTE_TRACE:
				return ((InternalEList<?>)getActivitydiagram_Variable_Execute_Trace()).basicRemove(otherEnd, msgs);
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_INITIALIZE_CONTEXT_TRACE:
				return ((InternalEList<?>)getActivitydiagram_Activity_InitializeContext_Trace()).basicRemove(otherEnd, msgs);
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_VARIABLE_INIT_TRACE:
				return ((InternalEList<?>)getActivitydiagram_Variable_Init_Trace()).basicRemove(otherEnd, msgs);
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_IS_READY_TRACE:
				return ((InternalEList<?>)getActivitydiagram_ActivityNode_IsReady_Trace()).basicRemove(otherEnd, msgs);
			case StepsPackage.STEPS__FILL_EVENT_TRACE:
				return ((InternalEList<?>)getFillEvent_Trace()).basicRemove(otherEnd, msgs);
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_TRACE:
				return ((InternalEList<?>)getActivitydiagram_ActivityNode_Execute_Trace()).basicRemove(otherEnd, msgs);
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_TRACE:
				return ((InternalEList<?>)getActivitydiagram_ActivityNode_TakeOfferdTokens1_Trace()).basicRemove(otherEnd, msgs);
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_TRACE:
				return ((InternalEList<?>)getActivitydiagram_ActivityNode_AddTokens1_Trace()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_HAS_OFFERS1_TRACE:
				return getActivitydiagram_ActivityNode_HasOffers1_Trace();
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1_TRACE:
				return getActivitydiagram_ActivityNode_SendOffers1_Trace();
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE_TRACE:
				return getActivitydiagram_ActivityNode_Terminate_Trace();
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_VARIABLE_PRINT_TRACE:
				return getActivitydiagram_Variable_Print_Trace();
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN1_TRACE:
				return getActivitydiagram_ActivityNode_RemoveToken1_Trace();
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_FILL_EVENT_TRACE:
				return getActivitydiagram_ActivityNode_Execute_FillEvent_Trace();
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_FILL_EVENT_TRACE:
				return getActivitydiagram_ActivityNode_TakeOfferdTokens1_FillEvent_Trace();
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_FILL_EVENT_TRACE:
				return getActivitydiagram_ActivityNode_AddTokens1_FillEvent_Trace();
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_VARIABLE_EXECUTE_TRACE:
				return getActivitydiagram_Variable_Execute_Trace();
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_INITIALIZE_CONTEXT_TRACE:
				return getActivitydiagram_Activity_InitializeContext_Trace();
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_VARIABLE_INIT_TRACE:
				return getActivitydiagram_Variable_Init_Trace();
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_IS_READY_TRACE:
				return getActivitydiagram_ActivityNode_IsReady_Trace();
			case StepsPackage.STEPS__FILL_EVENT_TRACE:
				return getFillEvent_Trace();
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_TRACE:
				return getActivitydiagram_ActivityNode_Execute_Trace();
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_TRACE:
				return getActivitydiagram_ActivityNode_TakeOfferdTokens1_Trace();
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_TRACE:
				return getActivitydiagram_ActivityNode_AddTokens1_Trace();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_HAS_OFFERS1_TRACE:
				getActivitydiagram_ActivityNode_HasOffers1_Trace().clear();
				getActivitydiagram_ActivityNode_HasOffers1_Trace().addAll((Collection<? extends Activitydiagram_ActivityNode_HasOffers1>)newValue);
				return;
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1_TRACE:
				getActivitydiagram_ActivityNode_SendOffers1_Trace().clear();
				getActivitydiagram_ActivityNode_SendOffers1_Trace().addAll((Collection<? extends Activitydiagram_ActivityNode_SendOffers1>)newValue);
				return;
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE_TRACE:
				getActivitydiagram_ActivityNode_Terminate_Trace().clear();
				getActivitydiagram_ActivityNode_Terminate_Trace().addAll((Collection<? extends Activitydiagram_ActivityNode_Terminate>)newValue);
				return;
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_VARIABLE_PRINT_TRACE:
				getActivitydiagram_Variable_Print_Trace().clear();
				getActivitydiagram_Variable_Print_Trace().addAll((Collection<? extends Activitydiagram_Variable_Print>)newValue);
				return;
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN1_TRACE:
				getActivitydiagram_ActivityNode_RemoveToken1_Trace().clear();
				getActivitydiagram_ActivityNode_RemoveToken1_Trace().addAll((Collection<? extends Activitydiagram_ActivityNode_RemoveToken1>)newValue);
				return;
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_FILL_EVENT_TRACE:
				getActivitydiagram_ActivityNode_Execute_FillEvent_Trace().clear();
				getActivitydiagram_ActivityNode_Execute_FillEvent_Trace().addAll((Collection<? extends Activitydiagram_ActivityNode_Execute_FillEvent>)newValue);
				return;
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_FILL_EVENT_TRACE:
				getActivitydiagram_ActivityNode_TakeOfferdTokens1_FillEvent_Trace().clear();
				getActivitydiagram_ActivityNode_TakeOfferdTokens1_FillEvent_Trace().addAll((Collection<? extends Activitydiagram_ActivityNode_TakeOfferdTokens1_FillEvent>)newValue);
				return;
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_FILL_EVENT_TRACE:
				getActivitydiagram_ActivityNode_AddTokens1_FillEvent_Trace().clear();
				getActivitydiagram_ActivityNode_AddTokens1_FillEvent_Trace().addAll((Collection<? extends Activitydiagram_ActivityNode_AddTokens1_FillEvent>)newValue);
				return;
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_VARIABLE_EXECUTE_TRACE:
				getActivitydiagram_Variable_Execute_Trace().clear();
				getActivitydiagram_Variable_Execute_Trace().addAll((Collection<? extends Activitydiagram_Variable_Execute>)newValue);
				return;
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_INITIALIZE_CONTEXT_TRACE:
				getActivitydiagram_Activity_InitializeContext_Trace().clear();
				getActivitydiagram_Activity_InitializeContext_Trace().addAll((Collection<? extends Activitydiagram_Activity_InitializeContext>)newValue);
				return;
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_VARIABLE_INIT_TRACE:
				getActivitydiagram_Variable_Init_Trace().clear();
				getActivitydiagram_Variable_Init_Trace().addAll((Collection<? extends Activitydiagram_Variable_Init>)newValue);
				return;
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_IS_READY_TRACE:
				getActivitydiagram_ActivityNode_IsReady_Trace().clear();
				getActivitydiagram_ActivityNode_IsReady_Trace().addAll((Collection<? extends Activitydiagram_ActivityNode_IsReady>)newValue);
				return;
			case StepsPackage.STEPS__FILL_EVENT_TRACE:
				getFillEvent_Trace().clear();
				getFillEvent_Trace().addAll((Collection<? extends FillEvent>)newValue);
				return;
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_TRACE:
				getActivitydiagram_ActivityNode_Execute_Trace().clear();
				getActivitydiagram_ActivityNode_Execute_Trace().addAll((Collection<? extends Activitydiagram_ActivityNode_Execute>)newValue);
				return;
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_TRACE:
				getActivitydiagram_ActivityNode_TakeOfferdTokens1_Trace().clear();
				getActivitydiagram_ActivityNode_TakeOfferdTokens1_Trace().addAll((Collection<? extends Activitydiagram_ActivityNode_TakeOfferdTokens1>)newValue);
				return;
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_TRACE:
				getActivitydiagram_ActivityNode_AddTokens1_Trace().clear();
				getActivitydiagram_ActivityNode_AddTokens1_Trace().addAll((Collection<? extends Activitydiagram_ActivityNode_AddTokens1>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_HAS_OFFERS1_TRACE:
				getActivitydiagram_ActivityNode_HasOffers1_Trace().clear();
				return;
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1_TRACE:
				getActivitydiagram_ActivityNode_SendOffers1_Trace().clear();
				return;
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE_TRACE:
				getActivitydiagram_ActivityNode_Terminate_Trace().clear();
				return;
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_VARIABLE_PRINT_TRACE:
				getActivitydiagram_Variable_Print_Trace().clear();
				return;
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN1_TRACE:
				getActivitydiagram_ActivityNode_RemoveToken1_Trace().clear();
				return;
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_FILL_EVENT_TRACE:
				getActivitydiagram_ActivityNode_Execute_FillEvent_Trace().clear();
				return;
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_FILL_EVENT_TRACE:
				getActivitydiagram_ActivityNode_TakeOfferdTokens1_FillEvent_Trace().clear();
				return;
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_FILL_EVENT_TRACE:
				getActivitydiagram_ActivityNode_AddTokens1_FillEvent_Trace().clear();
				return;
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_VARIABLE_EXECUTE_TRACE:
				getActivitydiagram_Variable_Execute_Trace().clear();
				return;
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_INITIALIZE_CONTEXT_TRACE:
				getActivitydiagram_Activity_InitializeContext_Trace().clear();
				return;
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_VARIABLE_INIT_TRACE:
				getActivitydiagram_Variable_Init_Trace().clear();
				return;
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_IS_READY_TRACE:
				getActivitydiagram_ActivityNode_IsReady_Trace().clear();
				return;
			case StepsPackage.STEPS__FILL_EVENT_TRACE:
				getFillEvent_Trace().clear();
				return;
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_TRACE:
				getActivitydiagram_ActivityNode_Execute_Trace().clear();
				return;
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_TRACE:
				getActivitydiagram_ActivityNode_TakeOfferdTokens1_Trace().clear();
				return;
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_TRACE:
				getActivitydiagram_ActivityNode_AddTokens1_Trace().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_HAS_OFFERS1_TRACE:
				return activitydiagram_ActivityNode_HasOffers1_Trace != null && !activitydiagram_ActivityNode_HasOffers1_Trace.isEmpty();
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1_TRACE:
				return activitydiagram_ActivityNode_SendOffers1_Trace != null && !activitydiagram_ActivityNode_SendOffers1_Trace.isEmpty();
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE_TRACE:
				return activitydiagram_ActivityNode_Terminate_Trace != null && !activitydiagram_ActivityNode_Terminate_Trace.isEmpty();
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_VARIABLE_PRINT_TRACE:
				return activitydiagram_Variable_Print_Trace != null && !activitydiagram_Variable_Print_Trace.isEmpty();
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN1_TRACE:
				return activitydiagram_ActivityNode_RemoveToken1_Trace != null && !activitydiagram_ActivityNode_RemoveToken1_Trace.isEmpty();
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_FILL_EVENT_TRACE:
				return activitydiagram_ActivityNode_Execute_FillEvent_Trace != null && !activitydiagram_ActivityNode_Execute_FillEvent_Trace.isEmpty();
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_FILL_EVENT_TRACE:
				return activitydiagram_ActivityNode_TakeOfferdTokens1_FillEvent_Trace != null && !activitydiagram_ActivityNode_TakeOfferdTokens1_FillEvent_Trace.isEmpty();
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_FILL_EVENT_TRACE:
				return activitydiagram_ActivityNode_AddTokens1_FillEvent_Trace != null && !activitydiagram_ActivityNode_AddTokens1_FillEvent_Trace.isEmpty();
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_VARIABLE_EXECUTE_TRACE:
				return activitydiagram_Variable_Execute_Trace != null && !activitydiagram_Variable_Execute_Trace.isEmpty();
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_INITIALIZE_CONTEXT_TRACE:
				return activitydiagram_Activity_InitializeContext_Trace != null && !activitydiagram_Activity_InitializeContext_Trace.isEmpty();
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_VARIABLE_INIT_TRACE:
				return activitydiagram_Variable_Init_Trace != null && !activitydiagram_Variable_Init_Trace.isEmpty();
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_IS_READY_TRACE:
				return activitydiagram_ActivityNode_IsReady_Trace != null && !activitydiagram_ActivityNode_IsReady_Trace.isEmpty();
			case StepsPackage.STEPS__FILL_EVENT_TRACE:
				return fillEvent_Trace != null && !fillEvent_Trace.isEmpty();
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_TRACE:
				return activitydiagram_ActivityNode_Execute_Trace != null && !activitydiagram_ActivityNode_Execute_Trace.isEmpty();
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_TRACE:
				return activitydiagram_ActivityNode_TakeOfferdTokens1_Trace != null && !activitydiagram_ActivityNode_TakeOfferdTokens1_Trace.isEmpty();
			case StepsPackage.STEPS__ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_TRACE:
				return activitydiagram_ActivityNode_AddTokens1_Trace != null && !activitydiagram_ActivityNode_AddTokens1_Trace.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StepsImpl
