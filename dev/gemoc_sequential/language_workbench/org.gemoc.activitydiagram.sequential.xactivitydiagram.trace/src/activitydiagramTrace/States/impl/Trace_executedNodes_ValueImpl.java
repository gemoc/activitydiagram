/**
 */
package activitydiagramTrace.States.impl;

import activitydiagramTrace.States.StatesPackage;
import activitydiagramTrace.States.Trace_executedNodes_Value;

import activitydiagramTrace.States.activitydiagram.TracedActivityNode;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trace executed Nodes Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link activitydiagramTrace.States.impl.Trace_executedNodes_ValueImpl#getExecutedNodes <em>Executed Nodes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Trace_executedNodes_ValueImpl extends SpecificValueImpl implements Trace_executedNodes_Value {
	/**
	 * The cached value of the '{@link #getExecutedNodes() <em>Executed Nodes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutedNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedActivityNode> executedNodes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Trace_executedNodes_ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.TRACE_EXECUTED_NODES_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedActivityNode> getExecutedNodes() {
		if (executedNodes == null) {
			executedNodes = new EObjectResolvingEList<TracedActivityNode>(TracedActivityNode.class, this, StatesPackage.TRACE_EXECUTED_NODES_VALUE__EXECUTED_NODES);
		}
		return executedNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StatesPackage.TRACE_EXECUTED_NODES_VALUE__EXECUTED_NODES:
				return getExecutedNodes();
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
			case StatesPackage.TRACE_EXECUTED_NODES_VALUE__EXECUTED_NODES:
				getExecutedNodes().clear();
				getExecutedNodes().addAll((Collection<? extends TracedActivityNode>)newValue);
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
			case StatesPackage.TRACE_EXECUTED_NODES_VALUE__EXECUTED_NODES:
				getExecutedNodes().clear();
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
			case StatesPackage.TRACE_EXECUTED_NODES_VALUE__EXECUTED_NODES:
				return executedNodes != null && !executedNodes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Trace_executedNodes_ValueImpl
