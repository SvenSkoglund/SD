package com.skilldistillery.abstractclasses.labs.vehicles;

import java.util.Scanner;

public class ShapesTester {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many shapes would you like to make?");
		int count = input.nextInt();
		Shapes[] shapesArray = new Shapes[count];
		for (int i = 0; i < shapesArray.length; i++) {
			System.out.println("Enter 1 to create rectangle. 2 to create circle.");
			int entry = input.nextInt();

			if (entry == 1) {
				System.out.println("Enter width");
				double width = input.nextDouble();
				System.out.println("Enter height");
				double height = input.nextDouble();
				shapesArray[i] = new Rectangle(width, height);
				continue;
			}
			if (entry == 2) {
				System.out.println("Enter radius");
				double radius = input.nextDouble();
				shapesArray[i] = new Circle(radius);
				continue;
			}
			else {
				System.out.println("Invalid entry, try again");
				i--;
			}
		}

		for (int i = 0; i < shapesArray.length; i++) {
			System.out.println(shapesArray[i].toString());
		}

	}

}
