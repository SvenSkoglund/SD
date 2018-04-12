package com.skilldistillery.objs.reference;

public class Car {
  public String make;
  public String model;
  public String color;
  public int numberOfWheels;
  public double purchasePrice;

  public String getCarData() {
    String output = "make=" + make + ", model=" + model + ", color=" + color + ", numberOfWheels=" + numberOfWheels
        + ", purchasePrice=" + purchasePrice;
    return output;
  }

  public void displayCar() {
    String carData = getCarData();
    System.out.println(carData);
  }
}
