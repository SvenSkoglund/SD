package com.skilldistillery.abstractclasses.labs.vehicles;

public class Truck extends Automobile {
  protected int bedSizeInCubicFeet;

  public Truck(double purchasePrice, String make, String model, int year, int numberOfWheels, double speedInMph,
      int bedSizeInCubicFeet) {
    super(purchasePrice, make, model, year, numberOfWheels, speedInMph);
    this.bedSizeInCubicFeet = bedSizeInCubicFeet;
  }
  
  public int getBedSizeInCubicFeet() {
    return bedSizeInCubicFeet;
  }
  
  public void setBedSizeInCubicFeet(int bedSizeInCubicFeet) {
    this.bedSizeInCubicFeet = bedSizeInCubicFeet;
  }

  @Override
  public String toString() {
    return "Truck [bedSizeInCubicFeet=" + bedSizeInCubicFeet + ", getMake()=" + getMake() + ", getModel()=" + getModel()
        + ", getYear()=" + getYear() + ", getNumberOfWheels()=" + getNumberOfWheels() + ", getSpeedInMph()="
        + getSpeedInMph() + ", getPurchasePrice()=" + getPurchasePrice() + "]";
  }

  @Override
  public double calculateRegistrationFee(double rate) {
    if(getNumberOfWheels() >= 6) {
      rate = rate * 1.5;
    }
    return rate * getPurchasePrice();
  }
  
  
}
