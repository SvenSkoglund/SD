package com.skilldistillery.io.solutions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PlanetReader2 {

  public static void main(String[] args) {
    String fileName = "planets.txt";
    PlanetReader2 pr = new PlanetReader2();
    pr.readPlanets(fileName);
  }

  private void readPlanets(String fileName) {
    try ( BufferedReader bufIn = new BufferedReader(new FileReader(fileName)) ) {
      String line;
      while ((line = bufIn.readLine()) != null) {
        String[] planetRecord = line.split(", ");
        String name = planetRecord[0];
        long orbit = Long.parseLong(planetRecord[1]);
        int diameter = Integer.parseInt(planetRecord[2]);
        Planet p = new Planet(name, orbit, diameter);
        System.out.println(p);
      }
    }
    catch (IOException e) {
      System.err.println(e);
    }
  }

}
