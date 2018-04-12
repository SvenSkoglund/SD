package com.skilldistillery.games.whiterabbit.items;

public class LabeledFood extends Food {
	private String label;

	public LabeledFood(String name, double alterationFactor, String label) {
		super(name, alterationFactor);
		this.label = label;
		
	}

	@Override
	public String toString() {
		return this.getName();
	}

	public String getLabel() {
		return this.label;
	}
}
