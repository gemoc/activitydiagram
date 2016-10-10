package org.gemoc.activitydiagram.concurrent.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Context;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory;
import org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.Activity;
import org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.JoinNode;
import org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.Trace;

@SuppressWarnings("all")
public class ContextAdapter extends EObjectAdapter<Context> implements org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.Context {
  private XActivityDiagramMTAdaptersFactory adaptersFactory;
  
  public ContextAdapter() {
    super(org.gemoc.activitydiagram.concurrent.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.activitydiagram.concurrent.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Activity getActivity() {
    return (Activity) adaptersFactory.createAdapter(org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ContextAspect.activity(adaptee), eResource);
  }
  
  @Override
  public void setActivity(final Activity activity) {
    org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ContextAspect.activity(adaptee, (org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Activity)((EObjectAdapter)activity).getAdaptee()
    );
  }
  
  @Override
  public JoinNode getNode() {
    return (JoinNode) adaptersFactory.createAdapter(org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ContextAspect.node(adaptee), eResource);
  }
  
  @Override
  public void setNode(final JoinNode node) {
    org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ContextAspect.node(adaptee, (org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.JoinNode)((EObjectAdapter)node).getAdaptee()
    );
  }
  
  @Override
  public Trace getOutput() {
    return (Trace) adaptersFactory.createAdapter(org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ContextAspect.output(adaptee), eResource);
  }
  
  @Override
  public void setOutput(final Trace output) {
    org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ContextAspect.output(adaptee, (org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Trace)((EObjectAdapter)output).getAdaptee()
    );
  }
  
  @Override
  public org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.Context getParent() {
    return (org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.Context) adaptersFactory.createAdapter(org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ContextAspect.parent(adaptee), eResource);
  }
  
  @Override
  public void setParent(final org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.Context parent) {
    org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ContextAspect.parent(adaptee, (org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Context)((EObjectAdapter)parent).getAdaptee()
    );
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.eINSTANCE.getContext();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.CONTEXT__OUTPUT:
    		return getOutput();
    	case org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.CONTEXT__ACTIVITY:
    		return getActivity();
    	case org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.CONTEXT__PARENT:
    		return getParent();
    	case org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.CONTEXT__NODE:
    		return getNode();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.CONTEXT__OUTPUT:
    		return getOutput() != null;
    	case org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.CONTEXT__ACTIVITY:
    		return getActivity() != null;
    	case org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.CONTEXT__PARENT:
    		return getParent() != null;
    	case org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.CONTEXT__NODE:
    		return getNode() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.CONTEXT__OUTPUT:
    		setOutput(
    		(org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.Trace)
    		 newValue);
    		return;
    	case org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.CONTEXT__ACTIVITY:
    		setActivity(
    		(org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.Activity)
    		 newValue);
    		return;
    	case org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.CONTEXT__PARENT:
    		setParent(
    		(org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.Context)
    		 newValue);
    		return;
    	case org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.CONTEXT__NODE:
    		setNode(
    		(org.gemoc.activitydiagram.concurrent.xactivitydiagrammt.activitydiagram.JoinNode)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
