package com.skilldistillery.games.whiterabbit;

import com.skilldistillery.games.whiterabbit.io.DrinkOptions;
import com.skilldistillery.games.whiterabbit.io.FoodOptions;
import com.skilldistillery.games.whiterabbit.io.IOManager;
import com.skilldistillery.games.whiterabbit.io.Menu;
import com.skilldistillery.games.whiterabbit.io.PromptForName;
import com.skilldistillery.games.whiterabbit.io.SystemIOManager;
import com.skilldistillery.games.whiterabbit.items.FoodFactory;
import com.skilldistillery.games.whiterabbit.items.FoodFactoryImpl;

public class GameApp {
	private FoodFactory itemFactory = new FoodFactoryImpl();
	private IOManager iOManager = new SystemIOManager();
	private Menu menu = new Menu();
	private GameCharacter gameCharacter = new GameCharacter("", 10);
	private PromptForName getName = new PromptForName();
	private FoodOptions foodOptions = new FoodOptions();
	private DrinkOptions drinkOptions = new DrinkOptions();

	public static void main(String[] args) {
		GameApp ga = new GameApp();
		ga.launch();

	}

	public GameApp() {

	}

	private void launch() {
		iOManager.init();
		gameCharacter.setName(iOManager.getUserInput(getName));
		Obstacle obstacle = new Obstacle("door", 20, "BIG");

		while (true) {
			System.out.println("Your name is " + gameCharacter.getName() + ". You are "
					+ (int) gameCharacter.getHeight() + " tall.");
			String entry = iOManager.getUserInput(menu);

			if (entry.equals("1")) {
				optionOne(obstacle);
			}

			if (entry.equals("2")) {
				optionTwo(entry);
			}
			if (entry.equals("3")) {
				optionThree(entry,obstacle);
			}
			if (entry.equals("4")) {
				System.out.println("Good-Bye.");
				shutdown();
			}
		}

	}

	private void optionOne(Obstacle obstacle) {
		System.out.println("You see a " + obstacle.getName() + " and it is " + obstacle.getHeight() + " "
				+ obstacle.getType());
		System.out.println("What would you like to do. ");		
	}

	private void shutdown() {
		System.exit(0);
	}
	private void optionTwo(String entry) {
		try {
			if (itemFactory.getFood().getAlterationFactor() > 1) {
				System.out.println("You see a " + itemFactory.getFood() + " it says " + itemFactory.getFood().getLabel() + ", what do you want to do?");
				entry = iOManager.getUserInput(foodOptions);
			}
			else {
				System.out.println("You see a " + itemFactory.getFood() + " it says " + itemFactory.getFood().getLabel() + ", what do you want to do?");
				entry = iOManager.getUserInput(drinkOptions);
			}

			if (entry.equals("1")) {
				gameCharacter.useItem(itemFactory.getFood());
				itemFactory.ignoreFood();

			}
			if (entry.equals("2")) {
				itemFactory.ignoreFood();
			}
		}

		catch (NullPointerException e) {
			System.out.println("No more food or drinks left. Good Bye.");
			shutdown();
		}
	}
	private void optionThree(String entry, Obstacle obstacle) {
		if ((obstacle.getType().equals("SMALL") && gameCharacter.getHeight() <= obstacle.getHeight())
				|| (obstacle.getType().equals("BIG") && gameCharacter.getHeight() >= obstacle.getHeight())) {
			System.out.println("Congrats! You made it through the door. Good-Bye.");
			shutdown();
		}
		else {
			System.out.println("You are too big, try again. ");
		}
	}
}
