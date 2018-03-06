package com.skilldistillery.inheritance.solutions.vehicles;

public class VehicleTestApp3 {

  public static void main(String[] args) {
    Automobile3 a = new Automobile3(90000.00, "Dundreary", "Stretch", 2008, 4, 105);
    Boat3 b = new Boat3(145000.00, "Reefer", 21, 25);
    Truck3 t = new Truck3(22_000, "Vapid", "Bobcat", 2006, 4, 88, 55);
    
    System.out.println(a.toString());
    System.out.println(b.toString());
    System.out.println(t.toString());
  }

}
