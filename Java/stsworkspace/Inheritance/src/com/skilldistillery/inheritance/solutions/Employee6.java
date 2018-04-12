package com.skilldistillery.inheritance.solutions;

public class Employee6 extends Person {
  private String title;
  private double salary;

  public Employee6() {
  }

  public Employee6(String firstName, String lastName, int age,
      String title, double salary) {
    super(firstName, lastName, age);
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
