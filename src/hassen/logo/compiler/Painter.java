package hassen.logo.compiler;

import hassen.ast.visitor.INodeVisitor;
import hassen.evaluator.Evaluator;
import hassen.logo.ui.GraphicTurtle;
import hassen.turtle.visitor.TurtleVisitor;
import hassen.ast.Node;
import hassen.ast.Value;
import hassen.ast.ValueID;

public class Painter extends TurtleVisitor implements INodeVisitor {
	
	private GraphicTurtle turtle;
	private Evaluator eval;

	public Painter(GraphicTurtle turtle, Evaluator evaluator) {
		this.turtle = turtle;
		this.eval = evaluator;
	}

	private long getValueAsLong (Value v) {
		if (v.getValueID() == ValueID.VALUE_INTEGER_LITERAL)
			return v.getLongValue();
		if (v.getValueID() == ValueID.VALUE_REAL_LITERAL)
			return (long) v.getDoubleValue();
		return 0;
	}
	
	private String getValueAsString (Value v) {
		if (v.getValueID() == ValueID.VALUE_INTEGER_LITERAL)
			return Long.toString(v.getLongValue());
		if (v.getValueID() == ValueID.VALUE_REAL_LITERAL)
			return Double.toString(v.getDoubleValue());
		if (v.getValueID() == ValueID.VALUE_STRING_LITERAL)
			return v.getStringValue();
		return "no-value";
	}
	
	@Override
	protected void visit_TurtleDown(Node node) {
		eval.visit(node.getChildren().get(0));
		long d = getValueAsLong (eval.getRealValue());
		turtle.down((int) d);
//		System.out.println("Down : "+d);
	}

	@Override
	protected void visit_TurtleFrame(Node node) {
		eval.visit(node.getChildren().get(0));
		long x = getValueAsLong (eval.getRealValue());
		eval.visit(node.getChildren().get(1));
		long y = getValueAsLong (eval.getRealValue());
		turtle.frame((int) x, (int) y);
	}

	@Override
	protected void visit_TurtleGo(Node node) {
		eval.visit(node.getChildren().get(0));
		long x = getValueAsLong (eval.getRealValue());
		eval.visit(node.getChildren().get(1));
		long y = getValueAsLong (eval.getRealValue());
		turtle.go((int) x, (int) y);
//		System.out.println("Go : "+x+"@"+y);
	}

	@Override
	protected void visit_TurtleHome(Node node) {
		turtle.home();
	}

	@Override
	protected void visit_TurtleLeft(Node node) {
		eval.visit(node.getChildren().get(0));
		long d = getValueAsLong (eval.getRealValue());
		turtle.left((int) d);
//		System.out.println("Left : "+d);
	}

	@Override
	protected void visit_TurtleMove(Node node) {
		eval.visit(node.getChildren().get(0));
		long d = getValueAsLong (eval.getRealValue());
		turtle.move((int) d);
//		System.out.println("Move : "+d);
	}

	@Override
	protected void visit_TurtleOff(Node node) {
		turtle.penUp();
	}

	@Override
	protected void visit_TurtleOn(Node node) {
		turtle.penDown();
	}

	@Override
	protected void visit_TurtleRight(Node node) {
		eval.visit(node.getChildren().get(0));
		long d = getValueAsLong (eval.getRealValue());
		turtle.right((int) d);
//		System.out.println("Right : "+d);
	}

	@Override
	protected void visit_TurtleTurn(Node node) {
		eval.visit(node.getChildren().get(0));
		long d = getValueAsLong (eval.getRealValue());
		turtle.turn((int) d);
//		System.out.println("Turn : "+d);
	}

	@Override
	protected void visit_TurtleUp(Node node) {
		eval.visit(node.getChildren().get(0));
		long d = getValueAsLong (eval.getRealValue());
		turtle.up((int) d);
//		System.out.println("Up : "+d);
	}

	@Override
	protected void visit_TurtleInk(Node node) {
		eval.visit(node.getChildren().get(0));
		long d = getValueAsLong (eval.getRealValue());
		turtle.ink((int) d);
	}

	@Override
	protected void visit_TurtlePlot(Node node) {
		eval.visit(node.getChildren().get(0));
		String s = getValueAsString (eval.getRealValue());
		turtle.plot(s);
	}

}
