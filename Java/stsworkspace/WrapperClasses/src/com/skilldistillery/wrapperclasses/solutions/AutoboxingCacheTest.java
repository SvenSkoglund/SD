package com.skilldistillery.wrapperclasses.solutions;

public class AutoboxingCacheTest {

  public static void main(String[] args) {
    Integer i = Integer.valueOf(127); // Reference to cached Integer object with value 127
    Integer j = i;                    // Reference to same cached Integer object
    i++;
    i--;
    
    // true: both contain the value 127
    System.out.println( i.equals(j) ); // true or false?
    
    // true: i and j point to the same cached Integer object with value 127.
    System.out.println( i == j );      // true or false?
    
    // This code:
    i++;
    i--;
    
    // is equivalent to:
    int tempi = i.intValue();   // 127
    tempi++;                    // => 128
    i = Integer.valueOf(tempi); // valueOf returns new Integer object - 128 is outside cache range.
    tempi = i.intValue();       // 128
    tempi--;                    // => 127
    i = Integer.valueOf(tempi); // valueOf returns cached Integer with value 127.
    
    // i and j both point to the same cached Integer returned by Integer.valueOf().
  }

}
