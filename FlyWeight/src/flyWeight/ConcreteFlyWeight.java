package flyWeight;

public class ConcreteFlyWeight implements FlyWeight{
	
	private String initState;
	
	public ConcreteFlyWeight(String initState){
		this.initState = initState;
	}
	
	
	public void operation(String state) {
		System.out.println("ÄÚÔÌ×´Ì¬"+initState);
		System.out.println("ÍâÔÌ×´Ì¬"+state);
	}
	
}
