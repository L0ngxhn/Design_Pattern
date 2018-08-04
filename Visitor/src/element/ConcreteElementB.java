package element;

import visitor.Visitor;

public class ConcreteElementB extends Element {

	private String id;

	@Override
	public void Accpet(Visitor visitor) {
		System.out.println("我是ElementB----"+visitor.getClass().getName()+"在访问我");
		visitor.visit(this);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
