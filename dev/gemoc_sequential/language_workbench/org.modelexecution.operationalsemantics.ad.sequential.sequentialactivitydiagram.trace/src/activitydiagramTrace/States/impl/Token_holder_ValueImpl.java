/**
 */
package activitydiagramTrace.States.impl;

import activitydiagramTrace.States.State;
import activitydiagramTrace.States.StatesPackage;
import activitydiagramTrace.States.Token_holder_Value;

import activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage;
import activitydiagramTrace.States.activitydiagram.TracedActivityNode;
import activitydiagramTrace.States.activitydiagram.TracedToken;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Token holder Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link activitydiagramTrace.States.impl.Token_holder_ValueImpl#getStatesNoOpposite <em>States No Opposite</em>}</li>
 *   <li>{@link activitydiagramTrace.States.impl.Token_holder_ValueImpl#getHolder <em>Holder</em>}</li>
 *   <li>{@link activitydiagramTrace.States.impl.Token_holder_ValueImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link activitydiagramTrace.States.impl.Token_holder_ValueImpl#getStates <em>States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Token_holder_ValueImpl extends MinimalEObjectImpl.Container implements Token_holder_Value {
	/**
	 * The cached value of the '{@link #getHolder() <em>Holder</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHolder()
	 * @generated
	 * @ordered
	 */
	protected TracedActivityNode holder;

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
	protected Token_holder_ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.TOKEN_HOLDER_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStatesNoOpposite() {
		return this.getStates();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedActivityNode getHolder() {
		if (holder != null && holder.eIsProxy()) {
			InternalEObject oldHolder = (InternalEObject)holder;
			holder = (TracedActivityNode)eResolveProxy(oldHolder);
			if (holder != oldHolder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatesPackage.TOKEN_HOLDER_VALUE__HOLDER, oldHolder, holder));
			}
		}
		return holder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedActivityNode basicGetHolder() {
		return holder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHolder(TracedActivityNode newHolder) {
		TracedActivityNode oldHolder = holder;
		holder = newHolder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.TOKEN_HOLDER_VALUE__HOLDER, oldHolder, holder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedToken getParent() {
		if (eContainerFeatureID() != StatesPackage.TOKEN_HOLDER_VALUE__PARENT) return null;
		return (TracedToken)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(TracedToken newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, StatesPackage.TOKEN_HOLDER_VALUE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(TracedToken newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != StatesPackage.TOKEN_HOLDER_VALUE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, ActivitydiagramPackage.TRACED_TOKEN__HOLDER_SEQUENCE, TracedToken.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.TOKEN_HOLDER_VALUE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectWithInverseResolvingEList.ManyInverse<State>(State.class, this, StatesPackage.TOKEN_HOLDER_VALUE__STATES, StatesPackage.STATE__TOKEN_HOLDER_VALUES);
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
			case StatesPackage.TOKEN_HOLDER_VALUE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((TracedToken)otherEnd, msgs);
			case StatesPackage.TOKEN_HOLDER_VALUE__STATES:
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
			case StatesPackage.TOKEN_HOLDER_VALUE__PARENT:
				return basicSetParent(null, msgs);
			case StatesPackage.TOKEN_HOLDER_VALUE__STATES:
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
			case StatesPackage.TOKEN_HOLDER_VALUE__PARENT:
				return eInternalContainer().eInverseRemove(this, ActivitydiagramPackage.TRACED_TOKEN__HOLDER_SEQUENCE, TracedToken.class, msgs);
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
			case StatesPackage.TOKEN_HOLDER_VALUE__STATES_NO_OPPOSITE:
				return getStatesNoOpposite();
			case StatesPackage.TOKEN_HOLDER_VALUE__HOLDER:
				if (resolve) return getHolder();
				return basicGetHolder();
			case StatesPackage.TOKEN_HOLDER_VALUE__PARENT:
				return getParent();
			case StatesPackage.TOKEN_HOLDER_VALUE__STATES:
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
			case StatesPackage.TOKEN_HOLDER_VALUE__HOLDER:
				setHolder((TracedActivityNode)newValue);
				return;
			case StatesPackage.TOKEN_HOLDER_VALUE__PARENT:
				setParent((TracedToken)newValue);
				return;
			case StatesPackage.TOKEN_HOLDER_VALUE__STATES:
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
			case StatesPackage.TOKEN_HOLDER_VALUE__HOLDER:
				setHolder((TracedActivityNode)null);
				return;
			case StatesPackage.TOKEN_HOLDER_VALUE__PARENT:
				setParent((TracedToken)null);
				return;
			case StatesPackage.TOKEN_HOLDER_VALUE__STATES:
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
			case StatesPackage.TOKEN_HOLDER_VALUE__STATES_NO_OPPOSITE:
				return !getStatesNoOpposite().isEmpty();
			case StatesPackage.TOKEN_HOLDER_VALUE__HOLDER:
				return holder != null;
			case StatesPackage.TOKEN_HOLDER_VALUE__PARENT:
				return getParent() != null;
			case StatesPackage.TOKEN_HOLDER_VALUE__STATES:
				return states != null && !states.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Token_holder_ValueImpl
