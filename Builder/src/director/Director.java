package director;

import productor.Computer;
import builder.Builder;
/**
 * ָ����װ�߽���һ��˳��Ĳ���
 * @author swh
 *
 */
public class Director {
	public Computer Construct(Builder builder){
		System.out.println("��װ����");
		builder.buildCPU();
		builder.buildMainBoard();
		builder.buildMainBoard();
		Computer computer = builder.getComputer();
		return computer;
	}
}
