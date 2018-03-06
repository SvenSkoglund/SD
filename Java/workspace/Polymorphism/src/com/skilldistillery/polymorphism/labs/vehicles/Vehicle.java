package com.skilldistillery.polymorphism.labs.vehicles;

public class Vehicle {
  
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

  
}
