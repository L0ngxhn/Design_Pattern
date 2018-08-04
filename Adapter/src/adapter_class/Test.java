package adapter_class;

public class Test {
	public static void main(String[] args) {
		Target mAdapter = new Adapter();
		// 实际调用的是Adaptee的方法
		mAdapter.request();
	}
}
