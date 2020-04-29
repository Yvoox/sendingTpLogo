package hassen.logo.compiler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import java_cup.runtime.SimpleSymbolFactory;
import java_cup.runtime.SymbolFactory;

import javax.swing.JFileChooser;

import hassen.logo.compiler.Lexer;
import hassen.logo.compiler.Parser;
import hassen.logo.ui.AbstractDocument;

public class CompilerDocument extends AbstractDocument {

	private LogoContext context;
	
	public LogoContext getContext() {
		return context;
	}

	public void setContext(LogoContext context) {
		this.context = context;
	}

	@Override
	public void onOpenDocument() {
		int state = getView().getJFileChooser().showOpenDialog(getView());
		if (state == JFileChooser.APPROVE_OPTION) {
			File f = getView().getJFileChooser().getSelectedFile();
			String filename = f.getPath();
			setFilename (filename);
			try {
		    	SymbolFactory csf = new SimpleSymbolFactory ();
		    	Lexer l = new Lexer(new FileReader(getFilename()));
		    	l.setSymbolFactory(csf);
		    	Parser p = new Parser(l, csf);
				context = new LogoContext();
				p.setContext(context);
		    	p.parse();      
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				context.addError("FileNotFoundException");
			} catch (Exception e) {
				e.printStackTrace();
				context.addError("FileNotFoundException");
			}
		}
		super.onOpenDocument();
	}

}
