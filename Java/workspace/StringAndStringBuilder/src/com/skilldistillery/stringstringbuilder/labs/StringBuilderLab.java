package com.skilldistillery.stringstringbuilder.labs;

public class StringBuilderLab {

  public static void main(String[] args) {
    StringBuilderLab lab = new StringBuilderLab();
    lab.go();
  }

  private void go() {
    String original = "Java world.";
    StringBuilder sb = new StringBuilder(original);
    System.out.println(sb);
    
    // Use only StringBuilder methods on sb to change the text to:
    // Hello, Java coding world! Always Be Coding!
    // Print out sb after each step.
    sb.replace(10,11,"!");
    System.out.println(sb.toString());
    sb.insert(0, "Hello ");
    System.out.println(sb.toString());
    sb.insert(11,"coding ");
    System.out.println(sb.toString());
    sb.append(" Always Be Coding!");
    System.out.println(sb.toString());

  }

}
