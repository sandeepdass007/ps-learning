package com.demo.project;

public class NonFacadeMainClass {
	
	public static void main(String[] args) {
		
		//Non- Facade which do not have face/Interface
		//tightly coupled 
		
		System.out.println("Non-Facade");
		
		Car car = new Car();
		car.showWheelProperty();
		car.showDimensionProperty();
		car.showEngineProperty();
		car.showPayloadProperty();
		
		
		Truck truck = new Truck();
		truck.showWheelProperty();
		truck.showDimensionProperty();
		truck.showEngineProperty();
		truck.showPayloadProperty();
		
		
		
	}

}
