package com.skilldistillery.interfaces.reference.smarthome;

public class SmartHome {
  
  private MotionSensor motionSensor;

  public MotionSensor getMotionSensor() {
    return motionSensor;
  }

  public void setMotionSensor(MotionSensor motionSensor) {
    this.motionSensor = motionSensor;
  }
  
  private WaterBot filler;

  public WaterBot getFiller() {
    return filler;
  }

  public void setFiller(WaterBot filler) {
    this.filler = filler;
  }
  
  public void startDay() {
    filler.fillAllTheThings(100);
    motionSensor.motionDetected();
    motionSensor.timeout();
  }

}
