package org.xtext.example.helloxvars.generator;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.compiler.ImportManager;
import org.eclipse.xtext.xbase.compiler.XbaseCompiler;
import org.eclipse.xtext.xbase.compiler.output.FakeTreeAppendable;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.xtext.example.helloxvars.helloXvars.Greeting;
import org.xtext.example.helloxvars.helloXvars.Model;

@SuppressWarnings("all")
public class HelloXvarsGenerator implements IGenerator {
  @Inject
  protected XbaseCompiler xbaseCompiler;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<Greeting> _filter = Iterables.<Greeting>filter(_iterable, Greeting.class);
    for (final Greeting greeting : _filter) {
      String _packageName = this.packageName(greeting);
      String _plus = (_packageName + "/");
      String _className = this.className(greeting);
      String _plus_1 = (_plus + _className);
      String _plus_2 = (_plus_1 + ".java");
      CharSequence _compile = this.compile(greeting);
      fsa.generateFile(_plus_2, _compile);
    }
  }
  
  public JvmGenericType getJvmType(final Greeting greeting) {
    JvmGenericType _xblockexpression = null;
    {
      final JvmGenericType declaredType = TypesFactory.eINSTANCE.createJvmGenericType();
      String _className = this.className(greeting);
      declaredType.setSimpleName(_className);
      String _packageName = this.packageName(greeting);
      declaredType.setPackageName(_packageName);
      _xblockexpression = (declaredType);
    }
    return _xblockexpression;
  }
  
  public CharSequence compile(final Greeting greeting) {
    StringConcatenation _builder = new StringConcatenation();
    JvmGenericType _jvmType = this.getJvmType(greeting);
    ImportManager _importManager = new ImportManager(true, _jvmType);
    final ImportManager importManager = _importManager;
    _builder.newLineIfNotEmpty();
    final CharSequence mainMethod = this.compile(greeting, importManager);
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    String _packageName = this.packageName(greeting);
    _builder.append(_packageName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    {
      List<String> _imports = importManager.getImports();
      boolean _isEmpty = _imports.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.newLine();
        {
          List<String> _imports_1 = importManager.getImports();
          for(final String i : _imports_1) {
            _builder.append("import ");
            _builder.append(i, "");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.newLine();
    _builder.append(mainMethod, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final Greeting greeting, final ImportManager importManager) {
    CharSequence _xblockexpression = null;
    {
      FakeTreeAppendable _fakeTreeAppendable = new FakeTreeAppendable(importManager);
      FakeTreeAppendable result = _fakeTreeAppendable;
      EObject _eContainer = greeting.eContainer();
      EList<XExpression> _varDeclarations = ((Model) _eContainer).getVarDeclarations();
      for (final XExpression varDecl : _varDeclarations) {
        {
          result.append("\n// variable declaration");
          FakeTreeAppendable _compile = this.compile(varDecl, result);
          result = _compile;
        }
      }
      result.append("\n// greeting expression");
      XExpression _expression = greeting.getExpression();
      FakeTreeAppendable _compile = this.compile(_expression, result);
      result = _compile;
      XExpression _expression_1 = greeting.getExpression();
      String expressionVar = result.getName(_expression_1);
      XExpression _expression_2 = greeting.getExpression();
      if ((_expression_2 instanceof XFeatureCall)) {
        XExpression _expression_3 = greeting.getExpression();
        JvmIdentifiableElement _feature = ((XFeatureCall) _expression_3).getFeature();
        String _name = result.getName(_feature);
        expressionVar = _name;
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("public class ");
      String _className = this.className(greeting);
      _builder.append(_className, "");
      _builder.append(" {");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("public static void main(String args[]) {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append(result, "		");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Object expression = ");
      _builder.append(expressionVar, "		");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("System.out.println(\"Hello ");
      String _name_1 = greeting.getName();
      _builder.append(_name_1, "		");
      _builder.append(" from \" +");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      _builder.append("expression.toString());");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final CharSequence compiled = _builder;
      _xblockexpression = (compiled);
    }
    return _xblockexpression;
  }
  
  public FakeTreeAppendable compile(final XExpression xExpression, final FakeTreeAppendable result) {
    FakeTreeAppendable _xblockexpression = null;
    {
      this.xbaseCompiler.toJavaStatement(xExpression, result, true);
      _xblockexpression = (result);
    }
    return _xblockexpression;
  }
  
  public String className(final Greeting greeting) {
    String _name = greeting.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    return _firstUpper;
  }
  
  public String packageName(final Greeting greeting) {
    String _name = greeting.getName();
    String _lowerCase = _name.toLowerCase();
    return _lowerCase;
  }
}
