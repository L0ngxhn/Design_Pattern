package handler;

public class ConcreteHandlerC extends Handler {

	public void handlerRequest(int request) {
		if (request > 20 && request <= 30) {
			System.out.println("������C���д���");
		} else {
			if (successor == null) {
				System.out.println("�Һ���û����");
			} else {

				System.out.println("����C�ķ�Χ������C�������"
						+ successor.getClass().getName());
				successor.handlerRequest(request);
			}
		}
	}

}
