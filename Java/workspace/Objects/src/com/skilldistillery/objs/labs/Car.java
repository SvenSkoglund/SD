package com.skilldistillery.objs.labs;

public class Car {
	private String make;
	private String model;
	private String color;
	private int numberOfWheels;
	private double purchasePrice;

	public String toString() {
		String output = "make=" + make + ", model=" + model + ", color=" + color + ", numberOfWheels=" + numberOfWheels
				+ ", purchasePrice=" + purchasePrice;
		return output;
	}

	public Car() {
		
	}
	public Car(String make, String model, String color, int wheels, double price) {
		this.make = make;
		this.model = model;
		this.color = color;
		this.numberOfWheels = wheels;
		this.purchasePrice = price;
	}

	public void displayCar() {
		String carData = toString();
		System.out.println(carData);
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	public double getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
}
