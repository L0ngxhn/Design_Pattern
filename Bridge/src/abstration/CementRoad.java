package abstration;

import implementor.Vehicle;
/**
 * ������ľ���ʵ�֣�ˮ��·
 * @author swh
 *
 */
public class CementRoad extends Road {
	
	public CementRoad(Vehicle vehicle){
		super(vehicle);
	}
	
	
	public void driverOnRoad() {
		super.vehicle.driver();
		System.out.println("��ʻ��ˮ��·��");
	}

}
