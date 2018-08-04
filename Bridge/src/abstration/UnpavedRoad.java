package abstration;

import implementor.Vehicle;

/**
 * 具体的石子路
 * @author swh
 *
 */
public class UnpavedRoad extends Road {
	public UnpavedRoad(Vehicle vehicle){
		super(vehicle);
	}

	public void driverOnRoad() {
		super.vehicle.driver();
		System.out.println("行驶在石子路上");
	}
	
	
}
