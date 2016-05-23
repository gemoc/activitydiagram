package org.modelexecution.operationalsemantics.ad.sequential.xdsml;

import fr.inria.diverse.melange.lib.IModelType;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.activitydiagrammt.activitydiagram.ActivitydiagramFactory;

@SuppressWarnings("all")
public interface ActivityDiagramMT extends IModelType {
  public abstract EList<EObject> getContents();
  
  public abstract ActivitydiagramFactory getActivitydiagramFactory();
  
  public abstract void save(final String uri) throws IOException;
}
