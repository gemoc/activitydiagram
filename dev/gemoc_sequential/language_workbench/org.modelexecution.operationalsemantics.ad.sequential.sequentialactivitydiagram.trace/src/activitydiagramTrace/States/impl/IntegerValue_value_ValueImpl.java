/**
 */
package activitydiagramTrace.States.impl;

import activitydiagramTrace.States.IntegerValue_value_Value;
import activitydiagramTrace.States.State;
import activitydiagramTrace.States.StatesPackage;

import activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage;
import activitydiagramTrace.States.activitydiagram.TracedIntegerValue;

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
 * An implementation of the model object '<em><b>Integer Value value Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link activitydiagramTrace.States.impl.IntegerValue_value_ValueImpl#getStatesNoOpposite <em>States No Opposite</em>}</li>
 *   <li>{@link activitydiagramTrace.States.impl.IntegerValue_value_ValueImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link activitydiagramTrace.States.impl.IntegerValue_value_ValueImpl#getStates <em>States</em>}</li>
 *   <li>{@link activitydiagramTrace.States.impl.IntegerValue_value_ValueImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntegerValue_value_ValueImpl extends MinimalEObjectImpl.Container implements IntegerValue_value_Value {
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
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected int value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerValue_value_ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.INTEGER_VALUE_VALUE_VALUE;
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
	public TracedIntegerValue getParent() {
		if (eContainerFeatureID() != StatesPackage.INTEGER_VALUE_VALUE_VALUE__PARENT) return null;
		return (TracedIntegerValue)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(TracedIntegerValue newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, StatesPackage.INTEGER_VALUE_VALUE_VALUE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(TracedIntegerValue newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != StatesPackage.INTEGER_VALUE_VALUE_VALUE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, ActivitydiagramPackage.TRACED_INTEGER_VALUE__VALUE_SEQUENCE, TracedIntegerValue.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.INTEGER_VALUE_VALUE_VALUE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectWithInverseResolvingEList.ManyInverse<State>(State.class, this, StatesPackage.INTEGER_VALUE_VALUE_VALUE__STATES, StatesPackage.STATE__INTEGER_VALUE_VALUE_VALUES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(int newValue) {
		int oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.INTEGER_VALUE_VALUE_VALUE__VALUE, oldValue, value));
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
			case StatesPackage.INTEGER_VALUE_VALUE_VALUE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((TracedIntegerValue)otherEnd, msgs);
			case StatesPackage.INTEGER_VALUE_VALUE_VALUE__STATES:
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
			case StatesPackage.INTEGER_VALUE_VALUE_VALUE__PARENT:
				return basicSetParent(null, msgs);
			case StatesPackage.INTEGER_VALUE_VALUE_VALUE__STATES:
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
			case StatesPackage.INTEGER_VALUE_VALUE_VALUE__PARENT:
				return eInternalContainer().eInverseRemove(this, ActivitydiagramPackage.TRACED_INTEGER_VALUE__VALUE_SEQUENCE, TracedIntegerValue.class, msgs);
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
			case StatesPackage.INTEGER_VALUE_VALUE_VALUE__STATES_NO_OPPOSITE:
				return getStatesNoOpposite();
			case StatesPackage.INTEGER_VALUE_VALUE_VALUE__PARENT:
				return getParent();
			case StatesPackage.INTEGER_VALUE_VALUE_VALUE__STATES:
				return getStates();
			case StatesPackage.INTEGER_VALUE_VALUE_VALUE__VALUE:
				return getValue();
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
			case StatesPackage.INTEGER_VALUE_VALUE_VALUE__PARENT:
				setParent((TracedIntegerValue)newValue);
				return;
			case StatesPackage.INTEGER_VALUE_VALUE_VALUE__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends State>)newValue);
				return;
			case StatesPackage.INTEGER_VALUE_VALUE_VALUE__VALUE:
				setValue((Integer)newValue);
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
			case StatesPackage.INTEGER_VALUE_VALUE_VALUE__PARENT:
				setParent((TracedIntegerValue)null);
				return;
			case StatesPackage.INTEGER_VALUE_VALUE_VALUE__STATES:
				getStates().clear();
				return;
			case StatesPackage.INTEGER_VALUE_VALUE_VALUE__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case StatesPackage.INTEGER_VALUE_VALUE_VALUE__STATES_NO_OPPOSITE:
				return !getStatesNoOpposite().isEmpty();
			case StatesPackage.INTEGER_VALUE_VALUE_VALUE__PARENT:
				return getParent() != null;
			case StatesPackage.INTEGER_VALUE_VALUE_VALUE__STATES:
				return states != null && !states.isEmpty();
			case StatesPackage.INTEGER_VALUE_VALUE_VALUE__VALUE:
				return value != VALUE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //IntegerValue_value_ValueImpl
