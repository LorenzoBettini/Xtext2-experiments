package org.xtext.example.helloinferrer.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper
import org.junit.Test
import org.junit.BeforeClass
import org.junit.runner.RunWith

import static org.junit.Assert.*

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(HelloInferrerInjectorProviderCustom))
class HelloInferrerCompilerTest {
	
	@Inject extension CompilationTestHelper
	
	@BeforeClass
	def static void setNewLine() {
		System::setProperty("line.separator", "\n")
	}
	
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

import org.xtext.example.helloinferrer.runtime.HelloResult;

public class MyHello {
  public HelloResult<Boolean> myOp(final String s, final int i) {
    Boolean b = null; // output parameter
    final String foo = (s + Integer.valueOf(i));
    return new HelloResult<Boolean>(b);
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

import org.xtext.example.helloinferrer.runtime.HelloResult;

public class MyHello {
  public HelloResult<Boolean> myOp(final String s, final int i) {
    Boolean b = null; // output parameter
    b = Boolean.valueOf(true);
    return new HelloResult<Boolean>(b);
  }
}
''')
	}
	
	@Test
	def void testInitializationOfOututParameter() {
'''
Hello my.test.MyHello {
	op myOpWithClassOutputParameter(String s, int i) output Boolean b {
		
	}
}
'''.assertCorrectJavaCodeGeneration(
'''
package my.test;

import org.xtext.example.helloinferrer.runtime.HelloResult;

public class MyHello {
  public HelloResult<Boolean> myOpWithClassOutputParameter(final String s, final int i) {
    Boolean b = null; // output parameter
    return new HelloResult<Boolean>(b);
  }
}
''')
	}
	
	@Test
	def void testAccessThis() {
'''
Hello my.test.MyHello {
	op myOp(String s, int i) output Boolean b {
		myOp2(true, 'foo')
		this.myOp2(true, 'foo')
	}
	
	op myOp2(boolean b, String s) output Integer i {
		
	}
}
'''.assertCorrectJavaCodeGeneration(
'''
package my.test;

import org.xtext.example.helloinferrer.runtime.HelloResult;

public class MyHello {
  public HelloResult<Boolean> myOp(final String s, final int i) {
    Boolean b = null; // output parameter
    this.myOp2(true, "foo");
    this.myOp2(true, "foo");
    return new HelloResult<Boolean>(b);
  }
  
  public HelloResult<Integer> myOp2(final boolean b, final String s) {
    Integer i = null; // output parameter
    return new HelloResult<Integer>(i);
  }
}
''')
	}
	
	@Test
	def void testAutomaticBoxing() {
'''
Hello my.test.MyHello {
	op myOp(String s, int j) output Integer i {
		i = j + 1
		if (i < 0)
			i = 1
	}
}
'''.assertCorrectJavaCodeGeneration(
'''
package my.test;

import org.xtext.example.helloinferrer.runtime.HelloResult;

public class MyHello {
  public HelloResult<Integer> myOp(final String s, final int j) {
    Integer i = null; // output parameter
    int _plus = (j + 1);
    i = Integer.valueOf(_plus);
    boolean _lessThan = ((i).intValue() < 0);
    if (_lessThan) {
      i = Integer.valueOf(1);
    }
    return new HelloResult<Integer>(i);
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