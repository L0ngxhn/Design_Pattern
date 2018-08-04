package subject;
/**
 * 代理对象 
 * @author swh
 * 要实现与真实对象相同的接口,对外具有一致性
 */
public class Proxy implements Subject {
	 // 代理对象要拥有真实对象的引用
	private Subject realSubject = null;
	
	public Proxy(Subject realSubject){
		this.realSubject = realSubject;
	}
	
	public void buyMac() {
		realSubject.buyMac();
		System.out.println("我是代理，我帮客户买电脑");
		System.out.println("我帮客户封装好");
		
	}

}
