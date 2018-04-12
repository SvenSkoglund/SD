package com.skilldistillery.polymorphism.solutions.vehicles;

public class FlyingVehicle extends Vehicle {
  private double airSpeed;
  private int range;

  public FlyingVehicle(double purchasePrice, double airSpeed, int range) {
    super(purchasePrice);
    this.airSpeed = airSpeed;
    this.range = range;
  }

  public double getAirSpeed() {
    return airSpeed;
  }

  public int getRange() {
    return range;
  }

}
