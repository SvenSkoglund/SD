package com.skilldistillery.inheritance.solutions.vehicles;

public class VehicleTestApp2 {

  public static void main(String[] args) {
    Automobile2 a = new Automobile2(90000.00, "Dundreary", "Stretch", 2008, 4, 105);
    Boat2 b = new Boat2(145000.00, "Reefer", 21, 25);
    Truck2 t = new Truck2(22_000, "Vapid", "Bobcat", 2006, 4, 88, 55);
    
    System.out.println(a.toString());
    System.out.println(b.toString());
    System.out.println(t.toString());
  }

}
