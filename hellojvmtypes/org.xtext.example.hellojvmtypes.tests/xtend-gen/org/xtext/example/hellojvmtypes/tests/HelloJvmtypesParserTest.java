package org.xtext.example.hellojvmtypes.tests;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.example.hellojvmtypes.HelloJvmTypesInjectorProvider;
import org.xtext.example.hellojvmtypes.helloJvmTypes.Greeting;
import org.xtext.example.hellojvmtypes.helloJvmTypes.Model;

@InjectWith(value = HelloJvmTypesInjectorProvider.class)
@RunWith(value = XtextRunner.class)
@SuppressWarnings("all")
public class HelloJvmtypesParserTest {
  @Inject
  private ParseHelper<Model> parser;
  
  @Inject
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void testParsingAndLinking() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Hello foo from java.util.List!");
      Model _parse = this.parser.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParsingAndLinkingWithImports() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("import java.util.List");
      _builder.newLine();
      _builder.append("Hello foo from List!");
      _builder.newLine();
      Model _parse = this.parser.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParsingAndLinkingWithGreetingImports() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("import org.xtext.example.hellojvmtypes.helloJvmTypes.*");
      _builder.newLine();
      _builder.append("Hello foo from Greeting!");
      _builder.newLine();
      Model _parse = this.parser.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testJvmTypeAccess() {
    try {
      final Model model = this.parser.parse(
        "Hello foo from java.util.List!");
      EList<Greeting> _greetings = model.getGreetings();
      Greeting _head = IterableExtensions.<Greeting>head(_greetings);
      final Greeting greeting = ((Greeting) _head);
      EList<JvmType> _javaTypes = greeting.getJavaTypes();
      JvmType _get = _javaTypes.get(0);
      final JvmGenericType jvmType = ((JvmGenericType) _get);
      String _identifier = jvmType.getIdentifier();
      Assert.assertEquals("java.util.List", _identifier);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
