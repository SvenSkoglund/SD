package com.skilldistillery.polymorphism.solutions.employee;

public class Employee3 extends Person {
  private String title;
  private double salary;

  public Employee3() {
  }

  public Employee3(String firstName, String lastName, int age,
      String title, double salary) {
    super(firstName, lastName, age);
    this.title = title;
    this.salary = salary;
  }
  
  @Override
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

  /*
   Using @Override here causes a compiler error because there is no superclass method
   to override.
   */
  public void executeJob(String data) {
    System.out.println("Executing job " + data);
  }
  
}
