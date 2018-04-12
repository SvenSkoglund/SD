package com.skilldistillery.interfaces.reference.smarthome;

public class SwampCooler extends Appliance implements WaterDevice {
  private boolean on;
  @Override
  public void turnOn() {          // Abstract method from Switchable
    on = true;
    System.out.println("Swamp cooler turned on.");
  }
  @Override
  public void turnOff() {         // Abstract method from Switchable
    on = false;
    System.out.println("Swamp cooler turned off.");
  }
  @Override
  public boolean isOn() {         // Abstract method from Switchable
    return on;
  }

  private int percentFull;
  @Override
  public void fill(int amount) {  // Abstract method from Fillable
    percentFull = amount;
    System.out.println("Swamp cooler filled to " + percentFull + "%");
  }
  @Override
  public int getWaterLevel() {    // Abstract method from WaterDevice
    return percentFull;
  }

}
