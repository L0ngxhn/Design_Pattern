package factory;

import product.Product;
import product.ProductA;

public class FactoryA extends Factory {
	/*
	 * ����A��Ʒ�Ĺ�������
	 * @see factory.Factory#manufacture()
	 */
	public Product manufacture() {
		return new ProductA();
	}

}
