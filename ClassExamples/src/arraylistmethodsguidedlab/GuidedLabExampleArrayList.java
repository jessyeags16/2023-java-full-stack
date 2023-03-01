package arraylistmethodsguidedlab;

import java.util.ArrayList;
import java.util.List;

//jessica yeager
//2/16/23
//this is a guided lab for ArrayList and ArrayList methods
//An array list is a resizable array, aka DYNAMIC ARRAY
// allows you to retrieve elements by index bc the underlying structure is an array
//allows duplicate and null values
//ordered collection
//cannot create an array list of primitive types
//ArrayList is not synchronized
	//if multiple threads try to modify the ArrayList simultaneously the outcome will be non deterministic
		

public class GuidedLabExampleArrayList {

	public static void main(String[] args) {
		// how to create an array list using the ArrayList() constructor
		List<String> animals = new ArrayList<>();
		animals.add("Tiger");
		animals.add("Lion");
		animals.add("Cat");
		animals.add("Dog");
		
		System.out.println(animals);
		
		//what if I want to add an element at a particular element?
		animals.add(1, "Elephant");
		System.out.println(animals);
		

	}

}
