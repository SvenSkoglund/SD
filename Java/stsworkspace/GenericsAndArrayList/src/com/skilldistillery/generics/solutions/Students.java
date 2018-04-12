package com.skilldistillery.generics.solutions;

import java.util.ArrayList;

public class Students {
  public static void main(String[] args) {
      ArrayList<String> students = new ArrayList<>();
      students.add("Anne");
      students.add("Bob");
      students.add("Charles");
      students.add("Danielle");
      students.add("Eric");
      students.add("Frank");
      students.add("Mavis");

      for (String string : students) {
          System.out.println(string);
      }
  }

}
