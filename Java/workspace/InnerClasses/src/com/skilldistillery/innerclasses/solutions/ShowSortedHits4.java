package com.skilldistillery.innerclasses.solutions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class ShowSortedHits4 {
  private Map<String, Integer> visitors;

  public ShowSortedHits4() {
    visitors = new HashMap<>();
    populateMap();
    printSortedMap();
  }

  private void populateMap() {
    String line = null;

    try (BufferedReader in = new BufferedReader(new FileReader(
        "access_log"))) {

      while ((line = in.readLine()) != null) {
        String[] tokens = line.split(" ");
        String key = tokens[0];

        if (visitors.containsKey(key)) {
          int oldValue = visitors.get(key);
          visitors.put(key, ++oldValue);
        }
        else {
          // first time for this visitor
          visitors.put(key, 1);
        }
      }
    }
    catch (IOException e) {
      System.err.println(e);
      System.exit(1);
    }
  }

  private void printSortedMap() {
    // Create a list with visitors' keys
    ArrayList<String> keysList = new ArrayList<>(visitors.keySet());

    // anonymous inner class
    Comparator<String> comp = new Comparator<String>() {
      public int compare(String key1, String key2) {
        Integer firstVal = visitors.get(key1);
        Integer secondVal = visitors.get(key2);

        int retval = secondVal.compareTo(firstVal);
        return (retval != 0) ? retval : key1.compareTo(key2);
      }
    };

    // Sort the keys according to their corresponding values
    Collections.sort(keysList, comp);

    // Print the key/value pairs based on ArrayList
    for (String key : keysList) {
      System.out.println(visitors.get(key) + "\t\t" + key);
    }
  }

  public static void main(String[] args) {
    new ShowSortedHits4();
  }
}
