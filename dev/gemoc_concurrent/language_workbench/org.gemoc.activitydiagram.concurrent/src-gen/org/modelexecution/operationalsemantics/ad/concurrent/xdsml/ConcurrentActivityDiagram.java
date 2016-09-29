package org.modelexecution.operationalsemantics.ad.concurrent.xdsml;

import fr.inria.diverse.melange.lib.IMetamodel;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

@SuppressWarnings("all")
public class ConcurrentActivityDiagram implements IMetamodel {
  private Resource resource;
  
  public Resource getResource() {
    return this.resource;
  }
  
  public void setResource(final Resource resource) {
    this.resource = resource;
  }
  
  public static org.modelexecution.operationalsemantics.ad.concurrent.xdsml.ConcurrentActivityDiagram load(final String uri) {
    ResourceSet rs = new ResourceSetImpl();
    Resource res = rs.getResource(URI.createURI(uri), true);
    ConcurrentActivityDiagram mm = new ConcurrentActivityDiagram();
    mm.setResource(res);
    return mm ;
  }
  
  public org.modelexecution.operationalsemantics.ad.concurrent.xdsml.ConcurrentActivityDiagramMT toConcurrentActivityDiagramMT() {
    org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagram.adapters.concurrentactivitydiagrammt.ConcurrentActivityDiagramAdapter adaptee = new org.modelexecution.operationalsemantics.ad.concurrent.xdsml.concurrentactivitydiagram.adapters.concurrentactivitydiagrammt.ConcurrentActivityDiagramAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
}
