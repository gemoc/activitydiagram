package org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagram.adapters.concurrentactivitydiagrammt.activitydiagram;

import activitydiagram.Activity;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.modelexecution.operationalsemantics.ad.concurrent.k3.dynamic.Context;

@SuppressWarnings("all")
public class ActivityAdapter extends EObjectAdapter<Activity> implements org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.Activity {
  private org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagram.adapters.concurrentactivitydiagrammt.ConcurrentActivityDiagramMTAdaptersFactory adaptersFactory;
  
  public ActivityAdapter() {
    super(org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagram.adapters.concurrentactivitydiagrammt.ConcurrentActivityDiagramMTAdaptersFactory.getInstance());
    adaptersFactory = org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagram.adapters.concurrentactivitydiagrammt.ConcurrentActivityDiagramMTAdaptersFactory.getInstance();
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
  public String getInputValuePath() {
    return adaptee.getInputValuePath();
  }
  
  @Override
  public void setInputValuePath(final String o) {
    adaptee.setInputValuePath(o);
  }
  
  private /* EList<org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivityNode> */Object nodes;
  
  @Override
  public /* EList<org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivityNode> */Object getNodes() {
    if (nodes == null)
    	nodes = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getNodes(), adaptersFactory);
    return nodes;
  }
  
  private /* EList<org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivityEdge> */Object edges;
  
  @Override
  public /* EList<org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivityEdge> */Object getEdges() {
    if (edges == null)
    	edges = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getEdges(), adaptersFactory);
    return edges;
  }
  
  private /* EList<org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.Variable> */Object locals;
  
  @Override
  public /* EList<org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.Variable> */Object getLocals() {
    if (locals == null)
    	locals = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getLocals(), adaptersFactory);
    return locals;
  }
  
  private /* EList<org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.Variable> */Object inputs;
  
  @Override
  public /* EList<org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.Variable> */Object getInputs() {
    if (inputs == null)
    	inputs = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getInputs(), adaptersFactory);
    return inputs;
  }
  
  private /* EList<org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.Signal> */Object signals;
  
  @Override
  public /* EList<org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.Signal> */Object getSignals() {
    if (signals == null)
    	signals = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getSignals(), adaptersFactory);
    return signals;
  }
  
  @Override
  public Context getContext() {
    return org.modelexecution.operationalsemantics.ad.concurrent.k3.dynamic.ActivityAspect.context(adaptee);
  }
  
  @Override
  public void setContext(final Context context) {
    org.modelexecution.operationalsemantics.ad.concurrent.k3.dynamic.ActivityAspect.context(adaptee, context
    );
  }
  
  @Override
  public void execute() {
    org.modelexecution.operationalsemantics.ad.concurrent.k3.dynamic.ActivityAspect.execute(adaptee);
  }
  
  @Override
  public void finish() {
    org.modelexecution.operationalsemantics.ad.concurrent.k3.dynamic.ActivityAspect.finish(adaptee);
  }
  
  @Override
  public boolean getBooleanVariableValue(final String variableName) {
    return org.modelexecution.operationalsemantics.ad.concurrent.k3.dynamic.ActivityAspect.getBooleanVariableValue(adaptee, variableName
    );
  }
  
  @Override
  public int getIntegerVariableValue(final String variableName) {
    return org.modelexecution.operationalsemantics.ad.concurrent.k3.dynamic.ActivityAspect.getIntegerVariableValue(adaptee, variableName
    );
  }
  
  @Override
  public org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.Variable getVariable(final String variableName) {
    org.modelexecution.operationalsemantics.ad.concurrent.k3.dynamic.ActivityAspect.getVariable(adaptee, variableName
    );
  }
  
  @Override
  public org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.Value getVariableValue(final String variableName) {
    org.modelexecution.operationalsemantics.ad.concurrent.k3.dynamic.ActivityAspect.getVariableValue(adaptee, variableName
    );
  }
  
  @Override
  public void initialize() {
    org.modelexecution.operationalsemantics.ad.concurrent.k3.dynamic.ActivityAspect.initialize(adaptee);
  }
  
  @Override
  public String printTrace() {
    return org.modelexecution.operationalsemantics.ad.concurrent.k3.dynamic.ActivityAspect.printTrace(adaptee);
  }
  
  @Override
  public void reset() {
    org.modelexecution.operationalsemantics.ad.concurrent.k3.dynamic.ActivityAspect.reset(adaptee);
  }
  
  @Override
  public void writeToFile() {
    org.modelexecution.operationalsemantics.ad.concurrent.k3.dynamic.ActivityAspect.writeToFile(adaptee);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static String INPUT_VALUE_PATH_EDEFAULT = null;
  
  protected final static Context CONTEXT_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage.eINSTANCE.getActivity();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__NAME:
    		return getName();
    	case org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__NODES:
    		return getNodes();
    	case org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__EDGES:
    		return getEdges();
    	case org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__LOCALS:
    		return getLocals();
    	case org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__INPUTS:
    		return getInputs();
    	case org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__TRACE:
    		return getTrace();
    	case org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__INPUT_VALUE_PATH:
    		return getInputValuePath();
    	case org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__SIGNALS:
    		return getSignals();
    	case org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__CONTEXT:
    		return getContext();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__NODES:
    		return getNodes() != null && !getNodes().isEmpty();
    	case org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__EDGES:
    		return getEdges() != null && !getEdges().isEmpty();
    	case org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__LOCALS:
    		return getLocals() != null && !getLocals().isEmpty();
    	case org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__INPUTS:
    		return getInputs() != null && !getInputs().isEmpty();
    	case org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__TRACE:
    		return getTrace() != null;
    	case org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__INPUT_VALUE_PATH:
    		return getInputValuePath() != INPUT_VALUE_PATH_EDEFAULT;
    	case org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__SIGNALS:
    		return getSignals() != null && !getSignals().isEmpty();
    	case org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__CONTEXT:
    		return getContext() != CONTEXT_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__NODES:
    		getNodes().clear();
    		getNodes().addAll((Collection) newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__EDGES:
    		getEdges().clear();
    		getEdges().addAll((Collection) newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__LOCALS:
    		getLocals().clear();
    		getLocals().addAll((Collection) newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__INPUTS:
    		getInputs().clear();
    		getInputs().addAll((Collection) newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__TRACE:
    		setTrace(
    		(org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.Trace)
    		 newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__INPUT_VALUE_PATH:
    		setInputValuePath(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__SIGNALS:
    		getSignals().clear();
    		getSignals().addAll((Collection) newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagrammt.activitydiagram.ActivitydiagramPackage.ACTIVITY__CONTEXT:
    		setContext(
    		(org.modelexecution.operationalsemantics.ad.concurrent.k3.dynamic.Context)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
