package de.frotty.mdlviewer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.Interval;

import de.frotty.mdlviewer.antlr.MdlGrammarLexer;
import de.frotty.mdlviewer.antlr.MdlGrammarParser;
import de.frotty.mdlviewer.antlr.MdlGrammarParser.MdlfileContext;

public class MdlLoader {
	
	public static MdlfileContext parseMdl(Reader reader) {
		try {
			final ANTLRInputStream input = new ANTLRInputStream(reader);
			// create a lexer that feeds off of input CharStream
			final MdlGrammarLexer lexer = new MdlGrammarLexer(input);
			// create a buffer of tokens pulled from the lexer
			TokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			MdlGrammarParser parser = new MdlGrammarParser(tokens);
			ANTLRErrorListener l = new BaseErrorListener() {
		
				int errorCount = 0;
				
				@Override
				public void syntaxError(@SuppressWarnings("null") Recognizer<?, ?> recognizer, @SuppressWarnings("null") Object offendingSymbol, int line, int charPositionInLine,
						@SuppressWarnings("null") String msg, @SuppressWarnings("null") RecognitionException e) {
					
					System.out.println("Do error handing here ... " + msg);
				}
		
			};
			lexer.addErrorListener(l);
			parser.addErrorListener(l);
		
			MdlfileContext mdlFile = parser.mdlfile(); // begin parsing at mdlfile rule
			return mdlFile;
		} catch (IOException e) {
			throw new Error(e);
		}
	}
}