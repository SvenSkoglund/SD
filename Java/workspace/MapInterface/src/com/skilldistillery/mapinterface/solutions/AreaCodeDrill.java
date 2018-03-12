package com.skilldistillery.mapinterface.solutions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AreaCodeDrill {

  public static void main(String[] args) {
    AreaCodeDrill drill = new AreaCodeDrill();
    drill.launch();

  }
  
  private void launch() {
    
    Map<Integer, String> data = generateMapData();
    
    outputMapData(data);
  }
  
  private Map<Integer, String> generateMapData(){
    Map<Integer, String> areaCodes = new HashMap<>();
    // 3. Change areaCodes from a HashMap to a TreeMap and run the program.
    areaCodes = new TreeMap<>();
    // 4. Change areaCodes to a LinkedHashMap and run the program.
    areaCodes = new LinkedHashMap<>();
    
    areaCodes.put(770, "Atlanta");
    areaCodes.put(404, "Atlanta");
    areaCodes.put(718, "New York City");
    areaCodes.put(202, "Washington, D.C.");
    areaCodes.put(901, "Memphis");
    areaCodes.put(305, "Miami");
    areaCodes.put(312, "Chicago");
    areaCodes.put(313, "Detroit");
    areaCodes.put(215, "Philadelphia");
    areaCodes.put(803, "Columbia");
    areaCodes.put(757, "Norfolk");
    areaCodes.put(410, "Baltimore");
    // 1. Add the key value pairs
    areaCodes.put(504, "New Orleans");
    areaCodes.put(972, "Dallas");
    areaCodes.put(713, "Houston");
    
    return areaCodes;
  }

  private void outputMapData(Map<Integer, String> map) {
    // 2. Iterate through the map and output each key-value pair to the screen.
    //    Then run the program to see a HashMap's output.
    Set<Integer> keySet = map.keySet();
    Iterator<Integer> it = keySet.iterator();
    while(it.hasNext()) {
      Integer key = it.next();
      String val = map.get(key);
      System.out.println(key + " - " + val);
    }
  }
}
