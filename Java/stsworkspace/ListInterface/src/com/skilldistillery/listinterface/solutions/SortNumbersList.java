package com.skilldistillery.listinterface.solutions;

import java.util.LinkedList;
import java.util.List;

public class SortNumbersList {
  public static void main(String[] args) {
      SortNumbersList snl = new SortNumbersList();
      snl.run();
  }
  
  private void run() {
    List<Integer> numbers = new LinkedList<>();

    for (int i = 0; i < 10; i++) {
        numbers.add((int)(10 + Math.random() * (90 + 1)));
    }

    System.out.println("Before Sort:");
    System.out.println(numbers);

    sortAndPrintList(numbers);
  }
  
  private void sortAndPrintList(List<Integer> numbers) {
    //bubbleSort(numbers);
    insertionSort(numbers);
    System.out.println("After sort");
    System.out.println(numbers);    
  }

  private void bubbleSort(List<Integer> nums) {
      boolean swapped = true;
      while (swapped) {
          swapped = false;
          for (int i = 0; i < nums.size() - 1; i++) {
              if (nums.get(i) > nums.get(i + 1)) {
                  // swap elements
                  int temp = nums.get(i);
                  nums.set(i, nums.get(i + 1));
                  nums.set(i + 1, temp);
                  swapped = true;
              }
          }
      }
  }

  private void insertionSort(List<Integer> nums) {
      for (int i = 1; i < nums.size(); i++) {
          int temp = nums.get(i);
          int j = i;

          while (j > 0 && nums.get(j - 1) > temp) {
              nums.set(j, nums.get(j - 1));
              j--;
          }
          nums.set(j, temp);
      }

  }
}

