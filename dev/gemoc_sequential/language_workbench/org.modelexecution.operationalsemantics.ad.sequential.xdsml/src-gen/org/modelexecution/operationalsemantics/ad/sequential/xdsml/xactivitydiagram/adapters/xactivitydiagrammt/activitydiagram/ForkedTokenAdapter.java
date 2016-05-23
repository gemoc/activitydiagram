package org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.ForkedToken;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivityNode;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.Token;

@SuppressWarnings("all")
public class ForkedTokenAdapter extends EObjectAdapter<ForkedToken> implements org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ForkedToken {
  private XActivityDiagramMTAdaptersFactory adaptersFactory;
  
  public ForkedTokenAdapter() {
    super(org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory.getInstance());
    adaptersFactory = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory.getInstance();
  }
  
  @Override
  public int getRemainingOffersCount() {
    return adaptee.getRemainingOffersCount();
  }
  
  @Override
  public void setRemainingOffersCount(final int o) {
    adaptee.setRemainingOffersCount(o);
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
  public Token getBaseToken() {
    return (Token) adaptersFactory.createAdapter(adaptee.getBaseToken(), eResource);
  }
  
  @Override
  public void setBaseToken(final Token o) {
    if (o != null)
    	adaptee.setBaseToken(((org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.TokenAdapter) o).getAdaptee());
    else adaptee.setBaseToken(null);
  }
  
  @Override
  public boolean isWithdrawn() {
    return org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.TokenAspect.isWithdrawn(adaptee);
  }
  
  @Override
  public Token transfer1(final ActivityNode holder) {
    return (Token) adaptersFactory.createAdapter(org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.TokenAspect.transfer1(adaptee, ((org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.ActivityNodeAdapter) holder).getAdaptee()
    ), eResource);
  }
  
  @Override
  public void withdraw1() {
    org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.TokenAspect.withdraw1(adaptee);
  }
  
  protected final static int REMAINING_OFFERS_COUNT_EDEFAULT = 0;
  
  @Override
  public EClass eClass() {
    return org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.eINSTANCE.getForkedToken();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.FORKED_TOKEN__HOLDER:
    		return getHolder();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.FORKED_TOKEN__BASE_TOKEN:
    		return getBaseToken();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.FORKED_TOKEN__REMAINING_OFFERS_COUNT:
    		return new java.lang.Integer(getRemainingOffersCount());
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.FORKED_TOKEN__HOLDER:
    		return getHolder() != null;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.FORKED_TOKEN__BASE_TOKEN:
    		return getBaseToken() != null;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.FORKED_TOKEN__REMAINING_OFFERS_COUNT:
    		return getRemainingOffersCount() != REMAINING_OFFERS_COUNT_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.FORKED_TOKEN__HOLDER:
    		setHolder(
    		(org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivityNode)
    		 newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.FORKED_TOKEN__BASE_TOKEN:
    		setBaseToken(
    		(org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.Token)
    		 newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.FORKED_TOKEN__REMAINING_OFFERS_COUNT:
    		setRemainingOffersCount(((java.lang.Integer) newValue).intValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
