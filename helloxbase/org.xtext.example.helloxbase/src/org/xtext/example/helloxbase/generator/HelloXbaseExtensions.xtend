package org.xtext.example.helloxbase.generator

import org.xtext.example.helloxbase.helloXbase.Greeting

class HelloXbaseExtensions {
	
	def className(Greeting greeting) {
		greeting.name.toFirstUpper
	}
	
	def packageName(Greeting greeting) {
		greeting.name.toLowerCase
	}
}