package handler;

public abstract class Handler {
	// �������ϵĺ����
	protected  Handler successor;
	
	// ���ú����
	public void setSuccessor( Handler successor){
		this.successor = successor;
	}
	
	public abstract void handlerRequest(int request);
}
