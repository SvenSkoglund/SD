package com.skilldistillery.io.labs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class PlanetReader2 {

	public static void main(String[] args) {
		String fileName = "planets.txt";
		PlanetReader2 pr = new PlanetReader2();
		List<Planet> planets = pr.readPlanets(fileName);
		System.out.println(planets);
		writePlanets("newPlanets.txt",planets);
	}

	private List<Planet> readPlanets(String fileName) {
		List<Planet> planets = new ArrayList<>();
		try {
			File f = new File(fileName);
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
				String name = line.split(", ")[0];
				long orbit = Long.parseLong(line.split(", ")[1]);
				int diameter = Integer.parseInt(line.split(", ")[2]);
				Planet planet = new Planet(name, orbit, diameter);
				planets.add(planet);
			}
			br.close();
			fr.close();
		}
		catch (IOException e) {
			System.out.println("IOException");
		}
		return planets;
		// Add code here to:
		// Open the file
		// Read it line by line, printing just the planet name.
		// Close the file.
	}
	
	private static void writePlanets(String fileName, List<Planet> planets) {
		File fwr = new File(fileName);
		try {
			FileWriter fr = new FileWriter(fwr);
			PrintWriter pr = new PrintWriter(fr);
			for (int i = 0 ; i < planets.size() ; i++) {
				pr.println(planets.get(i) + ", " + planets.get(i).getOrbit() + ", " + planets.get(i).getDiameter());
			}
			pr.close();
			fr.close();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
