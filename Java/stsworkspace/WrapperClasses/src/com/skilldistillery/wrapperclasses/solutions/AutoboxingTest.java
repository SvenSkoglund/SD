package com.skilldistillery.wrapperclasses.solutions;

public class AutoboxingTest {

  public static void main(String[] args) {
    Integer i = new Integer(1234);
    Integer j = i;                  // Reference to same Integer object
    i++;
    i--;
    
    // true: both contain the value 1234
    System.out.println( i.equals(j) ); // true or false?
    
    // false: i and j now point to different Integer objects.
    System.out.println( i == j );      // true or false?
    
    // This code:
    i++;
    i--;
    
    // is equivalent to:
    int tempi = i.intValue();   // 1234
    tempi++;                    // => 1235
    i = Integer.valueOf(tempi); // new Integer object reference.
    tempi = i.intValue();       // 1235
    tempi--;                    // => 1234
    i = Integer.valueOf(tempi); // new Integer object reference.
    
    // j still points to the Integer object created on line 6.
    // i points to a new Integer object created by Integer.valueOf().
  }

}
