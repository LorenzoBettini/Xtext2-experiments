/*
* generated by Xtext
*/
package org.xtext.example.helloxvars;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class HelloXvarsUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.xtext.example.helloxvars.ui.internal.HelloXvarsActivator.getInstance().getInjector("org.xtext.example.helloxvars.HelloXvars");
	}
	
}