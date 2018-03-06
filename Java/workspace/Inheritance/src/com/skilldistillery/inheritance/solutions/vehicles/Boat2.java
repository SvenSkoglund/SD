package com.skilldistillery.inheritance.solutions.vehicles;

public class Boat2 extends Vehicle2 {
  protected String name;
  protected double speedInKnots;
  protected int lengthInFeet;
  
  public Boat2() {
    
  }
  
  public Boat2(double purchasePrice, String name, double speedInKnots, int lengthInFeet) {
    setPurchasePrice(purchasePrice);
    this.name = name;
    this.speedInKnots = speedInKnots;
    this.lengthInFeet = lengthInFeet;
  }
  
  public String toString() {
    return "Boat [purchasePrice=" + getPurchasePrice() + ", name=" + name + ", speedInKnots=" + speedInKnots
        + ", lengthInFeet=" + lengthInFeet + "]";
  }
}
