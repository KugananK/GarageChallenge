package com.qa.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Garage {

	public ArrayList<Vehicle> newGarage = new ArrayList<>();
	
	public boolean addVehicle(Vehicle vehicle) {
		System.out.println("Added vehicle");
		newGarage.add(vehicle);
		return true;
		}
	
	public Vehicle removeVehicle(int index) {
		System.out.println("Removed vehicle");
		return newGarage.remove(index);
	}
	public Vehicle getVehicle(int index) {
		System.out.println("Got vehicle");
		System.out.println(newGarage.get(index));
		return newGarage.get(index);
		
	}
	public int garageFixVehicle(int index) {
		Vehicle vehicleToFix = getVehicle(index);
		System.out.println("Fixed vehicle");
		return 	vehicleToFix.fixVehicle();
	}
	public ArrayList<Vehicle> getAllVehicles() {
		return newGarage;
	}
	public String emptyGarage() {
		newGarage.clear();
		System.out.println("Garage has been cleared");
		return "Garage is empty";
	}



	
}
