package com.skilldistillery.inheritance.solutions.vehicles;

public class Automobile2 extends Vehicle2 {
  private String make;
  private String model;
  private int year;
  private int numberOfWheels;
  private double speedInMph;
  
  public Automobile2() {

  }

  public Automobile2(double purchasePrice, String make, String model, int year, int numberOfWheels, double speedInMph) {
    setPurchasePrice(purchasePrice);
    this.make = make;
    this.model = model;
    this.year = year;
    this.numberOfWheels = numberOfWheels;
    this.speedInMph = speedInMph;
  }

  public String toString() {
    return "Automobile [purchasePrice=" + getPurchasePrice() + ", make=" + make + ", model=" + model + ", year=" + year + ", numberOfWheels=" + numberOfWheels
        + ", speedInMph=" + speedInMph + "]";
  }

  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public int getNumberOfWheels() {
    return numberOfWheels;
  }

  public void setNumberOfWheels(int numberOfWheels) {
    this.numberOfWheels = numberOfWheels;
  }

  public double getSpeedInMph() {
    return speedInMph;
  }

  public void setSpeedInMph(double speedInMph) {
    this.speedInMph = speedInMph;
  }
}
