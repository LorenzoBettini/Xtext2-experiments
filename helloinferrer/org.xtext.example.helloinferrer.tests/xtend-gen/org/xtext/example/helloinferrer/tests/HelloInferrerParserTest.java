package org.xtext.example.helloinferrer.tests;

import com.google.inject.Inject;
import junit.framework.Assert;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.example.helloinferrer.HelloInferrerInjectorProvider;
import org.xtext.example.helloinferrer.helloInferrer.Model;

@SuppressWarnings("all")
@RunWith(XtextRunner.class)
@InjectWith(HelloInferrerInjectorProvider.class)
public class HelloInferrerParserTest {
  @Inject
  private ParseHelper<Model> _parseHelper;
  
  @Inject
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void testOperation() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Hello my.test.hello {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("op myOp(String s, int i) output Boolean b {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("val foo = s + i");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this.checkModel(_builder);
  }
  
  public Model checkModel(final CharSequence prog) {
    try {
      Model _xblockexpression = null;
      {
        final Model model = this._parseHelper.parse(prog);
        Assert.assertNotNull(model);
        this._validationTestHelper.assertNoErrors(model);
        _xblockexpression = (model);
      }
      return _xblockexpression;
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
