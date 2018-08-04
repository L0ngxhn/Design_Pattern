package client;

import facade.Facade;
import system.Aircondition;
import system.Light;
import system.Television;

public class Ye {
	
	//----------没有智能家居之前，只好由Client自己操作子系统功能-------//
	// 手动操作各种家电
	public void getUp(){
		 Light light = new  Light();
		 Television television = new Television();
		  Aircondition aircondition = new Aircondition();
		
		System.out.println("起床啦！");
		// 开灯
		light.on();
		// 开电视
		television.on();
		// 开空调
		aircondition.on();
	}
	
	// -------------自从有了智能家电，再也不用那么麻烦了-----------//
	public void getUpByFacade(){
		Facade facade = new Facade();
		facade.getUp();
	}
}
