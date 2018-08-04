package test;

import implementor.Car;
import abstration.CementRoad;
import abstration.Road;

public class Test {
	public static void main(String[] args) {
		Road road = new CementRoad(new Car());
		road.driverOnRoad();
	}
}
