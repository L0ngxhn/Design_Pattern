package flyWeight;

public class ConcreteFlyWeight implements FlyWeight{
	
	private String initState;
	
	public ConcreteFlyWeight(String initState){
		this.initState = initState;
	}
	
	
	public void operation(String state) {
		System.out.println("����״̬"+initState);
		System.out.println("����״̬"+state);
	}
	
}
