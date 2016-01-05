/**
 */
package activitydiagramTrace.States.impl;

import activitydiagramTrace.States.BooleanBinaryExpression_operand2_Value;
import activitydiagramTrace.States.State;
import activitydiagramTrace.States.StatesPackage;

import activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage;
import activitydiagramTrace.States.activitydiagram.TracedBooleanBinaryExpression;
import activitydiagramTrace.States.activitydiagram.TracedBooleanVariable;

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
 * An implementation of the model object '<em><b>Boolean Binary Expression operand2 Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activitydiagramTrace.States.impl.BooleanBinaryExpression_operand2_ValueImpl#getOperand2 <em>Operand2</em>}</li>
 *   <li>{@link activitydiagramTrace.States.impl.BooleanBinaryExpression_operand2_ValueImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link activitydiagramTrace.States.impl.BooleanBinaryExpression_operand2_ValueImpl#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BooleanBinaryExpression_operand2_ValueImpl extends MinimalEObjectImpl.Container implements BooleanBinaryExpression_operand2_Value {
	/**
	 * The cached value of the '{@link #getOperand2() <em>Operand2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperand2()
	 * @generated
	 * @ordered
	 */
	protected TracedBooleanVariable operand2;

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
	protected BooleanBinaryExpression_operand2_ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.BOOLEAN_BINARY_EXPRESSION_OPERAND2_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedBooleanVariable getOperand2() {
		if (operand2 != null && operand2.eIsProxy()) {
			InternalEObject oldOperand2 = (InternalEObject)operand2;
			operand2 = (TracedBooleanVariable)eResolveProxy(oldOperand2);
			if (operand2 != oldOperand2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatesPackage.BOOLEAN_BINARY_EXPRESSION_OPERAND2_VALUE__OPERAND2, oldOperand2, operand2));
			}
		}
		return operand2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedBooleanVariable basicGetOperand2() {
		return operand2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperand2(TracedBooleanVariable newOperand2) {
		TracedBooleanVariable oldOperand2 = operand2;
		operand2 = newOperand2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.BOOLEAN_BINARY_EXPRESSION_OPERAND2_VALUE__OPERAND2, oldOperand2, operand2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedBooleanBinaryExpression getParent() {
		if (eContainerFeatureID() != StatesPackage.BOOLEAN_BINARY_EXPRESSION_OPERAND2_VALUE__PARENT) return null;
		return (TracedBooleanBinaryExpression)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(TracedBooleanBinaryExpression newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, StatesPackage.BOOLEAN_BINARY_EXPRESSION_OPERAND2_VALUE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(TracedBooleanBinaryExpression newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != StatesPackage.BOOLEAN_BINARY_EXPRESSION_OPERAND2_VALUE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, ActivitydiagramPackage.TRACED_BOOLEAN_BINARY_EXPRESSION__OPERAND2_SEQUENCE, TracedBooleanBinaryExpression.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.BOOLEAN_BINARY_EXPRESSION_OPERAND2_VALUE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectWithInverseResolvingEList.ManyInverse<State>(State.class, this, StatesPackage.BOOLEAN_BINARY_EXPRESSION_OPERAND2_VALUE__STATES, StatesPackage.STATE__BOOLEAN_BINARY_EXPRESSION_OPERAND2_VALUES);
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
			case StatesPackage.BOOLEAN_BINARY_EXPRESSION_OPERAND2_VALUE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((TracedBooleanBinaryExpression)otherEnd, msgs);
			case StatesPackage.BOOLEAN_BINARY_EXPRESSION_OPERAND2_VALUE__STATES:
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
			case StatesPackage.BOOLEAN_BINARY_EXPRESSION_OPERAND2_VALUE__PARENT:
				return basicSetParent(null, msgs);
			case StatesPackage.BOOLEAN_BINARY_EXPRESSION_OPERAND2_VALUE__STATES:
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
			case StatesPackage.BOOLEAN_BINARY_EXPRESSION_OPERAND2_VALUE__PARENT:
				return eInternalContainer().eInverseRemove(this, ActivitydiagramPackage.TRACED_BOOLEAN_BINARY_EXPRESSION__OPERAND2_SEQUENCE, TracedBooleanBinaryExpression.class, msgs);
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
			case StatesPackage.BOOLEAN_BINARY_EXPRESSION_OPERAND2_VALUE__OPERAND2:
				if (resolve) return getOperand2();
				return basicGetOperand2();
			case StatesPackage.BOOLEAN_BINARY_EXPRESSION_OPERAND2_VALUE__PARENT:
				return getParent();
			case StatesPackage.BOOLEAN_BINARY_EXPRESSION_OPERAND2_VALUE__STATES:
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
			case StatesPackage.BOOLEAN_BINARY_EXPRESSION_OPERAND2_VALUE__OPERAND2:
				setOperand2((TracedBooleanVariable)newValue);
				return;
			case StatesPackage.BOOLEAN_BINARY_EXPRESSION_OPERAND2_VALUE__PARENT:
				setParent((TracedBooleanBinaryExpression)newValue);
				return;
			case StatesPackage.BOOLEAN_BINARY_EXPRESSION_OPERAND2_VALUE__STATES:
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
			case StatesPackage.BOOLEAN_BINARY_EXPRESSION_OPERAND2_VALUE__OPERAND2:
				setOperand2((TracedBooleanVariable)null);
				return;
			case StatesPackage.BOOLEAN_BINARY_EXPRESSION_OPERAND2_VALUE__PARENT:
				setParent((TracedBooleanBinaryExpression)null);
				return;
			case StatesPackage.BOOLEAN_BINARY_EXPRESSION_OPERAND2_VALUE__STATES:
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
			case StatesPackage.BOOLEAN_BINARY_EXPRESSION_OPERAND2_VALUE__OPERAND2:
				return operand2 != null;
			case StatesPackage.BOOLEAN_BINARY_EXPRESSION_OPERAND2_VALUE__PARENT:
				return getParent() != null;
			case StatesPackage.BOOLEAN_BINARY_EXPRESSION_OPERAND2_VALUE__STATES:
				return states != null && !states.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BooleanBinaryExpression_operand2_ValueImpl