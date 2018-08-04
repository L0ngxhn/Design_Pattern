package context;

import  strategy.Strategy;

/**
 * иообнд
 * @author swh
 *
 */
public  abstract class Context {
	protected Strategy strategy;

	public Strategy getStrategy() {
		return strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	public abstract void salesManShow();
	
}
