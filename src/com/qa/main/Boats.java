package com.qa.main;

public class Boats extends Vehicle {
	
	private float price;

	public Boats(String engineType, int range, boolean cargoStorage, float price) {
		super(engineType, range, cargoStorage);
		this.price = price;
	}

	@Override
	public String fixVehicle() {
		// TODO Auto-generated method stub
		return null;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	

}
