package com.skilldistillery.polymorphism.solutions.employee;

public class Employee2 extends Person {
  private String title;
  private double salary;

  public Employee2() {
  }

  public Employee2(String firstName, String lastName, int age,
      String title, double salary) {
    super(firstName, lastName, age);
    this.title = title;
    this.salary = salary;
  }
  
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

  public void executeJob(String data) {
    System.out.println("Executing job " + data);
  }
  
}
