package com.skilldistillery.inheritance.solutions.vehicles;

public class Automobile extends Vehicle {
  protected String make;
  protected String model;
  protected int year;
  protected int numberOfWheels;
  protected double speedInMph;
  
  public Automobile() {

  }

  public Automobile(double purchasePrice, String make, String model, int year, int numberOfWheels, double speedInMph) {
    this.purchasePrice = purchasePrice;  // Vehicle field
    this.make = make;
    this.model = model;
    this.year = year;
    this.numberOfWheels = numberOfWheels;
    this.speedInMph = speedInMph;
  }

  public String toString() {
    return "Automobile [purchasePrice=" + purchasePrice + ", make=" + make + ", model=" + model + ", year=" + year + ", numberOfWheels=" + numberOfWheels
        + ", speedInMph=" + speedInMph + "]";
  }
}
