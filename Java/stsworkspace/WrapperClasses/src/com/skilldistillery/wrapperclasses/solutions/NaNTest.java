package com.skilldistillery.wrapperclasses.solutions;

public class NaNTest {

  public static void main(String[] args) {
    double f = 0.0 / 0.0;
    System.out.println(f);
    Double fObj = 0.0 / 0.0;
    System.out.println(fObj);
  }

}
