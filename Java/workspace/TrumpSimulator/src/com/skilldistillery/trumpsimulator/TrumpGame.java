package com.skilldistillery.trumpsimulator;

import java.util.Scanner;

public class TrumpGame {

	Trump trump = new Trump();
	Scanner input = new Scanner(System.in);

	public void run() {
		Obstacle[] obstacleArray = new Obstacle[5];
		obstacleArray[0] = new BadHair();
		obstacleArray[1] = new LiberalMedia();
		obstacleArray[2] = new BigBill();
		obstacleArray[3] = new PressConference();
		obstacleArray[4] = new KimJongNewThreat();
		System.out.println("Welcome to Trump Simulator 2018. Can you survive the day without being impeached?\n\n");
		trump.printAR();
		System.out.println();
		System.out.println("Don't let your approval rating fall to zero!\n\n");
		for (int i = 0; i < obstacleArray.length; i++) {
			int userChoice;
			while (true) {
				obstacleArray[i].printEncounterMessage();
				obstacleArray[i].printOptions();
				userChoice = input.nextInt();
				if (userChoice == 1 || userChoice == 2 || userChoice == 3 || userChoice == 4) {
					break;
				} 
				else {
					System.out.println("WRONG! WRONG! SO WRONG! Please enter an integer choice between 1 and 4.");
				}
			}
			trump.ar = obstacleArray[i].changeAR(trump.ar, userChoice);

			if (trump.ar <= 0) {
				trump.ar = 0;
				trump.printAR();
				System.out.println("FAKE NEWS FINALLY CAUGHT UP TO ME. NOT EVEN I CAN DRAIN THIS SWAMP. GAME OVER.");
				System.exit(0);
			}
			trump.printAR();
			System.out.println("Looks like you have some downtime. Do you want to tweet something? (y/n)");

			if (input.next().charAt(0) == 'y') {
				trump.ar = trump.sendTweet(trump.ar);
				if (trump.ar <= 0) {
					System.out.println("FAKE NEWS FINALLY CAUGHT UP TO ME. THE SWAMP WAS TOO FULL. GAME OVER.");
					System.exit(0);
				}
			}
			trump.printAR();

		}
		System.out.println(
				"You ended the day with a positive approval rating! You get to stay in office for one more day!");
		
		if(trump.ar > 20) {
			HillaryClinton clinton = new HillaryClinton(trump.ar);
			int har = clinton.getHillaryStartingApproval();
			clinton.printEncounterMessage();
			while(true) {
				int chooseAttack = clinton.HillaryChooseAttack();
				System.out.println("Hillary's approval rating is " + clinton.getHar() + "%");
				if (chooseAttack < 1) {
					int damage = clinton.HillaryAttack1(trump.ar);
					trump.ar -= damage;
					if (trump.ar <= 0) {
						trump.ar = 0;
					}
					
					trump.printAR();
				}
				if(chooseAttack <2 && chooseAttack >=1) {
					int damage = clinton.HillaryAttack2(trump.ar);
					trump.ar -= damage;
					if (trump.ar <= 0) {
						trump.ar = 0;
					}
					trump.printAR();
				}
				if(chooseAttack <3 && chooseAttack >=2) {
					int damage = clinton.HillaryAttack3(trump.ar);
					trump.ar -= damage;
					if (trump.ar <= 0) {
						trump.ar = 0;
					}
					trump.printAR();
				}
				if(chooseAttack < 4 && chooseAttack >= 3) {
					int damage = clinton.HillaryAttack4(trump.ar);
					trump.ar -= damage;
					if (trump.ar <= 0) {
						trump.ar = 0;
					}
					trump.printAR();
				}
				
				
				if (trump.ar <= 0) {
					System.out.println("FAKE NEWS FINALLY CAUGHT UP TO ME. THE SWAMP WAS TOO FULL. GAME OVER.");
					System.exit(0);
				}
				trump.trumpAttackMenu();
				int trumpAttack = input.nextInt();
				int damage = trump.chooseActionVsClinton(trumpAttack);
					if (damage == (-1)) {
						
					}
				
				clinton.setHar(clinton.getHar() - damage);
				if (trump.ar <= 0) {
					trump.ar = 0;
				}
				if (trump.ar <= 0) {
					System.out.println("FAKE NEWS FINALLY CAUGHT UP TO ME. THE SWAMP WAS TOO FULL. GAME OVER.");
					System.exit(0);
				}
				trump.printAR();
				if(clinton.getHar() <= 0) {
					System.out.println();  
					System.out.println("Hillary's approval is 0! You've done it! You're the greatest political genius of our age!");
					System.exit(0);
				}
				
			}
		}
	}

}
