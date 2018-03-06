package com.skilldistillery.polymorphism.solutions.employee;

public class DatabaseAdmin3 extends Employee2 {

  public DatabaseAdmin3() {
    super();
  }

  public DatabaseAdmin3(String firstName, String lastName, int age, String title, double salary) {
    super(firstName, lastName, age, title, salary);
  }
  
  // DatabaseAdmin behavior...
  public String createTables(String tableName) {
    return "Created table " + tableName;
  }
  
  @Override
  public void executeJob(String data) {
    System.out.println(createTables(data));
  }
  
}
