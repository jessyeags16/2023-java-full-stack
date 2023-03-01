package week3;

import java.util.StringJoiner; //notice that you have to import the lib

public class StringJoinerEx {

	public static void main(String[] args) {
		
		//takes two arguments
		//the first argument is a deliminator
		//second argument is the starting character
		//the third argument is the ending character
		StringJoiner sj1 = new StringJoiner (",", "{", "}");
		
		sj1.add("element1");
		sj1.add("element2");
		sj1.add("element3");
			
		StringJoiner sj2 = new StringJoiner ("=", "[", "]");
		
		sj2.add("list1");
		sj2.add("list2");
		sj2.add("list3");
		
		
				
		
		//the primary use of a string joiner is to create a csv file
		//comma (or any delimiter)separated file 

		System.out.println(sj1.toString());
		System.out.println(sj1.merge(sj2).toString()); 
		
		//observe what the behavior was below.... test question very similar to this 
		//
		
	}

}
