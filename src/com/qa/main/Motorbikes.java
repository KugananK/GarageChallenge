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
		int fixCost = 0;
		// Need to do the fix vehicle code
		if (getEngineType() == "2 Stroke") {
			fixCost += 1000;
		} else if (getEngineType() == "4 Stroke") {
			fixCost += 1500;
		} else { 
			System.out.println("Talk to bike garage to get a quote");
		}
		if (getRange() == 0) {
			System.out.println("Free as it's brand new");
		} else if (getRange() > 0 && getRange() <= 24999) {
			fixCost += 750;
		} else if (getRange() >= 25000 && getRange() <=39999) {
			fixCost += 1250;
		}else if (getRange() >= 40000) {
			fixCost += 1600;
		} else {
			System.out.println("How many miles?");
		}
		if (isCargoStorage() == true) {
			fixCost += 100;
		} else {
			System.out.println("Where do you put your cargo?");
		}
		if (getAcceleration > 4.0f) {
			System.out.println("needs more power baby");
		}
		return "Total cost to fix your bike: " + fixCost;
	}

	//Getters and setters for mBike
	public float getAcceleration() {
		return acceleration;
	}

	public void setAcceleration(float acceleration) {
		this.acceleration = acceleration;
	}
	
	
}
