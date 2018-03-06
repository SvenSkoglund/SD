package com.skilldistillery.interfaces.reference.smarthome;

public interface WaterDevice extends Switchable, Fillable {
  int getWaterLevel();
}
