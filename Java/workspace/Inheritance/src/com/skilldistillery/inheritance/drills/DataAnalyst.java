package com.skilldistillery.inheritance.drills;

public class DataAnalyst extends Employee {
	private String securityClearance;

	public DataAnalyst(String sc, String firstName, String lastName, int age, String title, double salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.setTitle(title);
		this.setSalary(salary);
		this.securityClearance = sc;
	}

	public String getInfo() {
		return super.getInfo() +  " " + securityClearance;
	}
}
