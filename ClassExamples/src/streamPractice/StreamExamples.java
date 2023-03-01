package streamPractice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExamples {

	public static void main(String[] args) {

		List<String> names = new ArrayList<String>();

		names.add("Larry");
		names.add("Steven");
		names.add("Eric");
		names.add("Jessica");
		names.add("Ellen");
		
		//sort the og names list by length of name using a string
		
		names.sort(Comparator.comparingInt(String::length));
		System.out.println(String.join("\n", names) + "\n");
		
		System.out.println("=================");
		
		//then, sort secondary by alphabetically
		// using a stream to sort a list is very easy
		names.sort(Comparator.comparingInt(String::length).thenComparing(x -> x.toLowerCase()));

		System.out.println("=================");

		// this will remove all names from the list that contain an n
		names.removeIf(name -> name.contains("n"));
		System.out.println((String.join("\n", names)));

		System.out.println("=================");



	}

}
