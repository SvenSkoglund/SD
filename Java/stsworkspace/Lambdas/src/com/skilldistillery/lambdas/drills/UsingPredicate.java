package com.skilldistillery.lambdas.drills;

import java.util.function.Predicate;

public class UsingPredicate {

	public static void main(String[] args) {
		// Declare and define a Predicate<String> that tests whether
		// an input String ends with "!!"

		Predicate<String> s = string -> string.endsWith("!!");

		// Declare and define a Predicate<String> that tests whether
		// an input String is all uppercase.

		Predicate<String> s2 = string -> string.equals(string.toUpperCase());
		// Test your two Predicates by calling their test methods with some Strings.

		Predicate<Integer> ip = i -> i == 42;

		int x = 3;
		int y = 3;

		boolean tern = y < x ? true : false;
		int z = (y > x || y < x) ? x + y : x - y;
		System.out.println(z);

		System.out.println(s.test("Hello!!"));
		System.out.println(s2.test("Hello!!"));
		System.out.println(s.test("HELLO"));
		System.out.println(s2.test("HELLO"));
		System.out.println(ip.test(42));
		System.out.println(ip.test(4));
	}

}
