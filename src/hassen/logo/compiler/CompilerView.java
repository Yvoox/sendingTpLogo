package hassen.logo.compiler;

import hassen.evaluator.Evaluator;
import hassen.evaluator.LazyEvaluator;
import hassen.logo.ui.AbstractDocument;
import hassen.logo.ui.AbstractView;
import hassen.logo.ui.GraphicTurtle;

import java.awt.Graphics;

import hassen.ast.Helper;
import hassen.ast.Node;

public class CompilerView extends AbstractView {

	public CompilerView(AbstractDocument document) {
		super(document);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void onPaint (Graphics g) {
		LogoContext context = ((CompilerDocument) getDocument()).getContext();
		if ( context != null && ! context.hasErrors()) {
			Evaluator eval = new LazyEvaluator (context.getVista(), context.getFactory());
			Painter painter = new Painter (new GraphicTurtle(g), eval);
			LogoPainter logoPainter = new LogoPainter (eval, painter);
			Node bloc = context.getFactory().createNodeBloc();
			if (Helper.exist (context.getVista(), LogoContext.getInitSegmentName())) {
				bloc.getChildren().add(context.getFactory().createNodeFunctionCall(
						context.getFactory().createNodeVariable(LogoContext.getInitSegmentName()), null)
					);
			}
			logoPainter.begin();
			logoPainter.visit(bloc);
			logoPainter.end();
		}
	}
}
