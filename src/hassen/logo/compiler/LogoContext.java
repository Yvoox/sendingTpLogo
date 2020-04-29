package hassen.logo.compiler;

import hassen.logo.factory.LogoFactory;
import hassen.logo.factory.impl.LogoFactoryImpl;

import java.util.ArrayList;
import java.util.List;

import hassen.ast.Helper;
import hassen.ast.Node;
import hassen.ast.Symbol;
import hassen.ast.SymbolFunction;
import hassen.ast.SymbolVista;

public class LogoContext {

	private List<String> errors;
	private LogoFactory factory = null;
	private SymbolVista vista = null;
	
	public LogoContext() {
		super();
		getVista().push(getFactory().createSymbolTable(getGlobalSegmentName()));
	}

	public boolean hasErrors () {
		if (errors == null) return false;
		if (errors.isEmpty()) return false;
		return true;
	}

	public List<String> getErrors () {
		if (errors == null) this.errors = new ArrayList <String> ();
		return errors;
	}

	public void addError (String text) {
		getErrors ().add(text);
	}
	
	public SymbolVista getVista () {
		if (vista == null) vista = getFactory ().createSymbolVista(getVistaName ());
		return vista;
	}

	public LogoFactory getFactory () {
		if (factory == null) factory = new LogoFactoryImpl();
		return factory;
	}

	void addLocalSymbol (Symbol symbol) {
		getVista().top().add (symbol);
	}
	
	protected SymbolFunction getInitSegment () {
		if (! Helper.exist (getVista(), getInitSegmentName())) {
			SymbolFunction initSegment = getFactory().createSymbolFunction(getInitSegmentName());
			getVista().top().add (initSegment);
			return initSegment;
		} else {
			List<Symbol> symbols = Helper.get (getVista(), getInitSegmentName());
			return (SymbolFunction) symbols.get(0);
		}
	}

	void addGlobalInstruction (Node node) {
		SymbolFunction initSegment = getInitSegment ();
		Node bloc = initSegment.getCode();
		if (bloc == null) {
			bloc = getFactory().createNodeBloc();
			initSegment.setCode(bloc);
		}
		bloc.getChildren().add(node);
	}

	static public String getVistaName () {
		return vistaName;
	}

	static public String getInitSegmentName () {
		return initSegmentName;
	}
	
	static public String getGlobalSegmentName () {
		return globalSegmentName;
	}
	
	static final String vistaName = "__vista__";
	static final String globalSegmentName = "__global__";
	static final String initSegmentName = "__init__";

}
