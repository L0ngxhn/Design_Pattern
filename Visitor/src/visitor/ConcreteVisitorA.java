package visitor;

import element.ConcreteElementA;
import element.ConcreteElementB;

public class ConcreteVisitorA extends  Visitor{

	@Override
	public void visit(ConcreteElementA element) {
		System.out.println("����A�����ߣ���ҪXXX");
	}

	@Override
	public void visit(ConcreteElementB element) {
		// do nothing
	}

}
