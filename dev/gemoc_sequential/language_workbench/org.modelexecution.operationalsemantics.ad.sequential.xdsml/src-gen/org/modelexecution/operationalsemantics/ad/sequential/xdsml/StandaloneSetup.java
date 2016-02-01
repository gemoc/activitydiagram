package org.modelexecution.operationalsemantics.ad.sequential.xdsml;

import fr.inria.diverse.melange.resource.MelangeRegistry;
import fr.inria.diverse.melange.resource.MelangeRegistryImpl;
import fr.inria.diverse.melange.resource.MelangeResourceFactoryImpl;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

@SuppressWarnings("all")
public class StandaloneSetup {
  public static void doSetup() {
    StandaloneSetup setup = new StandaloneSetup() ;
    setup.doEMFRegistration() ;
    setup.doAdaptersRegistration() ;
  }
  
  public void doEMFRegistration() {
    EPackage.Registry.INSTANCE.put(
    	activitydiagram.ActivitydiagramPackage.eNS_URI,
    	activitydiagram.ActivitydiagramPackage.eINSTANCE
    ) ;
    EPackage.Registry.INSTANCE.put(
    	org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.activitydiagram.ActivitydiagramPackage.eNS_URI,
    	org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.activitydiagram.ActivitydiagramPackage.eINSTANCE
    ) ;
    
    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
    	"*",
    	new XMIResourceFactoryImpl()
    ) ;
    Resource.Factory.Registry.INSTANCE.getProtocolToFactoryMap().put(
    	"melange",
    	new MelangeResourceFactoryImpl()
    ) ;
  }
  
  public void doAdaptersRegistration() {
    MelangeRegistry.LanguageDescriptor sequentialActivityDiagram = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"org.modelexecution.operationalsemantics.ad.sequential.xdsml.SequentialActivityDiagram", "", "http://activitydiagram/1.0", "org.modelexecution.operationalsemantics.ad.sequential.xdsml.SequentialActivityDiagramMT"
    ) ;
    sequentialActivityDiagram.addAdapter("org.modelexecution.operationalsemantics.ad.sequential.xdsml.SequentialActivityDiagramMT", org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagram.adapters.sequentialactivitydiagrammt.SequentialActivityDiagramAdapter.class) ;
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"org.modelexecution.operationalsemantics.ad.sequential.xdsml.SequentialActivityDiagram",
    	sequentialActivityDiagram
    ) ;
    MelangeRegistry.LanguageDescriptor sequentialActivityDiagramExtended = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"org.modelexecution.operationalsemantics.ad.sequential.xdsml.SequentialActivityDiagramExtended", "", "http://sequentialactivitydiagramextended/", "org.modelexecution.operationalsemantics.ad.sequential.xdsml.SequentialActivityDiagramExtendedMT"
    ) ;
    sequentialActivityDiagramExtended.addAdapter("org.modelexecution.operationalsemantics.ad.sequential.xdsml.SequentialActivityDiagramMT", org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.adapters.sequentialactivitydiagrammt.SequentialActivityDiagramExtendedAdapter.class) ;
    sequentialActivityDiagramExtended.addAdapter("org.modelexecution.operationalsemantics.ad.sequential.xdsml.SequentialActivityDiagramExtendedMT", org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.adapters.sequentialactivitydiagramextendedmt.SequentialActivityDiagramExtendedAdapter.class) ;
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"org.modelexecution.operationalsemantics.ad.sequential.xdsml.SequentialActivityDiagramExtended",
    	sequentialActivityDiagramExtended
    ) ;
    MelangeRegistry.ModelTypeDescriptor sequentialActivityDiagramMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"org.modelexecution.operationalsemantics.ad.sequential.xdsml.SequentialActivityDiagramMT", "", "http://sequentialactivitydiagrammt/"
    ) ;
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"org.modelexecution.operationalsemantics.ad.sequential.xdsml.SequentialActivityDiagramMT",
    	sequentialActivityDiagramMT
    ) ;
    MelangeRegistry.ModelTypeDescriptor sequentialActivityDiagramExtendedMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"org.modelexecution.operationalsemantics.ad.sequential.xdsml.SequentialActivityDiagramExtendedMT", "", "http://sequentialactivitydiagramextendedmt/"
    ) ;
    sequentialActivityDiagramExtendedMT.addSuperType("org.modelexecution.operationalsemantics.ad.sequential.xdsml.SequentialActivityDiagramMT") ;
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"org.modelexecution.operationalsemantics.ad.sequential.xdsml.SequentialActivityDiagramExtendedMT",
    	sequentialActivityDiagramExtendedMT
    ) ;
  }
}
