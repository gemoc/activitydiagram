package org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.activitydiagrammt.activitydiagram;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.Value;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.Variable;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.InputValue;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.activitydiagrammt.ActivityDiagramMTAdaptersFactory;

@SuppressWarnings("all")
public class InputValueAdapter extends EObjectAdapter<InputValue> implements org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.InputValue {
  private ActivityDiagramMTAdaptersFactory adaptersFactory;
  
  public InputValueAdapter() {
    super(org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.activitydiagrammt.ActivityDiagramMTAdaptersFactory.getInstance());
    adaptersFactory = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.activitydiagrammt.ActivityDiagramMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Value getValue() {
    return (Value) adaptersFactory.createAdapter(adaptee.getValue(), eResource);
  }
  
  @Override
  public void setValue(final Value o) {
    if (o != null)
    	adaptee.setValue(((org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.activitydiagrammt.activitydiagram.ValueAdapter) o).getAdaptee());
    else adaptee.setValue(null);
  }
  
  @Override
  public Variable getVariable() {
    return (Variable) adaptersFactory.createAdapter(adaptee.getVariable(), eResource);
  }
  
  @Override
  public void setVariable(final Variable o) {
    if (o != null)
    	adaptee.setVariable(((org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.activitydiagrammt.activitydiagram.VariableAdapter) o).getAdaptee());
    else adaptee.setVariable(null);
  }
  
  @Override
  public EClass eClass() {
    return org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage.eINSTANCE.getInputValue();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage.INPUT_VALUE__VALUE:
    		return getValue();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage.INPUT_VALUE__VARIABLE:
    		return getVariable();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage.INPUT_VALUE__VALUE:
    		return getValue() != null;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage.INPUT_VALUE__VARIABLE:
    		return getVariable() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage.INPUT_VALUE__VALUE:
    		setValue(
    		(org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.Value)
    		 newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage.INPUT_VALUE__VARIABLE:
    		setVariable(
    		(org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.Variable)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}