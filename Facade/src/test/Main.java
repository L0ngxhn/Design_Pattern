package test;

import client.Ye;

public class Main {
	public static void main(String[] args) {
		System.out.println("�ֶ����õ���");
		Ye ye = new Ye();
		
		/**
		 * �˴�ֻ�ǲ��Զδ��룬ʵ�ʵ�����getUp��������Ҫ�ܶ���
		 */
		ye.getUp();
		System.out.println("============= ���ܼҾ�Ϊ������======================");
		ye.getUpByFacade();
	}
}
