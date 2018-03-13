package com.skilldistillery.games.whiterabbit;

public class Obstacle {
	private String name;
	private int height;
	private String type; // BIG or SMALL

	public Obstacle(String name, int height, String type) {
		super();
		this.name = name;
		this.height = height;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}