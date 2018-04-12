package com.skilldistillery.polymorphism.examples.game;

public class GameApp {

  public static void main(String[] args) {
    GameApp ga = new GameApp();
    ga.run();
  }
  
  private void run() {
    Wizard light = new Wizard(100);
    // ...
    light.takeDamage(50);        // hitPoints = 50
    
    light.healSelfWithMagic(10); // attempt to heal
    
    light.takeDamage(50);        // hitPoints = 0
    
    if(light.getHitPoints() <= 0) {
      System.out.println("Against the power of Mordor, there can be no victory.");
    }
  }

}
