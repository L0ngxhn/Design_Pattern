package client;

import context.Context;
import context.ContextDay;

public class Client {
	public static void main(String[] args) {
		ContextDay day = new ContextDay("A");
		// ����
		day.salesManShow();
		day.getStrategy().show();
		
		//
		// �����
		day.setDay("B");
		day.salesManShow();
		day.getStrategy().show();
		
	}
}
