package com.qa.main;

public class Motorbikes extends Vehicle {
	
	//Motorbike specific attribute
	private float acceleration;

	//Constructor
	public Motorbikes(String engineType, int range, boolean cargoStorage, float acceleration) {
		super(engineType, range, cargoStorage);
		this.acceleration = acceleration;
	}

	//abstract method
	@Override
	public String fixVehicle() {
		// TODO Auto-generated method stub
		return null;
	}

	//Getters and settes for mBike
	public float getAcceleration() {
		return acceleration;
	}

	public void setAcceleration(float acceleration) {
		this.acceleration = acceleration;
	}
	
	
}
