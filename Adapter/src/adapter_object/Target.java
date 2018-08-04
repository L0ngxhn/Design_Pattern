package adapter_object;
/*
 * 想要调用其他类的方法,但是由于接口不一致。无法直接调用
 */
public interface Target {
	// 
	public void request();
	
	public void otherMethod();
	
}
