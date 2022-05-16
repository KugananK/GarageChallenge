package com.qa.main;

public class Boats extends Vehicle {
	
	//Boat specific attribute
	private float price;

	//Boat constructor
	public Boats(String engineType, int range, boolean cargoStorage, float price) {
		super(engineType, range, cargoStorage);
		this.price = price;
	}

	//Abstract method
	@Override
	public int fixVehicle() {
		// TODO Auto-generated method stub
		int fixCost = 0;
		// Need to do the fix vehicle code
		if (getEngineType() == "Two Stroke") {
			fixCost += 100000;
		} else if (getEngineType() == "4 Stroke") {
			fixCost += 200000;
		} else { 
			System.out.println("Talk to boat garage to get a quote");
		}
		if (getRange() == 0) {
			System.out.println("Free as it's brand new");
		} else if (getRange() > 0 && getRange() <= 999) {
			fixCost += 50000;
		} else if (getRange() >= 1000 && getRange() <=1999) {
			fixCost += 100000;
		}else if (getRange() >= 2000) {
			fixCost += 150000;
		} else {
			System.out.println("How many miles?");
		}
		if (isCargoStorage() == true) {
			fixCost += 15000;
		} else {
			System.out.println("What even is this");
		}
		if (price > 500000) {
			fixCost += 25000;
			System.out.println("Nice boat");
		}
		return fixCost;
	}

	//Boat specific getter and setter
	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Boats [price=" + price + ", getEngineType()=" + getEngineType() + ", getRange()=" + getRange()
				+ ", isCargoStorage()=" + isCargoStorage() + "]";
	}
	
	

}
