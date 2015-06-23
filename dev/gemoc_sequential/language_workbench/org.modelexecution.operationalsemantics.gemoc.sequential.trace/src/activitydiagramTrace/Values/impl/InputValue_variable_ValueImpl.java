/**
 */
package activitydiagramTrace.Values.impl;

import activitydiagramTrace.ActivitydiagramTracePackage;
import activitydiagramTrace.State;

import activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage;
import activitydiagramTrace.Traced.activitydiagram.TracedInputValue;
import activitydiagramTrace.Traced.activitydiagram.TracedVariable;

import activitydiagramTrace.Values.InputValue_variable_Value;
import activitydiagramTrace.Values.ValuesPackage;

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
 * An implementation of the model object '<em><b>Input Value variable Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activitydiagramTrace.Values.impl.InputValue_variable_ValueImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link activitydiagramTrace.Values.impl.InputValue_variable_ValueImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link activitydiagramTrace.Values.impl.InputValue_variable_ValueImpl#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InputValue_variable_ValueImpl extends MinimalEObjectImpl.Container implements InputValue_variable_Value {
	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected TracedVariable variable;

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
	protected InputValue_variable_ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ValuesPackage.Literals.INPUT_VALUE_VARIABLE_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedVariable getVariable() {
		if (variable != null && variable.eIsProxy()) {
			InternalEObject oldVariable = (InternalEObject)variable;
			variable = (TracedVariable)eResolveProxy(oldVariable);
			if (variable != oldVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ValuesPackage.INPUT_VALUE_VARIABLE_VALUE__VARIABLE, oldVariable, variable));
			}
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedVariable basicGetVariable() {
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(TracedVariable newVariable) {
		TracedVariable oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.INPUT_VALUE_VARIABLE_VALUE__VARIABLE, oldVariable, variable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedInputValue getParent() {
		if (eContainerFeatureID() != ValuesPackage.INPUT_VALUE_VARIABLE_VALUE__PARENT) return null;
		return (TracedInputValue)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(TracedInputValue newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, ValuesPackage.INPUT_VALUE_VARIABLE_VALUE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(TracedInputValue newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != ValuesPackage.INPUT_VALUE_VARIABLE_VALUE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, ActivitydiagramPackage.TRACED_INPUT_VALUE__VARIABLE_TRACE, TracedInputValue.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.INPUT_VALUE_VARIABLE_VALUE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectWithInverseResolvingEList.ManyInverse<State>(State.class, this, ValuesPackage.INPUT_VALUE_VARIABLE_VALUE__STATES, ActivitydiagramTracePackage.STATE__INPUT_VALUE_VARIABLE_VALUES);
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
			case ValuesPackage.INPUT_VALUE_VARIABLE_VALUE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((TracedInputValue)otherEnd, msgs);
			case ValuesPackage.INPUT_VALUE_VARIABLE_VALUE__STATES:
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
			case ValuesPackage.INPUT_VALUE_VARIABLE_VALUE__PARENT:
				return basicSetParent(null, msgs);
			case ValuesPackage.INPUT_VALUE_VARIABLE_VALUE__STATES:
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
			case ValuesPackage.INPUT_VALUE_VARIABLE_VALUE__PARENT:
				return eInternalContainer().eInverseRemove(this, ActivitydiagramPackage.TRACED_INPUT_VALUE__VARIABLE_TRACE, TracedInputValue.class, msgs);
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
			case ValuesPackage.INPUT_VALUE_VARIABLE_VALUE__VARIABLE:
				if (resolve) return getVariable();
				return basicGetVariable();
			case ValuesPackage.INPUT_VALUE_VARIABLE_VALUE__PARENT:
				return getParent();
			case ValuesPackage.INPUT_VALUE_VARIABLE_VALUE__STATES:
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
			case ValuesPackage.INPUT_VALUE_VARIABLE_VALUE__VARIABLE:
				setVariable((TracedVariable)newValue);
				return;
			case ValuesPackage.INPUT_VALUE_VARIABLE_VALUE__PARENT:
				setParent((TracedInputValue)newValue);
				return;
			case ValuesPackage.INPUT_VALUE_VARIABLE_VALUE__STATES:
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
			case ValuesPackage.INPUT_VALUE_VARIABLE_VALUE__VARIABLE:
				setVariable((TracedVariable)null);
				return;
			case ValuesPackage.INPUT_VALUE_VARIABLE_VALUE__PARENT:
				setParent((TracedInputValue)null);
				return;
			case ValuesPackage.INPUT_VALUE_VARIABLE_VALUE__STATES:
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
			case ValuesPackage.INPUT_VALUE_VARIABLE_VALUE__VARIABLE:
				return variable != null;
			case ValuesPackage.INPUT_VALUE_VARIABLE_VALUE__PARENT:
				return getParent() != null;
			case ValuesPackage.INPUT_VALUE_VARIABLE_VALUE__STATES:
				return states != null && !states.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InputValue_variable_ValueImpl
