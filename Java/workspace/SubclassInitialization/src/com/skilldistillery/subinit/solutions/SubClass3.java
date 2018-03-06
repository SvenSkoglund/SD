package com.skilldistillery.subinit.solutions;

public class SubClass3 extends SuperClass3 {
  private static String staticField = singString("staticField declaration");
  {
    instanceField = singString("Above");
  }
  private String instanceField = singString("instanceField declaration");

  public SubClass3() {
//    super();
    // Removing the call to super() causes no problem, because
    // the compiler automatically inserts a call to the superclass
    // no-arg constructor.
    
    // If the superclass doesn't have a no-arg constructor however,
    // the compiler's implicit super() no longer compiles.
    // therefor we must explicitly call a constructor that the
    // superclass does provide.
    // Compiler error:
    // Implicit super constructor SuperClass3() is undefined. Must explicitly invoke 
    // another constructor
    
    super("Called from subclass");
    
    System.out.println("My constructor");
    instanceField = singString("Set by my constructor");
  }
  public static String getStaticField() {
    return staticField;
  }
  public static void setStaticField(String staticField) {
    SubClass3.staticField = staticField;
  }
  public String getInstanceField() {
    return instanceField;
  }
  public void setInstanceField(String instanceField) {
    this.instanceField = instanceField;
  }

}
