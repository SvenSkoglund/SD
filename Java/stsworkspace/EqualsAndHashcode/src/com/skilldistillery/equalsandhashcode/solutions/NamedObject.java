package com.skilldistillery.equalsandhashcode.solutions;

public class NamedObject extends Object { // "extends Object" not actually needed

  private String name;

  public NamedObject(String name) {
    this.name = name;
  }
  
  // Implement an equals method that determines if the passed Object is
  // a NamedObject, and if so compares its "name" field to the current object's.
  public boolean equals(Object obj) {
    if ( obj == this ) { return true; }
    if ( obj == null ) { return false; }
    if ( obj.getClass() != this.getClass() ) { return false; }
    NamedObject other = (NamedObject) obj;
    if ( this.name.equals(other.name)) {
      return true;
    }
    return false;
  }

}

