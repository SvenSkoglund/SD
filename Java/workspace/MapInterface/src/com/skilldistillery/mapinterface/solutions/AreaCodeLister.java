package com.skilldistillery.mapinterface.solutions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AreaCodeLister {
  private Map<String, String> areaCodes;
  private Map<String, String> abbreviations;

  private void populateAreaCodes() {
    areaCodes = new HashMap<>();

    try (BufferedReader in = new BufferedReader(new FileReader(
        "areacodes.txt"))) {

      String line = null;
      while ((line = in.readLine()) != null) {

        String[] tokens = line.split("\t");
        if (tokens.length == 2) {
          String code = tokens[0];
          String abbreviation = tokens[1];
          areaCodes.put(code, abbreviation);
        }
      }
    }
    catch (IOException e) {
      System.err.println(e);
      System.exit(1);
    }
  }

  private void populateAbbreviations() {
    abbreviations = new HashMap<>();

    try (BufferedReader in = new BufferedReader(new FileReader(
        "abbreviations.txt"))) {

      String line = null;
      while ((line = in.readLine()) != null) {

        String[] tokens = line.split("\t");
        if (tokens.length == 2) {
          String state = tokens[0];
          String abbreviation = tokens[1];
          // Note we are putting these in as abbrev -> state,
          // opposite of how they are listed in the file
          abbreviations.put(abbreviation, state);
        }
      }
    }
    catch (IOException e) {
      System.err.println(e);
      System.exit(1);
    }
  }

  private void print() {
    Iterator<String> codes = areaCodes.keySet().iterator();

    while (codes.hasNext()) {
      String code = codes.next();
      String abbreviation = areaCodes.get(code);
      // Now use the abbreviation to get the state
      String state = abbreviations.get(abbreviation);
      System.out.println(code + " " + state);
    }
  }

  public static void main(String[] args) {
    AreaCodeLister ac = new AreaCodeLister();
    ac.populateAreaCodes();
    ac.populateAbbreviations();
    ac.print();
  }
}
