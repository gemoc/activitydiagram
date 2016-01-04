/**
 */
package activitydiagramTrace.States.activitydiagram.impl;

import activitydiagramTrace.States.ActivityEdge_offers_Value;
import activitydiagramTrace.States.ActivityEdge_source_Value;
import activitydiagramTrace.States.ActivityEdge_target_Value;
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
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedActivityEdgeImpl#getTargetSequence <em>Target Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedActivityEdgeImpl#getOffersSequence <em>Offers Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedActivityEdgeImpl#getSourceSequence <em>Source Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TracedActivityEdgeImpl extends TracedNamedElementImpl implements TracedActivityEdge {
	/**
	 * The cached value of the '{@link #getTargetSequence() <em>Target Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdge_target_Value> targetSequence;

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
	 * The cached value of the '{@link #getSourceSequence() <em>Source Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdge_source_Value> sourceSequence;

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
	public EList<ActivityEdge_target_Value> getTargetSequence() {
		if (targetSequence == null) {
			targetSequence = new EObjectContainmentWithInverseEList<ActivityEdge_target_Value>(ActivityEdge_target_Value.class, this, ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__TARGET_SEQUENCE, StatesPackage.ACTIVITY_EDGE_TARGET_VALUE__PARENT);
		}
		return targetSequence;
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
	public EList<ActivityEdge_source_Value> getSourceSequence() {
		if (sourceSequence == null) {
			sourceSequence = new EObjectContainmentWithInverseEList<ActivityEdge_source_Value>(ActivityEdge_source_Value.class, this, ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__SOURCE_SEQUENCE, StatesPackage.ACTIVITY_EDGE_SOURCE_VALUE__PARENT);
		}
		return sourceSequence;
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
			case ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__TARGET_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTargetSequence()).basicAdd(otherEnd, msgs);
			case ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__OFFERS_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOffersSequence()).basicAdd(otherEnd, msgs);
			case ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__SOURCE_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSourceSequence()).basicAdd(otherEnd, msgs);
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
			case ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__TARGET_SEQUENCE:
				return ((InternalEList<?>)getTargetSequence()).basicRemove(otherEnd, msgs);
			case ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__OFFERS_SEQUENCE:
				return ((InternalEList<?>)getOffersSequence()).basicRemove(otherEnd, msgs);
			case ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__SOURCE_SEQUENCE:
				return ((InternalEList<?>)getSourceSequence()).basicRemove(otherEnd, msgs);
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
			case ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__TARGET_SEQUENCE:
				return getTargetSequence();
			case ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__OFFERS_SEQUENCE:
				return getOffersSequence();
			case ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__SOURCE_SEQUENCE:
				return getSourceSequence();
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
			case ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__TARGET_SEQUENCE:
				getTargetSequence().clear();
				getTargetSequence().addAll((Collection<? extends ActivityEdge_target_Value>)newValue);
				return;
			case ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__OFFERS_SEQUENCE:
				getOffersSequence().clear();
				getOffersSequence().addAll((Collection<? extends ActivityEdge_offers_Value>)newValue);
				return;
			case ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__SOURCE_SEQUENCE:
				getSourceSequence().clear();
				getSourceSequence().addAll((Collection<? extends ActivityEdge_source_Value>)newValue);
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
			case ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__TARGET_SEQUENCE:
				getTargetSequence().clear();
				return;
			case ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__OFFERS_SEQUENCE:
				getOffersSequence().clear();
				return;
			case ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__SOURCE_SEQUENCE:
				getSourceSequence().clear();
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
			case ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__TARGET_SEQUENCE:
				return targetSequence != null && !targetSequence.isEmpty();
			case ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__OFFERS_SEQUENCE:
				return offersSequence != null && !offersSequence.isEmpty();
			case ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__SOURCE_SEQUENCE:
				return sourceSequence != null && !sourceSequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracedActivityEdgeImpl
