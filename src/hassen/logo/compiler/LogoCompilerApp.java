package hassen.logo.compiler;

import hassen.logo.ui.AbstractDocument;
import hassen.logo.ui.AbstractView;

public class LogoCompilerApp {
    
	private AbstractView view;
	private AbstractDocument document;

	public LogoCompilerApp () {
		document = new CompilerDocument ();
		view = new CompilerView (document);
		document.setView(view);
	}
	
	public static void main (String argv []) {
		LogoCompilerApp app = new LogoCompilerApp ();
	    app.show();
	}

    public void show () {
    	view.setVisible(true);
    }
}
