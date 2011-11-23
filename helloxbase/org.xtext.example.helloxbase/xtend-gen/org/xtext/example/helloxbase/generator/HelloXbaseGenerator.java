package org.xtext.example.helloxbase.generator;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.compiler.ImportManager;
import org.eclipse.xtext.xbase.compiler.StringBuilderBasedAppendable;
import org.eclipse.xtext.xbase.compiler.XbaseCompiler;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xtend2.lib.ResourceExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;
import org.xtext.example.helloxbase.helloXbase.Greeting;

@SuppressWarnings("all")
public class HelloXbaseGenerator implements IGenerator {
  @Inject
  protected XbaseCompiler xbaseCompiler;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    Iterable<EObject> _allContentsIterable = ResourceExtensions.allContentsIterable(resource);
    Iterable<Greeting> _filter = IterableExtensions.<Greeting>filter(_allContentsIterable, org.xtext.example.helloxbase.helloXbase.Greeting.class);
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
    StringConcatenation _builder = new StringConcatenation();
    XExpression _expression = greeting.getExpression();
    StringBuilderBasedAppendable _compile = this.compile(_expression, importManager);
    final StringBuilderBasedAppendable result = _compile;
    _builder.newLineIfNotEmpty();
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
    XExpression _expression_1 = greeting.getExpression();
    String _name = result.getName(_expression_1);
    _builder.append(_name, "		");
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
    return _builder;
  }
  
  public StringBuilderBasedAppendable compile(final XExpression xExpression, final ImportManager importManager) {
    StringBuilderBasedAppendable _xblockexpression = null;
    {
      StringBuilderBasedAppendable _stringBuilderBasedAppendable = new StringBuilderBasedAppendable(importManager);
      final StringBuilderBasedAppendable result = _stringBuilderBasedAppendable;
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
