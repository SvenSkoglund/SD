package com.skilldistillery.setinterface.solutions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class NameSeparatorApp {
  private final String NAME_FILE = "names.txt";
  
  public static void main(String[] args) {
    NameSeparatorApp app = new NameSeparatorApp();
    app.run();
  }
  
  private void run() {
    Set<String> set = parseUniqueNamesFromFile(NAME_FILE);
    List< Set<String> > names = divideNamesByLetter(set);
    printListOfNames(names);
  }
  
  public void printListOfNames(List< Set<String> > names) {
    Iterator<Set<String>> listIt = names.iterator();
    while(listIt.hasNext()) {
      StringBuilder row = new StringBuilder();
      Set<String> namesRow = listIt.next();
      
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
  
  public List< Set<String> > divideNamesByLetter(Set<String> set) {
    List< Set<String> > names = new ArrayList<>(26);
    // Fill this with nulls or Sets
    // Filling with nulls saves marginal memory.
    for(int i=0; i < 26; i++) {
      names.add(null);
    }
    
    Iterator<String> it = set.iterator();
    
    while(it.hasNext()) {
      String name = it.next();
      if(name != null && name.length() > 0) {
        char c = name.charAt(0);
        int index = getIndexFromLetter(c);
        // The idiom of find and/or create Collection
        Set<String> setAtIndex = names.get(index);
        if(setAtIndex == null) {
          setAtIndex = new HashSet<>();
          //setAtIndex = new TreeSet<>(); // Change to TreeSet for sorting
          names.set(index, setAtIndex);
        }
        setAtIndex.add(name);
      }
    }
    
    return names;
  }
  
  public int getIndexFromLetter(char c) {
    // A is 65
    return c - 65;
  }

}
