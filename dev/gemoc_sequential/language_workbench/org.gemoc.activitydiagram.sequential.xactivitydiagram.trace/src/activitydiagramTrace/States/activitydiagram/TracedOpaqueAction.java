/**
 */
package activitydiagramTrace.States.activitydiagram;

import activitydiagramTrace.States.SpecificDimension;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Opaque Action</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedOpaqueAction()
 * @model
 * @generated
 */
public interface TracedOpaqueAction extends TracedAction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final EList<SpecificDimension<?>> result = new org.eclipse.emf.ecore.util.BasicInternalEList<SpecificDimension<?>>(Object.class);\nresult.addAll(super.getDimensionsInternal());\nreturn result;\n'"
	 * @generated
	 */
	EList<SpecificDimension<?>> getDimensionsInternal();

} // TracedOpaqueAction
