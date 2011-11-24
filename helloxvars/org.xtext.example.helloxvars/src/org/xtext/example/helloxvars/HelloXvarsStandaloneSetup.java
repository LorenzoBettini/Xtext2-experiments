
package org.xtext.example.helloxvars;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class HelloXvarsStandaloneSetup extends HelloXvarsStandaloneSetupGenerated{

	public static void doSetup() {
		new HelloXvarsStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

