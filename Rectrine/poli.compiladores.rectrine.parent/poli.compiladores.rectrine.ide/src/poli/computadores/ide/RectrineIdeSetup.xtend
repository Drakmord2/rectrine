/*
 * generated by Xtext 2.12.0
 */
package poli.computadores.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import poli.computadores.RectrineRuntimeModule
import poli.computadores.RectrineStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class RectrineIdeSetup extends RectrineStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new RectrineRuntimeModule, new RectrineIdeModule))
	}
	
}
