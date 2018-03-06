package com.skilldistillery.interfaces.reference.smarthome;

public class WaterBot {
  private Fillable[] fillables;
  
  public WaterBot(int howMany) {
    fillables = new Fillable[howMany];
  }
  
  public boolean add(Fillable fillable) {
    for (int i = 0; i < fillables.length; i++) {
      if (fillables[i] == null) {
        fillables[i] = fillable;
        return true;
      }
    }
    return false;
  }
  
  public void fillAllTheThings(int percent) {
    for (Fillable fillable : fillables) {
      fillable.fill(100);
    }
  }

}
