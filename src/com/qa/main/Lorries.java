package com.qa.main;

public class Lorries extends Vehicle {
	
	//Lorry specific attributes
	private int weight;

	//Lorry constructor
	public Lorries(String engineType, int range, boolean cargoStorage, int weight) {
		super(engineType, range, cargoStorage);
		this.weight = weight;
	}

	//Abstract method
	@Override
	public int fixVehicle() {
		int fixCost = 0;
		// Need to do the fix vehicle code
		if (getEngineType() == "V6") {
			fixCost += 10000;
		} else if (getEngineType() == "V8") {
			fixCost += 20000;
		} else if (getEngineType() == "V10") {
			fixCost += 25000;
		} else { 
			System.out.println("Talk to lorry garage to get a quote");
		}
		if (getRange() == 0) {
			System.out.println("Free as it's brand new");
		} else if (getRange() > 0 && getRange() <= 249999) {
			fixCost += 50000;
		} else if (getRange() >= 250000 && getRange() <=999999) {
			fixCost += 100000;
		}else if (getRange() >= 1000000) {
			fixCost += 150000;
		} else {
			System.out.println("How many miles?");
		}
		if (isCargoStorage() == true) {
			fixCost += 15000;
		} else {
			System.out.println("That's a cute lorry");
		}
		return fixCost;
	}

	//Lorry specific getter and setter
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Lorries [Weight = " + weight + ", Engine Type = " + getEngineType() + ", Range = " + getRange()
				+ ", Cargo Storage = " + isCargoStorage() + "]";
	}
	
	

}
