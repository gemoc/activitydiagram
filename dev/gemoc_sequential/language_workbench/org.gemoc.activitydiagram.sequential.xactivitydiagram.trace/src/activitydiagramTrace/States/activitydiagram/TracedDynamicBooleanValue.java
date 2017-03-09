/**
 */
package activitydiagramTrace.States.activitydiagram;

import activitydiagramTrace.States.DynamicBooleanValue_value_Dimension;
import activitydiagramTrace.States.SpecificDimension;

import org.eclipse.emf.common.util.EList;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DynamicBooleanValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Dynamic Boolean Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedDynamicBooleanValue#getDynamicBooleanValue_value_Dimension <em>Dynamic Boolean Value value Dimension</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedDynamicBooleanValue#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 *
 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedDynamicBooleanValue()
 * @model
 * @generated
 */
public interface TracedDynamicBooleanValue extends TracedValue {
	/**
	 * Returns the value of the '<em><b>Dynamic Boolean Value value Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dynamic Boolean Value value Dimension</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamic Boolean Value value Dimension</em>' containment reference.
	 * @see #setDynamicBooleanValue_value_Dimension(DynamicBooleanValue_value_Dimension)
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedDynamicBooleanValue_DynamicBooleanValue_value_Dimension()
	 * @model containment="true"
	 * @generated
	 */
	DynamicBooleanValue_value_Dimension getDynamicBooleanValue_value_Dimension();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.activitydiagram.TracedDynamicBooleanValue#getDynamicBooleanValue_value_Dimension <em>Dynamic Boolean Value value Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic Boolean Value value Dimension</em>' containment reference.
	 * @see #getDynamicBooleanValue_value_Dimension()
	 * @generated
	 */
	void setDynamicBooleanValue_value_Dimension(DynamicBooleanValue_value_Dimension value);

	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(DynamicBooleanValue)
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedDynamicBooleanValue_OriginalObject()
	 * @model
	 * @generated
	 */
	DynamicBooleanValue getOriginalObject();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.activitydiagram.TracedDynamicBooleanValue#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(DynamicBooleanValue value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final EList<SpecificDimension<?>> result = new org.eclipse.emf.ecore.util.BasicInternalEList<SpecificDimension<?>>(Object.class);\nresult.addAll(super.getDimensionsInternal());\nresult.add(getDynamicBooleanValue_value_Dimension());\nreturn result;\n'"
	 * @generated
	 */
	EList<SpecificDimension<?>> getDimensionsInternal();

} // TracedDynamicBooleanValue
