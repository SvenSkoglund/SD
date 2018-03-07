package com.skilldistillery.inheritance.drills;

public class Employee extends Person {
	private String title;
	private double salary;

	public Employee() {

	}

	public Employee(String firstName, String lastName, int age, String title, double salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.setTitle(title);
		this.setSalary(salary);
	}

	@Override
	public String getInfo() {
		return super.getInfo() + " " + getTitle() + " " + getSalary();

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
