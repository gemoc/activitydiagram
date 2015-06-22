package org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic;

import activitydiagram.Input;
import activitydiagram.InputValue;
import com.google.common.base.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResourceSet;

@SuppressWarnings("all")
public class Util {
  public final static Object LINE_BREAK = System.getProperty("line.separator");
  
  public static final Input getInput(final String inputPath) {
    Input input = null;
    boolean _notEquals = (!Objects.equal(inputPath, null));
    if (_notEquals) {
      XtextResourceSet resourceSet = null;
      XtextResourceSet _xtextResourceSet = new XtextResourceSet();
      resourceSet = _xtextResourceSet;
      URI _createFileURI = Util.createFileURI(inputPath);
      Resource resource = resourceSet.getResource(_createFileURI, true);
      EList<EObject> _contents = resource.getContents();
      EObject eObject = _contents.get(0);
      if ((eObject instanceof Input)) {
        input = ((Input) eObject);
      }
    }
    return input;
  }
  
  public static final List<InputValue> getInputValues(final String inputPath) {
    ArrayList<InputValue> inputValues = new ArrayList<InputValue>();
    Input input = Util.getInput(inputPath);
    boolean _notEquals = (!Objects.equal(input, null));
    if (_notEquals) {
      EList<InputValue> _inputValues = input.getInputValues();
      inputValues.addAll(_inputValues);
    }
    return inputValues;
  }
  
  public static final URI createFileURI(final String path) {
    File _createFile = Util.createFile(path);
    String _absolutePath = _createFile.getAbsolutePath();
    return URI.createFileURI(_absolutePath);
  }
  
  public static final File createFile(final String path) {
    return new File(path);
  }
}
