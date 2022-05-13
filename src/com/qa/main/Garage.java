package com.qa.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Garage {

	public ArrayList<Vehicle> newGarage = new ArrayList();
	
	public boolean addVehicle(Vehicle vehicle) {
		System.out.println("Added vehicle");
		return newGarage.add(vehicle);
		}
	
	public boolean removeVehicle(Vehicle vehicle) {
		System.out.println("Removed vehicle");
		return newGarage.remove(vehicle);
	}
	public Vehicle getVehicle(int vehicle) {
		System.out.println("Got vehicle");
		System.out.println(newGarage.get(vehicle));
		return newGarage.get(vehicle);
	}
	public int fixVehicle(int vehicle) {
		System.out.println("Fixed vehicle");
		return newGarage.get(vehicle).fixVehicle();
	}
	public String emptyGarage() {
		newGarage.clear();
		System.out.println("Garage has been cleared");
		return "Garage is empty";
	}

	//Need help with toString print
	@Override
	public String toString() {
		return "Garage [newGarage=" + newGarage + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}


	
}
