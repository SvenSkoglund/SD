package com.skilldistillery.lambdas.labs;

import java.util.List;
import java.util.function.Predicate;

public class PlanetFilteringLab {

	public static void main(String[] args) {
		List<Planet> planets = PlanetUtilities.getPlanets();

		printPlanets(planets);

	}

	private static void printPlanets(List<Planet> planets) {
		System.out.println("********PLANETS********");
		Predicate<Planet> ps = p -> p.getName().contains("a") || p.getName().contains("A");
		List<Planet> filtered = PlanetUtilities.filterPlanets(planets, ps);
		
		System.out.println("********PLANETS********");
		Predicate<Planet> ps1 = p -> p.getName().contains("a");
		Predicate<Planet> ps2 = p -> p.getName().contains("y");
		List<Planet> filtered2 = PlanetUtilities.filterPlanets(planets, ps1, ps2);
	}

}
