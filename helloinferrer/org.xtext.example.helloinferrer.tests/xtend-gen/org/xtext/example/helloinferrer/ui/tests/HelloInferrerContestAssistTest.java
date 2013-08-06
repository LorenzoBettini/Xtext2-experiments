package org.xtext.example.helloinferrer.ui.tests;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.ui.ContentAssistProcessorTestBuilder;
import org.eclipse.xtext.xbase.junit.ui.AbstractContentAssistTest;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.example.helloinferrer.HelloInferrerUiInjectorProvider;

@RunWith(XtextRunner.class)
@InjectWith(HelloInferrerUiInjectorProvider.class)
@SuppressWarnings("all")
public class HelloInferrerContestAssistTest extends AbstractContentAssistTest {
  @Test
  public void testParameterCompletion() {
    try {
      ContentAssistProcessorTestBuilder _newBuilder = this.newBuilder();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Hello my.test.hello {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("op myOp(String myString, int i) output Boolean b {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("myS");
      ContentAssistProcessorTestBuilder _append = _newBuilder.append(_builder.toString());
      _append.assertText("myString");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
