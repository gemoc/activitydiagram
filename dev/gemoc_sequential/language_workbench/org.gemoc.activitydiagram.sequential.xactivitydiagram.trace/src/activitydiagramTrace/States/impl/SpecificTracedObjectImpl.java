/**
 */
package activitydiagramTrace.States.impl;

import activitydiagramTrace.States.SpecificDimension;
import activitydiagramTrace.States.SpecificTracedObject;
import activitydiagramTrace.States.SpecificValue;
import activitydiagramTrace.States.StatesPackage;

import fr.inria.diverse.trace.commons.model.trace.impl.TracedObjectImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specific Traced Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class SpecificTracedObjectImpl<DimensionSubType extends SpecificDimension<? extends SpecificValue>> extends TracedObjectImpl<DimensionSubType> implements SpecificTracedObject<DimensionSubType> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificTracedObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.SPECIFIC_TRACED_OBJECT;
	}

} //SpecificTracedObjectImpl
