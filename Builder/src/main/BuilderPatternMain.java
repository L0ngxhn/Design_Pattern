package main;

import productor.Computer;
import builder.Builder;
import builder.ConcreteBuilder;
import director.Director;
/**
 * ������
 * @author swh
 *
 */
public class BuilderPatternMain {
	public static void main(String[] args) {
		// ���Ե����ϰ�
		Director directorLi = new  Director();
		// ��װ��ԱС��
		Builder builderZhang = new ConcreteBuilder();
		
		Computer computer  = directorLi.Construct(builderZhang);
		
	}
}
