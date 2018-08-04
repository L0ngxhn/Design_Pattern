package factory;

import product.Product;
import product.ProductB;

public class FactoryB extends Factory {
	/*
	 * 生产B产品的工厂方法
	 */
	public Product manufacture() {
		return new ProductB();
	}

}
