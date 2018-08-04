package client;



import invoker.Invoker;
import command.Command;
import command.ConcreteCommand;
import receiver.Receiver;

public class Client {
	public static void main(String[] args) {
		// 创建接收者
		Receiver receiver = new Receiver();
		// 创建命令对象， 设定它的接收者
		Command command = new ConcreteCommand(receiver);
	
		
		//*****************************************//
		// 创建请求者，把命令对象设置进去
		Invoker invoker =new Invoker(command);
		// 执行者---->执行方法 ----》会调用使得命令对象去调用接收者方法
		//  但是执行者并不知道接收者是谁
		invoker.action();
	}
}
