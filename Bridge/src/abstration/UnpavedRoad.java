package abstration;

import implementor.Vehicle;

/**
 * �����ʯ��·
 * @author swh
 *
 */
public class UnpavedRoad extends Road {
	public UnpavedRoad(Vehicle vehicle){
		super(vehicle);
	}

	public void driverOnRoad() {
		super.vehicle.driver();
		System.out.println("��ʻ��ʯ��·��");
	}
	
	
}
