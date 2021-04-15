package com.batson_java_course_2021.Week_03;

// INTERFACE ENSURES THAT THE CLASS IMPLEMENTS IT METHODS, basically like a contract, ensures that the class implements it's methods

public interface Vehicle {
	
	//ABSTRACT METHODS = JUST METHOD SIGNATURE, all methods are abstract in an interface methods
		void accelerate(int mph);
		void stop();
		boolean carryPassengers();
}	

	//CONCRETE
class Boat implements Vehicle {
	public void accelerate(int mph) {
		System.out.println("Goes faster");
		}

	public void stop() {
		System.out.println("Not able to stop quickly.");
		}

	public boolean carryPassengers() {
		return true;
		}
	
}

class Plane implements Vehicle {
	public void accelerate(int mph) {
		System.out.println("Woosh");
	}
	
	public void stop() {
		System.out.println("Please stop!");
	}
	
	public boolean carryPassengers() {
		return true;
	}
}

class Car implements Vehicle {
	public void accelerate(int mph) {
		System.out.println("Travelling at " + mph);
	}
	
	public void stop() {
		System.out.println("Stopping...");
	}
	
	public boolean carryPassengers() {
		return true;
	}
}
