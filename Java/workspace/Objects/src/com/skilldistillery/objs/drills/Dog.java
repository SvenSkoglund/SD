package com.skilldistillery.objs.drills;

public class Dog {
  public String breed;
  public String name;
  public int weight;
  
  // Add a constructor with parameters to initialize breed and weight.
  public Dog (String b, int w) {
	  breed = b;
	  weight = w;
  }
  public Dog (String n , String b, int w) {
	  this.name = n;
	  breed = b;
	  weight = w;
  }
  
  // Add a constructor with parameters to initialize name, breed, and weight.
 
  
  public void displayDogInfo() {
    System.out.println("Dog [breed=" + breed + ", name=" + name + ", weight=" + weight + "]");
  }

  public static void main(String[] args) {
    // Create three dog instances and call the displayDogInfo method on each Dog object.

	  Dog crystal = new Dog("Crystal" , "Chow" , 20 );
	  Dog choco = new Dog("Choco" , "Weiner Dog" , 5);
	  Dog sailor = new Dog("Sailor", "Husky Mix", 25);
	  
	  crystal.displayDogInfo();
	  choco.displayDogInfo();
	  sailor.displayDogInfo();
  }

}
