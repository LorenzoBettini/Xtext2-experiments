package org.xtext.example.hellocustomecore.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper
import org.eclipse.xtext.xbase.lib.util.ReflectExtensions
import org.junit.BeforeClass
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*
import org.xtext.example.hellocustomecore.HelloCustomEcoreInjectorProvider

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(HelloCustomEcoreInjectorProvider))
class HelloCustomEcoreCompilerTest {
	
	@Inject extension CompilationTestHelper
	@Inject extension ReflectExtensions
	
	@BeforeClass
	def static void setNewLine() {
		System::setProperty("line.separator", "\n")
	}
	
	@Test
	def void testGeneratedJavaClass() {
		'''
		import java.util.Date
		
		Hello foo!
		
		Greeting bar {
			(new Date).toString
		}
		'''.assertCorrectJavaCodeGeneration(
'''
package generated;

import java.util.Date;

@SuppressWarnings("all")
public class MyFile {
  public String sayFoo() {
    return "Hello foo";
  }
  
  public String sayBar() {
    Date _date = new Date();
    String _string = _date.toString();
    return _string;
  }
}
'''
		)
	}
	
	
	@Test def void testGeneratedJavaCodeBehavior() {
		'''
		Hello foo!
		
		Greeting bar {
			sayFoo() + "bar"
		}
		'''.compile[
			val obj = it.compiledClass.newInstance
			
			var result = obj.invoke('sayBar')
			// 10 is the length of TestString
			assertEquals("Hello foobar", result)
		]
	}

	def private assertCorrectJavaCodeGeneration(CharSequence input, CharSequence expected) {
		input.compile [
			// check the expected Java code
			assertEquals(expected.toString, singleGeneratedCode)
			// this will issue Java generation
			compiledClass
		]
	}
	
}