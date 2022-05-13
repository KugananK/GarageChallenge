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
	
	public Vehicle getVehicle(Vehicle vehicle) {
		return Garage.get(0);
	}
	public String fixVehicle() {
		return Garage.get(0).fixVehicle();
	}
}
