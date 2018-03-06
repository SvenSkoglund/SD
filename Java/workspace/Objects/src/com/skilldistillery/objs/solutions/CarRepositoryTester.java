package com.skilldistillery.objs.solutions;

public class CarRepositoryTester {

  public static void main(String[] args) {
    CarRepositoryTester crt = new CarRepositoryTester();
    crt.run();
  }
  
  private void run() {
    CarRepository cr = new CarRepository();
    
    Car[] cars = cr.getCars();
    
    System.out.println("Number of initial cars: " + cars.length);
    
    Car car1 = new Car("Black", "Dodge", "Stratus", 4, 15412.0);

    Car car2 = new Car();
    car2.setColor("Neon");
    car2.setMake("Ford");
    car2.setModel("F950");
    car2.setNumberOfWheels(10);
    car2.setPurchasePrice(74999.0);
    
    cr.addCar(car1);
    cr.addCar(car2);
    
    // Get the car array
    cars = cr.getCars();
    
    // Print it
    printCars(cars);
    
    System.out.println("Total cars returned: " + cars.length);
  }
  private void printCars(Car[] cars) {
    for (Car car : cars) {
      car.displayCar();
    }
  }

}
