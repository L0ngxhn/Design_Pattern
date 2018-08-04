package visitor;

import element.ConcreteElementA;
import element.ConcreteElementB;

public class ConcreteVisitorA extends  Visitor{

	@Override
	public void visit(ConcreteElementA element) {
		System.out.println("我是A访问者，我要XXX");
	}

	@Override
	public void visit(ConcreteElementB element) {
		// do nothing
	}

}
