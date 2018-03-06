package com.skilldistillery.polymorphism.solutions;

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
    //p.play(); // Pet's inherited play() method is called
    
    // 2
    //d.play(); // Pet's inherited play() method is called
    
    // 3 - this will cause compilation to fail because p is a Pet reference, and Pet does not
    //     have a play(String) method.
    //p.play("tennis ball");
    
    // 4
    //d.play("ball"); // This is a Dog reference to a Dog instance, so calling play(String) is legal.
                      // This will run correctly because the object is a Dog.
  }
}
