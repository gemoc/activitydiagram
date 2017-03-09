/**
 */
package activitydiagramTrace.States.activitydiagram;

import activitydiagramTrace.States.DynamicIntegerValue_value_Dimension;
import activitydiagramTrace.States.SpecificDimension;

import org.eclipse.emf.common.util.EList;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DynamicIntegerValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Dynamic Integer Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedDynamicIntegerValue#getDynamicIntegerValue_value_Dimension <em>Dynamic Integer Value value Dimension</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedDynamicIntegerValue#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 *
 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedDynamicIntegerValue()
 * @model
 * @generated
 */
public interface TracedDynamicIntegerValue extends TracedValue {
	/**
	 * Returns the value of the '<em><b>Dynamic Integer Value value Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dynamic Integer Value value Dimension</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamic Integer Value value Dimension</em>' containment reference.
	 * @see #setDynamicIntegerValue_value_Dimension(DynamicIntegerValue_value_Dimension)
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedDynamicIntegerValue_DynamicIntegerValue_value_Dimension()
	 * @model containment="true"
	 * @generated
	 */
	DynamicIntegerValue_value_Dimension getDynamicIntegerValue_value_Dimension();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.activitydiagram.TracedDynamicIntegerValue#getDynamicIntegerValue_value_Dimension <em>Dynamic Integer Value value Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic Integer Value value Dimension</em>' containment reference.
	 * @see #getDynamicIntegerValue_value_Dimension()
	 * @generated
	 */
	void setDynamicIntegerValue_value_Dimension(DynamicIntegerValue_value_Dimension value);

	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(DynamicIntegerValue)
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedDynamicIntegerValue_OriginalObject()
	 * @model
	 * @generated
	 */
	DynamicIntegerValue getOriginalObject();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.activitydiagram.TracedDynamicIntegerValue#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(DynamicIntegerValue value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final EList<SpecificDimension<?>> result = new org.eclipse.emf.ecore.util.BasicInternalEList<SpecificDimension<?>>(Object.class);\nresult.addAll(super.getDimensionsInternal());\nresult.add(getDynamicIntegerValue_value_Dimension());\nreturn result;\n'"
	 * @generated
	 */
	EList<SpecificDimension<?>> getDimensionsInternal();

} // TracedDynamicIntegerValue
