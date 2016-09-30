package org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InputValue;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.Value;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.Variable;

@SuppressWarnings("all")
public class InputValueAdapter extends EObjectAdapter<InputValue> implements org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.InputValue {
  private XActivityDiagramMTAdaptersFactory adaptersFactory;
  
  public InputValueAdapter() {
    super(org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Value getValue() {
    return (Value) adaptersFactory.createAdapter(org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.InputValueAspect.value(adaptee), eResource);
  }
  
  @Override
  public void setValue(final Value value) {
    org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.InputValueAspect.value(adaptee, (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Value)((EObjectAdapter)value).getAdaptee()
    );
  }
  
  @Override
  public Variable getVariable() {
    return (Variable) adaptersFactory.createAdapter(org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.InputValueAspect.variable(adaptee), eResource);
  }
  
  @Override
  public void setVariable(final Variable variable) {
    org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.InputValueAspect.variable(adaptee, (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Variable)((EObjectAdapter)variable).getAdaptee()
    );
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.eINSTANCE.getInputValue();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.INPUT_VALUE__VARIABLE:
    		return getVariable();
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.INPUT_VALUE__VALUE:
    		return getValue();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.INPUT_VALUE__VARIABLE:
    		return getVariable() != null;
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.INPUT_VALUE__VALUE:
    		return getValue() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.INPUT_VALUE__VARIABLE:
    		setVariable(
    		(org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.Variable)
    		 newValue);
    		return;
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.INPUT_VALUE__VALUE:
    		setValue(
    		(org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.Value)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
