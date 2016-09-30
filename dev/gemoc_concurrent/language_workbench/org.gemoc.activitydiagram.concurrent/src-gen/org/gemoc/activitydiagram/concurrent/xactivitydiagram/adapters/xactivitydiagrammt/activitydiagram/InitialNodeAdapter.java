package org.gemoc.activitydiagram.concurrent.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.InitialNode;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory;
import org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.Activity;
import org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.ActivityEdge;
import org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.Token;

@SuppressWarnings("all")
public class InitialNodeAdapter extends EObjectAdapter<InitialNode> implements org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.InitialNode {
  private XActivityDiagramMTAdaptersFactory adaptersFactory;
  
  public InitialNodeAdapter() {
    super(org.gemoc.activitydiagram.concurrent.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.activitydiagram.concurrent.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
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
    	adaptee.setActivity(((org.gemoc.activitydiagram.concurrent.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.ActivityAdapter) o).getAdaptee());
    else adaptee.setActivity(null);
  }
  
  @Override
  public void execute() {
    org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.InitialNodeAspect.execute(adaptee);
  }
  
  @Override
  public void addTokens(final EList<Token> tokens) {
    org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityNodeAspect.addTokens(adaptee, ((fr.inria.diverse.melange.adapters.EListAdapter) tokens).getAdaptee()
    );
  }
  
  @Override
  public EList<Token> getHeldTokens() {
    return fr.inria.diverse.melange.adapters.EListAdapter.newInstance(org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityNodeAspect.heldTokens(adaptee), adaptersFactory, eResource);
  }
  
  @Override
  public void removeToken(final Token token) {
    org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityNodeAspect.removeToken(adaptee, (org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Token)((EObjectAdapter)token).getAdaptee()
    );
  }
  
  @Override
  public Boolean getRunning() {
    return org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityNodeAspect.running(adaptee);
  }
  
  @Override
  public void setRunning(final Boolean running) {
    org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityNodeAspect.running(adaptee, running
    );
  }
  
  @Override
  public void terminate() {
    org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityNodeAspect.terminate(adaptee);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static Boolean RUNNING_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.eINSTANCE.getInitialNode();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.INITIAL_NODE__NAME:
    		return getName();
    	case org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.INITIAL_NODE__OUTGOING:
    		return getOutgoing();
    	case org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.INITIAL_NODE__INCOMING:
    		return getIncoming();
    	case org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.INITIAL_NODE__ACTIVITY:
    		return getActivity();
    	case org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.INITIAL_NODE__HELD_TOKENS:
    		return getHeldTokens();
    	case org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.INITIAL_NODE__RUNNING:
    		return getRunning();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.INITIAL_NODE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.INITIAL_NODE__OUTGOING:
    		return getOutgoing() != null && !getOutgoing().isEmpty();
    	case org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.INITIAL_NODE__INCOMING:
    		return getIncoming() != null && !getIncoming().isEmpty();
    	case org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.INITIAL_NODE__ACTIVITY:
    		return getActivity() != null;
    	case org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.INITIAL_NODE__HELD_TOKENS:
    		return getHeldTokens() != null && !getHeldTokens().isEmpty();
    	case org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.INITIAL_NODE__RUNNING:
    		return getRunning() != RUNNING_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.INITIAL_NODE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.INITIAL_NODE__OUTGOING:
    		getOutgoing().clear();
    		getOutgoing().addAll((Collection) newValue);
    		return;
    	case org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.INITIAL_NODE__INCOMING:
    		getIncoming().clear();
    		getIncoming().addAll((Collection) newValue);
    		return;
    	case org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.INITIAL_NODE__ACTIVITY:
    		setActivity(
    		(org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.Activity)
    		 newValue);
    		return;
    	case org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.INITIAL_NODE__HELD_TOKENS:
    		getHeldTokens().clear();
    		getHeldTokens().addAll((Collection) newValue);
    		return;
    	case org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.INITIAL_NODE__RUNNING:
    		setRunning(
    		(java.lang.Boolean)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
