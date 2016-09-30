package org.gemoc.activitydiagram.concurrent.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.ForkedToken;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory;
import org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.ActivityNode;
import org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.Token;

@SuppressWarnings("all")
public class ForkedTokenAdapter extends EObjectAdapter<ForkedToken> implements org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.ForkedToken {
  private XActivityDiagramMTAdaptersFactory adaptersFactory;
  
  public ForkedTokenAdapter() {
    super(org.gemoc.activitydiagram.concurrent.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.activitydiagram.concurrent.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Token getBaseToken() {
    return (Token) adaptersFactory.createAdapter(org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ForkedTokenAspect.baseToken(adaptee), eResource);
  }
  
  @Override
  public void setBaseToken(final Token baseToken) {
    org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ForkedTokenAspect.baseToken(adaptee, (org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Token)((EObjectAdapter)baseToken).getAdaptee()
    );
  }
  
  @Override
  public int getRemainingOffersCount() {
    return org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ForkedTokenAspect.remainingOffersCount(adaptee);
  }
  
  @Override
  public void setRemainingOffersCount(final int remainingOffersCount) {
    org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ForkedTokenAspect.remainingOffersCount(adaptee, remainingOffersCount
    );
  }
  
  @Override
  public ActivityNode getHolder() {
    return (ActivityNode) adaptersFactory.createAdapter(org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.TokenAspect.holder(adaptee), eResource);
  }
  
  @Override
  public void setHolder(final ActivityNode holder) {
    org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.TokenAspect.holder(adaptee, (org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.ActivityNode)((EObjectAdapter)holder).getAdaptee()
    );
  }
  
  protected final static int REMAINING_OFFERS_COUNT_EDEFAULT = 0;
  
  @Override
  public EClass eClass() {
    return org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.eINSTANCE.getForkedToken();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.FORKED_TOKEN__HOLDER:
    		return getHolder();
    	case org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.FORKED_TOKEN__BASE_TOKEN:
    		return getBaseToken();
    	case org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.FORKED_TOKEN__REMAINING_OFFERS_COUNT:
    		return new java.lang.Integer(getRemainingOffersCount());
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.FORKED_TOKEN__HOLDER:
    		return getHolder() != null;
    	case org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.FORKED_TOKEN__BASE_TOKEN:
    		return getBaseToken() != null;
    	case org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.FORKED_TOKEN__REMAINING_OFFERS_COUNT:
    		return getRemainingOffersCount() != REMAINING_OFFERS_COUNT_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.FORKED_TOKEN__HOLDER:
    		setHolder(
    		(org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.ActivityNode)
    		 newValue);
    		return;
    	case org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.FORKED_TOKEN__BASE_TOKEN:
    		setBaseToken(
    		(org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.Token)
    		 newValue);
    		return;
    	case org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.FORKED_TOKEN__REMAINING_OFFERS_COUNT:
    		setRemainingOffersCount(((java.lang.Integer) newValue).intValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
