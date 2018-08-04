package abstration;

import implementor.Vehicle;
/**
 * 抽象类的具体实现：水泥路
 * @author swh
 *
 */
public class CementRoad extends Road {
	
	public CementRoad(Vehicle vehicle){
		super(vehicle);
	}
	
	
	public void driverOnRoad() {
		super.vehicle.driver();
		System.out.println("行驶在水泥路上");
	}

}
