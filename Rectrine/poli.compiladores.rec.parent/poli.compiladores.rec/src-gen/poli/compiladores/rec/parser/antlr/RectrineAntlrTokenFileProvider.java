/*
 * generated by Xtext 2.12.0
 */
package poli.compiladores.rec.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class RectrineAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("poli/compiladores/rec/parser/antlr/internal/InternalRectrine.tokens");
	}
}