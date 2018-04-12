package com.skilldistillery.inheritance.solutions;

public class Employee3 extends Person {
  private String title;
  private double salary;

  public Employee3() {
  }

  public Employee3(String firstName, String lastName, int age,
      String title, double salary) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.title = title;
    this.salary = salary;
  }
  
  public String getInfo() {
    return getName() + " " + age + " " + title + " " + salary;
  }

  
}
