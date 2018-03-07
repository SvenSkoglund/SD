package com.skilldistillery.inheritance.labs.vehicles;

public class Boat extends Vehicle {
	private String name;
	private double speedInKnots;
	private int lengthInFeet;

	public Boat() {

	}

	public Boat(double purchasePrice, String name, double speedInKnots, int lengthInFeet) {
		this.setPurchasePrice(purchasePrice);
		this.name = name;
		this.speedInKnots = speedInKnots;
		this.lengthInFeet = lengthInFeet;
	}

	@Override
	public String toString() {
		return "Boat [name=" + name + ", speedInKnots=" + speedInKnots + ", lengthInFeet=" + lengthInFeet
				+ ", purchasePrice=" + getPurchasePrice() + "]";
	}

}
