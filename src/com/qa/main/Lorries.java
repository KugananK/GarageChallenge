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
	public String fixVehicle() {
		// TODO Auto-generated method stub
		return null;
	}

	//Lorry specific getter and setter
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	

}
