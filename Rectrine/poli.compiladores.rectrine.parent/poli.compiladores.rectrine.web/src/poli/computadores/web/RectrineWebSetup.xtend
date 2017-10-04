/*
 * generated by Xtext 2.12.0
 */
package poli.computadores.web

import com.google.inject.Guice
import com.google.inject.Injector
import org.eclipse.xtext.util.Modules2
import poli.computadores.RectrineRuntimeModule
import poli.computadores.RectrineStandaloneSetup
import poli.computadores.ide.RectrineIdeModule

/**
 * Initialization support for running Xtext languages in web applications.
 */
class RectrineWebSetup extends RectrineStandaloneSetup {
	
	override Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new RectrineRuntimeModule, new RectrineIdeModule, new RectrineWebModule))
	}
	
}