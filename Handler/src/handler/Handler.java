package handler;

public abstract class Handler {
	// 责任链上的后继者
	protected  Handler successor;
	
	// 设置后继者
	public void setSuccessor( Handler successor){
		this.successor = successor;
	}
	
	public abstract void handlerRequest(int request);
}
