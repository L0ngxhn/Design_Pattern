package test;

import flyWeight.FlyWeight;
import flyWeight.FlyWeightFactory;

public class Main {
	public static void main(String[] args) {
		 FlyWeightFactory factory = new FlyWeightFactory();
	        FlyWeight f1 = factory.factory("a");
	        FlyWeight f2 = factory.factory("b");
	        FlyWeight f3 = factory.factory("a");

	        f1.operation("a fly weight");
	        f2.operation("b fly weight");
	        f3.operation("c fly weight");

	        System.out.println(f1 == f3);
	        System.out.println(factory.getFlyWeightSize());
	}
}
   