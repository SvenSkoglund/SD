package com.skilldistillery.subinit.solutions;

public class SuperClass {
  private static String superStatic = singString("superStatic declaration");
  private String superInstance = singString("superInstance declaration");

  public SuperClass() {
    superInstance = singString("SuperClass()");
  }
  public static String singString(String text) {
    System.out.println(text);
    return text;
  }

  public static String getSuperStatic() {
    return superStatic;
  }

  public static void setSuperStatic(String superStatic) {
    SuperClass.superStatic = superStatic;
  }

  public String getSuperInstance() {
    return superInstance;
  }

  public void setSuperInstance(String superInstance) {
    this.superInstance = superInstance;
  }
}
