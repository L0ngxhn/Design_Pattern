package aggregate;

import iterator.AbstractIterator;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractObjectList {
	private List<Object> objects = new ArrayList<>();
	
	
	public AbstractObjectList(List objects) {  
        this.objects = objects;  
    }  
	
	public void addObject(Object obj) {  
        this.objects.add(obj);  
    }  

    public void removeObject(Object obj) {  
        this.objects.remove(obj);  
    }  

    public List getObjects() {  
        return this.objects;  
    }  

    //������������������ĳ��󹤳�����  
    public abstract AbstractIterator createIterator();  
}
