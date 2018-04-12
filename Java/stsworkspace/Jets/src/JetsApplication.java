import java.util.Scanner;

public class JetsApplication {
	static AirField airField = new AirField();
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		launch();
	}

	public JetsApplication() {

	}

	private static void launch() {
		airFieldInit();
		displayMenu();
	}

	private static void displayMenu() {
		while (true) {
			System.out.println(
					"---- AirField Menu ----\n1: List Fleet \n2: Fly all jets\n3: View fastest jet\n4: View jet with longest range\n5: Load cargo planes\n6: Dogfight \n7: Show a jets description\n8: Add jet to fleet\n9: Exit");
			int entry = scanner.nextInt();
			switch (entry) {
			case 1:
				listFleet();
				System.out.println();
				break;
			case 2:
				flyAllJets();
				System.out.println();
				break;
			case 3:
				fastestJet(airField.getJets());
				System.out.println();
				break;
			case 4:
				System.out.println("Longest Range Jet: " + longestRange(airField.getJets()).toString());
				System.out.println();
				break;
			case 5:
				loadJets(airField.getJets());
				System.out.println();
				break;
			case 6:
				dogFight(airField.getJets());
				System.out.println();
				break;
			case 7:
				showDescription(airField.getJets());
				System.out.println();
				break;
			case 8:
				addJet(airField.getJets());
				System.out.println();
				break;
			case 9:
				System.out.println("Goodbye");
				System.out.println();
				System.exit(0);
			default:
				System.out.println("Invalid entry. Try again.");
			}
		}
	}

	private static void airFieldInit() {
		Jet b747 = new JetImpl("Boeing 747", 705, 6710, 83_000_000);
		b747.setDescription(
				"The Boeing 747 is an American wide-body commercial jet airliner and cargo aircraft, often referred to by its original nickname, \"Jumbo Jet\". Its distinctive \"hump\" upper deck along the forward part of the aircraft has made it one of the most recognizable aircraft, and it was the first wide-body airplane produced. Manufactured by Boeing's Commercial Airplane unit in the United States, the 747 was originally envisioned to have 150 percent greater capacity than the Boeing 707, a common large commercial aircraft of the 1960s. First flown commercially in 1970, the 747 held the passenger capacity record for 37 years.");
		airField.setJets(b747, 0);
		Jet gMeteor = new FighterJet("Gloster Meteor", 600, 600, 900_000);
		gMeteor.setDescription(
				"The Gloster Meteor was the first British jet fighter and the Allies' only jet aircraft to achieve combat operations during the Second World War. The Meteor's development was heavily reliant on its ground-breaking turbojet engines, pioneered by Sir Frank Whittle and his company, Power Jets Ltd. Development of the aircraft began in 1940, although work on the engines had been under way since 1936. The Meteor first flew in 1943 and commenced operations on 27 July 1944 with No. 616 Squadron RAF. The Meteor was not a sophisticated aircraft in its aerodynamics, but proved to be a successful combat fighter. Gloster's 1946 civil Meteor F.4 demonstrator G-AIDC was the first civilian-registered jet aircraft in the world.");
		airField.setJets(gMeteor, 1);
		Jet AB300 = new CargoPlane("Airbuss A300", 518, 3340, 105_000_000);
		AB300.setDescription(
				"The Airbus A300 is a wide-body twin-engine jet airliner that was developed and manufactured by Airbus. Formally announced in 1969 and first flying in October 1972, it holds the distinction of being the world's first twin-engined widebody airliner; it was also the first product of Airbus Industrie, a consortium of European aerospace manufacturers, now a subsidiary of Airbus. The A300 can typically seat 266 passengers in a two-class layout, with a maximum range of 4,070 nautical miles (7,540 km) when fully loaded, depending on model.");
		airField.setJets(AB300, 2);
		Jet h4Herc = new CargoPlane("H-4 Hercules", 250, 3000, 2_500_000);
		h4Herc.setDescription(
				"The Hughes H-4 Hercules (also known as the Spruce Goose; registration NX37602) is a prototype strategic airlift flying boat designed and built by the Hughes Aircraft Company. Intended as a transatlantic flight transport for use during World War II, it was not completed in time to be used in the war. The aircraft made only one brief flight on November 2, 1947, and the project never advanced beyond the single example produced. Built from wood because of wartime restrictions on the use of aluminum and concerns about weight, it was nicknamed by critics the Spruce Goose, although it was made almost entirely of birch.[2][3] The Hercules is the largest flying boat ever built, and it has the largest wingspan of any aircraft that has ever flown.[4][N 1]The aircraft remains in good condition. After being displayed to the public for almost 11 years in Long Beach, California from 1980 to 1991, it is now displayed at the Evergreen Aviation & Space Museum in McMinnville, Oregon, United States.");
		airField.setJets(h4Herc, 3);
		Jet UFO = new ExtraTerrestrial("UFO", Double.POSITIVE_INFINITY, Integer.MAX_VALUE, Long.MAX_VALUE);
		UFO.setDescription("TOP_SECRET");
		airField.setJets(UFO, 4);
	}

	private static void listFleet() {
		for (int i = 0; i < airField.getJets().length; i++) {
			System.out.println(airField.getJets()[i].toString());
		}
	}

	private static void flyAllJets() {
		for (int i = 0; i < airField.getJets().length; i++) {
			airField.getJets()[i].fly();
		}

	}

	private static Jet fastestJet(Jet[] jets) {
		double speedCounter = jets[0].getSpeed();
		int count = 0;
		for (int i = 0; i < airField.getJets().length; i++) {
			if (airField.getJets()[i].getSpeed() > speedCounter) {
				speedCounter = airField.getJets()[i].getSpeed();
				count = i;
			}
		}
		System.out.println("Fastest Jet: " + airField.getJets()[count].toString());
		return airField.getJets()[count];
	}

	private static Jet longestRange(Jet[] jets) {
		double RangeCounter = jets[0].getRange();
		int count = 0;
		for (int i = 0; i < airField.getJets().length; i++) {
			if (airField.getJets()[i].getRange() > RangeCounter) {
				RangeCounter = airField.getJets()[i].getRange();
				count = i;
			}
		}
		return airField.getJets()[count];
	}

	private static Jet[] addJet(Jet[] jets) {
		int aircraftChoiceType;
		String model;
		double speed;
		int range;
		long price;
		
		// Creates a new Jet array which is one index longer than the previous array.
		Jet[] newJetArray = new Jet[jets.length + 1];
		
		
		while (true) {
			System.out.println("Enter 1 for Combat Plane. 2 for Cargo Plane. 3 for Extra Terrestrial");
			aircraftChoiceType = scanner.nextInt();
			System.out.println();
			if (aircraftChoiceType == 1 || aircraftChoiceType == 2 || aircraftChoiceType == 3) {
				break;
			}
			else {
				System.out.println("Invalid entry. Try again.");
			}
		}
		System.out.print("Enter the model (Without Spaces)");
		model = scanner.next();
		System.out.println("Enter the speed");
		speed = scanner.nextDouble();
		System.out.println("Enter the range");
		range = scanner.nextInt();
		System.out.println("Enter the price");
		price = scanner.nextLong();

		// Creates a new jet object and stores it in the last index of the new array
		switch (aircraftChoiceType) {
		case 1:
			Jet newJetF = new FighterJet(model, speed, range, price);
			promptForDescription(newJetF);
			newJetArray[jets.length] = newJetF;
			break;
		case 2:
			Jet newJetC = new CargoPlane(model, speed, range, price);
			promptForDescription(newJetC);
			newJetArray[jets.length] = newJetC;
			break;
		case 3:
			Jet newJetE = new ExtraTerrestrial(model, speed, range, price);
			promptForDescription(newJetE);
			newJetArray[jets.length] = newJetE;
			break;

		}
		
		// Copies data from the old array into the new array
		for (int i = 0; i < jets.length; i++) {
			newJetArray[i] = jets[i];
		}
		airField.resignJets(newJetArray);
		return newJetArray;
	}

	public static Jet promptForDescription(Jet jet) {
		while (true) {
			System.out.println("Would you like to add a description? y/n");
			char descriptionChoice = (scanner.next().toLowerCase().charAt(0));
			if (descriptionChoice == 'y') {
				System.out.println("Please enter a description of the aircraft (without spaces)");
				String description = scanner.next();
				jet.setDescription(description);
				break;
			}
			else if (descriptionChoice == 'n') {
				System.out.println("No descrition added.");
				break;
			}
			else {
				System.out.println("Invalid entry. Try again.");
			}
		}
		return jet;
	}

	public static void showDescription(Jet[] jets) {
		for (int i = 0; i < jets.length; i++) {
			System.out.println((i + 1) + ": " + jets[i].getModel());
		}
		int entry = scanner.nextInt();
		System.out.println(jets[entry - 1].getDescription());
	}

	public static void loadJets(Jet[] jets) {
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] instanceof CargoCarrier) {
				((CargoCarrier) jets[i]).loadCargo();
			}
		}
	}

	public static void dogFight(Jet[] jets) {
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] instanceof CombatReady ) {
				((CombatReady) jets[i]).fight();
			}
		}
	}

}
