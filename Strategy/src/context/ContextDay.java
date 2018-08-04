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
		// 春节就使用春节促销活动
		case "A":
			strategy = new StrategyA();
			break;
		// 端午节就使用端午节促销活动
		case "B":
			strategy = new StrategyB();
			break;
		// 中秋节就使用中秋节促销活动
		case "C":
			strategy = new StrategyC();
			break;
		}
	}
}
