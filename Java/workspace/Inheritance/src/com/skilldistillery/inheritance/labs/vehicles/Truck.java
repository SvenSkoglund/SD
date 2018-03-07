package com.skilldistillery.inheritance.labs.vehicles;

public class Truck extends Automobile {
	private int bedSizeInCubicFeet;

	public Truck() {

	}

	public Truck(double purchasePrice, String make, String model, int year, int numberOfWheels, double speedInMph,
			int bedSizeInCubicFeet) {
		this.setPurchasePrice(purchasePrice);
		this.setMake(make);
		this.setModel(model);
		this.setYear(year);
		this.setNumberOfWheels(numberOfWheels);
		this.setSpeedInMph(speedInMph);
		this.bedSizeInCubicFeet = bedSizeInCubicFeet;
	}

	@Override
	public String toString() {
		return "Truck [bedSizeInCubicFeet=" + bedSizeInCubicFeet + ", make=" + getMake() + ", model=" + getModel() + ", year="
				+ getYear() + ", numberOfWheels=" + getNumberOfWheels() + ", speedInMph=" + getSpeedInMph() + ", purchasePrice="
				+ getPurchasePrice() + "]";
	}
	
}
