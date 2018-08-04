package client;

import mediator.ConcreteMediator;
import colleague.Button;
import colleague.Combox;
import colleague.List;
import colleague.TextBox;

public class Client {
	public static void main(String args[]) {
		// �����н��߶���
		ConcreteMediator mediator= new ConcreteMediator();

		// ����ͬ�¶���
		Button addBT = new Button();
		List list = new List();
		Combox cb = new Combox();
		TextBox userNameTB = new TextBox();

		addBT.setMediator(mediator);
		list.setMediator(mediator);
		cb.setMediator(mediator);
		userNameTB.setMediator(mediator);
		
		// �н��ߺ����֮���໥����
		mediator.addButton = addBT;
		mediator.list = list;
		mediator.cb = cb;
		mediator.userNameTextBox = userNameTB;

		
		addBT.changed();
		System.out.println("-----------------------------");
		list.changed();
	}
}
