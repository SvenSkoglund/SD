package com.skilldistillery.polymorphism.labs.vehicles;

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
	return "Truck [bedSizeInCubicFeet=" + bedSizeInCubicFeet + ", toString()=" + super.toString() + "]";
}
@Override
public double calculateRegistrationFee(double rate) {
	if (getNumberOfWheels() > 6) {
		double fee = 1.5 * rate * getPurchasePrice();
		return fee;
	}
	else {
		return rate * getPurchasePrice();
	}
}
  
}
