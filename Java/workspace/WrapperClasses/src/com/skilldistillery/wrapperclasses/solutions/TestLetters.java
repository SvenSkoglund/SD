package com.skilldistillery.wrapperclasses.solutions;

import java.util.Scanner;

public class TestLetters {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter some text: ");
    String text = input.nextLine();
    input.close();
    TestLetters tester = new TestLetters();
    tester.test(text);
  }

  private void test(String text) {
    char[] chars = text.toCharArray();
    for (char c : chars) {
      System.out.print(c);
      if (Character.isUpperCase(c)) {
        System.out.print(" is uppercase.");
      }
      else if (Character.isLowerCase(c)) {
        System.out.print(" is lowercase.");
      }
      else if (Character.isDigit(c)) {
        System.out.print(" is a digit.");
      }
      System.out.println();
    }
  }

}
