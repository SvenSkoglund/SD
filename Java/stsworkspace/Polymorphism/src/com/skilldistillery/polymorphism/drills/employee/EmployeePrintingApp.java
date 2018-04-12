package com.skilldistillery.polymorphism.drills.employee;

public class EmployeePrintingApp {

	public static void main(String[] args) {
		EmployeePrintingApp epa = new EmployeePrintingApp();

		epa.run();

	}

	private void run() {
		// Create an array of type Employee with space for 3 Employees
		Employee[] empArray = new Employee[3];
		// Create a DataAnalyst, SoftwareDeveloper, and DatabaseAdmin
		// using the multi-arg constructors for each, and assign each to the
		// array.
		DataAnalyst da = new DataAnalyst("Top Secret", "James", "Frond", 40, "Secret Title", 999999);
		SoftwareDeveloper dev = new SoftwareDeveloper("Mark", "Z", 40, "CEO", 100000000);
		DatabaseAdmin dva = new DatabaseAdmin("John", "Does", 18, "DBA", 5);
		empArray[0] = da;
		empArray[1] = dev;
		empArray[2] = dva;
		// Call processEmployees and pass the Employee array reference.
		processEmployees(empArray);
		
	}

	// Add a method printEmployeeNameAndTitle that takes an Employee and prints
	// name - title
	// to the screen.
	public void printEmployeeNameAndTitle(Employee e) {
		System.out.println("Name: " + e.getName() + " -|- Title: " + e.getTitle());
	}

	public void processEmployees(Employee[] employees) {
		// loop through the Employee array and call printEmployeeNameAndTitle
		// for each Employee
		for (Employee employee : employees ) {
			printEmployeeNameAndTitle(employee);
		}
	}

}
