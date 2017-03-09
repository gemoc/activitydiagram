package org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerComparisonExpression;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.IntegerComparisonOperator;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.IntegerExpression;

@SuppressWarnings("all")
public class IntegerComparisonExpressionAdapter extends EObjectAdapter<IntegerComparisonExpression> implements org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.IntegerComparisonExpression {
  private XActivityDiagramMTAdaptersFactory adaptersFactory;
  
  public IntegerComparisonExpressionAdapter() {
    super(org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory.getInstance();
  }
  
  @Override
  public IntegerComparisonOperator getOperator() {
    return org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.IntegerComparisonOperator.get(adaptee.getOperator().getValue());
  }
  
  @Override
  public void setOperator(final IntegerComparisonOperator o) {
    adaptee.setOperator(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerComparisonOperator.get(o.getValue()));
  }
  
  @Override
  public IntegerExpression getOperand1() {
    return (IntegerExpression) adaptersFactory.createAdapter(adaptee.getOperand1(), eResource);
  }
  
  @Override
  public void setOperand1(final IntegerExpression o) {
    if (o != null)
    	adaptee.setOperand1(((org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.IntegerExpressionAdapter) o).getAdaptee());
    else adaptee.setOperand1(null);
  }
  
  @Override
  public IntegerExpression getOperand2() {
    return (IntegerExpression) adaptersFactory.createAdapter(adaptee.getOperand2(), eResource);
  }
  
  @Override
  public void setOperand2(final IntegerExpression o) {
    if (o != null)
    	adaptee.setOperand2(((org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.IntegerExpressionAdapter) o).getAdaptee());
    else adaptee.setOperand2(null);
  }
  
  @Override
  public boolean evaluate() {
    return org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerComparisonExpressionAspect.evaluate(adaptee);
  }
  
  protected final static IntegerComparisonOperator OPERATOR_EDEFAULT = org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.IntegerComparisonOperator.SMALLER;
  
  @Override
  public EClass eClass() {
    return org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.eINSTANCE.getIntegerComparisonExpression();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.INTEGER_COMPARISON_EXPRESSION__OPERATOR:
    		return getOperator();
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.INTEGER_COMPARISON_EXPRESSION__OPERAND1:
    		return getOperand1();
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.INTEGER_COMPARISON_EXPRESSION__OPERAND2:
    		return getOperand2();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.INTEGER_COMPARISON_EXPRESSION__OPERATOR:
    		return getOperator() != OPERATOR_EDEFAULT;
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.INTEGER_COMPARISON_EXPRESSION__OPERAND1:
    		return getOperand1() != null;
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.INTEGER_COMPARISON_EXPRESSION__OPERAND2:
    		return getOperand2() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.INTEGER_COMPARISON_EXPRESSION__OPERATOR:
    		setOperator(
    		(org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.IntegerComparisonOperator)
    		 newValue);
    		return;
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.INTEGER_COMPARISON_EXPRESSION__OPERAND1:
    		setOperand1(
    		(org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.IntegerExpression)
    		 newValue);
    		return;
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.INTEGER_COMPARISON_EXPRESSION__OPERAND2:
    		setOperand2(
    		(org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.IntegerExpression)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
