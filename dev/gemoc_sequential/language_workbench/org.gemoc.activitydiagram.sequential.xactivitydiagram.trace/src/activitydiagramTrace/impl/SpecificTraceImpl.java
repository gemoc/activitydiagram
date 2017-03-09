/**
 */
package activitydiagramTrace.impl;

import activitydiagramTrace.ActivitydiagramTracePackage;
import activitydiagramTrace.SpecificTrace;

import activitydiagramTrace.States.SpecificDimension;
import activitydiagramTrace.States.SpecificState;
import activitydiagramTrace.States.SpecificTracedObject;
import activitydiagramTrace.States.SpecificValue;

import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddToken;
import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1;
import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute;
import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_RemoveToken1;
import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_SendOffers1;
import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1;
import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Terminate;
import activitydiagramTrace.Steps.Activitydiagram_Activity_Execute;
import activitydiagramTrace.Steps.Activitydiagram_Activity_Reset;
import activitydiagramTrace.Steps.Activitydiagram_BooleanVariable_Execute;
import activitydiagramTrace.Steps.Activitydiagram_BooleanVariable_Init;
import activitydiagramTrace.Steps.Activitydiagram_DecisionNode_SendOffers1;
import activitydiagramTrace.Steps.Activitydiagram_IntegerVariable_Execute;
import activitydiagramTrace.Steps.Activitydiagram_IntegerVariable_Init;
import activitydiagramTrace.Steps.Activitydiagram_Variable_Execute;
import activitydiagramTrace.Steps.Activitydiagram_Variable_Init;
import activitydiagramTrace.Steps.SpecificStep;

import fr.inria.diverse.trace.commons.model.trace.SequentialStep;

import fr.inria.diverse.trace.commons.model.trace.impl.TraceImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specific Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link activitydiagramTrace.impl.SpecificTraceImpl#getActivitydiagram_ActivityNode_AddToken_Sequence <em>Activitydiagram Activity Node Add Token Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.SpecificTraceImpl#getActivitydiagram_ActivityNode_AddTokens1_Sequence <em>Activitydiagram Activity Node Add Tokens1 Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.SpecificTraceImpl#getActivitydiagram_ActivityNode_Execute_Sequence <em>Activitydiagram Activity Node Execute Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.SpecificTraceImpl#getActivitydiagram_ActivityNode_RemoveToken1_Sequence <em>Activitydiagram Activity Node Remove Token1 Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.SpecificTraceImpl#getActivitydiagram_ActivityNode_SendOffers1_Sequence <em>Activitydiagram Activity Node Send Offers1 Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.SpecificTraceImpl#getActivitydiagram_ActivityNode_TakeOfferdTokens1_Sequence <em>Activitydiagram Activity Node Take Offerd Tokens1 Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.SpecificTraceImpl#getActivitydiagram_ActivityNode_Terminate_Sequence <em>Activitydiagram Activity Node Terminate Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.SpecificTraceImpl#getActivitydiagram_Activity_Execute_Sequence <em>Activitydiagram Activity Execute Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.SpecificTraceImpl#getActivitydiagram_Activity_Reset_Sequence <em>Activitydiagram Activity Reset Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.SpecificTraceImpl#getActivitydiagram_BooleanVariable_Execute_Sequence <em>Activitydiagram Boolean Variable Execute Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.SpecificTraceImpl#getActivitydiagram_BooleanVariable_Init_Sequence <em>Activitydiagram Boolean Variable Init Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.SpecificTraceImpl#getActivitydiagram_DecisionNode_SendOffers1_Sequence <em>Activitydiagram Decision Node Send Offers1 Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.SpecificTraceImpl#getActivitydiagram_IntegerVariable_Execute_Sequence <em>Activitydiagram Integer Variable Execute Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.SpecificTraceImpl#getActivitydiagram_IntegerVariable_Init_Sequence <em>Activitydiagram Integer Variable Init Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.SpecificTraceImpl#getActivitydiagram_Variable_Execute_Sequence <em>Activitydiagram Variable Execute Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.impl.SpecificTraceImpl#getActivitydiagram_Variable_Init_Sequence <em>Activitydiagram Variable Init Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecificTraceImpl extends TraceImpl<SequentialStep<? extends SpecificStep, ? extends SpecificState>, SpecificTracedObject<? extends SpecificDimension<? extends SpecificValue>>, SpecificState> implements SpecificTrace {
	/**
	 * The cached value of the '{@link #getActivitydiagram_ActivityNode_AddToken_Sequence() <em>Activitydiagram Activity Node Add Token Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_ActivityNode_AddToken_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Activitydiagram_ActivityNode_AddToken> activitydiagram_ActivityNode_AddToken_Sequence;

	/**
	 * The cached value of the '{@link #getActivitydiagram_ActivityNode_AddTokens1_Sequence() <em>Activitydiagram Activity Node Add Tokens1 Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_ActivityNode_AddTokens1_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Activitydiagram_ActivityNode_AddTokens1> activitydiagram_ActivityNode_AddTokens1_Sequence;

	/**
	 * The cached value of the '{@link #getActivitydiagram_ActivityNode_Execute_Sequence() <em>Activitydiagram Activity Node Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_ActivityNode_Execute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Activitydiagram_ActivityNode_Execute> activitydiagram_ActivityNode_Execute_Sequence;

	/**
	 * The cached value of the '{@link #getActivitydiagram_ActivityNode_RemoveToken1_Sequence() <em>Activitydiagram Activity Node Remove Token1 Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_ActivityNode_RemoveToken1_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Activitydiagram_ActivityNode_RemoveToken1> activitydiagram_ActivityNode_RemoveToken1_Sequence;

	/**
	 * The cached value of the '{@link #getActivitydiagram_ActivityNode_SendOffers1_Sequence() <em>Activitydiagram Activity Node Send Offers1 Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_ActivityNode_SendOffers1_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Activitydiagram_ActivityNode_SendOffers1> activitydiagram_ActivityNode_SendOffers1_Sequence;

	/**
	 * The cached value of the '{@link #getActivitydiagram_ActivityNode_TakeOfferdTokens1_Sequence() <em>Activitydiagram Activity Node Take Offerd Tokens1 Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_ActivityNode_TakeOfferdTokens1_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Activitydiagram_ActivityNode_TakeOfferdTokens1> activitydiagram_ActivityNode_TakeOfferdTokens1_Sequence;

	/**
	 * The cached value of the '{@link #getActivitydiagram_ActivityNode_Terminate_Sequence() <em>Activitydiagram Activity Node Terminate Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_ActivityNode_Terminate_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Activitydiagram_ActivityNode_Terminate> activitydiagram_ActivityNode_Terminate_Sequence;

	/**
	 * The cached value of the '{@link #getActivitydiagram_Activity_Execute_Sequence() <em>Activitydiagram Activity Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_Activity_Execute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Activitydiagram_Activity_Execute> activitydiagram_Activity_Execute_Sequence;

	/**
	 * The cached value of the '{@link #getActivitydiagram_Activity_Reset_Sequence() <em>Activitydiagram Activity Reset Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_Activity_Reset_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Activitydiagram_Activity_Reset> activitydiagram_Activity_Reset_Sequence;

	/**
	 * The cached value of the '{@link #getActivitydiagram_BooleanVariable_Execute_Sequence() <em>Activitydiagram Boolean Variable Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_BooleanVariable_Execute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Activitydiagram_BooleanVariable_Execute> activitydiagram_BooleanVariable_Execute_Sequence;

	/**
	 * The cached value of the '{@link #getActivitydiagram_BooleanVariable_Init_Sequence() <em>Activitydiagram Boolean Variable Init Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_BooleanVariable_Init_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Activitydiagram_BooleanVariable_Init> activitydiagram_BooleanVariable_Init_Sequence;

	/**
	 * The cached value of the '{@link #getActivitydiagram_DecisionNode_SendOffers1_Sequence() <em>Activitydiagram Decision Node Send Offers1 Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_DecisionNode_SendOffers1_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Activitydiagram_DecisionNode_SendOffers1> activitydiagram_DecisionNode_SendOffers1_Sequence;

	/**
	 * The cached value of the '{@link #getActivitydiagram_IntegerVariable_Execute_Sequence() <em>Activitydiagram Integer Variable Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_IntegerVariable_Execute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Activitydiagram_IntegerVariable_Execute> activitydiagram_IntegerVariable_Execute_Sequence;

	/**
	 * The cached value of the '{@link #getActivitydiagram_IntegerVariable_Init_Sequence() <em>Activitydiagram Integer Variable Init Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_IntegerVariable_Init_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Activitydiagram_IntegerVariable_Init> activitydiagram_IntegerVariable_Init_Sequence;

	/**
	 * The cached value of the '{@link #getActivitydiagram_Variable_Execute_Sequence() <em>Activitydiagram Variable Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_Variable_Execute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Activitydiagram_Variable_Execute> activitydiagram_Variable_Execute_Sequence;

	/**
	 * The cached value of the '{@link #getActivitydiagram_Variable_Init_Sequence() <em>Activitydiagram Variable Init Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_Variable_Init_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Activitydiagram_Variable_Init> activitydiagram_Variable_Init_Sequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificTraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitydiagramTracePackage.Literals.SPECIFIC_TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetRootStep(SequentialStep<? extends SpecificStep, ? extends SpecificState> newRootStep, NotificationChain msgs) {
		return super.basicSetRootStep(newRootStep, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<SpecificTracedObject<? extends SpecificDimension<? extends SpecificValue>>> getTracedObjects() {
		if (tracedObjects == null) {
			tracedObjects = new EObjectContainmentEList<SpecificTracedObject<? extends SpecificDimension<? extends SpecificValue>>>(SpecificTracedObject.class, this, ActivitydiagramTracePackage.SPECIFIC_TRACE__TRACED_OBJECTS);
		}
		return tracedObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<SpecificState> getStates() {
		if (states == null) {
			states = new EObjectContainmentEList<SpecificState>(SpecificState.class, this, ActivitydiagramTracePackage.SPECIFIC_TRACE__STATES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activitydiagram_ActivityNode_AddToken> getActivitydiagram_ActivityNode_AddToken_Sequence() {
		if (activitydiagram_ActivityNode_AddToken_Sequence == null) {
			activitydiagram_ActivityNode_AddToken_Sequence = new EObjectResolvingEList<Activitydiagram_ActivityNode_AddToken>(Activitydiagram_ActivityNode_AddToken.class, this, ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKEN_SEQUENCE);
		}
		return activitydiagram_ActivityNode_AddToken_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activitydiagram_ActivityNode_AddTokens1> getActivitydiagram_ActivityNode_AddTokens1_Sequence() {
		if (activitydiagram_ActivityNode_AddTokens1_Sequence == null) {
			activitydiagram_ActivityNode_AddTokens1_Sequence = new EObjectResolvingEList<Activitydiagram_ActivityNode_AddTokens1>(Activitydiagram_ActivityNode_AddTokens1.class, this, ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_SEQUENCE);
		}
		return activitydiagram_ActivityNode_AddTokens1_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activitydiagram_ActivityNode_Execute> getActivitydiagram_ActivityNode_Execute_Sequence() {
		if (activitydiagram_ActivityNode_Execute_Sequence == null) {
			activitydiagram_ActivityNode_Execute_Sequence = new EObjectResolvingEList<Activitydiagram_ActivityNode_Execute>(Activitydiagram_ActivityNode_Execute.class, this, ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_SEQUENCE);
		}
		return activitydiagram_ActivityNode_Execute_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activitydiagram_ActivityNode_RemoveToken1> getActivitydiagram_ActivityNode_RemoveToken1_Sequence() {
		if (activitydiagram_ActivityNode_RemoveToken1_Sequence == null) {
			activitydiagram_ActivityNode_RemoveToken1_Sequence = new EObjectResolvingEList<Activitydiagram_ActivityNode_RemoveToken1>(Activitydiagram_ActivityNode_RemoveToken1.class, this, ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN1_SEQUENCE);
		}
		return activitydiagram_ActivityNode_RemoveToken1_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activitydiagram_ActivityNode_SendOffers1> getActivitydiagram_ActivityNode_SendOffers1_Sequence() {
		if (activitydiagram_ActivityNode_SendOffers1_Sequence == null) {
			activitydiagram_ActivityNode_SendOffers1_Sequence = new EObjectResolvingEList<Activitydiagram_ActivityNode_SendOffers1>(Activitydiagram_ActivityNode_SendOffers1.class, this, ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1_SEQUENCE);
		}
		return activitydiagram_ActivityNode_SendOffers1_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activitydiagram_ActivityNode_TakeOfferdTokens1> getActivitydiagram_ActivityNode_TakeOfferdTokens1_Sequence() {
		if (activitydiagram_ActivityNode_TakeOfferdTokens1_Sequence == null) {
			activitydiagram_ActivityNode_TakeOfferdTokens1_Sequence = new EObjectResolvingEList<Activitydiagram_ActivityNode_TakeOfferdTokens1>(Activitydiagram_ActivityNode_TakeOfferdTokens1.class, this, ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_SEQUENCE);
		}
		return activitydiagram_ActivityNode_TakeOfferdTokens1_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activitydiagram_ActivityNode_Terminate> getActivitydiagram_ActivityNode_Terminate_Sequence() {
		if (activitydiagram_ActivityNode_Terminate_Sequence == null) {
			activitydiagram_ActivityNode_Terminate_Sequence = new EObjectResolvingEList<Activitydiagram_ActivityNode_Terminate>(Activitydiagram_ActivityNode_Terminate.class, this, ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE_SEQUENCE);
		}
		return activitydiagram_ActivityNode_Terminate_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activitydiagram_Activity_Execute> getActivitydiagram_Activity_Execute_Sequence() {
		if (activitydiagram_Activity_Execute_Sequence == null) {
			activitydiagram_Activity_Execute_Sequence = new EObjectResolvingEList<Activitydiagram_Activity_Execute>(Activitydiagram_Activity_Execute.class, this, ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_SEQUENCE);
		}
		return activitydiagram_Activity_Execute_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activitydiagram_Activity_Reset> getActivitydiagram_Activity_Reset_Sequence() {
		if (activitydiagram_Activity_Reset_Sequence == null) {
			activitydiagram_Activity_Reset_Sequence = new EObjectResolvingEList<Activitydiagram_Activity_Reset>(Activitydiagram_Activity_Reset.class, this, ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_RESET_SEQUENCE);
		}
		return activitydiagram_Activity_Reset_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activitydiagram_BooleanVariable_Execute> getActivitydiagram_BooleanVariable_Execute_Sequence() {
		if (activitydiagram_BooleanVariable_Execute_Sequence == null) {
			activitydiagram_BooleanVariable_Execute_Sequence = new EObjectResolvingEList<Activitydiagram_BooleanVariable_Execute>(Activitydiagram_BooleanVariable_Execute.class, this, ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_EXECUTE_SEQUENCE);
		}
		return activitydiagram_BooleanVariable_Execute_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activitydiagram_BooleanVariable_Init> getActivitydiagram_BooleanVariable_Init_Sequence() {
		if (activitydiagram_BooleanVariable_Init_Sequence == null) {
			activitydiagram_BooleanVariable_Init_Sequence = new EObjectResolvingEList<Activitydiagram_BooleanVariable_Init>(Activitydiagram_BooleanVariable_Init.class, this, ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_INIT_SEQUENCE);
		}
		return activitydiagram_BooleanVariable_Init_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activitydiagram_DecisionNode_SendOffers1> getActivitydiagram_DecisionNode_SendOffers1_Sequence() {
		if (activitydiagram_DecisionNode_SendOffers1_Sequence == null) {
			activitydiagram_DecisionNode_SendOffers1_Sequence = new EObjectResolvingEList<Activitydiagram_DecisionNode_SendOffers1>(Activitydiagram_DecisionNode_SendOffers1.class, this, ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_DECISION_NODE_SEND_OFFERS1_SEQUENCE);
		}
		return activitydiagram_DecisionNode_SendOffers1_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activitydiagram_IntegerVariable_Execute> getActivitydiagram_IntegerVariable_Execute_Sequence() {
		if (activitydiagram_IntegerVariable_Execute_Sequence == null) {
			activitydiagram_IntegerVariable_Execute_Sequence = new EObjectResolvingEList<Activitydiagram_IntegerVariable_Execute>(Activitydiagram_IntegerVariable_Execute.class, this, ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_INTEGER_VARIABLE_EXECUTE_SEQUENCE);
		}
		return activitydiagram_IntegerVariable_Execute_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activitydiagram_IntegerVariable_Init> getActivitydiagram_IntegerVariable_Init_Sequence() {
		if (activitydiagram_IntegerVariable_Init_Sequence == null) {
			activitydiagram_IntegerVariable_Init_Sequence = new EObjectResolvingEList<Activitydiagram_IntegerVariable_Init>(Activitydiagram_IntegerVariable_Init.class, this, ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_INTEGER_VARIABLE_INIT_SEQUENCE);
		}
		return activitydiagram_IntegerVariable_Init_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activitydiagram_Variable_Execute> getActivitydiagram_Variable_Execute_Sequence() {
		if (activitydiagram_Variable_Execute_Sequence == null) {
			activitydiagram_Variable_Execute_Sequence = new EObjectResolvingEList<Activitydiagram_Variable_Execute>(Activitydiagram_Variable_Execute.class, this, ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_VARIABLE_EXECUTE_SEQUENCE);
		}
		return activitydiagram_Variable_Execute_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activitydiagram_Variable_Init> getActivitydiagram_Variable_Init_Sequence() {
		if (activitydiagram_Variable_Init_Sequence == null) {
			activitydiagram_Variable_Init_Sequence = new EObjectResolvingEList<Activitydiagram_Variable_Init>(Activitydiagram_Variable_Init.class, this, ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_VARIABLE_INIT_SEQUENCE);
		}
		return activitydiagram_Variable_Init_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKEN_SEQUENCE:
				return getActivitydiagram_ActivityNode_AddToken_Sequence();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_SEQUENCE:
				return getActivitydiagram_ActivityNode_AddTokens1_Sequence();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_SEQUENCE:
				return getActivitydiagram_ActivityNode_Execute_Sequence();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN1_SEQUENCE:
				return getActivitydiagram_ActivityNode_RemoveToken1_Sequence();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1_SEQUENCE:
				return getActivitydiagram_ActivityNode_SendOffers1_Sequence();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_SEQUENCE:
				return getActivitydiagram_ActivityNode_TakeOfferdTokens1_Sequence();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE_SEQUENCE:
				return getActivitydiagram_ActivityNode_Terminate_Sequence();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_SEQUENCE:
				return getActivitydiagram_Activity_Execute_Sequence();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_RESET_SEQUENCE:
				return getActivitydiagram_Activity_Reset_Sequence();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_EXECUTE_SEQUENCE:
				return getActivitydiagram_BooleanVariable_Execute_Sequence();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_INIT_SEQUENCE:
				return getActivitydiagram_BooleanVariable_Init_Sequence();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_DECISION_NODE_SEND_OFFERS1_SEQUENCE:
				return getActivitydiagram_DecisionNode_SendOffers1_Sequence();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_INTEGER_VARIABLE_EXECUTE_SEQUENCE:
				return getActivitydiagram_IntegerVariable_Execute_Sequence();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_INTEGER_VARIABLE_INIT_SEQUENCE:
				return getActivitydiagram_IntegerVariable_Init_Sequence();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_VARIABLE_EXECUTE_SEQUENCE:
				return getActivitydiagram_Variable_Execute_Sequence();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_VARIABLE_INIT_SEQUENCE:
				return getActivitydiagram_Variable_Init_Sequence();
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
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKEN_SEQUENCE:
				getActivitydiagram_ActivityNode_AddToken_Sequence().clear();
				getActivitydiagram_ActivityNode_AddToken_Sequence().addAll((Collection<? extends Activitydiagram_ActivityNode_AddToken>)newValue);
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_SEQUENCE:
				getActivitydiagram_ActivityNode_AddTokens1_Sequence().clear();
				getActivitydiagram_ActivityNode_AddTokens1_Sequence().addAll((Collection<? extends Activitydiagram_ActivityNode_AddTokens1>)newValue);
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_SEQUENCE:
				getActivitydiagram_ActivityNode_Execute_Sequence().clear();
				getActivitydiagram_ActivityNode_Execute_Sequence().addAll((Collection<? extends Activitydiagram_ActivityNode_Execute>)newValue);
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN1_SEQUENCE:
				getActivitydiagram_ActivityNode_RemoveToken1_Sequence().clear();
				getActivitydiagram_ActivityNode_RemoveToken1_Sequence().addAll((Collection<? extends Activitydiagram_ActivityNode_RemoveToken1>)newValue);
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1_SEQUENCE:
				getActivitydiagram_ActivityNode_SendOffers1_Sequence().clear();
				getActivitydiagram_ActivityNode_SendOffers1_Sequence().addAll((Collection<? extends Activitydiagram_ActivityNode_SendOffers1>)newValue);
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_SEQUENCE:
				getActivitydiagram_ActivityNode_TakeOfferdTokens1_Sequence().clear();
				getActivitydiagram_ActivityNode_TakeOfferdTokens1_Sequence().addAll((Collection<? extends Activitydiagram_ActivityNode_TakeOfferdTokens1>)newValue);
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE_SEQUENCE:
				getActivitydiagram_ActivityNode_Terminate_Sequence().clear();
				getActivitydiagram_ActivityNode_Terminate_Sequence().addAll((Collection<? extends Activitydiagram_ActivityNode_Terminate>)newValue);
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_SEQUENCE:
				getActivitydiagram_Activity_Execute_Sequence().clear();
				getActivitydiagram_Activity_Execute_Sequence().addAll((Collection<? extends Activitydiagram_Activity_Execute>)newValue);
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_RESET_SEQUENCE:
				getActivitydiagram_Activity_Reset_Sequence().clear();
				getActivitydiagram_Activity_Reset_Sequence().addAll((Collection<? extends Activitydiagram_Activity_Reset>)newValue);
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_EXECUTE_SEQUENCE:
				getActivitydiagram_BooleanVariable_Execute_Sequence().clear();
				getActivitydiagram_BooleanVariable_Execute_Sequence().addAll((Collection<? extends Activitydiagram_BooleanVariable_Execute>)newValue);
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_INIT_SEQUENCE:
				getActivitydiagram_BooleanVariable_Init_Sequence().clear();
				getActivitydiagram_BooleanVariable_Init_Sequence().addAll((Collection<? extends Activitydiagram_BooleanVariable_Init>)newValue);
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_DECISION_NODE_SEND_OFFERS1_SEQUENCE:
				getActivitydiagram_DecisionNode_SendOffers1_Sequence().clear();
				getActivitydiagram_DecisionNode_SendOffers1_Sequence().addAll((Collection<? extends Activitydiagram_DecisionNode_SendOffers1>)newValue);
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_INTEGER_VARIABLE_EXECUTE_SEQUENCE:
				getActivitydiagram_IntegerVariable_Execute_Sequence().clear();
				getActivitydiagram_IntegerVariable_Execute_Sequence().addAll((Collection<? extends Activitydiagram_IntegerVariable_Execute>)newValue);
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_INTEGER_VARIABLE_INIT_SEQUENCE:
				getActivitydiagram_IntegerVariable_Init_Sequence().clear();
				getActivitydiagram_IntegerVariable_Init_Sequence().addAll((Collection<? extends Activitydiagram_IntegerVariable_Init>)newValue);
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_VARIABLE_EXECUTE_SEQUENCE:
				getActivitydiagram_Variable_Execute_Sequence().clear();
				getActivitydiagram_Variable_Execute_Sequence().addAll((Collection<? extends Activitydiagram_Variable_Execute>)newValue);
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_VARIABLE_INIT_SEQUENCE:
				getActivitydiagram_Variable_Init_Sequence().clear();
				getActivitydiagram_Variable_Init_Sequence().addAll((Collection<? extends Activitydiagram_Variable_Init>)newValue);
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
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKEN_SEQUENCE:
				getActivitydiagram_ActivityNode_AddToken_Sequence().clear();
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_SEQUENCE:
				getActivitydiagram_ActivityNode_AddTokens1_Sequence().clear();
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_SEQUENCE:
				getActivitydiagram_ActivityNode_Execute_Sequence().clear();
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN1_SEQUENCE:
				getActivitydiagram_ActivityNode_RemoveToken1_Sequence().clear();
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1_SEQUENCE:
				getActivitydiagram_ActivityNode_SendOffers1_Sequence().clear();
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_SEQUENCE:
				getActivitydiagram_ActivityNode_TakeOfferdTokens1_Sequence().clear();
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE_SEQUENCE:
				getActivitydiagram_ActivityNode_Terminate_Sequence().clear();
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_SEQUENCE:
				getActivitydiagram_Activity_Execute_Sequence().clear();
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_RESET_SEQUENCE:
				getActivitydiagram_Activity_Reset_Sequence().clear();
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_EXECUTE_SEQUENCE:
				getActivitydiagram_BooleanVariable_Execute_Sequence().clear();
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_INIT_SEQUENCE:
				getActivitydiagram_BooleanVariable_Init_Sequence().clear();
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_DECISION_NODE_SEND_OFFERS1_SEQUENCE:
				getActivitydiagram_DecisionNode_SendOffers1_Sequence().clear();
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_INTEGER_VARIABLE_EXECUTE_SEQUENCE:
				getActivitydiagram_IntegerVariable_Execute_Sequence().clear();
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_INTEGER_VARIABLE_INIT_SEQUENCE:
				getActivitydiagram_IntegerVariable_Init_Sequence().clear();
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_VARIABLE_EXECUTE_SEQUENCE:
				getActivitydiagram_Variable_Execute_Sequence().clear();
				return;
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_VARIABLE_INIT_SEQUENCE:
				getActivitydiagram_Variable_Init_Sequence().clear();
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
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKEN_SEQUENCE:
				return activitydiagram_ActivityNode_AddToken_Sequence != null && !activitydiagram_ActivityNode_AddToken_Sequence.isEmpty();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_ADD_TOKENS1_SEQUENCE:
				return activitydiagram_ActivityNode_AddTokens1_Sequence != null && !activitydiagram_ActivityNode_AddTokens1_Sequence.isEmpty();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE_SEQUENCE:
				return activitydiagram_ActivityNode_Execute_Sequence != null && !activitydiagram_ActivityNode_Execute_Sequence.isEmpty();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_REMOVE_TOKEN1_SEQUENCE:
				return activitydiagram_ActivityNode_RemoveToken1_Sequence != null && !activitydiagram_ActivityNode_RemoveToken1_Sequence.isEmpty();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_SEND_OFFERS1_SEQUENCE:
				return activitydiagram_ActivityNode_SendOffers1_Sequence != null && !activitydiagram_ActivityNode_SendOffers1_Sequence.isEmpty();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_TAKE_OFFERD_TOKENS1_SEQUENCE:
				return activitydiagram_ActivityNode_TakeOfferdTokens1_Sequence != null && !activitydiagram_ActivityNode_TakeOfferdTokens1_Sequence.isEmpty();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE_SEQUENCE:
				return activitydiagram_ActivityNode_Terminate_Sequence != null && !activitydiagram_ActivityNode_Terminate_Sequence.isEmpty();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_EXECUTE_SEQUENCE:
				return activitydiagram_Activity_Execute_Sequence != null && !activitydiagram_Activity_Execute_Sequence.isEmpty();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_ACTIVITY_RESET_SEQUENCE:
				return activitydiagram_Activity_Reset_Sequence != null && !activitydiagram_Activity_Reset_Sequence.isEmpty();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_EXECUTE_SEQUENCE:
				return activitydiagram_BooleanVariable_Execute_Sequence != null && !activitydiagram_BooleanVariable_Execute_Sequence.isEmpty();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_INIT_SEQUENCE:
				return activitydiagram_BooleanVariable_Init_Sequence != null && !activitydiagram_BooleanVariable_Init_Sequence.isEmpty();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_DECISION_NODE_SEND_OFFERS1_SEQUENCE:
				return activitydiagram_DecisionNode_SendOffers1_Sequence != null && !activitydiagram_DecisionNode_SendOffers1_Sequence.isEmpty();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_INTEGER_VARIABLE_EXECUTE_SEQUENCE:
				return activitydiagram_IntegerVariable_Execute_Sequence != null && !activitydiagram_IntegerVariable_Execute_Sequence.isEmpty();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_INTEGER_VARIABLE_INIT_SEQUENCE:
				return activitydiagram_IntegerVariable_Init_Sequence != null && !activitydiagram_IntegerVariable_Init_Sequence.isEmpty();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_VARIABLE_EXECUTE_SEQUENCE:
				return activitydiagram_Variable_Execute_Sequence != null && !activitydiagram_Variable_Execute_Sequence.isEmpty();
			case ActivitydiagramTracePackage.SPECIFIC_TRACE__ACTIVITYDIAGRAM_VARIABLE_INIT_SEQUENCE:
				return activitydiagram_Variable_Init_Sequence != null && !activitydiagram_Variable_Init_Sequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SpecificTraceImpl
