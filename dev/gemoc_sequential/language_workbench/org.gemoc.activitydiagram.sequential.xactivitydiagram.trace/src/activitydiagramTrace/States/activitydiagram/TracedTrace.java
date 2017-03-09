/**
 */
package activitydiagramTrace.States.activitydiagram;

import activitydiagramTrace.States.SpecificDimension;
import activitydiagramTrace.States.SpecificTracedObject;
import activitydiagramTrace.States.Trace_executedNodes_Dimension;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedTrace#getTrace_executedNodes_Dimension <em>Trace executed Nodes Dimension</em>}</li>
 * </ul>
 *
 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedTrace()
 * @model
 * @generated
 */
public interface TracedTrace extends SpecificTracedObject<SpecificDimension<?>> {
	/**
	 * Returns the value of the '<em><b>Trace executed Nodes Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trace executed Nodes Dimension</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace executed Nodes Dimension</em>' containment reference.
	 * @see #setTrace_executedNodes_Dimension(Trace_executedNodes_Dimension)
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedTrace_Trace_executedNodes_Dimension()
	 * @model containment="true"
	 * @generated
	 */
	Trace_executedNodes_Dimension getTrace_executedNodes_Dimension();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.States.activitydiagram.TracedTrace#getTrace_executedNodes_Dimension <em>Trace executed Nodes Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace executed Nodes Dimension</em>' containment reference.
	 * @see #getTrace_executedNodes_Dimension()
	 * @generated
	 */
	void setTrace_executedNodes_Dimension(Trace_executedNodes_Dimension value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final EList<SpecificDimension<?>> result = new org.eclipse.emf.ecore.util.BasicInternalEList<SpecificDimension<?>>(Object.class);\nresult.addAll(super.getDimensionsInternal());\nresult.add(getTrace_executedNodes_Dimension());\nreturn result;\n'"
	 * @generated
	 */
	EList<SpecificDimension<?>> getDimensionsInternal();

} // TracedTrace
