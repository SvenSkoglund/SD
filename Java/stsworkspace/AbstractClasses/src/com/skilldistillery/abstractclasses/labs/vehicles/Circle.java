package com.skilldistillery.abstractclasses.labs.vehicles;

public class Circle extends Shapes {
	private double radius;

	@Override
	public double getArea() {
		double area = Math.PI * Math.pow(radius, 2);
		return area;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle() {
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", Area=" + getArea() + "]";
	}

}
