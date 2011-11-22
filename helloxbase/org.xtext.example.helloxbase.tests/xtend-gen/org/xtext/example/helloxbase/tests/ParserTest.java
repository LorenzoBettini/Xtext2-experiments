package org.xtext.example.helloxbase.tests;

import com.google.inject.Inject;
import junit.framework.Assert;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.example.helloxbase.HelloXbaseInjectorProvider;
import org.xtext.example.helloxbase.helloXbase.Greeting;
import org.xtext.example.helloxbase.helloXbase.Model;

@SuppressWarnings("all")
@InjectWith(HelloXbaseInjectorProvider.class)
@RunWith(XtextRunner.class)
public class ParserTest {
  @Inject
  private ParseHelper<Model> parser;
  
  @Inject
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void testParsingAndLinking() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Hello foo from java.util.List!");
    Model _parse = this.parser.parse(_builder);
    this._validationTestHelper.assertNoErrors(_parse);
  }
  
  @Test
  public void testJvmTypeAccess() throws Exception {
      Model _parse = this.parser.parse("Hello foo from java.util.List!");
      final Model model = _parse;
      EList<Greeting> _greetings = model.getGreetings();
      Greeting _head = IterableExtensions.<Greeting>head(_greetings);
      final Greeting greeting = ((Greeting) _head);
      JvmType _javaType = greeting.getJavaType();
      final JvmGenericType jvmType = ((JvmGenericType) _javaType);
      String _identifier = jvmType.getIdentifier();
      Assert.assertEquals("java.util.List", _identifier);
  }
}
