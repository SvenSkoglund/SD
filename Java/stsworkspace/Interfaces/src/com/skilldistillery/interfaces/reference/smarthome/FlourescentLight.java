package com.skilldistillery.interfaces.reference.smarthome;

public class FlourescentLight extends AbstractLight {
  @Override
  public void changeBulb() {
    System.out.println("Change tube in fluorescent lamp.");
    System.out.println("Dispose of old tube properly.");
  }
}
