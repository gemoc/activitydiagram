/**
 */
package activitydiagramTrace.States.activitydiagram;

import activitydiagramTrace.States.IntegerVariable_currentValue_Dimension;
import activitydiagramTrace.States.SpecificDimension;

import org.eclipse.emf.common.util.EList;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Integer Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedIntegerVariable#getIntegerVariable_currentValue_Dimension <em>Integer Variable current Value Dimension</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedIntegerVariable#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 *
 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedIntegerVariable()
 * @model
 * @generated
 */
public interface TracedIntegerVariable extends TracedVariable, TracedIntegerExpression {
	/**
	 * Returns the value of the '<em><b>Integer Variable current Value Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integer Variable current Value Dimension</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integer Variable current Value Dimension</em>' containment reference.
	 * @see #setIntegerVariable_currentValue_Dimension(IntegerVariable_currentValue_Dimension)
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedIntegerVariable_IntegerVariable_currentValue_Dimension()
	 * @model containment="true"
	 * @generated
	 */
	IntegerVariable_currentValue_Dimension getIntegerVariable_currentValue_Dimension();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.activitydiagram.TracedIntegerVariable#getIntegerVariable_currentValue_Dimension <em>Integer Variable current Value Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integer Variable current Value Dimension</em>' containment reference.
	 * @see #getIntegerVariable_currentValue_Dimension()
	 * @generated
	 */
	void setIntegerVariable_currentValue_Dimension(IntegerVariable_currentValue_Dimension value);

	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(IntegerVariable)
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedIntegerVariable_OriginalObject()
	 * @model
	 * @generated
	 */
	IntegerVariable getOriginalObject();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.activitydiagram.TracedIntegerVariable#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(IntegerVariable value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final EList<SpecificDimension<?>> result = new org.eclipse.emf.ecore.util.BasicInternalEList<SpecificDimension<?>>(Object.class);\nresult.addAll(super.getDimensionsInternal());\nresult.add(getIntegerVariable_currentValue_Dimension());\nreturn result;\n'"
	 * @generated
	 */
	EList<SpecificDimension<?>> getDimensionsInternal();

} // TracedIntegerVariable
