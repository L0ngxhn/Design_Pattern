package handler;

public class ConcreteHandlerB extends Handler {

	public void handlerRequest(int request) {
		if (request > 10 && request <= 20) {
			System.out.println("处理器B进行处理");
		} else {
			System.out.println("不在B的范围，交给B后面的人"+successor.getClass().getName());
			successor.handlerRequest(request);
		}
	}

}
