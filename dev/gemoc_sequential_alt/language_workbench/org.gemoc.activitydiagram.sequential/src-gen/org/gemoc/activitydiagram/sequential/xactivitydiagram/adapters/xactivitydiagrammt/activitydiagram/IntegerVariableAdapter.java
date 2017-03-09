package org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariable;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory;

@SuppressWarnings("all")
public class IntegerVariableAdapter extends EObjectAdapter<IntegerVariable> implements org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.IntegerVariable {
  private XActivityDiagramMTAdaptersFactory adaptersFactory;
  
  public IntegerVariableAdapter() {
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
  public int getInitialValue() {
    return adaptee.getInitialValue();
  }
  
  @Override
  public void setInitialValue(final int o) {
    adaptee.setInitialValue(o);
  }
  
  @Override
  public int evaluate() {
    return org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerVariableEvaluateAspect.evaluate(adaptee);
  }
  
  @Override
  public int getCurrentValue() {
    return org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerVariableAspect.currentValue(adaptee);
  }
  
  @Override
  public void setCurrentValue(final int currentValue) {
    org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerVariableAspect.currentValue(adaptee, currentValue
    );
  }
  
  @Override
  public void init() {
    org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerVariableAspect.init(adaptee);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static int INITIAL_VALUE_EDEFAULT = 0;
  
  protected final static int CURRENT_VALUE_EDEFAULT = 0;
  
  @Override
  public EClass eClass() {
    return org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.eINSTANCE.getIntegerVariable();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.INTEGER_VARIABLE__NAME:
    		return getName();
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.INTEGER_VARIABLE__INITIAL_VALUE:
    		return new java.lang.Integer(getInitialValue());
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.INTEGER_VARIABLE__CURRENT_VALUE:
    		return new java.lang.Integer(getCurrentValue());
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.INTEGER_VARIABLE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.INTEGER_VARIABLE__INITIAL_VALUE:
    		return getInitialValue() != INITIAL_VALUE_EDEFAULT;
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.INTEGER_VARIABLE__CURRENT_VALUE:
    		return getCurrentValue() != CURRENT_VALUE_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.INTEGER_VARIABLE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.INTEGER_VARIABLE__INITIAL_VALUE:
    		setInitialValue(((java.lang.Integer) newValue).intValue());
    		return;
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.INTEGER_VARIABLE__CURRENT_VALUE:
    		setCurrentValue(((java.lang.Integer) newValue).intValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
