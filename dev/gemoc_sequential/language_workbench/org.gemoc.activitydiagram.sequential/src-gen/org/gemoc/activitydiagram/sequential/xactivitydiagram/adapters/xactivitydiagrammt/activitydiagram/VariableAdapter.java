package org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Variable;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.Value;

@SuppressWarnings("all")
public class VariableAdapter extends EObjectAdapter<Variable> implements org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.Variable {
  private XActivityDiagramMTAdaptersFactory adaptersFactory;
  
  public VariableAdapter() {
    super(org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }
  
  @Override
  public Value getInitialValue() {
    return (Value) adaptersFactory.createAdapter(adaptee.getInitialValue(), eResource);
  }
  
  @Override
  public void setInitialValue(final Value o) {
    if (o != null)
    	adaptee.setInitialValue(((org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.ValueAdapter) o).getAdaptee());
    else adaptee.setInitialValue(null);
  }
  
  @Override
  public Value getCurrentValue() {
    return (Value) adaptersFactory.createAdapter(adaptee.getCurrentValue(), eResource);
  }
  
  @Override
  public void setCurrentValue(final Value o) {
    if (o != null)
    	adaptee.setCurrentValue(((org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.ValueAdapter) o).getAdaptee());
    else adaptee.setCurrentValue(null);
  }
  
  @Override
  public void execute() {
    org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAspect.execute(adaptee);
  }
  
  @Override
  public void init() {
    org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAspect.init(adaptee);
  }
  
  @Override
  public String print() {
    return org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAspect.print(adaptee);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.eINSTANCE.getVariable();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.VARIABLE__INITIAL_VALUE:
    		return getInitialValue();
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.VARIABLE__NAME:
    		return getName();
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.VARIABLE__CURRENT_VALUE:
    		return getCurrentValue();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.VARIABLE__INITIAL_VALUE:
    		return getInitialValue() != null;
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.VARIABLE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.VARIABLE__CURRENT_VALUE:
    		return getCurrentValue() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.VARIABLE__INITIAL_VALUE:
    		setInitialValue(
    		(org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.Value)
    		 newValue);
    		return;
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.VARIABLE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.VARIABLE__CURRENT_VALUE:
    		setCurrentValue(
    		(org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.Value)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
