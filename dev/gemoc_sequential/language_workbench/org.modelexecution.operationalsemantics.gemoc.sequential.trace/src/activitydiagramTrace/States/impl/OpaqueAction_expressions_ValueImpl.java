/**
 */
package activitydiagramTrace.States.impl;

import activitydiagramTrace.States.OpaqueAction_expressions_Value;
import activitydiagramTrace.States.State;
import activitydiagramTrace.States.StatesPackage;

import activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage;
import activitydiagramTrace.States.activitydiagram.TracedExpression;
import activitydiagramTrace.States.activitydiagram.TracedOpaqueAction;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Opaque Action expressions Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activitydiagramTrace.States.impl.OpaqueAction_expressions_ValueImpl#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link activitydiagramTrace.States.impl.OpaqueAction_expressions_ValueImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link activitydiagramTrace.States.impl.OpaqueAction_expressions_ValueImpl#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OpaqueAction_expressions_ValueImpl extends MinimalEObjectImpl.Container implements OpaqueAction_expressions_Value {
	/**
	 * The cached value of the '{@link #getExpressions() <em>Expressions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressions()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedExpression> expressions;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> states;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpaqueAction_expressions_ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.OPAQUE_ACTION_EXPRESSIONS_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedExpression> getExpressions() {
		if (expressions == null) {
			expressions = new EObjectResolvingEList<TracedExpression>(TracedExpression.class, this, StatesPackage.OPAQUE_ACTION_EXPRESSIONS_VALUE__EXPRESSIONS);
		}
		return expressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedOpaqueAction getParent() {
		if (eContainerFeatureID() != StatesPackage.OPAQUE_ACTION_EXPRESSIONS_VALUE__PARENT) return null;
		return (TracedOpaqueAction)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(TracedOpaqueAction newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, StatesPackage.OPAQUE_ACTION_EXPRESSIONS_VALUE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(TracedOpaqueAction newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != StatesPackage.OPAQUE_ACTION_EXPRESSIONS_VALUE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, ActivitydiagramPackage.TRACED_OPAQUE_ACTION__EXPRESSIONS_SEQUENCE, TracedOpaqueAction.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.OPAQUE_ACTION_EXPRESSIONS_VALUE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectWithInverseResolvingEList.ManyInverse<State>(State.class, this, StatesPackage.OPAQUE_ACTION_EXPRESSIONS_VALUE__STATES, StatesPackage.STATE__OPAQUE_ACTION_EXPRESSIONS_VALUES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatesPackage.OPAQUE_ACTION_EXPRESSIONS_VALUE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((TracedOpaqueAction)otherEnd, msgs);
			case StatesPackage.OPAQUE_ACTION_EXPRESSIONS_VALUE__STATES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStates()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatesPackage.OPAQUE_ACTION_EXPRESSIONS_VALUE__PARENT:
				return basicSetParent(null, msgs);
			case StatesPackage.OPAQUE_ACTION_EXPRESSIONS_VALUE__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case StatesPackage.OPAQUE_ACTION_EXPRESSIONS_VALUE__PARENT:
				return eInternalContainer().eInverseRemove(this, ActivitydiagramPackage.TRACED_OPAQUE_ACTION__EXPRESSIONS_SEQUENCE, TracedOpaqueAction.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StatesPackage.OPAQUE_ACTION_EXPRESSIONS_VALUE__EXPRESSIONS:
				return getExpressions();
			case StatesPackage.OPAQUE_ACTION_EXPRESSIONS_VALUE__PARENT:
				return getParent();
			case StatesPackage.OPAQUE_ACTION_EXPRESSIONS_VALUE__STATES:
				return getStates();
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
			case StatesPackage.OPAQUE_ACTION_EXPRESSIONS_VALUE__EXPRESSIONS:
				getExpressions().clear();
				getExpressions().addAll((Collection<? extends TracedExpression>)newValue);
				return;
			case StatesPackage.OPAQUE_ACTION_EXPRESSIONS_VALUE__PARENT:
				setParent((TracedOpaqueAction)newValue);
				return;
			case StatesPackage.OPAQUE_ACTION_EXPRESSIONS_VALUE__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends State>)newValue);
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
			case StatesPackage.OPAQUE_ACTION_EXPRESSIONS_VALUE__EXPRESSIONS:
				getExpressions().clear();
				return;
			case StatesPackage.OPAQUE_ACTION_EXPRESSIONS_VALUE__PARENT:
				setParent((TracedOpaqueAction)null);
				return;
			case StatesPackage.OPAQUE_ACTION_EXPRESSIONS_VALUE__STATES:
				getStates().clear();
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
			case StatesPackage.OPAQUE_ACTION_EXPRESSIONS_VALUE__EXPRESSIONS:
				return expressions != null && !expressions.isEmpty();
			case StatesPackage.OPAQUE_ACTION_EXPRESSIONS_VALUE__PARENT:
				return getParent() != null;
			case StatesPackage.OPAQUE_ACTION_EXPRESSIONS_VALUE__STATES:
				return states != null && !states.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OpaqueAction_expressions_ValueImpl
