package builder;

import productor.Computer;
/**
 * �����ĳ����װ�ߣ�
 * @author swh
 *
 */
public class ConcreteBuilder extends Builder {

	Computer computer = new Computer();
	
	public void buildCPU() {
		computer.add("��װCPU");
	}

	public void buildMainBoard() {
		computer.add("��װ����");
	}

	public void buildHd() {
		computer.add("��װӲ��");
	}

	public Computer getComputer() {
		return this.computer;
	}

}
