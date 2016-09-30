package org.gemoc.activitydiagram.sequential;

import fr.inria.diverse.melange.lib.IMetamodel;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.gemoc.activitydiagram.sequential.XActivityDiagramMT;

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
  
  public XActivityDiagramMT toXActivityDiagramMT() {
    org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramAdapter adaptee = new org.gemoc.activitydiagram.sequential.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
}
