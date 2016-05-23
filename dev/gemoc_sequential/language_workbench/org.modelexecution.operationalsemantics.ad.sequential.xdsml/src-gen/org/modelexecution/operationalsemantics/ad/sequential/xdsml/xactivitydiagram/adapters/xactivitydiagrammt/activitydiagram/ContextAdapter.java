package org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.Context;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.Activity;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.InputValue;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.JoinNode;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.Trace;

@SuppressWarnings("all")
public class ContextAdapter extends EObjectAdapter<Context> implements org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.Context {
  private XActivityDiagramMTAdaptersFactory adaptersFactory;
  
  public ContextAdapter() {
    super(org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory.getInstance());
    adaptersFactory = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Trace getOutput() {
    return (Trace) adaptersFactory.createAdapter(adaptee.getOutput(), eResource);
  }
  
  @Override
  public void setOutput(final Trace o) {
    if (o != null)
    	adaptee.setOutput(((org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.TraceAdapter) o).getAdaptee());
    else adaptee.setOutput(null);
  }
  
  @Override
  public Activity getActivity() {
    return (Activity) adaptersFactory.createAdapter(adaptee.getActivity(), eResource);
  }
  
  @Override
  public void setActivity(final Activity o) {
    if (o != null)
    	adaptee.setActivity(((org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.ActivityAdapter) o).getAdaptee());
    else adaptee.setActivity(null);
  }
  
  @Override
  public org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.Context getParent() {
    return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.Context) adaptersFactory.createAdapter(adaptee.getParent(), eResource);
  }
  
  @Override
  public void setParent(final org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.Context o) {
    if (o != null)
    	adaptee.setParent(((org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.ContextAdapter) o).getAdaptee());
    else adaptee.setParent(null);
  }
  
  private EList<InputValue> inputValues_;
  
  @Override
  public EList<InputValue> getInputValues() {
    if (inputValues_ == null)
    	inputValues_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getInputValues(), adaptersFactory, eResource);
    return inputValues_;
  }
  
  @Override
  public JoinNode getNode() {
    return (JoinNode) adaptersFactory.createAdapter(adaptee.getNode(), eResource);
  }
  
  @Override
  public void setNode(final JoinNode o) {
    if (o != null)
    	adaptee.setNode(((org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.JoinNodeAdapter) o).getAdaptee());
    else adaptee.setNode(null);
  }
  
  @Override
  public EClass eClass() {
    return org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.eINSTANCE.getContext();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.CONTEXT__OUTPUT:
    		return getOutput();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.CONTEXT__ACTIVITY:
    		return getActivity();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.CONTEXT__PARENT:
    		return getParent();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.CONTEXT__INPUT_VALUES:
    		return getInputValues();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.CONTEXT__NODE:
    		return getNode();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.CONTEXT__OUTPUT:
    		return getOutput() != null;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.CONTEXT__ACTIVITY:
    		return getActivity() != null;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.CONTEXT__PARENT:
    		return getParent() != null;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.CONTEXT__INPUT_VALUES:
    		return getInputValues() != null && !getInputValues().isEmpty();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.CONTEXT__NODE:
    		return getNode() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.CONTEXT__OUTPUT:
    		setOutput(
    		(org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.Trace)
    		 newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.CONTEXT__ACTIVITY:
    		setActivity(
    		(org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.Activity)
    		 newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.CONTEXT__PARENT:
    		setParent(
    		(org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.Context)
    		 newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.CONTEXT__INPUT_VALUES:
    		getInputValues().clear();
    		getInputValues().addAll((Collection) newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.CONTEXT__NODE:
    		setNode(
    		(org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.JoinNode)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
