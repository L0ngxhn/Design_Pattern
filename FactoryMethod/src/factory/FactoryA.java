package factory;

import product.Product;
import product.ProductA;

public class FactoryA extends Factory {
	/*
	 * 生产A产品的工厂方法
	 * @see factory.Factory#manufacture()
	 */
	public Product manufacture() {
		return new ProductA();
	}

}
