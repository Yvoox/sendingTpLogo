package hassen.logo.interpreter;

import hassen.logo.ui.AbstractDocument;
import hassen.logo.ui.AbstractView;
import hassen.logo.ui.GraphicTurtle;

import java.awt.Graphics;
import java.io.FileNotFoundException;
import java.io.FileReader;

import java_cup.runtime.SimpleSymbolFactory;
import java_cup.runtime.SymbolFactory;

public class InterpreterView extends AbstractView {

	public InterpreterView(AbstractDocument document) {
		super(document);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void onPaint (Graphics g) {
		try {
			if (getDocument().getFilename() == null) return;
	    	SymbolFactory csf = new SimpleSymbolFactory ();
	    	Lexer l = new Lexer(new FileReader(getDocument().getFilename()));
	    	l.setSymbolFactory(csf);
	    	Parser p = new Parser(l, csf);
			p.setTurtle(new GraphicTurtle(g));
	    	p.parse();      
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
