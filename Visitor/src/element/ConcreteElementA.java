package element;

import visitor.Visitor;

public class ConcreteElementA extends Element {

	private String name;

	@Override
	public void Accpet(Visitor visitor) {
		System.out.println("我是ElementA----"+visitor.getClass().getName()+"在访问我");
		visitor.visit(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
