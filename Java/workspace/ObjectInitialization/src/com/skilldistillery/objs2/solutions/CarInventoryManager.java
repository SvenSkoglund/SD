package com.skilldistillery.objs2.solutions;

public class CarInventoryManager {
  
  private CarRepository repo;
  
  {
    repo = new CarRepository();
  }

  public void addCar(Car car) {
    repo.addCar(car);
  }
  
  public Car[] findCarsByModel(String model) {
    Car[] carsByModel = null;
    Car[] cars = repo.getCars();
    
    // Find out how big the array should be by using a boolean
    // array and marking the index to true if the model matches,
    // and adding to the total of matches.
    // We use this array to avoid iterating through the cars array
    // and calling .equals() on all the models a second time.
    boolean[] matchingIndexes = new boolean[cars.length];
    int numMatchingIndexes = 0;
    for (int i = 0; i < cars.length; i++) {
      // check the String input against the car's model
      if(model.equals(cars[i].getModel())) {
        matchingIndexes[i] = true;
        numMatchingIndexes++;
      }
    }
    
    // now loop through to see which indexes match
    // use a separate counter to keep track of which carsByModel
    // index we are on
    carsByModel = new Car[numMatchingIndexes];
    int carsByModelCounter = 0;
    for (int i = 0; i < matchingIndexes.length; i++) {
      if(matchingIndexes[i]) {
        carsByModel[carsByModelCounter] = cars[i];
        carsByModelCounter++;
      }
    }
    
    return carsByModel;
  }
  
  public Car[] getAllCars() {
    Car[] repoCars = repo.getCars();
    // return a copy of the array so that callers cannot modify repository data
    Car[] allCars = new Car[repoCars.length];
    for (int i = 0; i < repoCars.length; i++) {
      allCars[i] = repoCars[i];
    }
    
    return allCars;
  }
}
