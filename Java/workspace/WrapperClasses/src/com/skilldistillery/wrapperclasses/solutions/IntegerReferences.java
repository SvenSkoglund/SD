package com.skilldistillery.wrapperclasses.solutions;

public class IntegerReferences {
  public static void main(String[] args) {
    Integer i = new Integer(1000);
    increment(i);
    // This prints 1000.  The local variable i in main still refers
    // to the immutable Integer object created on line 5.
    System.out.println(i);
    
    // If we assign the Integer reference returned by increment()
    // to our local variable, it will print 1001.
    i = increment(i);
    System.out.println(i);

  }
  private static Integer increment(Integer i) {
    // This statement does not modify the contents of the passed Integer,
    // which is immutable.  Instead, it unboxes the value to an in, increments,
    // then autoboxes the result as a new Integer.
    i++;
    return i;
  }
}
