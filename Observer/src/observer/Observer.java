package observer;

import subject.AllyControlCenter;

public interface Observer {
	public String getName();  
    public void setName(String name);  
    public void help(); //����֧Ԯ���ѷ���  
    
    // ��Ŀ�귢��֪ͨ
    public void beAttacked(AllyControlCenter acc); //�������ܹ�������  

}
