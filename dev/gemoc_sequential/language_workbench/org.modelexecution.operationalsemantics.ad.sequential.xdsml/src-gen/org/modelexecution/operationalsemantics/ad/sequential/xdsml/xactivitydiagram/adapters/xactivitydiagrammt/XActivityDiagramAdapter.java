package org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.xactivitydiagrammt;

import fr.inria.diverse.melange.adapters.ResourceAdapter;
import java.io.IOException;
import java.util.Set;
import org.eclipse.emf.common.util.URI;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.XActivityDiagramMT;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagrammt.activitydiagram.ActivitydiagramFactory;

@SuppressWarnings("all")
public class XActivityDiagramAdapter extends ResourceAdapter implements XActivityDiagramMT {
  public XActivityDiagramAdapter() {
    super(org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramMTAdaptersFactory.getInstance());
  }
  
  @Override
  public ActivitydiagramFactory getActivitydiagramFactory() {
    return new org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.xactivitydiagrammt.activitydiagram.ActivitydiagramFactoryAdapter();
  }
  
  @Override
  public Set getFactories() {
    java.util.Set<org.eclipse.emf.ecore.EFactory> res = new java.util.HashSet<org.eclipse.emf.ecore.EFactory>();
    res.add(getActivitydiagramFactory());
    return res;
  }
  
  @Override
  public void save(final String uri) throws IOException {
    this.adaptee.setURI(URI.createURI(uri));
    this.adaptee.save(null);
  }
}
