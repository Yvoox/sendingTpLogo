package hassen.logo.compiler;

import hassen.ast.visitor.INodeVisitor;
import hassen.logo.visitor.LogoVisitor;

public class LogoPainter extends LogoVisitor {

	public LogoPainter(INodeVisitor nodeVisitor, INodeVisitor turtleVisitor) {
		super(nodeVisitor, turtleVisitor);
	}

}
