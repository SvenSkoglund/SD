package com.skilldistillery.equalsandhashcode.drills;

public class NamedObject extends Object { // "extends Object" not actually needed

  private String name;

  public NamedObject(String name) {
    this.name = name;
  }
  
  // TODO Implement an equals method that determines if the passed Object is
  // a NamedObject, and if so compares its "name" field to the current object's.

}
