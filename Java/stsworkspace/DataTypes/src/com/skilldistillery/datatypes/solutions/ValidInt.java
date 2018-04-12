package com.skilldistillery.datatypes.solutions;

public class ValidInt {

  public static void main(String[] args) {
    int validInt = 0;
    
    long longInt = validInt;
    
    // validInt = longInt; // This does not work.
                           // We cannot jam an 8 byte long into a 4 byte int. 

  }

}
