package com.skilldistillery.inheritance.solutions.vehicles;

public class VehicleTestApp {

  public static void main(String[] args) {
    Automobile a = new Automobile(90000.00, "Dundreary", "Stretch", 2008, 4, 105);
    Boat b = new Boat(145000.00, "Reefer", 21, 25);
    Truck t = new Truck(22_000, "Vapid", "Bobcat", 2006, 4, 88, 55);
    
    System.out.println(a.toString());
    System.out.println(b.toString());
    System.out.println(t.toString());
  }

}
