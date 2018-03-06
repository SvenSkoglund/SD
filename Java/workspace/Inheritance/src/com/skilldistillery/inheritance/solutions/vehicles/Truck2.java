package com.skilldistillery.inheritance.solutions.vehicles;

public class Truck2 extends Automobile2 {
  protected int bedSizeInCubicFeet;
  public Truck2() {

  }
  public Truck2(double purchasePrice, String make, String model, int year, int numberOfWheels, double speedInMph,
      int bedSizeInCubicFeet) {
    setPurchasePrice(purchasePrice);
    setMake(make);
    setModel(model);
    setYear(year);
    setNumberOfWheels(numberOfWheels);
    setSpeedInMph(speedInMph);
    this.bedSizeInCubicFeet = bedSizeInCubicFeet;
  }
  
  public int getBedSizeInCubicFeet() {
    return bedSizeInCubicFeet;
  }
  
  public void setBedSizeInCubicFeet(int bedSizeInCubicFeet) {
    this.bedSizeInCubicFeet = bedSizeInCubicFeet;
  }
}
