package com.skilldistillery.abstractclasses.solutions.vehicles;

public abstract class Vehicle {
  
  private double purchasePrice;
  
  public Vehicle(double purchasePrice) {
    this.purchasePrice = purchasePrice;
  }
  
  public double getPurchasePrice() {
    return purchasePrice;
  }

  public void setPurchasePrice(double purchasePrice) {
    this.purchasePrice = purchasePrice;
  }

  @Override
  public String toString() {
    return "Vehicle [purchasePrice=" + purchasePrice + "]";
  }
  
  public double calculateRegistrationFee(double rate) {
    return 0.0;
  }

  
}
