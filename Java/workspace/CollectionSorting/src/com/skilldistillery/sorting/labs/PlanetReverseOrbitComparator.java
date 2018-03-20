package com.skilldistillery.sorting.labs;

import java.util.Comparator;

public class PlanetReverseOrbitComparator implements Comparator<Planet> {

	@Override
	public int compare(Planet a, Planet b) {

		if (a.getOrbit() > b.getOrbit()) {
			return -1;
		}
		else if (a.getOrbit() < b.getOrbit()) {
			return 1;
		}

		return 0;
	}

}
