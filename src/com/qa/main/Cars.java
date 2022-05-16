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
	public int fixVehicle() {
		int fixCost = 0;
		// Need to do the fix vehicle code
		if (getEngineType() == "V6") {
			fixCost += 2500;
		} else if (getEngineType() == "V8") {
			fixCost += 5000;
		} else if (getEngineType() == "V10") {
			fixCost += 7500;
		} else { 
			System.out.println("Talk to car garage to get a quote");
		}
		if (getRange() == 0) {
			System.out.println("Free as it's brand new");
		} else if (getRange() > 0 && getRange() <= 49999) {
			fixCost += 5000;
		} else if (getRange() >= 50000 && getRange() <=99999) {
			fixCost += 10000;
		}else if (getRange() >= 100000) {
			fixCost += 15000;
		} else {
			System.out.println("How many miles?");
		}
		if (isCargoStorage() == true) {
			fixCost += 500;
		} else {
			System.out.println("Where do you put your cargo?");
		}
		if (getTopSpeed() >= 100f && getTopSpeed() <=149.99f) {
			fixCost += 250;
		} else if (getTopSpeed() >= 150f && getTopSpeed() <=199.99f) {
			fixCost+= 750;
		} else {
			fixCost += 2000;
			System.out.println("That's a fast car");
		}
		return fixCost;
	}

	//Getters and setters for car specific attribute
	public float getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(float topSpeed) {
		this.topSpeed = topSpeed;
	}

	@Override
	public String toString() {
		return "Cars [topSpeed=" + topSpeed + ", getEngineType()=" + getEngineType() + ", getRange()=" + getRange()
				+ ", isCargoStorage()=" + isCargoStorage() + "]";
	}
	
	
}
