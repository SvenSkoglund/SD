package com.skilldistillery.interfaces.reference.smarthome;
public class CoffeeMaker1 implements Switchable {
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

  private void startBrewing() {
    System.out.println("CoffeeMaker says \"gurgle...gurgle..gurgle.gurgle.hissss\"");
  }

  @Override
  public String toString() {
    return "CoffeeMaker [on=" + on + "]";
  }

}
