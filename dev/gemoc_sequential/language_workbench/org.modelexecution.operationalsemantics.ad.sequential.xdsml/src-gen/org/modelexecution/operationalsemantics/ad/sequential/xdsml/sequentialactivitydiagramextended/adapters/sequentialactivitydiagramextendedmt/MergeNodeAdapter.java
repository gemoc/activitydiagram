package org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.adapters.sequentialactivitydiagramextendedmt;

import fr.inria.diverse.melange.adapters.EListAdapter;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.ecore.EClass;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.Activity;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivityEdge;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.Token;

@SuppressWarnings("all")
public class MergeNodeAdapter extends /* EObjectAdapter<org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.activitydiagram.MergeNode> */ implements org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.MergeNode {
  private org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.adapters.sequentialactivitydiagramextendedmt.SequentialActivityDiagramExtendedMTAdaptersFactory adaptersFactory;
  
  public MergeNodeAdapter() {
    super(org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.adapters.sequentialactivitydiagramextendedmt.SequentialActivityDiagramExtendedMTAdaptersFactory.getInstance()) ;
    adaptersFactory = org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.adapters.sequentialactivitydiagramextendedmt.SequentialActivityDiagramExtendedMTAdaptersFactory.getInstance() ;
  }
  
  @Override
  public java.lang.String getName() {
    return adaptee.getName() ;
  }
  
  @Override
  public void setName(final java.lang.String o) {
    adaptee.setName(o) ;
  }
  
  @Override
  public boolean isRunning() {
    return adaptee.isRunning() ;
  }
  
  @Override
  public void setRunning(final boolean o) {
    adaptee.setRunning(o) ;
  }
  
  private org.eclipse.emf.common.util.EList outgoing;
  
  @Override
  public org.eclipse.emf.common.util.EList getOutgoing() {
    if (outgoing == null)
    	outgoing = EListAdapter.newInstance(adaptee.getOutgoing(), adaptersFactory) ;
    return outgoing;
  }
  
  private org.eclipse.emf.common.util.EList incoming;
  
  @Override
  public org.eclipse.emf.common.util.EList getIncoming() {
    if (incoming == null)
    	incoming = EListAdapter.newInstance(adaptee.getIncoming(), adaptersFactory) ;
    return incoming;
  }
  
  private org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.Activity activity;
  
  @Override
  public org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.Activity getActivity() {
    return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.Activity) adaptersFactory.createAdapter(adaptee.getActivity(), eResource) ;
  }
  
  @Override
  public void setActivity(final org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.Activity o) {
    if (o != null)
    	adaptee.setActivity(((org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.adapters.sequentialactivitydiagramextendedmt.ActivityAdapter) o).getAdaptee()) ;
    else adaptee.setActivity(null) ;
  }
  
  private org.eclipse.emf.common.util.EList heldTokens;
  
  @Override
  public org.eclipse.emf.common.util.EList getHeldTokens() {
    if (heldTokens == null)
    	heldTokens = EListAdapter.newInstance(adaptee.getHeldTokens(), adaptersFactory) ;
    return heldTokens;
  }
  
  @Override
  public EClass eClass() {
    return org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivitydiagramPackage.eINSTANCE.getMergeNode();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivitydiagramPackage.MERGE_NODE__NAME:
    		return getName();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivitydiagramPackage.MERGE_NODE__OUTGOING:
    		return getOutgoing();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivitydiagramPackage.MERGE_NODE__INCOMING:
    		return getIncoming();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivitydiagramPackage.MERGE_NODE__ACTIVITY:
    		return getActivity();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivitydiagramPackage.MERGE_NODE__RUNNING:
    		return isRunning();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivitydiagramPackage.MERGE_NODE__HELD_TOKENS:
    		return getHeldTokens();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivitydiagramPackage.MERGE_NODE__NAME:
    		setName((String) newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivitydiagramPackage.MERGE_NODE__OUTGOING:
    		getOutgoing().clear();
    		getOutgoing().addAll((Collection<? extends ActivityEdge>) newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivitydiagramPackage.MERGE_NODE__INCOMING:
    		getIncoming().clear();
    		getIncoming().addAll((Collection<? extends ActivityEdge>) newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivitydiagramPackage.MERGE_NODE__ACTIVITY:
    		setActivity((Activity) newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivitydiagramPackage.MERGE_NODE__RUNNING:
    		setRunning((boolean) newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivitydiagramPackage.MERGE_NODE__HELD_TOKENS:
    		getHeldTokens().clear();
    		getHeldTokens().addAll((Collection<? extends Token>) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivitydiagramPackage.MERGE_NODE__NAME:
    		setName((String) null);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivitydiagramPackage.MERGE_NODE__OUTGOING:
    		getOutgoing().clear();
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivitydiagramPackage.MERGE_NODE__INCOMING:
    		getIncoming().clear();
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivitydiagramPackage.MERGE_NODE__ACTIVITY:
    		setActivity((Activity) null);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivitydiagramPackage.MERGE_NODE__RUNNING:
    		setRunning((Boolean) null);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextendedmt.activitydiagram.ActivitydiagramPackage.MERGE_NODE__HELD_TOKENS:
    		getHeldTokens().clear();
    		return;
    }
    
    super.eUnset(featureID);
  }
}
