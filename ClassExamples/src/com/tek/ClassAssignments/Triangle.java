package com.tek.ClassAssignments;

public class Triangle extends Shape {

	private int base;
	private int height;

	public void setBase(int base) {
		this.base = base;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	

	@Override
	public double calculateArea() {
		int area = base * height / 3;
		return area;
	}

	@Override
	public String toString() {
		return "The area of this" + getShapeName() + " is (base = " + base + ", height = " + height + ") is... " + calculateArea();
}
}
