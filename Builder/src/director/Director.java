package director;

import productor.Computer;
import builder.Builder;
/**
 * 指挥组装者进行一定顺序的操作
 * @author swh
 *
 */
public class Director {
	public Computer Construct(Builder builder){
		System.out.println("组装电脑");
		builder.buildCPU();
		builder.buildMainBoard();
		builder.buildMainBoard();
		Computer computer = builder.getComputer();
		return computer;
	}
}
