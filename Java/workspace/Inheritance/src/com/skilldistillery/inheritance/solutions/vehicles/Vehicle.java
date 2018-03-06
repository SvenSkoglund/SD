package com.skilldistillery.inheritance.solutions.vehicles;

public class Vehicle {
  
  protected double purchasePrice;
  
  public Vehicle() {
    
  }
  
  public Vehicle(double purchasePrice) {
    this.purchasePrice = purchasePrice;
  }

  public String toString() {
    return "Vehicle [purchasePrice=" + purchasePrice + "]";
  }
}
