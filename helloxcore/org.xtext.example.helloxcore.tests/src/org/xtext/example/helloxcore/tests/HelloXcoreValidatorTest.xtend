package org.xtext.example.helloxcore.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.Test
import org.junit.runner.RunWith
import org.xtext.example.helloxcore.HelloXcoreInjectorProvider
import org.xtext.example.helloxcore.helloxcore.Model

import static extension org.junit.Assert.*

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(HelloXcoreInjectorProvider))
class HelloXcoreValidatorTest {
	
	@Inject extension ParseHelper<Model>
	
	@Inject extension ValidationTestHelper
	
	@Test
	def void testDuplicates() {
		'''
		Hello foo!
		Hello bar!
		
		Greeting foo {
			""
		}
		
		'''.assertErrorMessages(
'''
Duplicate name 'foo' (Hello)
Duplicate name 'foo' (Greeting)
'''
		)
	}

	def private void assertErrorMessages(CharSequence input, CharSequence expected) {
		expected.toString.trim.assertEquals
			(input.parse.validate.map[message].join("\n"))
	}
	
}