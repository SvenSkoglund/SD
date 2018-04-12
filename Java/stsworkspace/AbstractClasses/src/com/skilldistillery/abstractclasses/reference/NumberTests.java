package com.skilldistillery.abstractclasses.reference;

public class NumberTests {

  public static void main(String[] args) {
    // java.lang.Number is an abstract class.
    Number[] nums = new Number[10];     // Array of 10 Number references

    nums[0] = new Integer(299_792_458);
    nums[1] = new Float(3.1415);        // Float has a ctor that takes double.
    nums[2] = Float.valueOf(2.414F);
    nums[3] = 6.626e-34;                // Autobox double literal to Double.
    nums[4] = Double.valueOf(8.987e9);
    nums[5] = Byte.valueOf("13");
    nums[6] = new Short((short)32766);  // cast int literal to short.
    nums[7] = Double.valueOf(Double.parseDouble("6.022e23"));
    
    printNumbers(nums);
  }

  private static void printNumbers(Number[] nums) {
    for (Number number : nums) {
      if (number != null) {
        System.out.println( number.getClass().getSimpleName()
            + " as a long: "       + number.longValue()  // longValue() and doubleValue()
            + " and as a double: " + number.floatValue() // are abstract methods of Number
        );
      }
    }
  }

}
