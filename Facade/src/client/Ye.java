package client;

import facade.Facade;
import system.Aircondition;
import system.Light;
import system.Television;

public class Ye {
	
	//----------û�����ܼҾ�֮ǰ��ֻ����Client�Լ�������ϵͳ����-------//
	// �ֶ��������ּҵ�
	public void getUp(){
		 Light light = new  Light();
		 Television television = new Television();
		  Aircondition aircondition = new Aircondition();
		
		System.out.println("������");
		// ����
		light.on();
		// ������
		television.on();
		// ���յ�
		aircondition.on();
	}
	
	// -------------�Դ��������ܼҵ磬��Ҳ������ô�鷳��-----------//
	public void getUpByFacade(){
		Facade facade = new Facade();
		facade.getUp();
	}
}
