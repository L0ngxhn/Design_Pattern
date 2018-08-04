package observer;

import subject.AllyControlCenter;

public interface Observer {
	public String getName();  
    public void setName(String name);  
    public void help(); //声明支援盟友方法  
    
    // 向目标发起通知
    public void beAttacked(AllyControlCenter acc); //声明遭受攻击方法  

}
