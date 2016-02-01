package org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagram.adapters.sequentialactivitydiagrammt;

import activitydiagram.Token;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagram.adapters.sequentialactivitydiagrammt.SequentialActivityDiagramMTAdaptersFactory;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivityNode;

@SuppressWarnings("all")
public class TokenAdapter extends EObjectAdapter<Token> implements org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.Token {
  private SequentialActivityDiagramMTAdaptersFactory adaptersFactory;
  
  public TokenAdapter() {
    super(org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagram.adapters.sequentialactivitydiagrammt.SequentialActivityDiagramMTAdaptersFactory.getInstance()) ;
    adaptersFactory = org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagram.adapters.sequentialactivitydiagrammt.SequentialActivityDiagramMTAdaptersFactory.getInstance() ;
  }
  
  private ActivityNode holder;
  
  @Override
  public ActivityNode getHolder() {
    return (ActivityNode) adaptersFactory.createAdapter(adaptee.getHolder(), eResource) ;
  }
  
  @Override
  public void setHolder(final ActivityNode o) {
    if (o != null)
    	adaptee.setHolder(((org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagram.adapters.sequentialactivitydiagrammt.ActivityNodeAdapter) o).getAdaptee()) ;
    else adaptee.setHolder(null) ;
  }
  
  @Override
  public EClass eClass() {
    return org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage.eINSTANCE.getToken();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage.TOKEN__HOLDER:
    		return getHolder();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage.TOKEN__HOLDER:
    		setHolder((org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivityNode) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage.TOKEN__HOLDER:
    		setHolder((org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivityNode) null);
    		return;
    }
    
    super.eUnset(featureID);
  }
}
