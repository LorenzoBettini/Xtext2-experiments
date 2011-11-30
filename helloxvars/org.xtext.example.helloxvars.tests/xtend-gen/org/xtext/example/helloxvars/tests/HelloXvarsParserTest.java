package org.xtext.example.helloxvars.tests;

import com.google.inject.Inject;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.diagnostics.Diagnostic;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.XbasePackage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.example.helloxvars.HelloXvarsInjectorProvider;
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
    Model _parse = this.parser.parse("Hello foo from new String()!");
    this._validationTestHelper.assertNoErrors(_parse);
  }
  
  @Test
  public void testParsingAndLinkingWithVars() throws Exception {
    Model _parse = this.parser.parse("\n\t\t\tval s1 = \'foo\'\n\t\t\tval s2 = \'bar\'\n\t\t\tval s3 = s1 + s2\n\t\t\tHello foo from new String(s3)!\n\t\t");
    this._validationTestHelper.assertNoErrors(_parse);
  }
  
  @Test
  public void testParsingAndLinkingWithClosures() throws Exception {
    Model _parse = this.parser.parse("\n\t\t\tval s1 = \'foo\'\n\t\t\tval s2 = \'bar\'\n\t\t\tval s3 = s1 + [ s | s.toFirstLower + s1 ].apply(s2 + s1)\n\t\t\tHello foo from new String(s3)!\n\t\t");
    this._validationTestHelper.assertNoErrors(_parse);
  }
  
  @Test
  public void testParsingAndLinkingWithMissingVar() throws Exception {
    Model _parse = this.parser.parse("\n\t\t\tHello foo from new String(s)!\n\t\t");
    EClass _xFeatureCall = XbasePackage.eINSTANCE.getXFeatureCall();
    this._validationTestHelper.assertError(_parse, _xFeatureCall, Diagnostic.LINKING_DIAGNOSTIC, "Couldn\'t resolve reference to JvmIdentifiableElement \'s\'.");
  }
  
  @Test
  public void testParsingAndLinkingWithWrongVarOrder() throws Exception {
    Model _parse = this.parser.parse("\n\t\t\tval s1 = s2\n\t\t\tval s2 = s1\n\t\t\tHello foo from new String(s1)!\n\t\t");
    EClass _xFeatureCall = XbasePackage.eINSTANCE.getXFeatureCall();
    this._validationTestHelper.assertError(_parse, _xFeatureCall, Diagnostic.LINKING_DIAGNOSTIC, "Couldn\'t resolve reference to JvmIdentifiableElement \'s2\'.");
  }
}
