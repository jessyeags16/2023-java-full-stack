package com.tek.ClassAssignments;

import java.util.ArrayList;
import java.util.List;

public class ImplementsMain {
	
	//The next feature is we want each shape to print its own description 
	
	public static void main(String[] args) {
		Square s = new Square();
		s.setShapeName("Square");
		s.setHeight(11);
		s.setLength(11);
		
		Square s1 = new Square();
		s1.setShapeName("Square");
		s1.setHeight(5);
		s1.setLength(5);
		
		Triangle t = new Triangle();
		t.setShapeName("Triangle");
		t.setBase(5);
		t.setHeight(10);
		
		Triangle t1 = new Triangle();
		t1.setShapeName("Triangle");
		t1.setBase(7);
		t1.setHeight(4);
		
		Circle c = new Circle();
		c.setShapeName("Circle");
		c.setRadius(5);
		

		List<Shape> shapes = new ArrayList<>();
		shapes.add(s1);
		shapes.add(t1);
		shapes.add(s);
		shapes.add(t);
		shapes.add(c);
		
		
//recorded lecture 2/13 at 2:15 pm, he talks about this chunk of code 
		for (Shape shape : shapes) {
			System.out.println(shape);
			}
			
		}
	}


