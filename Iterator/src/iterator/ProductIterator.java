package iterator;

import java.util.List;

import aggregate.ProductList;

public class ProductIterator implements AbstractIterator{
	//�ھ������������Ҫά��һ���Ծ���ۺ϶�������ã��ù�����ϵ��Ŀ���Ƿ��ʴ洢�ھۺ϶����е����ݣ��Ա�������ܹ�����Щ���ݽ��б���������
	
	// �������������ھۺ����ڲ��������豣��Ծۺ�������á�
	 private ProductList productList;  
	    private List products;  
	    private int cursor1; //����һ���α꣬���ڼ�¼���������λ��  
	    private int cursor2; //����һ���α꣬���ڼ�¼���������λ��  
	
	    public ProductIterator(ProductList list) {  
	        this.productList = list;  
	        this.products = list.getObjects(); //��ȡ���϶���  
	        cursor1 = 0; //������������α�ĳ�ʼֵ  
	        cursor2 = products.size() -1; //������������α�ĳ�ʼֵ  
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
