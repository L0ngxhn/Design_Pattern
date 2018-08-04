package factory;

import bean.Border;
import bean.Button;
import beanMac.BorderMac;
import beanWindows.ButtonWindows;

public class WinFactory implements AbstractFactory{

	public Button createButton() {
		return new ButtonWindows();
	}

	public Border createBorter() {
		return new BorderMac();
	}
	
}
