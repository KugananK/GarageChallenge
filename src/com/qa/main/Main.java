package com.qa.main;

public class Main {
	public static void main(String[] args) {

		Garage newGarage = new Garage();
		Cars Ferrari = new Cars("V10", 2500, false, 207.3f);
		Cars Mercedes = new Cars("V6", 98000, true, 155.54f);
		Cars Lexus = new Cars("V8", 250000, true, 123.0f);
		Lorries Scania = new Lorries("V6", 1612429, true, 25000);
		Lorries DAF = new Lorries("V10", 0, true, 50000);
		Motorbikes Ducatti = new Motorbikes("2 Stroke", 5000, false, 2.9f);
		Motorbikes Suzuki = new Motorbikes("4 Stroke", 15000, false, 2.3f);
		Boats Bertram = new Boats("2 Stroke", 1500, false, 100000f);
		Boats Yacht = new Boats("4 Stroke", 0, true, 5000000f);
		
		newGarage.addVehicle(Ferrari);
		newGarage.addVehicle(Mercedes);
		newGarage.addVehicle(Lexus);
		newGarage.addVehicle(Scania);
		newGarage.addVehicle(DAF);
		newGarage.addVehicle(Ducatti);
		newGarage.addVehicle(Suzuki);
		newGarage.addVehicle(Bertram);
		newGarage.addVehicle(Yacht);
		
		newGarage.getVehicle(2);
		
		newGarage.garageFixVehicle(3);
		System.out.println(newGarage.garageFixVehicle(3));
		//Need help actually printing the value
		
		newGarage.removeVehicle(2);
		
		newGarage.emptyGarage();
		
		//Need help with toString print
	}
}
