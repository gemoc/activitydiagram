package org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.Activity;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivityEdge;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivityNode;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.Context;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.InputValue;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.Trace;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.Value;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.Variable;

@SuppressWarnings("all")
public class ActivityAdapter extends EObjectAdapter<Activity> implements org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.Activity {
  private XActivityDiagramMTAdaptersFactory adaptersFactory;
  
  public ActivityAdapter() {
    super(org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory.getInstance());
    adaptersFactory = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory.getInstance();
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
    	adaptee.setTrace(((org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.TraceAdapter) o).getAdaptee());
    else adaptee.setTrace(null);
  }
  
  @Override
  public void execute(final Context c) {
    org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityAspect.execute(adaptee, ((org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.ContextAdapter) c).getAdaptee()
    );
  }
  
  @Override
  public boolean getBooleanVariableValue(final String variableName) {
    return org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityAspect.getBooleanVariableValue(adaptee, variableName
    );
  }
  
  @Override
  public int getIntegerVariableValue(final String variableName) {
    return org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityAspect.getIntegerVariableValue(adaptee, variableName
    );
  }
  
  @Override
  public Variable getVariable(final String variableName) {
    return (Variable) adaptersFactory.createAdapter(org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityAspect.getVariable(adaptee, variableName
    ), eResource);
  }
  
  @Override
  public Value getVariableValue(final String variableName) {
    return (Value) adaptersFactory.createAdapter(org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityAspect.getVariableValue(adaptee, variableName
    ), eResource);
  }
  
  @Override
  public void initializeContext(final EList<InputValue> value, final Context context) {
    org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityAspect.initializeContext(adaptee, ((fr.inria.diverse.melange.adapters.EListAdapter) value).getAdaptee()
    , ((org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.ContextAdapter) context).getAdaptee()
    );
  }
  
  @Override
  public void initializeModel(final org.eclipse.emf.common.util.EList<java.lang.String> args) {
    org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityAspect.initializeModel(adaptee, args
    );
  }
  
  @Override
  public void main() {
    org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityAspect.main(adaptee);
  }
  
  @Override
  public String printTrace() {
    return org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityAspect.printTrace(adaptee);
  }
  
  @Override
  public void reset() {
    org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityAspect.reset(adaptee);
  }
  
  @Override
  public void writeToFile() {
    org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityAspect.writeToFile(adaptee);
  }
  
  @Override
  public void writeTrace() {
    org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityAspect.writeTrace(adaptee);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.eINSTANCE.getActivity();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__NAME:
    		return getName();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__NODES:
    		return getNodes();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__EDGES:
    		return getEdges();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__LOCALS:
    		return getLocals();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__INPUTS:
    		return getInputs();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__TRACE:
    		return getTrace();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__NODES:
    		return getNodes() != null && !getNodes().isEmpty();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__EDGES:
    		return getEdges() != null && !getEdges().isEmpty();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__LOCALS:
    		return getLocals() != null && !getLocals().isEmpty();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__INPUTS:
    		return getInputs() != null && !getInputs().isEmpty();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__TRACE:
    		return getTrace() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__NODES:
    		getNodes().clear();
    		getNodes().addAll((Collection) newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__EDGES:
    		getEdges().clear();
    		getEdges().addAll((Collection) newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__LOCALS:
    		getLocals().clear();
    		getLocals().addAll((Collection) newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__INPUTS:
    		getInputs().clear();
    		getInputs().addAll((Collection) newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__TRACE:
    		setTrace(
    		(org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.Trace)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
