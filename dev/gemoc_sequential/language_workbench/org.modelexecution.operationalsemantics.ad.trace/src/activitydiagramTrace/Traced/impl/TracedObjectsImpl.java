/**
 */
package activitydiagramTrace.Traced.impl;

import activitydiagramTrace.Traced.TracedObjects;
import activitydiagramTrace.Traced.TracedPackage;

import activitydiagramTrace.Traced.activitydiagram.TracedActivity;
import activitydiagramTrace.Traced.activitydiagram.TracedActivityFinalNode;
import activitydiagramTrace.Traced.activitydiagram.TracedBooleanValue;
import activitydiagramTrace.Traced.activitydiagram.TracedBooleanVariable;
import activitydiagramTrace.Traced.activitydiagram.TracedControlFlow;
import activitydiagramTrace.Traced.activitydiagram.TracedControlToken;
import activitydiagramTrace.Traced.activitydiagram.TracedDecisionNode;
import activitydiagramTrace.Traced.activitydiagram.TracedForkNode;
import activitydiagramTrace.Traced.activitydiagram.TracedForkedToken;
import activitydiagramTrace.Traced.activitydiagram.TracedInitialNode;
import activitydiagramTrace.Traced.activitydiagram.TracedInput;
import activitydiagramTrace.Traced.activitydiagram.TracedInputValue;
import activitydiagramTrace.Traced.activitydiagram.TracedIntegerValue;
import activitydiagramTrace.Traced.activitydiagram.TracedIntegerVariable;
import activitydiagramTrace.Traced.activitydiagram.TracedJoinNode;
import activitydiagramTrace.Traced.activitydiagram.TracedMergeNode;
import activitydiagramTrace.Traced.activitydiagram.TracedOffer;
import activitydiagramTrace.Traced.activitydiagram.TracedOpaqueAction;
import activitydiagramTrace.Traced.activitydiagram.TracedTrace;

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
 * An implementation of the model object '<em><b>Objects</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activitydiagramTrace.Traced.impl.TracedObjectsImpl#getActivitydiagram_tracedDecisionNodes <em>Activitydiagram traced Decision Nodes</em>}</li>
 *   <li>{@link activitydiagramTrace.Traced.impl.TracedObjectsImpl#getActivitydiagram_tracedIntegerVariables <em>Activitydiagram traced Integer Variables</em>}</li>
 *   <li>{@link activitydiagramTrace.Traced.impl.TracedObjectsImpl#getActivitydiagram_tracedControlTokens <em>Activitydiagram traced Control Tokens</em>}</li>
 *   <li>{@link activitydiagramTrace.Traced.impl.TracedObjectsImpl#getActivitydiagram_tracedInputs <em>Activitydiagram traced Inputs</em>}</li>
 *   <li>{@link activitydiagramTrace.Traced.impl.TracedObjectsImpl#getActivitydiagram_tracedForkedTokens <em>Activitydiagram traced Forked Tokens</em>}</li>
 *   <li>{@link activitydiagramTrace.Traced.impl.TracedObjectsImpl#getActivitydiagram_tracedBooleanVariables <em>Activitydiagram traced Boolean Variables</em>}</li>
 *   <li>{@link activitydiagramTrace.Traced.impl.TracedObjectsImpl#getActivitydiagram_tracedInitialNodes <em>Activitydiagram traced Initial Nodes</em>}</li>
 *   <li>{@link activitydiagramTrace.Traced.impl.TracedObjectsImpl#getActivitydiagram_tracedMergeNodes <em>Activitydiagram traced Merge Nodes</em>}</li>
 *   <li>{@link activitydiagramTrace.Traced.impl.TracedObjectsImpl#getActivitydiagram_tracedIntegerValues <em>Activitydiagram traced Integer Values</em>}</li>
 *   <li>{@link activitydiagramTrace.Traced.impl.TracedObjectsImpl#getActivitydiagram_tracedOpaqueActions <em>Activitydiagram traced Opaque Actions</em>}</li>
 *   <li>{@link activitydiagramTrace.Traced.impl.TracedObjectsImpl#getActivitydiagram_tracedForkNodes <em>Activitydiagram traced Fork Nodes</em>}</li>
 *   <li>{@link activitydiagramTrace.Traced.impl.TracedObjectsImpl#getActivitydiagram_tracedOffers <em>Activitydiagram traced Offers</em>}</li>
 *   <li>{@link activitydiagramTrace.Traced.impl.TracedObjectsImpl#getActivitydiagram_tracedInputValues <em>Activitydiagram traced Input Values</em>}</li>
 *   <li>{@link activitydiagramTrace.Traced.impl.TracedObjectsImpl#getActivitydiagram_tracedControlFlows <em>Activitydiagram traced Control Flows</em>}</li>
 *   <li>{@link activitydiagramTrace.Traced.impl.TracedObjectsImpl#getActivitydiagram_tracedActivityFinalNodes <em>Activitydiagram traced Activity Final Nodes</em>}</li>
 *   <li>{@link activitydiagramTrace.Traced.impl.TracedObjectsImpl#getActivitydiagram_tracedJoinNodes <em>Activitydiagram traced Join Nodes</em>}</li>
 *   <li>{@link activitydiagramTrace.Traced.impl.TracedObjectsImpl#getActivitydiagram_tracedBooleanValues <em>Activitydiagram traced Boolean Values</em>}</li>
 *   <li>{@link activitydiagramTrace.Traced.impl.TracedObjectsImpl#getActivitydiagram_tracedActivitys <em>Activitydiagram traced Activitys</em>}</li>
 *   <li>{@link activitydiagramTrace.Traced.impl.TracedObjectsImpl#getActivitydiagram_tracedTraces <em>Activitydiagram traced Traces</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TracedObjectsImpl extends MinimalEObjectImpl.Container implements TracedObjects {
	/**
	 * The cached value of the '{@link #getActivitydiagram_tracedDecisionNodes() <em>Activitydiagram traced Decision Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_tracedDecisionNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedDecisionNode> activitydiagram_tracedDecisionNodes;

	/**
	 * The cached value of the '{@link #getActivitydiagram_tracedIntegerVariables() <em>Activitydiagram traced Integer Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_tracedIntegerVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedIntegerVariable> activitydiagram_tracedIntegerVariables;

	/**
	 * The cached value of the '{@link #getActivitydiagram_tracedControlTokens() <em>Activitydiagram traced Control Tokens</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_tracedControlTokens()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedControlToken> activitydiagram_tracedControlTokens;

	/**
	 * The cached value of the '{@link #getActivitydiagram_tracedInputs() <em>Activitydiagram traced Inputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_tracedInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedInput> activitydiagram_tracedInputs;

	/**
	 * The cached value of the '{@link #getActivitydiagram_tracedForkedTokens() <em>Activitydiagram traced Forked Tokens</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_tracedForkedTokens()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedForkedToken> activitydiagram_tracedForkedTokens;

	/**
	 * The cached value of the '{@link #getActivitydiagram_tracedBooleanVariables() <em>Activitydiagram traced Boolean Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_tracedBooleanVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedBooleanVariable> activitydiagram_tracedBooleanVariables;

	/**
	 * The cached value of the '{@link #getActivitydiagram_tracedInitialNodes() <em>Activitydiagram traced Initial Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_tracedInitialNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedInitialNode> activitydiagram_tracedInitialNodes;

	/**
	 * The cached value of the '{@link #getActivitydiagram_tracedMergeNodes() <em>Activitydiagram traced Merge Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_tracedMergeNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedMergeNode> activitydiagram_tracedMergeNodes;

	/**
	 * The cached value of the '{@link #getActivitydiagram_tracedIntegerValues() <em>Activitydiagram traced Integer Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_tracedIntegerValues()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedIntegerValue> activitydiagram_tracedIntegerValues;

	/**
	 * The cached value of the '{@link #getActivitydiagram_tracedOpaqueActions() <em>Activitydiagram traced Opaque Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_tracedOpaqueActions()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedOpaqueAction> activitydiagram_tracedOpaqueActions;

	/**
	 * The cached value of the '{@link #getActivitydiagram_tracedForkNodes() <em>Activitydiagram traced Fork Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_tracedForkNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedForkNode> activitydiagram_tracedForkNodes;

	/**
	 * The cached value of the '{@link #getActivitydiagram_tracedOffers() <em>Activitydiagram traced Offers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_tracedOffers()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedOffer> activitydiagram_tracedOffers;

	/**
	 * The cached value of the '{@link #getActivitydiagram_tracedInputValues() <em>Activitydiagram traced Input Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_tracedInputValues()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedInputValue> activitydiagram_tracedInputValues;

	/**
	 * The cached value of the '{@link #getActivitydiagram_tracedControlFlows() <em>Activitydiagram traced Control Flows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_tracedControlFlows()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedControlFlow> activitydiagram_tracedControlFlows;

	/**
	 * The cached value of the '{@link #getActivitydiagram_tracedActivityFinalNodes() <em>Activitydiagram traced Activity Final Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_tracedActivityFinalNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedActivityFinalNode> activitydiagram_tracedActivityFinalNodes;

	/**
	 * The cached value of the '{@link #getActivitydiagram_tracedJoinNodes() <em>Activitydiagram traced Join Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_tracedJoinNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedJoinNode> activitydiagram_tracedJoinNodes;

	/**
	 * The cached value of the '{@link #getActivitydiagram_tracedBooleanValues() <em>Activitydiagram traced Boolean Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_tracedBooleanValues()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedBooleanValue> activitydiagram_tracedBooleanValues;

	/**
	 * The cached value of the '{@link #getActivitydiagram_tracedActivitys() <em>Activitydiagram traced Activitys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_tracedActivitys()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedActivity> activitydiagram_tracedActivitys;

	/**
	 * The cached value of the '{@link #getActivitydiagram_tracedTraces() <em>Activitydiagram traced Traces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram_tracedTraces()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedTrace> activitydiagram_tracedTraces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedObjectsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracedPackage.Literals.TRACED_OBJECTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedDecisionNode> getActivitydiagram_tracedDecisionNodes() {
		if (activitydiagram_tracedDecisionNodes == null) {
			activitydiagram_tracedDecisionNodes = new EObjectContainmentEList<TracedDecisionNode>(TracedDecisionNode.class, this, TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_DECISION_NODES);
		}
		return activitydiagram_tracedDecisionNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedIntegerVariable> getActivitydiagram_tracedIntegerVariables() {
		if (activitydiagram_tracedIntegerVariables == null) {
			activitydiagram_tracedIntegerVariables = new EObjectContainmentEList<TracedIntegerVariable>(TracedIntegerVariable.class, this, TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_INTEGER_VARIABLES);
		}
		return activitydiagram_tracedIntegerVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedControlToken> getActivitydiagram_tracedControlTokens() {
		if (activitydiagram_tracedControlTokens == null) {
			activitydiagram_tracedControlTokens = new EObjectContainmentEList<TracedControlToken>(TracedControlToken.class, this, TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_CONTROL_TOKENS);
		}
		return activitydiagram_tracedControlTokens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedInput> getActivitydiagram_tracedInputs() {
		if (activitydiagram_tracedInputs == null) {
			activitydiagram_tracedInputs = new EObjectContainmentEList<TracedInput>(TracedInput.class, this, TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_INPUTS);
		}
		return activitydiagram_tracedInputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedForkedToken> getActivitydiagram_tracedForkedTokens() {
		if (activitydiagram_tracedForkedTokens == null) {
			activitydiagram_tracedForkedTokens = new EObjectContainmentEList<TracedForkedToken>(TracedForkedToken.class, this, TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_FORKED_TOKENS);
		}
		return activitydiagram_tracedForkedTokens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedBooleanVariable> getActivitydiagram_tracedBooleanVariables() {
		if (activitydiagram_tracedBooleanVariables == null) {
			activitydiagram_tracedBooleanVariables = new EObjectContainmentEList<TracedBooleanVariable>(TracedBooleanVariable.class, this, TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_BOOLEAN_VARIABLES);
		}
		return activitydiagram_tracedBooleanVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedInitialNode> getActivitydiagram_tracedInitialNodes() {
		if (activitydiagram_tracedInitialNodes == null) {
			activitydiagram_tracedInitialNodes = new EObjectContainmentEList<TracedInitialNode>(TracedInitialNode.class, this, TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_INITIAL_NODES);
		}
		return activitydiagram_tracedInitialNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedMergeNode> getActivitydiagram_tracedMergeNodes() {
		if (activitydiagram_tracedMergeNodes == null) {
			activitydiagram_tracedMergeNodes = new EObjectContainmentEList<TracedMergeNode>(TracedMergeNode.class, this, TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_MERGE_NODES);
		}
		return activitydiagram_tracedMergeNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedIntegerValue> getActivitydiagram_tracedIntegerValues() {
		if (activitydiagram_tracedIntegerValues == null) {
			activitydiagram_tracedIntegerValues = new EObjectContainmentEList<TracedIntegerValue>(TracedIntegerValue.class, this, TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_INTEGER_VALUES);
		}
		return activitydiagram_tracedIntegerValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedOpaqueAction> getActivitydiagram_tracedOpaqueActions() {
		if (activitydiagram_tracedOpaqueActions == null) {
			activitydiagram_tracedOpaqueActions = new EObjectContainmentEList<TracedOpaqueAction>(TracedOpaqueAction.class, this, TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_OPAQUE_ACTIONS);
		}
		return activitydiagram_tracedOpaqueActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedForkNode> getActivitydiagram_tracedForkNodes() {
		if (activitydiagram_tracedForkNodes == null) {
			activitydiagram_tracedForkNodes = new EObjectContainmentEList<TracedForkNode>(TracedForkNode.class, this, TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_FORK_NODES);
		}
		return activitydiagram_tracedForkNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedOffer> getActivitydiagram_tracedOffers() {
		if (activitydiagram_tracedOffers == null) {
			activitydiagram_tracedOffers = new EObjectContainmentEList<TracedOffer>(TracedOffer.class, this, TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_OFFERS);
		}
		return activitydiagram_tracedOffers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedInputValue> getActivitydiagram_tracedInputValues() {
		if (activitydiagram_tracedInputValues == null) {
			activitydiagram_tracedInputValues = new EObjectContainmentEList<TracedInputValue>(TracedInputValue.class, this, TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_INPUT_VALUES);
		}
		return activitydiagram_tracedInputValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedControlFlow> getActivitydiagram_tracedControlFlows() {
		if (activitydiagram_tracedControlFlows == null) {
			activitydiagram_tracedControlFlows = new EObjectContainmentEList<TracedControlFlow>(TracedControlFlow.class, this, TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_CONTROL_FLOWS);
		}
		return activitydiagram_tracedControlFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedActivityFinalNode> getActivitydiagram_tracedActivityFinalNodes() {
		if (activitydiagram_tracedActivityFinalNodes == null) {
			activitydiagram_tracedActivityFinalNodes = new EObjectContainmentEList<TracedActivityFinalNode>(TracedActivityFinalNode.class, this, TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_ACTIVITY_FINAL_NODES);
		}
		return activitydiagram_tracedActivityFinalNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedJoinNode> getActivitydiagram_tracedJoinNodes() {
		if (activitydiagram_tracedJoinNodes == null) {
			activitydiagram_tracedJoinNodes = new EObjectContainmentEList<TracedJoinNode>(TracedJoinNode.class, this, TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_JOIN_NODES);
		}
		return activitydiagram_tracedJoinNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedBooleanValue> getActivitydiagram_tracedBooleanValues() {
		if (activitydiagram_tracedBooleanValues == null) {
			activitydiagram_tracedBooleanValues = new EObjectContainmentEList<TracedBooleanValue>(TracedBooleanValue.class, this, TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_BOOLEAN_VALUES);
		}
		return activitydiagram_tracedBooleanValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedActivity> getActivitydiagram_tracedActivitys() {
		if (activitydiagram_tracedActivitys == null) {
			activitydiagram_tracedActivitys = new EObjectContainmentEList<TracedActivity>(TracedActivity.class, this, TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_ACTIVITYS);
		}
		return activitydiagram_tracedActivitys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedTrace> getActivitydiagram_tracedTraces() {
		if (activitydiagram_tracedTraces == null) {
			activitydiagram_tracedTraces = new EObjectContainmentEList<TracedTrace>(TracedTrace.class, this, TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_TRACES);
		}
		return activitydiagram_tracedTraces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_DECISION_NODES:
				return ((InternalEList<?>)getActivitydiagram_tracedDecisionNodes()).basicRemove(otherEnd, msgs);
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_INTEGER_VARIABLES:
				return ((InternalEList<?>)getActivitydiagram_tracedIntegerVariables()).basicRemove(otherEnd, msgs);
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_CONTROL_TOKENS:
				return ((InternalEList<?>)getActivitydiagram_tracedControlTokens()).basicRemove(otherEnd, msgs);
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_INPUTS:
				return ((InternalEList<?>)getActivitydiagram_tracedInputs()).basicRemove(otherEnd, msgs);
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_FORKED_TOKENS:
				return ((InternalEList<?>)getActivitydiagram_tracedForkedTokens()).basicRemove(otherEnd, msgs);
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_BOOLEAN_VARIABLES:
				return ((InternalEList<?>)getActivitydiagram_tracedBooleanVariables()).basicRemove(otherEnd, msgs);
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_INITIAL_NODES:
				return ((InternalEList<?>)getActivitydiagram_tracedInitialNodes()).basicRemove(otherEnd, msgs);
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_MERGE_NODES:
				return ((InternalEList<?>)getActivitydiagram_tracedMergeNodes()).basicRemove(otherEnd, msgs);
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_INTEGER_VALUES:
				return ((InternalEList<?>)getActivitydiagram_tracedIntegerValues()).basicRemove(otherEnd, msgs);
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_OPAQUE_ACTIONS:
				return ((InternalEList<?>)getActivitydiagram_tracedOpaqueActions()).basicRemove(otherEnd, msgs);
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_FORK_NODES:
				return ((InternalEList<?>)getActivitydiagram_tracedForkNodes()).basicRemove(otherEnd, msgs);
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_OFFERS:
				return ((InternalEList<?>)getActivitydiagram_tracedOffers()).basicRemove(otherEnd, msgs);
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_INPUT_VALUES:
				return ((InternalEList<?>)getActivitydiagram_tracedInputValues()).basicRemove(otherEnd, msgs);
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_CONTROL_FLOWS:
				return ((InternalEList<?>)getActivitydiagram_tracedControlFlows()).basicRemove(otherEnd, msgs);
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_ACTIVITY_FINAL_NODES:
				return ((InternalEList<?>)getActivitydiagram_tracedActivityFinalNodes()).basicRemove(otherEnd, msgs);
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_JOIN_NODES:
				return ((InternalEList<?>)getActivitydiagram_tracedJoinNodes()).basicRemove(otherEnd, msgs);
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_BOOLEAN_VALUES:
				return ((InternalEList<?>)getActivitydiagram_tracedBooleanValues()).basicRemove(otherEnd, msgs);
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_ACTIVITYS:
				return ((InternalEList<?>)getActivitydiagram_tracedActivitys()).basicRemove(otherEnd, msgs);
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_TRACES:
				return ((InternalEList<?>)getActivitydiagram_tracedTraces()).basicRemove(otherEnd, msgs);
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
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_DECISION_NODES:
				return getActivitydiagram_tracedDecisionNodes();
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_INTEGER_VARIABLES:
				return getActivitydiagram_tracedIntegerVariables();
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_CONTROL_TOKENS:
				return getActivitydiagram_tracedControlTokens();
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_INPUTS:
				return getActivitydiagram_tracedInputs();
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_FORKED_TOKENS:
				return getActivitydiagram_tracedForkedTokens();
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_BOOLEAN_VARIABLES:
				return getActivitydiagram_tracedBooleanVariables();
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_INITIAL_NODES:
				return getActivitydiagram_tracedInitialNodes();
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_MERGE_NODES:
				return getActivitydiagram_tracedMergeNodes();
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_INTEGER_VALUES:
				return getActivitydiagram_tracedIntegerValues();
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_OPAQUE_ACTIONS:
				return getActivitydiagram_tracedOpaqueActions();
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_FORK_NODES:
				return getActivitydiagram_tracedForkNodes();
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_OFFERS:
				return getActivitydiagram_tracedOffers();
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_INPUT_VALUES:
				return getActivitydiagram_tracedInputValues();
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_CONTROL_FLOWS:
				return getActivitydiagram_tracedControlFlows();
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_ACTIVITY_FINAL_NODES:
				return getActivitydiagram_tracedActivityFinalNodes();
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_JOIN_NODES:
				return getActivitydiagram_tracedJoinNodes();
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_BOOLEAN_VALUES:
				return getActivitydiagram_tracedBooleanValues();
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_ACTIVITYS:
				return getActivitydiagram_tracedActivitys();
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_TRACES:
				return getActivitydiagram_tracedTraces();
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
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_DECISION_NODES:
				getActivitydiagram_tracedDecisionNodes().clear();
				getActivitydiagram_tracedDecisionNodes().addAll((Collection<? extends TracedDecisionNode>)newValue);
				return;
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_INTEGER_VARIABLES:
				getActivitydiagram_tracedIntegerVariables().clear();
				getActivitydiagram_tracedIntegerVariables().addAll((Collection<? extends TracedIntegerVariable>)newValue);
				return;
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_CONTROL_TOKENS:
				getActivitydiagram_tracedControlTokens().clear();
				getActivitydiagram_tracedControlTokens().addAll((Collection<? extends TracedControlToken>)newValue);
				return;
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_INPUTS:
				getActivitydiagram_tracedInputs().clear();
				getActivitydiagram_tracedInputs().addAll((Collection<? extends TracedInput>)newValue);
				return;
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_FORKED_TOKENS:
				getActivitydiagram_tracedForkedTokens().clear();
				getActivitydiagram_tracedForkedTokens().addAll((Collection<? extends TracedForkedToken>)newValue);
				return;
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_BOOLEAN_VARIABLES:
				getActivitydiagram_tracedBooleanVariables().clear();
				getActivitydiagram_tracedBooleanVariables().addAll((Collection<? extends TracedBooleanVariable>)newValue);
				return;
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_INITIAL_NODES:
				getActivitydiagram_tracedInitialNodes().clear();
				getActivitydiagram_tracedInitialNodes().addAll((Collection<? extends TracedInitialNode>)newValue);
				return;
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_MERGE_NODES:
				getActivitydiagram_tracedMergeNodes().clear();
				getActivitydiagram_tracedMergeNodes().addAll((Collection<? extends TracedMergeNode>)newValue);
				return;
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_INTEGER_VALUES:
				getActivitydiagram_tracedIntegerValues().clear();
				getActivitydiagram_tracedIntegerValues().addAll((Collection<? extends TracedIntegerValue>)newValue);
				return;
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_OPAQUE_ACTIONS:
				getActivitydiagram_tracedOpaqueActions().clear();
				getActivitydiagram_tracedOpaqueActions().addAll((Collection<? extends TracedOpaqueAction>)newValue);
				return;
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_FORK_NODES:
				getActivitydiagram_tracedForkNodes().clear();
				getActivitydiagram_tracedForkNodes().addAll((Collection<? extends TracedForkNode>)newValue);
				return;
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_OFFERS:
				getActivitydiagram_tracedOffers().clear();
				getActivitydiagram_tracedOffers().addAll((Collection<? extends TracedOffer>)newValue);
				return;
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_INPUT_VALUES:
				getActivitydiagram_tracedInputValues().clear();
				getActivitydiagram_tracedInputValues().addAll((Collection<? extends TracedInputValue>)newValue);
				return;
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_CONTROL_FLOWS:
				getActivitydiagram_tracedControlFlows().clear();
				getActivitydiagram_tracedControlFlows().addAll((Collection<? extends TracedControlFlow>)newValue);
				return;
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_ACTIVITY_FINAL_NODES:
				getActivitydiagram_tracedActivityFinalNodes().clear();
				getActivitydiagram_tracedActivityFinalNodes().addAll((Collection<? extends TracedActivityFinalNode>)newValue);
				return;
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_JOIN_NODES:
				getActivitydiagram_tracedJoinNodes().clear();
				getActivitydiagram_tracedJoinNodes().addAll((Collection<? extends TracedJoinNode>)newValue);
				return;
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_BOOLEAN_VALUES:
				getActivitydiagram_tracedBooleanValues().clear();
				getActivitydiagram_tracedBooleanValues().addAll((Collection<? extends TracedBooleanValue>)newValue);
				return;
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_ACTIVITYS:
				getActivitydiagram_tracedActivitys().clear();
				getActivitydiagram_tracedActivitys().addAll((Collection<? extends TracedActivity>)newValue);
				return;
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_TRACES:
				getActivitydiagram_tracedTraces().clear();
				getActivitydiagram_tracedTraces().addAll((Collection<? extends TracedTrace>)newValue);
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
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_DECISION_NODES:
				getActivitydiagram_tracedDecisionNodes().clear();
				return;
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_INTEGER_VARIABLES:
				getActivitydiagram_tracedIntegerVariables().clear();
				return;
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_CONTROL_TOKENS:
				getActivitydiagram_tracedControlTokens().clear();
				return;
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_INPUTS:
				getActivitydiagram_tracedInputs().clear();
				return;
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_FORKED_TOKENS:
				getActivitydiagram_tracedForkedTokens().clear();
				return;
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_BOOLEAN_VARIABLES:
				getActivitydiagram_tracedBooleanVariables().clear();
				return;
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_INITIAL_NODES:
				getActivitydiagram_tracedInitialNodes().clear();
				return;
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_MERGE_NODES:
				getActivitydiagram_tracedMergeNodes().clear();
				return;
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_INTEGER_VALUES:
				getActivitydiagram_tracedIntegerValues().clear();
				return;
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_OPAQUE_ACTIONS:
				getActivitydiagram_tracedOpaqueActions().clear();
				return;
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_FORK_NODES:
				getActivitydiagram_tracedForkNodes().clear();
				return;
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_OFFERS:
				getActivitydiagram_tracedOffers().clear();
				return;
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_INPUT_VALUES:
				getActivitydiagram_tracedInputValues().clear();
				return;
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_CONTROL_FLOWS:
				getActivitydiagram_tracedControlFlows().clear();
				return;
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_ACTIVITY_FINAL_NODES:
				getActivitydiagram_tracedActivityFinalNodes().clear();
				return;
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_JOIN_NODES:
				getActivitydiagram_tracedJoinNodes().clear();
				return;
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_BOOLEAN_VALUES:
				getActivitydiagram_tracedBooleanValues().clear();
				return;
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_ACTIVITYS:
				getActivitydiagram_tracedActivitys().clear();
				return;
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_TRACES:
				getActivitydiagram_tracedTraces().clear();
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
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_DECISION_NODES:
				return activitydiagram_tracedDecisionNodes != null && !activitydiagram_tracedDecisionNodes.isEmpty();
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_INTEGER_VARIABLES:
				return activitydiagram_tracedIntegerVariables != null && !activitydiagram_tracedIntegerVariables.isEmpty();
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_CONTROL_TOKENS:
				return activitydiagram_tracedControlTokens != null && !activitydiagram_tracedControlTokens.isEmpty();
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_INPUTS:
				return activitydiagram_tracedInputs != null && !activitydiagram_tracedInputs.isEmpty();
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_FORKED_TOKENS:
				return activitydiagram_tracedForkedTokens != null && !activitydiagram_tracedForkedTokens.isEmpty();
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_BOOLEAN_VARIABLES:
				return activitydiagram_tracedBooleanVariables != null && !activitydiagram_tracedBooleanVariables.isEmpty();
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_INITIAL_NODES:
				return activitydiagram_tracedInitialNodes != null && !activitydiagram_tracedInitialNodes.isEmpty();
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_MERGE_NODES:
				return activitydiagram_tracedMergeNodes != null && !activitydiagram_tracedMergeNodes.isEmpty();
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_INTEGER_VALUES:
				return activitydiagram_tracedIntegerValues != null && !activitydiagram_tracedIntegerValues.isEmpty();
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_OPAQUE_ACTIONS:
				return activitydiagram_tracedOpaqueActions != null && !activitydiagram_tracedOpaqueActions.isEmpty();
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_FORK_NODES:
				return activitydiagram_tracedForkNodes != null && !activitydiagram_tracedForkNodes.isEmpty();
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_OFFERS:
				return activitydiagram_tracedOffers != null && !activitydiagram_tracedOffers.isEmpty();
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_INPUT_VALUES:
				return activitydiagram_tracedInputValues != null && !activitydiagram_tracedInputValues.isEmpty();
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_CONTROL_FLOWS:
				return activitydiagram_tracedControlFlows != null && !activitydiagram_tracedControlFlows.isEmpty();
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_ACTIVITY_FINAL_NODES:
				return activitydiagram_tracedActivityFinalNodes != null && !activitydiagram_tracedActivityFinalNodes.isEmpty();
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_JOIN_NODES:
				return activitydiagram_tracedJoinNodes != null && !activitydiagram_tracedJoinNodes.isEmpty();
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_BOOLEAN_VALUES:
				return activitydiagram_tracedBooleanValues != null && !activitydiagram_tracedBooleanValues.isEmpty();
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_ACTIVITYS:
				return activitydiagram_tracedActivitys != null && !activitydiagram_tracedActivitys.isEmpty();
			case TracedPackage.TRACED_OBJECTS__ACTIVITYDIAGRAM_TRACED_TRACES:
				return activitydiagram_tracedTraces != null && !activitydiagram_tracedTraces.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracedObjectsImpl
