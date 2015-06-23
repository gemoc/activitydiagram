/**
 */
package activitydiagramTrace.Traced.activitydiagram.impl;

import activitydiagram.Offer;

import activitydiagramTrace.Traced.activitydiagram.ActivitydiagramPackage;
import activitydiagramTrace.Traced.activitydiagram.TracedActivityEdge;
import activitydiagramTrace.Traced.activitydiagram.TracedActivityNode;

import activitydiagramTrace.Values.ActivityEdge_offers_Value;
import activitydiagramTrace.Values.ValuesPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Activity Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedActivityEdgeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedActivityEdgeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedActivityEdgeImpl#getOffers <em>Offers</em>}</li>
 *   <li>{@link activitydiagramTrace.Traced.activitydiagram.impl.TracedActivityEdgeImpl#getOffersTrace <em>Offers Trace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TracedActivityEdgeImpl extends TracedNamedElementImpl implements TracedActivityEdge {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected TracedActivityNode source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected TracedActivityNode target;

	/**
	 * The cached value of the '{@link #getOffers() <em>Offers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffers()
	 * @generated
	 * @ordered
	 */
	protected EList<Offer> offers;

	/**
	 * The cached value of the '{@link #getOffersTrace() <em>Offers Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffersTrace()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdge_offers_Value> offersTrace;

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
	public TracedActivityNode getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (TracedActivityNode)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedActivityNode basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(TracedActivityNode newSource) {
		TracedActivityNode oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedActivityNode getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (TracedActivityNode)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedActivityNode basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(TracedActivityNode newTarget) {
		TracedActivityNode oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Offer> getOffers() {
		if (offers == null) {
			offers = new EObjectResolvingEList<Offer>(Offer.class, this, ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__OFFERS);
		}
		return offers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge_offers_Value> getOffersTrace() {
		if (offersTrace == null) {
			offersTrace = new EObjectContainmentWithInverseEList<ActivityEdge_offers_Value>(ActivityEdge_offers_Value.class, this, ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__OFFERS_TRACE, ValuesPackage.ACTIVITY_EDGE_OFFERS_VALUE__PARENT);
		}
		return offersTrace;
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
			case ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__OFFERS_TRACE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOffersTrace()).basicAdd(otherEnd, msgs);
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
			case ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__OFFERS_TRACE:
				return ((InternalEList<?>)getOffersTrace()).basicRemove(otherEnd, msgs);
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
			case ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__OFFERS:
				return getOffers();
			case ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__OFFERS_TRACE:
				return getOffersTrace();
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
			case ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__SOURCE:
				setSource((TracedActivityNode)newValue);
				return;
			case ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__TARGET:
				setTarget((TracedActivityNode)newValue);
				return;
			case ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__OFFERS:
				getOffers().clear();
				getOffers().addAll((Collection<? extends Offer>)newValue);
				return;
			case ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__OFFERS_TRACE:
				getOffersTrace().clear();
				getOffersTrace().addAll((Collection<? extends ActivityEdge_offers_Value>)newValue);
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
			case ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__SOURCE:
				setSource((TracedActivityNode)null);
				return;
			case ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__TARGET:
				setTarget((TracedActivityNode)null);
				return;
			case ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__OFFERS:
				getOffers().clear();
				return;
			case ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__OFFERS_TRACE:
				getOffersTrace().clear();
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
			case ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__SOURCE:
				return source != null;
			case ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__TARGET:
				return target != null;
			case ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__OFFERS:
				return offers != null && !offers.isEmpty();
			case ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__OFFERS_TRACE:
				return offersTrace != null && !offersTrace.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracedActivityEdgeImpl
