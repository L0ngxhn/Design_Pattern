package factory;

import product.Product;
import product.ProductB;

public class FactoryB extends Factory {
	/*
	 * ����B��Ʒ�Ĺ�������
	 */
	public Product manufacture() {
		return new ProductB();
	}

}
