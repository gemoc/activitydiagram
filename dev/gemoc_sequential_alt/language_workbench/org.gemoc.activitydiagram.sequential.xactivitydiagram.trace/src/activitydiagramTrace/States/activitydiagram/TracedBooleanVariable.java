/**
 */
package activitydiagramTrace.States.activitydiagram;

import activitydiagramTrace.States.BooleanVariable_currentValue_Dimension;
import activitydiagramTrace.States.SpecificDimension;

import org.eclipse.emf.common.util.EList;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Boolean Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedBooleanVariable#getBooleanVariable_currentValue_Dimension <em>Boolean Variable current Value Dimension</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedBooleanVariable#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 *
 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedBooleanVariable()
 * @model
 * @generated
 */
public interface TracedBooleanVariable extends TracedVariable, TracedBooleanExpression {
	/**
	 * Returns the value of the '<em><b>Boolean Variable current Value Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boolean Variable current Value Dimension</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean Variable current Value Dimension</em>' containment reference.
	 * @see #setBooleanVariable_currentValue_Dimension(BooleanVariable_currentValue_Dimension)
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedBooleanVariable_BooleanVariable_currentValue_Dimension()
	 * @model containment="true"
	 * @generated
	 */
	BooleanVariable_currentValue_Dimension getBooleanVariable_currentValue_Dimension();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.activitydiagram.TracedBooleanVariable#getBooleanVariable_currentValue_Dimension <em>Boolean Variable current Value Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean Variable current Value Dimension</em>' containment reference.
	 * @see #getBooleanVariable_currentValue_Dimension()
	 * @generated
	 */
	void setBooleanVariable_currentValue_Dimension(BooleanVariable_currentValue_Dimension value);

	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(BooleanVariable)
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedBooleanVariable_OriginalObject()
	 * @model
	 * @generated
	 */
	BooleanVariable getOriginalObject();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.activitydiagram.TracedBooleanVariable#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(BooleanVariable value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final EList<SpecificDimension<?>> result = new org.eclipse.emf.ecore.util.BasicInternalEList<SpecificDimension<?>>(Object.class);\nresult.addAll(super.getDimensionsInternal());\nresult.add(getBooleanVariable_currentValue_Dimension());\nreturn result;\n'"
	 * @generated
	 */
	EList<SpecificDimension<?>> getDimensionsInternal();

} // TracedBooleanVariable
