package week3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Map<Key,value>
		//I created a map of keys that are strings and values that are strings. 
		//sometimes referred to as dictionaries. In python they are Dictionaries
		Map<String,String> dictionary = new HashMap<>();
			dictionary.put("Key", "Value");
			dictionary.put("Concat", "Put two strings together");
			dictionary.put("New", "Allocates new memory location");
			
			
		Set<String> keySet = dictionary.keySet(); //this is giving us the keys without the values
		for (String key : keySet ) { //we are looping over the keys
			System.out.println(key + " = " + dictionary.get(key)); //printing the key and the values
			//however we have to fetch the value from the map using the key
		}
		
		Map<String,Integer> intMap = new HashMap<>();
			intMap.put("Key", 1);
			
			
		Map<Integer,String> sintMap = new HashMap<>();
			sintMap.put(1, "One");
			sintMap.put(2, "Two");
			sintMap.put(3, "Three");
			sintMap.put(4, "Four");
			sintMap.put(5, "Five");
			
			
		System.out.println(sintMap.get(3));
			
			sintMap.put(3, "THREE"); //this will replace three
		System.out.println(sintMap.get(3));
		
			sintMap.replace(3, "THREEEEEEEEEEEEEE"); //so will this
		System.out.println(sintMap.get(3));
		
		
		for ( Integer key : sintMap.keySet() ) {
			
		}
		
	}

}
