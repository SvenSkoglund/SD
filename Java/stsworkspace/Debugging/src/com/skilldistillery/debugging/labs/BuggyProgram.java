package com.skilldistillery.debugging.labs;

public class BuggyProgram {
  public static void main(String[] args) {
    BuggyProgram prog = new BuggyProgram();
    prog.run();
  }
  
  public int counter;
  
  public void run() {
    Car[] cars = new Car[5];
    
    addCars(cars);
    
    for (Car car : cars) {
      car.displayCar();
    }
  }
  
  public void addCars(Car[] cars) {
    addCarToArray(cars, "Bravado", "Banshee", "blue", 4, 74_000, counter);
    addCarToArray(cars, "Dundreary", "Landstalker", "yellow", 4, 63_999.99, counter);
    addCarToArray(cars, "Dundreary", "Admiral", "green", 4, 23500, counter);
    addCarToArray(cars, "Declasse", "Sabre", "red", 4, 31_000, counter);
    addCarToArray(cars, "Maibatsu", "Mule", "white", 4, 57_300, counter);
  }

  public void addCarToArray(Car[] cars, String a, String b, String c, int wheels, double price, int counter) {
    Car car = new Car();
    car.model = a;
    car.make = b;
    car.color = c;
    car.numberOfWheels = wheels;
    cars[counter] = car;
    counter++;
  }
  
  
}
