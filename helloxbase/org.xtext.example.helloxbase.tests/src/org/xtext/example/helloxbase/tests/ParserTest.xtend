package org.xtext.example.helloxbase.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.Test
import org.junit.runner.RunWith
import org.xtext.example.helloxbase.HelloXbaseInjectorProvider
import org.xtext.example.helloxbase.helloXbase.Greeting
import org.xtext.example.helloxbase.helloXbase.Model

@InjectWith(typeof(HelloXbaseInjectorProvider))
@RunWith(typeof(XtextRunner))
class ParserTest {
	
	@Inject
    ParseHelper<Model> parser
    
    @Inject extension ValidationTestHelper

    @Test
    def void testParsingAndLinking() {
        parser.parse('''Hello foo from new String()!''').assertNoErrors
    }
    
    @Test
    def void testExpression() {
        val model = parser.parse(
            "Hello foo from new String()!")
        val greeting = model.greetings.head as Greeting
    }
    
}