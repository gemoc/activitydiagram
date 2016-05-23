package org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.Token;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivityNode;

@SuppressWarnings("all")
public class TokenAdapter extends EObjectAdapter<Token> implements org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.Token {
  private XActivityDiagramMTAdaptersFactory adaptersFactory;
  
  public TokenAdapter() {
    super(org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory.getInstance());
    adaptersFactory = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory.getInstance();
  }
  
  @Override
  public ActivityNode getHolder() {
    return (ActivityNode) adaptersFactory.createAdapter(adaptee.getHolder(), eResource);
  }
  
  @Override
  public void setHolder(final ActivityNode o) {
    if (o != null)
    	adaptee.setHolder(((org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.ActivityNodeAdapter) o).getAdaptee());
    else adaptee.setHolder(null);
  }
  
  @Override
  public boolean isWithdrawn() {
    return org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.TokenAspect.isWithdrawn(adaptee);
  }
  
  @Override
  public org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.Token transfer1(final ActivityNode holder) {
    return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.Token) adaptersFactory.createAdapter(org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.TokenAspect.transfer1(adaptee, ((org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.ActivityNodeAdapter) holder).getAdaptee()
    ), eResource);
  }
  
  @Override
  public void withdraw1() {
    org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.TokenAspect.withdraw1(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.eINSTANCE.getToken();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.TOKEN__HOLDER:
    		return getHolder();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.TOKEN__HOLDER:
    		return getHolder() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.TOKEN__HOLDER:
    		setHolder(
    		(org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivityNode)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
