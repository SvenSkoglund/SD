package com.skilldistillery.mapinterface.solutions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class UsingHashMap {

  public static void main(String[] args) {
    UsingHashMap uhm = new UsingHashMap();
    uhm.launch();
  }

  private void launch() {
    // Declare and instantiate a map to hold Integer--->String key-value pairs
    Map<Integer, String> presidents = new HashMap<>();
    
    // Put these pairs in the map
    // 1  George Washington
    // 16 Abraham Lincoln
    // 32 Franklin D. Roosevelt
    // 36 Lyndon B. Johnson
    // 44 Barack Obama
    
    presidents.put(1, "George Washington");
    presidents.put(16, "Abraham Lincoln");
    presidents.put(32, "Franklin D. Roosevelt");
    presidents.put(36, "Lyndon B. Johnson");
    presidents.put(44, "Barack Obama");
    
    // Get the value for key 16 and output the key and value to the screen
    Integer key = 16;
    String val = presidents.get(key);
    System.out.println(key + " " + val);
    
    // Get the value for key 37 and output the key and value to the screen
    key = 37;
    val = presidents.get(key);
    System.out.println(key + " " + val);
    
    // Get the value for key 36 and output the key and value to the screen.
    key = 36;
    val = presidents.get(key);
    System.out.println(key + " " + val);
    
    // Iterate through the Map and output the key-value pairs in the format
    // key[tab][tab]value
    Set<Integer> keySet = presidents.keySet();
    Iterator<Integer> keysIt = keySet.iterator();
    while(keysIt.hasNext()) {
      Integer k = keysIt.next();
      String v = presidents.get(k);
      
      StringBuilder b = new StringBuilder(32);
      b.append(k);
      b.append("\t\t");
      b.append(v);
      System.out.println(b);
    }
    
  }

}
