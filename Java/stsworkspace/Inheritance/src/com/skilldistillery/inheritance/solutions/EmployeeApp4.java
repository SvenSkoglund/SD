package com.skilldistillery.inheritance.solutions;

import com.skilldistillery.inheritance.drills.Person;

public class EmployeeApp4 {

  public static void main(String[] args) {
    EmployeeApp4 app = new EmployeeApp4();
    app.run();
  }

  private void run() {
    Person pers = null;
    pers = new Person("Ronnie", "Dobbs", 34);
    System.out.println(pers.getInfo());
    
    Employee6 emp = null;
    emp = new Employee6("Bob", "Dobbs", 55, "VP of Sales", 138_000.00);
    System.out.println(emp.getInfo());
    
    DataAnalyst4 dataAnalyst = new DataAnalyst4("TOP SECRET", "James", "Java", 45, "Analyst IV", 120_000.00);
    System.out.println(dataAnalyst.getInfo());
    
  }

}
