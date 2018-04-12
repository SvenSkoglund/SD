package labs;

public class CarTester {

	public static void main(String[] args) {

		Car myCar = new Car();
		myCar.color = "black";
		myCar.make = "Ford";
		myCar.model = "Fiesta";
		myCar.price = 4999;
		
		//System.out.println(myCar.getCarData());
		myCar.displayCar();
		
		Car myFirstCar = new Car();
		myFirstCar.color = "red";
		myFirstCar.make = "Saab";
		myFirstCar.model = "9-3";
		myFirstCar.price = 4500;
		
		//System.out.println(myFirstCar.getCarData());
		myFirstCar.displayCar();
	}

}
