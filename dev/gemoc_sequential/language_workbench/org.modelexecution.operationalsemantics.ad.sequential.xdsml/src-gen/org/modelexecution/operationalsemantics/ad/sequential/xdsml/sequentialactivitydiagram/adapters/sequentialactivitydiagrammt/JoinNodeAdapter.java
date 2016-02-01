package org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagram.adapters.sequentialactivitydiagrammt;

import activitydiagram.JoinNode;
import fr.inria.diverse.melange.adapters.EListAdapter;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagram.adapters.sequentialactivitydiagrammt.SequentialActivityDiagramMTAdaptersFactory;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.Activity;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivityEdge;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.Token;

@SuppressWarnings("all")
public class JoinNodeAdapter extends EObjectAdapter<JoinNode> implements org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.JoinNode {
  private SequentialActivityDiagramMTAdaptersFactory adaptersFactory;
  
  public JoinNodeAdapter() {
    super(org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagram.adapters.sequentialactivitydiagrammt.SequentialActivityDiagramMTAdaptersFactory.getInstance()) ;
    adaptersFactory = org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagram.adapters.sequentialactivitydiagrammt.SequentialActivityDiagramMTAdaptersFactory.getInstance() ;
  }
  
  @Override
  public String getName() {
    return adaptee.getName() ;
  }
  
  @Override
  public void setName(final String o) {
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
  
  private EList<ActivityEdge> outgoing;
  
  @Override
  public EList<ActivityEdge> getOutgoing() {
    if (outgoing == null)
    	outgoing = EListAdapter.newInstance(adaptee.getOutgoing(), adaptersFactory) ;
    return outgoing;
  }
  
  private EList<ActivityEdge> incoming;
  
  @Override
  public EList<ActivityEdge> getIncoming() {
    if (incoming == null)
    	incoming = EListAdapter.newInstance(adaptee.getIncoming(), adaptersFactory) ;
    return incoming;
  }
  
  private Activity activity;
  
  @Override
  public Activity getActivity() {
    return (Activity) adaptersFactory.createAdapter(adaptee.getActivity(), eResource) ;
  }
  
  @Override
  public void setActivity(final Activity o) {
    if (o != null)
    	adaptee.setActivity(((org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagram.adapters.sequentialactivitydiagrammt.ActivityAdapter) o).getAdaptee()) ;
    else adaptee.setActivity(null) ;
  }
  
  private EList<Token> heldTokens;
  
  @Override
  public EList<Token> getHeldTokens() {
    if (heldTokens == null)
    	heldTokens = EListAdapter.newInstance(adaptee.getHeldTokens(), adaptersFactory) ;
    return heldTokens;
  }
  
  @Override
  public EClass eClass() {
    return org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage.eINSTANCE.getJoinNode();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage.JOIN_NODE__NAME:
    		return getName();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage.JOIN_NODE__OUTGOING:
    		return getOutgoing();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage.JOIN_NODE__INCOMING:
    		return getIncoming();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage.JOIN_NODE__ACTIVITY:
    		return getActivity();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage.JOIN_NODE__RUNNING:
    		return isRunning();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage.JOIN_NODE__HELD_TOKENS:
    		return getHeldTokens();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage.JOIN_NODE__NAME:
    		setName((java.lang.String) newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage.JOIN_NODE__OUTGOING:
    		getOutgoing().clear();
    		getOutgoing().addAll((Collection<? extends org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivityEdge>) newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage.JOIN_NODE__INCOMING:
    		getIncoming().clear();
    		getIncoming().addAll((Collection<? extends org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivityEdge>) newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage.JOIN_NODE__ACTIVITY:
    		setActivity((org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.Activity) newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage.JOIN_NODE__RUNNING:
    		setRunning((boolean) newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage.JOIN_NODE__HELD_TOKENS:
    		getHeldTokens().clear();
    		getHeldTokens().addAll((Collection<? extends org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.Token>) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage.JOIN_NODE__NAME:
    		setName((java.lang.String) null);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage.JOIN_NODE__OUTGOING:
    		getOutgoing().clear();
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage.JOIN_NODE__INCOMING:
    		getIncoming().clear();
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage.JOIN_NODE__ACTIVITY:
    		setActivity((org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.Activity) null);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage.JOIN_NODE__RUNNING:
    		setRunning((Boolean) null);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage.JOIN_NODE__HELD_TOKENS:
    		getHeldTokens().clear();
    		return;
    }
    
    super.eUnset(featureID);
  }
}
