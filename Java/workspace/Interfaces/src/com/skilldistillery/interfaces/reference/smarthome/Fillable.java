package com.skilldistillery.interfaces.reference.smarthome;

public interface Fillable {
  double LITERS_PER_GALLON = 3.78541; // public static final field
  void fill(int amount);
  
  static double litersFromGallons(double gallons) {
    return gallons * LITERS_PER_GALLON;
  }
  
  default int getCapacityLiters() {
    return 0;
  }
}
