package com.skilldistillery.datatypes.solutions;

public class DeclaringPrimitives {

  public static void main(String[] args) {
    // Declare a byte variable and assign the value 128. What happens? Assign it a valid value.
    // byte b = 128; // Too big for a byte
    byte b = 127;
    
    // Create a switch statement for your variable.
    // Have a case for each of the values 127, -128, 0, 'A', 128, '\u0000'.
    // Which values cause compiler errors?
    switch(b) {
      case 127: break;
      case -128: break;
      // case 128: break; // No, too big
      case 0: break;
      case 'A': break; // Yes, this works. It is 65, and in range of a byte.
      // case '\u0000': break; // This is a duplicate of 0.
    }
    
    // Declare a int variable and assign it a value.
    int x = 150;
    // Again create a switch statement.
    // Have a case for each of the values 127, -128, 'A', 128, '\u0000'.
    switch(x) {
      case 127: break;
      case -128: break;
      case 128: break;
      case 0: break;
      case 'A': break; // Yes, this works.
      //case '\u0000': break; // This is a duplicate of 0.
    }

  }

}
