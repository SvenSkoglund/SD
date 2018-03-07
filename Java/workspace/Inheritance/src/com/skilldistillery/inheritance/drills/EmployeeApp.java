package com.skilldistillery.inheritance.drills;

public class EmployeeApp {

  public static void main(String[] args) {
    EmployeeApp app = new EmployeeApp();
    app.run();
  }
  
  private void run() {
    Person pers = null;
    // Create a Person object and assign it to pers. Give the person a firstName,
    // lastName, and age using either the constructor or setters.
    pers = new Person("Sven" , "Skoglund" , 26);
    // Call getInfo() and print the Person's information to the screen.
    System.out.println(pers.getInfo());
    Employee emp2 = null;
    // Create an Employee object using the five-argument constructor, and 
    // assign it to emp2.
    emp2 = new Employee("Sven", "Skoglund", 26, "Meh", 0);
    // Call getInfo() and print the Employee's information to the screen.
    DataAnalyst da = new DataAnalyst("1000", "John", "Roth", 34, "Data Analyst", 200000);
    System.out.println(da.getInfo());

  }

}
