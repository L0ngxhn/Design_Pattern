package command;

import receiver.Receiver;

public class ConcreteCommand implements Command{

	private Receiver receiver = null;
	/**
	 * 将接收者和该具体command对象进行绑定
	 * @param receiver
	 */
	public ConcreteCommand(Receiver receiver){
		this.receiver = receiver;
	}
	
	public void execute() {
		receiver.action();		
	}

}
