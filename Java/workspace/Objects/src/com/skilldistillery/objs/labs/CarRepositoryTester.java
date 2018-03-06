package com.skilldistillery.objs.labs;

public class CarRepositoryTester {

	public static void main(String[] args) {
		CarRepository repo = new CarRepository();

		Car car1 = new Car("Dodge", "Stratus", "Black", 4, 15412.0);
		Car car2 = new Car("Ford", "F950", "Neon", 10, 74999.0);
		Car myCar = new Car("Ford", "Fiesta", "Black", 4, 4999);
		Car stefansCar = new Car("Toyota", "Camry", "Beige", 4, 3000);

		repo.addCar(car1);
		repo.addCar(car2);
		repo.addCar(myCar);
		repo.addCar(stefansCar);
		
		for (int i = 0 ; i <repo.getCars().length; i++) {
			repo.getCars()[i].displayCar();
		}

	}

}
