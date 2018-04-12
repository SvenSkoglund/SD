package com.skilldistillery.trumpsimulator;

public class Trump {

	int ar = 35;

	public void printAR() {
		System.out.println("Your approval rating is " + ar + "%");
	}

	public int sendTweet(int ar) {
		int random = (int) (Math.random() * 20);
		if (Math.random() < 0.5) {
			ar = ar - random;
			System.out.println("Your tweet was a FAIL. Your approval went down " + random + " points.");
			return ar;
		} else {
			ar = ar + random;
			System.out.println("Your tweet was a BIGLY SUCCESS. Your approval went up " + random + " points.");
			return ar;
		}
	}
	
	//
	//
	//
	
	public void trumpAttackMenu() {
		System.out.println("Protect your presidency! What do you want to do?");
		System.out.println("\t1: Hold a campaign rally (tried and true)");
		System.out.println("\t2: Accuse her of Russia collusion (risky!)");
		System.out.println("\t3: Sign an executive order (Hail Mary!)");
	}
	public int holdRally() {
		int damage = (int)((Math.random()*2)+3);
		System.out.println("You hold a campaign rally and lead the crowd in a chant!");
		System.out.println("LOCK HER UP! LOCK HER UP! LOCK HER UP!");
		System.out.println("Clinton's approval rating takes a hit!");
		return damage;
	}
	public int accuseOfCollusion() {
		int damage = (int)((Math.random()*10));
			if(damage > 5) {
				System.out.println("It worked! The media is talking about Uranium One!");
				System.out.println("Clinton's approval rating takes a hit!");
				return damage;
			}
			else if(damage <=5) {
				System.out.println("It failed! Clinton dispells the accusation with political weasel words!");
				System.out.println("Clinton's approval rating is unaffected...");
				return 0;
			}
			return 0;
	}
	public int signExecutiveOrder() {
		int damage = (int)((Math.random()*15));
		if(damage > 9) {
			System.out.println("You signed an executive order! The camera's are flashing and your signature looks awesome on the page!");
			System.out.println("You looked so presidential!");
			System.out.println("Clinton's approval rating takes a hit!");
			return 12;
		}
		else if(damage >5 && damage <=9) {
			System.out.println("The order wasn't good enough to break into the news cycle...");
			System.out.println("Clinton's approval rating is unaffected...");
			return 0;
		}

			System.out.println("The unelected liberal judges blocked your executive order! Clinton looks more competent by comparison!");
			System.out.println("Your approval rating takes a hit!");
			return (-10);	
	}
	
	public int chooseActionVsClinton(int userChoice) {

			if (userChoice == 1 ) {
			int damage = holdRally();
			return damage;
			}
			if (userChoice == 2 ) {
			int damage = accuseOfCollusion();
			return damage;
			}
			if (userChoice == 3 ) {
			int damage = signExecutiveOrder();
			return damage;
			}
			else {
				System.out.println("WRONG! WRONG! SO WRONG! Select one of the listed options");
				return -1;
			}
			
	}
	



} 