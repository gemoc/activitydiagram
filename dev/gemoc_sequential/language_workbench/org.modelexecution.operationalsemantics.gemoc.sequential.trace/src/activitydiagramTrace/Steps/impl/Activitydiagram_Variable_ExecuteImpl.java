/**
 */
package activitydiagramTrace.Steps.impl;

import activitydiagram.Variable;

import activitydiagramTrace.Steps.Activitydiagram_Variable_Execute;
import activitydiagramTrace.Steps.StepsPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activitydiagram Variable Execute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class Activitydiagram_Variable_ExecuteImpl extends SmallStepImpl implements Activitydiagram_Variable_Execute {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Activitydiagram_Variable_ExecuteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StepsPackage.Literals.ACTIVITYDIAGRAM_VARIABLE_EXECUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getCaller() {
		return (Variable) this.getMse().getCaller();
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case StepsPackage.ACTIVITYDIAGRAM_VARIABLE_EXECUTE___GET_CALLER:
				return getCaller();
		}
		return super.eInvoke(operationID, arguments);
	}

} //Activitydiagram_Variable_ExecuteImpl
