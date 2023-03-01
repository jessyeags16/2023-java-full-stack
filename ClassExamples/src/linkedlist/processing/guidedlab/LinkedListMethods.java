package linkedlist.processing.guidedlab;

import java.util.LinkedList;

public class LinkedListMethods {

	public static void main(String[] args) {
		//declare the linked list
		LinkedList<String> linkedlist = new LinkedList<>();
		
		//.add to add an element
		linkedlist.add("Candy");
		linkedlist.add("Love");
		linkedlist.add("Butterflies");
		
		//display the linked list
		System.out.println("Linked list content: " + linkedlist);
		
		//add first and last element
		linkedlist.addFirst("First Item");
		linkedlist.addLast("Last Item");
		System.out.println("LinkedList content after addition: " + linkedlist);
		
		//getting and setting values
		Object firstvar = linkedlist.get(0);

	}

}
