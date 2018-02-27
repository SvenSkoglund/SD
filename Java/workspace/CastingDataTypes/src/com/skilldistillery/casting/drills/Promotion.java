package com.skilldistillery.casting.drills;

public class Promotion {

  public static void main(String[] args) {
    // Try changing the types of the variables resultIF, resultID, and resultCI 
    // to the smaller or less-precise type, e.g. int resultIF. 
    // What compiler errors do you see?
    int i    = 0;
    float f  = 1.0f;

    float resultIF  = i * f;    // int*float promoted to float*float
    double resultID = i * 2.0;  // int*double promoted to double*double

    char c = 'A';
    int resultCI    = c + 1;    // char+int promoted to int+int
  }

}
