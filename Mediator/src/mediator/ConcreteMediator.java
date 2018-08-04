package mediator;



import colleague.Button;
import colleague.Colleague;
import colleague.Combox;
import colleague.List;
import colleague.TextBox;

public class ConcreteMediator extends Mediator {

	// ά�ֶԸ���ͬ�¶��������
	public List list;
	public TextBox userNameTextBox;
	public Combox cb;
	public Button addButton; 

	public void componentChanged(Colleague c) {
		// ������ť
		if (c == addButton) {
			System.out.println("--�������Ӱ�ť--");
			list.update();
			cb.update();
			userNameTextBox.update();
		}
		// ���б��ѡ��ͻ�
		else if (c==list) {
			System.out.println("--���б��ѡ��ͻ�--");
			cb.select();
			userNameTextBox.setText();
		}
		// ����Ͽ�ѡ��ͻ�
		else if (c == cb) {
			System.out.println("--����Ͽ�ѡ��ͻ�--");
			cb.select();
			userNameTextBox.setText();
		}

	}
}
