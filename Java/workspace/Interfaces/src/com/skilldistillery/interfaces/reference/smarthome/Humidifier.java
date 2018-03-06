package com.skilldistillery.interfaces.reference.smarthome;

public class Humidifier extends Appliance implements Fillable {
  private int percentFull;

  @Override
  public void fill(int amount) {
    percentFull = amount;
    System.out.println("Humidifier filled to "+percentFull+"%");
  }

}
