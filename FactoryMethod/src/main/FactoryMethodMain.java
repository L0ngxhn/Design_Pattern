package main;

import java.util.ArrayList;
import java.util.List;

import product.Product;
import factory.Factory;
import factory.FactoryA;
import factory.FactoryB;

public class FactoryMethodMain {
	public static void main(String[] args) {
		// 产品列表
		List<Product> products = new ArrayList<>();
		
		// 顾客需要A产品
		Factory factoryA = new FactoryA();
		Product a = factoryA.manufacture();
		products.add(a);
		// 顾客需要B产品
			Factory factoryB = new FactoryB();
		Product b = factoryB.manufacture();
		products.add(b);
		
		
		
	}
}
