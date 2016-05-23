package org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.ControlFlow;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivityNode;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.BooleanVariable;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.Context;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.Offer;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.Token;

@SuppressWarnings("all")
public class ControlFlowAdapter extends EObjectAdapter<ControlFlow> implements org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ControlFlow {
  private XActivityDiagramMTAdaptersFactory adaptersFactory;
  
  public ControlFlowAdapter() {
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
  
  @Override
  public ActivityNode getSource() {
    return (ActivityNode) adaptersFactory.createAdapter(adaptee.getSource(), eResource);
  }
  
  @Override
  public void setSource(final ActivityNode o) {
    if (o != null)
    	adaptee.setSource(((org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.ActivityNodeAdapter) o).getAdaptee());
    else adaptee.setSource(null);
  }
  
  @Override
  public ActivityNode getTarget() {
    return (ActivityNode) adaptersFactory.createAdapter(adaptee.getTarget(), eResource);
  }
  
  @Override
  public void setTarget(final ActivityNode o) {
    if (o != null)
    	adaptee.setTarget(((org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.ActivityNodeAdapter) o).getAdaptee());
    else adaptee.setTarget(null);
  }
  
  private EList<Offer> offers_;
  
  @Override
  public EList<Offer> getOffers() {
    if (offers_ == null)
    	offers_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOffers(), adaptersFactory, eResource);
    return offers_;
  }
  
  @Override
  public BooleanVariable getGuard() {
    return (BooleanVariable) adaptersFactory.createAdapter(adaptee.getGuard(), eResource);
  }
  
  @Override
  public void setGuard(final BooleanVariable o) {
    if (o != null)
    	adaptee.setGuard(((org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.BooleanVariableAdapter) o).getAdaptee());
    else adaptee.setGuard(null);
  }
  
  @Override
  public boolean hasOffer1() {
    return org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityEdgeAspect.hasOffer1(adaptee);
  }
  
  @Override
  public void sendOffer1(final EList<Token> tokens) {
    org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityEdgeAspect.sendOffer1(adaptee, ((fr.inria.diverse.melange.adapters.EListAdapter) tokens).getAdaptee()
    );
  }
  
  @Override
  public EList<Token> takeOfferedTokens1() {
    return fr.inria.diverse.melange.adapters.EListAdapter.newInstance(org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityEdgeAspect.takeOfferedTokens1(adaptee), adaptersFactory, eResource);
  }
  
  @Override
  public void execute(final Context c) {
    org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.NamedElementAspect.execute(adaptee, ((org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.ContextAdapter) c).getAdaptee()
    );
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.eINSTANCE.getControlFlow();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.CONTROL_FLOW__NAME:
    		return getName();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.CONTROL_FLOW__SOURCE:
    		return getSource();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.CONTROL_FLOW__TARGET:
    		return getTarget();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.CONTROL_FLOW__OFFERS:
    		return getOffers();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.CONTROL_FLOW__GUARD:
    		return getGuard();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.CONTROL_FLOW__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.CONTROL_FLOW__SOURCE:
    		return getSource() != null;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.CONTROL_FLOW__TARGET:
    		return getTarget() != null;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.CONTROL_FLOW__OFFERS:
    		return getOffers() != null && !getOffers().isEmpty();
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.CONTROL_FLOW__GUARD:
    		return getGuard() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.CONTROL_FLOW__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.CONTROL_FLOW__SOURCE:
    		setSource(
    		(org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivityNode)
    		 newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.CONTROL_FLOW__TARGET:
    		setTarget(
    		(org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivityNode)
    		 newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.CONTROL_FLOW__OFFERS:
    		getOffers().clear();
    		getOffers().addAll((Collection) newValue);
    		return;
    	case org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramPackage.CONTROL_FLOW__GUARD:
    		setGuard(
    		(org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.BooleanVariable)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
