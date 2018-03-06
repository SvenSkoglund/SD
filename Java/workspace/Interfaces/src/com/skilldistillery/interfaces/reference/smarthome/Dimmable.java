package com.skilldistillery.interfaces.reference.smarthome;

public interface Dimmable extends Switchable {
  void setIntensity(int brightnessPercentage);
  int getIntensity();
}
