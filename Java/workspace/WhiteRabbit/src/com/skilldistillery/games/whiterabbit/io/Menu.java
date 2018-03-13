package com.skilldistillery.games.whiterabbit.io;

public class Menu implements Drawable {

	@Override
	public void draw() {
		System.out.println("1. Examine your surroundings.");
		System.out.println("2. Look around for help?");
		System.out.println("3. Move.");
		System.out.println("4. Quit.");

	}

}
