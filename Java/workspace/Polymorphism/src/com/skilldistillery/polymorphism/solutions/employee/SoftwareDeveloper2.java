package com.skilldistillery.polymorphism.solutions.employee;

public class SoftwareDeveloper2 extends Employee2 {

  public SoftwareDeveloper2() {
    super();
  }

  public SoftwareDeveloper2(String firstName, String lastName, int age, String title, double salary) {
    super(firstName, lastName, age, title, salary);
  }
  
  // Software developer behavior...
  public String produceSoftware() {
    return "Hello World!";
  }
  
  public void executeJob(String data) {
    System.out.println(produceSoftware());
  }
  
  public String getInfo() {
    return super.getInfo();
  }
  
}
