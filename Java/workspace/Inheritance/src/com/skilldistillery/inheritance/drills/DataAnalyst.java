package com.skilldistillery.inheritance.drills;

public class DataAnalyst extends Employee {
	private String securityClearance;

	public DataAnalyst(String sc, String firstName, String lastName, int age, String title, double salary) {
		super(firstName,lastName,age,title,salary);
		this.securityClearance = sc;
	}

	public String getInfo() {
		return super.getInfo() +  " " + securityClearance;
	}
}
