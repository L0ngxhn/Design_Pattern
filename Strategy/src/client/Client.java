package client;

import context.Context;
import context.ContextDay;

public class Client {
	public static void main(String[] args) {
		ContextDay day = new ContextDay("A");
		// ´º½Ú
		day.salesManShow();
		day.getStrategy().show();
		
		//
		// ¶ËÎç½Ú
		day.setDay("B");
		day.salesManShow();
		day.getStrategy().show();
		
	}
}
