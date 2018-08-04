package handler;

public class ConcreteHandlerA extends Handler {

	public void handlerRequest(int request) {
		if (request > 0 && request <= 10) {
			System.out.println("处理器A进行处理");
		} else {
			System.out.println("不在A的范围，交给A后面的人"+successor.getClass().getName());
			successor.handlerRequest(request);
		}
	}

}
