package context;

import strategy.StrategyA;
import strategy.StrategyB;
import strategy.StrategyC;

public class ContextDay extends Context {
	private String day;
	
	public ContextDay(String day) {
		super();
		this.day = day;
	}


	public String getDay() {
		return day;
	}


	public void setDay(String day) {
		this.day = day;
	}


	public void salesManShow() {
		switch (day) {
		// ���ھ�ʹ�ô��ڴ����
		case "A":
			strategy = new StrategyA();
			break;
		// ����ھ�ʹ�ö���ڴ����
		case "B":
			strategy = new StrategyB();
			break;
		// ����ھ�ʹ������ڴ����
		case "C":
			strategy = new StrategyC();
			break;
		}
	}
}
