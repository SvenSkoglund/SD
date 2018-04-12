package com.skilldistillery.polymorphism.solutions.employee;

public class EmployeePrintingApp {

  public static void main(String[] args) {
    EmployeePrintingApp epa = new EmployeePrintingApp();
    
    epa.run();

  }
  
  private void run() {
    // Create an array of type Employee with space for 3 Employees
    Employee[] emps = new Employee[3];
    
    // Create a DataAnalyst, SoftwareDeveloper, and DatabaseAdmin
    // using the multi-arg constructors for each, and assign each to the array.
    emps[0] = new DataAnalyst("SECRET", "Harrison", "Ryan", 34, "Analyst I", 76_400);
    emps[1] = new SoftwareDeveloper("William", "Fences", 47, "SoftDev I", 63000.00);
    emps[2] = new DatabaseAdmin("Ronnie", "Dobbs", 31, "DBA", 112500.00);
     
    // Call processEmployees and pass the Employee array reference.
    processEmployees(emps);
  }
  
  // Add a method printEmployeeNameAndTitle that takes an Employee reference and prints
  // name - title
  // to the screen.
  private void printEmployeeNameAndTitle(Employee e) {
    System.out.println(e.getName() + " - " + e.getTitle());
  }
  
  public void processEmployees(Employee[] employees) {
    // loop through the Employee array and call printEmployeeNameAndTitle
    // for each Employee
    for (Employee employee : employees) {
      if(employee != null) {
        printEmployeeNameAndTitle(employee);
      }
    }
  }

}
