/**
 */
package activitydiagramTrace.States.impl;

import activitydiagramTrace.States.IntegerComparisonExpression_assignee_Value;
import activitydiagramTrace.States.State;
import activitydiagramTrace.States.StatesPackage;

import activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage;
import activitydiagramTrace.States.activitydiagram.TracedBooleanVariable;
import activitydiagramTrace.States.activitydiagram.TracedIntegerComparisonExpression;

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
 * An implementation of the model object '<em><b>Integer Comparison Expression assignee Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activitydiagramTrace.States.impl.IntegerComparisonExpression_assignee_ValueImpl#getAssignee <em>Assignee</em>}</li>
 *   <li>{@link activitydiagramTrace.States.impl.IntegerComparisonExpression_assignee_ValueImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link activitydiagramTrace.States.impl.IntegerComparisonExpression_assignee_ValueImpl#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntegerComparisonExpression_assignee_ValueImpl extends MinimalEObjectImpl.Container implements IntegerComparisonExpression_assignee_Value {
	/**
	 * The cached value of the '{@link #getAssignee() <em>Assignee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignee()
	 * @generated
	 * @ordered
	 */
	protected TracedBooleanVariable assignee;

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
	protected IntegerComparisonExpression_assignee_ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.INTEGER_COMPARISON_EXPRESSION_ASSIGNEE_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedBooleanVariable getAssignee() {
		if (assignee != null && assignee.eIsProxy()) {
			InternalEObject oldAssignee = (InternalEObject)assignee;
			assignee = (TracedBooleanVariable)eResolveProxy(oldAssignee);
			if (assignee != oldAssignee) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatesPackage.INTEGER_COMPARISON_EXPRESSION_ASSIGNEE_VALUE__ASSIGNEE, oldAssignee, assignee));
			}
		}
		return assignee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedBooleanVariable basicGetAssignee() {
		return assignee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignee(TracedBooleanVariable newAssignee) {
		TracedBooleanVariable oldAssignee = assignee;
		assignee = newAssignee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.INTEGER_COMPARISON_EXPRESSION_ASSIGNEE_VALUE__ASSIGNEE, oldAssignee, assignee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedIntegerComparisonExpression getParent() {
		if (eContainerFeatureID() != StatesPackage.INTEGER_COMPARISON_EXPRESSION_ASSIGNEE_VALUE__PARENT) return null;
		return (TracedIntegerComparisonExpression)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(TracedIntegerComparisonExpression newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, StatesPackage.INTEGER_COMPARISON_EXPRESSION_ASSIGNEE_VALUE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(TracedIntegerComparisonExpression newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != StatesPackage.INTEGER_COMPARISON_EXPRESSION_ASSIGNEE_VALUE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, ActivitydiagramPackage.TRACED_INTEGER_COMPARISON_EXPRESSION__ASSIGNEE_SEQUENCE, TracedIntegerComparisonExpression.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.INTEGER_COMPARISON_EXPRESSION_ASSIGNEE_VALUE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectWithInverseResolvingEList.ManyInverse<State>(State.class, this, StatesPackage.INTEGER_COMPARISON_EXPRESSION_ASSIGNEE_VALUE__STATES, StatesPackage.STATE__INTEGER_COMPARISON_EXPRESSION_ASSIGNEE_VALUES);
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
			case StatesPackage.INTEGER_COMPARISON_EXPRESSION_ASSIGNEE_VALUE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((TracedIntegerComparisonExpression)otherEnd, msgs);
			case StatesPackage.INTEGER_COMPARISON_EXPRESSION_ASSIGNEE_VALUE__STATES:
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
			case StatesPackage.INTEGER_COMPARISON_EXPRESSION_ASSIGNEE_VALUE__PARENT:
				return basicSetParent(null, msgs);
			case StatesPackage.INTEGER_COMPARISON_EXPRESSION_ASSIGNEE_VALUE__STATES:
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
			case StatesPackage.INTEGER_COMPARISON_EXPRESSION_ASSIGNEE_VALUE__PARENT:
				return eInternalContainer().eInverseRemove(this, ActivitydiagramPackage.TRACED_INTEGER_COMPARISON_EXPRESSION__ASSIGNEE_SEQUENCE, TracedIntegerComparisonExpression.class, msgs);
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
			case StatesPackage.INTEGER_COMPARISON_EXPRESSION_ASSIGNEE_VALUE__ASSIGNEE:
				if (resolve) return getAssignee();
				return basicGetAssignee();
			case StatesPackage.INTEGER_COMPARISON_EXPRESSION_ASSIGNEE_VALUE__PARENT:
				return getParent();
			case StatesPackage.INTEGER_COMPARISON_EXPRESSION_ASSIGNEE_VALUE__STATES:
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
			case StatesPackage.INTEGER_COMPARISON_EXPRESSION_ASSIGNEE_VALUE__ASSIGNEE:
				setAssignee((TracedBooleanVariable)newValue);
				return;
			case StatesPackage.INTEGER_COMPARISON_EXPRESSION_ASSIGNEE_VALUE__PARENT:
				setParent((TracedIntegerComparisonExpression)newValue);
				return;
			case StatesPackage.INTEGER_COMPARISON_EXPRESSION_ASSIGNEE_VALUE__STATES:
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
			case StatesPackage.INTEGER_COMPARISON_EXPRESSION_ASSIGNEE_VALUE__ASSIGNEE:
				setAssignee((TracedBooleanVariable)null);
				return;
			case StatesPackage.INTEGER_COMPARISON_EXPRESSION_ASSIGNEE_VALUE__PARENT:
				setParent((TracedIntegerComparisonExpression)null);
				return;
			case StatesPackage.INTEGER_COMPARISON_EXPRESSION_ASSIGNEE_VALUE__STATES:
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
			case StatesPackage.INTEGER_COMPARISON_EXPRESSION_ASSIGNEE_VALUE__ASSIGNEE:
				return assignee != null;
			case StatesPackage.INTEGER_COMPARISON_EXPRESSION_ASSIGNEE_VALUE__PARENT:
				return getParent() != null;
			case StatesPackage.INTEGER_COMPARISON_EXPRESSION_ASSIGNEE_VALUE__STATES:
				return states != null && !states.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IntegerComparisonExpression_assignee_ValueImpl
