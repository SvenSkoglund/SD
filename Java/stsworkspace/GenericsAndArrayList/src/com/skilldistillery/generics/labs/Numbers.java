package com.skilldistillery.generics.labs;

import java.util.ArrayList;

public class Numbers {

	public static void main(String[] args) {
		// Write a program that uses Math.random() to build an ArrayList of 10 numbers
		// between 0 and 1 (exclusive). Use a standard for loop to print out each number
		// to 3 decimal places. (Hint: System.out.printf)

		ArrayList<Double> doubleList = new ArrayList<>();
		
		for (int i = 0 ; i < 10 ; i++ ) {
			doubleList.add(Math.random());
			System.out.printf("%.3f  ", doubleList.get(i));
		}
		// System.out.println(doubleList.size());
	}

}
