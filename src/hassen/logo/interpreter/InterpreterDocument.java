package hassen.logo.interpreter;

import java.io.File;

import javax.swing.JFileChooser;

import hassen.logo.ui.AbstractDocument;

public class InterpreterDocument extends AbstractDocument {

	@Override
	public void onOpenDocument() {
		int state = getView().getJFileChooser().showOpenDialog(getView());
		if (state == JFileChooser.APPROVE_OPTION) {
			File f = getView().getJFileChooser().getSelectedFile();
			setFilename(f.getPath());
		}
		super.onOpenDocument();
	}

}
