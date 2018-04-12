package com.skilldistillery.subinit.solutions;

public class SubClass2 extends SuperClass2 {
  private static String staticField = singString("staticField declaration");
  {
    instanceField = singString("Above");
  }
  private String instanceField = singString("instanceField declaration");

  public SubClass2() {
    super();
    System.out.println("My constructor");
    instanceField = singString("Set by my constructor");
  }
  public static String getStaticField() {
    return staticField;
  }
  public static void setStaticField(String staticField) {
    SubClass2.staticField = staticField;
  }
  public String getInstanceField() {
    return instanceField;
  }
  public void setInstanceField(String instanceField) {
    this.instanceField = instanceField;
  }

}
