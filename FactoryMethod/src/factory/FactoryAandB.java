package factory;

import product.Product;
import product.ProductA;
import product.ProductB;

public class FactoryAandB extends Factory {

	@Override
	public Product manufacture() {
		// TODO Auto-generated method stub
		return null;
	}
	/*
	 * simple FactoryMethod
	 */
	@Override
	public Product manufacture(String productType) {
		if (productType.equals("ProductA")) {
			return new ProductA();
		} else if (productType.equals("ProductB")) {
			return new ProductB();
		}
		return null;

	}
}
