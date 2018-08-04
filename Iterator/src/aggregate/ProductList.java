package aggregate;

import java.util.List;

import iterator.AbstractIterator;
import iterator.ProductIterator;

public class ProductList  extends AbstractObjectList{

	public ProductList(List objects) {
		super(objects);
	}

	@Override
	public AbstractIterator createIterator() {
		return new ProductIterator(this);
	}

	
}
