package com.skilldistillery.mapinterface.labs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class AreaCodeLister {
  private Map<String, String> areaCodes;
  private Map<String, String> abbreviations;

  public AreaCodeLister() {
    populateAreaCodes();
    populateAbbreviations();
    print();
  }

  private void populateAreaCodes() {
    areaCodes = new TreeMap<>();

    try (BufferedReader in = new BufferedReader(new FileReader(
        "areacodes.txt"))) {

      String line = null;
      while ((line = in.readLine()) != null) {
        System.out.println(line);
        areaCodes.put(line.split("\t")[0], line.split("\t")[1]);
        // Add code to parse out the area code and abbreviation
        // from each line. Then add them to the areaCodes Map.
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
        System.out.println(line);
        abbreviations.put(line.split("\t")[1], line.split("\t")[0]);
        // Add code to parse out the state and abbreviation
        // from each line. Then add them to the abbreviations
        // Map.
      }
    }
    catch (IOException e) {
      System.err.println(e);
      System.exit(1);
    }
  }

  private void print() {
	  Iterator <String> it = areaCodes.keySet().iterator();
	  while (it.hasNext()) {
		  String areaCode = it.next();
		  String abr = areaCodes.get(areaCode);
		  String stateName = abbreviations.get(abr);
		  System.out.println(areaCode +"\t\t" + stateName);
	  }
    // Add code to display the area code and the full state name
    // associated with it.

  }

  public static void main(String[] args) {
    new AreaCodeLister();
  }
}