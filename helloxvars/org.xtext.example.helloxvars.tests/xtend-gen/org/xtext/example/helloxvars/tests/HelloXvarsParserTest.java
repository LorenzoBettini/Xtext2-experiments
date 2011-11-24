package org.xtext.example.helloxvars.tests;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.diagnostics.Diagnostic;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.XbasePackage;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.example.helloxvars.HelloXvarsInjectorProvider;
import org.xtext.example.helloxvars.helloXvars.Greeting;
import org.xtext.example.helloxvars.helloXvars.Model;

@SuppressWarnings("all")
@InjectWith(HelloXvarsInjectorProvider.class)
@RunWith(XtextRunner.class)
public class HelloXvarsParserTest {
  @Inject
  private ParseHelper<Model> parser;
  
  @Inject
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void testParsingAndLinking() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Hello foo from new String()!");
    Model _parse = this.parser.parse(_builder);
    this._validationTestHelper.assertNoErrors(_parse);
  }
  
  @Test
  public void testParsingAndLinkingWithVars() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("val s = \'foo\'");
    _builder.newLine();
    _builder.append("Hello foo from new String(s)!");
    _builder.newLine();
    Model _parse = this.parser.parse(_builder);
    this._validationTestHelper.assertNoErrors(_parse);
  }
  
  @Test
  public void testParsingAndLinkingWithMissingVar() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Hello foo from new String(s)!");
    _builder.newLine();
    Model _parse = this.parser.parse(_builder);
    EClass _xFeatureCall = XbasePackage.eINSTANCE.getXFeatureCall();
    this._validationTestHelper.assertError(_parse, _xFeatureCall, Diagnostic.LINKING_DIAGNOSTIC, "Couldn\'t resolve reference to JvmIdentifiableElement \'s\'.");
  }
  
  @Test
  public void testExpression() throws Exception {
      Model _parse = this.parser.parse("Hello foo from new String()!");
      final Model model = _parse;
      EList<Greeting> _greetings = model.getGreetings();
      Greeting _head = IterableExtensions.<Greeting>head(_greetings);
      final Greeting greeting = ((Greeting) _head);
  }
}
