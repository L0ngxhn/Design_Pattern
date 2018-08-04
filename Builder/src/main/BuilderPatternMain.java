package main;

import productor.Computer;
import builder.Builder;
import builder.ConcreteBuilder;
import director.Director;
/**
 * 测试类
 * @author swh
 *
 */
public class BuilderPatternMain {
	public static void main(String[] args) {
		// 电脑店李老板
		Director directorLi = new  Director();
		// 组装人员小张
		Builder builderZhang = new ConcreteBuilder();
		
		Computer computer  = directorLi.Construct(builderZhang);
		
	}
}
