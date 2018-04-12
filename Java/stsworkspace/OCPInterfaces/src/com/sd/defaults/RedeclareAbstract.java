package com.sd.defaults;


interface Redec1 {
  default void aMethod() {
    
  }
}

interface Redec2 {
  default void aMethod() {
    
  }
}

public abstract class RedeclareAbstract implements Redec1, Redec2 {

  @Override
  public abstract void aMethod();
  
  // If we remove public from the method, will this compile?
  
}
