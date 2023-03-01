package collectionExample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CollectionExamples {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		set.add("Element1");
		set.add("Element2");
		set.add("Element3");
		set.add("Element1"); //this item overwrites the first time we added Element1
		
		for (String e : set) {
			System.out.println(e);
		}
		if (set.isEmpty() ) {
			//the set has no elements
		}
		
		System.out.println("=============");
		
		List<String> list = new ArrayList<String>();
		
		list.add("element1");
		list.add("element2");
		list.add("element3");
		
		for (String l : list) {
			System.out.println(l);
		}
		
		if (list.isEmpty() ) {
			//if a list is empty it generally means there were no results
		}
		
		//this is the same as .isEmpty
		if (list.size() == 0) {
		}
		
		//removing an element when not in a for loop is fine
		//however, you cant remove stuff with a for loop, it modifies the underlying data structure
		//which causes problems in the list
		list.remove(0);
		
		//this will get the first element of the list
		//however this should be checked to make sure the list is not empty otherwise it will throw an index out of bound exception
		System.out.println(list.get(0));
		
		//this will remove the first element from the list
		//if you are doing a for loop over a list you can not use remove as it modifies the underlying data structure
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals("element2")) {
				list.remove(i);
			}
		}
		
		
		//an iterator is a class itself
		//it is another way of looping over a list
		//this is not used very often and its primary use for deleting an element from a list
		//this is the safe way of doing a delete
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
		System.out.println(element);
		if (element.equals("element2")) {
			iterator.remove();
		}
		}
	}
	
}
