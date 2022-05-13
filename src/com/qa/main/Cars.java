package com.qa.main;

public class Cars extends Vehicle {
	//Car specific attribute
	private float topSpeed;

	//Constructor
	public Cars(String engineType, int range, boolean cargoStorage, float topSpeed) {
		super(engineType, range, cargoStorage);
		this.topSpeed = topSpeed;
	}

	//Abstract method
	@Override
	public String fixVehicle() {
		// Need to do the fix vehicle code
		return null;
	}

	//Getters and setters for car specific attribute
	public float getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(float topSpeed) {
		this.topSpeed = topSpeed;
	}
	
	
	
	
}
