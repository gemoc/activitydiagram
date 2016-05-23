package org.modelexecution.operationalsemantics.ad.sequential.xdsml;

import fr.inria.diverse.melange.lib.IMetamodel;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.ActivityDiagramMT;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.XActivityDiagramMT;

@SuppressWarnings("all")
public class XActivityDiagram implements IMetamodel {
  private Resource resource;
  
  public Resource getResource() {
    return this.resource;
  }
  
  public void setResource(final Resource resource) {
    this.resource = resource;
  }
  
  public static XActivityDiagram load(final String uri) {
    ResourceSet rs = new ResourceSetImpl();
    Resource res = rs.getResource(URI.createURI(uri), true);
    XActivityDiagram mm = new XActivityDiagram();
    mm.setResource(res);
    return mm ;
  }
  
  public ActivityDiagramMT toActivityDiagramMT() {
    org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.activitydiagrammt.XActivityDiagramAdapter adaptee = new org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.activitydiagrammt.XActivityDiagramAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
  
  public XActivityDiagramMT toXActivityDiagramMT() {
    org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramAdapter adaptee = new org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
}
