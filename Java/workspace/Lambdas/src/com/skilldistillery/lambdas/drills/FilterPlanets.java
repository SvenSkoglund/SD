package com.skilldistillery.lambdas.drills;

import java.util.List;

public class FilterPlanets {

	public static void main(String[] args) {
		List<Planet> planets = PlanetUtilities.getPlanets();
		// Filter the list of Planets for those whose
		// diameter is less than 40_000.
List<Planet> filterPlanets = PlanetUtilities.filterPlanets(planets, p -> p.getDiameter() < 40_000);
	
		System.out.println(filterPlanets);
	}

}
