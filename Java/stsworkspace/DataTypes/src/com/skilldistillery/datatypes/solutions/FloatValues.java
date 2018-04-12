package com.skilldistillery.datatypes.solutions;

public class FloatValues {

  public static void main(String[] args) {
    // Copy f1 to f8 in text here. Comment out values that do not work.
    float f1 = 0.0f;
    
    // f after an int literal
    float f2 = 1f;
    // no F, but it works
    float f3 = 1;
    
    float f4 = 0b10101; // binary number
    //float f5 = 0b10101f; // NO, don't use F with binary numbers
    float f6 = 0xF16F; // F doesn't do anything here, it is a hex value
    float f7 = 0761; // octal number
    float f8 = 0761F; // octal number with F
  }

}
