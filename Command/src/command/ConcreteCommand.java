package command;

import receiver.Receiver;

public class ConcreteCommand implements Command{

	private Receiver receiver = null;
	/**
	 * �������ߺ͸þ���command������а�
	 * @param receiver
	 */
	public ConcreteCommand(Receiver receiver){
		this.receiver = receiver;
	}
	
	public void execute() {
		receiver.action();		
	}

}
