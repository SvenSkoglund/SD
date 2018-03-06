package com.skilldistillery.stringstringbuilder.solutions;

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
    // The String literal "AlwaysCoding" is automatically interned
    // in the String Pool, and the variable 'coding' holds a reference
    // to the interned string in the String Pool.
    String coding = "AlwaysCoding";
    String coding2 = new String("AlwaysCoding");
    String always = "Always";
    
    // false:
    // new String() always creates a new String object on the heap.
    System.out.println( coding == coding2 );

    // true:
    // private String coding = "Always" + "Coding";
    // Java concatenates these two literals into "AlwaysCoding", and in
    // interning them finds the same String already referenced by 'coding'.
    System.out.println( coding == this.coding );
    
    // true:
    // All parts - that is, all classes - share the String Pool.
    System.out.println( coding == OtherClass.coding );
    
    // true:
    // The literal "AlwaysCoding" has already been interned.
    System.out.println( coding == "AlwaysCoding" );
    
    // true:
    // Concatenation of literals again, to a String that's already in the String Pool.
    System.out.println( coding == "Always" + "Coding" );
    
    // false:
    // The value of the variable 'always' can't be reliably known at
    // compile time, so Java constructs a new String on the heap containing
    // the value "AlwaysCoding".
    System.out.println( coding == always + "Coding" );
    
    // true:
    // Concatenation results in the same literal that's already in the String Pool.
    System.out.println( coding == "Al" + "waysCoding" );
    
    // true:
    // This actually constructs a new String on the heap with the value "AlwaysCoding",
    // but then uses intern() to find the reference to the one that's already
    // in the String Pool.
    System.out.println( coding == (always + "Coding").intern() );
    
  }

}
