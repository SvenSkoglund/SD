package com.skilldistillery.inheritance.labs.vehicles;

public class Vehicle {
	private double purchasePrice;
	
	public Vehicle() {
	}

	public Vehicle(double purchasePrice) {
		this.setPurchasePrice(purchasePrice);
	}

	@Override
	public String toString() {
		return "Vehicle [purchasePrice=" + getPurchasePrice() + "]";
	}

	public double getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	

}
