package colleague;

import mediator.Mediator;
/**
 * 抽象同事类
 * @author swh
 *
 */
public abstract class Colleague {
	private Mediator mediator; 
	
	public void setMediator(Mediator mediator){
		this.mediator = mediator;
	}
	// 转发调用
	public void changed(){
		mediator.componentChanged(this);
	}
	
	
	public abstract void update();
}
