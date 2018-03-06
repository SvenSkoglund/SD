package com.skilldistillery.equalsandhashcode.solutions;

public class TestNamedObject {

  public static void main(String[] args) {
    NamedObject n1 = new NamedObject("Pat");
    NamedObject n2 = new NamedObject("Pat");
    
    System.out.println(n1 == n2); // true or false?
    System.out.println(n1.equals(n2)); // true or false?
    
    // Modify the NamedObject class so that line 10 prints "true"
    // based on the objects' names.

  }

}
