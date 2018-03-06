package com.skilldistillery.objs2.solutions;

public class BrokenFinalClass {
  private String name;
  private final int uniqueId;
  
  private static final int MAX_NUMBER;
  
  // MAX_NUMBER was not being set in a static initializer block
  // So when the class loaded, it did not have a value.
  static {
    MAX_NUMBER = 10000;
  }
  
  public BrokenFinalClass(int uniqueId, String name){
    this.uniqueId = uniqueId;
    this.name = name;
  }
  
  // If it's not set at declaration or in an initializer block, all 
  // constructors must set a final instance field.
  // 
  // Probably, this constructor should not exist because the uniqueId field
  // should be unique for all users.
  public BrokenFinalClass(String name) {
    this.name = name;
    this.uniqueId = 0;
  }
  
  // Having a setter for a final field is both useless and problematic.
  // The statement uniqueId = id; causes a compiler error.
  //public void setUniqueId(int id) {
  //  uniqueId = id;
  //}
}
