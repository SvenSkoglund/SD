package com.skilldistillery.polymorphism.labs.vehicles;

public class Boat extends Vehicle {
  protected String name;
  protected double speedInKnots;
  protected int lengthInFeet;
  
  public Boat(double purchasePrice, String name, double speedInKnots, int lengthInFeet) {
    super(purchasePrice);
    this.name = name;
    this.speedInKnots = speedInKnots;
    this.lengthInFeet = lengthInFeet;
  }
  
  public int getLengthInFeet() {
    return lengthInFeet;
  }
  
}
