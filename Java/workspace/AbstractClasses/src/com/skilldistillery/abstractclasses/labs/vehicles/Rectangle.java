/**
 * 
 */
package com.skilldistillery.abstractclasses.labs.vehicles;

/**
 * @author svenskogland
 *
 */
public class Rectangle extends Shapes {
	private double width;
	private double height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public Rectangle() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.skilldistillery.abstractclasses.labs.vehicles.Shapes#getArea()
	 */
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		double area = width * height;
		return area;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", Area=" + getArea() + "]";
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
