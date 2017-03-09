/**
 */
package activitydiagramTrace.States.activitydiagram.impl;

import activitydiagramTrace.States.ActivityNode_heldTokens_Dimension;
import activitydiagramTrace.States.SpecificDimension;

import activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage;
import activitydiagramTrace.States.activitydiagram.TracedActivityNode;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Activity Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedActivityNodeImpl#getActivityNode_heldTokens_Dimension <em>Activity Node held Tokens Dimension</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedActivityNodeImpl#getOriginalObject_ActivityNode <em>Original Object Activity Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TracedActivityNodeImpl extends TracedNamedElementImpl implements TracedActivityNode {
	/**
	 * The cached value of the '{@link #getActivityNode_heldTokens_Dimension() <em>Activity Node held Tokens Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityNode_heldTokens_Dimension()
	 * @generated
	 * @ordered
	 */
	protected ActivityNode_heldTokens_Dimension activityNode_heldTokens_Dimension;

	/**
	 * The cached value of the '{@link #getOriginalObject_ActivityNode() <em>Original Object Activity Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalObject_ActivityNode()
	 * @generated
	 * @ordered
	 */
	protected ActivityNode originalObject_ActivityNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedActivityNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitydiagramPackage.Literals.TRACED_ACTIVITY_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode_heldTokens_Dimension getActivityNode_heldTokens_Dimension() {
		return activityNode_heldTokens_Dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivityNode_heldTokens_Dimension(ActivityNode_heldTokens_Dimension newActivityNode_heldTokens_Dimension, NotificationChain msgs) {
		ActivityNode_heldTokens_Dimension oldActivityNode_heldTokens_Dimension = activityNode_heldTokens_Dimension;
		activityNode_heldTokens_Dimension = newActivityNode_heldTokens_Dimension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.TRACED_ACTIVITY_NODE__ACTIVITY_NODE_HELD_TOKENS_DIMENSION, oldActivityNode_heldTokens_Dimension, newActivityNode_heldTokens_Dimension);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivityNode_heldTokens_Dimension(ActivityNode_heldTokens_Dimension newActivityNode_heldTokens_Dimension) {
		if (newActivityNode_heldTokens_Dimension != activityNode_heldTokens_Dimension) {
			NotificationChain msgs = null;
			if (activityNode_heldTokens_Dimension != null)
				msgs = ((InternalEObject)activityNode_heldTokens_Dimension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActivitydiagramPackage.TRACED_ACTIVITY_NODE__ACTIVITY_NODE_HELD_TOKENS_DIMENSION, null, msgs);
			if (newActivityNode_heldTokens_Dimension != null)
				msgs = ((InternalEObject)newActivityNode_heldTokens_Dimension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActivitydiagramPackage.TRACED_ACTIVITY_NODE__ACTIVITY_NODE_HELD_TOKENS_DIMENSION, null, msgs);
			msgs = basicSetActivityNode_heldTokens_Dimension(newActivityNode_heldTokens_Dimension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.TRACED_ACTIVITY_NODE__ACTIVITY_NODE_HELD_TOKENS_DIMENSION, newActivityNode_heldTokens_Dimension, newActivityNode_heldTokens_Dimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode getOriginalObject_ActivityNode() {
		if (originalObject_ActivityNode != null && originalObject_ActivityNode.eIsProxy()) {
			InternalEObject oldOriginalObject_ActivityNode = (InternalEObject)originalObject_ActivityNode;
			originalObject_ActivityNode = (ActivityNode)eResolveProxy(oldOriginalObject_ActivityNode);
			if (originalObject_ActivityNode != oldOriginalObject_ActivityNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivitydiagramPackage.TRACED_ACTIVITY_NODE__ORIGINAL_OBJECT_ACTIVITY_NODE, oldOriginalObject_ActivityNode, originalObject_ActivityNode));
			}
		}
		return originalObject_ActivityNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode basicGetOriginalObject_ActivityNode() {
		return originalObject_ActivityNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalObject_ActivityNode(ActivityNode newOriginalObject_ActivityNode) {
		ActivityNode oldOriginalObject_ActivityNode = originalObject_ActivityNode;
		originalObject_ActivityNode = newOriginalObject_ActivityNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.TRACED_ACTIVITY_NODE__ORIGINAL_OBJECT_ACTIVITY_NODE, oldOriginalObject_ActivityNode, originalObject_ActivityNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecificDimension<?>> getDimensionsInternal() {
		final EList<SpecificDimension<?>> result = new org.eclipse.emf.ecore.util.BasicInternalEList<SpecificDimension<?>>(Object.class);
		result.addAll(super.getDimensionsInternal());
		result.add(getActivityNode_heldTokens_Dimension());
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
			case ActivitydiagramPackage.TRACED_ACTIVITY_NODE__ACTIVITY_NODE_HELD_TOKENS_DIMENSION:
				return basicSetActivityNode_heldTokens_Dimension(null, msgs);
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
			case ActivitydiagramPackage.TRACED_ACTIVITY_NODE__ACTIVITY_NODE_HELD_TOKENS_DIMENSION:
				return getActivityNode_heldTokens_Dimension();
			case ActivitydiagramPackage.TRACED_ACTIVITY_NODE__ORIGINAL_OBJECT_ACTIVITY_NODE:
				if (resolve) return getOriginalObject_ActivityNode();
				return basicGetOriginalObject_ActivityNode();
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
			case ActivitydiagramPackage.TRACED_ACTIVITY_NODE__ACTIVITY_NODE_HELD_TOKENS_DIMENSION:
				setActivityNode_heldTokens_Dimension((ActivityNode_heldTokens_Dimension)newValue);
				return;
			case ActivitydiagramPackage.TRACED_ACTIVITY_NODE__ORIGINAL_OBJECT_ACTIVITY_NODE:
				setOriginalObject_ActivityNode((ActivityNode)newValue);
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
			case ActivitydiagramPackage.TRACED_ACTIVITY_NODE__ACTIVITY_NODE_HELD_TOKENS_DIMENSION:
				setActivityNode_heldTokens_Dimension((ActivityNode_heldTokens_Dimension)null);
				return;
			case ActivitydiagramPackage.TRACED_ACTIVITY_NODE__ORIGINAL_OBJECT_ACTIVITY_NODE:
				setOriginalObject_ActivityNode((ActivityNode)null);
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
			case ActivitydiagramPackage.TRACED_ACTIVITY_NODE__ACTIVITY_NODE_HELD_TOKENS_DIMENSION:
				return activityNode_heldTokens_Dimension != null;
			case ActivitydiagramPackage.TRACED_ACTIVITY_NODE__ORIGINAL_OBJECT_ACTIVITY_NODE:
				return originalObject_ActivityNode != null;
		}
		return super.eIsSet(featureID);
	}

} //TracedActivityNodeImpl
