/**
 */
package activitydiagramTrace.Steps.impl;

import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute;
import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute_AbstractSubEvent;
import activitydiagramTrace.Steps.StepsPackage;

import activitydiagramTrace.Traced.activitydiagram.TracedActivityNode;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activitydiagram Activity Node Execute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_ExecuteImpl#getThis <em>This</em>}</li>
 *   <li>{@link activitydiagramTrace.Steps.impl.Activitydiagram_ActivityNode_ExecuteImpl#getSubSteps <em>Sub Steps</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Activitydiagram_ActivityNode_ExecuteImpl extends BigStepImpl implements Activitydiagram_ActivityNode_Execute {
	/**
	 * The cached value of the '{@link #getThis() <em>This</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThis()
	 * @generated
	 * @ordered
	 */
	protected TracedActivityNode this_;

	/**
	 * The cached value of the '{@link #getSubSteps() <em>Sub Steps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<Activitydiagram_ActivityNode_Execute_AbstractSubEvent> subSteps;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Activitydiagram_ActivityNode_ExecuteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StepsPackage.Literals.ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedActivityNode getThis() {
		if (this_ != null && this_.eIsProxy()) {
			InternalEObject oldThis = (InternalEObject)this_;
			this_ = (TracedActivityNode)eResolveProxy(oldThis);
			if (this_ != oldThis) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE__THIS, oldThis, this_));
			}
		}
		return this_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedActivityNode basicGetThis() {
		return this_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThis(TracedActivityNode newThis) {
		TracedActivityNode oldThis = this_;
		this_ = newThis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE__THIS, oldThis, this_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activitydiagram_ActivityNode_Execute_AbstractSubEvent> getSubSteps() {
		if (subSteps == null) {
			subSteps = new EObjectResolvingEList<Activitydiagram_ActivityNode_Execute_AbstractSubEvent>(Activitydiagram_ActivityNode_Execute_AbstractSubEvent.class, this, StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE__SUB_STEPS);
		}
		return subSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE__THIS:
				if (resolve) return getThis();
				return basicGetThis();
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE__SUB_STEPS:
				return getSubSteps();
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
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE__THIS:
				setThis((TracedActivityNode)newValue);
				return;
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE__SUB_STEPS:
				getSubSteps().clear();
				getSubSteps().addAll((Collection<? extends Activitydiagram_ActivityNode_Execute_AbstractSubEvent>)newValue);
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
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE__THIS:
				setThis((TracedActivityNode)null);
				return;
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE__SUB_STEPS:
				getSubSteps().clear();
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
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE__THIS:
				return this_ != null;
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_EXECUTE__SUB_STEPS:
				return subSteps != null && !subSteps.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Activitydiagram_ActivityNode_ExecuteImpl
