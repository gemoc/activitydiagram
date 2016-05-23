package org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.Offer;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.Token;

@SuppressWarnings("all")
public class OfferAdapter extends EObjectAdapter<Offer> implements org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.Offer {
  private XActivityDiagramMTAdaptersFactory adaptersFactory;
  
  public OfferAdapter() {
    super(org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory.getInstance());
    adaptersFactory = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory.getInstance();
  }
  
  private EList<Token> offeredTokens_;
  
  @Override
  public EList<Token> getOfferedTokens() {
    if (offeredTokens_ == null)
    	offeredTokens_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOfferedTokens(), adaptersFactory, eResource);
    return offeredTokens_;
  }
  
  @Override
  public boolean hasTokens1() {
    return org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.OfferAspect.hasTokens1(adaptee);
  }
  
  @Override
  public void removeWithdrawnTokens1() {
    org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.OfferAspect.removeWithdrawnTokens1(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.eINSTANCE.getOffer();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.OFFER__OFFERED_TOKENS:
    		return getOfferedTokens();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.OFFER__OFFERED_TOKENS:
    		return getOfferedTokens() != null && !getOfferedTokens().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.OFFER__OFFERED_TOKENS:
    		getOfferedTokens().clear();
    		getOfferedTokens().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
