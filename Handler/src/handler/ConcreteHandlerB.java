package handler;

public class ConcreteHandlerB extends Handler {

	public void handlerRequest(int request) {
		if (request > 10 && request <= 20) {
			System.out.println("������B���д���");
		} else {
			System.out.println("����B�ķ�Χ������B�������"+successor.getClass().getName());
			successor.handlerRequest(request);
		}
	}

}
