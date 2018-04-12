package com.skilldistillery.io.labs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PlanetReader {

	public static void main(String[] args) {
		String fileName = "planets.txt";
		PlanetReader pr = new PlanetReader();
		pr.readPlanets(fileName);
	}

	private void readPlanets(String fileName) {

		try {
			File f = new File(fileName);
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line.split(",")[0]);
			}
			br.close();
			fr.close(); 
		}
		catch (IOException e) {
			System.out.println("IOException");
		}
		// Add code here to:
		// Open the file
		// Read it line by line, printing just the planet name.
		// Close the file.
	}

}
