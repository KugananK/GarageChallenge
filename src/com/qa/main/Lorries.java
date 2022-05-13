package com.qa.main;

public class Lorries extends Vehicle {
	
	private int weight;

	public Lorries(String engineType, int range, boolean cargoStorage, int weight) {
		super(engineType, range, cargoStorage);
		this.weight = weight;
	}

	@Override
	public String fixVehicle() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	

}
