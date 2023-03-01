package com.tek.ClassAssignments;

public class Square extends Shape {

	private int length;
	private int height;

	public void setLength(int length) {
		this.length = length;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public double calculateArea() {
		int area = length * height;
		return area;
	}
	@Override
	public String toString() {
		return "The area of this" + getShapeName() + " is (length = " + length + ", height = " + height + ") is... " + calculateArea();
	}

}
