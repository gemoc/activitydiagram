package org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram;

import activitydiagram.Activity;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.ActivityDiagramMTAdaptersFactory;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivityEdge;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivityNode;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.Trace;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.Variable;

@SuppressWarnings("all")
public class ActivityAdapter extends EObjectAdapter<Activity> implements org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.Activity {
  private ActivityDiagramMTAdaptersFactory adaptersFactory;
  
  public ActivityAdapter() {
    super(org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.ActivityDiagramMTAdaptersFactory.getInstance());
    adaptersFactory = org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.ActivityDiagramMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }
  
  private EList<ActivityNode> nodes_;
  
  @Override
  public EList<ActivityNode> getNodes() {
    if (nodes_ == null)
    	nodes_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getNodes(), adaptersFactory, eResource);
    return nodes_;
  }
  
  private EList<ActivityEdge> edges_;
  
  @Override
  public EList<ActivityEdge> getEdges() {
    if (edges_ == null)
    	edges_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getEdges(), adaptersFactory, eResource);
    return edges_;
  }
  
  private EList<Variable> locals_;
  
  @Override
  public EList<Variable> getLocals() {
    if (locals_ == null)
    	locals_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getLocals(), adaptersFactory, eResource);
    return locals_;
  }
  
  private EList<Variable> inputs_;
  
  @Override
  public EList<Variable> getInputs() {
    if (inputs_ == null)
    	inputs_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getInputs(), adaptersFactory, eResource);
    return inputs_;
  }
  
  @Override
  public Trace getTrace() {
    return (Trace) adaptersFactory.createAdapter(adaptee.getTrace(), eResource);
  }
  
  @Override
  public void setTrace(final Trace o) {
    if (o != null)
    	adaptee.setTrace(((org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagram.adapters.activitydiagrammt.activitydiagram.TraceAdapter) o).getAdaptee());
    else adaptee.setTrace(null);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage.eINSTANCE.getActivity();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__NAME:
    		return getName();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__NODES:
    		return getNodes();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__EDGES:
    		return getEdges();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__LOCALS:
    		return getLocals();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__INPUTS:
    		return getInputs();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__TRACE:
    		return getTrace();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__NODES:
    		return getNodes() != null && !getNodes().isEmpty();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__EDGES:
    		return getEdges() != null && !getEdges().isEmpty();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__LOCALS:
    		return getLocals() != null && !getLocals().isEmpty();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__INPUTS:
    		return getInputs() != null && !getInputs().isEmpty();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__TRACE:
    		return getTrace() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__NODES:
    		getNodes().clear();
    		getNodes().addAll((Collection) newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__EDGES:
    		getEdges().clear();
    		getEdges().addAll((Collection) newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__LOCALS:
    		getLocals().clear();
    		getLocals().addAll((Collection) newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__INPUTS:
    		getInputs().clear();
    		getInputs().addAll((Collection) newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__TRACE:
    		setTrace(
    		(org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.Trace)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
