package com.skilldistillery.interfaces.reference.smarthome;
//public class CoffeeMaker implements Switchable {
public class CoffeeMaker extends KitchenAppliance implements Switchable, Fillable {
  private boolean on;

  @Override
  public void turnOn() {
    this.on = true;
    this.startBrewing();
  }

  @Override
  public void turnOff() {
    this.on = false;
    System.out.println("Coffee going cold");
  }

  public boolean isOn() {
    return on;
  }

  private int percentFull;

  public void fill(int amount) {
    percentFull = amount;
    System.out.println("CoffeeMaker filled to " + percentFull + "%");
  }

  private void startBrewing() {
    System.out.println("CoffeeMaker says \"gurgle...gurgle..gurgle.gurgle.hissss\"");
  }

  @Override
  public String toString() {
    return "CoffeeMaker [on=" + on + "]";
  }

}
