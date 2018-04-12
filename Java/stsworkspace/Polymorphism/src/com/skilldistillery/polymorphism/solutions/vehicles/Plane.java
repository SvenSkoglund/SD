package com.skilldistillery.polymorphism.solutions.vehicles;

public class Plane extends FlyingVehicle {
  private String name;
  private int passengerCapacity;

  public Plane(double purchasePrice, double airSpeed, int range, String name, int passengerCapacity) {
    super(purchasePrice, airSpeed, range);
    this.name = name;
    this.passengerCapacity = passengerCapacity;
  }

  public String getName() {
    return name;
  }

  public int getPassengerCapacity() {
    return passengerCapacity;
  }

  @Override
  public String toString() {
    return "Plane [name=" + name + ", passengerCapacity=" + passengerCapacity + ", getAirSpeed()=" + getAirSpeed()
        + ", getRange()=" + getRange() + ", getPurchasePrice()=" + getPurchasePrice() + "]";
  }

}
