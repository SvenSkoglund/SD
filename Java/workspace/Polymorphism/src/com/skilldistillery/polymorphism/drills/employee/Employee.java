package com.skilldistillery.polymorphism.drills.employee;

public class Employee extends Person {
  private String title;
  private double salary;

  public Employee() {
  }

  public Employee(String firstName, String lastName, int age,
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
	  System.out.println("Doing Job: " + data);
  }
  
}
