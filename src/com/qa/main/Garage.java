package com.qa.main;

import java.util.ArrayList;

public class Garage {

	public ArrayList<Vehicle> Garage = new ArrayList();
	
	public boolean addVehicle(Vehicle vehicle) {
		return Garage.add(vehicle);
		}
	
	public boolean removeVehicle(Vehicle vehicle) {
		return Garage.remove(vehicle);
	}
	public boolean getVehicle(int index) {
		return Garage.get(index) != null;
	}
	public String fixVehicle(int index) {
		return Garage.get(index).fixVehicle();
	}
	public String emptyGarage() {
		Garage.clear();
		return "Garage is empty";
	}
}
