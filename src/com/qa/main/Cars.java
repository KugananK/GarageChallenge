package com.qa.main;

public class Cars extends Vehicle {
	//Car specifc attribute
	private float topSpeed;

	//Constructor
	public Cars(String engineType, int range, boolean cargoStorage, float topSpeed) {
		super(engineType, range, cargoStorage);
		this.topSpeed = topSpeed;
	}

	@Override
	public String fixVehicle() {
		// Need to do the fix vehicle code
		return null;
	}
	
	
}
