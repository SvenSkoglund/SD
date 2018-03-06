package com.skilldistillery.polymorphism.drills;

class Pet {
  public void play() {
    System.out.println("Playing...");
  }
}

class Dog extends Pet {
  public void play(String ball) {
    System.out.println("Playing with " + ball);
  }
}

public class TestClass {
  public static void main(String[] args) {
    Pet p = new Dog();
    Dog d = (Dog) p;
    
    // Which statements, when uncommented, will cause the program to fail at compile-time or run-time?
    // 1
    //p.play();
    
    // 2
    //d.play();
    
    // 3
    //p.play("tennis ball");
    
    // 4
    //d.play("ball");
  }
}
