package com.skilldistillery.games.whiterabbit;

import com.skilldistillery.games.whiterabbit.items.GameItem;

public class GameCharacter {
	private String name;
	private double height;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Your name is " + name + ", and you height is " + height + ".";
	}

	public GameCharacter(String name, double height) {
		this.name = name;
		this.height = height;
	}

	public void useItem(GameItem gi) {
		gi.alterGameCharacter(this);
	}
}
