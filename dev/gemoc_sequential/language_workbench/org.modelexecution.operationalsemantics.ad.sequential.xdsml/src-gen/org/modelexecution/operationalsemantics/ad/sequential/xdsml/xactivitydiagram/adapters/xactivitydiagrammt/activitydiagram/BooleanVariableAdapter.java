package org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.BooleanVariable;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.Context;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.Value;

@SuppressWarnings("all")
public class BooleanVariableAdapter extends EObjectAdapter<BooleanVariable> implements org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.BooleanVariable {
  private XActivityDiagramMTAdaptersFactory adaptersFactory;
  
  public BooleanVariableAdapter() {
    super(org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory.getInstance());
    adaptersFactory = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory.getInstance();
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
    	adaptee.setInitialValue(((org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.ValueAdapter) o).getAdaptee());
    else adaptee.setInitialValue(null);
  }
  
  @Override
  public Value getCurrentValue() {
    return (Value) adaptersFactory.createAdapter(adaptee.getCurrentValue(), eResource);
  }
  
  @Override
  public void setCurrentValue(final Value o) {
    if (o != null)
    	adaptee.setCurrentValue(((org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.ValueAdapter) o).getAdaptee());
    else adaptee.setCurrentValue(null);
  }
  
  @Override
  public void execute(final Context c) {
    org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.BooleanVariableAspect.execute(adaptee, ((org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.ContextAdapter) c).getAdaptee()
    );
  }
  
  @Override
  public void init(final Context c) {
    org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.BooleanVariableAspect.init(adaptee, ((org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.ContextAdapter) c).getAdaptee()
    );
  }
  
  @Override
  public String print() {
    return org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.BooleanVariableAspect.print(adaptee);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.eINSTANCE.getBooleanVariable();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.BOOLEAN_VARIABLE__INITIAL_VALUE:
    		return getInitialValue();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.BOOLEAN_VARIABLE__NAME:
    		return getName();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.BOOLEAN_VARIABLE__CURRENT_VALUE:
    		return getCurrentValue();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.BOOLEAN_VARIABLE__INITIAL_VALUE:
    		return getInitialValue() != null;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.BOOLEAN_VARIABLE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.BOOLEAN_VARIABLE__CURRENT_VALUE:
    		return getCurrentValue() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.BOOLEAN_VARIABLE__INITIAL_VALUE:
    		setInitialValue(
    		(org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.Value)
    		 newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.BOOLEAN_VARIABLE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.BOOLEAN_VARIABLE__CURRENT_VALUE:
    		setCurrentValue(
    		(org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.Value)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
