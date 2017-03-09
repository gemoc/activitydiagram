/**
 */
package activitydiagramTrace.States.activitydiagram.impl;

import activitydiagramTrace.States.SpecificDimension;
import activitydiagramTrace.States.Trace_executedNodes_Dimension;

import activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage;
import activitydiagramTrace.States.activitydiagram.TracedTrace;

import activitydiagramTrace.States.impl.SpecificTracedObjectImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.impl.TracedTraceImpl#getTrace_executedNodes_Dimension <em>Trace executed Nodes Dimension</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TracedTraceImpl extends SpecificTracedObjectImpl<SpecificDimension<?>> implements TracedTrace {
	/**
	 * The cached value of the '{@link #getTrace_executedNodes_Dimension() <em>Trace executed Nodes Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrace_executedNodes_Dimension()
	 * @generated
	 * @ordered
	 */
	protected Trace_executedNodes_Dimension trace_executedNodes_Dimension;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedTraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitydiagramPackage.Literals.TRACED_TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trace_executedNodes_Dimension getTrace_executedNodes_Dimension() {
		return trace_executedNodes_Dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrace_executedNodes_Dimension(Trace_executedNodes_Dimension newTrace_executedNodes_Dimension, NotificationChain msgs) {
		Trace_executedNodes_Dimension oldTrace_executedNodes_Dimension = trace_executedNodes_Dimension;
		trace_executedNodes_Dimension = newTrace_executedNodes_Dimension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.TRACED_TRACE__TRACE_EXECUTED_NODES_DIMENSION, oldTrace_executedNodes_Dimension, newTrace_executedNodes_Dimension);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrace_executedNodes_Dimension(Trace_executedNodes_Dimension newTrace_executedNodes_Dimension) {
		if (newTrace_executedNodes_Dimension != trace_executedNodes_Dimension) {
			NotificationChain msgs = null;
			if (trace_executedNodes_Dimension != null)
				msgs = ((InternalEObject)trace_executedNodes_Dimension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActivitydiagramPackage.TRACED_TRACE__TRACE_EXECUTED_NODES_DIMENSION, null, msgs);
			if (newTrace_executedNodes_Dimension != null)
				msgs = ((InternalEObject)newTrace_executedNodes_Dimension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActivitydiagramPackage.TRACED_TRACE__TRACE_EXECUTED_NODES_DIMENSION, null, msgs);
			msgs = basicSetTrace_executedNodes_Dimension(newTrace_executedNodes_Dimension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.TRACED_TRACE__TRACE_EXECUTED_NODES_DIMENSION, newTrace_executedNodes_Dimension, newTrace_executedNodes_Dimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecificDimension<?>> getDimensionsInternal() {
		final EList<SpecificDimension<?>> result = new org.eclipse.emf.ecore.util.BasicInternalEList<SpecificDimension<?>>(Object.class);
		result.addAll(super.getDimensionsInternal());
		result.add(getTrace_executedNodes_Dimension());
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
			case ActivitydiagramPackage.TRACED_TRACE__TRACE_EXECUTED_NODES_DIMENSION:
				return basicSetTrace_executedNodes_Dimension(null, msgs);
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
			case ActivitydiagramPackage.TRACED_TRACE__TRACE_EXECUTED_NODES_DIMENSION:
				return getTrace_executedNodes_Dimension();
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
			case ActivitydiagramPackage.TRACED_TRACE__TRACE_EXECUTED_NODES_DIMENSION:
				setTrace_executedNodes_Dimension((Trace_executedNodes_Dimension)newValue);
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
			case ActivitydiagramPackage.TRACED_TRACE__TRACE_EXECUTED_NODES_DIMENSION:
				setTrace_executedNodes_Dimension((Trace_executedNodes_Dimension)null);
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
			case ActivitydiagramPackage.TRACED_TRACE__TRACE_EXECUTED_NODES_DIMENSION:
				return trace_executedNodes_Dimension != null;
		}
		return super.eIsSet(featureID);
	}

} //TracedTraceImpl
