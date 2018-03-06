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
    
    String result = sb.toString();
    System.out.println(result);
  }

}
