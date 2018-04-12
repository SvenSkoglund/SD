package com.skilldistillery.objs2.solutions;

public class CarRepository {
  private Car[] cars;
  private int numCars = 0;
  
  final private static int MAX_CARS = 100;
  
  public CarRepository() {
    cars = new Car[MAX_CARS];
  }
  public void addCar(Car c) {
    cars[numCars] = c;
    numCars++;    // increment to reflect that we have one more car
  }
  
  public Car[] getCars() {
    Car[] carCopy;
    carCopy = new Car[numCars];
    for(int i=0; i < numCars; i++) {
      carCopy[i] = cars[i];
    }
    
    return carCopy;
  }
}
