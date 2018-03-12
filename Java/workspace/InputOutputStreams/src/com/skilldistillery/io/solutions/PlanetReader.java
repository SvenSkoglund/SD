package com.skilldistillery.io.solutions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PlanetReader {

  public static void main(String[] args) {
    String fileName = "planets.txt";
    PlanetReader pr = new PlanetReader();
    pr.readPlanets(fileName);
  }

  private void readPlanets(String fileName) {
    try ( BufferedReader bufIn = new BufferedReader(new FileReader(fileName)) ) {
      String line;
      while ((line = bufIn.readLine()) != null) {
        String[] planetRecord = line.split(", ");
        System.out.println(planetRecord[0]);
      }
    }
    catch (IOException e) {
      System.err.println(e);
    }
  }

}
