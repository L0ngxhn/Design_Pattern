package adapter_object;

public class Test {
	public static void main(String[] args) {
		
		Target mAdapter = new Adapter_Obj(new Adaptee());
		mAdapter.request();
	}
}
