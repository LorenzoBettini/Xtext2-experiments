package org.xtext.example.helloinferrer.tests;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.util.ReflectExtensions;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.example.helloinferrer.tests.HelloInferrerInjectorProviderCustom;

@RunWith(XtextRunner.class)
@InjectWith(HelloInferrerInjectorProviderCustom.class)
@SuppressWarnings("all")
public class HelloInferrerCompilerTest {
  @Inject
  @Extension
  private CompilationTestHelper _compilationTestHelper;
  
  @Inject
  @Extension
  private ReflectExtensions _reflectExtensions;
  
  @BeforeClass
  public static void setNewLine() {
    System.setProperty("line.separator", "\n");
  }
  
  @Test
  public void testGeneratedJavaClass() {
    try {
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
      _builder_1.append("@SuppressWarnings(\"all\")");
      _builder_1.newLine();
      _builder_1.append("public class MyHello {");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      this._compilationTestHelper.assertCompilesTo(_builder, _builder_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testGeneratedJavaMethod() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Hello my.test.MyHello {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("op myOp(String s, int i) output Boolean b {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("val foo = s + i");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("println(foo)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("package my.test;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("import org.eclipse.xtext.xbase.lib.InputOutput;");
    _builder_1.newLine();
    _builder_1.append("import org.xtext.example.helloinferrer.runtime.HelloResult;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("@SuppressWarnings(\"all\")");
    _builder_1.newLine();
    _builder_1.append("public class MyHello {");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("public HelloResult<Boolean> myOp(final String s, final int i) {");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("Boolean b = null; // output parameter");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("final String foo = (s + Integer.valueOf(i));");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("InputOutput.<String>println(foo);");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("return new HelloResult<Boolean>(b);");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    this.assertCorrectJavaCodeGeneration(_builder, _builder_1);
  }
  
  @Test
  public void testAccessToOututParameter() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Hello my.test.MyHello {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("op myOp(String s, int i) output Boolean b {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("b = true");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("package my.test;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("import org.xtext.example.helloinferrer.runtime.HelloResult;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("@SuppressWarnings(\"all\")");
    _builder_1.newLine();
    _builder_1.append("public class MyHello {");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("public HelloResult<Boolean> myOp(final String s, final int i) {");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("Boolean b = null; // output parameter");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("b = Boolean.valueOf(true);");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("return new HelloResult<Boolean>(b);");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    this.assertCorrectJavaCodeGeneration(_builder, _builder_1);
  }
  
  @Test
  public void testInitializationOfOututParameter() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Hello my.test.MyHello {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("op myOpWithClassOutputParameter(String s, int i) output Boolean b {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("package my.test;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("import org.xtext.example.helloinferrer.runtime.HelloResult;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("@SuppressWarnings(\"all\")");
    _builder_1.newLine();
    _builder_1.append("public class MyHello {");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("public HelloResult<Boolean> myOpWithClassOutputParameter(final String s, final int i) {");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("Boolean b = null; // output parameter");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("return new HelloResult<Boolean>(b);");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    this.assertCorrectJavaCodeGeneration(_builder, _builder_1);
  }
  
  @Test
  public void testAccessThis() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Hello my.test.MyHello {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("op myOp(String s, int i) output Boolean b {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("myOp2(true, \'foo\')");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.myOp2(true, \'foo\')");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("op myOp2(boolean b, String s) output Integer i {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("package my.test;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("import org.xtext.example.helloinferrer.runtime.HelloResult;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("@SuppressWarnings(\"all\")");
    _builder_1.newLine();
    _builder_1.append("public class MyHello {");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("public HelloResult<Boolean> myOp(final String s, final int i) {");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("Boolean b = null; // output parameter");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("this.myOp2(true, \"foo\");");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("this.myOp2(true, \"foo\");");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("return new HelloResult<Boolean>(b);");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("public HelloResult<Integer> myOp2(final boolean b, final String s) {");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("Integer i = null; // output parameter");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("return new HelloResult<Integer>(i);");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    this.assertCorrectJavaCodeGeneration(_builder, _builder_1);
  }
  
  @Test
  public void testAutomaticBoxing() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Hello my.test.MyHello {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("op myOp(String s, int j) output Integer i {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("i = j + 1");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if (i < 0)");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("i = 1");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("package my.test;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("import org.xtext.example.helloinferrer.runtime.HelloResult;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("@SuppressWarnings(\"all\")");
    _builder_1.newLine();
    _builder_1.append("public class MyHello {");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("public HelloResult<Integer> myOp(final String s, final int j) {");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("Integer i = null; // output parameter");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("i = Integer.valueOf((j + 1));");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("if (((i).intValue() < 0)) {");
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("i = Integer.valueOf(1);");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("return new HelloResult<Integer>(i);");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    this.assertCorrectJavaCodeGeneration(_builder, _builder_1);
  }
  
  @Test
  public void testUseOfResult() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Hello MyHello {");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("op foo(int j) output Integer i {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("i = new MyHello().bar(this).value.bar2().value");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("op bar(MyHello myHello) output MyHello result {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("result = myHello");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("op bar2() output Integer res {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("res = 10");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("import org.xtext.example.helloinferrer.runtime.HelloResult;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("@SuppressWarnings(\"all\")");
    _builder_1.newLine();
    _builder_1.append("public class MyHello {");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("public HelloResult<Integer> foo(final int j) {");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("Integer i = null; // output parameter");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("MyHello _myHello = new MyHello();");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("HelloResult<MyHello> _bar = _myHello.bar(this);");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("MyHello _value = _bar.getValue();");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("HelloResult<Integer> _bar2 = _value.bar2();");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("Integer _value_1 = _bar2.getValue();");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("i = _value_1;");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("return new HelloResult<Integer>(i);");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("public HelloResult<MyHello> bar(final MyHello myHello) {");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("MyHello result = null; // output parameter");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("result = myHello;");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("return new HelloResult<MyHello>(result);");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("public HelloResult<Integer> bar2() {");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("Integer res = null; // output parameter");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("res = Integer.valueOf(10);");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("return new HelloResult<Integer>(res);");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    this.assertCorrectJavaCodeGeneration(_builder, _builder_1);
  }
  
  @Test
  public void testImports() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import java.util.Date");
    _builder.newLine();
    _builder.append("import java.io.BufferedInputStream");
    _builder.newLine();
    _builder.newLine();
    _builder.append("Hello my.test.hello {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("op myOp(String s, int i) output Boolean b {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("println(new Date)");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("println(new BufferedInputStream(null, 0))");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("package my.test;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("import java.io.BufferedInputStream;");
    _builder_1.newLine();
    _builder_1.append("import java.util.Date;");
    _builder_1.newLine();
    _builder_1.append("import org.eclipse.xtext.xbase.lib.InputOutput;");
    _builder_1.newLine();
    _builder_1.append("import org.xtext.example.helloinferrer.runtime.HelloResult;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("@SuppressWarnings(\"all\")");
    _builder_1.newLine();
    _builder_1.append("public class hello {");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("public HelloResult<Boolean> myOp(final String s, final int i) {");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("Boolean b = null; // output parameter");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("Date _date = new Date();");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("InputOutput.<Date>println(_date);");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("BufferedInputStream _bufferedInputStream = new BufferedInputStream(null, 0);");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("InputOutput.<BufferedInputStream>println(_bufferedInputStream);");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("return new HelloResult<Boolean>(b);");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    this.assertCorrectJavaCodeGeneration(_builder, _builder_1);
  }
  
  @Test
  public void testGeneratedJavaCodeBehavior() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Hello my.hello.MyHello {");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("op lenOfString(String s) output Integer result {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("if (s == null)");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("result = 0");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("else");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("result = s.length");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final IAcceptor<CompilationTestHelper.Result> _function = new IAcceptor<CompilationTestHelper.Result>() {
        public void accept(final CompilationTestHelper.Result it) {
          try {
            Class<? extends Object> _compiledClass = it.getCompiledClass();
            final Object obj = _compiledClass.newInstance();
            Object result = HelloInferrerCompilerTest.this._reflectExtensions.invoke(obj, "lenOfString", "TestString");
            Object _invoke = HelloInferrerCompilerTest.this._reflectExtensions.invoke(result, "getValue");
            String _string = _invoke.toString();
            Assert.assertEquals("10", _string);
            Object _invoke_1 = HelloInferrerCompilerTest.this._reflectExtensions.invoke(obj, "lenOfString", null);
            result = _invoke_1;
            Object _invoke_2 = HelloInferrerCompilerTest.this._reflectExtensions.invoke(result, "getValue");
            String _string_1 = _invoke_2.toString();
            Assert.assertEquals("0", _string_1);
          } catch (Throwable _e) {
            throw Exceptions.sneakyThrow(_e);
          }
        }
      };
      this._compilationTestHelper.compile(_builder, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private void assertCorrectJavaCodeGeneration(final CharSequence input, final CharSequence expected) {
    try {
      final IAcceptor<CompilationTestHelper.Result> _function = new IAcceptor<CompilationTestHelper.Result>() {
        public void accept(final CompilationTestHelper.Result it) {
          String _string = expected.toString();
          String _singleGeneratedCode = it.getSingleGeneratedCode();
          Assert.assertEquals(_string, _singleGeneratedCode);
          it.getCompiledClass();
        }
      };
      this._compilationTestHelper.compile(input, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
