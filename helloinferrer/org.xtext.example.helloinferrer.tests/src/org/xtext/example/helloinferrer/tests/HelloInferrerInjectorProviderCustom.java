package org.xtext.example.helloinferrer.tests;

import org.eclipse.xtext.junit4.GlobalRegistries;
import org.eclipse.xtext.xbase.compiler.OnTheFlyJavaCompiler;
import org.xtext.example.helloinferrer.HelloInferrerInjectorProvider;
import org.xtext.example.helloinferrer.HelloInferrerRuntimeModule;
import org.xtext.example.helloinferrer.HelloInferrerStandaloneSetup;

import com.google.inject.Guice;
import com.google.inject.Injector;

@SuppressWarnings("restriction")
public class HelloInferrerInjectorProviderCustom extends HelloInferrerInjectorProvider {
	
	public Injector getInjector() {
		if (injector == null) {
			stateBeforeInjectorCreation = GlobalRegistries.makeCopyOfGlobalState();
			this.injector = new HelloInferrerStandaloneSetup() {
				@Override
				public Injector createInjector() {
					return Guice.createInjector(new HelloInferrerRuntimeModule() {
						@Override
						public ClassLoader bindClassLoaderToInstance() {
							return HelloInferrerInjectorProviderCustom.class.getClassLoader();
						}
						
						@SuppressWarnings("unused")
						public Class<? extends OnTheFlyJavaCompiler> bindOnTheFlyJavaCompiler() {
							return HelloInferrerOnTheFlyJavaCompiler.class;
						}
					});
				}
			}.createInjectorAndDoEMFRegistration();
			stateAfterInjectorCreation = GlobalRegistries.makeCopyOfGlobalState();
		}
		return injector;
	}
}
