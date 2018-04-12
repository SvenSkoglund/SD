package com.skilldistillery.inheritance.labs.vehicles;

public class VehicleTestApp {

	public static void main(String[] args) {

		Automobile am = new Automobile(1000, "Ford", "Fiesta", 2012, 4, 90);
		Boat boat = new Boat(3000, "SS Salamander", 100, 40);
		Truck tr = new Truck(5000, "Ford", "F250", 1990, 4, 85, 15);

		System.out.println(am.toString());
		System.out.println(boat.toString());
		System.out.println(tr.toString());

	}

}
