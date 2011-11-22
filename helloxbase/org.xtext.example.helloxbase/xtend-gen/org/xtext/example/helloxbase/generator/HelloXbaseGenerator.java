package org.xtext.example.helloxbase.generator;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.compiler.ImportManager;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xtend2.lib.ResourceExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;
import org.xtext.example.helloxbase.generator.HelloXbaseExtensions;
import org.xtext.example.helloxbase.helloXbase.Greeting;

@SuppressWarnings("all")
public class HelloXbaseGenerator implements IGenerator {
  @Inject
  private HelloXbaseExtensions _helloXbaseExtensions;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    Iterable<EObject> _allContentsIterable = ResourceExtensions.allContentsIterable(resource);
    Iterable<Greeting> _filter = IterableExtensions.<Greeting>filter(_allContentsIterable, org.xtext.example.helloxbase.helloXbase.Greeting.class);
    for (final Greeting greeting : _filter) {
      String _packageName = this._helloXbaseExtensions.packageName(greeting);
      String _operator_plus = StringExtensions.operator_plus(_packageName, "/");
      String _className = this._helloXbaseExtensions.className(greeting);
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
      String _className = this._helloXbaseExtensions.className(greeting);
      declaredType.setSimpleName(_className);
      String _packageName = this._helloXbaseExtensions.packageName(greeting);
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
    String _packageName = this._helloXbaseExtensions.packageName(greeting);
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
    _builder.append("public class ");
    String _className = this._helloXbaseExtensions.className(greeting);
    _builder.append(_className, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("public static void main(String args[]) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("System.out.println(\"Hello ");
    String _name = greeting.getName();
    _builder.append(_name, "        ");
    _builder.append(" \");");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
