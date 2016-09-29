package org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivityNode;

@SuppressWarnings("all")
public class TokenAdapter extends EObjectAdapter<Token> implements org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.Token {
  private XActivityDiagramMTAdaptersFactory adaptersFactory;
  
  public TokenAdapter() {
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
  public org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.Token transfer1(final ActivityNode holder) {
    return (org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.Token) adaptersFactory.createAdapter(org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.TokenAspect.transfer1(adaptee, (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode)((EObjectAdapter)holder).getAdaptee()
    ), eResource);
  }
  
  @Override
  public void withdraw1() {
    org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.TokenAspect.withdraw1(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.eINSTANCE.getToken();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.TOKEN__HOLDER:
    		return getHolder();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.TOKEN__HOLDER:
    		return getHolder() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.TOKEN__HOLDER:
    		setHolder(
    		(org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivityNode)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
