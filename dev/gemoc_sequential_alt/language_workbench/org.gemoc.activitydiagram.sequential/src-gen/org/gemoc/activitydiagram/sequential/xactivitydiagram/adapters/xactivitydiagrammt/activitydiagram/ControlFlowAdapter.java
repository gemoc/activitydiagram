package org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlFlow;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivityNode;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.BooleanVariable;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ControlToken;

@SuppressWarnings("all")
public class ControlFlowAdapter extends EObjectAdapter<ControlFlow> implements org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ControlFlow {
  private XActivityDiagramMTAdaptersFactory adaptersFactory;
  
  public ControlFlowAdapter() {
    super(org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory.getInstance();
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
  public ActivityNode getSource() {
    return (ActivityNode) adaptersFactory.createAdapter(adaptee.getSource(), eResource);
  }
  
  @Override
  public void setSource(final ActivityNode o) {
    if (o != null)
    	adaptee.setSource(((org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.ActivityNodeAdapter) o).getAdaptee());
    else adaptee.setSource(null);
  }
  
  @Override
  public ActivityNode getTarget() {
    return (ActivityNode) adaptersFactory.createAdapter(adaptee.getTarget(), eResource);
  }
  
  @Override
  public void setTarget(final ActivityNode o) {
    if (o != null)
    	adaptee.setTarget(((org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.ActivityNodeAdapter) o).getAdaptee());
    else adaptee.setTarget(null);
  }
  
  @Override
  public BooleanVariable getGuard() {
    return (BooleanVariable) adaptersFactory.createAdapter(adaptee.getGuard(), eResource);
  }
  
  @Override
  public void setGuard(final BooleanVariable o) {
    if (o != null)
    	adaptee.setGuard(((org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.BooleanVariableAdapter) o).getAdaptee());
    else adaptee.setGuard(null);
  }
  
  @Override
  public boolean hasOffer() {
    return org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityEdgeAspect.hasOffer(adaptee);
  }
  
  @Override
  public EList<ControlToken> getOfferedTokens() {
    return fr.inria.diverse.melange.adapters.EListAdapter.newInstance(org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityEdgeAspect.offeredTokens(adaptee), adaptersFactory, eResource);
  }
  
  @Override
  public void sendOffer(final ControlToken token) {
    org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityEdgeAspect.sendOffer(adaptee, (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken)((EObjectAdapter)token).getAdaptee()
    );
  }
  
  @Override
  public ControlToken takeOfferedToken() {
    return (ControlToken) adaptersFactory.createAdapter(org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityEdgeAspect.takeOfferedToken(adaptee), eResource);
  }
  
  @Override
  public void execute() {
    org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.NamedElementAspect.execute(adaptee);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.eINSTANCE.getControlFlow();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.CONTROL_FLOW__NAME:
    		return getName();
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.CONTROL_FLOW__SOURCE:
    		return getSource();
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.CONTROL_FLOW__TARGET:
    		return getTarget();
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.CONTROL_FLOW__OFFERED_TOKENS:
    		return getOfferedTokens();
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.CONTROL_FLOW__GUARD:
    		return getGuard();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.CONTROL_FLOW__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.CONTROL_FLOW__SOURCE:
    		return getSource() != null;
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.CONTROL_FLOW__TARGET:
    		return getTarget() != null;
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.CONTROL_FLOW__OFFERED_TOKENS:
    		return getOfferedTokens() != null && !getOfferedTokens().isEmpty();
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.CONTROL_FLOW__GUARD:
    		return getGuard() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.CONTROL_FLOW__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.CONTROL_FLOW__SOURCE:
    		setSource(
    		(org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivityNode)
    		 newValue);
    		return;
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.CONTROL_FLOW__TARGET:
    		setTarget(
    		(org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivityNode)
    		 newValue);
    		return;
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.CONTROL_FLOW__OFFERED_TOKENS:
    		getOfferedTokens().clear();
    		getOfferedTokens().addAll((Collection) newValue);
    		return;
    	case org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.CONTROL_FLOW__GUARD:
    		setGuard(
    		(org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.BooleanVariable)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
