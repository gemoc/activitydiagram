package org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.activitydiagrammt.activitydiagram;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.Value;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.Variable;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.activitydiagrammt.ActivityDiagramMTAdaptersFactory;

@SuppressWarnings("all")
public class VariableAdapter extends EObjectAdapter<Variable> implements org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.Variable {
  private ActivityDiagramMTAdaptersFactory adaptersFactory;
  
  public VariableAdapter() {
    super(org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.activitydiagrammt.ActivityDiagramMTAdaptersFactory.getInstance());
    adaptersFactory = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.activitydiagrammt.ActivityDiagramMTAdaptersFactory.getInstance();
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
    	adaptee.setInitialValue(((org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.activitydiagrammt.activitydiagram.ValueAdapter) o).getAdaptee());
    else adaptee.setInitialValue(null);
  }
  
  @Override
  public Value getCurrentValue() {
    return (Value) adaptersFactory.createAdapter(adaptee.getCurrentValue(), eResource);
  }
  
  @Override
  public void setCurrentValue(final Value o) {
    if (o != null)
    	adaptee.setCurrentValue(((org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.activitydiagrammt.activitydiagram.ValueAdapter) o).getAdaptee());
    else adaptee.setCurrentValue(null);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage.eINSTANCE.getVariable();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage.VARIABLE__INITIAL_VALUE:
    		return getInitialValue();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage.VARIABLE__NAME:
    		return getName();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage.VARIABLE__CURRENT_VALUE:
    		return getCurrentValue();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage.VARIABLE__INITIAL_VALUE:
    		return getInitialValue() != null;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage.VARIABLE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage.VARIABLE__CURRENT_VALUE:
    		return getCurrentValue() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage.VARIABLE__INITIAL_VALUE:
    		setInitialValue(
    		(org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.Value)
    		 newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage.VARIABLE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage.VARIABLE__CURRENT_VALUE:
    		setCurrentValue(
    		(org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.Value)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
