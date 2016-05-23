package org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.activitydiagrammt.activitydiagram;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.Activity;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivityEdge;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.Token;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.Action;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.activitydiagrammt.ActivityDiagramMTAdaptersFactory;

@SuppressWarnings("all")
public class ActionAdapter extends EObjectAdapter<Action> implements org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.Action {
  private ActivityDiagramMTAdaptersFactory adaptersFactory;
  
  public ActionAdapter() {
    super(org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.activitydiagrammt.ActivityDiagramMTAdaptersFactory.getInstance());
    adaptersFactory = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.activitydiagrammt.ActivityDiagramMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }
  
  @Override
  public boolean isRunning() {
    return adaptee.isRunning();
  }
  
  @Override
  public void setRunning(final boolean o) {
    adaptee.setRunning(o);
  }
  
  private EList<ActivityEdge> outgoing_;
  
  @Override
  public EList<ActivityEdge> getOutgoing() {
    if (outgoing_ == null)
    	outgoing_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOutgoing(), adaptersFactory, eResource);
    return outgoing_;
  }
  
  private EList<ActivityEdge> incoming_;
  
  @Override
  public EList<ActivityEdge> getIncoming() {
    if (incoming_ == null)
    	incoming_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getIncoming(), adaptersFactory, eResource);
    return incoming_;
  }
  
  @Override
  public Activity getActivity() {
    return (Activity) adaptersFactory.createAdapter(adaptee.getActivity(), eResource);
  }
  
  @Override
  public void setActivity(final Activity o) {
    if (o != null)
    	adaptee.setActivity(((org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.activitydiagrammt.activitydiagram.ActivityAdapter) o).getAdaptee());
    else adaptee.setActivity(null);
  }
  
  private EList<Token> heldTokens_;
  
  @Override
  public EList<Token> getHeldTokens() {
    if (heldTokens_ == null)
    	heldTokens_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getHeldTokens(), adaptersFactory, eResource);
    return heldTokens_;
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static boolean RUNNING_EDEFAULT = false;
  
  @Override
  public EClass eClass() {
    return org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage.eINSTANCE.getAction();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTION__NAME:
    		return getName();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTION__OUTGOING:
    		return getOutgoing();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTION__INCOMING:
    		return getIncoming();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTION__ACTIVITY:
    		return getActivity();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTION__RUNNING:
    		return isRunning() ? Boolean.TRUE : Boolean.FALSE;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTION__HELD_TOKENS:
    		return getHeldTokens();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTION__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTION__OUTGOING:
    		return getOutgoing() != null && !getOutgoing().isEmpty();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTION__INCOMING:
    		return getIncoming() != null && !getIncoming().isEmpty();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTION__ACTIVITY:
    		return getActivity() != null;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTION__RUNNING:
    		return isRunning() != RUNNING_EDEFAULT;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTION__HELD_TOKENS:
    		return getHeldTokens() != null && !getHeldTokens().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTION__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTION__OUTGOING:
    		getOutgoing().clear();
    		getOutgoing().addAll((Collection) newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTION__INCOMING:
    		getIncoming().clear();
    		getIncoming().addAll((Collection) newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTION__ACTIVITY:
    		setActivity(
    		(org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.Activity)
    		 newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTION__RUNNING:
    		setRunning(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTION__HELD_TOKENS:
    		getHeldTokens().clear();
    		getHeldTokens().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
