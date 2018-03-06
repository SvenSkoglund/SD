package com.skilldistillery.inheritance.solutions;

import com.skilldistillery.inheritance.drills.Person;

public class EmployeeApp {

  public static void main(String[] args) {
    EmployeeApp app = new EmployeeApp();
    app.run();
  }

  private void run() {
    Person pers = null;
    // Create a Person object and assign it to pers. Give the person a firstName,
    // lastName, and age using either the constructor or setters.
    pers = new Person("Ronnie", "Dobbs", 34);

    // Call getInfo() and print the Person's information to the screen.
    System.out.println(pers.getInfo());
    
    Employee2 emp = null;
    // Create an Employee object using the five-argument constructor, and 
    // assign it to emp2.
    emp = new Employee2("Bob", "Dobbs", 55, "VP of Sales", 138_000.00);

    // Call getInfo() and print the Employee's information to the screen.
    System.out.println(emp.getInfo());
    
  }

}
