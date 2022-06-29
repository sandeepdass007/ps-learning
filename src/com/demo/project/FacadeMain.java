package com.demo.project;

public class FacadeMain {
	
	/**
	 * Facade pattern hides the complexities of the system and provides a simple interface(Face/Object)
	 * to the client using which the client can access the complex complex subsystem/ set of classes/ framework.
	 * Abstraction of details 
	 * Secure from External world
	 */
	
	public static void main(String[] args) {
		
		System.out.println("Facade Design Pattern");
		
		VehicleFacade vehicleFacade = new VehicleFacade(); // facade user's interface
		
		vehicleFacade.displayWheelerProperty("car");
//		vehicleFacade.displayWheelerProperty("truck");
//		vehicleFacade.displayWheelerProperty("bike");
	}

}
