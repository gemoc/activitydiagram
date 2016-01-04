/**
 */
package activitydiagramTrace.States.impl;

import activitydiagramTrace.States.BooleanUnaryExpression_operand_Value;
import activitydiagramTrace.States.State;
import activitydiagramTrace.States.StatesPackage;

import activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage;
import activitydiagramTrace.States.activitydiagram.TracedBooleanUnaryExpression;
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
 * An implementation of the model object '<em><b>Boolean Unary Expression operand Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activitydiagramTrace.States.impl.BooleanUnaryExpression_operand_ValueImpl#getOperand <em>Operand</em>}</li>
 *   <li>{@link activitydiagramTrace.States.impl.BooleanUnaryExpression_operand_ValueImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link activitydiagramTrace.States.impl.BooleanUnaryExpression_operand_ValueImpl#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BooleanUnaryExpression_operand_ValueImpl extends MinimalEObjectImpl.Container implements BooleanUnaryExpression_operand_Value {
	/**
	 * The cached value of the '{@link #getOperand() <em>Operand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperand()
	 * @generated
	 * @ordered
	 */
	protected TracedBooleanVariable operand;

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
	protected BooleanUnaryExpression_operand_ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.BOOLEAN_UNARY_EXPRESSION_OPERAND_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedBooleanVariable getOperand() {
		if (operand != null && operand.eIsProxy()) {
			InternalEObject oldOperand = (InternalEObject)operand;
			operand = (TracedBooleanVariable)eResolveProxy(oldOperand);
			if (operand != oldOperand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatesPackage.BOOLEAN_UNARY_EXPRESSION_OPERAND_VALUE__OPERAND, oldOperand, operand));
			}
		}
		return operand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedBooleanVariable basicGetOperand() {
		return operand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperand(TracedBooleanVariable newOperand) {
		TracedBooleanVariable oldOperand = operand;
		operand = newOperand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.BOOLEAN_UNARY_EXPRESSION_OPERAND_VALUE__OPERAND, oldOperand, operand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedBooleanUnaryExpression getParent() {
		if (eContainerFeatureID() != StatesPackage.BOOLEAN_UNARY_EXPRESSION_OPERAND_VALUE__PARENT) return null;
		return (TracedBooleanUnaryExpression)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(TracedBooleanUnaryExpression newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, StatesPackage.BOOLEAN_UNARY_EXPRESSION_OPERAND_VALUE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(TracedBooleanUnaryExpression newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != StatesPackage.BOOLEAN_UNARY_EXPRESSION_OPERAND_VALUE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, ActivitydiagramPackage.TRACED_BOOLEAN_UNARY_EXPRESSION__OPERAND_SEQUENCE, TracedBooleanUnaryExpression.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.BOOLEAN_UNARY_EXPRESSION_OPERAND_VALUE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectWithInverseResolvingEList.ManyInverse<State>(State.class, this, StatesPackage.BOOLEAN_UNARY_EXPRESSION_OPERAND_VALUE__STATES, StatesPackage.STATE__BOOLEAN_UNARY_EXPRESSION_OPERAND_VALUES);
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
			case StatesPackage.BOOLEAN_UNARY_EXPRESSION_OPERAND_VALUE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((TracedBooleanUnaryExpression)otherEnd, msgs);
			case StatesPackage.BOOLEAN_UNARY_EXPRESSION_OPERAND_VALUE__STATES:
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
			case StatesPackage.BOOLEAN_UNARY_EXPRESSION_OPERAND_VALUE__PARENT:
				return basicSetParent(null, msgs);
			case StatesPackage.BOOLEAN_UNARY_EXPRESSION_OPERAND_VALUE__STATES:
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
			case StatesPackage.BOOLEAN_UNARY_EXPRESSION_OPERAND_VALUE__PARENT:
				return eInternalContainer().eInverseRemove(this, ActivitydiagramPackage.TRACED_BOOLEAN_UNARY_EXPRESSION__OPERAND_SEQUENCE, TracedBooleanUnaryExpression.class, msgs);
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
			case StatesPackage.BOOLEAN_UNARY_EXPRESSION_OPERAND_VALUE__OPERAND:
				if (resolve) return getOperand();
				return basicGetOperand();
			case StatesPackage.BOOLEAN_UNARY_EXPRESSION_OPERAND_VALUE__PARENT:
				return getParent();
			case StatesPackage.BOOLEAN_UNARY_EXPRESSION_OPERAND_VALUE__STATES:
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
			case StatesPackage.BOOLEAN_UNARY_EXPRESSION_OPERAND_VALUE__OPERAND:
				setOperand((TracedBooleanVariable)newValue);
				return;
			case StatesPackage.BOOLEAN_UNARY_EXPRESSION_OPERAND_VALUE__PARENT:
				setParent((TracedBooleanUnaryExpression)newValue);
				return;
			case StatesPackage.BOOLEAN_UNARY_EXPRESSION_OPERAND_VALUE__STATES:
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
			case StatesPackage.BOOLEAN_UNARY_EXPRESSION_OPERAND_VALUE__OPERAND:
				setOperand((TracedBooleanVariable)null);
				return;
			case StatesPackage.BOOLEAN_UNARY_EXPRESSION_OPERAND_VALUE__PARENT:
				setParent((TracedBooleanUnaryExpression)null);
				return;
			case StatesPackage.BOOLEAN_UNARY_EXPRESSION_OPERAND_VALUE__STATES:
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
			case StatesPackage.BOOLEAN_UNARY_EXPRESSION_OPERAND_VALUE__OPERAND:
				return operand != null;
			case StatesPackage.BOOLEAN_UNARY_EXPRESSION_OPERAND_VALUE__PARENT:
				return getParent() != null;
			case StatesPackage.BOOLEAN_UNARY_EXPRESSION_OPERAND_VALUE__STATES:
				return states != null && !states.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BooleanUnaryExpression_operand_ValueImpl
