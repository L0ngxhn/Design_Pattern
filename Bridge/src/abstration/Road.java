package abstration;

import implementor.Vehicle;
/**
 * ³éÏóµÄÂ· 
 * @author swh
 *
 */
public abstract class Road {
	protected Vehicle vehicle;
	
	public Road(Vehicle vehicle){
		this.vehicle = vehicle;
	}
	
	public abstract void driverOnRoad();
	
}
