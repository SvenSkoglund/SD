package com.skilldistillery.mapinterface.solutions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class NameSeparatorMapApp {
  private final String NAME_FILE = "names.txt";
  
  public static void main(String[] args) {
    NameSeparatorMapApp app = new NameSeparatorMapApp();
    app.run();
  }
  
  private void run() {
    Set<String> set = parseUniqueNamesFromFile(NAME_FILE);
    Map<String, Set<String> > names = divideNamesByLetter(set);
    printListOfNames(names);
  }
  
  public void printListOfNames(Map< String, Set<String> > names) {
    Iterator<String> it = names.keySet().iterator();
    while(it.hasNext()) {
      StringBuilder row = new StringBuilder();
      String key = it.next();
      Set<String> namesRow = names.get(key);
      
      if(namesRow != null)  {
        Iterator<String> namesIt = namesRow.iterator();
        while(namesIt.hasNext()) {
          row.append(namesIt.next());
          if(namesIt.hasNext()) {
            row.append(", ");
          }
        }
        System.out.println(row);
      }
    }
  }
  
  
  public Set<String> parseUniqueNamesFromFile(String fileName){
    Set<String> names = new HashSet<>();
    BufferedReader reader = null;
    try {
      reader = new BufferedReader(new FileReader(fileName));
      String line;
      while((line = reader.readLine()) != null) {
        names.add(line);
      }
    }
    catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    catch (IOException e) {
      e.printStackTrace();
    }
    finally {
      if(reader != null) {
        try {
          reader.close();
        }
        catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
    
    return names;
  }
  
  public Map<String, Set<String> > divideNamesByLetter(Set<String> set) {
    Map<String, Set<String> > names = new HashMap<>(40);
    //Map<String, Set<String> > names = new TreeMap<>(40);
    
    Iterator<String> it = set.iterator();
    
    while(it.hasNext()) {
      String name = it.next();
      if(name != null && name.length() > 0) {
        char c = name.charAt(0);
        String index = String.valueOf(c);
        // The idiom of find and/or create Collection
        Set<String> setAtIndex = names.get(index);
        if(setAtIndex == null) {
          setAtIndex = new HashSet<>();
          //setAtIndex = new TreeSet<>(); // Change to TreeSet for sorting
          names.put(index, setAtIndex);
        }
        setAtIndex.add(name);
      }
    }
    
    return names;
  }
}
