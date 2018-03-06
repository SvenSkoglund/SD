package com.skilldistillery.interfaces.reference.smarthome;

public class MotionSensor {

  private Switchable[] items;

  public MotionSensor(int numberOfItems) {
    items = new Switchable[numberOfItems];
  }

  public boolean add(Switchable item) {
    for (int i = 0; i < items.length; i++) {
      if (items[i] == null) {
        items[i] = item;
        return true;
      }
    }
    return false;
  }

  public void motionDetected() {
    System.out.println("MotionSensor: Motion detected.");
    for (Switchable item : items) {
      if (item != null)
        item.turnOn();
    }
  }

  public void timeout() {
    // Need to add code to determine if enough time has elapsed
    System.out.println("MotionSensor: Timeout occurred");
    for (Switchable item : items) {
      if (item != null)
        item.turnOff();
    }
  }

}
