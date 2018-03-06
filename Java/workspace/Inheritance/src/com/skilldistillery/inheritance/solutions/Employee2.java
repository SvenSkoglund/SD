package com.skilldistillery.inheritance.solutions;

public class Employee2 extends Person {
  private String title;
  private double salary;

  // Add a not-arg constructor to Employee.
  public Employee2() {
  }

  // Add a constructor to Employee with parameters for firstName,
  // lastName, age, title, and salary.
  public Employee2(String firstName, String lastName, int age,
      String title, double salary) {
    // Set the fields firstName, lastName, and age the
    // same way as title and salary.
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.title = title;
    this.salary = salary;
  }
  
  public String getInfo() {
    return firstName + " " + lastName + " " + age + " " + title + " " + salary;
  }

  
}
