package com.tek.ClassAssignments;

public abstract class Shape implements AreaCalculation{ //the key word abstract must have a child class that extends shape that can be instanciated since shape cannot be instantiated. 
	
	//this method can be overridden by a child class but it is not mandatory
		private String name;
		
		public void setShapeName(String name) {
			this.name = name;
	}
	
	
		public String getShapeName() {
			return name;
		}
}
