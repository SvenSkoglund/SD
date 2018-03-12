package com.skilldistillery.io.solutions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SearchEmployees {

  public static void main(String[] args) {
    try (BufferedReader bufIn = new BufferedReader(new FileReader("employee.txt"))) {
      String line;
      while ((line = bufIn.readLine()) != null) {
        if (line.contains("manager")) {
          System.out.println(line);
        }
      }
    }
    catch (IOException e) {
      System.err.println(e);
    }
  }

}
