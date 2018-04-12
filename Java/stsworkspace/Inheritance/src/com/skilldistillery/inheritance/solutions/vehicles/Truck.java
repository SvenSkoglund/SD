package com.skilldistillery.inheritance.solutions.vehicles;

public class Truck extends Automobile {
  protected int bedSizeInCubicFeet;
  public Truck() {

  }
  public Truck(double purchasePrice, String make, String model, int year, int numberOfWheels, double speedInMph,
      int bedSizeInCubicFeet) {
    this.purchasePrice = purchasePrice;   // Vehicle field
    this.make = make;                     // Automobile fields
    this.model = model;
    this.year = year;
    this.numberOfWheels = numberOfWheels;
    this.speedInMph = speedInMph;
    this.bedSizeInCubicFeet = bedSizeInCubicFeet;
  }
  
  
  
}
