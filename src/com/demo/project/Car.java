package com.demo.project;

public class Car implements Vehicle{

	@Override
	public void showWheelProperty() {
		System.out.println("Car : 4 Wheel Light Vehicle");
	}

	@Override
	public void showEngineProperty() {
		System.out.println("Car : 1000cc - 2500cc Engine");
	}

	@Override
	public void showDimensionProperty() {
		System.out.println("Car : 4,450 mm L x 1,780 mm W x 1,780 mm H");	
	}

	@Override
	public void showPayloadProperty() {
		System.out.println("Car : 2000KG");
	}
}
