package element;

import visitor.Visitor;

public class ConcreteElementB extends Element {

	private String id;

	@Override
	public void Accpet(Visitor visitor) {
		System.out.println("����ElementB----"+visitor.getClass().getName()+"�ڷ�����");
		visitor.visit(this);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
