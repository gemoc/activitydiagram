/**
 */
package activitydiagramTrace.Steps.impl;

import activitydiagram.ActivityNode;

import activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Terminate;
import activitydiagramTrace.Steps.StepsPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activitydiagram Activity Node Terminate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class Activitydiagram_ActivityNode_TerminateImpl extends SmallStepImpl implements Activitydiagram_ActivityNode_Terminate {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Activitydiagram_ActivityNode_TerminateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StepsPackage.Literals.ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode getCaller() {
		return (ActivityNode) this.getMse().getCaller();
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case StepsPackage.ACTIVITYDIAGRAM_ACTIVITY_NODE_TERMINATE___GET_CALLER:
				return getCaller();
		}
		return super.eInvoke(operationID, arguments);
	}

} //Activitydiagram_ActivityNode_TerminateImpl
