package com.skilldistillery.games.whiterabbit.items;

import com.skilldistillery.games.whiterabbit.GameCharacter;

public abstract class Food implements GameItem {
	private String name;
	private double alterationFactor;

	@Override
	public void alterGameCharacter(GameCharacter gc) {
		// multiply charachter's height by alteration factor
		gc.setHeight(gc.getHeight()*alterationFactor);
		// then set character's height
		// if the character's height is less than one, set it to one
		if(gc.getHeight() < 1) {
			gc.setHeight(1);
		}
	}

	public Food(String name, double alterationFactor) {
		this.name = name;
		this.alterationFactor = alterationFactor;
	}

	public String getName() {
		return name;
	}

	public double getAlterationFactor() {
		return alterationFactor;
	}
	
	public String getLabel() {
		return null;
	}

}
