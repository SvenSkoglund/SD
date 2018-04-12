package com.skilldistillery.interfaces.reference.smarthome;

public class SmartHomeUser {

  public static void main(String[] args) {
    SmartHomeUser user = new SmartHomeUser();
    user.launch();
  }

  private void launch() {
    SmartHome smartHome = new SmartHome();
    smartHome.setMotionSensor(new MotionSensor(6));
    
    FlourescentLight kitchenLight = new FlourescentLight();
    HalogenLight livingRoomLight = new HalogenLight();
    Fan ceilingFan = new Fan();
    GasFireplace fireplace = new GasFireplace();
    CoffeeMaker mrCoffee = new CoffeeMaker();
    
    MotionSensor sensor = smartHome.getMotionSensor();
    
    sensor.add(kitchenLight);
    sensor.add(livingRoomLight);
    sensor.add(ceilingFan);
    sensor.add(fireplace);
    sensor.add(mrCoffee);
    
    smartHome.setFiller(new WaterBot(2));
    
    Humidifier misty = new Humidifier();
    WaterBot fillerBot = smartHome.getFiller();
    
    fillerBot.add(mrCoffee);
    fillerBot.add(misty);
    
    smartHome.startDay();
  }

}
