package org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.activitydiagrammt.activitydiagram;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.IntegerVariable;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.IntegerExpression;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.activitydiagrammt.ActivityDiagramMTAdaptersFactory;

@SuppressWarnings("all")
public class IntegerExpressionAdapter extends EObjectAdapter<IntegerExpression> implements org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.IntegerExpression {
  private ActivityDiagramMTAdaptersFactory adaptersFactory;
  
  public IntegerExpressionAdapter() {
    super(org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.activitydiagrammt.ActivityDiagramMTAdaptersFactory.getInstance());
    adaptersFactory = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.activitydiagrammt.ActivityDiagramMTAdaptersFactory.getInstance();
  }
  
  @Override
  public IntegerVariable getOperand2() {
    return (IntegerVariable) adaptersFactory.createAdapter(adaptee.getOperand2(), eResource);
  }
  
  @Override
  public void setOperand2(final IntegerVariable o) {
    if (o != null)
    	adaptee.setOperand2(((org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.activitydiagrammt.activitydiagram.IntegerVariableAdapter) o).getAdaptee());
    else adaptee.setOperand2(null);
  }
  
  @Override
  public IntegerVariable getOperand1() {
    return (IntegerVariable) adaptersFactory.createAdapter(adaptee.getOperand1(), eResource);
  }
  
  @Override
  public void setOperand1(final IntegerVariable o) {
    if (o != null)
    	adaptee.setOperand1(((org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.activitydiagrammt.activitydiagram.IntegerVariableAdapter) o).getAdaptee());
    else adaptee.setOperand1(null);
  }
  
  @Override
  public EClass eClass() {
    return org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage.eINSTANCE.getIntegerExpression();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage.INTEGER_EXPRESSION__OPERAND2:
    		return getOperand2();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage.INTEGER_EXPRESSION__OPERAND1:
    		return getOperand1();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage.INTEGER_EXPRESSION__OPERAND2:
    		return getOperand2() != null;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage.INTEGER_EXPRESSION__OPERAND1:
    		return getOperand1() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage.INTEGER_EXPRESSION__OPERAND2:
    		setOperand2(
    		(org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.IntegerVariable)
    		 newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage.INTEGER_EXPRESSION__OPERAND1:
    		setOperand1(
    		(org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.IntegerVariable)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
