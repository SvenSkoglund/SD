package com.skilldistillery.interfaces.reference.smarthome;

public abstract class AbstractLight implements Switchable {
  private boolean on;

  public void turnOn() {
    on = true;
    System.out.println(this.getClass().getSimpleName() + " turned on.");
  }

  public void turnOff() {
    on = false;
    System.out.println(this.getClass().getSimpleName() + " turned off.");
  }

  public boolean isOn() {
    return on;
  }

  public abstract void changeBulb(); // Abstract method

  private int lumens;

  public int getLumens() { // Concrete method
    return lumens;
  }

  public void setLumens(int lumens) { // Concrete method
    this.lumens = lumens;
  }

}
