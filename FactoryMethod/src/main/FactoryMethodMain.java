package main;

import java.util.ArrayList;
import java.util.List;

import product.Product;
import factory.Factory;
import factory.FactoryA;
import factory.FactoryB;

public class FactoryMethodMain {
	public static void main(String[] args) {
		// ��Ʒ�б�
		List<Product> products = new ArrayList<>();
		
		// �˿���ҪA��Ʒ
		Factory factoryA = new FactoryA();
		Product a = factoryA.manufacture();
		products.add(a);
		// �˿���ҪB��Ʒ
			Factory factoryB = new FactoryB();
		Product b = factoryB.manufacture();
		products.add(b);
		
		
		
	}
}
