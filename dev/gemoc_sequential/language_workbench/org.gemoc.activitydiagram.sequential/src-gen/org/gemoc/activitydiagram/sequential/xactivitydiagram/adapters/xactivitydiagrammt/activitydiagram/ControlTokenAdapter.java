package org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivityNode;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.Token;

@SuppressWarnings("all")
public class ControlTokenAdapter extends EObjectAdapter<ControlToken> implements org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ControlToken {
  private XActivityDiagramMTAdaptersFactory adaptersFactory;
  
  public ControlTokenAdapter() {
    super(org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory.getInstance();
  }
  
  @Override
  public ActivityNode getHolder() {
    return (ActivityNode) adaptersFactory.createAdapter(org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.TokenAspect.holder(adaptee), eResource);
  }
  
  @Override
  public void setHolder(final ActivityNode holder) {
    org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.TokenAspect.holder(adaptee, (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode)((EObjectAdapter)holder).getAdaptee()
    );
  }
  
  @Override
  public boolean isWithdrawn() {
    return org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.TokenAspect.isWithdrawn(adaptee);
  }
  
  @Override
  public Token transfer1(final ActivityNode holder) {
    return (Token) adaptersFactory.createAdapter(org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.TokenAspect.transfer1(adaptee, (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode)((EObjectAdapter)holder).getAdaptee()
    ), eResource);
  }
  
  @Override
  public void withdraw1() {
    org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.TokenAspect.withdraw1(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.eINSTANCE.getControlToken();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.CONTROL_TOKEN__HOLDER:
    		return getHolder();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.CONTROL_TOKEN__HOLDER:
    		return getHolder() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.CONTROL_TOKEN__HOLDER:
    		setHolder(
    		(org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivityNode)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
