package hassen.logo.interpreter;

import hassen.logo.interpreter.InterpreterDocument;
import hassen.logo.interpreter.InterpreterView;
import hassen.logo.ui.AbstractDocument;
import hassen.logo.ui.AbstractView;

public class LogoInterpreterApp {
    
	private AbstractView view;
	private AbstractDocument document;

	public LogoInterpreterApp () {
		document = new InterpreterDocument ();
		view = new InterpreterView (document);
		document.setView(view);
	}
	
	public static void main (String argv []) {
		LogoInterpreterApp app = new LogoInterpreterApp ();
	    app.show();
	}

    public void show () {
    	view.setVisible(true);
    }
}
