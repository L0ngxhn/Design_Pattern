package colleague;

import mediator.Mediator;
/**
 * ����ͬ����
 * @author swh
 *
 */
public abstract class Colleague {
	private Mediator mediator; 
	
	public void setMediator(Mediator mediator){
		this.mediator = mediator;
	}
	// ת������
	public void changed(){
		mediator.componentChanged(this);
	}
	
	
	public abstract void update();
}
