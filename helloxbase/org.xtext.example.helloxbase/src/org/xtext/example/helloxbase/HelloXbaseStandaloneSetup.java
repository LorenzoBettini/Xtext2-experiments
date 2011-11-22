
package org.xtext.example.helloxbase;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class HelloXbaseStandaloneSetup extends HelloXbaseStandaloneSetupGenerated{

	public static void doSetup() {
		new HelloXbaseStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

