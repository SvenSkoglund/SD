package com.skilldistillery.objs2.labs;

public class CarInventoryManager {
	CarRepository repo = new CarRepository();

	public void addCar(Car car) {
		repo.addCar(car);
	}

	public Car[] findCarsByMake(String model) {
		int count = 0;
		for (int i = 0; i < repo.getCars().length; i++) {
			if (repo.getCars()[i].getMake().equals(model)) {
				count = count + 1;
			}
		}
		Car[] modelArray = new Car[count];
		count = 0;
		for (int i = 0; i < repo.getCars().length; i++) {
			if (repo.getCars()[i].getMake().equals(model)) {
				modelArray[count]=repo.getCars()[i];
				modelArray[count].displayCar();
				count = count + 1;
			}

		}
		return modelArray;
	}
	public Car[] getAllCars() {
		return repo.getCars();
	}
}
