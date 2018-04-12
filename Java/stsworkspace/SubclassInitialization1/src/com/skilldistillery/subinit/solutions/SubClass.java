package com.skilldistillery.subinit.solutions;

public class SubClass extends SuperClass {
  private static String staticField = singString("staticField declaration");
  private String instanceField = singString("instanceField declaration");

  public SubClass() {
    super();
    System.out.println("My constructor");
  }
  public static String getStaticField() {
    return staticField;
  }
  public static void setStaticField(String staticField) {
    SubClass.staticField = staticField;
  }
  public String getInstanceField() {
    return instanceField;
  }
  public void setInstanceField(String instanceField) {
    this.instanceField = instanceField;
  }

}
