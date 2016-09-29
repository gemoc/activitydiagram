package org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagram.adapters.concurrentactivitydiagrammt.activitydiagram;

import activitydiagram.Token;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class TokenAdapter extends EObjectAdapter<Token> implements org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.Token {
  private org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagram.adapters.concurrentactivitydiagrammt.ConcurrentActivityDiagramMTAdaptersFactory adaptersFactory;
  
  public TokenAdapter() {
    super(org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagram.adapters.concurrentactivitydiagrammt.ConcurrentActivityDiagramMTAdaptersFactory.getInstance());
    adaptersFactory = org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagram.adapters.concurrentactivitydiagrammt.ConcurrentActivityDiagramMTAdaptersFactory.getInstance();
  }
  
  @Override
  public org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivityNode getHolder() {
    return () adaptersFactory.createAdapter(adaptee.getHolder(), eResource);
  }
  
  @Override
  public void setHolder(final org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivityNode o) {
    if (o != null)
    	adaptee.setHolder(((org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagram.adapters.concurrentactivitydiagrammt.activitydiagram.ActivityNodeAdapter) o).getAdaptee());
    else adaptee.setHolder(null);
  }
  
  @Override
  public EClass eClass() {
    return org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage.eINSTANCE.getToken();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage.TOKEN__HOLDER:
    		return getHolder();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage.TOKEN__HOLDER:
    		return getHolder() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage.TOKEN__HOLDER:
    		setHolder(
    		(org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivityNode)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
