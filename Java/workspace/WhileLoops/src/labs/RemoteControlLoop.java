package labs;

import java.util.Scanner;

public class RemoteControlLoop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String remoteOn = "";
		while (!remoteOn.equalsIgnoreCase("ON")) {
			System.out.println("Enter ON to turn on the remote");
			remoteOn = scanner.nextLine();
		}
		turnOn();
		pressButton();
	}

	public static void pressButton() {
		Scanner scanner = new Scanner(System.in);

		boolean remoteOff = false;
		while (remoteOff == false) {
			System.out.println("Please press a button 0-9 or choose OFF");
			String button = scanner.nextLine().toUpperCase();
			switch (button) {
			case "0":
			case "1":
			case "2":
			case "3":
			case "4":
			case "5":
			case "6":
			case "7":
			case "8":
			case "9":
				boop();
				break;
			case "ON":
				System.out.println("Remote is already On!");
				break;
			case "OFF":
				turnOff();
				remoteOff = true;
				break;
			default:
				System.out.println("That's not a button!");
			}
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
