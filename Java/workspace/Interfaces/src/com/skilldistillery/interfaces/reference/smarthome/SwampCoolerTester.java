package com.skilldistillery.interfaces.reference.smarthome;

public class SwampCoolerTester {

  public static void main(String[] args) {
    Object obj = new SwampCooler(); // SwampCooler object in memory.
    
    Fillable f = (Fillable)obj;
    f.fill(90);
    
    Switchable s = (Switchable)obj;
    s.turnOn();
    
    WaterDevice wd = (WaterDevice)obj;
    System.out.println("Water level: " + wd.getWaterLevel());

  }

}
