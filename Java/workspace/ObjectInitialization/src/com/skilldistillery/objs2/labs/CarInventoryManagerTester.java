package com.skilldistillery.objs2.labs;

import com.skilldistillery.objs2.labs.Car;

public class CarInventoryManagerTester {

	public static void main(String[] args) {

		CarInventoryManager cim = new CarInventoryManager();

		Car car1 = new Car("Dodge", "Stratus", "Black", 4, 15412.0);
		Car car2 = new Car("Ford", "F950", "Neon", 10, 74999.0);
		Car myCar = new Car("Ford", "Fiesta", "Black", 4, 4999);
		Car stefansCar = new Car("Toyota", "Camry", "Beige", 4, 3000);

		cim.addCar(car1);
		cim.addCar(car2);
		cim.addCar(myCar);
		cim.addCar(stefansCar);
		
		cim.findCarsByMake("Ford");
	}

}
