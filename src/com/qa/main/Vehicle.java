package com.qa.main;

public abstract class Vehicle {
	//Attributes
	private String engineType;
	private int range;
	private boolean cargoStorage;
	
	//Constructor
	public Vehicle(String engineType, int range, boolean cargoStorage) {
		super();
		this.engineType = engineType;
		this.range = range;
		this.cargoStorage = cargoStorage;
	}
	
	//Abstract method
	public abstract int fixVehicle();
	
	//Getters and Setters
	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public boolean isCargoStorage() {
		return cargoStorage;
	}

	public void setCargoStorage(boolean cargoStorage) {
		this.cargoStorage = cargoStorage;
	}
	
}
