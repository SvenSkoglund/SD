package com.skilldistillery.datatypes.drills;

public class DeclaringPrimitives {

	public static void main(String[] args) {
    // Declare a byte variable and assign the value 128. What happens? Assign it a valid value.
    byte b = 127;
    // Create a switch statement for your variable.
    // Have a case for each of the values 127, -128, 0, 'A', 128, '\u0000'.
    switch (b) {
    case 127 :
    case -128 :
    case 0 :
    case 'A' :
//    case  128 :
//    case \u0000 :
    default:
    
    }
    // Which values cause compiler errors?
    
    
    // Declare a int variable and assign it a value.
    int i = 0;
    // Again create a switch statement.
    // Have a case for each of the values 127, -128, 'A', 128, '\u0000'.
    switch (i) {
    case 127 :
    case -128 :
    case 0 :
    case 'A' :
    case  128 :
  //  case \u0000 :
    default:
    
    }

  }

}
