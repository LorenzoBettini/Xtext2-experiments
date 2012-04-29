package org.xtext.example.hellojvmtypes.generator;

import com.google.common.collect.Iterables;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.compiler.ImportManager;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.xtext.example.hellojvmtypes.helloJvmTypes.Greeting;

@SuppressWarnings("all")
public class HelloJvmTypesGenerator implements IGenerator {
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
  
  public CharSequence compile(final Greeting greeting) {
    StringConcatenation _builder = new StringConcatenation();
    JvmGenericType _createJvmType = this.createJvmType(greeting);
    ImportManager _importManager = new ImportManager(true, _createJvmType);
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
  
  public JvmGenericType createJvmType(final Greeting greeting) {
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
