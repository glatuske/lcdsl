/*
 * generated by Xtext 2.28.0
 */
package com.wamas.ide.launching.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class LcDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("com/wamas/ide/launching/parser/antlr/internal/InternalLcDsl.tokens");
	}
}
