package com.skilldistillery.listinterface.solutions;

import java.util.LinkedList;
import java.util.List;

public class NumbersList {
  public static void main(String[] args) {
    NumbersList snl = new NumbersList();
    snl.run();
  }

  private void run() {
    List<Integer> numbers = new LinkedList<>();

    for (int i = 0; i < 10; i++) {
      numbers.add((int) (10 + Math.random() * (90 + 1)));
    }

    System.out.println(numbers);
  }
}
