package org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.adapters.sequentialactivitydiagrammt;

import fr.inria.diverse.melange.adapters.EListAdapter;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.activitydiagram.OpaqueAction;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.adapters.sequentialactivitydiagrammt.SequentialActivityDiagramMTAdaptersFactory;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.Activity;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivityEdge;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.Expression;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.Token;

@SuppressWarnings("all")
public class OpaqueActionAdapter extends EObjectAdapter<OpaqueAction> implements org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.OpaqueAction {
  private SequentialActivityDiagramMTAdaptersFactory adaptersFactory;
  
  public OpaqueActionAdapter() {
    super(org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.adapters.sequentialactivitydiagrammt.SequentialActivityDiagramMTAdaptersFactory.getInstance()) ;
    adaptersFactory = org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.adapters.sequentialactivitydiagrammt.SequentialActivityDiagramMTAdaptersFactory.getInstance() ;
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
    	adaptee.setActivity(((org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.adapters.sequentialactivitydiagrammt.ActivityAdapter) o).getAdaptee()) ;
    else adaptee.setActivity(null) ;
  }
  
  private EList<Token> heldTokens;
  
  @Override
  public EList<Token> getHeldTokens() {
    if (heldTokens == null)
    	heldTokens = EListAdapter.newInstance(adaptee.getHeldTokens(), adaptersFactory) ;
    return heldTokens;
  }
  
  private EList<Expression> expressions;
  
  @Override
  public EList<Expression> getExpressions() {
    if (expressions == null)
    	expressions = EListAdapter.newInstance(adaptee.getExpressions(), adaptersFactory) ;
    return expressions;
  }
  
  @Override
  public EClass eClass() {
    return org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage.eINSTANCE.getOpaqueAction();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage.OPAQUE_ACTION__NAME:
    		return getName();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage.OPAQUE_ACTION__OUTGOING:
    		return getOutgoing();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage.OPAQUE_ACTION__INCOMING:
    		return getIncoming();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage.OPAQUE_ACTION__ACTIVITY:
    		return getActivity();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage.OPAQUE_ACTION__RUNNING:
    		return isRunning();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage.OPAQUE_ACTION__HELD_TOKENS:
    		return getHeldTokens();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage.OPAQUE_ACTION__EXPRESSIONS:
    		return getExpressions();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage.OPAQUE_ACTION__NAME:
    		setName((String) newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage.OPAQUE_ACTION__OUTGOING:
    		getOutgoing().clear();
    		getOutgoing().addAll((Collection<? extends ActivityEdge>) newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage.OPAQUE_ACTION__INCOMING:
    		getIncoming().clear();
    		getIncoming().addAll((Collection<? extends ActivityEdge>) newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage.OPAQUE_ACTION__ACTIVITY:
    		setActivity((Activity) newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage.OPAQUE_ACTION__RUNNING:
    		setRunning((boolean) newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage.OPAQUE_ACTION__HELD_TOKENS:
    		getHeldTokens().clear();
    		getHeldTokens().addAll((Collection<? extends Token>) newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage.OPAQUE_ACTION__EXPRESSIONS:
    		getExpressions().clear();
    		getExpressions().addAll((Collection<? extends Expression>) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage.OPAQUE_ACTION__NAME:
    		setName((String) null);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage.OPAQUE_ACTION__OUTGOING:
    		getOutgoing().clear();
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage.OPAQUE_ACTION__INCOMING:
    		getIncoming().clear();
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage.OPAQUE_ACTION__ACTIVITY:
    		setActivity((Activity) null);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage.OPAQUE_ACTION__RUNNING:
    		setRunning((Boolean) null);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage.OPAQUE_ACTION__HELD_TOKENS:
    		getHeldTokens().clear();
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagrammt.activitydiagram.ActivitydiagramPackage.OPAQUE_ACTION__EXPRESSIONS:
    		getExpressions().clear();
    		return;
    }
    
    super.eUnset(featureID);
  }
}
