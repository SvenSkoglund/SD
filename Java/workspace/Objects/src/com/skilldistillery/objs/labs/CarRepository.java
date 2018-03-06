package com.skilldistillery.objs.labs;

//Create a class called CarRepository. Its job is to hold an array of cars. The class will have:
//
//A field for a Car[]. This field is of course private
//private static int MAX_CARS = 100;.
//A no-arg constructor. In this constructor, initialize the Car[] to have space for 100 Car references.
//Two methods.
//void addCar(Car car). This adds a Car to the array. (How will you decide the next available array location? You probably need to keep track of the number of cars in the array.)
//
//Users outside the package should be able to use this method.
//
//Car[] getCars(). This returns an array containing all Cars in the CarRepository. It does not just return the private reference. It will instead return an array full of Cars; the array does not have any null elements.
//
//Users outside the package should be able to use this method.
public class CarRepository {
	private Car[] repository;
	private static int MAX_CARS = 100;

	public CarRepository() {
		this.repository = new Car[MAX_CARS];
	}

	public void addCar(Car car) {
		for (int i = 0; i < MAX_CARS; i++) {
			if (this.repository[i] == null) {
				repository[i] = car;
				break;
			}
		}
		//System.out.println("No room left for cars.");
	}

	public Car[] getCars() {
		int length = 0;
		for (int i = 0; i < MAX_CARS; i++) {
			if (this.repository[i] == null) {
				length = i;
				break;
			}
		}
		Car[] returnedCars = new Car[length];
		for (int j = 0; j < returnedCars.length; j++) {
			returnedCars[j] = this.repository[j];
		}

		return returnedCars;

	}
}
