package org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.adapters.sequentialactivitydiagramextendedmt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivityNode;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.Token;

@SuppressWarnings("all")
public class ForkedTokenAdapter extends /* EObjectAdapter<org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.activitydiagram.ForkedToken> */ implements org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ForkedToken {
  private org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.adapters.sequentialactivitydiagramextendedmt.SequentialActivityDiagramExtendedMTAdaptersFactory adaptersFactory;
  
  public ForkedTokenAdapter() {
    super(org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.adapters.sequentialactivitydiagramextendedmt.SequentialActivityDiagramExtendedMTAdaptersFactory.getInstance()) ;
    adaptersFactory = org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.adapters.sequentialactivitydiagramextendedmt.SequentialActivityDiagramExtendedMTAdaptersFactory.getInstance() ;
  }
  
  @Override
  public int getRemainingOffersCount() {
    return adaptee.getRemainingOffersCount() ;
  }
  
  @Override
  public void setRemainingOffersCount(final int o) {
    adaptee.setRemainingOffersCount(o) ;
  }
  
  private org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivityNode holder;
  
  @Override
  public org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivityNode getHolder() {
    return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivityNode) adaptersFactory.createAdapter(adaptee.getHolder(), eResource) ;
  }
  
  @Override
  public void setHolder(final org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivityNode o) {
    if (o != null)
    	adaptee.setHolder(((org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.adapters.sequentialactivitydiagramextendedmt.ActivityNodeAdapter) o).getAdaptee()) ;
    else adaptee.setHolder(null) ;
  }
  
  private org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.Token baseToken;
  
  @Override
  public org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.Token getBaseToken() {
    return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.Token) adaptersFactory.createAdapter(adaptee.getBaseToken(), eResource) ;
  }
  
  @Override
  public void setBaseToken(final org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.Token o) {
    if (o != null)
    	adaptee.setBaseToken(((org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.adapters.sequentialactivitydiagramextendedmt.TokenAdapter) o).getAdaptee()) ;
    else adaptee.setBaseToken(null) ;
  }
  
  @Override
  public EClass eClass() {
    return org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivitydiagramPackage.eINSTANCE.getForkedToken();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivitydiagramPackage.FORKED_TOKEN__HOLDER:
    		return getHolder();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivitydiagramPackage.FORKED_TOKEN__BASE_TOKEN:
    		return getBaseToken();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivitydiagramPackage.FORKED_TOKEN__REMAINING_OFFERS_COUNT:
    		return getRemainingOffersCount();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivitydiagramPackage.FORKED_TOKEN__HOLDER:
    		setHolder((ActivityNode) newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivitydiagramPackage.FORKED_TOKEN__BASE_TOKEN:
    		setBaseToken((Token) newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivitydiagramPackage.FORKED_TOKEN__REMAINING_OFFERS_COUNT:
    		setRemainingOffersCount((int) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivitydiagramPackage.FORKED_TOKEN__HOLDER:
    		setHolder((ActivityNode) null);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivitydiagramPackage.FORKED_TOKEN__BASE_TOKEN:
    		setBaseToken((Token) null);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivitydiagramPackage.FORKED_TOKEN__REMAINING_OFFERS_COUNT:
    		setRemainingOffersCount((Integer) null);
    		return;
    }
    
    super.eUnset(featureID);
  }
}
