package adapter_object;

public class Adapter_Obj implements Target {

	private Adaptee adaptee = null;

	public Adapter_Obj(Adaptee adaptee) {
		this.adaptee = adaptee;
	}
	
	public void request() {
		adaptee.SpecificRequest();
	}

	/**
	 * �������ܵķ���
	 */
	public void otherMethod() {
		
	}

}
