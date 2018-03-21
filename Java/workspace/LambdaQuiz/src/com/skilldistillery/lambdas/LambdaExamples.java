package com.skilldistillery.lambdas;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.concurrent.Callable;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaExamples {
	/*
	 * Create static fields for each definition below based on the functional
	 * interface, method, and functionality. Interface : method : functionality Note
	 * that functionality may define the type of a parameterized interface.
	 */

	/*
	 * Runnable : void run() : System.out.println("Running")
	 */

	static Runnable r1 = () -> System.out.println("Running!");

	/*
	 * java.util.concurrent.Callable<V> : V call() : return the current year as an
	 * Integer
	 */
	static Callable<Integer> c1 = () -> LocalDate.now().getYear();

	/*
	 * Comparator<T> : int compare(T o1, T o2) : compare Planet diameters
	 */

	static Comparator<Planet> c2 = (p, p1) -> p.compareTo(p1);

	/*
	 * Predicate<T> : boolean test(T o1) : return true if Planet name contains "u"
	 */

	Predicate<Planet> p1 = p -> p.getName().contains("u");

	/*
	 * BiPredicate<T, U> : boolean test(T t, U u) : return true if Planet name
	 * contains the given String, case-insensitive
	 */

	BiPredicate<Planet, String> b1 = (p, s) -> p.getName().toLowerCase().contains(s.toLowerCase());

	/*
	 * Function<T, R> : R apply(T t) : return the President's name in the format
	 * "Lastname, Firstname"
	 */

	Function<President, String> f1 = (President p) -> p.getLastName() + ", " + p.getFirstName();

	/*
	 * BiFunction<T, U, R> : R apply(T t, U u) : Replace all vowels in a President's
	 * first and last name with a sequential number starting with U u, and return
	 * the transformed name String. For example u = 0, President name
	 * "Abraham Lincoln" is returned "0br1h2m L3nc4ln".
	 */public LambdaExamples() {
// TODO Auto-generated constructor stub
	}

	BiFunction<President, Integer, String> b2 = ( p , i)-> {
		
		StringBuilder n =new StringBuilder(""); 
		n.append(p.getFirstName() + " " + p.getLastName());
		for ( int j = 0; j < n.length() ; j++) {
			if (n.charAt(j) == 'a' || n.charAt(j) == 'e' ||n.charAt(j) == 'i' ||n.charAt(j) == 'o' ||n.charAt(j) == 'u' ||n.charAt(j) == 'A' ||n.charAt(j) == 'E' ||n.charAt(j) == 'I' ||n.charAt(j) == 'O' ||n.charAt(j) == 'U') {
				n.replace(j, j+1, i.toString());
				i++;
			}
		}
		
	return n.toString();	
	};
	public static void main(String[] args) {
		String abe = "Abraham Lincoln";
		LambdaExamples l = new LambdaExamples();
		System.out.println(l.b2.apply(new President("Abraham", "Lincoln") , 5));
	}
}
