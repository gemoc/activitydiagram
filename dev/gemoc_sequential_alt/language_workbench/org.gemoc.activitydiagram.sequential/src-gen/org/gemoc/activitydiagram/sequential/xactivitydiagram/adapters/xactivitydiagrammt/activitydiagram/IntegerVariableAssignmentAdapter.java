package org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariableAssignment;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.IntegerExpression;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.IntegerVariable;

@SuppressWarnings("all")
public class IntegerVariableAssignmentAdapter extends EObjectAdapter<IntegerVariableAssignment> implements org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.IntegerVariableAssignment {
  private XActivityDiagramMTAdaptersFactory adaptersFactory;
  
  public IntegerVariableAssignmentAdapter() {
    super(org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory.getInstance();
  }
  
  @Override
  public IntegerVariable getAssignee() {
    return (IntegerVariable) adaptersFactory.createAdapter(adaptee.getAssignee(), eResource);
  }
  
  @Override
  public void setAssignee(final IntegerVariable o) {
    if (o != null)
    	adaptee.setAssignee(((org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.IntegerVariableAdapter) o).getAdaptee());
    else adaptee.setAssignee(null);
  }
  
  @Override
  public IntegerExpression getExpression() {
    return (IntegerExpression) adaptersFactory.createAdapter(adaptee.getExpression(), eResource);
  }
  
  @Override
  public void setExpression(final IntegerExpression o) {
    if (o != null)
    	adaptee.setExpression(((org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.IntegerExpressionAdapter) o).getAdaptee());
    else adaptee.setExpression(null);
  }
  
  @Override
  public void execute() {
    org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerVariableAssignmentAspect.execute(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.eINSTANCE.getIntegerVariableAssignment();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.INTEGER_VARIABLE_ASSIGNMENT__ASSIGNEE:
    		return getAssignee();
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.INTEGER_VARIABLE_ASSIGNMENT__EXPRESSION:
    		return getExpression();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.INTEGER_VARIABLE_ASSIGNMENT__ASSIGNEE:
    		return getAssignee() != null;
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.INTEGER_VARIABLE_ASSIGNMENT__EXPRESSION:
    		return getExpression() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.INTEGER_VARIABLE_ASSIGNMENT__ASSIGNEE:
    		setAssignee(
    		(org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.IntegerVariable)
    		 newValue);
    		return;
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.INTEGER_VARIABLE_ASSIGNMENT__EXPRESSION:
    		setExpression(
    		(org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.IntegerExpression)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
