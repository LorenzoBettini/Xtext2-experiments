
package org.xtext.example.hellojvmtypes;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class HelloJvmTypesStandaloneSetup extends HelloJvmTypesStandaloneSetupGenerated{

	public static void doSetup() {
		new HelloJvmTypesStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

