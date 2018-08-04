package builder;

import productor.Computer;
/**
 * 构造者抽象类：会组装电脑的一类人
 * @author swh
 *
 */
public abstract class Builder {
	// 装配CPU
	public abstract void buildCPU();
	// 装配主板
	public abstract void buildMainBoard();
	// 装配硬盘
	public abstract void buildHd();
	// 组装起来
	public abstract Computer getComputer();
	
}
