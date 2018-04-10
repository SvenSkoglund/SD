package com.skilldistillery.trumpsimulator;

public class HillaryClinton extends Obstacle {
	
	private int har;
	
	public void printEncounterMessage() {
		encounterMessage = "But old foes can return anew...\n\nHillary Clinton is back, and she still wants to be president!";
		System.out.println(encounterMessage);
		int x = 100;
		long y = x;
		double z = x;
//		String x = false;
//		x = x++;
	}
	

	public HillaryClinton(int ar) {
		this.har = ar - 10;
	}
	
	public int HillaryAttack1(int ar) {
		int damage = (int) ((Math.random()*8) + 5);
		System.out.println("Hillary answers a debate question like she's thought about it for more than a few minutes!");
		System.out.println("Your approval rating takes a hit!");
		System.out.println("\nClinton's approval rating is " + this.getHar() + "%");
		return damage;
	}
	
	public int HillaryAttack2(int ar) {
		int heal = (int)((Math.random()*2) + 3);
		setHar(heal + this.har);
		System.out.println("Hillary courts corporate donors!");
		System.out.println("Her approval rating rises!");
		System.out.println("\nClinton's approval rating is " + this.getHar() + "%"); 
		return 0;
	}
	
	public int HillaryAttack3(int ar) {
		int damage = (int)(Math.random()*10);
		System.out.println("Hillary attempts to hold a campaign rally...");
		if(damage >5) {
			System.out.println("...and succeeds!");
			System.out.println("Your approval rating takes a hit!");
			System.out.println("\nClinton's approval rating is " + this.getHar() + "%");
			return damage;
		}
		else {
			System.out.println("...but she faints!");
			System.out.println("Clinton's approval rating takes a hit!");
			this.har = har - damage;
			if (this.har <=0) {
				this.har = 0;
				System.out.println("\nHillary's approval is 0! You've done it! You're the greatest political genius of our age!");
				System.exit(0);
				return 0;
			}
			System.out.println("\nHillary's approval rating is " + this.getHar() +"%");
			return this.har;
		}
	}
	public int HillaryAttack4(int ar) {
		int damage = (int)(Math.random()*10);
		System.out.println("Hillary dodges a question...");
		if (damage > 5) {
			System.out.println("...but changes the subject to your scandals!");
			System.out.println("Your approval takes a hit!");
			System.out.println("\nClinton's approval rating is %" + this.getHar());
			return damage;
		}
		else {
			System.out.println("...and she can't deflect!");
			System.out.println("Hillary's approval takes a hit!");
			this.har = har - damage;
			if (this.har <=0) {
				this.har = 0;
				System.out.println("Hillary's approval is 0! You've done it! You're the greatest political genius of our age!");
				System.exit(0);
				return 0;
			}
			System.out.println("\nClinton's approval rating is %" + this.har);
			return 0;
		}
	}
	
	public int HillaryChooseAttack() {
		int attack = (int) (Math.random()*4);
		return attack;
	}
	
	public int getHillaryStartingApproval() {
		return this.har;
	}
	
	public void setHar(int har) {
		this.har = har;
	}
	public int getHar() {
		return this.har;
	}
}
