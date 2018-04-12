package com.skilldistillery.setinterface.solutions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NameApp {

  public static void main(String[] args) {
    NameApp a = new NameApp();
    a.launch();
  }
  
  public void launch() {
    List<String> listToFill = new ArrayList<String>();
    Set<String> setToFill = new HashSet<>();
    
    int numLines = readNamesIntoCollections(listToFill, setToFill);
    
    System.out.println("List size: " + listToFill.size());
    System.out.println("Set size: " + setToFill.size());
    System.out.println("Lines in file: " + numLines);
  }
  
  /**
   * This method takes two empty Collections in order to avoid reading
   * the file three separate times.
   * 
   * @param namesList - an empty List to hold all names
   * @param namesSet - an empty Set to hold all names
   * @return number of lines in the file
   */
  private int readNamesIntoCollections(List<String> namesList, Set<String> namesSet) {
    int numLines = 0;
    BufferedReader reader = null;
    try {
      reader = new BufferedReader(new FileReader("names.txt"));
      String line;
      while((line = reader.readLine()) != null) {
        namesList.add(line);
        namesSet.add(line);
        numLines++;
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
    return numLines;
  }

}
