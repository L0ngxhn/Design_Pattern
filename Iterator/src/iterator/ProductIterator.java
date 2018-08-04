package iterator;

import java.util.List;

import aggregate.ProductList;

public class ProductIterator implements AbstractIterator{
	//在具体迭代器中需要维持一个对具体聚合对象的引用，该关联关系的目的是访问存储在聚合对象中的数据，以便迭代器能够对这些数据进行遍历操作。
	
	// 若迭代器声明在聚合类内部，则无需保存对聚合类的引用。
	 private ProductList productList;  
	    private List products;  
	    private int cursor1; //定义一个游标，用于记录正向遍历的位置  
	    private int cursor2; //定义一个游标，用于记录逆向遍历的位置  
	
	    public ProductIterator(ProductList list) {  
	        this.productList = list;  
	        this.products = list.getObjects(); //获取集合对象  
	        cursor1 = 0; //设置正向遍历游标的初始值  
	        cursor2 = products.size() -1; //设置逆向遍历游标的初始值  
	    }  

	    public void next() {  
	        if(cursor1 < products.size()) {  
	            cursor1++;  
	        }  
	    }  

	    public boolean isLast() {  
	        return (cursor1 == products.size());  
	    }  

	    public void previous() {  
	        if (cursor2 > -1) {  
	            cursor2--;  
	        }  
	    }  

	    public boolean isFirst() {  
	        return (cursor2 == -1);  
	    }  

	    public Object getNextItem() {  
	        return products.get(cursor1);  
	    }   

	    public Object getPreviousItem() {  
	        return products.get(cursor2);  
	    }     

}
