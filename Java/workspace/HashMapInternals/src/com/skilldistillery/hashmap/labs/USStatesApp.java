package com.skilldistillery.hashmap.labs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class USStatesApp {

  public static void main(String[] args) {
    USStatesApp app = new USStatesApp();
    app.launch();

  }

  private void launch() {
    String fileName = "states.tsv";
    Map<String, USState> states = loadStatesMapFromFile(fileName);
    USState co = states.get("CO");
    System.out.println(co);

  }

  private Map<String, USState> loadStatesMapFromFile(String fileName) {
     Map<String, USState> states = new HashMap<>();

    // 50 state entries, so 50 keys.
    // Load factor is .75, so map will rehash at 50 * .75, or about 37 entries.
    // To allow all keys without rehash, allocate initial capacity of 50/.75, or 67.
//     Map<String, USState> states = new HashMap<>(67);

    // We don't expect more than 50 entries, so decrease the capacity to save space,
    // and increase the load factor to reduce rehashing.
//    Map<String, USState> states = new HashMap<>(53, .95F);

    try {
      BufferedReader br = new BufferedReader(new FileReader(fileName));
      String record = null;
      while ((record = br.readLine()) != null) {
        String[] fields = record.split("\t");
        String abbr = fields[0];
        String name = fields[1];
        String capital = fields[2];
        String admitDate = fields[3];
        int population = Integer.parseInt(fields[4]);

        USState state = new USState(abbr, name, capital, admitDate, population);
        states.put(abbr, state);

      }
    }
    catch (FileNotFoundException e) {
      System.err.println("File [" + fileName + "] not found.");
      return null;
    }
    catch (IOException e) {
      System.err.println("Error reading data from " + fileName);
      e.printStackTrace();
      return null;
    }

    return states;
  }

}
