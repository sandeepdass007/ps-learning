package com.demo.project;

public class Truck implements Vehicle{

	@Override
	public void showWheelProperty() {
		System.out.println("Truck : 6/8 Wheel Light Vehicle");
	}

	@Override
	public void showEngineProperty() {
		System.out.println("Truck : 2000cc - 5000cc Engine");
	}

	@Override
	public void showDimensionProperty() {
		System.out.println("Truck : 8,450 mm L x 2,780 mm W x 2,780 mm H");	
	}

	@Override
	public void showPayloadProperty() {
		System.out.println("Truck : 10000KG");
	}
}
