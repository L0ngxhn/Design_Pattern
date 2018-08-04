package factory;

import bean.Border;
import bean.Button;
import beanMac.BorderMac;
import beanMac.ButtonMac;

public class MacFactory implements AbstractFactory{

	public Button createButton() {
		return new ButtonMac();
	}

	public Border createBorter() {
		return new BorderMac();
	}

}
