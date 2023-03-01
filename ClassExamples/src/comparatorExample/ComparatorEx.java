package comparatorExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> numbers= new ArrayList<>();
		
		numbers.add(13);
		numbers.add(7);
		
		System.out.println("Before: " + numbers);
		
		//using the static utility method 
		Collections.sort(numbers);
		System.out.println("After: " + numbers);
		
		//using the sort function on the array list itself
		numbers.sort(Comparator.reverseOrder());
		System.out.println("Reverse: " + numbers);
		
	}
	
	class NumberComparitor<Integer> implements Comparator<Integer>{
		@Override
		public int compare(Integer o1, Integer o2) {
			return 0;
		}
	}

}
