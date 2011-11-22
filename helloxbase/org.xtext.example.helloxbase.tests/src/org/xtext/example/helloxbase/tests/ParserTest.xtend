package org.xtext.example.helloxbase.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Test
import org.junit.runner.RunWith
import org.xtext.example.helloxbase.HelloXbaseInjectorProvider
import org.xtext.example.helloxbase.helloXbase.Greeting
import org.xtext.example.helloxbase.helloXbase.Model
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.eclipse.xtext.common.types.JvmGenericType
import junit.framework.Assert

@InjectWith(typeof(HelloXbaseInjectorProvider))
@RunWith(typeof(XtextRunner))
class ParserTest {
	
	@Inject
    ParseHelper<Model> parser
    
    @Inject extension ValidationTestHelper

    @Test
    def void testParsingAndLinking() {
        parser.parse('''Hello foo from java.util.List!''').assertNoErrors
    }
    
    @Test
    def void testJvmTypeAccess() {
        val model = parser.parse(
            "Hello foo from java.util.List!")
        val greeting = model.greetings.head as Greeting
        val jvmType = greeting.javaType as JvmGenericType
        Assert::assertEquals("java.util.List", jvmType.identifier)        
    }
    
}