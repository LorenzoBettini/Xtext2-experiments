package org.xtext.example.helloinferrer.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(HelloInferrerInjectorProviderCustom))
class HelloInferrerCompilerTest {
	
	@Inject extension CompilationTestHelper
	
	@Test
	def void testGeneratedJavaClass() {
		'''
		Hello my.test.MyHello {
			
		}
		'''.assertCompilesTo(
		'''
		package my.test;

		public class MyHello {
		}
		'''
		)
	}
	
	@Test
	def void testGeneratedJavaMethod() {
'''
Hello my.test.MyHello {
	op myOp(String s, int i) output Boolean b {
		val foo = s + i
	}
}
'''.assertCorrectJavaCodeGeneration(
'''
package my.test;

public class MyHello {
  public void myOp(final String s, final int i) {
    Boolean b = null; // output parameter
    final String foo = (s + Integer.valueOf(i));
  }
}
''')
	}
	
	@Test
	def void testAccessToOututParameter() {
'''
Hello my.test.MyHello {
	op myOp(String s, int i) output Boolean b {
		b = true
	}
}
'''.assertCorrectJavaCodeGeneration(
'''
package my.test;

public class MyHello {
  public void myOp(final String s, final int i) {
    Boolean b = null; // output parameter
    b = Boolean.valueOf(true);
  }
}
''')
	}

	def private assertCorrectJavaCodeGeneration(CharSequence input, CharSequence expected) {
		input.compile [
			// check the expected Java code
			assertEquals(expected.toString, generatedCode)
			// this will issue Java generation
			compiledClass
		]
	}
	
}