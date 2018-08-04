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
	 * 其他功能的方法
	 */
	public void otherMethod() {
		
	}

}
