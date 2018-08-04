package factory;

import bean.Border;
import bean.Button;

public interface AbstractFactory {
	Button createButton();
	Border createBorter();
}
