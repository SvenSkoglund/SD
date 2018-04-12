package labs;

public class Car {
	public String make ;
	public String model ;
	public String color;
	public static int numberOfWheels = 4;
	public double price ;
	
	public String getCarData() {
		String carData = "Make: "+ make + "\nModel: " + model + "\nColor: " + color + 
				"\nNumber of Wheels: " + numberOfWheels + "\nPrice: " + price;
		return carData;
	}
	public void displayCar() {
		System.out.println(getCarData());
	}
}
