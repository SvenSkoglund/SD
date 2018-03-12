package com.skilldistillery.generics.drills;

public class Container {
  private Object field;
  
  public void set(Object obj) {
    this.field = obj;
  }
  
  public Object get() {
    return field;
  }
}