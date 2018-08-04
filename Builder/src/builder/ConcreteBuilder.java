package builder;

import productor.Computer;
/**
 * 具体的某种组装者：
 * @author swh
 *
 */
public class ConcreteBuilder extends Builder {

	Computer computer = new Computer();
	
	public void buildCPU() {
		computer.add("组装CPU");
	}

	public void buildMainBoard() {
		computer.add("组装主板");
	}

	public void buildHd() {
		computer.add("组装硬盘");
	}

	public Computer getComputer() {
		return this.computer;
	}

}
