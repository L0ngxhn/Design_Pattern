package subject;
/**
 * ������� 
 * @author swh
 * Ҫʵ������ʵ������ͬ�Ľӿ�,�������һ����
 */
public class Proxy implements Subject {
	 // �������Ҫӵ����ʵ���������
	private Subject realSubject = null;
	
	public Proxy(Subject realSubject){
		this.realSubject = realSubject;
	}
	
	public void buyMac() {
		realSubject.buyMac();
		System.out.println("���Ǵ����Ұ�ͻ������");
		System.out.println("�Ұ�ͻ���װ��");
		
	}

}
