package com.skilldistillery.interfaces.reference.smarthome;

public class GasFireplace implements Switchable {
  private boolean on;

  @Override
  public void turnOn() {
    this.on = true;
    System.out.println("Gas fireplace says \"Whooosshh\"");
  }

  @Override
  public void turnOff() {
    this.on = false;
    System.out.println("Gas fireplace chilling down.");
  }

  @Override
  public boolean isOn() {
    return on;
  }

}
