package handler;

public class ConcreteHandlerA extends Handler {

	public void handlerRequest(int request) {
		if (request > 0 && request <= 10) {
			System.out.println("������A���д���");
		} else {
			System.out.println("����A�ķ�Χ������A�������"+successor.getClass().getName());
			successor.handlerRequest(request);
		}
	}

}
