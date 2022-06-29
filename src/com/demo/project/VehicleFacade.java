package com.demo.project;

public class VehicleFacade {
	
	private Car car;
	private Truck truck;
	
	public VehicleFacade() {
		car = new Car();
		truck = new Truck();
	}
	
	public void displayWheelerProperty(String vehicle){
		
		switch(vehicle) {
		case "car" : 
			car.showWheelProperty();
			car.showDimensionProperty();
			car.showEngineProperty();
			car.showPayloadProperty();
			break;
		case "truck" :
			truck.showWheelProperty();
			truck.showDimensionProperty();
			truck.showEngineProperty();
			truck.showPayloadProperty();
			break;
		default : System.out.println("Unknown Type");
		
		}
		
	}

}
