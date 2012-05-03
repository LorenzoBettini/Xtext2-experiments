package org.xtext.example.helloinferrer.tests;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.example.helloinferrer.HelloInferrerInjectorProvider;

@SuppressWarnings("all")
@RunWith(XtextRunner.class)
@InjectWith(HelloInferrerInjectorProvider.class)
public class HelloInferrerCompilerTest {
  @Inject
  private CompilationTestHelper _compilationTestHelper;
  
  @Test
  public void testGeneratedJava() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Hello my.test.MyHello {");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("package my.test;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("public class MyHello {");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    this._compilationTestHelper.assertCompilesTo(_builder, _builder_1);
  }
}
