package com.skilldistillery.stringstringbuilder.drills;

class OtherClass {
  public static String coding = "AlwaysCoding";
}

public class StringPoolTesting {
  private String coding = "Always" + "Coding";

  public static void main(String[] args) {
    StringPoolTesting tester = new StringPoolTesting();
    tester.test();
  }

  private void test() {
    String coding = "AlwaysCoding";
    String coding2 = new String("AlwaysCoding");
    String always = "Always";
    
    // true or false:
//  System.out.println( coding == coding2 );
    // true or false:
//  System.out.println( coding == this.coding );
    // true or false:
//    System.out.println( coding == OtherClass.coding );
    // true or false:
//    System.out.println( coding == "AlwaysCoding" );
    // true or false:
//    System.out.println( coding == "Always" + "Coding" );
    // true or false:
//    System.out.println( coding == always + "Coding" );
    // true or false:
//    System.out.println( coding == "Al" + "waysCoding" );
    // true or false:
//    System.out.println( coding == (always + "Coding").intern() );
    
  }

}
