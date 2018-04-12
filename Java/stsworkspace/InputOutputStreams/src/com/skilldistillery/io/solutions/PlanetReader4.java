package com.skilldistillery.io.solutions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class PlanetReader4 {

  public static void main(String[] args) {
    String fileName = "planets.txt";
    PlanetReader4 pr = new PlanetReader4();
    List<Planet> planets = pr.readPlanets(fileName);
    System.out.println(planets);
    String outFileName = "planets.tsv";
    pr.writePlanets(outFileName, planets);
  }

  private void writePlanets(String outFileName, List<Planet> planets) {
    try {
      FileWriter fw = new FileWriter(outFileName);
      PrintWriter pw = new PrintWriter(fw);
      for (Planet p : planets) {
        StringBuilder sb = new StringBuilder();
        sb.append(p.getName());
        sb.append('\t');
        sb.append(p.getOrbit());
        sb.append('\t');
        sb.append(p.getDiameter());
        pw.println(sb);
      }
      pw.close();
    }
    catch (IOException e) {
      e.printStackTrace();
    }
  }

  // private void readPlanets(String fileName) {
  private List<Planet> readPlanets(String fileName) {
    // Declare outside the try/catch.
    List<Planet> planets = new ArrayList<>();
    try (BufferedReader bufIn = new BufferedReader(new FileReader(fileName))) {
      String line;
      while ((line = bufIn.readLine()) != null) {
        String[] planetRecord = line.split(", ");
        String name = planetRecord[0];
        long orbit = Long.parseLong(planetRecord[1]);
        int diameter = Integer.parseInt(planetRecord[2]);
        Planet p = new Planet(name, orbit, diameter);
        // System.out.println(p);
        planets.add(p);
      }
    }
    catch (IOException e) {
      System.err.println(e);
    }
    return planets;
  }

}
