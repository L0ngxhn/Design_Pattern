package mediator;



import colleague.Button;
import colleague.Colleague;
import colleague.Combox;
import colleague.List;
import colleague.TextBox;

public class ConcreteMediator extends Mediator {

	// 维持对各个同事对象的引用
	public List list;
	public TextBox userNameTextBox;
	public Combox cb;
	public Button addButton; 

	public void componentChanged(Colleague c) {
		// 单击按钮
		if (c == addButton) {
			System.out.println("--单击增加按钮--");
			list.update();
			cb.update();
			userNameTextBox.update();
		}
		// 从列表框选择客户
		else if (c==list) {
			System.out.println("--从列表框选择客户--");
			cb.select();
			userNameTextBox.setText();
		}
		// 从组合框选择客户
		else if (c == cb) {
			System.out.println("--从组合框选择客户--");
			cb.select();
			userNameTextBox.setText();
		}

	}
}
