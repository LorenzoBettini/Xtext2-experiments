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
		println(foo)
	}
}
'''.assertCorrectJavaCodeGeneration(
'''
package my.test;

import org.eclipse.xtext.xbase.lib.InputOutput;
import org.xtext.example.helloinferrer.runtime.HelloResult;

public class MyHello {
  public HelloResult<Boolean> myOp(final String s, final int i) {
    Boolean b = null; // output parameter
    final String foo = (s + Integer.valueOf(i));
    InputOutput.<String>println(foo);
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

	@Test
	def void testUseOfResult() {
'''
Hello MyHello {
	
	op foo(int j) output Integer i {
		i = new MyHello().bar(this).value.bar2().value
	}

	op bar(MyHello myHello) output MyHello result {
		result = myHello
	}
	
	op bar2() output Integer res {
		res = 10
	}
}
'''.assertCorrectJavaCodeGeneration(
'''
import org.xtext.example.helloinferrer.runtime.HelloResult;

public class MyHello {
  public HelloResult<Integer> foo(final int j) {
    Integer i = null; // output parameter
    MyHello _myHello = new MyHello();
    HelloResult<MyHello> _bar = _myHello.bar(this);
    MyHello _value = _bar.getValue();
    HelloResult<Integer> _bar2 = _value.bar2();
    Integer _value_1 = _bar2.getValue();
    i = _value_1;
    return new HelloResult<Integer>(i);
  }
  
  public HelloResult<MyHello> bar(final MyHello myHello) {
    MyHello result = null; // output parameter
    result = myHello;
    return new HelloResult<MyHello>(result);
  }
  
  public HelloResult<Integer> bar2() {
    Integer res = null; // output parameter
    res = Integer.valueOf(10);
    return new HelloResult<Integer>(res);
  }
}
''')
	}

	@Test
	def void testImports() {
'''
import java.util.Date
import java.io.BufferedInputStream

Hello my.test.hello {
	op myOp(String s, int i) output Boolean b {
		println(new Date)
		println(new BufferedInputStream(null, 0))
	}
}
'''.assertCorrectJavaCodeGeneration(
'''
package my.test;

import java.io.BufferedInputStream;
import java.util.Date;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.xtext.example.helloinferrer.runtime.HelloResult;

public class hello {
  public HelloResult<Boolean> myOp(final String s, final int i) {
    Boolean b = null; // output parameter
    Date _date = new Date();
    InputOutput.<Date>println(_date);
    BufferedInputStream _bufferedInputStream = new BufferedInputStream(null, 0);
    InputOutput.<BufferedInputStream>println(_bufferedInputStream);
    return new HelloResult<Boolean>(b);
  }
}
''')
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