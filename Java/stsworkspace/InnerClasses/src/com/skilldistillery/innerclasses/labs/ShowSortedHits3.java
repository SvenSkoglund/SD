package com.skilldistillery.innerclasses.labs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class ShowSortedHits3 {
  private Map<String, Integer> visitors;

  public ShowSortedHits3() {
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
	  
	
    ArrayList<String> keysList = new ArrayList<>(
        visitors.keySet());

    // Sort the keys according to their corresponding values
    Comparator<String> comp = new AccessLogComparator();
    Collections.sort(keysList, comp);

    // Print the key/value pairs based on ArrayList
    for (String key : keysList) {
      System.out.println(visitors.get(key) + "\t\t" + key);
    }
  }
  protected class AccessLogComparator implements Comparator<String> {


	  public int compare(String key1, String key2) {
	    Integer firstVal = visitors.get(key1);
	    Integer secondVal = visitors.get(key2);

	    int retval = secondVal.compareTo(firstVal);


	    // shorthand syntax
	     return (retval != 0)?retval:key1.compareTo(key2);
	  }
	}


  public static void main(String[] args) {
    new ShowSortedHits3();
  }
}