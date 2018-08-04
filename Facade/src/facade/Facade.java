package facade;

import system.Aircondition;
import system.Light;
import system.Television;

/**
 * 智能控制器--一键开关电器
 * 
 * @author swh
 * 
 */
public class Facade {
	private Light light = new Light();
	private Television television = new Television();
	private Aircondition aircondition = new Aircondition();

	public void getUp() {
		System.out.println("亲，您起床啦");
		// 开灯
		light.on();
		// 开电视
		television.on();
		// 开空调
		aircondition.on();
	}

	public void setDown() {
		System.out.println("亲,您要睡觉啦");
		// 灯
		light.off();
		// 关开电视
		television.off();
		// 关空调
		aircondition.off();
	}

}
