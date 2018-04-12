package com.skilldistillery.polymorphism.solutions.vehicles;

public class VehicleApp3 {
  public static void main(String[] args) {
     VehicleApp3 va = new VehicleApp3();
     va.run();
  }

  public void run() {
    Automobile a = new Automobile(90000.00, "Dundreary", "Stretch", 2008, 4, 105);
    Boat b = new Boat(145000.00, "Reefer", 21, 25);
    Truck t = new Truck(22_000, "Vapid", "Bobcat", 2006, 4, 88, 55);
    // Can use a vehicle reference, too
    Vehicle a2 = new Automobile(97000.00, "Albany", "Hermes", 1942, 4, 176);
    Vehicle bigTruck = new Truck(120000.00, "MTL", "Packer", 2005, 10, 85, 139);
    
    Vehicle[] vehicles = new Vehicle[5];
    vehicles[0] = a;
    vehicles[1] = b;
    vehicles[2] = t;
    vehicles[3] = a2;
    vehicles[4] = bigTruck;
    
    for (Vehicle vehicle : vehicles) {
      double regFee = calculateVehicleRegistration(vehicle);
      if (vehicle instanceof Automobile) {
        Automobile auto = (Automobile) vehicle;
        System.out.print(auto.getMake() + " " + auto.getModel() + "\t");
      }
      else if (vehicle instanceof Boat) {
        int length = ((Boat) vehicle).getLengthInFeet();
        System.out.printf("%d ft\t", length  );
      }
      System.out.printf("$%.2f\t fee: $%.2f%n", vehicle.getPurchasePrice(), regFee);
    }
  }

  private double calculateVehicleRegistration(Vehicle v) {
    double rate = 0.02;
    if (v instanceof Automobile) { // Truck is-a Automobile
      rate = 0.04;
    }
    else if (v instanceof Boat) {
      rate = 0.065;
    }
    return v.calculateRegistrationFee(rate);
  }
}
