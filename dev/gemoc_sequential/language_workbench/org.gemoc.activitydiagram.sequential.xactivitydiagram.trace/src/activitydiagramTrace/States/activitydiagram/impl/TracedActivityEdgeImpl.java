/**
 */
package activitydiagramTrace.States.activitydiagram.impl;

import activitydiagramTrace.States.ActivityEdge_offers_Dimension;
import activitydiagramTrace.States.SpecificDimension;

import activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage;
import activitydiagramTrace.States.activitydiagram.TracedActivityEdge;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Activity Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedActivityEdgeImpl#getActivityEdge_offers_Dimension <em>Activity Edge offers Dimension</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TracedActivityEdgeImpl extends TracedNamedElementImpl implements TracedActivityEdge {
	/**
	 * The cached value of the '{@link #getActivityEdge_offers_Dimension() <em>Activity Edge offers Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityEdge_offers_Dimension()
	 * @generated
	 * @ordered
	 */
	protected ActivityEdge_offers_Dimension activityEdge_offers_Dimension;

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
	public ActivityEdge_offers_Dimension getActivityEdge_offers_Dimension() {
		return activityEdge_offers_Dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivityEdge_offers_Dimension(ActivityEdge_offers_Dimension newActivityEdge_offers_Dimension, NotificationChain msgs) {
		ActivityEdge_offers_Dimension oldActivityEdge_offers_Dimension = activityEdge_offers_Dimension;
		activityEdge_offers_Dimension = newActivityEdge_offers_Dimension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__ACTIVITY_EDGE_OFFERS_DIMENSION, oldActivityEdge_offers_Dimension, newActivityEdge_offers_Dimension);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivityEdge_offers_Dimension(ActivityEdge_offers_Dimension newActivityEdge_offers_Dimension) {
		if (newActivityEdge_offers_Dimension != activityEdge_offers_Dimension) {
			NotificationChain msgs = null;
			if (activityEdge_offers_Dimension != null)
				msgs = ((InternalEObject)activityEdge_offers_Dimension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__ACTIVITY_EDGE_OFFERS_DIMENSION, null, msgs);
			if (newActivityEdge_offers_Dimension != null)
				msgs = ((InternalEObject)newActivityEdge_offers_Dimension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__ACTIVITY_EDGE_OFFERS_DIMENSION, null, msgs);
			msgs = basicSetActivityEdge_offers_Dimension(newActivityEdge_offers_Dimension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__ACTIVITY_EDGE_OFFERS_DIMENSION, newActivityEdge_offers_Dimension, newActivityEdge_offers_Dimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecificDimension<?>> getDimensionsInternal() {
		final EList<SpecificDimension<?>> result = new org.eclipse.emf.ecore.util.BasicInternalEList<SpecificDimension<?>>(Object.class);
		result.addAll(super.getDimensionsInternal());
		result.add(getActivityEdge_offers_Dimension());
		return result;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__ACTIVITY_EDGE_OFFERS_DIMENSION:
				return basicSetActivityEdge_offers_Dimension(null, msgs);
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
			case ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__ACTIVITY_EDGE_OFFERS_DIMENSION:
				return getActivityEdge_offers_Dimension();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__ACTIVITY_EDGE_OFFERS_DIMENSION:
				setActivityEdge_offers_Dimension((ActivityEdge_offers_Dimension)newValue);
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
			case ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__ACTIVITY_EDGE_OFFERS_DIMENSION:
				setActivityEdge_offers_Dimension((ActivityEdge_offers_Dimension)null);
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
			case ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__ACTIVITY_EDGE_OFFERS_DIMENSION:
				return activityEdge_offers_Dimension != null;
		}
		return super.eIsSet(featureID);
	}

} //TracedActivityEdgeImpl
