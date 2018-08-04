package facade;

import system.Aircondition;
import system.Light;
import system.Television;

/**
 * ���ܿ�����--һ�����ص���
 * 
 * @author swh
 * 
 */
public class Facade {
	private Light light = new Light();
	private Television television = new Television();
	private Aircondition aircondition = new Aircondition();

	public void getUp() {
		System.out.println("�ף�������");
		// ����
		light.on();
		// ������
		television.on();
		// ���յ�
		aircondition.on();
	}

	public void setDown() {
		System.out.println("��,��Ҫ˯����");
		// ��
		light.off();
		// �ؿ�����
		television.off();
		// �ؿյ�
		aircondition.off();
	}

}
