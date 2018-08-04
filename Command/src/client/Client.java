package client;



import invoker.Invoker;
import command.Command;
import command.ConcreteCommand;
import receiver.Receiver;

public class Client {
	public static void main(String[] args) {
		// ����������
		Receiver receiver = new Receiver();
		// ����������� �趨���Ľ�����
		Command command = new ConcreteCommand(receiver);
	
		
		//*****************************************//
		// ���������ߣ�������������ý�ȥ
		Invoker invoker =new Invoker(command);
		// ִ����---->ִ�з��� ----�������ʹ���������ȥ���ý����߷���
		//  ����ִ���߲���֪����������˭
		invoker.action();
	}
}
