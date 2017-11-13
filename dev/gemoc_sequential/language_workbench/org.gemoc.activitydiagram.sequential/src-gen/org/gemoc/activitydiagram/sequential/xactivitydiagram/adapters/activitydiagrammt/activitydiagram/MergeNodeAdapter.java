package org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.activitydiagrammt.activitydiagram;

import activitydiagram.Activity;
import activitydiagram.ActivityEdge;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.MergeNode;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.activitydiagrammt.ActivityDiagramMTAdaptersFactory;

@SuppressWarnings("all")
public class MergeNodeAdapter extends EObjectAdapter<MergeNode> implements activitydiagram.MergeNode {
  private ActivityDiagramMTAdaptersFactory adaptersFactory;
  
  public MergeNodeAdapter() {
    super(org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.activitydiagrammt.ActivityDiagramMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.activitydiagrammt.ActivityDiagramMTAdaptersFactory.getInstance();
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
    	adaptee.setActivity(((org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.activitydiagrammt.activitydiagram.ActivityAdapter) o).getAdaptee());
    else adaptee.setActivity(null);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static boolean RUNNING_EDEFAULT = false;
  
  @Override
  public EClass eClass() {
    return activitydiagram.ActivitydiagramPackage.eINSTANCE.getMergeNode();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case activitydiagram.ActivitydiagramPackage.MERGE_NODE__NAME:
    		return getName();
    	case activitydiagram.ActivitydiagramPackage.MERGE_NODE__OUTGOING:
    		return getOutgoing();
    	case activitydiagram.ActivitydiagramPackage.MERGE_NODE__INCOMING:
    		return getIncoming();
    	case activitydiagram.ActivitydiagramPackage.MERGE_NODE__ACTIVITY:
    		return getActivity();
    	case activitydiagram.ActivitydiagramPackage.MERGE_NODE__RUNNING:
    		return isRunning() ? Boolean.TRUE : Boolean.FALSE;
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case activitydiagram.ActivitydiagramPackage.MERGE_NODE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case activitydiagram.ActivitydiagramPackage.MERGE_NODE__OUTGOING:
    		return getOutgoing() != null && !getOutgoing().isEmpty();
    	case activitydiagram.ActivitydiagramPackage.MERGE_NODE__INCOMING:
    		return getIncoming() != null && !getIncoming().isEmpty();
    	case activitydiagram.ActivitydiagramPackage.MERGE_NODE__ACTIVITY:
    		return getActivity() != null;
    	case activitydiagram.ActivitydiagramPackage.MERGE_NODE__RUNNING:
    		return isRunning() != RUNNING_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case activitydiagram.ActivitydiagramPackage.MERGE_NODE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case activitydiagram.ActivitydiagramPackage.MERGE_NODE__OUTGOING:
    		getOutgoing().clear();
    		getOutgoing().addAll((Collection) newValue);
    		return;
    	case activitydiagram.ActivitydiagramPackage.MERGE_NODE__INCOMING:
    		getIncoming().clear();
    		getIncoming().addAll((Collection) newValue);
    		return;
    	case activitydiagram.ActivitydiagramPackage.MERGE_NODE__ACTIVITY:
    		setActivity(
    		(activitydiagram.Activity)
    		 newValue);
    		return;
    	case activitydiagram.ActivitydiagramPackage.MERGE_NODE__RUNNING:
    		setRunning(((java.lang.Boolean) newValue).booleanValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
