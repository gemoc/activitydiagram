package org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.adapters.sequentialactivitydiagramextendedmt;

import fr.inria.diverse.melange.adapters.EListAdapter;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.ecore.EClass;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivityNode;

@SuppressWarnings("all")
public class TraceAdapter extends /* EObjectAdapter<org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.activitydiagram.Trace> */ implements org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.Trace {
  private org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.adapters.sequentialactivitydiagramextendedmt.SequentialActivityDiagramExtendedMTAdaptersFactory adaptersFactory;
  
  public TraceAdapter() {
    super(org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.adapters.sequentialactivitydiagramextendedmt.SequentialActivityDiagramExtendedMTAdaptersFactory.getInstance()) ;
    adaptersFactory = org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.adapters.sequentialactivitydiagramextendedmt.SequentialActivityDiagramExtendedMTAdaptersFactory.getInstance() ;
  }
  
  private org.eclipse.emf.common.util.EList executedNodes;
  
  @Override
  public org.eclipse.emf.common.util.EList getExecutedNodes() {
    if (executedNodes == null)
    	executedNodes = EListAdapter.newInstance(adaptee.getExecutedNodes(), adaptersFactory) ;
    return executedNodes;
  }
  
  @Override
  public EClass eClass() {
    return org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivitydiagramPackage.eINSTANCE.getTrace();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivitydiagramPackage.TRACE__EXECUTED_NODES:
    		return getExecutedNodes();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivitydiagramPackage.TRACE__EXECUTED_NODES:
    		getExecutedNodes().clear();
    		getExecutedNodes().addAll((Collection<? extends ActivityNode>) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivitydiagramPackage.TRACE__EXECUTED_NODES:
    		getExecutedNodes().clear();
    		return;
    }
    
    super.eUnset(featureID);
  }
}
