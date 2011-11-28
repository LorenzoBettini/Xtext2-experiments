package org.xtext.example.helloxvars.generator;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.compiler.ImportManager;
import org.eclipse.xtext.xbase.compiler.StringBuilderBasedAppendable;
import org.eclipse.xtext.xbase.compiler.XbaseCompiler;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xtend2.lib.ResourceExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;
import org.xtext.example.helloxvars.helloXvars.Greeting;
import org.xtext.example.helloxvars.helloXvars.Model;

@SuppressWarnings("all")
public class HelloXvarsGenerator implements IGenerator {
  @Inject
  protected XbaseCompiler xbaseCompiler;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    Iterable<EObject> _allContentsIterable = ResourceExtensions.allContentsIterable(resource);
    Iterable<Greeting> _filter = IterableExtensions.<Greeting>filter(_allContentsIterable, org.xtext.example.helloxvars.helloXvars.Greeting.class);
    for (final Greeting greeting : _filter) {
      String _packageName = this.packageName(greeting);
      String _operator_plus = StringExtensions.operator_plus(_packageName, "/");
      String _className = this.className(greeting);
      String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _className);
      String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, ".java");
      StringConcatenation _compile = this.compile(greeting);
      fsa.generateFile(_operator_plus_2, _compile);
    }
  }
  
  public JvmGenericType getJvmType(final Greeting greeting) {
    JvmGenericType _xblockexpression = null;
    {
      JvmGenericType _createJvmGenericType = TypesFactory.eINSTANCE.createJvmGenericType();
      final JvmGenericType declaredType = _createJvmGenericType;
      String _className = this.className(greeting);
      declaredType.setSimpleName(_className);
      String _packageName = this.packageName(greeting);
      declaredType.setPackageName(_packageName);
      _xblockexpression = (declaredType);
    }
    return _xblockexpression;
  }
  
  public StringConcatenation compile(final Greeting greeting) {
    StringConcatenation _builder = new StringConcatenation();
    JvmGenericType _jvmType = this.getJvmType(greeting);
    ImportManager _importManager = new ImportManager(true, _jvmType);
    final ImportManager importManager = _importManager;
    _builder.newLineIfNotEmpty();
    StringConcatenation _compile = this.compile(greeting, importManager);
    final StringConcatenation mainMethod = _compile;
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    String _packageName = this.packageName(greeting);
    _builder.append(_packageName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    {
      List<String> _imports = importManager.getImports();
      boolean _isEmpty = _imports.isEmpty();
      boolean _operator_not = BooleanExtensions.operator_not(_isEmpty);
      if (_operator_not) {
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
  
  public StringConcatenation compile(final Greeting greeting, final ImportManager importManager) {
    StringConcatenation _xblockexpression = null;
    {
      StringBuilderBasedAppendable _stringBuilderBasedAppendable = new StringBuilderBasedAppendable(importManager);
      StringBuilderBasedAppendable result = _stringBuilderBasedAppendable;
      EObject _eContainer = greeting.eContainer();
      EList<XExpression> _varDeclarations = ((Model) _eContainer).getVarDeclarations();
      for (final XExpression varDecl : _varDeclarations) {
        {
          result.append("\n// variable declaration");
          StringBuilderBasedAppendable _compile = this.compile(varDecl, result);
          result = _compile;
        }
      }
      result.append("\n// greeting expression");
      XExpression _expression = greeting.getExpression();
      StringBuilderBasedAppendable _compile_1 = this.compile(_expression, result);
      result = _compile_1;
      XExpression _expression_1 = greeting.getExpression();
      String _name = result.getName(_expression_1);
      String expressionVar = _name;
      XExpression _expression_2 = greeting.getExpression();
      if ((_expression_2 instanceof XFeatureCall)) {
        XExpression _expression_3 = greeting.getExpression();
        JvmIdentifiableElement _feature = ((XFeatureCall) _expression_3).getFeature();
        String _name_1 = result.getName(_feature);
        expressionVar = _name_1;
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
      String _name_2 = greeting.getName();
      _builder.append(_name_2, "		");
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
      final StringConcatenation compiled = _builder;
      _xblockexpression = (compiled);
    }
    return _xblockexpression;
  }
  
  public StringBuilderBasedAppendable compile(final XExpression xExpression, final StringBuilderBasedAppendable result) {
    StringBuilderBasedAppendable _xblockexpression = null;
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
