package com.skilldistillery.generics.labs;

import java.util.ArrayList;

public class Students {

	public Students() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> students = new ArrayList<>();
		students.add("Sven");
		students.add("Mark");
		students.add("Drew");
		students.add("Alan");
		students.add("Miranda");
		students.add("Dora");
		students.add("Grace");
		students.add("Andrew");
		students.add("Julian");
		students.add("Xien");
		students.add("Nate");
		students.add("Alex");
		students.add("Eli");
		students.add("Rebecca");
		students.add("Megan");

		for (String student : students) {
			System.out.println(student);
		}
	}

}
