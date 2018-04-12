package com.skilldistillery.objs.solutions;

public class Dog {
  public String breed;
  public String name;
  public int weight;
  
  // Add a constructor with parameters to initialize breed and weight.

  public Dog(String b, int w) {
    super();
    breed = b;
    weight = w;
  }
  
  // Add a constructor with parameters to initialize name, breed, and weight.
  public Dog(String b, String n, int w) {
    super();
    breed = b;
    name = n;
    weight = w;
  }
  
  public void displayDogInfo() {
    System.out.println("Dog [breed=" + breed + ", name=" + name + ", weight=" + weight + "]");
  }


  public static void main(String[] args) {
    // Create three dog instances and call the displayDogInfo method on each Dog object.
    Dog d1 = new Dog("Mutt", 105);
    Dog d2 = new Dog("Marvin", "Pug", 14);
    Dog d3 = new Dog("Donna", "Doberman", 84);
    
    d1.displayDogInfo();
    d2.displayDogInfo();
    d3.displayDogInfo();
    
  }

}
