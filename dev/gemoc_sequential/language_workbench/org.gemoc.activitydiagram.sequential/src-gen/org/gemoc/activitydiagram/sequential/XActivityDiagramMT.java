package org.gemoc.activitydiagram.sequential;

import fr.inria.diverse.melange.lib.IModelType;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.gemoc.activitydiagram.sequential.xactivitydiagrammt.activitydiagram.ActivitydiagramFactory;

@SuppressWarnings("all")
public interface XActivityDiagramMT extends IModelType {
  public abstract EList<EObject> getContents();
  
  public abstract ActivitydiagramFactory getActivitydiagramFactory();
  
  public abstract void save(final String uri) throws IOException;
}
