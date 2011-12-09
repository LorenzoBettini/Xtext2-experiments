package org.xtext.example.hellojvmtypes.generator;

import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.compiler.ImportManager;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xtend2.lib.ResourceExtensions;
import org.xtext.example.hellojvmtypes.helloJvmTypes.Greeting;

@SuppressWarnings("all")
public class HelloJvmTypesGenerator implements IGenerator {
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    Iterable<EObject> _allContentsIterable = ResourceExtensions.allContentsIterable(resource);
    Iterable<Greeting> _filter = IterableExtensions.<Greeting>filter(_allContentsIterable, org.xtext.example.hellojvmtypes.helloJvmTypes.Greeting.class);
    for (final Greeting greeting : _filter) {
      String _packageName = this.packageName(greeting);
      String _operator_plus = StringExtensions.operator_plus(_packageName, "/");
      String _className = this.className(greeting);
      String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _className);
      String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, ".java");
      CharSequence _compile = this.compile(greeting);
      fsa.generateFile(_operator_plus_2, _compile);
    }
  }
  
  public CharSequence compile(final Greeting greeting) {
    StringConcatenation _builder = new StringConcatenation();
    JvmGenericType _createJvmType = this.createJvmType(greeting);
    ImportManager _importManager = new ImportManager(true, _createJvmType);
    final ImportManager importManager = _importManager;
    _builder.newLineIfNotEmpty();
    CharSequence _compile = this.compile(greeting, importManager);
    final CharSequence mainMethod = _compile;
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
  
  public JvmGenericType createJvmType(final Greeting greeting) {
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
  
  public CharSequence compile(final Greeting greeting, final ImportManager importManager) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public class ");
    String _className = this.className(greeting);
    _builder.append(_className, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("public static void main(String args[]) {");
    _builder.newLine();
    {
      EList<JvmType> _javaTypes = greeting.getJavaTypes();
      for(final JvmType javaType : _javaTypes) {
        _builder.append("\t\t");
        _builder.append("System.out.println(\"Hello ");
        String _name = greeting.getName();
        _builder.append(_name, "		");
        _builder.append(" from \" +");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("\t");
        CharSequence _serialize = importManager.serialize(javaType);
        _builder.append(_serialize, "			");
        _builder.append(".class.getName());");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
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
