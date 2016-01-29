/**
 */
package activitydiagramTrace.States.activitydiagram.impl;

import activitydiagram.Offer;

import activitydiagramTrace.States.ActivityEdge_offers_Value;
import activitydiagramTrace.States.StatesPackage;

import activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage;
import activitydiagramTrace.States.activitydiagram.TracedActivityEdge;
import activitydiagramTrace.States.activitydiagram.TracedActivityNode;

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
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedActivityEdgeImpl#getOffers <em>Offers</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedActivityEdgeImpl#getOffersSequence <em>Offers Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedActivityEdgeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedActivityEdgeImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TracedActivityEdgeImpl extends TracedNamedElementImpl implements TracedActivityEdge {
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
	 * The cached value of the '{@link #getOffersSequence() <em>Offers Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffersSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdge_offers_Value> offersSequence;

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
			case ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__OFFERS:
				return getOffers();
			case ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__OFFERS_SEQUENCE:
				return getOffersSequence();
			case ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
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
			case ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__OFFERS:
				getOffers().clear();
				getOffers().addAll((Collection<? extends Offer>)newValue);
				return;
			case ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__OFFERS_SEQUENCE:
				getOffersSequence().clear();
				getOffersSequence().addAll((Collection<? extends ActivityEdge_offers_Value>)newValue);
				return;
			case ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__SOURCE:
				setSource((TracedActivityNode)newValue);
				return;
			case ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__TARGET:
				setTarget((TracedActivityNode)newValue);
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
			case ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__OFFERS:
				getOffers().clear();
				return;
			case ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__OFFERS_SEQUENCE:
				getOffersSequence().clear();
				return;
			case ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__SOURCE:
				setSource((TracedActivityNode)null);
				return;
			case ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__TARGET:
				setTarget((TracedActivityNode)null);
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
			case ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__OFFERS:
				return offers != null && !offers.isEmpty();
			case ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__OFFERS_SEQUENCE:
				return offersSequence != null && !offersSequence.isEmpty();
			case ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__SOURCE:
				return source != null;
			case ActivitydiagramPackage.TRACED_ACTIVITY_EDGE__TARGET:
				return target != null;
		}
		return super.eIsSet(featureID);
	}

} //TracedActivityEdgeImpl
