package org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerBinaryExpression;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.IntegerCalculationOperator;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.IntegerExpression;

@SuppressWarnings("all")
public class IntegerBinaryExpressionAdapter extends EObjectAdapter<IntegerBinaryExpression> implements org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.IntegerBinaryExpression {
  private XActivityDiagramMTAdaptersFactory adaptersFactory;
  
  public IntegerBinaryExpressionAdapter() {
    super(org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory.getInstance();
  }
  
  @Override
  public IntegerCalculationOperator getOperator() {
    return org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.IntegerCalculationOperator.get(adaptee.getOperator().getValue());
  }
  
  @Override
  public void setOperator(final IntegerCalculationOperator o) {
    adaptee.setOperator(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerCalculationOperator.get(o.getValue()));
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
  public int evaluate() {
    return org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerBinaryExpressionAspect.evaluate(adaptee);
  }
  
  protected final static IntegerCalculationOperator OPERATOR_EDEFAULT = org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.IntegerCalculationOperator.ADD;
  
  @Override
  public EClass eClass() {
    return org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.eINSTANCE.getIntegerBinaryExpression();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.INTEGER_BINARY_EXPRESSION__OPERAND1:
    		return getOperand1();
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.INTEGER_BINARY_EXPRESSION__OPERAND2:
    		return getOperand2();
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.INTEGER_BINARY_EXPRESSION__OPERATOR:
    		return getOperator();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.INTEGER_BINARY_EXPRESSION__OPERAND1:
    		return getOperand1() != null;
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.INTEGER_BINARY_EXPRESSION__OPERAND2:
    		return getOperand2() != null;
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.INTEGER_BINARY_EXPRESSION__OPERATOR:
    		return getOperator() != OPERATOR_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.INTEGER_BINARY_EXPRESSION__OPERAND1:
    		setOperand1(
    		(org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.IntegerExpression)
    		 newValue);
    		return;
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.INTEGER_BINARY_EXPRESSION__OPERAND2:
    		setOperand2(
    		(org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.IntegerExpression)
    		 newValue);
    		return;
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.INTEGER_BINARY_EXPRESSION__OPERATOR:
    		setOperator(
    		(org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.IntegerCalculationOperator)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
