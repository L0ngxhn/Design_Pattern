package visitor;

import element.ConcreteElementA;
import element.ConcreteElementB;

public abstract class Visitor {
	public abstract void visit(ConcreteElementA element);
	public abstract void visit(ConcreteElementB element);
}
