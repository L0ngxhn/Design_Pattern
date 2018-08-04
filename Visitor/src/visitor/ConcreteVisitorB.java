package visitor;

import element.ConcreteElementA;
import element.ConcreteElementB;

public class ConcreteVisitorB extends Visitor{

	@Override
	public void visit(ConcreteElementA element) {
		// do nothing
	}

	@Override
	public void visit(ConcreteElementB element) {
		System.out.println("我是B访问者,我要OOO");
	}

}
