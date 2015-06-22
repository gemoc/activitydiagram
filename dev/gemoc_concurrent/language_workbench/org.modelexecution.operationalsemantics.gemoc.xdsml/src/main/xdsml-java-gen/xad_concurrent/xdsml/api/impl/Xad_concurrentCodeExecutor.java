/* GENERATED FILE, do not modify manually                                                    *
 * If you need to modify it, disable the generation in the BuildOptions of the project.xdsml */
package xad_concurrent.xdsml.api.impl;
import org.gemoc.execution.engine.commons.dsa.executors.CodeExecutorDispatcher;
public class Xad_concurrentCodeExecutor extends CodeExecutorDispatcher 
		implements org.gemoc.gemoc_language_workbench.extensions.k3.dsa.api.IK3DSAExecutorClassLoader  {
	public Xad_concurrentCodeExecutor(){
	    // add K3 DSA specific executor
		addExecutor(new org.gemoc.gemoc_language_workbench.extensions.k3.dsa.impl.Kermeta3AspectsCodeExecutor(this,
			"org.modelexecution.operationalsemantics.k3.dynamic"));
		// fall back executor : search classic java method
		addExecutor(new org.gemoc.execution.engine.commons.dsa.executors.JavaCodeExecutor());
	}
	public String getDSAProjectName(){
		return "org.modelexecution.operationalsemantics.k3.dynamic";
	}
   @Override
	public Class<?> getClassForName(String className) throws ClassNotFoundException {
		return Class.forName(className);
	}
	@Override
	public java.io.InputStream getResourceAsStream(String resourceName) {
		//this.getClass().getResourceAsStream(resourceName);
		return Thread.currentThread().getContextClassLoader().getResourceAsStream(resourceName);
	}
}