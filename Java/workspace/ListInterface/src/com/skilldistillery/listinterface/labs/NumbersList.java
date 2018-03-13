package com.skilldistillery.listinterface.labs;

import java.util.ArrayList;
import java.util.List;

public class NumbersList {

	public static void main(String[] args) {
		// Write a program that uses Math.random() to build List of 10 integers between
		// 10 and 100 (inclusive).
		// Choose whichever implementation class you want.
		// Run it several times to see if you can get 10 and 100.

		List<Integer> intList = new ArrayList<>();

		for (int i = 0; i < 20000000; i++) {
			intList.add((Integer) (int) (10 + Math.random() * 91));
		}
		System.out.println(intList.contains(10));
		System.out.println(intList.contains(100));
		System.out.println(intList);
		
		sortAndPrint(intList);
	}
		
		
		public static void sortAndPrint(List <Integer>intList) {
		for (int i = 0; i < intList.size(); i++) {
			
			for (int j = 0; j < intList.size() - 1; j++) {
				if (intList.get(j) > intList.get(j + 1)) {
					Integer removed = intList.remove(j + 1);
					intList.add(j, removed);
					j--;
				}
			}

		}
		System.out.println(intList);

	}

}
