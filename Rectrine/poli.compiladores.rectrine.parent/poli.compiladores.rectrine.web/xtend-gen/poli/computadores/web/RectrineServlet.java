/**
 * generated by Xtext 2.12.0
 */
package poli.computadores.web;

import com.google.inject.Injector;
import javax.servlet.annotation.WebServlet;
import org.eclipse.xtext.util.DisposableRegistry;
import org.eclipse.xtext.web.servlet.XtextServlet;
import org.eclipse.xtext.xbase.lib.Exceptions;
import poli.computadores.web.RectrineWebSetup;

/**
 * Deploy this class into a servlet container to enable DSL-specific services.
 */
@WebServlet(name = "XtextServices", urlPatterns = "/xtext-service/*")
@SuppressWarnings("all")
public class RectrineServlet extends XtextServlet {
  private DisposableRegistry disposableRegistry;
  
  @Override
  public void init() {
    try {
      super.init();
      final Injector injector = new RectrineWebSetup().createInjectorAndDoEMFRegistration();
      this.disposableRegistry = injector.<DisposableRegistry>getInstance(DisposableRegistry.class);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Override
  public void destroy() {
    if ((this.disposableRegistry != null)) {
      this.disposableRegistry.dispose();
      this.disposableRegistry = null;
    }
    super.destroy();
  }
}