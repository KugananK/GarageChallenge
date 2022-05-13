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
	public String fixVehicle() {
		// TODO Auto-generated method stub
		return null;
	}

	//Boat specific getter and setter
	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	

}
