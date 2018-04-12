package com.skilldistillery.polymorphism.examples.game;

public class GameCharacter {
  protected int hitPoints;
  
  public GameCharacter(int hp) {
    hitPoints = hp;
  }
  
  public void takeDamage(int damage) {
    hitPoints = hitPoints - damage;
  }
  
  public int getHitPoints() {
    return hitPoints;
  }
  // ...
}
