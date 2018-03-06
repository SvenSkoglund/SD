package com.skilldistillery.polymorphism.solutions.employee;

public class SoftwareDeveloper3 extends Employee2 {

  public SoftwareDeveloper3() {
    super();
  }

  public SoftwareDeveloper3(String firstName, String lastName, int age, String title, double salary) {
    super(firstName, lastName, age, title, salary);
  }
  
  // Software developer behavior...
  public String produceSoftware() {
    return "Hello World!";
  }
  
  @Override
  public void executeJob(String data) {
    System.out.println(produceSoftware());
  }
  
  @Override
  public String getInfo() {
    return super.getInfo();
  }
}
