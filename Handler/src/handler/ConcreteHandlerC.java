package handler;

public class ConcreteHandlerC extends Handler {

	public void handlerRequest(int request) {
		if (request > 20 && request <= 30) {
			System.out.println("处理器C进行处理");
		} else {
			if (successor == null) {
				System.out.println("我后面没人了");
			} else {

				System.out.println("不在C的范围，交给C后面的人"
						+ successor.getClass().getName());
				successor.handlerRequest(request);
			}
		}
	}

}
