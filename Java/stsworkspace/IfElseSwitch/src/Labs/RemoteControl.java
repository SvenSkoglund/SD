package Labs;

import java.util.Scanner;

public class RemoteControl {

	public static void main(String[] args) {

		pressButton();
	}

	public static void pressButton() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please press a button 0-9 or choose ON or OFF");
		String button = scanner.nextLine().toUpperCase();
		
		switch (button) {
		case "0":
			boop();
			break;
		case "1":
			boop();
			break;
		case "2":
			boop();
			break;
		case "3":
			boop();
			break;
		case "4":
			boop();
			break;
		case "5":
			boop();
			break;
		case "6":
			boop();
			break;
		case "7":
			boop();
			break;
		case "8":
			boop();
			break;
		case "9":
			boop();
			break;
		case "ON":
			turnOn();
			break;
		case "OFF":
			turnOff();
			break;
		default:
			System.out.println("That's not a button!");
		}
	}
	public static void boop() {
		System.out.println("BOOP!");
	}
	public static void turnOn() {
		System.out.println("Turning On!");
	}
	public static void turnOff() {
		System.out.println("Powering Down!");
	}
}
