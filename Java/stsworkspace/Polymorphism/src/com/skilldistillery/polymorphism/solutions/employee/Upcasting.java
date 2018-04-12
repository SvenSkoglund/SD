package com.skilldistillery.polymorphism.solutions.employee;

public class Upcasting {

  public static void main(String[] args) {
    Employee emp1 = new Employee("John", "Doe", 45, "Employee Title", 33333.50);
    
    // Implicit upcast
    Person person1 = emp1;
    
    // Explicit (and pointless) upcast
    Person person2 = (Person) emp1;

    // Call getName() on Employee reference emp1 and print the results to the screen.
    System.out.println(emp1.getName());
    
    // Call getTitle() on Employee reference emp1 and print the results to the screen.
    System.out.println(emp1.getTitle());
    
    // Now call getName() on Person reference person1 and print the results to the screen.
    System.out.println(person1.getName());
    
    // Try to call getTitle() on Person reference person1. What does the compiler report?
    //    The compiler says getTitle() is undefined in type Person.
    // System.out.println(person1.getTitle());
  }

}
