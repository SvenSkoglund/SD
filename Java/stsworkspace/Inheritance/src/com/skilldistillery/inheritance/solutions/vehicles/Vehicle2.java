package com.skilldistillery.inheritance.solutions.vehicles;

public class Vehicle2 {
  
  private double purchasePrice;
  
  public Vehicle2() {
    
  }
  
  public Vehicle2(double purchasePrice) {
    this.purchasePrice = purchasePrice;
  }
  
  public double getPurchasePrice() {
    return purchasePrice;
  }

  public void setPurchasePrice(double purchasePrice) {
    this.purchasePrice = purchasePrice;
  }

  public String toString() {
    return "Vehicle [purchasePrice=" + purchasePrice + "]";
  }
}
