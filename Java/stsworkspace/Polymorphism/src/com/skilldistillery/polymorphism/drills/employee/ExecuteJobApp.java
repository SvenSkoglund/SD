package com.skilldistillery.polymorphism.drills.employee;

public class ExecuteJobApp {

	public static void main(String[] args) {
		ExecuteJobApp eja = new ExecuteJobApp();
		eja.run();
	}

	private void run() {
		Employee e0 = new Employee("Jane", "Doer", 55, "Carpenter", 45000);
		Employee e1 = new DataAnalyst("SECRET", "Harrison", "Ryan", 34, "Analyst I", 76_400);
		Employee e2 = new SoftwareDeveloper("William", "Fences", 47, "SoftDev I", 63000.00);
		Employee e3 = new DatabaseAdmin("Ronnie", "Dobbs", 31, "DBA", 112500.00);

		System.out.println(e0.getInfo() + "----");
		e0.executeJob("Building Stuff");
		System.out.println(e1.getInfo() + "----");
		e1.executeJob("Secret data A198209");
		System.out.println(e2.getInfo() + "----");
		e2.executeJob("Requirements Doc 12345");
		System.out.println(e3.getInfo() + "----");
		e3.executeJob("USERS");
	}

}
