package com.skilldistillery.lambdas.drills;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaShortening {

	public static void main(String[] args) {

		// -----------------------
		Comparator<Planet> c1 = (Planet p1, Planet p2) -> {
			if (p1.getOrbit() > p2.getOrbit()) {
				return 1;
			}
			else if (p2.getOrbit() > p1.getOrbit()) {
				return -1;
			}
			return 0;
		};

		// Replace null with a shortened lambda for c1
		Comparator<Planet> c2 = (p1, p2) -> {
			if (p1.getOrbit() > p2.getOrbit()) {
				return 1;
			}
			else if (p2.getOrbit() > p1.getOrbit()) {
				return -1;
			}
			return 0;
		};

		// -----------------------
		Function<Planet, Double> diameterInMiles = (Planet p) -> {
			return p.getDiameter() * 0.621371;
		};

		Function<Planet, Double> diam2 = p -> p.getDiameter() * 0.621371;

		// -----------------------
		Runnable r = () -> {
			LocalDateTime ldt = LocalDateTime.now();
			System.out.println("Starting at " + ldt);
		};
		Runnable r2 = () -> System.out.println("Starting at " + LocalDateTime.now());

		;

		// ----------------------
		/*
		 * public interface PlanetTester { public boolean test(Planet p); }
		 */
		PlanetTester planetTester = (Planet p) -> {
			return p.getDiameter() > 40_000;
		};

		PlanetTester pt2 = p -> p.getDiameter() > 40_000;

		// ----------------------
		/*
		 * public interface Predicate<T> { public boolean test(T p); }
		 */
		Predicate<Planet> predPlan = (Planet p) -> {
			return p.getDiameter() < 40_000;
		};

		Predicate<Planet> predPlan2 = p -> p.getDiameter() < 40_000;
	}

}
