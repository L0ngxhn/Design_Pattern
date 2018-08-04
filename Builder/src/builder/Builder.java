package builder;

import productor.Computer;
/**
 * �����߳����ࣺ����װ���Ե�һ����
 * @author swh
 *
 */
public abstract class Builder {
	// װ��CPU
	public abstract void buildCPU();
	// װ������
	public abstract void buildMainBoard();
	// װ��Ӳ��
	public abstract void buildHd();
	// ��װ����
	public abstract Computer getComputer();
	
}
