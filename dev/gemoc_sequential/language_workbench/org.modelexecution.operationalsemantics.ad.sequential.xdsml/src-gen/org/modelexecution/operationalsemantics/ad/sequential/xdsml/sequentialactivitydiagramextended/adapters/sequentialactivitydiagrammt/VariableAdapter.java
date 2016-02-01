package org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.adapters.sequentialactivitydiagrammt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.activitydiagram.Variable;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.adapters.sequentialactivitydiagrammt.SequentialActivityDiagramMTAdaptersFactory;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.Value;

@SuppressWarnings("all")
public class VariableAdapter extends EObjectAdapter<Variable> implements org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.Variable {
  private SequentialActivityDiagramMTAdaptersFactory adaptersFactory;
  
  public VariableAdapter() {
    super(org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.adapters.sequentialactivitydiagrammt.SequentialActivityDiagramMTAdaptersFactory.getInstance()) ;
    adaptersFactory = org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.adapters.sequentialactivitydiagrammt.SequentialActivityDiagramMTAdaptersFactory.getInstance() ;
  }
  
  @Override
  public String getName() {
    return adaptee.getName() ;
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o) ;
  }
  
  private Value initialValue;
  
  @Override
  public Value getInitialValue() {
    return (Value) adaptersFactory.createAdapter(adaptee.getInitialValue(), eResource) ;
  }
  
  @Override
  public void setInitialValue(final Value o) {
    if (o != null)
    	adaptee.setInitialValue(((org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.adapters.sequentialactivitydiagrammt.ValueAdapter) o).getAdaptee()) ;
    else adaptee.setInitialValue(null) ;
  }
  
  private Value currentValue;
  
  @Override
  public Value getCurrentValue() {
    return (Value) adaptersFactory.createAdapter(adaptee.getCurrentValue(), eResource) ;
  }
  
  @Override
  public void setCurrentValue(final Value o) {
    if (o != null)
    	adaptee.setCurrentValue(((org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.adapters.sequentialactivitydiagrammt.ValueAdapter) o).getAdaptee()) ;
    else adaptee.setCurrentValue(null) ;
  }
  
  @Override
  public EClass eClass() {
    return org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage.eINSTANCE.getVariable();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage.VARIABLE__INITIAL_VALUE:
    		return getInitialValue();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage.VARIABLE__NAME:
    		return getName();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage.VARIABLE__CURRENT_VALUE:
    		return getCurrentValue();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage.VARIABLE__INITIAL_VALUE:
    		setInitialValue((Value) newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage.VARIABLE__NAME:
    		setName((String) newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage.VARIABLE__CURRENT_VALUE:
    		setCurrentValue((Value) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage.VARIABLE__INITIAL_VALUE:
    		setInitialValue((Value) null);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage.VARIABLE__NAME:
    		setName((String) null);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage.VARIABLE__CURRENT_VALUE:
    		setCurrentValue((Value) null);
    		return;
    }
    
    super.eUnset(featureID);
  }
}
