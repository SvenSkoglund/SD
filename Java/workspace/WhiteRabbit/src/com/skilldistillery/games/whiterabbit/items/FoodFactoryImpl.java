package com.skilldistillery.games.whiterabbit.items;

import java.util.ArrayList;
import java.util.List;

public class FoodFactoryImpl implements FoodFactory {

	private List<Food> itemsList = new ArrayList<>();
	private List <String> foodNameList = new ArrayList<>();
	private List<String> drinkNameList= new ArrayList<>();
	public FoodFactoryImpl() {
		
		foodNameList.add("Cake");
		foodNameList.add("Cheeseburger");
		foodNameList.add("Cheesecake");
		foodNameList.add("Grilled Cheese Sammich");
		foodNameList.add("Mac and Cheese");
		foodNameList.add("Cheese Pizza");
		foodNameList.add("Red Velvet Cake");
		foodNameList.add("German Chocolate Cake");
		foodNameList.add("Carrot Cake");
		foodNameList.add("String Cheese");
		
		drinkNameList.add("Water");
		drinkNameList.add("Milk");
		drinkNameList.add("Arnold Palmer");
		drinkNameList.add("Tea");
		drinkNameList.add("Coffee");
		drinkNameList.add("Kool-Aid");
		drinkNameList.add("Hot Sauce");
		drinkNameList.add("Tequila");
		drinkNameList.add("Horchata");
		drinkNameList.add("Coconut Milk");
		
		
		for (int i = 0; i < 10; i++) {
			double d = Math.random() * 2;
			if (d > 1) {
				itemsList.add(new LabeledFood(foodNameList.get((int)(Math.random()*10)), d, "EAT ME"));

			}
			else {
				itemsList.add(new LabeledFood(drinkNameList.get((int)(Math.random()*10)), d, "DRINK ME"));

			}
		}
	}

	@Override
	public Food getFood() {
		if (itemsList.size() > 0) {
			// TODO Auto-generated method stub
			//System.out.println(foodList.get(0).toString());
			Food firstFood = itemsList.get(0);

			return firstFood;
		}
		else {
			return null;
		}
	}

	public void ignoreFood() {

		itemsList.remove(0);

	}

}
