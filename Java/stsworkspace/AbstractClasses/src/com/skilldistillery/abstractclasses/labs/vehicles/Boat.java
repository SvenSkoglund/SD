package com.skilldistillery.abstractclasses.labs.vehicles;

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
  
  @Override
  public String toString() {
    return "Boat [name=" + name + ", speedInKnots=" + speedInKnots + ", lengthInFeet=" + lengthInFeet
        + ", getPurchasePrice()=" + getPurchasePrice() + "]";
  }
  
  @Override
  public double calculateRegistrationFee(double rate) {
    if(lengthInFeet >= 30) {
      rate *= 2;
    }
    return rate * getPurchasePrice();
  }
  
}
