package com.skilldistillery.polymorphism.examples.game;

public class Wizard extends GameCharacter {

  protected int hitPoints; // hides GameCharacter hitPoints
  
  public Wizard(int hp) {
    super(hp);
  } 
  // ... 
  public void healSelfWithMagic(int amount) {
    hitPoints += amount;  // accessing this class's field
  }
}
