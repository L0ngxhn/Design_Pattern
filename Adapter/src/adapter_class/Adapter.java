package adapter_class;

public class Adapter extends Adaptee  implements Target{
	
	
	//Ŀ��ӿ�Ҫ�����Request()�������������Դ��Adapteeû�з���Request()
    //������������������������
    //��ʵ����Request()ֻ�ǵ���Դ��Adaptee��SpecificRequest()����������
    //����������ֻ�ǽ�SpecificRequest()��������һ���װ����װ��Target���Ե��õ�Request()����
	public void request() {
		super.SpecificRequest();
	}

}
