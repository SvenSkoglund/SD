package com.skilldistillery.interfaces.reference.smarthome;

public class VanityLight extends AbstractLight implements Dimmable {
  private int intensity = 100;
  @Override
  public void setIntensity(int brightnessPercentage) { // Abstract method from Dimmable
    intensity = (intensity > 100) ? 100
                                  : (intensity < 0) ? 0
                                                      : brightnessPercentage;
  }
  @Override
  public int getIntensity() {                          // Abstract method from Dimmable
    return intensity;
  }
  @Override
  public void changeBulb() {                           // Abstract method from AbstractLight
    System.out.println("Change bulb in vanity light.");
    System.out.println("Make sure new buld is labelled \"dimmable\".");
  }
}
