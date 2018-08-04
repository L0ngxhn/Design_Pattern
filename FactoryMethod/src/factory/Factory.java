package factory;

import product.Product;
/**
 * 抽象工厂类
 * @author swh
 *
 */
public abstract class Factory {
	// factory Method
	public abstract Product manufacture();
	
	// simple factory Method
	public  Product manufacture(String productType){
		return null;
	};
}
