package com.skilldistillery.inheritance.solutions;

public class Employee5 extends Person {
  private String title;
  private double salary;

  public Employee5() {
  }

  public Employee5(String firstName, String lastName, int age,
      String title, double salary) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.title = title;
    this.salary = salary;
  }
  
  // Call the parent method
  public String getInfo() {
    return super.getInfo() + " " + title + " " + salary;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  
}
