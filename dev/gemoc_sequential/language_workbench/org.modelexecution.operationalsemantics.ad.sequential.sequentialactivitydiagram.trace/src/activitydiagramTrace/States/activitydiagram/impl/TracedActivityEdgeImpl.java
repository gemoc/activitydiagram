/**
 */
package activitydiagramTrace.States.activitydiagram.impl;

import activitydiagramTrace.States.ActivityEdge_offers_Value;
import activitydiagramTrace.States.StatesPackage;

import activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage;
import activitydiagramTrace.States.activitydiagram.TracedActivityEdge;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Activity Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedActivityEdgeImpl#getOffersSequence <em>Offers Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TracedActivityEdgeImpl extends TracedNamedElementImpl implements TracedActivityEdge {
	/**
	 * The cached value of the '{@link #getOffersSequence() <em>Offers Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffersSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdge_offers_Value> offersSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedActivityEdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitydiagramPackage.Literals.TRACED_ACTIVITY_EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge_offers_Value> getOffersSequence() {
		if (offersSequence == null) {
			offersSequence = new EObjectContainmentWithInverseEList<ActivityEdge_offers_Value>(ActivityEdge_offers_Value.class, this, ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__OFFERS_SEQUENCE, StatesPackage.ACTIVITY_EDGE_OFFERS_VALUE__PARENT);
		}
		return offersSequence;
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
			case ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__OFFERS_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOffersSequence()).basicAdd(otherEnd, msgs);
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
			case ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__OFFERS_SEQUENCE:
				return ((InternalEList<?>)getOffersSequence()).basicRemove(otherEnd, msgs);
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
			case ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__OFFERS_SEQUENCE:
				return getOffersSequence();
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
			case ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__OFFERS_SEQUENCE:
				getOffersSequence().clear();
				getOffersSequence().addAll((Collection<? extends ActivityEdge_offers_Value>)newValue);
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
			case ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__OFFERS_SEQUENCE:
				getOffersSequence().clear();
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
			case ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__OFFERS_SEQUENCE:
				return offersSequence != null && !offersSequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracedActivityEdgeImpl
