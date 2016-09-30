/**
 */
package org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram;

import java.io.File;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Util</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage#getUtil()
 * @model
 * @generated
 */
public interface Util extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Input getInput(String inputPath);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<InputValue> getInputValues(String inputPath);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.URI"
	 * @generated
	 */
	URI createFileURI(String path);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.File"
	 * @generated
	 */
	File createFile(String path);

} // Util
