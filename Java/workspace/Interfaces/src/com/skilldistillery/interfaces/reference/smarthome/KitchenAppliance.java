package com.skilldistillery.interfaces.reference.smarthome;

public abstract class KitchenAppliance extends Appliance {
  private boolean dishwasherSafe;

  public boolean isDishwasherSafe() {
    return dishwasherSafe;
  }

  public void setDishwasherSafe(boolean dishwasherSafe) {
    this.dishwasherSafe = dishwasherSafe;
  }
}
