package com.skilldistillery.abstractclasses.solutions.vehicles;

import java.util.Scanner;

public class TravelingTest {
  
  private Vehicle[] vehicles;
  
  public TravelingTest() {
    vehicles = new Vehicle[8];
    vehicles[0] = new Automobile(20000, "GTA", "Oceanic", 1961, 4, 68);
    vehicles[1] = new Plane(130000, 320, 450, "Sparrow", 5);
    vehicles[2] = new Plane(220000, 480, 2000, "Flyer", 75);
    vehicles[3] = new Plane(1_200_000.00, 651, 9120, "LongHauler", 144);
  }

  public static void main(String[] args) {
    TravelingTest t = new TravelingTest();
    t.run();
  }
  
  private void run() {
    Scanner sc = new Scanner(System.in);
    int numPassengers = promptUserForPassengers(sc);
    
    // now calculate the vehicle
    Vehicle v = getVehicleBasedOnPassengers(numPassengers);
    if(v == null) {
      System.out.println("We do not have a vehicle that can accommodate that number of passengers.");
    }
    else {
      System.out.println("You will be traveling in a " + v);
    }
    sc.close();
  }
  
  private int promptUserForPassengers(Scanner sc) {
    System.out.print("How many passengers will be traveling? Enter a number: ");
    return sc.nextInt();
  }
  
  private Vehicle getVehicleBasedOnPassengers(int numPass) {
    Vehicle v = null;
    if(numPass <= 4) {
      //find an Automobile
      for (Vehicle vehicle : vehicles) {
        if(vehicle instanceof Automobile) {
          v = vehicle;
          break;
        }
      }
    }
    else {
      for (Vehicle vehicle : vehicles) {
        if(vehicle != null) {
          // See if this is a plane so we can check capacity
          if(vehicle instanceof Plane) {
            int passengers = ((Plane) vehicle).getPassengerCapacity();
            if(passengers >= numPass) {
              v = vehicle;
              break;
            }
          }
        }
      }
    }
    return v;
  }

}
