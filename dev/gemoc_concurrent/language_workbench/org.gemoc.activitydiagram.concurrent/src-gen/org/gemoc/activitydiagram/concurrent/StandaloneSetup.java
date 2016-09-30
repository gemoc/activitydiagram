package org.gemoc.activitydiagram.concurrent;

import fr.inria.diverse.melange.resource.MelangeRegistry;
import fr.inria.diverse.melange.resource.MelangeRegistryImpl;
import fr.inria.diverse.melange.resource.MelangeResourceFactoryImpl;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

@SuppressWarnings("all")
public class StandaloneSetup {
  public static void doSetup() {
    StandaloneSetup setup = new StandaloneSetup();
    setup.doEMFRegistration();
    setup.doAdaptersRegistration();
  }
  
  public void doEMFRegistration() {
    EPackage.Registry.INSTANCE.put(
    	org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eNS_URI,
    	org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
    );
    
    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
    	"*",
    	new XMIResourceFactoryImpl()
    );
    Resource.Factory.Registry.INSTANCE.getProtocolToFactoryMap().put(
    	"melange",
    	new MelangeResourceFactoryImpl()
    );
  }
  
  public void doAdaptersRegistration() {
    MelangeRegistry.LanguageDescriptor xActivityDiagram = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"org.gemoc.activitydiagram.concurrent.XActivityDiagram", "", "http://org.gemoc.activitydiagram.concurrent.xactivitydiagram/activitydiagram/", "org.gemoc.activitydiagram.concurrent.XActivityDiagramMT"
    );
    xActivityDiagram.addAdapter("org.gemoc.activitydiagram.concurrent.XActivityDiagramMT", org.gemoc.activitydiagram.concurrent.xactivitydiagram.adapters.xactivitydiagrammt.XActivityDiagramAdapter.class);
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"org.gemoc.activitydiagram.concurrent.XActivityDiagram",
    	xActivityDiagram
    );
    MelangeRegistry.ModelTypeDescriptor xActivityDiagramMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"org.gemoc.activitydiagram.concurrent.XActivityDiagramMT", "", "http://org.gemoc.activitydiagram.concurrent.xactivitydiagrammt/"
    );
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"org.gemoc.activitydiagram.concurrent.XActivityDiagramMT",
    	xActivityDiagramMT
    );
  }
}
