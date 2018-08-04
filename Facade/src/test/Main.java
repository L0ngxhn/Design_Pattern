package test;

import client.Ye;

public class Main {
	public static void main(String[] args) {
		System.out.println("手动调用电器");
		Ye ye = new Ye();
		
		/**
		 * 此处只是测试段代码，实际调用在getUp方法中需要很多行
		 */
		ye.getUp();
		System.out.println("============= 智能家居为您服务======================");
		ye.getUpByFacade();
	}
}
