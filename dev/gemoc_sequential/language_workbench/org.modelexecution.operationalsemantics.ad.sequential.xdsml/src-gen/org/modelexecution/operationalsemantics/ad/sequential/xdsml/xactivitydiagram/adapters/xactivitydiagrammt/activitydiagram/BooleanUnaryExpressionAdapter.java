package org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.BooleanUnaryExpression;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.BooleanUnaryOperator;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.BooleanVariable;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.Context;

@SuppressWarnings("all")
public class BooleanUnaryExpressionAdapter extends EObjectAdapter<BooleanUnaryExpression> implements org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.BooleanUnaryExpression {
  private XActivityDiagramMTAdaptersFactory adaptersFactory;
  
  public BooleanUnaryExpressionAdapter() {
    super(org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory.getInstance());
    adaptersFactory = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory.getInstance();
  }
  
  @Override
  public BooleanUnaryOperator getOperator() {
    return org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.BooleanUnaryOperator.get(adaptee.getOperator().getValue());
  }
  
  @Override
  public void setOperator(final BooleanUnaryOperator o) {
    adaptee.setOperator(org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.BooleanUnaryOperator.get(o.getValue()));
  }
  
  @Override
  public BooleanVariable getAssignee() {
    return (BooleanVariable) adaptersFactory.createAdapter(adaptee.getAssignee(), eResource);
  }
  
  @Override
  public void setAssignee(final BooleanVariable o) {
    if (o != null)
    	adaptee.setAssignee(((org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.BooleanVariableAdapter) o).getAdaptee());
    else adaptee.setAssignee(null);
  }
  
  @Override
  public BooleanVariable getOperand() {
    return (BooleanVariable) adaptersFactory.createAdapter(adaptee.getOperand(), eResource);
  }
  
  @Override
  public void setOperand(final BooleanVariable o) {
    if (o != null)
    	adaptee.setOperand(((org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.BooleanVariableAdapter) o).getAdaptee());
    else adaptee.setOperand(null);
  }
  
  @Override
  public void execute(final Context c) {
    org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.BooleanUnaryExpressionAspect.execute(adaptee, ((org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.ContextAdapter) c).getAdaptee()
    );
  }
  
  protected final static BooleanUnaryOperator OPERATOR_EDEFAULT = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.BooleanUnaryOperator.NOT;
  
  @Override
  public EClass eClass() {
    return org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.eINSTANCE.getBooleanUnaryExpression();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.BOOLEAN_UNARY_EXPRESSION__ASSIGNEE:
    		return getAssignee();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.BOOLEAN_UNARY_EXPRESSION__OPERAND:
    		return getOperand();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.BOOLEAN_UNARY_EXPRESSION__OPERATOR:
    		return getOperator();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.BOOLEAN_UNARY_EXPRESSION__ASSIGNEE:
    		return getAssignee() != null;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.BOOLEAN_UNARY_EXPRESSION__OPERAND:
    		return getOperand() != null;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.BOOLEAN_UNARY_EXPRESSION__OPERATOR:
    		return getOperator() != OPERATOR_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.BOOLEAN_UNARY_EXPRESSION__ASSIGNEE:
    		setAssignee(
    		(org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.BooleanVariable)
    		 newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.BOOLEAN_UNARY_EXPRESSION__OPERAND:
    		setOperand(
    		(org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.BooleanVariable)
    		 newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.BOOLEAN_UNARY_EXPRESSION__OPERATOR:
    		setOperator(
    		(org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.BooleanUnaryOperator)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
