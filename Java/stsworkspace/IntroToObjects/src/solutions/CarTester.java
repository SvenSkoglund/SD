package solutions;

public class CarTester {

  public static void main(String[] args) {
    // Create two Cars and assign fields
    Car car1 = new Car();
    car1.color = "Black";
    car1.make = "Dodge";
    car1.model = "Stratus";
    car1.numberOfWheels = 4;
    car1.purchasePrice = 15412.0;

    Car car2 = new Car();
    car2.color = "Neon";
    car2.make = "Ford";
    car2.model = "F950";
    car2.numberOfWheels = 10;
    car2.purchasePrice = 74999.0;

    // Have the cars display themselves
    car1.displayCar();
    car2.displayCar();

    String car1Data = car1.getCarData();
    String car2Data = car2.getCarData();

    // Get the cars' data and display that
    System.out.println("Car 1 data: " + car1Data);
    System.out.println("Car 2 data: " + car2Data);
  }

}
