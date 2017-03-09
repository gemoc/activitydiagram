package org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanUnaryExpression;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.BooleanExpression;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.BooleanUnaryOperator;

@SuppressWarnings("all")
public class BooleanUnaryExpressionAdapter extends EObjectAdapter<BooleanUnaryExpression> implements org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.BooleanUnaryExpression {
  private XActivityDiagramMTAdaptersFactory adaptersFactory;
  
  public BooleanUnaryExpressionAdapter() {
    super(org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory.getInstance();
  }
  
  @Override
  public BooleanUnaryOperator getOperator() {
    return org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.BooleanUnaryOperator.get(adaptee.getOperator().getValue());
  }
  
  @Override
  public void setOperator(final BooleanUnaryOperator o) {
    adaptee.setOperator(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanUnaryOperator.get(o.getValue()));
  }
  
  @Override
  public BooleanExpression getOperand() {
    return (BooleanExpression) adaptersFactory.createAdapter(adaptee.getOperand(), eResource);
  }
  
  @Override
  public void setOperand(final BooleanExpression o) {
    if (o != null)
    	adaptee.setOperand(((org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.BooleanExpressionAdapter) o).getAdaptee());
    else adaptee.setOperand(null);
  }
  
  @Override
  public boolean evaluate() {
    return org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanUnaryExpressionAspect.evaluate(adaptee);
  }
  
  protected final static BooleanUnaryOperator OPERATOR_EDEFAULT = org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.BooleanUnaryOperator.NOT;
  
  @Override
  public EClass eClass() {
    return org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.eINSTANCE.getBooleanUnaryExpression();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.BOOLEAN_UNARY_EXPRESSION__OPERAND:
    		return getOperand();
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.BOOLEAN_UNARY_EXPRESSION__OPERATOR:
    		return getOperator();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.BOOLEAN_UNARY_EXPRESSION__OPERAND:
    		return getOperand() != null;
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.BOOLEAN_UNARY_EXPRESSION__OPERATOR:
    		return getOperator() != OPERATOR_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.BOOLEAN_UNARY_EXPRESSION__OPERAND:
    		setOperand(
    		(org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.BooleanExpression)
    		 newValue);
    		return;
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.BOOLEAN_UNARY_EXPRESSION__OPERATOR:
    		setOperator(
    		(org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.BooleanUnaryOperator)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
