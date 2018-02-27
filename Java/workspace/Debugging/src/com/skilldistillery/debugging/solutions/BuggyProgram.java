package com.skilldistillery.debugging.solutions;

import com.skilldistillery.debugging.labs.Car;

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
    addCarToArray(cars, "Bravado", "Banshee", "blue", 4, 74_000);
    addCarToArray(cars, "Dundreary", "Landstalker", "yellow", 4, 63_999.99);
    addCarToArray(cars, "Dundreary", "Admiral", "green", 4, 23500);
    addCarToArray(cars, "Declasse", "Sabre", "red", 4, 31_000);
    addCarToArray(cars, "Maibatsu", "Mule", "white", 4, 57_300);
  }

  // Passing the counter will not change the counter field, because Java is pass-by-value. Remove it entirely.
  // Poorly named variables; they should reflect what they really are.
  public void addCarToArray(Car[] cars, String a, String b, String c, int wheels, double price) {
    Car car = new Car();
    car.make = a;
    car.model = b;
    car.color = c;
    car.numberOfWheels = wheels;
    car.purchasePrice = price;
    cars[counter] = car;
    this.counter++;
  }
  
  
}
