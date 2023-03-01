package com.tek.ClassAssignments;

public class Circle extends Shape {
	
	private int radius;
	private static final double PI = 3.14;
	
	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	@Override
	public double calculateArea() {
		int rSquared = radius * radius;
		double area = PI * rSquared;
		return area;
	}
	@Override 
	public String toString() {
		return "The area of this " + getShapeName() + " is " + calculateArea();
	}
	
	
	
	
	

}
